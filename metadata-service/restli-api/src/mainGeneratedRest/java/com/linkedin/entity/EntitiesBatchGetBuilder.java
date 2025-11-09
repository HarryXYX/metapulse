
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchGetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesBatchGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesBatchGetBuilder
    extends BatchGetRequestBuilderBase<java.lang.String, Entity, EntitiesBatchGetBuilder>
{


    public EntitiesBatchGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Entity.class, resourceSpec, requestOptions);
    }

    public EntitiesBatchGetBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesBatchGetBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesBatchGetBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

}
