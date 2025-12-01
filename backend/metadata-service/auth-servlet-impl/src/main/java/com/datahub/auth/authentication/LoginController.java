package com.datahub.auth.authentication;

import static com.google.common.net.HttpHeaders.X_FORWARDED_FOR;
import static com.linkedin.metadata.telemetry.OpenTelemetryKeyConstants.EVENT_TYPE_ATTR;
import static com.linkedin.metadata.telemetry.OpenTelemetryKeyConstants.LOGIN_EVENT;
import static com.linkedin.metadata.telemetry.OpenTelemetryKeyConstants.LOGIN_SOURCE_ATTR;
import static com.linkedin.metadata.telemetry.OpenTelemetryKeyConstants.SOURCE_IP;
import static com.linkedin.metadata.telemetry.OpenTelemetryKeyConstants.USER_ID_ATTR;

import com.datahub.authentication.Actor;
import com.datahub.authentication.ActorType;
import com.datahub.authentication.token.StatelessTokenService;
import com.datahub.authentication.token.TokenType;
import com.datahub.authentication.user.NativeUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.common.urn.CorpuserUrn;
import com.linkedin.gms.factory.config.ConfigurationProvider;
import com.linkedin.metadata.datahubusage.DataHubUsageEventType;
import com.linkedin.metadata.datahubusage.event.LoginSource;
import io.datahubproject.metadata.context.OperationContext;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.trace.Span;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Login Controller for handling user authentication.
 *
 * <p>Provides the /logIn endpoint for username/password authentication.
 */
@Slf4j
@RestController
public class LoginController {

  private static final String USERNAME_FIELD_NAME = "username";
  private static final String PASSWORD_FIELD_NAME = "password";
  private static final String ACCESS_TOKEN_FIELD_NAME = "accessToken";
  private static final String MESSAGE_FIELD_NAME = "message";
  private static final String ACTOR_COOKIE_NAME = "actor";

  @Autowired private StatelessTokenService _statelessTokenService;

  @Autowired
  @Qualifier("configurationProvider")
  private ConfigurationProvider _configProvider;

  @Autowired private NativeUserService _nativeUserService;

  @Autowired private ObjectMapper mapper;

  @Autowired
  @Qualifier("systemOperationContext")
  private OperationContext systemOperationContext;

  @Autowired
  @Qualifier("loginExecutor")
  private Executor loginExecutor;

  /**
   * Log in a user based on username + password.
   *
   * <p>Example Request:
   *
   * <p>POST /logIn { "username": "datahub", "password": "datahub123" }
   *
   * <p>Example Response:
   *
   * <p>{ "accessToken": "<the access token>" }
   */
  @PostMapping(value = "/logIn", produces = "application/json;charset=utf-8")
  CompletableFuture<ResponseEntity<String>> logIn(
      @RequestBody String jsonStr, HttpServletRequest request, HttpServletResponse response) {

    JsonNode bodyJson;
    try {
      bodyJson = mapper.readTree(jsonStr);
    } catch (JsonProcessingException e) {
      log.error("Failed to parse json while attempting to log in", e);
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(
              buildErrorResponse("Invalid request format"), HttpStatus.BAD_REQUEST));
    }

