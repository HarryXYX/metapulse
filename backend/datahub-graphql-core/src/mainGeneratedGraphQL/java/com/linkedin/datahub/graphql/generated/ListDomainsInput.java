package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required when listing DataHub Domains
 */
public class ListDomainsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private String parentDomain;

    public ListDomainsInput() {
    }

    public ListDomainsInput(Integer start, Integer count, String query, String parentDomain) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.parentDomain = parentDomain;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getParentDomain() {
        return parentDomain;
    }
    public void setParentDomain(String parentDomain) {
        this.parentDomain = parentDomain;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (parentDomain != null) {
            joiner.add("parentDomain: \"" + parentDomain + "\"");
        }
        return joiner.toString();
    }

    public static ListDomainsInput.Builder builder() {
        return new ListDomainsInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private String parentDomain;

        public Builder() {
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setParentDomain(String parentDomain) {
            this.parentDomain = parentDomain;
            return this;
        }


        public ListDomainsInput build() {
            return new ListDomainsInput(start, count, query, parentDomain);
        }

    }
}
