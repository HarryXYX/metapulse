package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to update an existing incident.
 */
public class UpdateIncidentInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private Long startedAt;
    private IncidentStatusInput status;
    private IncidentPriority priority;
    private java.util.List<String> resourceUrns;
    private java.util.List<String> assigneeUrns;

    public UpdateIncidentInput() {
    }

    public UpdateIncidentInput(String title, String description, Long startedAt, IncidentStatusInput status, IncidentPriority priority, java.util.List<String> resourceUrns, java.util.List<String> assigneeUrns) {
        this.title = title;
        this.description = description;
        this.startedAt = startedAt;
        this.status = status;
        this.priority = priority;
        this.resourceUrns = resourceUrns;
        this.assigneeUrns = assigneeUrns;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    public IncidentStatusInput getStatus() {
        return status;
    }
    public void setStatus(IncidentStatusInput status) {
        this.status = status;
    }

    public IncidentPriority getPriority() {
        return priority;
    }
    public void setPriority(IncidentPriority priority) {
        this.priority = priority;
    }

    public java.util.List<String> getResourceUrns() {
        return resourceUrns;
    }
    public void setResourceUrns(java.util.List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }

    public java.util.List<String> getAssigneeUrns() {
        return assigneeUrns;
    }
    public void setAssigneeUrns(java.util.List<String> assigneeUrns) {
        this.assigneeUrns = assigneeUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (startedAt != null) {
            joiner.add("startedAt: " + startedAt);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (priority != null) {
            joiner.add("priority: " + priority);
        }
        if (resourceUrns != null) {
            joiner.add("resourceUrns: " + resourceUrns);
        }
        if (assigneeUrns != null) {
            joiner.add("assigneeUrns: " + assigneeUrns);
        }
        return joiner.toString();
    }

    public static UpdateIncidentInput.Builder builder() {
        return new UpdateIncidentInput.Builder();
    }

    public static class Builder {

        private String title;
        private String description;
        private Long startedAt;
        private IncidentStatusInput status;
        private IncidentPriority priority;
        private java.util.List<String> resourceUrns;
        private java.util.List<String> assigneeUrns;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStartedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public Builder setStatus(IncidentStatusInput status) {
            this.status = status;
            return this;
        }

        public Builder setPriority(IncidentPriority priority) {
            this.priority = priority;
            return this;
        }

        public Builder setResourceUrns(java.util.List<String> resourceUrns) {
            this.resourceUrns = resourceUrns;
            return this;
        }

        public Builder setAssigneeUrns(java.util.List<String> assigneeUrns) {
            this.assigneeUrns = assigneeUrns;
            return this;
        }


        public UpdateIncidentInput build() {
            return new UpdateIncidentInput(title, description, startedAt, status, priority, resourceUrns, assigneeUrns);
        }

    }
}
