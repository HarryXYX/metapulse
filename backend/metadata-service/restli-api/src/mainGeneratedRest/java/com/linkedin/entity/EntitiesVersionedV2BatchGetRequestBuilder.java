
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.common.urn.VersionedUrn;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.BatchGetEntityRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesVersionedV2BatchGetRequestBuilder
    extends BatchGetEntityRequestBuilderBase<VersionedUrn, EntityResponse, EntitiesVersionedV2BatchGetRequestBuilder>
{


    public EntitiesVersionedV2BatchGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, resourceSpec, requestOptions);
    }

    public EntitiesVersionedV2BatchGetRequestBuilder entityTypeParam(java.lang.String value) {
        super.setReqParam("entityType", value, java.lang.String.class);
        return this;
    }

    public EntitiesVersionedV2BatchGetRequestBuilder aspectsParam(StringArray value) {
        super.setParam("aspects", value, StringArray.class);
        return this;
    }

    public EntitiesVersionedV2BatchGetRequestBuilder aspectsParam(Iterable<java.lang.String> value) {
        super.setParam("aspects", value, java.lang.String.class);
        return this;
    }

    public EntitiesVersionedV2BatchGetRequestBuilder addAspectsParam(java.lang.String value) {
        super.addParam("aspects", value, java.lang.String.class);
        return this;
    }

}
