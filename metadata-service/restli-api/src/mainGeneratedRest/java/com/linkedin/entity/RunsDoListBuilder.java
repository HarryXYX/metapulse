
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.IngestionRunSummaryArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Retrieves the ingestion run summaries.
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.RunsDoListRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class RunsDoListBuilder
    extends ActionRequestBuilderBase<Void, IngestionRunSummaryArray, RunsDoListBuilder>
{


    public RunsDoListBuilder(String baseUriTemplate, Class<IngestionRunSummaryArray> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("list");
    }

    public RunsDoListBuilder paramPageOffset(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("pageOffset"), value);
        return this;
    }

    public RunsDoListBuilder paramPageSize(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("pageSize"), value);
        return this;
    }

    public RunsDoListBuilder paramIncludeSoft(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("list").getFieldDef("includeSoft"), value);
        return this;
    }

}
