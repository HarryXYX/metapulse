
package com.linkedin.mxe;

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
 * A header included with each DataHub platform event.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/mxe/PlatformEventHeader.pdl.")
public class PlatformEventHeader
    extends RecordTemplate
{

    private final static PlatformEventHeader.Fields _fields = new PlatformEventHeader.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**A header included with each DataHub platform event.*/record PlatformEventHeader{/**The event timestamp field as epoch at UTC in milli seconds.*/timestampMillis:long}", SchemaFormatType.PDL));
    private Long _timestampMillisField = null;
    private PlatformEventHeader.ChangeListener __changeListener = new PlatformEventHeader.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TimestampMillis = SCHEMA.getField("timestampMillis");

    public PlatformEventHeader() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public PlatformEventHeader(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PlatformEventHeader.Fields fields() {
        return _fields;
    }

    public static PlatformEventHeader.ProjectionMask createMask() {
        return new PlatformEventHeader.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for timestampMillis
     * 
     * @see PlatformEventHeader.Fields#timestampMillis
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
     * @see PlatformEventHeader.Fields#timestampMillis
     */
    public void removeTimestampMillis() {
        super._map.remove("timestampMillis");
    }

    /**
     * Getter for timestampMillis
     * 
     * @see PlatformEventHeader.Fields#timestampMillis
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
     * @see PlatformEventHeader.Fields#timestampMillis
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
     * @see PlatformEventHeader.Fields#timestampMillis
     */
    public PlatformEventHeader setTimestampMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestampMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timestampMillis of com.linkedin.mxe.PlatformEventHeader");
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
     * @see PlatformEventHeader.Fields#timestampMillis
     */
    public PlatformEventHeader setTimestampMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestampMillis of com.linkedin.mxe.PlatformEventHeader to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
            _timestampMillisField = value;
        }
        return this;
    }

    /**
     * Setter for timestampMillis
     * 
     * @see PlatformEventHeader.Fields#timestampMillis
     */
    public PlatformEventHeader setTimestampMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestampMillis", DataTemplateUtil.coerceLongInput(value));
        _timestampMillisField = value;
        return this;
    }

    @Override
    public PlatformEventHeader clone()
        throws CloneNotSupportedException
    {
        PlatformEventHeader __clone = ((PlatformEventHeader) super.clone());
        __clone.__changeListener = new PlatformEventHeader.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PlatformEventHeader copy()
        throws CloneNotSupportedException
    {
        PlatformEventHeader __copy = ((PlatformEventHeader) super.copy());
        __copy._timestampMillisField = null;
        __copy.__changeListener = new PlatformEventHeader.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PlatformEventHeader __objectRef;

        private ChangeListener(PlatformEventHeader reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "timestampMillis":
                    __objectRef._timestampMillisField = null;
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

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The event timestamp field as epoch at UTC in milli seconds.
         * 
         */
        public PlatformEventHeader.ProjectionMask withTimestampMillis() {
            getDataMap().put("timestampMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
