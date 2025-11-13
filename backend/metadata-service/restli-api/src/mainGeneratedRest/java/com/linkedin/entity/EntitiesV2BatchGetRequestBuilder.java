
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchGetEntityRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesV2BatchGetRequestBuilder
    extends BatchGetEntityRequestBuilderBase<java.lang.String, EntityResponse, EntitiesV2BatchGetRequestBuilder>
{


    public EntitiesV2BatchGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, resourceSpec, requestOptions);
    }

    public EntitiesV2BatchGetRequestBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesV2BatchGetRequestBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2BatchGetRequestBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesV2BatchGetRequestBuilder alwaysIncludeKeyAspectParam(Boolean value) {
        super.setParam("alwaysIncludeKeyAspect", value, Boolean.class);
        return this;
    }

}
