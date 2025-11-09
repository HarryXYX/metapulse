package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The source of an Assertion
 */
public class AssertionSource implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionSourceType type;
    private AuditStamp created;

    public AssertionSource() {
    }

    public AssertionSource(AssertionSourceType type, AuditStamp created) {
        this.type = type;
        this.created = created;
    }

    /**
     * The source type
     */
    public AssertionSourceType getType() {
        return type;
    }
    /**
     * The source type
     */
    public void setType(AssertionSourceType type) {
        this.type = type;
    }

    /**
     * The time at which the assertion was initially created and the actor who created it
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * The time at which the assertion was initially created and the actor who created it
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        return joiner.toString();
    }

    public static AssertionSource.Builder builder() {
        return new AssertionSource.Builder();
    }

    public static class Builder {

        private AssertionSourceType type;
        private AuditStamp created;

        public Builder() {
        }

        /**
         * The source type
         */
        public Builder setType(AssertionSourceType type) {
            this.type = type;
            return this;
        }

        /**
         * The time at which the assertion was initially created and the actor who created it
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }


        public AssertionSource build() {
            return new AssertionSource(type, created);
        }

    }
}
