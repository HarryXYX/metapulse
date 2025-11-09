
package com.linkedin.metadata.search;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/SearchEntity.pdl.")
public class MatchedField
    extends RecordTemplate
{

    private final static MatchedField.Fields _fields = new MatchedField.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search,record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _valueField = null;
    private MatchedField.ChangeListener __changeListener = new MatchedField.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");

    public MatchedField() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MatchedField(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MatchedField.Fields fields() {
        return _fields;
    }

    public static MatchedField.ProjectionMask createMask() {
        return new MatchedField.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see MatchedField.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see MatchedField.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see MatchedField.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MatchedField.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see MatchedField.Fields#name
     */
    public MatchedField setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.search.MatchedField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MatchedField.Fields#name
     */
    public MatchedField setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.search.MatchedField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see MatchedField.Fields#value
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
     * @see MatchedField.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see MatchedField.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see MatchedField.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see MatchedField.Fields#value
     */
    public MatchedField setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.metadata.search.MatchedField");
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
     * @see MatchedField.Fields#value
     */
    public MatchedField setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.metadata.search.MatchedField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    @Override
    public MatchedField clone()
        throws CloneNotSupportedException
    {
        MatchedField __clone = ((MatchedField) super.clone());
        __clone.__changeListener = new MatchedField.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MatchedField copy()
        throws CloneNotSupportedException
    {
        MatchedField __copy = ((MatchedField) super.copy());
        __copy._nameField = null;
        __copy._valueField = null;
        __copy.__changeListener = new MatchedField.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MatchedField __objectRef;

        private ChangeListener(MatchedField reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "name":
                    __objectRef._nameField = null;
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


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Matched field name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Matched field value
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Matched field name
         * 
         */
        public MatchedField.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Matched field value
         * 
         */
        public MatchedField.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
