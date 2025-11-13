
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.DeleteEntityResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Deletes all data related to an individual urn(entity).
 * Service Returns: - a DeleteEntityResponse object.
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoDeleteRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoDeleteBuilder
    extends ActionRequestBuilderBase<Void, DeleteEntityResponse, EntitiesDoDeleteBuilder>
{


    public EntitiesDoDeleteBuilder(java.lang.String baseUriTemplate, Class<DeleteEntityResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("delete");
    }

    public EntitiesDoDeleteBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoDeleteBuilder paramAspectName(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("aspectName"), value);
        return this;
    }

    public EntitiesDoDeleteBuilder paramStartTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public EntitiesDoDeleteBuilder paramEndTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("endTimeMillis"), value);
        return this;
    }

}
