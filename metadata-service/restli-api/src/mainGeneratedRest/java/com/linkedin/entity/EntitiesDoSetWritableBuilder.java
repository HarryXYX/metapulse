
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoSetWritableRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoSetWritableBuilder
    extends ActionRequestBuilderBase<Void, Void, EntitiesDoSetWritableBuilder>
{


    public EntitiesDoSetWritableBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("setWritable");
    }

    public EntitiesDoSetWritableBuilder paramValue(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("setWritable").getFieldDef("value"), value);
        return this;
    }

}
