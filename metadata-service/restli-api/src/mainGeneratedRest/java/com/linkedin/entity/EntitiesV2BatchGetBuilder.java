
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchGetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesV2BatchGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesV2BatchGetBuilder
    extends BatchGetRequestBuilderBase<java.lang.String, EntityResponse, EntitiesV2BatchGetBuilder>
{


    public EntitiesV2BatchGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityResponse.class, resourceSpec, requestOptions);
    }

    public EntitiesV2BatchGetBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesV2BatchGetBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2BatchGetBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2BatchGetBuilder alwaysIncludeKeyAspectParam(Boolean value) {
        super.setParam("alwaysIncludeKeyAspect", value, Boolean.class);
        return this;
    }

}
