package com.linkedin.gms.config;

import com.datahub.authentication.user.NativeUserService;
import com.linkedin.common.urn.CorpuserUrn;
import io.datahubproject.metadata.context.OperationContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Initialize default users on application startup
 *
 * Creates a default user based on configuration if it doesn't exist
 * User credentials are configured in application.yml/application-dev.yml
 * under the 'defaultUser' section
 */
@Slf4j
@Component
public class DefaultUserInitializer implements ApplicationRunner {

    @Value("${defaultUser.enabled}")
    private boolean enabled;

    @Value("${defaultUser.username}")
    private String username;

    @Value("${defaultUser.password}")
    private String password;

    @Value("${defaultUser.fullName}")
    private String fullName;

    @Value("${defaultUser.email}")
    private String email;

    @Value("${defaultUser.title}")
    private String title;

    @Autowired
    private NativeUserService nativeUserService;

    @Autowired
    @Qualifier("systemOperationContext")
    private OperationContext systemOperationContext;

    @Override
    public void run(ApplicationArguments args) {
        // Check if default user creation is enabled
        if (!enabled) {
            log.info("Default user creation is disabled");
            return;
        }

        try {
            String userUrn = new CorpuserUrn(username).toString();

            log.info("Checking if default user '{}' exists...", username);

            // Check if user already exists - use createNativeUser's built-in existence check
            try {
                nativeUserService.createNativeUser(
                    systemOperationContext,
                    userUrn,
                    fullName,
                    email,
                    title,
                    password
                );
                log.info("✅ Default user '{}' created successfully!", username);
                log.info("   Login credentials:");
                log.info("   Username: {}", username);
                log.info("   Password: {}", password);
                log.info("   Email: {}", email);
            } catch (RuntimeException e) {
                // User already exists - this is expected and not an error
                if (e.getMessage() != null && e.getMessage().contains("already exists")) {
                    log.info("✅ Default user '{}' already exists", username);
                } else {
                    // Some other error occurred
                    throw e;
                }
            }

        } catch (Exception e) {
            log.error("❌ Failed to initialize default user", e);
            // Don't throw exception - let application continue even if user creation fails
        }
    }
}
