package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Definition of the test
 */
public class TestDefinition implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String json;

    public TestDefinition() {
    }

    public TestDefinition(String json) {
        this.json = json;
    }

    /**
     * JSON-based def for the test
     */
    public String getJson() {
        return json;
    }
    /**
     * JSON-based def for the test
     */
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

    public static TestDefinition.Builder builder() {
        return new TestDefinition.Builder();
    }

    public static class Builder {

        private String json;

        public Builder() {
        }

        /**
         * JSON-based def for the test
         */
        public Builder setJson(String json) {
            this.json = json;
            return this;
        }


        public TestDefinition build() {
            return new TestDefinition(json);
        }

    }
}
