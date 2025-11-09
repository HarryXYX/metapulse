
package com.linkedin.analytics;

import javax.annotation.Generated;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.timeseries.AggregationSpecArray;
import com.linkedin.timeseries.GroupingBucketArray;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.analytics.AnalyticsDoGetTimeseriesStatsRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AnalyticsDoGetTimeseriesStatsBuilder
    extends ActionRequestBuilderBase<Void, GetTimeseriesAggregatedStatsResponse, AnalyticsDoGetTimeseriesStatsBuilder>
{


    public AnalyticsDoGetTimeseriesStatsBuilder(java.lang.String baseUriTemplate, Class<GetTimeseriesAggregatedStatsResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getTimeseriesStats");
    }

    public AnalyticsDoGetTimeseriesStatsBuilder paramEntityName(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("entityName"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsBuilder paramAspectName(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("aspectName"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsBuilder paramMetrics(AggregationSpecArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("metrics"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("filter"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsBuilder paramBuckets(GroupingBucketArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("buckets"), value);
        return this;
    }

}
