package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An incident represents an active issue on a data asset.
 */
public class Incident implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private IncidentType incidentType;
    private String customType;
    private String title;
    private String description;
    @javax.annotation.Nonnull
    private IncidentStatus incidentStatus;
    @javax.annotation.Nonnull
    private IncidentStatus status;
    private IncidentPriority priority;
    private java.util.List<OwnerType> assignees;
    @javax.annotation.Nonnull
    private Entity entity;
    private IncidentSource source;
    private Long startedAt;
    @javax.annotation.Nonnull
    private AuditStamp created;
    private GlobalTags tags;
    private EntityRelationshipsResult relationships;

    public Incident() {
    }

    public Incident(String urn, EntityType type, IncidentType incidentType, String customType, String title, String description, IncidentStatus incidentStatus, IncidentStatus status, IncidentPriority priority, java.util.List<OwnerType> assignees, Entity entity, IncidentSource source, Long startedAt, AuditStamp created, GlobalTags tags, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.incidentType = incidentType;
        this.customType = customType;
        this.title = title;
        this.description = description;
        this.incidentStatus = incidentStatus;
        this.status = status;
        this.priority = priority;
        this.assignees = assignees;
        this.entity = entity;
        this.source = source;
        this.startedAt = startedAt;
        this.created = created;
        this.tags = tags;
        this.relationships = relationships;
    }

    /**
     * The primary key of the Incident
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Incident
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
     * The type of incident
     */
    public IncidentType getIncidentType() {
        return incidentType;
    }
    /**
     * The type of incident
     */
    public void setIncidentType(IncidentType incidentType) {
        this.incidentType = incidentType;
    }

    /**
     * A custom type of incident. Present only if type is 'CUSTOM'
     */
    public String getCustomType() {
        return customType;
    }
    /**
     * A custom type of incident. Present only if type is 'CUSTOM'
     */
    public void setCustomType(String customType) {
        this.customType = customType;
    }

    /**
     * An optional title associated with the incident
     */
    public String getTitle() {
        return title;
    }
    /**
     * An optional title associated with the incident
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * An optional description associated with the incident
     */
    public String getDescription() {
        return description;
    }
    /**
     * An optional description associated with the incident
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The status of an incident
     */
    public IncidentStatus getIncidentStatus() {
        return incidentStatus;
    }
    /**
     * The status of an incident
     */
    public void setIncidentStatus(IncidentStatus incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    /**
     * The status of an incident
@deprecated, use incidentStatus instead
     */
    public IncidentStatus getStatus() {
        return status;
    }
    /**
     * The status of an incident
@deprecated, use incidentStatus instead
     */
    public void setStatus(IncidentStatus status) {
        this.status = status;
    }

    /**
     * Optional priority of the incident.
     */
    public IncidentPriority getPriority() {
        return priority;
    }
    /**
     * Optional priority of the incident.
     */
    public void setPriority(IncidentPriority priority) {
        this.priority = priority;
    }

    /**
     * The users or groups are assigned to resolve the incident
     */
    public java.util.List<OwnerType> getAssignees() {
        return assignees;
    }
    /**
     * The users or groups are assigned to resolve the incident
     */
    public void setAssignees(java.util.List<OwnerType> assignees) {
        this.assignees = assignees;
    }

    /**
     * The entity that the incident is associated with.
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * The entity that the incident is associated with.
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * The source of the incident, i.e. how it was generated
     */
    public IncidentSource getSource() {
        return source;
    }
    /**
     * The source of the incident, i.e. how it was generated
     */
    public void setSource(IncidentSource source) {
        this.source = source;
    }

    /**
     * An optional time at which the incident actually started (may be before the date it was raised).
     */
    public Long getStartedAt() {
        return startedAt;
    }
    /**
     * An optional time at which the incident actually started (may be before the date it was raised).
     */
    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * The time at which the incident was initially created
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * The time at which the incident was initially created
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * The standard tags for the Incident
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The standard tags for the Incident
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
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
        if (incidentType != null) {
            joiner.add("incidentType: " + incidentType);
        }
        if (customType != null) {
            joiner.add("customType: \"" + customType + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (incidentStatus != null) {
            joiner.add("incidentStatus: " + incidentStatus);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (priority != null) {
            joiner.add("priority: " + priority);
        }
        if (assignees != null) {
            joiner.add("assignees: " + assignees);
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (startedAt != null) {
            joiner.add("startedAt: " + startedAt);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static Incident.Builder builder() {
        return new Incident.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private IncidentType incidentType;
        private String customType;
        private String title;
        private String description;
        private IncidentStatus incidentStatus;
        private IncidentStatus status;
        private IncidentPriority priority;
        private java.util.List<OwnerType> assignees;
        private Entity entity;
        private IncidentSource source;
        private Long startedAt;
        private AuditStamp created;
        private GlobalTags tags;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * The primary key of the Incident
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
         * The type of incident
         */
        public Builder setIncidentType(IncidentType incidentType) {
            this.incidentType = incidentType;
            return this;
        }

        /**
         * A custom type of incident. Present only if type is 'CUSTOM'
         */
        public Builder setCustomType(String customType) {
            this.customType = customType;
            return this;
        }

        /**
         * An optional title associated with the incident
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * An optional description associated with the incident
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The status of an incident
         */
        public Builder setIncidentStatus(IncidentStatus incidentStatus) {
            this.incidentStatus = incidentStatus;
            return this;
        }

        /**
         * The status of an incident
@deprecated, use incidentStatus instead
         */
        public Builder setStatus(IncidentStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Optional priority of the incident.
         */
        public Builder setPriority(IncidentPriority priority) {
            this.priority = priority;
            return this;
        }

        /**
         * The users or groups are assigned to resolve the incident
         */
        public Builder setAssignees(java.util.List<OwnerType> assignees) {
            this.assignees = assignees;
            return this;
        }

        /**
         * The entity that the incident is associated with.
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * The source of the incident, i.e. how it was generated
         */
        public Builder setSource(IncidentSource source) {
            this.source = source;
            return this;
        }

        /**
         * An optional time at which the incident actually started (may be before the date it was raised).
         */
        public Builder setStartedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * The time at which the incident was initially created
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * The standard tags for the Incident
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * List of relationships between the source Entity and some destination entities with a given types
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public Incident build() {
            return new Incident(urn, type, incidentType, customType, title, description, incidentStatus, status, priority, assignees, entity, source, startedAt, created, tags, relationships);
        }

    }
}
