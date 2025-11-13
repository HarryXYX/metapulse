package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An update for the institutional memory information for a Metadata Entity
 */
public class InstitutionalMemoryUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<InstitutionalMemoryMetadataUpdate> elements;

    public InstitutionalMemoryUpdate() {
    }

    public InstitutionalMemoryUpdate(java.util.List<InstitutionalMemoryMetadataUpdate> elements) {
        this.elements = elements;
    }

    public java.util.List<InstitutionalMemoryMetadataUpdate> getElements() {
        return elements;
    }
    public void setElements(java.util.List<InstitutionalMemoryMetadataUpdate> elements) {
        this.elements = elements;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (elements != null) {
            joiner.add("elements: " + elements);
        }
        return joiner.toString();
    }

    public static InstitutionalMemoryUpdate.Builder builder() {
        return new InstitutionalMemoryUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<InstitutionalMemoryMetadataUpdate> elements;

        public Builder() {
        }

        public Builder setElements(java.util.List<InstitutionalMemoryMetadataUpdate> elements) {
            this.elements = elements;
            return this;
        }


        public InstitutionalMemoryUpdate build() {
            return new InstitutionalMemoryUpdate(elements);
        }

    }
}
