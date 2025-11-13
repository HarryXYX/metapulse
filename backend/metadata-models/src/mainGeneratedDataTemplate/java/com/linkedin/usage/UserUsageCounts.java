
package com.linkedin.usage;

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
 *  Records a single user's usage counts for a given resource 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/usage/UserUsageCounts.pdl.")
public class UserUsageCounts
    extends RecordTemplate
{

    private final static UserUsageCounts.Fields _fields = new UserUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _userField = null;
    private Integer _countField = null;
    private String _userEmailField = null;
    private UserUsageCounts.ChangeListener __changeListener = new UserUsageCounts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_User = SCHEMA.getField("user");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_UserEmail = SCHEMA.getField("userEmail");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public UserUsageCounts() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public UserUsageCounts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UserUsageCounts.Fields fields() {
        return _fields;
    }

    public static UserUsageCounts.ProjectionMask createMask() {
        return new UserUsageCounts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for user
     * 
     * @see UserUsageCounts.Fields#user
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
     * @see UserUsageCounts.Fields#user
     */
    public void removeUser() {
        super._map.remove("user");
    }

    /**
     * Getter for user
     * 
     * @see UserUsageCounts.Fields#user
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUser(GetMode mode) {
        return getUser();
    }

    /**
     * Getter for user
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UserUsageCounts.Fields#user
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUser() {
        if (_userField!= null) {
            return _userField;
        } else {
            Object __rawValue = super._map.get("user");
            _userField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _userField;
        }
    }

    /**
     * Setter for user
     * 
     * @see UserUsageCounts.Fields#user
     */
    public UserUsageCounts setUser(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUser(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see UserUsageCounts.Fields#user
     */
    public UserUsageCounts setUser(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field user of com.linkedin.usage.UserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _userField = value;
        }
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see UserUsageCounts.Fields#count
     */
    public boolean hasCount() {
        if (_countField!= null) {
            return true;
        }
        return super._map.containsKey("count");
    }

    /**
     * Remover for count
     * 
     * @see UserUsageCounts.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see UserUsageCounts.Fields#count
     */
    @Nullable
    public Integer getCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCount();
            case DEFAULT:
            case NULL:
                if (_countField!= null) {
                    return _countField;
                } else {
                    Object __rawValue = super._map.get("count");
                    _countField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _countField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UserUsageCounts.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        if (_countField!= null) {
            return _countField;
        } else {
            Object __rawValue = super._map.get("count");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("count");
            }
            _countField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _countField;
        }
    }

    /**
     * Setter for count
     * 
     * @see UserUsageCounts.Fields#count
     */
    public UserUsageCounts setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.usage.UserUsageCounts");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UserUsageCounts.Fields#count
     */
    public UserUsageCounts setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.usage.UserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see UserUsageCounts.Fields#count
     */
    public UserUsageCounts setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    /**
     * Existence checker for userEmail
     * 
     * @see UserUsageCounts.Fields#userEmail
     */
    public boolean hasUserEmail() {
        if (_userEmailField!= null) {
            return true;
        }
        return super._map.containsKey("userEmail");
    }

    /**
     * Remover for userEmail
     * 
     * @see UserUsageCounts.Fields#userEmail
     */
    public void removeUserEmail() {
        super._map.remove("userEmail");
    }

    /**
     * Getter for userEmail
     * 
     * @see UserUsageCounts.Fields#userEmail
     */
    @Nullable
    public String getUserEmail(GetMode mode) {
        return getUserEmail();
    }

    /**
     * Getter for userEmail
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UserUsageCounts.Fields#userEmail
     */
    @Nullable
    public String getUserEmail() {
        if (_userEmailField!= null) {
            return _userEmailField;
        } else {
            Object __rawValue = super._map.get("userEmail");
            _userEmailField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userEmailField;
        }
    }

    /**
     * Setter for userEmail
     * 
     * @see UserUsageCounts.Fields#userEmail
     */
    public UserUsageCounts setUserEmail(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserEmail(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserEmail();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
                    _userEmailField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
                    _userEmailField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userEmail
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UserUsageCounts.Fields#userEmail
     */
    public UserUsageCounts setUserEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userEmail of com.linkedin.usage.UserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
            _userEmailField = value;
        }
        return this;
    }

    @Override
    public UserUsageCounts clone()
        throws CloneNotSupportedException
    {
        UserUsageCounts __clone = ((UserUsageCounts) super.clone());
        __clone.__changeListener = new UserUsageCounts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UserUsageCounts copy()
        throws CloneNotSupportedException
    {
        UserUsageCounts __copy = ((UserUsageCounts) super.copy());
        __copy._countField = null;
        __copy._userEmailField = null;
        __copy._userField = null;
        __copy.__changeListener = new UserUsageCounts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UserUsageCounts __objectRef;

        private ChangeListener(UserUsageCounts reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "count":
                    __objectRef._countField = null;
                    break;
                case "userEmail":
                    __objectRef._userEmailField = null;
                    break;
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

        public PathSpec user() {
            return new PathSpec(getPathComponents(), "user");
        }

        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         *  If user_email is set, we attempt to resolve the user's urn upon ingest 
         * 
         */
        public PathSpec userEmail() {
            return new PathSpec(getPathComponents(), "userEmail");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        public UserUsageCounts.ProjectionMask withUser() {
            getDataMap().put("user", MaskMap.POSITIVE_MASK);
            return this;
        }

        public UserUsageCounts.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  If user_email is set, we attempt to resolve the user's urn upon ingest 
         * 
         */
        public UserUsageCounts.ProjectionMask withUserEmail() {
            getDataMap().put("userEmail", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
