package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An entry in an structured properties list represented as a tuple
 */
public class StructuredPropertiesEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private StructuredPropertyEntity structuredProperty;
    @javax.annotation.Nonnull
    private java.util.List<PropertyValue> values;
    private java.util.List<Entity> valueEntities;
    @javax.annotation.Nonnull
    private String associatedUrn;
    private MetadataAttribution attribution;

    public StructuredPropertiesEntry() {
    }

    public StructuredPropertiesEntry(StructuredPropertyEntity structuredProperty, java.util.List<PropertyValue> values, java.util.List<Entity> valueEntities, String associatedUrn, MetadataAttribution attribution) {
        this.structuredProperty = structuredProperty;
        this.values = values;
        this.valueEntities = valueEntities;
        this.associatedUrn = associatedUrn;
        this.attribution = attribution;
    }

    /**
     * The key of the map entry
     */
    public StructuredPropertyEntity getStructuredProperty() {
        return structuredProperty;
    }
    /**
     * The key of the map entry
     */
    public void setStructuredProperty(StructuredPropertyEntity structuredProperty) {
        this.structuredProperty = structuredProperty;
    }

    /**
     * The values of the structured property for this entity
     */
    public java.util.List<PropertyValue> getValues() {
        return values;
    }
    /**
     * The values of the structured property for this entity
     */
    public void setValues(java.util.List<PropertyValue> values) {
        this.values = values;
    }

    /**
     * The optional entities associated with the values if the values are entity urns
     */
    public java.util.List<Entity> getValueEntities() {
        return valueEntities;
    }
    /**
     * The optional entities associated with the values if the values are entity urns
     */
    public void setValueEntities(java.util.List<Entity> valueEntities) {
        this.valueEntities = valueEntities;
    }

    /**
     * The urn of the entity this property came from for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * The urn of the entity this property came from for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }

    /**
     * Information about who, why, and how this metadata was applied
     */
    public MetadataAttribution getAttribution() {
        return attribution;
    }
    /**
     * Information about who, why, and how this metadata was applied
     */
    public void setAttribution(MetadataAttribution attribution) {
        this.attribution = attribution;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (structuredProperty != null) {
            joiner.add("structuredProperty: " + structuredProperty);
        }
        if (values != null) {
            joiner.add("values: " + values);
        }
        if (valueEntities != null) {
            joiner.add("valueEntities: " + valueEntities);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        if (attribution != null) {
            joiner.add("attribution: " + attribution);
        }
        return joiner.toString();
    }

    public static StructuredPropertiesEntry.Builder builder() {
        return new StructuredPropertiesEntry.Builder();
    }

    public static class Builder {

        private StructuredPropertyEntity structuredProperty;
        private java.util.List<PropertyValue> values;
        private java.util.List<Entity> valueEntities;
        private String associatedUrn;
        private MetadataAttribution attribution;

        public Builder() {
        }

        /**
         * The key of the map entry
         */
        public Builder setStructuredProperty(StructuredPropertyEntity structuredProperty) {
            this.structuredProperty = structuredProperty;
            return this;
        }

        /**
         * The values of the structured property for this entity
         */
        public Builder setValues(java.util.List<PropertyValue> values) {
            this.values = values;
            return this;
        }

        /**
         * The optional entities associated with the values if the values are entity urns
         */
        public Builder setValueEntities(java.util.List<Entity> valueEntities) {
            this.valueEntities = valueEntities;
            return this;
        }

        /**
         * The urn of the entity this property came from for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         */
        public Builder setAttribution(MetadataAttribution attribution) {
            this.attribution = attribution;
            return this;
        }


        public StructuredPropertiesEntry build() {
            return new StructuredPropertiesEntry(structuredProperty, values, valueEntities, associatedUrn, attribution);
        }

    }
}
