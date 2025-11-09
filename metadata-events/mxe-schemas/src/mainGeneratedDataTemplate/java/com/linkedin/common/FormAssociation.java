
package com.linkedin.common;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Properties of an applied form.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/FormAssociation.pdl.")
public class FormAssociation
    extends RecordTemplate
{

    private final static FormAssociation.Fields _fields = new FormAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties of an applied form.*/record FormAssociation{/**Urn of the applied form*/urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**A list of prompts that are not yet complete for this form.*/incompletePrompts:array[/**Information about the status of a particular prompt.\nNote that this is where we can add additional information about individual responses:\nactor, timestamp, and the response itself.*/record FormPromptAssociation{/**The id for the prompt. This must be GLOBALLY UNIQUE.*/id:string/**The last time this prompt was touched for the entity (set, unset)*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Optional information about the field-level prompt associations.*/fieldAssociations:optional/**Information about the field-level prompt associations on a top-level prompt association.*/record FormPromptFieldAssociations{/**A list of field-level prompt associations that are not yet complete for this form.*/completedFieldPrompts:optional array[/**Information about the status of a particular prompt for a specific schema field\non an entity.*/record FieldFormPromptAssociation{/**The field path on a schema field.*/fieldPath:string/**The last time this prompt was touched for the field on the entity (set, unset)*/lastModified:AuditStamp}]/**A list of field-level prompt associations that are complete for this form.*/incompleteFieldPrompts:optional array[FieldFormPromptAssociation]}}]=[]/**A list of prompts that have been completed for this form.*/completedPrompts:array[FormPromptAssociation]=[]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _urnField = null;
    private FormPromptAssociationArray _incompletePromptsField = null;
    private FormPromptAssociationArray _completedPromptsField = null;
    private FormAssociation.ChangeListener __changeListener = new FormAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_IncompletePrompts = SCHEMA.getField("incompletePrompts");
    private final static FormPromptAssociationArray DEFAULT_IncompletePrompts;
    private final static RecordDataSchema.Field FIELD_CompletedPrompts = SCHEMA.getField("completedPrompts");
    private final static FormPromptAssociationArray DEFAULT_CompletedPrompts;

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_IncompletePrompts = ((FIELD_IncompletePrompts.getDefault() == null)?null:new FormPromptAssociationArray(DataTemplateUtil.castOrThrow(FIELD_IncompletePrompts.getDefault(), DataList.class)));
        DEFAULT_CompletedPrompts = ((FIELD_CompletedPrompts.getDefault() == null)?null:new FormPromptAssociationArray(DataTemplateUtil.castOrThrow(FIELD_CompletedPrompts.getDefault(), DataList.class)));
    }

    public FormAssociation() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FormAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormAssociation.Fields fields() {
        return _fields;
    }

    public static FormAssociation.ProjectionMask createMask() {
        return new FormAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see FormAssociation.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see FormAssociation.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see FormAssociation.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormAssociation.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see FormAssociation.Fields#urn
     */
    public FormAssociation setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.common.FormAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormAssociation.Fields#urn
     */
    public FormAssociation setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.common.FormAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for incompletePrompts
     * 
     * @see FormAssociation.Fields#incompletePrompts
     */
    public boolean hasIncompletePrompts() {
        if (_incompletePromptsField!= null) {
            return true;
        }
        return super._map.containsKey("incompletePrompts");
    }

    /**
     * Remover for incompletePrompts
     * 
     * @see FormAssociation.Fields#incompletePrompts
     */
    public void removeIncompletePrompts() {
        super._map.remove("incompletePrompts");
    }

    /**
     * Getter for incompletePrompts
     * 
     * @see FormAssociation.Fields#incompletePrompts
     */
    @Nullable
    public FormPromptAssociationArray getIncompletePrompts(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getIncompletePrompts();
            case NULL:
                if (_incompletePromptsField!= null) {
                    return _incompletePromptsField;
                } else {
                    Object __rawValue = super._map.get("incompletePrompts");
                    _incompletePromptsField = ((__rawValue == null)?null:new FormPromptAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _incompletePromptsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for incompletePrompts
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormAssociation.Fields#incompletePrompts
     */
    @Nonnull
    public FormPromptAssociationArray getIncompletePrompts() {
        if (_incompletePromptsField!= null) {
            return _incompletePromptsField;
        } else {
            Object __rawValue = super._map.get("incompletePrompts");
            if (__rawValue == null) {
                return DEFAULT_IncompletePrompts;
            }
            _incompletePromptsField = ((__rawValue == null)?null:new FormPromptAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _incompletePromptsField;
        }
    }

    /**
     * Setter for incompletePrompts
     * 
     * @see FormAssociation.Fields#incompletePrompts
     */
    public FormAssociation setIncompletePrompts(
        @Nullable
        FormPromptAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncompletePrompts(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field incompletePrompts of com.linkedin.common.FormAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incompletePrompts", value.data());
                    _incompletePromptsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncompletePrompts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incompletePrompts", value.data());
                    _incompletePromptsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "incompletePrompts", value.data());
                    _incompletePromptsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for incompletePrompts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormAssociation.Fields#incompletePrompts
     */
    public FormAssociation setIncompletePrompts(
        @Nonnull
        FormPromptAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field incompletePrompts of com.linkedin.common.FormAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "incompletePrompts", value.data());
            _incompletePromptsField = value;
        }
        return this;
    }

    /**
     * Existence checker for completedPrompts
     * 
     * @see FormAssociation.Fields#completedPrompts
     */
    public boolean hasCompletedPrompts() {
        if (_completedPromptsField!= null) {
            return true;
        }
        return super._map.containsKey("completedPrompts");
    }

    /**
     * Remover for completedPrompts
     * 
     * @see FormAssociation.Fields#completedPrompts
     */
    public void removeCompletedPrompts() {
        super._map.remove("completedPrompts");
    }

    /**
     * Getter for completedPrompts
     * 
     * @see FormAssociation.Fields#completedPrompts
     */
    @Nullable
    public FormPromptAssociationArray getCompletedPrompts(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCompletedPrompts();
            case NULL:
                if (_completedPromptsField!= null) {
                    return _completedPromptsField;
                } else {
                    Object __rawValue = super._map.get("completedPrompts");
                    _completedPromptsField = ((__rawValue == null)?null:new FormPromptAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _completedPromptsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for completedPrompts
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormAssociation.Fields#completedPrompts
     */
    @Nonnull
    public FormPromptAssociationArray getCompletedPrompts() {
        if (_completedPromptsField!= null) {
            return _completedPromptsField;
        } else {
            Object __rawValue = super._map.get("completedPrompts");
            if (__rawValue == null) {
                return DEFAULT_CompletedPrompts;
            }
            _completedPromptsField = ((__rawValue == null)?null:new FormPromptAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _completedPromptsField;
        }
    }

    /**
     * Setter for completedPrompts
     * 
     * @see FormAssociation.Fields#completedPrompts
     */
    public FormAssociation setCompletedPrompts(
        @Nullable
        FormPromptAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCompletedPrompts(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field completedPrompts of com.linkedin.common.FormAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "completedPrompts", value.data());
                    _completedPromptsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCompletedPrompts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "completedPrompts", value.data());
                    _completedPromptsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "completedPrompts", value.data());
                    _completedPromptsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for completedPrompts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormAssociation.Fields#completedPrompts
     */
    public FormAssociation setCompletedPrompts(
        @Nonnull
        FormPromptAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field completedPrompts of com.linkedin.common.FormAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "completedPrompts", value.data());
            _completedPromptsField = value;
        }
        return this;
    }

    @Override
    public FormAssociation clone()
        throws CloneNotSupportedException
    {
        FormAssociation __clone = ((FormAssociation) super.clone());
        __clone.__changeListener = new FormAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormAssociation copy()
        throws CloneNotSupportedException
    {
        FormAssociation __copy = ((FormAssociation) super.copy());
        __copy._urnField = null;
        __copy._completedPromptsField = null;
        __copy._incompletePromptsField = null;
        __copy.__changeListener = new FormAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormAssociation __objectRef;

        private ChangeListener(FormAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "completedPrompts":
                    __objectRef._completedPromptsField = null;
                    break;
                case "incompletePrompts":
                    __objectRef._incompletePromptsField = null;
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
         * Urn of the applied form
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * A list of prompts that are not yet complete for this form.
         * 
         */
        public com.linkedin.common.FormPromptAssociationArray.Fields incompletePrompts() {
            return new com.linkedin.common.FormPromptAssociationArray.Fields(getPathComponents(), "incompletePrompts");
        }

        /**
         * A list of prompts that are not yet complete for this form.
         * 
         */
        public PathSpec incompletePrompts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "incompletePrompts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A list of prompts that have been completed for this form.
         * 
         */
        public com.linkedin.common.FormPromptAssociationArray.Fields completedPrompts() {
            return new com.linkedin.common.FormPromptAssociationArray.Fields(getPathComponents(), "completedPrompts");
        }

        /**
         * A list of prompts that have been completed for this form.
         * 
         */
        public PathSpec completedPrompts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "completedPrompts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.FormPromptAssociationArray.ProjectionMask _incompletePromptsMask;
        private com.linkedin.common.FormPromptAssociationArray.ProjectionMask _completedPromptsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Urn of the applied form
         * 
         */
        public FormAssociation.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of prompts that are not yet complete for this form.
         * 
         */
        public FormAssociation.ProjectionMask withIncompletePrompts(Function<com.linkedin.common.FormPromptAssociationArray.ProjectionMask, com.linkedin.common.FormPromptAssociationArray.ProjectionMask> nestedMask) {
            _incompletePromptsMask = nestedMask.apply(((_incompletePromptsMask == null)?FormPromptAssociationArray.createMask():_incompletePromptsMask));
            getDataMap().put("incompletePrompts", _incompletePromptsMask.getDataMap());
            return this;
        }

        /**
         * A list of prompts that are not yet complete for this form.
         * 
         */
        public FormAssociation.ProjectionMask withIncompletePrompts() {
            _incompletePromptsMask = null;
            getDataMap().put("incompletePrompts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of prompts that are not yet complete for this form.
         * 
         */
        public FormAssociation.ProjectionMask withIncompletePrompts(Function<com.linkedin.common.FormPromptAssociationArray.ProjectionMask, com.linkedin.common.FormPromptAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _incompletePromptsMask = nestedMask.apply(((_incompletePromptsMask == null)?FormPromptAssociationArray.createMask():_incompletePromptsMask));
            getDataMap().put("incompletePrompts", _incompletePromptsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("incompletePrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("incompletePrompts").put("$count", count);
            }
            return this;
        }

        /**
         * A list of prompts that are not yet complete for this form.
         * 
         */
        public FormAssociation.ProjectionMask withIncompletePrompts(Integer start, Integer count) {
            _incompletePromptsMask = null;
            getDataMap().put("incompletePrompts", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("incompletePrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("incompletePrompts").put("$count", count);
            }
            return this;
        }

        /**
         * A list of prompts that have been completed for this form.
         * 
         */
        public FormAssociation.ProjectionMask withCompletedPrompts(Function<com.linkedin.common.FormPromptAssociationArray.ProjectionMask, com.linkedin.common.FormPromptAssociationArray.ProjectionMask> nestedMask) {
            _completedPromptsMask = nestedMask.apply(((_completedPromptsMask == null)?FormPromptAssociationArray.createMask():_completedPromptsMask));
            getDataMap().put("completedPrompts", _completedPromptsMask.getDataMap());
            return this;
        }

        /**
         * A list of prompts that have been completed for this form.
         * 
         */
        public FormAssociation.ProjectionMask withCompletedPrompts() {
            _completedPromptsMask = null;
            getDataMap().put("completedPrompts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of prompts that have been completed for this form.
         * 
         */
        public FormAssociation.ProjectionMask withCompletedPrompts(Function<com.linkedin.common.FormPromptAssociationArray.ProjectionMask, com.linkedin.common.FormPromptAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _completedPromptsMask = nestedMask.apply(((_completedPromptsMask == null)?FormPromptAssociationArray.createMask():_completedPromptsMask));
            getDataMap().put("completedPrompts", _completedPromptsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("completedPrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("completedPrompts").put("$count", count);
            }
            return this;
        }

        /**
         * A list of prompts that have been completed for this form.
         * 
         */
        public FormAssociation.ProjectionMask withCompletedPrompts(Integer start, Integer count) {
            _completedPromptsMask = null;
            getDataMap().put("completedPrompts", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("completedPrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("completedPrompts").put("$count", count);
            }
            return this;
        }

    }

}
