package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for collecting structured property values to apply to entities
 */
public class PropertyValueInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String stringValue;
    private Float numberValue;

    public PropertyValueInput() {
    }

    public PropertyValueInput(String stringValue, Float numberValue) {
        this.stringValue = stringValue;
        this.numberValue = numberValue;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (stringValue != null) {
            joiner.add("stringValue: \"" + stringValue + "\"");
        }
        if (numberValue != null) {
            joiner.add("numberValue: " + numberValue);
        }
        return joiner.toString();
    }

    public static PropertyValueInput.Builder builder() {
        return new PropertyValueInput.Builder();
    }

    public static class Builder {

        private String stringValue;
        private Float numberValue;

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


        public PropertyValueInput build() {
            return new PropertyValueInput(stringValue, numberValue);
        }

    }
}
