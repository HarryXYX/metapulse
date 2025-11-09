
package com.linkedin.lineage;

import javax.annotation.Generated;
import com.linkedin.common.EntityRelationships;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.DeleteRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.lineage.RelationshipsDeleteRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class RelationshipsDeleteBuilder
    extends DeleteRequestBuilderBase<Void, EntityRelationships, RelationshipsDeleteBuilder>
{


    public RelationshipsDeleteBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityRelationships.class, resourceSpec, requestOptions);
    }

    public RelationshipsDeleteBuilder urnParam(java.lang.String value) {
        super.setReqParam("urn", value, java.lang.String.class);
        return this;
    }

}
