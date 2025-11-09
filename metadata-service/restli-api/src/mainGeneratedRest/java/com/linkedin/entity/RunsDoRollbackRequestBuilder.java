
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.RollbackResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Rolls back an ingestion run
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class RunsDoRollbackRequestBuilder
    extends ActionRequestBuilderBase<Void, RollbackResponse, RunsDoRollbackRequestBuilder>
{


    public RunsDoRollbackRequestBuilder(java.lang.String baseUriTemplate, Class<RollbackResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("rollback");
    }

    public RunsDoRollbackRequestBuilder runIdParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("runId"), value);
        return this;
    }

    public RunsDoRollbackRequestBuilder dryRunParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("dryRun"), value);
        return this;
    }

    public RunsDoRollbackRequestBuilder hardDeleteParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("hardDelete"), value);
        return this;
    }

    public RunsDoRollbackRequestBuilder safeParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("safe"), value);
        return this;
    }

}
