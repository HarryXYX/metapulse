
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class OperationsDoRestoreIndicesRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, OperationsDoRestoreIndicesRequestBuilder>
{


    public OperationsDoRestoreIndicesRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("restoreIndices");
    }

    public OperationsDoRestoreIndicesRequestBuilder aspectParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("aspect"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder urnParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urn"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder urnLikeParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urnLike"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder startParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("start"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder batchSizeParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("batchSize"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder limitParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("limit"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder gePitEpochMsParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("gePitEpochMs"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder lePitEpochMsParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("lePitEpochMs"), value);
        return this;
    }

    public OperationsDoRestoreIndicesRequestBuilder createDefaultAspectsParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("createDefaultAspects"), value);
        return this;
    }

}
