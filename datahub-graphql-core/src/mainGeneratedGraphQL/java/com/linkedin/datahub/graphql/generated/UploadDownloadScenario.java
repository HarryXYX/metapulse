package com.linkedin.datahub.graphql.generated;

/**
 * Enum to specify the context of the upload.
 */
public enum UploadDownloadScenario {

    /**
     * Upload for asset documentation.
     */
    ASSET_DOCUMENTATION("ASSET_DOCUMENTATION");

    private final String graphqlName;

    private UploadDownloadScenario(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
