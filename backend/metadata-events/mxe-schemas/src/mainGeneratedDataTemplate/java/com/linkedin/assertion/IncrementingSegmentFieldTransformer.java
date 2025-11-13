
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
 * The definition of the transformer function  that should be applied to a given field / column value in a dataset
 * in order to determine the segment or bucket that it belongs to, which in turn is used to evaluate
 * volume assertions.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/IncrementingSegmentFieldTransformer.pdl.")
public class IncrementingSegmentFieldTransformer
    extends RecordTemplate
{

    private final static IncrementingSegmentFieldTransformer.Fields _fields = new IncrementingSegmentFieldTransformer.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**The definition of the transformer function  that should be applied to a given field / column value in a dataset\nin order to determine the segment or bucket that it belongs to, which in turn is used to evaluate\nvolume assertions.*/record IncrementingSegmentFieldTransformer{/**A 'standard' transformer type. Note that not all source systems will support all operators.*/type:enum IncrementingSegmentFieldTransformerType{/**Rounds a timestamp (in seconds) down to the start of the month.*/TIMESTAMP_MS_TO_MINUTE/**Rounds a timestamp (in milliseconds) down to the nearest hour.*/TIMESTAMP_MS_TO_HOUR/**Rounds a timestamp (in milliseconds) down to the start of the day.*/TIMESTAMP_MS_TO_DATE/**Rounds a timestamp (in milliseconds) down to the start of the month*/TIMESTAMP_MS_TO_MONTH/**Rounds a timestamp (in milliseconds) down to the start of the year*/TIMESTAMP_MS_TO_YEAR/**Rounds a numeric value down to the nearest integer.*/FLOOR/**Rounds a numeric value up to the nearest integer.*/CEILING/**A backdoor to provide a native operator type specific to a given source system like\nSnowflake, Redshift, BQ, etc.*/NATIVE}/**The 'native' transformer type, useful as a back door if a custom operator is required.\nThis field is required if the type is NATIVE.*/nativeType:optional string}", SchemaFormatType.PDL));
    private IncrementingSegmentFieldTransformerType _typeField = null;
    private String _nativeTypeField = null;
    private IncrementingSegmentFieldTransformer.ChangeListener __changeListener = new IncrementingSegmentFieldTransformer.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_NativeType = SCHEMA.getField("nativeType");

    public IncrementingSegmentFieldTransformer() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IncrementingSegmentFieldTransformer(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncrementingSegmentFieldTransformer.Fields fields() {
        return _fields;
    }

    public static IncrementingSegmentFieldTransformer.ProjectionMask createMask() {
        return new IncrementingSegmentFieldTransformer.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see IncrementingSegmentFieldTransformer.Fields#type
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
     * @see IncrementingSegmentFieldTransformer.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see IncrementingSegmentFieldTransformer.Fields#type
     */
    @Nullable
    public IncrementingSegmentFieldTransformerType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncrementingSegmentFieldTransformerType.class, IncrementingSegmentFieldTransformerType.$UNKNOWN);
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
     * @see IncrementingSegmentFieldTransformer.Fields#type
     */
    @Nonnull
    public IncrementingSegmentFieldTransformerType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncrementingSegmentFieldTransformerType.class, IncrementingSegmentFieldTransformerType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see IncrementingSegmentFieldTransformer.Fields#type
     */
    public IncrementingSegmentFieldTransformer setType(
        @Nullable
        IncrementingSegmentFieldTransformerType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.IncrementingSegmentFieldTransformer");
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
     * @see IncrementingSegmentFieldTransformer.Fields#type
     */
    public IncrementingSegmentFieldTransformer setType(
        @Nonnull
        IncrementingSegmentFieldTransformerType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.IncrementingSegmentFieldTransformer to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeType
     * 
     * @see IncrementingSegmentFieldTransformer.Fields#nativeType
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
     * @see IncrementingSegmentFieldTransformer.Fields#nativeType
     */
    public void removeNativeType() {
        super._map.remove("nativeType");
    }

    /**
     * Getter for nativeType
     * 
     * @see IncrementingSegmentFieldTransformer.Fields#nativeType
     */
    @Nullable
    public String getNativeType(GetMode mode) {
        return getNativeType();
    }

    /**
     * Getter for nativeType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncrementingSegmentFieldTransformer.Fields#nativeType
     */
    @Nullable
    public String getNativeType() {
        if (_nativeTypeField!= null) {
            return _nativeTypeField;
        } else {
            Object __rawValue = super._map.get("nativeType");
            _nativeTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nativeTypeField;
        }
    }

    /**
     * Setter for nativeType
     * 
     * @see IncrementingSegmentFieldTransformer.Fields#nativeType
     */
    public IncrementingSegmentFieldTransformer setNativeType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see IncrementingSegmentFieldTransformer.Fields#nativeType
     */
    public IncrementingSegmentFieldTransformer setNativeType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeType of com.linkedin.assertion.IncrementingSegmentFieldTransformer to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
            _nativeTypeField = value;
        }
        return this;
    }

    @Override
    public IncrementingSegmentFieldTransformer clone()
        throws CloneNotSupportedException
    {
        IncrementingSegmentFieldTransformer __clone = ((IncrementingSegmentFieldTransformer) super.clone());
        __clone.__changeListener = new IncrementingSegmentFieldTransformer.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncrementingSegmentFieldTransformer copy()
        throws CloneNotSupportedException
    {
        IncrementingSegmentFieldTransformer __copy = ((IncrementingSegmentFieldTransformer) super.copy());
        __copy._nativeTypeField = null;
        __copy._typeField = null;
        __copy.__changeListener = new IncrementingSegmentFieldTransformer.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncrementingSegmentFieldTransformer __objectRef;

        private ChangeListener(IncrementingSegmentFieldTransformer reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * A 'standard' transformer type. Note that not all source systems will support all operators.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The 'native' transformer type, useful as a back door if a custom operator is required.
         * This field is required if the type is NATIVE.
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
            super(3);
        }

        /**
         * A 'standard' transformer type. Note that not all source systems will support all operators.
         * 
         */
        public IncrementingSegmentFieldTransformer.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The 'native' transformer type, useful as a back door if a custom operator is required.
         * This field is required if the type is NATIVE.
         * 
         */
        public IncrementingSegmentFieldTransformer.ProjectionMask withNativeType() {
            getDataMap().put("nativeType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
