
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.DeleteReferencesResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoDeleteReferencesRequestBuilder
    extends ActionRequestBuilderBase<Void, DeleteReferencesResponse, EntitiesDoDeleteReferencesRequestBuilder>
{


    public EntitiesDoDeleteReferencesRequestBuilder(java.lang.String baseUriTemplate, Class<DeleteReferencesResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("deleteReferences");
    }

    public EntitiesDoDeleteReferencesRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("deleteReferences").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoDeleteReferencesRequestBuilder dryRunParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("deleteReferences").getFieldDef("dryRun"), value);
        return this;
    }

}
