
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.query.AutoCompleteResult;
import com.linkedin.metadata.query.SearchFlags;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoAutocompleteRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoAutocompleteBuilder
    extends ActionRequestBuilderBase<Void, AutoCompleteResult, EntitiesDoAutocompleteBuilder>
{


    public EntitiesDoAutocompleteBuilder(java.lang.String baseUriTemplate, Class<AutoCompleteResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("autocomplete");
    }

    public EntitiesDoAutocompleteBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoAutocompleteBuilder paramQuery(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("query"), value);
        return this;
    }

    public EntitiesDoAutocompleteBuilder paramField(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("field"), value);
        return this;
    }

    public EntitiesDoAutocompleteBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("filter"), value);
        return this;
    }

    public EntitiesDoAutocompleteBuilder paramLimit(Integer value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("limit"), value);
        return this;
    }

    public EntitiesDoAutocompleteBuilder paramSearchFlags(SearchFlags value) {
        super.setParam(_resourceSpec.getRequestMetadata("autocomplete").getFieldDef("searchFlags"), value);
        return this;
    }

}
