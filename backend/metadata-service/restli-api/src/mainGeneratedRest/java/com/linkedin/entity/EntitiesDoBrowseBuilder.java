
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.browse.BrowseResult;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoBrowseRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoBrowseBuilder
    extends ActionRequestBuilderBase<Void, BrowseResult, EntitiesDoBrowseBuilder>
{


    public EntitiesDoBrowseBuilder(java.lang.String baseUriTemplate, Class<BrowseResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("browse");
    }

    public EntitiesDoBrowseBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoBrowseBuilder paramPath(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("path"), value);
        return this;
    }

    public EntitiesDoBrowseBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoBrowseBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoBrowseBuilder paramLimit(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("limit"), value);
        return this;
    }

    public EntitiesDoBrowseBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("browse").getFieldDef("searchFlags"), value);
        return this;
    }

}
