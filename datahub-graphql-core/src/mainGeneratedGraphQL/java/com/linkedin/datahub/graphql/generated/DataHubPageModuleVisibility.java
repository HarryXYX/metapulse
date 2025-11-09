package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Info about the visibility of this module
 */
public class DataHubPageModuleVisibility implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private PageModuleScope scope;

    public DataHubPageModuleVisibility() {
    }

    public DataHubPageModuleVisibility(PageModuleScope scope) {
        this.scope = scope;
    }

    /**
     * The scope of this module and who can use/see it
     */
    public PageModuleScope getScope() {
        return scope;
    }
    /**
     * The scope of this module and who can use/see it
     */
    public void setScope(PageModuleScope scope) {
        this.scope = scope;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (scope != null) {
            joiner.add("scope: " + scope);
        }
        return joiner.toString();
    }

    public static DataHubPageModuleVisibility.Builder builder() {
        return new DataHubPageModuleVisibility.Builder();
    }

    public static class Builder {

        private PageModuleScope scope;

        public Builder() {
        }

        /**
         * The scope of this module and who can use/see it
         */
        public Builder setScope(PageModuleScope scope) {
            this.scope = scope;
            return this;
        }


        public DataHubPageModuleVisibility build() {
            return new DataHubPageModuleVisibility(scope);
        }

    }
}
