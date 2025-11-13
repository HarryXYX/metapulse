
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.MetadataChangeProposal;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.AspectsDoIngestProposalRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AspectsDoIngestProposalBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, AspectsDoIngestProposalBuilder>
{


    public AspectsDoIngestProposalBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("ingestProposal");
    }

    public AspectsDoIngestProposalBuilder paramProposal(MetadataChangeProposal value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("ingestProposal").getFieldDef("proposal"), value);
        return this;
    }

    public AspectsDoIngestProposalBuilder paramAsync(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("ingestProposal").getFieldDef("async"), value);
        return this;
    }

}
