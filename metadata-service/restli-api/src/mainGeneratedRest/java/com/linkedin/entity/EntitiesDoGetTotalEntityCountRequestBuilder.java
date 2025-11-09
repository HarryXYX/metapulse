
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoGetTotalEntityCountRequestBuilder
    extends ActionRequestBuilderBase<Void, Long, EntitiesDoGetTotalEntityCountRequestBuilder>
{


    public EntitiesDoGetTotalEntityCountRequestBuilder(java.lang.String baseUriTemplate, Class<Long> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getTotalEntityCount");
    }

    public EntitiesDoGetTotalEntityCountRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTotalEntityCount").getFieldDef("entity"), value);
        return this;
    }

}
