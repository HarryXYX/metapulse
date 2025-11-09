
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.common.WindowDuration;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class UsageStatsDoQueryRequestBuilder
    extends ActionRequestBuilderBase<Void, UsageQueryResult, UsageStatsDoQueryRequestBuilder>
{


    public UsageStatsDoQueryRequestBuilder(java.lang.String baseUriTemplate, Class<UsageQueryResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("query");
    }

    public UsageStatsDoQueryRequestBuilder resourceParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("query").getFieldDef("resource"), value);
        return this;
    }

    public UsageStatsDoQueryRequestBuilder durationParam(WindowDuration value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("query").getFieldDef("duration"), value);
        return this;
    }

    public UsageStatsDoQueryRequestBuilder startTimeParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("startTime"), value);
        return this;
    }

    public UsageStatsDoQueryRequestBuilder endTimeParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("endTime"), value);
        return this;
    }

    public UsageStatsDoQueryRequestBuilder maxBucketsParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("maxBuckets"), value);
        return this;
    }

    public UsageStatsDoQueryRequestBuilder timeZoneParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("timeZone"), value);
        return this;
    }

}
