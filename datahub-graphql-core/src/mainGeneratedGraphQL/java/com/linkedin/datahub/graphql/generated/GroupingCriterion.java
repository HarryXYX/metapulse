package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A single grouping criterion for grouping search results
 */
public class GroupingCriterion implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private EntityType baseEntityType;
    @javax.annotation.Nonnull
    private EntityType groupingEntityType;

    public GroupingCriterion() {
    }

    public GroupingCriterion(EntityType baseEntityType, EntityType groupingEntityType) {
        this.baseEntityType = baseEntityType;
        this.groupingEntityType = groupingEntityType;
    }

    public EntityType getBaseEntityType() {
        return baseEntityType;
    }
    public void setBaseEntityType(EntityType baseEntityType) {
        this.baseEntityType = baseEntityType;
    }

    public EntityType getGroupingEntityType() {
        return groupingEntityType;
    }
    public void setGroupingEntityType(EntityType groupingEntityType) {
        this.groupingEntityType = groupingEntityType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (baseEntityType != null) {
            joiner.add("baseEntityType: " + baseEntityType);
        }
        if (groupingEntityType != null) {
            joiner.add("groupingEntityType: " + groupingEntityType);
        }
        return joiner.toString();
    }

    public static GroupingCriterion.Builder builder() {
        return new GroupingCriterion.Builder();
    }

    public static class Builder {

        private EntityType baseEntityType;
        private EntityType groupingEntityType;

        public Builder() {
        }

        public Builder setBaseEntityType(EntityType baseEntityType) {
            this.baseEntityType = baseEntityType;
            return this;
        }

        public Builder setGroupingEntityType(EntityType groupingEntityType) {
            this.groupingEntityType = groupingEntityType;
            return this;
        }


        public GroupingCriterion build() {
            return new GroupingCriterion(baseEntityType, groupingEntityType);
        }

    }
}
