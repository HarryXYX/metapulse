
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


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoSearchAcrossEntitiesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoSearchAcrossEntitiesBuilder
    extends ActionRequestBuilderBase<Void, SearchResult, EntitiesDoSearchAcrossEntitiesBuilder>
{


    public EntitiesDoSearchAcrossEntitiesBuilder(java.lang.String baseUriTemplate, Class<SearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("searchAcrossEntities");
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramEntities(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramInput(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramSortCriteria(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoSearchAcrossEntitiesBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossEntities").getFieldDef("searchFlags"), value);
        return this;
    }

}
