
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoGetTotalEntityCountRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoGetTotalEntityCountBuilder
    extends ActionRequestBuilderBase<Void, Long, EntitiesDoGetTotalEntityCountBuilder>
{


    public EntitiesDoGetTotalEntityCountBuilder(java.lang.String baseUriTemplate, Class<Long> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getTotalEntityCount");
    }

    public EntitiesDoGetTotalEntityCountBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTotalEntityCount").getFieldDef("entity"), value);
        return this;
    }

}
