
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchGetEntityRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesBatchGetRequestBuilder
    extends BatchGetEntityRequestBuilderBase<java.lang.String, Entity, EntitiesBatchGetRequestBuilder>
{


    public EntitiesBatchGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, resourceSpec, requestOptions);
    }

    public EntitiesBatchGetRequestBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesBatchGetRequestBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesBatchGetRequestBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

}
