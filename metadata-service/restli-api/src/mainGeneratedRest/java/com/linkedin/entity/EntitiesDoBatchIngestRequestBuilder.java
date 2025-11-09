
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.SystemMetadataArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoBatchIngestRequestBuilder
    extends ActionRequestBuilderBase<Void, Void, EntitiesDoBatchIngestRequestBuilder>
{


    public EntitiesDoBatchIngestRequestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("batchIngest");
    }

    public EntitiesDoBatchIngestRequestBuilder entitiesParam(EntityArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("batchIngest").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoBatchIngestRequestBuilder systemMetadataParam(SystemMetadataArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("batchIngest").getFieldDef("systemMetadata"), value);
        return this;
    }

}
