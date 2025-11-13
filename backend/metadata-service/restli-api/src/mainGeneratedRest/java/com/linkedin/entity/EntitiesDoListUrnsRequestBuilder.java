
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.ListUrnsResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoListUrnsRequestBuilder
    extends ActionRequestBuilderBase<Void, ListUrnsResult, EntitiesDoListUrnsRequestBuilder>
{


    public EntitiesDoListUrnsRequestBuilder(java.lang.String baseUriTemplate, Class<ListUrnsResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("listUrns");
    }

    public EntitiesDoListUrnsRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("listUrns").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoListUrnsRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("listUrns").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoListUrnsRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("listUrns").getFieldDef("count"), value);
        return this;
    }

}
