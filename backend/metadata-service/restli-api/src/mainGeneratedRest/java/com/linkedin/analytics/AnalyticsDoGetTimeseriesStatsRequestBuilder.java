
package com.linkedin.analytics;

import javax.annotation.Generated;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.timeseries.AggregationSpecArray;
import com.linkedin.timeseries.GroupingBucketArray;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AnalyticsDoGetTimeseriesStatsRequestBuilder
    extends ActionRequestBuilderBase<Void, GetTimeseriesAggregatedStatsResponse, AnalyticsDoGetTimeseriesStatsRequestBuilder>
{


    public AnalyticsDoGetTimeseriesStatsRequestBuilder(java.lang.String baseUriTemplate, Class<GetTimeseriesAggregatedStatsResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getTimeseriesStats");
    }

    public AnalyticsDoGetTimeseriesStatsRequestBuilder entityNameParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("entityName"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsRequestBuilder aspectNameParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("aspectName"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsRequestBuilder metricsParam(AggregationSpecArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("metrics"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("filter"), value);
        return this;
    }

    public AnalyticsDoGetTimeseriesStatsRequestBuilder bucketsParam(GroupingBucketArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesStats").getFieldDef("buckets"), value);
        return this;
    }

}
