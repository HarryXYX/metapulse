package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when setting the Deprecation status for an Entity.
 */
public class UpdateDeprecationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private SubResourceType subResourceType;
    private String subResource;
    private boolean deprecated;
    private Long decommissionTime;
    private String note;
    private String replacement;

    public UpdateDeprecationInput() {
    }

    public UpdateDeprecationInput(String urn, SubResourceType subResourceType, String subResource, boolean deprecated, Long decommissionTime, String note, String replacement) {
        this.urn = urn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
        this.deprecated = deprecated;
        this.decommissionTime = decommissionTime;
        this.note = note;
        this.replacement = replacement;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public SubResourceType getSubResourceType() {
        return subResourceType;
    }
    public void setSubResourceType(SubResourceType subResourceType) {
        this.subResourceType = subResourceType;
    }

    public String getSubResource() {
        return subResource;
    }
    public void setSubResource(String subResource) {
        this.subResource = subResource;
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

    public String getReplacement() {
        return replacement;
    }
    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (subResourceType != null) {
            joiner.add("subResourceType: " + subResourceType);
        }
        if (subResource != null) {
            joiner.add("subResource: \"" + subResource + "\"");
        }
        joiner.add("deprecated: " + deprecated);
        if (decommissionTime != null) {
            joiner.add("decommissionTime: " + decommissionTime);
        }
        if (note != null) {
            joiner.add("note: \"" + note + "\"");
        }
        if (replacement != null) {
            joiner.add("replacement: \"" + replacement + "\"");
        }
        return joiner.toString();
    }

    public static UpdateDeprecationInput.Builder builder() {
        return new UpdateDeprecationInput.Builder();
    }

    public static class Builder {

        private String urn;
        private SubResourceType subResourceType;
        private String subResource;
        private boolean deprecated;
        private Long decommissionTime;
        private String note;
        private String replacement;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setSubResourceType(SubResourceType subResourceType) {
            this.subResourceType = subResourceType;
            return this;
        }

        public Builder setSubResource(String subResource) {
            this.subResource = subResource;
            return this;
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

        public Builder setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }


        public UpdateDeprecationInput build() {
            return new UpdateDeprecationInput(urn, subResourceType, subResource, deprecated, decommissionTime, note, replacement);
        }

    }
}
