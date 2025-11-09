package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Carries information about where an entity originated from.
 */
public class Origin implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private OriginType type;
    private String externalType;

    public Origin() {
    }

    public Origin(OriginType type, String externalType) {
        this.type = type;
        this.externalType = externalType;
    }

    /**
     * Where an entity originated from. Either NATIVE or EXTERNAL
     */
    public OriginType getType() {
        return type;
    }
    /**
     * Where an entity originated from. Either NATIVE or EXTERNAL
     */
    public void setType(OriginType type) {
        this.type = type;
    }

    /**
     * Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.
     */
    public String getExternalType() {
        return externalType;
    }
    /**
     * Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.
     */
    public void setExternalType(String externalType) {
        this.externalType = externalType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (externalType != null) {
            joiner.add("externalType: \"" + externalType + "\"");
        }
        return joiner.toString();
    }

    public static Origin.Builder builder() {
        return new Origin.Builder();
    }

    public static class Builder {

        private OriginType type;
        private String externalType;

        public Builder() {
        }

        /**
         * Where an entity originated from. Either NATIVE or EXTERNAL
         */
        public Builder setType(OriginType type) {
            this.type = type;
            return this;
        }

        /**
         * Only populated if type is EXTERNAL. The externalType of the entity, such as the name of the identity provider.
         */
        public Builder setExternalType(String externalType) {
            this.externalType = externalType;
            return this;
        }


        public Origin build() {
            return new Origin(type, externalType);
        }

    }
}
