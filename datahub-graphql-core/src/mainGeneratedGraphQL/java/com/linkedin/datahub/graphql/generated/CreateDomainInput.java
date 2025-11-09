package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create a new Domain.
 */
public class CreateDomainInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String parentDomain;

    public CreateDomainInput() {
    }

    public CreateDomainInput(String id, String name, String description, String parentDomain) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.parentDomain = parentDomain;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentDomain() {
        return parentDomain;
    }
    public void setParentDomain(String parentDomain) {
        this.parentDomain = parentDomain;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (parentDomain != null) {
            joiner.add("parentDomain: \"" + parentDomain + "\"");
        }
        return joiner.toString();
    }

    public static CreateDomainInput.Builder builder() {
        return new CreateDomainInput.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String parentDomain;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setParentDomain(String parentDomain) {
            this.parentDomain = parentDomain;
            return this;
        }


        public CreateDomainInput build() {
            return new CreateDomainInput(id, name, description, parentDomain);
        }

    }
}
