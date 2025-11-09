
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.common.urn.Urn;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoGetBrowsePathsRequestBuilder
    extends ActionRequestBuilderBase<Void, StringArray, EntitiesDoGetBrowsePathsRequestBuilder>
{


    public EntitiesDoGetBrowsePathsRequestBuilder(String baseUriTemplate, Class<StringArray> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getBrowsePaths");
    }

    public EntitiesDoGetBrowsePathsRequestBuilder urnParam(Urn value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getBrowsePaths").getFieldDef("urn"), value);
        return this;
    }

}
