
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Access.pdl.")
public class RoleAssociationArray
    extends WrappingArrayTemplate<RoleAssociation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Properties of an applied Role. For now, just an Urn*/record RoleAssociation{/**Urn of the External Role*/@Relationship={\"entityTypes\":[\"role\"],\"name\":\"AssociatedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"roles\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Role\",\"hasValuesFieldName\":\"hasRoles\",\"queryByDefault\":false}urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]", SchemaFormatType.PDL));

    public RoleAssociationArray() {
        this(new DataList());
    }

    public RoleAssociationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RoleAssociationArray(Collection<RoleAssociation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RoleAssociationArray(DataList data) {
        super(data, SCHEMA, RoleAssociation.class);
    }

    public RoleAssociationArray(RoleAssociation first, RoleAssociation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static RoleAssociationArray.ProjectionMask createMask() {
        return new RoleAssociationArray.ProjectionMask();
    }

    @Override
    public RoleAssociationArray clone()
        throws CloneNotSupportedException
    {
        RoleAssociationArray __clone = ((RoleAssociationArray) super.clone());
        return __clone;
    }

    @Override
    public RoleAssociationArray copy()
        throws CloneNotSupportedException
    {
        RoleAssociationArray __copy = ((RoleAssociationArray) super.copy());
        return __copy;
    }

    @Override
    protected RoleAssociation coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new RoleAssociation(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.RoleAssociation.Fields items() {
            return new com.linkedin.common.RoleAssociation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.RoleAssociation.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public RoleAssociationArray.ProjectionMask withItems(Function<com.linkedin.common.RoleAssociation.ProjectionMask, com.linkedin.common.RoleAssociation.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?RoleAssociation.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
