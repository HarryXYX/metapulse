package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The details of a JSON Connection
 */
public class DataHubJsonConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String blob;

    public DataHubJsonConnection() {
    }

    public DataHubJsonConnection(String blob) {
        this.blob = blob;
    }

    /**
     * The JSON blob containing the specific connection details.
     */
    public String getBlob() {
        return blob;
    }
    /**
     * The JSON blob containing the specific connection details.
     */
    public void setBlob(String blob) {
        this.blob = blob;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (blob != null) {
            joiner.add("blob: \"" + blob + "\"");
        }
        return joiner.toString();
    }

    public static DataHubJsonConnection.Builder builder() {
        return new DataHubJsonConnection.Builder();
    }

    public static class Builder {

        private String blob;

        public Builder() {
        }

        /**
         * The JSON blob containing the specific connection details.
         */
        public Builder setBlob(String blob) {
            this.blob = blob;
            return this;
        }


        public DataHubJsonConnection build() {
            return new DataHubJsonConnection(blob);
        }

    }
}
