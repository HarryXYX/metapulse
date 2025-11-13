package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when batch assigning a role to a list of users
 */
public class BatchAssignRoleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String roleUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> actors;

    public BatchAssignRoleInput() {
    }

    public BatchAssignRoleInput(String roleUrn, java.util.List<String> actors) {
        this.roleUrn = roleUrn;
        this.actors = actors;
    }

    public String getRoleUrn() {
        return roleUrn;
    }
    public void setRoleUrn(String roleUrn) {
        this.roleUrn = roleUrn;
    }

    public java.util.List<String> getActors() {
        return actors;
    }
    public void setActors(java.util.List<String> actors) {
        this.actors = actors;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (roleUrn != null) {
            joiner.add("roleUrn: \"" + roleUrn + "\"");
        }
        if (actors != null) {
            joiner.add("actors: " + actors);
        }
        return joiner.toString();
    }

    public static BatchAssignRoleInput.Builder builder() {
        return new BatchAssignRoleInput.Builder();
    }

    public static class Builder {

        private String roleUrn;
        private java.util.List<String> actors;

        public Builder() {
        }

        public Builder setRoleUrn(String roleUrn) {
            this.roleUrn = roleUrn;
            return this;
        }

        public Builder setActors(java.util.List<String> actors) {
            this.actors = actors;
            return this;
        }


        public BatchAssignRoleInput build() {
            return new BatchAssignRoleInput(roleUrn, actors);
        }

    }
}
