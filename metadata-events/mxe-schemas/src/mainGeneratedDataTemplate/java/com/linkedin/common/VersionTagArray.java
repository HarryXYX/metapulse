
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/VersionProperties.pdl.")
public class VersionTagArray
    extends WrappingArrayTemplate<VersionTag>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}]", SchemaFormatType.PDL));

    public VersionTagArray() {
        this(new DataList());
    }

    public VersionTagArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public VersionTagArray(Collection<VersionTag> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public VersionTagArray(DataList data) {
        super(data, SCHEMA, VersionTag.class);
    }

    public VersionTagArray(VersionTag first, VersionTag... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static VersionTagArray.ProjectionMask createMask() {
        return new VersionTagArray.ProjectionMask();
    }

    @Override
    public VersionTagArray clone()
        throws CloneNotSupportedException
    {
        VersionTagArray __clone = ((VersionTagArray) super.clone());
        return __clone;
    }

    @Override
    public VersionTagArray copy()
        throws CloneNotSupportedException
    {
        VersionTagArray __copy = ((VersionTagArray) super.copy());
        return __copy;
    }

    @Override
    protected VersionTag coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new VersionTag(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.VersionTag.Fields items() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.VersionTag.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public VersionTagArray.ProjectionMask withItems(Function<com.linkedin.common.VersionTag.ProjectionMask, com.linkedin.common.VersionTag.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?VersionTag.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
