package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for creating / updating an Ingestion Source
 */
public class UpdateIngestionSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String type;
    private String description;
    private UpdateIngestionSourceScheduleInput schedule;
    @javax.annotation.Nonnull
    private UpdateIngestionSourceConfigInput config;
    private IngestionSourceSourceInput source;

    public UpdateIngestionSourceInput() {
    }

    public UpdateIngestionSourceInput(String name, String type, String description, UpdateIngestionSourceScheduleInput schedule, UpdateIngestionSourceConfigInput config, IngestionSourceSourceInput source) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.schedule = schedule;
        this.config = config;
        this.source = source;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIngestionSourceScheduleInput getSchedule() {
        return schedule;
    }
    public void setSchedule(UpdateIngestionSourceScheduleInput schedule) {
        this.schedule = schedule;
    }

    public UpdateIngestionSourceConfigInput getConfig() {
        return config;
    }
    public void setConfig(UpdateIngestionSourceConfigInput config) {
        this.config = config;
    }

    public IngestionSourceSourceInput getSource() {
        return source;
    }
    public void setSource(IngestionSourceSourceInput source) {
        this.source = source;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (schedule != null) {
            joiner.add("schedule: " + schedule);
        }
        if (config != null) {
            joiner.add("config: " + config);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        return joiner.toString();
    }

    public static UpdateIngestionSourceInput.Builder builder() {
        return new UpdateIngestionSourceInput.Builder();
    }

    public static class Builder {

        private String name;
        private String type;
        private String description;
        private UpdateIngestionSourceScheduleInput schedule;
        private UpdateIngestionSourceConfigInput config;
        private IngestionSourceSourceInput source;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setSchedule(UpdateIngestionSourceScheduleInput schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setConfig(UpdateIngestionSourceConfigInput config) {
            this.config = config;
            return this;
        }

        public Builder setSource(IngestionSourceSourceInput source) {
            this.source = source;
            return this;
        }


        public UpdateIngestionSourceInput build() {
            return new UpdateIngestionSourceInput(name, type, description, schedule, config, source);
        }

    }
}
