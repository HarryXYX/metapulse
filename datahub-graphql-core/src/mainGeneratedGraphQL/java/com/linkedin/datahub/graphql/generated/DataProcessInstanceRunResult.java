package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * the result of a run, part of the run state
 */
public class DataProcessInstanceRunResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DataProcessInstanceRunResultType resultType;
    private String nativeResultType;

    public DataProcessInstanceRunResult() {
    }

    public DataProcessInstanceRunResult(DataProcessInstanceRunResultType resultType, String nativeResultType) {
        this.resultType = resultType;
        this.nativeResultType = nativeResultType;
    }

    /**
     * The outcome of the run
     */
    public DataProcessInstanceRunResultType getResultType() {
        return resultType;
    }
    /**
     * The outcome of the run
     */
    public void setResultType(DataProcessInstanceRunResultType resultType) {
        this.resultType = resultType;
    }

    /**
     * The outcome of the run in the data platforms native language
     */
    public String getNativeResultType() {
        return nativeResultType;
    }
    /**
     * The outcome of the run in the data platforms native language
     */
    public void setNativeResultType(String nativeResultType) {
        this.nativeResultType = nativeResultType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (resultType != null) {
            joiner.add("resultType: " + resultType);
        }
        if (nativeResultType != null) {
            joiner.add("nativeResultType: \"" + nativeResultType + "\"");
        }
        return joiner.toString();
    }

    public static DataProcessInstanceRunResult.Builder builder() {
        return new DataProcessInstanceRunResult.Builder();
    }

    public static class Builder {

        private DataProcessInstanceRunResultType resultType;
        private String nativeResultType;

        public Builder() {
        }

        /**
         * The outcome of the run
         */
        public Builder setResultType(DataProcessInstanceRunResultType resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * The outcome of the run in the data platforms native language
         */
        public Builder setNativeResultType(String nativeResultType) {
            this.nativeResultType = nativeResultType;
            return this;
        }


        public DataProcessInstanceRunResult build() {
            return new DataProcessInstanceRunResult(resultType, nativeResultType);
        }

    }
}
