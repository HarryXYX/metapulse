
package com.linkedin.platform;

import javax.annotation.Generated;
import com.linkedin.mxe.PlatformEvent;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class PlatformDoProducePlatformEventRequestBuilder
    extends ActionRequestBuilderBase<Void, Void, PlatformDoProducePlatformEventRequestBuilder>
{


    public PlatformDoProducePlatformEventRequestBuilder(java.lang.String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("producePlatformEvent");
    }

    public PlatformDoProducePlatformEventRequestBuilder nameParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("producePlatformEvent").getFieldDef("name"), value);
        return this;
    }

    public PlatformDoProducePlatformEventRequestBuilder keyParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("producePlatformEvent").getFieldDef("key"), value);
        return this;
    }

    public PlatformDoProducePlatformEventRequestBuilder eventParam(PlatformEvent value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("producePlatformEvent").getFieldDef("event"), value);
        return this;
    }

}
