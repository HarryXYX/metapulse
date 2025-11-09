
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
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;


/**
 * Rest.li entry point: /usageStats
 * 
 * generated from: com.linkedin.metadata.resources.usage.UsageStats
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.usage.UsageStatsRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.usage.usageStats.restspec.json.")
@Deprecated
public class UsageStatsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
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

    public UsageStatsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public UsageStatsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public UsageStatsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public UsageStatsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
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

    @Deprecated
    public UsageStatsDoBatchIngestBuilder actionBatchIngest() {
        return new UsageStatsDoBatchIngestBuilder(getBaseUriTemplate(), Void.class, _resourceSpec, getRequestOptions());
    }

    public UsageStatsDoQueryBuilder actionQuery() {
        return new UsageStatsDoQueryBuilder(getBaseUriTemplate(), UsageQueryResult.class, _resourceSpec, getRequestOptions());
    }

    public UsageStatsDoQueryRangeBuilder actionQueryRange() {
        return new UsageStatsDoQueryRangeBuilder(getBaseUriTemplate(), UsageQueryResult.class, _resourceSpec, getRequestOptions());
    }

}
