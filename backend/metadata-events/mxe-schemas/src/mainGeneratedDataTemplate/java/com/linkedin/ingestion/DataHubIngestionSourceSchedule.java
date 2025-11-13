
package com.linkedin.ingestion;

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
 * The schedule associated with an ingestion source.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ingestion/DataHubIngestionSourceSchedule.pdl.")
public class DataHubIngestionSourceSchedule
    extends RecordTemplate
{

    private final static DataHubIngestionSourceSchedule.Fields _fields = new DataHubIngestionSourceSchedule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ingestion/**The schedule associated with an ingestion source.*/record DataHubIngestionSourceSchedule{/**A cron-formatted execution interval, as a cron string, e.g. * * * * **/interval:string/**Timezone in which the cron interval applies, e.g. America/Los Angeles*/timezone:string}", SchemaFormatType.PDL));
    private String _intervalField = null;
    private String _timezoneField = null;
    private DataHubIngestionSourceSchedule.ChangeListener __changeListener = new DataHubIngestionSourceSchedule.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Interval = SCHEMA.getField("interval");
    private final static RecordDataSchema.Field FIELD_Timezone = SCHEMA.getField("timezone");

    public DataHubIngestionSourceSchedule() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubIngestionSourceSchedule(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubIngestionSourceSchedule.Fields fields() {
        return _fields;
    }

    public static DataHubIngestionSourceSchedule.ProjectionMask createMask() {
        return new DataHubIngestionSourceSchedule.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for interval
     * 
     * @see DataHubIngestionSourceSchedule.Fields#interval
     */
    public boolean hasInterval() {
        if (_intervalField!= null) {
            return true;
        }
        return super._map.containsKey("interval");
    }

    /**
     * Remover for interval
     * 
     * @see DataHubIngestionSourceSchedule.Fields#interval
     */
    public void removeInterval() {
        super._map.remove("interval");
    }

    /**
     * Getter for interval
     * 
     * @see DataHubIngestionSourceSchedule.Fields#interval
     */
    @Nullable
    public String getInterval(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getInterval();
            case DEFAULT:
            case NULL:
                if (_intervalField!= null) {
                    return _intervalField;
                } else {
                    Object __rawValue = super._map.get("interval");
                    _intervalField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _intervalField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for interval
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubIngestionSourceSchedule.Fields#interval
     */
    @Nonnull
    public String getInterval() {
        if (_intervalField!= null) {
            return _intervalField;
        } else {
            Object __rawValue = super._map.get("interval");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("interval");
            }
            _intervalField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _intervalField;
        }
    }

    /**
     * Setter for interval
     * 
     * @see DataHubIngestionSourceSchedule.Fields#interval
     */
    public DataHubIngestionSourceSchedule setInterval(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInterval(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field interval of com.linkedin.ingestion.DataHubIngestionSourceSchedule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "interval", value);
                    _intervalField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInterval();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "interval", value);
                    _intervalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "interval", value);
                    _intervalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for interval
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceSchedule.Fields#interval
     */
    public DataHubIngestionSourceSchedule setInterval(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field interval of com.linkedin.ingestion.DataHubIngestionSourceSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "interval", value);
            _intervalField = value;
        }
        return this;
    }

    /**
     * Existence checker for timezone
     * 
     * @see DataHubIngestionSourceSchedule.Fields#timezone
     */
    public boolean hasTimezone() {
        if (_timezoneField!= null) {
            return true;
        }
        return super._map.containsKey("timezone");
    }

    /**
     * Remover for timezone
     * 
     * @see DataHubIngestionSourceSchedule.Fields#timezone
     */
    public void removeTimezone() {
        super._map.remove("timezone");
    }

    /**
     * Getter for timezone
     * 
     * @see DataHubIngestionSourceSchedule.Fields#timezone
     */
    @Nullable
    public String getTimezone(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTimezone();
            case DEFAULT:
            case NULL:
                if (_timezoneField!= null) {
                    return _timezoneField;
                } else {
                    Object __rawValue = super._map.get("timezone");
                    _timezoneField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _timezoneField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for timezone
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubIngestionSourceSchedule.Fields#timezone
     */
    @Nonnull
    public String getTimezone() {
        if (_timezoneField!= null) {
            return _timezoneField;
        } else {
            Object __rawValue = super._map.get("timezone");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("timezone");
            }
            _timezoneField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _timezoneField;
        }
    }

    /**
     * Setter for timezone
     * 
     * @see DataHubIngestionSourceSchedule.Fields#timezone
     */
    public DataHubIngestionSourceSchedule setTimezone(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimezone(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timezone of com.linkedin.ingestion.DataHubIngestionSourceSchedule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timezone", value);
                    _timezoneField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimezone();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timezone", value);
                    _timezoneField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timezone", value);
                    _timezoneField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timezone
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceSchedule.Fields#timezone
     */
    public DataHubIngestionSourceSchedule setTimezone(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timezone of com.linkedin.ingestion.DataHubIngestionSourceSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timezone", value);
            _timezoneField = value;
        }
        return this;
    }

    @Override
    public DataHubIngestionSourceSchedule clone()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceSchedule __clone = ((DataHubIngestionSourceSchedule) super.clone());
        __clone.__changeListener = new DataHubIngestionSourceSchedule.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubIngestionSourceSchedule copy()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceSchedule __copy = ((DataHubIngestionSourceSchedule) super.copy());
        __copy._timezoneField = null;
        __copy._intervalField = null;
        __copy.__changeListener = new DataHubIngestionSourceSchedule.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubIngestionSourceSchedule __objectRef;

        private ChangeListener(DataHubIngestionSourceSchedule reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "timezone":
                    __objectRef._timezoneField = null;
                    break;
                case "interval":
                    __objectRef._intervalField = null;
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
         * A cron-formatted execution interval, as a cron string, e.g. * * * * *
         * 
         */
        public PathSpec interval() {
            return new PathSpec(getPathComponents(), "interval");
        }

        /**
         * Timezone in which the cron interval applies, e.g. America/Los Angeles
         * 
         */
        public PathSpec timezone() {
            return new PathSpec(getPathComponents(), "timezone");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * A cron-formatted execution interval, as a cron string, e.g. * * * * *
         * 
         */
        public DataHubIngestionSourceSchedule.ProjectionMask withInterval() {
            getDataMap().put("interval", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timezone in which the cron interval applies, e.g. America/Los Angeles
         * 
         */
        public DataHubIngestionSourceSchedule.ProjectionMask withTimezone() {
            getDataMap().put("timezone", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
