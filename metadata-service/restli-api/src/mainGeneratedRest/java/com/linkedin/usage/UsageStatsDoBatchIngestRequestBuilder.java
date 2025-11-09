
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class UsageStatsDoBatchIngestRequestBuilder
    extends ActionRequestBuilderBase<Void, Void, UsageStatsDoBatchIngestRequestBuilder>
{


    public UsageStatsDoBatchIngestRequestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("batchIngest");
    }

    public UsageStatsDoBatchIngestRequestBuilder bucketsParam(UsageAggregationArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("batchIngest").getFieldDef("buckets"), value);
        return this;
    }

}
