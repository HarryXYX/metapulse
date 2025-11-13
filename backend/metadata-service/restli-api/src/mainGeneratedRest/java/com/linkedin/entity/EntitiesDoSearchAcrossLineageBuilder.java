
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


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoSearchAcrossLineageRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoSearchAcrossLineageBuilder
    extends ActionRequestBuilderBase<Void, LineageSearchResult, EntitiesDoSearchAcrossLineageBuilder>
{


    public EntitiesDoSearchAcrossLineageBuilder(java.lang.String baseUriTemplate, Class<LineageSearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("searchAcrossLineage");
    }

    public EntitiesDoSearchAcrossLineageBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramDirection(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("direction"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramEntities(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramInput(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramMaxHops(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("maxHops"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramSortCriteria(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramStartTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramEndTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public EntitiesDoSearchAcrossLineageBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("searchAcrossLineage").getFieldDef("searchFlags"), value);
        return this;
    }

}
