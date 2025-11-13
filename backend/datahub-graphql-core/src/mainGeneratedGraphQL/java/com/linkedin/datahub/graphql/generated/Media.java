package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Media content
 */
public class Media implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private MediaType type;
    @javax.annotation.Nonnull
    private String location;

    public Media() {
    }

    public Media(MediaType type, String location) {
        this.type = type;
        this.location = location;
    }

    /**
     * The type of media
     */
    public MediaType getType() {
        return type;
    }
    /**
     * The type of media
     */
    public void setType(MediaType type) {
        this.type = type;
    }

    /**
     * The location of the media (a URL)
     */
    public String getLocation() {
        return location;
    }
    /**
     * The location of the media (a URL)
     */
    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (location != null) {
            joiner.add("location: \"" + location + "\"");
        }
        return joiner.toString();
    }

    public static Media.Builder builder() {
        return new Media.Builder();
    }

    public static class Builder {

        private MediaType type;
        private String location;

        public Builder() {
        }

        /**
         * The type of media
         */
        public Builder setType(MediaType type) {
            this.type = type;
            return this;
        }

        /**
         * The location of the media (a URL)
         */
        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }


        public Media build() {
            return new Media(type, location);
        }

    }
}
