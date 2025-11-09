package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about the partition being profiled
 */
public class PartitionSpec implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PartitionType type;
    private String partition;
    private TimeWindow timePartition;

    public PartitionSpec() {
    }

    public PartitionSpec(PartitionType type, String partition, TimeWindow timePartition) {
        this.type = type;
        this.partition = partition;
        this.timePartition = timePartition;
    }

    /**
     * The partition type
     */
    public PartitionType getType() {
        return type;
    }
    /**
     * The partition type
     */
    public void setType(PartitionType type) {
        this.type = type;
    }

    /**
     * The partition identifier
     */
    public String getPartition() {
        return partition;
    }
    /**
     * The partition identifier
     */
    public void setPartition(String partition) {
        this.partition = partition;
    }

    /**
     * The optional time window partition information - required if type is TIMESTAMP_FIELD.
     */
    public TimeWindow getTimePartition() {
        return timePartition;
    }
    /**
     * The optional time window partition information - required if type is TIMESTAMP_FIELD.
     */
    public void setTimePartition(TimeWindow timePartition) {
        this.timePartition = timePartition;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (partition != null) {
            joiner.add("partition: \"" + partition + "\"");
        }
        if (timePartition != null) {
            joiner.add("timePartition: " + timePartition);
        }
        return joiner.toString();
    }

    public static PartitionSpec.Builder builder() {
        return new PartitionSpec.Builder();
    }

    public static class Builder {

        private PartitionType type;
        private String partition;
        private TimeWindow timePartition;

        public Builder() {
        }

        /**
         * The partition type
         */
        public Builder setType(PartitionType type) {
            this.type = type;
            return this;
        }

        /**
         * The partition identifier
         */
        public Builder setPartition(String partition) {
            this.partition = partition;
            return this;
        }

        /**
         * The optional time window partition information - required if type is TIMESTAMP_FIELD.
         */
        public Builder setTimePartition(TimeWindow timePartition) {
            this.timePartition = timePartition;
            return this;
        }


        public PartitionSpec build() {
            return new PartitionSpec(type, partition, timePartition);
        }

    }
}
