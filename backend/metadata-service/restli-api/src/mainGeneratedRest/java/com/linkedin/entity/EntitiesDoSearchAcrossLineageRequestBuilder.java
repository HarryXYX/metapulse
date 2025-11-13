
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.metadata.search.LineageSearchResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoSearchAcrossLineageRequestBuilder
    extends ActionRequestBuilderBase<Void, LineageSearchResult, EntitiesDoSearchAcrossLineageRequestBuilder>
{


    public EntitiesDoSearchAcrossLineageRequestBuilder(java.lang.String baseUriTemplate, Class<LineageSearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("searchAcrossLineage");
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder directionParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("direction"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder entitiesParam(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder inputParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder maxHopsParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("maxHops"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder startTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder endTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("searchFlags"), value);
        return this;
    }

}
