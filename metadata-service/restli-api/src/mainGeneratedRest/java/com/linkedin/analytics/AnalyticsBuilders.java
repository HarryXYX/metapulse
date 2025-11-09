
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
import com.linkedin.restli.common.ResourceMethod;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.common.ResourceSpecImpl;
import com.linkedin.restli.internal.common.URIParamUtils;
import com.linkedin.timeseries.AggregationSpecArray;
import com.linkedin.timeseries.GroupingBucketArray;


/**
 * Rest.li entry point: /analytics
 * 
 * generated from: com.linkedin.metadata.resources.analytics.Analytics
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.analytics.AnalyticsRequestBuilders} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.analytics.analytics.restspec.json.")
@Deprecated
public class AnalyticsBuilders {

    private final java.lang.String _baseUriTemplate;
    private RestliRequestOptions _requestOptions;
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

    public AnalyticsBuilders() {
        this(RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AnalyticsBuilders(RestliRequestOptions requestOptions) {
        _baseUriTemplate = ORIGINAL_RESOURCE_PATH;
        _requestOptions = assignRequestOptions(requestOptions);
    }

    public AnalyticsBuilders(java.lang.String primaryResourceName) {
        this(primaryResourceName, RestliRequestOptions.DEFAULT_OPTIONS);
    }

    public AnalyticsBuilders(java.lang.String primaryResourceName, RestliRequestOptions requestOptions) {
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

    public AnalyticsDoGetTimeseriesStatsBuilder actionGetTimeseriesStats() {
        return new AnalyticsDoGetTimeseriesStatsBuilder(getBaseUriTemplate(), GetTimeseriesAggregatedStatsResponse.class, _resourceSpec, getRequestOptions());
    }

}
