package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input parameters for creating / updating an Ingestion Source
 */
public class UpdateIngestionSourceConfigInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String recipe;
    private String version;
    @javax.annotation.Nonnull
    private String executorId;
    private Boolean debugMode;
    private java.util.List<StringMapEntryInput> extraArgs;

    public UpdateIngestionSourceConfigInput() {
    }

    public UpdateIngestionSourceConfigInput(String recipe, String version, String executorId, Boolean debugMode, java.util.List<StringMapEntryInput> extraArgs) {
        this.recipe = recipe;
        this.version = version;
        this.executorId = executorId;
        this.debugMode = debugMode;
        this.extraArgs = extraArgs;
    }

    public String getRecipe() {
        return recipe;
    }
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public String getExecutorId() {
        return executorId;
    }
    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public Boolean getDebugMode() {
        return debugMode;
    }
    public void setDebugMode(Boolean debugMode) {
        this.debugMode = debugMode;
    }

    public java.util.List<StringMapEntryInput> getExtraArgs() {
        return extraArgs;
    }
    public void setExtraArgs(java.util.List<StringMapEntryInput> extraArgs) {
        this.extraArgs = extraArgs;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (recipe != null) {
            joiner.add("recipe: \"" + recipe + "\"");
        }
        if (version != null) {
            joiner.add("version: \"" + version + "\"");
        }
        if (executorId != null) {
            joiner.add("executorId: \"" + executorId + "\"");
        }
        if (debugMode != null) {
            joiner.add("debugMode: " + debugMode);
        }
        if (extraArgs != null) {
            joiner.add("extraArgs: " + extraArgs);
        }
        return joiner.toString();
    }

    public static UpdateIngestionSourceConfigInput.Builder builder() {
        return new UpdateIngestionSourceConfigInput.Builder();
    }

    public static class Builder {

        private String recipe;
        private String version;
        private String executorId;
        private Boolean debugMode;
        private java.util.List<StringMapEntryInput> extraArgs;

        public Builder() {
        }

        public Builder setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }

        public Builder setDebugMode(Boolean debugMode) {
            this.debugMode = debugMode;
            return this;
        }

        public Builder setExtraArgs(java.util.List<StringMapEntryInput> extraArgs) {
            this.extraArgs = extraArgs;
            return this;
        }


        public UpdateIngestionSourceConfigInput build() {
            return new UpdateIngestionSourceConfigInput(recipe, version, executorId, debugMode, extraArgs);
        }

    }
}
