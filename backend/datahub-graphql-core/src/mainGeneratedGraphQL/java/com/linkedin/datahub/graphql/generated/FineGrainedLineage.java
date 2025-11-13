package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class FineGrainedLineage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<SchemaFieldRef> upstreams;
    private java.util.List<SchemaFieldRef> downstreams;
    private String query;
    private String transformOperation;

    public FineGrainedLineage() {
    }

    public FineGrainedLineage(java.util.List<SchemaFieldRef> upstreams, java.util.List<SchemaFieldRef> downstreams, String query, String transformOperation) {
        this.upstreams = upstreams;
        this.downstreams = downstreams;
        this.query = query;
        this.transformOperation = transformOperation;
    }

    public java.util.List<SchemaFieldRef> getUpstreams() {
        return upstreams;
    }
    public void setUpstreams(java.util.List<SchemaFieldRef> upstreams) {
        this.upstreams = upstreams;
    }

    public java.util.List<SchemaFieldRef> getDownstreams() {
        return downstreams;
    }
    public void setDownstreams(java.util.List<SchemaFieldRef> downstreams) {
        this.downstreams = downstreams;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getTransformOperation() {
        return transformOperation;
    }
    public void setTransformOperation(String transformOperation) {
        this.transformOperation = transformOperation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (upstreams != null) {
            joiner.add("upstreams: " + upstreams);
        }
        if (downstreams != null) {
            joiner.add("downstreams: " + downstreams);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (transformOperation != null) {
            joiner.add("transformOperation: \"" + transformOperation + "\"");
        }
        return joiner.toString();
    }

    public static FineGrainedLineage.Builder builder() {
        return new FineGrainedLineage.Builder();
    }

    public static class Builder {

        private java.util.List<SchemaFieldRef> upstreams;
        private java.util.List<SchemaFieldRef> downstreams;
        private String query;
        private String transformOperation;

        public Builder() {
        }

        public Builder setUpstreams(java.util.List<SchemaFieldRef> upstreams) {
            this.upstreams = upstreams;
            return this;
        }

        public Builder setDownstreams(java.util.List<SchemaFieldRef> downstreams) {
            this.downstreams = downstreams;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setTransformOperation(String transformOperation) {
            this.transformOperation = transformOperation;
            return this;
        }


        public FineGrainedLineage build() {
            return new FineGrainedLineage(upstreams, downstreams, query, transformOperation);
        }

    }
}
