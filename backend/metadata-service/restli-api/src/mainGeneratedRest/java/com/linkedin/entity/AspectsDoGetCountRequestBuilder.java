
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AspectsDoGetCountRequestBuilder
    extends ActionRequestBuilderBase<Void, Integer, AspectsDoGetCountRequestBuilder>
{


    public AspectsDoGetCountRequestBuilder(java.lang.String baseUriTemplate, Class<Integer> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getCount");
    }

    public AspectsDoGetCountRequestBuilder aspectParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getCount").getFieldDef("aspect"), value);
        return this;
    }

    public AspectsDoGetCountRequestBuilder urnLikeParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("getCount").getFieldDef("urnLike"), value);
        return this;
    }

}
