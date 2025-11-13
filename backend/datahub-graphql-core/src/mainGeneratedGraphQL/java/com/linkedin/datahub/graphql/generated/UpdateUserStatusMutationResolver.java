package com.linkedin.datahub.graphql.generated;


/**
 * Change the status of a user. Requires Manage Users & Groups Platform Privilege
 */
public interface UpdateUserStatusMutationResolver {

    /**
     * Change the status of a user. Requires Manage Users & Groups Platform Privilege
     */
    String updateUserStatus(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull CorpUserStatus status) throws Exception;

}
