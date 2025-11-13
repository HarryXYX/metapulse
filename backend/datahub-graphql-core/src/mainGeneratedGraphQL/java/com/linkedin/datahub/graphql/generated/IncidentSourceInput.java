package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create an incident source
 */
public class IncidentSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncidentSourceType type;

    public IncidentSourceInput() {
    }

    public IncidentSourceInput(IncidentSourceType type) {
        this.type = type;
    }

    public IncidentSourceType getType() {
        return type;
    }
    public void setType(IncidentSourceType type) {
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

    public static IncidentSourceInput.Builder builder() {
        return new IncidentSourceInput.Builder();
    }

    public static class Builder {

        private IncidentSourceType type;

        public Builder() {
        }

        public Builder setType(IncidentSourceType type) {
            this.type = type;
            return this;
        }


        public IncidentSourceInput build() {
            return new IncidentSourceInput(type);
        }

    }
}
