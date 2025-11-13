package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for creating or updating a DataHub page module
 */
public class UpsertPageModuleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String urn;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataHubPageModuleType type;
    @javax.annotation.Nonnull
    private PageModuleScope scope;
    @javax.annotation.Nonnull
    private PageModuleParamsInput params;

    public UpsertPageModuleInput() {
    }

    public UpsertPageModuleInput(String urn, String name, DataHubPageModuleType type, PageModuleScope scope, PageModuleParamsInput params) {
        this.urn = urn;
        this.name = name;
        this.type = type;
        this.scope = scope;
        this.params = params;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DataHubPageModuleType getType() {
        return type;
    }
    public void setType(DataHubPageModuleType type) {
        this.type = type;
    }

    public PageModuleScope getScope() {
        return scope;
    }
    public void setScope(PageModuleScope scope) {
        this.scope = scope;
    }

    public PageModuleParamsInput getParams() {
        return params;
    }
    public void setParams(PageModuleParamsInput params) {
        this.params = params;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (scope != null) {
            joiner.add("scope: " + scope);
        }
        if (params != null) {
            joiner.add("params: " + params);
        }
        return joiner.toString();
    }

    public static UpsertPageModuleInput.Builder builder() {
        return new UpsertPageModuleInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private DataHubPageModuleType type;
        private PageModuleScope scope;
        private PageModuleParamsInput params;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(DataHubPageModuleType type) {
            this.type = type;
            return this;
        }

        public Builder setScope(PageModuleScope scope) {
            this.scope = scope;
            return this;
        }

        public Builder setParams(PageModuleParamsInput params) {
            this.params = params;
            return this;
        }


        public UpsertPageModuleInput build() {
            return new UpsertPageModuleInput(urn, name, type, scope, params);
        }

    }
}
