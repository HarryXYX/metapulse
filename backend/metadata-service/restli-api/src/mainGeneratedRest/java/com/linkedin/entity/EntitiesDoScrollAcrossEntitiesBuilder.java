
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.metadata.search.ScrollResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoScrollAcrossEntitiesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoScrollAcrossEntitiesBuilder
    extends ActionRequestBuilderBase<Void, ScrollResult, EntitiesDoScrollAcrossEntitiesBuilder>
{


    public EntitiesDoScrollAcrossEntitiesBuilder(java.lang.String baseUriTemplate, Class<ScrollResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("scrollAcrossEntities");
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramEntities(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramInput(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramSortCriteria(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramScrollId(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("scrollId"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramKeepAlive(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("keepAlive"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("searchFlags"), value);
        return this;
    }

}
