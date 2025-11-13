
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.MetadataChangeProposalArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.AspectsDoIngestProposalBatchRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AspectsDoIngestProposalBatchBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, AspectsDoIngestProposalBatchBuilder>
{


    public AspectsDoIngestProposalBatchBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("ingestProposalBatch");
    }

    public AspectsDoIngestProposalBatchBuilder paramProposals(MetadataChangeProposalArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("ingestProposalBatch").getFieldDef("proposals"), value);
        return this;
    }

    public AspectsDoIngestProposalBatchBuilder paramAsync(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("ingestProposalBatch").getFieldDef("async"), value);
        return this;
    }

}
