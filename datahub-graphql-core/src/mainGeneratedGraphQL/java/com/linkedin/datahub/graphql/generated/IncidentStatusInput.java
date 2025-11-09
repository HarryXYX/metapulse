package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create an incident status
 */
public class IncidentStatusInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncidentState state;
    private IncidentStage stage;
    private String message;

    public IncidentStatusInput() {
    }

    public IncidentStatusInput(IncidentState state, IncidentStage stage, String message) {
        this.state = state;
        this.stage = stage;
        this.message = message;
    }

    public IncidentState getState() {
        return state;
    }
    public void setState(IncidentState state) {
        this.state = state;
    }

    public IncidentStage getStage() {
        return stage;
    }
    public void setStage(IncidentStage stage) {
        this.stage = stage;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (state != null) {
            joiner.add("state: " + state);
        }
        if (stage != null) {
            joiner.add("stage: " + stage);
        }
        if (message != null) {
            joiner.add("message: \"" + message + "\"");
        }
        return joiner.toString();
    }

    public static IncidentStatusInput.Builder builder() {
        return new IncidentStatusInput.Builder();
    }

    public static class Builder {

        private IncidentState state;
        private IncidentStage stage;
        private String message;

        public Builder() {
        }

        public Builder setState(IncidentState state) {
            this.state = state;
            return this;
        }

        public Builder setStage(IncidentStage stage) {
            this.stage = stage;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }


        public IncidentStatusInput build() {
            return new IncidentStatusInput(state, stage, message);
        }

    }
}
