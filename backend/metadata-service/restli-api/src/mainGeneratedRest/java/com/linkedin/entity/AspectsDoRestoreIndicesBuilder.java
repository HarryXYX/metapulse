
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.AspectsDoRestoreIndicesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AspectsDoRestoreIndicesBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, AspectsDoRestoreIndicesBuilder>
{


    public AspectsDoRestoreIndicesBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("restoreIndices");
    }

    public AspectsDoRestoreIndicesBuilder paramAspect(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("aspect"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramUrn(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urn"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramUrnLike(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("urnLike"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramStart(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("start"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramBatchSize(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("batchSize"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramLimit(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("limit"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramGePitEpochMs(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("gePitEpochMs"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramLePitEpochMs(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("lePitEpochMs"), value);
        return this;
    }

    public AspectsDoRestoreIndicesBuilder paramCreateDefaultAspects(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("restoreIndices").getFieldDef("createDefaultAspects"), value);
        return this;
    }

}
