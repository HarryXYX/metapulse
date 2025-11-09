
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.metadata.query.filter.SortCriterionArray;
import com.linkedin.metadata.search.SearchResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoFilterRequestBuilder
    extends ActionRequestBuilderBase<Void, SearchResult, EntitiesDoFilterRequestBuilder>
{


    public EntitiesDoFilterRequestBuilder(java.lang.String baseUriTemplate, Class<SearchResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("filter");
    }

    public EntitiesDoFilterRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("filter").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoFilterRequestBuilder filterParam(Filter value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("filter").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoFilterRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("filter").getFieldDef("sort"), value);
        return this;
    }

    public EntitiesDoFilterRequestBuilder sortCriteriaParam(SortCriterionArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("filter").getFieldDef("sortCriteria"), value);
        return this;
    }

    public EntitiesDoFilterRequestBuilder startParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("filter").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoFilterRequestBuilder countParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("filter").getFieldDef("count"), value);
        return this;
    }

}
