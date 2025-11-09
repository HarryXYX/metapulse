
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.ListResult;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoListRequestBuilder
    extends ActionRequestBuilderBase<Void, ListResult, EntitiesDoListRequestBuilder>
{


    public EntitiesDoListRequestBuilder(java.lang.String baseUriTemplate, Class<ListResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("list");
    }

    public EntitiesDoListRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("list").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoListRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoListRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoListRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoListRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("list").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoListRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("list").getFieldDef("count"), value);
        return this;
    }

}
