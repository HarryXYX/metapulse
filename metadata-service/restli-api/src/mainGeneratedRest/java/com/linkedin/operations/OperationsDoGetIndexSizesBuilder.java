
package com.linkedin.operations;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.timeseries.TimeseriesIndicesSizesResult;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.operations.OperationsDoGetIndexSizesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class OperationsDoGetIndexSizesBuilder
    extends ActionRequestBuilderBase<Void, TimeseriesIndicesSizesResult, OperationsDoGetIndexSizesBuilder>
{


    public OperationsDoGetIndexSizesBuilder(String baseUriTemplate, Class<TimeseriesIndicesSizesResult> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getIndexSizes");
    }

}
