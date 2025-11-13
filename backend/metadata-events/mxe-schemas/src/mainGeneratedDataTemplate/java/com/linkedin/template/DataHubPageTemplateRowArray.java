
package com.linkedin.template;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/template/DataHubPageTemplateProperties.pdl.")
public class DataHubPageTemplateRowArray
    extends WrappingArrayTemplate<DataHubPageTemplateRow>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.template/**A row of modules contained in a template*/record DataHubPageTemplateRow{/**The modules that exist in this template row*/modules:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}}]", SchemaFormatType.PDL));

    public DataHubPageTemplateRowArray() {
        this(new DataList());
    }

    public DataHubPageTemplateRowArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataHubPageTemplateRowArray(Collection<DataHubPageTemplateRow> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataHubPageTemplateRowArray(DataList data) {
        super(data, SCHEMA, DataHubPageTemplateRow.class);
    }

    public DataHubPageTemplateRowArray(DataHubPageTemplateRow first, DataHubPageTemplateRow... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataHubPageTemplateRowArray.ProjectionMask createMask() {
        return new DataHubPageTemplateRowArray.ProjectionMask();
    }

    @Override
    public DataHubPageTemplateRowArray clone()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateRowArray __clone = ((DataHubPageTemplateRowArray) super.clone());
        return __clone;
    }

    @Override
    public DataHubPageTemplateRowArray copy()
        throws CloneNotSupportedException
    {
        DataHubPageTemplateRowArray __copy = ((DataHubPageTemplateRowArray) super.copy());
        return __copy;
    }

    @Override
    protected DataHubPageTemplateRow coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataHubPageTemplateRow(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.template.DataHubPageTemplateRow.Fields items() {
            return new com.linkedin.template.DataHubPageTemplateRow.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.template.DataHubPageTemplateRow.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataHubPageTemplateRowArray.ProjectionMask withItems(Function<com.linkedin.template.DataHubPageTemplateRow.ProjectionMask, com.linkedin.template.DataHubPageTemplateRow.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataHubPageTemplateRow.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
