
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.MetadataChangeProposal;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AspectsDoIngestProposalRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, AspectsDoIngestProposalRequestBuilder>
{


    public AspectsDoIngestProposalRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("ingestProposal");
    }

    public AspectsDoIngestProposalRequestBuilder proposalParam(MetadataChangeProposal value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("ingestProposal").getFieldDef("proposal"), value);
        return this;
    }

    public AspectsDoIngestProposalRequestBuilder asyncParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("ingestProposal").getFieldDef("async"), value);
        return this;
    }

}
