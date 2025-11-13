package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Describes a generic filter on a dataset
 */
public class DatasetFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DatasetFilterType type;
    private String sql;

    public DatasetFilter() {
    }

    public DatasetFilter(DatasetFilterType type, String sql) {
        this.type = type;
        this.sql = sql;
    }

    /**
     * Type of partition
     */
    public DatasetFilterType getType() {
        return type;
    }
    /**
     * Type of partition
     */
    public void setType(DatasetFilterType type) {
        this.type = type;
    }

    /**
     * The raw query if using a SQL FilterType
     */
    public String getSql() {
        return sql;
    }
    /**
     * The raw query if using a SQL FilterType
     */
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

    public static DatasetFilter.Builder builder() {
        return new DatasetFilter.Builder();
    }

    public static class Builder {

        private DatasetFilterType type;
        private String sql;

        public Builder() {
        }

        /**
         * Type of partition
         */
        public Builder setType(DatasetFilterType type) {
            this.type = type;
            return this;
        }

        /**
         * The raw query if using a SQL FilterType
         */
        public Builder setSql(String sql) {
            this.sql = sql;
            return this;
        }


        public DatasetFilter build() {
            return new DatasetFilter(type, sql);
        }

    }
}
