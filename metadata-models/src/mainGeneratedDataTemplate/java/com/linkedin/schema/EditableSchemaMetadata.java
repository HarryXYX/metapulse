
package com.linkedin.schema;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from
 * ingestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/EditableSchemaMetadata.pdl.")
public class EditableSchemaMetadata
    extends RecordTemplate
{

    private final static EditableSchemaMetadata.Fields _fields = new EditableSchemaMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}}]}", SchemaFormatType.PDL));
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private AuditStamp _deletedField = null;
    private EditableSchemaFieldInfoArray _editableSchemaFieldInfoField = null;
    private EditableSchemaMetadata.ChangeListener __changeListener = new EditableSchemaMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static AuditStamp DEFAULT_Created;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static AuditStamp DEFAULT_LastModified;
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_EditableSchemaFieldInfo = SCHEMA.getField("editableSchemaFieldInfo");

    static {
        DEFAULT_Created = ((FIELD_Created.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_Created.getDefault(), DataMap.class)));
        DEFAULT_LastModified = ((FIELD_LastModified.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_LastModified.getDefault(), DataMap.class)));
    }

    public EditableSchemaMetadata() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public EditableSchemaMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EditableSchemaMetadata.Fields fields() {
        return _fields;
    }

    public static EditableSchemaMetadata.ProjectionMask createMask() {
        return new EditableSchemaMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for created
     * 
     * @see EditableSchemaMetadata.Fields#created
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
     * @see EditableSchemaMetadata.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see EditableSchemaMetadata.Fields#created
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
     * @see EditableSchemaMetadata.Fields#created
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
     * @see EditableSchemaMetadata.Fields#created
     */
    public EditableSchemaMetadata setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.schema.EditableSchemaMetadata");
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
     * @see EditableSchemaMetadata.Fields#created
     */
    public EditableSchemaMetadata setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.schema.EditableSchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see EditableSchemaMetadata.Fields#lastModified
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
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see EditableSchemaMetadata.Fields#lastModified
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
     * @see EditableSchemaMetadata.Fields#lastModified
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
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public EditableSchemaMetadata setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.schema.EditableSchemaMetadata");
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
     * @see EditableSchemaMetadata.Fields#lastModified
     */
    public EditableSchemaMetadata setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.schema.EditableSchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see EditableSchemaMetadata.Fields#deleted
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
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public void removeDeleted() {
        super._map.remove("deleted");
    }

    /**
     * Getter for deleted
     * 
     * @see EditableSchemaMetadata.Fields#deleted
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
     * @see EditableSchemaMetadata.Fields#deleted
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
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public EditableSchemaMetadata setDeleted(
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
     * @see EditableSchemaMetadata.Fields#deleted
     */
    public EditableSchemaMetadata setDeleted(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deleted of com.linkedin.schema.EditableSchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deleted", value.data());
            _deletedField = value;
        }
        return this;
    }

    /**
     * Existence checker for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public boolean hasEditableSchemaFieldInfo() {
        if (_editableSchemaFieldInfoField!= null) {
            return true;
        }
        return super._map.containsKey("editableSchemaFieldInfo");
    }

    /**
     * Remover for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public void removeEditableSchemaFieldInfo() {
        super._map.remove("editableSchemaFieldInfo");
    }

    /**
     * Getter for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    @Nullable
    public EditableSchemaFieldInfoArray getEditableSchemaFieldInfo(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEditableSchemaFieldInfo();
            case DEFAULT:
            case NULL:
                if (_editableSchemaFieldInfoField!= null) {
                    return _editableSchemaFieldInfoField;
                } else {
                    Object __rawValue = super._map.get("editableSchemaFieldInfo");
                    _editableSchemaFieldInfoField = ((__rawValue == null)?null:new EditableSchemaFieldInfoArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _editableSchemaFieldInfoField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for editableSchemaFieldInfo
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    @Nonnull
    public EditableSchemaFieldInfoArray getEditableSchemaFieldInfo() {
        if (_editableSchemaFieldInfoField!= null) {
            return _editableSchemaFieldInfoField;
        } else {
            Object __rawValue = super._map.get("editableSchemaFieldInfo");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("editableSchemaFieldInfo");
            }
            _editableSchemaFieldInfoField = ((__rawValue == null)?null:new EditableSchemaFieldInfoArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _editableSchemaFieldInfoField;
        }
    }

    /**
     * Setter for editableSchemaFieldInfo
     * 
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public EditableSchemaMetadata setEditableSchemaFieldInfo(
        @Nullable
        EditableSchemaFieldInfoArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEditableSchemaFieldInfo(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field editableSchemaFieldInfo of com.linkedin.schema.EditableSchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "editableSchemaFieldInfo", value.data());
                    _editableSchemaFieldInfoField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEditableSchemaFieldInfo();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "editableSchemaFieldInfo", value.data());
                    _editableSchemaFieldInfoField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "editableSchemaFieldInfo", value.data());
                    _editableSchemaFieldInfoField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for editableSchemaFieldInfo
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaMetadata.Fields#editableSchemaFieldInfo
     */
    public EditableSchemaMetadata setEditableSchemaFieldInfo(
        @Nonnull
        EditableSchemaFieldInfoArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field editableSchemaFieldInfo of com.linkedin.schema.EditableSchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "editableSchemaFieldInfo", value.data());
            _editableSchemaFieldInfoField = value;
        }
        return this;
    }

    @Override
    public EditableSchemaMetadata clone()
        throws CloneNotSupportedException
    {
        EditableSchemaMetadata __clone = ((EditableSchemaMetadata) super.clone());
        __clone.__changeListener = new EditableSchemaMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EditableSchemaMetadata copy()
        throws CloneNotSupportedException
    {
        EditableSchemaMetadata __copy = ((EditableSchemaMetadata) super.copy());
        __copy._editableSchemaFieldInfoField = null;
        __copy._deletedField = null;
        __copy._createdField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new EditableSchemaMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EditableSchemaMetadata __objectRef;

        private ChangeListener(EditableSchemaMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "editableSchemaFieldInfo":
                    __objectRef._editableSchemaFieldInfoField = null;
                    break;
                case "deleted":
                    __objectRef._deletedField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
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
         * Client provided a list of fields from document schema.
         * 
         */
        public com.linkedin.schema.EditableSchemaFieldInfoArray.Fields editableSchemaFieldInfo() {
            return new com.linkedin.schema.EditableSchemaFieldInfoArray.Fields(getPathComponents(), "editableSchemaFieldInfo");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public PathSpec editableSchemaFieldInfo(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "editableSchemaFieldInfo");
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

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _deletedMask;
        private com.linkedin.schema.EditableSchemaFieldInfoArray.ProjectionMask _editableSchemaFieldInfoMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withDeleted(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _deletedMask = nestedMask.apply(((_deletedMask == null)?AuditStamp.createMask():_deletedMask));
            getDataMap().put("deleted", _deletedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withDeleted(MaskMap nestedMask) {
            getDataMap().put("deleted", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withDeleted() {
            _deletedMask = null;
            getDataMap().put("deleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withEditableSchemaFieldInfo(Function<com.linkedin.schema.EditableSchemaFieldInfoArray.ProjectionMask, com.linkedin.schema.EditableSchemaFieldInfoArray.ProjectionMask> nestedMask) {
            _editableSchemaFieldInfoMask = nestedMask.apply(((_editableSchemaFieldInfoMask == null)?EditableSchemaFieldInfoArray.createMask():_editableSchemaFieldInfoMask));
            getDataMap().put("editableSchemaFieldInfo", _editableSchemaFieldInfoMask.getDataMap());
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withEditableSchemaFieldInfo() {
            _editableSchemaFieldInfoMask = null;
            getDataMap().put("editableSchemaFieldInfo", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withEditableSchemaFieldInfo(Function<com.linkedin.schema.EditableSchemaFieldInfoArray.ProjectionMask, com.linkedin.schema.EditableSchemaFieldInfoArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _editableSchemaFieldInfoMask = nestedMask.apply(((_editableSchemaFieldInfoMask == null)?EditableSchemaFieldInfoArray.createMask():_editableSchemaFieldInfoMask));
            getDataMap().put("editableSchemaFieldInfo", _editableSchemaFieldInfoMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("editableSchemaFieldInfo").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("editableSchemaFieldInfo").put("$count", count);
            }
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public EditableSchemaMetadata.ProjectionMask withEditableSchemaFieldInfo(Integer start, Integer count) {
            _editableSchemaFieldInfoMask = null;
            getDataMap().put("editableSchemaFieldInfo", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("editableSchemaFieldInfo").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("editableSchemaFieldInfo").put("$count", count);
            }
            return this;
        }

    }

}
