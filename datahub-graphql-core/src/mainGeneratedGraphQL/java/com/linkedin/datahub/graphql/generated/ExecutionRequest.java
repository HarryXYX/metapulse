package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Retrieve an ingestion execution request
 */
public class ExecutionRequest implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private ExecutionRequestInput input;
    private ExecutionRequestResult result;
    private IngestionSource source;
    private EntityRelationshipsResult relationships;

    public ExecutionRequest() {
    }

    public ExecutionRequest(String urn, EntityType type, String id, ExecutionRequestInput input, ExecutionRequestResult result, IngestionSource source, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.id = id;
        this.input = input;
        this.result = result;
        this.source = source;
        this.relationships = relationships;
    }

    /**
     * Urn of the execution request
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the execution request
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
     * Unique id for the execution request
     */
    public String getId() {
        return id;
    }
    /**
     * Unique id for the execution request
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Input provided when creating the Execution Request
     */
    public ExecutionRequestInput getInput() {
        return input;
    }
    /**
     * Input provided when creating the Execution Request
     */
    public void setInput(ExecutionRequestInput input) {
        this.input = input;
    }

    /**
     * Result of the execution request
     */
    public ExecutionRequestResult getResult() {
        return result;
    }
    /**
     * Result of the execution request
     */
    public void setResult(ExecutionRequestResult result) {
        this.result = result;
    }

    /**
     * The ingestion source of this execution request
     */
    public IngestionSource getSource() {
        return source;
    }
    /**
     * The ingestion source of this execution request
     */
    public void setSource(IngestionSource source) {
        this.source = source;
    }

    /**
     * Unused for execution requests
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Unused for execution requests
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
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (input != null) {
            joiner.add("input: " + input);
        }
        if (result != null) {
            joiner.add("result: " + result);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static ExecutionRequest.Builder builder() {
        return new ExecutionRequest.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String id;
        private ExecutionRequestInput input;
        private ExecutionRequestResult result;
        private IngestionSource source;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * Urn of the execution request
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
         * Unique id for the execution request
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Input provided when creating the Execution Request
         */
        public Builder setInput(ExecutionRequestInput input) {
            this.input = input;
            return this;
        }

        /**
         * Result of the execution request
         */
        public Builder setResult(ExecutionRequestResult result) {
            this.result = result;
            return this;
        }

        /**
         * The ingestion source of this execution request
         */
        public Builder setSource(IngestionSource source) {
            this.source = source;
            return this;
        }

        /**
         * Unused for execution requests
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public ExecutionRequest build() {
            return new ExecutionRequest(urn, type, id, input, result, source, relationships);
        }

    }
}
