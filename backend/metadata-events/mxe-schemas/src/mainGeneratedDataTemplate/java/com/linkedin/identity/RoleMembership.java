
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Carries information about which roles a user or group is assigned to.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/RoleMembership.pdl.")
public class RoleMembership
    extends RecordTemplate
{

    private final static RoleMembership.Fields _fields = new RoleMembership.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Carries information about which roles a user or group is assigned to.*/@Aspect.name=\"roleMembership\"record RoleMembership{@Relationship.`/*`={\"entityTypes\":[\"dataHubRole\"],\"name\":\"IsMemberOfRole\"}roles:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}", SchemaFormatType.PDL));
    private UrnArray _rolesField = null;
    private RoleMembership.ChangeListener __changeListener = new RoleMembership.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Roles = SCHEMA.getField("roles");

    public RoleMembership() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public RoleMembership(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RoleMembership.Fields fields() {
        return _fields;
    }

    public static RoleMembership.ProjectionMask createMask() {
        return new RoleMembership.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for roles
     * 
     * @see RoleMembership.Fields#roles
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
     * @see RoleMembership.Fields#roles
     */
    public void removeRoles() {
        super._map.remove("roles");
    }

    /**
     * Getter for roles
     * 
     * @see RoleMembership.Fields#roles
     */
    @Nullable
    public UrnArray getRoles(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRoles();
            case DEFAULT:
            case NULL:
                if (_rolesField!= null) {
                    return _rolesField;
                } else {
                    Object __rawValue = super._map.get("roles");
                    _rolesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _rolesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for roles
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RoleMembership.Fields#roles
     */
    @Nonnull
    public UrnArray getRoles() {
        if (_rolesField!= null) {
            return _rolesField;
        } else {
            Object __rawValue = super._map.get("roles");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("roles");
            }
            _rolesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _rolesField;
        }
    }

    /**
     * Setter for roles
     * 
     * @see RoleMembership.Fields#roles
     */
    public RoleMembership setRoles(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRoles(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field roles of com.linkedin.identity.RoleMembership");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "roles", value.data());
                    _rolesField = value;
                }
                break;
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
     * @see RoleMembership.Fields#roles
     */
    public RoleMembership setRoles(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field roles of com.linkedin.identity.RoleMembership to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "roles", value.data());
            _rolesField = value;
        }
        return this;
    }

    @Override
    public RoleMembership clone()
        throws CloneNotSupportedException
    {
        RoleMembership __clone = ((RoleMembership) super.clone());
        __clone.__changeListener = new RoleMembership.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RoleMembership copy()
        throws CloneNotSupportedException
    {
        RoleMembership __copy = ((RoleMembership) super.copy());
        __copy._rolesField = null;
        __copy.__changeListener = new RoleMembership.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RoleMembership __objectRef;

        private ChangeListener(RoleMembership reference) {
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

        public PathSpec roles() {
            return new PathSpec(getPathComponents(), "roles");
        }

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


        ProjectionMask() {
            super(2);
        }

        public RoleMembership.ProjectionMask withRoles() {
            getDataMap().put("roles", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RoleMembership.ProjectionMask withRoles(Integer start, Integer count) {
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
