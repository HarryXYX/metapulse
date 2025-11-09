package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the list lineage property of an Entity
 */
public class LineageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private LineageDirection direction;
    private Integer start;
    private Integer count;
    private Boolean separateSiblings;
    private Long startTimeMillis;
    private Long endTimeMillis;
    private Boolean includeGhostEntities = false;

    public LineageInput() {
    }

    public LineageInput(LineageDirection direction, Integer start, Integer count, Boolean separateSiblings, Long startTimeMillis, Long endTimeMillis, Boolean includeGhostEntities) {
        this.direction = direction;
        this.start = start;
        this.count = count;
        this.separateSiblings = separateSiblings;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.includeGhostEntities = includeGhostEntities;
    }

    public LineageDirection getDirection() {
        return direction;
    }
    public void setDirection(LineageDirection direction) {
        this.direction = direction;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getSeparateSiblings() {
        return separateSiblings;
    }
    public void setSeparateSiblings(Boolean separateSiblings) {
        this.separateSiblings = separateSiblings;
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

    public Boolean getIncludeGhostEntities() {
        return includeGhostEntities;
    }
    public void setIncludeGhostEntities(Boolean includeGhostEntities) {
        this.includeGhostEntities = includeGhostEntities;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (direction != null) {
            joiner.add("direction: " + direction);
        }
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (separateSiblings != null) {
            joiner.add("separateSiblings: " + separateSiblings);
        }
        if (startTimeMillis != null) {
            joiner.add("startTimeMillis: " + startTimeMillis);
        }
        if (endTimeMillis != null) {
            joiner.add("endTimeMillis: " + endTimeMillis);
        }
        if (includeGhostEntities != null) {
            joiner.add("includeGhostEntities: " + includeGhostEntities);
        }
        return joiner.toString();
    }

    public static LineageInput.Builder builder() {
        return new LineageInput.Builder();
    }

    public static class Builder {

        private LineageDirection direction;
        private Integer start;
        private Integer count;
        private Boolean separateSiblings;
        private Long startTimeMillis;
        private Long endTimeMillis;
        private Boolean includeGhostEntities = false;

        public Builder() {
        }

        public Builder setDirection(LineageDirection direction) {
            this.direction = direction;
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public Builder setSeparateSiblings(Boolean separateSiblings) {
            this.separateSiblings = separateSiblings;
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

        public Builder setIncludeGhostEntities(Boolean includeGhostEntities) {
            this.includeGhostEntities = includeGhostEntities;
            return this;
        }


        public LineageInput build() {
            return new LineageInput(direction, start, count, separateSiblings, startTimeMillis, endTimeMillis, includeGhostEntities);
        }

    }
}
