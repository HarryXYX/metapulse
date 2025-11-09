package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Details about the status of an asset incident
 */
public class IncidentStatus implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncidentState state;
    private IncidentStage stage;
    private String message;
    @javax.annotation.Nonnull
    private AuditStamp lastUpdated;

    public IncidentStatus() {
    }

    public IncidentStatus(IncidentState state, IncidentStage stage, String message, AuditStamp lastUpdated) {
        this.state = state;
        this.stage = stage;
        this.message = message;
        this.lastUpdated = lastUpdated;
    }

    /**
     * The state of the incident
     */
    public IncidentState getState() {
        return state;
    }
    /**
     * The state of the incident
     */
    public void setState(IncidentState state) {
        this.state = state;
    }

    /**
     * The lifecycle stage of the incident. Null means that no stage has been assigned.
     */
    public IncidentStage getStage() {
        return stage;
    }
    /**
     * The lifecycle stage of the incident. Null means that no stage has been assigned.
     */
    public void setStage(IncidentStage stage) {
        this.stage = stage;
    }

    /**
     * An optional message associated with the status
     */
    public String getMessage() {
        return message;
    }
    /**
     * An optional message associated with the status
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The time that the status last changed
     */
    public AuditStamp getLastUpdated() {
        return lastUpdated;
    }
    /**
     * The time that the status last changed
     */
    public void setLastUpdated(AuditStamp lastUpdated) {
        this.lastUpdated = lastUpdated;
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
        if (lastUpdated != null) {
            joiner.add("lastUpdated: " + lastUpdated);
        }
        return joiner.toString();
    }

    public static IncidentStatus.Builder builder() {
        return new IncidentStatus.Builder();
    }

    public static class Builder {

        private IncidentState state;
        private IncidentStage stage;
        private String message;
        private AuditStamp lastUpdated;

        public Builder() {
        }

        /**
         * The state of the incident
         */
        public Builder setState(IncidentState state) {
            this.state = state;
            return this;
        }

        /**
         * The lifecycle stage of the incident. Null means that no stage has been assigned.
         */
        public Builder setStage(IncidentStage stage) {
            this.stage = stage;
            return this;
        }

        /**
         * An optional message associated with the status
         */
        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        /**
         * The time that the status last changed
         */
        public Builder setLastUpdated(AuditStamp lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }


        public IncidentStatus build() {
            return new IncidentStatus(state, stage, message, lastUpdated);
        }

    }
}
