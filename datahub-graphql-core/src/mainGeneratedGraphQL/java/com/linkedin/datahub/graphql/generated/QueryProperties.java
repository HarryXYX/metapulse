package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an individual Query
 */
public class QueryProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private QueryStatement statement;
    @javax.annotation.Nonnull
    private QuerySource source;
    private String name;
    private String description;
    @javax.annotation.Nonnull
    private AuditStamp created;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp createdOn;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    private Entity origin;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public QueryProperties() {
    }

    public QueryProperties(QueryStatement statement, QuerySource source, String name, String description, AuditStamp created, ResolvedAuditStamp createdOn, AuditStamp lastModified, Entity origin, java.util.List<CustomPropertiesEntry> customProperties) {
        this.statement = statement;
        this.source = source;
        this.name = name;
        this.description = description;
        this.created = created;
        this.createdOn = createdOn;
        this.lastModified = lastModified;
        this.origin = origin;
        this.customProperties = customProperties;
    }

    /**
     * The Query statement itself
     */
    public QueryStatement getStatement() {
        return statement;
    }
    /**
     * The Query statement itself
     */
    public void setStatement(QueryStatement statement) {
        this.statement = statement;
    }

    /**
     * The source of the Query
     */
    public QuerySource getSource() {
        return source;
    }
    /**
     * The source of the Query
     */
    public void setSource(QuerySource source) {
        this.source = source;
    }

    /**
     * The name of the Query
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Query
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the Query
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the Query
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An Audit Stamp corresponding to the creation of this resource
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An Audit Stamp corresponding to the creation of this resource
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * A Resolved Audit Stamp corresponding to the creation of this resource
     */
    public ResolvedAuditStamp getCreatedOn() {
        return createdOn;
    }
    /**
     * A Resolved Audit Stamp corresponding to the creation of this resource
     */
    public void setCreatedOn(ResolvedAuditStamp createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * An Audit Stamp corresponding to the update of this resource
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An Audit Stamp corresponding to the update of this resource
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * The asset that this query originated from, e.g. a View, a dbt Model, etc.
     */
    public Entity getOrigin() {
        return origin;
    }
    /**
     * The asset that this query originated from, e.g. a View, a dbt Model, etc.
     */
    public void setOrigin(Entity origin) {
        this.origin = origin;
    }

    /**
     * Custom properties of the Data Product
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Data Product
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (statement != null) {
            joiner.add("statement: " + statement);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (createdOn != null) {
            joiner.add("createdOn: " + createdOn);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static QueryProperties.Builder builder() {
        return new QueryProperties.Builder();
    }

    public static class Builder {

        private QueryStatement statement;
        private QuerySource source;
        private String name;
        private String description;
        private AuditStamp created;
        private ResolvedAuditStamp createdOn;
        private AuditStamp lastModified;
        private Entity origin;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        /**
         * The Query statement itself
         */
        public Builder setStatement(QueryStatement statement) {
            this.statement = statement;
            return this;
        }

        /**
         * The source of the Query
         */
        public Builder setSource(QuerySource source) {
            this.source = source;
            return this;
        }

        /**
         * The name of the Query
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The description of the Query
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * An Audit Stamp corresponding to the creation of this resource
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * A Resolved Audit Stamp corresponding to the creation of this resource
         */
        public Builder setCreatedOn(ResolvedAuditStamp createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * An Audit Stamp corresponding to the update of this resource
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * The asset that this query originated from, e.g. a View, a dbt Model, etc.
         */
        public Builder setOrigin(Entity origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Custom properties of the Data Product
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public QueryProperties build() {
            return new QueryProperties(statement, source, name, description, created, createdOn, lastModified, origin, customProperties);
        }

    }
}
