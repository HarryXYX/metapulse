
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/role/Actors.pdl.")
public class RoleUserArray
    extends WrappingArrayTemplate<RoleUser>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.role/**Provisioned users of a role*/record RoleUser{/**Link provisioned corp user for a role*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"Has\"}user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public RoleUserArray() {
        this(new DataList());
    }

    public RoleUserArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RoleUserArray(Collection<RoleUser> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RoleUserArray(DataList data) {
        super(data, SCHEMA, RoleUser.class);
    }

    public RoleUserArray(RoleUser first, RoleUser... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static RoleUserArray.ProjectionMask createMask() {
        return new RoleUserArray.ProjectionMask();
    }

    @Override
    public RoleUserArray clone()
        throws CloneNotSupportedException
    {
        RoleUserArray __clone = ((RoleUserArray) super.clone());
        return __clone;
    }

    @Override
    public RoleUserArray copy()
        throws CloneNotSupportedException
    {
        RoleUserArray __copy = ((RoleUserArray) super.copy());
        return __copy;
    }

    @Override
    protected RoleUser coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new RoleUser(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.role.RoleUser.Fields items() {
            return new com.linkedin.role.RoleUser.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.role.RoleUser.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public RoleUserArray.ProjectionMask withItems(Function<com.linkedin.role.RoleUser.ProjectionMask, com.linkedin.role.RoleUser.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?RoleUser.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
