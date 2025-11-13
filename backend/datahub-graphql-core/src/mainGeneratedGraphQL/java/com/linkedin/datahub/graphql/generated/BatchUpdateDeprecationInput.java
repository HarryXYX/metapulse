package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when updating the deprecation status for a batch of assets.
 */
public class BatchUpdateDeprecationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean deprecated;
    private Long decommissionTime;
    private String note;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resources;
    private String replacement;

    public BatchUpdateDeprecationInput() {
    }

    public BatchUpdateDeprecationInput(boolean deprecated, Long decommissionTime, String note, java.util.List<ResourceRefInput> resources, String replacement) {
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
        this.resources = resources;
        this.replacement = replacement;
    }

    public boolean getDeprecated() {
        return deprecated;
    }
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Long getDecommissionTime() {
        return decommissionTime;
    }
    public void setDecommissionTime(Long decommissionTime) {
        this.decommissionTime = decommissionTime;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public java.util.List<ResourceRefInput> getResources() {
        return resources;
    }
    public void setResources(java.util.List<ResourceRefInput> resources) {
        this.resources = resources;
    }

    public String getReplacement() {
        return replacement;
    }
    public void setReplacement(String replacement) {
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
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        if (replacement != null) {
            joiner.add("replacement: \"" + replacement + "\"");
        }
        return joiner.toString();
    }

    public static BatchUpdateDeprecationInput.Builder builder() {
        return new BatchUpdateDeprecationInput.Builder();
    }

    public static class Builder {

        private boolean deprecated;
        private Long decommissionTime;
        private String note;
        private java.util.List<ResourceRefInput> resources;
        private String replacement;

        public Builder() {
        }

        public Builder setDeprecated(boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        public Builder setDecommissionTime(Long decommissionTime) {
            this.decommissionTime = decommissionTime;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setResources(java.util.List<ResourceRefInput> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }


        public BatchUpdateDeprecationInput build() {
            return new BatchUpdateDeprecationInput(deprecated, decommissionTime, note, resources, replacement);
        }

    }
}
