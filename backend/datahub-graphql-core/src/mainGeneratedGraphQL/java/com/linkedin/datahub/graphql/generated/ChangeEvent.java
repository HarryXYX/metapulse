package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual change in a transaction
 */
public class ChangeEvent implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private ChangeCategoryType category;
    private ChangeOperationType operation;
    private String modifier;
    private java.util.List<TimelineParameterEntry> parameters;
    private AuditStamp auditStamp;
    private String description;

    public ChangeEvent() {
    }

    public ChangeEvent(String urn, ChangeCategoryType category, ChangeOperationType operation, String modifier, java.util.List<TimelineParameterEntry> parameters, AuditStamp auditStamp, String description) {
        this.urn = urn;
        this.category = category;
        this.operation = operation;
        this.modifier = modifier;
        this.parameters = parameters;
        this.auditStamp = auditStamp;
        this.description = description;
    }

    /**
     * The urn of the entity that was changed
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The urn of the entity that was changed
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The category of the change
     */
    public ChangeCategoryType getCategory() {
        return category;
    }
    /**
     * The category of the change
     */
    public void setCategory(ChangeCategoryType category) {
        this.category = category;
    }

    /**
     * The operation of the change
     */
    public ChangeOperationType getOperation() {
        return operation;
    }
    /**
     * The operation of the change
     */
    public void setOperation(ChangeOperationType operation) {
        this.operation = operation;
    }

    /**
     * The modifier of the change
     */
    public String getModifier() {
        return modifier;
    }
    /**
     * The modifier of the change
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * The parameters of the change
     */
    public java.util.List<TimelineParameterEntry> getParameters() {
        return parameters;
    }
    /**
     * The parameters of the change
     */
    public void setParameters(java.util.List<TimelineParameterEntry> parameters) {
        this.parameters = parameters;
    }

    /**
     * The audit stamp of the change
     */
    public AuditStamp getAuditStamp() {
        return auditStamp;
    }
    /**
     * The audit stamp of the change
     */
    public void setAuditStamp(AuditStamp auditStamp) {
        this.auditStamp = auditStamp;
    }

    /**
     * description of the change
     */
    public String getDescription() {
        return description;
    }
    /**
     * description of the change
     */
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (category != null) {
            joiner.add("category: " + category);
        }
        if (operation != null) {
            joiner.add("operation: " + operation);
        }
        if (modifier != null) {
            joiner.add("modifier: \"" + modifier + "\"");
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        if (auditStamp != null) {
            joiner.add("auditStamp: " + auditStamp);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static ChangeEvent.Builder builder() {
        return new ChangeEvent.Builder();
    }

    public static class Builder {

        private String urn;
        private ChangeCategoryType category;
        private ChangeOperationType operation;
        private String modifier;
        private java.util.List<TimelineParameterEntry> parameters;
        private AuditStamp auditStamp;
        private String description;

        public Builder() {
        }

        /**
         * The urn of the entity that was changed
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The category of the change
         */
        public Builder setCategory(ChangeCategoryType category) {
            this.category = category;
            return this;
        }

        /**
         * The operation of the change
         */
        public Builder setOperation(ChangeOperationType operation) {
            this.operation = operation;
            return this;
        }

        /**
         * The modifier of the change
         */
        public Builder setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * The parameters of the change
         */
        public Builder setParameters(java.util.List<TimelineParameterEntry> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The audit stamp of the change
         */
        public Builder setAuditStamp(AuditStamp auditStamp) {
            this.auditStamp = auditStamp;
            return this;
        }

        /**
         * description of the change
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ChangeEvent build() {
            return new ChangeEvent(urn, category, operation, modifier, parameters, auditStamp, description);
        }

    }
}
