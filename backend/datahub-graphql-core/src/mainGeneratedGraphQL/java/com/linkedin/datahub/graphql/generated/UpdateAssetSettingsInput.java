package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class UpdateAssetSettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private UpdateAssetSummaryInput summary;

    public UpdateAssetSettingsInput() {
    }

    public UpdateAssetSettingsInput(String urn, UpdateAssetSummaryInput summary) {
        this.urn = urn;
        this.summary = summary;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public UpdateAssetSummaryInput getSummary() {
        return summary;
    }
    public void setSummary(UpdateAssetSummaryInput summary) {
        this.summary = summary;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (summary != null) {
            joiner.add("summary: " + summary);
        }
        return joiner.toString();
    }

    public static UpdateAssetSettingsInput.Builder builder() {
        return new UpdateAssetSettingsInput.Builder();
    }

    public static class Builder {

        private String urn;
        private UpdateAssetSummaryInput summary;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setSummary(UpdateAssetSummaryInput summary) {
            this.summary = summary;
            return this;
        }


        public UpdateAssetSettingsInput build() {
            return new UpdateAssetSettingsInput(urn, summary);
        }

    }
}
