
package com.linkedin.lineage;

import javax.annotation.Generated;
import com.linkedin.common.EntityRelationships;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.DeleteRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class RelationshipsDeleteRequestBuilder
    extends DeleteRequestBuilderBase<Void, EntityRelationships, RelationshipsDeleteRequestBuilder>
{


    public RelationshipsDeleteRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityRelationships.class, resourceSpec, requestOptions);
    }

    public RelationshipsDeleteRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam("urn", value, java.lang.String.class);
        return this;
    }

}
