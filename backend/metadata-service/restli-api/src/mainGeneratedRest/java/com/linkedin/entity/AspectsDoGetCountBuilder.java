
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.AspectsDoGetCountRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AspectsDoGetCountBuilder
    extends ActionRequestBuilderBase<Void, Integer, AspectsDoGetCountBuilder>
{


    public AspectsDoGetCountBuilder(java.lang.String baseUriTemplate, Class<Integer> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getCount");
    }

    public AspectsDoGetCountBuilder paramAspect(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getCount").getFieldDef("aspect"), value);
        return this;
    }

    public AspectsDoGetCountBuilder paramUrnLike(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("getCount").getFieldDef("urnLike"), value);
        return this;
    }

}
