package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to Lineage
 */
public class LineageConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean supportsImpactAnalysis;

    public LineageConfig() {
    }

    public LineageConfig(boolean supportsImpactAnalysis) {
        this.supportsImpactAnalysis = supportsImpactAnalysis;
    }

    /**
     * Whether the backend support impact analysis feature
     */
    public boolean getSupportsImpactAnalysis() {
        return supportsImpactAnalysis;
    }
    /**
     * Whether the backend support impact analysis feature
     */
    public void setSupportsImpactAnalysis(boolean supportsImpactAnalysis) {
        this.supportsImpactAnalysis = supportsImpactAnalysis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("supportsImpactAnalysis: " + supportsImpactAnalysis);
        return joiner.toString();
    }

    public static LineageConfig.Builder builder() {
        return new LineageConfig.Builder();
    }

    public static class Builder {

        private boolean supportsImpactAnalysis;

        public Builder() {
        }

        /**
         * Whether the backend support impact analysis feature
         */
        public Builder setSupportsImpactAnalysis(boolean supportsImpactAnalysis) {
            this.supportsImpactAnalysis = supportsImpactAnalysis;
            return this;
        }


        public LineageConfig build() {
            return new LineageConfig(supportsImpactAnalysis);
        }

    }
}
