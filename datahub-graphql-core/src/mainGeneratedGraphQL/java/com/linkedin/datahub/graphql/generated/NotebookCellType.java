package com.linkedin.datahub.graphql.generated;

/**
 * The type for a NotebookCell
 */
public enum NotebookCellType {

    /**
     * TEXT Notebook cell type. The cell context is text only.
     */
    TEXT_CELL("TEXT_CELL"),
    /**
     * QUERY Notebook cell type. The cell context is query only.
     */
    QUERY_CELL("QUERY_CELL"),
    /**
     * CHART Notebook cell type. The cell content is chart only.
     */
    CHART_CELL("CHART_CELL");

    private final String graphqlName;

    private NotebookCellType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
