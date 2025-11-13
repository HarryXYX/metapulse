
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.AspectRowSummaryArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.RunsDoDescribeRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class RunsDoDescribeBuilder
    extends ActionRequestBuilderBase<Void, AspectRowSummaryArray, RunsDoDescribeBuilder>
{


    public RunsDoDescribeBuilder(java.lang.String baseUriTemplate, Class<AspectRowSummaryArray> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("describe");
    }

    public RunsDoDescribeBuilder paramRunId(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("runId"), value);
        return this;
    }

    public RunsDoDescribeBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("start"), value);
        return this;
    }

    public RunsDoDescribeBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("count"), value);
        return this;
    }

    public RunsDoDescribeBuilder paramIncludeSoft(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("includeSoft"), value);
        return this;
    }

    public RunsDoDescribeBuilder paramIncludeAspect(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("includeAspect"), value);
        return this;
    }

}
