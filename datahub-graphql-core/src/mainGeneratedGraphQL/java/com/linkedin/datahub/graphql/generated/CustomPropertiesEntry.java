package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An entry in a custom properties map represented as a tuple
 */
public class CustomPropertiesEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String key;
    private String value;
    @javax.annotation.Nonnull
    private String associatedUrn;

    public CustomPropertiesEntry() {
    }

    public CustomPropertiesEntry(String key, String value, String associatedUrn) {
        this.key = key;
        this.value = value;
        this.associatedUrn = associatedUrn;
    }

    /**
     * The key of the map entry
     */
    public String getKey() {
        return key;
    }
    /**
     * The key of the map entry
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * The value fo the map entry
     */
    public String getValue() {
        return value;
    }
    /**
     * The value fo the map entry
     */
    public void setValue(String value) {
        this.value = value;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (key != null) {
            joiner.add("key: \"" + key + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        return joiner.toString();
    }

    public static CustomPropertiesEntry.Builder builder() {
        return new CustomPropertiesEntry.Builder();
    }

    public static class Builder {

        private String key;
        private String value;
        private String associatedUrn;

        public Builder() {
        }

        /**
         * The key of the map entry
         */
        public Builder setKey(String key) {
            this.key = key;
            return this;
        }

        /**
         * The value fo the map entry
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * The urn of the entity this property came from for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }


        public CustomPropertiesEntry build() {
            return new CustomPropertiesEntry(key, value, associatedUrn);
        }

    }
}
