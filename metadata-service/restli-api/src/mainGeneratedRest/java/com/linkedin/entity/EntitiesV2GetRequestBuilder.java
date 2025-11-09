
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Retrieves the value for an entity that is made up of latest versions of specified aspects.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesV2GetRequestBuilder
    extends GetRequestBuilderBase<java.lang.String, EntityResponse, EntitiesV2GetRequestBuilder>
{


    public EntitiesV2GetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityResponse.class, resourceSpec, requestOptions);
    }

    public EntitiesV2GetRequestBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesV2GetRequestBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2GetRequestBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2GetRequestBuilder alwaysIncludeKeyAspectParam(Boolean value) {
        super.setParam("alwaysIncludeKeyAspect", value, Boolean.class);
        return this;
    }

}
