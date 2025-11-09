
package com.linkedin.metadata.browse;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResult.pdl.")
public class BrowseResultEntityArray
    extends WrappingArrayTemplate<BrowseResultEntity>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.browse/**Data model for an entity returned as part of a browse query*/record BrowseResultEntity{/**Name of the entity*/name:optional string/**URN of the entity*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public BrowseResultEntityArray() {
        this(new DataList());
    }

    public BrowseResultEntityArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public BrowseResultEntityArray(Collection<BrowseResultEntity> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public BrowseResultEntityArray(DataList data) {
        super(data, SCHEMA, BrowseResultEntity.class);
    }

    public BrowseResultEntityArray(BrowseResultEntity first, BrowseResultEntity... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static BrowseResultEntityArray.ProjectionMask createMask() {
        return new BrowseResultEntityArray.ProjectionMask();
    }

    @Override
    public BrowseResultEntityArray clone()
        throws CloneNotSupportedException
    {
        BrowseResultEntityArray __clone = ((BrowseResultEntityArray) super.clone());
        return __clone;
    }

    @Override
    public BrowseResultEntityArray copy()
        throws CloneNotSupportedException
    {
        BrowseResultEntityArray __copy = ((BrowseResultEntityArray) super.copy());
        return __copy;
    }

    @Override
    protected BrowseResultEntity coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new BrowseResultEntity(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.browse.BrowseResultEntity.Fields items() {
            return new com.linkedin.metadata.browse.BrowseResultEntity.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.browse.BrowseResultEntity.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public BrowseResultEntityArray.ProjectionMask withItems(Function<com.linkedin.metadata.browse.BrowseResultEntity.ProjectionMask, com.linkedin.metadata.browse.BrowseResultEntity.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?BrowseResultEntity.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
