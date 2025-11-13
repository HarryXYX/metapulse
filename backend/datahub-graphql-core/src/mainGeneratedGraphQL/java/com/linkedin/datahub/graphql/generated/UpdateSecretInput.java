package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for updating a Secret
 */
public class UpdateSecretInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String value;
    private String description;

    public UpdateSecretInput() {
    }

    public UpdateSecretInput(String urn, String name, String value, String description) {
        this.urn = urn;
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static UpdateSecretInput.Builder builder() {
        return new UpdateSecretInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private String value;
        private String description;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public UpdateSecretInput build() {
            return new UpdateSecretInput(urn, name, value, description);
        }

    }
}
