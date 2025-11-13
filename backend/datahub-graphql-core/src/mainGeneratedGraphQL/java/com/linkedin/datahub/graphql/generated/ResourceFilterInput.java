package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required when creating or updating an Access Policies Determines which resources the Policy applies to
 */
public class ResourceFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    private String type;
    private java.util.List<String> resources;
    private Boolean allResources;
    private PolicyMatchFilterInput filter;
    private PolicyMatchFilterInput privilegeConstraints;

    public ResourceFilterInput() {
    }

    public ResourceFilterInput(String type, java.util.List<String> resources, Boolean allResources, PolicyMatchFilterInput filter, PolicyMatchFilterInput privilegeConstraints) {
        this.type = type;
        this.resources = resources;
        this.allResources = allResources;
        this.filter = filter;
        this.privilegeConstraints = privilegeConstraints;
    }

    @Deprecated
    public String getType() {
        return type;
    }
    @Deprecated
    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<String> getResources() {
        return resources;
    }
    public void setResources(java.util.List<String> resources) {
        this.resources = resources;
    }

    public Boolean getAllResources() {
        return allResources;
    }
    public void setAllResources(Boolean allResources) {
        this.allResources = allResources;
    }

    public PolicyMatchFilterInput getFilter() {
        return filter;
    }
    public void setFilter(PolicyMatchFilterInput filter) {
        this.filter = filter;
    }

    public PolicyMatchFilterInput getPrivilegeConstraints() {
        return privilegeConstraints;
    }
    public void setPrivilegeConstraints(PolicyMatchFilterInput privilegeConstraints) {
        this.privilegeConstraints = privilegeConstraints;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        if (allResources != null) {
            joiner.add("allResources: " + allResources);
        }
        if (filter != null) {
            joiner.add("filter: " + filter);
        }
        if (privilegeConstraints != null) {
            joiner.add("privilegeConstraints: " + privilegeConstraints);
        }
        return joiner.toString();
    }

    public static ResourceFilterInput.Builder builder() {
        return new ResourceFilterInput.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> resources;
        private Boolean allResources;
        private PolicyMatchFilterInput filter;
        private PolicyMatchFilterInput privilegeConstraints;

        public Builder() {
        }

        @Deprecated
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setAllResources(Boolean allResources) {
            this.allResources = allResources;
            return this;
        }

        public Builder setFilter(PolicyMatchFilterInput filter) {
            this.filter = filter;
            return this;
        }

        public Builder setPrivilegeConstraints(PolicyMatchFilterInput privilegeConstraints) {
            this.privilegeConstraints = privilegeConstraints;
            return this;
        }


        public ResourceFilterInput build() {
            return new ResourceFilterInput(type, resources, allResources, filter, privilegeConstraints);
        }

    }
}
