
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


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoScrollAcrossLineageRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoScrollAcrossLineageBuilder
    extends ActionRequestBuilderBase<Void, LineageScrollResult, EntitiesDoScrollAcrossLineageBuilder>
{


    public EntitiesDoScrollAcrossLineageBuilder(java.lang.String baseUriTemplate, Class<LineageScrollResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("scrollAcrossLineage");
    }

    public EntitiesDoScrollAcrossLineageBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("urn"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramDirection(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("direction"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramEntities(StringArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramInput(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("input"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramMaxHops(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("maxHops"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramSortCriteria(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramScrollId(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("scrollId"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramKeepAlive(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("keepAlive"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramStartTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramEndTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public EntitiesDoScrollAcrossLineageBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("scrollAcrossLineage").getFieldDef("searchFlags"), value);
        return this;
    }

}