    if (bodyJson == null) {
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(
              buildErrorResponse("Request body is required"), HttpStatus.BAD_REQUEST));
    }

    /*
     * Extract username and password fields
     */
    JsonNode username = bodyJson.get(USERNAME_FIELD_NAME);
    JsonNode password = bodyJson.get(PASSWORD_FIELD_NAME);

    if (username == null || StringUtils.isBlank(username.asText())) {
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(
              buildErrorResponse("Username must not be empty"), HttpStatus.BAD_REQUEST));
    }

    if (password == null) {
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(
              buildErrorResponse("Password must not be empty"), HttpStatus.BAD_REQUEST));
    }

    String usernameStr = username.asText();
    String passwordStr = password.asText();
    String userUrnStr = new CorpuserUrn(usernameStr).toString();

    log.info("Attempting to log in user: {}", usernameStr);

    // 使用独立的 loginExecutor 而不是 ForkJoinPool.commonPool()
    // 避免与 GraphQL 查询竞争线程资源
    return CompletableFuture.supplyAsync(
        () -> {
          try {
            // 1. Verify the user's password
            boolean doesPasswordMatch =
                _nativeUserService.doesPasswordMatch(
                    systemOperationContext, userUrnStr, passwordStr);

            if (!doesPasswordMatch) {
              log.warn("Login failed for user: {} - Invalid credentials", usernameStr);

              // Track failed login event
              systemOperationContext.withSpan(
                  "failedPasswordLogin",
                  () -> {
                    AttributesBuilder loginEventAttributes = Attributes.builder();
                    loginEventAttributes.put(USER_ID_ATTR, userUrnStr);
                    loginEventAttributes.put(
                        EVENT_TYPE_ATTR, DataHubUsageEventType.FAILED_LOGIN_EVENT.getType());
                    loginEventAttributes.put(
                        LOGIN_SOURCE_ATTR, LoginSource.PASSWORD_LOGIN.getSource());
                    String sourceIP = request.getHeader(X_FORWARDED_FOR);
                    if (sourceIP != null && !sourceIP.isEmpty()) {
                      loginEventAttributes.put(SOURCE_IP, sourceIP);
                    }
                    Span.current().addEvent(LOGIN_EVENT, loginEventAttributes.build());
                  });

              return new ResponseEntity<>(
                  buildErrorResponse("Invalid Credentials"), HttpStatus.UNAUTHORIZED);
            }

            // 2. Generate a session token for the user
            final long sessionTokenDurationMs =
                _configProvider.getAuthentication().getSessionTokenDurationMs();
            final String accessToken =
                _statelessTokenService.generateAccessToken(
                    TokenType.SESSION,
                    new Actor(ActorType.USER, usernameStr),
                    sessionTokenDurationMs);

            log.info("Login successful for user: {}", usernameStr);

            // Track successful login event
            systemOperationContext.withSpan(
                "loginSuccess",
                () -> {
                  AttributesBuilder loginEventAttributes = Attributes.builder();
                  loginEventAttributes.put(USER_ID_ATTR, userUrnStr);
                  loginEventAttributes.put(
                      EVENT_TYPE_ATTR, DataHubUsageEventType.LOG_IN_EVENT.getType());
                  loginEventAttributes.put(
                      LOGIN_SOURCE_ATTR, LoginSource.PASSWORD_LOGIN.getSource());
                  String sourceIP = request.getHeader(X_FORWARDED_FOR);
                  if (sourceIP != null && !sourceIP.isEmpty()) {
                    loginEventAttributes.put(SOURCE_IP, sourceIP);
                  }
                  Span.current().addEvent(LOGIN_EVENT, loginEventAttributes.build());
                });

            // 3. Set actor cookie
            // IMPORTANT: HttpOnly=false to allow frontend JavaScript to read the cookie
            // This matches DataHub's original behavior for client-side authentication
            Cookie actorCookie = new Cookie(ACTOR_COOKIE_NAME, userUrnStr);
            actorCookie.setPath("/");
            actorCookie.setMaxAge(24 * 60 * 60); // 24 hours
            actorCookie.setHttpOnly(
                false); // Allow JavaScript access (needed for frontend auth check)
            actorCookie.setSecure(false); // Set to true in production with HTTPS
            // actorCookie.setSameSite("Lax"); // Note: SameSite not available in
            // javax.servlet.http.Cookie
            response.addCookie(actorCookie);

            // 4. Return success response with access token
            return new ResponseEntity<>(buildTokenResponse(accessToken), HttpStatus.OK);

          } catch (Exception e) {
            log.error("Failed to log in user: {}", usernameStr, e);
            return new ResponseEntity<>(
                buildErrorResponse("Internal server error"), HttpStatus.INTERNAL_SERVER_ERROR);
          }
        },
        loginExecutor); // 使用独立线程池
  }

  private String buildTokenResponse(final String token) {
    JSONObject json = new JSONObject();
    json.put(ACCESS_TOKEN_FIELD_NAME, token);
    return json.toString();
  }

  private String buildErrorResponse(final String message) {
    JSONObject json = new JSONObject();
    json.put(MESSAGE_FIELD_NAME, message);
    return json.toString();
  }
}
