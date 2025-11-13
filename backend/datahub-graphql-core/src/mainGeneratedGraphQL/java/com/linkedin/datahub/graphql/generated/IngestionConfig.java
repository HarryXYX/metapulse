package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A set of configurations for an Ingestion Source
 */
public class IngestionConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String recipe;
    @javax.annotation.Nonnull
    private String executorId;
    private String version;
    private Boolean debugMode;
    private java.util.List<StringMapEntry> extraArgs;

    public IngestionConfig() {
    }

    public IngestionConfig(String recipe, String executorId, String version, Boolean debugMode, java.util.List<StringMapEntry> extraArgs) {
        this.recipe = recipe;
        this.executorId = executorId;
        this.version = version;
        this.debugMode = debugMode;
        this.extraArgs = extraArgs;
    }

    /**
     * The JSON-encoded recipe to use for ingestion
     */
    public String getRecipe() {
        return recipe;
    }
    /**
     * The JSON-encoded recipe to use for ingestion
     */
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    /**
     * Advanced: The specific executor that should handle the execution request. Defaults to 'default'.
     */
    public String getExecutorId() {
        return executorId;
    }
    /**
     * Advanced: The specific executor that should handle the execution request. Defaults to 'default'.
     */
    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    /**
     * Advanced: The version of the ingestion framework to use
     */
    public String getVersion() {
        return version;
    }
    /**
     * Advanced: The version of the ingestion framework to use
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Advanced: Whether or not to run ingestion in debug mode
     */
    public Boolean getDebugMode() {
        return debugMode;
    }
    /**
     * Advanced: Whether or not to run ingestion in debug mode
     */
    public void setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
    }

    /**
     * Advanced: Extra arguments for the ingestion run.
     */
    public java.util.List<StringMapEntry> getExtraArgs() {
        return extraArgs;
    }
    /**
     * Advanced: Extra arguments for the ingestion run.
     */
    public void setExtraArgs(java.util.List<StringMapEntry> extraArgs) {
        this.extraArgs = extraArgs;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (recipe != null) {
            joiner.add("recipe: \"" + recipe + "\"");
        }
        if (executorId != null) {
            joiner.add("executorId: \"" + executorId + "\"");
        }
        if (version != null) {
            joiner.add("version: \"" + version + "\"");
        }
        if (debugMode != null) {
            joiner.add("debugMode: " + debugMode);
        }
        if (extraArgs != null) {
            joiner.add("extraArgs: " + extraArgs);
        }
        return joiner.toString();
    }

    public static IngestionConfig.Builder builder() {
        return new IngestionConfig.Builder();
    }

    public static class Builder {

        private String recipe;
        private String executorId;
        private String version;
        private Boolean debugMode;
        private java.util.List<StringMapEntry> extraArgs;

        public Builder() {
        }

        /**
         * The JSON-encoded recipe to use for ingestion
         */
        public Builder setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }

        /**
         * Advanced: The specific executor that should handle the execution request. Defaults to 'default'.
         */
        public Builder setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }

        /**
         * Advanced: The version of the ingestion framework to use
         */
        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        /**
         * Advanced: Whether or not to run ingestion in debug mode
         */
        public Builder setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        /**
         * Advanced: Extra arguments for the ingestion run.
         */
        public Builder setExtraArgs(java.util.List<StringMapEntry> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }


        public IngestionConfig build() {
            return new IngestionConfig(recipe, executorId, version, debugMode, extraArgs);
        }

    }
}
