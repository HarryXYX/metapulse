
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.common.WindowDuration;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class UsageStatsDoQueryRangeRequestBuilder
    extends ActionRequestBuilderBase<Void, UsageQueryResult, UsageStatsDoQueryRangeRequestBuilder>
{


    public UsageStatsDoQueryRangeRequestBuilder(java.lang.String baseUriTemplate, Class<UsageQueryResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("queryRange");
    }

    public UsageStatsDoQueryRangeRequestBuilder resourceParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("resource"), value);
        return this;
    }

    public UsageStatsDoQueryRangeRequestBuilder durationParam(WindowDuration value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("duration"), value);
        return this;
    }

    public UsageStatsDoQueryRangeRequestBuilder rangeFromEndParam(UsageTimeRange value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("rangeFromEnd"), value);
        return this;
    }

    public UsageStatsDoQueryRangeRequestBuilder startTimeParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("startTime"), value);
        return this;
    }

    public UsageStatsDoQueryRangeRequestBuilder timeZoneParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("timeZone"), value);
        return this;
    }

}
