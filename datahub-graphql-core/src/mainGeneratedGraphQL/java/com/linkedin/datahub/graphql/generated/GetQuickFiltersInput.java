package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for getting Quick Filters
 */
public class GetQuickFiltersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String viewUrn;

    public GetQuickFiltersInput() {
    }

    public GetQuickFiltersInput(String viewUrn) {
        this.viewUrn = viewUrn;
    }

    public String getViewUrn() {
        return viewUrn;
    }
    public void setViewUrn(String viewUrn) {
        this.viewUrn = viewUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        return joiner.toString();
    }

    public static GetQuickFiltersInput.Builder builder() {
        return new GetQuickFiltersInput.Builder();
    }

    public static class Builder {

        private String viewUrn;

        public Builder() {
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }


        public GetQuickFiltersInput build() {
            return new GetQuickFiltersInput(viewUrn);
        }

    }
}
