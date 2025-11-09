
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
 * Lightweight spec used for referencing a particular schema field that is used to compute
 * a freshness signal or operation.
 * TODO: Since this is now leveraged across assertions & metrics / operations, we should consider moving this to a common package.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FreshnessFieldSpec.pdl.")
public class FreshnessFieldSpec
    extends RecordTemplate
{

    private final static FreshnessFieldSpec.Fields _fields = new FreshnessFieldSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Lightweight spec used for referencing a particular schema field that is used to compute\na freshness signal or operation.\nTODO: Since this is now leveraged across assertions & metrics / operations, we should consider moving this to a common package.*/record FreshnessFieldSpec includes{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}{/**The type of the field being used to verify the Freshness of the asset.*/kind:optional enum FreshnessFieldKind{/**Determine that a change has occurred by inspecting an last modified field which\nrepresents the last time at which a row was changed.*/LAST_MODIFIED/**Determine that a change has occurred by inspecting a field which should be tracked as the\n\"high watermark\" for the table. This should be an ascending number or date field.\n\nIf rows with this column have not been added since the previous check\nthen the Freshness Assertion will fail.*/HIGH_WATERMARK}}", SchemaFormatType.PDL));
    private String _pathField = null;
    private String _typeField = null;
    private String _nativeTypeField = null;
    private FreshnessFieldKind _kindField = null;
    private FreshnessFieldSpec.ChangeListener __changeListener = new FreshnessFieldSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_NativeType = SCHEMA.getField("nativeType");
    private final static RecordDataSchema.Field FIELD_Kind = SCHEMA.getField("kind");

    public FreshnessFieldSpec() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FreshnessFieldSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FreshnessFieldSpec.Fields fields() {
        return _fields;
    }

    public static FreshnessFieldSpec.ProjectionMask createMask() {
        return new FreshnessFieldSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for path
     * 
     * @see FreshnessFieldSpec.Fields#path
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
     * @see FreshnessFieldSpec.Fields#path
     */
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see FreshnessFieldSpec.Fields#path
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
     * @see FreshnessFieldSpec.Fields#path
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
     * @see FreshnessFieldSpec.Fields#path
     */
    public FreshnessFieldSpec setPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.assertion.FreshnessFieldSpec");
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
     * @see FreshnessFieldSpec.Fields#path
     */
    public FreshnessFieldSpec setPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.assertion.FreshnessFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value);
            _pathField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see FreshnessFieldSpec.Fields#type
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
     * @see FreshnessFieldSpec.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FreshnessFieldSpec.Fields#type
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
     * @see FreshnessFieldSpec.Fields#type
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
     * @see FreshnessFieldSpec.Fields#type
     */
    public FreshnessFieldSpec setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.FreshnessFieldSpec");
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
     * @see FreshnessFieldSpec.Fields#type
     */
    public FreshnessFieldSpec setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.FreshnessFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeType
     * 
     * @see FreshnessFieldSpec.Fields#nativeType
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
     * @see FreshnessFieldSpec.Fields#nativeType
     */
    public void removeNativeType() {
        super._map.remove("nativeType");
    }

    /**
     * Getter for nativeType
     * 
     * @see FreshnessFieldSpec.Fields#nativeType
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
     * @see FreshnessFieldSpec.Fields#nativeType
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
     * @see FreshnessFieldSpec.Fields#nativeType
     */
    public FreshnessFieldSpec setNativeType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field nativeType of com.linkedin.assertion.FreshnessFieldSpec");
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
     * @see FreshnessFieldSpec.Fields#nativeType
     */
    public FreshnessFieldSpec setNativeType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeType of com.linkedin.assertion.FreshnessFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
            _nativeTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for kind
     * 
     * @see FreshnessFieldSpec.Fields#kind
     */
    public boolean hasKind() {
        if (_kindField!= null) {
            return true;
        }
        return super._map.containsKey("kind");
    }

    /**
     * Remover for kind
     * 
     * @see FreshnessFieldSpec.Fields#kind
     */
    public void removeKind() {
        super._map.remove("kind");
    }

    /**
     * Getter for kind
     * 
     * @see FreshnessFieldSpec.Fields#kind
     */
    @Nullable
    public FreshnessFieldKind getKind(GetMode mode) {
        return getKind();
    }

    /**
     * Getter for kind
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FreshnessFieldSpec.Fields#kind
     */
    @Nullable
    public FreshnessFieldKind getKind() {
        if (_kindField!= null) {
            return _kindField;
        } else {
            Object __rawValue = super._map.get("kind");
            _kindField = DataTemplateUtil.coerceEnumOutput(__rawValue, FreshnessFieldKind.class, FreshnessFieldKind.$UNKNOWN);
            return _kindField;
        }
    }

    /**
     * Setter for kind
     * 
     * @see FreshnessFieldSpec.Fields#kind
     */
    public FreshnessFieldSpec setKind(
        @Nullable
        FreshnessFieldKind value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKind(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKind();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "kind", value.name());
                    _kindField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "kind", value.name());
                    _kindField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for kind
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FreshnessFieldSpec.Fields#kind
     */
    public FreshnessFieldSpec setKind(
        @Nonnull
        FreshnessFieldKind value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field kind of com.linkedin.assertion.FreshnessFieldSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "kind", value.name());
            _kindField = value;
        }
        return this;
    }

    @Override
    public FreshnessFieldSpec clone()
        throws CloneNotSupportedException
    {
        FreshnessFieldSpec __clone = ((FreshnessFieldSpec) super.clone());
        __clone.__changeListener = new FreshnessFieldSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FreshnessFieldSpec copy()
        throws CloneNotSupportedException
    {
        FreshnessFieldSpec __copy = ((FreshnessFieldSpec) super.copy());
        __copy._pathField = null;
        __copy._kindField = null;
        __copy._nativeTypeField = null;
        __copy._typeField = null;
        __copy.__changeListener = new FreshnessFieldSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FreshnessFieldSpec __objectRef;

        private ChangeListener(FreshnessFieldSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "path":
                    __objectRef._pathField = null;
                    break;
                case "kind":
                    __objectRef._kindField = null;
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

        /**
         * The type of the field being used to verify the Freshness of the asset.
         * 
         */
        public PathSpec kind() {
            return new PathSpec(getPathComponents(), "kind");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * The field path
         * 
         */
        public FreshnessFieldSpec.ProjectionMask withPath() {
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The DataHub standard schema field type.
         * 
         */
        public FreshnessFieldSpec.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native field type
         * 
         */
        public FreshnessFieldSpec.ProjectionMask withNativeType() {
            getDataMap().put("nativeType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the field being used to verify the Freshness of the asset.
         * 
         */
        public FreshnessFieldSpec.ProjectionMask withKind() {
            getDataMap().put("kind", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
