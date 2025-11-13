package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Result returned when fetching step state
 */
public class UpdateStepStateResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String id;
    private boolean succeeded;

    public UpdateStepStateResult() {
    }

    public UpdateStepStateResult(String id, boolean succeeded) {
        this.id = id;
        this.succeeded = succeeded;
    }

    /**
     * Id of the step
     */
    public String getId() {
        return id;
    }
    /**
     * Id of the step
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Whether the update succeeded.
     */
    public boolean getSucceeded() {
        return succeeded;
    }
    /**
     * Whether the update succeeded.
     */
    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        joiner.add("succeeded: " + succeeded);
        return joiner.toString();
    }

    public static UpdateStepStateResult.Builder builder() {
        return new UpdateStepStateResult.Builder();
    }

    public static class Builder {

        private String id;
        private boolean succeeded;

        public Builder() {
        }

        /**
         * Id of the step
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Whether the update succeeded.
         */
        public Builder setSucceeded(boolean succeeded) {
            this.succeeded = succeeded;
            return this;
        }


        public UpdateStepStateResult build() {
            return new UpdateStepStateResult(id, succeeded);
        }

    }
}
