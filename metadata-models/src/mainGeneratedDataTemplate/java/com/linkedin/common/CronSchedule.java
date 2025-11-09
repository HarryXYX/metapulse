
package com.linkedin.common;

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
 * Attributes defining a CRON-formatted schedule.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/CronSchedule.pdl.")
public class CronSchedule
    extends RecordTemplate
{

    private final static CronSchedule.Fields _fields = new CronSchedule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Attributes defining a CRON-formatted schedule.*/record CronSchedule{/**A cron-formatted execution interval, as a cron string, e.g. 1 * * * **/cron:string/**Timezone in which the cron interval applies, e.g. America/Los Angeles*/timezone:string}", SchemaFormatType.PDL));
    private String _cronField = null;
    private String _timezoneField = null;
    private CronSchedule.ChangeListener __changeListener = new CronSchedule.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Cron = SCHEMA.getField("cron");
    private final static RecordDataSchema.Field FIELD_Timezone = SCHEMA.getField("timezone");

    public CronSchedule() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CronSchedule(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CronSchedule.Fields fields() {
        return _fields;
    }

    public static CronSchedule.ProjectionMask createMask() {
        return new CronSchedule.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for cron
     * 
     * @see CronSchedule.Fields#cron
     */
    public boolean hasCron() {
        if (_cronField!= null) {
            return true;
        }
        return super._map.containsKey("cron");
    }

    /**
     * Remover for cron
     * 
     * @see CronSchedule.Fields#cron
     */
    public void removeCron() {
        super._map.remove("cron");
    }

    /**
     * Getter for cron
     * 
     * @see CronSchedule.Fields#cron
     */
    @Nullable
    public String getCron(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCron();
            case DEFAULT:
            case NULL:
                if (_cronField!= null) {
                    return _cronField;
                } else {
                    Object __rawValue = super._map.get("cron");
                    _cronField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _cronField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cron
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CronSchedule.Fields#cron
     */
    @Nonnull
    public String getCron() {
        if (_cronField!= null) {
            return _cronField;
        } else {
            Object __rawValue = super._map.get("cron");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("cron");
            }
            _cronField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _cronField;
        }
    }

    /**
     * Setter for cron
     * 
     * @see CronSchedule.Fields#cron
     */
    public CronSchedule setCron(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCron(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cron of com.linkedin.common.CronSchedule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cron", value);
                    _cronField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCron();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cron", value);
                    _cronField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cron", value);
                    _cronField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cron
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CronSchedule.Fields#cron
     */
    public CronSchedule setCron(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cron of com.linkedin.common.CronSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cron", value);
            _cronField = value;
        }
        return this;
    }

    /**
     * Existence checker for timezone
     * 
     * @see CronSchedule.Fields#timezone
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
     * @see CronSchedule.Fields#timezone
     */
    public void removeTimezone() {
        super._map.remove("timezone");
    }

    /**
     * Getter for timezone
     * 
     * @see CronSchedule.Fields#timezone
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
     * @see CronSchedule.Fields#timezone
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
     * @see CronSchedule.Fields#timezone
     */
    public CronSchedule setTimezone(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimezone(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timezone of com.linkedin.common.CronSchedule");
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
     * @see CronSchedule.Fields#timezone
     */
    public CronSchedule setTimezone(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timezone of com.linkedin.common.CronSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timezone", value);
            _timezoneField = value;
        }
        return this;
    }

    @Override
    public CronSchedule clone()
        throws CloneNotSupportedException
    {
        CronSchedule __clone = ((CronSchedule) super.clone());
        __clone.__changeListener = new CronSchedule.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CronSchedule copy()
        throws CloneNotSupportedException
    {
        CronSchedule __copy = ((CronSchedule) super.copy());
        __copy._cronField = null;
        __copy._timezoneField = null;
        __copy.__changeListener = new CronSchedule.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CronSchedule __objectRef;

        private ChangeListener(CronSchedule reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "cron":
                    __objectRef._cronField = null;
                    break;
                case "timezone":
                    __objectRef._timezoneField = null;
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
         * A cron-formatted execution interval, as a cron string, e.g. 1 * * * *
         * 
         */
        public PathSpec cron() {
            return new PathSpec(getPathComponents(), "cron");
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
         * A cron-formatted execution interval, as a cron string, e.g. 1 * * * *
         * 
         */
        public CronSchedule.ProjectionMask withCron() {
            getDataMap().put("cron", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timezone in which the cron interval applies, e.g. America/Los Angeles
         * 
         */
        public CronSchedule.ProjectionMask withTimezone() {
            getDataMap().put("timezone", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
