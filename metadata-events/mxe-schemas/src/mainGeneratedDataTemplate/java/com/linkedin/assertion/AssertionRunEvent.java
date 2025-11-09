
package com.linkedin.assertion;

import java.util.List;
import java.util.function.Function;
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
import com.linkedin.data.template.StringMap;
import com.linkedin.timeseries.PartitionSpec;
import com.linkedin.timeseries.TimeWindowSize;


/**
 * An event representing the current status of evaluating an assertion on a batch.
 * AssertionRunEvent should be used for reporting the status of a run as an assertion evaluation progresses.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AssertionRunEvent.pdl.")
public class AssertionRunEvent
    extends RecordTemplate
{

    private final static AssertionRunEvent.Fields _fields = new AssertionRunEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**An event representing the current status of evaluating an assertion on a batch.\nAssertionRunEvent should be used for reporting the status of a run as an assertion evaluation progresses.*/@Aspect={\"name\":\"assertionRunEvent\",\"type\":\"timeseries\"}record AssertionRunEvent{/**The event timestamp field as epoch at UTC in milli seconds.*/@Searchable={\"fieldName\":\"lastCompletedTime\",\"fieldType\":\"DATETIME\"}timestampMillis:long/** Native (platform-specific) identifier for this run*/runId:string@TimeseriesField={}asserteeUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The status of the assertion run as per this timeseries event.*/@TimeseriesField={}status:/**The lifecycle status of an assertion run.*/enum AssertionRunStatus{/**The Assertion Run has completed*/COMPLETE}/**Results of assertion, present if the status is COMPLETE*/result:optional/**The result of running an assertion*/record AssertionResult{/** The final result, e.g. either SUCCESS, FAILURE, or ERROR.*/@Searchable={}@TimeseriesField={}type:/** The final result of evaluating an assertion, e.g. SUCCESS, FAILURE, or ERROR.*/enum AssertionResultType{/** The Assertion has not yet been fully evaluated*/INIT/** The Assertion Succeeded*/SUCCESS/** The Assertion Failed*/FAILURE/** The Assertion encountered an Error*/ERROR}/**Number of rows for evaluated batch*/rowCount:optional long/**Number of rows with missing value for evaluated batch*/missingCount:optional long/**Number of rows with unexpected value for evaluated batch*/unexpectedCount:optional long/**Observed aggregate value for evaluated batch*/actualAggValue:optional float/**Other results of evaluation*/nativeResults:optional map[string,string]/**External URL where full results are available. Only present when assertion source is not native.*/externalUrl:optional string/** The error object if AssertionResultType is an Error*/error:optional/** An error encountered when evaluating an AssertionResult*/record AssertionResultError{/** The type of error encountered*/type:enum AssertionResultErrorType{/** Source is unreachable*/SOURCE_CONNECTION_ERROR/** Source query failed to execute*/SOURCE_QUERY_FAILED/** Insufficient data to evaluate the assertion*/INSUFFICIENT_DATA/** Invalid parameters were detected*/INVALID_PARAMETERS/** Event type not supported by the specified source*/INVALID_SOURCE_TYPE/** Unsupported platform*/UNSUPPORTED_PLATFORM/** Error while executing a custom SQL assertion*/CUSTOM_SQL_ERROR/** Error while executing a field assertion*/FIELD_ASSERTION_ERROR/** Unknown error*/UNKNOWN_ERROR}/** Additional metadata depending on the type of error*/properties:optional map[string,string]}}/**Runtime parameters of evaluation*/runtimeContext:optional map[string,string]/**Specification of the batch which this run is evaluating*/batchSpec:optional/**A batch on which certain operations, e.g. data quality evaluation, is done.*/record BatchSpec includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**The native identifier as specified by the system operating on the batch.*/nativeBatchId:optional string/**A query that identifies a batch of data*/query:optional string/**Any limit to the number of rows in the batch, if applied*/limit:optional int}@TimeseriesField={}assertionUrn:com.linkedin.common.Urn/**Granularity of the event if applicable*/eventGranularity:optional{namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}/**The optional partition specification.*/partitionSpec:optional{namespace com.linkedin.timeseries/**A reference to a specific partition in a dataset.*/record PartitionSpec{/**A unique id / value for the partition for which statistics were collected,\ngenerated by applying the key definition to a given row.*/@TimeseriesField={}partition:string/**Time window of the partition, if we are able to extract it from the partition key.*/timePartition:optional record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:TimeWindowSize}/**Unused!*/@deprecated,type:enum PartitionType{FULL_TABLE,QUERY,PARTITION}=\"PARTITION\"}}={\"partition\":\"FULL_TABLE_SNAPSHOT\",\"type\":\"FULL_TABLE\"}/**The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.*/messageId:optional string}", SchemaFormatType.PDL));
    private Long _timestampMillisField = null;
    private String _runIdField = null;
    private com.linkedin.common.urn.Urn _asserteeUrnField = null;
    private AssertionRunStatus _statusField = null;
    private AssertionResult _resultField = null;
    private StringMap _runtimeContextField = null;
    private BatchSpec _batchSpecField = null;
    private com.linkedin.common.urn.Urn _assertionUrnField = null;
    private TimeWindowSize _eventGranularityField = null;
    private PartitionSpec _partitionSpecField = null;
    private String _messageIdField = null;
    private AssertionRunEvent.ChangeListener __changeListener = new AssertionRunEvent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TimestampMillis = SCHEMA.getField("timestampMillis");
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static RecordDataSchema.Field FIELD_AsserteeUrn = SCHEMA.getField("asserteeUrn");
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");
    private final static RecordDataSchema.Field FIELD_Result = SCHEMA.getField("result");
    private final static RecordDataSchema.Field FIELD_RuntimeContext = SCHEMA.getField("runtimeContext");
    private final static RecordDataSchema.Field FIELD_BatchSpec = SCHEMA.getField("batchSpec");
    private final static RecordDataSchema.Field FIELD_AssertionUrn = SCHEMA.getField("assertionUrn");
    private final static RecordDataSchema.Field FIELD_EventGranularity = SCHEMA.getField("eventGranularity");
    private final static RecordDataSchema.Field FIELD_PartitionSpec = SCHEMA.getField("partitionSpec");
    private final static PartitionSpec DEFAULT_PartitionSpec;
    private final static RecordDataSchema.Field FIELD_MessageId = SCHEMA.getField("messageId");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_PartitionSpec = ((FIELD_PartitionSpec.getDefault() == null)?null:new PartitionSpec(DataTemplateUtil.castOrThrow(FIELD_PartitionSpec.getDefault(), DataMap.class)));
    }

    public AssertionRunEvent() {
        super(new DataMap(15, 0.75F), SCHEMA, 7);
        addChangeListener(__changeListener);
    }

    public AssertionRunEvent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionRunEvent.Fields fields() {
        return _fields;
    }

    public static AssertionRunEvent.ProjectionMask createMask() {
        return new AssertionRunEvent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for timestampMillis
     * 
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    public boolean hasTimestampMillis() {
        if (_timestampMillisField!= null) {
            return true;
        }
        return super._map.containsKey("timestampMillis");
    }

    /**
     * Remover for timestampMillis
     * 
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    public void removeTimestampMillis() {
        super._map.remove("timestampMillis");
    }

    /**
     * Getter for timestampMillis
     * 
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    @Nullable
    public Long getTimestampMillis(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTimestampMillis();
            case DEFAULT:
            case NULL:
                if (_timestampMillisField!= null) {
                    return _timestampMillisField;
                } else {
                    Object __rawValue = super._map.get("timestampMillis");
                    _timestampMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timestampMillisField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for timestampMillis
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    @Nonnull
    public Long getTimestampMillis() {
        if (_timestampMillisField!= null) {
            return _timestampMillisField;
        } else {
            Object __rawValue = super._map.get("timestampMillis");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("timestampMillis");
            }
            _timestampMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timestampMillisField;
        }
    }

    /**
     * Setter for timestampMillis
     * 
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    public AssertionRunEvent setTimestampMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestampMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timestampMillis of com.linkedin.assertion.AssertionRunEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
                    _timestampMillisField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimestampMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
                    _timestampMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
                    _timestampMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    public AssertionRunEvent setTimestampMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestampMillis of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
            _timestampMillisField = value;
        }
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @see AssertionRunEvent.Fields#timestampMillis
     */
    public AssertionRunEvent setTimestampMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
        _timestampMillisField = value;
        return this;
    }

    /**
     * Existence checker for runId
     * 
     * @see AssertionRunEvent.Fields#runId
     */
    public boolean hasRunId() {
        if (_runIdField!= null) {
            return true;
        }
        return super._map.containsKey("runId");
    }

    /**
     * Remover for runId
     * 
     * @see AssertionRunEvent.Fields#runId
     */
    public void removeRunId() {
        super._map.remove("runId");
    }

    /**
     * Getter for runId
     * 
     * @see AssertionRunEvent.Fields#runId
     */
    @Nullable
    public String getRunId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRunId();
            case DEFAULT:
            case NULL:
                if (_runIdField!= null) {
                    return _runIdField;
                } else {
                    Object __rawValue = super._map.get("runId");
                    _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _runIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for runId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionRunEvent.Fields#runId
     */
    @Nonnull
    public String getRunId() {
        if (_runIdField!= null) {
            return _runIdField;
        } else {
            Object __rawValue = super._map.get("runId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("runId");
            }
            _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _runIdField;
        }
    }

    /**
     * Setter for runId
     * 
     * @see AssertionRunEvent.Fields#runId
     */
    public AssertionRunEvent setRunId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRunId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field runId of com.linkedin.assertion.AssertionRunEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRunId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for runId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#runId
     */
    public AssertionRunEvent setRunId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field runId of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "runId", value);
            _runIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for asserteeUrn
     * 
     * @see AssertionRunEvent.Fields#asserteeUrn
     */
    public boolean hasAsserteeUrn() {
        if (_asserteeUrnField!= null) {
            return true;
        }
        return super._map.containsKey("asserteeUrn");
    }

    /**
     * Remover for asserteeUrn
     * 
     * @see AssertionRunEvent.Fields#asserteeUrn
     */
    public void removeAsserteeUrn() {
        super._map.remove("asserteeUrn");
    }

    /**
     * Getter for asserteeUrn
     * 
     * @see AssertionRunEvent.Fields#asserteeUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getAsserteeUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAsserteeUrn();
            case DEFAULT:
            case NULL:
                if (_asserteeUrnField!= null) {
                    return _asserteeUrnField;
                } else {
                    Object __rawValue = super._map.get("asserteeUrn");
                    _asserteeUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _asserteeUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for asserteeUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionRunEvent.Fields#asserteeUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getAsserteeUrn() {
        if (_asserteeUrnField!= null) {
            return _asserteeUrnField;
        } else {
            Object __rawValue = super._map.get("asserteeUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("asserteeUrn");
            }
            _asserteeUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _asserteeUrnField;
        }
    }

    /**
     * Setter for asserteeUrn
     * 
     * @see AssertionRunEvent.Fields#asserteeUrn
     */
    public AssertionRunEvent setAsserteeUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAsserteeUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field asserteeUrn of com.linkedin.assertion.AssertionRunEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "asserteeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _asserteeUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAsserteeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "asserteeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _asserteeUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "asserteeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _asserteeUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for asserteeUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#asserteeUrn
     */
    public AssertionRunEvent setAsserteeUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field asserteeUrn of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "asserteeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _asserteeUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for status
     * 
     * @see AssertionRunEvent.Fields#status
     */
    public boolean hasStatus() {
        if (_statusField!= null) {
            return true;
        }
        return super._map.containsKey("status");
    }

    /**
     * Remover for status
     * 
     * @see AssertionRunEvent.Fields#status
     */
    public void removeStatus() {
        super._map.remove("status");
    }

    /**
     * Getter for status
     * 
     * @see AssertionRunEvent.Fields#status
     */
    @Nullable
    public AssertionRunStatus getStatus(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStatus();
            case DEFAULT:
            case NULL:
                if (_statusField!= null) {
                    return _statusField;
                } else {
                    Object __rawValue = super._map.get("status");
                    _statusField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionRunStatus.class, AssertionRunStatus.$UNKNOWN);
                    return _statusField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for status
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionRunEvent.Fields#status
     */
    @Nonnull
    public AssertionRunStatus getStatus() {
        if (_statusField!= null) {
            return _statusField;
        } else {
            Object __rawValue = super._map.get("status");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("status");
            }
            _statusField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionRunStatus.class, AssertionRunStatus.$UNKNOWN);
            return _statusField;
        }
    }

    /**
     * Setter for status
     * 
     * @see AssertionRunEvent.Fields#status
     */
    public AssertionRunEvent setStatus(
        @Nullable
        AssertionRunStatus value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatus(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field status of com.linkedin.assertion.AssertionRunEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatus();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#status
     */
    public AssertionRunEvent setStatus(
        @Nonnull
        AssertionRunStatus value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field status of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "status", value.name());
            _statusField = value;
        }
        return this;
    }

    /**
     * Existence checker for result
     * 
     * @see AssertionRunEvent.Fields#result
     */
    public boolean hasResult() {
        if (_resultField!= null) {
            return true;
        }
        return super._map.containsKey("result");
    }

    /**
     * Remover for result
     * 
     * @see AssertionRunEvent.Fields#result
     */
    public void removeResult() {
        super._map.remove("result");
    }

    /**
     * Getter for result
     * 
     * @see AssertionRunEvent.Fields#result
     */
    @Nullable
    public AssertionResult getResult(GetMode mode) {
        return getResult();
    }

    /**
     * Getter for result
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionRunEvent.Fields#result
     */
    @Nullable
    public AssertionResult getResult() {
        if (_resultField!= null) {
            return _resultField;
        } else {
            Object __rawValue = super._map.get("result");
            _resultField = ((__rawValue == null)?null:new AssertionResult(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _resultField;
        }
    }

    /**
     * Setter for result
     * 
     * @see AssertionRunEvent.Fields#result
     */
    public AssertionRunEvent setResult(
        @Nullable
        AssertionResult value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResult(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResult();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "result", value.data());
                    _resultField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "result", value.data());
                    _resultField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for result
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#result
     */
    public AssertionRunEvent setResult(
        @Nonnull
        AssertionResult value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field result of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "result", value.data());
            _resultField = value;
        }
        return this;
    }

    /**
     * Existence checker for runtimeContext
     * 
     * @see AssertionRunEvent.Fields#runtimeContext
     */
    public boolean hasRuntimeContext() {
        if (_runtimeContextField!= null) {
            return true;
        }
        return super._map.containsKey("runtimeContext");
    }

    /**
     * Remover for runtimeContext
     * 
     * @see AssertionRunEvent.Fields#runtimeContext
     */
    public void removeRuntimeContext() {
        super._map.remove("runtimeContext");
    }

    /**
     * Getter for runtimeContext
     * 
     * @see AssertionRunEvent.Fields#runtimeContext
     */
    @Nullable
    public StringMap getRuntimeContext(GetMode mode) {
        return getRuntimeContext();
    }

    /**
     * Getter for runtimeContext
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionRunEvent.Fields#runtimeContext
     */
    @Nullable
    public StringMap getRuntimeContext() {
        if (_runtimeContextField!= null) {
            return _runtimeContextField;
        } else {
            Object __rawValue = super._map.get("runtimeContext");
            _runtimeContextField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _runtimeContextField;
        }
    }

    /**
     * Setter for runtimeContext
     * 
     * @see AssertionRunEvent.Fields#runtimeContext
     */
    public AssertionRunEvent setRuntimeContext(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRuntimeContext(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRuntimeContext();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runtimeContext", value.data());
                    _runtimeContextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "runtimeContext", value.data());
                    _runtimeContextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for runtimeContext
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#runtimeContext
     */
    public AssertionRunEvent setRuntimeContext(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field runtimeContext of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "runtimeContext", value.data());
            _runtimeContextField = value;
        }
        return this;
    }

    /**
     * Existence checker for batchSpec
     * 
     * @see AssertionRunEvent.Fields#batchSpec
     */
    public boolean hasBatchSpec() {
        if (_batchSpecField!= null) {
            return true;
        }
        return super._map.containsKey("batchSpec");
    }

    /**
     * Remover for batchSpec
     * 
     * @see AssertionRunEvent.Fields#batchSpec
     */
    public void removeBatchSpec() {
        super._map.remove("batchSpec");
    }

    /**
     * Getter for batchSpec
     * 
     * @see AssertionRunEvent.Fields#batchSpec
     */
    @Nullable
    public BatchSpec getBatchSpec(GetMode mode) {
        return getBatchSpec();
    }

    /**
     * Getter for batchSpec
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionRunEvent.Fields#batchSpec
     */
    @Nullable
    public BatchSpec getBatchSpec() {
        if (_batchSpecField!= null) {
            return _batchSpecField;
        } else {
            Object __rawValue = super._map.get("batchSpec");
            _batchSpecField = ((__rawValue == null)?null:new BatchSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _batchSpecField;
        }
    }

    /**
     * Setter for batchSpec
     * 
     * @see AssertionRunEvent.Fields#batchSpec
     */
    public AssertionRunEvent setBatchSpec(
        @Nullable
        BatchSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBatchSpec(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBatchSpec();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "batchSpec", value.data());
                    _batchSpecField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "batchSpec", value.data());
                    _batchSpecField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for batchSpec
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#batchSpec
     */
    public AssertionRunEvent setBatchSpec(
        @Nonnull
        BatchSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field batchSpec of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "batchSpec", value.data());
            _batchSpecField = value;
        }
        return this;
    }

    /**
     * Existence checker for assertionUrn
     * 
     * @see AssertionRunEvent.Fields#assertionUrn
     */
    public boolean hasAssertionUrn() {
        if (_assertionUrnField!= null) {
            return true;
        }
        return super._map.containsKey("assertionUrn");
    }

    /**
     * Remover for assertionUrn
     * 
     * @see AssertionRunEvent.Fields#assertionUrn
     */
    public void removeAssertionUrn() {
        super._map.remove("assertionUrn");
    }

    /**
     * Getter for assertionUrn
     * 
     * @see AssertionRunEvent.Fields#assertionUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getAssertionUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAssertionUrn();
            case DEFAULT:
            case NULL:
                if (_assertionUrnField!= null) {
                    return _assertionUrnField;
                } else {
                    Object __rawValue = super._map.get("assertionUrn");
                    _assertionUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _assertionUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for assertionUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionRunEvent.Fields#assertionUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getAssertionUrn() {
        if (_assertionUrnField!= null) {
            return _assertionUrnField;
        } else {
            Object __rawValue = super._map.get("assertionUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("assertionUrn");
            }
            _assertionUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _assertionUrnField;
        }
    }

    /**
     * Setter for assertionUrn
     * 
     * @see AssertionRunEvent.Fields#assertionUrn
     */
    public AssertionRunEvent setAssertionUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssertionUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field assertionUrn of com.linkedin.assertion.AssertionRunEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assertionUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _assertionUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssertionUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assertionUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _assertionUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assertionUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _assertionUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assertionUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#assertionUrn
     */
    public AssertionRunEvent setAssertionUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assertionUrn of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assertionUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _assertionUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for eventGranularity
     * 
     * @see AssertionRunEvent.Fields#eventGranularity
     */
    public boolean hasEventGranularity() {
        if (_eventGranularityField!= null) {
            return true;
        }
        return super._map.containsKey("eventGranularity");
    }

    /**
     * Remover for eventGranularity
     * 
     * @see AssertionRunEvent.Fields#eventGranularity
     */
    public void removeEventGranularity() {
        super._map.remove("eventGranularity");
    }

    /**
     * Getter for eventGranularity
     * 
     * @see AssertionRunEvent.Fields#eventGranularity
     */
    @Nullable
    public TimeWindowSize getEventGranularity(GetMode mode) {
        return getEventGranularity();
    }

    /**
     * Getter for eventGranularity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionRunEvent.Fields#eventGranularity
     */
    @Nullable
    public TimeWindowSize getEventGranularity() {
        if (_eventGranularityField!= null) {
            return _eventGranularityField;
        } else {
            Object __rawValue = super._map.get("eventGranularity");
            _eventGranularityField = ((__rawValue == null)?null:new TimeWindowSize(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _eventGranularityField;
        }
    }

    /**
     * Setter for eventGranularity
     * 
     * @see AssertionRunEvent.Fields#eventGranularity
     */
    public AssertionRunEvent setEventGranularity(
        @Nullable
        TimeWindowSize value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEventGranularity(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEventGranularity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "eventGranularity", value.data());
                    _eventGranularityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "eventGranularity", value.data());
                    _eventGranularityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for eventGranularity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#eventGranularity
     */
    public AssertionRunEvent setEventGranularity(
        @Nonnull
        TimeWindowSize value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field eventGranularity of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "eventGranularity", value.data());
            _eventGranularityField = value;
        }
        return this;
    }

    /**
     * Existence checker for partitionSpec
     * 
     * @see AssertionRunEvent.Fields#partitionSpec
     */
    public boolean hasPartitionSpec() {
        if (_partitionSpecField!= null) {
            return true;
        }
        return super._map.containsKey("partitionSpec");
    }

    /**
     * Remover for partitionSpec
     * 
     * @see AssertionRunEvent.Fields#partitionSpec
     */
    public void removePartitionSpec() {
        super._map.remove("partitionSpec");
    }

    /**
     * Getter for partitionSpec
     * 
     * @see AssertionRunEvent.Fields#partitionSpec
     */
    @Nullable
    public PartitionSpec getPartitionSpec(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPartitionSpec();
            case NULL:
                if (_partitionSpecField!= null) {
                    return _partitionSpecField;
                } else {
                    Object __rawValue = super._map.get("partitionSpec");
                    _partitionSpecField = ((__rawValue == null)?null:new PartitionSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _partitionSpecField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for partitionSpec
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionRunEvent.Fields#partitionSpec
     */
    @Nullable
    public PartitionSpec getPartitionSpec() {
        if (_partitionSpecField!= null) {
            return _partitionSpecField;
        } else {
            Object __rawValue = super._map.get("partitionSpec");
            if (__rawValue == null) {
                return DEFAULT_PartitionSpec;
            }
            _partitionSpecField = ((__rawValue == null)?null:new PartitionSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _partitionSpecField;
        }
    }

    /**
     * Setter for partitionSpec
     * 
     * @see AssertionRunEvent.Fields#partitionSpec
     */
    public AssertionRunEvent setPartitionSpec(
        @Nullable
        PartitionSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPartitionSpec(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePartitionSpec();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "partitionSpec", value.data());
                    _partitionSpecField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "partitionSpec", value.data());
                    _partitionSpecField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for partitionSpec
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#partitionSpec
     */
    public AssertionRunEvent setPartitionSpec(
        @Nonnull
        PartitionSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field partitionSpec of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "partitionSpec", value.data());
            _partitionSpecField = value;
        }
        return this;
    }

    /**
     * Existence checker for messageId
     * 
     * @see AssertionRunEvent.Fields#messageId
     */
    public boolean hasMessageId() {
        if (_messageIdField!= null) {
            return true;
        }
        return super._map.containsKey("messageId");
    }

    /**
     * Remover for messageId
     * 
     * @see AssertionRunEvent.Fields#messageId
     */
    public void removeMessageId() {
        super._map.remove("messageId");
    }

    /**
     * Getter for messageId
     * 
     * @see AssertionRunEvent.Fields#messageId
     */
    @Nullable
    public String getMessageId(GetMode mode) {
        return getMessageId();
    }

    /**
     * Getter for messageId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionRunEvent.Fields#messageId
     */
    @Nullable
    public String getMessageId() {
        if (_messageIdField!= null) {
            return _messageIdField;
        } else {
            Object __rawValue = super._map.get("messageId");
            _messageIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _messageIdField;
        }
    }

    /**
     * Setter for messageId
     * 
     * @see AssertionRunEvent.Fields#messageId
     */
    public AssertionRunEvent setMessageId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMessageId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMessageId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "messageId", value);
                    _messageIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "messageId", value);
                    _messageIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for messageId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionRunEvent.Fields#messageId
     */
    public AssertionRunEvent setMessageId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field messageId of com.linkedin.assertion.AssertionRunEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "messageId", value);
            _messageIdField = value;
        }
        return this;
    }

    @Override
    public AssertionRunEvent clone()
        throws CloneNotSupportedException
    {
        AssertionRunEvent __clone = ((AssertionRunEvent) super.clone());
        __clone.__changeListener = new AssertionRunEvent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionRunEvent copy()
        throws CloneNotSupportedException
    {
        AssertionRunEvent __copy = ((AssertionRunEvent) super.copy());
        __copy._resultField = null;
        __copy._assertionUrnField = null;
        __copy._timestampMillisField = null;
        __copy._runtimeContextField = null;
        __copy._eventGranularityField = null;
        __copy._messageIdField = null;
        __copy._asserteeUrnField = null;
        __copy._runIdField = null;
        __copy._batchSpecField = null;
        __copy._partitionSpecField = null;
        __copy._statusField = null;
        __copy.__changeListener = new AssertionRunEvent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionRunEvent __objectRef;

        private ChangeListener(AssertionRunEvent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "result":
                    __objectRef._resultField = null;
                    break;
                case "assertionUrn":
                    __objectRef._assertionUrnField = null;
                    break;
                case "timestampMillis":
                    __objectRef._timestampMillisField = null;
                    break;
                case "runtimeContext":
                    __objectRef._runtimeContextField = null;
                    break;
                case "eventGranularity":
                    __objectRef._eventGranularityField = null;
                    break;
                case "messageId":
                    __objectRef._messageIdField = null;
                    break;
                case "asserteeUrn":
                    __objectRef._asserteeUrnField = null;
                    break;
                case "runId":
                    __objectRef._runIdField = null;
                    break;
                case "batchSpec":
                    __objectRef._batchSpecField = null;
                    break;
                case "partitionSpec":
                    __objectRef._partitionSpecField = null;
                    break;
                case "status":
                    __objectRef._statusField = null;
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
         * The event timestamp field as epoch at UTC in milli seconds.
         * 
         */
        public PathSpec timestampMillis() {
            return new PathSpec(getPathComponents(), "timestampMillis");
        }

        /**
         *  Native (platform-specific) identifier for this run
         * 
         */
        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        public PathSpec asserteeUrn() {
            return new PathSpec(getPathComponents(), "asserteeUrn");
        }

        /**
         * The status of the assertion run as per this timeseries event.
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

        /**
         * Results of assertion, present if the status is COMPLETE
         * 
         */
        public com.linkedin.assertion.AssertionResult.Fields result() {
            return new com.linkedin.assertion.AssertionResult.Fields(getPathComponents(), "result");
        }

        /**
         * Runtime parameters of evaluation
         * 
         */
        public PathSpec runtimeContext() {
            return new PathSpec(getPathComponents(), "runtimeContext");
        }

        /**
         * Specification of the batch which this run is evaluating
         * 
         */
        public com.linkedin.assertion.BatchSpec.Fields batchSpec() {
            return new com.linkedin.assertion.BatchSpec.Fields(getPathComponents(), "batchSpec");
        }

        public PathSpec assertionUrn() {
            return new PathSpec(getPathComponents(), "assertionUrn");
        }

        /**
         * Granularity of the event if applicable
         * 
         */
        public com.linkedin.timeseries.TimeWindowSize.Fields eventGranularity() {
            return new com.linkedin.timeseries.TimeWindowSize.Fields(getPathComponents(), "eventGranularity");
        }

        /**
         * The optional partition specification.
         * 
         */
        public com.linkedin.timeseries.PartitionSpec.Fields partitionSpec() {
            return new com.linkedin.timeseries.PartitionSpec.Fields(getPathComponents(), "partitionSpec");
        }

        /**
         * The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.
         * 
         */
        public PathSpec messageId() {
            return new PathSpec(getPathComponents(), "messageId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.AssertionResult.ProjectionMask _resultMask;
        private com.linkedin.assertion.BatchSpec.ProjectionMask _batchSpecMask;
        private com.linkedin.timeseries.TimeWindowSize.ProjectionMask _eventGranularityMask;
        private com.linkedin.timeseries.PartitionSpec.ProjectionMask _partitionSpecMask;

        ProjectionMask() {
            super(15);
        }

        /**
         * The event timestamp field as epoch at UTC in milli seconds.
         * 
         */
        public AssertionRunEvent.ProjectionMask withTimestampMillis() {
            getDataMap().put("timestampMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Native (platform-specific) identifier for this run
         * 
         */
        public AssertionRunEvent.ProjectionMask withRunId() {
            getDataMap().put("runId", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AssertionRunEvent.ProjectionMask withAsserteeUrn() {
            getDataMap().put("asserteeUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The status of the assertion run as per this timeseries event.
         * 
         */
        public AssertionRunEvent.ProjectionMask withStatus() {
            getDataMap().put("status", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Results of assertion, present if the status is COMPLETE
         * 
         */
        public AssertionRunEvent.ProjectionMask withResult(Function<com.linkedin.assertion.AssertionResult.ProjectionMask, com.linkedin.assertion.AssertionResult.ProjectionMask> nestedMask) {
            _resultMask = nestedMask.apply(((_resultMask == null)?AssertionResult.createMask():_resultMask));
            getDataMap().put("result", _resultMask.getDataMap());
            return this;
        }

        /**
         * Results of assertion, present if the status is COMPLETE
         * 
         */
        public AssertionRunEvent.ProjectionMask withResult() {
            _resultMask = null;
            getDataMap().put("result", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Runtime parameters of evaluation
         * 
         */
        public AssertionRunEvent.ProjectionMask withRuntimeContext() {
            getDataMap().put("runtimeContext", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Specification of the batch which this run is evaluating
         * 
         */
        public AssertionRunEvent.ProjectionMask withBatchSpec(Function<com.linkedin.assertion.BatchSpec.ProjectionMask, com.linkedin.assertion.BatchSpec.ProjectionMask> nestedMask) {
            _batchSpecMask = nestedMask.apply(((_batchSpecMask == null)?BatchSpec.createMask():_batchSpecMask));
            getDataMap().put("batchSpec", _batchSpecMask.getDataMap());
            return this;
        }

        /**
         * Specification of the batch which this run is evaluating
         * 
         */
        public AssertionRunEvent.ProjectionMask withBatchSpec() {
            _batchSpecMask = null;
            getDataMap().put("batchSpec", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AssertionRunEvent.ProjectionMask withAssertionUrn() {
            getDataMap().put("assertionUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Granularity of the event if applicable
         * 
         */
        public AssertionRunEvent.ProjectionMask withEventGranularity(Function<com.linkedin.timeseries.TimeWindowSize.ProjectionMask, com.linkedin.timeseries.TimeWindowSize.ProjectionMask> nestedMask) {
            _eventGranularityMask = nestedMask.apply(((_eventGranularityMask == null)?TimeWindowSize.createMask():_eventGranularityMask));
            getDataMap().put("eventGranularity", _eventGranularityMask.getDataMap());
            return this;
        }

        /**
         * Granularity of the event if applicable
         * 
         */
        public AssertionRunEvent.ProjectionMask withEventGranularity() {
            _eventGranularityMask = null;
            getDataMap().put("eventGranularity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The optional partition specification.
         * 
         */
        public AssertionRunEvent.ProjectionMask withPartitionSpec(Function<com.linkedin.timeseries.PartitionSpec.ProjectionMask, com.linkedin.timeseries.PartitionSpec.ProjectionMask> nestedMask) {
            _partitionSpecMask = nestedMask.apply(((_partitionSpecMask == null)?PartitionSpec.createMask():_partitionSpecMask));
            getDataMap().put("partitionSpec", _partitionSpecMask.getDataMap());
            return this;
        }

        /**
         * The optional partition specification.
         * 
         */
        public AssertionRunEvent.ProjectionMask withPartitionSpec() {
            _partitionSpecMask = null;
            getDataMap().put("partitionSpec", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The optional messageId, if provided serves as a custom user-defined unique identifier for an aspect value.
         * 
         */
        public AssertionRunEvent.ProjectionMask withMessageId() {
            getDataMap().put("messageId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
