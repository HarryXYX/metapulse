package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required in order to upsert lineage edges
 */
public class UpdateLineageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<LineageEdge> edgesToAdd;
    @javax.annotation.Nonnull
    private java.util.List<LineageEdge> edgesToRemove;

    public UpdateLineageInput() {
    }

    public UpdateLineageInput(java.util.List<LineageEdge> edgesToAdd, java.util.List<LineageEdge> edgesToRemove) {
        this.edgesToAdd = edgesToAdd;
        this.edgesToRemove = edgesToRemove;
    }

    public java.util.List<LineageEdge> getEdgesToAdd() {
        return edgesToAdd;
    }
    public void setEdgesToAdd(java.util.List<LineageEdge> edgesToAdd) {
        this.edgesToAdd = edgesToAdd;
    }

    public java.util.List<LineageEdge> getEdgesToRemove() {
        return edgesToRemove;
    }
    public void setEdgesToRemove(java.util.List<LineageEdge> edgesToRemove) {
        this.edgesToRemove = edgesToRemove;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (edgesToAdd != null) {
            joiner.add("edgesToAdd: " + edgesToAdd);
        }
        if (edgesToRemove != null) {
            joiner.add("edgesToRemove: " + edgesToRemove);
        }
        return joiner.toString();
    }

    public static UpdateLineageInput.Builder builder() {
        return new UpdateLineageInput.Builder();
    }

    public static class Builder {

        private java.util.List<LineageEdge> edgesToAdd;
        private java.util.List<LineageEdge> edgesToRemove;

        public Builder() {
        }

        public Builder setEdgesToAdd(java.util.List<LineageEdge> edgesToAdd) {
            this.edgesToAdd = edgesToAdd;
            return this;
        }

        public Builder setEdgesToRemove(java.util.List<LineageEdge> edgesToRemove) {
            this.edgesToRemove = edgesToRemove;
            return this;
        }


        public UpdateLineageInput build() {
            return new UpdateLineageInput(edgesToAdd, edgesToRemove);
        }

    }
}
