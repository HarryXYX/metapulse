package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a Application.
 */
public class CreateApplicationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CreateApplicationPropertiesInput properties;
    private String domainUrn;
    private String id;

    public CreateApplicationInput() {
    }

    public CreateApplicationInput(CreateApplicationPropertiesInput properties, String domainUrn, String id) {
        this.properties = properties;
        this.domainUrn = domainUrn;
        this.id = id;
    }

    public CreateApplicationPropertiesInput getProperties() {
        return properties;
    }
    public void setProperties(CreateApplicationPropertiesInput properties) {
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

    public static CreateApplicationInput.Builder builder() {
        return new CreateApplicationInput.Builder();
    }

    public static class Builder {

        private CreateApplicationPropertiesInput properties;
        private String domainUrn;
        private String id;

        public Builder() {
        }

        public Builder setProperties(CreateApplicationPropertiesInput properties) {
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


        public CreateApplicationInput build() {
            return new CreateApplicationInput(properties, domainUrn, id);
        }

    }
}
