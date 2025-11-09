
package com.linkedin.usage;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageQueryResult.pdl.")
public class UsageQueryResultAggregations
    extends RecordTemplate
{

    private final static UsageQueryResultAggregations.Fields _fields = new UsageQueryResultAggregations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage,record UsageQueryResultAggregations{uniqueUserCount:optional int,totalSqlQueries:optional int,users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}", SchemaFormatType.PDL));
    private Integer _uniqueUserCountField = null;
    private Integer _totalSqlQueriesField = null;
    private UserUsageCountsArray _usersField = null;
    private FieldUsageCountsArray _fieldsField = null;
    private UsageQueryResultAggregations.ChangeListener __changeListener = new UsageQueryResultAggregations.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_UniqueUserCount = SCHEMA.getField("uniqueUserCount");
    private final static RecordDataSchema.Field FIELD_TotalSqlQueries = SCHEMA.getField("totalSqlQueries");
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");

    public UsageQueryResultAggregations() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public UsageQueryResultAggregations(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UsageQueryResultAggregations.Fields fields() {
        return _fields;
    }

    public static UsageQueryResultAggregations.ProjectionMask createMask() {
        return new UsageQueryResultAggregations.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public boolean hasUniqueUserCount() {
        if (_uniqueUserCountField!= null) {
            return true;
        }
        return super._map.containsKey("uniqueUserCount");
    }

    /**
     * Remover for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public void removeUniqueUserCount() {
        super._map.remove("uniqueUserCount");
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    @Nullable
    public Integer getUniqueUserCount(GetMode mode) {
        return getUniqueUserCount();
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    @Nullable
    public Integer getUniqueUserCount() {
        if (_uniqueUserCountField!= null) {
            return _uniqueUserCountField;
        } else {
            Object __rawValue = super._map.get("uniqueUserCount");
            _uniqueUserCountField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _uniqueUserCountField;
        }
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public UsageQueryResultAggregations setUniqueUserCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUniqueUserCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUniqueUserCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "uniqueUserCount", DataTemplateUtil.coerceIntInput(value));
                    _uniqueUserCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "uniqueUserCount", DataTemplateUtil.coerceIntInput(value));
                    _uniqueUserCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public UsageQueryResultAggregations setUniqueUserCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field uniqueUserCount of com.linkedin.usage.UsageQueryResultAggregations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "uniqueUserCount", DataTemplateUtil.coerceIntInput(value));
            _uniqueUserCountField = value;
        }
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageQueryResultAggregations.Fields#uniqueUserCount
     */
    public UsageQueryResultAggregations setUniqueUserCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "uniqueUserCount", DataTemplateUtil.coerceIntInput(value));
        _uniqueUserCountField = value;
        return this;
    }

    /**
     * Existence checker for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public boolean hasTotalSqlQueries() {
        if (_totalSqlQueriesField!= null) {
            return true;
        }
        return super._map.containsKey("totalSqlQueries");
    }

    /**
     * Remover for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public void removeTotalSqlQueries() {
        super._map.remove("totalSqlQueries");
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    @Nullable
    public Integer getTotalSqlQueries(GetMode mode) {
        return getTotalSqlQueries();
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    @Nullable
    public Integer getTotalSqlQueries() {
        if (_totalSqlQueriesField!= null) {
            return _totalSqlQueriesField;
        } else {
            Object __rawValue = super._map.get("totalSqlQueries");
            _totalSqlQueriesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalSqlQueriesField;
        }
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public UsageQueryResultAggregations setTotalSqlQueries(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalSqlQueries(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalSqlQueries();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalSqlQueries", DataTemplateUtil.coerceIntInput(value));
                    _totalSqlQueriesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalSqlQueries", DataTemplateUtil.coerceIntInput(value));
                    _totalSqlQueriesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public UsageQueryResultAggregations setTotalSqlQueries(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalSqlQueries of com.linkedin.usage.UsageQueryResultAggregations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalSqlQueries", DataTemplateUtil.coerceIntInput(value));
            _totalSqlQueriesField = value;
        }
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageQueryResultAggregations.Fields#totalSqlQueries
     */
    public UsageQueryResultAggregations setTotalSqlQueries(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalSqlQueries", DataTemplateUtil.coerceIntInput(value));
        _totalSqlQueriesField = value;
        return this;
    }

    /**
     * Existence checker for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
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
     * @see UsageQueryResultAggregations.Fields#users
     */
    public void removeUsers() {
        super._map.remove("users");
    }

    /**
     * Getter for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
     */
    @Nullable
    public UserUsageCountsArray getUsers(GetMode mode) {
        return getUsers();
    }

    /**
     * Getter for users
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#users
     */
    @Nullable
    public UserUsageCountsArray getUsers() {
        if (_usersField!= null) {
            return _usersField;
        } else {
            Object __rawValue = super._map.get("users");
            _usersField = ((__rawValue == null)?null:new UserUsageCountsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _usersField;
        }
    }

    /**
     * Setter for users
     * 
     * @see UsageQueryResultAggregations.Fields#users
     */
    public UsageQueryResultAggregations setUsers(
        @Nullable
        UserUsageCountsArray value, SetMode mode) {
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
     * @see UsageQueryResultAggregations.Fields#users
     */
    public UsageQueryResultAggregations setUsers(
        @Nonnull
        UserUsageCountsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field users of com.linkedin.usage.UsageQueryResultAggregations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "users", value.data());
            _usersField = value;
        }
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public boolean hasFields() {
        if (_fieldsField!= null) {
            return true;
        }
        return super._map.containsKey("fields");
    }

    /**
     * Remover for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public void removeFields() {
        super._map.remove("fields");
    }

    /**
     * Getter for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    @Nullable
    public FieldUsageCountsArray getFields(GetMode mode) {
        return getFields();
    }

    /**
     * Getter for fields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResultAggregations.Fields#fields
     */
    @Nullable
    public FieldUsageCountsArray getFields() {
        if (_fieldsField!= null) {
            return _fieldsField;
        } else {
            Object __rawValue = super._map.get("fields");
            _fieldsField = ((__rawValue == null)?null:new FieldUsageCountsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _fieldsField;
        }
    }

    /**
     * Setter for fields
     * 
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public UsageQueryResultAggregations setFields(
        @Nullable
        FieldUsageCountsArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResultAggregations.Fields#fields
     */
    public UsageQueryResultAggregations setFields(
        @Nonnull
        FieldUsageCountsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fields of com.linkedin.usage.UsageQueryResultAggregations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
            _fieldsField = value;
        }
        return this;
    }

    @Override
    public UsageQueryResultAggregations clone()
        throws CloneNotSupportedException
    {
        UsageQueryResultAggregations __clone = ((UsageQueryResultAggregations) super.clone());
        __clone.__changeListener = new UsageQueryResultAggregations.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UsageQueryResultAggregations copy()
        throws CloneNotSupportedException
    {
        UsageQueryResultAggregations __copy = ((UsageQueryResultAggregations) super.copy());
        __copy._totalSqlQueriesField = null;
        __copy._fieldsField = null;
        __copy._uniqueUserCountField = null;
        __copy._usersField = null;
        __copy.__changeListener = new UsageQueryResultAggregations.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UsageQueryResultAggregations __objectRef;

        private ChangeListener(UsageQueryResultAggregations reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "totalSqlQueries":
                    __objectRef._totalSqlQueriesField = null;
                    break;
                case "fields":
                    __objectRef._fieldsField = null;
                    break;
                case "uniqueUserCount":
                    __objectRef._uniqueUserCountField = null;
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

        public PathSpec uniqueUserCount() {
            return new PathSpec(getPathComponents(), "uniqueUserCount");
        }

        public PathSpec totalSqlQueries() {
            return new PathSpec(getPathComponents(), "totalSqlQueries");
        }

        public com.linkedin.usage.UserUsageCountsArray.Fields users() {
            return new com.linkedin.usage.UserUsageCountsArray.Fields(getPathComponents(), "users");
        }

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

        public com.linkedin.usage.FieldUsageCountsArray.Fields fields() {
            return new com.linkedin.usage.FieldUsageCountsArray.Fields(getPathComponents(), "fields");
        }

        public PathSpec fields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fields");
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

        private com.linkedin.usage.UserUsageCountsArray.ProjectionMask _usersMask;
        private com.linkedin.usage.FieldUsageCountsArray.ProjectionMask _fieldsMask;

        ProjectionMask() {
            super(6);
        }

        public UsageQueryResultAggregations.ProjectionMask withUniqueUserCount() {
            getDataMap().put("uniqueUserCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withTotalSqlQueries() {
            getDataMap().put("totalSqlQueries", MaskMap.POSITIVE_MASK);
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withUsers(Function<com.linkedin.usage.UserUsageCountsArray.ProjectionMask, com.linkedin.usage.UserUsageCountsArray.ProjectionMask> nestedMask) {
            _usersMask = nestedMask.apply(((_usersMask == null)?UserUsageCountsArray.createMask():_usersMask));
            getDataMap().put("users", _usersMask.getDataMap());
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withUsers() {
            _usersMask = null;
            getDataMap().put("users", MaskMap.POSITIVE_MASK);
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withUsers(Function<com.linkedin.usage.UserUsageCountsArray.ProjectionMask, com.linkedin.usage.UserUsageCountsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _usersMask = nestedMask.apply(((_usersMask == null)?UserUsageCountsArray.createMask():_usersMask));
            getDataMap().put("users", _usersMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("users").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("users").put("$count", count);
            }
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withUsers(Integer start, Integer count) {
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

        public UsageQueryResultAggregations.ProjectionMask withFields(Function<com.linkedin.usage.FieldUsageCountsArray.ProjectionMask, com.linkedin.usage.FieldUsageCountsArray.ProjectionMask> nestedMask) {
            _fieldsMask = nestedMask.apply(((_fieldsMask == null)?FieldUsageCountsArray.createMask():_fieldsMask));
            getDataMap().put("fields", _fieldsMask.getDataMap());
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withFields() {
            _fieldsMask = null;
            getDataMap().put("fields", MaskMap.POSITIVE_MASK);
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withFields(Function<com.linkedin.usage.FieldUsageCountsArray.ProjectionMask, com.linkedin.usage.FieldUsageCountsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _fieldsMask = nestedMask.apply(((_fieldsMask == null)?FieldUsageCountsArray.createMask():_fieldsMask));
            getDataMap().put("fields", _fieldsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("fields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fields").put("$count", count);
            }
            return this;
        }

        public UsageQueryResultAggregations.ProjectionMask withFields(Integer start, Integer count) {
            _fieldsMask = null;
            getDataMap().put("fields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("fields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fields").put("$count", count);
            }
            return this;
        }

    }

}
