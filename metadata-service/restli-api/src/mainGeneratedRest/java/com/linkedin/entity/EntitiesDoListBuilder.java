
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.ListResult;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoListRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoListBuilder
    extends ActionRequestBuilderBase<Void, ListResult, EntitiesDoListBuilder>
{


    public EntitiesDoListBuilder(java.lang.String baseUriTemplate, Class<ListResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("list");
    }

    public EntitiesDoListBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("list").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoListBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoListBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoListBuilder paramSortCriteria(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoListBuilder paramStart(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("list").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoListBuilder paramCount(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("list").getFieldDef("count"), value);
        return this;
    }

}
