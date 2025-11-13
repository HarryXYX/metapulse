
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.usage.UsageStatsDoBatchIngestRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class UsageStatsDoBatchIngestBuilder
    extends ActionRequestBuilderBase<Void, Void, UsageStatsDoBatchIngestBuilder>
{


    public UsageStatsDoBatchIngestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("batchIngest");
    }

    public UsageStatsDoBatchIngestBuilder paramBuckets(UsageAggregationArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("batchIngest").getFieldDef("buckets"), value);
        return this;
    }

}
