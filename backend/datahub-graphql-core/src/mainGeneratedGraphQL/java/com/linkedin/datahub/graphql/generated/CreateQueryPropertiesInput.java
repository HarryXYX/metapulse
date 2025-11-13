package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input properties required for creating a Query
 */
public class CreateQueryPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    @javax.annotation.Nonnull
    private QueryStatementInput statement;

    public CreateQueryPropertiesInput() {
    }

    public CreateQueryPropertiesInput(String name, String description, QueryStatementInput statement) {
        this.name = name;
        this.description = description;
        this.statement = statement;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public QueryStatementInput getStatement() {
        return statement;
    }
    public void setStatement(QueryStatementInput statement) {
        this.statement = statement;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (statement != null) {
            joiner.add("statement: " + statement);
        }
        return joiner.toString();
    }

    public static CreateQueryPropertiesInput.Builder builder() {
        return new CreateQueryPropertiesInput.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private QueryStatementInput statement;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStatement(QueryStatementInput statement) {
            this.statement = statement;
            return this;
        }


        public CreateQueryPropertiesInput build() {
            return new CreateQueryPropertiesInput(name, description, statement);
        }

    }
}
