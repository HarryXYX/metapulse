
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoApplyRetentionRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoApplyRetentionBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, EntitiesDoApplyRetentionBuilder>
{


    public EntitiesDoApplyRetentionBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("applyRetention");
    }

    public EntitiesDoApplyRetentionBuilder paramStart(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoApplyRetentionBuilder paramCount(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoApplyRetentionBuilder paramAttemptWithVersion(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("attemptWithVersion"), value);
        return this;
    }

    public EntitiesDoApplyRetentionBuilder paramAspectName(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("aspectName"), value);
        return this;
    }

    public EntitiesDoApplyRetentionBuilder paramUrn(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("urn"), value);
        return this;
    }

}
