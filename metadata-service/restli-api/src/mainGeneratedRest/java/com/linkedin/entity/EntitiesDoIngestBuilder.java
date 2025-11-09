
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.SystemMetadata;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoIngestRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoIngestBuilder
    extends ActionRequestBuilderBase<Void, Void, EntitiesDoIngestBuilder>
{


    public EntitiesDoIngestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("ingest");
    }

    public EntitiesDoIngestBuilder paramEntity(Entity value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("ingest").getFieldDef("entity"), value);
        return this;
    }

    public EntitiesDoIngestBuilder paramSystemMetadata(SystemMetadata value) {
        super.setParam(_resourceSpec.getRequestMetadata("ingest").getFieldDef("systemMetadata"), value);
        return this;
    }

}
