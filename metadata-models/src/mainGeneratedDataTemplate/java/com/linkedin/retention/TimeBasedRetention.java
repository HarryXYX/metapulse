
package com.linkedin.retention;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Keep records that are less than X seconds old
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/retention/TimeBasedRetention.pdl.")
public class TimeBasedRetention
    extends RecordTemplate
{

    private final static TimeBasedRetention.Fields _fields = new TimeBasedRetention.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.retention/**Keep records that are less than X seconds old*/record TimeBasedRetention{maxAgeInSeconds:int}", SchemaFormatType.PDL));
    private Integer _maxAgeInSecondsField = null;
    private TimeBasedRetention.ChangeListener __changeListener = new TimeBasedRetention.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_MaxAgeInSeconds = SCHEMA.getField("maxAgeInSeconds");

    public TimeBasedRetention() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TimeBasedRetention(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TimeBasedRetention.Fields fields() {
        return _fields;
    }

    public static TimeBasedRetention.ProjectionMask createMask() {
        return new TimeBasedRetention.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for maxAgeInSeconds
     * 
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    public boolean hasMaxAgeInSeconds() {
        if (_maxAgeInSecondsField!= null) {
            return true;
        }
        return super._map.containsKey("maxAgeInSeconds");
    }

    /**
     * Remover for maxAgeInSeconds
     * 
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    public void removeMaxAgeInSeconds() {
        super._map.remove("maxAgeInSeconds");
    }

    /**
     * Getter for maxAgeInSeconds
     * 
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    @Nullable
    public Integer getMaxAgeInSeconds(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMaxAgeInSeconds();
            case DEFAULT:
            case NULL:
                if (_maxAgeInSecondsField!= null) {
                    return _maxAgeInSecondsField;
                } else {
                    Object __rawValue = super._map.get("maxAgeInSeconds");
                    _maxAgeInSecondsField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _maxAgeInSecondsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for maxAgeInSeconds
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    @Nonnull
    public Integer getMaxAgeInSeconds() {
        if (_maxAgeInSecondsField!= null) {
            return _maxAgeInSecondsField;
        } else {
            Object __rawValue = super._map.get("maxAgeInSeconds");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("maxAgeInSeconds");
            }
            _maxAgeInSecondsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _maxAgeInSecondsField;
        }
    }

    /**
     * Setter for maxAgeInSeconds
     * 
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    public TimeBasedRetention setMaxAgeInSeconds(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMaxAgeInSeconds(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field maxAgeInSeconds of com.linkedin.retention.TimeBasedRetention");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxAgeInSeconds", DataTemplateUtil.coerceIntInput(value));
                    _maxAgeInSecondsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMaxAgeInSeconds();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxAgeInSeconds", DataTemplateUtil.coerceIntInput(value));
                    _maxAgeInSecondsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "maxAgeInSeconds", DataTemplateUtil.coerceIntInput(value));
                    _maxAgeInSecondsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for maxAgeInSeconds
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    public TimeBasedRetention setMaxAgeInSeconds(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field maxAgeInSeconds of com.linkedin.retention.TimeBasedRetention to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "maxAgeInSeconds", DataTemplateUtil.coerceIntInput(value));
            _maxAgeInSecondsField = value;
        }
        return this;
    }

    /**
     * Setter for maxAgeInSeconds
     * 
     * @see TimeBasedRetention.Fields#maxAgeInSeconds
     */
    public TimeBasedRetention setMaxAgeInSeconds(int value) {
        CheckedUtil.putWithoutChecking(super._map, "maxAgeInSeconds", DataTemplateUtil.coerceIntInput(value));
        _maxAgeInSecondsField = value;
        return this;
    }

    @Override
    public TimeBasedRetention clone()
        throws CloneNotSupportedException
    {
        TimeBasedRetention __clone = ((TimeBasedRetention) super.clone());
        __clone.__changeListener = new TimeBasedRetention.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TimeBasedRetention copy()
        throws CloneNotSupportedException
    {
        TimeBasedRetention __copy = ((TimeBasedRetention) super.copy());
        __copy._maxAgeInSecondsField = null;
        __copy.__changeListener = new TimeBasedRetention.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TimeBasedRetention __objectRef;

        private ChangeListener(TimeBasedRetention reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "maxAgeInSeconds":
                    __objectRef._maxAgeInSecondsField = null;
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

        public PathSpec maxAgeInSeconds() {
            return new PathSpec(getPathComponents(), "maxAgeInSeconds");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public TimeBasedRetention.ProjectionMask withMaxAgeInSeconds() {
            getDataMap().put("maxAgeInSeconds", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
