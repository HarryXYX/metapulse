package com.linkedin.datahub.graphql.generated;


/**
 * Lists all DataHub Domains belonging to the specified parent. If no parent is specified, lists root domains.
 */
public interface ListDomainsQueryResolver {

    /**
     * Lists all DataHub Domains belonging to the specified parent. If no parent is specified, lists root domains.
     */
    ListDomainsResult listDomains(@javax.annotation.Nonnull ListDomainsInput input) throws Exception;

}
