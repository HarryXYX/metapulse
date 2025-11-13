
package com.linkedin.retention;

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
import com.linkedin.data.template.SetMode;


/**
 * Base class that encapsulates different retention policies.
 * Only one of the fields should be set
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/retention/Retention.pdl.")
public class Retention
    extends RecordTemplate
{

    private final static Retention.Fields _fields = new Retention.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.retention/**Base class that encapsulates different retention policies.\nOnly one of the fields should be set*/record Retention{version:optional/**Keep max N latest records*/record VersionBasedRetention{maxVersions:int}time:optional/**Keep records that are less than X seconds old*/record TimeBasedRetention{maxAgeInSeconds:int}}", SchemaFormatType.PDL));
    private VersionBasedRetention _versionField = null;
    private TimeBasedRetention _timeField = null;
    private Retention.ChangeListener __changeListener = new Retention.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Time = SCHEMA.getField("time");

    public Retention() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public Retention(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Retention.Fields fields() {
        return _fields;
    }

    public static Retention.ProjectionMask createMask() {
        return new Retention.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for version
     * 
     * @see Retention.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see Retention.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see Retention.Fields#version
     */
    @Nullable
    public VersionBasedRetention getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Retention.Fields#version
     */
    @Nullable
    public VersionBasedRetention getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = ((__rawValue == null)?null:new VersionBasedRetention(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see Retention.Fields#version
     */
    public Retention setVersion(
        @Nullable
        VersionBasedRetention value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Retention.Fields#version
     */
    public Retention setVersion(
        @Nonnull
        VersionBasedRetention value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.retention.Retention to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value.data());
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for time
     * 
     * @see Retention.Fields#time
     */
    public boolean hasTime() {
        if (_timeField!= null) {
            return true;
        }
        return super._map.containsKey("time");
    }

    /**
     * Remover for time
     * 
     * @see Retention.Fields#time
     */
    public void removeTime() {
        super._map.remove("time");
    }

    /**
     * Getter for time
     * 
     * @see Retention.Fields#time
     */
    @Nullable
    public TimeBasedRetention getTime(GetMode mode) {
        return getTime();
    }

    /**
     * Getter for time
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Retention.Fields#time
     */
    @Nullable
    public TimeBasedRetention getTime() {
        if (_timeField!= null) {
            return _timeField;
        } else {
            Object __rawValue = super._map.get("time");
            _timeField = ((__rawValue == null)?null:new TimeBasedRetention(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _timeField;
        }
    }

    /**
     * Setter for time
     * 
     * @see Retention.Fields#time
     */
    public Retention setTime(
        @Nullable
        TimeBasedRetention value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTime(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTime();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", value.data());
                    _timeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "time", value.data());
                    _timeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Retention.Fields#time
     */
    public Retention setTime(
        @Nonnull
        TimeBasedRetention value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field time of com.linkedin.retention.Retention to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "time", value.data());
            _timeField = value;
        }
        return this;
    }

    @Override
    public Retention clone()
        throws CloneNotSupportedException
    {
        Retention __clone = ((Retention) super.clone());
        __clone.__changeListener = new Retention.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Retention copy()
        throws CloneNotSupportedException
    {
        Retention __copy = ((Retention) super.copy());
        __copy._timeField = null;
        __copy._versionField = null;
        __copy.__changeListener = new Retention.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Retention __objectRef;

        private ChangeListener(Retention reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "time":
                    __objectRef._timeField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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

        public com.linkedin.retention.VersionBasedRetention.Fields version() {
            return new com.linkedin.retention.VersionBasedRetention.Fields(getPathComponents(), "version");
        }

        public com.linkedin.retention.TimeBasedRetention.Fields time() {
            return new com.linkedin.retention.TimeBasedRetention.Fields(getPathComponents(), "time");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.retention.VersionBasedRetention.ProjectionMask _versionMask;
        private com.linkedin.retention.TimeBasedRetention.ProjectionMask _timeMask;

        ProjectionMask() {
            super(3);
        }

        public Retention.ProjectionMask withVersion(Function<com.linkedin.retention.VersionBasedRetention.ProjectionMask, com.linkedin.retention.VersionBasedRetention.ProjectionMask> nestedMask) {
            _versionMask = nestedMask.apply(((_versionMask == null)?VersionBasedRetention.createMask():_versionMask));
            getDataMap().put("version", _versionMask.getDataMap());
            return this;
        }

        public Retention.ProjectionMask withVersion() {
            _versionMask = null;
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        public Retention.ProjectionMask withTime(Function<com.linkedin.retention.TimeBasedRetention.ProjectionMask, com.linkedin.retention.TimeBasedRetention.ProjectionMask> nestedMask) {
            _timeMask = nestedMask.apply(((_timeMask == null)?TimeBasedRetention.createMask():_timeMask));
            getDataMap().put("time", _timeMask.getDataMap());
            return this;
        }

        public Retention.ProjectionMask withTime() {
            _timeMask = null;
            getDataMap().put("time", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
