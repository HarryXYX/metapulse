package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An institutional memory resource about a particular Metadata Entity
 */
public class InstitutionalMemoryMetadata implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String url;
    @javax.annotation.Nonnull
    private String label;
    @Deprecated
    @javax.annotation.Nonnull
    private CorpUser author;
    @javax.annotation.Nonnull
    private ResolvedActor actor;
    @javax.annotation.Nonnull
    private AuditStamp created;
    private AuditStamp updated;
    @Deprecated
    @javax.annotation.Nonnull
    private String description;
    @javax.annotation.Nonnull
    private String associatedUrn;
    private InstitutionalMemoryMetadataSettings settings;

    public InstitutionalMemoryMetadata() {
    }

    public InstitutionalMemoryMetadata(String url, String label, CorpUser author, ResolvedActor actor, AuditStamp created, AuditStamp updated, String description, String associatedUrn, InstitutionalMemoryMetadataSettings settings) {
        this.url = url;
        this.label = label;
        this.author = author;
        this.actor = actor;
        this.created = created;
        this.updated = updated;
        this.description = description;
        this.associatedUrn = associatedUrn;
        this.settings = settings;
    }

    /**
     * Link to a document or wiki page or another internal resource
     */
    public String getUrl() {
        return url;
    }
    /**
     * Link to a document or wiki page or another internal resource
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Label associated with the URL
     */
    public String getLabel() {
        return label;
    }
    /**
     * Label associated with the URL
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The author of this metadata
Deprecated! Use actor instead for users or groups.
     */
    @Deprecated
    public CorpUser getAuthor() {
        return author;
    }
    /**
     * The author of this metadata
Deprecated! Use actor instead for users or groups.
     */
    @Deprecated
    public void setAuthor(CorpUser author) {
        this.author = author;
    }

    /**
     * The author of this metadata
     */
    public ResolvedActor getActor() {
        return actor;
    }
    /**
     * The author of this metadata
     */
    public void setActor(ResolvedActor actor) {
        this.actor = actor;
    }

    /**
     * An AuditStamp corresponding to the creation of this resource
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this resource
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the updating of this resource
     */
    public AuditStamp getUpdated() {
        return updated;
    }
    /**
     * An AuditStamp corresponding to the updating of this resource
     */
    public void setUpdated(AuditStamp updated) {
        this.updated = updated;
    }

    /**
     * Deprecated, use label instead
Description of the resource
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use label instead
Description of the resource
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Reference back to the owned urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the owned urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }

    /**
     * Settings for this record of institutional memory
     */
    public InstitutionalMemoryMetadataSettings getSettings() {
        return settings;
    }
    /**
     * Settings for this record of institutional memory
     */
    public void setSettings(InstitutionalMemoryMetadataSettings settings) {
        this.settings = settings;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (url != null) {
            joiner.add("url: \"" + url + "\"");
        }
        if (label != null) {
            joiner.add("label: \"" + label + "\"");
        }
        if (author != null) {
            joiner.add("author: " + author);
        }
        if (actor != null) {
            joiner.add("actor: " + actor);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (updated != null) {
            joiner.add("updated: " + updated);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static InstitutionalMemoryMetadata.Builder builder() {
        return new InstitutionalMemoryMetadata.Builder();
    }

    public static class Builder {

        private String url;
        private String label;
        private CorpUser author;
        private ResolvedActor actor;
        private AuditStamp created;
        private AuditStamp updated;
        private String description;
        private String associatedUrn;
        private InstitutionalMemoryMetadataSettings settings;

        public Builder() {
        }

        /**
         * Link to a document or wiki page or another internal resource
         */
        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * Label associated with the URL
         */
        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * The author of this metadata
Deprecated! Use actor instead for users or groups.
         */
        @Deprecated
        public Builder setAuthor(CorpUser author) {
            this.author = author;
            return this;
        }

        /**
         * The author of this metadata
         */
        public Builder setActor(ResolvedActor actor) {
            this.actor = actor;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the updating of this resource
         */
        public Builder setUpdated(AuditStamp updated) {
            this.updated = updated;
            return this;
        }

        /**
         * Deprecated, use label instead
Description of the resource
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Reference back to the owned urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }

        /**
         * Settings for this record of institutional memory
         */
        public Builder setSettings(InstitutionalMemoryMetadataSettings settings) {
            this.settings = settings;
            return this;
        }


        public InstitutionalMemoryMetadata build() {
            return new InstitutionalMemoryMetadata(url, label, author, actor, created, updated, description, associatedUrn, settings);
        }

    }
}
