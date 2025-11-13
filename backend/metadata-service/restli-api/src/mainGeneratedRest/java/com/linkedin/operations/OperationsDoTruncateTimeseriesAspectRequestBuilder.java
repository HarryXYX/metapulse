
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class OperationsDoTruncateTimeseriesAspectRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, OperationsDoTruncateTimeseriesAspectRequestBuilder>
{


    public OperationsDoTruncateTimeseriesAspectRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("truncateTimeseriesAspect");
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder entityTypeParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("entityType"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder aspectParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("aspect"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder endTimeMillisParam(Long value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder dryRunParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("dryRun"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder batchSizeParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("batchSize"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder timeoutSecondsParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("timeoutSeconds"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder forceDeleteByQueryParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("forceDeleteByQuery"), value);
        return this;
    }

    public OperationsDoTruncateTimeseriesAspectRequestBuilder forceReindexParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("truncateTimeseriesAspect").getFieldDef("forceReindex"), value);
        return this;
    }

}
