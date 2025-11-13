
package com.linkedin.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.browse.BrowseResult;
import com.linkedin.metadata.query.AutoCompleteResult;
import com.linkedin.metadata.query.ListResult;
import com.linkedin.metadata.query.ListUrnsResult;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.run.DeleteEntityResponse;
import com.linkedin.metadata.run.DeleteReferencesResponse;
import com.linkedin.metadata.run.RollbackResponse;
import com.linkedin.metadata.search.LineageScrollResult;
import com.linkedin.metadata.search.LineageSearchResult;
import com.linkedin.metadata.search.ScrollResult;
import com.linkedin.metadata.search.SearchResult;
import com.linkedin.mxe.SystemMetadata;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * Single unified resource for fetching, updating, searching, & browsing DataHub entities
 * 
 * generated from: com.linkedin.metadata.resources.entity.EntityResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.entities.restspec.json.")
public class EntitiesRequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "entities";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> applyRetentionParams = new ArrayList<FieldDef<?>>();
        applyRetentionParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        applyRetentionParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        applyRetentionParams.add(new FieldDef<Integer>("attemptWithVersion", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        applyRetentionParams.add(new FieldDef<java.lang.String>("aspectName", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        applyRetentionParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("applyRetention", new DynamicRecordMetadata("applyRetention", applyRetentionParams));
        ArrayList<FieldDef<?>> autocompleteParams = new ArrayList<FieldDef<?>>();
        autocompleteParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        autocompleteParams.add(new FieldDef<java.lang.String>("query", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        autocompleteParams.add(new FieldDef<java.lang.String>("field", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        autocompleteParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        autocompleteParams.add(new FieldDef<Integer>("limit", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        autocompleteParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("autocomplete", new DynamicRecordMetadata("autocomplete", autocompleteParams));
        ArrayList<FieldDef<?>> batchGetTotalEntityCountParams = new ArrayList<FieldDef<?>>();
        batchGetTotalEntityCountParams.add(new FieldDef<StringArray>("entities", StringArray.class, DataTemplateUtil.getSchema(StringArray.class)));
        requestMetadataMap.put("batchGetTotalEntityCount", new DynamicRecordMetadata("batchGetTotalEntityCount", batchGetTotalEntityCountParams));
        ArrayList<FieldDef<?>> batchIngestParams = new ArrayList<FieldDef<?>>();
        batchIngestParams.add(new FieldDef<com.linkedin.entity.EntityArray>("entities", com.linkedin.entity.EntityArray.class, DataTemplateUtil.getSchema(com.linkedin.entity.EntityArray.class)));
        batchIngestParams.add(new FieldDef<com.linkedin.mxe.SystemMetadataArray>("systemMetadata", com.linkedin.mxe.SystemMetadataArray.class, DataTemplateUtil.getSchema(com.linkedin.mxe.SystemMetadataArray.class)));
        requestMetadataMap.put("batchIngest", new DynamicRecordMetadata("batchIngest", batchIngestParams));
        ArrayList<FieldDef<?>> browseParams = new ArrayList<FieldDef<?>>();
        browseParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        browseParams.add(new FieldDef<java.lang.String>("path", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        browseParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        browseParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        browseParams.add(new FieldDef<Integer>("limit", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        browseParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("browse", new DynamicRecordMetadata("browse", browseParams));
        ArrayList<FieldDef<?>> deleteParams = new ArrayList<FieldDef<?>>();
        deleteParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        deleteParams.add(new FieldDef<java.lang.String>("aspectName", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        deleteParams.add(new FieldDef<Long>("startTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        deleteParams.add(new FieldDef<Long>("endTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        requestMetadataMap.put("delete", new DynamicRecordMetadata("delete", deleteParams));
        ArrayList<FieldDef<?>> deleteAllParams = new ArrayList<FieldDef<?>>();
        deleteAllParams.add(new FieldDef<java.lang.String>("registryId", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        deleteAllParams.add(new FieldDef<Boolean>("dryRun", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("deleteAll", new DynamicRecordMetadata("deleteAll", deleteAllParams));
        ArrayList<FieldDef<?>> deleteReferencesParams = new ArrayList<FieldDef<?>>();
        deleteReferencesParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        deleteReferencesParams.add(new FieldDef<Boolean>("dryRun", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("deleteReferences", new DynamicRecordMetadata("deleteReferences", deleteReferencesParams));
        ArrayList<FieldDef<?>> existsParams = new ArrayList<FieldDef<?>>();
        existsParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        existsParams.add(new FieldDef<Boolean>("includeSoftDelete", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("exists", new DynamicRecordMetadata("exists", existsParams));
        ArrayList<FieldDef<?>> filterParams = new ArrayList<FieldDef<?>>();
        filterParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        filterParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        filterParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        filterParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        filterParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        filterParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        requestMetadataMap.put("filter", new DynamicRecordMetadata("filter", filterParams));
        ArrayList<FieldDef<?>> getBrowsePathsParams = new ArrayList<FieldDef<?>>();
        getBrowsePathsParams.add(new FieldDef<com.linkedin.common.urn.Urn>("urn", com.linkedin.common.urn.Urn.class, DataTemplateUtil.getSchema(com.linkedin.common.Urn.class)));
        requestMetadataMap.put("getBrowsePaths", new DynamicRecordMetadata("getBrowsePaths", getBrowsePathsParams));
        ArrayList<FieldDef<?>> getTotalEntityCountParams = new ArrayList<FieldDef<?>>();
        getTotalEntityCountParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("getTotalEntityCount", new DynamicRecordMetadata("getTotalEntityCount", getTotalEntityCountParams));
        ArrayList<FieldDef<?>> ingestParams = new ArrayList<FieldDef<?>>();
        ingestParams.add(new FieldDef<Entity>("entity", Entity.class, DataTemplateUtil.getSchema(Entity.class)));
        ingestParams.add(new FieldDef<SystemMetadata>("systemMetadata", SystemMetadata.class, DataTemplateUtil.getSchema(SystemMetadata.class)));
        requestMetadataMap.put("ingest", new DynamicRecordMetadata("ingest", ingestParams));
        ArrayList<FieldDef<?>> listParams = new ArrayList<FieldDef<?>>();
        listParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        listParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        listParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        listParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        listParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        listParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        requestMetadataMap.put("list", new DynamicRecordMetadata("list", listParams));
        ArrayList<FieldDef<?>> listUrnsParams = new ArrayList<FieldDef<?>>();
        listUrnsParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        listUrnsParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        listUrnsParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        requestMetadataMap.put("listUrns", new DynamicRecordMetadata("listUrns", listUrnsParams));
        ArrayList<FieldDef<?>> scrollAcrossEntitiesParams = new ArrayList<FieldDef<?>>();
        scrollAcrossEntitiesParams.add(new FieldDef<StringArray>("entities", StringArray.class, DataTemplateUtil.getSchema(StringArray.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<java.lang.String>("input", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<java.lang.String>("scrollId", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<java.lang.String>("keepAlive", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        scrollAcrossEntitiesParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("scrollAcrossEntities", new DynamicRecordMetadata("scrollAcrossEntities", scrollAcrossEntitiesParams));
        ArrayList<FieldDef<?>> scrollAcrossLineageParams = new ArrayList<FieldDef<?>>();
        scrollAcrossLineageParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossLineageParams.add(new FieldDef<java.lang.String>("direction", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossLineageParams.add(new FieldDef<StringArray>("entities", StringArray.class, DataTemplateUtil.getSchema(StringArray.class)));
        scrollAcrossLineageParams.add(new FieldDef<java.lang.String>("input", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossLineageParams.add(new FieldDef<Integer>("maxHops", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        scrollAcrossLineageParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        scrollAcrossLineageParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        scrollAcrossLineageParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        scrollAcrossLineageParams.add(new FieldDef<java.lang.String>("scrollId", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossLineageParams.add(new FieldDef<java.lang.String>("keepAlive", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        scrollAcrossLineageParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        scrollAcrossLineageParams.add(new FieldDef<Long>("startTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        scrollAcrossLineageParams.add(new FieldDef<Long>("endTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        scrollAcrossLineageParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("scrollAcrossLineage", new DynamicRecordMetadata("scrollAcrossLineage", scrollAcrossLineageParams));
        ArrayList<FieldDef<?>> searchParams = new ArrayList<FieldDef<?>>();
        searchParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        searchParams.add(new FieldDef<java.lang.String>("input", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        searchParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        searchParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        searchParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        searchParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchParams.add(new FieldDef<Boolean>("fulltext", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        searchParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("search", new DynamicRecordMetadata("search", searchParams));
        ArrayList<FieldDef<?>> searchAcrossEntitiesParams = new ArrayList<FieldDef<?>>();
        searchAcrossEntitiesParams.add(new FieldDef<StringArray>("entities", StringArray.class, DataTemplateUtil.getSchema(StringArray.class)));
        searchAcrossEntitiesParams.add(new FieldDef<java.lang.String>("input", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        searchAcrossEntitiesParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        searchAcrossEntitiesParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        searchAcrossEntitiesParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        searchAcrossEntitiesParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchAcrossEntitiesParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchAcrossEntitiesParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("searchAcrossEntities", new DynamicRecordMetadata("searchAcrossEntities", searchAcrossEntitiesParams));
        ArrayList<FieldDef<?>> searchAcrossLineageParams = new ArrayList<FieldDef<?>>();
        searchAcrossLineageParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        searchAcrossLineageParams.add(new FieldDef<java.lang.String>("direction", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        searchAcrossLineageParams.add(new FieldDef<StringArray>("entities", StringArray.class, DataTemplateUtil.getSchema(StringArray.class)));
        searchAcrossLineageParams.add(new FieldDef<java.lang.String>("input", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        searchAcrossLineageParams.add(new FieldDef<Integer>("maxHops", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchAcrossLineageParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        searchAcrossLineageParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        searchAcrossLineageParams.add(new FieldDef<com.linkedin.metadata.query.filter.SortCriterionArray>("sortCriteria", com.linkedin.metadata.query.filter.SortCriterionArray.class, DataTemplateUtil.getSchema(com.linkedin.metadata.query.filter.SortCriterionArray.class)));
        searchAcrossLineageParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchAcrossLineageParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        searchAcrossLineageParams.add(new FieldDef<Long>("startTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        searchAcrossLineageParams.add(new FieldDef<Long>("endTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        searchAcrossLineageParams.add(new FieldDef<SearchFlags>("searchFlags", SearchFlags.class, DataTemplateUtil.getSchema(SearchFlags.class)));
        requestMetadataMap.put("searchAcrossLineage", new DynamicRecordMetadata("searchAcrossLineage", searchAcrossLineageParams));
        ArrayList<FieldDef<?>> setWritableParams = new ArrayList<FieldDef<?>>();
        setWritableParams.add(new FieldDef<Boolean>("value", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("setWritable", new DynamicRecordMetadata("setWritable", setWritableParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("applyRetention", new DynamicRecordMetadata("applyRetention", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        responseMetadataMap.put("autocomplete", new DynamicRecordMetadata("autocomplete", Collections.singletonList(new FieldDef<AutoCompleteResult>("value", AutoCompleteResult.class, DataTemplateUtil.getSchema(AutoCompleteResult.class)))));
        responseMetadataMap.put("batchGetTotalEntityCount", new DynamicRecordMetadata("batchGetTotalEntityCount", Collections.singletonList(new FieldDef<LongMap>("value", LongMap.class, DataTemplateUtil.getSchema(LongMap.class)))));
        responseMetadataMap.put("batchIngest", new DynamicRecordMetadata("batchIngest", Collections.<FieldDef<?>>emptyList()));
        responseMetadataMap.put("browse", new DynamicRecordMetadata("browse", Collections.singletonList(new FieldDef<BrowseResult>("value", BrowseResult.class, DataTemplateUtil.getSchema(BrowseResult.class)))));
        responseMetadataMap.put("delete", new DynamicRecordMetadata("delete", Collections.singletonList(new FieldDef<DeleteEntityResponse>("value", DeleteEntityResponse.class, DataTemplateUtil.getSchema(DeleteEntityResponse.class)))));
        responseMetadataMap.put("deleteAll", new DynamicRecordMetadata("deleteAll", Collections.singletonList(new FieldDef<RollbackResponse>("value", RollbackResponse.class, DataTemplateUtil.getSchema(RollbackResponse.class)))));
        responseMetadataMap.put("deleteReferences", new DynamicRecordMetadata("deleteReferences", Collections.singletonList(new FieldDef<DeleteReferencesResponse>("value", DeleteReferencesResponse.class, DataTemplateUtil.getSchema(DeleteReferencesResponse.class)))));
        responseMetadataMap.put("exists", new DynamicRecordMetadata("exists", Collections.singletonList(new FieldDef<Boolean>("value", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)))));
        responseMetadataMap.put("filter", new DynamicRecordMetadata("filter", Collections.singletonList(new FieldDef<SearchResult>("value", SearchResult.class, DataTemplateUtil.getSchema(SearchResult.class)))));
        responseMetadataMap.put("getBrowsePaths", new DynamicRecordMetadata("getBrowsePaths", Collections.singletonList(new FieldDef<StringArray>("value", StringArray.class, DataTemplateUtil.getSchema(StringArray.class)))));
        responseMetadataMap.put("getTotalEntityCount", new DynamicRecordMetadata("getTotalEntityCount", Collections.singletonList(new FieldDef<Long>("value", Long.class, DataTemplateUtil.getSchema(Long.class)))));
        responseMetadataMap.put("ingest", new DynamicRecordMetadata("ingest", Collections.<FieldDef<?>>emptyList()));
        responseMetadataMap.put("list", new DynamicRecordMetadata("list", Collections.singletonList(new FieldDef<ListResult>("value", ListResult.class, DataTemplateUtil.getSchema(ListResult.class)))));
        responseMetadataMap.put("listUrns", new DynamicRecordMetadata("listUrns", Collections.singletonList(new FieldDef<ListUrnsResult>("value", ListUrnsResult.class, DataTemplateUtil.getSchema(ListUrnsResult.class)))));
        responseMetadataMap.put("scrollAcrossEntities", new DynamicRecordMetadata("scrollAcrossEntities", Collections.singletonList(new FieldDef<ScrollResult>("value", ScrollResult.class, DataTemplateUtil.getSchema(ScrollResult.class)))));
        responseMetadataMap.put("scrollAcrossLineage", new DynamicRecordMetadata("scrollAcrossLineage", Collections.singletonList(new FieldDef<LineageScrollResult>("value", LineageScrollResult.class, DataTemplateUtil.getSchema(LineageScrollResult.class)))));
        responseMetadataMap.put("search", new DynamicRecordMetadata("search", Collections.singletonList(new FieldDef<SearchResult>("value", SearchResult.class, DataTemplateUtil.getSchema(SearchResult.class)))));
        responseMetadataMap.put("searchAcrossEntities", new DynamicRecordMetadata("searchAcrossEntities", Collections.singletonList(new FieldDef<SearchResult>("value", SearchResult.class, DataTemplateUtil.getSchema(SearchResult.class)))));
        responseMetadataMap.put("searchAcrossLineage", new DynamicRecordMetadata("searchAcrossLineage", Collections.singletonList(new FieldDef<LineageSearchResult>("value", LineageSearchResult.class, DataTemplateUtil.getSchema(LineageSearchResult.class)))));
        responseMetadataMap.put("setWritable", new DynamicRecordMetadata("setWritable", Collections.<FieldDef<?>>emptyList()));
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET, ResourceMethod.BATCH_GET), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, Entity.class, keyParts);
    }

    public EntitiesRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public EntitiesRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public EntitiesRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public EntitiesRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    /**
     * Retrieves the value for an entity that is made up of latest versions of specified aspects.
     * 
     * @return
     *     builder for the resource method
     */
    public EntitiesGetRequestBuilder get() {
        return new EntitiesGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public EntitiesBatchGetRequestBuilder batchGet() {
        return new EntitiesBatchGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public EntitiesDoApplyRetentionRequestBuilder actionApplyRetention() {
        return new EntitiesDoApplyRetentionRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoAutocompleteRequestBuilder actionAutocomplete() {
        return new EntitiesDoAutocompleteRequestBuilder(getBaseUriTemplate(), AutoCompleteResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoBatchGetTotalEntityCountRequestBuilder actionBatchGetTotalEntityCount() {
        return new EntitiesDoBatchGetTotalEntityCountRequestBuilder(getBaseUriTemplate(), LongMap.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoBatchIngestRequestBuilder actionBatchIngest() {
        return new EntitiesDoBatchIngestRequestBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoBrowseRequestBuilder actionBrowse() {
        return new EntitiesDoBrowseRequestBuilder(getBaseUriTemplate(), BrowseResult.class, _resourceSpec, getRequestOptions());
    }

    /**
     * Deletes all data related to an individual urn(entity).
     * Service Returns: - a DeleteEntityResponse object.
     * 
     * @return
     *     builder for the resource method
     */
    public EntitiesDoDeleteRequestBuilder actionDelete() {
        return new EntitiesDoDeleteRequestBuilder(getBaseUriTemplate(), DeleteEntityResponse.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoDeleteAllRequestBuilder actionDeleteAll() {
        return new EntitiesDoDeleteAllRequestBuilder(getBaseUriTemplate(), RollbackResponse.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoDeleteReferencesRequestBuilder actionDeleteReferences() {
        return new EntitiesDoDeleteReferencesRequestBuilder(getBaseUriTemplate(), DeleteReferencesResponse.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoExistsRequestBuilder actionExists() {
        return new EntitiesDoExistsRequestBuilder(getBaseUriTemplate(), Boolean.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoFilterRequestBuilder actionFilter() {
        return new EntitiesDoFilterRequestBuilder(getBaseUriTemplate(), SearchResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoGetBrowsePathsRequestBuilder actionGetBrowsePaths() {
        return new EntitiesDoGetBrowsePathsRequestBuilder(getBaseUriTemplate(), StringArray.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoGetTotalEntityCountRequestBuilder actionGetTotalEntityCount() {
        return new EntitiesDoGetTotalEntityCountRequestBuilder(getBaseUriTemplate(), Long.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoIngestRequestBuilder actionIngest() {
        return new EntitiesDoIngestRequestBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoListRequestBuilder actionList() {
        return new EntitiesDoListRequestBuilder(getBaseUriTemplate(), ListResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoListUrnsRequestBuilder actionListUrns() {
        return new EntitiesDoListUrnsRequestBuilder(getBaseUriTemplate(), ListUrnsResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder actionScrollAcrossEntities() {
        return new EntitiesDoScrollAcrossEntitiesRequestBuilder(getBaseUriTemplate(), ScrollResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder actionScrollAcrossLineage() {
        return new EntitiesDoScrollAcrossLineageRequestBuilder(getBaseUriTemplate(), LineageScrollResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoSearchRequestBuilder actionSearch() {
        return new EntitiesDoSearchRequestBuilder(getBaseUriTemplate(), SearchResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder actionSearchAcrossEntities() {
        return new EntitiesDoSearchAcrossEntitiesRequestBuilder(getBaseUriTemplate(), SearchResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder actionSearchAcrossLineage() {
        return new EntitiesDoSearchAcrossLineageRequestBuilder(getBaseUriTemplate(), LineageSearchResult.class, _resourceSpec, getRequestOptions());
    }

    public EntitiesDoSetWritableRequestBuilder actionSetWritable() {
        return new EntitiesDoSetWritableRequestBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

}
