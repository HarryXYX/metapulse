
package com.linkedin.dataset;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * EditableDatasetProperties stores editable changes made to dataset properties. This separates changes made from
 * ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/EditableDatasetProperties.pdl.")
public class EditableDatasetProperties
    extends RecordTemplate
{

    private final static EditableDatasetProperties.Fields _fields = new EditableDatasetProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**EditableDatasetProperties stores editable changes made to dataset properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableDatasetProperties\"record EditableDatasetProperties includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Documentation of the dataset*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Editable display name of the Dataset*/@Searchable={\"fieldName\":\"editedName\",\"fieldType\":\"TEXT_PARTIAL\"}name:optional string}", SchemaFormatType.PDL));
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private AuditStamp _deletedField = null;
    private String _descriptionField = null;
    private String _nameField = null;
    private EditableDatasetProperties.ChangeListener __changeListener = new EditableDatasetProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static AuditStamp DEFAULT_Created;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static AuditStamp DEFAULT_LastModified;
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    static {
        DEFAULT_Created = ((FIELD_Created.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_Created.getDefault(), DataMap.class)));
        DEFAULT_LastModified = ((FIELD_LastModified.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_LastModified.getDefault(), DataMap.class)));
    }

    public EditableDatasetProperties() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public EditableDatasetProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EditableDatasetProperties.Fields fields() {
        return _fields;
    }

    public static EditableDatasetProperties.ProjectionMask createMask() {
        return new EditableDatasetProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for created
     * 
     * @see EditableDatasetProperties.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see EditableDatasetProperties.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see EditableDatasetProperties.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCreated();
            case NULL:
                if (_createdField!= null) {
                    return _createdField;
                } else {
                    Object __rawValue = super._map.get("created");
                    _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableDatasetProperties.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            if (__rawValue == null) {
                return DEFAULT_Created;
            }
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see EditableDatasetProperties.Fields#created
     */
    public EditableDatasetProperties setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.dataset.EditableDatasetProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableDatasetProperties.Fields#created
     */
    public EditableDatasetProperties setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.dataset.EditableDatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see EditableDatasetProperties.Fields#lastModified
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
     * @see EditableDatasetProperties.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see EditableDatasetProperties.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getLastModified();
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
     * @see EditableDatasetProperties.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                return DEFAULT_LastModified;
            }
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see EditableDatasetProperties.Fields#lastModified
     */
    public EditableDatasetProperties setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.dataset.EditableDatasetProperties");
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
     * @see EditableDatasetProperties.Fields#lastModified
     */
    public EditableDatasetProperties setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.dataset.EditableDatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see EditableDatasetProperties.Fields#deleted
     */
    public boolean hasDeleted() {
        if (_deletedField!= null) {
            return true;
        }
        return super._map.containsKey("deleted");
    }

    /**
     * Remover for deleted
     * 
     * @see EditableDatasetProperties.Fields#deleted
     */
    public void removeDeleted() {
        super._map.remove("deleted");
    }

    /**
     * Getter for deleted
     * 
     * @see EditableDatasetProperties.Fields#deleted
     */
    @Nullable
    public AuditStamp getDeleted(GetMode mode) {
        return getDeleted();
    }

    /**
     * Getter for deleted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableDatasetProperties.Fields#deleted
     */
    @Nullable
    public AuditStamp getDeleted() {
        if (_deletedField!= null) {
            return _deletedField;
        } else {
            Object __rawValue = super._map.get("deleted");
            _deletedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _deletedField;
        }
    }

    /**
     * Setter for deleted
     * 
     * @see EditableDatasetProperties.Fields#deleted
     */
    public EditableDatasetProperties setDeleted(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDeleted(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDeleted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "deleted", value.data());
                    _deletedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "deleted", value.data());
                    _deletedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for deleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableDatasetProperties.Fields#deleted
     */
    public EditableDatasetProperties setDeleted(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deleted of com.linkedin.dataset.EditableDatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deleted", value.data());
            _deletedField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableDatasetProperties.Fields#description
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
     * @see EditableDatasetProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see EditableDatasetProperties.Fields#description
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
     * @see EditableDatasetProperties.Fields#description
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
     * @see EditableDatasetProperties.Fields#description
     */
    public EditableDatasetProperties setDescription(
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
     * @see EditableDatasetProperties.Fields#description
     */
    public EditableDatasetProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.dataset.EditableDatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see EditableDatasetProperties.Fields#name
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
     * @see EditableDatasetProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see EditableDatasetProperties.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        return getName();
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableDatasetProperties.Fields#name
     */
    @Nullable
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see EditableDatasetProperties.Fields#name
     */
    public EditableDatasetProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see EditableDatasetProperties.Fields#name
     */
    public EditableDatasetProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.dataset.EditableDatasetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    @Override
    public EditableDatasetProperties clone()
        throws CloneNotSupportedException
    {
        EditableDatasetProperties __clone = ((EditableDatasetProperties) super.clone());
        __clone.__changeListener = new EditableDatasetProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EditableDatasetProperties copy()
        throws CloneNotSupportedException
    {
        EditableDatasetProperties __copy = ((EditableDatasetProperties) super.copy());
        __copy._deletedField = null;
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new EditableDatasetProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EditableDatasetProperties __objectRef;

        private ChangeListener(EditableDatasetProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "deleted":
                    __objectRef._deletedField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
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
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields deleted() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "deleted");
        }

        /**
         * Documentation of the dataset
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Editable display name of the Dataset
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _deletedMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withDeleted(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _deletedMask = nestedMask.apply(((_deletedMask == null)?AuditStamp.createMask():_deletedMask));
            getDataMap().put("deleted", _deletedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withDeleted(MaskMap nestedMask) {
            getDataMap().put("deleted", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public EditableDatasetProperties.ProjectionMask withDeleted() {
            _deletedMask = null;
            getDataMap().put("deleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the dataset
         * 
         */
        public EditableDatasetProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Editable display name of the Dataset
         * 
         */
        public EditableDatasetProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
