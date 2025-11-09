
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Forms that are assigned to this entity to be filled out
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Forms.pdl.")
public class Forms
    extends RecordTemplate
{

    private final static Forms.Fields _fields = new Forms.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Forms that are assigned to this entity to be filled out*/@Aspect.name=\"forms\"record Forms{/**All incomplete forms assigned to the entity.*/@Searchable={\"/*/completedPrompts/*/id\":{\"fieldName\":\"incompleteFormsCompletedPromptIds\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false},\"/*/completedPrompts/*/lastModified/time\":{\"fieldName\":\"incompleteFormsCompletedPromptResponseTimes\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/*/incompletePrompts/*/id\":{\"fieldName\":\"incompleteFormsIncompletePromptIds\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false},\"/*/urn\":{\"fieldName\":\"incompleteForms\",\"fieldType\":\"URN\",\"queryByDefault\":false}}incompleteForms:array[/**Properties of an applied form.*/record FormAssociation{/**Urn of the applied form*/urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**A list of prompts that are not yet complete for this form.*/incompletePrompts:array[/**Information about the status of a particular prompt.\nNote that this is where we can add additional information about individual responses:\nactor, timestamp, and the response itself.*/record FormPromptAssociation{/**The id for the prompt. This must be GLOBALLY UNIQUE.*/id:string/**The last time this prompt was touched for the entity (set, unset)*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Optional information about the field-level prompt associations.*/fieldAssociations:optional/**Information about the field-level prompt associations on a top-level prompt association.*/record FormPromptFieldAssociations{/**A list of field-level prompt associations that are not yet complete for this form.*/completedFieldPrompts:optional array[/**Information about the status of a particular prompt for a specific schema field\non an entity.*/record FieldFormPromptAssociation{/**The field path on a schema field.*/fieldPath:string/**The last time this prompt was touched for the field on the entity (set, unset)*/lastModified:AuditStamp}]/**A list of field-level prompt associations that are complete for this form.*/incompleteFieldPrompts:optional array[FieldFormPromptAssociation]}}]=[]/**A list of prompts that have been completed for this form.*/completedPrompts:array[FormPromptAssociation]=[]}]/**All complete forms assigned to the entity.*/@Searchable={\"/*/completedPrompts/*/id\":{\"fieldName\":\"completedFormsCompletedPromptIds\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false},\"/*/completedPrompts/*/lastModified/time\":{\"fieldName\":\"completedFormsCompletedPromptResponseTimes\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/*/incompletePrompts/*/id\":{\"fieldName\":\"completedFormsIncompletePromptIds\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false},\"/*/urn\":{\"fieldName\":\"completedForms\",\"fieldType\":\"URN\",\"queryByDefault\":false}}completedForms:array[FormAssociation]/**Verifications that have been applied to the entity via completed forms.*/@Searchable.`/*/form`={\"fieldName\":\"verifiedForms\",\"fieldType\":\"URN\",\"queryByDefault\":false}verifications:array[/**An association between a verification and an entity that has been granted\nvia completion of one or more forms of type 'VERIFICATION'.*/record FormVerificationAssociation{/**The urn of the form that granted this verification.*/form:Urn/**An audit stamp capturing who and when verification was applied for this form.*/lastModified:optional AuditStamp}]=[]}", SchemaFormatType.PDL));
    private FormAssociationArray _incompleteFormsField = null;
    private FormAssociationArray _completedFormsField = null;
    private FormVerificationAssociationArray _verificationsField = null;
    private Forms.ChangeListener __changeListener = new Forms.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IncompleteForms = SCHEMA.getField("incompleteForms");
    private final static RecordDataSchema.Field FIELD_CompletedForms = SCHEMA.getField("completedForms");
    private final static RecordDataSchema.Field FIELD_Verifications = SCHEMA.getField("verifications");
    private final static FormVerificationAssociationArray DEFAULT_Verifications;

    static {
        DEFAULT_Verifications = ((FIELD_Verifications.getDefault() == null)?null:new FormVerificationAssociationArray(DataTemplateUtil.castOrThrow(FIELD_Verifications.getDefault(), DataList.class)));
    }

    public Forms() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public Forms(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Forms.Fields fields() {
        return _fields;
    }

    public static Forms.ProjectionMask createMask() {
        return new Forms.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for incompleteForms
     * 
     * @see Forms.Fields#incompleteForms
     */
    public boolean hasIncompleteForms() {
        if (_incompleteFormsField!= null) {
            return true;
        }
        return super._map.containsKey("incompleteForms");
    }

    /**
     * Remover for incompleteForms
     * 
     * @see Forms.Fields#incompleteForms
     */
    public void removeIncompleteForms() {
        super._map.remove("incompleteForms");
    }

    /**
     * Getter for incompleteForms
     * 
     * @see Forms.Fields#incompleteForms
     */
    @Nullable
    public FormAssociationArray getIncompleteForms(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getIncompleteForms();
            case DEFAULT:
            case NULL:
                if (_incompleteFormsField!= null) {
                    return _incompleteFormsField;
                } else {
                    Object __rawValue = super._map.get("incompleteForms");
                    _incompleteFormsField = ((__rawValue == null)?null:new FormAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _incompleteFormsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for incompleteForms
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Forms.Fields#incompleteForms
     */
    @Nonnull
    public FormAssociationArray getIncompleteForms() {
        if (_incompleteFormsField!= null) {
            return _incompleteFormsField;
        } else {
            Object __rawValue = super._map.get("incompleteForms");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("incompleteForms");
            }
            _incompleteFormsField = ((__rawValue == null)?null:new FormAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _incompleteFormsField;
        }
    }

    /**
     * Setter for incompleteForms
     * 
     * @see Forms.Fields#incompleteForms
     */
    public Forms setIncompleteForms(
        @Nullable
        FormAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncompleteForms(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field incompleteForms of com.linkedin.common.Forms");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incompleteForms", value.data());
                    _incompleteFormsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncompleteForms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incompleteForms", value.data());
                    _incompleteFormsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "incompleteForms", value.data());
                    _incompleteFormsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for incompleteForms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Forms.Fields#incompleteForms
     */
    public Forms setIncompleteForms(
        @Nonnull
        FormAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field incompleteForms of com.linkedin.common.Forms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "incompleteForms", value.data());
            _incompleteFormsField = value;
        }
        return this;
    }

    /**
     * Existence checker for completedForms
     * 
     * @see Forms.Fields#completedForms
     */
    public boolean hasCompletedForms() {
        if (_completedFormsField!= null) {
            return true;
        }
        return super._map.containsKey("completedForms");
    }

    /**
     * Remover for completedForms
     * 
     * @see Forms.Fields#completedForms
     */
    public void removeCompletedForms() {
        super._map.remove("completedForms");
    }

    /**
     * Getter for completedForms
     * 
     * @see Forms.Fields#completedForms
     */
    @Nullable
    public FormAssociationArray getCompletedForms(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCompletedForms();
            case DEFAULT:
            case NULL:
                if (_completedFormsField!= null) {
                    return _completedFormsField;
                } else {
                    Object __rawValue = super._map.get("completedForms");
                    _completedFormsField = ((__rawValue == null)?null:new FormAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _completedFormsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for completedForms
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Forms.Fields#completedForms
     */
    @Nonnull
    public FormAssociationArray getCompletedForms() {
        if (_completedFormsField!= null) {
            return _completedFormsField;
        } else {
            Object __rawValue = super._map.get("completedForms");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("completedForms");
            }
            _completedFormsField = ((__rawValue == null)?null:new FormAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _completedFormsField;
        }
    }

    /**
     * Setter for completedForms
     * 
     * @see Forms.Fields#completedForms
     */
    public Forms setCompletedForms(
        @Nullable
        FormAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCompletedForms(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field completedForms of com.linkedin.common.Forms");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "completedForms", value.data());
                    _completedFormsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCompletedForms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "completedForms", value.data());
                    _completedFormsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "completedForms", value.data());
                    _completedFormsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for completedForms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Forms.Fields#completedForms
     */
    public Forms setCompletedForms(
        @Nonnull
        FormAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field completedForms of com.linkedin.common.Forms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "completedForms", value.data());
            _completedFormsField = value;
        }
        return this;
    }

    /**
     * Existence checker for verifications
     * 
     * @see Forms.Fields#verifications
     */
    public boolean hasVerifications() {
        if (_verificationsField!= null) {
            return true;
        }
        return super._map.containsKey("verifications");
    }

    /**
     * Remover for verifications
     * 
     * @see Forms.Fields#verifications
     */
    public void removeVerifications() {
        super._map.remove("verifications");
    }

    /**
     * Getter for verifications
     * 
     * @see Forms.Fields#verifications
     */
    @Nullable
    public FormVerificationAssociationArray getVerifications(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getVerifications();
            case NULL:
                if (_verificationsField!= null) {
                    return _verificationsField;
                } else {
                    Object __rawValue = super._map.get("verifications");
                    _verificationsField = ((__rawValue == null)?null:new FormVerificationAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _verificationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for verifications
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Forms.Fields#verifications
     */
    @Nonnull
    public FormVerificationAssociationArray getVerifications() {
        if (_verificationsField!= null) {
            return _verificationsField;
        } else {
            Object __rawValue = super._map.get("verifications");
            if (__rawValue == null) {
                return DEFAULT_Verifications;
            }
            _verificationsField = ((__rawValue == null)?null:new FormVerificationAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _verificationsField;
        }
    }

    /**
     * Setter for verifications
     * 
     * @see Forms.Fields#verifications
     */
    public Forms setVerifications(
        @Nullable
        FormVerificationAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVerifications(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field verifications of com.linkedin.common.Forms");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "verifications", value.data());
                    _verificationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVerifications();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "verifications", value.data());
                    _verificationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "verifications", value.data());
                    _verificationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for verifications
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Forms.Fields#verifications
     */
    public Forms setVerifications(
        @Nonnull
        FormVerificationAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field verifications of com.linkedin.common.Forms to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "verifications", value.data());
            _verificationsField = value;
        }
        return this;
    }

    @Override
    public Forms clone()
        throws CloneNotSupportedException
    {
        Forms __clone = ((Forms) super.clone());
        __clone.__changeListener = new Forms.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Forms copy()
        throws CloneNotSupportedException
    {
        Forms __copy = ((Forms) super.copy());
        __copy._completedFormsField = null;
        __copy._verificationsField = null;
        __copy._incompleteFormsField = null;
        __copy.__changeListener = new Forms.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Forms __objectRef;

        private ChangeListener(Forms reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "completedForms":
                    __objectRef._completedFormsField = null;
                    break;
                case "verifications":
                    __objectRef._verificationsField = null;
                    break;
                case "incompleteForms":
                    __objectRef._incompleteFormsField = null;
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
         * All incomplete forms assigned to the entity.
         * 
         */
        public com.linkedin.common.FormAssociationArray.Fields incompleteForms() {
            return new com.linkedin.common.FormAssociationArray.Fields(getPathComponents(), "incompleteForms");
        }

        /**
         * All incomplete forms assigned to the entity.
         * 
         */
        public PathSpec incompleteForms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "incompleteForms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * All complete forms assigned to the entity.
         * 
         */
        public com.linkedin.common.FormAssociationArray.Fields completedForms() {
            return new com.linkedin.common.FormAssociationArray.Fields(getPathComponents(), "completedForms");
        }

        /**
         * All complete forms assigned to the entity.
         * 
         */
        public PathSpec completedForms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "completedForms");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         * 
         */
        public com.linkedin.common.FormVerificationAssociationArray.Fields verifications() {
            return new com.linkedin.common.FormVerificationAssociationArray.Fields(getPathComponents(), "verifications");
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         * 
         */
        public PathSpec verifications(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "verifications");
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

        private com.linkedin.common.FormAssociationArray.ProjectionMask _incompleteFormsMask;
        private com.linkedin.common.FormAssociationArray.ProjectionMask _completedFormsMask;
        private com.linkedin.common.FormVerificationAssociationArray.ProjectionMask _verificationsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * All incomplete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withIncompleteForms(Function<com.linkedin.common.FormAssociationArray.ProjectionMask, com.linkedin.common.FormAssociationArray.ProjectionMask> nestedMask) {
            _incompleteFormsMask = nestedMask.apply(((_incompleteFormsMask == null)?FormAssociationArray.createMask():_incompleteFormsMask));
            getDataMap().put("incompleteForms", _incompleteFormsMask.getDataMap());
            return this;
        }

        /**
         * All incomplete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withIncompleteForms() {
            _incompleteFormsMask = null;
            getDataMap().put("incompleteForms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * All incomplete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withIncompleteForms(Function<com.linkedin.common.FormAssociationArray.ProjectionMask, com.linkedin.common.FormAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _incompleteFormsMask = nestedMask.apply(((_incompleteFormsMask == null)?FormAssociationArray.createMask():_incompleteFormsMask));
            getDataMap().put("incompleteForms", _incompleteFormsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("incompleteForms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("incompleteForms").put("$count", count);
            }
            return this;
        }

        /**
         * All incomplete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withIncompleteForms(Integer start, Integer count) {
            _incompleteFormsMask = null;
            getDataMap().put("incompleteForms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("incompleteForms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("incompleteForms").put("$count", count);
            }
            return this;
        }

        /**
         * All complete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withCompletedForms(Function<com.linkedin.common.FormAssociationArray.ProjectionMask, com.linkedin.common.FormAssociationArray.ProjectionMask> nestedMask) {
            _completedFormsMask = nestedMask.apply(((_completedFormsMask == null)?FormAssociationArray.createMask():_completedFormsMask));
            getDataMap().put("completedForms", _completedFormsMask.getDataMap());
            return this;
        }

        /**
         * All complete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withCompletedForms() {
            _completedFormsMask = null;
            getDataMap().put("completedForms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * All complete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withCompletedForms(Function<com.linkedin.common.FormAssociationArray.ProjectionMask, com.linkedin.common.FormAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _completedFormsMask = nestedMask.apply(((_completedFormsMask == null)?FormAssociationArray.createMask():_completedFormsMask));
            getDataMap().put("completedForms", _completedFormsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("completedForms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("completedForms").put("$count", count);
            }
            return this;
        }

        /**
         * All complete forms assigned to the entity.
         * 
         */
        public Forms.ProjectionMask withCompletedForms(Integer start, Integer count) {
            _completedFormsMask = null;
            getDataMap().put("completedForms", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("completedForms").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("completedForms").put("$count", count);
            }
            return this;
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         * 
         */
        public Forms.ProjectionMask withVerifications(Function<com.linkedin.common.FormVerificationAssociationArray.ProjectionMask, com.linkedin.common.FormVerificationAssociationArray.ProjectionMask> nestedMask) {
            _verificationsMask = nestedMask.apply(((_verificationsMask == null)?FormVerificationAssociationArray.createMask():_verificationsMask));
            getDataMap().put("verifications", _verificationsMask.getDataMap());
            return this;
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         * 
         */
        public Forms.ProjectionMask withVerifications() {
            _verificationsMask = null;
            getDataMap().put("verifications", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         * 
         */
        public Forms.ProjectionMask withVerifications(Function<com.linkedin.common.FormVerificationAssociationArray.ProjectionMask, com.linkedin.common.FormVerificationAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _verificationsMask = nestedMask.apply(((_verificationsMask == null)?FormVerificationAssociationArray.createMask():_verificationsMask));
            getDataMap().put("verifications", _verificationsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("verifications").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("verifications").put("$count", count);
            }
            return this;
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         * 
         */
        public Forms.ProjectionMask withVerifications(Integer start, Integer count) {
            _verificationsMask = null;
            getDataMap().put("verifications", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("verifications").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("verifications").put("$count", count);
            }
            return this;
        }

    }

}
