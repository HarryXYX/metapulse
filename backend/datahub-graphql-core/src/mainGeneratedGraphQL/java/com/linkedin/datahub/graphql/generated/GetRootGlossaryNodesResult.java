package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result when getting Glossary entities
 */
public class GetRootGlossaryNodesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<GlossaryNode> nodes;
    private int start;
    private int count;
    private int total;

    public GetRootGlossaryNodesResult() {
    }

    public GetRootGlossaryNodesResult(java.util.List<GlossaryNode> nodes, int start, int count, int total) {
        this.nodes = nodes;
        this.start = start;
        this.count = count;
        this.total = total;
    }

    /**
     * A list of Glossary Nodes without a parent node
     */
    public java.util.List<GlossaryNode> getNodes() {
        return nodes;
    }
    /**
     * A list of Glossary Nodes without a parent node
     */
    public void setNodes(java.util.List<GlossaryNode> nodes) {
        this.nodes = nodes;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of nodes in the returned result
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of nodes in the returned result
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of nodes in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of nodes in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (nodes != null) {
            joiner.add("nodes: " + nodes);
        }
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        return joiner.toString();
    }

    public static GetRootGlossaryNodesResult.Builder builder() {
        return new GetRootGlossaryNodesResult.Builder();
    }

    public static class Builder {

        private java.util.List<GlossaryNode> nodes;
        private int start;
        private int count;
        private int total;

        public Builder() {
        }

        /**
         * A list of Glossary Nodes without a parent node
         */
        public Builder setNodes(java.util.List<GlossaryNode> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of nodes in the returned result
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of nodes in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public GetRootGlossaryNodesResult build() {
            return new GetRootGlossaryNodesResult(nodes, start, count, total);
        }

    }
}
