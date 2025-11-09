package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class PatchOperationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PatchOperationType op;
    @javax.annotation.Nonnull
    private String path;
    private String value;
    private String from;

    public PatchOperationInput() {
    }

    public PatchOperationInput(PatchOperationType op, String path, String value, String from) {
        this.op = op;
        this.path = path;
        this.value = value;
        this.from = from;
    }

    public PatchOperationType getOp() {
        return op;
    }
    public void setOp(PatchOperationType op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (op != null) {
            joiner.add("op: " + op);
        }
        if (path != null) {
            joiner.add("path: \"" + path + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (from != null) {
            joiner.add("from: \"" + from + "\"");
        }
        return joiner.toString();
    }

    public static PatchOperationInput.Builder builder() {
        return new PatchOperationInput.Builder();
    }

    public static class Builder {

        private PatchOperationType op;
        private String path;
        private String value;
        private String from;

        public Builder() {
        }

        public Builder setOp(PatchOperationType op) {
            this.op = op;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }


        public PatchOperationInput build() {
            return new PatchOperationInput(op, path, value, from);
        }

    }
}
