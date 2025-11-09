
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.common.WindowDuration;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.usage.UsageStatsDoQueryRangeRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class UsageStatsDoQueryRangeBuilder
    extends ActionRequestBuilderBase<Void, UsageQueryResult, UsageStatsDoQueryRangeBuilder>
{


    public UsageStatsDoQueryRangeBuilder(java.lang.String baseUriTemplate, Class<UsageQueryResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("queryRange");
    }

    public UsageStatsDoQueryRangeBuilder paramResource(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("resource"), value);
        return this;
    }

    public UsageStatsDoQueryRangeBuilder paramDuration(WindowDuration value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("duration"), value);
        return this;
    }

    public UsageStatsDoQueryRangeBuilder paramRangeFromEnd(UsageTimeRange value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("rangeFromEnd"), value);
        return this;
    }

    public UsageStatsDoQueryRangeBuilder paramStartTime(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("startTime"), value);
        return this;
    }

    public UsageStatsDoQueryRangeBuilder paramTimeZone(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("queryRange").getFieldDef("timeZone"), value);
        return this;
    }

}
