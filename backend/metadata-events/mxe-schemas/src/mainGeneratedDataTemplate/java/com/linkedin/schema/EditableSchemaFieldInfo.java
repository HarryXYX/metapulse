
package com.linkedin.schema;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.GlobalTags;
import com.linkedin.common.GlossaryTerms;
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
 * SchemaField to describe metadata related to dataset schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/EditableSchemaFieldInfo.pdl.")
public class EditableSchemaFieldInfo
    extends RecordTemplate
{

    private final static EditableSchemaFieldInfo.Fields _fields = new EditableSchemaFieldInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}", SchemaFormatType.PDL));
    private String _fieldPathField = null;
    private String _descriptionField = null;
    private GlobalTags _globalTagsField = null;
    private GlossaryTerms _glossaryTermsField = null;
    private EditableSchemaFieldInfo.ChangeListener __changeListener = new EditableSchemaFieldInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_GlobalTags = SCHEMA.getField("globalTags");
    private final static RecordDataSchema.Field FIELD_GlossaryTerms = SCHEMA.getField("glossaryTerms");

    public EditableSchemaFieldInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public EditableSchemaFieldInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EditableSchemaFieldInfo.Fields fields() {
        return _fields;
    }

    public static EditableSchemaFieldInfo.ProjectionMask createMask() {
        return new EditableSchemaFieldInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        if (_fieldPathField!= null) {
            return true;
        }
        return super._map.containsKey("fieldPath");
    }

    /**
     * Remover for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    @Nullable
    public String getFieldPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldPath();
            case DEFAULT:
            case NULL:
                if (_fieldPathField!= null) {
                    return _fieldPathField;
                } else {
                    Object __rawValue = super._map.get("fieldPath");
                    _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldPathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        if (_fieldPathField!= null) {
            return _fieldPathField;
        } else {
            Object __rawValue = super._map.get("fieldPath");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldPath");
            }
            _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldPathField;
        }
    }

    /**
     * Setter for fieldPath
     * 
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public EditableSchemaFieldInfo setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.schema.EditableSchemaFieldInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#fieldPath
     */
    public EditableSchemaFieldInfo setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.schema.EditableSchemaFieldInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableSchemaFieldInfo.Fields#description
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
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see EditableSchemaFieldInfo.Fields#description
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
     * @see EditableSchemaFieldInfo.Fields#description
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
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public EditableSchemaFieldInfo setDescription(
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
     * @see EditableSchemaFieldInfo.Fields#description
     */
    public EditableSchemaFieldInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.schema.EditableSchemaFieldInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public boolean hasGlobalTags() {
        if (_globalTagsField!= null) {
            return true;
        }
        return super._map.containsKey("globalTags");
    }

    /**
     * Remover for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public void removeGlobalTags() {
        super._map.remove("globalTags");
    }

    /**
     * Getter for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    @Nullable
    public GlobalTags getGlobalTags(GetMode mode) {
        return getGlobalTags();
    }

    /**
     * Getter for globalTags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    @Nullable
    public GlobalTags getGlobalTags() {
        if (_globalTagsField!= null) {
            return _globalTagsField;
        } else {
            Object __rawValue = super._map.get("globalTags");
            _globalTagsField = ((__rawValue == null)?null:new GlobalTags(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _globalTagsField;
        }
    }

    /**
     * Setter for globalTags
     * 
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public EditableSchemaFieldInfo setGlobalTags(
        @Nullable
        GlobalTags value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGlobalTags(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGlobalTags();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "globalTags", value.data());
                    _globalTagsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "globalTags", value.data());
                    _globalTagsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for globalTags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#globalTags
     */
    public EditableSchemaFieldInfo setGlobalTags(
        @Nonnull
        GlobalTags value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field globalTags of com.linkedin.schema.EditableSchemaFieldInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "globalTags", value.data());
            _globalTagsField = value;
        }
        return this;
    }

    /**
     * Existence checker for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public boolean hasGlossaryTerms() {
        if (_glossaryTermsField!= null) {
            return true;
        }
        return super._map.containsKey("glossaryTerms");
    }

    /**
     * Remover for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public void removeGlossaryTerms() {
        super._map.remove("glossaryTerms");
    }

    /**
     * Getter for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    @Nullable
    public GlossaryTerms getGlossaryTerms(GetMode mode) {
        return getGlossaryTerms();
    }

    /**
     * Getter for glossaryTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    @Nullable
    public GlossaryTerms getGlossaryTerms() {
        if (_glossaryTermsField!= null) {
            return _glossaryTermsField;
        } else {
            Object __rawValue = super._map.get("glossaryTerms");
            _glossaryTermsField = ((__rawValue == null)?null:new GlossaryTerms(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _glossaryTermsField;
        }
    }

    /**
     * Setter for glossaryTerms
     * 
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public EditableSchemaFieldInfo setGlossaryTerms(
        @Nullable
        GlossaryTerms value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGlossaryTerms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGlossaryTerms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "glossaryTerms", value.data());
                    _glossaryTermsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "glossaryTerms", value.data());
                    _glossaryTermsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for glossaryTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableSchemaFieldInfo.Fields#glossaryTerms
     */
    public EditableSchemaFieldInfo setGlossaryTerms(
        @Nonnull
        GlossaryTerms value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field glossaryTerms of com.linkedin.schema.EditableSchemaFieldInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "glossaryTerms", value.data());
            _glossaryTermsField = value;
        }
        return this;
    }

    @Override
    public EditableSchemaFieldInfo clone()
        throws CloneNotSupportedException
    {
        EditableSchemaFieldInfo __clone = ((EditableSchemaFieldInfo) super.clone());
        __clone.__changeListener = new EditableSchemaFieldInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EditableSchemaFieldInfo copy()
        throws CloneNotSupportedException
    {
        EditableSchemaFieldInfo __copy = ((EditableSchemaFieldInfo) super.copy());
        __copy._fieldPathField = null;
        __copy._descriptionField = null;
        __copy._glossaryTermsField = null;
        __copy._globalTagsField = null;
        __copy.__changeListener = new EditableSchemaFieldInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EditableSchemaFieldInfo __objectRef;

        private ChangeListener(EditableSchemaFieldInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "fieldPath":
                    __objectRef._fieldPathField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "glossaryTerms":
                    __objectRef._glossaryTermsField = null;
                    break;
                case "globalTags":
                    __objectRef._globalTagsField = null;
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
         * FieldPath uniquely identifying the SchemaField this metadata is associated with
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Description
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Tags associated with the field
         * 
         */
        public com.linkedin.common.GlobalTags.Fields globalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "globalTags");
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public com.linkedin.common.GlossaryTerms.Fields glossaryTerms() {
            return new com.linkedin.common.GlossaryTerms.Fields(getPathComponents(), "glossaryTerms");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.GlobalTags.ProjectionMask _globalTagsMask;
        private com.linkedin.common.GlossaryTerms.ProjectionMask _glossaryTermsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * FieldPath uniquely identifying the SchemaField this metadata is associated with
         * 
         */
        public EditableSchemaFieldInfo.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description
         * 
         */
        public EditableSchemaFieldInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Tags associated with the field
         * 
         */
        public EditableSchemaFieldInfo.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _globalTagsMask = nestedMask.apply(((_globalTagsMask == null)?GlobalTags.createMask():_globalTagsMask));
            getDataMap().put("globalTags", _globalTagsMask.getDataMap());
            return this;
        }

        /**
         * Tags associated with the field
         * 
         */
        public EditableSchemaFieldInfo.ProjectionMask withGlobalTags() {
            _globalTagsMask = null;
            getDataMap().put("globalTags", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public EditableSchemaFieldInfo.ProjectionMask withGlossaryTerms(Function<com.linkedin.common.GlossaryTerms.ProjectionMask, com.linkedin.common.GlossaryTerms.ProjectionMask> nestedMask) {
            _glossaryTermsMask = nestedMask.apply(((_glossaryTermsMask == null)?GlossaryTerms.createMask():_glossaryTermsMask));
            getDataMap().put("glossaryTerms", _glossaryTermsMask.getDataMap());
            return this;
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public EditableSchemaFieldInfo.ProjectionMask withGlossaryTerms() {
            _glossaryTermsMask = null;
            getDataMap().put("glossaryTerms", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
