package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class RoleProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String type;
    private String requestUrl;

    public RoleProperties() {
    }

    public RoleProperties(String name, String description, String type, String requestUrl) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.requestUrl = requestUrl;
    }

    /**
     * Name of the Role in an organisation
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the Role in an organisation
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description about the role
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description about the role
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Role type can be READ, WRITE or ADMIN
     */
    public String getType() {
        return type;
    }
    /**
     * Role type can be READ, WRITE or ADMIN
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Url to request a role for a user in an organisation
     */
    public String getRequestUrl() {
        return requestUrl;
    }
    /**
     * Url to request a role for a user in an organisation
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (requestUrl != null) {
            joiner.add("requestUrl: \"" + requestUrl + "\"");
        }
        return joiner.toString();
    }

    public static RoleProperties.Builder builder() {
        return new RoleProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String type;
        private String requestUrl;

        public Builder() {
        }

        /**
         * Name of the Role in an organisation
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description about the role
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Role type can be READ, WRITE or ADMIN
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * Url to request a role for a user in an organisation
         */
        public Builder setRequestUrl(String requestUrl) {
            this.requestUrl = requestUrl;
            return this;
        }


        public RoleProperties build() {
            return new RoleProperties(name, description, type, requestUrl);
        }

    }
}
