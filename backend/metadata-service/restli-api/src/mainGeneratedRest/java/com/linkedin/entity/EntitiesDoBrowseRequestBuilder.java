
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.browse.BrowseResult;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoBrowseRequestBuilder
    extends ActionRequestBuilderBase<Void, BrowseResult, EntitiesDoBrowseRequestBuilder>
{


    public EntitiesDoBrowseRequestBuilder(java.lang.String baseUriTemplate, Class<BrowseResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("browse");
    }

    public EntitiesDoBrowseRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoBrowseRequestBuilder pathParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("path"), value);
        return this;
    }

    public EntitiesDoBrowseRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoBrowseRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoBrowseRequestBuilder limitParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("limit"), value);
        return this;
    }

    public EntitiesDoBrowseRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("searchFlags"), value);
        return this;
    }

}
