package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A definition of a Volume (row count) assertion.
 */
public class VolumeAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String entityUrn;
    @javax.annotation.Nonnull
    private VolumeAssertionType type;
    private RowCountTotal rowCountTotal;
    private RowCountChange rowCountChange;
    private IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal;
    private IncrementingSegmentRowCountChange incrementingSegmentRowCountChange;
    private DatasetFilter filter;

    public VolumeAssertionInfo() {
    }

    public VolumeAssertionInfo(String entityUrn, VolumeAssertionType type, RowCountTotal rowCountTotal, RowCountChange rowCountChange, IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal, IncrementingSegmentRowCountChange incrementingSegmentRowCountChange, DatasetFilter filter) {
        this.entityUrn = entityUrn;
        this.type = type;
        this.rowCountTotal = rowCountTotal;
        this.rowCountChange = rowCountChange;
        this.incrementingSegmentRowCountTotal = incrementingSegmentRowCountTotal;
        this.incrementingSegmentRowCountChange = incrementingSegmentRowCountChange;
        this.filter = filter;
    }

    /**
     * The entity targeted by this Volume check.
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The entity targeted by this Volume check.
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * The type of the freshness assertion being monitored.
     */
    public VolumeAssertionType getType() {
        return type;
    }
    /**
     * The type of the freshness assertion being monitored.
     */
    public void setType(VolumeAssertionType type) {
        this.type = type;
    }

    /**
     * Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.
Required if type is 'ROW_COUNT_TOTAL'.
     */
    public RowCountTotal getRowCountTotal() {
        return rowCountTotal;
    }
    /**
     * Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.
Required if type is 'ROW_COUNT_TOTAL'.
     */
    public void setRowCountTotal(RowCountTotal rowCountTotal) {
        this.rowCountTotal = rowCountTotal;
    }

    /**
     * Produce FAILURE Assertion Result if the row count delta of the asset does not meet specific requirements.
Required if type is 'ROW_COUNT_CHANGE'.
     */
    public RowCountChange getRowCountChange() {
        return rowCountChange;
    }
    /**
     * Produce FAILURE Assertion Result if the row count delta of the asset does not meet specific requirements.
Required if type is 'ROW_COUNT_CHANGE'.
     */
    public void setRowCountChange(RowCountChange rowCountChange) {
        this.rowCountChange = rowCountChange;
    }

    /**
     * Produce FAILURE Assertion Result if the latest incrementing segment row count total of the asset
does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'.
     */
    public IncrementingSegmentRowCountTotal getIncrementingSegmentRowCountTotal() {
        return incrementingSegmentRowCountTotal;
    }
    /**
     * Produce FAILURE Assertion Result if the latest incrementing segment row count total of the asset
does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'.
     */
    public void setIncrementingSegmentRowCountTotal(IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal) {
        this.incrementingSegmentRowCountTotal = incrementingSegmentRowCountTotal;
    }

    /**
     * Produce FAILURE Assertion Result if the incrementing segment row count delta of the asset
does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'.
     */
    public IncrementingSegmentRowCountChange getIncrementingSegmentRowCountChange() {
        return incrementingSegmentRowCountChange;
    }
    /**
     * Produce FAILURE Assertion Result if the incrementing segment row count delta of the asset
does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'.
     */
    public void setIncrementingSegmentRowCountChange(IncrementingSegmentRowCountChange incrementingSegmentRowCountChange) {
        this.incrementingSegmentRowCountChange = incrementingSegmentRowCountChange;
    }

    /**
     * A definition of the specific filters that should be applied, when performing monitoring.
If not provided, there is no filter, and the full table is under consideration.
     */
    public DatasetFilter getFilter() {
        return filter;
    }
    /**
     * A definition of the specific filters that should be applied, when performing monitoring.
If not provided, there is no filter, and the full table is under consideration.
     */
    public void setFilter(DatasetFilter filter) {
        this.filter = filter;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (rowCountTotal != null) {
            joiner.add("rowCountTotal: " + rowCountTotal);
        }
        if (rowCountChange != null) {
            joiner.add("rowCountChange: " + rowCountChange);
        }
        if (incrementingSegmentRowCountTotal != null) {
            joiner.add("incrementingSegmentRowCountTotal: " + incrementingSegmentRowCountTotal);
        }
        if (incrementingSegmentRowCountChange != null) {
            joiner.add("incrementingSegmentRowCountChange: " + incrementingSegmentRowCountChange);
        }
        if (filter != null) {
            joiner.add("filter: " + filter);
        }
        return joiner.toString();
    }

    public static VolumeAssertionInfo.Builder builder() {
        return new VolumeAssertionInfo.Builder();
    }

    public static class Builder {

        private String entityUrn;
        private VolumeAssertionType type;
        private RowCountTotal rowCountTotal;
        private RowCountChange rowCountChange;
        private IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal;
        private IncrementingSegmentRowCountChange incrementingSegmentRowCountChange;
        private DatasetFilter filter;

        public Builder() {
        }

        /**
         * The entity targeted by this Volume check.
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * The type of the freshness assertion being monitored.
         */
        public Builder setType(VolumeAssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.
Required if type is 'ROW_COUNT_TOTAL'.
         */
        public Builder setRowCountTotal(RowCountTotal rowCountTotal) {
            this.rowCountTotal = rowCountTotal;
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the row count delta of the asset does not meet specific requirements.
Required if type is 'ROW_COUNT_CHANGE'.
         */
        public Builder setRowCountChange(RowCountChange rowCountChange) {
            this.rowCountChange = rowCountChange;
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the latest incrementing segment row count total of the asset
does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'.
         */
        public Builder setIncrementingSegmentRowCountTotal(IncrementingSegmentRowCountTotal incrementingSegmentRowCountTotal) {
            this.incrementingSegmentRowCountTotal = incrementingSegmentRowCountTotal;
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the incrementing segment row count delta of the asset
does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'.
         */
        public Builder setIncrementingSegmentRowCountChange(IncrementingSegmentRowCountChange incrementingSegmentRowCountChange) {
            this.incrementingSegmentRowCountChange = incrementingSegmentRowCountChange;
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
If not provided, there is no filter, and the full table is under consideration.
         */
        public Builder setFilter(DatasetFilter filter) {
            this.filter = filter;
            return this;
        }


        public VolumeAssertionInfo build() {
            return new VolumeAssertionInfo(entityUrn, type, rowCountTotal, rowCountChange, incrementingSegmentRowCountTotal, incrementingSegmentRowCountChange, filter);
        }

    }
}
