
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.operations.OperationsDoRestoreIndicesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class OperationsDoRestoreIndicesBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, OperationsDoRestoreIndicesBuilder>
{


    public OperationsDoRestoreIndicesBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("restoreIndices");
    }

    public OperationsDoRestoreIndicesBuilder paramAspect(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("aspect"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramUrn(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urn"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramUrnLike(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urnLike"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramStart(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("start"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramBatchSize(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("batchSize"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramLimit(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("limit"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramGePitEpochMs(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("gePitEpochMs"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramLePitEpochMs(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("lePitEpochMs"), value);
        return this;
    }

    public OperationsDoRestoreIndicesBuilder paramCreateDefaultAspects(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("createDefaultAspects"), value);
        return this;
    }

}
