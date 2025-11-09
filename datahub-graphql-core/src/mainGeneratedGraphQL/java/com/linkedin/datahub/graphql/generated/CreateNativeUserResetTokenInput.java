package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to generate a password reset token for a native user.
 */
public class CreateNativeUserResetTokenInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String userUrn;

    public CreateNativeUserResetTokenInput() {
    }

    public CreateNativeUserResetTokenInput(String userUrn) {
        this.userUrn = userUrn;
    }

    public String getUserUrn() {
        return userUrn;
    }
    public void setUserUrn(String userUrn) {
        this.userUrn = userUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (userUrn != null) {
            joiner.add("userUrn: \"" + userUrn + "\"");
        }
        return joiner.toString();
    }

    public static CreateNativeUserResetTokenInput.Builder builder() {
        return new CreateNativeUserResetTokenInput.Builder();
    }

    public static class Builder {

        private String userUrn;

        public Builder() {
        }

        public Builder setUserUrn(String userUrn) {
            this.userUrn = userUrn;
            return this;
        }


        public CreateNativeUserResetTokenInput build() {
            return new CreateNativeUserResetTokenInput(userUrn);
        }

    }
}
