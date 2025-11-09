
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
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesGetBuilder
    extends GetRequestBuilderBase<java.lang.String, Entity, EntitiesGetBuilder>
{


    public EntitiesGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Entity.class, resourceSpec, requestOptions);
    }

    public EntitiesGetBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesGetBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesGetBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

}
