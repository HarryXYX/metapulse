
package com.linkedin.form;

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
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/form/FormActorAssignment.pdl.")
public class FormActorAssignment
    extends RecordTemplate
{

    private final static FormActorAssignment.Fields _fields = new FormActorAssignment.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.form,record FormActorAssignment{/**Whether the form should be assigned to the owners of assets that it is applied to.\nThis is the default.*/@Searchable={\"fieldName\":\"isOwnershipForm\",\"fieldType\":\"BOOLEAN\"}owners:boolean=true/**Optional: Specific set of groups that are targeted by this form assignment.*/@Searchable.`/*`={\"fieldName\":\"assignedGroups\",\"fieldType\":\"URN\"}groups:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Optional: Specific set of users that are targeted by this form assignment.*/@Searchable.`/*`={\"fieldName\":\"assignedUsers\",\"fieldType\":\"URN\"}users:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private Boolean _ownersField = null;
    private UrnArray _groupsField = null;
    private UrnArray _usersField = null;
    private FormActorAssignment.ChangeListener __changeListener = new FormActorAssignment.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static Boolean DEFAULT_Owners;
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");

    static {
        DEFAULT_Owners = DataTemplateUtil.coerceBooleanOutput(FIELD_Owners.getDefault());
    }

    public FormActorAssignment() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FormActorAssignment(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormActorAssignment.Fields fields() {
        return _fields;
    }

    public static FormActorAssignment.ProjectionMask createMask() {
        return new FormActorAssignment.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for owners
     * 
     * @see FormActorAssignment.Fields#owners
     */
    public boolean hasOwners() {
        if (_ownersField!= null) {
            return true;
        }
        return super._map.containsKey("owners");
    }

    /**
     * Remover for owners
     * 
     * @see FormActorAssignment.Fields#owners
     */
    public void removeOwners() {
        super._map.remove("owners");
    }

    /**
     * Getter for owners
     * 
     * @see FormActorAssignment.Fields#owners
     */
    @Nullable
    public Boolean isOwners(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isOwners();
            case NULL:
                if (_ownersField!= null) {
                    return _ownersField;
                } else {
                    Object __rawValue = super._map.get("owners");
                    _ownersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _ownersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormActorAssignment.Fields#owners
     */
    @Nonnull
    public Boolean isOwners() {
        if (_ownersField!= null) {
            return _ownersField;
        } else {
            Object __rawValue = super._map.get("owners");
            if (__rawValue == null) {
                return DEFAULT_Owners;
            }
            _ownersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _ownersField;
        }
    }

    /**
     * Setter for owners
     * 
     * @see FormActorAssignment.Fields#owners
     */
    public FormActorAssignment setOwners(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOwners(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field owners of com.linkedin.form.FormActorAssignment");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "owners", value);
                    _ownersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOwners();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "owners", value);
                    _ownersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "owners", value);
                    _ownersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormActorAssignment.Fields#owners
     */
    public FormActorAssignment setOwners(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field owners of com.linkedin.form.FormActorAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "owners", value);
            _ownersField = value;
        }
        return this;
    }

    /**
     * Setter for owners
     * 
     * @see FormActorAssignment.Fields#owners
     */
    public FormActorAssignment setOwners(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "owners", value);
        _ownersField = value;
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see FormActorAssignment.Fields#groups
     */
    public boolean hasGroups() {
        if (_groupsField!= null) {
            return true;
        }
        return super._map.containsKey("groups");
    }

    /**
     * Remover for groups
     * 
     * @see FormActorAssignment.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see FormActorAssignment.Fields#groups
     */
    @Nullable
    public UrnArray getGroups(GetMode mode) {
        return getGroups();
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormActorAssignment.Fields#groups
     */
    @Nullable
    public UrnArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            _groupsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see FormActorAssignment.Fields#groups
     */
    public FormActorAssignment setGroups(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormActorAssignment.Fields#groups
     */
    public FormActorAssignment setGroups(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.form.FormActorAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    /**
     * Existence checker for users
     * 
     * @see FormActorAssignment.Fields#users
     */
    public boolean hasUsers() {
        if (_usersField!= null) {
            return true;
        }
        return super._map.containsKey("users");
    }

    /**
     * Remover for users
     * 
     * @see FormActorAssignment.Fields#users
     */
    public void removeUsers() {
        super._map.remove("users");
    }

    /**
     * Getter for users
     * 
     * @see FormActorAssignment.Fields#users
     */
    @Nullable
    public UrnArray getUsers(GetMode mode) {
        return getUsers();
    }

    /**
     * Getter for users
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormActorAssignment.Fields#users
     */
    @Nullable
    public UrnArray getUsers() {
        if (_usersField!= null) {
            return _usersField;
        } else {
            Object __rawValue = super._map.get("users");
            _usersField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _usersField;
        }
    }

    /**
     * Setter for users
     * 
     * @see FormActorAssignment.Fields#users
     */
    public FormActorAssignment setUsers(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUsers(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUsers();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "users", value.data());
                    _usersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "users", value.data());
                    _usersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for users
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormActorAssignment.Fields#users
     */
    public FormActorAssignment setUsers(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field users of com.linkedin.form.FormActorAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "users", value.data());
            _usersField = value;
        }
        return this;
    }

    @Override
    public FormActorAssignment clone()
        throws CloneNotSupportedException
    {
        FormActorAssignment __clone = ((FormActorAssignment) super.clone());
        __clone.__changeListener = new FormActorAssignment.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormActorAssignment copy()
        throws CloneNotSupportedException
    {
        FormActorAssignment __copy = ((FormActorAssignment) super.copy());
        __copy._groupsField = null;
        __copy._ownersField = null;
        __copy._usersField = null;
        __copy.__changeListener = new FormActorAssignment.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormActorAssignment __objectRef;

        private ChangeListener(FormActorAssignment reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "groups":
                    __objectRef._groupsField = null;
                    break;
                case "owners":
                    __objectRef._ownersField = null;
                    break;
                case "users":
                    __objectRef._usersField = null;
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
         * Whether the form should be assigned to the owners of assets that it is applied to.
         * This is the default.
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * Optional: Specific set of groups that are targeted by this form assignment.
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * Optional: Specific set of groups that are targeted by this form assignment.
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Optional: Specific set of users that are targeted by this form assignment.
         * 
         */
        public PathSpec users() {
            return new PathSpec(getPathComponents(), "users");
        }

        /**
         * Optional: Specific set of users that are targeted by this form assignment.
         * 
         */
        public PathSpec users(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "users");
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
            super(4);
        }

        /**
         * Whether the form should be assigned to the owners of assets that it is applied to.
         * This is the default.
         * 
         */
        public FormActorAssignment.ProjectionMask withOwners() {
            getDataMap().put("owners", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional: Specific set of groups that are targeted by this form assignment.
         * 
         */
        public FormActorAssignment.ProjectionMask withGroups() {
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional: Specific set of groups that are targeted by this form assignment.
         * 
         */
        public FormActorAssignment.ProjectionMask withGroups(Integer start, Integer count) {
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * Optional: Specific set of users that are targeted by this form assignment.
         * 
         */
        public FormActorAssignment.ProjectionMask withUsers() {
            getDataMap().put("users", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional: Specific set of users that are targeted by this form assignment.
         * 
         */
        public FormActorAssignment.ProjectionMask withUsers(Integer start, Integer count) {
            getDataMap().put("users", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("users").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("users").put("$count", count);
            }
            return this;
        }

    }

}
