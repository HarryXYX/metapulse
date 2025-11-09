package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Core attributes required to identify an incrementing segment in a table. This type is mainly useful
for tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables).

An incrementing segment represents a logical chunk of data which is INSERTED
into a dataset on a regular interval, along with the presence of a constantly-incrementing column
value such as an event time, date partition, or last modified column.

An incrementing segment is principally identified by 2 key attributes combined:

1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.
   Note that the value of this column may not by itself represent the "bucket" or the "segment" in which the row falls.

2. [Optional] An transformer function that may be applied to the selected column value in order
   to obtain the final "segment identifier" or "bucket identifier". Rows that have the same value after applying the transformation
   will be grouped into the same segment, using which the final value (e.g. row count) will be determined.
 */
public class IncrementingSegmentSpec implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SchemaFieldSpec field;
    private IncrementingSegmentFieldTransformer transformer;

    public IncrementingSegmentSpec() {
    }

    public IncrementingSegmentSpec(SchemaFieldSpec field, IncrementingSegmentFieldTransformer transformer) {
        this.field = field;
        this.transformer = transformer;
    }

    /**
     * The field to use to generate segments. It must be constantly incrementing as new rows are inserted.
     */
    public SchemaFieldSpec getField() {
        return field;
    }
    /**
     * The field to use to generate segments. It must be constantly incrementing as new rows are inserted.
     */
    public void setField(SchemaFieldSpec field) {
        this.field = field;
    }

    /**
     * Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.
If not provided, then no operator will be applied to the field. (identity function)
     */
    public IncrementingSegmentFieldTransformer getTransformer() {
        return transformer;
    }
    /**
     * Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.
If not provided, then no operator will be applied to the field. (identity function)
     */
    public void setTransformer(IncrementingSegmentFieldTransformer transformer) {
        this.transformer = transformer;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: " + field);
        }
        if (transformer != null) {
            joiner.add("transformer: " + transformer);
        }
        return joiner.toString();
    }

    public static IncrementingSegmentSpec.Builder builder() {
        return new IncrementingSegmentSpec.Builder();
    }

    public static class Builder {

        private SchemaFieldSpec field;
        private IncrementingSegmentFieldTransformer transformer;

        public Builder() {
        }

        /**
         * The field to use to generate segments. It must be constantly incrementing as new rows are inserted.
         */
        public Builder setField(SchemaFieldSpec field) {
            this.field = field;
            return this;
        }

        /**
         * Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.
If not provided, then no operator will be applied to the field. (identity function)
         */
        public Builder setTransformer(IncrementingSegmentFieldTransformer transformer) {
            this.transformer = transformer;
            return this;
        }


        public IncrementingSegmentSpec build() {
            return new IncrementingSegmentSpec(field, transformer);
        }

    }
}
