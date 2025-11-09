
package com.linkedin.assertion;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.StringMap;


/**
 * Information about an assertion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionInfo.pdl.")
public class AssertionInfo
    extends RecordTemplate
{

    private final static AssertionInfo.Fields _fields = new AssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("namespace com.linkedin.assertion/**Information about an assertion*/@Aspect.name=\"assertionInfo\"record AssertionInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Type of assertion. Assertion types can evolve to span Datasets, Flows (Pipelines), Models, Features etc.*/@Searchable={}type:enum AssertionType{/**A single-dataset assertion.\nWhen this is the value, the datasetAssertion field will be populated.*/DATASET/**A freshness assertion, or an assertion which indicates when a particular operation should occur\nto an asset.*/FRESHNESS/**A volume assertion, or an assertion which indicates how much data should be available for a\nparticular asset.*/VOLUME/**A raw SQL-statement based assertion*/SQL/**A structured assertion targeting a specific column or field of the Dataset.*/FIELD/**A schema or structural assertion.\n\nWould have named this SCHEMA but the codegen for PDL does not allow this (reserved word).*/DATA_SCHEMA/**A custom assertion. \nWhen this is the value, the customAssertion field will be populated.\nUse this assertion type when the exact type of assertion is not modeled in DataHub or\nas a starting point when integrating third-party data quality tools.*/CUSTOM}/**A Dataset Assertion definition. This field is populated when the type is DATASET.*/datasetAssertion:optional/**Attributes that are applicable to single-Dataset Assertions\n*/record DatasetAssertionInfo{/**The dataset targeted by this assertion.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}dataset:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Scope of the Assertion. What part of the dataset does this assertion apply to?\n*/@Searchable={}scope:enum DatasetAssertionScope{/**This assertion applies to dataset column(s)*/DATASET_COLUMN/**This assertion applies to entire rows of the dataset*/DATASET_ROWS/**This assertion applies to the storage size of the dataset*/DATASET_STORAGE_SIZE/**This assertion applies to the schema of the dataset*/DATASET_SCHEMA/**The scope of the assertion is unknown*/UNKNOWN}/**One or more dataset schema fields that are targeted by this assertion.\n\nThis field is expected to be provided if the assertion scope is DATASET_COLUMN.*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Asserts\"}@Searchable.`/*`.fieldType=\"URN\"fields:optional array[com.linkedin.common.Urn]/**Standardized assertion operator\nThis field is left blank if there is no selected aggregation or metric for a particular column.*/@Searchable={}aggregation:optional/**The function that is applied to the aggregation input (schema, rows, column values) before evaluating an operator.*/enum AssertionStdAggregation{/**Assertion is applied on number of rows.*/ROW_COUNT/**Assertion is applied on all columns.*/COLUMNS/**Assertion is applied on number of columns.*/COLUMN_COUNT/**Assertion is applied on individual column value. (No aggregation)*/IDENTITY/**Assertion is applied on column mean*/MEAN/**Assertion is applied on column median*/MEDIAN/**Assertion is applied on number of distinct values in column*/UNIQUE_COUNT/**Assertion is applied on proportion of distinct values in column*/UNIQUE_PROPORTION/**Assertion is applied on proportion of distinct values in column\n\nDeprecated! Use UNIQUE_PROPORTION instead.*/UNIQUE_PROPOTION/**Assertion is applied on number of null values in column*/NULL_COUNT/**Assertion is applied on proportion of null values in column*/NULL_PROPORTION/**Assertion is applied on column std deviation*/STDDEV/**Assertion is applied on column min*/MIN/**Assertion is applied on column std deviation*/MAX/**Assertion is applied on column sum*/SUM/**Other*/_NATIVE_}/**Standardized assertion operator*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}/**Native assertion type*/nativeType:optional string/**Native parameters required for the assertion.*/nativeParameters:optional map[string,string]logic:optional string}/**An Freshness Assertion definition. This field is populated when the type is FRESHNESS.*/freshnessAssertion:optional/**Attributes defining a Freshness Assertion.\n*/record FreshnessAssertionInfo{/**The type of the freshness assertion being monitored.*/@Searchable={}type:enum FreshnessAssertionType{/**An Freshness based on Operations performed on a particular Dataset (insert, update, delete, etc) and sourced from an audit log, as\nopposed to based on the highest watermark in a timestamp column (e.g. a query). Only valid when entity is of type \"dataset\".*/DATASET_CHANGE/**An Freshness based on a successful execution of a Data Job.*/DATA_JOB_RUN}/**The entity targeted by this Freshness check.*/@Relationship={\"entityTypes\":[\"dataset\",\"dataJob\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:com.linkedin.common.Urn/**Produce FAILURE Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.*/@Searchable.`/type`.fieldName=\"scheduleType\"schedule:/**Attributes defining a single Freshness schedule.*/record FreshnessAssertionSchedule{/**The type of a Freshness Assertion Schedule.\n\nOnce we support data-time-relative schedules (e.g. schedules relative to time partitions),\nwe will add those schedule types here.*/type:enum FreshnessAssertionScheduleType{/**A highly configurable recurring schedule which describes the times of events described\nby a CRON schedule, with the evaluation schedule assuming to be matching the cron schedule.\n\nIn a CRON schedule type, we compute the look-back window to be the time between the last scheduled event\nand the current event (evaluation time). This means that the evaluation schedule must match exactly\nthe schedule defined inside the cron schedule.\n\nFor example, a CRON schedule defined as \"0 8 * * *\" would represent a schedule of \"every day by 8am\". Assuming\nthat the assertion evaluation schedule is defined to match this, the freshness assertion would be evaluated in the following way:\n\n    1. Compute the \"last scheduled occurrence\" of the event using the CRON schedule. For example, yesterday at 8am.\n    2. Compute the bounds of a time window between the \"last scheduled occurrence\" (yesterday at 8am) until the \"current occurrence\" (today at 8am)\n    3. Verify that the target event has occurred within the CRON-interval window.\n    4. If the target event has occurred within the time window, then assertion passes.\n    5. If the target event has not occurred within the time window, then the assertion fails.\n*/CRON/**A fixed interval which is used to compute a look-back window for use when evaluating the assertion relative\nto the Evaluation Time of the Assertion.\n\nTo compute the valid look-back window, we subtract the fixed interval from the evaluation time. Then, we verify\nthat the target event has occurred within that window.\n\nFor example, a fixed interval of \"24h\" would represent a schedule of \"in the last 24 hours\".\nThe 24 hour interval is relative to the evaluation time of the assertion. For example if we schedule the assertion\nto be evaluated each hour, we'd compute the result as follows:\n\n    1. Subtract the fixed interval from the current time (Evaluation time) to compute the bounds of a fixed look-back window.\n    2. Verify that the target event has occurred within the look-back window.\n    3. If the target event has occurred within the time window, then assertion passes.\n    4. If the target event has not occurred within the time window, then the assertion fails.\n*/FIXED_INTERVAL/**A stateful check that takes the last time this check ran to determine the look-back window.\n\nTo compute the valid look-back- window, we start at the time the monitor last evaluated this assertion,\nand we end at the point in time the check is currently running.\n\nFor example, let's say a Freshness assertion is of type SINCE_THE_LAST_CHECK, and the monitor is configured to\nrun every day at 12:00am. Let's assume this assertion was last evaluated yesterday at 12:04am. We'd compute\nthe result as follows:\n\n    1. Get the timestamp for the last run of the monitor on this assertion.\n    2. look_back_window_start_time = latest_monitor_run.timestampMillis [ie. 12:04a yesterday]\n    3. look_back_window_end_time = nowMillis [ie. 12:02a today]\n    4. If the target event has occurred within the window [ie. 12:04a yday to 12:02a today],\n       then the assertion passes.\n    5. If the target event has not occurred within the window, then the assertion fails.\n*/SINCE_THE_LAST_CHECK}/**A cron schedule. This field is required when type is CRON.*/cron:optional/**Attributes defining a CRON-formatted schedule used for defining a freshness assertion.*/record FreshnessCronSchedule{/**A cron-formatted execution interval, as a cron string, e.g. 1 * * * **/cron:string/**Timezone in which the cron interval applies, e.g. America/Los Angeles*/timezone:string/**An optional offset in milliseconds to SUBTRACT from the timestamp generated by the cron schedule\nto generate the lower bounds of the \"freshness window\", or the window of time in which an event must have occurred in order for the Freshness check\nto be considering passing.\n\nIf left empty, the start of the SLA window will be the _end_ of the previously evaluated Freshness window.*/windowStartOffsetMs:optional long}/**A fixed interval schedule. This field is required when type is FIXED_INTERVAL.*/fixedInterval:optional/**Attributes defining a relative fixed interval SLA schedule.*/record FixedIntervalSchedule includes{namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}{}}/**A definition of the specific filters that should be applied, when performing monitoring.\nIf not provided, there is no filter, and the full table is under consideration.*/filter:optional{namespace com.linkedin.dataset/**A definition of filters that should be used when\nquerying an external Dataset or Table.\n\nNote that this models should NOT be used for working with\nsearch / filter on DataHub Platform itself.*/record DatasetFilter{/**How the partition will be represented in this model.\n\nIn the future, we'll likely add support for more structured\npredicates.*/type:enum DatasetFilterType{/**The partition is represented as a an opaque, raw SQL\nclause.*/SQL}/**The raw where clause string which will be used for monitoring.\nRequired if the type is SQL.*/sql:optional string}}}/**An Volume Assertion definition. This field is populated when the type is VOLUME.*/volumeAssertion:optional/**Attributes defining a dataset Volume Assertion*/record VolumeAssertionInfo{/**The type of the volume assertion being monitored.*/@Searchable={}type:enum VolumeAssertionType{/**A volume assertion that is evaluated against the total row count of a dataset.*/ROW_COUNT_TOTAL/**A volume assertion that is evaluated against an incremental row count of a dataset,\nor a row count change.*/ROW_COUNT_CHANGE/**A volume assertion that checks the latest \"segment\" in a table based on an incrementing\ncolumn to check whether it's row count falls into a particular range.\n\nThis can be used to monitor the row count of an incrementing date-partition column segment.*/INCREMENTING_SEGMENT_ROW_COUNT_TOTAL/**A volume assertion that compares the row counts in neighboring \"segments\" or \"partitions\"\nof an incrementing column.\nThis can be used to track changes between subsequent date partition\nin a table, for example.*/INCREMENTING_SEGMENT_ROW_COUNT_CHANGE}/**The entity targeted by this Volume check.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:com.linkedin.common.Urn/**Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.\nRequired if type is 'ROW_COUNT_TOTAL'*/rowCountTotal:optional/**Attributes defining a ROW_COUNT_TOTAL volume assertion.*/record RowCountTotal{/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**Produce FAILURE Assertion Result if the delta row count of the asset does not meet specific requirements\nwithin a given period of time.\nRequired if type is 'ROW_COUNT_CHANGE'*/rowCountChange:optional/**Attributes defining a ROW_COUNT_CHANGE volume assertion.*/record RowCountChange{/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.*/type:/**An enum to represent a type of change in an assertion value, metric, or measurement.*/enum AssertionValueChangeType{/**A change that is defined in absolute terms.*/ABSOLUTE/**A change that is defined in relative terms using percentage change\nfrom the original value.*/PERCENTAGE}/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**Produce FAILURE Assertion Result if the asset's latest incrementing segment row count total\ndoes not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'*/incrementingSegmentRowCountTotal:optional/**Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_TOTAL volume assertion.*/record IncrementingSegmentRowCountTotal{/**A specification of how the 'segment' can be derived using a column and an optional transformer function.*/segment:/**Core attributes required to identify an incrementing segment in a table. This type is mainly useful\nfor tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)\n\nAn incrementing segment represents a logical chunk of data which is INSERTED\ninto a dataset on a regular interval, along with the presence of a constantly-incrementing column\nvalue such as an event time, date partition, or last modified column.\n\nAn incrementing segment is principally identified by 2 key attributes combined:\n\n 1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.\n    Note that the value of this column may not by itself represent the \"bucket\" or the \"segment\" in which the row falls.\n\n 2. [Optional] An transformer function that may be applied to the selected column value in order\n    to obtain the final \"segment identifier\" or \"bucket identifier\". Rows that have the same value after applying the transformation\n    will be grouped into the same segment, using which the final value (e.g. row count) will be determined.*/record IncrementingSegmentSpec{/**The field to use to generate segments. It must be constantly incrementing as new rows are inserted.*/field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.\nIf not provided, then no operator will be applied to the field. (identity function)*/transformer:optional/**The definition of the transformer function  that should be applied to a given field / column value in a dataset\nin order to determine the segment or bucket that it belongs to, which in turn is used to evaluate\nvolume assertions.*/record IncrementingSegmentFieldTransformer{/**A 'standard' transformer type. Note that not all source systems will support all operators.*/type:enum IncrementingSegmentFieldTransformerType{/**Rounds a timestamp (in seconds) down to the start of the month.*/TIMESTAMP_MS_TO_MINUTE/**Rounds a timestamp (in milliseconds) down to the nearest hour.*/TIMESTAMP_MS_TO_HOUR/**Rounds a timestamp (in milliseconds) down to the start of the day.*/TIMESTAMP_MS_TO_DATE/**Rounds a timestamp (in milliseconds) down to the start of the month*/TIMESTAMP_MS_TO_MONTH/**Rounds a timestamp (in milliseconds) down to the start of the year*/TIMESTAMP_MS_TO_YEAR/**Rounds a numeric value down to the nearest integer.*/FLOOR/**Rounds a numeric value up to the nearest integer.*/CEILING/**A backdoor to provide a native operator type specific to a given source system like\nSnowflake, Redshift, BQ, etc.*/NATIVE}/**The 'native' transformer type, useful as a back door if a custom operator is required.\nThis field is required if the type is NATIVE.*/nativeType:optional string}}/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**Produce FAILURE Assertion Result if the asset's incrementing segment row count delta\ndoes not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'*/incrementingSegmentRowCountChange:optional/**Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.*/record IncrementingSegmentRowCountChange{/**A specification of how the 'segment' can be derived using a column and an optional transformer function.*/segment:IncrementingSegmentSpec/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.*/type:AssertionValueChangeType/**The operator you'd like to apply to the row count value\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**A definition of the specific filters that should be applied, when performing monitoring.\nIf not provided, there is no filter, and the full table is under consideration.*/filter:optional com.linkedin.dataset.DatasetFilter}/**A SQL Assertion definition. This field is populated when the type is SQL.*/sqlAssertion:optional/**Attributes defining a SQL Assertion*/record SqlAssertionInfo{/**The type of the SQL assertion being monitored.*/@Searchable={}type:enum SqlAssertionType{/**A SQL Metric Assertion, e.g. one based on a numeric value returned by an arbitrary SQL query.*/METRIC/**A SQL assertion that is evaluated against the CHANGE in a metric assertion\nover time.*/METRIC_CHANGE}/**The entity targeted by this SQL check.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:com.linkedin.common.Urn/**The SQL statement to be executed when evaluating the assertion (or computing the metric).\nThis should be a valid and complete statement, executable by itself.\n\nUsually this should be a SELECT query statement.*/statement:string/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.\nThis value is required if the type is METRIC_CHANGE.*/changeType:optional AssertionValueChangeType/**The operator you'd like to apply to the result of the SQL query.\n\nNote that at this time, only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**A Field Assertion definition. This field is populated when the type is FIELD.*/fieldAssertion:optional/**Attributes defining a Field Assertion.\n*/record FieldAssertionInfo{/**The type of the field assertion being monitored.*/@Searchable={}type:enum FieldAssertionType{/**An assertion used to validate the values contained with a field / column given a set of rows.*/FIELD_VALUES/**An assertion used to validate the value of a common field / column metric (e.g. aggregation) such as null count + percentage,\nmin, max, median, and more.*/FIELD_METRIC}/**The entity targeted by this Field check.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:com.linkedin.common.Urn/**The definition of an assertion that validates individual values of a field / column for a set of rows.\nThis type of assertion verifies that each column value meets a particular requirement.*/fieldValuesAssertion:optional/**Attributes defining a field values assertion, which asserts that the values for a field / column\nof a dataset / table matches a set of expectations.\n\nIn other words, this type of assertion acts as a semantic constraint applied to fields for a specific column.\n\nTODO: We should display the \"failed row count\" to the user if the column fails the verification rules.\nTODO: Determine whether we need an \"operator\" that can be applied to the field.*/record FieldValuesAssertion{/**The field under evaluation*/@Searchable.`/path`.fieldName=\"fieldPath\"field:com.linkedin.schema.SchemaFieldSpec/**An optional transform to apply to field values\nbefore evaluating the operator.\n\nIf none is applied, the field value will be compared as is.*/transform:optional/**Definition of a transform applied to the values of a column / field.\nNote that the applicability of a field transform ultimately depends on the native type\nof the field / column.\n\nModel has single field to permit extension.*/record FieldTransform{/**The type of the field transform, e.g. the transformation\nfunction / operator to apply.*/type:enum FieldTransformType{/**Obtain the length of a string field / column (applicable to string types)*/LENGTH}}/**The predicate to evaluate against a single value of the field.\nDepending on the operator, parameters may be required in order to successfully\nevaluate the assertion against the field value.*/operator:AssertionStdOperator/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional AssertionStdParameters/**Additional customization about when the assertion\nshould be officially considered failing.*/failThreshold:record FieldValuesFailThreshold{/**The type of failure threshold. Either based on the number\nof column values (rows) that fail the expectations, or the percentage\nof the total rows under consideration.*/type:enum FieldValuesFailThresholdType{COUNT,PERCENTAGE}=\"COUNT\"/**By default this is 0, meaning that ALL column values (i.e. rows) must\nmeet the defined expectations.*/value:long=0}/**Whether to ignore or allow nulls when running the values assertion. (i.e.\nconsider only non-null values) using operators OTHER than the IS_NULL operator.\n\nDefaults to true, allowing null values.*/excludeNulls:boolean=true}/**The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.\nThis type of assertion verifies that the value of a high-level metric obtained by aggregating over a column meets\nexpectations*/fieldMetricAssertion:optional/**Attributes defining a field metric assertion, which asserts an expectation against\na common metric derived from the set of field / column values, for example:\nmax, min, median, null count, null percentage, unique count, unique percentage, and more.*/record FieldMetricAssertion{/**The field under evaluation*/@Searchable.`/path`.fieldName=\"fieldPath\"field:com.linkedin.schema.SchemaFieldSpec/**The specific metric to assert against. This is the value that\nwill be obtained by applying a standard operation, such as an aggregation,\nto the selected field.*/metric:/**A standard metric that can be derived from the set of values\nfor a specific field / column of a dataset / table.*/enum FieldMetricType{/**The number of unique values found in the column value set*/UNIQUE_COUNT/**The percentage of unique values to total rows for the dataset*/UNIQUE_PERCENTAGE/**The number of null values found in the column value set*/NULL_COUNT/**The percentage of null values to total rows for the dataset*/NULL_PERCENTAGE/**The minimum value in the column set (applies to numeric columns)*/MIN/**The maximum value in the column set (applies to numeric columns)*/MAX/**The mean length found in the column set (applies to numeric columns)*/MEAN/**The median length found in the column set (applies to numeric columns)*/MEDIAN/**The stddev length found in the column set (applies to numeric columns)*/STDDEV/**The number of negative values found in the value set (applies to numeric columns)*/NEGATIVE_COUNT/**The percentage of negative values to total rows for the dataset (applies to numeric columns)*/NEGATIVE_PERCENTAGE/**The number of zero values found in the value set (applies to numeric columns)*/ZERO_COUNT/**The percentage of zero values to total rows for the dataset (applies to numeric columns)*/ZERO_PERCENTAGE/**The minimum length found in the column set (applies to string columns)*/MIN_LENGTH/**The maximum length found in the column set (applies to string columns)*/MAX_LENGTH/**The number of empty string values found in the value set (applies to string columns).\nNote: This is a completely different metric different from NULL_COUNT!*/EMPTY_COUNT/**The percentage of empty string values to total rows for the dataset (applies to string columns)\nNote: This is a completely different metric different from NULL_PERCENTAGE!*/EMPTY_PERCENTAGE}/**The predicate to evaluate against the metric for the field / column.\nDepending on the operator, parameters may be required in order to successfully\nevaluate the assertion against the metric value.*/operator:AssertionStdOperator/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional AssertionStdParameters}/**A definition of the specific filters that should be applied, when performing monitoring.\nIf not provided, there is no filter, and the full table is under consideration.\nIf using DataHub Dataset Profiles as the assertion source type, the value of this field will be ignored.*/filter:optional com.linkedin.dataset.DatasetFilter}/**An schema Assertion definition. This field is populated when the type is DATA_SCHEMA*/schemaAssertion:optional/**Attributes that are applicable to schema assertions\n*/record SchemaAssertionInfo{/**The entity targeted by the assertion*/@Relationship={\"entityTypes\":[\"dataset\",\"dataJob\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:com.linkedin.common.Urn/**A definition of the expected structure for the asset\n\nNote that many of the fields of this model, especially those related to metadata (tags, terms)\nwill go unused in this context.*/schema:{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a pa").append("rticular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Dataset this schema metadata is associated with.*/dataset:optional{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}}/**The required compatibility level for the schema assertion to pass.*/compatibility:optional enum SchemaAssertionCompatibility{/**The actual schema must be exactly the same as the expected schema*/EXACT_MATCH/**The actual schema must be a superset of the expected schema*/SUPERSET/**The actual schema must be a subset of the expected schema*/SUBSET}=\"EXACT_MATCH\"}/**A Custom Assertion definition. This field is populated when type is CUSTOM.*/customAssertion:optional/**Attributes that are applicable to Custom Assertions\n*/record CustomAssertionInfo{/**The type of custom assertion.\nThis is how your assertion will appear categorized in DataHub UI. */@Searchable.fieldName=\"customType\"type:string/**The entity targeted by this assertion.\nThis can have support more entityTypes (e.g. dataJob) in future*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}entity:com.linkedin.common.Urn/**dataset schema field targeted by this assertion.\n\nThis field is expected to be provided if the assertion is on dataset field*/@Relationship={\"entityTypes\":[\"schemaField\"],\"name\":\"Asserts\"}field:optional com.linkedin.common.Urn,logic:optional string}/**The source or origin of the Assertion definition.\n\nIf the source type of the Assertion is EXTERNAL, it is expected to have a corresponding dataPlatformInstance aspect detailing\nthe platform where it was ingested from.*/source:optional/**The source of an assertion*/record AssertionSource{/**The type of the Assertion Source*/@Searchable.fieldName=\"sourceType\"type:enum AssertionSourceType{/**The assertion was defined natively on DataHub by a user.\nDataHub Cloud only*/NATIVE/**The assertion was defined and managed externally of DataHub.*/EXTERNAL/**The assertion was inferred, e.g. from offline AI / ML models.\nDataHub Cloud only*/INFERRED}/**The time at which the assertion was initially created and the author who created it.\nThis field is only present for Native assertions created after this field was introduced.*/created:optional com.linkedin.common.AuditStamp}/**The time at which the assertion was last updated and the actor who updated it.\nThis field is only present for Native assertions updated after this field was introduced.*/lastUpdated:optional com.linkedin.common.AuditStamp/**An optional human-readable description of the assertion*/description:optional string}").toString(), SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private AssertionType _typeField = null;
    private DatasetAssertionInfo _datasetAssertionField = null;
    private FreshnessAssertionInfo _freshnessAssertionField = null;
    private VolumeAssertionInfo _volumeAssertionField = null;
    private SqlAssertionInfo _sqlAssertionField = null;
    private FieldAssertionInfo _fieldAssertionField = null;
    private SchemaAssertionInfo _schemaAssertionField = null;
    private CustomAssertionInfo _customAssertionField = null;
    private AssertionSource _sourceField = null;
    private AuditStamp _lastUpdatedField = null;
    private String _descriptionField = null;
    private AssertionInfo.ChangeListener __changeListener = new AssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_DatasetAssertion = SCHEMA.getField("datasetAssertion");
    private final static RecordDataSchema.Field FIELD_FreshnessAssertion = SCHEMA.getField("freshnessAssertion");
    private final static RecordDataSchema.Field FIELD_VolumeAssertion = SCHEMA.getField("volumeAssertion");
    private final static RecordDataSchema.Field FIELD_SqlAssertion = SCHEMA.getField("sqlAssertion");
    private final static RecordDataSchema.Field FIELD_FieldAssertion = SCHEMA.getField("fieldAssertion");
    private final static RecordDataSchema.Field FIELD_SchemaAssertion = SCHEMA.getField("schemaAssertion");
    private final static RecordDataSchema.Field FIELD_CustomAssertion = SCHEMA.getField("customAssertion");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_LastUpdated = SCHEMA.getField("lastUpdated");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public AssertionInfo() {
        super(new DataMap(), SCHEMA, 14);
        addChangeListener(__changeListener);
    }

    public AssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionInfo.Fields fields() {
        return _fields;
    }

    public static AssertionInfo.ProjectionMask createMask() {
        return new AssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see AssertionInfo.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see AssertionInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see AssertionInfo.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionInfo.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see AssertionInfo.Fields#customProperties
     */
    public AssertionInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.assertion.AssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#customProperties
     */
    public AssertionInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see AssertionInfo.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        if (_externalUrlField!= null) {
            return true;
        }
        return super._map.containsKey("externalUrl");
    }

    /**
     * Remover for externalUrl
     * 
     * @see AssertionInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see AssertionInfo.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return getExternalUrl();
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        if (_externalUrlField!= null) {
            return _externalUrlField;
        } else {
            Object __rawValue = super._map.get("externalUrl");
            _externalUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _externalUrlField;
        }
    }

    /**
     * Setter for externalUrl
     * 
     * @see AssertionInfo.Fields#externalUrl
     */
    public AssertionInfo setExternalUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#externalUrl
     */
    public AssertionInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see AssertionInfo.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see AssertionInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see AssertionInfo.Fields#type
     */
    @Nullable
    public AssertionType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionType.class, AssertionType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionInfo.Fields#type
     */
    @Nonnull
    public AssertionType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionType.class, AssertionType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see AssertionInfo.Fields#type
     */
    public AssertionInfo setType(
        @Nullable
        AssertionType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.AssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#type
     */
    public AssertionInfo setType(
        @Nonnull
        AssertionType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for datasetAssertion
     * 
     * @see AssertionInfo.Fields#datasetAssertion
     */
    public boolean hasDatasetAssertion() {
        if (_datasetAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("datasetAssertion");
    }

    /**
     * Remover for datasetAssertion
     * 
     * @see AssertionInfo.Fields#datasetAssertion
     */
    public void removeDatasetAssertion() {
        super._map.remove("datasetAssertion");
    }

    /**
     * Getter for datasetAssertion
     * 
     * @see AssertionInfo.Fields#datasetAssertion
     */
    @Nullable
    public DatasetAssertionInfo getDatasetAssertion(GetMode mode) {
        return getDatasetAssertion();
    }

    /**
     * Getter for datasetAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#datasetAssertion
     */
    @Nullable
    public DatasetAssertionInfo getDatasetAssertion() {
        if (_datasetAssertionField!= null) {
            return _datasetAssertionField;
        } else {
            Object __rawValue = super._map.get("datasetAssertion");
            _datasetAssertionField = ((__rawValue == null)?null:new DatasetAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _datasetAssertionField;
        }
    }

    /**
     * Setter for datasetAssertion
     * 
     * @see AssertionInfo.Fields#datasetAssertion
     */
    public AssertionInfo setDatasetAssertion(
        @Nullable
        DatasetAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDatasetAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDatasetAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "datasetAssertion", value.data());
                    _datasetAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "datasetAssertion", value.data());
                    _datasetAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for datasetAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#datasetAssertion
     */
    public AssertionInfo setDatasetAssertion(
        @Nonnull
        DatasetAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field datasetAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "datasetAssertion", value.data());
            _datasetAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for freshnessAssertion
     * 
     * @see AssertionInfo.Fields#freshnessAssertion
     */
    public boolean hasFreshnessAssertion() {
        if (_freshnessAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("freshnessAssertion");
    }

    /**
     * Remover for freshnessAssertion
     * 
     * @see AssertionInfo.Fields#freshnessAssertion
     */
    public void removeFreshnessAssertion() {
        super._map.remove("freshnessAssertion");
    }

    /**
     * Getter for freshnessAssertion
     * 
     * @see AssertionInfo.Fields#freshnessAssertion
     */
    @Nullable
    public FreshnessAssertionInfo getFreshnessAssertion(GetMode mode) {
        return getFreshnessAssertion();
    }

    /**
     * Getter for freshnessAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#freshnessAssertion
     */
    @Nullable
    public FreshnessAssertionInfo getFreshnessAssertion() {
        if (_freshnessAssertionField!= null) {
            return _freshnessAssertionField;
        } else {
            Object __rawValue = super._map.get("freshnessAssertion");
            _freshnessAssertionField = ((__rawValue == null)?null:new FreshnessAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _freshnessAssertionField;
        }
    }

    /**
     * Setter for freshnessAssertion
     * 
     * @see AssertionInfo.Fields#freshnessAssertion
     */
    public AssertionInfo setFreshnessAssertion(
        @Nullable
        FreshnessAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFreshnessAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFreshnessAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "freshnessAssertion", value.data());
                    _freshnessAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "freshnessAssertion", value.data());
                    _freshnessAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for freshnessAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#freshnessAssertion
     */
    public AssertionInfo setFreshnessAssertion(
        @Nonnull
        FreshnessAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field freshnessAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "freshnessAssertion", value.data());
            _freshnessAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for volumeAssertion
     * 
     * @see AssertionInfo.Fields#volumeAssertion
     */
    public boolean hasVolumeAssertion() {
        if (_volumeAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("volumeAssertion");
    }

    /**
     * Remover for volumeAssertion
     * 
     * @see AssertionInfo.Fields#volumeAssertion
     */
    public void removeVolumeAssertion() {
        super._map.remove("volumeAssertion");
    }

    /**
     * Getter for volumeAssertion
     * 
     * @see AssertionInfo.Fields#volumeAssertion
     */
    @Nullable
    public VolumeAssertionInfo getVolumeAssertion(GetMode mode) {
        return getVolumeAssertion();
    }

    /**
     * Getter for volumeAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#volumeAssertion
     */
    @Nullable
    public VolumeAssertionInfo getVolumeAssertion() {
        if (_volumeAssertionField!= null) {
            return _volumeAssertionField;
        } else {
            Object __rawValue = super._map.get("volumeAssertion");
            _volumeAssertionField = ((__rawValue == null)?null:new VolumeAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _volumeAssertionField;
        }
    }

    /**
     * Setter for volumeAssertion
     * 
     * @see AssertionInfo.Fields#volumeAssertion
     */
    public AssertionInfo setVolumeAssertion(
        @Nullable
        VolumeAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVolumeAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVolumeAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "volumeAssertion", value.data());
                    _volumeAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "volumeAssertion", value.data());
                    _volumeAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for volumeAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#volumeAssertion
     */
    public AssertionInfo setVolumeAssertion(
        @Nonnull
        VolumeAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field volumeAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "volumeAssertion", value.data());
            _volumeAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for sqlAssertion
     * 
     * @see AssertionInfo.Fields#sqlAssertion
     */
    public boolean hasSqlAssertion() {
        if (_sqlAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("sqlAssertion");
    }

    /**
     * Remover for sqlAssertion
     * 
     * @see AssertionInfo.Fields#sqlAssertion
     */
    public void removeSqlAssertion() {
        super._map.remove("sqlAssertion");
    }

    /**
     * Getter for sqlAssertion
     * 
     * @see AssertionInfo.Fields#sqlAssertion
     */
    @Nullable
    public SqlAssertionInfo getSqlAssertion(GetMode mode) {
        return getSqlAssertion();
    }

    /**
     * Getter for sqlAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#sqlAssertion
     */
    @Nullable
    public SqlAssertionInfo getSqlAssertion() {
        if (_sqlAssertionField!= null) {
            return _sqlAssertionField;
        } else {
            Object __rawValue = super._map.get("sqlAssertion");
            _sqlAssertionField = ((__rawValue == null)?null:new SqlAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sqlAssertionField;
        }
    }

    /**
     * Setter for sqlAssertion
     * 
     * @see AssertionInfo.Fields#sqlAssertion
     */
    public AssertionInfo setSqlAssertion(
        @Nullable
        SqlAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSqlAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSqlAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sqlAssertion", value.data());
                    _sqlAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sqlAssertion", value.data());
                    _sqlAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sqlAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#sqlAssertion
     */
    public AssertionInfo setSqlAssertion(
        @Nonnull
        SqlAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sqlAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sqlAssertion", value.data());
            _sqlAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldAssertion
     * 
     * @see AssertionInfo.Fields#fieldAssertion
     */
    public boolean hasFieldAssertion() {
        if (_fieldAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("fieldAssertion");
    }

    /**
     * Remover for fieldAssertion
     * 
     * @see AssertionInfo.Fields#fieldAssertion
     */
    public void removeFieldAssertion() {
        super._map.remove("fieldAssertion");
    }

    /**
     * Getter for fieldAssertion
     * 
     * @see AssertionInfo.Fields#fieldAssertion
     */
    @Nullable
    public FieldAssertionInfo getFieldAssertion(GetMode mode) {
        return getFieldAssertion();
    }

    /**
     * Getter for fieldAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#fieldAssertion
     */
    @Nullable
    public FieldAssertionInfo getFieldAssertion() {
        if (_fieldAssertionField!= null) {
            return _fieldAssertionField;
        } else {
            Object __rawValue = super._map.get("fieldAssertion");
            _fieldAssertionField = ((__rawValue == null)?null:new FieldAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fieldAssertionField;
        }
    }

    /**
     * Setter for fieldAssertion
     * 
     * @see AssertionInfo.Fields#fieldAssertion
     */
    public AssertionInfo setFieldAssertion(
        @Nullable
        FieldAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldAssertion", value.data());
                    _fieldAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldAssertion", value.data());
                    _fieldAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#fieldAssertion
     */
    public AssertionInfo setFieldAssertion(
        @Nonnull
        FieldAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldAssertion", value.data());
            _fieldAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for schemaAssertion
     * 
     * @see AssertionInfo.Fields#schemaAssertion
     */
    public boolean hasSchemaAssertion() {
        if (_schemaAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("schemaAssertion");
    }

    /**
     * Remover for schemaAssertion
     * 
     * @see AssertionInfo.Fields#schemaAssertion
     */
    public void removeSchemaAssertion() {
        super._map.remove("schemaAssertion");
    }

    /**
     * Getter for schemaAssertion
     * 
     * @see AssertionInfo.Fields#schemaAssertion
     */
    @Nullable
    public SchemaAssertionInfo getSchemaAssertion(GetMode mode) {
        return getSchemaAssertion();
    }

    /**
     * Getter for schemaAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#schemaAssertion
     */
    @Nullable
    public SchemaAssertionInfo getSchemaAssertion() {
        if (_schemaAssertionField!= null) {
            return _schemaAssertionField;
        } else {
            Object __rawValue = super._map.get("schemaAssertion");
            _schemaAssertionField = ((__rawValue == null)?null:new SchemaAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _schemaAssertionField;
        }
    }

    /**
     * Setter for schemaAssertion
     * 
     * @see AssertionInfo.Fields#schemaAssertion
     */
    public AssertionInfo setSchemaAssertion(
        @Nullable
        SchemaAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaAssertion", value.data());
                    _schemaAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaAssertion", value.data());
                    _schemaAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#schemaAssertion
     */
    public AssertionInfo setSchemaAssertion(
        @Nonnull
        SchemaAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaAssertion", value.data());
            _schemaAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for customAssertion
     * 
     * @see AssertionInfo.Fields#customAssertion
     */
    public boolean hasCustomAssertion() {
        if (_customAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("customAssertion");
    }

    /**
     * Remover for customAssertion
     * 
     * @see AssertionInfo.Fields#customAssertion
     */
    public void removeCustomAssertion() {
        super._map.remove("customAssertion");
    }

    /**
     * Getter for customAssertion
     * 
     * @see AssertionInfo.Fields#customAssertion
     */
    @Nullable
    public CustomAssertionInfo getCustomAssertion(GetMode mode) {
        return getCustomAssertion();
    }

    /**
     * Getter for customAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#customAssertion
     */
    @Nullable
    public CustomAssertionInfo getCustomAssertion() {
        if (_customAssertionField!= null) {
            return _customAssertionField;
        } else {
            Object __rawValue = super._map.get("customAssertion");
            _customAssertionField = ((__rawValue == null)?null:new CustomAssertionInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customAssertionField;
        }
    }

    /**
     * Setter for customAssertion
     * 
     * @see AssertionInfo.Fields#customAssertion
     */
    public AssertionInfo setCustomAssertion(
        @Nullable
        CustomAssertionInfo value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customAssertion", value.data());
                    _customAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customAssertion", value.data());
                    _customAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#customAssertion
     */
    public AssertionInfo setCustomAssertion(
        @Nonnull
        CustomAssertionInfo value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customAssertion of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customAssertion", value.data());
            _customAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see AssertionInfo.Fields#source
     */
    public boolean hasSource() {
        if (_sourceField!= null) {
            return true;
        }
        return super._map.containsKey("source");
    }

    /**
     * Remover for source
     * 
     * @see AssertionInfo.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see AssertionInfo.Fields#source
     */
    @Nullable
    public AssertionSource getSource(GetMode mode) {
        return getSource();
    }

    /**
     * Getter for source
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#source
     */
    @Nullable
    public AssertionSource getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            _sourceField = ((__rawValue == null)?null:new AssertionSource(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see AssertionInfo.Fields#source
     */
    public AssertionInfo setSource(
        @Nullable
        AssertionSource value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#source
     */
    public AssertionInfo setSource(
        @Nonnull
        AssertionSource value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", value.data());
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastUpdated
     * 
     * @see AssertionInfo.Fields#lastUpdated
     */
    public boolean hasLastUpdated() {
        if (_lastUpdatedField!= null) {
            return true;
        }
        return super._map.containsKey("lastUpdated");
    }

    /**
     * Remover for lastUpdated
     * 
     * @see AssertionInfo.Fields#lastUpdated
     */
    public void removeLastUpdated() {
        super._map.remove("lastUpdated");
    }

    /**
     * Getter for lastUpdated
     * 
     * @see AssertionInfo.Fields#lastUpdated
     */
    @Nullable
    public AuditStamp getLastUpdated(GetMode mode) {
        return getLastUpdated();
    }

    /**
     * Getter for lastUpdated
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#lastUpdated
     */
    @Nullable
    public AuditStamp getLastUpdated() {
        if (_lastUpdatedField!= null) {
            return _lastUpdatedField;
        } else {
            Object __rawValue = super._map.get("lastUpdated");
            _lastUpdatedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastUpdatedField;
        }
    }

    /**
     * Setter for lastUpdated
     * 
     * @see AssertionInfo.Fields#lastUpdated
     */
    public AssertionInfo setLastUpdated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastUpdated(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastUpdated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
                    _lastUpdatedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
                    _lastUpdatedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastUpdated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#lastUpdated
     */
    public AssertionInfo setLastUpdated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastUpdated of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
            _lastUpdatedField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see AssertionInfo.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see AssertionInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see AssertionInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see AssertionInfo.Fields#description
     */
    public AssertionInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionInfo.Fields#description
     */
    public AssertionInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.assertion.AssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public AssertionInfo clone()
        throws CloneNotSupportedException
    {
        AssertionInfo __clone = ((AssertionInfo) super.clone());
        __clone.__changeListener = new AssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionInfo copy()
        throws CloneNotSupportedException
    {
        AssertionInfo __copy = ((AssertionInfo) super.copy());
        __copy._volumeAssertionField = null;
        __copy._fieldAssertionField = null;
        __copy._externalUrlField = null;
        __copy._schemaAssertionField = null;
        __copy._descriptionField = null;
        __copy._sourceField = null;
        __copy._typeField = null;
        __copy._lastUpdatedField = null;
        __copy._sqlAssertionField = null;
        __copy._customPropertiesField = null;
        __copy._datasetAssertionField = null;
        __copy._customAssertionField = null;
        __copy._freshnessAssertionField = null;
        __copy.__changeListener = new AssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionInfo __objectRef;

        private ChangeListener(AssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "volumeAssertion":
                    __objectRef._volumeAssertionField = null;
                    break;
                case "fieldAssertion":
                    __objectRef._fieldAssertionField = null;
                    break;
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "schemaAssertion":
                    __objectRef._schemaAssertionField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "lastUpdated":
                    __objectRef._lastUpdatedField = null;
                    break;
                case "sqlAssertion":
                    __objectRef._sqlAssertionField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "datasetAssertion":
                    __objectRef._datasetAssertionField = null;
                    break;
                case "customAssertion":
                    __objectRef._customAssertionField = null;
                    break;
                case "freshnessAssertion":
                    __objectRef._freshnessAssertionField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Type of assertion. Assertion types can evolve to span Datasets, Flows (Pipelines), Models, Features etc.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * A Dataset Assertion definition. This field is populated when the type is DATASET.
         * 
         */
        public com.linkedin.assertion.DatasetAssertionInfo.Fields datasetAssertion() {
            return new com.linkedin.assertion.DatasetAssertionInfo.Fields(getPathComponents(), "datasetAssertion");
        }

        /**
         * An Freshness Assertion definition. This field is populated when the type is FRESHNESS.
         * 
         */
        public com.linkedin.assertion.FreshnessAssertionInfo.Fields freshnessAssertion() {
            return new com.linkedin.assertion.FreshnessAssertionInfo.Fields(getPathComponents(), "freshnessAssertion");
        }

        /**
         * An Volume Assertion definition. This field is populated when the type is VOLUME.
         * 
         */
        public com.linkedin.assertion.VolumeAssertionInfo.Fields volumeAssertion() {
            return new com.linkedin.assertion.VolumeAssertionInfo.Fields(getPathComponents(), "volumeAssertion");
        }

        /**
         * A SQL Assertion definition. This field is populated when the type is SQL.
         * 
         */
        public com.linkedin.assertion.SqlAssertionInfo.Fields sqlAssertion() {
            return new com.linkedin.assertion.SqlAssertionInfo.Fields(getPathComponents(), "sqlAssertion");
        }

        /**
         * A Field Assertion definition. This field is populated when the type is FIELD.
         * 
         */
        public com.linkedin.assertion.FieldAssertionInfo.Fields fieldAssertion() {
            return new com.linkedin.assertion.FieldAssertionInfo.Fields(getPathComponents(), "fieldAssertion");
        }

        /**
         * An schema Assertion definition. This field is populated when the type is DATA_SCHEMA
         * 
         */
        public com.linkedin.assertion.SchemaAssertionInfo.Fields schemaAssertion() {
            return new com.linkedin.assertion.SchemaAssertionInfo.Fields(getPathComponents(), "schemaAssertion");
        }

        /**
         * A Custom Assertion definition. This field is populated when type is CUSTOM.
         * 
         */
        public com.linkedin.assertion.CustomAssertionInfo.Fields customAssertion() {
            return new com.linkedin.assertion.CustomAssertionInfo.Fields(getPathComponents(), "customAssertion");
        }

        /**
         * The source or origin of the Assertion definition.
         * 
         * If the source type of the Assertion is EXTERNAL, it is expected to have a corresponding dataPlatformInstance aspect detailing
         * the platform where it was ingested from.
         * 
         */
        public com.linkedin.assertion.AssertionSource.Fields source() {
            return new com.linkedin.assertion.AssertionSource.Fields(getPathComponents(), "source");
        }

        /**
         * The time at which the assertion was last updated and the actor who updated it.
         * This field is only present for Native assertions updated after this field was introduced.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastUpdated() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastUpdated");
        }

        /**
         * An optional human-readable description of the assertion
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.DatasetAssertionInfo.ProjectionMask _datasetAssertionMask;
        private com.linkedin.assertion.FreshnessAssertionInfo.ProjectionMask _freshnessAssertionMask;
        private com.linkedin.assertion.VolumeAssertionInfo.ProjectionMask _volumeAssertionMask;
        private com.linkedin.assertion.SqlAssertionInfo.ProjectionMask _sqlAssertionMask;
        private com.linkedin.assertion.FieldAssertionInfo.ProjectionMask _fieldAssertionMask;
        private com.linkedin.assertion.SchemaAssertionInfo.ProjectionMask _schemaAssertionMask;
        private com.linkedin.assertion.CustomAssertionInfo.ProjectionMask _customAssertionMask;
        private com.linkedin.assertion.AssertionSource.ProjectionMask _sourceMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastUpdatedMask;

        ProjectionMask() {
        }

        /**
         * Custom property bag.
         * 
         */
        public AssertionInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public AssertionInfo.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of assertion. Assertion types can evolve to span Datasets, Flows (Pipelines), Models, Features etc.
         * 
         */
        public AssertionInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A Dataset Assertion definition. This field is populated when the type is DATASET.
         * 
         */
        public AssertionInfo.ProjectionMask withDatasetAssertion(Function<com.linkedin.assertion.DatasetAssertionInfo.ProjectionMask, com.linkedin.assertion.DatasetAssertionInfo.ProjectionMask> nestedMask) {
            _datasetAssertionMask = nestedMask.apply(((_datasetAssertionMask == null)?DatasetAssertionInfo.createMask():_datasetAssertionMask));
            getDataMap().put("datasetAssertion", _datasetAssertionMask.getDataMap());
            return this;
        }

        /**
         * A Dataset Assertion definition. This field is populated when the type is DATASET.
         * 
         */
        public AssertionInfo.ProjectionMask withDatasetAssertion() {
            _datasetAssertionMask = null;
            getDataMap().put("datasetAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An Freshness Assertion definition. This field is populated when the type is FRESHNESS.
         * 
         */
        public AssertionInfo.ProjectionMask withFreshnessAssertion(Function<com.linkedin.assertion.FreshnessAssertionInfo.ProjectionMask, com.linkedin.assertion.FreshnessAssertionInfo.ProjectionMask> nestedMask) {
            _freshnessAssertionMask = nestedMask.apply(((_freshnessAssertionMask == null)?FreshnessAssertionInfo.createMask():_freshnessAssertionMask));
            getDataMap().put("freshnessAssertion", _freshnessAssertionMask.getDataMap());
            return this;
        }

        /**
         * An Freshness Assertion definition. This field is populated when the type is FRESHNESS.
         * 
         */
        public AssertionInfo.ProjectionMask withFreshnessAssertion() {
            _freshnessAssertionMask = null;
            getDataMap().put("freshnessAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An Volume Assertion definition. This field is populated when the type is VOLUME.
         * 
         */
        public AssertionInfo.ProjectionMask withVolumeAssertion(Function<com.linkedin.assertion.VolumeAssertionInfo.ProjectionMask, com.linkedin.assertion.VolumeAssertionInfo.ProjectionMask> nestedMask) {
            _volumeAssertionMask = nestedMask.apply(((_volumeAssertionMask == null)?VolumeAssertionInfo.createMask():_volumeAssertionMask));
            getDataMap().put("volumeAssertion", _volumeAssertionMask.getDataMap());
            return this;
        }

        /**
         * An Volume Assertion definition. This field is populated when the type is VOLUME.
         * 
         */
        public AssertionInfo.ProjectionMask withVolumeAssertion() {
            _volumeAssertionMask = null;
            getDataMap().put("volumeAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A SQL Assertion definition. This field is populated when the type is SQL.
         * 
         */
        public AssertionInfo.ProjectionMask withSqlAssertion(Function<com.linkedin.assertion.SqlAssertionInfo.ProjectionMask, com.linkedin.assertion.SqlAssertionInfo.ProjectionMask> nestedMask) {
            _sqlAssertionMask = nestedMask.apply(((_sqlAssertionMask == null)?SqlAssertionInfo.createMask():_sqlAssertionMask));
            getDataMap().put("sqlAssertion", _sqlAssertionMask.getDataMap());
            return this;
        }

        /**
         * A SQL Assertion definition. This field is populated when the type is SQL.
         * 
         */
        public AssertionInfo.ProjectionMask withSqlAssertion() {
            _sqlAssertionMask = null;
            getDataMap().put("sqlAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A Field Assertion definition. This field is populated when the type is FIELD.
         * 
         */
        public AssertionInfo.ProjectionMask withFieldAssertion(Function<com.linkedin.assertion.FieldAssertionInfo.ProjectionMask, com.linkedin.assertion.FieldAssertionInfo.ProjectionMask> nestedMask) {
            _fieldAssertionMask = nestedMask.apply(((_fieldAssertionMask == null)?FieldAssertionInfo.createMask():_fieldAssertionMask));
            getDataMap().put("fieldAssertion", _fieldAssertionMask.getDataMap());
            return this;
        }

        /**
         * A Field Assertion definition. This field is populated when the type is FIELD.
         * 
         */
        public AssertionInfo.ProjectionMask withFieldAssertion() {
            _fieldAssertionMask = null;
            getDataMap().put("fieldAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An schema Assertion definition. This field is populated when the type is DATA_SCHEMA
         * 
         */
        public AssertionInfo.ProjectionMask withSchemaAssertion(Function<com.linkedin.assertion.SchemaAssertionInfo.ProjectionMask, com.linkedin.assertion.SchemaAssertionInfo.ProjectionMask> nestedMask) {
            _schemaAssertionMask = nestedMask.apply(((_schemaAssertionMask == null)?SchemaAssertionInfo.createMask():_schemaAssertionMask));
            getDataMap().put("schemaAssertion", _schemaAssertionMask.getDataMap());
            return this;
        }

        /**
         * An schema Assertion definition. This field is populated when the type is DATA_SCHEMA
         * 
         */
        public AssertionInfo.ProjectionMask withSchemaAssertion() {
            _schemaAssertionMask = null;
            getDataMap().put("schemaAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A Custom Assertion definition. This field is populated when type is CUSTOM.
         * 
         */
        public AssertionInfo.ProjectionMask withCustomAssertion(Function<com.linkedin.assertion.CustomAssertionInfo.ProjectionMask, com.linkedin.assertion.CustomAssertionInfo.ProjectionMask> nestedMask) {
            _customAssertionMask = nestedMask.apply(((_customAssertionMask == null)?CustomAssertionInfo.createMask():_customAssertionMask));
            getDataMap().put("customAssertion", _customAssertionMask.getDataMap());
            return this;
        }

        /**
         * A Custom Assertion definition. This field is populated when type is CUSTOM.
         * 
         */
        public AssertionInfo.ProjectionMask withCustomAssertion() {
            _customAssertionMask = null;
            getDataMap().put("customAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The source or origin of the Assertion definition.
         * 
         * If the source type of the Assertion is EXTERNAL, it is expected to have a corresponding dataPlatformInstance aspect detailing
         * the platform where it was ingested from.
         * 
         */
        public AssertionInfo.ProjectionMask withSource(Function<com.linkedin.assertion.AssertionSource.ProjectionMask, com.linkedin.assertion.AssertionSource.ProjectionMask> nestedMask) {
            _sourceMask = nestedMask.apply(((_sourceMask == null)?AssertionSource.createMask():_sourceMask));
            getDataMap().put("source", _sourceMask.getDataMap());
            return this;
        }

        /**
         * The source or origin of the Assertion definition.
         * 
         * If the source type of the Assertion is EXTERNAL, it is expected to have a corresponding dataPlatformInstance aspect detailing
         * the platform where it was ingested from.
         * 
         */
        public AssertionInfo.ProjectionMask withSource() {
            _sourceMask = null;
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the assertion was last updated and the actor who updated it.
         * This field is only present for Native assertions updated after this field was introduced.
         * 
         */
        public AssertionInfo.ProjectionMask withLastUpdated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastUpdatedMask = nestedMask.apply(((_lastUpdatedMask == null)?AuditStamp.createMask():_lastUpdatedMask));
            getDataMap().put("lastUpdated", _lastUpdatedMask.getDataMap());
            return this;
        }

        /**
         * The time at which the assertion was last updated and the actor who updated it.
         * This field is only present for Native assertions updated after this field was introduced.
         * 
         */
        public AssertionInfo.ProjectionMask withLastUpdated(MaskMap nestedMask) {
            getDataMap().put("lastUpdated", nestedMask.getDataMap());
            return this;
        }

        /**
         * The time at which the assertion was last updated and the actor who updated it.
         * This field is only present for Native assertions updated after this field was introduced.
         * 
         */
        public AssertionInfo.ProjectionMask withLastUpdated() {
            _lastUpdatedMask = null;
            getDataMap().put("lastUpdated", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional human-readable description of the assertion
         * 
         */
        public AssertionInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
