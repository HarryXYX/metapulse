package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a DataProduct.
 */
public class CreateDataProductInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CreateDataProductPropertiesInput properties;
    @javax.annotation.Nonnull
    private String domainUrn;
    private String id;

    public CreateDataProductInput() {
    }

    public CreateDataProductInput(CreateDataProductPropertiesInput properties, String domainUrn, String id) {
        this.properties = properties;
        this.domainUrn = domainUrn;
        this.id = id;
    }

    public CreateDataProductPropertiesInput getProperties() {
        return properties;
    }
    public void setProperties(CreateDataProductPropertiesInput properties) {
        this.properties = properties;
    }

    public String getDomainUrn() {
        return domainUrn;
    }
    public void setDomainUrn(String domainUrn) {
        this.domainUrn = domainUrn;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (domainUrn != null) {
            joiner.add("domainUrn: \"" + domainUrn + "\"");
        }
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        return joiner.toString();
    }

    public static CreateDataProductInput.Builder builder() {
        return new CreateDataProductInput.Builder();
    }

    public static class Builder {

        private CreateDataProductPropertiesInput properties;
        private String domainUrn;
        private String id;

        public Builder() {
        }

        public Builder setProperties(CreateDataProductPropertiesInput properties) {
            this.properties = properties;
            return this;
        }

        public Builder setDomainUrn(String domainUrn) {
            this.domainUrn = domainUrn;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public CreateDataProductInput build() {
            return new CreateDataProductInput(properties, domainUrn, id);
        }

    }
}
