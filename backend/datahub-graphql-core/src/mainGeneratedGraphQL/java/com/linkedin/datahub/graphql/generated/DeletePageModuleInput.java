package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for deleting a DataHub page module
 */
public class DeletePageModuleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;

    public DeletePageModuleInput() {
    }

    public DeletePageModuleInput(String urn) {
        this.urn = urn;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        return joiner.toString();
    }

    public static DeletePageModuleInput.Builder builder() {
        return new DeletePageModuleInput.Builder();
    }

    public static class Builder {

        private String urn;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public DeletePageModuleInput build() {
            return new DeletePageModuleInput(urn);
        }

    }
}
