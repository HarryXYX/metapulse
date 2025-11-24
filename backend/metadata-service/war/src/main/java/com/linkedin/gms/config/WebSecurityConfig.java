package com.linkedin.gms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.List;

/**
 * Web Security Configuration for MetaPulse
 *
 * Configures CORS to allow frontend (localhost:3000) to communicate with backend (localhost:8080)
 */
@Configuration
public class WebSecurityConfig {

    /**
     * Configure CORS for frontend-backend communication
     *
     * Development: Allows localhost:3000 (Vite dev server)
     * Production: Should be configured via environment variables
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Allow credentials (cookies, authorization headers)
        config.setAllowCredentials(true);

        // Allowed origins (frontend URLs)
        // TODO: In production, replace with actual domain
        config.setAllowedOrigins(Arrays.asList(
            "http://localhost:3000",  // Vite dev server
            "http://127.0.0.1:3000"   // Alternative localhost
        ));

        // Allowed HTTP methods
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH"));

        // Allowed headers
        config.setAllowedHeaders(Arrays.asList(
            "Authorization",
            "Content-Type",
            "X-Requested-With",
            "Accept",
            "Origin",
            "Access-Control-Request-Method",
            "Access-Control-Request-Headers",
            "X-DataHub-Actor",
            "X-DataHub-Login-Source"
        ));

        // Exposed headers (headers that frontend can access)
        config.setExposedHeaders(Arrays.asList(
            "Access-Control-Allow-Origin",
            "Access-Control-Allow-Credentials",
            "Set-Cookie"
        ));

        // Cache preflight response for 1 hour
        config.setMaxAge(3600L);

        // Apply CORS configuration to all endpoints
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
