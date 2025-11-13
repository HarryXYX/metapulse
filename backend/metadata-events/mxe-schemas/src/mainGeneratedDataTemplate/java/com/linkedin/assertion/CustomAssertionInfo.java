
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Attributes that are applicable to Custom Assertions
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/CustomAssertionInfo.pdl.")
public class CustomAssertionInfo
    extends RecordTemplate
{

    private final static CustomAssertionInfo.Fields _fields = new CustomAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes that are applicable to Custom Assertions\n*/record CustomAssertionInfo{/**The type of custom assertion.\nThis is how your assertion will appear categorized in DataHub UI. */@Searchable.fieldName=\"customType\"type:string/**The entity targeted by this assertion.\nThis can have support more entityTypes (e.g. dataJob) in future*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**dataset schema field targeted by this assertion.\n\nThis field is expected to be provided if the assertion is on dataset field*/@Relationship={\"entityTypes\":[\"schemaField\"],\"name\":\"Asserts\"}field:optional com.linkedin.common.Urn,logic:optional string}", SchemaFormatType.PDL));
    private String _typeField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private com.linkedin.common.urn.Urn _fieldField = null;
    private String _logicField = null;
    private CustomAssertionInfo.ChangeListener __changeListener = new CustomAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Logic = SCHEMA.getField("logic");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public CustomAssertionInfo() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CustomAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CustomAssertionInfo.Fields fields() {
        return _fields;
    }

    public static CustomAssertionInfo.ProjectionMask createMask() {
        return new CustomAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see CustomAssertionInfo.Fields#type
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
     * @see CustomAssertionInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see CustomAssertionInfo.Fields#type
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
     * @see CustomAssertionInfo.Fields#type
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
     * @see CustomAssertionInfo.Fields#type
     */
    public CustomAssertionInfo setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.CustomAssertionInfo");
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
     * @see CustomAssertionInfo.Fields#type
     */
    public CustomAssertionInfo setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.CustomAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see CustomAssertionInfo.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see CustomAssertionInfo.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see CustomAssertionInfo.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntity();
            case DEFAULT:
            case NULL:
                if (_entityField!= null) {
                    return _entityField;
                } else {
                    Object __rawValue = super._map.get("entity");
                    _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CustomAssertionInfo.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entity");
            }
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see CustomAssertionInfo.Fields#entity
     */
    public CustomAssertionInfo setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.assertion.CustomAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CustomAssertionInfo.Fields#entity
     */
    public CustomAssertionInfo setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.assertion.CustomAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for field
     * 
     * @see CustomAssertionInfo.Fields#field
     */
    public boolean hasField() {
        if (_fieldField!= null) {
            return true;
        }
        return super._map.containsKey("field");
    }

    /**
     * Remover for field
     * 
     * @see CustomAssertionInfo.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see CustomAssertionInfo.Fields#field
     */
    @Nullable
    public com.linkedin.common.urn.Urn getField(GetMode mode) {
        return getField();
    }

    /**
     * Getter for field
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CustomAssertionInfo.Fields#field
     */
    @Nullable
    public com.linkedin.common.urn.Urn getField() {
        if (_fieldField!= null) {
            return _fieldField;
        } else {
            Object __rawValue = super._map.get("field");
            _fieldField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _fieldField;
        }
    }

    /**
     * Setter for field
     * 
     * @see CustomAssertionInfo.Fields#field
     */
    public CustomAssertionInfo setField(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _fieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "field", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _fieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for field
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CustomAssertionInfo.Fields#field
     */
    public CustomAssertionInfo setField(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.assertion.CustomAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for logic
     * 
     * @see CustomAssertionInfo.Fields#logic
     */
    public boolean hasLogic() {
        if (_logicField!= null) {
            return true;
        }
        return super._map.containsKey("logic");
    }

    /**
     * Remover for logic
     * 
     * @see CustomAssertionInfo.Fields#logic
     */
    public void removeLogic() {
        super._map.remove("logic");
    }

    /**
     * Getter for logic
     * 
     * @see CustomAssertionInfo.Fields#logic
     */
    @Nullable
    public String getLogic(GetMode mode) {
        return getLogic();
    }

    /**
     * Getter for logic
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CustomAssertionInfo.Fields#logic
     */
    @Nullable
    public String getLogic() {
        if (_logicField!= null) {
            return _logicField;
        } else {
            Object __rawValue = super._map.get("logic");
            _logicField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _logicField;
        }
    }

    /**
     * Setter for logic
     * 
     * @see CustomAssertionInfo.Fields#logic
     */
    public CustomAssertionInfo setLogic(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLogic(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLogic();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "logic", value);
                    _logicField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "logic", value);
                    _logicField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for logic
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CustomAssertionInfo.Fields#logic
     */
    public CustomAssertionInfo setLogic(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field logic of com.linkedin.assertion.CustomAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "logic", value);
            _logicField = value;
        }
        return this;
    }

    @Override
    public CustomAssertionInfo clone()
        throws CloneNotSupportedException
    {
        CustomAssertionInfo __clone = ((CustomAssertionInfo) super.clone());
        __clone.__changeListener = new CustomAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CustomAssertionInfo copy()
        throws CloneNotSupportedException
    {
        CustomAssertionInfo __copy = ((CustomAssertionInfo) super.copy());
        __copy._fieldField = null;
        __copy._logicField = null;
        __copy._typeField = null;
        __copy._entityField = null;
        __copy.__changeListener = new CustomAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CustomAssertionInfo __objectRef;

        private ChangeListener(CustomAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "logic":
                    __objectRef._logicField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         * The type of custom assertion.
         * This is how your assertion will appear categorized in DataHub UI. 
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The entity targeted by this assertion.
         * This can have support more entityTypes (e.g. dataJob) in future
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * dataset schema field targeted by this assertion.
         * 
         * This field is expected to be provided if the assertion is on dataset field
         * 
         */
        public PathSpec field() {
            return new PathSpec(getPathComponents(), "field");
        }

        public PathSpec logic() {
            return new PathSpec(getPathComponents(), "logic");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * The type of custom assertion.
         * This is how your assertion will appear categorized in DataHub UI. 
         * 
         */
        public CustomAssertionInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity targeted by this assertion.
         * This can have support more entityTypes (e.g. dataJob) in future
         * 
         */
        public CustomAssertionInfo.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * dataset schema field targeted by this assertion.
         * 
         * This field is expected to be provided if the assertion is on dataset field
         * 
         */
        public CustomAssertionInfo.ProjectionMask withField() {
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        public CustomAssertionInfo.ProjectionMask withLogic() {
            getDataMap().put("logic", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
