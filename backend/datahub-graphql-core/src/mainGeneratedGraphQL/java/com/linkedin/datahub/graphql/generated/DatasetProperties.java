package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only properties about a Dataset
 */
public class DatasetProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String qualifiedName;
    @javax.annotation.Nonnull
    private FabricType origin;
    private String description;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private String externalUrl;
    private Long created;
    private String createdActor;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    @Deprecated
    private String lastModifiedActor;

    public DatasetProperties() {
    }

    public DatasetProperties(String name, String qualifiedName, FabricType origin, String description, java.util.List<CustomPropertiesEntry> customProperties, String externalUrl, Long created, String createdActor, AuditStamp lastModified, String lastModifiedActor) {
        this.name = name;
        this.qualifiedName = qualifiedName;
        this.origin = origin;
        this.description = description;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
        this.created = created;
        this.createdActor = createdActor;
        this.lastModified = lastModified;
        this.lastModifiedActor = lastModifiedActor;
    }

    /**
     * The name of the dataset used in display
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the dataset used in display
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Fully-qualified name of the Dataset
     */
    public String getQualifiedName() {
        return qualifiedName;
    }
    /**
     * Fully-qualified name of the Dataset
     */
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    /**
     * Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Read only technical description for dataset
     */
    public String getDescription() {
        return description;
    }
    /**
     * Read only technical description for dataset
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Custom properties of the Dataset
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Dataset
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * External URL associated with the Dataset
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL associated with the Dataset
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Created timestamp millis associated with the Dataset
     */
    public Long getCreated() {
        return created;
    }
    /**
     * Created timestamp millis associated with the Dataset
     */
    public void setCreated(Long created) {
        this.created = created;
    }

    /**
     * Actor associated with the Dataset's created timestamp
     */
    public String getCreatedActor() {
        return createdActor;
    }
    /**
     * Actor associated with the Dataset's created timestamp
     */
    public void setCreatedActor(String createdActor) {
        this.createdActor = createdActor;
    }

    /**
     * Last Modified timestamp millis associated with the Dataset
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * Last Modified timestamp millis associated with the Dataset
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Actor associated with the Dataset's lastModified timestamp.
Deprecated - Use lastModified.actor instead.
     */
    @Deprecated
    public String getLastModifiedActor() {
        return lastModifiedActor;
    }
    /**
     * Actor associated with the Dataset's lastModified timestamp.
Deprecated - Use lastModified.actor instead.
     */
    @Deprecated
    public void setLastModifiedActor(String lastModifiedActor) {
        this.lastModifiedActor = lastModifiedActor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (qualifiedName != null) {
            joiner.add("qualifiedName: \"" + qualifiedName + "\"");
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (createdActor != null) {
            joiner.add("createdActor: \"" + createdActor + "\"");
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (lastModifiedActor != null) {
            joiner.add("lastModifiedActor: \"" + lastModifiedActor + "\"");
        }
        return joiner.toString();
    }

    public static DatasetProperties.Builder builder() {
        return new DatasetProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String qualifiedName;
        private FabricType origin;
        private String description;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private String externalUrl;
        private Long created;
        private String createdActor;
        private AuditStamp lastModified;
        private String lastModifiedActor;

        public Builder() {
        }

        /**
         * The name of the dataset used in display
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Fully-qualified name of the Dataset
         */
        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
         */
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Read only technical description for dataset
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Custom properties of the Dataset
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * External URL associated with the Dataset
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Created timestamp millis associated with the Dataset
         */
        public Builder setCreated(Long created) {
            this.created = created;
            return this;
        }

        /**
         * Actor associated with the Dataset's created timestamp
         */
        public Builder setCreatedActor(String createdActor) {
            this.createdActor = createdActor;
            return this;
        }

        /**
         * Last Modified timestamp millis associated with the Dataset
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Actor associated with the Dataset's lastModified timestamp.
Deprecated - Use lastModified.actor instead.
         */
        @Deprecated
        public Builder setLastModifiedActor(String lastModifiedActor) {
            this.lastModifiedActor = lastModifiedActor;
            return this;
        }


        public DatasetProperties build() {
            return new DatasetProperties(name, qualifiedName, origin, description, customProperties, externalUrl, created, createdActor, lastModified, lastModifiedActor);
        }

    }
}
