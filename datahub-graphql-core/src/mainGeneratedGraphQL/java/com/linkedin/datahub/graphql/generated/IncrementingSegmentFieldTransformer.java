package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The definition of the transformer function that should be applied to a given field / column value in a dataset
in order to determine the segment or bucket that it belongs to, which in turn is used to evaluate
volume assertions.
 */
public class IncrementingSegmentFieldTransformer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncrementingSegmentFieldTransformerType type;
    private String nativeType;

    public IncrementingSegmentFieldTransformer() {
    }

    public IncrementingSegmentFieldTransformer(IncrementingSegmentFieldTransformerType type, String nativeType) {
        this.type = type;
        this.nativeType = nativeType;
    }

    /**
     * The 'standard' operator type. Note that not all source systems will support all operators.
     */
    public IncrementingSegmentFieldTransformerType getType() {
        return type;
    }
    /**
     * The 'standard' operator type. Note that not all source systems will support all operators.
     */
    public void setType(IncrementingSegmentFieldTransformerType type) {
        this.type = type;
    }

    /**
     * The 'native' transformer type, useful as a back door if a custom transformer is required.
This field is required if the type is NATIVE.
     */
    public String getNativeType() {
        return nativeType;
    }
    /**
     * The 'native' transformer type, useful as a back door if a custom transformer is required.
This field is required if the type is NATIVE.
     */
    public void setNativeType(String nativeType) {
        this.nativeType = nativeType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (nativeType != null) {
            joiner.add("nativeType: \"" + nativeType + "\"");
        }
        return joiner.toString();
    }

    public static IncrementingSegmentFieldTransformer.Builder builder() {
        return new IncrementingSegmentFieldTransformer.Builder();
    }

    public static class Builder {

        private IncrementingSegmentFieldTransformerType type;
        private String nativeType;

        public Builder() {
        }

        /**
         * The 'standard' operator type. Note that not all source systems will support all operators.
         */
        public Builder setType(IncrementingSegmentFieldTransformerType type) {
            this.type = type;
            return this;
        }

        /**
         * The 'native' transformer type, useful as a back door if a custom transformer is required.
This field is required if the type is NATIVE.
         */
        public Builder setNativeType(String nativeType) {
            this.nativeType = nativeType;
            return this;
        }


        public IncrementingSegmentFieldTransformer build() {
            return new IncrementingSegmentFieldTransformer(type, nativeType);
        }

    }
}
