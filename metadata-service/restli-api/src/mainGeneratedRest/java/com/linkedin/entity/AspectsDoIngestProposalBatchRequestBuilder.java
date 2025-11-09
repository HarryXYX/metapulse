
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.MetadataChangeProposalArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AspectsDoIngestProposalBatchRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, AspectsDoIngestProposalBatchRequestBuilder>
{


    public AspectsDoIngestProposalBatchRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("ingestProposalBatch");
    }

    public AspectsDoIngestProposalBatchRequestBuilder proposalsParam(MetadataChangeProposalArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("ingestProposalBatch").getFieldDef("proposals"), value);
        return this;
    }

    public AspectsDoIngestProposalBatchRequestBuilder asyncParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("ingestProposalBatch").getFieldDef("async"), value);
        return this;
    }

}
