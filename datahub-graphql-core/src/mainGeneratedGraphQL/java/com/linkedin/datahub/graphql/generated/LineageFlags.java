package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Flags to control lineage behavior
 */
public class LineageFlags implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer entitiesExploredPerHopLimit;
    private Long startTimeMillis;
    private Long endTimeMillis;
    private java.util.List<EntityTypeToPlatforms> ignoreAsHops;

    public LineageFlags() {
    }

    public LineageFlags(Integer entitiesExploredPerHopLimit, Long startTimeMillis, Long endTimeMillis, java.util.List<EntityTypeToPlatforms> ignoreAsHops) {
        this.entitiesExploredPerHopLimit = entitiesExploredPerHopLimit;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.ignoreAsHops = ignoreAsHops;
    }

    public Integer getEntitiesExploredPerHopLimit() {
        return entitiesExploredPerHopLimit;
    }
    public void setEntitiesExploredPerHopLimit(Integer entitiesExploredPerHopLimit) {
        this.entitiesExploredPerHopLimit = entitiesExploredPerHopLimit;
    }

    public Long getStartTimeMillis() {
        return startTimeMillis;
    }
    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    public Long getEndTimeMillis() {
        return endTimeMillis;
    }
    public void setEndTimeMillis(Long endTimeMillis) {
        this.endTimeMillis = endTimeMillis;
    }

    public java.util.List<EntityTypeToPlatforms> getIgnoreAsHops() {
        return ignoreAsHops;
    }
    public void setIgnoreAsHops(java.util.List<EntityTypeToPlatforms> ignoreAsHops) {
        this.ignoreAsHops = ignoreAsHops;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entitiesExploredPerHopLimit != null) {
            joiner.add("entitiesExploredPerHopLimit: " + entitiesExploredPerHopLimit);
        }
        if (startTimeMillis != null) {
            joiner.add("startTimeMillis: " + startTimeMillis);
        }
        if (endTimeMillis != null) {
            joiner.add("endTimeMillis: " + endTimeMillis);
        }
        if (ignoreAsHops != null) {
            joiner.add("ignoreAsHops: " + ignoreAsHops);
        }
        return joiner.toString();
    }

    public static LineageFlags.Builder builder() {
        return new LineageFlags.Builder();
    }

    public static class Builder {

        private Integer entitiesExploredPerHopLimit;
        private Long startTimeMillis;
        private Long endTimeMillis;
        private java.util.List<EntityTypeToPlatforms> ignoreAsHops;

        public Builder() {
        }

        public Builder setEntitiesExploredPerHopLimit(Integer entitiesExploredPerHopLimit) {
            this.entitiesExploredPerHopLimit = entitiesExploredPerHopLimit;
            return this;
        }

        public Builder setStartTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            return this;
        }

        public Builder setEndTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            return this;
        }

        public Builder setIgnoreAsHops(java.util.List<EntityTypeToPlatforms> ignoreAsHops) {
            this.ignoreAsHops = ignoreAsHops;
            return this;
        }


        public LineageFlags build() {
            return new LineageFlags(entitiesExploredPerHopLimit, startTimeMillis, endTimeMillis, ignoreAsHops);
        }

    }
}
