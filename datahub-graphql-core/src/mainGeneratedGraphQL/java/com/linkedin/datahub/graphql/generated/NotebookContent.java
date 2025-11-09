package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The actual content in a Notebook
 */
public class NotebookContent implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<NotebookCell> cells;

    public NotebookContent() {
    }

    public NotebookContent(java.util.List<NotebookCell> cells) {
        this.cells = cells;
    }

    /**
     * The content of a Notebook which is composed by a list of NotebookCell
     */
    public java.util.List<NotebookCell> getCells() {
        return cells;
    }
    /**
     * The content of a Notebook which is composed by a list of NotebookCell
     */
    public void setCells(java.util.List<NotebookCell> cells) {
        this.cells = cells;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cells != null) {
            joiner.add("cells: " + cells);
        }
        return joiner.toString();
    }

    public static NotebookContent.Builder builder() {
        return new NotebookContent.Builder();
    }

    public static class Builder {

        private java.util.List<NotebookCell> cells;

        public Builder() {
        }

        /**
         * The content of a Notebook which is composed by a list of NotebookCell
         */
        public Builder setCells(java.util.List<NotebookCell> cells) {
            this.cells = cells;
            return this;
        }


        public NotebookContent build() {
            return new NotebookContent(cells);
        }

    }
}
