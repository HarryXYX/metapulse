
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.DeleteReferencesResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoDeleteReferencesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoDeleteReferencesBuilder
    extends ActionRequestBuilderBase<Void, DeleteReferencesResponse, EntitiesDoDeleteReferencesBuilder>
{


    public EntitiesDoDeleteReferencesBuilder(java.lang.String baseUriTemplate, Class<DeleteReferencesResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("deleteReferences");
    }

    public EntitiesDoDeleteReferencesBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("deleteReferences").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoDeleteReferencesBuilder paramDryRun(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("deleteReferences").getFieldDef("dryRun"), value);
        return this;
    }

}
