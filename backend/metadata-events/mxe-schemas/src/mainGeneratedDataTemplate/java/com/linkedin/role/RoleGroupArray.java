
package com.linkedin.role;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/role/Actors.pdl.")
public class RoleGroupArray
    extends WrappingArrayTemplate<RoleGroup>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.role/**Provisioned groups of a role*/record RoleGroup{/**Link provisioned corp group for a role*/@Relationship={\"entityTypes\":[\"corpGroup\"],\"name\":\"Has\"}group:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public RoleGroupArray() {
        this(new DataList());
    }

    public RoleGroupArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RoleGroupArray(Collection<RoleGroup> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RoleGroupArray(DataList data) {
        super(data, SCHEMA, RoleGroup.class);
    }

    public RoleGroupArray(RoleGroup first, RoleGroup... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static RoleGroupArray.ProjectionMask createMask() {
        return new RoleGroupArray.ProjectionMask();
    }

    @Override
    public RoleGroupArray clone()
        throws CloneNotSupportedException
    {
        RoleGroupArray __clone = ((RoleGroupArray) super.clone());
        return __clone;
    }

    @Override
    public RoleGroupArray copy()
        throws CloneNotSupportedException
    {
        RoleGroupArray __copy = ((RoleGroupArray) super.copy());
        return __copy;
    }

    @Override
    protected RoleGroup coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new RoleGroup(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.role.RoleGroup.Fields items() {
            return new com.linkedin.role.RoleGroup.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.role.RoleGroup.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public RoleGroupArray.ProjectionMask withItems(Function<com.linkedin.role.RoleGroup.ProjectionMask, com.linkedin.role.RoleGroup.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?RoleGroup.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
