package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for getting timeline from a specific version.
Todo: this is where additional filtering would go such as start & end times/versions, change types, etc
 */
public class GetTimelineInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private java.util.List<ChangeCategoryType> changeCategories;

    public GetTimelineInput() {
    }

    public GetTimelineInput(String urn, java.util.List<ChangeCategoryType> changeCategories) {
        this.urn = urn;
        this.changeCategories = changeCategories;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public java.util.List<ChangeCategoryType> getChangeCategories() {
        return changeCategories;
    }
    public void setChangeCategories(java.util.List<ChangeCategoryType> changeCategories) {
        this.changeCategories = changeCategories;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (changeCategories != null) {
            joiner.add("changeCategories: " + changeCategories);
        }
        return joiner.toString();
    }

    public static GetTimelineInput.Builder builder() {
        return new GetTimelineInput.Builder();
    }

    public static class Builder {

        private String urn;
        private java.util.List<ChangeCategoryType> changeCategories;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setChangeCategories(java.util.List<ChangeCategoryType> changeCategories) {
            this.changeCategories = changeCategories;
            return this;
        }


        public GetTimelineInput build() {
            return new GetTimelineInput(urn, changeCategories);
        }

    }
}
