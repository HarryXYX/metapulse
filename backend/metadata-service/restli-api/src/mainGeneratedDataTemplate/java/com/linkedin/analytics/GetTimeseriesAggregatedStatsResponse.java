
package com.linkedin.analytics;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.timeseries.AggregationSpecArray;
import com.linkedin.timeseries.GenericTable;
import com.linkedin.timeseries.GroupingBucketArray;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/pegasus/com/linkedin/analytics/GetTimeseriesAggregatedStatsResponse.pdl.")
public class GetTimeseriesAggregatedStatsResponse
    extends RecordTemplate
{

    private final static GetTimeseriesAggregatedStatsResponse.Fields _fields = new GetTimeseriesAggregatedStatsResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.analytics,record GetTimeseriesAggregatedStatsResponse{/**Input param entityName*/entityName:string/**Input param aspectName*/aspectName:string/**Input param filter.*/filter:optional{namespace com.linkedin.metadata.query.filter/**The filter for finding a record or a collection of records*/record Filter{/**A list of disjunctive criterion for the filter. (or operation to combine filters)*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}}/**Input param aggregated metrics.*/aggregationSpecs:optional array[{namespace com.linkedin.timeseries/**Provides the aggregation specification on a member/field.*/record AggregationSpec{/**Name of the member/field.*/fieldPath:string/**Aggregation type for the metric.*/aggregationType:enum AggregationType{LATEST,SUM,CARDINALITY}}}]/**Input param groupingBuckets*/groupingBuckets:array[{namespace com.linkedin.timeseries/**Defines the group by bucket definitions for time series requests.*/record GroupingBucket{/**Type of the grouping bucket.*/type:/**Defines a grouping bucket type.*/enum GroupingBucketType{DATE_GROUPING_BUCKET,STRING_GROUPING_BUCKET}/**Key that specifies the column name to be used as the timestamp field for bucketing.*/key:string/**Bucket size (like a day/hour etc) for the date grouping buckets.*/timeWindowSize:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}/**Optional specified time zone to take into account when grouping by date*/timeZone:optional string}}]/**The results table.*/table:{namespace com.linkedin.timeseries/**Defines a generic table.*/record GenericTable{/**The names of the columns.*/columnNames:array[string]/**The types of the columns.*/columnTypes:array[string]/**The data rows.*/rows:optional array[array[string]]}}/**When the index was last updated.*/lastUpdatedTimeMillis:optional long}", SchemaFormatType.PDL));
    private String _entityNameField = null;
    private String _aspectNameField = null;
    private Filter _filterField = null;
    private AggregationSpecArray _aggregationSpecsField = null;
    private GroupingBucketArray _groupingBucketsField = null;
    private GenericTable _tableField = null;
    private Long _lastUpdatedTimeMillisField = null;
    private GetTimeseriesAggregatedStatsResponse.ChangeListener __changeListener = new GetTimeseriesAggregatedStatsResponse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntityName = SCHEMA.getField("entityName");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");
    private final static RecordDataSchema.Field FIELD_AggregationSpecs = SCHEMA.getField("aggregationSpecs");
    private final static RecordDataSchema.Field FIELD_GroupingBuckets = SCHEMA.getField("groupingBuckets");
    private final static RecordDataSchema.Field FIELD_Table = SCHEMA.getField("table");
    private final static RecordDataSchema.Field FIELD_LastUpdatedTimeMillis = SCHEMA.getField("lastUpdatedTimeMillis");

    public GetTimeseriesAggregatedStatsResponse() {
        super(new DataMap(10, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public GetTimeseriesAggregatedStatsResponse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GetTimeseriesAggregatedStatsResponse.Fields fields() {
        return _fields;
    }

    public static GetTimeseriesAggregatedStatsResponse.ProjectionMask createMask() {
        return new GetTimeseriesAggregatedStatsResponse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entityName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#entityName
     */
    public boolean hasEntityName() {
        if (_entityNameField!= null) {
            return true;
        }
        return super._map.containsKey("entityName");
    }

    /**
     * Remover for entityName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#entityName
     */
    public void removeEntityName() {
        super._map.remove("entityName");
    }

    /**
     * Getter for entityName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#entityName
     */
    @Nullable
    public String getEntityName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityName();
            case DEFAULT:
            case NULL:
                if (_entityNameField!= null) {
                    return _entityNameField;
                } else {
                    Object __rawValue = super._map.get("entityName");
                    _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#entityName
     */
    @Nonnull
    public String getEntityName() {
        if (_entityNameField!= null) {
            return _entityNameField;
        } else {
            Object __rawValue = super._map.get("entityName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityName");
            }
            _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityNameField;
        }
    }

    /**
     * Setter for entityName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#entityName
     */
    public GetTimeseriesAggregatedStatsResponse setEntityName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityName of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#entityName
     */
    public GetTimeseriesAggregatedStatsResponse setEntityName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityName of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityName", value);
            _entityNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aspectName
     */
    public boolean hasAspectName() {
        if (_aspectNameField!= null) {
            return true;
        }
        return super._map.containsKey("aspectName");
    }

    /**
     * Remover for aspectName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aspectName
     */
    public void removeAspectName() {
        super._map.remove("aspectName");
    }

    /**
     * Getter for aspectName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aspectName
     */
    @Nullable
    public String getAspectName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectName();
            case DEFAULT:
            case NULL:
                if (_aspectNameField!= null) {
                    return _aspectNameField;
                } else {
                    Object __rawValue = super._map.get("aspectName");
                    _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aspectName
     */
    @Nonnull
    public String getAspectName() {
        if (_aspectNameField!= null) {
            return _aspectNameField;
        } else {
            Object __rawValue = super._map.get("aspectName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectName");
            }
            _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectNameField;
        }
    }

    /**
     * Setter for aspectName
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aspectName
     */
    public GetTimeseriesAggregatedStatsResponse setAspectName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectName of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aspectName
     */
    public GetTimeseriesAggregatedStatsResponse setAspectName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectName of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
            _aspectNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#filter
     */
    public boolean hasFilter() {
        if (_filterField!= null) {
            return true;
        }
        return super._map.containsKey("filter");
    }

    /**
     * Remover for filter
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#filter
     */
    @Nullable
    public Filter getFilter(GetMode mode) {
        return getFilter();
    }

    /**
     * Getter for filter
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#filter
     */
    @Nullable
    public Filter getFilter() {
        if (_filterField!= null) {
            return _filterField;
        } else {
            Object __rawValue = super._map.get("filter");
            _filterField = ((__rawValue == null)?null:new Filter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _filterField;
        }
    }

    /**
     * Setter for filter
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#filter
     */
    public GetTimeseriesAggregatedStatsResponse setFilter(
        @Nullable
        Filter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilter(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilter();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#filter
     */
    public GetTimeseriesAggregatedStatsResponse setFilter(
        @Nonnull
        Filter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregationSpecs
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aggregationSpecs
     */
    public boolean hasAggregationSpecs() {
        if (_aggregationSpecsField!= null) {
            return true;
        }
        return super._map.containsKey("aggregationSpecs");
    }

    /**
     * Remover for aggregationSpecs
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aggregationSpecs
     */
    public void removeAggregationSpecs() {
        super._map.remove("aggregationSpecs");
    }

    /**
     * Getter for aggregationSpecs
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aggregationSpecs
     */
    @Nullable
    public AggregationSpecArray getAggregationSpecs(GetMode mode) {
        return getAggregationSpecs();
    }

    /**
     * Getter for aggregationSpecs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aggregationSpecs
     */
    @Nullable
    public AggregationSpecArray getAggregationSpecs() {
        if (_aggregationSpecsField!= null) {
            return _aggregationSpecsField;
        } else {
            Object __rawValue = super._map.get("aggregationSpecs");
            _aggregationSpecsField = ((__rawValue == null)?null:new AggregationSpecArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aggregationSpecsField;
        }
    }

    /**
     * Setter for aggregationSpecs
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aggregationSpecs
     */
    public GetTimeseriesAggregatedStatsResponse setAggregationSpecs(
        @Nullable
        AggregationSpecArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregationSpecs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregationSpecs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregationSpecs", value.data());
                    _aggregationSpecsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregationSpecs", value.data());
                    _aggregationSpecsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregationSpecs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#aggregationSpecs
     */
    public GetTimeseriesAggregatedStatsResponse setAggregationSpecs(
        @Nonnull
        AggregationSpecArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregationSpecs of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregationSpecs", value.data());
            _aggregationSpecsField = value;
        }
        return this;
    }

    /**
     * Existence checker for groupingBuckets
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#groupingBuckets
     */
    public boolean hasGroupingBuckets() {
        if (_groupingBucketsField!= null) {
            return true;
        }
        return super._map.containsKey("groupingBuckets");
    }

    /**
     * Remover for groupingBuckets
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#groupingBuckets
     */
    public void removeGroupingBuckets() {
        super._map.remove("groupingBuckets");
    }

    /**
     * Getter for groupingBuckets
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#groupingBuckets
     */
    @Nullable
    public GroupingBucketArray getGroupingBuckets(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getGroupingBuckets();
            case DEFAULT:
            case NULL:
                if (_groupingBucketsField!= null) {
                    return _groupingBucketsField;
                } else {
                    Object __rawValue = super._map.get("groupingBuckets");
                    _groupingBucketsField = ((__rawValue == null)?null:new GroupingBucketArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _groupingBucketsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for groupingBuckets
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#groupingBuckets
     */
    @Nonnull
    public GroupingBucketArray getGroupingBuckets() {
        if (_groupingBucketsField!= null) {
            return _groupingBucketsField;
        } else {
            Object __rawValue = super._map.get("groupingBuckets");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("groupingBuckets");
            }
            _groupingBucketsField = ((__rawValue == null)?null:new GroupingBucketArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupingBucketsField;
        }
    }

    /**
     * Setter for groupingBuckets
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#groupingBuckets
     */
    public GetTimeseriesAggregatedStatsResponse setGroupingBuckets(
        @Nullable
        GroupingBucketArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroupingBuckets(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groupingBuckets of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingBuckets", value.data());
                    _groupingBucketsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroupingBuckets();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingBuckets", value.data());
                    _groupingBucketsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groupingBuckets", value.data());
                    _groupingBucketsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groupingBuckets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#groupingBuckets
     */
    public GetTimeseriesAggregatedStatsResponse setGroupingBuckets(
        @Nonnull
        GroupingBucketArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groupingBuckets of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groupingBuckets", value.data());
            _groupingBucketsField = value;
        }
        return this;
    }

    /**
     * Existence checker for table
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#table
     */
    public boolean hasTable() {
        if (_tableField!= null) {
            return true;
        }
        return super._map.containsKey("table");
    }

    /**
     * Remover for table
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#table
     */
    public void removeTable() {
        super._map.remove("table");
    }

    /**
     * Getter for table
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#table
     */
    @Nullable
    public GenericTable getTable(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTable();
            case DEFAULT:
            case NULL:
                if (_tableField!= null) {
                    return _tableField;
                } else {
                    Object __rawValue = super._map.get("table");
                    _tableField = ((__rawValue == null)?null:new GenericTable(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _tableField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for table
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#table
     */
    @Nonnull
    public GenericTable getTable() {
        if (_tableField!= null) {
            return _tableField;
        } else {
            Object __rawValue = super._map.get("table");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("table");
            }
            _tableField = ((__rawValue == null)?null:new GenericTable(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _tableField;
        }
    }

    /**
     * Setter for table
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#table
     */
    public GetTimeseriesAggregatedStatsResponse setTable(
        @Nullable
        GenericTable value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTable(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field table of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "table", value.data());
                    _tableField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTable();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "table", value.data());
                    _tableField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "table", value.data());
                    _tableField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for table
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#table
     */
    public GetTimeseriesAggregatedStatsResponse setTable(
        @Nonnull
        GenericTable value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field table of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "table", value.data());
            _tableField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastUpdatedTimeMillis
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    public boolean hasLastUpdatedTimeMillis() {
        if (_lastUpdatedTimeMillisField!= null) {
            return true;
        }
        return super._map.containsKey("lastUpdatedTimeMillis");
    }

    /**
     * Remover for lastUpdatedTimeMillis
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    public void removeLastUpdatedTimeMillis() {
        super._map.remove("lastUpdatedTimeMillis");
    }

    /**
     * Getter for lastUpdatedTimeMillis
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    @Nullable
    public Long getLastUpdatedTimeMillis(GetMode mode) {
        return getLastUpdatedTimeMillis();
    }

    /**
     * Getter for lastUpdatedTimeMillis
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    @Nullable
    public Long getLastUpdatedTimeMillis() {
        if (_lastUpdatedTimeMillisField!= null) {
            return _lastUpdatedTimeMillisField;
        } else {
            Object __rawValue = super._map.get("lastUpdatedTimeMillis");
            _lastUpdatedTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _lastUpdatedTimeMillisField;
        }
    }

    /**
     * Setter for lastUpdatedTimeMillis
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    public GetTimeseriesAggregatedStatsResponse setLastUpdatedTimeMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastUpdatedTimeMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastUpdatedTimeMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _lastUpdatedTimeMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _lastUpdatedTimeMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastUpdatedTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    public GetTimeseriesAggregatedStatsResponse setLastUpdatedTimeMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastUpdatedTimeMillis of com.linkedin.analytics.GetTimeseriesAggregatedStatsResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimeMillis", DataTemplateUtil.coerceLongInput(value));
            _lastUpdatedTimeMillisField = value;
        }
        return this;
    }

    /**
     * Setter for lastUpdatedTimeMillis
     * 
     * @see GetTimeseriesAggregatedStatsResponse.Fields#lastUpdatedTimeMillis
     */
    public GetTimeseriesAggregatedStatsResponse setLastUpdatedTimeMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimeMillis", DataTemplateUtil.coerceLongInput(value));
        _lastUpdatedTimeMillisField = value;
        return this;
    }

    @Override
    public GetTimeseriesAggregatedStatsResponse clone()
        throws CloneNotSupportedException
    {
        GetTimeseriesAggregatedStatsResponse __clone = ((GetTimeseriesAggregatedStatsResponse) super.clone());
        __clone.__changeListener = new GetTimeseriesAggregatedStatsResponse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GetTimeseriesAggregatedStatsResponse copy()
        throws CloneNotSupportedException
    {
        GetTimeseriesAggregatedStatsResponse __copy = ((GetTimeseriesAggregatedStatsResponse) super.copy());
        __copy._filterField = null;
        __copy._aspectNameField = null;
        __copy._entityNameField = null;
        __copy._groupingBucketsField = null;
        __copy._lastUpdatedTimeMillisField = null;
        __copy._aggregationSpecsField = null;
        __copy._tableField = null;
        __copy.__changeListener = new GetTimeseriesAggregatedStatsResponse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GetTimeseriesAggregatedStatsResponse __objectRef;

        private ChangeListener(GetTimeseriesAggregatedStatsResponse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "aspectName":
                    __objectRef._aspectNameField = null;
                    break;
                case "entityName":
                    __objectRef._entityNameField = null;
                    break;
                case "groupingBuckets":
                    __objectRef._groupingBucketsField = null;
                    break;
                case "lastUpdatedTimeMillis":
                    __objectRef._lastUpdatedTimeMillisField = null;
                    break;
                case "aggregationSpecs":
                    __objectRef._aggregationSpecsField = null;
                    break;
                case "table":
                    __objectRef._tableField = null;
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
         * Input param entityName
         * 
         */
        public PathSpec entityName() {
            return new PathSpec(getPathComponents(), "entityName");
        }

        /**
         * Input param aspectName
         * 
         */
        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        /**
         * Input param filter.
         * 
         */
        public com.linkedin.metadata.query.filter.Filter.Fields filter() {
            return new com.linkedin.metadata.query.filter.Filter.Fields(getPathComponents(), "filter");
        }

        /**
         * Input param aggregated metrics.
         * 
         */
        public com.linkedin.timeseries.AggregationSpecArray.Fields aggregationSpecs() {
            return new com.linkedin.timeseries.AggregationSpecArray.Fields(getPathComponents(), "aggregationSpecs");
        }

        /**
         * Input param aggregated metrics.
         * 
         */
        public PathSpec aggregationSpecs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aggregationSpecs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Input param groupingBuckets
         * 
         */
        public com.linkedin.timeseries.GroupingBucketArray.Fields groupingBuckets() {
            return new com.linkedin.timeseries.GroupingBucketArray.Fields(getPathComponents(), "groupingBuckets");
        }

        /**
         * Input param groupingBuckets
         * 
         */
        public PathSpec groupingBuckets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groupingBuckets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The results table.
         * 
         */
        public com.linkedin.timeseries.GenericTable.Fields table() {
            return new com.linkedin.timeseries.GenericTable.Fields(getPathComponents(), "table");
        }

        /**
         * When the index was last updated.
         * 
         */
        public PathSpec lastUpdatedTimeMillis() {
            return new PathSpec(getPathComponents(), "lastUpdatedTimeMillis");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.filter.Filter.ProjectionMask _filterMask;
        private com.linkedin.timeseries.AggregationSpecArray.ProjectionMask _aggregationSpecsMask;
        private com.linkedin.timeseries.GroupingBucketArray.ProjectionMask _groupingBucketsMask;
        private com.linkedin.timeseries.GenericTable.ProjectionMask _tableMask;

        ProjectionMask() {
            super(10);
        }

        /**
         * Input param entityName
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withEntityName() {
            getDataMap().put("entityName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input param aspectName
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withAspectName() {
            getDataMap().put("aspectName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input param filter.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withFilter(Function<com.linkedin.metadata.query.filter.Filter.ProjectionMask, com.linkedin.metadata.query.filter.Filter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?Filter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * Input param filter.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withFilter(MaskMap nestedMask) {
            getDataMap().put("filter", nestedMask.getDataMap());
            return this;
        }

        /**
         * Input param filter.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input param aggregated metrics.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withAggregationSpecs(Function<com.linkedin.timeseries.AggregationSpecArray.ProjectionMask, com.linkedin.timeseries.AggregationSpecArray.ProjectionMask> nestedMask) {
            _aggregationSpecsMask = nestedMask.apply(((_aggregationSpecsMask == null)?AggregationSpecArray.createMask():_aggregationSpecsMask));
            getDataMap().put("aggregationSpecs", _aggregationSpecsMask.getDataMap());
            return this;
        }

        /**
         * Input param aggregated metrics.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withAggregationSpecs() {
            _aggregationSpecsMask = null;
            getDataMap().put("aggregationSpecs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input param aggregated metrics.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withAggregationSpecs(Function<com.linkedin.timeseries.AggregationSpecArray.ProjectionMask, com.linkedin.timeseries.AggregationSpecArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aggregationSpecsMask = nestedMask.apply(((_aggregationSpecsMask == null)?AggregationSpecArray.createMask():_aggregationSpecsMask));
            getDataMap().put("aggregationSpecs", _aggregationSpecsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aggregationSpecs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aggregationSpecs").put("$count", count);
            }
            return this;
        }

        /**
         * Input param aggregated metrics.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withAggregationSpecs(Integer start, Integer count) {
            _aggregationSpecsMask = null;
            getDataMap().put("aggregationSpecs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aggregationSpecs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aggregationSpecs").put("$count", count);
            }
            return this;
        }

        /**
         * Input param groupingBuckets
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withGroupingBuckets(Function<com.linkedin.timeseries.GroupingBucketArray.ProjectionMask, com.linkedin.timeseries.GroupingBucketArray.ProjectionMask> nestedMask) {
            _groupingBucketsMask = nestedMask.apply(((_groupingBucketsMask == null)?GroupingBucketArray.createMask():_groupingBucketsMask));
            getDataMap().put("groupingBuckets", _groupingBucketsMask.getDataMap());
            return this;
        }

        /**
         * Input param groupingBuckets
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withGroupingBuckets() {
            _groupingBucketsMask = null;
            getDataMap().put("groupingBuckets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input param groupingBuckets
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withGroupingBuckets(Function<com.linkedin.timeseries.GroupingBucketArray.ProjectionMask, com.linkedin.timeseries.GroupingBucketArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _groupingBucketsMask = nestedMask.apply(((_groupingBucketsMask == null)?GroupingBucketArray.createMask():_groupingBucketsMask));
            getDataMap().put("groupingBuckets", _groupingBucketsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("groupingBuckets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groupingBuckets").put("$count", count);
            }
            return this;
        }

        /**
         * Input param groupingBuckets
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withGroupingBuckets(Integer start, Integer count) {
            _groupingBucketsMask = null;
            getDataMap().put("groupingBuckets", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groupingBuckets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groupingBuckets").put("$count", count);
            }
            return this;
        }

        /**
         * The results table.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withTable(Function<com.linkedin.timeseries.GenericTable.ProjectionMask, com.linkedin.timeseries.GenericTable.ProjectionMask> nestedMask) {
            _tableMask = nestedMask.apply(((_tableMask == null)?GenericTable.createMask():_tableMask));
            getDataMap().put("table", _tableMask.getDataMap());
            return this;
        }

        /**
         * The results table.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withTable(MaskMap nestedMask) {
            getDataMap().put("table", nestedMask.getDataMap());
            return this;
        }

        /**
         * The results table.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withTable() {
            _tableMask = null;
            getDataMap().put("table", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * When the index was last updated.
         * 
         */
        public GetTimeseriesAggregatedStatsResponse.ProjectionMask withLastUpdatedTimeMillis() {
            getDataMap().put("lastUpdatedTimeMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
