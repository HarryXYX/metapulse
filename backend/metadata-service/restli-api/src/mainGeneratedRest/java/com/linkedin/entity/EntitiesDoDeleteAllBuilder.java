
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.RollbackResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoDeleteAllRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoDeleteAllBuilder
    extends ActionRequestBuilderBase<Void, RollbackResponse, EntitiesDoDeleteAllBuilder>
{


    public EntitiesDoDeleteAllBuilder(java.lang.String baseUriTemplate, Class<RollbackResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("deleteAll");
    }

    public EntitiesDoDeleteAllBuilder paramRegistryId(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("deleteAll").getFieldDef("registryId"), value);
        return this;
    }

    public EntitiesDoDeleteAllBuilder paramDryRun(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("deleteAll").getFieldDef("dryRun"), value);
        return this;
    }

}
