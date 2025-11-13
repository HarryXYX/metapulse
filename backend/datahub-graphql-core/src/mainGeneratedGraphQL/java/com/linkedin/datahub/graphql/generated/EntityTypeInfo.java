package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an individual entity type
 */
public class EntityTypeInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String qualifiedName;
    private String displayName;
    private String description;

    public EntityTypeInfo() {
    }

    public EntityTypeInfo(EntityType type, String qualifiedName, String displayName, String description) {
        this.type = type;
        this.qualifiedName = qualifiedName;
        this.displayName = displayName;
        this.description = description;
    }

    /**
     * The standard entity type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard entity type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The fully qualified name of the entity type. This includes its namespace
     */
    public String getQualifiedName() {
        return qualifiedName;
    }
    /**
     * The fully qualified name of the entity type. This includes its namespace
     */
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    /**
     * The display name of this type
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The display name of this type
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The description of this type
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of this type
     */
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (qualifiedName != null) {
            joiner.add("qualifiedName: \"" + qualifiedName + "\"");
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static EntityTypeInfo.Builder builder() {
        return new EntityTypeInfo.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String qualifiedName;
        private String displayName;
        private String description;

        public Builder() {
        }

        /**
         * The standard entity type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The fully qualified name of the entity type. This includes its namespace
         */
        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * The display name of this type
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The description of this type
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public EntityTypeInfo build() {
            return new EntityTypeInfo(type, qualifiedName, displayName, description);
        }

    }
}
