
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.mxe.SystemMetadataArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoBatchIngestRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoBatchIngestBuilder
    extends ActionRequestBuilderBase<Void, Void, EntitiesDoBatchIngestBuilder>
{


    public EntitiesDoBatchIngestBuilder(String baseUriTemplate, Class<Void> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("batchIngest");
    }

    public EntitiesDoBatchIngestBuilder paramEntities(EntityArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("batchIngest").getFieldDef("entities"), value);
        return this;
    }

    public EntitiesDoBatchIngestBuilder paramSystemMetadata(SystemMetadataArray value) {
        super.setParam(_resourceSpec.getRequestMetadata("batchIngest").getFieldDef("systemMetadata"), value);
        return this;
    }

}
