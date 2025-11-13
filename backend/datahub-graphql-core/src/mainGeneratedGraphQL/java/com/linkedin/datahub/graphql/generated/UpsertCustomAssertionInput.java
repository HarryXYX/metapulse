package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for upserting a Custom Assertion.
 */
public class UpsertCustomAssertionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String entityUrn;
    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private String description;
    private String fieldPath;
    @javax.annotation.Nonnull
    private PlatformInput platform;
    private String externalUrl;
    private String logic;

    public UpsertCustomAssertionInput() {
    }

    public UpsertCustomAssertionInput(String entityUrn, String type, String description, String fieldPath, PlatformInput platform, String externalUrl, String logic) {
        this.entityUrn = entityUrn;
        this.type = type;
        this.description = description;
        this.fieldPath = fieldPath;
        this.platform = platform;
        this.externalUrl = externalUrl;
        this.logic = logic;
    }

    public String getEntityUrn() {
        return entityUrn;
    }
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFieldPath() {
        return fieldPath;
    }
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public PlatformInput getPlatform() {
        return platform;
    }
    public void setPlatform(PlatformInput platform) {
        this.platform = platform;
    }

    public String getExternalUrl() {
        return externalUrl;
    }
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getLogic() {
        return logic;
    }
    public void setLogic(String logic) {
        this.logic = logic;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (logic != null) {
            joiner.add("logic: \"" + logic + "\"");
        }
        return joiner.toString();
    }

    public static UpsertCustomAssertionInput.Builder builder() {
        return new UpsertCustomAssertionInput.Builder();
    }

    public static class Builder {

        private String entityUrn;
        private String type;
        private String description;
        private String fieldPath;
        private PlatformInput platform;
        private String externalUrl;
        private String logic;

        public Builder() {
        }

        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        public Builder setPlatform(PlatformInput platform) {
            this.platform = platform;
            return this;
        }

        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        public Builder setLogic(String logic) {
            this.logic = logic;
            return this;
        }


        public UpsertCustomAssertionInput build() {
            return new UpsertCustomAssertionInput(entityUrn, type, description, fieldPath, platform, externalUrl, logic);
        }

    }
}
