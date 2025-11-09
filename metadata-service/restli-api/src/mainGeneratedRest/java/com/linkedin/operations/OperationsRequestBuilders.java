
package com.linkedin.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.metadata.aspect.VersionedAspect;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.timeseries.TimeseriesIndicesSizesResult;


/**
 * Endpoints for performing maintenance operations
 * 
 * generated from: com.linkedin.metadata.resources.operations.OperationsResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.operations.operations.restspec.json.")
public class OperationsRequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "operations";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> getEsTaskStatusParams = new ArrayList<FieldDef<?>>();
        getEsTaskStatusParams.add(new FieldDef<java.lang.String>("nodeId", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getEsTaskStatusParams.add(new FieldDef<Long>("taskId", Long.class, DataTemplateUtil.getSchema(Long.class)));
        getEsTaskStatusParams.add(new FieldDef<java.lang.String>("task", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("getEsTaskStatus", new DynamicRecordMetadata("getEsTaskStatus", getEsTaskStatusParams));
        ArrayList<FieldDef<?>> getIndexSizesParams = new ArrayList<FieldDef<?>>();
        requestMetadataMap.put("getIndexSizes", new DynamicRecordMetadata("getIndexSizes", getIndexSizesParams));
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
        ArrayList<FieldDef<?>> truncateTimeseriesAspectParams = new ArrayList<FieldDef<?>>();
        truncateTimeseriesAspectParams.add(new FieldDef<java.lang.String>("entityType", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<java.lang.String>("aspect", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<Long>("endTimeMillis", Long.class, DataTemplateUtil.getSchema(Long.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<Boolean>("dryRun", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<Integer>("batchSize", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<Long>("timeoutSeconds", Long.class, DataTemplateUtil.getSchema(Long.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<Boolean>("forceDeleteByQuery", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        truncateTimeseriesAspectParams.add(new FieldDef<Boolean>("forceReindex", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("truncateTimeseriesAspect", new DynamicRecordMetadata("truncateTimeseriesAspect", truncateTimeseriesAspectParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("getEsTaskStatus", new DynamicRecordMetadata("getEsTaskStatus", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        responseMetadataMap.put("getIndexSizes", new DynamicRecordMetadata("getIndexSizes", Collections.singletonList(new FieldDef<TimeseriesIndicesSizesResult>("value", TimeseriesIndicesSizesResult.class, DataTemplateUtil.getSchema(TimeseriesIndicesSizesResult.class)))));
        responseMetadataMap.put("restoreIndices", new DynamicRecordMetadata("restoreIndices", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        responseMetadataMap.put("truncateTimeseriesAspect", new DynamicRecordMetadata("truncateTimeseriesAspect", Collections.singletonList(new FieldDef<java.lang.String>("value", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)))));
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.noneOf(ResourceMethod.class), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, VersionedAspect.class, keyParts);
    }

    public OperationsRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public OperationsRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public OperationsRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public OperationsRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public OperationsDoGetEsTaskStatusRequestBuilder actionGetEsTaskStatus() {
        return new OperationsDoGetEsTaskStatusRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public OperationsDoGetIndexSizesRequestBuilder actionGetIndexSizes() {
        return new OperationsDoGetIndexSizesRequestBuilder(getBaseUriTemplate(), TimeseriesIndicesSizesResult.class, _resourceSpec, getRequestOptions());
    }

    public OperationsDoRestoreIndicesRequestBuilder actionRestoreIndices() {
        return new OperationsDoRestoreIndicesRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder actionTruncateTimeseriesAspect() {
        return new OperationsDoTruncateTimeseriesAspectRequestBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

}
