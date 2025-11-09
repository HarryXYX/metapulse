package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an individual data type
 */
public class DataTypeInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private StdDataType type;
    @javax.annotation.Nonnull
    private String qualifiedName;
    private String displayName;
    private String description;

    public DataTypeInfo() {
    }

    public DataTypeInfo(StdDataType type, String qualifiedName, String displayName, String description) {
        this.type = type;
        this.qualifiedName = qualifiedName;
        this.displayName = displayName;
        this.description = description;
    }

    /**
     * The standard data type
     */
    public StdDataType getType() {
        return type;
    }
    /**
     * The standard data type
     */
    public void setType(StdDataType type) {
        this.type = type;
    }

    /**
     * The fully qualified name of the type. This includes its namespace
     */
    public String getQualifiedName() {
        return qualifiedName;
    }
    /**
     * The fully qualified name of the type. This includes its namespace
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

    public static DataTypeInfo.Builder builder() {
        return new DataTypeInfo.Builder();
    }

    public static class Builder {

        private StdDataType type;
        private String qualifiedName;
        private String displayName;
        private String description;

        public Builder() {
        }

        /**
         * The standard data type
         */
        public Builder setType(StdDataType type) {
            this.type = type;
            return this;
        }

        /**
         * The fully qualified name of the type. This includes its namespace
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


        public DataTypeInfo build() {
            return new DataTypeInfo(type, qualifiedName, displayName, description);
        }

    }
}
