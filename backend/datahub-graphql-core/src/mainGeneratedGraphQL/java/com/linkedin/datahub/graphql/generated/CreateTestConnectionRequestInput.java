package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for creating a test connection request
 */
public class CreateTestConnectionRequestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String recipe;
    private String version;

    public CreateTestConnectionRequestInput() {
    }

    public CreateTestConnectionRequestInput(String recipe, String version) {
        this.recipe = recipe;
        this.version = version;
    }

    public String getRecipe() {
        return recipe;
    }
    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (recipe != null) {
            joiner.add("recipe: \"" + recipe + "\"");
        }
        if (version != null) {
            joiner.add("version: \"" + version + "\"");
        }
        return joiner.toString();
    }

    public static CreateTestConnectionRequestInput.Builder builder() {
        return new CreateTestConnectionRequestInput.Builder();
    }

    public static class Builder {

        private String recipe;
        private String version;

        public Builder() {
        }

        public Builder setRecipe(String recipe) {
            this.recipe = recipe;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }


        public CreateTestConnectionRequestInput build() {
            return new CreateTestConnectionRequestInput(recipe, version);
        }

    }
}
