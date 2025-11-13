package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about a Dataset of type view
 */
public class ViewProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean materialized;
    @javax.annotation.Nonnull
    private String logic;
    private String formattedLogic;
    @javax.annotation.Nonnull
    private String language;

    public ViewProperties() {
    }

    public ViewProperties(boolean materialized, String logic, String formattedLogic, String language) {
        this.materialized = materialized;
        this.logic = logic;
        this.formattedLogic = formattedLogic;
        this.language = language;
    }

    /**
     * Whether the view is materialized or not
     */
    public boolean getMaterialized() {
        return materialized;
    }
    /**
     * Whether the view is materialized or not
     */
    public void setMaterialized(boolean materialized) {
        this.materialized = materialized;
    }

    /**
     * The logic associated with the view, most commonly a SQL statement
     */
    public String getLogic() {
        return logic;
    }
    /**
     * The logic associated with the view, most commonly a SQL statement
     */
    public void setLogic(String logic) {
        this.logic = logic;
    }

    /**
     * A formatted version of the logic associated with the view.
For dbt, this contains the compiled SQL.
     */
    public String getFormattedLogic() {
        return formattedLogic;
    }
    /**
     * A formatted version of the logic associated with the view.
For dbt, this contains the compiled SQL.
     */
    public void setFormattedLogic(String formattedLogic) {
        this.formattedLogic = formattedLogic;
    }

    /**
     * The language in which the view logic is written, for example SQL
     */
    public String getLanguage() {
        return language;
    }
    /**
     * The language in which the view logic is written, for example SQL
     */
    public void setLanguage(String language) {
        this.language = language;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("materialized: " + materialized);
        if (logic != null) {
            joiner.add("logic: \"" + logic + "\"");
        }
        if (formattedLogic != null) {
            joiner.add("formattedLogic: \"" + formattedLogic + "\"");
        }
        if (language != null) {
            joiner.add("language: \"" + language + "\"");
        }
        return joiner.toString();
    }

    public static ViewProperties.Builder builder() {
        return new ViewProperties.Builder();
    }

    public static class Builder {

        private boolean materialized;
        private String logic;
        private String formattedLogic;
        private String language;

        public Builder() {
        }

        /**
         * Whether the view is materialized or not
         */
        public Builder setMaterialized(boolean materialized) {
            this.materialized = materialized;
            return this;
        }

        /**
         * The logic associated with the view, most commonly a SQL statement
         */
        public Builder setLogic(String logic) {
            this.logic = logic;
            return this;
        }

        /**
         * A formatted version of the logic associated with the view.
For dbt, this contains the compiled SQL.
         */
        public Builder setFormattedLogic(String formattedLogic) {
            this.formattedLogic = formattedLogic;
            return this;
        }

        /**
         * The language in which the view logic is written, for example SQL
         */
        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }


        public ViewProperties build() {
            return new ViewProperties(materialized, logic, formattedLogic, language);
        }

    }
}
