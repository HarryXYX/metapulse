package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input a row of a page template
 */
public class PageTemplateRowInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> modules;

    public PageTemplateRowInput() {
    }

    public PageTemplateRowInput(java.util.List<String> modules) {
        this.modules = modules;
    }

    public java.util.List<String> getModules() {
        return modules;
    }
    public void setModules(java.util.List<String> modules) {
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

    public static PageTemplateRowInput.Builder builder() {
        return new PageTemplateRowInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> modules;

        public Builder() {
        }

        public Builder setModules(java.util.List<String> modules) {
            this.modules = modules;
            return this;
        }


        public PageTemplateRowInput build() {
            return new PageTemplateRowInput(modules);
        }

    }
}
