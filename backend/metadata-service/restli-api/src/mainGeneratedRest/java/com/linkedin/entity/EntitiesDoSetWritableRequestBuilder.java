
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoSetWritableRequestBuilder
    extends ActionRequestBuilderBase<Void, Void, EntitiesDoSetWritableRequestBuilder>
{


    public EntitiesDoSetWritableRequestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("setWritable");
    }

    public EntitiesDoSetWritableRequestBuilder valueParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("setWritable").getFieldDef("value"), value);
        return this;
    }

}
