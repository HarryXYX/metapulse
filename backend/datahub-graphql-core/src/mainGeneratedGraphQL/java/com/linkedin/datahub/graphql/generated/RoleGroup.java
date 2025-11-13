package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class RoleGroup implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CorpGroup group;

    public RoleGroup() {
    }

    public RoleGroup(CorpGroup group) {
        this.group = group;
    }

    /**
     * Linked corp group of a role
     */
    public CorpGroup getGroup() {
        return group;
    }
    /**
     * Linked corp group of a role
     */
    public void setGroup(CorpGroup group) {
        this.group = group;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (group != null) {
            joiner.add("group: " + group);
        }
        return joiner.toString();
    }

    public static RoleGroup.Builder builder() {
        return new RoleGroup.Builder();
    }

    public static class Builder {

        private CorpGroup group;

        public Builder() {
        }

        /**
         * Linked corp group of a role
         */
        public Builder setGroup(CorpGroup group) {
            this.group = group;
            return this;
        }


        public RoleGroup build() {
            return new RoleGroup(group);
        }

    }
}
