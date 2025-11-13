package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A standardized type of a user
 */
public class DataHubPersona implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;

    public DataHubPersona() {
    }

    public DataHubPersona(String urn) {
        this.urn = urn;
    }

    /**
     * The urn of the persona type
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The urn of the persona type
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        return joiner.toString();
    }

    public static DataHubPersona.Builder builder() {
        return new DataHubPersona.Builder();
    }

    public static class Builder {

        private String urn;

        public Builder() {
        }

        /**
         * The urn of the persona type
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public DataHubPersona build() {
            return new DataHubPersona(urn);
        }

    }
}
