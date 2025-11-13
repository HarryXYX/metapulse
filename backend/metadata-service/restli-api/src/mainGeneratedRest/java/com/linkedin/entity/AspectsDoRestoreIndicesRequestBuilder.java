
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AspectsDoRestoreIndicesRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, AspectsDoRestoreIndicesRequestBuilder>
{


    public AspectsDoRestoreIndicesRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("restoreIndices");
    }

    public AspectsDoRestoreIndicesRequestBuilder aspectParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("aspect"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder urnParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urn"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder urnLikeParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urnLike"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder startParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("start"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder batchSizeParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("batchSize"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder limitParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("limit"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder gePitEpochMsParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("gePitEpochMs"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder lePitEpochMsParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("lePitEpochMs"), value);
        return this;
    }

    public AspectsDoRestoreIndicesRequestBuilder createDefaultAspectsParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("createDefaultAspects"), value);
        return this;
    }

}
