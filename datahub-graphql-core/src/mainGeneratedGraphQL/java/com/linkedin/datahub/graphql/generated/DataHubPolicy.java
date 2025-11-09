package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An DataHub Platform Access Policy -  Policies determine who can perform what actions against which resources on the platform
 */
public class DataHubPolicy implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private EntityRelationshipsResult relationships;
    @javax.annotation.Nonnull
    private PolicyType policyType;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private PolicyState state;
    private String description;
    private ResourceFilter resources;
    @javax.annotation.Nonnull
    private java.util.List<String> privileges;
    @javax.annotation.Nonnull
    private ActorFilter actors;
    private boolean editable;

    public DataHubPolicy() {
    }

    public DataHubPolicy(String urn, EntityType type, EntityRelationshipsResult relationships, PolicyType policyType, String name, PolicyState state, String description, ResourceFilter resources, java.util.List<String> privileges, ActorFilter actors, boolean editable) {
        this.urn = urn;
        this.type = type;
        this.relationships = relationships;
        this.policyType = policyType;
        this.name = name;
        this.state = state;
        this.description = description;
        this.resources = resources;
        this.privileges = privileges;
        this.actors = actors;
        this.editable = editable;
    }

    /**
     * The primary key of the Policy
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Policy
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Granular API for querying edges extending from the Role
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from the Role
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * The type of the Policy
     */
    public PolicyType getPolicyType() {
        return policyType;
    }
    /**
     * The type of the Policy
     */
    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    /**
     * The name of the Policy
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Policy
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The present state of the Policy
     */
    public PolicyState getState() {
        return state;
    }
    /**
     * The present state of the Policy
     */
    public void setState(PolicyState state) {
        this.state = state;
    }

    /**
     * The description of the Policy
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the Policy
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The resources that the Policy privileges apply to
     */
    public ResourceFilter getResources() {
        return resources;
    }
    /**
     * The resources that the Policy privileges apply to
     */
    public void setResources(ResourceFilter resources) {
        this.resources = resources;
    }

    /**
     * The privileges that the Policy grants
     */
    public java.util.List<String> getPrivileges() {
        return privileges;
    }
    /**
     * The privileges that the Policy grants
     */
    public void setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }

    /**
     * The actors that the Policy grants privileges to
     */
    public ActorFilter getActors() {
        return actors;
    }
    /**
     * The actors that the Policy grants privileges to
     */
    public void setActors(ActorFilter actors) {
        this.actors = actors;
    }

    /**
     * Whether the Policy is editable, ie system policies, or not
     */
    public boolean getEditable() {
        return editable;
    }
    /**
     * Whether the Policy is editable, ie system policies, or not
     */
    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (policyType != null) {
            joiner.add("policyType: " + policyType);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (state != null) {
            joiner.add("state: " + state);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (actors != null) {
            joiner.add("actors: " + actors);
        }
        joiner.add("editable: " + editable);
        return joiner.toString();
    }

    public static DataHubPolicy.Builder builder() {
        return new DataHubPolicy.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityRelationshipsResult relationships;
        private PolicyType policyType;
        private String name;
        private PolicyState state;
        private String description;
        private ResourceFilter resources;
        private java.util.List<String> privileges;
        private ActorFilter actors;
        private boolean editable;

        public Builder() {
        }

        /**
         * The primary key of the Policy
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Granular API for querying edges extending from the Role
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * The type of the Policy
         */
        public Builder setPolicyType(PolicyType policyType) {
            this.policyType = policyType;
            return this;
        }

        /**
         * The name of the Policy
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The present state of the Policy
         */
        public Builder setState(PolicyState state) {
            this.state = state;
            return this;
        }

        /**
         * The description of the Policy
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The resources that the Policy privileges apply to
         */
        public Builder setResources(ResourceFilter resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The privileges that the Policy grants
         */
        public Builder setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * The actors that the Policy grants privileges to
         */
        public Builder setActors(ActorFilter actors) {
            this.actors = actors;
            return this;
        }

        /**
         * Whether the Policy is editable, ie system policies, or not
         */
        public Builder setEditable(boolean editable) {
            this.editable = editable;
            return this;
        }


        public DataHubPolicy build() {
            return new DataHubPolicy(urn, type, relationships, policyType, name, state, description, resources, privileges, actors, editable);
        }

    }
}
