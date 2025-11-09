
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class OperationsDoGetEsTaskStatusRequestBuilder
    extends ActionRequestBuilderBase<Void, java.lang.String, OperationsDoGetEsTaskStatusRequestBuilder>
{


    public OperationsDoGetEsTaskStatusRequestBuilder(java.lang.String baseUriTemplate, Class<java.lang.String> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getEsTaskStatus");
    }

    public OperationsDoGetEsTaskStatusRequestBuilder nodeIdParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("getEsTaskStatus").getFieldDef("nodeId"), value);
        return this;
    }

    public OperationsDoGetEsTaskStatusRequestBuilder taskIdParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("getEsTaskStatus").getFieldDef("taskId"), value);
        return this;
    }

    public OperationsDoGetEsTaskStatusRequestBuilder taskParam(java.lang.String value) {
        super.setParam(_resourceSpec.getRequestMetadata("getEsTaskStatus").getFieldDef("task"), value);
        return this;
    }

}
