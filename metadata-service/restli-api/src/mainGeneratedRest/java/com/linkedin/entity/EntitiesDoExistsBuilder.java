
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoExistsRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoExistsBuilder
    extends ActionRequestBuilderBase<Void, Boolean, EntitiesDoExistsBuilder>
{


    public EntitiesDoExistsBuilder(java.lang.String baseUriTemplate, Class<Boolean> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("exists");
    }

    public EntitiesDoExistsBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("exists").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoExistsBuilder paramIncludeSoftDelete(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("exists").getFieldDef("includeSoftDelete"), value);
        return this;
    }

}
