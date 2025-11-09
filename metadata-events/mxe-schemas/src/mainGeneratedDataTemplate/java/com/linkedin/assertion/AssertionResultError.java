
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
import com.linkedin.data.template.StringMap;


/**
 *  An error encountered when evaluating an AssertionResult
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AssertionResultError.pdl.")
public class AssertionResultError
    extends RecordTemplate
{

    private final static AssertionResultError.Fields _fields = new AssertionResultError.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/** An error encountered when evaluating an AssertionResult*/record AssertionResultError{/** The type of error encountered*/type:enum AssertionResultErrorType{/** Source is unreachable*/SOURCE_CONNECTION_ERROR/** Source query failed to execute*/SOURCE_QUERY_FAILED/** Insufficient data to evaluate the assertion*/INSUFFICIENT_DATA/** Invalid parameters were detected*/INVALID_PARAMETERS/** Event type not supported by the specified source*/INVALID_SOURCE_TYPE/** Unsupported platform*/UNSUPPORTED_PLATFORM/** Error while executing a custom SQL assertion*/CUSTOM_SQL_ERROR/** Error while executing a field assertion*/FIELD_ASSERTION_ERROR/** Unknown error*/UNKNOWN_ERROR}/** Additional metadata depending on the type of error*/properties:optional map[string,string]}", SchemaFormatType.PDL));
    private AssertionResultErrorType _typeField = null;
    private StringMap _propertiesField = null;
    private AssertionResultError.ChangeListener __changeListener = new AssertionResultError.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");

    public AssertionResultError() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AssertionResultError(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionResultError.Fields fields() {
        return _fields;
    }

    public static AssertionResultError.ProjectionMask createMask() {
        return new AssertionResultError.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see AssertionResultError.Fields#type
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
     * @see AssertionResultError.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see AssertionResultError.Fields#type
     */
    @Nullable
    public AssertionResultErrorType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionResultErrorType.class, AssertionResultErrorType.$UNKNOWN);
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
     * @see AssertionResultError.Fields#type
     */
    @Nonnull
    public AssertionResultErrorType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionResultErrorType.class, AssertionResultErrorType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see AssertionResultError.Fields#type
     */
    public AssertionResultError setType(
        @Nullable
        AssertionResultErrorType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.AssertionResultError");
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
     * @see AssertionResultError.Fields#type
     */
    public AssertionResultError setType(
        @Nonnull
        AssertionResultErrorType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.AssertionResultError to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for properties
     * 
     * @see AssertionResultError.Fields#properties
     */
    public boolean hasProperties() {
        if (_propertiesField!= null) {
            return true;
        }
        return super._map.containsKey("properties");
    }

    /**
     * Remover for properties
     * 
     * @see AssertionResultError.Fields#properties
     */
    public void removeProperties() {
        super._map.remove("properties");
    }

    /**
     * Getter for properties
     * 
     * @see AssertionResultError.Fields#properties
     */
    @Nullable
    public StringMap getProperties(GetMode mode) {
        return getProperties();
    }

    /**
     * Getter for properties
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionResultError.Fields#properties
     */
    @Nullable
    public StringMap getProperties() {
        if (_propertiesField!= null) {
            return _propertiesField;
        } else {
            Object __rawValue = super._map.get("properties");
            _propertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _propertiesField;
        }
    }

    /**
     * Setter for properties
     * 
     * @see AssertionResultError.Fields#properties
     */
    public AssertionResultError setProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for properties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionResultError.Fields#properties
     */
    public AssertionResultError setProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field properties of com.linkedin.assertion.AssertionResultError to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
            _propertiesField = value;
        }
        return this;
    }

    @Override
    public AssertionResultError clone()
        throws CloneNotSupportedException
    {
        AssertionResultError __clone = ((AssertionResultError) super.clone());
        __clone.__changeListener = new AssertionResultError.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionResultError copy()
        throws CloneNotSupportedException
    {
        AssertionResultError __copy = ((AssertionResultError) super.copy());
        __copy._typeField = null;
        __copy._propertiesField = null;
        __copy.__changeListener = new AssertionResultError.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionResultError __objectRef;

        private ChangeListener(AssertionResultError reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "properties":
                    __objectRef._propertiesField = null;
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
         *  The type of error encountered
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         *  Additional metadata depending on the type of error
         * 
         */
        public PathSpec properties() {
            return new PathSpec(getPathComponents(), "properties");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         *  The type of error encountered
         * 
         */
        public AssertionResultError.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Additional metadata depending on the type of error
         * 
         */
        public AssertionResultError.ProjectionMask withProperties() {
            getDataMap().put("properties", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
