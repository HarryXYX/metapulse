package com.datahub.auth.authentication;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Logout Controller for handling user logout at root path.
 *
 * <p>Provides the /logOut endpoint for user logout, clearing server-side session and redirecting to
 * login page.
 */
@Slf4j
@RestController
public class LogoutController {

  private static final String ACTOR_COOKIE_NAME = "actor";

  /**
   * Logs out the current user by clearing cookies and redirecting to login page.
   *
   * <p>Example Request:
   *
   * <p>GET /logOut
   *
   * <p>Response: Redirect to /login
   */
  @GetMapping(value = "/logOut")
  public void logOutGet(HttpServletRequest request, HttpServletResponse response) {
    performLogout(request, response);
  }

  /**
   * Logs out the current user by clearing cookies and redirecting to login page.
   *
   * <p>Example Request:
   *
   * <p>POST /logOut
   *
   * <p>Response: Redirect to /login
   */
  @PostMapping(value = "/logOut")
  public void logOutPost(HttpServletRequest request, HttpServletResponse response) {
    performLogout(request, response);
  }

  private void performLogout(HttpServletRequest request, HttpServletResponse response) {
    log.info("User logging out");

    // Clear the actor cookie
    Cookie actorCookie = new Cookie(ACTOR_COOKIE_NAME, null);
    actorCookie.setPath("/");
    actorCookie.setMaxAge(0); // Delete the cookie
    actorCookie.setHttpOnly(true);
    response.addCookie(actorCookie);

    // Clear any other auth-related cookies
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().contains("auth") || cookie.getName().contains("token")) {
          Cookie clearCookie = new Cookie(cookie.getName(), null);
          clearCookie.setPath("/");
          clearCookie.setMaxAge(0);
          response.addCookie(clearCookie);
        }
      }
    }

    // Redirect to login page
    try {
      response.sendRedirect("/login");
    } catch (Exception e) {
      log.error("Failed to redirect after logout", e);
      response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
  }
}
