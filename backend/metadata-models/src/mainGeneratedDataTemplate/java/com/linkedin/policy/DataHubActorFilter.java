
package com.linkedin.policy;

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
 * Information used to filter DataHub actors.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/policy/DataHubActorFilter.pdl.")
public class DataHubActorFilter
    extends RecordTemplate
{

    private final static DataHubActorFilter.Fields _fields = new DataHubActorFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Define type of ownership for the policy*/resourceOwnersTypes:optional array[com.linkedin.common.Urn]/**Whether the filter should apply to all users.*/@Searchable.fieldType=\"BOOLEAN\"allUsers:boolean=false/**Whether the filter should apply to all groups.*/@Searchable.fieldType=\"BOOLEAN\"allGroups:boolean=false/**A specific set of roles to apply the policy to (disjunctive).*/@Relationship.`/*`={\"entityTypes\":[\"dataHubRole\"],\"name\":\"IsAssociatedWithRole\"}@Searchable.`/*`.fieldType=\"URN\"roles:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private UrnArray _usersField = null;
    private UrnArray _groupsField = null;
    private Boolean _resourceOwnersField = null;
    private UrnArray _resourceOwnersTypesField = null;
    private Boolean _allUsersField = null;
    private Boolean _allGroupsField = null;
    private UrnArray _rolesField = null;
    private DataHubActorFilter.ChangeListener __changeListener = new DataHubActorFilter.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_ResourceOwners = SCHEMA.getField("resourceOwners");
    private final static Boolean DEFAULT_ResourceOwners;
    private final static RecordDataSchema.Field FIELD_ResourceOwnersTypes = SCHEMA.getField("resourceOwnersTypes");
    private final static RecordDataSchema.Field FIELD_AllUsers = SCHEMA.getField("allUsers");
    private final static Boolean DEFAULT_AllUsers;
    private final static RecordDataSchema.Field FIELD_AllGroups = SCHEMA.getField("allGroups");
    private final static Boolean DEFAULT_AllGroups;
    private final static RecordDataSchema.Field FIELD_Roles = SCHEMA.getField("roles");

    static {
        DEFAULT_ResourceOwners = DataTemplateUtil.coerceBooleanOutput(FIELD_ResourceOwners.getDefault());
        DEFAULT_AllUsers = DataTemplateUtil.coerceBooleanOutput(FIELD_AllUsers.getDefault());
        DEFAULT_AllGroups = DataTemplateUtil.coerceBooleanOutput(FIELD_AllGroups.getDefault());
    }

    public DataHubActorFilter() {
        super(new DataMap(10, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public DataHubActorFilter(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubActorFilter.Fields fields() {
        return _fields;
    }

    public static DataHubActorFilter.ProjectionMask createMask() {
        return new DataHubActorFilter.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for users
     * 
     * @see DataHubActorFilter.Fields#users
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
     * @see DataHubActorFilter.Fields#users
     */
    public void removeUsers() {
        super._map.remove("users");
    }

    /**
     * Getter for users
     * 
     * @see DataHubActorFilter.Fields#users
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
     * @see DataHubActorFilter.Fields#users
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
     * @see DataHubActorFilter.Fields#users
     */
    public DataHubActorFilter setUsers(
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
     * @see DataHubActorFilter.Fields#users
     */
    public DataHubActorFilter setUsers(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field users of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "users", value.data());
            _usersField = value;
        }
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see DataHubActorFilter.Fields#groups
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
     * @see DataHubActorFilter.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see DataHubActorFilter.Fields#groups
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
     * @see DataHubActorFilter.Fields#groups
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
     * @see DataHubActorFilter.Fields#groups
     */
    public DataHubActorFilter setGroups(
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
     * @see DataHubActorFilter.Fields#groups
     */
    public DataHubActorFilter setGroups(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    /**
     * Existence checker for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public boolean hasResourceOwners() {
        if (_resourceOwnersField!= null) {
            return true;
        }
        return super._map.containsKey("resourceOwners");
    }

    /**
     * Remover for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public void removeResourceOwners() {
        super._map.remove("resourceOwners");
    }

    /**
     * Getter for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    @Nullable
    public Boolean isResourceOwners(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isResourceOwners();
            case NULL:
                if (_resourceOwnersField!= null) {
                    return _resourceOwnersField;
                } else {
                    Object __rawValue = super._map.get("resourceOwners");
                    _resourceOwnersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _resourceOwnersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for resourceOwners
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    @Nonnull
    public Boolean isResourceOwners() {
        if (_resourceOwnersField!= null) {
            return _resourceOwnersField;
        } else {
            Object __rawValue = super._map.get("resourceOwners");
            if (__rawValue == null) {
                return DEFAULT_ResourceOwners;
            }
            _resourceOwnersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _resourceOwnersField;
        }
    }

    /**
     * Setter for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public DataHubActorFilter setResourceOwners(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResourceOwners(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field resourceOwners of com.linkedin.policy.DataHubActorFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resourceOwners", value);
                    _resourceOwnersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResourceOwners();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resourceOwners", value);
                    _resourceOwnersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resourceOwners", value);
                    _resourceOwnersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resourceOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public DataHubActorFilter setResourceOwners(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resourceOwners of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resourceOwners", value);
            _resourceOwnersField = value;
        }
        return this;
    }

    /**
     * Setter for resourceOwners
     * 
     * @see DataHubActorFilter.Fields#resourceOwners
     */
    public DataHubActorFilter setResourceOwners(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "resourceOwners", value);
        _resourceOwnersField = value;
        return this;
    }

    /**
     * Existence checker for resourceOwnersTypes
     * 
     * @see DataHubActorFilter.Fields#resourceOwnersTypes
     */
    public boolean hasResourceOwnersTypes() {
        if (_resourceOwnersTypesField!= null) {
            return true;
        }
        return super._map.containsKey("resourceOwnersTypes");
    }

    /**
     * Remover for resourceOwnersTypes
     * 
     * @see DataHubActorFilter.Fields#resourceOwnersTypes
     */
    public void removeResourceOwnersTypes() {
        super._map.remove("resourceOwnersTypes");
    }

    /**
     * Getter for resourceOwnersTypes
     * 
     * @see DataHubActorFilter.Fields#resourceOwnersTypes
     */
    @Nullable
    public UrnArray getResourceOwnersTypes(GetMode mode) {
        return getResourceOwnersTypes();
    }

    /**
     * Getter for resourceOwnersTypes
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubActorFilter.Fields#resourceOwnersTypes
     */
    @Nullable
    public UrnArray getResourceOwnersTypes() {
        if (_resourceOwnersTypesField!= null) {
            return _resourceOwnersTypesField;
        } else {
            Object __rawValue = super._map.get("resourceOwnersTypes");
            _resourceOwnersTypesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _resourceOwnersTypesField;
        }
    }

    /**
     * Setter for resourceOwnersTypes
     * 
     * @see DataHubActorFilter.Fields#resourceOwnersTypes
     */
    public DataHubActorFilter setResourceOwnersTypes(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResourceOwnersTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResourceOwnersTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resourceOwnersTypes", value.data());
                    _resourceOwnersTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resourceOwnersTypes", value.data());
                    _resourceOwnersTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resourceOwnersTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#resourceOwnersTypes
     */
    public DataHubActorFilter setResourceOwnersTypes(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resourceOwnersTypes of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resourceOwnersTypes", value.data());
            _resourceOwnersTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public boolean hasAllUsers() {
        if (_allUsersField!= null) {
            return true;
        }
        return super._map.containsKey("allUsers");
    }

    /**
     * Remover for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public void removeAllUsers() {
        super._map.remove("allUsers");
    }

    /**
     * Getter for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    @Nullable
    public Boolean isAllUsers(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isAllUsers();
            case NULL:
                if (_allUsersField!= null) {
                    return _allUsersField;
                } else {
                    Object __rawValue = super._map.get("allUsers");
                    _allUsersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _allUsersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for allUsers
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubActorFilter.Fields#allUsers
     */
    @Nonnull
    public Boolean isAllUsers() {
        if (_allUsersField!= null) {
            return _allUsersField;
        } else {
            Object __rawValue = super._map.get("allUsers");
            if (__rawValue == null) {
                return DEFAULT_AllUsers;
            }
            _allUsersField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _allUsersField;
        }
    }

    /**
     * Setter for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public DataHubActorFilter setAllUsers(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAllUsers(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field allUsers of com.linkedin.policy.DataHubActorFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allUsers", value);
                    _allUsersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAllUsers();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allUsers", value);
                    _allUsersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "allUsers", value);
                    _allUsersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for allUsers
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#allUsers
     */
    public DataHubActorFilter setAllUsers(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field allUsers of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "allUsers", value);
            _allUsersField = value;
        }
        return this;
    }

    /**
     * Setter for allUsers
     * 
     * @see DataHubActorFilter.Fields#allUsers
     */
    public DataHubActorFilter setAllUsers(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "allUsers", value);
        _allUsersField = value;
        return this;
    }

    /**
     * Existence checker for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public boolean hasAllGroups() {
        if (_allGroupsField!= null) {
            return true;
        }
        return super._map.containsKey("allGroups");
    }

    /**
     * Remover for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public void removeAllGroups() {
        super._map.remove("allGroups");
    }

    /**
     * Getter for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    @Nullable
    public Boolean isAllGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isAllGroups();
            case NULL:
                if (_allGroupsField!= null) {
                    return _allGroupsField;
                } else {
                    Object __rawValue = super._map.get("allGroups");
                    _allGroupsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _allGroupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for allGroups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubActorFilter.Fields#allGroups
     */
    @Nonnull
    public Boolean isAllGroups() {
        if (_allGroupsField!= null) {
            return _allGroupsField;
        } else {
            Object __rawValue = super._map.get("allGroups");
            if (__rawValue == null) {
                return DEFAULT_AllGroups;
            }
            _allGroupsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _allGroupsField;
        }
    }

    /**
     * Setter for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public DataHubActorFilter setAllGroups(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAllGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field allGroups of com.linkedin.policy.DataHubActorFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allGroups", value);
                    _allGroupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAllGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "allGroups", value);
                    _allGroupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "allGroups", value);
                    _allGroupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for allGroups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubActorFilter.Fields#allGroups
     */
    public DataHubActorFilter setAllGroups(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field allGroups of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "allGroups", value);
            _allGroupsField = value;
        }
        return this;
    }

    /**
     * Setter for allGroups
     * 
     * @see DataHubActorFilter.Fields#allGroups
     */
    public DataHubActorFilter setAllGroups(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "allGroups", value);
        _allGroupsField = value;
        return this;
    }

    /**
     * Existence checker for roles
     * 
     * @see DataHubActorFilter.Fields#roles
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
     * @see DataHubActorFilter.Fields#roles
     */
    public void removeRoles() {
        super._map.remove("roles");
    }

    /**
     * Getter for roles
     * 
     * @see DataHubActorFilter.Fields#roles
     */
    @Nullable
    public UrnArray getRoles(GetMode mode) {
        return getRoles();
    }

    /**
     * Getter for roles
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubActorFilter.Fields#roles
     */
    @Nullable
    public UrnArray getRoles() {
        if (_rolesField!= null) {
            return _rolesField;
        } else {
            Object __rawValue = super._map.get("roles");
            _rolesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _rolesField;
        }
    }

    /**
     * Setter for roles
     * 
     * @see DataHubActorFilter.Fields#roles
     */
    public DataHubActorFilter setRoles(
        @Nullable
        UrnArray value, SetMode mode) {
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
     * @see DataHubActorFilter.Fields#roles
     */
    public DataHubActorFilter setRoles(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field roles of com.linkedin.policy.DataHubActorFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "roles", value.data());
            _rolesField = value;
        }
        return this;
    }

    @Override
    public DataHubActorFilter clone()
        throws CloneNotSupportedException
    {
        DataHubActorFilter __clone = ((DataHubActorFilter) super.clone());
        __clone.__changeListener = new DataHubActorFilter.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubActorFilter copy()
        throws CloneNotSupportedException
    {
        DataHubActorFilter __copy = ((DataHubActorFilter) super.copy());
        __copy._resourceOwnersField = null;
        __copy._resourceOwnersTypesField = null;
        __copy._allUsersField = null;
        __copy._allGroupsField = null;
        __copy._rolesField = null;
        __copy._groupsField = null;
        __copy._usersField = null;
        __copy.__changeListener = new DataHubActorFilter.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubActorFilter __objectRef;

        private ChangeListener(DataHubActorFilter reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "resourceOwners":
                    __objectRef._resourceOwnersField = null;
                    break;
                case "resourceOwnersTypes":
                    __objectRef._resourceOwnersTypesField = null;
                    break;
                case "allUsers":
                    __objectRef._allUsersField = null;
                    break;
                case "allGroups":
                    __objectRef._allGroupsField = null;
                    break;
                case "roles":
                    __objectRef._rolesField = null;
                    break;
                case "groups":
                    __objectRef._groupsField = null;
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
         * A specific set of users to apply the policy to (disjunctive)
         * 
         */
        public PathSpec users() {
            return new PathSpec(getPathComponents(), "users");
        }

        /**
         * A specific set of users to apply the policy to (disjunctive)
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

        /**
         * A specific set of groups to apply the policy to (disjunctive)
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * A specific set of groups to apply the policy to (disjunctive)
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
         * Whether the filter should return true for owners of a particular resource.
         * Only applies to policies of type 'Metadata', which have a resource associated with them.
         * 
         */
        public PathSpec resourceOwners() {
            return new PathSpec(getPathComponents(), "resourceOwners");
        }

        /**
         * Define type of ownership for the policy
         * 
         */
        public PathSpec resourceOwnersTypes() {
            return new PathSpec(getPathComponents(), "resourceOwnersTypes");
        }

        /**
         * Define type of ownership for the policy
         * 
         */
        public PathSpec resourceOwnersTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "resourceOwnersTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Whether the filter should apply to all users.
         * 
         */
        public PathSpec allUsers() {
            return new PathSpec(getPathComponents(), "allUsers");
        }

        /**
         * Whether the filter should apply to all groups.
         * 
         */
        public PathSpec allGroups() {
            return new PathSpec(getPathComponents(), "allGroups");
        }

        /**
         * A specific set of roles to apply the policy to (disjunctive).
         * 
         */
        public PathSpec roles() {
            return new PathSpec(getPathComponents(), "roles");
        }

        /**
         * A specific set of roles to apply the policy to (disjunctive).
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


        ProjectionMask() {
            super(10);
        }

        /**
         * A specific set of users to apply the policy to (disjunctive)
         * 
         */
        public DataHubActorFilter.ProjectionMask withUsers() {
            getDataMap().put("users", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A specific set of users to apply the policy to (disjunctive)
         * 
         */
        public DataHubActorFilter.ProjectionMask withUsers(Integer start, Integer count) {
            getDataMap().put("users", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("users").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("users").put("$count", count);
            }
            return this;
        }

        /**
         * A specific set of groups to apply the policy to (disjunctive)
         * 
         */
        public DataHubActorFilter.ProjectionMask withGroups() {
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A specific set of groups to apply the policy to (disjunctive)
         * 
         */
        public DataHubActorFilter.ProjectionMask withGroups(Integer start, Integer count) {
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
         * Whether the filter should return true for owners of a particular resource.
         * Only applies to policies of type 'Metadata', which have a resource associated with them.
         * 
         */
        public DataHubActorFilter.ProjectionMask withResourceOwners() {
            getDataMap().put("resourceOwners", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Define type of ownership for the policy
         * 
         */
        public DataHubActorFilter.ProjectionMask withResourceOwnersTypes() {
            getDataMap().put("resourceOwnersTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Define type of ownership for the policy
         * 
         */
        public DataHubActorFilter.ProjectionMask withResourceOwnersTypes(Integer start, Integer count) {
            getDataMap().put("resourceOwnersTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("resourceOwnersTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("resourceOwnersTypes").put("$count", count);
            }
            return this;
        }

        /**
         * Whether the filter should apply to all users.
         * 
         */
        public DataHubActorFilter.ProjectionMask withAllUsers() {
            getDataMap().put("allUsers", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the filter should apply to all groups.
         * 
         */
        public DataHubActorFilter.ProjectionMask withAllGroups() {
            getDataMap().put("allGroups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A specific set of roles to apply the policy to (disjunctive).
         * 
         */
        public DataHubActorFilter.ProjectionMask withRoles() {
            getDataMap().put("roles", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A specific set of roles to apply the policy to (disjunctive).
         * 
         */
        public DataHubActorFilter.ProjectionMask withRoles(Integer start, Integer count) {
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
