package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class DataContractStatus implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DataContractState state;

    public DataContractStatus() {
    }

    public DataContractStatus(DataContractState state) {
        this.state = state;
    }

    /**
     * The state of the data contract
     */
    public DataContractState getState() {
        return state;
    }
    /**
     * The state of the data contract
     */
    public void setState(DataContractState state) {
        this.state = state;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (state != null) {
            joiner.add("state: " + state);
        }
        return joiner.toString();
    }

    public static DataContractStatus.Builder builder() {
        return new DataContractStatus.Builder();
    }

    public static class Builder {

        private DataContractState state;

        public Builder() {
        }

        /**
         * The state of the data contract
         */
        public Builder setState(DataContractState state) {
            this.state = state;
            return this;
        }


        public DataContractStatus build() {
            return new DataContractStatus(state);
        }

    }
}
