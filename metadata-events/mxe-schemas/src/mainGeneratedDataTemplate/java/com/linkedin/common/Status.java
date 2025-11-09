
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
import com.linkedin.data.template.SetMode;


/**
 * The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.
 * This aspect is used to represent soft deletes conventionally.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Status.pdl.")
public class Status
    extends RecordTemplate
{

    private final static Status.Fields _fields = new Status.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}", SchemaFormatType.PDL));
    private Boolean _removedField = null;
    private Status.ChangeListener __changeListener = new Status.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static Boolean DEFAULT_Removed;

    static {
        DEFAULT_Removed = DataTemplateUtil.coerceBooleanOutput(FIELD_Removed.getDefault());
    }

    public Status() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Status(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Status.Fields fields() {
        return _fields;
    }

    public static Status.ProjectionMask createMask() {
        return new Status.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for removed
     * 
     * @see Status.Fields#removed
     */
    public boolean hasRemoved() {
        if (_removedField!= null) {
            return true;
        }
        return super._map.containsKey("removed");
    }

    /**
     * Remover for removed
     * 
     * @see Status.Fields#removed
     */
    public void removeRemoved() {
        super._map.remove("removed");
    }

    /**
     * Getter for removed
     * 
     * @see Status.Fields#removed
     */
    @Nullable
    public Boolean isRemoved(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isRemoved();
            case NULL:
                if (_removedField!= null) {
                    return _removedField;
                } else {
                    Object __rawValue = super._map.get("removed");
                    _removedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _removedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Status.Fields#removed
     */
    @Nonnull
    public Boolean isRemoved() {
        if (_removedField!= null) {
            return _removedField;
        } else {
            Object __rawValue = super._map.get("removed");
            if (__rawValue == null) {
                return DEFAULT_Removed;
            }
            _removedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _removedField;
        }
    }

    /**
     * Setter for removed
     * 
     * @see Status.Fields#removed
     */
    public Status setRemoved(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRemoved(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field removed of com.linkedin.common.Status");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "removed", value);
                    _removedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRemoved();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "removed", value);
                    _removedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "removed", value);
                    _removedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Status.Fields#removed
     */
    public Status setRemoved(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field removed of com.linkedin.common.Status to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "removed", value);
            _removedField = value;
        }
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see Status.Fields#removed
     */
    public Status setRemoved(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "removed", value);
        _removedField = value;
        return this;
    }

    @Override
    public Status clone()
        throws CloneNotSupportedException
    {
        Status __clone = ((Status) super.clone());
        __clone.__changeListener = new Status.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Status copy()
        throws CloneNotSupportedException
    {
        Status __copy = ((Status) super.copy());
        __copy._removedField = null;
        __copy.__changeListener = new Status.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Status __objectRef;

        private ChangeListener(Status reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "removed":
                    __objectRef._removedField = null;
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
         * Whether the entity has been removed (soft-deleted).
         * 
         */
        public PathSpec removed() {
            return new PathSpec(getPathComponents(), "removed");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Whether the entity has been removed (soft-deleted).
         * 
         */
        public Status.ProjectionMask withRemoved() {
            getDataMap().put("removed", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
