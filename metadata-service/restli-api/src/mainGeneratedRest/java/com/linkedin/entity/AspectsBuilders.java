
package com.linkedin.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.aspect.GetTimeseriesAspectValuesResponse;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.metadata.aspect.VersionedAspect;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.mxe.MetadataChangeProposal;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * Single unified resource for fetching, updating, searching, & browsing DataHub entities
 * 
 * generated from: com.linkedin.metadata.resources.entity.AspectResource
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.AspectsRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.aspects.restspec.json.")
@Deprecated
public class AspectsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "aspects";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> getCountParams = new ArrayList<FieldDef<?>>();
        getCountParams.add(new FieldDef<java.lang.String>("aspect", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getCountParams.add(new FieldDef<java.lang.String>("urnLike", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("getCount", new DynamicRecordMetadata("getCount", getCountParams));
        ArrayList<FieldDef<?>> getTimeseriesAspectValuesParams = new ArrayList<FieldDef<?>>();
        getTimeseriesAspectValuesParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<java.lang.String>("entity", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<java.lang.String>("aspect", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<Long>("startTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<Long>("endTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<Integer>("limit", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<Boolean>("latestValue", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        getTimeseriesAspectValuesParams.add(new FieldDef<SortCriterion>("sort", SortCriterion.class, DataTemplateUtil.getSchema(SortCriterion.class)));
        requestMetadataMap.put("getTimeseriesAspectValues", new DynamicRecordMetadata("getTimeseriesAspectValues", getTimeseriesAspectValuesParams));
        ArrayList<FieldDef<?>> ingestProposalParams = new ArrayList<FieldDef<?>>();
        ingestProposalParams.add(new FieldDef<MetadataChangeProposal>("proposal", MetadataChangeProposal.class, DataTemplateUtil.getSchema(MetadataChangeProposal.class)));
        ingestProposalParams.add(new FieldDef<java.lang.String>("async", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("ingestProposal", new DynamicRecordMetadata("ingestProposal", ingestProposalParams));
        ArrayList<FieldDef<?>> ingestProposalBatchParams = new ArrayList<FieldDef<?>>();
        ingestProposalBatchParams.add(new FieldDef<com.linkedin.mxe.MetadataChangeProposalArray>("proposals", com.linkedin.mxe.MetadataChangeProposalArray.class, DataTemplateUtil.getSchema(com.linkedin.mxe.MetadataChangeProposalArray.class)));
        ingestProposalBatchParams.add(new FieldDef<java.lang.String>("async", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("ingestProposalBatch", new DynamicRecordMetadata("ingestProposalBatch", ingestProposalBatchParams));
        ArrayList<FieldDef<?>> restoreIndicesParams = new ArrayList<FieldDef<?>>();
        restoreIndicesParams.add(new FieldDef<java.lang.String>("aspect", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        restoreIndicesParams.add(new FieldDef<java.lang.String>("urn", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        restoreIndicesParams.add(new FieldDef<java.lang.String>("urnLike", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        restoreIndicesParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        restoreIndicesParams.add(new FieldDef<Integer>("batchSize", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        restoreIndicesParams.add(new FieldDef<Integer>("limit", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        restoreIndicesParams.add(new FieldDef<Long>("gePitEpochMs", Long.class, DataTemplateUtil.getSchema(Long.class)));
        restoreIndicesParams.add(new FieldDef<Long>("lePitEpochMs", Long.class, DataTemplateUtil.getSchema(Long.class)));
        restoreIndicesParams.add(new FieldDef<Boolean>("createDefaultAspects", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("restoreIndices", new DynamicRecordMetadata("restoreIndices", restoreIndicesParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("getCount", new DynamicRecordMetadata("getCount", Collections.singletonList(new FieldDef<Integer>("value", Integer.class, DataTemplateUtil.getSchema(Integer.class)))));
        responseMetadataMap.put("getTimeseriesAspectValues", new DynamicRecordMetadata("getTimeseriesAspectValues", Collections.singletonList(new FieldDef<GetTimeseriesAspectValuesResponse>("value", GetTimeseriesAspectValuesResponse.class, DataTemplateUtil.getSchema(GetTimeseriesAspectValuesResponse.class)))));
        responseMetadataMap.put("ingestProposal", new DynamicRecordMetadata("ingestProposal", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        responseMetadataMap.put("ingestProposalBatch", new DynamicRecordMetadata("ingestProposalBatch", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        responseMetadataMap.put("restoreIndices", new DynamicRecordMetadata("restoreIndices", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.of(ResourceMethod.GET), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, VersionedAspect.class, keyParts);
    }

    public AspectsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AspectsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public AspectsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AspectsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        _baseUriTemplate = primaryResourceName;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    private java.lang.String getBaseUriTemplate() {
        return _baseUriTemplate;
    }

    public RestliRequestOptions getRequestOptions() {
        return _requestOptions;
    }

    public java.lang.String[] getPathComponents() {
        return URIParamUtils.extractPathComponentsFromUriTemplate(_baseUriTemplate);
    }

    private static RestliRequestOptions assignRequestOptions(RestliRequestOptions requestOptions) {
        if (requestOptions == null) {
            return RestliRequestOptions.DEFAULT_OPTIONS;
        } else {
            return requestOptions;
        }
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    /**
     * Retrieves the value for an entity that is made up of latest versions of specified aspects.
     *  TODO: Get rid of this and migrate to getAspect.
     * 
     * @return
     *     builder for the resource method
     */
    public AspectsGetBuilder get() {
        return new AspectsGetBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AspectsDoGetCountBuilder actionGetCount() {
        return new AspectsDoGetCountBuilder(getBaseUriTemplate(), Integer.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder actionGetTimeseriesAspectValues() {
        return new AspectsDoGetTimeseriesAspectValuesBuilder(getBaseUriTemplate(), GetTimeseriesAspectValuesResponse.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoIngestProposalBuilder actionIngestProposal() {
        return new AspectsDoIngestProposalBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoIngestProposalBatchBuilder actionIngestProposalBatch() {
        return new AspectsDoIngestProposalBatchBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoRestoreIndicesBuilder actionRestoreIndices() {
        return new AspectsDoRestoreIndicesBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

}
