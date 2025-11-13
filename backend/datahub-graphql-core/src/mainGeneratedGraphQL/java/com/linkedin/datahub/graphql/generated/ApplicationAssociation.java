package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class ApplicationAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Application application;
    @javax.annotation.Nonnull
    private String associatedUrn;

    public ApplicationAssociation() {
    }

    public ApplicationAssociation(Application application, String associatedUrn) {
        this.application = application;
        this.associatedUrn = associatedUrn;
    }

    /**
     * The application related to the assocaited urn
     */
    public Application getApplication() {
        return application;
    }
    /**
     * The application related to the assocaited urn
     */
    public void setApplication(Application application) {
        this.application = application;
    }

    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        return joiner.toString();
    }

    public static ApplicationAssociation.Builder builder() {
        return new ApplicationAssociation.Builder();
    }

    public static class Builder {

        private Application application;
        private String associatedUrn;

        public Builder() {
        }

        /**
         * The application related to the assocaited urn
         */
        public Builder setApplication(Application application) {
            this.application = application;
            return this;
        }

        /**
         * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }


        public ApplicationAssociation build() {
            return new ApplicationAssociation(application, associatedUrn);
        }

    }
}
