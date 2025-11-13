
package com.linkedin.execution;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * The result of an execution request
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/execution/ExecutionRequestResult.pdl.")
public class ExecutionRequestResult
    extends RecordTemplate
{

    private final static ExecutionRequestResult.Fields _fields = new ExecutionRequestResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.execution/**The result of an execution request*/@Aspect.name=\"dataHubExecutionRequestResult\"record ExecutionRequestResult{/**The status of the execution request*/@Searchable={\"fieldName\":\"executionResultStatus\",\"fieldType\":\"KEYWORD\"}status:string/**The pretty-printed execution report.*/report:optional string/**A structured report if available.*/structuredReport:optional/**A flexible carrier for structured results of an execution request.\nThe goal is to allow for free flow of structured responses from execution tasks to the orchestrator or observer.\nThe full spectrum of different execution report types is not intended to be modeled by this object.*/record StructuredExecutionReport{/**The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)*/type:string/**The serialized value of the structured report\n*/serializedValue:string/**The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)\n*/contentType:string}/**Time at which the request was created*/@Searchable={\"fieldName\":\"startTimeMs\",\"fieldType\":\"COUNT\",\"queryByDefault\":false}startTimeMs:optional long/**Duration in milliseconds*/durationMs:optional long}", SchemaFormatType.PDL));
    private String _statusField = null;
    private String _reportField = null;
    private StructuredExecutionReport _structuredReportField = null;
    private Long _startTimeMsField = null;
    private Long _durationMsField = null;
    private ExecutionRequestResult.ChangeListener __changeListener = new ExecutionRequestResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");
    private final static RecordDataSchema.Field FIELD_Report = SCHEMA.getField("report");
    private final static RecordDataSchema.Field FIELD_StructuredReport = SCHEMA.getField("structuredReport");
    private final static RecordDataSchema.Field FIELD_StartTimeMs = SCHEMA.getField("startTimeMs");
    private final static RecordDataSchema.Field FIELD_DurationMs = SCHEMA.getField("durationMs");

    public ExecutionRequestResult() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ExecutionRequestResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ExecutionRequestResult.Fields fields() {
        return _fields;
    }

    public static ExecutionRequestResult.ProjectionMask createMask() {
        return new ExecutionRequestResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for status
     * 
     * @see ExecutionRequestResult.Fields#status
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
     * @see ExecutionRequestResult.Fields#status
     */
    public void removeStatus() {
        super._map.remove("status");
    }

    /**
     * Getter for status
     * 
     * @see ExecutionRequestResult.Fields#status
     */
    @Nullable
    public String getStatus(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStatus();
            case DEFAULT:
            case NULL:
                if (_statusField!= null) {
                    return _statusField;
                } else {
                    Object __rawValue = super._map.get("status");
                    _statusField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see ExecutionRequestResult.Fields#status
     */
    @Nonnull
    public String getStatus() {
        if (_statusField!= null) {
            return _statusField;
        } else {
            Object __rawValue = super._map.get("status");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("status");
            }
            _statusField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _statusField;
        }
    }

    /**
     * Setter for status
     * 
     * @see ExecutionRequestResult.Fields#status
     */
    public ExecutionRequestResult setStatus(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatus(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field status of com.linkedin.execution.ExecutionRequestResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value);
                    _statusField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatus();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value);
                    _statusField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "status", value);
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
     * @see ExecutionRequestResult.Fields#status
     */
    public ExecutionRequestResult setStatus(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field status of com.linkedin.execution.ExecutionRequestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "status", value);
            _statusField = value;
        }
        return this;
    }

    /**
     * Existence checker for report
     * 
     * @see ExecutionRequestResult.Fields#report
     */
    public boolean hasReport() {
        if (_reportField!= null) {
            return true;
        }
        return super._map.containsKey("report");
    }

    /**
     * Remover for report
     * 
     * @see ExecutionRequestResult.Fields#report
     */
    public void removeReport() {
        super._map.remove("report");
    }

    /**
     * Getter for report
     * 
     * @see ExecutionRequestResult.Fields#report
     */
    @Nullable
    public String getReport(GetMode mode) {
        return getReport();
    }

    /**
     * Getter for report
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExecutionRequestResult.Fields#report
     */
    @Nullable
    public String getReport() {
        if (_reportField!= null) {
            return _reportField;
        } else {
            Object __rawValue = super._map.get("report");
            _reportField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _reportField;
        }
    }

    /**
     * Setter for report
     * 
     * @see ExecutionRequestResult.Fields#report
     */
    public ExecutionRequestResult setReport(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setReport(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeReport();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "report", value);
                    _reportField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "report", value);
                    _reportField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for report
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestResult.Fields#report
     */
    public ExecutionRequestResult setReport(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field report of com.linkedin.execution.ExecutionRequestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "report", value);
            _reportField = value;
        }
        return this;
    }

    /**
     * Existence checker for structuredReport
     * 
     * @see ExecutionRequestResult.Fields#structuredReport
     */
    public boolean hasStructuredReport() {
        if (_structuredReportField!= null) {
            return true;
        }
        return super._map.containsKey("structuredReport");
    }

    /**
     * Remover for structuredReport
     * 
     * @see ExecutionRequestResult.Fields#structuredReport
     */
    public void removeStructuredReport() {
        super._map.remove("structuredReport");
    }

    /**
     * Getter for structuredReport
     * 
     * @see ExecutionRequestResult.Fields#structuredReport
     */
    @Nullable
    public StructuredExecutionReport getStructuredReport(GetMode mode) {
        return getStructuredReport();
    }

    /**
     * Getter for structuredReport
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExecutionRequestResult.Fields#structuredReport
     */
    @Nullable
    public StructuredExecutionReport getStructuredReport() {
        if (_structuredReportField!= null) {
            return _structuredReportField;
        } else {
            Object __rawValue = super._map.get("structuredReport");
            _structuredReportField = ((__rawValue == null)?null:new StructuredExecutionReport(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _structuredReportField;
        }
    }

    /**
     * Setter for structuredReport
     * 
     * @see ExecutionRequestResult.Fields#structuredReport
     */
    public ExecutionRequestResult setStructuredReport(
        @Nullable
        StructuredExecutionReport value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStructuredReport(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStructuredReport();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "structuredReport", value.data());
                    _structuredReportField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "structuredReport", value.data());
                    _structuredReportField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for structuredReport
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestResult.Fields#structuredReport
     */
    public ExecutionRequestResult setStructuredReport(
        @Nonnull
        StructuredExecutionReport value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field structuredReport of com.linkedin.execution.ExecutionRequestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "structuredReport", value.data());
            _structuredReportField = value;
        }
        return this;
    }

    /**
     * Existence checker for startTimeMs
     * 
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    public boolean hasStartTimeMs() {
        if (_startTimeMsField!= null) {
            return true;
        }
        return super._map.containsKey("startTimeMs");
    }

    /**
     * Remover for startTimeMs
     * 
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    public void removeStartTimeMs() {
        super._map.remove("startTimeMs");
    }

    /**
     * Getter for startTimeMs
     * 
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    @Nullable
    public Long getStartTimeMs(GetMode mode) {
        return getStartTimeMs();
    }

    /**
     * Getter for startTimeMs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    @Nullable
    public Long getStartTimeMs() {
        if (_startTimeMsField!= null) {
            return _startTimeMsField;
        } else {
            Object __rawValue = super._map.get("startTimeMs");
            _startTimeMsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _startTimeMsField;
        }
    }

    /**
     * Setter for startTimeMs
     * 
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    public ExecutionRequestResult setStartTimeMs(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStartTimeMs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStartTimeMs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMs", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMs", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for startTimeMs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    public ExecutionRequestResult setStartTimeMs(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field startTimeMs of com.linkedin.execution.ExecutionRequestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "startTimeMs", DataTemplateUtil.coerceLongInput(value));
            _startTimeMsField = value;
        }
        return this;
    }

    /**
     * Setter for startTimeMs
     * 
     * @see ExecutionRequestResult.Fields#startTimeMs
     */
    public ExecutionRequestResult setStartTimeMs(long value) {
        CheckedUtil.putWithoutChecking(super._map, "startTimeMs", DataTemplateUtil.coerceLongInput(value));
        _startTimeMsField = value;
        return this;
    }

    /**
     * Existence checker for durationMs
     * 
     * @see ExecutionRequestResult.Fields#durationMs
     */
    public boolean hasDurationMs() {
        if (_durationMsField!= null) {
            return true;
        }
        return super._map.containsKey("durationMs");
    }

    /**
     * Remover for durationMs
     * 
     * @see ExecutionRequestResult.Fields#durationMs
     */
    public void removeDurationMs() {
        super._map.remove("durationMs");
    }

    /**
     * Getter for durationMs
     * 
     * @see ExecutionRequestResult.Fields#durationMs
     */
    @Nullable
    public Long getDurationMs(GetMode mode) {
        return getDurationMs();
    }

    /**
     * Getter for durationMs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExecutionRequestResult.Fields#durationMs
     */
    @Nullable
    public Long getDurationMs() {
        if (_durationMsField!= null) {
            return _durationMsField;
        } else {
            Object __rawValue = super._map.get("durationMs");
            _durationMsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _durationMsField;
        }
    }

    /**
     * Setter for durationMs
     * 
     * @see ExecutionRequestResult.Fields#durationMs
     */
    public ExecutionRequestResult setDurationMs(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDurationMs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDurationMs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "durationMs", DataTemplateUtil.coerceLongInput(value));
                    _durationMsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "durationMs", DataTemplateUtil.coerceLongInput(value));
                    _durationMsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for durationMs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestResult.Fields#durationMs
     */
    public ExecutionRequestResult setDurationMs(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field durationMs of com.linkedin.execution.ExecutionRequestResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "durationMs", DataTemplateUtil.coerceLongInput(value));
            _durationMsField = value;
        }
        return this;
    }

    /**
     * Setter for durationMs
     * 
     * @see ExecutionRequestResult.Fields#durationMs
     */
    public ExecutionRequestResult setDurationMs(long value) {
        CheckedUtil.putWithoutChecking(super._map, "durationMs", DataTemplateUtil.coerceLongInput(value));
        _durationMsField = value;
        return this;
    }

    @Override
    public ExecutionRequestResult clone()
        throws CloneNotSupportedException
    {
        ExecutionRequestResult __clone = ((ExecutionRequestResult) super.clone());
        __clone.__changeListener = new ExecutionRequestResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ExecutionRequestResult copy()
        throws CloneNotSupportedException
    {
        ExecutionRequestResult __copy = ((ExecutionRequestResult) super.copy());
        __copy._reportField = null;
        __copy._structuredReportField = null;
        __copy._startTimeMsField = null;
        __copy._durationMsField = null;
        __copy._statusField = null;
        __copy.__changeListener = new ExecutionRequestResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ExecutionRequestResult __objectRef;

        private ChangeListener(ExecutionRequestResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "report":
                    __objectRef._reportField = null;
                    break;
                case "structuredReport":
                    __objectRef._structuredReportField = null;
                    break;
                case "startTimeMs":
                    __objectRef._startTimeMsField = null;
                    break;
                case "durationMs":
                    __objectRef._durationMsField = null;
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
         * The status of the execution request
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

        /**
         * The pretty-printed execution report.
         * 
         */
        public PathSpec report() {
            return new PathSpec(getPathComponents(), "report");
        }

        /**
         * A structured report if available.
         * 
         */
        public com.linkedin.execution.StructuredExecutionReport.Fields structuredReport() {
            return new com.linkedin.execution.StructuredExecutionReport.Fields(getPathComponents(), "structuredReport");
        }

        /**
         * Time at which the request was created
         * 
         */
        public PathSpec startTimeMs() {
            return new PathSpec(getPathComponents(), "startTimeMs");
        }

        /**
         * Duration in milliseconds
         * 
         */
        public PathSpec durationMs() {
            return new PathSpec(getPathComponents(), "durationMs");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.execution.StructuredExecutionReport.ProjectionMask _structuredReportMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * The status of the execution request
         * 
         */
        public ExecutionRequestResult.ProjectionMask withStatus() {
            getDataMap().put("status", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The pretty-printed execution report.
         * 
         */
        public ExecutionRequestResult.ProjectionMask withReport() {
            getDataMap().put("report", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A structured report if available.
         * 
         */
        public ExecutionRequestResult.ProjectionMask withStructuredReport(Function<com.linkedin.execution.StructuredExecutionReport.ProjectionMask, com.linkedin.execution.StructuredExecutionReport.ProjectionMask> nestedMask) {
            _structuredReportMask = nestedMask.apply(((_structuredReportMask == null)?StructuredExecutionReport.createMask():_structuredReportMask));
            getDataMap().put("structuredReport", _structuredReportMask.getDataMap());
            return this;
        }

        /**
         * A structured report if available.
         * 
         */
        public ExecutionRequestResult.ProjectionMask withStructuredReport() {
            _structuredReportMask = null;
            getDataMap().put("structuredReport", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Time at which the request was created
         * 
         */
        public ExecutionRequestResult.ProjectionMask withStartTimeMs() {
            getDataMap().put("startTimeMs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Duration in milliseconds
         * 
         */
        public ExecutionRequestResult.ProjectionMask withDurationMs() {
            getDataMap().put("durationMs", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
