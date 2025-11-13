package com.linkedin.datahub.graphql.generated;


/**
 * Create a new group. Returns the urn of the newly created group. Requires the Manage Users & Groups Platform Privilege
 */
public interface CreateGroupMutationResolver {

    /**
     * Create a new group. Returns the urn of the newly created group. Requires the Manage Users & Groups Platform Privilege
     */
    String createGroup(@javax.annotation.Nonnull CreateGroupInput input) throws Exception;

}
