package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating the name of an entity
 */
public class UpdateNameInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String urn;

    public UpdateNameInput() {
    }

    public UpdateNameInput(String name, String urn) {
        this.name = name;
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        return joiner.toString();
    }

    public static UpdateNameInput.Builder builder() {
        return new UpdateNameInput.Builder();
    }

    public static class Builder {

        private String name;
        private String urn;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public UpdateNameInput build() {
            return new UpdateNameInput(name, urn);
        }

    }
}
