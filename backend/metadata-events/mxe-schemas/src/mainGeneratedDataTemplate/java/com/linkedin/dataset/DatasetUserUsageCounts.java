
package com.linkedin.dataset;

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
 * Records a single user's usage counts for a given resource
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUserUsageCounts.pdl.")
public class DatasetUserUsageCounts
    extends RecordTemplate
{

    private final static DatasetUserUsageCounts.Fields _fields = new DatasetUserUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Records a single user's usage counts for a given resource*/record DatasetUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of times the dataset has been used by the user.*/@TimeseriesField={}count:int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _userField = null;
    private Integer _countField = null;
    private String _userEmailField = null;
    private DatasetUserUsageCounts.ChangeListener __changeListener = new DatasetUserUsageCounts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_User = SCHEMA.getField("user");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");
    private final static RecordDataSchema.Field FIELD_UserEmail = SCHEMA.getField("userEmail");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DatasetUserUsageCounts() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DatasetUserUsageCounts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetUserUsageCounts.Fields fields() {
        return _fields;
    }

    public static DatasetUserUsageCounts.ProjectionMask createMask() {
        return new DatasetUserUsageCounts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for user
     * 
     * @see DatasetUserUsageCounts.Fields#user
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
     * @see DatasetUserUsageCounts.Fields#user
     */
    public void removeUser() {
        super._map.remove("user");
    }

    /**
     * Getter for user
     * 
     * @see DatasetUserUsageCounts.Fields#user
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
     * @see DatasetUserUsageCounts.Fields#user
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
     * @see DatasetUserUsageCounts.Fields#user
     */
    public DatasetUserUsageCounts setUser(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUser(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field user of com.linkedin.dataset.DatasetUserUsageCounts");
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
     * @see DatasetUserUsageCounts.Fields#user
     */
    public DatasetUserUsageCounts setUser(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field user of com.linkedin.dataset.DatasetUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "user", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _userField = value;
        }
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
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
     * @see DatasetUserUsageCounts.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
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
     * @see DatasetUserUsageCounts.Fields#count
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
     * @see DatasetUserUsageCounts.Fields#count
     */
    public DatasetUserUsageCounts setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.dataset.DatasetUserUsageCounts");
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
     * @see DatasetUserUsageCounts.Fields#count
     */
    public DatasetUserUsageCounts setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.dataset.DatasetUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see DatasetUserUsageCounts.Fields#count
     */
    public DatasetUserUsageCounts setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    /**
     * Existence checker for userEmail
     * 
     * @see DatasetUserUsageCounts.Fields#userEmail
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
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public void removeUserEmail() {
        super._map.remove("userEmail");
    }

    /**
     * Getter for userEmail
     * 
     * @see DatasetUserUsageCounts.Fields#userEmail
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
     * @see DatasetUserUsageCounts.Fields#userEmail
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
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public DatasetUserUsageCounts setUserEmail(
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
     * @see DatasetUserUsageCounts.Fields#userEmail
     */
    public DatasetUserUsageCounts setUserEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userEmail of com.linkedin.dataset.DatasetUserUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userEmail", value);
            _userEmailField = value;
        }
        return this;
    }

    @Override
    public DatasetUserUsageCounts clone()
        throws CloneNotSupportedException
    {
        DatasetUserUsageCounts __clone = ((DatasetUserUsageCounts) super.clone());
        __clone.__changeListener = new DatasetUserUsageCounts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetUserUsageCounts copy()
        throws CloneNotSupportedException
    {
        DatasetUserUsageCounts __copy = ((DatasetUserUsageCounts) super.copy());
        __copy._countField = null;
        __copy._userEmailField = null;
        __copy._userField = null;
        __copy.__changeListener = new DatasetUserUsageCounts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetUserUsageCounts __objectRef;

        private ChangeListener(DatasetUserUsageCounts reference) {
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

        /**
         * The unique id of the user.
         * 
         */
        public PathSpec user() {
            return new PathSpec(getPathComponents(), "user");
        }

        /**
         * Number of times the dataset has been used by the user.
         * 
         */
        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

        /**
         * If user_email is set, we attempt to resolve the user's urn upon ingest
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

        /**
         * The unique id of the user.
         * 
         */
        public DatasetUserUsageCounts.ProjectionMask withUser() {
            getDataMap().put("user", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of times the dataset has been used by the user.
         * 
         */
        public DatasetUserUsageCounts.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If user_email is set, we attempt to resolve the user's urn upon ingest
         * 
         */
        public DatasetUserUsageCounts.ProjectionMask withUserEmail() {
            getDataMap().put("userEmail", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
