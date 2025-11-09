package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class PatchEntityResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private String name;
    private boolean success;
    private String error;

    public PatchEntityResult() {
    }

    public PatchEntityResult(String urn, String name, boolean success, String error) {
        this.urn = urn;
        this.name = name;
        this.success = success;
        this.error = error;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        joiner.add("success: " + success);
        if (error != null) {
            joiner.add("error: \"" + error + "\"");
        }
        return joiner.toString();
    }

    public static PatchEntityResult.Builder builder() {
        return new PatchEntityResult.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private boolean success;
        private String error;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSuccess(boolean success) {
            this.success = success;
            return this;
        }

        public Builder setError(String error) {
            this.error = error;
            return this;
        }


        public PatchEntityResult build() {
            return new PatchEntityResult(urn, name, success, error);
        }

    }
}
