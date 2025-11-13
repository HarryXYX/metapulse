package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class ActiveIncidentHealthDetails implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String latestIncidentUrn;
    private String latestIncidentTitle;
    private Long lastActivityAt;
    private int count;

    public ActiveIncidentHealthDetails() {
    }

    public ActiveIncidentHealthDetails(String latestIncidentUrn, String latestIncidentTitle, Long lastActivityAt, int count) {
        this.latestIncidentUrn = latestIncidentUrn;
        this.latestIncidentTitle = latestIncidentTitle;
        this.lastActivityAt = lastActivityAt;
        this.count = count;
    }

    /**
     * The latest incident
     */
    public String getLatestIncidentUrn() {
        return latestIncidentUrn;
    }
    /**
     * The latest incident
     */
    public void setLatestIncidentUrn(String latestIncidentUrn) {
        this.latestIncidentUrn = latestIncidentUrn;
    }

    /**
     * The title of the latest incident
     */
    public String getLatestIncidentTitle() {
        return latestIncidentTitle;
    }
    /**
     * The title of the latest incident
     */
    public void setLatestIncidentTitle(String latestIncidentTitle) {
        this.latestIncidentTitle = latestIncidentTitle;
    }

    /**
     * The timestamp when the last incident was updated
     */
    public Long getLastActivityAt() {
        return lastActivityAt;
    }
    /**
     * The timestamp when the last incident was updated
     */
    public void setLastActivityAt(Long lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    /**
     * The number of active incidents
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of active incidents
     */
    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (latestIncidentUrn != null) {
            joiner.add("latestIncidentUrn: \"" + latestIncidentUrn + "\"");
        }
        if (latestIncidentTitle != null) {
            joiner.add("latestIncidentTitle: \"" + latestIncidentTitle + "\"");
        }
        if (lastActivityAt != null) {
            joiner.add("lastActivityAt: " + lastActivityAt);
        }
        joiner.add("count: " + count);
        return joiner.toString();
    }

    public static ActiveIncidentHealthDetails.Builder builder() {
        return new ActiveIncidentHealthDetails.Builder();
    }

    public static class Builder {

        private String latestIncidentUrn;
        private String latestIncidentTitle;
        private Long lastActivityAt;
        private int count;

        public Builder() {
        }

        /**
         * The latest incident
         */
        public Builder setLatestIncidentUrn(String latestIncidentUrn) {
            this.latestIncidentUrn = latestIncidentUrn;
            return this;
        }

        /**
         * The title of the latest incident
         */
        public Builder setLatestIncidentTitle(String latestIncidentTitle) {
            this.latestIncidentTitle = latestIncidentTitle;
            return this;
        }

        /**
         * The timestamp when the last incident was updated
         */
        public Builder setLastActivityAt(Long lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }

        /**
         * The number of active incidents
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public ActiveIncidentHealthDetails build() {
            return new ActiveIncidentHealthDetails(latestIncidentUrn, latestIncidentTitle, lastActivityAt, count);
        }

    }
}
