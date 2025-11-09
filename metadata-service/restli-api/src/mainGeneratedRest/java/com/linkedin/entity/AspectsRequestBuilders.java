
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
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * Single unified resource for fetching, updating, searching, & browsing DataHub entities
 * 
 * generated from: com.linkedin.metadata.resources.entity.AspectResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.aspects.restspec.json.")
public class AspectsRequestBuilders
    extends BuilderBase
{

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

    public AspectsRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AspectsRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public AspectsRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AspectsRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
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
     *  TODO: Get rid of this and migrate to getAspect.
     * 
     * @return
     *     builder for the resource method
     */
    public AspectsGetRequestBuilder get() {
        return new AspectsGetRequestBuilder(getBaseUriTemplate(), _resourceSpec, getRequestOptions());
    }

    public AspectsDoGetCountRequestBuilder actionGetCount() {
        return new AspectsDoGetCountRequestBuilder(getBaseUriTemplate(), Integer.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder actionGetTimeseriesAspectValues() {
        return new AspectsDoGetTimeseriesAspectValuesRequestBuilder(getBaseUriTemplate(), GetTimeseriesAspectValuesResponse.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoIngestProposalRequestBuilder actionIngestProposal() {
        return new AspectsDoIngestProposalRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoIngestProposalBatchRequestBuilder actionIngestProposalBatch() {
        return new AspectsDoIngestProposalBatchRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public AspectsDoRestoreIndicesRequestBuilder actionRestoreIndices() {
        return new AspectsDoRestoreIndicesRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

}
