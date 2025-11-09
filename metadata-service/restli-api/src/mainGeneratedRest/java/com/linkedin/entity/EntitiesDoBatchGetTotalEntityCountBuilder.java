
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.EntitiesDoBatchGetTotalEntityCountRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class EntitiesDoBatchGetTotalEntityCountBuilder
    extends ActionRequestBuilderBase<Void, LongMap, EntitiesDoBatchGetTotalEntityCountBuilder>
{


    public EntitiesDoBatchGetTotalEntityCountBuilder(String baseUriTemplate, Class<LongMap> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("batchGetTotalEntityCount");
    }

    public EntitiesDoBatchGetTotalEntityCountBuilder paramEntities(StringArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("batchGetTotalEntityCount").getFieldDef("entities"), value);
        return this;
    }

}
