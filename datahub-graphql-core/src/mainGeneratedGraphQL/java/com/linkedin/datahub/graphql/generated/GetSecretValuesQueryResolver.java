package com.linkedin.datahub.graphql.generated;


/**
 * Fetch the values of a set of secrets. The caller must have the MANAGE_SECRETS
privilege to use.
 */
public interface GetSecretValuesQueryResolver {

    /**
     * Fetch the values of a set of secrets. The caller must have the MANAGE_SECRETS
privilege to use.
     */
    java.util.List<SecretValue> getSecretValues(@javax.annotation.Nonnull GetSecretValuesInput input) throws Exception;

}
