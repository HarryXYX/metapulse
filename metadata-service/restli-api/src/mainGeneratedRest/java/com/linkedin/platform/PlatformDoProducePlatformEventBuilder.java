
package com.linkedin.platform;

import javax.annotation.Generated;
import com.linkedin.mxe.PlatformEvent;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.platform.PlatformDoProducePlatformEventRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class PlatformDoProducePlatformEventBuilder
    extends ActionRequestBuilderBase<Void, Void, PlatformDoProducePlatformEventBuilder>
{


    public PlatformDoProducePlatformEventBuilder(java.lang.String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("producePlatformEvent");
    }

    public PlatformDoProducePlatformEventBuilder paramName(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("producePlatformEvent").getFieldDef("name"), value);
        return this;
    }

    public PlatformDoProducePlatformEventBuilder paramKey(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("producePlatformEvent").getFieldDef("key"), value);
        return this;
    }

    public PlatformDoProducePlatformEventBuilder paramEvent(PlatformEvent value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("producePlatformEvent").getFieldDef("event"), value);
        return this;
    }

}
