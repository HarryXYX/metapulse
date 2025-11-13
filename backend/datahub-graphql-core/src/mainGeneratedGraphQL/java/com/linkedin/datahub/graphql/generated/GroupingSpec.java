package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A grouping specification for search results.
 */
public class GroupingSpec implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<GroupingCriterion> groupingCriteria;

    public GroupingSpec() {
    }

    public GroupingSpec(java.util.List<GroupingCriterion> groupingCriteria) {
        this.groupingCriteria = groupingCriteria;
    }

    public java.util.List<GroupingCriterion> getGroupingCriteria() {
        return groupingCriteria;
    }
    public void setGroupingCriteria(java.util.List<GroupingCriterion> groupingCriteria) {
        this.groupingCriteria = groupingCriteria;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (groupingCriteria != null) {
            joiner.add("groupingCriteria: " + groupingCriteria);
        }
        return joiner.toString();
    }

    public static GroupingSpec.Builder builder() {
        return new GroupingSpec.Builder();
    }

    public static class Builder {

        private java.util.List<GroupingCriterion> groupingCriteria;

        public Builder() {
        }

        public Builder setGroupingCriteria(java.util.List<GroupingCriterion> groupingCriteria) {
            this.groupingCriteria = groupingCriteria;
            return this;
        }


        public GroupingSpec build() {
            return new GroupingSpec(groupingCriteria);
        }

    }
}
