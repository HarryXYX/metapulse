
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.IngestionRunSummaryArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Retrieves the ingestion run summaries.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class RunsDoListRequestBuilder
    extends ActionRequestBuilderBase<Void, IngestionRunSummaryArray, RunsDoListRequestBuilder>
{


    public RunsDoListRequestBuilder(String baseUriTemplate, Class<IngestionRunSummaryArray> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("list");
    }

    public RunsDoListRequestBuilder pageOffsetParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("pageOffset"), value);
        return this;
    }

    public RunsDoListRequestBuilder pageSizeParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("pageSize"), value);
        return this;
    }

    public RunsDoListRequestBuilder includeSoftParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("includeSoft"), value);
        return this;
    }

}
