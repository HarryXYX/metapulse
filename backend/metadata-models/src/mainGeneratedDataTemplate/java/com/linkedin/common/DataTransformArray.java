
package com.linkedin.common;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/DataTransformLogic.pdl.")
public class DataTransformArray
    extends WrappingArrayTemplate<DataTransform>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Information about a transformation. It may be a query,*/record DataTransform{/**The data transform may be defined by a query statement*/queryStatement:optional{namespace com.linkedin.query/**A query statement against one or more data assets.*/record QueryStatement{/**The query text*/value:string/**The language of the Query, e.g. SQL.*/language:enum QueryLanguage{/**A SQL Query*/SQL/**Unknown query language*/UNKNOWN}=\"SQL\"}}}}]", SchemaFormatType.PDL));

    public DataTransformArray() {
        this(new DataList());
    }

    public DataTransformArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataTransformArray(Collection<DataTransform> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataTransformArray(DataList data) {
        super(data, SCHEMA, DataTransform.class);
    }

    public DataTransformArray(DataTransform first, DataTransform... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataTransformArray.ProjectionMask createMask() {
        return new DataTransformArray.ProjectionMask();
    }

    @Override
    public DataTransformArray clone()
        throws CloneNotSupportedException
    {
        DataTransformArray __clone = ((DataTransformArray) super.clone());
        return __clone;
    }

    @Override
    public DataTransformArray copy()
        throws CloneNotSupportedException
    {
        DataTransformArray __copy = ((DataTransformArray) super.copy());
        return __copy;
    }

    @Override
    protected DataTransform coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataTransform(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.DataTransform.Fields items() {
            return new com.linkedin.common.DataTransform.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.DataTransform.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataTransformArray.ProjectionMask withItems(Function<com.linkedin.common.DataTransform.ProjectionMask, com.linkedin.common.DataTransform.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataTransform.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
