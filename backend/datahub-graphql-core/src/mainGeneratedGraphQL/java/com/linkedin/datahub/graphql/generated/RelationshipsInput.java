package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the list relationships field of an Entity
 */
public class RelationshipsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> types;
    @javax.annotation.Nonnull
    private RelationshipDirection direction;
    private Integer start;
    private Integer count;
    private Boolean includeSoftDelete = true;

    public RelationshipsInput() {
    }

    public RelationshipsInput(java.util.List<String> types, RelationshipDirection direction, Integer start, Integer count, Boolean includeSoftDelete) {
        this.types = types;
        this.direction = direction;
        this.start = start;
        this.count = count;
        this.includeSoftDelete = includeSoftDelete;
    }

    public java.util.List<String> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<String> types) {
        this.types = types;
    }

    public RelationshipDirection getDirection() {
        return direction;
    }
    public void setDirection(RelationshipDirection direction) {
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

    public Boolean getIncludeSoftDelete() {
        return includeSoftDelete;
    }
    public void setIncludeSoftDelete(Boolean includeSoftDelete) {
        this.includeSoftDelete = includeSoftDelete;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (types != null) {
            joiner.add("types: " + types);
        }
        if (direction != null) {
            joiner.add("direction: " + direction);
        }
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (includeSoftDelete != null) {
            joiner.add("includeSoftDelete: " + includeSoftDelete);
        }
        return joiner.toString();
    }

    public static RelationshipsInput.Builder builder() {
        return new RelationshipsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> types;
        private RelationshipDirection direction;
        private Integer start;
        private Integer count;
        private Boolean includeSoftDelete = true;

        public Builder() {
        }

        public Builder setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }

        public Builder setDirection(RelationshipDirection direction) {
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

        public Builder setIncludeSoftDelete(Boolean includeSoftDelete) {
            this.includeSoftDelete = includeSoftDelete;
            return this;
        }


        public RelationshipsInput build() {
            return new RelationshipsInput(types, direction, start, count, includeSoftDelete);
        }

    }
}
