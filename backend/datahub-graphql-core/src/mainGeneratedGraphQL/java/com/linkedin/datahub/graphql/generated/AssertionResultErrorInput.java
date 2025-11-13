package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for reporting an Error during Assertion Run
 */
public class AssertionResultErrorInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionResultErrorType type;
    @javax.annotation.Nonnull
    private String message;

    public AssertionResultErrorInput() {
    }

    public AssertionResultErrorInput(AssertionResultErrorType type, String message) {
        this.type = type;
        this.message = message;
    }

    public AssertionResultErrorType getType() {
        return type;
    }
    public void setType(AssertionResultErrorType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (message != null) {
            joiner.add("message: \"" + message + "\"");
        }
        return joiner.toString();
    }

    public static AssertionResultErrorInput.Builder builder() {
        return new AssertionResultErrorInput.Builder();
    }

    public static class Builder {

        private AssertionResultErrorType type;
        private String message;

        public Builder() {
        }

        public Builder setType(AssertionResultErrorType type) {
            this.type = type;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public AssertionResultErrorInput build() {
            return new AssertionResultErrorInput(type, message);
        }

    }
}
