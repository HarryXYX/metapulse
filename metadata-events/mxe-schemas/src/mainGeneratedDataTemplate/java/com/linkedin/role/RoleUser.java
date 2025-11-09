
package com.linkedin.role;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Provisioned users of a role
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/role/RoleUser.pdl.")
public class RoleUser
    extends RecordTemplate
{

    private final static RoleUser.Fields _fields = new RoleUser.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.role/**Provisioned users of a role*/record RoleUser{/**Link provisioned corp user for a role*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"Has\"}user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _userField = null;
    private RoleUser.ChangeListener __changeListener = new RoleUser.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_User = SCHEMA.getField("user");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public RoleUser() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public RoleUser(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RoleUser.Fields fields() {
        return _fields;
    }

    public static RoleUser.ProjectionMask createMask() {
        return new RoleUser.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for user
     * 
     * @see RoleUser.Fields#user
     */
    public boolean hasUser() {
        if (_userField!= null) {
            return true;
        }
        return super._map.containsKey("user");
    }

    /**
     * Remover for user
     * 
     * @see RoleUser.Fields#user
     */
    public void removeUser() {
        super._map.remove("user");
    }

    /**
     * Getter for user
     * 
     * @see RoleUser.Fields#user
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUser(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUser();
            case DEFAULT:
            case NULL:
                if (_userField!= null) {
                    return _userField;
                } else {
                    Object __rawValue = super._map.get("user");
                    _userField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _userField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for user
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RoleUser.Fields#user
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUser() {
        if (_userField!= null) {
            return _userField;
        } else {
            Object __rawValue = super._map.get("user");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("user");
            }
            _userField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _userField;
        }
    }

    /**
     * Setter for user
     * 
     * @see RoleUser.Fields#user
     */
    public RoleUser setUser(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUser(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field user of com.linkedin.role.RoleUser");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _userField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUser();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _userField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _userField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for user
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RoleUser.Fields#user
     */
    public RoleUser setUser(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field user of com.linkedin.role.RoleUser to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _userField = value;
        }
        return this;
    }

    @Override
    public RoleUser clone()
        throws CloneNotSupportedException
    {
        RoleUser __clone = ((RoleUser) super.clone());
        __clone.__changeListener = new RoleUser.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RoleUser copy()
        throws CloneNotSupportedException
    {
        RoleUser __copy = ((RoleUser) super.copy());
        __copy._userField = null;
        __copy.__changeListener = new RoleUser.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RoleUser __objectRef;

        private ChangeListener(RoleUser reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "user":
                    __objectRef._userField = null;
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
         * Link provisioned corp user for a role
         * 
         */
        public PathSpec user() {
            return new PathSpec(getPathComponents(), "user");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Link provisioned corp user for a role
         * 
         */
        public RoleUser.ProjectionMask withUser() {
            getDataMap().put("user", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
