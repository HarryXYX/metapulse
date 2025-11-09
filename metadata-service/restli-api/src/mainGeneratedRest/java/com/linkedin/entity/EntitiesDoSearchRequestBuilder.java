
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.metadata.search.SearchResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoSearchRequestBuilder
    extends ActionRequestBuilderBase<Void, SearchResult, EntitiesDoSearchRequestBuilder>
{


    public EntitiesDoSearchRequestBuilder(java.lang.String baseUriTemplate, Class<SearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("search");
    }

    public EntitiesDoSearchRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder inputParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder fulltextParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("fulltext"), value);
        return this;
    }

    public EntitiesDoSearchRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("searchFlags"), value);
        return this;
    }

}
