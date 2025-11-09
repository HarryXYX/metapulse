package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Parameter for AssertionStdOperator.
 */
public class AssertionStdParameter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String value;
    @javax.annotation.Nonnull
    private AssertionStdParameterType type;

    public AssertionStdParameter() {
    }

    public AssertionStdParameter(String value, AssertionStdParameterType type) {
        this.value = value;
        this.type = type;
    }

    /**
     * The parameter value
     */
    public String getValue() {
        return value;
    }
    /**
     * The parameter value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The type of the parameter
     */
    public AssertionStdParameterType getType() {
        return type;
    }
    /**
     * The type of the parameter
     */
    public void setType(AssertionStdParameterType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static AssertionStdParameter.Builder builder() {
        return new AssertionStdParameter.Builder();
    }

    public static class Builder {

        private String value;
        private AssertionStdParameterType type;

        public Builder() {
        }

        /**
         * The parameter value
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * The type of the parameter
         */
        public Builder setType(AssertionStdParameterType type) {
            this.type = type;
            return this;
        }


        public AssertionStdParameter build() {
            return new AssertionStdParameter(value, type);
        }

    }
}
