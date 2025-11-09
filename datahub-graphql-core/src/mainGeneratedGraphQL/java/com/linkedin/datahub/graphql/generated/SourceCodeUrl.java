package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SourceCodeUrl implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SourceCodeUrlType type;
    @javax.annotation.Nonnull
    private String sourceCodeUrl;

    public SourceCodeUrl() {
    }

    public SourceCodeUrl(SourceCodeUrlType type, String sourceCodeUrl) {
        this.type = type;
        this.sourceCodeUrl = sourceCodeUrl;
    }

    /**
     * Source Code Url Types
     */
    public SourceCodeUrlType getType() {
        return type;
    }
    /**
     * Source Code Url Types
     */
    public void setType(SourceCodeUrlType type) {
        this.type = type;
    }

    /**
     * Source Code Url
     */
    public String getSourceCodeUrl() {
        return sourceCodeUrl;
    }
    /**
     * Source Code Url
     */
    public void setSourceCodeUrl(String sourceCodeUrl) {
        this.sourceCodeUrl = sourceCodeUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (sourceCodeUrl != null) {
            joiner.add("sourceCodeUrl: \"" + sourceCodeUrl + "\"");
        }
        return joiner.toString();
    }

    public static SourceCodeUrl.Builder builder() {
        return new SourceCodeUrl.Builder();
    }

    public static class Builder {

        private SourceCodeUrlType type;
        private String sourceCodeUrl;

        public Builder() {
        }

        /**
         * Source Code Url Types
         */
        public Builder setType(SourceCodeUrlType type) {
            this.type = type;
            return this;
        }

        /**
         * Source Code Url
         */
        public Builder setSourceCodeUrl(String sourceCodeUrl) {
            this.sourceCodeUrl = sourceCodeUrl;
            return this;
        }


        public SourceCodeUrl build() {
            return new SourceCodeUrl(type, sourceCodeUrl);
        }

    }
}
