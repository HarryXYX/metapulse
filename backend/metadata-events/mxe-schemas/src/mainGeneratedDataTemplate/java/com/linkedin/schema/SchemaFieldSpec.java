
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
 * Lightweight spec used for referencing a particular schema field.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaFieldSpec.pdl.")
public class SchemaFieldSpec
    extends RecordTemplate
{

    private final static SchemaFieldSpec.Fields _fields = new SchemaFieldSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}", SchemaFormatType.PDL));
    private String _pathField = null;
    private String _typeField = null;
    private String _nativeTypeField = null;
    private SchemaFieldSpec.ChangeListener __changeListener = new SchemaFieldSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_NativeType = SCHEMA.getField("nativeType");

    public SchemaFieldSpec() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SchemaFieldSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaFieldSpec.Fields fields() {
        return _fields;
    }

    public static SchemaFieldSpec.ProjectionMask createMask() {
        return new SchemaFieldSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for path
     * 
     * @see SchemaFieldSpec.Fields#path
     */
    public boolean hasPath() {
        if (_pathField!= null) {
            return true;
        }
        return super._map.containsKey("path");
    }

    /**
     * Remover for path
     * 
     * @see SchemaFieldSpec.Fields#path
     */
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see SchemaFieldSpec.Fields#path
     */
    @Nullable
    public String getPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPath();
            case DEFAULT:
            case NULL:
                if (_pathField!= null) {
                    return _pathField;
                } else {
                    Object __rawValue = super._map.get("path");
                    _pathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _pathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for path
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldSpec.Fields#path
     */
    @Nonnull
    public String getPath() {
        if (_pathField!= null) {
            return _pathField;
        } else {
            Object __rawValue = super._map.get("path");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("path");
            }
            _pathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _pathField;
        }
    }

    /**
     * Setter for path
     * 
     * @see SchemaFieldSpec.Fields#path
     */
    public SchemaFieldSpec setPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.schema.SchemaFieldSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value);
                    _pathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value);
                    _pathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "path", value);
                    _pathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for path
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldSpec.Fields#path
     */
    public SchemaFieldSpec setPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.schema.SchemaFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value);
            _pathField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see SchemaFieldSpec.Fields#type
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
     * @see SchemaFieldSpec.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see SchemaFieldSpec.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see SchemaFieldSpec.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see SchemaFieldSpec.Fields#type
     */
    public SchemaFieldSpec setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.schema.SchemaFieldSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
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
     * @see SchemaFieldSpec.Fields#type
     */
    public SchemaFieldSpec setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.schema.SchemaFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeType
     * 
     * @see SchemaFieldSpec.Fields#nativeType
     */
    public boolean hasNativeType() {
        if (_nativeTypeField!= null) {
            return true;
        }
        return super._map.containsKey("nativeType");
    }

    /**
     * Remover for nativeType
     * 
     * @see SchemaFieldSpec.Fields#nativeType
     */
    public void removeNativeType() {
        super._map.remove("nativeType");
    }

    /**
     * Getter for nativeType
     * 
     * @see SchemaFieldSpec.Fields#nativeType
     */
    @Nullable
    public String getNativeType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNativeType();
            case DEFAULT:
            case NULL:
                if (_nativeTypeField!= null) {
                    return _nativeTypeField;
                } else {
                    Object __rawValue = super._map.get("nativeType");
                    _nativeTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nativeTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for nativeType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaFieldSpec.Fields#nativeType
     */
    @Nonnull
    public String getNativeType() {
        if (_nativeTypeField!= null) {
            return _nativeTypeField;
        } else {
            Object __rawValue = super._map.get("nativeType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("nativeType");
            }
            _nativeTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nativeTypeField;
        }
    }

    /**
     * Setter for nativeType
     * 
     * @see SchemaFieldSpec.Fields#nativeType
     */
    public SchemaFieldSpec setNativeType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field nativeType of com.linkedin.schema.SchemaFieldSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
                    _nativeTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
                    _nativeTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
                    _nativeTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaFieldSpec.Fields#nativeType
     */
    public SchemaFieldSpec setNativeType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeType of com.linkedin.schema.SchemaFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
            _nativeTypeField = value;
        }
        return this;
    }

    @Override
    public SchemaFieldSpec clone()
        throws CloneNotSupportedException
    {
        SchemaFieldSpec __clone = ((SchemaFieldSpec) super.clone());
        __clone.__changeListener = new SchemaFieldSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaFieldSpec copy()
        throws CloneNotSupportedException
    {
        SchemaFieldSpec __copy = ((SchemaFieldSpec) super.copy());
        __copy._pathField = null;
        __copy._nativeTypeField = null;
        __copy._typeField = null;
        __copy.__changeListener = new SchemaFieldSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaFieldSpec __objectRef;

        private ChangeListener(SchemaFieldSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "path":
                    __objectRef._pathField = null;
                    break;
                case "nativeType":
                    __objectRef._nativeTypeField = null;
                    break;
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
         * The field path
         * 
         */
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * The DataHub standard schema field type.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The native field type
         * 
         */
        public PathSpec nativeType() {
            return new PathSpec(getPathComponents(), "nativeType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * The field path
         * 
         */
        public SchemaFieldSpec.ProjectionMask withPath() {
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The DataHub standard schema field type.
         * 
         */
        public SchemaFieldSpec.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native field type
         * 
         */
        public SchemaFieldSpec.ProjectionMask withNativeType() {
            getDataMap().put("nativeType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
