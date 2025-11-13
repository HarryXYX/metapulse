
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.aspect.VersionedAspect;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Retrieves the value for an entity that is made up of latest versions of specified aspects.
 *  TODO: Get rid of this and migrate to getAspect.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AspectsGetRequestBuilder
    extends GetRequestBuilderBase<java.lang.String, VersionedAspect, AspectsGetRequestBuilder>
{


    public AspectsGetRequestBuilder(java.lang.String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, VersionedAspect.class, resourceSpec, requestOptions);
    }

    public AspectsGetRequestBuilder aspectParam(java.lang.String value) {
        super.setParam("aspect", value, java.lang.String.class);
        return this;
    }

    public AspectsGetRequestBuilder versionParam(Long value) {
        super.setParam("version", value, Long.class);
        return this;
    }

}
