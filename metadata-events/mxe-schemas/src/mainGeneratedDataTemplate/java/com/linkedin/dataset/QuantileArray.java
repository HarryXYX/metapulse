
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class QuantileArray
    extends WrappingArrayTemplate<Quantile>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset,record Quantile{quantile:string,value:string}}]", SchemaFormatType.PDL));

    public QuantileArray() {
        this(new DataList());
    }

    public QuantileArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public QuantileArray(Collection<Quantile> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public QuantileArray(DataList data) {
        super(data, SCHEMA, Quantile.class);
    }

    public QuantileArray(Quantile first, Quantile... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static QuantileArray.ProjectionMask createMask() {
        return new QuantileArray.ProjectionMask();
    }

    @Override
    public QuantileArray clone()
        throws CloneNotSupportedException
    {
        QuantileArray __clone = ((QuantileArray) super.clone());
        return __clone;
    }

    @Override
    public QuantileArray copy()
        throws CloneNotSupportedException
    {
        QuantileArray __copy = ((QuantileArray) super.copy());
        return __copy;
    }

    @Override
    protected Quantile coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new Quantile(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dataset.Quantile.Fields items() {
            return new com.linkedin.dataset.Quantile.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.Quantile.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public QuantileArray.ProjectionMask withItems(Function<com.linkedin.dataset.Quantile.ProjectionMask, com.linkedin.dataset.Quantile.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?Quantile.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
