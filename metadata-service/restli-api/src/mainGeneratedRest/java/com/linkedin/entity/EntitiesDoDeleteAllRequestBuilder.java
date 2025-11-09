
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.RollbackResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoDeleteAllRequestBuilder
    extends ActionRequestBuilderBase<Void, RollbackResponse, EntitiesDoDeleteAllRequestBuilder>
{


    public EntitiesDoDeleteAllRequestBuilder(java.lang.String baseUriTemplate, Class<RollbackResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("deleteAll");
    }

    public EntitiesDoDeleteAllRequestBuilder registryIdParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("deleteAll").getFieldDef("registryId"), value);
        return this;
    }

    public EntitiesDoDeleteAllRequestBuilder dryRunParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("deleteAll").getFieldDef("dryRun"), value);
        return this;
    }

}
