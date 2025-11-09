package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An Ingestion Source Entity
 */
public class IngestionSource implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private String name;
    private IngestionSchedule schedule;
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private IngestionConfig config;
    private IngestionSourceExecutionRequests executions;
    private Ownership ownership;
    private ExecutionRequest latestSuccessfulExecution;
    private IngestionSourceSource source;

    public IngestionSource() {
    }

    public IngestionSource(String urn, String type, String name, IngestionSchedule schedule, DataPlatform platform, IngestionConfig config, IngestionSourceExecutionRequests executions, Ownership ownership, ExecutionRequest latestSuccessfulExecution, IngestionSourceSource source) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.schedule = schedule;
        this.platform = platform;
        this.config = config;
        this.executions = executions;
        this.ownership = ownership;
        this.latestSuccessfulExecution = latestSuccessfulExecution;
        this.source = source;
    }

    /**
     * The primary key of the Ingestion Source
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Ingestion Source
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The display name of the Ingestion Source
     */
    public String getName() {
        return name;
    }
    /**
     * The display name of the Ingestion Source
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An optional schedule associated with the Ingestion Source
     */
    public IngestionSchedule getSchedule() {
        return schedule;
    }
    /**
     * An optional schedule associated with the Ingestion Source
     */
    public void setSchedule(IngestionSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * The data platform associated with this ingestion source
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * The data platform associated with this ingestion source
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * An type-specific set of configurations for the ingestion source
     */
    public IngestionConfig getConfig() {
        return config;
    }
    /**
     * An type-specific set of configurations for the ingestion source
     */
    public void setConfig(IngestionConfig config) {
        this.config = config;
    }

    /**
     * Previous requests to execute the ingestion source
     */
    public IngestionSourceExecutionRequests getExecutions() {
        return executions;
    }
    /**
     * Previous requests to execute the ingestion source
     */
    public void setExecutions(IngestionSourceExecutionRequests executions) {
        this.executions = executions;
    }

    /**
     * Ownership metadata of the ingestion source
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the ingestion source
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The latest successful execution request for this source
     */
    public ExecutionRequest getLatestSuccessfulExecution() {
        return latestSuccessfulExecution;
    }
    /**
     * The latest successful execution request for this source
     */
    public void setLatestSuccessfulExecution(ExecutionRequest latestSuccessfulExecution) {
        this.latestSuccessfulExecution = latestSuccessfulExecution;
    }

    /**
     * The source or origin of the Ingestion Source
     */
    public IngestionSourceSource getSource() {
        return source;
    }
    /**
     * The source or origin of the Ingestion Source
     */
    public void setSource(IngestionSourceSource source) {
        this.source = source;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (schedule != null) {
            joiner.add("schedule: " + schedule);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (config != null) {
            joiner.add("config: " + config);
        }
        if (executions != null) {
            joiner.add("executions: " + executions);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (latestSuccessfulExecution != null) {
            joiner.add("latestSuccessfulExecution: " + latestSuccessfulExecution);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        return joiner.toString();
    }

    public static IngestionSource.Builder builder() {
        return new IngestionSource.Builder();
    }

    public static class Builder {

        private String urn;
        private String type;
        private String name;
        private IngestionSchedule schedule;
        private DataPlatform platform;
        private IngestionConfig config;
        private IngestionSourceExecutionRequests executions;
        private Ownership ownership;
        private ExecutionRequest latestSuccessfulExecution;
        private IngestionSourceSource source;

        public Builder() {
        }

        /**
         * The primary key of the Ingestion Source
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The type of the source itself, e.g. mysql, bigquery, bigquery-usage. Should match the recipe.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The display name of the Ingestion Source
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * An optional schedule associated with the Ingestion Source
         */
        public Builder setSchedule(IngestionSchedule schedule) {
            this.schedule = schedule;
            return this;
        }

        /**
         * The data platform associated with this ingestion source
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * An type-specific set of configurations for the ingestion source
         */
        public Builder setConfig(IngestionConfig config) {
            this.config = config;
            return this;
        }

        /**
         * Previous requests to execute the ingestion source
         */
        public Builder setExecutions(IngestionSourceExecutionRequests executions) {
            this.executions = executions;
            return this;
        }

        /**
         * Ownership metadata of the ingestion source
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The latest successful execution request for this source
         */
        public Builder setLatestSuccessfulExecution(ExecutionRequest latestSuccessfulExecution) {
            this.latestSuccessfulExecution = latestSuccessfulExecution;
            return this;
        }

        /**
         * The source or origin of the Ingestion Source
         */
        public Builder setSource(IngestionSourceSource source) {
            this.source = source;
            return this;
        }


        public IngestionSource build() {
            return new IngestionSource(urn, type, name, schedule, platform, config, executions, ownership, latestSuccessfulExecution, source);
        }

    }
}
