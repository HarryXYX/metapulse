
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.operations.OperationsDoTruncateTimeseriesAspectRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class OperationsDoTruncateTimeseriesAspectBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, OperationsDoTruncateTimeseriesAspectBuilder>
{


    public OperationsDoTruncateTimeseriesAspectBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("truncateTimeseriesAspect");
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramEntityType(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("entityType"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramAspect(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("aspect"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramEndTimeMillis(Long value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramDryRun(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("dryRun"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramBatchSize(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("batchSize"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramTimeoutSeconds(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("timeoutSeconds"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramForceDeleteByQuery(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("forceDeleteByQuery"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectBuilder paramForceReindex(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("forceReindex"), value);
        return this;
    }

}
