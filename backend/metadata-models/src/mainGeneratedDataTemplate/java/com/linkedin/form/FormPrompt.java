
package com.linkedin.form;

import java.util.List;
import java.util.function.Function;
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
 * A prompt to present to the user to encourage filling out metadata
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/form/FormPrompt.pdl.")
public class FormPrompt
    extends RecordTemplate
{

    private final static FormPrompt.Fields _fields = new FormPrompt.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.form/**A prompt to present to the user to encourage filling out metadata*/record FormPrompt{/**The unique id for this prompt. This must be GLOBALLY unique.*/@Searchable={\"fieldName\":\"promptId\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}id:string/**The title of this prompt*/title:string/**The description of this prompt*/description:optional string/**The type of prompt*/type:enum FormPromptType{/**This prompt is meant to apply a structured property to an entity*/STRUCTURED_PROPERTY/**This prompt is meant to apply a structured property to a schema fields entity*/FIELDS_STRUCTURED_PROPERTY}/**An optional set of information specific to structured properties prompts.\nThis should be filled out if the prompt is type STRUCTURED_PROPERTY or FIELDS_STRUCTURED_PROPERTY.*/structuredPropertyParams:optional record StructuredPropertyParams{/**The structured property that is required on this entity*/@Searchable={\"fieldName\":\"structuredPropertyPromptUrns\",\"fieldType\":\"URN\"}urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Whether the prompt is required to be completed, in order for the form to be marked as complete.*/required:boolean=false}", SchemaFormatType.PDL));
    private String _idField = null;
    private String _titleField = null;
    private String _descriptionField = null;
    private FormPromptType _typeField = null;
    private StructuredPropertyParams _structuredPropertyParamsField = null;
    private Boolean _requiredField = null;
    private FormPrompt.ChangeListener __changeListener = new FormPrompt.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_StructuredPropertyParams = SCHEMA.getField("structuredPropertyParams");
    private final static RecordDataSchema.Field FIELD_Required = SCHEMA.getField("required");
    private final static Boolean DEFAULT_Required;

    static {
        DEFAULT_Required = DataTemplateUtil.coerceBooleanOutput(FIELD_Required.getDefault());
    }

    public FormPrompt() {
        super(new DataMap(8, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public FormPrompt(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormPrompt.Fields fields() {
        return _fields;
    }

    public static FormPrompt.ProjectionMask createMask() {
        return new FormPrompt.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see FormPrompt.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see FormPrompt.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see FormPrompt.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormPrompt.Fields#id
     */
    @Nonnull
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see FormPrompt.Fields#id
     */
    public FormPrompt setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.form.FormPrompt");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPrompt.Fields#id
     */
    public FormPrompt setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.form.FormPrompt to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see FormPrompt.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see FormPrompt.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see FormPrompt.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTitle();
            case DEFAULT:
            case NULL:
                if (_titleField!= null) {
                    return _titleField;
                } else {
                    Object __rawValue = super._map.get("title");
                    _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _titleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormPrompt.Fields#title
     */
    @Nonnull
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("title");
            }
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see FormPrompt.Fields#title
     */
    public FormPrompt setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field title of com.linkedin.form.FormPrompt");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPrompt.Fields#title
     */
    public FormPrompt setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.form.FormPrompt to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see FormPrompt.Fields#description
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
     * @see FormPrompt.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see FormPrompt.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormPrompt.Fields#description
     */
    @Nullable
    public String getDescription() {
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
     * @see FormPrompt.Fields#description
     */
    public FormPrompt setDescription(
        @Nullable
        String value, SetMode mode) {
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
     * @see FormPrompt.Fields#description
     */
    public FormPrompt setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.form.FormPrompt to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see FormPrompt.Fields#type
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
     * @see FormPrompt.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FormPrompt.Fields#type
     */
    @Nullable
    public FormPromptType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FormPromptType.class, FormPromptType.$UNKNOWN);
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
     * @see FormPrompt.Fields#type
     */
    @Nonnull
    public FormPromptType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FormPromptType.class, FormPromptType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FormPrompt.Fields#type
     */
    public FormPrompt setType(
        @Nullable
        FormPromptType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.form.FormPrompt");
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
     * @see FormPrompt.Fields#type
     */
    public FormPrompt setType(
        @Nonnull
        FormPromptType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.form.FormPrompt to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for structuredPropertyParams
     * 
     * @see FormPrompt.Fields#structuredPropertyParams
     */
    public boolean hasStructuredPropertyParams() {
        if (_structuredPropertyParamsField!= null) {
            return true;
        }
        return super._map.containsKey("structuredPropertyParams");
    }

    /**
     * Remover for structuredPropertyParams
     * 
     * @see FormPrompt.Fields#structuredPropertyParams
     */
    public void removeStructuredPropertyParams() {
        super._map.remove("structuredPropertyParams");
    }

    /**
     * Getter for structuredPropertyParams
     * 
     * @see FormPrompt.Fields#structuredPropertyParams
     */
    @Nullable
    public StructuredPropertyParams getStructuredPropertyParams(GetMode mode) {
        return getStructuredPropertyParams();
    }

    /**
     * Getter for structuredPropertyParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormPrompt.Fields#structuredPropertyParams
     */
    @Nullable
    public StructuredPropertyParams getStructuredPropertyParams() {
        if (_structuredPropertyParamsField!= null) {
            return _structuredPropertyParamsField;
        } else {
            Object __rawValue = super._map.get("structuredPropertyParams");
            _structuredPropertyParamsField = ((__rawValue == null)?null:new StructuredPropertyParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _structuredPropertyParamsField;
        }
    }

    /**
     * Setter for structuredPropertyParams
     * 
     * @see FormPrompt.Fields#structuredPropertyParams
     */
    public FormPrompt setStructuredPropertyParams(
        @Nullable
        StructuredPropertyParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStructuredPropertyParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStructuredPropertyParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "structuredPropertyParams", value.data());
                    _structuredPropertyParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "structuredPropertyParams", value.data());
                    _structuredPropertyParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for structuredPropertyParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPrompt.Fields#structuredPropertyParams
     */
    public FormPrompt setStructuredPropertyParams(
        @Nonnull
        StructuredPropertyParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field structuredPropertyParams of com.linkedin.form.FormPrompt to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "structuredPropertyParams", value.data());
            _structuredPropertyParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for required
     * 
     * @see FormPrompt.Fields#required
     */
    public boolean hasRequired() {
        if (_requiredField!= null) {
            return true;
        }
        return super._map.containsKey("required");
    }

    /**
     * Remover for required
     * 
     * @see FormPrompt.Fields#required
     */
    public void removeRequired() {
        super._map.remove("required");
    }

    /**
     * Getter for required
     * 
     * @see FormPrompt.Fields#required
     */
    @Nullable
    public Boolean isRequired(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isRequired();
            case NULL:
                if (_requiredField!= null) {
                    return _requiredField;
                } else {
                    Object __rawValue = super._map.get("required");
                    _requiredField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _requiredField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for required
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormPrompt.Fields#required
     */
    @Nonnull
    public Boolean isRequired() {
        if (_requiredField!= null) {
            return _requiredField;
        } else {
            Object __rawValue = super._map.get("required");
            if (__rawValue == null) {
                return DEFAULT_Required;
            }
            _requiredField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _requiredField;
        }
    }

    /**
     * Setter for required
     * 
     * @see FormPrompt.Fields#required
     */
    public FormPrompt setRequired(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRequired(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field required of com.linkedin.form.FormPrompt");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "required", value);
                    _requiredField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRequired();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "required", value);
                    _requiredField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "required", value);
                    _requiredField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for required
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPrompt.Fields#required
     */
    public FormPrompt setRequired(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field required of com.linkedin.form.FormPrompt to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "required", value);
            _requiredField = value;
        }
        return this;
    }

    /**
     * Setter for required
     * 
     * @see FormPrompt.Fields#required
     */
    public FormPrompt setRequired(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "required", value);
        _requiredField = value;
        return this;
    }

    @Override
    public FormPrompt clone()
        throws CloneNotSupportedException
    {
        FormPrompt __clone = ((FormPrompt) super.clone());
        __clone.__changeListener = new FormPrompt.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormPrompt copy()
        throws CloneNotSupportedException
    {
        FormPrompt __copy = ((FormPrompt) super.copy());
        __copy._structuredPropertyParamsField = null;
        __copy._descriptionField = null;
        __copy._idField = null;
        __copy._titleField = null;
        __copy._typeField = null;
        __copy._requiredField = null;
        __copy.__changeListener = new FormPrompt.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormPrompt __objectRef;

        private ChangeListener(FormPrompt reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "structuredPropertyParams":
                    __objectRef._structuredPropertyParamsField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "required":
                    __objectRef._requiredField = null;
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
         * The unique id for this prompt. This must be GLOBALLY unique.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * The title of this prompt
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * The description of this prompt
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The type of prompt
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * An optional set of information specific to structured properties prompts.
         * This should be filled out if the prompt is type STRUCTURED_PROPERTY or FIELDS_STRUCTURED_PROPERTY.
         * 
         */
        public com.linkedin.form.StructuredPropertyParams.Fields structuredPropertyParams() {
            return new com.linkedin.form.StructuredPropertyParams.Fields(getPathComponents(), "structuredPropertyParams");
        }

        /**
         * Whether the prompt is required to be completed, in order for the form to be marked as complete.
         * 
         */
        public PathSpec required() {
            return new PathSpec(getPathComponents(), "required");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.form.StructuredPropertyParams.ProjectionMask _structuredPropertyParamsMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * The unique id for this prompt. This must be GLOBALLY unique.
         * 
         */
        public FormPrompt.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The title of this prompt
         * 
         */
        public FormPrompt.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The description of this prompt
         * 
         */
        public FormPrompt.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of prompt
         * 
         */
        public FormPrompt.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional set of information specific to structured properties prompts.
         * This should be filled out if the prompt is type STRUCTURED_PROPERTY or FIELDS_STRUCTURED_PROPERTY.
         * 
         */
        public FormPrompt.ProjectionMask withStructuredPropertyParams(Function<com.linkedin.form.StructuredPropertyParams.ProjectionMask, com.linkedin.form.StructuredPropertyParams.ProjectionMask> nestedMask) {
            _structuredPropertyParamsMask = nestedMask.apply(((_structuredPropertyParamsMask == null)?StructuredPropertyParams.createMask():_structuredPropertyParamsMask));
            getDataMap().put("structuredPropertyParams", _structuredPropertyParamsMask.getDataMap());
            return this;
        }

        /**
         * An optional set of information specific to structured properties prompts.
         * This should be filled out if the prompt is type STRUCTURED_PROPERTY or FIELDS_STRUCTURED_PROPERTY.
         * 
         */
        public FormPrompt.ProjectionMask withStructuredPropertyParams() {
            _structuredPropertyParamsMask = null;
            getDataMap().put("structuredPropertyParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the prompt is required to be completed, in order for the form to be marked as complete.
         * 
         */
        public FormPrompt.ProjectionMask withRequired() {
            getDataMap().put("required", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
