
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.StringArray;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class EntitiesDoBatchGetTotalEntityCountRequestBuilder
    extends ActionRequestBuilderBase<Void, LongMap, EntitiesDoBatchGetTotalEntityCountRequestBuilder>
{


    public EntitiesDoBatchGetTotalEntityCountRequestBuilder(String baseUriTemplate, Class<LongMap> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("batchGetTotalEntityCount");
    }

    public EntitiesDoBatchGetTotalEntityCountRequestBuilder entitiesParam(StringArray value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("batchGetTotalEntityCount").getFieldDef("entities"), value);
        return this;
    }

}
