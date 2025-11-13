package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Definition of a transform applied to the values of a column / field.
 */
public class FieldTransform implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private FieldTransformType type;

    public FieldTransform() {
    }

    public FieldTransform(FieldTransformType type) {
        this.type = type;
    }

    /**
     * The type of the field transform.
     */
    public FieldTransformType getType() {
        return type;
    }
    /**
     * The type of the field transform.
     */
    public void setType(FieldTransformType type) {
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

    public static FieldTransform.Builder builder() {
        return new FieldTransform.Builder();
    }

    public static class Builder {

        private FieldTransformType type;

        public Builder() {
        }

        /**
         * The type of the field transform.
         */
        public Builder setType(FieldTransformType type) {
            this.type = type;
            return this;
        }


        public FieldTransform build() {
            return new FieldTransform(type);
        }

    }
}
