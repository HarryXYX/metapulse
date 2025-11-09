
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * A standard event timestamp
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/TimeStamp.pdl.")
public class TimeStamp
    extends RecordTemplate
{

    private final static TimeStamp.Fields _fields = new TimeStamp.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}", SchemaFormatType.PDL));
    private Long _timeField = null;
    private com.linkedin.common.urn.Urn _actorField = null;
    private TimeStamp.ChangeListener __changeListener = new TimeStamp.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Time = SCHEMA.getField("time");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public TimeStamp() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TimeStamp(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TimeStamp.Fields fields() {
        return _fields;
    }

    public static TimeStamp.ProjectionMask createMask() {
        return new TimeStamp.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for time
     * 
     * @see TimeStamp.Fields#time
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
     * @see TimeStamp.Fields#time
     */
    public void removeTime() {
        super._map.remove("time");
    }

    /**
     * Getter for time
     * 
     * @see TimeStamp.Fields#time
     */
    @Nullable
    public Long getTime(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTime();
            case DEFAULT:
            case NULL:
                if (_timeField!= null) {
                    return _timeField;
                } else {
                    Object __rawValue = super._map.get("time");
                    _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for time
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeStamp.Fields#time
     */
    @Nonnull
    public Long getTime() {
        if (_timeField!= null) {
            return _timeField;
        } else {
            Object __rawValue = super._map.get("time");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("time");
            }
            _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timeField;
        }
    }

    /**
     * Setter for time
     * 
     * @see TimeStamp.Fields#time
     */
    public TimeStamp setTime(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTime(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field time of com.linkedin.common.TimeStamp");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTime();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
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
     * @see TimeStamp.Fields#time
     */
    public TimeStamp setTime(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field time of com.linkedin.common.TimeStamp to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
            _timeField = value;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @see TimeStamp.Fields#time
     */
    public TimeStamp setTime(long value) {
        CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
        _timeField = value;
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see TimeStamp.Fields#actor
     */
    public boolean hasActor() {
        if (_actorField!= null) {
            return true;
        }
        return super._map.containsKey("actor");
    }

    /**
     * Remover for actor
     * 
     * @see TimeStamp.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see TimeStamp.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        return getActor();
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TimeStamp.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor() {
        if (_actorField!= null) {
            return _actorField;
        } else {
            Object __rawValue = super._map.get("actor");
            _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorField;
        }
    }

    /**
     * Setter for actor
     * 
     * @see TimeStamp.Fields#actor
     */
    public TimeStamp setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActor();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeStamp.Fields#actor
     */
    public TimeStamp setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.common.TimeStamp to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    @Override
    public TimeStamp clone()
        throws CloneNotSupportedException
    {
        TimeStamp __clone = ((TimeStamp) super.clone());
        __clone.__changeListener = new TimeStamp.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TimeStamp copy()
        throws CloneNotSupportedException
    {
        TimeStamp __copy = ((TimeStamp) super.copy());
        __copy._actorField = null;
        __copy._timeField = null;
        __copy.__changeListener = new TimeStamp.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TimeStamp __objectRef;

        private ChangeListener(TimeStamp reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "actor":
                    __objectRef._actorField = null;
                    break;
                case "time":
                    __objectRef._timeField = null;
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
         * When did the event occur
         * 
         */
        public PathSpec time() {
            return new PathSpec(getPathComponents(), "time");
        }

        /**
         * Optional: The actor urn involved in the event.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * When did the event occur
         * 
         */
        public TimeStamp.ProjectionMask withTime() {
            getDataMap().put("time", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional: The actor urn involved in the event.
         * 
         */
        public TimeStamp.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
