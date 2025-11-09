package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class LineageEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String downstreamUrn;
    @javax.annotation.Nonnull
    private String upstreamUrn;

    public LineageEdge() {
    }

    public LineageEdge(String downstreamUrn, String upstreamUrn) {
        this.downstreamUrn = downstreamUrn;
        this.upstreamUrn = upstreamUrn;
    }

    public String getDownstreamUrn() {
        return downstreamUrn;
    }
    public void setDownstreamUrn(String downstreamUrn) {
        this.downstreamUrn = downstreamUrn;
    }

    public String getUpstreamUrn() {
        return upstreamUrn;
    }
    public void setUpstreamUrn(String upstreamUrn) {
        this.upstreamUrn = upstreamUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (downstreamUrn != null) {
            joiner.add("downstreamUrn: \"" + downstreamUrn + "\"");
        }
        if (upstreamUrn != null) {
            joiner.add("upstreamUrn: \"" + upstreamUrn + "\"");
        }
        return joiner.toString();
    }

    public static LineageEdge.Builder builder() {
        return new LineageEdge.Builder();
    }

    public static class Builder {

        private String downstreamUrn;
        private String upstreamUrn;

        public Builder() {
        }

        public Builder setDownstreamUrn(String downstreamUrn) {
            this.downstreamUrn = downstreamUrn;
            return this;
        }

        public Builder setUpstreamUrn(String upstreamUrn) {
            this.upstreamUrn = upstreamUrn;
            return this;
        }


        public LineageEdge build() {
            return new LineageEdge(downstreamUrn, upstreamUrn);
        }

    }
}
