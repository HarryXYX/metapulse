
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.AutoCompleteResult;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoAutocompleteRequestBuilder
    extends ActionRequestBuilderBase<Void, AutoCompleteResult, EntitiesDoAutocompleteRequestBuilder>
{


    public EntitiesDoAutocompleteRequestBuilder(java.lang.String baseUriTemplate, Class<AutoCompleteResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("autocomplete");
    }

    public EntitiesDoAutocompleteRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoAutocompleteRequestBuilder queryParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("query"), value);
        return this;
    }

    public EntitiesDoAutocompleteRequestBuilder fieldParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("field"), value);
        return this;
    }

    public EntitiesDoAutocompleteRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoAutocompleteRequestBuilder limitParam(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("limit"), value);
        return this;
    }

    public EntitiesDoAutocompleteRequestBuilder searchFlagsParam(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("searchFlags"), value);
        return this;
    }

}
