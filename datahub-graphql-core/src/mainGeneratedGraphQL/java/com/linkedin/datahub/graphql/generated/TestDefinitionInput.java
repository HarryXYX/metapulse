package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class TestDefinitionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String json;

    public TestDefinitionInput() {
    }

    public TestDefinitionInput(String json) {
        this.json = json;
    }

    public String getJson() {
        return json;
    }
    public void setJson(String json) {
        this.json = json;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (json != null) {
            joiner.add("json: \"" + json + "\"");
        }
        return joiner.toString();
    }

    public static TestDefinitionInput.Builder builder() {
        return new TestDefinitionInput.Builder();
    }

    public static class Builder {

        private String json;

        public Builder() {
        }

        public Builder setJson(String json) {
            this.json = json;
            return this;
        }


        public TestDefinitionInput build() {
            return new TestDefinitionInput(json);
        }

    }
}
