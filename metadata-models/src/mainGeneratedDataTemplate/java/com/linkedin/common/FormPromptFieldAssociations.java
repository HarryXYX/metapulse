
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
import com.linkedin.data.template.SetMode;


/**
 * Information about the field-level prompt associations on a top-level prompt association.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/FormPromptFieldAssociations.pdl.")
public class FormPromptFieldAssociations
    extends RecordTemplate
{

    private final static FormPromptFieldAssociations.Fields _fields = new FormPromptFieldAssociations.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information about the field-level prompt associations on a top-level prompt association.*/record FormPromptFieldAssociations{/**A list of field-level prompt associations that are not yet complete for this form.*/completedFieldPrompts:optional array[/**Information about the status of a particular prompt for a specific schema field\non an entity.*/record FieldFormPromptAssociation{/**The field path on a schema field.*/fieldPath:string/**The last time this prompt was touched for the field on the entity (set, unset)*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}]/**A list of field-level prompt associations that are complete for this form.*/incompleteFieldPrompts:optional array[FieldFormPromptAssociation]}", SchemaFormatType.PDL));
    private FieldFormPromptAssociationArray _completedFieldPromptsField = null;
    private FieldFormPromptAssociationArray _incompleteFieldPromptsField = null;
    private FormPromptFieldAssociations.ChangeListener __changeListener = new FormPromptFieldAssociations.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CompletedFieldPrompts = SCHEMA.getField("completedFieldPrompts");
    private final static RecordDataSchema.Field FIELD_IncompleteFieldPrompts = SCHEMA.getField("incompleteFieldPrompts");

    public FormPromptFieldAssociations() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FormPromptFieldAssociations(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormPromptFieldAssociations.Fields fields() {
        return _fields;
    }

    public static FormPromptFieldAssociations.ProjectionMask createMask() {
        return new FormPromptFieldAssociations.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for completedFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#completedFieldPrompts
     */
    public boolean hasCompletedFieldPrompts() {
        if (_completedFieldPromptsField!= null) {
            return true;
        }
        return super._map.containsKey("completedFieldPrompts");
    }

    /**
     * Remover for completedFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#completedFieldPrompts
     */
    public void removeCompletedFieldPrompts() {
        super._map.remove("completedFieldPrompts");
    }

    /**
     * Getter for completedFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#completedFieldPrompts
     */
    @Nullable
    public FieldFormPromptAssociationArray getCompletedFieldPrompts(GetMode mode) {
        return getCompletedFieldPrompts();
    }

    /**
     * Getter for completedFieldPrompts
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormPromptFieldAssociations.Fields#completedFieldPrompts
     */
    @Nullable
    public FieldFormPromptAssociationArray getCompletedFieldPrompts() {
        if (_completedFieldPromptsField!= null) {
            return _completedFieldPromptsField;
        } else {
            Object __rawValue = super._map.get("completedFieldPrompts");
            _completedFieldPromptsField = ((__rawValue == null)?null:new FieldFormPromptAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _completedFieldPromptsField;
        }
    }

    /**
     * Setter for completedFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#completedFieldPrompts
     */
    public FormPromptFieldAssociations setCompletedFieldPrompts(
        @Nullable
        FieldFormPromptAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCompletedFieldPrompts(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCompletedFieldPrompts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "completedFieldPrompts", value.data());
                    _completedFieldPromptsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "completedFieldPrompts", value.data());
                    _completedFieldPromptsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for completedFieldPrompts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPromptFieldAssociations.Fields#completedFieldPrompts
     */
    public FormPromptFieldAssociations setCompletedFieldPrompts(
        @Nonnull
        FieldFormPromptAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field completedFieldPrompts of com.linkedin.common.FormPromptFieldAssociations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "completedFieldPrompts", value.data());
            _completedFieldPromptsField = value;
        }
        return this;
    }

    /**
     * Existence checker for incompleteFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#incompleteFieldPrompts
     */
    public boolean hasIncompleteFieldPrompts() {
        if (_incompleteFieldPromptsField!= null) {
            return true;
        }
        return super._map.containsKey("incompleteFieldPrompts");
    }

    /**
     * Remover for incompleteFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#incompleteFieldPrompts
     */
    public void removeIncompleteFieldPrompts() {
        super._map.remove("incompleteFieldPrompts");
    }

    /**
     * Getter for incompleteFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#incompleteFieldPrompts
     */
    @Nullable
    public FieldFormPromptAssociationArray getIncompleteFieldPrompts(GetMode mode) {
        return getIncompleteFieldPrompts();
    }

    /**
     * Getter for incompleteFieldPrompts
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormPromptFieldAssociations.Fields#incompleteFieldPrompts
     */
    @Nullable
    public FieldFormPromptAssociationArray getIncompleteFieldPrompts() {
        if (_incompleteFieldPromptsField!= null) {
            return _incompleteFieldPromptsField;
        } else {
            Object __rawValue = super._map.get("incompleteFieldPrompts");
            _incompleteFieldPromptsField = ((__rawValue == null)?null:new FieldFormPromptAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _incompleteFieldPromptsField;
        }
    }

    /**
     * Setter for incompleteFieldPrompts
     * 
     * @see FormPromptFieldAssociations.Fields#incompleteFieldPrompts
     */
    public FormPromptFieldAssociations setIncompleteFieldPrompts(
        @Nullable
        FieldFormPromptAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncompleteFieldPrompts(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncompleteFieldPrompts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incompleteFieldPrompts", value.data());
                    _incompleteFieldPromptsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "incompleteFieldPrompts", value.data());
                    _incompleteFieldPromptsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for incompleteFieldPrompts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPromptFieldAssociations.Fields#incompleteFieldPrompts
     */
    public FormPromptFieldAssociations setIncompleteFieldPrompts(
        @Nonnull
        FieldFormPromptAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field incompleteFieldPrompts of com.linkedin.common.FormPromptFieldAssociations to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "incompleteFieldPrompts", value.data());
            _incompleteFieldPromptsField = value;
        }
        return this;
    }

    @Override
    public FormPromptFieldAssociations clone()
        throws CloneNotSupportedException
    {
        FormPromptFieldAssociations __clone = ((FormPromptFieldAssociations) super.clone());
        __clone.__changeListener = new FormPromptFieldAssociations.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormPromptFieldAssociations copy()
        throws CloneNotSupportedException
    {
        FormPromptFieldAssociations __copy = ((FormPromptFieldAssociations) super.copy());
        __copy._completedFieldPromptsField = null;
        __copy._incompleteFieldPromptsField = null;
        __copy.__changeListener = new FormPromptFieldAssociations.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormPromptFieldAssociations __objectRef;

        private ChangeListener(FormPromptFieldAssociations reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "completedFieldPrompts":
                    __objectRef._completedFieldPromptsField = null;
                    break;
                case "incompleteFieldPrompts":
                    __objectRef._incompleteFieldPromptsField = null;
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
         * A list of field-level prompt associations that are not yet complete for this form.
         * 
         */
        public com.linkedin.common.FieldFormPromptAssociationArray.Fields completedFieldPrompts() {
            return new com.linkedin.common.FieldFormPromptAssociationArray.Fields(getPathComponents(), "completedFieldPrompts");
        }

        /**
         * A list of field-level prompt associations that are not yet complete for this form.
         * 
         */
        public PathSpec completedFieldPrompts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "completedFieldPrompts");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A list of field-level prompt associations that are complete for this form.
         * 
         */
        public com.linkedin.common.FieldFormPromptAssociationArray.Fields incompleteFieldPrompts() {
            return new com.linkedin.common.FieldFormPromptAssociationArray.Fields(getPathComponents(), "incompleteFieldPrompts");
        }

        /**
         * A list of field-level prompt associations that are complete for this form.
         * 
         */
        public PathSpec incompleteFieldPrompts(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "incompleteFieldPrompts");
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

        private com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask _completedFieldPromptsMask;
        private com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask _incompleteFieldPromptsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * A list of field-level prompt associations that are not yet complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withCompletedFieldPrompts(Function<com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask, com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask> nestedMask) {
            _completedFieldPromptsMask = nestedMask.apply(((_completedFieldPromptsMask == null)?FieldFormPromptAssociationArray.createMask():_completedFieldPromptsMask));
            getDataMap().put("completedFieldPrompts", _completedFieldPromptsMask.getDataMap());
            return this;
        }

        /**
         * A list of field-level prompt associations that are not yet complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withCompletedFieldPrompts() {
            _completedFieldPromptsMask = null;
            getDataMap().put("completedFieldPrompts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of field-level prompt associations that are not yet complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withCompletedFieldPrompts(Function<com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask, com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _completedFieldPromptsMask = nestedMask.apply(((_completedFieldPromptsMask == null)?FieldFormPromptAssociationArray.createMask():_completedFieldPromptsMask));
            getDataMap().put("completedFieldPrompts", _completedFieldPromptsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("completedFieldPrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("completedFieldPrompts").put("$count", count);
            }
            return this;
        }

        /**
         * A list of field-level prompt associations that are not yet complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withCompletedFieldPrompts(Integer start, Integer count) {
            _completedFieldPromptsMask = null;
            getDataMap().put("completedFieldPrompts", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("completedFieldPrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("completedFieldPrompts").put("$count", count);
            }
            return this;
        }

        /**
         * A list of field-level prompt associations that are complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withIncompleteFieldPrompts(Function<com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask, com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask> nestedMask) {
            _incompleteFieldPromptsMask = nestedMask.apply(((_incompleteFieldPromptsMask == null)?FieldFormPromptAssociationArray.createMask():_incompleteFieldPromptsMask));
            getDataMap().put("incompleteFieldPrompts", _incompleteFieldPromptsMask.getDataMap());
            return this;
        }

        /**
         * A list of field-level prompt associations that are complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withIncompleteFieldPrompts() {
            _incompleteFieldPromptsMask = null;
            getDataMap().put("incompleteFieldPrompts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of field-level prompt associations that are complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withIncompleteFieldPrompts(Function<com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask, com.linkedin.common.FieldFormPromptAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _incompleteFieldPromptsMask = nestedMask.apply(((_incompleteFieldPromptsMask == null)?FieldFormPromptAssociationArray.createMask():_incompleteFieldPromptsMask));
            getDataMap().put("incompleteFieldPrompts", _incompleteFieldPromptsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("incompleteFieldPrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("incompleteFieldPrompts").put("$count", count);
            }
            return this;
        }

        /**
         * A list of field-level prompt associations that are complete for this form.
         * 
         */
        public FormPromptFieldAssociations.ProjectionMask withIncompleteFieldPrompts(Integer start, Integer count) {
            _incompleteFieldPromptsMask = null;
            getDataMap().put("incompleteFieldPrompts", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("incompleteFieldPrompts").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("incompleteFieldPrompts").put("$count", count);
            }
            return this;
        }

    }

}
