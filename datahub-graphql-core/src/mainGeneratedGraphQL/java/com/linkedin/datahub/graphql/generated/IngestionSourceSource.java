package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Source information for an ingestion source
 */
public class IngestionSourceSource implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IngestionSourceSourceType type;

    public IngestionSourceSource() {
    }

    public IngestionSourceSource(IngestionSourceSourceType type) {
        this.type = type;
    }

    /**
     * The source type of the ingestion source
     */
    public IngestionSourceSourceType getType() {
        return type;
    }
    /**
     * The source type of the ingestion source
     */
    public void setType(IngestionSourceSourceType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static IngestionSourceSource.Builder builder() {
        return new IngestionSourceSource.Builder();
    }

    public static class Builder {

        private IngestionSourceSourceType type;

        public Builder() {
        }

        /**
         * The source type of the ingestion source
         */
        public Builder setType(IngestionSourceSourceType type) {
            this.type = type;
            return this;
        }


        public IngestionSourceSource build() {
            return new IngestionSourceSource(type);
        }

    }
}
