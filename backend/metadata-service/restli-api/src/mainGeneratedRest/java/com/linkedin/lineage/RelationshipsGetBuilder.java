
package com.linkedin.lineage;

import javax.annotation.Generated;
import com.linkedin.common.EntityRelationships;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.lineage.RelationshipsGetRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class RelationshipsGetBuilder
    extends GetRequestBuilderBase<Void, EntityRelationships, RelationshipsGetBuilder>
{


    public RelationshipsGetBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, EntityRelationships.class, resourceSpec, requestOptions);
    }

    public RelationshipsGetBuilder urnParam(java.lang.String value) {
        super.setReqParam("urn", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetBuilder typesParam(StringArray value) {
        super.setReqParam("types", value, StringArray.class);
        return this;
    }

    public RelationshipsGetBuilder typesParam(Iterable<java.lang.String> value) {
        super.setReqParam("types", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetBuilder addTypesParam(java.lang.String value) {
        super.addReqParam("types", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetBuilder directionParam(java.lang.String value) {
        super.setReqParam("direction", value, java.lang.String.class);
        return this;
    }

    public RelationshipsGetBuilder startParam(Integer value) {
        super.setParam("start", value, Integer.class);
        return this;
    }

    public RelationshipsGetBuilder countParam(Integer value) {
        super.setParam("count", value, Integer.class);
        return this;
    }

}
