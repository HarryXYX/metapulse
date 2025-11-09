package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for getting granted privileges
 */
public class GetGrantedPrivilegesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String actorUrn;
    private ResourceSpec resourceSpec;
    private Boolean includeEvaluationDetails = false;

    public GetGrantedPrivilegesInput() {
    }

    public GetGrantedPrivilegesInput(String actorUrn, ResourceSpec resourceSpec, Boolean includeEvaluationDetails) {
        this.actorUrn = actorUrn;
        this.resourceSpec = resourceSpec;
        this.includeEvaluationDetails = includeEvaluationDetails;
    }

    public String getActorUrn() {
        return actorUrn;
    }
    public void setActorUrn(String actorUrn) {
        this.actorUrn = actorUrn;
    }

    public ResourceSpec getResourceSpec() {
        return resourceSpec;
    }
    public void setResourceSpec(ResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
    }

    public Boolean getIncludeEvaluationDetails() {
        return includeEvaluationDetails;
    }
    public void setIncludeEvaluationDetails(Boolean includeEvaluationDetails) {
        this.includeEvaluationDetails = includeEvaluationDetails;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (actorUrn != null) {
            joiner.add("actorUrn: \"" + actorUrn + "\"");
        }
        if (resourceSpec != null) {
            joiner.add("resourceSpec: " + resourceSpec);
        }
        if (includeEvaluationDetails != null) {
            joiner.add("includeEvaluationDetails: " + includeEvaluationDetails);
        }
        return joiner.toString();
    }

    public static GetGrantedPrivilegesInput.Builder builder() {
        return new GetGrantedPrivilegesInput.Builder();
    }

    public static class Builder {

        private String actorUrn;
        private ResourceSpec resourceSpec;
        private Boolean includeEvaluationDetails = false;

        public Builder() {
        }

        public Builder setActorUrn(String actorUrn) {
            this.actorUrn = actorUrn;
            return this;
        }

        public Builder setResourceSpec(ResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }

        public Builder setIncludeEvaluationDetails(Boolean includeEvaluationDetails) {
            this.includeEvaluationDetails = includeEvaluationDetails;
            return this;
        }


        public GetGrantedPrivilegesInput build() {
            return new GetGrantedPrivilegesInput(actorUrn, resourceSpec, includeEvaluationDetails);
        }

    }
}
