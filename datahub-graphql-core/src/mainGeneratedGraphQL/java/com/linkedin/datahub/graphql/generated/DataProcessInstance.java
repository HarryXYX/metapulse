package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A DataProcessInstance Metadata Entity, representing an individual run of
a task or datajob.
 */
public class DataProcessInstance implements java.io.Serializable, Entity, EntityWithRelationships {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Boolean exists;
    private Status status;
    private java.util.List<DataProcessRunEvent> state;
    @Deprecated
    private AuditStamp created;
    @Deprecated
    private String name;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private String externalUrl;
    private DataProcessInstanceProperties properties;
    private DataPlatformInstance dataPlatformInstance;
    private SubTypes subTypes;
    private Container container;
    private DataPlatform platform;
    private ParentContainersResult parentContainers;
    private MLTrainingRunProperties mlTrainingRunProperties;
    private Entity parentTemplate;

    public DataProcessInstance() {
    }

    public DataProcessInstance(String urn, EntityType type, Boolean exists, Status status, java.util.List<DataProcessRunEvent> state, AuditStamp created, String name, EntityRelationshipsResult relationships, EntityLineageResult lineage, String externalUrl, DataProcessInstanceProperties properties, DataPlatformInstance dataPlatformInstance, SubTypes subTypes, Container container, DataPlatform platform, ParentContainersResult parentContainers, MLTrainingRunProperties mlTrainingRunProperties, Entity parentTemplate) {
        this.urn = urn;
        this.type = type;
        this.exists = exists;
        this.status = status;
        this.state = state;
        this.created = created;
        this.name = name;
        this.relationships = relationships;
        this.lineage = lineage;
        this.externalUrl = externalUrl;
        this.properties = properties;
        this.dataPlatformInstance = dataPlatformInstance;
        this.subTypes = subTypes;
        this.container = container;
        this.platform = platform;
        this.parentContainers = parentContainers;
        this.mlTrainingRunProperties = mlTrainingRunProperties;
        this.parentTemplate = parentTemplate;
    }

    /**
     * The primary key of the DataProcessInstance
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the DataProcessInstance
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
     * Status metadata of the data process instance
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the data process instance
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The history of state changes for the run
     */
    public java.util.List<DataProcessRunEvent> getState() {
        return state;
    }
    /**
     * The history of state changes for the run
     */
    public void setState(java.util.List<DataProcessRunEvent> state) {
        this.state = state;
    }

    /**
     * When the run was kicked off
     */
    @Deprecated
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * When the run was kicked off
     */
    @Deprecated
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * The name of the data process
     */
    @Deprecated
    public String getName() {
        return name;
    }
    /**
     * The name of the data process
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Edges extending from this entity.
In the UI, used for inputs, outputs and parentTemplate
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Edges extending from this entity.
In the UI, used for inputs, outputs and parentTemplate
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
     * The link to view the task run in the source system
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * The link to view the task run in the source system
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Additional read only properties associated with the Data Process Instance
     */
    public DataProcessInstanceProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with the Data Process Instance
     */
    public void setProperties(DataProcessInstanceProperties properties) {
        this.properties = properties;
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
     * The parent container in which the entity resides
     */
    public Container getContainer() {
        return container;
    }
    /**
     * The parent container in which the entity resides
     */
    public void setContainer(Container container) {
        this.container = container;
    }

    /**
     * Standardized platform urn where the data process instance is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the data process instance is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Recursively get the lineage of containers for this entity
     */
    public ParentContainersResult getParentContainers() {
        return parentContainers;
    }
    /**
     * Recursively get the lineage of containers for this entity
     */
    public void setParentContainers(ParentContainersResult parentContainers) {
        this.parentContainers = parentContainers;
    }

    /**
     * Additional properties when subtype is Training Run
     */
    public MLTrainingRunProperties getMlTrainingRunProperties() {
        return mlTrainingRunProperties;
    }
    /**
     * Additional properties when subtype is Training Run
     */
    public void setMlTrainingRunProperties(MLTrainingRunProperties mlTrainingRunProperties) {
        this.mlTrainingRunProperties = mlTrainingRunProperties;
    }

    /**
     * The parent entity whose run instance it is
     */
    public Entity getParentTemplate() {
        return parentTemplate;
    }
    /**
     * The parent entity whose run instance it is
     */
    public void setParentTemplate(Entity parentTemplate) {
        this.parentTemplate = parentTemplate;
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
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (state != null) {
            joiner.add("state: " + state);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (container != null) {
            joiner.add("container: " + container);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (parentContainers != null) {
            joiner.add("parentContainers: " + parentContainers);
        }
        if (mlTrainingRunProperties != null) {
            joiner.add("mlTrainingRunProperties: " + mlTrainingRunProperties);
        }
        if (parentTemplate != null) {
            joiner.add("parentTemplate: " + parentTemplate);
        }
        return joiner.toString();
    }

    public static DataProcessInstance.Builder builder() {
        return new DataProcessInstance.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Boolean exists;
        private Status status;
        private java.util.List<DataProcessRunEvent> state;
        private AuditStamp created;
        private String name;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private String externalUrl;
        private DataProcessInstanceProperties properties;
        private DataPlatformInstance dataPlatformInstance;
        private SubTypes subTypes;
        private Container container;
        private DataPlatform platform;
        private ParentContainersResult parentContainers;
        private MLTrainingRunProperties mlTrainingRunProperties;
        private Entity parentTemplate;

        public Builder() {
        }

        /**
         * The primary key of the DataProcessInstance
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
         * Whether or not this entity exists on DataHub
         */
        public Builder setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * Status metadata of the data process instance
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The history of state changes for the run
         */
        public Builder setState(java.util.List<DataProcessRunEvent> state) {
            this.state = state;
            return this;
        }

        /**
         * When the run was kicked off
         */
        @Deprecated
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * The name of the data process
         */
        @Deprecated
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Edges extending from this entity.
In the UI, used for inputs, outputs and parentTemplate
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
         * The link to view the task run in the source system
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Additional read only properties associated with the Data Process Instance
         */
        public Builder setProperties(DataProcessInstanceProperties properties) {
            this.properties = properties;
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
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * The parent container in which the entity resides
         */
        public Builder setContainer(Container container) {
            this.container = container;
            return this;
        }

        /**
         * Standardized platform urn where the data process instance is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Recursively get the lineage of containers for this entity
         */
        public Builder setParentContainers(ParentContainersResult parentContainers) {
            this.parentContainers = parentContainers;
            return this;
        }

        /**
         * Additional properties when subtype is Training Run
         */
        public Builder setMlTrainingRunProperties(MLTrainingRunProperties mlTrainingRunProperties) {
            this.mlTrainingRunProperties = mlTrainingRunProperties;
            return this;
        }

        /**
         * The parent entity whose run instance it is
         */
        public Builder setParentTemplate(Entity parentTemplate) {
            this.parentTemplate = parentTemplate;
            return this;
        }


        public DataProcessInstance build() {
            return new DataProcessInstance(urn, type, exists, status, state, created, name, relationships, lineage, externalUrl, properties, dataPlatformInstance, subTypes, container, platform, parentContainers, mlTrainingRunProperties, parentTemplate);
        }

    }
}
