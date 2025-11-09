package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Glossary Node, or a directory in a Business Glossary represents a container of
Glossary Terms or other Glossary Nodes
 */
public class GlossaryNode implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private Ownership ownership;
    @javax.annotation.Nonnull
    private EntityType type;
    private GlossaryNodeProperties properties;
    private EntityRelationshipsResult relationships;
    private ParentNodesResult parentNodes;
    private InstitutionalMemory institutionalMemory;
    private EntityPrivileges privileges;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private DisplayProperties displayProperties;
    private GlossaryNodeChildrenCount childrenCount;
    private ScrollResults glossaryChildrenSearch;
    private AssetSettings settings;

    public GlossaryNode() {
    }

    public GlossaryNode(String urn, Ownership ownership, EntityType type, GlossaryNodeProperties properties, EntityRelationshipsResult relationships, ParentNodesResult parentNodes, InstitutionalMemory institutionalMemory, EntityPrivileges privileges, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, DisplayProperties displayProperties, GlossaryNodeChildrenCount childrenCount, ScrollResults glossaryChildrenSearch, AssetSettings settings) {
        this.urn = urn;
        this.ownership = ownership;
        this.type = type;
        this.properties = properties;
        this.relationships = relationships;
        this.parentNodes = parentNodes;
        this.institutionalMemory = institutionalMemory;
        this.privileges = privileges;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.displayProperties = displayProperties;
        this.childrenCount = childrenCount;
        this.glossaryChildrenSearch = glossaryChildrenSearch;
        this.settings = settings;
    }

    /**
     * The primary key of the glossary term
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the glossary term
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Ownership metadata of the glossary term
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the glossary term
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Additional properties associated with the Glossary Term
     */
    public GlossaryNodeProperties getProperties() {
        return properties;
    }
    /**
     * Additional properties associated with the Glossary Term
     */
    public void setProperties(GlossaryNodeProperties properties) {
        this.properties = properties;
    }

    /**
     * Edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Edges extending from this entity
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * Recursively get the lineage of glossary nodes for this entity
     */
    public ParentNodesResult getParentNodes() {
        return parentNodes;
    }
    /**
     * Recursively get the lineage of glossary nodes for this entity
     */
    public void setParentNodes(ParentNodesResult parentNodes) {
        this.parentNodes = parentNodes;
    }

    /**
     * References to internal resources related to the Glossary Node
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Glossary Node
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Privileges given to a user relevant to this entity
     */
    public EntityPrivileges getPrivileges() {
        return privileges;
    }
    /**
     * Privileges given to a user relevant to this entity
     */
    public void setPrivileges(EntityPrivileges privileges) {
        this.privileges = privileges;
    }

    /**
     * Whether or not this entity exists on DataHub
     */
    public Boolean getExists() {
        return exists;
    }
    /**
     * Whether or not this entity exists on DataHub
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    public java.util.List<RawAspect> getAspects() {
        return aspects;
    }
    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    public void setAspects(java.util.List<RawAspect> aspects) {
        this.aspects = aspects;
    }

    /**
     * Structured properties about this asset
     */
    public StructuredProperties getStructuredProperties() {
        return structuredProperties;
    }
    /**
     * Structured properties about this asset
     */
    public void setStructuredProperties(StructuredProperties structuredProperties) {
        this.structuredProperties = structuredProperties;
    }

    /**
     * The forms associated with the Dataset
     */
    public Forms getForms() {
        return forms;
    }
    /**
     * The forms associated with the Dataset
     */
    public void setForms(Forms forms) {
        this.forms = forms;
    }

    /**
     * Display properties for the glossary node
     */
    public DisplayProperties getDisplayProperties() {
        return displayProperties;
    }
    /**
     * Display properties for the glossary node
     */
    public void setDisplayProperties(DisplayProperties displayProperties) {
        this.displayProperties = displayProperties;
    }

    /**
     * Carries information about where an entity originated from.
     */
    public GlossaryNodeChildrenCount getChildrenCount() {
        return childrenCount;
    }
    /**
     * Carries information about where an entity originated from.
     */
    public void setChildrenCount(GlossaryNodeChildrenCount childrenCount) {
        this.childrenCount = childrenCount;
    }

    /**
     * Executes a search on the children of this glossary node
     */
    public ScrollResults getGlossaryChildrenSearch() {
        return glossaryChildrenSearch;
    }
    /**
     * Executes a search on the children of this glossary node
     */
    public void setGlossaryChildrenSearch(ScrollResults glossaryChildrenSearch) {
        this.glossaryChildrenSearch = glossaryChildrenSearch;
    }

    /**
     * Settings associated with this asset
     */
    public AssetSettings getSettings() {
        return settings;
    }
    /**
     * Settings associated with this asset
     */
    public void setSettings(AssetSettings settings) {
        this.settings = settings;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (parentNodes != null) {
            joiner.add("parentNodes: " + parentNodes);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        if (structuredProperties != null) {
            joiner.add("structuredProperties: " + structuredProperties);
        }
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (displayProperties != null) {
            joiner.add("displayProperties: " + displayProperties);
        }
        if (childrenCount != null) {
            joiner.add("childrenCount: " + childrenCount);
        }
        if (glossaryChildrenSearch != null) {
            joiner.add("glossaryChildrenSearch: " + glossaryChildrenSearch);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static GlossaryNode.Builder builder() {
        return new GlossaryNode.Builder();
    }

    public static class Builder {

        private String urn;
        private Ownership ownership;
        private EntityType type;
        private GlossaryNodeProperties properties;
        private EntityRelationshipsResult relationships;
        private ParentNodesResult parentNodes;
        private InstitutionalMemory institutionalMemory;
        private EntityPrivileges privileges;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private DisplayProperties displayProperties;
        private GlossaryNodeChildrenCount childrenCount;
        private ScrollResults glossaryChildrenSearch;
        private AssetSettings settings;

        public Builder() {
        }

        /**
         * The primary key of the glossary term
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Ownership metadata of the glossary term
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Additional properties associated with the Glossary Term
         */
        public Builder setProperties(GlossaryNodeProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Recursively get the lineage of glossary nodes for this entity
         */
        public Builder setParentNodes(ParentNodesResult parentNodes) {
            this.parentNodes = parentNodes;
            return this;
        }

        /**
         * References to internal resources related to the Glossary Node
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Privileges given to a user relevant to this entity
         */
        public Builder setPrivileges(EntityPrivileges privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Whether or not this entity exists on DataHub
         */
        public Builder setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * Experimental API.
For fetching extra entities that do not have custom UI code yet
         */
        public Builder setAspects(java.util.List<RawAspect> aspects) {
            this.aspects = aspects;
            return this;
        }

        /**
         * Structured properties about this asset
         */
        public Builder setStructuredProperties(StructuredProperties structuredProperties) {
            this.structuredProperties = structuredProperties;
            return this;
        }

        /**
         * The forms associated with the Dataset
         */
        public Builder setForms(Forms forms) {
            this.forms = forms;
            return this;
        }

        /**
         * Display properties for the glossary node
         */
        public Builder setDisplayProperties(DisplayProperties displayProperties) {
            this.displayProperties = displayProperties;
            return this;
        }

        /**
         * Carries information about where an entity originated from.
         */
        public Builder setChildrenCount(GlossaryNodeChildrenCount childrenCount) {
            this.childrenCount = childrenCount;
            return this;
        }

        /**
         * Executes a search on the children of this glossary node
         */
        public Builder setGlossaryChildrenSearch(ScrollResults glossaryChildrenSearch) {
            this.glossaryChildrenSearch = glossaryChildrenSearch;
            return this;
        }

        /**
         * Settings associated with this asset
         */
        public Builder setSettings(AssetSettings settings) {
            this.settings = settings;
            return this;
        }


        public GlossaryNode build() {
            return new GlossaryNode(urn, ownership, type, properties, relationships, parentNodes, institutionalMemory, privileges, exists, aspects, structuredProperties, forms, displayProperties, childrenCount, glossaryChildrenSearch, settings);
        }

    }
}
