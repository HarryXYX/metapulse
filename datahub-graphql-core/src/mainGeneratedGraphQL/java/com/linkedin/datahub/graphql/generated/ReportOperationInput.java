package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided to report an asset operation
 */
public class ReportOperationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private OperationType operationType;
    private String customOperationType;
    @javax.annotation.Nonnull
    private OperationSourceType sourceType;
    private java.util.List<StringMapEntryInput> customProperties;
    private String partition;
    private Long numAffectedRows;
    private Long timestampMillis;

    public ReportOperationInput() {
    }

    public ReportOperationInput(String urn, OperationType operationType, String customOperationType, OperationSourceType sourceType, java.util.List<StringMapEntryInput> customProperties, String partition, Long numAffectedRows, Long timestampMillis) {
        this.urn = urn;
        this.operationType = operationType;
        this.customOperationType = customOperationType;
        this.sourceType = sourceType;
        this.customProperties = customProperties;
        this.partition = partition;
        this.numAffectedRows = numAffectedRows;
        this.timestampMillis = timestampMillis;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public OperationType getOperationType() {
        return operationType;
    }
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public String getCustomOperationType() {
        return customOperationType;
    }
    public void setCustomOperationType(String customOperationType) {
        this.customOperationType = customOperationType;
    }

    public OperationSourceType getSourceType() {
        return sourceType;
    }
    public void setSourceType(OperationSourceType sourceType) {
        this.sourceType = sourceType;
    }

    public java.util.List<StringMapEntryInput> getCustomProperties() {
        return customProperties;
    }
    public void setCustomProperties(java.util.List<StringMapEntryInput> customProperties) {
        this.customProperties = customProperties;
    }

    public String getPartition() {
        return partition;
    }
    public void setPartition(String partition) {
        this.partition = partition;
    }

    public Long getNumAffectedRows() {
        return numAffectedRows;
    }
    public void setNumAffectedRows(Long numAffectedRows) {
        this.numAffectedRows = numAffectedRows;
    }

    public Long getTimestampMillis() {
        return timestampMillis;
    }
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (operationType != null) {
            joiner.add("operationType: " + operationType);
        }
        if (customOperationType != null) {
            joiner.add("customOperationType: \"" + customOperationType + "\"");
        }
        if (sourceType != null) {
            joiner.add("sourceType: " + sourceType);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (partition != null) {
            joiner.add("partition: \"" + partition + "\"");
        }
        if (numAffectedRows != null) {
            joiner.add("numAffectedRows: " + numAffectedRows);
        }
        if (timestampMillis != null) {
            joiner.add("timestampMillis: " + timestampMillis);
        }
        return joiner.toString();
    }

    public static ReportOperationInput.Builder builder() {
        return new ReportOperationInput.Builder();
    }

    public static class Builder {

        private String urn;
        private OperationType operationType;
        private String customOperationType;
        private OperationSourceType sourceType;
        private java.util.List<StringMapEntryInput> customProperties;
        private String partition;
        private Long numAffectedRows;
        private Long timestampMillis;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setOperationType(OperationType operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder setCustomOperationType(String customOperationType) {
            this.customOperationType = customOperationType;
            return this;
        }

        public Builder setSourceType(OperationSourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setCustomProperties(java.util.List<StringMapEntryInput> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        public Builder setPartition(String partition) {
            this.partition = partition;
            return this;
        }

        public Builder setNumAffectedRows(Long numAffectedRows) {
            this.numAffectedRows = numAffectedRows;
            return this;
        }

        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }


        public ReportOperationInput build() {
            return new ReportOperationInput(urn, operationType, customOperationType, sourceType, customProperties, partition, numAffectedRows, timestampMillis);
        }

    }
}
