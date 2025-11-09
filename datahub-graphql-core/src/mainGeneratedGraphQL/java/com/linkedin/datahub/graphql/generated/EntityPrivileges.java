package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Shared privileges object across entities. Not all privileges apply to every entity.
 */
public class EntityPrivileges implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean canManageChildren;
    private Boolean canManageEntity;
    private Boolean canEditLineage;
    private Boolean canEditEmbed;
    private Boolean canEditQueries;
    private Boolean canEditProperties;
    private Boolean canEditTags;
    private Boolean canEditGlossaryTerms;
    private Boolean canEditDescription;
    private Boolean canEditLinks;
    private Boolean canEditDomains;
    private Boolean canEditDataProducts;
    private Boolean canEditOwners;
    private Boolean canEditIncidents;
    private Boolean canEditAssertions;
    private Boolean canEditDeprecation;
    private Boolean canEditSchemaFieldTags;
    private Boolean canEditSchemaFieldGlossaryTerms;
    private Boolean canEditSchemaFieldDescription;
    private Boolean canViewDatasetUsage;
    private Boolean canViewDatasetProfile;
    private Boolean canViewDatasetOperations;
    private Boolean canManageAssetSummary;

    public EntityPrivileges() {
    }

    public EntityPrivileges(Boolean canManageChildren, Boolean canManageEntity, Boolean canEditLineage, Boolean canEditEmbed, Boolean canEditQueries, Boolean canEditProperties, Boolean canEditTags, Boolean canEditGlossaryTerms, Boolean canEditDescription, Boolean canEditLinks, Boolean canEditDomains, Boolean canEditDataProducts, Boolean canEditOwners, Boolean canEditIncidents, Boolean canEditAssertions, Boolean canEditDeprecation, Boolean canEditSchemaFieldTags, Boolean canEditSchemaFieldGlossaryTerms, Boolean canEditSchemaFieldDescription, Boolean canViewDatasetUsage, Boolean canViewDatasetProfile, Boolean canViewDatasetOperations, Boolean canManageAssetSummary) {
        this.canManageChildren = canManageChildren;
        this.canManageEntity = canManageEntity;
        this.canEditLineage = canEditLineage;
        this.canEditEmbed = canEditEmbed;
        this.canEditQueries = canEditQueries;
        this.canEditProperties = canEditProperties;
        this.canEditTags = canEditTags;
        this.canEditGlossaryTerms = canEditGlossaryTerms;
        this.canEditDescription = canEditDescription;
        this.canEditLinks = canEditLinks;
        this.canEditDomains = canEditDomains;
        this.canEditDataProducts = canEditDataProducts;
        this.canEditOwners = canEditOwners;
        this.canEditIncidents = canEditIncidents;
        this.canEditAssertions = canEditAssertions;
        this.canEditDeprecation = canEditDeprecation;
        this.canEditSchemaFieldTags = canEditSchemaFieldTags;
        this.canEditSchemaFieldGlossaryTerms = canEditSchemaFieldGlossaryTerms;
        this.canEditSchemaFieldDescription = canEditSchemaFieldDescription;
        this.canViewDatasetUsage = canViewDatasetUsage;
        this.canViewDatasetProfile = canViewDatasetProfile;
        this.canViewDatasetOperations = canViewDatasetOperations;
        this.canManageAssetSummary = canManageAssetSummary;
    }

    /**
     * Whether or not a user can create child entities under a parent entity.
For example, can one create Terms/Node sunder a Glossary Node.
     */
    public Boolean getCanManageChildren() {
        return canManageChildren;
    }
    /**
     * Whether or not a user can create child entities under a parent entity.
For example, can one create Terms/Node sunder a Glossary Node.
     */
    public void setCanManageChildren(Boolean canManageChildren) {
        this.canManageChildren = canManageChildren;
    }

    /**
     * Whether or not a user can delete or move this entity.
     */
    public Boolean getCanManageEntity() {
        return canManageEntity;
    }
    /**
     * Whether or not a user can delete or move this entity.
     */
    public void setCanManageEntity(Boolean canManageEntity) {
        this.canManageEntity = canManageEntity;
    }

    /**
     * Whether or not a user can create or delete lineage edges for an entity.
     */
    public Boolean getCanEditLineage() {
        return canEditLineage;
    }
    /**
     * Whether or not a user can create or delete lineage edges for an entity.
     */
    public void setCanEditLineage(Boolean canEditLineage) {
        this.canEditLineage = canEditLineage;
    }

    /**
     * Whether or not a user update the embed information
     */
    public Boolean getCanEditEmbed() {
        return canEditEmbed;
    }
    /**
     * Whether or not a user update the embed information
     */
    public void setCanEditEmbed(Boolean canEditEmbed) {
        this.canEditEmbed = canEditEmbed;
    }

    /**
     * Whether or not a user can update the Queries for the entity (e.g. dataset)
     */
    public Boolean getCanEditQueries() {
        return canEditQueries;
    }
    /**
     * Whether or not a user can update the Queries for the entity (e.g. dataset)
     */
    public void setCanEditQueries(Boolean canEditQueries) {
        this.canEditQueries = canEditQueries;
    }

    /**
     * Whether or not a user can update the properties for the entity (e.g. dataset)
     */
    public Boolean getCanEditProperties() {
        return canEditProperties;
    }
    /**
     * Whether or not a user can update the properties for the entity (e.g. dataset)
     */
    public void setCanEditProperties(Boolean canEditProperties) {
        this.canEditProperties = canEditProperties;
    }

    /**
     * Whether or not a user can update tags for the entity
     */
    public Boolean getCanEditTags() {
        return canEditTags;
    }
    /**
     * Whether or not a user can update tags for the entity
     */
    public void setCanEditTags(Boolean canEditTags) {
        this.canEditTags = canEditTags;
    }

    /**
     * Whether or not a user can update glossary terms for the entity
     */
    public Boolean getCanEditGlossaryTerms() {
        return canEditGlossaryTerms;
    }
    /**
     * Whether or not a user can update glossary terms for the entity
     */
    public void setCanEditGlossaryTerms(Boolean canEditGlossaryTerms) {
        this.canEditGlossaryTerms = canEditGlossaryTerms;
    }

    /**
     * Whether or not a user can update the description for the entity
     */
    public Boolean getCanEditDescription() {
        return canEditDescription;
    }
    /**
     * Whether or not a user can update the description for the entity
     */
    public void setCanEditDescription(Boolean canEditDescription) {
        this.canEditDescription = canEditDescription;
    }

    /**
     * Whether or not a user can update the links for the entity
     */
    public Boolean getCanEditLinks() {
        return canEditLinks;
    }
    /**
     * Whether or not a user can update the links for the entity
     */
    public void setCanEditLinks(Boolean canEditLinks) {
        this.canEditLinks = canEditLinks;
    }

    /**
     * Whether or not a user can update the domain(s) for the entity
     */
    public Boolean getCanEditDomains() {
        return canEditDomains;
    }
    /**
     * Whether or not a user can update the domain(s) for the entity
     */
    public void setCanEditDomains(Boolean canEditDomains) {
        this.canEditDomains = canEditDomains;
    }

    /**
     * Whether or not a user can update the data product(s) that the entity belongs to
     */
    public Boolean getCanEditDataProducts() {
        return canEditDataProducts;
    }
    /**
     * Whether or not a user can update the data product(s) that the entity belongs to
     */
    public void setCanEditDataProducts(Boolean canEditDataProducts) {
        this.canEditDataProducts = canEditDataProducts;
    }

    /**
     * Whether or not a user can update the owners for the entity
     */
    public Boolean getCanEditOwners() {
        return canEditOwners;
    }
    /**
     * Whether or not a user can update the owners for the entity
     */
    public void setCanEditOwners(Boolean canEditOwners) {
        this.canEditOwners = canEditOwners;
    }

    /**
     * Whether or not a user can update the incidents for an asset
     */
    public Boolean getCanEditIncidents() {
        return canEditIncidents;
    }
    /**
     * Whether or not a user can update the incidents for an asset
     */
    public void setCanEditIncidents(Boolean canEditIncidents) {
        this.canEditIncidents = canEditIncidents;
    }

    /**
     * Whether or not a user can update assertions for an asset
     */
    public Boolean getCanEditAssertions() {
        return canEditAssertions;
    }
    /**
     * Whether or not a user can update assertions for an asset
     */
    public void setCanEditAssertions(Boolean canEditAssertions) {
        this.canEditAssertions = canEditAssertions;
    }

    /**
     * Whether or not a user can update the deprecation status for an entity
     */
    public Boolean getCanEditDeprecation() {
        return canEditDeprecation;
    }
    /**
     * Whether or not a user can update the deprecation status for an entity
     */
    public void setCanEditDeprecation(Boolean canEditDeprecation) {
        this.canEditDeprecation = canEditDeprecation;
    }

    /**
     * Whether or not a user can update the schema field tags for a dataset
     */
    public Boolean getCanEditSchemaFieldTags() {
        return canEditSchemaFieldTags;
    }
    /**
     * Whether or not a user can update the schema field tags for a dataset
     */
    public void setCanEditSchemaFieldTags(Boolean canEditSchemaFieldTags) {
        this.canEditSchemaFieldTags = canEditSchemaFieldTags;
    }

    /**
     * Whether or not a user can update the schema field tags for a dataset
     */
    public Boolean getCanEditSchemaFieldGlossaryTerms() {
        return canEditSchemaFieldGlossaryTerms;
    }
    /**
     * Whether or not a user can update the schema field tags for a dataset
     */
    public void setCanEditSchemaFieldGlossaryTerms(Boolean canEditSchemaFieldGlossaryTerms) {
        this.canEditSchemaFieldGlossaryTerms = canEditSchemaFieldGlossaryTerms;
    }

    /**
     * Whether or not a user can update the schema field tags for a dataset
     */
    public Boolean getCanEditSchemaFieldDescription() {
        return canEditSchemaFieldDescription;
    }
    /**
     * Whether or not a user can update the schema field tags for a dataset
     */
    public void setCanEditSchemaFieldDescription(Boolean canEditSchemaFieldDescription) {
        this.canEditSchemaFieldDescription = canEditSchemaFieldDescription;
    }

    /**
     * Whether the user can view dataset usage stats
     */
    public Boolean getCanViewDatasetUsage() {
        return canViewDatasetUsage;
    }
    /**
     * Whether the user can view dataset usage stats
     */
    public void setCanViewDatasetUsage(Boolean canViewDatasetUsage) {
        this.canViewDatasetUsage = canViewDatasetUsage;
    }

    /**
     * Whether the user can view dataset profiling stats
     */
    public Boolean getCanViewDatasetProfile() {
        return canViewDatasetProfile;
    }
    /**
     * Whether the user can view dataset profiling stats
     */
    public void setCanViewDatasetProfile(Boolean canViewDatasetProfile) {
        this.canViewDatasetProfile = canViewDatasetProfile;
    }

    /**
     * Whether the user can view dataset operations
     */
    public Boolean getCanViewDatasetOperations() {
        return canViewDatasetOperations;
    }
    /**
     * Whether the user can view dataset operations
     */
    public void setCanViewDatasetOperations(Boolean canViewDatasetOperations) {
        this.canViewDatasetOperations = canViewDatasetOperations;
    }

    /**
     * Whether the user can manage asset summary
     */
    public Boolean getCanManageAssetSummary() {
        return canManageAssetSummary;
    }
    /**
     * Whether the user can manage asset summary
     */
    public void setCanManageAssetSummary(Boolean canManageAssetSummary) {
        this.canManageAssetSummary = canManageAssetSummary;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (canManageChildren != null) {
            joiner.add("canManageChildren: " + canManageChildren);
        }
        if (canManageEntity != null) {
            joiner.add("canManageEntity: " + canManageEntity);
        }
        if (canEditLineage != null) {
            joiner.add("canEditLineage: " + canEditLineage);
        }
        if (canEditEmbed != null) {
            joiner.add("canEditEmbed: " + canEditEmbed);
        }
        if (canEditQueries != null) {
            joiner.add("canEditQueries: " + canEditQueries);
        }
        if (canEditProperties != null) {
            joiner.add("canEditProperties: " + canEditProperties);
        }
        if (canEditTags != null) {
            joiner.add("canEditTags: " + canEditTags);
        }
        if (canEditGlossaryTerms != null) {
            joiner.add("canEditGlossaryTerms: " + canEditGlossaryTerms);
        }
        if (canEditDescription != null) {
            joiner.add("canEditDescription: " + canEditDescription);
        }
        if (canEditLinks != null) {
            joiner.add("canEditLinks: " + canEditLinks);
        }
        if (canEditDomains != null) {
            joiner.add("canEditDomains: " + canEditDomains);
        }
        if (canEditDataProducts != null) {
            joiner.add("canEditDataProducts: " + canEditDataProducts);
        }
        if (canEditOwners != null) {
            joiner.add("canEditOwners: " + canEditOwners);
        }
        if (canEditIncidents != null) {
            joiner.add("canEditIncidents: " + canEditIncidents);
        }
        if (canEditAssertions != null) {
            joiner.add("canEditAssertions: " + canEditAssertions);
        }
        if (canEditDeprecation != null) {
            joiner.add("canEditDeprecation: " + canEditDeprecation);
        }
        if (canEditSchemaFieldTags != null) {
            joiner.add("canEditSchemaFieldTags: " + canEditSchemaFieldTags);
        }
        if (canEditSchemaFieldGlossaryTerms != null) {
            joiner.add("canEditSchemaFieldGlossaryTerms: " + canEditSchemaFieldGlossaryTerms);
        }
        if (canEditSchemaFieldDescription != null) {
            joiner.add("canEditSchemaFieldDescription: " + canEditSchemaFieldDescription);
        }
        if (canViewDatasetUsage != null) {
            joiner.add("canViewDatasetUsage: " + canViewDatasetUsage);
        }
        if (canViewDatasetProfile != null) {
            joiner.add("canViewDatasetProfile: " + canViewDatasetProfile);
        }
        if (canViewDatasetOperations != null) {
            joiner.add("canViewDatasetOperations: " + canViewDatasetOperations);
        }
        if (canManageAssetSummary != null) {
            joiner.add("canManageAssetSummary: " + canManageAssetSummary);
        }
        return joiner.toString();
    }

    public static EntityPrivileges.Builder builder() {
        return new EntityPrivileges.Builder();
    }

    public static class Builder {

        private Boolean canManageChildren;
        private Boolean canManageEntity;
        private Boolean canEditLineage;
        private Boolean canEditEmbed;
        private Boolean canEditQueries;
        private Boolean canEditProperties;
        private Boolean canEditTags;
        private Boolean canEditGlossaryTerms;
        private Boolean canEditDescription;
        private Boolean canEditLinks;
        private Boolean canEditDomains;
        private Boolean canEditDataProducts;
        private Boolean canEditOwners;
        private Boolean canEditIncidents;
        private Boolean canEditAssertions;
        private Boolean canEditDeprecation;
        private Boolean canEditSchemaFieldTags;
        private Boolean canEditSchemaFieldGlossaryTerms;
        private Boolean canEditSchemaFieldDescription;
        private Boolean canViewDatasetUsage;
        private Boolean canViewDatasetProfile;
        private Boolean canViewDatasetOperations;
        private Boolean canManageAssetSummary;

        public Builder() {
        }

        /**
         * Whether or not a user can create child entities under a parent entity.
For example, can one create Terms/Node sunder a Glossary Node.
         */
        public Builder setCanManageChildren(Boolean canManageChildren) {
            this.canManageChildren = canManageChildren;
            return this;
        }

        /**
         * Whether or not a user can delete or move this entity.
         */
        public Builder setCanManageEntity(Boolean canManageEntity) {
            this.canManageEntity = canManageEntity;
            return this;
        }

        /**
         * Whether or not a user can create or delete lineage edges for an entity.
         */
        public Builder setCanEditLineage(Boolean canEditLineage) {
            this.canEditLineage = canEditLineage;
            return this;
        }

        /**
         * Whether or not a user update the embed information
         */
        public Builder setCanEditEmbed(Boolean canEditEmbed) {
            this.canEditEmbed = canEditEmbed;
            return this;
        }

        /**
         * Whether or not a user can update the Queries for the entity (e.g. dataset)
         */
        public Builder setCanEditQueries(Boolean canEditQueries) {
            this.canEditQueries = canEditQueries;
            return this;
        }

        /**
         * Whether or not a user can update the properties for the entity (e.g. dataset)
         */
        public Builder setCanEditProperties(Boolean canEditProperties) {
            this.canEditProperties = canEditProperties;
            return this;
        }

        /**
         * Whether or not a user can update tags for the entity
         */
        public Builder setCanEditTags(Boolean canEditTags) {
            this.canEditTags = canEditTags;
            return this;
        }

        /**
         * Whether or not a user can update glossary terms for the entity
         */
        public Builder setCanEditGlossaryTerms(Boolean canEditGlossaryTerms) {
            this.canEditGlossaryTerms = canEditGlossaryTerms;
            return this;
        }

        /**
         * Whether or not a user can update the description for the entity
         */
        public Builder setCanEditDescription(Boolean canEditDescription) {
            this.canEditDescription = canEditDescription;
            return this;
        }

        /**
         * Whether or not a user can update the links for the entity
         */
        public Builder setCanEditLinks(Boolean canEditLinks) {
            this.canEditLinks = canEditLinks;
            return this;
        }

        /**
         * Whether or not a user can update the domain(s) for the entity
         */
        public Builder setCanEditDomains(Boolean canEditDomains) {
            this.canEditDomains = canEditDomains;
            return this;
        }

        /**
         * Whether or not a user can update the data product(s) that the entity belongs to
         */
        public Builder setCanEditDataProducts(Boolean canEditDataProducts) {
            this.canEditDataProducts = canEditDataProducts;
            return this;
        }

        /**
         * Whether or not a user can update the owners for the entity
         */
        public Builder setCanEditOwners(Boolean canEditOwners) {
            this.canEditOwners = canEditOwners;
            return this;
        }

        /**
         * Whether or not a user can update the incidents for an asset
         */
        public Builder setCanEditIncidents(Boolean canEditIncidents) {
            this.canEditIncidents = canEditIncidents;
            return this;
        }

        /**
         * Whether or not a user can update assertions for an asset
         */
        public Builder setCanEditAssertions(Boolean canEditAssertions) {
            this.canEditAssertions = canEditAssertions;
            return this;
        }

        /**
         * Whether or not a user can update the deprecation status for an entity
         */
        public Builder setCanEditDeprecation(Boolean canEditDeprecation) {
            this.canEditDeprecation = canEditDeprecation;
            return this;
        }

        /**
         * Whether or not a user can update the schema field tags for a dataset
         */
        public Builder setCanEditSchemaFieldTags(Boolean canEditSchemaFieldTags) {
            this.canEditSchemaFieldTags = canEditSchemaFieldTags;
            return this;
        }

        /**
         * Whether or not a user can update the schema field tags for a dataset
         */
        public Builder setCanEditSchemaFieldGlossaryTerms(Boolean canEditSchemaFieldGlossaryTerms) {
            this.canEditSchemaFieldGlossaryTerms = canEditSchemaFieldGlossaryTerms;
            return this;
        }

        /**
         * Whether or not a user can update the schema field tags for a dataset
         */
        public Builder setCanEditSchemaFieldDescription(Boolean canEditSchemaFieldDescription) {
            this.canEditSchemaFieldDescription = canEditSchemaFieldDescription;
            return this;
        }

        /**
         * Whether the user can view dataset usage stats
         */
        public Builder setCanViewDatasetUsage(Boolean canViewDatasetUsage) {
            this.canViewDatasetUsage = canViewDatasetUsage;
            return this;
        }

        /**
         * Whether the user can view dataset profiling stats
         */
        public Builder setCanViewDatasetProfile(Boolean canViewDatasetProfile) {
            this.canViewDatasetProfile = canViewDatasetProfile;
            return this;
        }

        /**
         * Whether the user can view dataset operations
         */
        public Builder setCanViewDatasetOperations(Boolean canViewDatasetOperations) {
            this.canViewDatasetOperations = canViewDatasetOperations;
            return this;
        }

        /**
         * Whether the user can manage asset summary
         */
        public Builder setCanManageAssetSummary(Boolean canManageAssetSummary) {
            this.canManageAssetSummary = canManageAssetSummary;
            return this;
        }


        public EntityPrivileges build() {
            return new EntityPrivileges(canManageChildren, canManageEntity, canEditLineage, canEditEmbed, canEditQueries, canEditProperties, canEditTags, canEditGlossaryTerms, canEditDescription, canEditLinks, canEditDomains, canEditDataProducts, canEditOwners, canEditIncidents, canEditAssertions, canEditDeprecation, canEditSchemaFieldTags, canEditSchemaFieldGlossaryTerms, canEditSchemaFieldDescription, canViewDatasetUsage, canViewDatasetProfile, canViewDatasetOperations, canManageAssetSummary);
        }

    }
}
