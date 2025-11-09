
package com.linkedin.timeseries;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/pegasus/com/linkedin/analytics/GetTimeseriesAggregatedStatsResponse.pdl.")
public class AggregationSpecArray
    extends WrappingArrayTemplate<AggregationSpec>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.timeseries/**Provides the aggregation specification on a member/field.*/record AggregationSpec{/**Name of the member/field.*/fieldPath:string/**Aggregation type for the metric.*/aggregationType:enum AggregationType{LATEST,SUM,CARDINALITY}}}]", SchemaFormatType.PDL));

    public AggregationSpecArray() {
        this(new DataList());
    }

    public AggregationSpecArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AggregationSpecArray(Collection<AggregationSpec> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AggregationSpecArray(DataList data) {
        super(data, SCHEMA, AggregationSpec.class);
    }

    public AggregationSpecArray(AggregationSpec first, AggregationSpec... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static AggregationSpecArray.ProjectionMask createMask() {
        return new AggregationSpecArray.ProjectionMask();
    }

    @Override
    public AggregationSpecArray clone()
        throws CloneNotSupportedException
    {
        AggregationSpecArray __clone = ((AggregationSpecArray) super.clone());
        return __clone;
    }

    @Override
    public AggregationSpecArray copy()
        throws CloneNotSupportedException
    {
        AggregationSpecArray __copy = ((AggregationSpecArray) super.copy());
        return __copy;
    }

    @Override
    protected AggregationSpec coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new AggregationSpec(DataTemplateUtil.castOrThrow(object, DataMap.class)));
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.linkedin.timeseries.AggregationSpec.Fields items() {
            return new com.linkedin.timeseries.AggregationSpec.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.timeseries.AggregationSpec.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public AggregationSpecArray.ProjectionMask withItems(Function<com.linkedin.timeseries.AggregationSpec.ProjectionMask, com.linkedin.timeseries.AggregationSpec.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?AggregationSpec.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

        public AggregationSpecArray.ProjectionMask withItems(MaskMap nestedMask) {
            getDataMap().put("$*", nestedMask.getDataMap());
            return this;
        }

    }

}
