package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input fields of the chart
 */
public class InputFields implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<InputField> fields;

    public InputFields() {
    }

    public InputFields(java.util.List<InputField> fields) {
        this.fields = fields;
    }

    public java.util.List<InputField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<InputField> fields) {
        this.fields = fields;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fields != null) {
            joiner.add("fields: " + fields);
        }
        return joiner.toString();
    }

    public static InputFields.Builder builder() {
        return new InputFields.Builder();
    }

    public static class Builder {

        private java.util.List<InputField> fields;

        public Builder() {
        }

        public Builder setFields(java.util.List<InputField> fields) {
            this.fields = fields;
            return this;
        }


        public InputFields build() {
            return new InputFields(fields);
        }

    }
}
