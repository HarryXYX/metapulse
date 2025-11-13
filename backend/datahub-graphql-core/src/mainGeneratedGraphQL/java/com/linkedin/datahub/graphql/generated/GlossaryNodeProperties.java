package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only properties about a Glossary Node
 */
public class GlossaryNodeProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private ResolvedAuditStamp createdOn;

    public GlossaryNodeProperties() {
    }

    public GlossaryNodeProperties(String name, String description, java.util.List<CustomPropertiesEntry> customProperties, ResolvedAuditStamp createdOn) {
        this.name = name;
        this.description = description;
        this.customProperties = customProperties;
        this.createdOn = createdOn;
    }

    /**
     * The name of the Glossary Term
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Glossary Term
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the glossary term
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the glossary term
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Custom properties of the Glossary Node
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Glossary Node
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (createdOn != null) {
            joiner.add("createdOn: " + createdOn);
        }
        return joiner.toString();
    }

    public static GlossaryNodeProperties.Builder builder() {
        return new GlossaryNodeProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private ResolvedAuditStamp createdOn;

        public Builder() {
        }

        /**
         * The name of the Glossary Term
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the glossary term
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Custom properties of the Glossary Node
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * A Resolved Audit Stamp corresponding to the creation of this resource
         */
        public Builder setCreatedOn(ResolvedAuditStamp createdOn) {
            this.createdOn = createdOn;
            return this;
        }


        public GlossaryNodeProperties build() {
            return new GlossaryNodeProperties(name, description, customProperties, createdOn);
        }

    }
}
