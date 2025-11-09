
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.common.urn.Urn;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoGetBrowsePathsRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoGetBrowsePathsBuilder
    extends ActionRequestBuilderBase<Void, StringArray, EntitiesDoGetBrowsePathsBuilder>
{


    public EntitiesDoGetBrowsePathsBuilder(String baseUriTemplate, Class<StringArray> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getBrowsePaths");
    }

    public EntitiesDoGetBrowsePathsBuilder paramUrn(Urn value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getBrowsePaths").getFieldDef("urn"), value);
        return this;
    }

}
