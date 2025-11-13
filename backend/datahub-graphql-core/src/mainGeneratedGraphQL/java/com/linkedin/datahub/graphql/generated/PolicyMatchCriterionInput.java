package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Criterion to define relationship between field and values
 */
public class PolicyMatchCriterionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String field;
    @javax.annotation.Nonnull
    private java.util.List<String> values;
    @javax.annotation.Nonnull
    private PolicyMatchCondition condition;

    public PolicyMatchCriterionInput() {
    }

    public PolicyMatchCriterionInput(String field, java.util.List<String> values, PolicyMatchCondition condition) {
        this.field = field;
        this.values = values;
        this.condition = condition;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public PolicyMatchCondition getCondition() {
        return condition;
    }
    public void setCondition(PolicyMatchCondition condition) {
        this.condition = condition;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (values != null) {
            joiner.add("values: " + values);
        }
        if (condition != null) {
            joiner.add("condition: " + condition);
        }
        return joiner.toString();
    }

    public static PolicyMatchCriterionInput.Builder builder() {
        return new PolicyMatchCriterionInput.Builder();
    }

    public static class Builder {

        private String field;
        private java.util.List<String> values;
        private PolicyMatchCondition condition;

        public Builder() {
        }

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setCondition(PolicyMatchCondition condition) {
            this.condition = condition;
            return this;
        }


        public PolicyMatchCriterionInput build() {
            return new PolicyMatchCriterionInput(field, values, condition);
        }

    }
}
