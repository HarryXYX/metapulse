
package com.linkedin.role;

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
 * Provisioned users and groups of a role
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/role/Actors.pdl.")
public class Actors
    extends RecordTemplate
{

    private final static Actors.Fields _fields = new Actors.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.role/**Provisioned users and groups of a role*/@Aspect.name=\"actors\"record Actors{/**List of provisioned users of a role*/users:optional array[/**Provisioned users of a role*/record RoleUser{/**Link provisioned corp user for a role*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"Has\"}user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]/**List of provisioned groups of a role*/groups:optional array[/**Provisioned groups of a role*/record RoleGroup{/**Link provisioned corp group for a role*/@Relationship={\"entityTypes\":[\"corpGroup\"],\"name\":\"Has\"}group:com.linkedin.common.Urn}]}", SchemaFormatType.PDL));
    private RoleUserArray _usersField = null;
    private RoleGroupArray _groupsField = null;
    private Actors.ChangeListener __changeListener = new Actors.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");

    public Actors() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public Actors(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Actors.Fields fields() {
        return _fields;
    }

    public static Actors.ProjectionMask createMask() {
        return new Actors.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for users
     * 
     * @see Actors.Fields#users
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
     * @see Actors.Fields#users
     */
    public void removeUsers() {
        super._map.remove("users");
    }

    /**
     * Getter for users
     * 
     * @see Actors.Fields#users
     */
    @Nullable
    public RoleUserArray getUsers(GetMode mode) {
        return getUsers();
    }

    /**
     * Getter for users
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Actors.Fields#users
     */
    @Nullable
    public RoleUserArray getUsers() {
        if (_usersField!= null) {
            return _usersField;
        } else {
            Object __rawValue = super._map.get("users");
            _usersField = ((__rawValue == null)?null:new RoleUserArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _usersField;
        }
    }

    /**
     * Setter for users
     * 
     * @see Actors.Fields#users
     */
    public Actors setUsers(
        @Nullable
        RoleUserArray value, SetMode mode) {
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
     * @see Actors.Fields#users
     */
    public Actors setUsers(
        @Nonnull
        RoleUserArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field users of com.linkedin.role.Actors to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "users", value.data());
            _usersField = value;
        }
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see Actors.Fields#groups
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
     * @see Actors.Fields#groups
     */
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see Actors.Fields#groups
     */
    @Nullable
    public RoleGroupArray getGroups(GetMode mode) {
        return getGroups();
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Actors.Fields#groups
     */
    @Nullable
    public RoleGroupArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            _groupsField = ((__rawValue == null)?null:new RoleGroupArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see Actors.Fields#groups
     */
    public Actors setGroups(
        @Nullable
        RoleGroupArray value, SetMode mode) {
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
     * @see Actors.Fields#groups
     */
    public Actors setGroups(
        @Nonnull
        RoleGroupArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.role.Actors to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    @Override
    public Actors clone()
        throws CloneNotSupportedException
    {
        Actors __clone = ((Actors) super.clone());
        __clone.__changeListener = new Actors.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Actors copy()
        throws CloneNotSupportedException
    {
        Actors __copy = ((Actors) super.copy());
        __copy._groupsField = null;
        __copy._usersField = null;
        __copy.__changeListener = new Actors.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Actors __objectRef;

        private ChangeListener(Actors reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * List of provisioned users of a role
         * 
         */
        public com.linkedin.role.RoleUserArray.Fields users() {
            return new com.linkedin.role.RoleUserArray.Fields(getPathComponents(), "users");
        }

        /**
         * List of provisioned users of a role
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
         * List of provisioned groups of a role
         * 
         */
        public com.linkedin.role.RoleGroupArray.Fields groups() {
            return new com.linkedin.role.RoleGroupArray.Fields(getPathComponents(), "groups");
        }

        /**
         * List of provisioned groups of a role
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

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.role.RoleUserArray.ProjectionMask _usersMask;
        private com.linkedin.role.RoleGroupArray.ProjectionMask _groupsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * List of provisioned users of a role
         * 
         */
        public Actors.ProjectionMask withUsers(Function<com.linkedin.role.RoleUserArray.ProjectionMask, com.linkedin.role.RoleUserArray.ProjectionMask> nestedMask) {
            _usersMask = nestedMask.apply(((_usersMask == null)?RoleUserArray.createMask():_usersMask));
            getDataMap().put("users", _usersMask.getDataMap());
            return this;
        }

        /**
         * List of provisioned users of a role
         * 
         */
        public Actors.ProjectionMask withUsers() {
            _usersMask = null;
            getDataMap().put("users", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of provisioned users of a role
         * 
         */
        public Actors.ProjectionMask withUsers(Function<com.linkedin.role.RoleUserArray.ProjectionMask, com.linkedin.role.RoleUserArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _usersMask = nestedMask.apply(((_usersMask == null)?RoleUserArray.createMask():_usersMask));
            getDataMap().put("users", _usersMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("users").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("users").put("$count", count);
            }
            return this;
        }

        /**
         * List of provisioned users of a role
         * 
         */
        public Actors.ProjectionMask withUsers(Integer start, Integer count) {
            _usersMask = null;
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
         * List of provisioned groups of a role
         * 
         */
        public Actors.ProjectionMask withGroups(Function<com.linkedin.role.RoleGroupArray.ProjectionMask, com.linkedin.role.RoleGroupArray.ProjectionMask> nestedMask) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?RoleGroupArray.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            return this;
        }

        /**
         * List of provisioned groups of a role
         * 
         */
        public Actors.ProjectionMask withGroups() {
            _groupsMask = null;
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of provisioned groups of a role
         * 
         */
        public Actors.ProjectionMask withGroups(Function<com.linkedin.role.RoleGroupArray.ProjectionMask, com.linkedin.role.RoleGroupArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _groupsMask = nestedMask.apply(((_groupsMask == null)?RoleGroupArray.createMask():_groupsMask));
            getDataMap().put("groups", _groupsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * List of provisioned groups of a role
         * 
         */
        public Actors.ProjectionMask withGroups(Integer start, Integer count) {
            _groupsMask = null;
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

    }

}
