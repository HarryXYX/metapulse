
package com.linkedin.dataset;

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
import com.linkedin.data.template.StringArray;


/**
 * Stats corresponding to fields in a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class DatasetFieldProfile
    extends RecordTemplate
{

    private final static DatasetFieldProfile.Fields _fields = new DatasetFieldProfile.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Stats corresponding to fields in a dataset*/record DatasetFieldProfile{fieldPath:string,uniqueCount:optional long,uniqueProportion:optional float,nullCount:optional long,nullProportion:optional float,min:optional string,max:optional string,mean:optional string,median:optional string,stdev:optional string,quantiles:optional array[record Quantile{quantile:string,value:string}]distinctValueFrequencies:optional array[record ValueFrequency{value:string,frequency:long}]histogram:optional record Histogram{boundaries:array[string]heights:array[float]}sampleValues:optional array[string]}", SchemaFormatType.PDL));
    private String _fieldPathField = null;
    private Long _uniqueCountField = null;
    private Float _uniqueProportionField = null;
    private Long _nullCountField = null;
    private Float _nullProportionField = null;
    private String _minField = null;
    private String _maxField = null;
    private String _meanField = null;
    private String _medianField = null;
    private String _stdevField = null;
    private QuantileArray _quantilesField = null;
    private ValueFrequencyArray _distinctValueFrequenciesField = null;
    private Histogram _histogramField = null;
    private StringArray _sampleValuesField = null;
    private DatasetFieldProfile.ChangeListener __changeListener = new DatasetFieldProfile.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_UniqueCount = SCHEMA.getField("uniqueCount");
    private final static RecordDataSchema.Field FIELD_UniqueProportion = SCHEMA.getField("uniqueProportion");
    private final static RecordDataSchema.Field FIELD_NullCount = SCHEMA.getField("nullCount");
    private final static RecordDataSchema.Field FIELD_NullProportion = SCHEMA.getField("nullProportion");
    private final static RecordDataSchema.Field FIELD_Min = SCHEMA.getField("min");
    private final static RecordDataSchema.Field FIELD_Max = SCHEMA.getField("max");
    private final static RecordDataSchema.Field FIELD_Mean = SCHEMA.getField("mean");
    private final static RecordDataSchema.Field FIELD_Median = SCHEMA.getField("median");
    private final static RecordDataSchema.Field FIELD_Stdev = SCHEMA.getField("stdev");
    private final static RecordDataSchema.Field FIELD_Quantiles = SCHEMA.getField("quantiles");
    private final static RecordDataSchema.Field FIELD_DistinctValueFrequencies = SCHEMA.getField("distinctValueFrequencies");
    private final static RecordDataSchema.Field FIELD_Histogram = SCHEMA.getField("histogram");
    private final static RecordDataSchema.Field FIELD_SampleValues = SCHEMA.getField("sampleValues");

    public DatasetFieldProfile() {
        super(new DataMap(), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public DatasetFieldProfile(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetFieldProfile.Fields fields() {
        return _fields;
    }

    public static DatasetFieldProfile.ProjectionMask createMask() {
        return new DatasetFieldProfile.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        if (_fieldPathField!= null) {
            return true;
        }
        return super._map.containsKey("fieldPath");
    }

    /**
     * Remover for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    @Nullable
    public String getFieldPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldPath();
            case DEFAULT:
            case NULL:
                if (_fieldPathField!= null) {
                    return _fieldPathField;
                } else {
                    Object __rawValue = super._map.get("fieldPath");
                    _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldPathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        if (_fieldPathField!= null) {
            return _fieldPathField;
        } else {
            Object __rawValue = super._map.get("fieldPath");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldPath");
            }
            _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldPathField;
        }
    }

    /**
     * Setter for fieldPath
     * 
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public DatasetFieldProfile setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.dataset.DatasetFieldProfile");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#fieldPath
     */
    public DatasetFieldProfile setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public boolean hasUniqueCount() {
        if (_uniqueCountField!= null) {
            return true;
        }
        return super._map.containsKey("uniqueCount");
    }

    /**
     * Remover for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public void removeUniqueCount() {
        super._map.remove("uniqueCount");
    }

    /**
     * Getter for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    @Nullable
    public Long getUniqueCount(GetMode mode) {
        return getUniqueCount();
    }

    /**
     * Getter for uniqueCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    @Nullable
    public Long getUniqueCount() {
        if (_uniqueCountField!= null) {
            return _uniqueCountField;
        } else {
            Object __rawValue = super._map.get("uniqueCount");
            _uniqueCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _uniqueCountField;
        }
    }

    /**
     * Setter for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public DatasetFieldProfile setUniqueCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUniqueCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUniqueCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "uniqueCount", DataTemplateUtil.coerceLongInput(value));
                    _uniqueCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "uniqueCount", DataTemplateUtil.coerceLongInput(value));
                    _uniqueCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for uniqueCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public DatasetFieldProfile setUniqueCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field uniqueCount of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "uniqueCount", DataTemplateUtil.coerceLongInput(value));
            _uniqueCountField = value;
        }
        return this;
    }

    /**
     * Setter for uniqueCount
     * 
     * @see DatasetFieldProfile.Fields#uniqueCount
     */
    public DatasetFieldProfile setUniqueCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "uniqueCount", DataTemplateUtil.coerceLongInput(value));
        _uniqueCountField = value;
        return this;
    }

    /**
     * Existence checker for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public boolean hasUniqueProportion() {
        if (_uniqueProportionField!= null) {
            return true;
        }
        return super._map.containsKey("uniqueProportion");
    }

    /**
     * Remover for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public void removeUniqueProportion() {
        super._map.remove("uniqueProportion");
    }

    /**
     * Getter for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    @Nullable
    public Float getUniqueProportion(GetMode mode) {
        return getUniqueProportion();
    }

    /**
     * Getter for uniqueProportion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    @Nullable
    public Float getUniqueProportion() {
        if (_uniqueProportionField!= null) {
            return _uniqueProportionField;
        } else {
            Object __rawValue = super._map.get("uniqueProportion");
            _uniqueProportionField = DataTemplateUtil.coerceFloatOutput(__rawValue);
            return _uniqueProportionField;
        }
    }

    /**
     * Setter for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public DatasetFieldProfile setUniqueProportion(
        @Nullable
        Float value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUniqueProportion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUniqueProportion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "uniqueProportion", DataTemplateUtil.coerceFloatInput(value));
                    _uniqueProportionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "uniqueProportion", DataTemplateUtil.coerceFloatInput(value));
                    _uniqueProportionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for uniqueProportion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public DatasetFieldProfile setUniqueProportion(
        @Nonnull
        Float value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field uniqueProportion of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "uniqueProportion", DataTemplateUtil.coerceFloatInput(value));
            _uniqueProportionField = value;
        }
        return this;
    }

    /**
     * Setter for uniqueProportion
     * 
     * @see DatasetFieldProfile.Fields#uniqueProportion
     */
    public DatasetFieldProfile setUniqueProportion(float value) {
        CheckedUtil.putWithoutChecking(super._map, "uniqueProportion", DataTemplateUtil.coerceFloatInput(value));
        _uniqueProportionField = value;
        return this;
    }

    /**
     * Existence checker for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public boolean hasNullCount() {
        if (_nullCountField!= null) {
            return true;
        }
        return super._map.containsKey("nullCount");
    }

    /**
     * Remover for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public void removeNullCount() {
        super._map.remove("nullCount");
    }

    /**
     * Getter for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    @Nullable
    public Long getNullCount(GetMode mode) {
        return getNullCount();
    }

    /**
     * Getter for nullCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#nullCount
     */
    @Nullable
    public Long getNullCount() {
        if (_nullCountField!= null) {
            return _nullCountField;
        } else {
            Object __rawValue = super._map.get("nullCount");
            _nullCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _nullCountField;
        }
    }

    /**
     * Setter for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public DatasetFieldProfile setNullCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNullCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNullCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nullCount", DataTemplateUtil.coerceLongInput(value));
                    _nullCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nullCount", DataTemplateUtil.coerceLongInput(value));
                    _nullCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nullCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public DatasetFieldProfile setNullCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nullCount of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nullCount", DataTemplateUtil.coerceLongInput(value));
            _nullCountField = value;
        }
        return this;
    }

    /**
     * Setter for nullCount
     * 
     * @see DatasetFieldProfile.Fields#nullCount
     */
    public DatasetFieldProfile setNullCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "nullCount", DataTemplateUtil.coerceLongInput(value));
        _nullCountField = value;
        return this;
    }

    /**
     * Existence checker for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public boolean hasNullProportion() {
        if (_nullProportionField!= null) {
            return true;
        }
        return super._map.containsKey("nullProportion");
    }

    /**
     * Remover for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public void removeNullProportion() {
        super._map.remove("nullProportion");
    }

    /**
     * Getter for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    @Nullable
    public Float getNullProportion(GetMode mode) {
        return getNullProportion();
    }

    /**
     * Getter for nullProportion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    @Nullable
    public Float getNullProportion() {
        if (_nullProportionField!= null) {
            return _nullProportionField;
        } else {
            Object __rawValue = super._map.get("nullProportion");
            _nullProportionField = DataTemplateUtil.coerceFloatOutput(__rawValue);
            return _nullProportionField;
        }
    }

    /**
     * Setter for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public DatasetFieldProfile setNullProportion(
        @Nullable
        Float value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNullProportion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNullProportion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nullProportion", DataTemplateUtil.coerceFloatInput(value));
                    _nullProportionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nullProportion", DataTemplateUtil.coerceFloatInput(value));
                    _nullProportionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nullProportion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public DatasetFieldProfile setNullProportion(
        @Nonnull
        Float value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nullProportion of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nullProportion", DataTemplateUtil.coerceFloatInput(value));
            _nullProportionField = value;
        }
        return this;
    }

    /**
     * Setter for nullProportion
     * 
     * @see DatasetFieldProfile.Fields#nullProportion
     */
    public DatasetFieldProfile setNullProportion(float value) {
        CheckedUtil.putWithoutChecking(super._map, "nullProportion", DataTemplateUtil.coerceFloatInput(value));
        _nullProportionField = value;
        return this;
    }

    /**
     * Existence checker for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public boolean hasMin() {
        if (_minField!= null) {
            return true;
        }
        return super._map.containsKey("min");
    }

    /**
     * Remover for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public void removeMin() {
        super._map.remove("min");
    }

    /**
     * Getter for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    @Nullable
    public String getMin(GetMode mode) {
        return getMin();
    }

    /**
     * Getter for min
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#min
     */
    @Nullable
    public String getMin() {
        if (_minField!= null) {
            return _minField;
        } else {
            Object __rawValue = super._map.get("min");
            _minField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _minField;
        }
    }

    /**
     * Setter for min
     * 
     * @see DatasetFieldProfile.Fields#min
     */
    public DatasetFieldProfile setMin(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMin(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMin();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "min", value);
                    _minField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "min", value);
                    _minField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for min
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#min
     */
    public DatasetFieldProfile setMin(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field min of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "min", value);
            _minField = value;
        }
        return this;
    }

    /**
     * Existence checker for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public boolean hasMax() {
        if (_maxField!= null) {
            return true;
        }
        return super._map.containsKey("max");
    }

    /**
     * Remover for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public void removeMax() {
        super._map.remove("max");
    }

    /**
     * Getter for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    @Nullable
    public String getMax(GetMode mode) {
        return getMax();
    }

    /**
     * Getter for max
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#max
     */
    @Nullable
    public String getMax() {
        if (_maxField!= null) {
            return _maxField;
        } else {
            Object __rawValue = super._map.get("max");
            _maxField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _maxField;
        }
    }

    /**
     * Setter for max
     * 
     * @see DatasetFieldProfile.Fields#max
     */
    public DatasetFieldProfile setMax(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMax(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMax();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "max", value);
                    _maxField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "max", value);
                    _maxField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for max
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#max
     */
    public DatasetFieldProfile setMax(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field max of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "max", value);
            _maxField = value;
        }
        return this;
    }

    /**
     * Existence checker for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public boolean hasMean() {
        if (_meanField!= null) {
            return true;
        }
        return super._map.containsKey("mean");
    }

    /**
     * Remover for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public void removeMean() {
        super._map.remove("mean");
    }

    /**
     * Getter for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    @Nullable
    public String getMean(GetMode mode) {
        return getMean();
    }

    /**
     * Getter for mean
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#mean
     */
    @Nullable
    public String getMean() {
        if (_meanField!= null) {
            return _meanField;
        } else {
            Object __rawValue = super._map.get("mean");
            _meanField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _meanField;
        }
    }

    /**
     * Setter for mean
     * 
     * @see DatasetFieldProfile.Fields#mean
     */
    public DatasetFieldProfile setMean(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMean(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMean();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mean", value);
                    _meanField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "mean", value);
                    _meanField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for mean
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#mean
     */
    public DatasetFieldProfile setMean(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field mean of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "mean", value);
            _meanField = value;
        }
        return this;
    }

    /**
     * Existence checker for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public boolean hasMedian() {
        if (_medianField!= null) {
            return true;
        }
        return super._map.containsKey("median");
    }

    /**
     * Remover for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public void removeMedian() {
        super._map.remove("median");
    }

    /**
     * Getter for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    @Nullable
    public String getMedian(GetMode mode) {
        return getMedian();
    }

    /**
     * Getter for median
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#median
     */
    @Nullable
    public String getMedian() {
        if (_medianField!= null) {
            return _medianField;
        } else {
            Object __rawValue = super._map.get("median");
            _medianField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _medianField;
        }
    }

    /**
     * Setter for median
     * 
     * @see DatasetFieldProfile.Fields#median
     */
    public DatasetFieldProfile setMedian(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMedian(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMedian();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "median", value);
                    _medianField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "median", value);
                    _medianField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for median
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#median
     */
    public DatasetFieldProfile setMedian(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field median of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "median", value);
            _medianField = value;
        }
        return this;
    }

    /**
     * Existence checker for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public boolean hasStdev() {
        if (_stdevField!= null) {
            return true;
        }
        return super._map.containsKey("stdev");
    }

    /**
     * Remover for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public void removeStdev() {
        super._map.remove("stdev");
    }

    /**
     * Getter for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    @Nullable
    public String getStdev(GetMode mode) {
        return getStdev();
    }

    /**
     * Getter for stdev
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#stdev
     */
    @Nullable
    public String getStdev() {
        if (_stdevField!= null) {
            return _stdevField;
        } else {
            Object __rawValue = super._map.get("stdev");
            _stdevField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _stdevField;
        }
    }

    /**
     * Setter for stdev
     * 
     * @see DatasetFieldProfile.Fields#stdev
     */
    public DatasetFieldProfile setStdev(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStdev(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStdev();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "stdev", value);
                    _stdevField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "stdev", value);
                    _stdevField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for stdev
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#stdev
     */
    public DatasetFieldProfile setStdev(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field stdev of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "stdev", value);
            _stdevField = value;
        }
        return this;
    }

    /**
     * Existence checker for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public boolean hasQuantiles() {
        if (_quantilesField!= null) {
            return true;
        }
        return super._map.containsKey("quantiles");
    }

    /**
     * Remover for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public void removeQuantiles() {
        super._map.remove("quantiles");
    }

    /**
     * Getter for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    @Nullable
    public QuantileArray getQuantiles(GetMode mode) {
        return getQuantiles();
    }

    /**
     * Getter for quantiles
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#quantiles
     */
    @Nullable
    public QuantileArray getQuantiles() {
        if (_quantilesField!= null) {
            return _quantilesField;
        } else {
            Object __rawValue = super._map.get("quantiles");
            _quantilesField = ((__rawValue == null)?null:new QuantileArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _quantilesField;
        }
    }

    /**
     * Setter for quantiles
     * 
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public DatasetFieldProfile setQuantiles(
        @Nullable
        QuantileArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQuantiles(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQuantiles();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "quantiles", value.data());
                    _quantilesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "quantiles", value.data());
                    _quantilesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for quantiles
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#quantiles
     */
    public DatasetFieldProfile setQuantiles(
        @Nonnull
        QuantileArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field quantiles of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "quantiles", value.data());
            _quantilesField = value;
        }
        return this;
    }

    /**
     * Existence checker for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public boolean hasDistinctValueFrequencies() {
        if (_distinctValueFrequenciesField!= null) {
            return true;
        }
        return super._map.containsKey("distinctValueFrequencies");
    }

    /**
     * Remover for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public void removeDistinctValueFrequencies() {
        super._map.remove("distinctValueFrequencies");
    }

    /**
     * Getter for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    @Nullable
    public ValueFrequencyArray getDistinctValueFrequencies(GetMode mode) {
        return getDistinctValueFrequencies();
    }

    /**
     * Getter for distinctValueFrequencies
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    @Nullable
    public ValueFrequencyArray getDistinctValueFrequencies() {
        if (_distinctValueFrequenciesField!= null) {
            return _distinctValueFrequenciesField;
        } else {
            Object __rawValue = super._map.get("distinctValueFrequencies");
            _distinctValueFrequenciesField = ((__rawValue == null)?null:new ValueFrequencyArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _distinctValueFrequenciesField;
        }
    }

    /**
     * Setter for distinctValueFrequencies
     * 
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public DatasetFieldProfile setDistinctValueFrequencies(
        @Nullable
        ValueFrequencyArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDistinctValueFrequencies(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDistinctValueFrequencies();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "distinctValueFrequencies", value.data());
                    _distinctValueFrequenciesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "distinctValueFrequencies", value.data());
                    _distinctValueFrequenciesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for distinctValueFrequencies
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#distinctValueFrequencies
     */
    public DatasetFieldProfile setDistinctValueFrequencies(
        @Nonnull
        ValueFrequencyArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field distinctValueFrequencies of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "distinctValueFrequencies", value.data());
            _distinctValueFrequenciesField = value;
        }
        return this;
    }

    /**
     * Existence checker for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public boolean hasHistogram() {
        if (_histogramField!= null) {
            return true;
        }
        return super._map.containsKey("histogram");
    }

    /**
     * Remover for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public void removeHistogram() {
        super._map.remove("histogram");
    }

    /**
     * Getter for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    @Nullable
    public Histogram getHistogram(GetMode mode) {
        return getHistogram();
    }

    /**
     * Getter for histogram
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#histogram
     */
    @Nullable
    public Histogram getHistogram() {
        if (_histogramField!= null) {
            return _histogramField;
        } else {
            Object __rawValue = super._map.get("histogram");
            _histogramField = ((__rawValue == null)?null:new Histogram(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _histogramField;
        }
    }

    /**
     * Setter for histogram
     * 
     * @see DatasetFieldProfile.Fields#histogram
     */
    public DatasetFieldProfile setHistogram(
        @Nullable
        Histogram value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHistogram(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHistogram();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "histogram", value.data());
                    _histogramField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "histogram", value.data());
                    _histogramField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for histogram
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#histogram
     */
    public DatasetFieldProfile setHistogram(
        @Nonnull
        Histogram value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field histogram of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "histogram", value.data());
            _histogramField = value;
        }
        return this;
    }

    /**
     * Existence checker for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public boolean hasSampleValues() {
        if (_sampleValuesField!= null) {
            return true;
        }
        return super._map.containsKey("sampleValues");
    }

    /**
     * Remover for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public void removeSampleValues() {
        super._map.remove("sampleValues");
    }

    /**
     * Getter for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    @Nullable
    public StringArray getSampleValues(GetMode mode) {
        return getSampleValues();
    }

    /**
     * Getter for sampleValues
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    @Nullable
    public StringArray getSampleValues() {
        if (_sampleValuesField!= null) {
            return _sampleValuesField;
        } else {
            Object __rawValue = super._map.get("sampleValues");
            _sampleValuesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _sampleValuesField;
        }
    }

    /**
     * Setter for sampleValues
     * 
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public DatasetFieldProfile setSampleValues(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSampleValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSampleValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sampleValues", value.data());
                    _sampleValuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sampleValues", value.data());
                    _sampleValuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sampleValues
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldProfile.Fields#sampleValues
     */
    public DatasetFieldProfile setSampleValues(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sampleValues of com.linkedin.dataset.DatasetFieldProfile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sampleValues", value.data());
            _sampleValuesField = value;
        }
        return this;
    }

    @Override
    public DatasetFieldProfile clone()
        throws CloneNotSupportedException
    {
        DatasetFieldProfile __clone = ((DatasetFieldProfile) super.clone());
        __clone.__changeListener = new DatasetFieldProfile.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetFieldProfile copy()
        throws CloneNotSupportedException
    {
        DatasetFieldProfile __copy = ((DatasetFieldProfile) super.copy());
        __copy._maxField = null;
        __copy._sampleValuesField = null;
        __copy._distinctValueFrequenciesField = null;
        __copy._nullCountField = null;
        __copy._nullProportionField = null;
        __copy._quantilesField = null;
        __copy._histogramField = null;
        __copy._uniqueProportionField = null;
        __copy._minField = null;
        __copy._medianField = null;
        __copy._meanField = null;
        __copy._fieldPathField = null;
        __copy._stdevField = null;
        __copy._uniqueCountField = null;
        __copy.__changeListener = new DatasetFieldProfile.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetFieldProfile __objectRef;

        private ChangeListener(DatasetFieldProfile reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "max":
                    __objectRef._maxField = null;
                    break;
                case "sampleValues":
                    __objectRef._sampleValuesField = null;
                    break;
                case "distinctValueFrequencies":
                    __objectRef._distinctValueFrequenciesField = null;
                    break;
                case "nullCount":
                    __objectRef._nullCountField = null;
                    break;
                case "nullProportion":
                    __objectRef._nullProportionField = null;
                    break;
                case "quantiles":
                    __objectRef._quantilesField = null;
                    break;
                case "histogram":
                    __objectRef._histogramField = null;
                    break;
                case "uniqueProportion":
                    __objectRef._uniqueProportionField = null;
                    break;
                case "min":
                    __objectRef._minField = null;
                    break;
                case "median":
                    __objectRef._medianField = null;
                    break;
                case "mean":
                    __objectRef._meanField = null;
                    break;
                case "fieldPath":
                    __objectRef._fieldPathField = null;
                    break;
                case "stdev":
                    __objectRef._stdevField = null;
                    break;
                case "uniqueCount":
                    __objectRef._uniqueCountField = null;
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

        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        public PathSpec uniqueCount() {
            return new PathSpec(getPathComponents(), "uniqueCount");
        }

        public PathSpec uniqueProportion() {
            return new PathSpec(getPathComponents(), "uniqueProportion");
        }

        public PathSpec nullCount() {
            return new PathSpec(getPathComponents(), "nullCount");
        }

        public PathSpec nullProportion() {
            return new PathSpec(getPathComponents(), "nullProportion");
        }

        public PathSpec min() {
            return new PathSpec(getPathComponents(), "min");
        }

        public PathSpec max() {
            return new PathSpec(getPathComponents(), "max");
        }

        public PathSpec mean() {
            return new PathSpec(getPathComponents(), "mean");
        }

        public PathSpec median() {
            return new PathSpec(getPathComponents(), "median");
        }

        public PathSpec stdev() {
            return new PathSpec(getPathComponents(), "stdev");
        }

        public com.linkedin.dataset.QuantileArray.Fields quantiles() {
            return new com.linkedin.dataset.QuantileArray.Fields(getPathComponents(), "quantiles");
        }

        public PathSpec quantiles(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "quantiles");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public com.linkedin.dataset.ValueFrequencyArray.Fields distinctValueFrequencies() {
            return new com.linkedin.dataset.ValueFrequencyArray.Fields(getPathComponents(), "distinctValueFrequencies");
        }

        public PathSpec distinctValueFrequencies(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "distinctValueFrequencies");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public com.linkedin.dataset.Histogram.Fields histogram() {
            return new com.linkedin.dataset.Histogram.Fields(getPathComponents(), "histogram");
        }

        public PathSpec sampleValues() {
            return new PathSpec(getPathComponents(), "sampleValues");
        }

        public PathSpec sampleValues(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sampleValues");
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

        private com.linkedin.dataset.QuantileArray.ProjectionMask _quantilesMask;
        private com.linkedin.dataset.ValueFrequencyArray.ProjectionMask _distinctValueFrequenciesMask;
        private com.linkedin.dataset.Histogram.ProjectionMask _histogramMask;

        ProjectionMask() {
        }

        public DatasetFieldProfile.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withUniqueCount() {
            getDataMap().put("uniqueCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withUniqueProportion() {
            getDataMap().put("uniqueProportion", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withNullCount() {
            getDataMap().put("nullCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withNullProportion() {
            getDataMap().put("nullProportion", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withMin() {
            getDataMap().put("min", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withMax() {
            getDataMap().put("max", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withMean() {
            getDataMap().put("mean", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withMedian() {
            getDataMap().put("median", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withStdev() {
            getDataMap().put("stdev", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withQuantiles(Function<com.linkedin.dataset.QuantileArray.ProjectionMask, com.linkedin.dataset.QuantileArray.ProjectionMask> nestedMask) {
            _quantilesMask = nestedMask.apply(((_quantilesMask == null)?QuantileArray.createMask():_quantilesMask));
            getDataMap().put("quantiles", _quantilesMask.getDataMap());
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withQuantiles() {
            _quantilesMask = null;
            getDataMap().put("quantiles", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withQuantiles(Function<com.linkedin.dataset.QuantileArray.ProjectionMask, com.linkedin.dataset.QuantileArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _quantilesMask = nestedMask.apply(((_quantilesMask == null)?QuantileArray.createMask():_quantilesMask));
            getDataMap().put("quantiles", _quantilesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("quantiles").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("quantiles").put("$count", count);
            }
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withQuantiles(Integer start, Integer count) {
            _quantilesMask = null;
            getDataMap().put("quantiles", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("quantiles").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("quantiles").put("$count", count);
            }
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withDistinctValueFrequencies(Function<com.linkedin.dataset.ValueFrequencyArray.ProjectionMask, com.linkedin.dataset.ValueFrequencyArray.ProjectionMask> nestedMask) {
            _distinctValueFrequenciesMask = nestedMask.apply(((_distinctValueFrequenciesMask == null)?ValueFrequencyArray.createMask():_distinctValueFrequenciesMask));
            getDataMap().put("distinctValueFrequencies", _distinctValueFrequenciesMask.getDataMap());
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withDistinctValueFrequencies() {
            _distinctValueFrequenciesMask = null;
            getDataMap().put("distinctValueFrequencies", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withDistinctValueFrequencies(Function<com.linkedin.dataset.ValueFrequencyArray.ProjectionMask, com.linkedin.dataset.ValueFrequencyArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _distinctValueFrequenciesMask = nestedMask.apply(((_distinctValueFrequenciesMask == null)?ValueFrequencyArray.createMask():_distinctValueFrequenciesMask));
            getDataMap().put("distinctValueFrequencies", _distinctValueFrequenciesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("distinctValueFrequencies").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("distinctValueFrequencies").put("$count", count);
            }
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withDistinctValueFrequencies(Integer start, Integer count) {
            _distinctValueFrequenciesMask = null;
            getDataMap().put("distinctValueFrequencies", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("distinctValueFrequencies").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("distinctValueFrequencies").put("$count", count);
            }
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withHistogram(Function<com.linkedin.dataset.Histogram.ProjectionMask, com.linkedin.dataset.Histogram.ProjectionMask> nestedMask) {
            _histogramMask = nestedMask.apply(((_histogramMask == null)?Histogram.createMask():_histogramMask));
            getDataMap().put("histogram", _histogramMask.getDataMap());
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withHistogram() {
            _histogramMask = null;
            getDataMap().put("histogram", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withSampleValues() {
            getDataMap().put("sampleValues", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetFieldProfile.ProjectionMask withSampleValues(Integer start, Integer count) {
            getDataMap().put("sampleValues", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("sampleValues").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sampleValues").put("$count", count);
            }
            return this;
        }

    }

}
