package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to fetch a new Access Token.
 */
public class GetAccessTokenInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AccessTokenType type;
    @javax.annotation.Nonnull
    private String actorUrn;
    @javax.annotation.Nonnull
    private AccessTokenDuration duration;

    public GetAccessTokenInput() {
    }

    public GetAccessTokenInput(AccessTokenType type, String actorUrn, AccessTokenDuration duration) {
        this.type = type;
        this.actorUrn = actorUrn;
        this.duration = duration;
    }

    public AccessTokenType getType() {
        return type;
    }
    public void setType(AccessTokenType type) {
        this.type = type;
    }

    public String getActorUrn() {
        return actorUrn;
    }
    public void setActorUrn(String actorUrn) {
        this.actorUrn = actorUrn;
    }

    public AccessTokenDuration getDuration() {
        return duration;
    }
    public void setDuration(AccessTokenDuration duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (actorUrn != null) {
            joiner.add("actorUrn: \"" + actorUrn + "\"");
        }
        if (duration != null) {
            joiner.add("duration: " + duration);
        }
        return joiner.toString();
    }

    public static GetAccessTokenInput.Builder builder() {
        return new GetAccessTokenInput.Builder();
    }

    public static class Builder {

        private AccessTokenType type;
        private String actorUrn;
        private AccessTokenDuration duration;

        public Builder() {
        }

        public Builder setType(AccessTokenType type) {
            this.type = type;
            return this;
        }

        public Builder setActorUrn(String actorUrn) {
            this.actorUrn = actorUrn;
            return this;
        }

        public Builder setDuration(AccessTokenDuration duration) {
            this.duration = duration;
            return this;
        }


        public GetAccessTokenInput build() {
            return new GetAccessTokenInput(type, actorUrn, duration);
        }

    }
}
