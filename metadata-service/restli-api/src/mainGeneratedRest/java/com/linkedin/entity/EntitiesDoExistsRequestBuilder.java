
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoExistsRequestBuilder
    extends ActionRequestBuilderBase<Void, Boolean, EntitiesDoExistsRequestBuilder>
{


    public EntitiesDoExistsRequestBuilder(java.lang.String baseUriTemplate, Class<Boolean> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("exists");
    }

    public EntitiesDoExistsRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("exists").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoExistsRequestBuilder includeSoftDeleteParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("exists").getFieldDef("includeSoftDelete"), value);
        return this;
    }

}
