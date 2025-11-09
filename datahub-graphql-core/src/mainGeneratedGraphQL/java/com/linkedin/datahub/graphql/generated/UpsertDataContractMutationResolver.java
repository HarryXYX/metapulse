package com.linkedin.datahub.graphql.generated;


/**
 * Create or update a data contract for a given dataset. Requires the "Edit Data Contract" privilege for the provided dataset.
 */
public interface UpsertDataContractMutationResolver {

    /**
     * Create or update a data contract for a given dataset. Requires the "Edit Data Contract" privilege for the provided dataset.
     */
    @javax.annotation.Nonnull
    DataContract upsertDataContract(String urn, @javax.annotation.Nonnull UpsertDataContractInput input) throws Exception;

}
