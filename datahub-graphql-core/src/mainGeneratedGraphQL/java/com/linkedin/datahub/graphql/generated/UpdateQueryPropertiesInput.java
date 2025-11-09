package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input properties required for creating a Query. Any non-null fields will be updated if provided.
 */
public class UpdateQueryPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private QueryStatementInput statement;

    public UpdateQueryPropertiesInput() {
    }

    public UpdateQueryPropertiesInput(String name, String description, QueryStatementInput statement) {
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

    public static UpdateQueryPropertiesInput.Builder builder() {
        return new UpdateQueryPropertiesInput.Builder();
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


        public UpdateQueryPropertiesInput build() {
            return new UpdateQueryPropertiesInput(name, description, statement);
        }

    }
}
