package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Info for a given asset summary element
 */
public class SummaryElement implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SummaryElementType elementType;
    private StructuredPropertyEntity structuredProperty;

    public SummaryElement() {
    }

    public SummaryElement(SummaryElementType elementType, StructuredPropertyEntity structuredProperty) {
        this.elementType = elementType;
        this.structuredProperty = structuredProperty;
    }

    /**
     * The type of element/property
     */
    public SummaryElementType getElementType() {
        return elementType;
    }
    /**
     * The type of element/property
     */
    public void setElementType(SummaryElementType elementType) {
        this.elementType = elementType;
    }

    /**
     * The structured property associated with this summary element if it is a STRUCTURED_PROPERTY type
     */
    public StructuredPropertyEntity getStructuredProperty() {
        return structuredProperty;
    }
    /**
     * The structured property associated with this summary element if it is a STRUCTURED_PROPERTY type
     */
    public void setStructuredProperty(StructuredPropertyEntity structuredProperty) {
        this.structuredProperty = structuredProperty;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (elementType != null) {
            joiner.add("elementType: " + elementType);
        }
        if (structuredProperty != null) {
            joiner.add("structuredProperty: " + structuredProperty);
        }
        return joiner.toString();
    }

    public static SummaryElement.Builder builder() {
        return new SummaryElement.Builder();
    }

    public static class Builder {

        private SummaryElementType elementType;
        private StructuredPropertyEntity structuredProperty;

        public Builder() {
        }

        /**
         * The type of element/property
         */
        public Builder setElementType(SummaryElementType elementType) {
            this.elementType = elementType;
            return this;
        }

        /**
         * The structured property associated with this summary element if it is a STRUCTURED_PROPERTY type
         */
        public Builder setStructuredProperty(StructuredPropertyEntity structuredProperty) {
            this.structuredProperty = structuredProperty;
            return this;
        }


        public SummaryElement build() {
            return new SummaryElement(elementType, structuredProperty);
        }

    }
}
