package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Info about the surface area of the product that this template is deployed in
 */
public class DataHubPageTemplateSurface implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private PageTemplateSurfaceType surfaceType;

    public DataHubPageTemplateSurface() {
    }

    public DataHubPageTemplateSurface(PageTemplateSurfaceType surfaceType) {
        this.surfaceType = surfaceType;
    }

    /**
     * Where exactly is this template bing used
     */
    public PageTemplateSurfaceType getSurfaceType() {
        return surfaceType;
    }
    /**
     * Where exactly is this template bing used
     */
    public void setSurfaceType(PageTemplateSurfaceType surfaceType) {
        this.surfaceType = surfaceType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (surfaceType != null) {
            joiner.add("surfaceType: " + surfaceType);
        }
        return joiner.toString();
    }

    public static DataHubPageTemplateSurface.Builder builder() {
        return new DataHubPageTemplateSurface.Builder();
    }

    public static class Builder {

        private PageTemplateSurfaceType surfaceType;

        public Builder() {
        }

        /**
         * Where exactly is this template bing used
         */
        public Builder setSurfaceType(PageTemplateSurfaceType surfaceType) {
            this.surfaceType = surfaceType;
            return this;
        }


        public DataHubPageTemplateSurface build() {
            return new DataHubPageTemplateSurface(surfaceType);
        }

    }
}
