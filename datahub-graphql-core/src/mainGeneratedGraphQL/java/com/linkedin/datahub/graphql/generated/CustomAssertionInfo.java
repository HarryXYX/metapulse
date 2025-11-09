package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about a custom assertion
 */
public class CustomAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private String entityUrn;
    private SchemaFieldRef field;
    private String logic;

    public CustomAssertionInfo() {
    }

    public CustomAssertionInfo(String type, String entityUrn, SchemaFieldRef field, String logic) {
        this.type = type;
        this.entityUrn = entityUrn;
        this.field = field;
        this.logic = logic;
    }

    /**
     * The type of custom assertion.
     */
    public String getType() {
        return type;
    }
    /**
     * The type of custom assertion.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The entity targeted by this custom assertion.
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The entity targeted by this custom assertion.
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * The field serving as input to the assertion, if any.
     */
    public SchemaFieldRef getField() {
        return field;
    }
    /**
     * The field serving as input to the assertion, if any.
     */
    public void setField(SchemaFieldRef field) {
        this.field = field;
    }

    /**
     * Logic comprising a raw, unstructured assertion.
     */
    public String getLogic() {
        return logic;
    }
    /**
     * Logic comprising a raw, unstructured assertion.
     */
    public void setLogic(String logic) {
        this.logic = logic;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (field != null) {
            joiner.add("field: " + field);
        }
        if (logic != null) {
            joiner.add("logic: \"" + logic + "\"");
        }
        return joiner.toString();
    }

    public static CustomAssertionInfo.Builder builder() {
        return new CustomAssertionInfo.Builder();
    }

    public static class Builder {

        private String type;
        private String entityUrn;
        private SchemaFieldRef field;
        private String logic;

        public Builder() {
        }

        /**
         * The type of custom assertion.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The entity targeted by this custom assertion.
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * The field serving as input to the assertion, if any.
         */
        public Builder setField(SchemaFieldRef field) {
            this.field = field;
            return this;
        }

        /**
         * Logic comprising a raw, unstructured assertion.
         */
        public Builder setLogic(String logic) {
            this.logic = logic;
            return this;
        }


        public CustomAssertionInfo build() {
            return new CustomAssertionInfo(type, entityUrn, field, logic);
        }

    }
}
