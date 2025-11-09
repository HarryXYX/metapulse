package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when creating an Execution Request
 */
public class ExecutionRequestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String task;
    @javax.annotation.Nonnull
    private ExecutionRequestSource source;
    private java.util.List<StringMapEntry> arguments;
    @javax.annotation.Nonnull
    private Long requestedAt;
    @Deprecated
    private String actorUrn;
    private CorpUser actor;
    private String executorId;

    public ExecutionRequestInput() {
    }

    public ExecutionRequestInput(String task, ExecutionRequestSource source, java.util.List<StringMapEntry> arguments, Long requestedAt, String actorUrn, CorpUser actor, String executorId) {
        this.task = task;
        this.source = source;
        this.arguments = arguments;
        this.requestedAt = requestedAt;
        this.actorUrn = actorUrn;
        this.actor = actor;
        this.executorId = executorId;
    }

    /**
     * The type of the task to executed
     */
    public String getTask() {
        return task;
    }
    /**
     * The type of the task to executed
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * The source of the execution request
     */
    public ExecutionRequestSource getSource() {
        return source;
    }
    /**
     * The source of the execution request
     */
    public void setSource(ExecutionRequestSource source) {
        this.source = source;
    }

    /**
     * Arguments provided when creating the execution request
     */
    public java.util.List<StringMapEntry> getArguments() {
        return arguments;
    }
    /**
     * Arguments provided when creating the execution request
     */
    public void setArguments(java.util.List<StringMapEntry> arguments) {
        this.arguments = arguments;
    }

    /**
     * The time at which the request was created
     */
    public Long getRequestedAt() {
        return requestedAt;
    }
    /**
     * The time at which the request was created
     */
    public void setRequestedAt(Long requestedAt) {
        this.requestedAt = requestedAt;
    }

    /**
     * Urn of the actor who created this execution request
     */
    @Deprecated
    public String getActorUrn() {
        return actorUrn;
    }
    /**
     * Urn of the actor who created this execution request
     */
    @Deprecated
    public void setActorUrn(String actorUrn) {
        this.actorUrn = actorUrn;
    }

    /**
     * The actor who created this execution request
     */
    public CorpUser getActor() {
        return actor;
    }
    /**
     * The actor who created this execution request
     */
    public void setActor(CorpUser actor) {
        this.actor = actor;
    }

    /**
     * The specific executor to route the request to. If none is provided, a "default" executor is used.
     */
    public String getExecutorId() {
        return executorId;
    }
    /**
     * The specific executor to route the request to. If none is provided, a "default" executor is used.
     */
    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (task != null) {
            joiner.add("task: \"" + task + "\"");
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (arguments != null) {
            joiner.add("arguments: " + arguments);
        }
        if (requestedAt != null) {
            joiner.add("requestedAt: " + requestedAt);
        }
        if (actorUrn != null) {
            joiner.add("actorUrn: \"" + actorUrn + "\"");
        }
        if (actor != null) {
            joiner.add("actor: " + actor);
        }
        if (executorId != null) {
            joiner.add("executorId: \"" + executorId + "\"");
        }
        return joiner.toString();
    }

    public static ExecutionRequestInput.Builder builder() {
        return new ExecutionRequestInput.Builder();
    }

    public static class Builder {

        private String task;
        private ExecutionRequestSource source;
        private java.util.List<StringMapEntry> arguments;
        private Long requestedAt;
        private String actorUrn;
        private CorpUser actor;
        private String executorId;

        public Builder() {
        }

        /**
         * The type of the task to executed
         */
        public Builder setTask(String task) {
            this.task = task;
            return this;
        }

        /**
         * The source of the execution request
         */
        public Builder setSource(ExecutionRequestSource source) {
            this.source = source;
            return this;
        }

        /**
         * Arguments provided when creating the execution request
         */
        public Builder setArguments(java.util.List<StringMapEntry> arguments) {
            this.arguments = arguments;
            return this;
        }

        /**
         * The time at which the request was created
         */
        public Builder setRequestedAt(Long requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }

        /**
         * Urn of the actor who created this execution request
         */
        @Deprecated
        public Builder setActorUrn(String actorUrn) {
            this.actorUrn = actorUrn;
            return this;
        }

        /**
         * The actor who created this execution request
         */
        public Builder setActor(CorpUser actor) {
            this.actor = actor;
            return this;
        }

        /**
         * The specific executor to route the request to. If none is provided, a "default" executor is used.
         */
        public Builder setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }


        public ExecutionRequestInput build() {
            return new ExecutionRequestInput(task, source, arguments, requestedAt, actorUrn, actor, executorId);
        }

    }
}
