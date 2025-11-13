package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Global (platform-level) settings related to the doc propagation feature
 */
public class DocPropagationSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean docColumnPropagation;

    public DocPropagationSettings() {
    }

    public DocPropagationSettings(Boolean docColumnPropagation) {
        this.docColumnPropagation = docColumnPropagation;
    }

    /**
     * The default doc propagation setting for the platform.
     */
    public Boolean getDocColumnPropagation() {
        return docColumnPropagation;
    }
    /**
     * The default doc propagation setting for the platform.
     */
    public void setDocColumnPropagation(Boolean docColumnPropagation) {
        this.docColumnPropagation = docColumnPropagation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (docColumnPropagation != null) {
            joiner.add("docColumnPropagation: " + docColumnPropagation);
        }
        return joiner.toString();
    }

    public static DocPropagationSettings.Builder builder() {
        return new DocPropagationSettings.Builder();
    }

    public static class Builder {

        private Boolean docColumnPropagation;

        public Builder() {
        }

        /**
         * The default doc propagation setting for the platform.
         */
        public Builder setDocColumnPropagation(Boolean docColumnPropagation) {
            this.docColumnPropagation = docColumnPropagation;
            return this;
        }


        public DocPropagationSettings build() {
            return new DocPropagationSettings(docColumnPropagation);
        }

    }
}
