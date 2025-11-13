package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes defining a SQL Assertion
 */
public class SqlAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SqlAssertionType type;
    @javax.annotation.Nonnull
    private String entityUrn;
    @javax.annotation.Nonnull
    private String statement;
    private AssertionValueChangeType changeType;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    @javax.annotation.Nonnull
    private AssertionStdParameters parameters;

    public SqlAssertionInfo() {
    }

    public SqlAssertionInfo(SqlAssertionType type, String entityUrn, String statement, AssertionValueChangeType changeType, AssertionStdOperator operator, AssertionStdParameters parameters) {
        this.type = type;
        this.entityUrn = entityUrn;
        this.statement = statement;
        this.changeType = changeType;
        this.operator = operator;
        this.parameters = parameters;
    }

    /**
     * The type of the SQL assertion being monitored.
     */
    public SqlAssertionType getType() {
        return type;
    }
    /**
     * The type of the SQL assertion being monitored.
     */
    public void setType(SqlAssertionType type) {
        this.type = type;
    }

    /**
     * The entity targeted by this SQL check.
     */
    public String getEntityUrn() {
        return entityUrn;
    }
    /**
     * The entity targeted by this SQL check.
     */
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }

    /**
     * The SQL statement to be executed when evaluating the assertion.
     */
    public String getStatement() {
        return statement;
    }
    /**
     * The SQL statement to be executed when evaluating the assertion.
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
Required if the type is METRIC_CHANGE.
     */
    public AssertionValueChangeType getChangeType() {
        return changeType;
    }
    /**
     * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
Required if the type is METRIC_CHANGE.
     */
    public void setChangeType(AssertionValueChangeType changeType) {
        this.changeType = changeType;
    }

    /**
     * The operator you'd like to apply to the result of the SQL query.
     */
    public AssertionStdOperator getOperator() {
        return operator;
    }
    /**
     * The operator you'd like to apply to the result of the SQL query.
     */
    public void setOperator(AssertionStdOperator operator) {
        this.operator = operator;
    }

    /**
     * The parameters you'd like to provide as input to the operator.
     */
    public AssertionStdParameters getParameters() {
        return parameters;
    }
    /**
     * The parameters you'd like to provide as input to the operator.
     */
    public void setParameters(AssertionStdParameters parameters) {
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        if (statement != null) {
            joiner.add("statement: \"" + statement + "\"");
        }
        if (changeType != null) {
            joiner.add("changeType: " + changeType);
        }
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        return joiner.toString();
    }

    public static SqlAssertionInfo.Builder builder() {
        return new SqlAssertionInfo.Builder();
    }

    public static class Builder {

        private SqlAssertionType type;
        private String entityUrn;
        private String statement;
        private AssertionValueChangeType changeType;
        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;

        public Builder() {
        }

        /**
         * The type of the SQL assertion being monitored.
         */
        public Builder setType(SqlAssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * The entity targeted by this SQL check.
         */
        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }

        /**
         * The SQL statement to be executed when evaluating the assertion.
         */
        public Builder setStatement(String statement) {
            this.statement = statement;
            return this;
        }

        /**
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
Required if the type is METRIC_CHANGE.
         */
        public Builder setChangeType(AssertionValueChangeType changeType) {
            this.changeType = changeType;
            return this;
        }

        /**
         * The operator you'd like to apply to the result of the SQL query.
         */
        public Builder setOperator(AssertionStdOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * The parameters you'd like to provide as input to the operator.
         */
        public Builder setParameters(AssertionStdParameters parameters) {
            this.parameters = parameters;
            return this;
        }


        public SqlAssertionInfo build() {
            return new SqlAssertionInfo(type, entityUrn, statement, changeType, operator, parameters);
        }

    }
}
