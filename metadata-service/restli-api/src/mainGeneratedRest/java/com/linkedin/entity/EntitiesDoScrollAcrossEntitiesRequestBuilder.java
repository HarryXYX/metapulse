
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoScrollAcrossEntitiesRequestBuilder
    extends ActionRequestBuilderBase<Void, ScrollResult, EntitiesDoScrollAcrossEntitiesRequestBuilder>
{


    public EntitiesDoScrollAcrossEntitiesRequestBuilder(java.lang.String baseUriTemplate, Class<ScrollResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("scrollAcrossEntities");
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder entitiesParam(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder inputParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder scrollIdParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("scrollId"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder keepAliveParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("keepAlive"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoScrollAcrossEntitiesRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossEntities").getFieldDef("searchFlags"), value);
        return this;
    }

}
