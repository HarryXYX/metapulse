package com.linkedin.datahub.graphql.generated;


/**
 * Fetch a Dataset by primary key (urn) at a point in time based on aspect versions (versionStamp)
 */
public interface VersionedDatasetQueryResolver {

    /**
     * Fetch a Dataset by primary key (urn) at a point in time based on aspect versions (versionStamp)
     */
    VersionedDataset versionedDataset(@javax.annotation.Nonnull String urn, String versionStamp) throws Exception;

}
