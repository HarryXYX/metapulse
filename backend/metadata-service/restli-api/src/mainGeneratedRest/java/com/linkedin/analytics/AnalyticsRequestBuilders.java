
package com.linkedin.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import javax.annotation.Generated;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.FieldDef;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.OptionsRequestBuilder;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BuilderBase;
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.timeseries.AggregationSpecArray;
import com.linkedin.timeseries.GroupingBucketArray;


/**
 * Rest.li entry point: /analytics
 * 
 * generated from: com.linkedin.metadata.resources.analytics.Analytics
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.analytics.analytics.restspec.json.")
public class AnalyticsRequestBuilders
    extends BuilderBase
{

    private final static java.lang.String ORIGINAL_RESOURCE_PATH = "analytics";
    private final static ResourceSpec _resourceSpec;

    static {
        HashMap<java.lang.String, DynamicRecordMetadata> requestMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        ArrayList<FieldDef<?>> getTimeseriesStatsParams = new ArrayList<FieldDef<?>>();
        getTimeseriesStatsParams.add(new FieldDef<java.lang.String>("entityName", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getTimeseriesStatsParams.add(new FieldDef<java.lang.String>("aspectName", java.lang.String.class, DataTemplateUtil.getSchema(java.lang.String.class)));
        getTimeseriesStatsParams.add(new FieldDef<AggregationSpecArray>("metrics", AggregationSpecArray.class, DataTemplateUtil.getSchema(AggregationSpecArray.class)));
        getTimeseriesStatsParams.add(new FieldDef<Filter>("filter", Filter.class, DataTemplateUtil.getSchema(Filter.class)));
        getTimeseriesStatsParams.add(new FieldDef<GroupingBucketArray>("buckets", GroupingBucketArray.class, DataTemplateUtil.getSchema(GroupingBucketArray.class)));
        requestMetadataMap.put("getTimeseriesStats", new DynamicRecordMetadata("getTimeseriesStats", getTimeseriesStatsParams));
        HashMap<java.lang.String, DynamicRecordMetadata> responseMetadataMap = new HashMap<java.lang.String, DynamicRecordMetadata>();
        responseMetadataMap.put("getTimeseriesStats", new DynamicRecordMetadata("getTimeseriesStats", Collections.singletonList(new FieldDef<GetTimeseriesAggregatedStatsResponse>("value", GetTimeseriesAggregatedStatsResponse.class, DataTemplateUtil.getSchema(GetTimeseriesAggregatedStatsResponse.class)))));
        _resourceSpec = new ResourceSpecImpl(EnumSet.noneOf(ResourceMethod.class), requestMetadataMap, responseMetadataMap, GetTimeseriesAggregatedStatsResponse.class);
    }

    public AnalyticsRequestBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AnalyticsRequestBuilders(RestliRequestOptions requestOptions) {
        super(ORIGINAL_RESOURCE_PATH, requestOptions);
    }

    public AnalyticsRequestBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AnalyticsRequestBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
        super(primaryResourceName, requestOptions);
    }

    public static java.lang.String getPrimaryResource() {
        return ORIGINAL_RESOURCE_PATH;
    }

    public OptionsRequestBuilder options() {
        return new OptionsRequestBuilder(getBaseUriTemplate(), getRequestOptions());
    }

    public AnalyticsDoGetTimeseriesStatsRequestBuilder actionGetTimeseriesStats() {
        return new AnalyticsDoGetTimeseriesStatsRequestBuilder(getBaseUriTemplate(), GetTimeseriesAggregatedStatsResponse.class, _resourceSpec, getRequestOptions());
    }

}
