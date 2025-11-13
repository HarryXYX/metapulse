package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Business attributes attached to the metadata
 */
public class BusinessAttributes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private BusinessAttributeAssociation businessAttribute;

    public BusinessAttributes() {
    }

    public BusinessAttributes(BusinessAttributeAssociation businessAttribute) {
        this.businessAttribute = businessAttribute;
    }

    /**
     * Business Attribute attached to the Metadata Entity
     */
    public BusinessAttributeAssociation getBusinessAttribute() {
        return businessAttribute;
    }
    /**
     * Business Attribute attached to the Metadata Entity
     */
    public void setBusinessAttribute(BusinessAttributeAssociation businessAttribute) {
        this.businessAttribute = businessAttribute;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (businessAttribute != null) {
            joiner.add("businessAttribute: " + businessAttribute);
        }
        return joiner.toString();
    }

    public static BusinessAttributes.Builder builder() {
        return new BusinessAttributes.Builder();
    }

    public static class Builder {

        private BusinessAttributeAssociation businessAttribute;

        public Builder() {
        }

        /**
         * Business Attribute attached to the Metadata Entity
         */
        public Builder setBusinessAttribute(BusinessAttributeAssociation businessAttribute) {
            this.businessAttribute = businessAttribute;
            return this;
        }


        public BusinessAttributes build() {
            return new BusinessAttributes(businessAttribute);
        }

    }
}
