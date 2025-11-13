package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input related to the summary page of this asset
 */
public class UpdateAssetSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String template;

    public UpdateAssetSummaryInput() {
    }

    public UpdateAssetSummaryInput(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }
    public void setTemplate(String template) {
        this.template = template;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (template != null) {
            joiner.add("template: \"" + template + "\"");
        }
        return joiner.toString();
    }

    public static UpdateAssetSummaryInput.Builder builder() {
        return new UpdateAssetSummaryInput.Builder();
    }

    public static class Builder {

        private String template;

        public Builder() {
        }

        public Builder setTemplate(String template) {
            this.template = template;
            return this;
        }


        public UpdateAssetSummaryInput build() {
            return new UpdateAssetSummaryInput(template);
        }

    }
}
