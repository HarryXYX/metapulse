package com.linkedin.datahub.graphql.generated;


/**
 * Create a new GlossaryNode. Returns the urn of the newly created GlossaryNode. If a node with the provided ID already exists, it will be overwritten.
 */
public interface CreateGlossaryNodeMutationResolver {

    /**
     * Create a new GlossaryNode. Returns the urn of the newly created GlossaryNode. If a node with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryNode(@javax.annotation.Nonnull CreateGlossaryEntityInput input) throws Exception;

}
