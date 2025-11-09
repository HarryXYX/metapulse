
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.ListUrnsResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoListUrnsRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoListUrnsBuilder
    extends ActionRequestBuilderBase<Void, ListUrnsResult, EntitiesDoListUrnsBuilder>
{


    public EntitiesDoListUrnsBuilder(java.lang.String baseUriTemplate, Class<ListUrnsResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("listUrns");
    }

    public EntitiesDoListUrnsBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("listUrns").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoListUrnsBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("listUrns").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoListUrnsBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("listUrns").getFieldDef("count"), value);
        return this;
    }

}
