package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A summary element object for what to store on asset summaries
 */
public class SummaryElementInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SummaryElementType elementType;
    private String structuredPropertyUrn;

    public SummaryElementInput() {
    }

    public SummaryElementInput(SummaryElementType elementType, String structuredPropertyUrn) {
        this.elementType = elementType;
        this.structuredPropertyUrn = structuredPropertyUrn;
    }

    public SummaryElementType getElementType() {
        return elementType;
    }
    public void setElementType(SummaryElementType elementType) {
        this.elementType = elementType;
    }

    public String getStructuredPropertyUrn() {
        return structuredPropertyUrn;
    }
    public void setStructuredPropertyUrn(String structuredPropertyUrn) {
        this.structuredPropertyUrn = structuredPropertyUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (elementType != null) {
            joiner.add("elementType: " + elementType);
        }
        if (structuredPropertyUrn != null) {
            joiner.add("structuredPropertyUrn: \"" + structuredPropertyUrn + "\"");
        }
        return joiner.toString();
    }

    public static SummaryElementInput.Builder builder() {
        return new SummaryElementInput.Builder();
    }

    public static class Builder {

        private SummaryElementType elementType;
        private String structuredPropertyUrn;

        public Builder() {
        }

        public Builder setElementType(SummaryElementType elementType) {
            this.elementType = elementType;
            return this;
        }

        public Builder setStructuredPropertyUrn(String structuredPropertyUrn) {
            this.structuredPropertyUrn = structuredPropertyUrn;
            return this;
        }


        public SummaryElementInput build() {
            return new SummaryElementInput(elementType, structuredPropertyUrn);
        }

    }
}
