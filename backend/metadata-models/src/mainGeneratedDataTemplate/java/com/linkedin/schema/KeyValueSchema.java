
package com.linkedin.schema;

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
 * Schema text of a key-value store schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/KeyValueSchema.pdl.")
public class KeyValueSchema
    extends RecordTemplate
{

    private final static KeyValueSchema.Fields _fields = new KeyValueSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}", SchemaFormatType.PDL));
    private String _keySchemaField = null;
    private String _valueSchemaField = null;
    private KeyValueSchema.ChangeListener __changeListener = new KeyValueSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_KeySchema = SCHEMA.getField("keySchema");
    private final static RecordDataSchema.Field FIELD_ValueSchema = SCHEMA.getField("valueSchema");

    public KeyValueSchema() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public KeyValueSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static KeyValueSchema.Fields fields() {
        return _fields;
    }

    public static KeyValueSchema.ProjectionMask createMask() {
        return new KeyValueSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public boolean hasKeySchema() {
        if (_keySchemaField!= null) {
            return true;
        }
        return super._map.containsKey("keySchema");
    }

    /**
     * Remover for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public void removeKeySchema() {
        super._map.remove("keySchema");
    }

    /**
     * Getter for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    @Nullable
    public String getKeySchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getKeySchema();
            case DEFAULT:
            case NULL:
                if (_keySchemaField!= null) {
                    return _keySchemaField;
                } else {
                    Object __rawValue = super._map.get("keySchema");
                    _keySchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _keySchemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for keySchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KeyValueSchema.Fields#keySchema
     */
    @Nonnull
    public String getKeySchema() {
        if (_keySchemaField!= null) {
            return _keySchemaField;
        } else {
            Object __rawValue = super._map.get("keySchema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("keySchema");
            }
            _keySchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _keySchemaField;
        }
    }

    /**
     * Setter for keySchema
     * 
     * @see KeyValueSchema.Fields#keySchema
     */
    public KeyValueSchema setKeySchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKeySchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field keySchema of com.linkedin.schema.KeyValueSchema");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
                    _keySchemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKeySchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
                    _keySchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
                    _keySchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for keySchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KeyValueSchema.Fields#keySchema
     */
    public KeyValueSchema setKeySchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field keySchema of com.linkedin.schema.KeyValueSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
            _keySchemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public boolean hasValueSchema() {
        if (_valueSchemaField!= null) {
            return true;
        }
        return super._map.containsKey("valueSchema");
    }

    /**
     * Remover for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public void removeValueSchema() {
        super._map.remove("valueSchema");
    }

    /**
     * Getter for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    @Nullable
    public String getValueSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValueSchema();
            case DEFAULT:
            case NULL:
                if (_valueSchemaField!= null) {
                    return _valueSchemaField;
                } else {
                    Object __rawValue = super._map.get("valueSchema");
                    _valueSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _valueSchemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for valueSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see KeyValueSchema.Fields#valueSchema
     */
    @Nonnull
    public String getValueSchema() {
        if (_valueSchemaField!= null) {
            return _valueSchemaField;
        } else {
            Object __rawValue = super._map.get("valueSchema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("valueSchema");
            }
            _valueSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueSchemaField;
        }
    }

    /**
     * Setter for valueSchema
     * 
     * @see KeyValueSchema.Fields#valueSchema
     */
    public KeyValueSchema setValueSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValueSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field valueSchema of com.linkedin.schema.KeyValueSchema");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "valueSchema", value);
                    _valueSchemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValueSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "valueSchema", value);
                    _valueSchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "valueSchema", value);
                    _valueSchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for valueSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KeyValueSchema.Fields#valueSchema
     */
    public KeyValueSchema setValueSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field valueSchema of com.linkedin.schema.KeyValueSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "valueSchema", value);
            _valueSchemaField = value;
        }
        return this;
    }

    @Override
    public KeyValueSchema clone()
        throws CloneNotSupportedException
    {
        KeyValueSchema __clone = ((KeyValueSchema) super.clone());
        __clone.__changeListener = new KeyValueSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public KeyValueSchema copy()
        throws CloneNotSupportedException
    {
        KeyValueSchema __copy = ((KeyValueSchema) super.copy());
        __copy._valueSchemaField = null;
        __copy._keySchemaField = null;
        __copy.__changeListener = new KeyValueSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final KeyValueSchema __objectRef;

        private ChangeListener(KeyValueSchema reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "valueSchema":
                    __objectRef._valueSchemaField = null;
                    break;
                case "keySchema":
                    __objectRef._keySchemaField = null;
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
         * The raw schema for the key in the key-value store.
         * 
         */
        public PathSpec keySchema() {
            return new PathSpec(getPathComponents(), "keySchema");
        }

        /**
         * The raw schema for the value in the key-value store.
         * 
         */
        public PathSpec valueSchema() {
            return new PathSpec(getPathComponents(), "valueSchema");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The raw schema for the key in the key-value store.
         * 
         */
        public KeyValueSchema.ProjectionMask withKeySchema() {
            getDataMap().put("keySchema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The raw schema for the value in the key-value store.
         * 
         */
        public KeyValueSchema.ProjectionMask withValueSchema() {
            getDataMap().put("valueSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
