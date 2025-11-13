package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The resolved Health of an Asset
 */
public class Health implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private HealthStatusType type;
    private Long reportedAt;
    @javax.annotation.Nonnull
    private HealthStatus status;
    private String message;
    private ActiveIncidentHealthDetails activeIncidentHealthDetails;
    private java.util.List<AssertionHealthStatusByType> latestAssertionStatusByType;
    private java.util.List<String> causes;

    public Health() {
    }

    public Health(HealthStatusType type, Long reportedAt, HealthStatus status, String message, ActiveIncidentHealthDetails activeIncidentHealthDetails, java.util.List<AssertionHealthStatusByType> latestAssertionStatusByType, java.util.List<String> causes) {
        this.type = type;
        this.reportedAt = reportedAt;
        this.status = status;
        this.message = message;
        this.activeIncidentHealthDetails = activeIncidentHealthDetails;
        this.latestAssertionStatusByType = latestAssertionStatusByType;
        this.causes = causes;
    }

    /**
     * An enum representing the type of health indicator
     */
    public HealthStatusType getType() {
        return type;
    }
    /**
     * An enum representing the type of health indicator
     */
    public void setType(HealthStatusType type) {
        this.type = type;
    }

    /**
     * The timestamp when the health was reported
     */
    public Long getReportedAt() {
        return reportedAt;
    }
    /**
     * The timestamp when the health was reported
     */
    public void setReportedAt(Long reportedAt) {
        this.reportedAt = reportedAt;
    }

    /**
     * An enum representing the resolved Health status of an Asset
     */
    public HealthStatus getStatus() {
        return status;
    }
    /**
     * An enum representing the resolved Health status of an Asset
     */
    public void setStatus(HealthStatus status) {
        this.status = status;
    }

    /**
     * An optional message describing the resolved health status
     */
    public String getMessage() {
        return message;
    }
    /**
     * An optional message describing the resolved health status
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * If type=INCIDENTS and status=FAIL, populate the details of the latest incident.
     */
    public ActiveIncidentHealthDetails getActiveIncidentHealthDetails() {
        return activeIncidentHealthDetails;
    }
    /**
     * If type=INCIDENTS and status=FAIL, populate the details of the latest incident.
     */
    public void setActiveIncidentHealthDetails(ActiveIncidentHealthDetails activeIncidentHealthDetails) {
        this.activeIncidentHealthDetails = activeIncidentHealthDetails;
    }

    /**
     * If type=ASSERTIONS, populate a breakdown of the assertion statuses by type.
     */
    public java.util.List<AssertionHealthStatusByType> getLatestAssertionStatusByType() {
        return latestAssertionStatusByType;
    }
    /**
     * If type=ASSERTIONS, populate a breakdown of the assertion statuses by type.
     */
    public void setLatestAssertionStatusByType(java.util.List<AssertionHealthStatusByType> latestAssertionStatusByType) {
        this.latestAssertionStatusByType = latestAssertionStatusByType;
    }

    /**
     * NOTE: @deprecated
The causes responsible for the health status
I.e., the assertion urns that are failing
     */
    public java.util.List<String> getCauses() {
        return causes;
    }
    /**
     * NOTE: @deprecated
The causes responsible for the health status
I.e., the assertion urns that are failing
     */
    public void setCauses(java.util.List<String> causes) {
        this.causes = causes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (reportedAt != null) {
            joiner.add("reportedAt: " + reportedAt);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (message != null) {
            joiner.add("message: \"" + message + "\"");
        }
        if (activeIncidentHealthDetails != null) {
            joiner.add("activeIncidentHealthDetails: " + activeIncidentHealthDetails);
        }
        if (latestAssertionStatusByType != null) {
            joiner.add("latestAssertionStatusByType: " + latestAssertionStatusByType);
        }
        if (causes != null) {
            joiner.add("causes: " + causes);
        }
        return joiner.toString();
    }

    public static Health.Builder builder() {
        return new Health.Builder();
    }

    public static class Builder {

        private HealthStatusType type;
        private Long reportedAt;
        private HealthStatus status;
        private String message;
        private ActiveIncidentHealthDetails activeIncidentHealthDetails;
        private java.util.List<AssertionHealthStatusByType> latestAssertionStatusByType;
        private java.util.List<String> causes;

        public Builder() {
        }

        /**
         * An enum representing the type of health indicator
         */
        public Builder setType(HealthStatusType type) {
            this.type = type;
            return this;
        }

        /**
         * The timestamp when the health was reported
         */
        public Builder setReportedAt(Long reportedAt) {
            this.reportedAt = reportedAt;
            return this;
        }

        /**
         * An enum representing the resolved Health status of an Asset
         */
        public Builder setStatus(HealthStatus status) {
            this.status = status;
            return this;
        }

        /**
         * An optional message describing the resolved health status
         */
        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        /**
         * If type=INCIDENTS and status=FAIL, populate the details of the latest incident.
         */
        public Builder setActiveIncidentHealthDetails(ActiveIncidentHealthDetails activeIncidentHealthDetails) {
            this.activeIncidentHealthDetails = activeIncidentHealthDetails;
            return this;
        }

        /**
         * If type=ASSERTIONS, populate a breakdown of the assertion statuses by type.
         */
        public Builder setLatestAssertionStatusByType(java.util.List<AssertionHealthStatusByType> latestAssertionStatusByType) {
            this.latestAssertionStatusByType = latestAssertionStatusByType;
            return this;
        }

        /**
         * NOTE: @deprecated
The causes responsible for the health status
I.e., the assertion urns that are failing
         */
        public Builder setCauses(java.util.List<String> causes) {
            this.causes = causes;
            return this;
        }


        public Health build() {
            return new Health(type, reportedAt, status, message, activeIncidentHealthDetails, latestAssertionStatusByType, causes);
        }

    }
}
