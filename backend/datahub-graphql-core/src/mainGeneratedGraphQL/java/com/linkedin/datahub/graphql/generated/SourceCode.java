package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SourceCode implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<SourceCodeUrl> sourceCode;

    public SourceCode() {
    }

    public SourceCode(java.util.List<SourceCodeUrl> sourceCode) {
        this.sourceCode = sourceCode;
    }

    /**
     * Source Code along with types
     */
    public java.util.List<SourceCodeUrl> getSourceCode() {
        return sourceCode;
    }
    /**
     * Source Code along with types
     */
    public void setSourceCode(java.util.List<SourceCodeUrl> sourceCode) {
        this.sourceCode = sourceCode;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (sourceCode != null) {
            joiner.add("sourceCode: " + sourceCode);
        }
        return joiner.toString();
    }

    public static SourceCode.Builder builder() {
        return new SourceCode.Builder();
    }

    public static class Builder {

        private java.util.List<SourceCodeUrl> sourceCode;

        public Builder() {
        }

        /**
         * Source Code along with types
         */
        public Builder setSourceCode(java.util.List<SourceCodeUrl> sourceCode) {
            this.sourceCode = sourceCode;
            return this;
        }


        public SourceCode build() {
            return new SourceCode(sourceCode);
        }

    }
}
