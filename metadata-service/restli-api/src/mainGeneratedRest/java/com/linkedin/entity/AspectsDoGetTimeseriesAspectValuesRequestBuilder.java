
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.aspect.GetTimeseriesAspectValuesResponse;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
public class AspectsDoGetTimeseriesAspectValuesRequestBuilder
    extends ActionRequestBuilderBase<Void, GetTimeseriesAspectValuesResponse, AspectsDoGetTimeseriesAspectValuesRequestBuilder>
{


    public AspectsDoGetTimeseriesAspectValuesRequestBuilder(java.lang.String baseUriTemplate, Class<GetTimeseriesAspectValuesResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getTimeseriesAspectValues");
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder urnParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("urn"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder entityParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("entity"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder aspectParam(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("aspect"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder startTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder endTimeMillisParam(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder limitParam(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("limit"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder latestValueParam(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("latestValue"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder filterParam(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("filter"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesRequestBuilder sortParam(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("sort"), value);
        return this;
    }

}
