
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.metadata.run.RollbackResponse;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * Rolls back an ingestion run
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.RunsDoRollbackRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class RunsDoRollbackBuilder
    extends ActionRequestBuilderBase<Void, RollbackResponse, RunsDoRollbackBuilder>
{


    public RunsDoRollbackBuilder(java.lang.String baseUriTemplate, Class<RollbackResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("rollback");
    }

    public RunsDoRollbackBuilder paramRunId(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("runId"), value);
        return this;
    }

    public RunsDoRollbackBuilder paramDryRun(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("dryRun"), value);
        return this;
    }

    public RunsDoRollbackBuilder paramHardDelete(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("hardDelete"), value);
        return this;
    }

    public RunsDoRollbackBuilder paramSafe(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("rollback").getFieldDef("safe"), value);
        return this;
    }

}
