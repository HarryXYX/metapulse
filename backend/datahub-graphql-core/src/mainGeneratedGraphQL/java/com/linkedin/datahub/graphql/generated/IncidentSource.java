package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Details about the source of an incident, e.g. how it was created.
 */
public class IncidentSource implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncidentSourceType type;
    private Entity source;

    public IncidentSource() {
    }

    public IncidentSource(IncidentSourceType type, Entity source) {
        this.type = type;
        this.source = source;
    }

    /**
     * The type of the incident source
     */
    public IncidentSourceType getType() {
        return type;
    }
    /**
     * The type of the incident source
     */
    public void setType(IncidentSourceType type) {
        this.type = type;
    }

    /**
     * The source of the incident. If the source type is ASSERTION_FAILURE, this will have the assertion that generated the incident.
     */
    public Entity getSource() {
        return source;
    }
    /**
     * The source of the incident. If the source type is ASSERTION_FAILURE, this will have the assertion that generated the incident.
     */
    public void setSource(Entity source) {
        this.source = source;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        return joiner.toString();
    }

    public static IncidentSource.Builder builder() {
        return new IncidentSource.Builder();
    }

    public static class Builder {

        private IncidentSourceType type;
        private Entity source;

        public Builder() {
        }

        /**
         * The type of the incident source
         */
        public Builder setType(IncidentSourceType type) {
            this.type = type;
            return this;
        }

        /**
         * The source of the incident. If the source type is ASSERTION_FAILURE, this will have the assertion that generated the incident.
         */
        public Builder setSource(Entity source) {
            this.source = source;
            return this;
        }


        public IncidentSource build() {
            return new IncidentSource(type, source);
        }

    }
}
