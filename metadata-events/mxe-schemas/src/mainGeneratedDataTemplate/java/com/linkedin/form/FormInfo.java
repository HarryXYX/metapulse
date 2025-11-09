
package com.linkedin.form;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
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
 * Information about a form to help with filling out metadata on entities.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/form/FormInfo.pdl.")
public class FormInfo
    extends RecordTemplate
{

    private final static FormInfo.Fields _fields = new FormInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.form/**Information about a form to help with filling out metadata on entities.*/@Aspect.name=\"formInfo\"record FormInfo{/**Display name of the form*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string/**Description of the form*/description:optional string/**The type of this form*/@Searchable.fieldType=\"KEYWORD\"type:enum FormType{/**A form simply used for collecting metadata fields for an entity.*/COMPLETION/**This form is used for \"verifying\" that entities comply with a policy via presence of a specific set of metadata fields.*/VERIFICATION}=\"COMPLETION\"/**List of prompts to present to the user to encourage filling out metadata*/prompts:array[/**A prompt to present to the user to encourage filling out metadata*/record FormPrompt{/**The unique id for this prompt. This must be GLOBALLY unique.*/@Searchable={\"fieldName\":\"promptId\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}id:string/**The title of this prompt*/title:string/**The description of this prompt*/description:optional string/**The type of prompt*/type:enum FormPromptType{/**This prompt is meant to apply a structured property to an entity*/STRUCTURED_PROPERTY/**This prompt is meant to apply a structured property to a schema fields entity*/FIELDS_STRUCTURED_PROPERTY}/**An optional set of information specific to structured properties prompts.\nThis should be filled out if the prompt is type STRUCTURED_PROPERTY or FIELDS_STRUCTURED_PROPERTY.*/structuredPropertyParams:optional record StructuredPropertyParams{/**The structured property that is required on this entity*/@Searchable={\"fieldName\":\"structuredPropertyPromptUrns\",\"fieldType\":\"URN\"}urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Whether the prompt is required to be completed, in order for the form to be marked as complete.*/required:boolean=false}]=[]/**Who the form is assigned to, e.g. who should see the form when visiting the entity page or governance center*/actors:record FormActorAssignment{/**Whether the form should be assigned to the owners of assets that it is applied to.\nThis is the default.*/@Searchable={\"fieldName\":\"isOwnershipForm\",\"fieldType\":\"BOOLEAN\"}owners:boolean=true/**Optional: Specific set of groups that are targeted by this form assignment.*/@Searchable.`/*`={\"fieldName\":\"assignedGroups\",\"fieldType\":\"URN\"}groups:optional array[com.linkedin.common.Urn]/**Optional: Specific set of users that are targeted by this form assignment.*/@Searchable.`/*`={\"fieldName\":\"assignedUsers\",\"fieldType\":\"URN\"}users:optional array[com.linkedin.common.Urn]}={\"owners\":true}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _descriptionField = null;
    private FormType _typeField = null;
    private FormPromptArray _promptsField = null;
    private FormActorAssignment _actorsField = null;
    private FormInfo.ChangeListener __changeListener = new FormInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static FormType DEFAULT_Type;
    private final static RecordDataSchema.Field FIELD_Prompts = SCHEMA.getField("prompts");
    private final static FormPromptArray DEFAULT_Prompts;
    private final static RecordDataSchema.Field FIELD_Actors = SCHEMA.getField("actors");
    private final static FormActorAssignment DEFAULT_Actors;

    static {
        DEFAULT_Type = DataTemplateUtil.coerceEnumOutput(FIELD_Type.getDefault(), FormType.class, FormType.$UNKNOWN);
        DEFAULT_Prompts = ((FIELD_Prompts.getDefault() == null)?null:new FormPromptArray(DataTemplateUtil.castOrThrow(FIELD_Prompts.getDefault(), DataList.class)));
        DEFAULT_Actors = ((FIELD_Actors.getDefault() == null)?null:new FormActorAssignment(DataTemplateUtil.castOrThrow(FIELD_Actors.getDefault(), DataMap.class)));
    }

    public FormInfo() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FormInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormInfo.Fields fields() {
        return _fields;
    }

    public static FormInfo.ProjectionMask createMask() {
        return new FormInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see FormInfo.Fields#name
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
     * @see FormInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see FormInfo.Fields#name
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
     * @see FormInfo.Fields#name
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
     * @see FormInfo.Fields#name
     */
    public FormInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.form.FormInfo");
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
     * @see FormInfo.Fields#name
     */
    public FormInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.form.FormInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see FormInfo.Fields#description
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
     * @see FormInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see FormInfo.Fields#description
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
     * @see FormInfo.Fields#description
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
     * @see FormInfo.Fields#description
     */
    public FormInfo setDescription(
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
     * @see FormInfo.Fields#description
     */
    public FormInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.form.FormInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see FormInfo.Fields#type
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
     * @see FormInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FormInfo.Fields#type
     */
    @Nullable
    public FormType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getType();
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FormType.class, FormType.$UNKNOWN);
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
     * @see FormInfo.Fields#type
     */
    @Nonnull
    public FormType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                return DEFAULT_Type;
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FormType.class, FormType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FormInfo.Fields#type
     */
    public FormInfo setType(
        @Nullable
        FormType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.form.FormInfo");
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
     * @see FormInfo.Fields#type
     */
    public FormInfo setType(
        @Nonnull
        FormType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.form.FormInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for prompts
     * 
     * @see FormInfo.Fields#prompts
     */
    public boolean hasPrompts() {
        if (_promptsField!= null) {
            return true;
        }
        return super._map.containsKey("prompts");
    }

    /**
     * Remover for prompts
     * 
     * @see FormInfo.Fields#prompts
     */
    public void removePrompts() {
        super._map.remove("prompts");
    }

    /**
     * Getter for prompts
     * 
     * @see FormInfo.Fields#prompts
     */
    @Nullable
    public FormPromptArray getPrompts(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPrompts();
            case NULL:
                if (_promptsField!= null) {
                    return _promptsField;
                } else {
                    Object __rawValue = super._map.get("prompts");
                    _promptsField = ((__rawValue == null)?null:new FormPromptArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _promptsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for prompts
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormInfo.Fields#prompts
     */
    @Nonnull
    public FormPromptArray getPrompts() {
        if (_promptsField!= null) {
            return _promptsField;
        } else {
            Object __rawValue = super._map.get("prompts");
            if (__rawValue == null) {
                return DEFAULT_Prompts;
            }
            _promptsField = ((__rawValue == null)?null:new FormPromptArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _promptsField;
        }
    }

    /**
     * Setter for prompts
     * 
     * @see FormInfo.Fields#prompts
     */
    public FormInfo setPrompts(
        @Nullable
        FormPromptArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrompts(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field prompts of com.linkedin.form.FormInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "prompts", value.data());
                    _promptsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrompts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "prompts", value.data());
                    _promptsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "prompts", value.data());
                    _promptsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for prompts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormInfo.Fields#prompts
     */
    public FormInfo setPrompts(
        @Nonnull
        FormPromptArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field prompts of com.linkedin.form.FormInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "prompts", value.data());
            _promptsField = value;
        }
        return this;
    }

    /**
     * Existence checker for actors
     * 
     * @see FormInfo.Fields#actors
     */
    public boolean hasActors() {
        if (_actorsField!= null) {
            return true;
        }
        return super._map.containsKey("actors");
    }

    /**
     * Remover for actors
     * 
     * @see FormInfo.Fields#actors
     */
    public void removeActors() {
        super._map.remove("actors");
    }

    /**
     * Getter for actors
     * 
     * @see FormInfo.Fields#actors
     */
    @Nullable
    public FormActorAssignment getActors(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getActors();
            case NULL:
                if (_actorsField!= null) {
                    return _actorsField;
                } else {
                    Object __rawValue = super._map.get("actors");
                    _actorsField = ((__rawValue == null)?null:new FormActorAssignment(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _actorsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for actors
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormInfo.Fields#actors
     */
    @Nonnull
    public FormActorAssignment getActors() {
        if (_actorsField!= null) {
            return _actorsField;
        } else {
            Object __rawValue = super._map.get("actors");
            if (__rawValue == null) {
                return DEFAULT_Actors;
            }
            _actorsField = ((__rawValue == null)?null:new FormActorAssignment(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _actorsField;
        }
    }

    /**
     * Setter for actors
     * 
     * @see FormInfo.Fields#actors
     */
    public FormInfo setActors(
        @Nullable
        FormActorAssignment value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActors(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actors of com.linkedin.form.FormInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
                    _actorsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActors();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
                    _actorsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
                    _actorsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormInfo.Fields#actors
     */
    public FormInfo setActors(
        @Nonnull
        FormActorAssignment value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actors of com.linkedin.form.FormInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
            _actorsField = value;
        }
        return this;
    }

    @Override
    public FormInfo clone()
        throws CloneNotSupportedException
    {
        FormInfo __clone = ((FormInfo) super.clone());
        __clone.__changeListener = new FormInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormInfo copy()
        throws CloneNotSupportedException
    {
        FormInfo __copy = ((FormInfo) super.copy());
        __copy._actorsField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._typeField = null;
        __copy._promptsField = null;
        __copy.__changeListener = new FormInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormInfo __objectRef;

        private ChangeListener(FormInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "actors":
                    __objectRef._actorsField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "prompts":
                    __objectRef._promptsField = null;
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
         * Display name of the form
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Description of the form
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The type of this form
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * List of prompts to present to the user to encourage filling out metadata
         * 
         */
        public com.linkedin.form.FormPromptArray.Fields prompts() {
            return new com.linkedin.form.FormPromptArray.Fields(getPathComponents(), "prompts");
        }

        /**
         * List of prompts to present to the user to encourage filling out metadata
         * 
         */
        public PathSpec prompts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "prompts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Who the form is assigned to, e.g. who should see the form when visiting the entity page or governance center
         * 
         */
        public com.linkedin.form.FormActorAssignment.Fields actors() {
            return new com.linkedin.form.FormActorAssignment.Fields(getPathComponents(), "actors");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.form.FormPromptArray.ProjectionMask _promptsMask;
        private com.linkedin.form.FormActorAssignment.ProjectionMask _actorsMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Display name of the form
         * 
         */
        public FormInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the form
         * 
         */
        public FormInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of this form
         * 
         */
        public FormInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of prompts to present to the user to encourage filling out metadata
         * 
         */
        public FormInfo.ProjectionMask withPrompts(Function<com.linkedin.form.FormPromptArray.ProjectionMask, com.linkedin.form.FormPromptArray.ProjectionMask> nestedMask) {
            _promptsMask = nestedMask.apply(((_promptsMask == null)?FormPromptArray.createMask():_promptsMask));
            getDataMap().put("prompts", _promptsMask.getDataMap());
            return this;
        }

        /**
         * List of prompts to present to the user to encourage filling out metadata
         * 
         */
        public FormInfo.ProjectionMask withPrompts() {
            _promptsMask = null;
            getDataMap().put("prompts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of prompts to present to the user to encourage filling out metadata
         * 
         */
        public FormInfo.ProjectionMask withPrompts(Function<com.linkedin.form.FormPromptArray.ProjectionMask, com.linkedin.form.FormPromptArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _promptsMask = nestedMask.apply(((_promptsMask == null)?FormPromptArray.createMask():_promptsMask));
            getDataMap().put("prompts", _promptsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("prompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("prompts").put("$count", count);
            }
            return this;
        }

        /**
         * List of prompts to present to the user to encourage filling out metadata
         * 
         */
        public FormInfo.ProjectionMask withPrompts(Integer start, Integer count) {
            _promptsMask = null;
            getDataMap().put("prompts", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("prompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("prompts").put("$count", count);
            }
            return this;
        }

        /**
         * Who the form is assigned to, e.g. who should see the form when visiting the entity page or governance center
         * 
         */
        public FormInfo.ProjectionMask withActors(Function<com.linkedin.form.FormActorAssignment.ProjectionMask, com.linkedin.form.FormActorAssignment.ProjectionMask> nestedMask) {
            _actorsMask = nestedMask.apply(((_actorsMask == null)?FormActorAssignment.createMask():_actorsMask));
            getDataMap().put("actors", _actorsMask.getDataMap());
            return this;
        }

        /**
         * Who the form is assigned to, e.g. who should see the form when visiting the entity page or governance center
         * 
         */
        public FormInfo.ProjectionMask withActors() {
            _actorsMask = null;
            getDataMap().put("actors", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
