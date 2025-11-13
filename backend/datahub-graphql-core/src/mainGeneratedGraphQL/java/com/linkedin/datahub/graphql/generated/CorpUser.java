package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A DataHub User entity, which represents a Person on the Metadata Entity Graph
 */
public class CorpUser implements java.io.Serializable, OwnerType, ResolvedActor, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String username;
    private CorpUserProperties properties;
    private CorpUserEditableProperties editableProperties;
    private CorpUserStatus status;
    private GlobalTags tags;
    private EntityRelationshipsResult relationships;
    private Boolean isNativeUser;
    @Deprecated
    private CorpUserInfo info;
    @Deprecated
    private CorpUserEditableInfo editableInfo;
    @Deprecated
    private GlobalTags globalTags;
    private Boolean exists;
    private CorpUserSettings settings;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;

    public CorpUser() {
    }

    public CorpUser(String urn, EntityType type, String username, CorpUserProperties properties, CorpUserEditableProperties editableProperties, CorpUserStatus status, GlobalTags tags, EntityRelationshipsResult relationships, Boolean isNativeUser, CorpUserInfo info, CorpUserEditableInfo editableInfo, GlobalTags globalTags, Boolean exists, CorpUserSettings settings, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges) {
        this.urn = urn;
        this.type = type;
        this.username = username;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.status = status;
        this.tags = tags;
        this.relationships = relationships;
        this.isNativeUser = isNativeUser;
        this.info = info;
        this.editableInfo = editableInfo;
        this.globalTags = globalTags;
        this.exists = exists;
        this.settings = settings;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
    }

    /**
     * The primary key of the user
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the user
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * A username associated with the user
This uniquely identifies the user within DataHub
     */
    public String getUsername() {
        return username;
    }
    /**
     * A username associated with the user
This uniquely identifies the user within DataHub
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Additional read only properties about the corp user
     */
    public CorpUserProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the corp user
     */
    public void setProperties(CorpUserProperties properties) {
        this.properties = properties;
    }

    /**
     * Read write properties about the corp user
     */
    public CorpUserEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Read write properties about the corp user
     */
    public void setEditableProperties(CorpUserEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * The status of the user
     */
    public CorpUserStatus getStatus() {
        return status;
    }
    /**
     * The status of the user
     */
    public void setStatus(CorpUserStatus status) {
        this.status = status;
    }

    /**
     * The tags associated with the user
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the user
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Granular API for querying edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from this entity
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * Whether or not this user is a native DataHub user
     */
    public Boolean getIsNativeUser() {
        return isNativeUser;
    }
    /**
     * Whether or not this user is a native DataHub user
     */
    public void setIsNativeUser(Boolean isNativeUser) {
        this.isNativeUser = isNativeUser;
    }

    /**
     * Deprecated, use properties field instead
Additional read only info about the corp user
     */
    @Deprecated
    public CorpUserInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only info about the corp user
     */
    @Deprecated
    public void setInfo(CorpUserInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties field instead
Read write info about the corp user
     */
    @Deprecated
    public CorpUserEditableInfo getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties field instead
Read write info about the corp user
     */
    @Deprecated
    public void setEditableInfo(CorpUserEditableInfo editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use the tags field instead
The structured tags associated with the user
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use the tags field instead
The structured tags associated with the user
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Whether or not this entity exists on DataHub
     */
    public Boolean getExists() {
        return exists;
    }
    /**
     * Whether or not this entity exists on DataHub
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * Settings that a user can customize through the datahub ui
     */
    public CorpUserSettings getSettings() {
        return settings;
    }
    /**
     * Settings that a user can customize through the datahub ui
     */
    public void setSettings(CorpUserSettings settings) {
        this.settings = settings;
    }

    /**
     * Experimental API.
For fetching extra aspects that do not have custom UI code yet
     */
    public java.util.List<RawAspect> getAspects() {
        return aspects;
    }
    /**
     * Experimental API.
For fetching extra aspects that do not have custom UI code yet
     */
    public void setAspects(java.util.List<RawAspect> aspects) {
        this.aspects = aspects;
    }

    /**
     * Structured properties about this asset
     */
    public StructuredProperties getStructuredProperties() {
        return structuredProperties;
    }
    /**
     * Structured properties about this asset
     */
    public void setStructuredProperties(StructuredProperties structuredProperties) {
        this.structuredProperties = structuredProperties;
    }

    /**
     * The forms associated with the Dataset
     */
    public Forms getForms() {
        return forms;
    }
    /**
     * The forms associated with the Dataset
     */
    public void setForms(Forms forms) {
        this.forms = forms;
    }

    /**
     * Privileges given to a user relevant to this entity
     */
    public EntityPrivileges getPrivileges() {
        return privileges;
    }
    /**
     * Privileges given to a user relevant to this entity
     */
    public void setPrivileges(EntityPrivileges privileges) {
        this.privileges = privileges;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (username != null) {
            joiner.add("username: \"" + username + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (isNativeUser != null) {
            joiner.add("isNativeUser: " + isNativeUser);
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (editableInfo != null) {
            joiner.add("editableInfo: " + editableInfo);
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        if (structuredProperties != null) {
            joiner.add("structuredProperties: " + structuredProperties);
        }
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        return joiner.toString();
    }

    public static CorpUser.Builder builder() {
        return new CorpUser.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String username;
        private CorpUserProperties properties;
        private CorpUserEditableProperties editableProperties;
        private CorpUserStatus status;
        private GlobalTags tags;
        private EntityRelationshipsResult relationships;
        private Boolean isNativeUser;
        private CorpUserInfo info;
        private CorpUserEditableInfo editableInfo;
        private GlobalTags globalTags;
        private Boolean exists;
        private CorpUserSettings settings;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;

        public Builder() {
        }

        /**
         * The primary key of the user
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * A username associated with the user
This uniquely identifies the user within DataHub
         */
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        /**
         * Additional read only properties about the corp user
         */
        public Builder setProperties(CorpUserProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Read write properties about the corp user
         */
        public Builder setEditableProperties(CorpUserEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * The status of the user
         */
        public Builder setStatus(CorpUserStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The tags associated with the user
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Whether or not this user is a native DataHub user
         */
        public Builder setIsNativeUser(Boolean isNativeUser) {
            this.isNativeUser = isNativeUser;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only info about the corp user
         */
        @Deprecated
        public Builder setInfo(CorpUserInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties field instead
Read write info about the corp user
         */
        @Deprecated
        public Builder setEditableInfo(CorpUserEditableInfo editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use the tags field instead
The structured tags associated with the user
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Whether or not this entity exists on DataHub
         */
        public Builder setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * Settings that a user can customize through the datahub ui
         */
        public Builder setSettings(CorpUserSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * Experimental API.
For fetching extra aspects that do not have custom UI code yet
         */
        public Builder setAspects(java.util.List<RawAspect> aspects) {
            this.aspects = aspects;
            return this;
        }

        /**
         * Structured properties about this asset
         */
        public Builder setStructuredProperties(StructuredProperties structuredProperties) {
            this.structuredProperties = structuredProperties;
            return this;
        }

        /**
         * The forms associated with the Dataset
         */
        public Builder setForms(Forms forms) {
            this.forms = forms;
            return this;
        }

        /**
         * Privileges given to a user relevant to this entity
         */
        public Builder setPrivileges(EntityPrivileges privileges) {
            this.privileges = privileges;
            return this;
        }


        public CorpUser build() {
            return new CorpUser(urn, type, username, properties, editableProperties, status, tags, relationships, isNativeUser, info, editableInfo, globalTags, exists, settings, aspects, structuredProperties, forms, privileges);
        }

    }
}
