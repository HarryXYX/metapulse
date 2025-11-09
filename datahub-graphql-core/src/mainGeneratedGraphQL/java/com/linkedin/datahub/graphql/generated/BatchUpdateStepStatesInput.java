package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments required for updating step states
 */
public class BatchUpdateStepStatesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<StepStateInput> states;

    public BatchUpdateStepStatesInput() {
    }

    public BatchUpdateStepStatesInput(java.util.List<StepStateInput> states) {
        this.states = states;
    }

    public java.util.List<StepStateInput> getStates() {
        return states;
    }
    public void setStates(java.util.List<StepStateInput> states) {
        this.states = states;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (states != null) {
            joiner.add("states: " + states);
        }
        return joiner.toString();
    }

    public static BatchUpdateStepStatesInput.Builder builder() {
        return new BatchUpdateStepStatesInput.Builder();
    }

    public static class Builder {

        private java.util.List<StepStateInput> states;

        public Builder() {
        }

        public Builder setStates(java.util.List<StepStateInput> states) {
            this.states = states;
            return this;
        }


        public BatchUpdateStepStatesInput build() {
            return new BatchUpdateStepStatesInput(states);
        }

    }
}
