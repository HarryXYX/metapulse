package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An assertion represents a programmatic validation, check, or test performed periodically against another Entity.
 */
public class Assertion implements java.io.Serializable, Entity, EntityWithRelationships {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private AssertionInfo info;
    private DataPlatformInstance dataPlatformInstance;
    private AssertionRunEventsResult runEvents;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private Status status;
    private GlobalTags tags;
    private java.util.List<RawAspect> aspects;
    private AssertionActions actions;

    public Assertion() {
    }

    public Assertion(String urn, EntityType type, DataPlatform platform, AssertionInfo info, DataPlatformInstance dataPlatformInstance, AssertionRunEventsResult runEvents, EntityRelationshipsResult relationships, EntityLineageResult lineage, Status status, GlobalTags tags, java.util.List<RawAspect> aspects, AssertionActions actions) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.info = info;
        this.dataPlatformInstance = dataPlatformInstance;
        this.runEvents = runEvents;
        this.relationships = relationships;
        this.lineage = lineage;
        this.status = status;
        this.tags = tags;
        this.aspects = aspects;
        this.actions = actions;
    }

    /**
     * The primary key of the Assertion
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Assertion
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
     * Standardized platform urn where the assertion is evaluated
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the assertion is evaluated
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Details about assertion
     */
    public AssertionInfo getInfo() {
        return info;
    }
    /**
     * Details about assertion
     */
    public void setInfo(AssertionInfo info) {
        this.info = info;
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
     * Lifecycle events detailing individual runs of this assertion. If startTimeMillis & endTimeMillis are not provided, the most
recent events will be returned.
     */
    public AssertionRunEventsResult getRunEvents() {
        return runEvents;
    }
    /**
     * Lifecycle events detailing individual runs of this assertion. If startTimeMillis & endTimeMillis are not provided, the most
recent events will be returned.
     */
    public void setRunEvents(AssertionRunEventsResult runEvents) {
        this.runEvents = runEvents;
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
     * Status metadata of the assertion
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the assertion
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The standard tags for the Assertion
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The standard tags for the Assertion
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Experimental API.
For fetching extra aspects that do not have custom UI code yet
     */
    public java.util.List<RawAspect> getAspects() {
        return aspects;
    }
    /**
     * Experimental API.
For fetching extra aspects that do not have custom UI code yet
     */
    public void setAspects(java.util.List<RawAspect> aspects) {
        this.aspects = aspects;
    }

    /**
     * The actions associated with the Assertion
     */
    public AssertionActions getActions() {
        return actions;
    }
    /**
     * The actions associated with the Assertion
     */
    public void setActions(AssertionActions actions) {
        this.actions = actions;
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
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (runEvents != null) {
            joiner.add("runEvents: " + runEvents);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        if (actions != null) {
            joiner.add("actions: " + actions);
        }
        return joiner.toString();
    }

    public static Assertion.Builder builder() {
        return new Assertion.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private AssertionInfo info;
        private DataPlatformInstance dataPlatformInstance;
        private AssertionRunEventsResult runEvents;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private Status status;
        private GlobalTags tags;
        private java.util.List<RawAspect> aspects;
        private AssertionActions actions;

        public Builder() {
        }

        /**
         * The primary key of the Assertion
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
         * Standardized platform urn where the assertion is evaluated
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Details about assertion
         */
        public Builder setInfo(AssertionInfo info) {
            this.info = info;
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
         * Lifecycle events detailing individual runs of this assertion. If startTimeMillis & endTimeMillis are not provided, the most
recent events will be returned.
         */
        public Builder setRunEvents(AssertionRunEventsResult runEvents) {
            this.runEvents = runEvents;
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
         * Edges extending from this entity grouped by direction in the lineage graph
         */
        public Builder setLineage(EntityLineageResult lineage) {
            this.lineage = lineage;
            return this;
        }

        /**
         * Status metadata of the assertion
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The standard tags for the Assertion
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Experimental API.
For fetching extra aspects that do not have custom UI code yet
         */
        public Builder setAspects(java.util.List<RawAspect> aspects) {
            this.aspects = aspects;
            return this;
        }

        /**
         * The actions associated with the Assertion
         */
        public Builder setActions(AssertionActions actions) {
            this.actions = actions;
            return this;
        }


        public Assertion build() {
            return new Assertion(urn, type, platform, info, dataPlatformInstance, runEvents, relationships, lineage, status, tags, aspects, actions);
        }

    }
}
