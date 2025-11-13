package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided for filling in a post content
 */
public class UpdateMediaInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private MediaType type;
    @javax.annotation.Nonnull
    private String location;

    public UpdateMediaInput() {
    }

    public UpdateMediaInput(MediaType type, String location) {
        this.type = type;
        this.location = location;
    }

    public MediaType getType() {
        return type;
    }
    public void setType(MediaType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }
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

    public static UpdateMediaInput.Builder builder() {
        return new UpdateMediaInput.Builder();
    }

    public static class Builder {

        private MediaType type;
        private String location;

        public Builder() {
        }

        public Builder setType(MediaType type) {
            this.type = type;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }


        public UpdateMediaInput build() {
            return new UpdateMediaInput(type, location);
        }

    }
}
