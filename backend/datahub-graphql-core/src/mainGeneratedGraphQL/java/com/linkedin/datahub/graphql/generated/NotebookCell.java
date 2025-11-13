package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The Union of every NotebookCell
 */
public class NotebookCell implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ChartCell chartCell;
    private TextCell textCell;
    private QueryCell queryChell;
    @javax.annotation.Nonnull
    private NotebookCellType type;

    public NotebookCell() {
    }

    public NotebookCell(ChartCell chartCell, TextCell textCell, QueryCell queryChell, NotebookCellType type) {
        this.chartCell = chartCell;
        this.textCell = textCell;
        this.queryChell = queryChell;
        this.type = type;
    }

    /**
     * The chart cell content. The will be non-null only when all other cell field is null.
     */
    public ChartCell getChartCell() {
        return chartCell;
    }
    /**
     * The chart cell content. The will be non-null only when all other cell field is null.
     */
    public void setChartCell(ChartCell chartCell) {
        this.chartCell = chartCell;
    }

    /**
     * The text cell content. The will be non-null only when all other cell field is null.
     */
    public TextCell getTextCell() {
        return textCell;
    }
    /**
     * The text cell content. The will be non-null only when all other cell field is null.
     */
    public void setTextCell(TextCell textCell) {
        this.textCell = textCell;
    }

    /**
     * The query cell content. The will be non-null only when all other cell field is null.
     */
    public QueryCell getQueryChell() {
        return queryChell;
    }
    /**
     * The query cell content. The will be non-null only when all other cell field is null.
     */
    public void setQueryChell(QueryCell queryChell) {
        this.queryChell = queryChell;
    }

    /**
     * The type of this Notebook cell
     */
    public NotebookCellType getType() {
        return type;
    }
    /**
     * The type of this Notebook cell
     */
    public void setType(NotebookCellType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (chartCell != null) {
            joiner.add("chartCell: " + chartCell);
        }
        if (textCell != null) {
            joiner.add("textCell: " + textCell);
        }
        if (queryChell != null) {
            joiner.add("queryChell: " + queryChell);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static NotebookCell.Builder builder() {
        return new NotebookCell.Builder();
    }

    public static class Builder {

        private ChartCell chartCell;
        private TextCell textCell;
        private QueryCell queryChell;
        private NotebookCellType type;

        public Builder() {
        }

        /**
         * The chart cell content. The will be non-null only when all other cell field is null.
         */
        public Builder setChartCell(ChartCell chartCell) {
            this.chartCell = chartCell;
            return this;
        }

        /**
         * The text cell content. The will be non-null only when all other cell field is null.
         */
        public Builder setTextCell(TextCell textCell) {
            this.textCell = textCell;
            return this;
        }

        /**
         * The query cell content. The will be non-null only when all other cell field is null.
         */
        public Builder setQueryChell(QueryCell queryChell) {
            this.queryChell = queryChell;
            return this;
        }

        /**
         * The type of this Notebook cell
         */
        public Builder setType(NotebookCellType type) {
            this.type = type;
            return this;
        }


        public NotebookCell build() {
            return new NotebookCell(chartCell, textCell, queryChell, type);
        }

    }
}
