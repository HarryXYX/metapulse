package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when updating the soft-deleted status for a batch of assets
 */
public class BatchUpdateSoftDeletedInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> urns;
    private boolean deleted;

    public BatchUpdateSoftDeletedInput() {
    }

    public BatchUpdateSoftDeletedInput(java.util.List<String> urns, boolean deleted) {
        this.urns = urns;
        this.deleted = deleted;
    }

    public java.util.List<String> getUrns() {
        return urns;
    }
    public void setUrns(java.util.List<String> urns) {
        this.urns = urns;
    }

    public boolean getDeleted() {
        return deleted;
    }
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urns != null) {
            joiner.add("urns: " + urns);
        }
        joiner.add("deleted: " + deleted);
        return joiner.toString();
    }

    public static BatchUpdateSoftDeletedInput.Builder builder() {
        return new BatchUpdateSoftDeletedInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> urns;
        private boolean deleted;

        public Builder() {
        }

        public Builder setUrns(java.util.List<String> urns) {
            this.urns = urns;
            return this;
        }

        public Builder setDeleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }


        public BatchUpdateSoftDeletedInput build() {
            return new BatchUpdateSoftDeletedInput(urns, deleted);
        }

    }
}
