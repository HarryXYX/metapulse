package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A definition of a Field (Column) assertion.
 */
public class FieldAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private FieldAssertionType type;
    @javax.annotation.Nonnull
    private String entityUrn;
    private FieldValuesAssertion fieldValuesAssertion;
    private FieldMetricAssertion fieldMetricAssertion;
    private DatasetFilter filter;

    public FieldAssertionInfo() {
    }

    public FieldAssertionInfo(FieldAssertionType type, String entityUrn, FieldValuesAssertion fieldValuesAssertion, FieldMetricAssertion fieldMetricAssertion, DatasetFilter filter) {
        this.type = type;
        this.entityUrn = entityUrn;
        this.fieldValuesAssertion = fieldValuesAssertion;
        this.fieldMetricAssertion = fieldMetricAssertion;
        this.filter = filter;
    }

    /**
     * The type of the field assertion being monitored.
     */
    public FieldAssertionType getType() {
        return type;
    }
    /**
     * The type of the field assertion being monitored.
     */
    public void setType(FieldAssertionType type) {
        this.type = type;
    }

    /**
     * The entity targeted by this Field check.
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The entity targeted by this Field check.
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * The definition of an assertion that validates individual values of a field / column for a set of rows.
     */
    public FieldValuesAssertion getFieldValuesAssertion() {
        return fieldValuesAssertion;
    }
    /**
     * The definition of an assertion that validates individual values of a field / column for a set of rows.
     */
    public void setFieldValuesAssertion(FieldValuesAssertion fieldValuesAssertion) {
        this.fieldValuesAssertion = fieldValuesAssertion;
    }

    /**
     * The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.
     */
    public FieldMetricAssertion getFieldMetricAssertion() {
        return fieldMetricAssertion;
    }
    /**
     * The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.
     */
    public void setFieldMetricAssertion(FieldMetricAssertion fieldMetricAssertion) {
        this.fieldMetricAssertion = fieldMetricAssertion;
    }

    /**
     * A definition of the specific filters that should be applied, when performing monitoring.
If not provided, there is no filter, and the full table is under consideration.
     */
    public DatasetFilter getFilter() {
        return filter;
    }
    /**
     * A definition of the specific filters that should be applied, when performing monitoring.
If not provided, there is no filter, and the full table is under consideration.
     */
    public void setFilter(DatasetFilter filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (fieldValuesAssertion != null) {
            joiner.add("fieldValuesAssertion: " + fieldValuesAssertion);
        }
        if (fieldMetricAssertion != null) {
            joiner.add("fieldMetricAssertion: " + fieldMetricAssertion);
        }
        if (filter != null) {
            joiner.add("filter: " + filter);
        }
        return joiner.toString();
    }

    public static FieldAssertionInfo.Builder builder() {
        return new FieldAssertionInfo.Builder();
    }

    public static class Builder {

        private FieldAssertionType type;
        private String entityUrn;
        private FieldValuesAssertion fieldValuesAssertion;
        private FieldMetricAssertion fieldMetricAssertion;
        private DatasetFilter filter;

        public Builder() {
        }

        /**
         * The type of the field assertion being monitored.
         */
        public Builder setType(FieldAssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * The entity targeted by this Field check.
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * The definition of an assertion that validates individual values of a field / column for a set of rows.
         */
        public Builder setFieldValuesAssertion(FieldValuesAssertion fieldValuesAssertion) {
            this.fieldValuesAssertion = fieldValuesAssertion;
            return this;
        }

        /**
         * The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.
         */
        public Builder setFieldMetricAssertion(FieldMetricAssertion fieldMetricAssertion) {
            this.fieldMetricAssertion = fieldMetricAssertion;
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
If not provided, there is no filter, and the full table is under consideration.
         */
        public Builder setFilter(DatasetFilter filter) {
            this.filter = filter;
            return this;
        }


        public FieldAssertionInfo build() {
            return new FieldAssertionInfo(type, entityUrn, fieldValuesAssertion, fieldMetricAssertion, filter);
        }

    }
}
