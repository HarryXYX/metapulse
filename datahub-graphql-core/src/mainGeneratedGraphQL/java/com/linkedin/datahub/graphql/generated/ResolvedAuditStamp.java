package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Audit stamp containing a resolved actor
 */
public class ResolvedAuditStamp implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Long time;
    private CorpUser actor;

    public ResolvedAuditStamp() {
    }

    public ResolvedAuditStamp(Long time, CorpUser actor) {
        this.time = time;
        this.actor = actor;
    }

    /**
     * When the audited action took place
     */
    public Long getTime() {
        return time;
    }
    /**
     * When the audited action took place
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * Who performed the audited action
     */
    public CorpUser getActor() {
        return actor;
    }
    /**
     * Who performed the audited action
     */
    public void setActor(CorpUser actor) {
        this.actor = actor;
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
        return joiner.toString();
    }

    public static ResolvedAuditStamp.Builder builder() {
        return new ResolvedAuditStamp.Builder();
    }

    public static class Builder {

        private Long time;
        private CorpUser actor;

        public Builder() {
        }

        /**
         * When the audited action took place
         */
        public Builder setTime(Long time) {
            this.time = time;
            return this;
        }

        /**
         * Who performed the audited action
         */
        public Builder setActor(CorpUser actor) {
            this.actor = actor;
            return this;
        }


        public ResolvedAuditStamp build() {
            return new ResolvedAuditStamp(time, actor);
        }

    }
}
