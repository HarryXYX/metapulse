
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/timeseries/TimeseriesIndicesSizesResult.pdl.")
public class TimeseriesIndexSizeResultArray
    extends WrappingArrayTemplate<TimeseriesIndexSizeResult>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.timeseries/**Encapsulates the response of the getIndexSizes API*/record TimeseriesIndexSizeResult{/**Name of the index*/indexName:string/**Name of the entity associated with the index*/entityName:string/**Name of the aspect associated with the index*/aspectName:string/**Size*/@deprecated=\"use sizeInMb instead\"sizeMb:float=0.0,sizeInMb:double=0.0}}]", SchemaFormatType.PDL));

    public TimeseriesIndexSizeResultArray() {
        this(new DataList());
    }

    public TimeseriesIndexSizeResultArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public TimeseriesIndexSizeResultArray(Collection<TimeseriesIndexSizeResult> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public TimeseriesIndexSizeResultArray(DataList data) {
        super(data, SCHEMA, TimeseriesIndexSizeResult.class);
    }

    public TimeseriesIndexSizeResultArray(TimeseriesIndexSizeResult first, TimeseriesIndexSizeResult... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static TimeseriesIndexSizeResultArray.ProjectionMask createMask() {
        return new TimeseriesIndexSizeResultArray.ProjectionMask();
    }

    @Override
    public TimeseriesIndexSizeResultArray clone()
        throws CloneNotSupportedException
    {
        TimeseriesIndexSizeResultArray __clone = ((TimeseriesIndexSizeResultArray) super.clone());
        return __clone;
    }

    @Override
    public TimeseriesIndexSizeResultArray copy()
        throws CloneNotSupportedException
    {
        TimeseriesIndexSizeResultArray __copy = ((TimeseriesIndexSizeResultArray) super.copy());
        return __copy;
    }

    @Override
    protected TimeseriesIndexSizeResult coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new TimeseriesIndexSizeResult(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.timeseries.TimeseriesIndexSizeResult.Fields items() {
            return new com.linkedin.timeseries.TimeseriesIndexSizeResult.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.timeseries.TimeseriesIndexSizeResult.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public TimeseriesIndexSizeResultArray.ProjectionMask withItems(Function<com.linkedin.timeseries.TimeseriesIndexSizeResult.ProjectionMask, com.linkedin.timeseries.TimeseriesIndexSizeResult.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?TimeseriesIndexSizeResult.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
