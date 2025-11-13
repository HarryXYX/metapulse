
package com.linkedin.lineage;

import javax.annotation.Generated;
import com.linkedin.metadata.graph.EntityLineageResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class RelationshipsDoGetLineageRequestBuilder
    extends ActionRequestBuilderBase<Void, EntityLineageResult, RelationshipsDoGetLineageRequestBuilder>
{


    public RelationshipsDoGetLineageRequestBuilder(java.lang.String baseUriTemplate, Class<EntityLineageResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getLineage");
    }

    public RelationshipsDoGetLineageRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("urn"), value);
        return this;
    }

    public RelationshipsDoGetLineageRequestBuilder directionParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("direction"), value);
        return this;
    }

    public RelationshipsDoGetLineageRequestBuilder startParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("start"), value);
        return this;
    }

    public RelationshipsDoGetLineageRequestBuilder countParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("count"), value);
        return this;
    }

    public RelationshipsDoGetLineageRequestBuilder maxHopsParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("maxHops"), value);
        return this;
    }

}
