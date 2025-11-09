package com.linkedin.datahub.graphql.generated;


/**
 * Create a new tag. Requires the 'Manage Tags' or 'Create Tags' Platform Privilege. If a Tag with the provided ID already exists,
it will be overwritten.
 */
public interface CreateTagMutationResolver {

    /**
     * Create a new tag. Requires the 'Manage Tags' or 'Create Tags' Platform Privilege. If a Tag with the provided ID already exists,
it will be overwritten.
     */
    String createTag(@javax.annotation.Nonnull CreateTagInput input) throws Exception;

}
