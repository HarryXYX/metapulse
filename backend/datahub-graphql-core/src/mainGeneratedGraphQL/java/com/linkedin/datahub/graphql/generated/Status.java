package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The status of a particular Metadata Entity
 */
public class Status implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean removed;

    public Status() {
    }

    public Status(boolean removed) {
        this.removed = removed;
    }

    /**
     * Whether the entity is removed or not
     */
    public boolean getRemoved() {
        return removed;
    }
    /**
     * Whether the entity is removed or not
     */
    public void setRemoved(boolean removed) {
        this.removed = removed;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("removed: " + removed);
        return joiner.toString();
    }

    public static Status.Builder builder() {
        return new Status.Builder();
    }

    public static class Builder {

        private boolean removed;

        public Builder() {
        }

        /**
         * Whether the entity is removed or not
         */
        public Builder setRemoved(boolean removed) {
            this.removed = removed;
            return this;
        }


        public Status build() {
            return new Status(removed);
        }

    }
}
