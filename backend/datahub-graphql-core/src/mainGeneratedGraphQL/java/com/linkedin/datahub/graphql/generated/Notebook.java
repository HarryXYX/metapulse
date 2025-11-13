package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Notebook Metadata Entity
 */
public class Notebook implements java.io.Serializable, Entity, BrowsableEntity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String tool;
    @javax.annotation.Nonnull
    private String notebookId;
    private NotebookInfo info;
    private NotebookEditableProperties editableProperties;
    private Ownership ownership;
    private Status status;
    @javax.annotation.Nonnull
    private NotebookContent content;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private DataPlatformInstance dataPlatformInstance;
    private EntityRelationshipsResult relationships;
    private SubTypes subTypes;
    private GlossaryTerms glossaryTerms;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;

    public Notebook() {
    }

    public Notebook(String urn, EntityType type, String tool, String notebookId, NotebookInfo info, NotebookEditableProperties editableProperties, Ownership ownership, Status status, NotebookContent content, GlobalTags tags, InstitutionalMemory institutionalMemory, DomainAssociation domain, ApplicationAssociation application, DataPlatformInstance dataPlatformInstance, EntityRelationshipsResult relationships, SubTypes subTypes, GlossaryTerms glossaryTerms, DataPlatform platform, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, Boolean exists, java.util.List<RawAspect> aspects) {
        this.urn = urn;
        this.type = type;
        this.tool = tool;
        this.notebookId = notebookId;
        this.info = info;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.status = status;
        this.content = content;
        this.tags = tags;
        this.institutionalMemory = institutionalMemory;
        this.domain = domain;
        this.application = application;
        this.dataPlatformInstance = dataPlatformInstance;
        this.relationships = relationships;
        this.subTypes = subTypes;
        this.glossaryTerms = glossaryTerms;
        this.platform = platform;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.exists = exists;
        this.aspects = aspects;
    }

    /**
     * The primary key of the Notebook
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Notebook
     */
    public void setUrn(String urn) {
        this.urn = urn;
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
     * The Notebook tool name
     */
    public String getTool() {
        return tool;
    }
    /**
     * The Notebook tool name
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the Notebook tool
     */
    public String getNotebookId() {
        return notebookId;
    }
    /**
     * An id unique within the Notebook tool
     */
    public void setNotebookId(String notebookId) {
        this.notebookId = notebookId;
    }

    /**
     * Additional read only information about the Notebook
     */
    public NotebookInfo getInfo() {
        return info;
    }
    /**
     * Additional read only information about the Notebook
     */
    public void setInfo(NotebookInfo info) {
        this.info = info;
    }

    /**
     * Additional read write properties about the Notebook
     */
    public NotebookEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the Notebook
     */
    public void setEditableProperties(NotebookEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the Notebook
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the Notebook
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the Notebook
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the Notebook
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The content of this Notebook
     */
    public NotebookContent getContent() {
        return content;
    }
    /**
     * The content of this Notebook
     */
    public void setContent(NotebookContent content) {
        this.content = content;
    }

    /**
     * The tags associated with the Notebook
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the Notebook
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * References to internal resources related to the Notebook
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Notebook
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The Domain associated with the Notebook
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Notebook
     */
    public void setDomain(DomainAssociation domain) {
        this.domain = domain;
    }

    /**
     * The application associated with the entity
     */
    public ApplicationAssociation getApplication() {
        return application;
    }
    /**
     * The application associated with the entity
     */
    public void setApplication(ApplicationAssociation application) {
        this.application = application;
    }

    /**
     * The specific instance of the data platform that this entity belongs to
     */
    public DataPlatformInstance getDataPlatformInstance() {
        return dataPlatformInstance;
    }
    /**
     * The specific instance of the data platform that this entity belongs to
     */
    public void setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
        this.dataPlatformInstance = dataPlatformInstance;
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
     * Sub Types that this entity implements
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub Types that this entity implements
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
    }

    /**
     * The structured glossary terms associated with the notebook
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the notebook
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * Standardized platform.
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform.
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * The browse paths corresponding to the Notebook. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the Notebook. If no Browse Paths have been generated before, this will be null.
     */
    public void setBrowsePaths(java.util.List<BrowsePath> browsePaths) {
        this.browsePaths = browsePaths;
    }

    /**
     * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
     */
    public BrowsePathV2 getBrowsePathV2() {
        return browsePathV2;
    }
    /**
     * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
     */
    public void setBrowsePathV2(BrowsePathV2 browsePathV2) {
        this.browsePathV2 = browsePathV2;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (tool != null) {
            joiner.add("tool: \"" + tool + "\"");
        }
        if (notebookId != null) {
            joiner.add("notebookId: \"" + notebookId + "\"");
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (content != null) {
            joiner.add("content: " + content);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (browsePaths != null) {
            joiner.add("browsePaths: " + browsePaths);
        }
        if (browsePathV2 != null) {
            joiner.add("browsePathV2: " + browsePathV2);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        return joiner.toString();
    }

    public static Notebook.Builder builder() {
        return new Notebook.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String tool;
        private String notebookId;
        private NotebookInfo info;
        private NotebookEditableProperties editableProperties;
        private Ownership ownership;
        private Status status;
        private NotebookContent content;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private DataPlatformInstance dataPlatformInstance;
        private EntityRelationshipsResult relationships;
        private SubTypes subTypes;
        private GlossaryTerms glossaryTerms;
        private DataPlatform platform;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;

        public Builder() {
        }

        /**
         * The primary key of the Notebook
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
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
         * The Notebook tool name
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the Notebook tool
         */
        public Builder setNotebookId(String notebookId) {
            this.notebookId = notebookId;
            return this;
        }

        /**
         * Additional read only information about the Notebook
         */
        public Builder setInfo(NotebookInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Additional read write properties about the Notebook
         */
        public Builder setEditableProperties(NotebookEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the Notebook
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the Notebook
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The content of this Notebook
         */
        public Builder setContent(NotebookContent content) {
            this.content = content;
            return this;
        }

        /**
         * The tags associated with the Notebook
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * References to internal resources related to the Notebook
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * The Domain associated with the Notebook
         */
        public Builder setDomain(DomainAssociation domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The application associated with the entity
         */
        public Builder setApplication(ApplicationAssociation application) {
            this.application = application;
            return this;
        }

        /**
         * The specific instance of the data platform that this entity belongs to
         */
        public Builder setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
            this.dataPlatformInstance = dataPlatformInstance;
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
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * The structured glossary terms associated with the notebook
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * Standardized platform.
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * The browse paths corresponding to the Notebook. If no Browse Paths have been generated before, this will be null.
         */
        public Builder setBrowsePaths(java.util.List<BrowsePath> browsePaths) {
            this.browsePaths = browsePaths;
            return this;
        }

        /**
         * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
         */
        public Builder setBrowsePathV2(BrowsePathV2 browsePathV2) {
            this.browsePathV2 = browsePathV2;
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


        public Notebook build() {
            return new Notebook(urn, type, tool, notebookId, info, editableProperties, ownership, status, content, tags, institutionalMemory, domain, application, dataPlatformInstance, relationships, subTypes, glossaryTerms, platform, browsePaths, browsePathV2, exists, aspects);
        }

    }
}
