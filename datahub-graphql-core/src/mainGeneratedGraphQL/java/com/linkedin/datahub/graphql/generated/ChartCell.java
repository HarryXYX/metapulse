package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Notebook cell which contains chart as content
 */
public class ChartCell implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String cellTitle;
    @javax.annotation.Nonnull
    private String cellId;
    private ChangeAuditStamps changeAuditStamps;

    public ChartCell() {
    }

    public ChartCell(String cellTitle, String cellId, ChangeAuditStamps changeAuditStamps) {
        this.cellTitle = cellTitle;
        this.cellId = cellId;
        this.changeAuditStamps = changeAuditStamps;
    }

    /**
     * Title of the cell
     */
    public String getCellTitle() {
        return cellTitle;
    }
    /**
     * Title of the cell
     */
    public void setCellTitle(String cellTitle) {
        this.cellTitle = cellTitle;
    }

    /**
     * Unique id for the cell.
     */
    public String getCellId() {
        return cellId;
    }
    /**
     * Unique id for the cell.
     */
    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    /**
     * Captures information about who created/last modified/deleted this TextCell and when
     */
    public ChangeAuditStamps getChangeAuditStamps() {
        return changeAuditStamps;
    }
    /**
     * Captures information about who created/last modified/deleted this TextCell and when
     */
    public void setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
        this.changeAuditStamps = changeAuditStamps;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cellTitle != null) {
            joiner.add("cellTitle: \"" + cellTitle + "\"");
        }
        if (cellId != null) {
            joiner.add("cellId: \"" + cellId + "\"");
        }
        if (changeAuditStamps != null) {
            joiner.add("changeAuditStamps: " + changeAuditStamps);
        }
        return joiner.toString();
    }

    public static ChartCell.Builder builder() {
        return new ChartCell.Builder();
    }

    public static class Builder {

        private String cellTitle;
        private String cellId;
        private ChangeAuditStamps changeAuditStamps;

        public Builder() {
        }

        /**
         * Title of the cell
         */
        public Builder setCellTitle(String cellTitle) {
            this.cellTitle = cellTitle;
            return this;
        }

        /**
         * Unique id for the cell.
         */
        public Builder setCellId(String cellId) {
            this.cellId = cellId;
            return this;
        }

        /**
         * Captures information about who created/last modified/deleted this TextCell and when
         */
        public Builder setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
            this.changeAuditStamps = changeAuditStamps;
            return this;
        }


        public ChartCell build() {
            return new ChartCell(cellTitle, cellId, changeAuditStamps);
        }

    }
}
