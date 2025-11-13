package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create or update a DatasetFilter
 */
public class DatasetFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DatasetFilterType type;
    private String sql;

    public DatasetFilterInput() {
    }

    public DatasetFilterInput(DatasetFilterType type, String sql) {
        this.type = type;
        this.sql = sql;
    }

    public DatasetFilterType getType() {
        return type;
    }
    public void setType(DatasetFilterType type) {
        this.type = type;
    }

    public String getSql() {
        return sql;
    }
    public void setSql(String sql) {
        this.sql = sql;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (sql != null) {
            joiner.add("sql: \"" + sql + "\"");
        }
        return joiner.toString();
    }

    public static DatasetFilterInput.Builder builder() {
        return new DatasetFilterInput.Builder();
    }

    public static class Builder {

        private DatasetFilterType type;
        private String sql;

        public Builder() {
        }

        public Builder setType(DatasetFilterType type) {
            this.type = type;
            return this;
        }

        public Builder setSql(String sql) {
            this.sql = sql;
            return this;
        }


        public DatasetFilterInput build() {
            return new DatasetFilterInput(type, sql);
        }

    }
}
