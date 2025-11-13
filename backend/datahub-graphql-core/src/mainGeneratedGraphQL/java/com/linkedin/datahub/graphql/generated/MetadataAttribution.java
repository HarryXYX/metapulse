package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about who, why, and how this metadata was applied
 */
public class MetadataAttribution implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Long time;
    @javax.annotation.Nonnull
    private Entity actor;
    private Entity source;
    private java.util.List<StringMapEntry> sourceDetail;

    public MetadataAttribution() {
    }

    public MetadataAttribution(Long time, Entity actor, Entity source, java.util.List<StringMapEntry> sourceDetail) {
        this.time = time;
        this.actor = actor;
        this.source = source;
        this.sourceDetail = sourceDetail;
    }

    /**
     * The time this metadata was applied
     */
    public Long getTime() {
        return time;
    }
    /**
     * The time this metadata was applied
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * The actor responsible for this metadata application
     */
    public Entity getActor() {
        return actor;
    }
    /**
     * The actor responsible for this metadata application
     */
    public void setActor(Entity actor) {
        this.actor = actor;
    }

    /**
     * The source of this metadata application. If propagated, this will be an action.
     */
    public Entity getSource() {
        return source;
    }
    /**
     * The source of this metadata application. If propagated, this will be an action.
     */
    public void setSource(Entity source) {
        this.source = source;
    }

    /**
     * Extra details about how this metadata was applied
     */
    public java.util.List<StringMapEntry> getSourceDetail() {
        return sourceDetail;
    }
    /**
     * Extra details about how this metadata was applied
     */
    public void setSourceDetail(java.util.List<StringMapEntry> sourceDetail) {
        this.sourceDetail = sourceDetail;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (time != null) {
            joiner.add("time: " + time);
        }
        if (actor != null) {
            joiner.add("actor: " + actor);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (sourceDetail != null) {
            joiner.add("sourceDetail: " + sourceDetail);
        }
        return joiner.toString();
    }

    public static MetadataAttribution.Builder builder() {
        return new MetadataAttribution.Builder();
    }

    public static class Builder {

        private Long time;
        private Entity actor;
        private Entity source;
        private java.util.List<StringMapEntry> sourceDetail;

        public Builder() {
        }

        /**
         * The time this metadata was applied
         */
        public Builder setTime(Long time) {
            this.time = time;
            return this;
        }

        /**
         * The actor responsible for this metadata application
         */
        public Builder setActor(Entity actor) {
            this.actor = actor;
            return this;
        }

        /**
         * The source of this metadata application. If propagated, this will be an action.
         */
        public Builder setSource(Entity source) {
            this.source = source;
            return this;
        }

        /**
         * Extra details about how this metadata was applied
         */
        public Builder setSourceDetail(java.util.List<StringMapEntry> sourceDetail) {
            this.sourceDetail = sourceDetail;
            return this;
        }


        public MetadataAttribution build() {
            return new MetadataAttribution(time, actor, source, sourceDetail);
        }

    }
}
