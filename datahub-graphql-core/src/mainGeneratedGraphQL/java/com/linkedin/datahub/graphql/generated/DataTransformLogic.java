package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about transformations applied to data assets
 */
public class DataTransformLogic implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<DataTransform> transforms;

    public DataTransformLogic() {
    }

    public DataTransformLogic(java.util.List<DataTransform> transforms) {
        this.transforms = transforms;
    }

    /**
     * List of transformations applied
     */
    public java.util.List<DataTransform> getTransforms() {
        return transforms;
    }
    /**
     * List of transformations applied
     */
    public void setTransforms(java.util.List<DataTransform> transforms) {
        this.transforms = transforms;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (transforms != null) {
            joiner.add("transforms: " + transforms);
        }
        return joiner.toString();
    }

    public static DataTransformLogic.Builder builder() {
        return new DataTransformLogic.Builder();
    }

    public static class Builder {

        private java.util.List<DataTransform> transforms;

        public Builder() {
        }

        /**
         * List of transformations applied
         */
        public Builder setTransforms(java.util.List<DataTransform> transforms) {
            this.transforms = transforms;
            return this;
        }


        public DataTransformLogic build() {
            return new DataTransformLogic(transforms);
        }

    }
}
