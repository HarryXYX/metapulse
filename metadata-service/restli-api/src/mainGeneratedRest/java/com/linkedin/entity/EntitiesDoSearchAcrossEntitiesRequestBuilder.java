
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.metadata.search.SearchResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoSearchAcrossEntitiesRequestBuilder
    extends ActionRequestBuilderBase<Void, SearchResult, EntitiesDoSearchAcrossEntitiesRequestBuilder>
{


    public EntitiesDoSearchAcrossEntitiesRequestBuilder(java.lang.String baseUriTemplate, Class<SearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("searchAcrossEntities");
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder entitiesParam(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder inputParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("searchFlags"), value);
        return this;
    }

}
