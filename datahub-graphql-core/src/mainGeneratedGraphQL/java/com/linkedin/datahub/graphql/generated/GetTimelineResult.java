package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Result of getting timeline from a specific version.
 */
public class GetTimelineResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<ChangeTransaction> changeTransactions;

    public GetTimelineResult() {
    }

    public GetTimelineResult(java.util.List<ChangeTransaction> changeTransactions) {
        this.changeTransactions = changeTransactions;
    }

    public java.util.List<ChangeTransaction> getChangeTransactions() {
        return changeTransactions;
    }
    public void setChangeTransactions(java.util.List<ChangeTransaction> changeTransactions) {
        this.changeTransactions = changeTransactions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (changeTransactions != null) {
            joiner.add("changeTransactions: " + changeTransactions);
        }
        return joiner.toString();
    }

    public static GetTimelineResult.Builder builder() {
        return new GetTimelineResult.Builder();
    }

    public static class Builder {

        private java.util.List<ChangeTransaction> changeTransactions;

        public Builder() {
        }

        public Builder setChangeTransactions(java.util.List<ChangeTransaction> changeTransactions) {
            this.changeTransactions = changeTransactions;
            return this;
        }


        public GetTimelineResult build() {
            return new GetTimelineResult(changeTransactions);
        }

    }
}
