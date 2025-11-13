package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about Metadata Entity deprecation status
 */
public class Deprecation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean deprecated;
    private Long decommissionTime;
    private String note;
    private String actor;
    private Entity actorEntity;
    private Entity replacement;

    public Deprecation() {
    }

    public Deprecation(boolean deprecated, Long decommissionTime, String note, String actor, Entity actorEntity, Entity replacement) {
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
        this.actor = actor;
        this.actorEntity = actorEntity;
        this.replacement = replacement;
    }

    /**
     * Whether the entity has been deprecated by owner
     */
    public boolean getDeprecated() {
        return deprecated;
    }
    /**
     * Whether the entity has been deprecated by owner
     */
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * The time user plan to decommission this entity
     */
    public Long getDecommissionTime() {
        return decommissionTime;
    }
    /**
     * The time user plan to decommission this entity
     */
    public void setDecommissionTime(Long decommissionTime) {
        this.decommissionTime = decommissionTime;
    }

    /**
     * Additional information about the entity deprecation plan
     */
    public String getNote() {
        return note;
    }
    /**
     * Additional information about the entity deprecation plan
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

    /**
     * The hydrated user who will be credited for modifying this deprecation content
     */
    public Entity getActorEntity() {
        return actorEntity;
    }
    /**
     * The hydrated user who will be credited for modifying this deprecation content
     */
    public void setActorEntity(Entity actorEntity) {
        this.actorEntity = actorEntity;
    }

    /**
     * The optional replacement entity
     */
    public Entity getReplacement() {
        return replacement;
    }
    /**
     * The optional replacement entity
     */
    public void setReplacement(Entity replacement) {
        this.replacement = replacement;
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
        if (actorEntity != null) {
            joiner.add("actorEntity: " + actorEntity);
        }
        if (replacement != null) {
            joiner.add("replacement: " + replacement);
        }
        return joiner.toString();
    }

    public static Deprecation.Builder builder() {
        return new Deprecation.Builder();
    }

    public static class Builder {

        private boolean deprecated;
        private Long decommissionTime;
        private String note;
        private String actor;
        private Entity actorEntity;
        private Entity replacement;

        public Builder() {
        }

        /**
         * Whether the entity has been deprecated by owner
         */
        public Builder setDeprecated(boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        /**
         * The time user plan to decommission this entity
         */
        public Builder setDecommissionTime(Long decommissionTime) {
            this.decommissionTime = decommissionTime;
            return this;
        }

        /**
         * Additional information about the entity deprecation plan
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

        /**
         * The hydrated user who will be credited for modifying this deprecation content
         */
        public Builder setActorEntity(Entity actorEntity) {
            this.actorEntity = actorEntity;
            return this;
        }

        /**
         * The optional replacement entity
         */
        public Builder setReplacement(Entity replacement) {
            this.replacement = replacement;
            return this;
        }


        public Deprecation build() {
            return new Deprecation(deprecated, decommissionTime, note, actor, actorEntity, replacement);
        }

    }
}
