
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/browse/BrowseResultV2.pdl.")
public class BrowseResultGroupV2Array
    extends WrappingArrayTemplate<BrowseResultGroupV2>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.browse/**The model for the result of a browse query*/record BrowseResultGroupV2{/**Name of the group*/name:string/**Urn of the group if this is an entity*/urn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of entities that can be reached from this path*/count:long/**Whether or not this group has any sub-groups underneath it*/hasSubGroups:boolean}}]", SchemaFormatType.PDL));

    public BrowseResultGroupV2Array() {
        this(new DataList());
    }

    public BrowseResultGroupV2Array(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public BrowseResultGroupV2Array(Collection<BrowseResultGroupV2> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public BrowseResultGroupV2Array(DataList data) {
        super(data, SCHEMA, BrowseResultGroupV2 .class);
    }

    public BrowseResultGroupV2Array(BrowseResultGroupV2 first, BrowseResultGroupV2 ... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static BrowseResultGroupV2Array.ProjectionMask createMask() {
        return new BrowseResultGroupV2Array.ProjectionMask();
    }

    @Override
    public BrowseResultGroupV2Array clone()
        throws CloneNotSupportedException
    {
        BrowseResultGroupV2Array __clone = ((BrowseResultGroupV2Array) super.clone());
        return __clone;
    }

    @Override
    public BrowseResultGroupV2Array copy()
        throws CloneNotSupportedException
    {
        BrowseResultGroupV2Array __copy = ((BrowseResultGroupV2Array) super.copy());
        return __copy;
    }

    @Override
    protected BrowseResultGroupV2 coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new BrowseResultGroupV2(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.browse.BrowseResultGroupV2.Fields items() {
            return new com.linkedin.metadata.browse.BrowseResultGroupV2.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.browse.BrowseResultGroupV2.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public BrowseResultGroupV2Array.ProjectionMask withItems(Function<com.linkedin.metadata.browse.BrowseResultGroupV2.ProjectionMask, com.linkedin.metadata.browse.BrowseResultGroupV2.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?BrowseResultGroupV2 .createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
