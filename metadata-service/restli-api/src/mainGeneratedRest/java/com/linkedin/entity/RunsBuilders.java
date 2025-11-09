
package com.linkedin.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.metadata.aspect.VersionedAspect;
import com.linkedin.metadata.run.AspectRowSummaryArray;
import com.linkedin.metadata.run.IngestionRunSummaryArray;
import com.linkedin.metadata.run.RollbackResponse;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * resource for showing information and rolling back runs
 * 
 * generated from: com.linkedin.metadata.resources.entity.BatchIngestionRunResource
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.RunsRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.runs.restspec.json.")
@Deprecated
public class RunsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "runs";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> describeParams = new ArrayList<FieldDef<?>>();
        describeParams.add(new FieldDef<java.lang.String>("runId", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        describeParams.add(new FieldDef<Integer>("start", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        describeParams.add(new FieldDef<Integer>("count", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        describeParams.add(new FieldDef<Boolean>("includeSoft", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        describeParams.add(new FieldDef<Boolean>("includeAspect", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("describe", new DynamicRecordMetadata("describe", describeParams));
        ArrayList<FieldDef<?>> listParams = new ArrayList<FieldDef<?>>();
        listParams.add(new FieldDef<Integer>("pageOffset", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        listParams.add(new FieldDef<Integer>("pageSize", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        listParams.add(new FieldDef<Boolean>("includeSoft", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("list", new DynamicRecordMetadata("list", listParams));
        ArrayList<FieldDef<?>> rollbackParams = new ArrayList<FieldDef<?>>();
        rollbackParams.add(new FieldDef<java.lang.String>("runId", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        rollbackParams.add(new FieldDef<Boolean>("dryRun", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        rollbackParams.add(new FieldDef<Boolean>("hardDelete", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        rollbackParams.add(new FieldDef<Boolean>("safe", Boolean.class, DataTemplateUtil.getSchema(Boolean.class)));
        requestMetadataMap.put("rollback", new DynamicRecordMetadata("rollback", rollbackParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("describe", new DynamicRecordMetadata("describe", Collections.singletonList(new FieldDef<AspectRowSummaryArray>("value", AspectRowSummaryArray.class, DataTemplateUtil.getSchema(AspectRowSummaryArray.class)))));
        responseMetadataMap.put("list", new DynamicRecordMetadata("list", Collections.singletonList(new FieldDef<IngestionRunSummaryArray>("value", IngestionRunSummaryArray.class, DataTemplateUtil.getSchema(IngestionRunSummaryArray.class)))));
        responseMetadataMap.put("rollback", new DynamicRecordMetadata("rollback", Collections.singletonList(new FieldDef<RollbackResponse>("value", RollbackResponse.class, DataTemplateUtil.getSchema(RollbackResponse.class)))));
        HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo> keyParts = new HashMap<java.lang.String, com.linkedin.restli.common.CompoundKey.TypeInfo>();
        _resourceSpec = new ResourceSpecImpl(EnumSet.noneOf(ResourceMethod.class), requestMetadataMap, responseMetadataMap, java.lang.String.class, null, null, VersionedAspect.class, keyParts);
    }

    public RunsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public RunsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public RunsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public RunsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
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

    public RunsDoDescribeBuilder actionDescribe() {
        return new RunsDoDescribeBuilder(getBaseUriTemplate(), AspectRowSummaryArray.class, _resourceSpec, getRequestOptions());
    }

    /**
     * Retrieves the ingestion run summaries.
     * 
     * @return
     *     builder for the resource method
     */
    public RunsDoListBuilder actionList() {
        return new RunsDoListBuilder(getBaseUriTemplate(), IngestionRunSummaryArray.class, _resourceSpec, getRequestOptions());
    }

    /**
     * Rolls back an ingestion run
     * 
     * @return
     *     builder for the resource method
     */
    public RunsDoRollbackBuilder actionRollback() {
        return new RunsDoRollbackBuilder(getBaseUriTemplate(), RollbackResponse.class, _resourceSpec, getRequestOptions());
    }

}
