package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class EntityCountResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityCountResult> counts;

    public EntityCountResults() {
    }

    public EntityCountResults(java.util.List<EntityCountResult> counts) {
        this.counts = counts;
    }

    public java.util.List<EntityCountResult> getCounts() {
        return counts;
    }
    public void setCounts(java.util.List<EntityCountResult> counts) {
        this.counts = counts;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (counts != null) {
            joiner.add("counts: " + counts);
        }
        return joiner.toString();
    }

    public static EntityCountResults.Builder builder() {
        return new EntityCountResults.Builder();
    }

    public static class Builder {

        private java.util.List<EntityCountResult> counts;

        public Builder() {
        }

        public Builder setCounts(java.util.List<EntityCountResult> counts) {
            this.counts = counts;
            return this;
        }


        public EntityCountResults build() {
            return new EntityCountResults(counts);
        }

    }
}
