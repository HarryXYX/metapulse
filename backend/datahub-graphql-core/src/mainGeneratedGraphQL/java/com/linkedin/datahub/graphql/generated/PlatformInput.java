package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input representing A Data Platform
 */
public class PlatformInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String urn;
    private String name;

    public PlatformInput() {
    }

    public PlatformInput(String urn, String name) {
        this.urn = urn;
        this.name = name;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        return joiner.toString();
    }

    public static PlatformInput.Builder builder() {
        return new PlatformInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;

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


        public PlatformInput build() {
            return new PlatformInput(urn, name);
        }

    }
}
