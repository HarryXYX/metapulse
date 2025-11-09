package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An input entry for an allowed value for a structured property
 */
public class AllowedValueInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String stringValue;
    private Float numberValue;
    private String description;

    public AllowedValueInput() {
    }

    public AllowedValueInput(String stringValue, Float numberValue, String description) {
        this.stringValue = stringValue;
        this.numberValue = numberValue;
        this.description = description;
    }

    public String getStringValue() {
        return stringValue;
    }
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Float getNumberValue() {
        return numberValue;
    }
    public void setNumberValue(Float numberValue) {
        this.numberValue = numberValue;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (stringValue != null) {
            joiner.add("stringValue: \"" + stringValue + "\"");
        }
        if (numberValue != null) {
            joiner.add("numberValue: " + numberValue);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static AllowedValueInput.Builder builder() {
        return new AllowedValueInput.Builder();
    }

    public static class Builder {

        private String stringValue;
        private Float numberValue;
        private String description;

        public Builder() {
        }

        public Builder setStringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setNumberValue(Float numberValue) {
            this.numberValue = numberValue;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public AllowedValueInput build() {
            return new AllowedValueInput(stringValue, numberValue, description);
        }

    }
}
