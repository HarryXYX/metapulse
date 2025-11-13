
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.SystemMetadata;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoIngestRequestBuilder
    extends ActionRequestBuilderBase<Void, Void, EntitiesDoIngestRequestBuilder>
{


    public EntitiesDoIngestRequestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("ingest");
    }

    public EntitiesDoIngestRequestBuilder entityParam(Entity value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("ingest").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoIngestRequestBuilder systemMetadataParam(SystemMetadata value) {
        super.setParam(_resourceSpec.getRequestMetadata("ingest").getFieldDef("systemMetadata"), value);
        return this;
    }

}
