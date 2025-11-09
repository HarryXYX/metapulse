package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The resources that a DataHub Access Policy applies to
 */
public class ResourceFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    private String type;
    @Deprecated
    private java.util.List<String> resources;
    @Deprecated
    private Boolean allResources;
    private PolicyMatchFilter filter;
    private PolicyMatchFilter privilegeConstraints;

    public ResourceFilter() {
    }

    public ResourceFilter(String type, java.util.List<String> resources, Boolean allResources, PolicyMatchFilter filter, PolicyMatchFilter privilegeConstraints) {
        this.type = type;
        this.resources = resources;
        this.allResources = allResources;
        this.filter = filter;
        this.privilegeConstraints = privilegeConstraints;
    }

    /**
     * Deprecated, use filter instead
The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
     */
    @Deprecated
    public String getType() {
        return type;
    }
    /**
     * Deprecated, use filter instead
The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
     */
    @Deprecated
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Deprecated, use filter instead
A list of specific resource urns to apply the filter to
     */
    @Deprecated
    public java.util.List<String> getResources() {
        return resources;
    }
    /**
     * Deprecated, use filter instead
A list of specific resource urns to apply the filter to
     */
    @Deprecated
    public void setResources(java.util.List<String> resources) {
        this.resources = resources;
    }

    /**
     * Deprecated, use filter instead
Whether of not to apply the filter to all resources of the type
     */
    @Deprecated
    public Boolean getAllResources() {
        return allResources;
    }
    /**
     * Deprecated, use filter instead
Whether of not to apply the filter to all resources of the type
     */
    @Deprecated
    public void setAllResources(Boolean allResources) {
        this.allResources = allResources;
    }

    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public PolicyMatchFilter getFilter() {
        return filter;
    }
    /**
     * Whether of not to apply the filter to all resources of the type
     */
    public void setFilter(PolicyMatchFilter filter) {
        this.filter = filter;
    }

    /**
     * Constraints on what subresources can be acted upon
     */
    public PolicyMatchFilter getPrivilegeConstraints() {
        return privilegeConstraints;
    }
    /**
     * Constraints on what subresources can be acted upon
     */
    public void setPrivilegeConstraints(PolicyMatchFilter privilegeConstraints) {
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

    public static ResourceFilter.Builder builder() {
        return new ResourceFilter.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<String> resources;
        private Boolean allResources;
        private PolicyMatchFilter filter;
        private PolicyMatchFilter privilegeConstraints;

        public Builder() {
        }

        /**
         * Deprecated, use filter instead
The type of the resource the policy should apply to Not required because in the future we want to support filtering by type OR by domain
         */
        @Deprecated
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * Deprecated, use filter instead
A list of specific resource urns to apply the filter to
         */
        @Deprecated
        public Builder setResources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Deprecated, use filter instead
Whether of not to apply the filter to all resources of the type
         */
        @Deprecated
        public Builder setAllResources(Boolean allResources) {
            this.allResources = allResources;
            return this;
        }

        /**
         * Whether of not to apply the filter to all resources of the type
         */
        public Builder setFilter(PolicyMatchFilter filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Constraints on what subresources can be acted upon
         */
        public Builder setPrivilegeConstraints(PolicyMatchFilter privilegeConstraints) {
            this.privilegeConstraints = privilegeConstraints;
            return this;
        }


        public ResourceFilter build() {
            return new ResourceFilter(type, resources, allResources, filter, privilegeConstraints);
        }

    }
}
