
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.operations.OperationsDoGetEsTaskStatusRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class OperationsDoGetEsTaskStatusBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, OperationsDoGetEsTaskStatusBuilder>
{


    public OperationsDoGetEsTaskStatusBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getEsTaskStatus");
    }

    public OperationsDoGetEsTaskStatusBuilder paramNodeId(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("getEsTaskStatus").getFieldDef("nodeId"), value);
        return this;
    }

    public OperationsDoGetEsTaskStatusBuilder paramTaskId(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("getEsTaskStatus").getFieldDef("taskId"), value);
        return this;
    }

    public OperationsDoGetEsTaskStatusBuilder paramTask(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("getEsTaskStatus").getFieldDef("task"), value);
        return this;
    }

}
