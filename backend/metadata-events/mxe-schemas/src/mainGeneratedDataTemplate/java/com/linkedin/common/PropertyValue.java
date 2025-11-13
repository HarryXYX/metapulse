
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.UnionTemplate;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/PropertyValue.pdl.")
public class PropertyValue
    extends RecordTemplate
{

    private final static PropertyValue.Fields _fields = new PropertyValue.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common,record PropertyValue{value:union[string,double]/**Optional description of the property value*/description:optional string}", SchemaFormatType.PDL));
    private PropertyValue.Value _valueField = null;
    private java.lang.String _descriptionField = null;
    private PropertyValue.ChangeListener __changeListener = new PropertyValue.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public PropertyValue() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public PropertyValue(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PropertyValue.Fields fields() {
        return _fields;
    }

    public static PropertyValue.ProjectionMask createMask() {
        return new PropertyValue.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see PropertyValue.Fields#value
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
     * @see PropertyValue.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see PropertyValue.Fields#value
     */
    @Nullable
    public PropertyValue.Value getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = ((__rawValue == null)?null:new PropertyValue.Value(__rawValue));
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
     * @see PropertyValue.Fields#value
     */
    @Nonnull
    public PropertyValue.Value getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = ((__rawValue == null)?null:new PropertyValue.Value(__rawValue));
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see PropertyValue.Fields#value
     */
    public PropertyValue setValue(
        @Nullable
        PropertyValue.Value value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.common.PropertyValue");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
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
     * @see PropertyValue.Fields#value
     */
    public PropertyValue setValue(
        @Nonnull
        PropertyValue.Value value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.common.PropertyValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value.data());
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see PropertyValue.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see PropertyValue.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see PropertyValue.Fields#description
     */
    @Nullable
    public java.lang.String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PropertyValue.Fields#description
     */
    @Nullable
    public java.lang.String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see PropertyValue.Fields#description
     */
    public PropertyValue setDescription(
        @Nullable
        java.lang.String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PropertyValue.Fields#description
     */
    public PropertyValue setDescription(
        @Nonnull
        java.lang.String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.common.PropertyValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public PropertyValue clone()
        throws CloneNotSupportedException
    {
        PropertyValue __clone = ((PropertyValue) super.clone());
        __clone.__changeListener = new PropertyValue.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PropertyValue copy()
        throws CloneNotSupportedException
    {
        PropertyValue __copy = ((PropertyValue) super.copy());
        __copy._descriptionField = null;
        __copy._valueField = null;
        __copy.__changeListener = new PropertyValue.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
    {

        private final PropertyValue __objectRef;

        private ChangeListener(PropertyValue reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(java.lang.String key, Object value) {
            switch (key) {
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<java.lang.String> path, java.lang.String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.linkedin.common.PropertyValue.Value.Fields value() {
            return new com.linkedin.common.PropertyValue.Value.Fields(getPathComponents(), "value");
        }

        /**
         * Optional description of the property value
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.PropertyValue.Value.ProjectionMask _valueMask;

        ProjectionMask() {
            super(3);
        }

        public PropertyValue.ProjectionMask withValue(Function<com.linkedin.common.PropertyValue.Value.ProjectionMask, com.linkedin.common.PropertyValue.Value.ProjectionMask> nestedMask) {
            _valueMask = nestedMask.apply(((_valueMask == null)?PropertyValue.Value.createMask():_valueMask));
            getDataMap().put("value", _valueMask.getDataMap());
            return this;
        }

        public PropertyValue.ProjectionMask withValue() {
            _valueMask = null;
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional description of the property value
         * 
         */
        public PropertyValue.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/PropertyValue.pdl.")
    public static class Value
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[string,double]", SchemaFormatType.PDL));
        private java.lang.String _stringMember = null;
        private java.lang.Double _doubleMember = null;
        private PropertyValue.Value.ChangeListener __changeListener = new PropertyValue.Value.ChangeListener(this);
        private final static DataSchema MEMBER_String = SCHEMA.getTypeByMemberKey("string");
        public final static java.lang.String MEMBERKEY_String = "string";
        private final static DataSchema MEMBER_Double = SCHEMA.getTypeByMemberKey("double");
        public final static java.lang.String MEMBERKEY_Double = "double";

        public Value() {
            super(new DataMap(2, 0.75F), SCHEMA);
            addChangeListener(__changeListener);
        }

        public Value(Object data) {
            super(data, SCHEMA);
            addChangeListener(__changeListener);
        }

        public static UnionDataSchema dataSchema() {
            return SCHEMA;
        }

        public static PropertyValue.Value create(java.lang.String value) {
            PropertyValue.Value newUnion = new PropertyValue.Value();
            newUnion.setString(value);
            return newUnion;
        }

        public boolean isString() {
            return memberIs("string");
        }

        public java.lang.String getString() {
            checkNotNull();
            if (_stringMember!= null) {
                return _stringMember;
            }
            Object __rawValue = super._map.get("string");
            _stringMember = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _stringMember;
        }

        public void setString(java.lang.String value) {
            checkNotNull();
            super._map.clear();
            _stringMember = value;
            CheckedUtil.putWithoutChecking(super._map, "string", value);
        }

        public static PropertyValue.Value create(java.lang.Double value) {
            PropertyValue.Value newUnion = new PropertyValue.Value();
            newUnion.setDouble(value);
            return newUnion;
        }

        public boolean isDouble() {
            return memberIs("double");
        }

        public java.lang.Double getDouble() {
            checkNotNull();
            if (_doubleMember!= null) {
                return _doubleMember;
            }
            Object __rawValue = super._map.get("double");
            _doubleMember = DataTemplateUtil.coerceDoubleOutput(__rawValue);
            return _doubleMember;
        }

        public void setDouble(java.lang.Double value) {
            checkNotNull();
            super._map.clear();
            _doubleMember = value;
            CheckedUtil.putWithoutChecking(super._map, "double", DataTemplateUtil.coerceDoubleInput(value));
        }

        public static PropertyValue.Value.ProjectionMask createMask() {
            return new PropertyValue.Value.ProjectionMask();
        }

        @Override
        public PropertyValue.Value clone()
            throws CloneNotSupportedException
        {
            PropertyValue.Value __clone = ((PropertyValue.Value) super.clone());
            __clone.__changeListener = new PropertyValue.Value.ChangeListener(__clone);
            __clone.addChangeListener(__clone.__changeListener);
            return __clone;
        }

        @Override
        public PropertyValue.Value copy()
            throws CloneNotSupportedException
        {
            PropertyValue.Value __copy = ((PropertyValue.Value) super.copy());
            __copy._stringMember = null;
            __copy._doubleMember = null;
            __copy.__changeListener = new PropertyValue.Value.ChangeListener(__copy);
            __copy.addChangeListener(__copy.__changeListener);
            return __copy;
        }

        private static class ChangeListener
            implements com.linkedin.data.collections.CheckedMap.ChangeListener<java.lang.String, Object>
        {

            private final PropertyValue.Value __objectRef;

            private ChangeListener(PropertyValue.Value reference) {
                __objectRef = reference;
            }

            @Override
            public void onUnderlyingMapChanged(java.lang.String key, Object value) {
                switch (key) {
                    case "string":
                        __objectRef._stringMember = null;
                        break;
                    case "double":
                        __objectRef._doubleMember = null;
                        break;
                }
            }

        }

        public static class Fields
            extends PathSpec
        {


            public Fields(List<java.lang.String> path, java.lang.String name) {
                super(path, name);
            }

            public Fields() {
                super();
            }

            public PathSpec String() {
                return new PathSpec(getPathComponents(), "string");
            }

            public PathSpec Double() {
                return new PathSpec(getPathComponents(), "double");
            }

        }

        public static class ProjectionMask
            extends MaskMap
        {


            ProjectionMask() {
                super(3);
            }

            public PropertyValue.Value.ProjectionMask withString() {
                getDataMap().put("string", MaskMap.POSITIVE_MASK);
                return this;
            }

            public PropertyValue.Value.ProjectionMask withDouble() {
                getDataMap().put("double", MaskMap.POSITIVE_MASK);
                return this;
            }

        }

    }

}
