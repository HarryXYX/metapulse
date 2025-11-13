package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An ML Model Metadata Entity Note that this entity is incubating
 */
public class MLModel implements java.io.Serializable, Entity, SupportsVersions, EntityWithRelationships, BrowsableEntity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private FabricType origin;
    private String description;
    @Deprecated
    private GlobalTags globalTags;
    private GlobalTags tags;
    private Ownership ownership;
    private MLModelProperties properties;
    private IntendedUse intendedUse;
    private MLModelFactorPrompts factorPrompts;
    private Metrics metrics;
    private java.util.List<BaseData> evaluationData;
    private java.util.List<BaseData> trainingData;
    private QuantitativeAnalyses quantitativeAnalyses;
    private EthicalConsiderations ethicalConsiderations;
    private CaveatsAndRecommendations caveatsAndRecommendations;
    private InstitutionalMemory institutionalMemory;
    private SourceCode sourceCode;
    private Status status;
    private Cost cost;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private MLModelEditableProperties editableProperties;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;
    private VersionProperties versionProperties;

    public MLModel() {
    }

    public MLModel(String urn, EntityType type, Long lastIngested, String name, DataPlatform platform, FabricType origin, String description, GlobalTags globalTags, GlobalTags tags, Ownership ownership, MLModelProperties properties, IntendedUse intendedUse, MLModelFactorPrompts factorPrompts, Metrics metrics, java.util.List<BaseData> evaluationData, java.util.List<BaseData> trainingData, QuantitativeAnalyses quantitativeAnalyses, EthicalConsiderations ethicalConsiderations, CaveatsAndRecommendations caveatsAndRecommendations, InstitutionalMemory institutionalMemory, SourceCode sourceCode, Status status, Cost cost, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, MLModelEditableProperties editableProperties, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges, VersionProperties versionProperties) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.name = name;
        this.platform = platform;
        this.origin = origin;
        this.description = description;
        this.globalTags = globalTags;
        this.tags = tags;
        this.ownership = ownership;
        this.properties = properties;
        this.intendedUse = intendedUse;
        this.factorPrompts = factorPrompts;
        this.metrics = metrics;
        this.evaluationData = evaluationData;
        this.trainingData = trainingData;
        this.quantitativeAnalyses = quantitativeAnalyses;
        this.ethicalConsiderations = ethicalConsiderations;
        this.caveatsAndRecommendations = caveatsAndRecommendations;
        this.institutionalMemory = institutionalMemory;
        this.sourceCode = sourceCode;
        this.status = status;
        this.cost = cost;
        this.deprecation = deprecation;
        this.dataPlatformInstance = dataPlatformInstance;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.editableProperties = editableProperties;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
        this.versionProperties = versionProperties;
    }

    /**
     * The primary key of the ML model
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML model
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
     * The timestamp for the last time this entity was ingested
     */
    public Long getLastIngested() {
        return lastIngested;
    }
    /**
     * The timestamp for the last time this entity was ingested
     */
    public void setLastIngested(Long lastIngested) {
        this.lastIngested = lastIngested;
    }

    /**
     * ML model display name
     */
    public String getName() {
        return name;
    }
    /**
     * ML model display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standardized platform urn where the MLModel is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the MLModel is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Fabric type where mlmodel belongs to or where it was generated
     */
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Fabric type where mlmodel belongs to or where it was generated
     */
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Human readable description for mlmodel
     */
    public String getDescription() {
        return description;
    }
    /**
     * Human readable description for mlmodel
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, use tags field instead
The standard tags for the ML Model
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The standard tags for the ML Model
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * The standard tags for the ML Model
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The standard tags for the ML Model
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Ownership metadata of the mlmodel
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the mlmodel
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Additional read only information about the ML Model
     */
    public MLModelProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only information about the ML Model
     */
    public void setProperties(MLModelProperties properties) {
        this.properties = properties;
    }

    /**
     * Intended use of the mlmodel
     */
    public IntendedUse getIntendedUse() {
        return intendedUse;
    }
    /**
     * Intended use of the mlmodel
     */
    public void setIntendedUse(IntendedUse intendedUse) {
        this.intendedUse = intendedUse;
    }

    /**
     * Factors metadata of the mlmodel
     */
    public MLModelFactorPrompts getFactorPrompts() {
        return factorPrompts;
    }
    /**
     * Factors metadata of the mlmodel
     */
    public void setFactorPrompts(MLModelFactorPrompts factorPrompts) {
        this.factorPrompts = factorPrompts;
    }

    /**
     * Metrics metadata of the mlmodel
     */
    public Metrics getMetrics() {
        return metrics;
    }
    /**
     * Metrics metadata of the mlmodel
     */
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * Evaluation Data of the mlmodel
     */
    public java.util.List<BaseData> getEvaluationData() {
        return evaluationData;
    }
    /**
     * Evaluation Data of the mlmodel
     */
    public void setEvaluationData(java.util.List<BaseData> evaluationData) {
        this.evaluationData = evaluationData;
    }

    /**
     * Training Data of the mlmodel
     */
    public java.util.List<BaseData> getTrainingData() {
        return trainingData;
    }
    /**
     * Training Data of the mlmodel
     */
    public void setTrainingData(java.util.List<BaseData> trainingData) {
        this.trainingData = trainingData;
    }

    /**
     * Quantitative Analyses of the mlmodel
     */
    public QuantitativeAnalyses getQuantitativeAnalyses() {
        return quantitativeAnalyses;
    }
    /**
     * Quantitative Analyses of the mlmodel
     */
    public void setQuantitativeAnalyses(QuantitativeAnalyses quantitativeAnalyses) {
        this.quantitativeAnalyses = quantitativeAnalyses;
    }

    /**
     * Ethical Considerations of the mlmodel
     */
    public EthicalConsiderations getEthicalConsiderations() {
        return ethicalConsiderations;
    }
    /**
     * Ethical Considerations of the mlmodel
     */
    public void setEthicalConsiderations(EthicalConsiderations ethicalConsiderations) {
        this.ethicalConsiderations = ethicalConsiderations;
    }

    /**
     * Caveats and Recommendations of the mlmodel
     */
    public CaveatsAndRecommendations getCaveatsAndRecommendations() {
        return caveatsAndRecommendations;
    }
    /**
     * Caveats and Recommendations of the mlmodel
     */
    public void setCaveatsAndRecommendations(CaveatsAndRecommendations caveatsAndRecommendations) {
        this.caveatsAndRecommendations = caveatsAndRecommendations;
    }

    /**
     * References to internal resources related to the mlmodel
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the mlmodel
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Source Code
     */
    public SourceCode getSourceCode() {
        return sourceCode;
    }
    /**
     * Source Code
     */
    public void setSourceCode(SourceCode sourceCode) {
        this.sourceCode = sourceCode;
    }

    /**
     * Status metadata of the mlmodel
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the mlmodel
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Cost Aspect of the mlmodel
     */
    public Cost getCost() {
        return cost;
    }
    /**
     * Cost Aspect of the mlmodel
     */
    public void setCost(Cost cost) {
        this.cost = cost;
    }

    /**
     * Deprecation
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * Deprecation
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
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
     * Granular API for querying edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from this entity
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public EntityLineageResult getLineage() {
        return lineage;
    }
    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public void setLineage(EntityLineageResult lineage) {
        this.lineage = lineage;
    }

    /**
     * The browse paths corresponding to the ML Model. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the ML Model. If no Browse Paths have been generated before, this will be null.
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
     * The structured glossary terms associated with the entity
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the entity
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the entity
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the entity
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
     * An additional set of of read write properties
     */
    public MLModelEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLModelEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
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
     * Indicates that this entity is versioned and provides information about the version.
     */
    public VersionProperties getVersionProperties() {
        return versionProperties;
    }
    /**
     * Indicates that this entity is versioned and provides information about the version.
     */
    public void setVersionProperties(VersionProperties versionProperties) {
        this.versionProperties = versionProperties;
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
        if (lastIngested != null) {
            joiner.add("lastIngested: " + lastIngested);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (intendedUse != null) {
            joiner.add("intendedUse: " + intendedUse);
        }
        if (factorPrompts != null) {
            joiner.add("factorPrompts: " + factorPrompts);
        }
        if (metrics != null) {
            joiner.add("metrics: " + metrics);
        }
        if (evaluationData != null) {
            joiner.add("evaluationData: " + evaluationData);
        }
        if (trainingData != null) {
            joiner.add("trainingData: " + trainingData);
        }
        if (quantitativeAnalyses != null) {
            joiner.add("quantitativeAnalyses: " + quantitativeAnalyses);
        }
        if (ethicalConsiderations != null) {
            joiner.add("ethicalConsiderations: " + ethicalConsiderations);
        }
        if (caveatsAndRecommendations != null) {
            joiner.add("caveatsAndRecommendations: " + caveatsAndRecommendations);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (sourceCode != null) {
            joiner.add("sourceCode: " + sourceCode);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (cost != null) {
            joiner.add("cost: " + cost);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        if (browsePaths != null) {
            joiner.add("browsePaths: " + browsePaths);
        }
        if (browsePathV2 != null) {
            joiner.add("browsePathV2: " + browsePathV2);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
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
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (versionProperties != null) {
            joiner.add("versionProperties: " + versionProperties);
        }
        return joiner.toString();
    }

    public static MLModel.Builder builder() {
        return new MLModel.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private String name;
        private DataPlatform platform;
        private FabricType origin;
        private String description;
        private GlobalTags globalTags;
        private GlobalTags tags;
        private Ownership ownership;
        private MLModelProperties properties;
        private IntendedUse intendedUse;
        private MLModelFactorPrompts factorPrompts;
        private Metrics metrics;
        private java.util.List<BaseData> evaluationData;
        private java.util.List<BaseData> trainingData;
        private QuantitativeAnalyses quantitativeAnalyses;
        private EthicalConsiderations ethicalConsiderations;
        private CaveatsAndRecommendations caveatsAndRecommendations;
        private InstitutionalMemory institutionalMemory;
        private SourceCode sourceCode;
        private Status status;
        private Cost cost;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private MLModelEditableProperties editableProperties;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;
        private VersionProperties versionProperties;

        public Builder() {
        }

        /**
         * The primary key of the ML model
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
         * The timestamp for the last time this entity was ingested
         */
        public Builder setLastIngested(Long lastIngested) {
            this.lastIngested = lastIngested;
            return this;
        }

        /**
         * ML model display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Standardized platform urn where the MLModel is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Fabric type where mlmodel belongs to or where it was generated
         */
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Human readable description for mlmodel
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The standard tags for the ML Model
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * The standard tags for the ML Model
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Ownership metadata of the mlmodel
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Additional read only information about the ML Model
         */
        public Builder setProperties(MLModelProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Intended use of the mlmodel
         */
        public Builder setIntendedUse(IntendedUse intendedUse) {
            this.intendedUse = intendedUse;
            return this;
        }

        /**
         * Factors metadata of the mlmodel
         */
        public Builder setFactorPrompts(MLModelFactorPrompts factorPrompts) {
            this.factorPrompts = factorPrompts;
            return this;
        }

        /**
         * Metrics metadata of the mlmodel
         */
        public Builder setMetrics(Metrics metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * Evaluation Data of the mlmodel
         */
        public Builder setEvaluationData(java.util.List<BaseData> evaluationData) {
            this.evaluationData = evaluationData;
            return this;
        }

        /**
         * Training Data of the mlmodel
         */
        public Builder setTrainingData(java.util.List<BaseData> trainingData) {
            this.trainingData = trainingData;
            return this;
        }

        /**
         * Quantitative Analyses of the mlmodel
         */
        public Builder setQuantitativeAnalyses(QuantitativeAnalyses quantitativeAnalyses) {
            this.quantitativeAnalyses = quantitativeAnalyses;
            return this;
        }

        /**
         * Ethical Considerations of the mlmodel
         */
        public Builder setEthicalConsiderations(EthicalConsiderations ethicalConsiderations) {
            this.ethicalConsiderations = ethicalConsiderations;
            return this;
        }

        /**
         * Caveats and Recommendations of the mlmodel
         */
        public Builder setCaveatsAndRecommendations(CaveatsAndRecommendations caveatsAndRecommendations) {
            this.caveatsAndRecommendations = caveatsAndRecommendations;
            return this;
        }

        /**
         * References to internal resources related to the mlmodel
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Source Code
         */
        public Builder setSourceCode(SourceCode sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }

        /**
         * Status metadata of the mlmodel
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Cost Aspect of the mlmodel
         */
        public Builder setCost(Cost cost) {
            this.cost = cost;
            return this;
        }

        /**
         * Deprecation
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
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
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Edges extending from this entity grouped by direction in the lineage graph
         */
        public Builder setLineage(EntityLineageResult lineage) {
            this.lineage = lineage;
            return this;
        }

        /**
         * The browse paths corresponding to the ML Model. If no Browse Paths have been generated before, this will be null.
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
         * The structured glossary terms associated with the entity
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the entity
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
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(MLModelEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
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
         * Privileges given to a user relevant to this entity
         */
        public Builder setPrivileges(EntityPrivileges privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Indicates that this entity is versioned and provides information about the version.
         */
        public Builder setVersionProperties(VersionProperties versionProperties) {
            this.versionProperties = versionProperties;
            return this;
        }


        public MLModel build() {
            return new MLModel(urn, type, lastIngested, name, platform, origin, description, globalTags, tags, ownership, properties, intendedUse, factorPrompts, metrics, evaluationData, trainingData, quantitativeAnalyses, ethicalConsiderations, caveatsAndRecommendations, institutionalMemory, sourceCode, status, cost, deprecation, dataPlatformInstance, relationships, lineage, browsePaths, browsePathV2, glossaryTerms, domain, application, editableProperties, exists, aspects, structuredProperties, forms, privileges, versionProperties);
        }

    }
}
