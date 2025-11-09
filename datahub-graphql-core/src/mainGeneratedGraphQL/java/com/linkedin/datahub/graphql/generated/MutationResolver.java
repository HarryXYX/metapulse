package com.linkedin.datahub.graphql.generated;


/**
 * Root type used for updating DataHub Metadata
Coming soon createEntity, addOwner, removeOwner mutations
 */
public interface MutationResolver {

    /**
     * Update the metadata about a particular Dataset
     */
    Dataset updateDataset(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull DatasetUpdateInput input) throws Exception;

    /**
     * Update the metadata about a batch of Datasets
     */
    java.util.List<Dataset> updateDatasets(@javax.annotation.Nonnull java.util.List<BatchDatasetUpdateInput> input) throws Exception;

    /**
     * Update the metadata about a particular Chart
     */
    Chart updateChart(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull ChartUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Dashboard
     */
    Dashboard updateDashboard(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull DashboardUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Notebook
     */
    Notebook updateNotebook(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull NotebookUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Data Flow (Pipeline)
     */
    DataFlow updateDataFlow(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull DataFlowUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Data Job (Task)
     */
    DataJob updateDataJob(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull DataJobUpdateInput input) throws Exception;

    /**
     * Create a new tag. Requires the 'Manage Tags' or 'Create Tags' Platform Privilege. If a Tag with the provided ID already exists,
it will be overwritten.
     */
    String createTag(@javax.annotation.Nonnull CreateTagInput input) throws Exception;

    /**
     * Update the information about a particular Entity Tag
     */
    Tag updateTag(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull TagUpdateInput input) throws Exception;

    /**
     * Delete a Tag
     */
    Boolean deleteTag(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Set the hex color associated with an existing Tag
     */
    Boolean setTagColor(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull String colorHex) throws Exception;

    /**
     * Create a policy and returns the resulting urn
     */
    String createPolicy(@javax.annotation.Nonnull PolicyUpdateInput input) throws Exception;

    /**
     * Update an existing policy and returns the resulting urn
     */
    String updatePolicy(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull PolicyUpdateInput input) throws Exception;

    /**
     * Remove an existing policy and returns the policy urn
     */
    String deletePolicy(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Add a tag to a particular Entity or subresource
     */
    Boolean addTag(@javax.annotation.Nonnull TagAssociationInput input) throws Exception;

    /**
     * Add multiple tags to a particular Entity or subresource
     */
    Boolean addTags(@javax.annotation.Nonnull AddTagsInput input) throws Exception;

    /**
     * Add tags to multiple Entities or subresources
     */
    Boolean batchAddTags(@javax.annotation.Nonnull BatchAddTagsInput input) throws Exception;

    /**
     * Remove a tag from a particular Entity or subresource
     */
    Boolean removeTag(@javax.annotation.Nonnull TagAssociationInput input) throws Exception;

    /**
     * Remove tags from multiple Entities or subresource
     */
    Boolean batchRemoveTags(@javax.annotation.Nonnull BatchRemoveTagsInput input) throws Exception;

    /**
     * Add a glossary term to a particular Entity or subresource
     */
    Boolean addTerm(@javax.annotation.Nonnull TermAssociationInput input) throws Exception;

    /**
     * Add glossary terms to multiple Entities or subresource
     */
    Boolean batchAddTerms(@javax.annotation.Nonnull BatchAddTermsInput input) throws Exception;

    /**
     * Add multiple glossary terms to a particular Entity or subresource
     */
    Boolean addTerms(@javax.annotation.Nonnull AddTermsInput input) throws Exception;

    /**
     * Remove a glossary term from a particular Entity or subresource
     */
    Boolean removeTerm(@javax.annotation.Nonnull TermAssociationInput input) throws Exception;

    /**
     * Remove glossary terms from multiple Entities or subresource
     */
    Boolean batchRemoveTerms(@javax.annotation.Nonnull BatchRemoveTermsInput input) throws Exception;

    /**
     * Add an owner to a particular Entity
     */
    Boolean addOwner(@javax.annotation.Nonnull AddOwnerInput input) throws Exception;

    /**
     * Add owners to multiple Entities
     */
    Boolean batchAddOwners(@javax.annotation.Nonnull BatchAddOwnersInput input) throws Exception;

    /**
     * Add multiple owners to a particular Entity
     */
    Boolean addOwners(@javax.annotation.Nonnull AddOwnersInput input) throws Exception;

    /**
     * Remove an owner from a particular Entity
     */
    Boolean removeOwner(@javax.annotation.Nonnull RemoveOwnerInput input) throws Exception;

    /**
     * Remove owners from multiple Entities
     */
    Boolean batchRemoveOwners(@javax.annotation.Nonnull BatchRemoveOwnersInput input) throws Exception;

    /**
     * Add a link, or institutional memory, for a particular asset
     */
    Boolean addLink(@javax.annotation.Nonnull AddLinkInput input) throws Exception;

    /**
     * Update a link, or institutional memory, for a particular asset.
A combo of link label and url create a unique identifier for which link to update.
     */
    Boolean updateLink(@javax.annotation.Nonnull UpdateLinkInput input) throws Exception;

    /**
     * Upsert a link, or institutional memory, for a particular asset.
A combo of link label and url create a unique identifier to update a link,
or add a new link if no links with label/url combo are found.
     */
    Boolean upsertLink(@javax.annotation.Nonnull UpsertLinkInput input) throws Exception;

    /**
     * Remove a link, or institutional memory, from a particular Entity
     */
    Boolean removeLink(@javax.annotation.Nonnull RemoveLinkInput input) throws Exception;

    /**
     * Incubating. Updates the description of a resource. Currently only supports Dataset Schema Fields, Containers
     */
    Boolean updateDescription(@javax.annotation.Nonnull DescriptionUpdateInput input) throws Exception;

    /**
     * Remove a user. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeUser(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Change the status of a user. Requires Manage Users & Groups Platform Privilege
     */
    String updateUserStatus(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull CorpUserStatus status) throws Exception;

    /**
     * Remove a group. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeGroup(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Add members to a group
     */
    Boolean addGroupMembers(@javax.annotation.Nonnull AddGroupMembersInput input) throws Exception;

    /**
     * Remove members from a group
     */
    Boolean removeGroupMembers(@javax.annotation.Nonnull RemoveGroupMembersInput input) throws Exception;

    /**
     * Create a new group. Returns the urn of the newly created group. Requires the Manage Users & Groups Platform Privilege
     */
    String createGroup(@javax.annotation.Nonnull CreateGroupInput input) throws Exception;

    /**
     * Create a new Domain. Returns the urn of the newly created Domain. Requires the 'Create Domains' or 'Manage Domains' Platform Privilege. If a Domain with the provided ID already exists,
it will be overwritten.
     */
    String createDomain(@javax.annotation.Nonnull CreateDomainInput input) throws Exception;

    /**
     * Moves a domain to be parented under another domain.
     */
    Boolean moveDomain(@javax.annotation.Nonnull MoveDomainInput input) throws Exception;

    /**
     * Delete a Domain
     */
    Boolean deleteDomain(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully added, or already exists. Requires the Edit Domains privilege for the Entity.
     */
    Boolean setDomain(@javax.annotation.Nonnull String entityUrn, @javax.annotation.Nonnull String domainUrn) throws Exception;

    /**
     * Set domain for multiple Entities
     */
    Boolean batchSetDomain(@javax.annotation.Nonnull BatchSetDomainInput input) throws Exception;

    /**
     * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully removed, or was already removed. Requires the Edit Domains privilege for an asset.
     */
    Boolean unsetDomain(@javax.annotation.Nonnull String entityUrn) throws Exception;

    /**
     * Create a ERModelRelationship
     */
    ERModelRelationship createERModelRelationship(@javax.annotation.Nonnull ERModelRelationshipUpdateInput input) throws Exception;

    /**
     * Update a ERModelRelationship
     */
    Boolean updateERModelRelationship(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull ERModelRelationshipUpdateInput input) throws Exception;

    /**
     * Delete a ERModelRelationship
     */
    Boolean deleteERModelRelationship(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Sets the Deprecation status for a Metadata Entity. Requires the Edit Deprecation status privilege for an entity.
     */
    Boolean updateDeprecation(@javax.annotation.Nonnull UpdateDeprecationInput input) throws Exception;

    /**
     * Updates the deprecation status for a batch of assets.
     */
    Boolean batchUpdateDeprecation(@javax.annotation.Nonnull BatchUpdateDeprecationInput input) throws Exception;

    /**
     * Update a particular Corp User's editable properties
     */
    CorpUser updateCorpUserProperties(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull CorpUserUpdateInput input) throws Exception;

    /**
     * Update a particular Corp Group's editable properties
     */
    CorpGroup updateCorpGroupProperties(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull CorpGroupUpdateInput input) throws Exception;

    /**
     * Remove an assertion associated with an entity. Requires the 'Edit Assertions' privilege on the entity.
     */
    Boolean deleteAssertion(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Report a new operation for an asset
     */
    String reportOperation(@javax.annotation.Nonnull ReportOperationInput input) throws Exception;

    /**
     * Create a new GlossaryTerm. Returns the urn of the newly created GlossaryTerm. If a term with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryTerm(@javax.annotation.Nonnull CreateGlossaryEntityInput input) throws Exception;

    /**
     * Create a new GlossaryNode. Returns the urn of the newly created GlossaryNode. If a node with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryNode(@javax.annotation.Nonnull CreateGlossaryEntityInput input) throws Exception;

    /**
     * Updates the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
     */
    Boolean updateParentNode(@javax.annotation.Nonnull UpdateParentNodeInput input) throws Exception;

    /**
     * Remove a glossary entity (GlossaryTerm or GlossaryNode). Return boolean whether it was successful or not.
     */
    Boolean deleteGlossaryEntity(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Updates the name of the entity.
     */
    Boolean updateName(@javax.annotation.Nonnull UpdateNameInput input) throws Exception;

    /**
     * Add multiple related Terms to a Glossary Term to establish relationships
     */
    Boolean addRelatedTerms(@javax.annotation.Nonnull RelatedTermsInput input) throws Exception;

    /**
     * Remove multiple related Terms for a Glossary Term
     */
    Boolean removeRelatedTerms(@javax.annotation.Nonnull RelatedTermsInput input) throws Exception;

    /**
     * Generates a token that can be shared with existing native users to reset their credentials.
     */
    ResetToken createNativeUserResetToken(@javax.annotation.Nonnull CreateNativeUserResetTokenInput input) throws Exception;

    /**
     * Updates the soft deleted status for a batch of assets
     */
    Boolean batchUpdateSoftDeleted(@javax.annotation.Nonnull BatchUpdateSoftDeletedInput input) throws Exception;

    /**
     * Update the View-related settings for a user.
     */
    Boolean updateCorpUserViewsSettings(@javax.annotation.Nonnull UpdateCorpUserViewsSettingsInput input) throws Exception;

    /**
     * Update the HomePage-related settings for a user.
     */
    Boolean updateUserHomePageSettings(@javax.annotation.Nonnull UpdateUserHomePageSettingsInput input) throws Exception;

    /**
     * Update a user setting
     */
    Boolean updateUserSetting(@javax.annotation.Nonnull UpdateUserSettingInput input) throws Exception;

    /**
     * Batch assign roles to users
     */
    Boolean batchAssignRole(@javax.annotation.Nonnull BatchAssignRoleInput input) throws Exception;

    /**
     * Accept role using invite token
     */
    Boolean acceptRole(@javax.annotation.Nonnull AcceptRoleInput input) throws Exception;

    /**
     * Create invite token
     */
    InviteToken createInviteToken(@javax.annotation.Nonnull CreateInviteTokenInput input) throws Exception;

    /**
     * Create a post
     */
    Boolean createPost(@javax.annotation.Nonnull CreatePostInput input) throws Exception;

    /**
     * Update or edit a post
     */
    Boolean updatePost(@javax.annotation.Nonnull UpdatePostInput input) throws Exception;

    /**
     * Delete a post
     */
    Boolean deletePost(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Create a new DataHub View (Saved Filter)
     */
    DataHubView createView(@javax.annotation.Nonnull CreateViewInput input) throws Exception;

    /**
     * Delete a DataHub View (Saved Filter)
     */
    DataHubView updateView(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateViewInput input) throws Exception;

    /**
     * Delete a DataHub View (Saved Filter)
     */
    Boolean deleteView(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Update lineage for an entity
     */
    Boolean updateLineage(@javax.annotation.Nonnull UpdateLineageInput input) throws Exception;

    /**
     * Update the Embed information for a Dataset, Dashboard, or Chart.
     */
    Boolean updateEmbed(@javax.annotation.Nonnull UpdateEmbedInput input) throws Exception;

    /**
     * Create a new Query
     */
    QueryEntity createQuery(@javax.annotation.Nonnull CreateQueryInput input) throws Exception;

    /**
     * Update an existing Query
     */
    QueryEntity updateQuery(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateQueryInput input) throws Exception;

    /**
     * Delete a Query by urn. This requires the 'Edit Queries' Metadata Privilege.
     */
    Boolean deleteQuery(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Create a new Data Product
     */
    DataProduct createDataProduct(@javax.annotation.Nonnull CreateDataProductInput input) throws Exception;

    /**
     * Update a Data Product
     */
    DataProduct updateDataProduct(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateDataProductInput input) throws Exception;

    /**
     * Delete a DataProduct by urn.
     */
    Boolean deleteDataProduct(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Batch set or unset a DataProduct to a list of entities
     */
    Boolean batchSetDataProduct(@javax.annotation.Nonnull BatchSetDataProductInput input) throws Exception;

    /**
     * Create a new Application
     */
    Application createApplication(@javax.annotation.Nonnull CreateApplicationInput input) throws Exception;

    /**
     * Update a Application
     */
    Application updateApplication(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateApplicationInput input) throws Exception;

    /**
     * Delete a Application by urn.
     */
    Boolean deleteApplication(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Batch set or unset a Application to a list of entities
     */
    Boolean batchSetApplication(@javax.annotation.Nonnull BatchSetApplicationInput input) throws Exception;

    /**
     * Create a Custom Ownership Type. This requires the 'Manage Ownership Types' Metadata Privilege.
     */
    OwnershipTypeEntity createOwnershipType(@javax.annotation.Nonnull CreateOwnershipTypeInput input) throws Exception;

    /**
     * Update an existing Query. This requires the 'Manage Ownership Types' Metadata Privilege.
     */
    OwnershipTypeEntity updateOwnershipType(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateOwnershipTypeInput input) throws Exception;

    /**
     * Delete a Custom Ownership Type by urn. This requires the 'Manage Ownership Types' Metadata Privilege.
     */
    Boolean deleteOwnershipType(@javax.annotation.Nonnull String urn, Boolean deleteReferences) throws Exception;

    /**
     * Submit a response to a prompt from a form collecting metadata on different entities.
Provide the urn of the entity you're submitting a form response as well as the required input.
     */
    Boolean submitFormPrompt(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull SubmitFormPromptInput input) throws Exception;

    /**
     * Assign a form to different entities. This will be a patch by adding this form to the list
of forms on an entity.
     */
    Boolean batchAssignForm(@javax.annotation.Nonnull BatchAssignFormInput input) throws Exception;

    /**
     * Creates a filter for a form to apply it to certain entities. Entities that match this filter will have
a given form applied to them.
This feature is ONLY supported in DataHub Cloud.
     */
    Boolean createDynamicFormAssignment(@javax.annotation.Nonnull CreateDynamicFormAssignmentInput input) throws Exception;

    /**
     * Verifies a form on an entity when all of the required questions on the form are complete and the form
is of type VERIFICATION.
     */
    Boolean verifyForm(@javax.annotation.Nonnull VerifyFormInput input) throws Exception;

    /**
     * Create Business Attribute Api
     */
    BusinessAttribute createBusinessAttribute(@javax.annotation.Nonnull CreateBusinessAttributeInput input) throws Exception;

    /**
     * Delete a Business Attribute by urn.
     */
    Boolean deleteBusinessAttribute(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Update Business Attribute
     */
    BusinessAttribute updateBusinessAttribute(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateBusinessAttributeInput input) throws Exception;

    /**
     * Add Business Attribute
     */
    Boolean addBusinessAttribute(@javax.annotation.Nonnull AddBusinessAttributeInput input) throws Exception;

    /**
     * Remove Business Attribute
     */
    Boolean removeBusinessAttribute(@javax.annotation.Nonnull AddBusinessAttributeInput input) throws Exception;

    /**
     * Update a particular entity's display properties
     */
    Boolean updateDisplayProperties(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull DisplayPropertiesUpdateInput input) throws Exception;

    /**
     * Generates an access token for DataHub APIs for a particular user & of a particular type
     */
    AccessToken createAccessToken(@javax.annotation.Nonnull CreateAccessTokenInput input) throws Exception;

    /**
     * Revokes access tokens.
     */
    boolean revokeAccessToken(@javax.annotation.Nonnull String tokenId) throws Exception;

    /**
     * Upsert a Custom Assertion
     */
    @javax.annotation.Nonnull
    Assertion upsertCustomAssertion(String urn, @javax.annotation.Nonnull UpsertCustomAssertionInput input) throws Exception;

    /**
     * Report result for an assertion
     */
    boolean reportAssertionResult(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull AssertionResultInput result) throws Exception;

    /**
     * Create a new test
     */
    String createTest(@javax.annotation.Nonnull CreateTestInput input) throws Exception;

    /**
     * Update an existing test
     */
    String updateTest(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateTestInput input) throws Exception;

    /**
     * Delete an existing test - note that this will NOT delete dangling pointers until the next execution of the test.
     */
    Boolean deleteTest(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Update the global settings related to the Views feature.
Requires the 'Manage Global Views' Platform Privilege.
     */
    boolean updateGlobalViewsSettings(@javax.annotation.Nonnull UpdateGlobalViewsSettingsInput input) throws Exception;

    /**
     * Update the doc propagation settings.
     */
    boolean updateDocPropagationSettings(@javax.annotation.Nonnull UpdateDocPropagationSettingsInput input) throws Exception;

    /**
     * Update the applications settings.
     */
    boolean updateApplicationsSettings(@javax.annotation.Nonnull UpdateApplicationsSettingsInput input) throws Exception;

    /**
     * Create a new Secret
     */
    String createSecret(@javax.annotation.Nonnull CreateSecretInput input) throws Exception;

    /**
     * Update a Secret
     */
    String updateSecret(@javax.annotation.Nonnull UpdateSecretInput input) throws Exception;

    /**
     * Delete a Secret
     */
    String deleteSecret(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Create a new ingestion source
     */
    String createIngestionSource(@javax.annotation.Nonnull UpdateIngestionSourceInput input) throws Exception;

    /**
     * Update an existing ingestion source
     */
    String updateIngestionSource(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateIngestionSourceInput input) throws Exception;

    /**
     * Delete an existing ingestion source
     */
    String deleteIngestionSource(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Create a request to execute an ingestion job
input: Input required for creating an ingestion execution request
     */
    String createIngestionExecutionRequest(@javax.annotation.Nonnull CreateIngestionExecutionRequestInput input) throws Exception;

    /**
     * Cancel a running execution request, provided the urn of the original execution request
     */
    String cancelIngestionExecutionRequest(@javax.annotation.Nonnull CancelIngestionExecutionRequestInput input) throws Exception;

    /**
     * Create a request to execute a test ingestion connection job
input: Input required for creating a test connection request
     */
    String createTestConnectionRequest(@javax.annotation.Nonnull CreateTestConnectionRequestInput input) throws Exception;

    /**
     * Rollback a specific ingestion execution run based on its runId
     */
    String rollbackIngestion(@javax.annotation.Nonnull RollbackIngestionInput input) throws Exception;

    /**
     * Batch update the state for a set of steps.
     */
    @javax.annotation.Nonnull
    DataHubPageTemplate upsertPageTemplate(@javax.annotation.Nonnull UpsertPageTemplateInput input) throws Exception;

    /**
     * Delete a DataHub page template
     */
    boolean deletePageTemplate(@javax.annotation.Nonnull DeletePageTemplateInput input) throws Exception;

    /**
     * Create a new incident for a resource (asset)
     */
    String raiseIncident(@javax.annotation.Nonnull RaiseIncidentInput input) throws Exception;

    /**
     * Update the status of an existing incident for a resource (asset)
     */
    Boolean updateIncidentStatus(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull IncidentStatusInput input) throws Exception;

    /**
     * Update an existing data incident. Any fields that are omitted will simply not be updated.
     */
    Boolean updateIncident(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull UpdateIncidentInput input) throws Exception;

    /**
     * Upsert a particular connection.
This requires the 'Manage Connections' platform privilege.
     */
    @javax.annotation.Nonnull
    DataHubConnection upsertConnection(@javax.annotation.Nonnull UpsertDataHubConnectionInput input) throws Exception;

    /**
     * Link the latest versioned entity to a Version Set
     */
    VersionSet linkAssetVersion(@javax.annotation.Nonnull LinkVersionInput input) throws Exception;

    /**
     * Unlink a versioned entity from a Version Set
     */
    VersionSet unlinkAssetVersion(@javax.annotation.Nonnull UnlinkVersionInput input) throws Exception;

    /**
     * Update an asset's settings
     */
    @javax.annotation.Nonnull
    AssetSettings updateAssetSettings(@javax.annotation.Nonnull UpdateAssetSettingsInput input) throws Exception;

    /**
     * Set or unset an entity's logical parent
     */
    Boolean setLogicalParent(@javax.annotation.Nonnull SetLogicalParentInput input) throws Exception;

    @javax.annotation.Nonnull
    PatchEntityResult patchEntity(@javax.annotation.Nonnull PatchEntityInput input) throws Exception;

    @javax.annotation.Nonnull
    java.util.List<PatchEntityResult> patchEntities(@javax.annotation.Nonnull java.util.List<PatchEntityInput> input) throws Exception;

    /**
     * Create or update a data contract for a given dataset. Requires the "Edit Data Contract" privilege for the provided dataset.
     */
    @javax.annotation.Nonnull
    DataContract upsertDataContract(String urn, @javax.annotation.Nonnull UpsertDataContractInput input) throws Exception;

    /**
     * Create or update a DataHub page module
     */
    @javax.annotation.Nonnull
    DataHubPageModule upsertPageModule(@javax.annotation.Nonnull UpsertPageModuleInput input) throws Exception;

    /**
     * Delete a DataHub page module
     */
    boolean deletePageModule(@javax.annotation.Nonnull DeletePageModuleInput input) throws Exception;

    /**
     * Create a new DataHub file entity
     */
    @javax.annotation.Nonnull
    CreateDataHubFileResponse createDataHubFile(@javax.annotation.Nonnull CreateDataHubFileInput input) throws Exception;

    /**
     * Batch update the state for a set of steps.
     */
    @javax.annotation.Nonnull
    BatchUpdateStepStatesResult batchUpdateStepStates(@javax.annotation.Nonnull BatchUpdateStepStatesInput input) throws Exception;

    /**
     * Upsert structured properties onto a given asset
     */
    @javax.annotation.Nonnull
    StructuredProperties upsertStructuredProperties(@javax.annotation.Nonnull UpsertStructuredPropertiesInput input) throws Exception;

    /**
     * Upsert structured properties onto a given asset
     */
    @javax.annotation.Nonnull
    StructuredProperties removeStructuredProperties(@javax.annotation.Nonnull RemoveStructuredPropertiesInput input) throws Exception;

    /**
     * Create a new structured property
     */
    @javax.annotation.Nonnull
    StructuredPropertyEntity createStructuredProperty(@javax.annotation.Nonnull CreateStructuredPropertyInput input) throws Exception;

    /**
     * Update an existing structured property
     */
    @javax.annotation.Nonnull
    StructuredPropertyEntity updateStructuredProperty(@javax.annotation.Nonnull UpdateStructuredPropertyInput input) throws Exception;

    /**
     * Delete an existing structured property
     */
    boolean deleteStructuredProperty(@javax.annotation.Nonnull DeleteStructuredPropertyInput input) throws Exception;

    /**
     * Remove a form from a given list of entities.
     */
    boolean batchRemoveForm(@javax.annotation.Nonnull BatchRemoveFormInput input) throws Exception;

    /**
     * Create a new form based on the input
     */
    @javax.annotation.Nonnull
    Form createForm(@javax.annotation.Nonnull CreateFormInput input) throws Exception;

    /**
     * Delete a given form
     */
    boolean deleteForm(@javax.annotation.Nonnull DeleteFormInput input) throws Exception;

    /**
     * Update an existing form based on the input
     */
    @javax.annotation.Nonnull
    Form updateForm(@javax.annotation.Nonnull UpdateFormInput input) throws Exception;

}
