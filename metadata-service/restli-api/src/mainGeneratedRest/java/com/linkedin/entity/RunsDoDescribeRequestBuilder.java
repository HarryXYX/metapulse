
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.AspectRowSummaryArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class RunsDoDescribeRequestBuilder
    extends ActionRequestBuilderBase<Void, AspectRowSummaryArray, RunsDoDescribeRequestBuilder>
{


    public RunsDoDescribeRequestBuilder(java.lang.String baseUriTemplate, Class<AspectRowSummaryArray> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("describe");
    }

    public RunsDoDescribeRequestBuilder runIdParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("runId"), value);
        return this;
    }

    public RunsDoDescribeRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("start"), value);
        return this;
    }

    public RunsDoDescribeRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("count"), value);
        return this;
    }

    public RunsDoDescribeRequestBuilder includeSoftParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("includeSoft"), value);
        return this;
    }

    public RunsDoDescribeRequestBuilder includeAspectParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("describe").getFieldDef("includeAspect"), value);
        return this;
    }

}
