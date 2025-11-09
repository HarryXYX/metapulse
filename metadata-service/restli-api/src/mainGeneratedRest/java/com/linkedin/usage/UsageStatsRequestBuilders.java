
package com.linkedin.usage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.common.WindowDuration;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;


/**
 * Rest.li entry point: /usageStats
 * 
 * generated from: com.linkedin.metadata.resources.usage.UsageStats
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.usage.usageStats.restspec.json.")
@Deprecated
public class UsageStatsRequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "usageStats";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> batchIngestParams = new ArrayList<FieldDef<?>>();
        batchIngestParams.add(new FieldDef<UsageAggregationArray>("buckets", UsageAggregationArray.class, DataTemplateUtil.getSchema(UsageAggregationArray.class)));
        requestMetadataMap.put("batchIngest", new DynamicRecordMetadata("batchIngest", batchIngestParams));
        ArrayList<FieldDef<?>> queryParams = new ArrayList<FieldDef<?>>();
        queryParams.add(new FieldDef<java.lang.String>("resource", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        queryParams.add(new FieldDef<WindowDuration>("duration", WindowDuration.class, DataTemplateUtil.getSchema(WindowDuration.class)));
        queryParams.add(new FieldDef<Long>("startTime", Long.class, DataTemplateUtil.getSchema(Long.class)));
        queryParams.add(new FieldDef<Long>("endTime", Long.class, DataTemplateUtil.getSchema(Long.class)));
        queryParams.add(new FieldDef<Integer>("maxBuckets", Integer.class, DataTemplateUtil.getSchema(Integer.class)));
        queryParams.add(new FieldDef<java.lang.String>("timeZone", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("query", new DynamicRecordMetadata("query", queryParams));
        ArrayList<FieldDef<?>> queryRangeParams = new ArrayList<FieldDef<?>>();
        queryRangeParams.add(new FieldDef<java.lang.String>("resource", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        queryRangeParams.add(new FieldDef<WindowDuration>("duration", WindowDuration.class, DataTemplateUtil.getSchema(WindowDuration.class)));
        queryRangeParams.add(new FieldDef<UsageTimeRange>("rangeFromEnd", UsageTimeRange.class, DataTemplateUtil.getSchema(UsageTimeRange.class)));
        queryRangeParams.add(new FieldDef<Long>("startTime", Long.class, DataTemplateUtil.getSchema(Long.class)));
        queryRangeParams.add(new FieldDef<java.lang.String>("timeZone", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        requestMetadataMap.put("queryRange", new DynamicRecordMetadata("queryRange", queryRangeParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("batchIngest", new DynamicRecordMetadata("batchIngest", Collections.<FieldDef<?>>emptyList()));
        responseMetadataMap.put("query", new DynamicRecordMetadata("query", Collections.singletonList(new FieldDef<UsageQueryResult>("value", UsageQueryResult.class, DataTemplateUtil.getSchema(UsageQueryResult.class)))));
        responseMetadataMap.put("queryRange", new DynamicRecordMetadata("queryRange", Collections.singletonList(new FieldDef<UsageQueryResult>("value", UsageQueryResult.class, DataTemplateUtil.getSchema(UsageQueryResult.class)))));
        _resourceSpec = new ResourceSpecImpl(EnumSet.noneOf(ResourceMethod.class), requestMetadataMap, responseMetadataMap, UsageAggregation.class);
    }

    public UsageStatsRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public UsageStatsRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public UsageStatsRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public UsageStatsRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    @Deprecated
    public UsageStatsDoBatchIngestRequestBuilder actionBatchIngest() {
        return new UsageStatsDoBatchIngestRequestBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

    public UsageStatsDoQueryRequestBuilder actionQuery() {
        return new UsageStatsDoQueryRequestBuilder(getBaseUriTemplate(), UsageQueryResult.class, _resourceSpec, getRequestOptions());
    }

    public UsageStatsDoQueryRangeRequestBuilder actionQueryRange() {
        return new UsageStatsDoQueryRangeRequestBuilder(getBaseUriTemplate(), UsageQueryResult.class, _resourceSpec, getRequestOptions());
    }

}
