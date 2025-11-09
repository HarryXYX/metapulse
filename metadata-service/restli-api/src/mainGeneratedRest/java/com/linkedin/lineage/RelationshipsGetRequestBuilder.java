
package com.linkedin.lineage;

import javax.annotation.Generated;
import com.linkedin.common.EntityRelationships;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class RelationshipsGetRequestBuilder
    extends GetRequestBuilderBase<Void, EntityRelationships, RelationshipsGetRequestBuilder>
{


    public RelationshipsGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityRelationships.class, resourceSpec, requestOptions);
    }

    public RelationshipsGetRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam("urn", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetRequestBuilder typesParam(StringArray value) {
        super.setReqParam("types", value, StringArray.class);
        return this;
    }

    public RelationshipsGetRequestBuilder typesParam(Iterable<java.lang.String> value) {
        super.setReqParam("types", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetRequestBuilder addTypesParam(java.lang.String value) {
        super.addReqParam("types", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetRequestBuilder directionParam(java.lang.String value) {
        super.setReqParam("direction", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetRequestBuilder startParam(Integer value) {
        super.setParam("start", value, Integer.class);
        return this;
    }

    public RelationshipsGetRequestBuilder countParam(Integer value) {
        super.setParam("count", value, Integer.class);
        return this;
    }

}
