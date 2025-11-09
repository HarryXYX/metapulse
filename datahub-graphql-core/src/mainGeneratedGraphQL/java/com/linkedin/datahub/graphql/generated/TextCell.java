package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Notebook cell which contains text as content
 */
public class TextCell implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String cellTitle;
    @javax.annotation.Nonnull
    private String cellId;
    private ChangeAuditStamps changeAuditStamps;
    @javax.annotation.Nonnull
    private String text;

    public TextCell() {
    }

    public TextCell(String cellTitle, String cellId, ChangeAuditStamps changeAuditStamps, String text) {
        this.cellTitle = cellTitle;
        this.cellId = cellId;
        this.changeAuditStamps = changeAuditStamps;
        this.text = text;
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

    /**
     * The actual text in a TextCell in a Notebook
     */
    public String getText() {
        return text;
    }
    /**
     * The actual text in a TextCell in a Notebook
     */
    public void setText(String text) {
        this.text = text;
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
        if (text != null) {
            joiner.add("text: \"" + text + "\"");
        }
        return joiner.toString();
    }

    public static TextCell.Builder builder() {
        return new TextCell.Builder();
    }

    public static class Builder {

        private String cellTitle;
        private String cellId;
        private ChangeAuditStamps changeAuditStamps;
        private String text;

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

        /**
         * The actual text in a TextCell in a Notebook
         */
        public Builder setText(String text) {
            this.text = text;
            return this;
        }


        public TextCell build() {
            return new TextCell(cellTitle, cellId, changeAuditStamps, text);
        }

    }
}
