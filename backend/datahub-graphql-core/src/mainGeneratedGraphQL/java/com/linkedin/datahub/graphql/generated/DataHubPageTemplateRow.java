package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A row of modules contained in a template
 */
public class DataHubPageTemplateRow implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<DataHubPageModule> modules;

    public DataHubPageTemplateRow() {
    }

    public DataHubPageTemplateRow(java.util.List<DataHubPageModule> modules) {
        this.modules = modules;
    }

    /**
     * The modules that exist in this template row
     */
    public java.util.List<DataHubPageModule> getModules() {
        return modules;
    }
    /**
     * The modules that exist in this template row
     */
    public void setModules(java.util.List<DataHubPageModule> modules) {
        this.modules = modules;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (modules != null) {
            joiner.add("modules: " + modules);
        }
        return joiner.toString();
    }

    public static DataHubPageTemplateRow.Builder builder() {
        return new DataHubPageTemplateRow.Builder();
    }

    public static class Builder {

        private java.util.List<DataHubPageModule> modules;

        public Builder() {
        }

        /**
         * The modules that exist in this template row
         */
        public Builder setModules(java.util.List<DataHubPageModule> modules) {
            this.modules = modules;
            return this;
        }


        public DataHubPageTemplateRow build() {
            return new DataHubPageTemplateRow(modules);
        }

    }
}
