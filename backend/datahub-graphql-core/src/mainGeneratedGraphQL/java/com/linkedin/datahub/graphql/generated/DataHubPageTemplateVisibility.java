package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Info about the visibility of this template
 */
public class DataHubPageTemplateVisibility implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private PageTemplateScope scope;

    public DataHubPageTemplateVisibility() {
    }

    public DataHubPageTemplateVisibility(PageTemplateScope scope) {
        this.scope = scope;
    }

    /**
     * The scope of this template and who can use/see it
     */
    public PageTemplateScope getScope() {
        return scope;
    }
    /**
     * The scope of this template and who can use/see it
     */
    public void setScope(PageTemplateScope scope) {
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

    public static DataHubPageTemplateVisibility.Builder builder() {
        return new DataHubPageTemplateVisibility.Builder();
    }

    public static class Builder {

        private PageTemplateScope scope;

        public Builder() {
        }

        /**
         * The scope of this template and who can use/see it
         */
        public Builder setScope(PageTemplateScope scope) {
            this.scope = scope;
            return this;
        }


        public DataHubPageTemplateVisibility build() {
            return new DataHubPageTemplateVisibility(scope);
        }

    }
}
