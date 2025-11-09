
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/BrowsePathsV2.pdl.")
public class BrowsePathEntryArray
    extends WrappingArrayTemplate<BrowsePathEntry>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]", SchemaFormatType.PDL));

    public BrowsePathEntryArray() {
        this(new DataList());
    }

    public BrowsePathEntryArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public BrowsePathEntryArray(Collection<BrowsePathEntry> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public BrowsePathEntryArray(DataList data) {
        super(data, SCHEMA, BrowsePathEntry.class);
    }

    public BrowsePathEntryArray(BrowsePathEntry first, BrowsePathEntry... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static BrowsePathEntryArray.ProjectionMask createMask() {
        return new BrowsePathEntryArray.ProjectionMask();
    }

    @Override
    public BrowsePathEntryArray clone()
        throws CloneNotSupportedException
    {
        BrowsePathEntryArray __clone = ((BrowsePathEntryArray) super.clone());
        return __clone;
    }

    @Override
    public BrowsePathEntryArray copy()
        throws CloneNotSupportedException
    {
        BrowsePathEntryArray __copy = ((BrowsePathEntryArray) super.copy());
        return __copy;
    }

    @Override
    protected BrowsePathEntry coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new BrowsePathEntry(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.BrowsePathEntry.Fields items() {
            return new com.linkedin.common.BrowsePathEntry.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.BrowsePathEntry.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public BrowsePathEntryArray.ProjectionMask withItems(Function<com.linkedin.common.BrowsePathEntry.ProjectionMask, com.linkedin.common.BrowsePathEntry.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?BrowsePathEntry.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
