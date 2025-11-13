
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
import com.linkedin.data.template.StringArray;


/**
 * Metrics for usage data for a given resource and bucket. Not all fields
 * make sense for all buckets, so every field is optional.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageAggregationMetrics.pdl.")
public class UsageAggregationMetrics
    extends RecordTemplate
{

    private final static UsageAggregationMetrics.Fields _fields = new UsageAggregationMetrics.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}", SchemaFormatType.PDL));
    private Integer _uniqueUserCountField = null;
    private UserUsageCountsArray _usersField = null;
    private Integer _totalSqlQueriesField = null;
    private StringArray _topSqlQueriesField = null;
    private FieldUsageCountsArray _fieldsField = null;
    private UsageAggregationMetrics.ChangeListener __changeListener = new UsageAggregationMetrics.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_UniqueUserCount = SCHEMA.getField("uniqueUserCount");
    private final static RecordDataSchema.Field FIELD_Users = SCHEMA.getField("users");
    private final static RecordDataSchema.Field FIELD_TotalSqlQueries = SCHEMA.getField("totalSqlQueries");
    private final static RecordDataSchema.Field FIELD_TopSqlQueries = SCHEMA.getField("topSqlQueries");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");

    public UsageAggregationMetrics() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public UsageAggregationMetrics(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UsageAggregationMetrics.Fields fields() {
        return _fields;
    }

    public static UsageAggregationMetrics.ProjectionMask createMask() {
        return new UsageAggregationMetrics.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
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
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public void removeUniqueUserCount() {
        super._map.remove("uniqueUserCount");
    }

    /**
     * Getter for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
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
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
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
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public UsageAggregationMetrics setUniqueUserCount(
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
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public UsageAggregationMetrics setUniqueUserCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field uniqueUserCount of com.linkedin.usage.UsageAggregationMetrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "uniqueUserCount", DataTemplateUtil.coerceIntInput(value));
            _uniqueUserCountField = value;
        }
        return this;
    }

    /**
     * Setter for uniqueUserCount
     * 
     * @see UsageAggregationMetrics.Fields#uniqueUserCount
     */
    public UsageAggregationMetrics setUniqueUserCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "uniqueUserCount", DataTemplateUtil.coerceIntInput(value));
        _uniqueUserCountField = value;
        return this;
    }

    /**
     * Existence checker for users
     * 
     * @see UsageAggregationMetrics.Fields#users
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
     * @see UsageAggregationMetrics.Fields#users
     */
    public void removeUsers() {
        super._map.remove("users");
    }

    /**
     * Getter for users
     * 
     * @see UsageAggregationMetrics.Fields#users
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
     * @see UsageAggregationMetrics.Fields#users
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
     * @see UsageAggregationMetrics.Fields#users
     */
    public UsageAggregationMetrics setUsers(
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
     * @see UsageAggregationMetrics.Fields#users
     */
    public UsageAggregationMetrics setUsers(
        @Nonnull
        UserUsageCountsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field users of com.linkedin.usage.UsageAggregationMetrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "users", value.data());
            _usersField = value;
        }
        return this;
    }

    /**
     * Existence checker for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
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
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public void removeTotalSqlQueries() {
        super._map.remove("totalSqlQueries");
    }

    /**
     * Getter for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
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
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
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
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public UsageAggregationMetrics setTotalSqlQueries(
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
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public UsageAggregationMetrics setTotalSqlQueries(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalSqlQueries of com.linkedin.usage.UsageAggregationMetrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalSqlQueries", DataTemplateUtil.coerceIntInput(value));
            _totalSqlQueriesField = value;
        }
        return this;
    }

    /**
     * Setter for totalSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#totalSqlQueries
     */
    public UsageAggregationMetrics setTotalSqlQueries(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalSqlQueries", DataTemplateUtil.coerceIntInput(value));
        _totalSqlQueriesField = value;
        return this;
    }

    /**
     * Existence checker for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public boolean hasTopSqlQueries() {
        if (_topSqlQueriesField!= null) {
            return true;
        }
        return super._map.containsKey("topSqlQueries");
    }

    /**
     * Remover for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public void removeTopSqlQueries() {
        super._map.remove("topSqlQueries");
    }

    /**
     * Getter for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    @Nullable
    public StringArray getTopSqlQueries(GetMode mode) {
        return getTopSqlQueries();
    }

    /**
     * Getter for topSqlQueries
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    @Nullable
    public StringArray getTopSqlQueries() {
        if (_topSqlQueriesField!= null) {
            return _topSqlQueriesField;
        } else {
            Object __rawValue = super._map.get("topSqlQueries");
            _topSqlQueriesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _topSqlQueriesField;
        }
    }

    /**
     * Setter for topSqlQueries
     * 
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public UsageAggregationMetrics setTopSqlQueries(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTopSqlQueries(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTopSqlQueries();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "topSqlQueries", value.data());
                    _topSqlQueriesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "topSqlQueries", value.data());
                    _topSqlQueriesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for topSqlQueries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregationMetrics.Fields#topSqlQueries
     */
    public UsageAggregationMetrics setTopSqlQueries(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field topSqlQueries of com.linkedin.usage.UsageAggregationMetrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "topSqlQueries", value.data());
            _topSqlQueriesField = value;
        }
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see UsageAggregationMetrics.Fields#fields
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
     * @see UsageAggregationMetrics.Fields#fields
     */
    public void removeFields() {
        super._map.remove("fields");
    }

    /**
     * Getter for fields
     * 
     * @see UsageAggregationMetrics.Fields#fields
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
     * @see UsageAggregationMetrics.Fields#fields
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
     * @see UsageAggregationMetrics.Fields#fields
     */
    public UsageAggregationMetrics setFields(
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
     * @see UsageAggregationMetrics.Fields#fields
     */
    public UsageAggregationMetrics setFields(
        @Nonnull
        FieldUsageCountsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fields of com.linkedin.usage.UsageAggregationMetrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
            _fieldsField = value;
        }
        return this;
    }

    @Override
    public UsageAggregationMetrics clone()
        throws CloneNotSupportedException
    {
        UsageAggregationMetrics __clone = ((UsageAggregationMetrics) super.clone());
        __clone.__changeListener = new UsageAggregationMetrics.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UsageAggregationMetrics copy()
        throws CloneNotSupportedException
    {
        UsageAggregationMetrics __copy = ((UsageAggregationMetrics) super.copy());
        __copy._totalSqlQueriesField = null;
        __copy._topSqlQueriesField = null;
        __copy._fieldsField = null;
        __copy._uniqueUserCountField = null;
        __copy._usersField = null;
        __copy.__changeListener = new UsageAggregationMetrics.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UsageAggregationMetrics __objectRef;

        private ChangeListener(UsageAggregationMetrics reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "totalSqlQueries":
                    __objectRef._totalSqlQueriesField = null;
                    break;
                case "topSqlQueries":
                    __objectRef._topSqlQueriesField = null;
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

        /**
         *  Unique user count 
         * 
         */
        public PathSpec uniqueUserCount() {
            return new PathSpec(getPathComponents(), "uniqueUserCount");
        }

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
        public com.linkedin.usage.UserUsageCountsArray.Fields users() {
            return new com.linkedin.usage.UserUsageCountsArray.Fields(getPathComponents(), "users");
        }

        /**
         *  Users within this bucket, with frequency counts 
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
         *  Total SQL query count 
         * 
         */
        public PathSpec totalSqlQueries() {
            return new PathSpec(getPathComponents(), "totalSqlQueries");
        }

        /**
         *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
         * 
         */
        public PathSpec topSqlQueries() {
            return new PathSpec(getPathComponents(), "topSqlQueries");
        }

        /**
         *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
         * 
         */
        public PathSpec topSqlQueries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "topSqlQueries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         *  Field-level usage stats 
         * 
         */
        public com.linkedin.usage.FieldUsageCountsArray.Fields fields() {
            return new com.linkedin.usage.FieldUsageCountsArray.Fields(getPathComponents(), "fields");
        }

        /**
         *  Field-level usage stats 
         * 
         */
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
            super(7);
        }

        /**
         *  Unique user count 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withUniqueUserCount() {
            getDataMap().put("uniqueUserCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withUsers(Function<com.linkedin.usage.UserUsageCountsArray.ProjectionMask, com.linkedin.usage.UserUsageCountsArray.ProjectionMask> nestedMask) {
            _usersMask = nestedMask.apply(((_usersMask == null)?UserUsageCountsArray.createMask():_usersMask));
            getDataMap().put("users", _usersMask.getDataMap());
            return this;
        }

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withUsers() {
            _usersMask = null;
            getDataMap().put("users", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withUsers(Function<com.linkedin.usage.UserUsageCountsArray.ProjectionMask, com.linkedin.usage.UserUsageCountsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
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

        /**
         *  Users within this bucket, with frequency counts 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withUsers(Integer start, Integer count) {
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
         *  Total SQL query count 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withTotalSqlQueries() {
            getDataMap().put("totalSqlQueries", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withTopSqlQueries() {
            getDataMap().put("topSqlQueries", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Frequent SQL queries; mostly makes sense for datasets in SQL databases 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withTopSqlQueries(Integer start, Integer count) {
            getDataMap().put("topSqlQueries", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("topSqlQueries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("topSqlQueries").put("$count", count);
            }
            return this;
        }

        /**
         *  Field-level usage stats 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withFields(Function<com.linkedin.usage.FieldUsageCountsArray.ProjectionMask, com.linkedin.usage.FieldUsageCountsArray.ProjectionMask> nestedMask) {
            _fieldsMask = nestedMask.apply(((_fieldsMask == null)?FieldUsageCountsArray.createMask():_fieldsMask));
            getDataMap().put("fields", _fieldsMask.getDataMap());
            return this;
        }

        /**
         *  Field-level usage stats 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withFields() {
            _fieldsMask = null;
            getDataMap().put("fields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Field-level usage stats 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withFields(Function<com.linkedin.usage.FieldUsageCountsArray.ProjectionMask, com.linkedin.usage.FieldUsageCountsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
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

        /**
         *  Field-level usage stats 
         * 
         */
        public UsageAggregationMetrics.ProjectionMask withFields(Integer start, Integer count) {
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
