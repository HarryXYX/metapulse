
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.common.urn.VersionedUrn;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchGetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesVersionedV2BatchGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesVersionedV2BatchGetBuilder
    extends BatchGetRequestBuilderBase<VersionedUrn, EntityResponse, EntitiesVersionedV2BatchGetBuilder>
{


    public EntitiesVersionedV2BatchGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityResponse.class, resourceSpec, requestOptions);
    }

    public EntitiesVersionedV2BatchGetBuilder entityTypeParam(java.lang.String value) {
        super.setReqParam("entityType", value, java.lang.String.class);
        return this;
    }

    public EntitiesVersionedV2BatchGetBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesVersionedV2BatchGetBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesVersionedV2BatchGetBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

}
