
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
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoDeleteRequestBuilder
    extends ActionRequestBuilderBase<Void, DeleteEntityResponse, EntitiesDoDeleteRequestBuilder>
{


    public EntitiesDoDeleteRequestBuilder(java.lang.String baseUriTemplate, Class<DeleteEntityResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("delete");
    }

    public EntitiesDoDeleteRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoDeleteRequestBuilder aspectNameParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("aspectName"), value);
        return this;
    }

    public EntitiesDoDeleteRequestBuilder startTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public EntitiesDoDeleteRequestBuilder endTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("delete").getFieldDef("endTimeMillis"), value);
        return this;
    }

}
