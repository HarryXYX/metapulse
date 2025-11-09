package com.linkedin.datahub.graphql.generated;


/**
 * Root type used for fetching DataHub Metadata
Coming soon listEntity queries for listing all entities of a given type
 */
public interface QueryResolver {

    /**
     * Fetch a Data Platform by primary key (urn)
     */
    DataPlatform dataPlatform(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
     */
    CorpUser corpUser(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
     */
    CorpGroup corpGroup(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Dataset by primary key (urn)
     */
    Dataset dataset(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Dataset by primary key (urn) at a point in time based on aspect versions (versionStamp)
     */
    VersionedDataset versionedDataset(@javax.annotation.Nonnull String urn, String versionStamp) throws Exception;

    /**
     * Fetch a Dashboard by primary key (urn)
     */
    Dashboard dashboard(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Notebook by primary key (urn)
     */
    Notebook notebook(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Chart by primary key (urn)
     */
    Chart chart(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
     */
    DataFlow dataFlow(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Data Job (or Data Task) by primary key (urn)
     */
    DataJob dataJob(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Tag by primary key (urn)
     */
    Tag tag(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a View by primary key (urn)
     */
    DataHubView view(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Form by primary key (urn)
     */
    Form form(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Role by primary key (urn)
     */
    Role role(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Structured Property by primary key (urn)
     */
    StructuredPropertyEntity structuredProperty(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a ERModelRelationship by primary key (urn)
     */
    ERModelRelationship erModelRelationship(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Glossary Term by primary key (urn)
     */
    GlossaryTerm glossaryTerm(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Glossary Node by primary key (urn)
     */
    GlossaryNode glossaryNode(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch an Entity Container by primary key (urn)
     */
    Container container(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Domain by primary key (urn)
     */
    Domain domain(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch an Assertion by primary key (urn)
     */
    Assertion assertion(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * List all DataHub Access Policies
     */
    ListPoliciesResult listPolicies(@javax.annotation.Nonnull ListPoliciesInput input) throws Exception;

    /**
     * Get all granted privileges for the given actor and resource
     */
    Privileges getGrantedPrivileges(@javax.annotation.Nonnull GetGrantedPrivilegesInput input) throws Exception;

    /**
     * Incubating: Fetch an ML Model by primary key (urn)
     */
    MLModel mlModel(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Incubating: Fetch an ML Model Group by primary key (urn)
     */
    MLModelGroup mlModelGroup(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Feature by primary key (urn)
     */
    MLFeature mlFeature(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Feature Table by primary key (urn)
     */
    MLFeatureTable mlFeatureTable(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Primary Key by primary key (urn)
     */
    MLPrimaryKey mlPrimaryKey(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * List all DataHub Users
     */
    ListUsersResult listUsers(@javax.annotation.Nonnull ListUsersInput input) throws Exception;

    /**
     * List all DataHub Groups
     */
    ListGroupsResult listGroups(@javax.annotation.Nonnull ListGroupsInput input) throws Exception;

    /**
     * Fetches the number of entities ingested by type
     */
    EntityCountResults getEntityCounts(EntityCountInput input) throws Exception;

    /**
     * Lists all DataHub Domains belonging to the specified parent. If no parent is specified, lists root domains.
     */
    ListDomainsResult listDomains(@javax.annotation.Nonnull ListDomainsInput input) throws Exception;

    /**
     * Get all GlossaryTerms without a parentNode
     */
    GetRootGlossaryTermsResult getRootGlossaryTerms(@javax.annotation.Nonnull GetRootGlossaryEntitiesInput input) throws Exception;

    /**
     * Get all GlossaryNodes without a parentNode
     */
    GetRootGlossaryNodesResult getRootGlossaryNodes(@javax.annotation.Nonnull GetRootGlossaryEntitiesInput input) throws Exception;

    /**
     * Get whether or not not an entity exists
     */
    Boolean entityExists(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Gets an entity based on its urn
     */
    Entity entity(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Gets entities based on their urns
checkForExistence will do n+1 sql calls to check for existence of each entity requested if set to true
     */
    java.util.List<Entity> entities(@javax.annotation.Nonnull java.util.List<String> urns, Boolean checkForExistence) throws Exception;

    /**
     * List all DataHub Roles
     */
    ListRolesResult listRoles(@javax.annotation.Nonnull ListRolesInput input) throws Exception;

    /**
     * Get invite token
     */
    InviteToken getInviteToken(@javax.annotation.Nonnull GetInviteTokenInput input) throws Exception;

    /**
     * List all Posts
     */
    ListPostsResult listPosts(@javax.annotation.Nonnull ListPostsInput input) throws Exception;

    /**
     * List DataHub Views owned by the current user
     */
    ListViewsResult listMyViews(@javax.annotation.Nonnull ListMyViewsInput input) throws Exception;

    /**
     * List Global DataHub Views
     */
    ListViewsResult listGlobalViews(@javax.annotation.Nonnull ListGlobalViewsInput input) throws Exception;

    /**
     * List Dataset Queries
     */
    ListQueriesResult listQueries(@javax.annotation.Nonnull ListQueriesInput input) throws Exception;

    /**
     * Get quick filters to display in auto-complete
     */
    GetQuickFiltersResult getQuickFilters(@javax.annotation.Nonnull GetQuickFiltersInput input) throws Exception;

    /**
     * Fetch a DataProduct by primary key (urn)
     */
    DataProduct dataProduct(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * List Custom Ownership Types
     */
    @javax.annotation.Nonnull
    ListOwnershipTypesResult listOwnershipTypes(@javax.annotation.Nonnull ListOwnershipTypesInput input) throws Exception;

    /**
     * Fetch a Data Platform Instance by primary key (urn)
     */
    DataPlatformInstance dataPlatformInstance(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch a Business Attribute by primary key (urn)
     */
    BusinessAttribute businessAttribute(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch all Business Attributes
     */
    ListBusinessAttributesResult listBusinessAttributes(@javax.annotation.Nonnull ListBusinessAttributesInput input) throws Exception;

    /**
     * Fetch a Data Process Instance by primary key (urn)
     */
    DataProcessInstance dataProcessInstance(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Fetch an Application by primary key (urn)
     */
    Application application(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Generates an access token for DataHub APIs for a particular user & of a particular type
Deprecated, use createAccessToken instead
     */
    AccessToken getAccessToken(@javax.annotation.Nonnull GetAccessTokenInput input) throws Exception;

    /**
     * List access tokens stored in DataHub.
     */
    @javax.annotation.Nonnull
    ListAccessTokenResult listAccessTokens(@javax.annotation.Nonnull ListAccessTokenInput input) throws Exception;

    /**
     * Fetches the metadata of an access token.
This is useful to debug when you have a raw token but don't know the actor.
     */
    @javax.annotation.Nonnull
    AccessTokenMetadata getAccessTokenMetadata(@javax.annotation.Nonnull String token) throws Exception;

    /**
     * Experimental API to debug Access for users.
Backward incompatible changes will be made without notice in the future.
Do not build on top of this API.
     */
    @javax.annotation.Nonnull
    DebugAccessResult debugAccess(@javax.annotation.Nonnull String userUrn) throws Exception;

    /**
     * Fetch a Test by primary key (urn)
     */
    Test test(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * List all DataHub Tests
     */
    ListTestsResult listTests(@javax.annotation.Nonnull ListTestsInput input) throws Exception;

    /**
     * Fetch details associated with the authenticated user, provided via an auth cookie or header
     */
    AuthenticatedUser me() throws Exception;

    /**
     * Fetch configurations
Used by DataHub UI
     */
    AppConfig appConfig() throws Exception;

    /**
     * Fetch the Global Settings related to the Views feature.
Requires the 'Manage Global Views' Platform Privilege.
     */
    GlobalViewsSettings globalViewsSettings() throws Exception;

    /**
     * Fetch the global settings related to the docs propagation feature.
     */
    DocPropagationSettings docPropagationSettings() throws Exception;

    /**
     * Global settings related to the home page for an instance
     */
    GlobalHomePageSettings globalHomePageSettings() throws Exception;

    /**
     * Fetch the latest product update information from configured JSON source.
Returns null if the JSON source is unavailable or feature is disabled.
     */
    ProductUpdate latestProductUpdate(Boolean refreshCache) throws Exception;

    /**
     * List all secrets stored in DataHub (no values)
     */
    ListSecretsResult listSecrets(@javax.annotation.Nonnull ListSecretsInput input) throws Exception;

    /**
     * Fetch the values of a set of secrets. The caller must have the MANAGE_SECRETS
privilege to use.
     */
    java.util.List<SecretValue> getSecretValues(@javax.annotation.Nonnull GetSecretValuesInput input) throws Exception;

    /**
     * List all ingestion sources
     */
    ListIngestionSourcesResult listIngestionSources(@javax.annotation.Nonnull ListIngestionSourcesInput input) throws Exception;

    /**
     * Fetch a specific ingestion source
urn: The primary key associated with the ingestion source.
     */
    IngestionSource ingestionSource(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * List all execution requests
     */
    IngestionSourceExecutionRequests listExecutionRequests(@javax.annotation.Nonnull ListExecutionRequestsInput input) throws Exception;

    /**
     * Get an execution request
urn: The primary key associated with the execution request.
     */
    ExecutionRequest executionRequest(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Get a set of connection details by URN.
This requires the 'Manage Connections' platform privilege.
Returns null if a connection with the provided urn does not exist.
     */
    DataHubConnection connection(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Deprecated, use appConfig Query instead
Whether the analytics feature is enabled in the UI
     */
    @Deprecated
    boolean isAnalyticsEnabled() throws Exception;

    /**
     * Retrieves a set of server driven Analytics Charts to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getAnalyticsCharts() throws Exception;

    /**
     * Retrieves a set of server driven Analytics Highlight Cards to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<Highlight> getHighlights() throws Exception;

    /**
     * Retrieves a set of charts regarding the ingested metadata
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getMetadataAnalyticsCharts(@javax.annotation.Nonnull MetadataAnalyticsInput input) throws Exception;

    /**
     * Fetch a Version Set by its URN
     */
    VersionSet versionSet(@javax.annotation.Nonnull String urn) throws Exception;

    /**
     * Returns the most recent changes made to each column in a dataset at each dataset version.
     */
    GetSchemaBlameResult getSchemaBlame(@javax.annotation.Nonnull GetSchemaBlameInput input) throws Exception;

    /**
     * Returns the list of schema versions for a dataset.
     */
    GetSchemaVersionListResult getSchemaVersionList(@javax.annotation.Nonnull GetSchemaVersionListInput input) throws Exception;

    /**
     * Returns a list of timeline actions for an entity based on the filter criteria
     */
    GetTimelineResult getTimeline(@javax.annotation.Nonnull GetTimelineInput input) throws Exception;

    /**
     * Full text search against a specific DataHub Entity Type
     */
    SearchResults search(@javax.annotation.Nonnull SearchInput input) throws Exception;

    /**
     * Search DataHub entities
     */
    SearchResults searchAcrossEntities(@javax.annotation.Nonnull SearchAcrossEntitiesInput input) throws Exception;

    /**
     * Search DataHub entities by providing a pointer reference for scrolling through results.
     */
    ScrollResults scrollAcrossEntities(@javax.annotation.Nonnull ScrollAcrossEntitiesInput input) throws Exception;

    /**
     * Search across the results of a graph query on a node
     */
    SearchAcrossLineageResults searchAcrossLineage(@javax.annotation.Nonnull SearchAcrossLineageInput input) throws Exception;

    /**
     * Search across the results of a graph query on a node, uses scroll API
     */
    ScrollAcrossLineageResults scrollAcrossLineage(@javax.annotation.Nonnull ScrollAcrossLineageInput input) throws Exception;

    /**
     * Autocomplete a search query against a specific DataHub Entity Type
     */
    AutoCompleteResults autoComplete(@javax.annotation.Nonnull AutoCompleteInput input) throws Exception;

    /**
     * Autocomplete a search query against a specific set of DataHub Entity Types
     */
    AutoCompleteMultipleResults autoCompleteForMultiple(@javax.annotation.Nonnull AutoCompleteMultipleInput input) throws Exception;

    /**
     * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
     */
    BrowseResults browse(@javax.annotation.Nonnull BrowseInput input) throws Exception;

    /**
     * Retrieve the browse paths corresponding to an entity
     */
    java.util.List<BrowsePath> browsePaths(@javax.annotation.Nonnull BrowsePathsInput input) throws Exception;

    /**
     * Aggregate across DataHub entities
     */
    AggregateResults aggregateAcrossEntities(@javax.annotation.Nonnull AggregateAcrossEntitiesInput input) throws Exception;

    /**
     * List Data Product assets for a given urn
     */
    SearchResults listDataProductAssets(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull SearchAcrossEntitiesInput input) throws Exception;

    /**
     * List Application assets for a given urn
     */
    SearchResults listApplicationAssets(@javax.annotation.Nonnull String urn, @javax.annotation.Nonnull SearchAcrossEntitiesInput input) throws Exception;

    /**
     * Browse for different entities by getting organizational groups and their
aggregated counts + content. Uses browsePathsV2 aspect and replaces our old
browse endpoint.
     */
    BrowseResultsV2 browseV2(@javax.annotation.Nonnull BrowseV2Input input) throws Exception;

    /**
     * Generates a presigned url to upload files
     */
    @javax.annotation.Nonnull
    GetPresignedUploadUrlResponse getPresignedUploadUrl(@javax.annotation.Nonnull GetPresignedUploadUrlInput input) throws Exception;

    /**
     * Batch fetch the state for a set of steps.
     */
    @javax.annotation.Nonnull
    BatchGetStepStatesResult batchGetStepStates(@javax.annotation.Nonnull BatchGetStepStatesInput input) throws Exception;

    /**
     * Fetch recommendations for a particular scenario
     */
    ListRecommendationsResult listRecommendations(@javax.annotation.Nonnull ListRecommendationsInput input) throws Exception;

}
