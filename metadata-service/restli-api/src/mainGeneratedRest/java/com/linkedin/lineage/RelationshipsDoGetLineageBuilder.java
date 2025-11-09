
package com.linkedin.lineage;

import javax.annotation.Generated;
import com.linkedin.metadata.graph.EntityLineageResult;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.lineage.RelationshipsDoGetLineageRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class RelationshipsDoGetLineageBuilder
    extends ActionRequestBuilderBase<Void, EntityLineageResult, RelationshipsDoGetLineageBuilder>
{


    public RelationshipsDoGetLineageBuilder(java.lang.String baseUriTemplate, Class<EntityLineageResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getLineage");
    }

    public RelationshipsDoGetLineageBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("urn"), value);
        return this;
    }

    public RelationshipsDoGetLineageBuilder paramDirection(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("direction"), value);
        return this;
    }

    public RelationshipsDoGetLineageBuilder paramStart(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("start"), value);
        return this;
    }

    public RelationshipsDoGetLineageBuilder paramCount(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("count"), value);
        return this;
    }

    public RelationshipsDoGetLineageBuilder paramMaxHops(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getLineage").getFieldDef("maxHops"), value);
        return this;
    }

}
