package com.linkedin.datahub.graphql.generated;


/**
 * Create a new GlossaryTerm. Returns the urn of the newly created GlossaryTerm. If a term with the provided ID already exists, it will be overwritten.
 */
public interface CreateGlossaryTermMutationResolver {

    /**
     * Create a new GlossaryTerm. Returns the urn of the newly created GlossaryTerm. If a term with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryTerm(@javax.annotation.Nonnull CreateGlossaryEntityInput input) throws Exception;

}
