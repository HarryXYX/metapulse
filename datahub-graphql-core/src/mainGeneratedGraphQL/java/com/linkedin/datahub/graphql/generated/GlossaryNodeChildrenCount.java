package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * All of the parent nodes for GlossaryTerms and GlossaryNodes
 */
public class GlossaryNodeChildrenCount implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int termsCount;
    private int nodesCount;

    public GlossaryNodeChildrenCount() {
    }

    public GlossaryNodeChildrenCount(int termsCount, int nodesCount) {
        this.termsCount = termsCount;
        this.nodesCount = nodesCount;
    }

    /**
     * The number of child glossary terms
     */
    public int getTermsCount() {
        return termsCount;
    }
    /**
     * The number of child glossary terms
     */
    public void setTermsCount(int termsCount) {
        this.termsCount = termsCount;
    }

    /**
     * The number of child glossary nodes
     */
    public int getNodesCount() {
        return nodesCount;
    }
    /**
     * The number of child glossary nodes
     */
    public void setNodesCount(int nodesCount) {
        this.nodesCount = nodesCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("termsCount: " + termsCount);
        joiner.add("nodesCount: " + nodesCount);
        return joiner.toString();
    }

    public static GlossaryNodeChildrenCount.Builder builder() {
        return new GlossaryNodeChildrenCount.Builder();
    }

    public static class Builder {

        private int termsCount;
        private int nodesCount;

        public Builder() {
        }

        /**
         * The number of child glossary terms
         */
        public Builder setTermsCount(int termsCount) {
            this.termsCount = termsCount;
            return this;
        }

        /**
         * The number of child glossary nodes
         */
        public Builder setNodesCount(int nodesCount) {
            this.nodesCount = nodesCount;
            return this;
        }


        public GlossaryNodeChildrenCount build() {
            return new GlossaryNodeChildrenCount(termsCount, nodesCount);
        }

    }
}
