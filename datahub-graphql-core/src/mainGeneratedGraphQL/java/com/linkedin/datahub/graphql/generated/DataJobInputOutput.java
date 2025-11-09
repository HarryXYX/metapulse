package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The lineage information for a DataJob
TODO Rename this to align with other Lineage models
 */
public class DataJobInputOutput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    private java.util.List<Dataset> inputDatasets;
    @Deprecated
    private java.util.List<Dataset> outputDatasets;
    @Deprecated
    private java.util.List<DataJob> inputDatajobs;
    private java.util.List<FineGrainedLineage> fineGrainedLineages;

    public DataJobInputOutput() {
    }

    public DataJobInputOutput(java.util.List<Dataset> inputDatasets, java.util.List<Dataset> outputDatasets, java.util.List<DataJob> inputDatajobs, java.util.List<FineGrainedLineage> fineGrainedLineages) {
        this.inputDatasets = inputDatasets;
        this.outputDatasets = outputDatasets;
        this.inputDatajobs = inputDatajobs;
        this.fineGrainedLineages = fineGrainedLineages;
    }

    /**
     * Deprecated, use relationship Consumes instead
Input datasets produced by the data job during processing
     */
    @Deprecated
    public java.util.List<Dataset> getInputDatasets() {
        return inputDatasets;
    }
    /**
     * Deprecated, use relationship Consumes instead
Input datasets produced by the data job during processing
     */
    @Deprecated
    public void setInputDatasets(java.util.List<Dataset> inputDatasets) {
        this.inputDatasets = inputDatasets;
    }

    /**
     * Deprecated, use relationship Produces instead
Output datasets produced by the data job during processing
     */
    @Deprecated
    public java.util.List<Dataset> getOutputDatasets() {
        return outputDatasets;
    }
    /**
     * Deprecated, use relationship Produces instead
Output datasets produced by the data job during processing
     */
    @Deprecated
    public void setOutputDatasets(java.util.List<Dataset> outputDatasets) {
        this.outputDatasets = outputDatasets;
    }

    /**
     * Deprecated, use relationship DownstreamOf instead
Input datajobs that this data job depends on
     */
    @Deprecated
    public java.util.List<DataJob> getInputDatajobs() {
        return inputDatajobs;
    }
    /**
     * Deprecated, use relationship DownstreamOf instead
Input datajobs that this data job depends on
     */
    @Deprecated
    public void setInputDatajobs(java.util.List<DataJob> inputDatajobs) {
        this.inputDatajobs = inputDatajobs;
    }

    /**
     * Lineage information for the column-level. Includes a list of objects
detailing which columns are upstream and which are downstream of each other.
The upstream and downstream columns are from datasets.
     */
    public java.util.List<FineGrainedLineage> getFineGrainedLineages() {
        return fineGrainedLineages;
    }
    /**
     * Lineage information for the column-level. Includes a list of objects
detailing which columns are upstream and which are downstream of each other.
The upstream and downstream columns are from datasets.
     */
    public void setFineGrainedLineages(java.util.List<FineGrainedLineage> fineGrainedLineages) {
        this.fineGrainedLineages = fineGrainedLineages;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (inputDatasets != null) {
            joiner.add("inputDatasets: " + inputDatasets);
        }
        if (outputDatasets != null) {
            joiner.add("outputDatasets: " + outputDatasets);
        }
        if (inputDatajobs != null) {
            joiner.add("inputDatajobs: " + inputDatajobs);
        }
        if (fineGrainedLineages != null) {
            joiner.add("fineGrainedLineages: " + fineGrainedLineages);
        }
        return joiner.toString();
    }

    public static DataJobInputOutput.Builder builder() {
        return new DataJobInputOutput.Builder();
    }

    public static class Builder {

        private java.util.List<Dataset> inputDatasets;
        private java.util.List<Dataset> outputDatasets;
        private java.util.List<DataJob> inputDatajobs;
        private java.util.List<FineGrainedLineage> fineGrainedLineages;

        public Builder() {
        }

        /**
         * Deprecated, use relationship Consumes instead
Input datasets produced by the data job during processing
         */
        @Deprecated
        public Builder setInputDatasets(java.util.List<Dataset> inputDatasets) {
            this.inputDatasets = inputDatasets;
            return this;
        }

        /**
         * Deprecated, use relationship Produces instead
Output datasets produced by the data job during processing
         */
        @Deprecated
        public Builder setOutputDatasets(java.util.List<Dataset> outputDatasets) {
            this.outputDatasets = outputDatasets;
            return this;
        }

        /**
         * Deprecated, use relationship DownstreamOf instead
Input datajobs that this data job depends on
         */
        @Deprecated
        public Builder setInputDatajobs(java.util.List<DataJob> inputDatajobs) {
            this.inputDatajobs = inputDatajobs;
            return this;
        }

        /**
         * Lineage information for the column-level. Includes a list of objects
detailing which columns are upstream and which are downstream of each other.
The upstream and downstream columns are from datasets.
         */
        public Builder setFineGrainedLineages(java.util.List<FineGrainedLineage> fineGrainedLineages) {
            this.fineGrainedLineages = fineGrainedLineages;
            return this;
        }


        public DataJobInputOutput build() {
            return new DataJobInputOutput(inputDatasets, outputDatasets, inputDatajobs, fineGrainedLineages);
        }

    }
}
