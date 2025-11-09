
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
import com.linkedin.data.template.SetMode;


/**
 * Map field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/MapType.pdl.")
public class MapType
    extends RecordTemplate
{

    private final static MapType.Fields _fields = new MapType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}", SchemaFormatType.PDL));
    private String _keyTypeField = null;
    private String _valueTypeField = null;
    private MapType.ChangeListener __changeListener = new MapType.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_KeyType = SCHEMA.getField("keyType");
    private final static RecordDataSchema.Field FIELD_ValueType = SCHEMA.getField("valueType");

    public MapType() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MapType(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MapType.Fields fields() {
        return _fields;
    }

    public static MapType.ProjectionMask createMask() {
        return new MapType.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public boolean hasKeyType() {
        if (_keyTypeField!= null) {
            return true;
        }
        return super._map.containsKey("keyType");
    }

    /**
     * Remover for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public void removeKeyType() {
        super._map.remove("keyType");
    }

    /**
     * Getter for keyType
     * 
     * @see MapType.Fields#keyType
     */
    @Nullable
    public String getKeyType(GetMode mode) {
        return getKeyType();
    }

    /**
     * Getter for keyType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MapType.Fields#keyType
     */
    @Nullable
    public String getKeyType() {
        if (_keyTypeField!= null) {
            return _keyTypeField;
        } else {
            Object __rawValue = super._map.get("keyType");
            _keyTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _keyTypeField;
        }
    }

    /**
     * Setter for keyType
     * 
     * @see MapType.Fields#keyType
     */
    public MapType setKeyType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKeyType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKeyType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keyType", value);
                    _keyTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "keyType", value);
                    _keyTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for keyType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MapType.Fields#keyType
     */
    public MapType setKeyType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field keyType of com.linkedin.schema.MapType to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "keyType", value);
            _keyTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public boolean hasValueType() {
        if (_valueTypeField!= null) {
            return true;
        }
        return super._map.containsKey("valueType");
    }

    /**
     * Remover for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public void removeValueType() {
        super._map.remove("valueType");
    }

    /**
     * Getter for valueType
     * 
     * @see MapType.Fields#valueType
     */
    @Nullable
    public String getValueType(GetMode mode) {
        return getValueType();
    }

    /**
     * Getter for valueType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MapType.Fields#valueType
     */
    @Nullable
    public String getValueType() {
        if (_valueTypeField!= null) {
            return _valueTypeField;
        } else {
            Object __rawValue = super._map.get("valueType");
            _valueTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueTypeField;
        }
    }

    /**
     * Setter for valueType
     * 
     * @see MapType.Fields#valueType
     */
    public MapType setValueType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValueType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValueType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "valueType", value);
                    _valueTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "valueType", value);
                    _valueTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for valueType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MapType.Fields#valueType
     */
    public MapType setValueType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field valueType of com.linkedin.schema.MapType to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "valueType", value);
            _valueTypeField = value;
        }
        return this;
    }

    @Override
    public MapType clone()
        throws CloneNotSupportedException
    {
        MapType __clone = ((MapType) super.clone());
        __clone.__changeListener = new MapType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MapType copy()
        throws CloneNotSupportedException
    {
        MapType __copy = ((MapType) super.copy());
        __copy._valueTypeField = null;
        __copy._keyTypeField = null;
        __copy.__changeListener = new MapType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MapType __objectRef;

        private ChangeListener(MapType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "valueType":
                    __objectRef._valueTypeField = null;
                    break;
                case "keyType":
                    __objectRef._keyTypeField = null;
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
         * Key type in a map
         * 
         */
        public PathSpec keyType() {
            return new PathSpec(getPathComponents(), "keyType");
        }

        /**
         * Type of the value in a map
         * 
         */
        public PathSpec valueType() {
            return new PathSpec(getPathComponents(), "valueType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Key type in a map
         * 
         */
        public MapType.ProjectionMask withKeyType() {
            getDataMap().put("keyType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of the value in a map
         * 
         */
        public MapType.ProjectionMask withValueType() {
            getDataMap().put("valueType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
