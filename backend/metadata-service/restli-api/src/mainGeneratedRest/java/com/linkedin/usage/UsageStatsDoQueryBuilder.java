
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.common.WindowDuration;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.usage.UsageStatsDoQueryRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class UsageStatsDoQueryBuilder
    extends ActionRequestBuilderBase<Void, UsageQueryResult, UsageStatsDoQueryBuilder>
{


    public UsageStatsDoQueryBuilder(java.lang.String baseUriTemplate, Class<UsageQueryResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("query");
    }

    public UsageStatsDoQueryBuilder paramResource(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("query").getFieldDef("resource"), value);
        return this;
    }

    public UsageStatsDoQueryBuilder paramDuration(WindowDuration value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("query").getFieldDef("duration"), value);
        return this;
    }

    public UsageStatsDoQueryBuilder paramStartTime(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("startTime"), value);
        return this;
    }

    public UsageStatsDoQueryBuilder paramEndTime(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("endTime"), value);
        return this;
    }

    public UsageStatsDoQueryBuilder paramMaxBuckets(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("maxBuckets"), value);
        return this;
    }

    public UsageStatsDoQueryBuilder paramTimeZone(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("query").getFieldDef("timeZone"), value);
        return this;
    }

}
