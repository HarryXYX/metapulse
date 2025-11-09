
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoApplyRetentionRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, EntitiesDoApplyRetentionRequestBuilder>
{


    public EntitiesDoApplyRetentionRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("applyRetention");
    }

    public EntitiesDoApplyRetentionRequestBuilder startParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("start"), value);
        return this;
    }

    public EntitiesDoApplyRetentionRequestBuilder countParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("count"), value);
        return this;
    }

    public EntitiesDoApplyRetentionRequestBuilder attemptWithVersionParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("attemptWithVersion"), value);
        return this;
    }

    public EntitiesDoApplyRetentionRequestBuilder aspectNameParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("aspectName"), value);
        return this;
    }

    public EntitiesDoApplyRetentionRequestBuilder urnParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("applyRetention").getFieldDef("urn"), value);
        return this;
    }

}
