
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Aspect used for associating roles to a dataset or any asset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Access.pdl.")
public class Access
    extends RecordTemplate
{

    private final static Access.Fields _fields = new Access.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Aspect used for associating roles to a dataset or any asset*/@Aspect.name=\"access\"record Access{/**List of Roles which needs to be associated*/roles:optional array[/**Properties of an applied Role. For now, just an Urn*/record RoleAssociation{/**Urn of the External Role*/@Relationship={\"entityTypes\":[\"role\"],\"name\":\"AssociatedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"roles\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Role\",\"hasValuesFieldName\":\"hasRoles\",\"queryByDefault\":false}urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private RoleAssociationArray _rolesField = null;
    private Access.ChangeListener __changeListener = new Access.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Roles = SCHEMA.getField("roles");

    public Access() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Access(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Access.Fields fields() {
        return _fields;
    }

    public static Access.ProjectionMask createMask() {
        return new Access.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for roles
     * 
     * @see Access.Fields#roles
     */
    public boolean hasRoles() {
        if (_rolesField!= null) {
            return true;
        }
        return super._map.containsKey("roles");
    }

    /**
     * Remover for roles
     * 
     * @see Access.Fields#roles
     */
    public void removeRoles() {
        super._map.remove("roles");
    }

    /**
     * Getter for roles
     * 
     * @see Access.Fields#roles
     */
    @Nullable
    public RoleAssociationArray getRoles(GetMode mode) {
        return getRoles();
    }

    /**
     * Getter for roles
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Access.Fields#roles
     */
    @Nullable
    public RoleAssociationArray getRoles() {
        if (_rolesField!= null) {
            return _rolesField;
        } else {
            Object __rawValue = super._map.get("roles");
            _rolesField = ((__rawValue == null)?null:new RoleAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _rolesField;
        }
    }

    /**
     * Setter for roles
     * 
     * @see Access.Fields#roles
     */
    public Access setRoles(
        @Nullable
        RoleAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRoles(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRoles();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "roles", value.data());
                    _rolesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "roles", value.data());
                    _rolesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for roles
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Access.Fields#roles
     */
    public Access setRoles(
        @Nonnull
        RoleAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field roles of com.linkedin.common.Access to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "roles", value.data());
            _rolesField = value;
        }
        return this;
    }

    @Override
    public Access clone()
        throws CloneNotSupportedException
    {
        Access __clone = ((Access) super.clone());
        __clone.__changeListener = new Access.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Access copy()
        throws CloneNotSupportedException
    {
        Access __copy = ((Access) super.copy());
        __copy._rolesField = null;
        __copy.__changeListener = new Access.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Access __objectRef;

        private ChangeListener(Access reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "roles":
                    __objectRef._rolesField = null;
                    break;
            }
        }

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

        /**
         * List of Roles which needs to be associated
         * 
         */
        public com.linkedin.common.RoleAssociationArray.Fields roles() {
            return new com.linkedin.common.RoleAssociationArray.Fields(getPathComponents(), "roles");
        }

        /**
         * List of Roles which needs to be associated
         * 
         */
        public PathSpec roles(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "roles");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.RoleAssociationArray.ProjectionMask _rolesMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * List of Roles which needs to be associated
         * 
         */
        public Access.ProjectionMask withRoles(Function<com.linkedin.common.RoleAssociationArray.ProjectionMask, com.linkedin.common.RoleAssociationArray.ProjectionMask> nestedMask) {
            _rolesMask = nestedMask.apply(((_rolesMask == null)?RoleAssociationArray.createMask():_rolesMask));
            getDataMap().put("roles", _rolesMask.getDataMap());
            return this;
        }

        /**
         * List of Roles which needs to be associated
         * 
         */
        public Access.ProjectionMask withRoles() {
            _rolesMask = null;
            getDataMap().put("roles", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of Roles which needs to be associated
         * 
         */
        public Access.ProjectionMask withRoles(Function<com.linkedin.common.RoleAssociationArray.ProjectionMask, com.linkedin.common.RoleAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _rolesMask = nestedMask.apply(((_rolesMask == null)?RoleAssociationArray.createMask():_rolesMask));
            getDataMap().put("roles", _rolesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("roles").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("roles").put("$count", count);
            }
            return this;
        }

        /**
         * List of Roles which needs to be associated
         * 
         */
        public Access.ProjectionMask withRoles(Integer start, Integer count) {
            _rolesMask = null;
            getDataMap().put("roles", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("roles").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("roles").put("$count", count);
            }
            return this;
        }

    }

}
