package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to attach business attribute to an entity
 */
public class BusinessAttributeAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private BusinessAttribute businessAttribute;
    @javax.annotation.Nonnull
    private String associatedUrn;

    public BusinessAttributeAssociation() {
    }

    public BusinessAttributeAssociation(BusinessAttribute businessAttribute, String associatedUrn) {
        this.businessAttribute = businessAttribute;
        this.associatedUrn = associatedUrn;
    }

    /**
     * Business Attribute itself
     */
    public BusinessAttribute getBusinessAttribute() {
        return businessAttribute;
    }
    /**
     * Business Attribute itself
     */
    public void setBusinessAttribute(BusinessAttribute businessAttribute) {
        this.businessAttribute = businessAttribute;
    }

    /**
     * Reference back to the associated urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the associated urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (businessAttribute != null) {
            joiner.add("businessAttribute: " + businessAttribute);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        return joiner.toString();
    }

    public static BusinessAttributeAssociation.Builder builder() {
        return new BusinessAttributeAssociation.Builder();
    }

    public static class Builder {

        private BusinessAttribute businessAttribute;
        private String associatedUrn;

        public Builder() {
        }

        /**
         * Business Attribute itself
         */
        public Builder setBusinessAttribute(BusinessAttribute businessAttribute) {
            this.businessAttribute = businessAttribute;
            return this;
        }

        /**
         * Reference back to the associated urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }


        public BusinessAttributeAssociation build() {
            return new BusinessAttributeAssociation(businessAttribute, associatedUrn);
        }

    }
}
