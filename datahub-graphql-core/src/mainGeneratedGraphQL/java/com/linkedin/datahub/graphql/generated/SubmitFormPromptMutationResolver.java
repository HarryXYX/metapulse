package com.linkedin.datahub.graphql.generated;


/**
 * Submit a response to a prompt from a form collecting metadata on different entities.
Provide the urn of the entity you're submitting a form response as well as the required input.
 */
public interface SubmitFormPromptMutationResolver {

    /**
     * Submit a response to a prompt from a form collecting metadata on different entities.
Provide the urn of the entity you're submitting a form response as well as the required input.
     */
    Boolean submitFormPrompt(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull SubmitFormPromptInput input) throws Exception;

}
