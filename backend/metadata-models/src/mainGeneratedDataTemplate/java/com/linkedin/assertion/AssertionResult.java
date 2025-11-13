
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * The result of running an assertion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionResult.pdl.")
public class AssertionResult
    extends RecordTemplate
{

    private final static AssertionResult.Fields _fields = new AssertionResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**The result of running an assertion*/record AssertionResult{/** The final result, e.g. either SUCCESS, FAILURE, or ERROR.*/@Searchable={}@TimeseriesField={}type:/** The final result of evaluating an assertion, e.g. SUCCESS, FAILURE, or ERROR.*/enum AssertionResultType{/** The Assertion has not yet been fully evaluated*/INIT/** The Assertion Succeeded*/SUCCESS/** The Assertion Failed*/FAILURE/** The Assertion encountered an Error*/ERROR}/**Number of rows for evaluated batch*/rowCount:optional long/**Number of rows with missing value for evaluated batch*/missingCount:optional long/**Number of rows with unexpected value for evaluated batch*/unexpectedCount:optional long/**Observed aggregate value for evaluated batch*/actualAggValue:optional float/**Other results of evaluation*/nativeResults:optional map[string,string]/**External URL where full results are available. Only present when assertion source is not native.*/externalUrl:optional string/** The error object if AssertionResultType is an Error*/error:optional/** An error encountered when evaluating an AssertionResult*/record AssertionResultError{/** The type of error encountered*/type:enum AssertionResultErrorType{/** Source is unreachable*/SOURCE_CONNECTION_ERROR/** Source query failed to execute*/SOURCE_QUERY_FAILED/** Insufficient data to evaluate the assertion*/INSUFFICIENT_DATA/** Invalid parameters were detected*/INVALID_PARAMETERS/** Event type not supported by the specified source*/INVALID_SOURCE_TYPE/** Unsupported platform*/UNSUPPORTED_PLATFORM/** Error while executing a custom SQL assertion*/CUSTOM_SQL_ERROR/** Error while executing a field assertion*/FIELD_ASSERTION_ERROR/** Unknown error*/UNKNOWN_ERROR}/** Additional metadata depending on the type of error*/properties:optional map[string,string]}}", SchemaFormatType.PDL));
    private AssertionResultType _typeField = null;
    private Long _rowCountField = null;
    private Long _missingCountField = null;
    private Long _unexpectedCountField = null;
    private Float _actualAggValueField = null;
    private StringMap _nativeResultsField = null;
    private String _externalUrlField = null;
    private AssertionResultError _errorField = null;
    private AssertionResult.ChangeListener __changeListener = new AssertionResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_RowCount = SCHEMA.getField("rowCount");
    private final static RecordDataSchema.Field FIELD_MissingCount = SCHEMA.getField("missingCount");
    private final static RecordDataSchema.Field FIELD_UnexpectedCount = SCHEMA.getField("unexpectedCount");
    private final static RecordDataSchema.Field FIELD_ActualAggValue = SCHEMA.getField("actualAggValue");
    private final static RecordDataSchema.Field FIELD_NativeResults = SCHEMA.getField("nativeResults");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Error = SCHEMA.getField("error");

    public AssertionResult() {
        super(new DataMap(11, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public AssertionResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionResult.Fields fields() {
        return _fields;
    }

    public static AssertionResult.ProjectionMask createMask() {
        return new AssertionResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see AssertionResult.Fields#type
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
     * @see AssertionResult.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see AssertionResult.Fields#type
     */
    @Nullable
    public AssertionResultType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionResultType.class, AssertionResultType.$UNKNOWN);
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
     * @see AssertionResult.Fields#type
     */
    @Nonnull
    public AssertionResultType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionResultType.class, AssertionResultType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see AssertionResult.Fields#type
     */
    public AssertionResult setType(
        @Nullable
        AssertionResultType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.AssertionResult");
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
     * @see AssertionResult.Fields#type
     */
    public AssertionResult setType(
        @Nonnull
        AssertionResultType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for rowCount
     * 
     * @see AssertionResult.Fields#rowCount
     */
    public boolean hasRowCount() {
        if (_rowCountField!= null) {
            return true;
        }
        return super._map.containsKey("rowCount");
    }

    /**
     * Remover for rowCount
     * 
     * @see AssertionResult.Fields#rowCount
     */
    public void removeRowCount() {
        super._map.remove("rowCount");
    }

    /**
     * Getter for rowCount
     * 
     * @see AssertionResult.Fields#rowCount
     */
    @Nullable
    public Long getRowCount(GetMode mode) {
        return getRowCount();
    }

    /**
     * Getter for rowCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#rowCount
     */
    @Nullable
    public Long getRowCount() {
        if (_rowCountField!= null) {
            return _rowCountField;
        } else {
            Object __rawValue = super._map.get("rowCount");
            _rowCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _rowCountField;
        }
    }

    /**
     * Setter for rowCount
     * 
     * @see AssertionResult.Fields#rowCount
     */
    public AssertionResult setRowCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRowCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRowCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rowCount", DataTemplateUtil.coerceLongInput(value));
                    _rowCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rowCount", DataTemplateUtil.coerceLongInput(value));
                    _rowCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rowCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResult.Fields#rowCount
     */
    public AssertionResult setRowCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rowCount of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rowCount", DataTemplateUtil.coerceLongInput(value));
            _rowCountField = value;
        }
        return this;
    }

    /**
     * Setter for rowCount
     * 
     * @see AssertionResult.Fields#rowCount
     */
    public AssertionResult setRowCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "rowCount", DataTemplateUtil.coerceLongInput(value));
        _rowCountField = value;
        return this;
    }

    /**
     * Existence checker for missingCount
     * 
     * @see AssertionResult.Fields#missingCount
     */
    public boolean hasMissingCount() {
        if (_missingCountField!= null) {
            return true;
        }
        return super._map.containsKey("missingCount");
    }

    /**
     * Remover for missingCount
     * 
     * @see AssertionResult.Fields#missingCount
     */
    public void removeMissingCount() {
        super._map.remove("missingCount");
    }

    /**
     * Getter for missingCount
     * 
     * @see AssertionResult.Fields#missingCount
     */
    @Nullable
    public Long getMissingCount(GetMode mode) {
        return getMissingCount();
    }

    /**
     * Getter for missingCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#missingCount
     */
    @Nullable
    public Long getMissingCount() {
        if (_missingCountField!= null) {
            return _missingCountField;
        } else {
            Object __rawValue = super._map.get("missingCount");
            _missingCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _missingCountField;
        }
    }

    /**
     * Setter for missingCount
     * 
     * @see AssertionResult.Fields#missingCount
     */
    public AssertionResult setMissingCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMissingCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMissingCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "missingCount", DataTemplateUtil.coerceLongInput(value));
                    _missingCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "missingCount", DataTemplateUtil.coerceLongInput(value));
                    _missingCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for missingCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResult.Fields#missingCount
     */
    public AssertionResult setMissingCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field missingCount of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "missingCount", DataTemplateUtil.coerceLongInput(value));
            _missingCountField = value;
        }
        return this;
    }

    /**
     * Setter for missingCount
     * 
     * @see AssertionResult.Fields#missingCount
     */
    public AssertionResult setMissingCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "missingCount", DataTemplateUtil.coerceLongInput(value));
        _missingCountField = value;
        return this;
    }

    /**
     * Existence checker for unexpectedCount
     * 
     * @see AssertionResult.Fields#unexpectedCount
     */
    public boolean hasUnexpectedCount() {
        if (_unexpectedCountField!= null) {
            return true;
        }
        return super._map.containsKey("unexpectedCount");
    }

    /**
     * Remover for unexpectedCount
     * 
     * @see AssertionResult.Fields#unexpectedCount
     */
    public void removeUnexpectedCount() {
        super._map.remove("unexpectedCount");
    }

    /**
     * Getter for unexpectedCount
     * 
     * @see AssertionResult.Fields#unexpectedCount
     */
    @Nullable
    public Long getUnexpectedCount(GetMode mode) {
        return getUnexpectedCount();
    }

    /**
     * Getter for unexpectedCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#unexpectedCount
     */
    @Nullable
    public Long getUnexpectedCount() {
        if (_unexpectedCountField!= null) {
            return _unexpectedCountField;
        } else {
            Object __rawValue = super._map.get("unexpectedCount");
            _unexpectedCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _unexpectedCountField;
        }
    }

    /**
     * Setter for unexpectedCount
     * 
     * @see AssertionResult.Fields#unexpectedCount
     */
    public AssertionResult setUnexpectedCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUnexpectedCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUnexpectedCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unexpectedCount", DataTemplateUtil.coerceLongInput(value));
                    _unexpectedCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "unexpectedCount", DataTemplateUtil.coerceLongInput(value));
                    _unexpectedCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for unexpectedCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResult.Fields#unexpectedCount
     */
    public AssertionResult setUnexpectedCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field unexpectedCount of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "unexpectedCount", DataTemplateUtil.coerceLongInput(value));
            _unexpectedCountField = value;
        }
        return this;
    }

    /**
     * Setter for unexpectedCount
     * 
     * @see AssertionResult.Fields#unexpectedCount
     */
    public AssertionResult setUnexpectedCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "unexpectedCount", DataTemplateUtil.coerceLongInput(value));
        _unexpectedCountField = value;
        return this;
    }

    /**
     * Existence checker for actualAggValue
     * 
     * @see AssertionResult.Fields#actualAggValue
     */
    public boolean hasActualAggValue() {
        if (_actualAggValueField!= null) {
            return true;
        }
        return super._map.containsKey("actualAggValue");
    }

    /**
     * Remover for actualAggValue
     * 
     * @see AssertionResult.Fields#actualAggValue
     */
    public void removeActualAggValue() {
        super._map.remove("actualAggValue");
    }

    /**
     * Getter for actualAggValue
     * 
     * @see AssertionResult.Fields#actualAggValue
     */
    @Nullable
    public Float getActualAggValue(GetMode mode) {
        return getActualAggValue();
    }

    /**
     * Getter for actualAggValue
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#actualAggValue
     */
    @Nullable
    public Float getActualAggValue() {
        if (_actualAggValueField!= null) {
            return _actualAggValueField;
        } else {
            Object __rawValue = super._map.get("actualAggValue");
            _actualAggValueField = DataTemplateUtil.coerceFloatOutput(__rawValue);
            return _actualAggValueField;
        }
    }

    /**
     * Setter for actualAggValue
     * 
     * @see AssertionResult.Fields#actualAggValue
     */
    public AssertionResult setActualAggValue(
        @Nullable
        Float value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActualAggValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActualAggValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actualAggValue", DataTemplateUtil.coerceFloatInput(value));
                    _actualAggValueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actualAggValue", DataTemplateUtil.coerceFloatInput(value));
                    _actualAggValueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actualAggValue
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResult.Fields#actualAggValue
     */
    public AssertionResult setActualAggValue(
        @Nonnull
        Float value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actualAggValue of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actualAggValue", DataTemplateUtil.coerceFloatInput(value));
            _actualAggValueField = value;
        }
        return this;
    }

    /**
     * Setter for actualAggValue
     * 
     * @see AssertionResult.Fields#actualAggValue
     */
    public AssertionResult setActualAggValue(float value) {
        CheckedUtil.putWithoutChecking(super._map, "actualAggValue", DataTemplateUtil.coerceFloatInput(value));
        _actualAggValueField = value;
        return this;
    }

    /**
     * Existence checker for nativeResults
     * 
     * @see AssertionResult.Fields#nativeResults
     */
    public boolean hasNativeResults() {
        if (_nativeResultsField!= null) {
            return true;
        }
        return super._map.containsKey("nativeResults");
    }

    /**
     * Remover for nativeResults
     * 
     * @see AssertionResult.Fields#nativeResults
     */
    public void removeNativeResults() {
        super._map.remove("nativeResults");
    }

    /**
     * Getter for nativeResults
     * 
     * @see AssertionResult.Fields#nativeResults
     */
    @Nullable
    public StringMap getNativeResults(GetMode mode) {
        return getNativeResults();
    }

    /**
     * Getter for nativeResults
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#nativeResults
     */
    @Nullable
    public StringMap getNativeResults() {
        if (_nativeResultsField!= null) {
            return _nativeResultsField;
        } else {
            Object __rawValue = super._map.get("nativeResults");
            _nativeResultsField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _nativeResultsField;
        }
    }

    /**
     * Setter for nativeResults
     * 
     * @see AssertionResult.Fields#nativeResults
     */
    public AssertionResult setNativeResults(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeResults(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeResults();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeResults", value.data());
                    _nativeResultsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeResults", value.data());
                    _nativeResultsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeResults
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResult.Fields#nativeResults
     */
    public AssertionResult setNativeResults(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeResults of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeResults", value.data());
            _nativeResultsField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see AssertionResult.Fields#externalUrl
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
     * @see AssertionResult.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see AssertionResult.Fields#externalUrl
     */
    @Nullable
    public String getExternalUrl(GetMode mode) {
        return getExternalUrl();
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#externalUrl
     */
    @Nullable
    public String getExternalUrl() {
        if (_externalUrlField!= null) {
            return _externalUrlField;
        } else {
            Object __rawValue = super._map.get("externalUrl");
            _externalUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _externalUrlField;
        }
    }

    /**
     * Setter for externalUrl
     * 
     * @see AssertionResult.Fields#externalUrl
     */
    public AssertionResult setExternalUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", value);
                    _externalUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", value);
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
     * @see AssertionResult.Fields#externalUrl
     */
    public AssertionResult setExternalUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", value);
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for error
     * 
     * @see AssertionResult.Fields#error
     */
    public boolean hasError() {
        if (_errorField!= null) {
            return true;
        }
        return super._map.containsKey("error");
    }

    /**
     * Remover for error
     * 
     * @see AssertionResult.Fields#error
     */
    public void removeError() {
        super._map.remove("error");
    }

    /**
     * Getter for error
     * 
     * @see AssertionResult.Fields#error
     */
    @Nullable
    public AssertionResultError getError(GetMode mode) {
        return getError();
    }

    /**
     * Getter for error
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResult.Fields#error
     */
    @Nullable
    public AssertionResultError getError() {
        if (_errorField!= null) {
            return _errorField;
        } else {
            Object __rawValue = super._map.get("error");
            _errorField = ((__rawValue == null)?null:new AssertionResultError(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _errorField;
        }
    }

    /**
     * Setter for error
     * 
     * @see AssertionResult.Fields#error
     */
    public AssertionResult setError(
        @Nullable
        AssertionResultError value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setError(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeError();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "error", value.data());
                    _errorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "error", value.data());
                    _errorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for error
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResult.Fields#error
     */
    public AssertionResult setError(
        @Nonnull
        AssertionResultError value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field error of com.linkedin.assertion.AssertionResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "error", value.data());
            _errorField = value;
        }
        return this;
    }

    @Override
    public AssertionResult clone()
        throws CloneNotSupportedException
    {
        AssertionResult __clone = ((AssertionResult) super.clone());
        __clone.__changeListener = new AssertionResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionResult copy()
        throws CloneNotSupportedException
    {
        AssertionResult __copy = ((AssertionResult) super.copy());
        __copy._externalUrlField = null;
        __copy._missingCountField = null;
        __copy._actualAggValueField = null;
        __copy._rowCountField = null;
        __copy._typeField = null;
        __copy._errorField = null;
        __copy._nativeResultsField = null;
        __copy._unexpectedCountField = null;
        __copy.__changeListener = new AssertionResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionResult __objectRef;

        private ChangeListener(AssertionResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "missingCount":
                    __objectRef._missingCountField = null;
                    break;
                case "actualAggValue":
                    __objectRef._actualAggValueField = null;
                    break;
                case "rowCount":
                    __objectRef._rowCountField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "error":
                    __objectRef._errorField = null;
                    break;
                case "nativeResults":
                    __objectRef._nativeResultsField = null;
                    break;
                case "unexpectedCount":
                    __objectRef._unexpectedCountField = null;
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
         *  The final result, e.g. either SUCCESS, FAILURE, or ERROR.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Number of rows for evaluated batch
         * 
         */
        public PathSpec rowCount() {
            return new PathSpec(getPathComponents(), "rowCount");
        }

        /**
         * Number of rows with missing value for evaluated batch
         * 
         */
        public PathSpec missingCount() {
            return new PathSpec(getPathComponents(), "missingCount");
        }

        /**
         * Number of rows with unexpected value for evaluated batch
         * 
         */
        public PathSpec unexpectedCount() {
            return new PathSpec(getPathComponents(), "unexpectedCount");
        }

        /**
         * Observed aggregate value for evaluated batch
         * 
         */
        public PathSpec actualAggValue() {
            return new PathSpec(getPathComponents(), "actualAggValue");
        }

        /**
         * Other results of evaluation
         * 
         */
        public PathSpec nativeResults() {
            return new PathSpec(getPathComponents(), "nativeResults");
        }

        /**
         * External URL where full results are available. Only present when assertion source is not native.
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         *  The error object if AssertionResultType is an Error
         * 
         */
        public com.linkedin.assertion.AssertionResultError.Fields error() {
            return new com.linkedin.assertion.AssertionResultError.Fields(getPathComponents(), "error");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.AssertionResultError.ProjectionMask _errorMask;

        ProjectionMask() {
            super(11);
        }

        /**
         *  The final result, e.g. either SUCCESS, FAILURE, or ERROR.
         * 
         */
        public AssertionResult.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of rows for evaluated batch
         * 
         */
        public AssertionResult.ProjectionMask withRowCount() {
            getDataMap().put("rowCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of rows with missing value for evaluated batch
         * 
         */
        public AssertionResult.ProjectionMask withMissingCount() {
            getDataMap().put("missingCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of rows with unexpected value for evaluated batch
         * 
         */
        public AssertionResult.ProjectionMask withUnexpectedCount() {
            getDataMap().put("unexpectedCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Observed aggregate value for evaluated batch
         * 
         */
        public AssertionResult.ProjectionMask withActualAggValue() {
            getDataMap().put("actualAggValue", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Other results of evaluation
         * 
         */
        public AssertionResult.ProjectionMask withNativeResults() {
            getDataMap().put("nativeResults", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * External URL where full results are available. Only present when assertion source is not native.
         * 
         */
        public AssertionResult.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  The error object if AssertionResultType is an Error
         * 
         */
        public AssertionResult.ProjectionMask withError(Function<com.linkedin.assertion.AssertionResultError.ProjectionMask, com.linkedin.assertion.AssertionResultError.ProjectionMask> nestedMask) {
            _errorMask = nestedMask.apply(((_errorMask == null)?AssertionResultError.createMask():_errorMask));
            getDataMap().put("error", _errorMask.getDataMap());
            return this;
        }

        /**
         *  The error object if AssertionResultType is an Error
         * 
         */
        public AssertionResult.ProjectionMask withError() {
            _errorMask = null;
            getDataMap().put("error", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
