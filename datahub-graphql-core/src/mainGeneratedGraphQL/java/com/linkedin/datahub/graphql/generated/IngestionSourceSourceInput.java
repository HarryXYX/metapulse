package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for specifying ingestion source source information
 */
public class IngestionSourceSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IngestionSourceSourceType type;

    public IngestionSourceSourceInput() {
    }

    public IngestionSourceSourceInput(IngestionSourceSourceType type) {
        this.type = type;
    }

    public IngestionSourceSourceType getType() {
        return type;
    }
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

    public static IngestionSourceSourceInput.Builder builder() {
        return new IngestionSourceSourceInput.Builder();
    }

    public static class Builder {

        private IngestionSourceSourceType type;

        public Builder() {
        }

        public Builder setType(IngestionSourceSourceType type) {
            this.type = type;
            return this;
        }


        public IngestionSourceSourceInput build() {
            return new IngestionSourceSourceInput(type);
        }

    }
}
