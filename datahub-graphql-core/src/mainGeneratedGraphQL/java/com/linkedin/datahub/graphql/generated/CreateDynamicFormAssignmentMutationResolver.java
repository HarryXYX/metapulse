package com.linkedin.datahub.graphql.generated;


/**
 * Creates a filter for a form to apply it to certain entities. Entities that match this filter will have
a given form applied to them.
This feature is ONLY supported in DataHub Cloud.
 */
public interface CreateDynamicFormAssignmentMutationResolver {

    /**
     * Creates a filter for a form to apply it to certain entities. Entities that match this filter will have
a given form applied to them.
This feature is ONLY supported in DataHub Cloud.
     */
    Boolean createDynamicFormAssignment(@javax.annotation.Nonnull CreateDynamicFormAssignmentInput input) throws Exception;

}
