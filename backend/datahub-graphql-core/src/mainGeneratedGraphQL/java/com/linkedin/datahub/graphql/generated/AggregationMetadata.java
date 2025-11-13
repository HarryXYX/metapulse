package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about the aggregation that can be used for filtering, included the field value and number of results
 */
public class AggregationMetadata implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String value;
    @javax.annotation.Nonnull
    private Long count;
    private Entity entity;
    private String displayName;

    public AggregationMetadata() {
    }

    public AggregationMetadata(String value, Long count, Entity entity, String displayName) {
        this.value = value;
        this.count = count;
        this.entity = entity;
        this.displayName = displayName;
    }

    /**
     * A particular value of a facet field
     */
    public String getValue() {
        return value;
    }
    /**
     * A particular value of a facet field
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The number of search results containing the value
     */
    public Long getCount() {
        return count;
    }
    /**
     * The number of search results containing the value
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * Entity corresponding to the facet field
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity corresponding to the facet field
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Optional display name to show in the UI for this filter value
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Optional display name to show in the UI for this filter value
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        return joiner.toString();
    }

    public static AggregationMetadata.Builder builder() {
        return new AggregationMetadata.Builder();
    }

    public static class Builder {

        private String value;
        private Long count;
        private Entity entity;
        private String displayName;

        public Builder() {
        }

        /**
         * A particular value of a facet field
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * The number of search results containing the value
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }

        /**
         * Entity corresponding to the facet field
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Optional display name to show in the UI for this filter value
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        public AggregationMetadata build() {
            return new AggregationMetadata(value, count, entity, displayName);
        }

    }
}
