package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class AssertionHealthStatusByType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionType type;
    @javax.annotation.Nonnull
    private HealthStatus status;
    private int total;
    private int statusCount;
    private Long lastStatusResultAt;

    public AssertionHealthStatusByType() {
    }

    public AssertionHealthStatusByType(AssertionType type, HealthStatus status, int total, int statusCount, Long lastStatusResultAt) {
        this.type = type;
        this.status = status;
        this.total = total;
        this.statusCount = statusCount;
        this.lastStatusResultAt = lastStatusResultAt;
    }

    /**
     * The type group of assertions
     */
    public AssertionType getType() {
        return type;
    }
    /**
     * The type group of assertions
     */
    public void setType(AssertionType type) {
        this.type = type;
    }

    /**
     * The status of the assertions in the given type group
     */
    public HealthStatus getStatus() {
        return status;
    }
    /**
     * The status of the assertions in the given type group
     */
    public void setStatus(HealthStatus status) {
        this.status = status;
    }

    /**
     * The number of assertions in the given type group
     */
    public int getTotal() {
        return total;
    }
    /**
     * The number of assertions in the given type group
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of assertions in the given type group that have the given status (PASS, WARN, FAIL)
     */
    public int getStatusCount() {
        return statusCount;
    }
    /**
     * The number of assertions in the given type group that have the given status (PASS, WARN, FAIL)
     */
    public void setStatusCount(int statusCount) {
        this.statusCount = statusCount;
    }

    /**
     * The timestamp when the last assertion of this type group with the given status ran
     */
    public Long getLastStatusResultAt() {
        return lastStatusResultAt;
    }
    /**
     * The timestamp when the last assertion of this type group with the given status ran
     */
    public void setLastStatusResultAt(Long lastStatusResultAt) {
        this.lastStatusResultAt = lastStatusResultAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        joiner.add("total: " + total);
        joiner.add("statusCount: " + statusCount);
        if (lastStatusResultAt != null) {
            joiner.add("lastStatusResultAt: " + lastStatusResultAt);
        }
        return joiner.toString();
    }

    public static AssertionHealthStatusByType.Builder builder() {
        return new AssertionHealthStatusByType.Builder();
    }

    public static class Builder {

        private AssertionType type;
        private HealthStatus status;
        private int total;
        private int statusCount;
        private Long lastStatusResultAt;

        public Builder() {
        }

        /**
         * The type group of assertions
         */
        public Builder setType(AssertionType type) {
            this.type = type;
            return this;
        }

        /**
         * The status of the assertions in the given type group
         */
        public Builder setStatus(HealthStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The number of assertions in the given type group
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of assertions in the given type group that have the given status (PASS, WARN, FAIL)
         */
        public Builder setStatusCount(int statusCount) {
            this.statusCount = statusCount;
            return this;
        }

        /**
         * The timestamp when the last assertion of this type group with the given status ran
         */
        public Builder setLastStatusResultAt(Long lastStatusResultAt) {
            this.lastStatusResultAt = lastStatusResultAt;
            return this;
        }


        public AssertionHealthStatusByType build() {
            return new AssertionHealthStatusByType(type, status, total, statusCount, lastStatusResultAt);
        }

    }
}
