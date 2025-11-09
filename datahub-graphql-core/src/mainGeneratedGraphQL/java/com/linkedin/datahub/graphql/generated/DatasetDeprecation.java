package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use Deprecation instead
Information about Dataset deprecation status
Note that this model will soon be migrated to a more general purpose Entity status
 */
public class DatasetDeprecation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean deprecated;
    private Long decommissionTime;
    @javax.annotation.Nonnull
    private String note;
    private String actor;

    public DatasetDeprecation() {
    }

    public DatasetDeprecation(boolean deprecated, Long decommissionTime, String note, String actor) {
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
        this.actor = actor;
    }

    /**
     * Whether the dataset has been deprecated by owner
     */
    public boolean getDeprecated() {
        return deprecated;
    }
    /**
     * Whether the dataset has been deprecated by owner
     */
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * The time user plan to decommission this dataset
     */
    public Long getDecommissionTime() {
        return decommissionTime;
    }
    /**
     * The time user plan to decommission this dataset
     */
    public void setDecommissionTime(Long decommissionTime) {
        this.decommissionTime = decommissionTime;
    }

    /**
     * Additional information about the dataset deprecation plan
     */
    public String getNote() {
        return note;
    }
    /**
     * Additional information about the dataset deprecation plan
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * The user who will be credited for modifying this deprecation content
     */
    public String getActor() {
        return actor;
    }
    /**
     * The user who will be credited for modifying this deprecation content
     */
    public void setActor(String actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("deprecated: " + deprecated);
        if (decommissionTime != null) {
            joiner.add("decommissionTime: " + decommissionTime);
        }
        if (note != null) {
            joiner.add("note: \"" + note + "\"");
        }
        if (actor != null) {
            joiner.add("actor: \"" + actor + "\"");
        }
        return joiner.toString();
    }

    public static DatasetDeprecation.Builder builder() {
        return new DatasetDeprecation.Builder();
    }

    public static class Builder {

        private boolean deprecated;
        private Long decommissionTime;
        private String note;
        private String actor;

        public Builder() {
        }

        /**
         * Whether the dataset has been deprecated by owner
         */
        public Builder setDeprecated(boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        /**
         * The time user plan to decommission this dataset
         */
        public Builder setDecommissionTime(Long decommissionTime) {
            this.decommissionTime = decommissionTime;
            return this;
        }

        /**
         * Additional information about the dataset deprecation plan
         */
        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        /**
         * The user who will be credited for modifying this deprecation content
         */
        public Builder setActor(String actor) {
            this.actor = actor;
            return this;
        }


        public DatasetDeprecation build() {
            return new DatasetDeprecation(deprecated, decommissionTime, note, actor);
        }

    }
}
