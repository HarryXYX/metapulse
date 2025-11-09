
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.aspect.GetTimeseriesAspectValuesResponse;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.query.filter.SortCriterion;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.ActionRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;


/**
 * 
 * @deprecated
 *     This format of request builder is obsolete. Please use {@link com.linkedin.entity.AspectsDoGetTimeseriesAspectValuesRequestBuilder} instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder")
@Deprecated
public class AspectsDoGetTimeseriesAspectValuesBuilder
    extends ActionRequestBuilderBase<Void, GetTimeseriesAspectValuesResponse, AspectsDoGetTimeseriesAspectValuesBuilder>
{


    public AspectsDoGetTimeseriesAspectValuesBuilder(java.lang.String baseUriTemplate, Class<GetTimeseriesAspectValuesResponse> returnClass, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, returnClass, resourceSpec, requestOptions);
        super.name("getTimeseriesAspectValues");
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramUrn(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("urn"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramEntity(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("entity"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramAspect(java.lang.String value) {
        super.setReqParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("aspect"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramStartTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("startTimeMillis"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramEndTimeMillis(Long value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("endTimeMillis"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramLimit(Integer value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("limit"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramLatestValue(Boolean value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("latestValue"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramFilter(Filter value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("filter"), value);
        return this;
    }

    public AspectsDoGetTimeseriesAspectValuesBuilder paramSort(SortCriterion value) {
        super.setParam(_resourceSpec.getRequestMetadata("getTimeseriesAspectValues").getFieldDef("sort"), value);
        return this;
    }

}
