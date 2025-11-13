
package com.linkedin.mxe;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.ByteString;
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
 * Generic record structure for serializing an Aspect
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/GenericAspect.pdl.")
public class GenericAspect
    extends RecordTemplate
{

    private final static GenericAspect.Fields _fields = new GenericAspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Generic record structure for serializing an Aspect\n*/record GenericAspect{/**The value of the aspect, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the aspect was serialized.\nThe only type currently supported is application/json.*/contentType:string}", SchemaFormatType.PDL));
    private ByteString _valueField = null;
    private String _contentTypeField = null;
    private GenericAspect.ChangeListener __changeListener = new GenericAspect.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_ContentType = SCHEMA.getField("contentType");

    public GenericAspect() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public GenericAspect(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GenericAspect.Fields fields() {
        return _fields;
    }

    public static GenericAspect.ProjectionMask createMask() {
        return new GenericAspect.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see GenericAspect.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see GenericAspect.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see GenericAspect.Fields#value
     */
    @Nullable
    public ByteString getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceBytesOutput(__rawValue);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericAspect.Fields#value
     */
    @Nonnull
    public ByteString getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceBytesOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see GenericAspect.Fields#value
     */
    public GenericAspect setValue(
        @Nullable
        ByteString value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.mxe.GenericAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericAspect.Fields#value
     */
    public GenericAspect setValue(
        @Nonnull
        ByteString value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.mxe.GenericAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public boolean hasContentType() {
        if (_contentTypeField!= null) {
            return true;
        }
        return super._map.containsKey("contentType");
    }

    /**
     * Remover for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public void removeContentType() {
        super._map.remove("contentType");
    }

    /**
     * Getter for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    @Nullable
    public String getContentType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getContentType();
            case DEFAULT:
            case NULL:
                if (_contentTypeField!= null) {
                    return _contentTypeField;
                } else {
                    Object __rawValue = super._map.get("contentType");
                    _contentTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _contentTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for contentType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GenericAspect.Fields#contentType
     */
    @Nonnull
    public String getContentType() {
        if (_contentTypeField!= null) {
            return _contentTypeField;
        } else {
            Object __rawValue = super._map.get("contentType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("contentType");
            }
            _contentTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contentTypeField;
        }
    }

    /**
     * Setter for contentType
     * 
     * @see GenericAspect.Fields#contentType
     */
    public GenericAspect setContentType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContentType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field contentType of com.linkedin.mxe.GenericAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value);
                    _contentTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContentType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value);
                    _contentTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value);
                    _contentTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for contentType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GenericAspect.Fields#contentType
     */
    public GenericAspect setContentType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field contentType of com.linkedin.mxe.GenericAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "contentType", value);
            _contentTypeField = value;
        }
        return this;
    }

    @Override
    public GenericAspect clone()
        throws CloneNotSupportedException
    {
        GenericAspect __clone = ((GenericAspect) super.clone());
        __clone.__changeListener = new GenericAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GenericAspect copy()
        throws CloneNotSupportedException
    {
        GenericAspect __copy = ((GenericAspect) super.copy());
        __copy._valueField = null;
        __copy._contentTypeField = null;
        __copy.__changeListener = new GenericAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GenericAspect __objectRef;

        private ChangeListener(GenericAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "value":
                    __objectRef._valueField = null;
                    break;
                case "contentType":
                    __objectRef._contentTypeField = null;
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
         * The value of the aspect, serialized as bytes.
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * The content type, which represents the fashion in which the aspect was serialized.
         * The only type currently supported is application/json.
         * 
         */
        public PathSpec contentType() {
            return new PathSpec(getPathComponents(), "contentType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The value of the aspect, serialized as bytes.
         * 
         */
        public GenericAspect.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The content type, which represents the fashion in which the aspect was serialized.
         * The only type currently supported is application/json.
         * 
         */
        public GenericAspect.ProjectionMask withContentType() {
            getDataMap().put("contentType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
