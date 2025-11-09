
package com.linkedin.assertion;

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
 * Definition of a transform applied to the values of a column / field.
 * Note that the applicability of a field transform ultimately depends on the native type
 * of the field / column.
 * 
 * Model has single field to permit extension.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/FieldTransform.pdl.")
public class FieldTransform
    extends RecordTemplate
{

    private final static FieldTransform.Fields _fields = new FieldTransform.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Definition of a transform applied to the values of a column / field.\nNote that the applicability of a field transform ultimately depends on the native type\nof the field / column.\n\nModel has single field to permit extension.*/record FieldTransform{/**The type of the field transform, e.g. the transformation\nfunction / operator to apply.*/type:enum FieldTransformType{/**Obtain the length of a string field / column (applicable to string types)*/LENGTH}}", SchemaFormatType.PDL));
    private FieldTransformType _typeField = null;
    private FieldTransform.ChangeListener __changeListener = new FieldTransform.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public FieldTransform() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FieldTransform(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FieldTransform.Fields fields() {
        return _fields;
    }

    public static FieldTransform.ProjectionMask createMask() {
        return new FieldTransform.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see FieldTransform.Fields#type
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
     * @see FieldTransform.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FieldTransform.Fields#type
     */
    @Nullable
    public FieldTransformType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldTransformType.class, FieldTransformType.$UNKNOWN);
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
     * @see FieldTransform.Fields#type
     */
    @Nonnull
    public FieldTransformType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldTransformType.class, FieldTransformType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FieldTransform.Fields#type
     */
    public FieldTransform setType(
        @Nullable
        FieldTransformType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.FieldTransform");
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
     * @see FieldTransform.Fields#type
     */
    public FieldTransform setType(
        @Nonnull
        FieldTransformType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.FieldTransform to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    @Override
    public FieldTransform clone()
        throws CloneNotSupportedException
    {
        FieldTransform __clone = ((FieldTransform) super.clone());
        __clone.__changeListener = new FieldTransform.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FieldTransform copy()
        throws CloneNotSupportedException
    {
        FieldTransform __copy = ((FieldTransform) super.copy());
        __copy._typeField = null;
        __copy.__changeListener = new FieldTransform.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FieldTransform __objectRef;

        private ChangeListener(FieldTransform reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
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
         * The type of the field transform, e.g. the transformation
         * function / operator to apply.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The type of the field transform, e.g. the transformation
         * function / operator to apply.
         * 
         */
        public FieldTransform.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
