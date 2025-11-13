
package com.linkedin.metadata.query;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/BrowseResultMetadata.pdl.")
public class BrowseResultGroupArray
    extends WrappingArrayTemplate<BrowseResultGroup>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.query,record BrowseResultGroup{/**Name of the group*/name:string/**Number of entities that can be reached from this path*/count:long}}]", SchemaFormatType.PDL));

    public BrowseResultGroupArray() {
        this(new DataList());
    }

    public BrowseResultGroupArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public BrowseResultGroupArray(Collection<BrowseResultGroup> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public BrowseResultGroupArray(DataList data) {
        super(data, SCHEMA, BrowseResultGroup.class);
    }

    public BrowseResultGroupArray(BrowseResultGroup first, BrowseResultGroup... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static BrowseResultGroupArray.ProjectionMask createMask() {
        return new BrowseResultGroupArray.ProjectionMask();
    }

    @Override
    public BrowseResultGroupArray clone()
        throws CloneNotSupportedException
    {
        BrowseResultGroupArray __clone = ((BrowseResultGroupArray) super.clone());
        return __clone;
    }

    @Override
    public BrowseResultGroupArray copy()
        throws CloneNotSupportedException
    {
        BrowseResultGroupArray __copy = ((BrowseResultGroupArray) super.copy());
        return __copy;
    }

    @Override
    protected BrowseResultGroup coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new BrowseResultGroup(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.query.BrowseResultGroup.Fields items() {
            return new com.linkedin.metadata.query.BrowseResultGroup.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.BrowseResultGroup.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public BrowseResultGroupArray.ProjectionMask withItems(Function<com.linkedin.metadata.query.BrowseResultGroup.ProjectionMask, com.linkedin.metadata.query.BrowseResultGroup.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?BrowseResultGroup.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
