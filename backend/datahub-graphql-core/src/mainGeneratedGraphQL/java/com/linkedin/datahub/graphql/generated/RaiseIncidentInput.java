package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create a new incident in the 'Active' state.
 */
public class RaiseIncidentInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncidentType type;
    private String customType;
    private String title;
    private String description;
    private String resourceUrn;
    private java.util.List<String> resourceUrns;
    private Long startedAt;
    private IncidentSourceInput source;
    private IncidentStatusInput status;
    private IncidentPriority priority;
    private java.util.List<String> assigneeUrns;

    public RaiseIncidentInput() {
    }

    public RaiseIncidentInput(IncidentType type, String customType, String title, String description, String resourceUrn, java.util.List<String> resourceUrns, Long startedAt, IncidentSourceInput source, IncidentStatusInput status, IncidentPriority priority, java.util.List<String> assigneeUrns) {
        this.type = type;
        this.customType = customType;
        this.title = title;
        this.description = description;
        this.resourceUrn = resourceUrn;
        this.resourceUrns = resourceUrns;
        this.startedAt = startedAt;
        this.source = source;
        this.status = status;
        this.priority = priority;
        this.assigneeUrns = assigneeUrns;
    }

    public IncidentType getType() {
        return type;
    }
    public void setType(IncidentType type) {
        this.type = type;
    }

    public String getCustomType() {
        return customType;
    }
    public void setCustomType(String customType) {
        this.customType = customType;
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

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public java.util.List<String> getResourceUrns() {
        return resourceUrns;
    }
    public void setResourceUrns(java.util.List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }

    public Long getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    public IncidentSourceInput getSource() {
        return source;
    }
    public void setSource(IncidentSourceInput source) {
        this.source = source;
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

    public java.util.List<String> getAssigneeUrns() {
        return assigneeUrns;
    }
    public void setAssigneeUrns(java.util.List<String> assigneeUrns) {
        this.assigneeUrns = assigneeUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (customType != null) {
            joiner.add("customType: \"" + customType + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        if (resourceUrns != null) {
            joiner.add("resourceUrns: " + resourceUrns);
        }
        if (startedAt != null) {
            joiner.add("startedAt: " + startedAt);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (priority != null) {
            joiner.add("priority: " + priority);
        }
        if (assigneeUrns != null) {
            joiner.add("assigneeUrns: " + assigneeUrns);
        }
        return joiner.toString();
    }

    public static RaiseIncidentInput.Builder builder() {
        return new RaiseIncidentInput.Builder();
    }

    public static class Builder {

        private IncidentType type;
        private String customType;
        private String title;
        private String description;
        private String resourceUrn;
        private java.util.List<String> resourceUrns;
        private Long startedAt;
        private IncidentSourceInput source;
        private IncidentStatusInput status;
        private IncidentPriority priority;
        private java.util.List<String> assigneeUrns;

        public Builder() {
        }

        public Builder setType(IncidentType type) {
            this.type = type;
            return this;
        }

        public Builder setCustomType(String customType) {
            this.customType = customType;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setResourceUrns(java.util.List<String> resourceUrns) {
            this.resourceUrns = resourceUrns;
            return this;
        }

        public Builder setStartedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        public Builder setSource(IncidentSourceInput source) {
            this.source = source;
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

        public Builder setAssigneeUrns(java.util.List<String> assigneeUrns) {
            this.assigneeUrns = assigneeUrns;
            return this;
        }


        public RaiseIncidentInput build() {
            return new RaiseIncidentInput(type, customType, title, description, resourceUrn, resourceUrns, startedAt, source, status, priority, assigneeUrns);
        }

    }
}
