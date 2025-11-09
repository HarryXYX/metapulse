
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
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * resource for showing information and rolling back runs
 * 
 * generated from: com.linkedin.metadata.resources.entity.BatchIngestionRunResource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.runs.restspec.json.")
public class RunsRequestBuilders
    extends BuilderBase
{

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

    public RunsRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public RunsRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public RunsRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public RunsRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public RunsDoDescribeRequestBuilder actionDescribe() {
        return new RunsDoDescribeRequestBuilder(getBaseUriTemplate(), AspectRowSummaryArray.class, _resourceSpec, getRequestOptions());
    }

    /**
     * Retrieves the ingestion run summaries.
     * 
     * @return
     *     builder for the resource method
     */
    public RunsDoListRequestBuilder actionList() {
        return new RunsDoListRequestBuilder(getBaseUriTemplate(), IngestionRunSummaryArray.class, _resourceSpec, getRequestOptions());
    }

    /**
     * Rolls back an ingestion run
     * 
     * @return
     *     builder for the resource method
     */
    public RunsDoRollbackRequestBuilder actionRollback() {
        return new RunsDoRollbackRequestBuilder(getBaseUriTemplate(), RollbackResponse.class, _resourceSpec, getRequestOptions());
    }

}
