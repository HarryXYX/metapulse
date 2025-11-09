
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.timeseries.TimeseriesIndicesSizesResult;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class OperationsDoGetIndexSizesRequestBuilder
    extends ActionRequestBuilderBase<Void, TimeseriesIndicesSizesResult, OperationsDoGetIndexSizesRequestBuilder>
{


    public OperationsDoGetIndexSizesRequestBuilder(String baseUriTemplate, Class<TimeseriesIndicesSizesResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getIndexSizes");
    }

}
