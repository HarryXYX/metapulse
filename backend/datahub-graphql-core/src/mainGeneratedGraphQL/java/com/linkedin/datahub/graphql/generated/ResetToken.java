package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Token that allows native users to reset their credentials
 */
public class ResetToken implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String resetToken;

    public ResetToken() {
    }

    public ResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    /**
     * The reset token
     */
    public String getResetToken() {
        return resetToken;
    }
    /**
     * The reset token
     */
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (resetToken != null) {
            joiner.add("resetToken: \"" + resetToken + "\"");
        }
        return joiner.toString();
    }

    public static ResetToken.Builder builder() {
        return new ResetToken.Builder();
    }

    public static class Builder {

        private String resetToken;

        public Builder() {
        }

        /**
         * The reset token
         */
        public Builder setResetToken(String resetToken) {
            this.resetToken = resetToken;
            return this;
        }


        public ResetToken build() {
            return new ResetToken(resetToken);
        }

    }
}
