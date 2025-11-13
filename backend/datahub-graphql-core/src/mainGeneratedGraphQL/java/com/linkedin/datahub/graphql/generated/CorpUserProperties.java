package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only properties about a user
 */
public class CorpUserProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean active;
    private String displayName;
    private String email;
    private String title;
    private CorpUser manager;
    private Long departmentId;
    private String departmentName;
    private String firstName;
    private String lastName;
    private String fullName;
    private String countryCode;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public CorpUserProperties() {
    }

    public CorpUserProperties(boolean active, String displayName, String email, String title, CorpUser manager, Long departmentId, String departmentName, String firstName, String lastName, String fullName, String countryCode, java.util.List<CustomPropertiesEntry> customProperties) {
        this.active = active;
        this.displayName = displayName;
        this.email = email;
        this.title = title;
        this.manager = manager;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.countryCode = countryCode;
        this.customProperties = customProperties;
    }

    /**
     * Whether the user is active
     */
    public boolean getActive() {
        return active;
    }
    /**
     * Whether the user is active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Display name of the user
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name of the user
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Email address of the user
     */
    public String getEmail() {
        return email;
    }
    /**
     * Email address of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Title of the user
     */
    public String getTitle() {
        return title;
    }
    /**
     * Title of the user
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Direct manager of the user
     */
    public CorpUser getManager() {
        return manager;
    }
    /**
     * Direct manager of the user
     */
    public void setManager(CorpUser manager) {
        this.manager = manager;
    }

    /**
     * department id the user belong to
     */
    public Long getDepartmentId() {
        return departmentId;
    }
    /**
     * department id the user belong to
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * department name this user belong to
     */
    public String getDepartmentName() {
        return departmentName;
    }
    /**
     * department name this user belong to
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * first name of the user
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name of the user
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Common name of this user, format is firstName plus lastName
     */
    public String getFullName() {
        return fullName;
    }
    /**
     * Common name of this user, format is firstName plus lastName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * two uppercase letters country code
     */
    public String getCountryCode() {
        return countryCode;
    }
    /**
     * two uppercase letters country code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Custom properties of the ldap
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the ldap
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("active: " + active);
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (email != null) {
            joiner.add("email: \"" + email + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (manager != null) {
            joiner.add("manager: " + manager);
        }
        if (departmentId != null) {
            joiner.add("departmentId: " + departmentId);
        }
        if (departmentName != null) {
            joiner.add("departmentName: \"" + departmentName + "\"");
        }
        if (firstName != null) {
            joiner.add("firstName: \"" + firstName + "\"");
        }
        if (lastName != null) {
            joiner.add("lastName: \"" + lastName + "\"");
        }
        if (fullName != null) {
            joiner.add("fullName: \"" + fullName + "\"");
        }
        if (countryCode != null) {
            joiner.add("countryCode: \"" + countryCode + "\"");
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static CorpUserProperties.Builder builder() {
        return new CorpUserProperties.Builder();
    }

    public static class Builder {

        private boolean active;
        private String displayName;
        private String email;
        private String title;
        private CorpUser manager;
        private Long departmentId;
        private String departmentName;
        private String firstName;
        private String lastName;
        private String fullName;
        private String countryCode;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        /**
         * Whether the user is active
         */
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Display name of the user
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Email address of the user
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Title of the user
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Direct manager of the user
         */
        public Builder setManager(CorpUser manager) {
            this.manager = manager;
            return this;
        }

        /**
         * department id the user belong to
         */
        public Builder setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        /**
         * department name this user belong to
         */
        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        /**
         * first name of the user
         */
        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * last name of the user
         */
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Common name of this user, format is firstName plus lastName
         */
        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        /**
         * two uppercase letters country code
         */
        public Builder setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Custom properties of the ldap
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public CorpUserProperties build() {
            return new CorpUserProperties(active, displayName, email, title, manager, departmentId, departmentName, firstName, lastName, fullName, countryCode, customProperties);
        }

    }
}
