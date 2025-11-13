
package com.linkedin.common;

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
 * Information about the status of a particular prompt.
 * Note that this is where we can add additional information about individual responses:
 * actor, timestamp, and the response itself.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/FormPromptAssociation.pdl.")
public class FormPromptAssociation
    extends RecordTemplate
{

    private final static FormPromptAssociation.Fields _fields = new FormPromptAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information about the status of a particular prompt.\nNote that this is where we can add additional information about individual responses:\nactor, timestamp, and the response itself.*/record FormPromptAssociation{/**The id for the prompt. This must be GLOBALLY UNIQUE.*/id:string/**The last time this prompt was touched for the entity (set, unset)*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Optional information about the field-level prompt associations.*/fieldAssociations:optional/**Information about the field-level prompt associations on a top-level prompt association.*/record FormPromptFieldAssociations{/**A list of field-level prompt associations that are not yet complete for this form.*/completedFieldPrompts:optional array[/**Information about the status of a particular prompt for a specific schema field\non an entity.*/record FieldFormPromptAssociation{/**The field path on a schema field.*/fieldPath:string/**The last time this prompt was touched for the field on the entity (set, unset)*/lastModified:AuditStamp}]/**A list of field-level prompt associations that are complete for this form.*/incompleteFieldPrompts:optional array[FieldFormPromptAssociation]}}", SchemaFormatType.PDL));
    private String _idField = null;
    private AuditStamp _lastModifiedField = null;
    private FormPromptFieldAssociations _fieldAssociationsField = null;
    private FormPromptAssociation.ChangeListener __changeListener = new FormPromptAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_FieldAssociations = SCHEMA.getField("fieldAssociations");

    public FormPromptAssociation() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FormPromptAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FormPromptAssociation.Fields fields() {
        return _fields;
    }

    public static FormPromptAssociation.ProjectionMask createMask() {
        return new FormPromptAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see FormPromptAssociation.Fields#id
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
     * @see FormPromptAssociation.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see FormPromptAssociation.Fields#id
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
     * @see FormPromptAssociation.Fields#id
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
     * @see FormPromptAssociation.Fields#id
     */
    public FormPromptAssociation setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.common.FormPromptAssociation");
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
     * @see FormPromptAssociation.Fields#id
     */
    public FormPromptAssociation setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.common.FormPromptAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see FormPromptAssociation.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see FormPromptAssociation.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see FormPromptAssociation.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLastModified();
            case DEFAULT:
            case NULL:
                if (_lastModifiedField!= null) {
                    return _lastModifiedField;
                } else {
                    Object __rawValue = super._map.get("lastModified");
                    _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lastModifiedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FormPromptAssociation.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("lastModified");
            }
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see FormPromptAssociation.Fields#lastModified
     */
    public FormPromptAssociation setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.common.FormPromptAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPromptAssociation.Fields#lastModified
     */
    public FormPromptAssociation setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.common.FormPromptAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldAssociations
     * 
     * @see FormPromptAssociation.Fields#fieldAssociations
     */
    public boolean hasFieldAssociations() {
        if (_fieldAssociationsField!= null) {
            return true;
        }
        return super._map.containsKey("fieldAssociations");
    }

    /**
     * Remover for fieldAssociations
     * 
     * @see FormPromptAssociation.Fields#fieldAssociations
     */
    public void removeFieldAssociations() {
        super._map.remove("fieldAssociations");
    }

    /**
     * Getter for fieldAssociations
     * 
     * @see FormPromptAssociation.Fields#fieldAssociations
     */
    @Nullable
    public FormPromptFieldAssociations getFieldAssociations(GetMode mode) {
        return getFieldAssociations();
    }

    /**
     * Getter for fieldAssociations
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FormPromptAssociation.Fields#fieldAssociations
     */
    @Nullable
    public FormPromptFieldAssociations getFieldAssociations() {
        if (_fieldAssociationsField!= null) {
            return _fieldAssociationsField;
        } else {
            Object __rawValue = super._map.get("fieldAssociations");
            _fieldAssociationsField = ((__rawValue == null)?null:new FormPromptFieldAssociations(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fieldAssociationsField;
        }
    }

    /**
     * Setter for fieldAssociations
     * 
     * @see FormPromptAssociation.Fields#fieldAssociations
     */
    public FormPromptAssociation setFieldAssociations(
        @Nullable
        FormPromptFieldAssociations value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldAssociations(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldAssociations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldAssociations", value.data());
                    _fieldAssociationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldAssociations", value.data());
                    _fieldAssociationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldAssociations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FormPromptAssociation.Fields#fieldAssociations
     */
    public FormPromptAssociation setFieldAssociations(
        @Nonnull
        FormPromptFieldAssociations value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldAssociations of com.linkedin.common.FormPromptAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldAssociations", value.data());
            _fieldAssociationsField = value;
        }
        return this;
    }

    @Override
    public FormPromptAssociation clone()
        throws CloneNotSupportedException
    {
        FormPromptAssociation __clone = ((FormPromptAssociation) super.clone());
        __clone.__changeListener = new FormPromptAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FormPromptAssociation copy()
        throws CloneNotSupportedException
    {
        FormPromptAssociation __copy = ((FormPromptAssociation) super.copy());
        __copy._idField = null;
        __copy._lastModifiedField = null;
        __copy._fieldAssociationsField = null;
        __copy.__changeListener = new FormPromptAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FormPromptAssociation __objectRef;

        private ChangeListener(FormPromptAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "id":
                    __objectRef._idField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "fieldAssociations":
                    __objectRef._fieldAssociationsField = null;
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
         * The id for the prompt. This must be GLOBALLY UNIQUE.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * The last time this prompt was touched for the entity (set, unset)
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * Optional information about the field-level prompt associations.
         * 
         */
        public com.linkedin.common.FormPromptFieldAssociations.Fields fieldAssociations() {
            return new com.linkedin.common.FormPromptFieldAssociations.Fields(getPathComponents(), "fieldAssociations");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.FormPromptFieldAssociations.ProjectionMask _fieldAssociationsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The id for the prompt. This must be GLOBALLY UNIQUE.
         * 
         */
        public FormPromptAssociation.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The last time this prompt was touched for the entity (set, unset)
         * 
         */
        public FormPromptAssociation.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * The last time this prompt was touched for the entity (set, unset)
         * 
         */
        public FormPromptAssociation.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * The last time this prompt was touched for the entity (set, unset)
         * 
         */
        public FormPromptAssociation.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional information about the field-level prompt associations.
         * 
         */
        public FormPromptAssociation.ProjectionMask withFieldAssociations(Function<com.linkedin.common.FormPromptFieldAssociations.ProjectionMask, com.linkedin.common.FormPromptFieldAssociations.ProjectionMask> nestedMask) {
            _fieldAssociationsMask = nestedMask.apply(((_fieldAssociationsMask == null)?FormPromptFieldAssociations.createMask():_fieldAssociationsMask));
            getDataMap().put("fieldAssociations", _fieldAssociationsMask.getDataMap());
            return this;
        }

        /**
         * Optional information about the field-level prompt associations.
         * 
         */
        public FormPromptAssociation.ProjectionMask withFieldAssociations() {
            _fieldAssociationsMask = null;
            getDataMap().put("fieldAssociations", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
