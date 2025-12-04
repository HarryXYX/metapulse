package com.datahub.auth.authentication;

import com.datahub.authentication.invite.InviteTokenService;
import com.datahub.authentication.user.NativeUserService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linkedin.common.urn.CorpuserUrn;
import com.linkedin.common.urn.Urn;
import com.linkedin.gms.factory.config.ConfigurationProvider;
import io.datahubproject.metadata.context.OperationContext;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SignUp Controller for handling user registration at root path.
 *
 * <p>Provides the /signUp endpoint for new user registration without requiring an invite token when
 * open registration is enabled.
 */
@Slf4j
@RestController
public class SignUpController {

  private static final String USER_URN_FIELD_NAME = "userUrn";
  private static final String FULL_NAME_FIELD_NAME = "fullName";
  private static final String EMAIL_FIELD_NAME = "email";
  private static final String TITLE_FIELD_NAME = "title";
  private static final String PASSWORD_FIELD_NAME = "password";
  private static final String INVITE_TOKEN_FIELD_NAME = "inviteToken";
  private static final String IS_NATIVE_USER_CREATED_FIELD_NAME = "isNativeUserCreated";
  private static final String DATAHUB_ACTOR = "urn:li:corpuser:datahub";
  private static final String UNKNOWN_ACTOR = "urn:li:corpuser:UNKNOWN";

  @Autowired
  @Qualifier("configurationProvider")
  private ConfigurationProvider _configProvider;

  @Autowired private NativeUserService _nativeUserService;

  @Autowired private InviteTokenService _inviteTokenService;

  @Autowired private ObjectMapper mapper;

  @Autowired
  @Qualifier("systemOperationContext")
  private OperationContext systemOperationContext;

  /**
   * Creates a native DataHub user using the provided full name, email, title, and password. When
   * open registration is enabled, no invite token is required.
   *
   * <p>Example Request:
   *
   * <p>POST /signUp { "fullName": "John Doe", "userUrn": "urn:li:corpuser:john@example.com",
   * "email": "john@example.com", "title": "Data Engineer", "password": "password123" }
   *
   * <p>Example Response:
   *
   * <p>{ "isNativeUserCreated": true }
   */
  @PostMapping(value = "/signUp", produces = "application/json;charset=utf-8")
  CompletableFuture<ResponseEntity<String>> signUp(final HttpEntity<String> httpEntity) {
    String jsonStr = httpEntity.getBody();

    JsonNode bodyJson;
    try {
      bodyJson = mapper.readTree(jsonStr);
    } catch (Exception e) {
      log.debug("Failed to parse json while attempting to create native user", e);
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(buildErrorResponse("Invalid request format"), HttpStatus.BAD_REQUEST));
    }

    if (bodyJson == null) {
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(buildErrorResponse("Empty request body"), HttpStatus.BAD_REQUEST));
    }

    // Extract fields
    JsonNode userUrn = bodyJson.get(USER_URN_FIELD_NAME);
    JsonNode fullName = bodyJson.get(FULL_NAME_FIELD_NAME);
    JsonNode email = bodyJson.get(EMAIL_FIELD_NAME);
    JsonNode title = bodyJson.get(TITLE_FIELD_NAME);
    JsonNode password = bodyJson.get(PASSWORD_FIELD_NAME);
    JsonNode inviteToken = bodyJson.get(INVITE_TOKEN_FIELD_NAME);

    // Check if open registration is enabled
    boolean openRegistrationEnabled =
        _configProvider.getAuthentication().isOpenRegistrationEnabled();

    // Basic required fields validation
    if (fullName == null || userUrn == null || email == null || title == null || password == null) {
      log.debug("Missing required fields for sign up");
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(buildErrorResponse("Missing required fields"), HttpStatus.BAD_REQUEST));
    }

    // Invite token is required only when open registration is disabled
    if (!openRegistrationEnabled && inviteToken == null) {
      log.debug("Open registration is disabled and no invite token provided");
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(
              buildErrorResponse("Registration requires an invite token"),
              HttpStatus.BAD_REQUEST));
    }

    String userUrnString = userUrn.asText();
    String systemClientUser =
        new CorpuserUrn(_configProvider.getAuthentication().getSystemClientId()).toString();

    // Prevent registration with reserved usernames
    if (userUrnString.equals(systemClientUser)
        || userUrnString.equals(DATAHUB_ACTOR)
        || userUrnString.equals(UNKNOWN_ACTOR)) {
      log.debug("Attempted to register with reserved username: {}", userUrnString);
      return CompletableFuture.completedFuture(
          new ResponseEntity<>(buildErrorResponse("Reserved username"), HttpStatus.BAD_REQUEST));
    }

    String fullNameString = fullName.asText();
    String emailString = email.asText();
    String titleString = title.asText();
    String passwordString = password.asText();
    String inviteTokenString = inviteToken != null ? inviteToken.asText() : null;

    log.info("Attempting to create native user {}", userUrnString);

    return CompletableFuture.supplyAsync(
        () -> {
          try {
            // Only validate invite token if provided
            if (inviteTokenString != null && !inviteTokenString.isEmpty()) {
              Urn inviteTokenUrn = _inviteTokenService.getInviteTokenUrn(inviteTokenString);
              if (!_inviteTokenService.isInviteTokenValid(systemOperationContext, inviteTokenUrn)) {
                log.error("Invalid invite token");
                return new ResponseEntity<>(
                    buildErrorResponse("Invalid invite token"), HttpStatus.BAD_REQUEST);
              }
            }

            _nativeUserService.createNativeUser(
                systemOperationContext,
                userUrnString,
                fullNameString,
                emailString,
                titleString,
                passwordString);

            log.info("Created native user {}", userUrnString);
            return new ResponseEntity<>(buildSuccessResponse(), HttpStatus.OK);
          } catch (Exception e) {
            log.error("Failed to create credentials for native user {}", userUrnString, e);
            return new ResponseEntity<>(
                buildErrorResponse("Failed to create user: " + e.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR);
          }
        });
  }

  private String buildSuccessResponse() {
    JSONObject response = new JSONObject();
    response.put(IS_NATIVE_USER_CREATED_FIELD_NAME, true);
    return response.toString();
  }

  private String buildErrorResponse(String message) {
    JSONObject response = new JSONObject();
    response.put("message", message);
    return response.toString();
  }
}
