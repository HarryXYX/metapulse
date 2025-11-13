
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.metadata.search.LineageScrollResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoScrollAcrossLineageRequestBuilder
    extends ActionRequestBuilderBase<Void, LineageScrollResult, EntitiesDoScrollAcrossLineageRequestBuilder>
{


    public EntitiesDoScrollAcrossLineageRequestBuilder(java.lang.String baseUriTemplate, Class<LineageScrollResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("scrollAcrossLineage");
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder directionParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("direction"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder entitiesParam(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder inputParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder maxHopsParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("maxHops"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder scrollIdParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("scrollId"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder keepAliveParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("keepAlive"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder startTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder endTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("searchFlags"), value);
        return this;
    }

}
