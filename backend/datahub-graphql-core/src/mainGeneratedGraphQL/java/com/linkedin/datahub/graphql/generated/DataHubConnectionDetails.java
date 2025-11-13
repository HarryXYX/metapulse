package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The details of the Connection
 */
public class DataHubConnectionDetails implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DataHubConnectionDetailsType type;
    private DataHubJsonConnection json;
    private String name;

    public DataHubConnectionDetails() {
    }

    public DataHubConnectionDetails(DataHubConnectionDetailsType type, DataHubJsonConnection json, String name) {
        this.type = type;
        this.json = json;
        this.name = name;
    }

    /**
     * The type or format of connection
     */
    public DataHubConnectionDetailsType getType() {
        return type;
    }
    /**
     * The type or format of connection
     */
    public void setType(DataHubConnectionDetailsType type) {
        this.type = type;
    }

    /**
     * A JSON-encoded connection. Present when type is JSON.
     */
    public DataHubJsonConnection getJson() {
        return json;
    }
    /**
     * A JSON-encoded connection. Present when type is JSON.
     */
    public void setJson(DataHubJsonConnection json) {
        this.json = json;
    }

    /**
     * The name for this DataHub connection
     */
    public String getName() {
        return name;
    }
    /**
     * The name for this DataHub connection
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (json != null) {
            joiner.add("json: " + json);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        return joiner.toString();
    }

    public static DataHubConnectionDetails.Builder builder() {
        return new DataHubConnectionDetails.Builder();
    }

    public static class Builder {

        private DataHubConnectionDetailsType type;
        private DataHubJsonConnection json;
        private String name;

        public Builder() {
        }

        /**
         * The type or format of connection
         */
        public Builder setType(DataHubConnectionDetailsType type) {
            this.type = type;
            return this;
        }

        /**
         * A JSON-encoded connection. Present when type is JSON.
         */
        public Builder setJson(DataHubJsonConnection json) {
            this.json = json;
            return this;
        }

        /**
         * The name for this DataHub connection
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public DataHubConnectionDetails build() {
            return new DataHubConnectionDetails(type, json, name);
        }

    }
}
