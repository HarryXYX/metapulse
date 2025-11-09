package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The details of a JSON Connection
 */
public class DataHubJsonConnectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String blob;

    public DataHubJsonConnectionInput() {
    }

    public DataHubJsonConnectionInput(String blob) {
        this.blob = blob;
    }

    public String getBlob() {
        return blob;
    }
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

    public static DataHubJsonConnectionInput.Builder builder() {
        return new DataHubJsonConnectionInput.Builder();
    }

    public static class Builder {

        private String blob;

        public Builder() {
        }

        public Builder setBlob(String blob) {
            this.blob = blob;
            return this;
        }


        public DataHubJsonConnectionInput build() {
            return new DataHubJsonConnectionInput(blob);
        }

    }
}
