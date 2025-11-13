
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


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoSearchRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoSearchBuilder
    extends ActionRequestBuilderBase<Void, SearchResult, EntitiesDoSearchBuilder>
{


    public EntitiesDoSearchBuilder(java.lang.String baseUriTemplate, Class<SearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("search");
    }

    public EntitiesDoSearchBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramInput(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramSortCriteria(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("search").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramFulltext(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("fulltext"), value);
        return this;
    }

    public EntitiesDoSearchBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("search").getFieldDef("searchFlags"), value);
        return this;
    }

}
