package com.linkedin.datahub.graphql.generated;


/**
 * Upsert a link, or institutional memory, for a particular asset.
A combo of link label and url create a unique identifier to update a link,
or add a new link if no links with label/url combo are found.
 */
public interface UpsertLinkMutationResolver {

    /**
     * Upsert a link, or institutional memory, for a particular asset.
A combo of link label and url create a unique identifier to update a link,
or add a new link if no links with label/url combo are found.
     */
    Boolean upsertLink(@javax.annotation.Nonnull UpsertLinkInput input) throws Exception;

}
