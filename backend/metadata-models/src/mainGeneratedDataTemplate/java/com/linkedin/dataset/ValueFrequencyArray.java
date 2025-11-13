
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class ValueFrequencyArray
    extends WrappingArrayTemplate<ValueFrequency>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset,record ValueFrequency{value:string,frequency:long}}]", SchemaFormatType.PDL));

    public ValueFrequencyArray() {
        this(new DataList());
    }

    public ValueFrequencyArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ValueFrequencyArray(Collection<ValueFrequency> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ValueFrequencyArray(DataList data) {
        super(data, SCHEMA, ValueFrequency.class);
    }

    public ValueFrequencyArray(ValueFrequency first, ValueFrequency... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ValueFrequencyArray.ProjectionMask createMask() {
        return new ValueFrequencyArray.ProjectionMask();
    }

    @Override
    public ValueFrequencyArray clone()
        throws CloneNotSupportedException
    {
        ValueFrequencyArray __clone = ((ValueFrequencyArray) super.clone());
        return __clone;
    }

    @Override
    public ValueFrequencyArray copy()
        throws CloneNotSupportedException
    {
        ValueFrequencyArray __copy = ((ValueFrequencyArray) super.copy());
        return __copy;
    }

    @Override
    protected ValueFrequency coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new ValueFrequency(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dataset.ValueFrequency.Fields items() {
            return new com.linkedin.dataset.ValueFrequency.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.ValueFrequency.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public ValueFrequencyArray.ProjectionMask withItems(Function<com.linkedin.dataset.ValueFrequency.ProjectionMask, com.linkedin.dataset.ValueFrequency.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?ValueFrequency.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
