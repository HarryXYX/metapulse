package com.linkedin.datahub.graphql.generated;


/**
 * Updates the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
 */
public interface UpdateParentNodeMutationResolver {

    /**
     * Updates the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
     */
    Boolean updateParentNode(@javax.annotation.Nonnull UpdateParentNodeInput input) throws Exception;

}
