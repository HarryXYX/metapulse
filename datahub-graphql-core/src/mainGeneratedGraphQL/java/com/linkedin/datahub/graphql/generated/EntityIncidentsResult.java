package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A list of Incidents Associated with an Entity
 */
public class EntityIncidentsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<Incident> incidents;

    public EntityIncidentsResult() {
    }

    public EntityIncidentsResult(int start, int count, int total, java.util.List<Incident> incidents) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.incidents = incidents;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of assertions in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of assertions in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of assertions in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of assertions in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The incidents themselves
     */
    public java.util.List<Incident> getIncidents() {
        return incidents;
    }
    /**
     * The incidents themselves
     */
    public void setIncidents(java.util.List<Incident> incidents) {
        this.incidents = incidents;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (incidents != null) {
            joiner.add("incidents: " + incidents);
        }
        return joiner.toString();
    }

    public static EntityIncidentsResult.Builder builder() {
        return new EntityIncidentsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<Incident> incidents;

        public Builder() {
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of assertions in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of assertions in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The incidents themselves
         */
        public Builder setIncidents(java.util.List<Incident> incidents) {
            this.incidents = incidents;
            return this;
        }


        public EntityIncidentsResult build() {
            return new EntityIncidentsResult(start, count, total, incidents);
        }

    }
}
