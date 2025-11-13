
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
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;
import com.linkedin.timeseries.TimeseriesIndicesSizesResult;


/**
 * Endpoints for performing maintenance operations
 * 
 * generated from: com.linkedin.metadata.resources.operations.OperationsResource
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.operations.OperationsRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.operations.operations.restspec.json.")
@Deprecated
public class OperationsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
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

    public OperationsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public OperationsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public OperationsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public OperationsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
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

    public OperationsDoGetEsTaskStatusBuilder actionGetEsTaskStatus() {
        return new OperationsDoGetEsTaskStatusBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public OperationsDoGetIndexSizesBuilder actionGetIndexSizes() {
        return new OperationsDoGetIndexSizesBuilder(getBaseUriTemplate(), TimeseriesIndicesSizesResult.class, _resourceSpec, getRequestOptions());
    }

    public OperationsDoRestoreIndicesBuilder actionRestoreIndices() {
        return new OperationsDoRestoreIndicesBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

    public OperationsDoTruncateTimeseriesAspectBuilder actionTruncateTimeseriesAspect() {
        return new OperationsDoTruncateTimeseriesAspectBuilder(getBaseUriTemplate(), java.lang.String.class, _resourceSpec, getRequestOptions());
    }

}
