
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Retrieves the value for an entity that is made up of latest versions of specified aspects.
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesV2GetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesV2GetBuilder
    extends GetRequestBuilderBase<java.lang.String, EntityResponse, EntitiesV2GetBuilder>
{


    public EntitiesV2GetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityResponse.class, resourceSpec, requestOptions);
    }

    public EntitiesV2GetBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesV2GetBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2GetBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2GetBuilder alwaysIncludeKeyAspectParam(Boolean value) {
        super.setParam("alwaysIncludeKeyAspect", value, Boolean.class);
        return this;
    }

}
