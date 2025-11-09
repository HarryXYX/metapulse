
package com.linkedin.businessattribute;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
import com.linkedin.data.template.StringMap;
import com.linkedin.schema.SchemaFieldDataType;


/**
 * Properties associated with a BusinessAttribute
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/businessattribute/BusinessAttributeInfo.pdl.")
public class BusinessAttributeInfo
    extends RecordTemplate
{

    private final static BusinessAttributeInfo.Fields _fields = new BusinessAttributeInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.businessattribute/**Properties associated with a BusinessAttribute*/@Aspect.name=\"businessAttributeInfo\"record BusinessAttributeInfo includes{namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}}{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Display name of the BusinessAttribute*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string,type:optional{namespace com.linkedin.schema/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}}}", SchemaFormatType.PDL));
    private String _fieldPathField = null;
    private String _descriptionField = null;
    private GlobalTags _globalTagsField = null;
    private GlossaryTerms _glossaryTermsField = null;
    private StringMap _customPropertiesField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private AuditStamp _deletedField = null;
    private String _nameField = null;
    private SchemaFieldDataType _typeField = null;
    private BusinessAttributeInfo.ChangeListener __changeListener = new BusinessAttributeInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_GlobalTags = SCHEMA.getField("globalTags");
    private final static RecordDataSchema.Field FIELD_GlossaryTerms = SCHEMA.getField("glossaryTerms");
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static AuditStamp DEFAULT_Created;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static AuditStamp DEFAULT_LastModified;
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
        DEFAULT_Created = ((FIELD_Created.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_Created.getDefault(), DataMap.class)));
        DEFAULT_LastModified = ((FIELD_LastModified.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_LastModified.getDefault(), DataMap.class)));
    }

    public BusinessAttributeInfo() {
        super(new DataMap(14, 0.75F), SCHEMA, 10);
        addChangeListener(__changeListener);
    }

    public BusinessAttributeInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BusinessAttributeInfo.Fields fields() {
        return _fields;
    }

    public static BusinessAttributeInfo.ProjectionMask createMask() {
        return new BusinessAttributeInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see BusinessAttributeInfo.Fields#fieldPath
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
     * @see BusinessAttributeInfo.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see BusinessAttributeInfo.Fields#fieldPath
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
     * @see BusinessAttributeInfo.Fields#fieldPath
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
     * @see BusinessAttributeInfo.Fields#fieldPath
     */
    public BusinessAttributeInfo setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.businessattribute.BusinessAttributeInfo");
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
     * @see BusinessAttributeInfo.Fields#fieldPath
     */
    public BusinessAttributeInfo setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see BusinessAttributeInfo.Fields#description
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
     * @see BusinessAttributeInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see BusinessAttributeInfo.Fields#description
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
     * @see BusinessAttributeInfo.Fields#description
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
     * @see BusinessAttributeInfo.Fields#description
     */
    public BusinessAttributeInfo setDescription(
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
     * @see BusinessAttributeInfo.Fields#description
     */
    public BusinessAttributeInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for globalTags
     * 
     * @see BusinessAttributeInfo.Fields#globalTags
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
     * @see BusinessAttributeInfo.Fields#globalTags
     */
    public void removeGlobalTags() {
        super._map.remove("globalTags");
    }

    /**
     * Getter for globalTags
     * 
     * @see BusinessAttributeInfo.Fields#globalTags
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
     * @see BusinessAttributeInfo.Fields#globalTags
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
     * @see BusinessAttributeInfo.Fields#globalTags
     */
    public BusinessAttributeInfo setGlobalTags(
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
     * @see BusinessAttributeInfo.Fields#globalTags
     */
    public BusinessAttributeInfo setGlobalTags(
        @Nonnull
        GlobalTags value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field globalTags of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "globalTags", value.data());
            _globalTagsField = value;
        }
        return this;
    }

    /**
     * Existence checker for glossaryTerms
     * 
     * @see BusinessAttributeInfo.Fields#glossaryTerms
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
     * @see BusinessAttributeInfo.Fields#glossaryTerms
     */
    public void removeGlossaryTerms() {
        super._map.remove("glossaryTerms");
    }

    /**
     * Getter for glossaryTerms
     * 
     * @see BusinessAttributeInfo.Fields#glossaryTerms
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
     * @see BusinessAttributeInfo.Fields#glossaryTerms
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
     * @see BusinessAttributeInfo.Fields#glossaryTerms
     */
    public BusinessAttributeInfo setGlossaryTerms(
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
     * @see BusinessAttributeInfo.Fields#glossaryTerms
     */
    public BusinessAttributeInfo setGlossaryTerms(
        @Nonnull
        GlossaryTerms value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field glossaryTerms of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "glossaryTerms", value.data());
            _glossaryTermsField = value;
        }
        return this;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see BusinessAttributeInfo.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see BusinessAttributeInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see BusinessAttributeInfo.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BusinessAttributeInfo.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see BusinessAttributeInfo.Fields#customProperties
     */
    public BusinessAttributeInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.businessattribute.BusinessAttributeInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BusinessAttributeInfo.Fields#customProperties
     */
    public BusinessAttributeInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see BusinessAttributeInfo.Fields#created
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
     * @see BusinessAttributeInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see BusinessAttributeInfo.Fields#created
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
     * @see BusinessAttributeInfo.Fields#created
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
     * @see BusinessAttributeInfo.Fields#created
     */
    public BusinessAttributeInfo setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.businessattribute.BusinessAttributeInfo");
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
     * @see BusinessAttributeInfo.Fields#created
     */
    public BusinessAttributeInfo setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see BusinessAttributeInfo.Fields#lastModified
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
     * @see BusinessAttributeInfo.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see BusinessAttributeInfo.Fields#lastModified
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
     * @see BusinessAttributeInfo.Fields#lastModified
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
     * @see BusinessAttributeInfo.Fields#lastModified
     */
    public BusinessAttributeInfo setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.businessattribute.BusinessAttributeInfo");
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
     * @see BusinessAttributeInfo.Fields#lastModified
     */
    public BusinessAttributeInfo setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see BusinessAttributeInfo.Fields#deleted
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
     * @see BusinessAttributeInfo.Fields#deleted
     */
    public void removeDeleted() {
        super._map.remove("deleted");
    }

    /**
     * Getter for deleted
     * 
     * @see BusinessAttributeInfo.Fields#deleted
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
     * @see BusinessAttributeInfo.Fields#deleted
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
     * @see BusinessAttributeInfo.Fields#deleted
     */
    public BusinessAttributeInfo setDeleted(
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
     * @see BusinessAttributeInfo.Fields#deleted
     */
    public BusinessAttributeInfo setDeleted(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deleted of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deleted", value.data());
            _deletedField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see BusinessAttributeInfo.Fields#name
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
     * @see BusinessAttributeInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see BusinessAttributeInfo.Fields#name
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
     * @see BusinessAttributeInfo.Fields#name
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
     * @see BusinessAttributeInfo.Fields#name
     */
    public BusinessAttributeInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.businessattribute.BusinessAttributeInfo");
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
     * @see BusinessAttributeInfo.Fields#name
     */
    public BusinessAttributeInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see BusinessAttributeInfo.Fields#type
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
     * @see BusinessAttributeInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see BusinessAttributeInfo.Fields#type
     */
    @Nullable
    public SchemaFieldDataType getType(GetMode mode) {
        return getType();
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BusinessAttributeInfo.Fields#type
     */
    @Nullable
    public SchemaFieldDataType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            _typeField = ((__rawValue == null)?null:new SchemaFieldDataType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see BusinessAttributeInfo.Fields#type
     */
    public BusinessAttributeInfo setType(
        @Nullable
        SchemaFieldDataType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
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
     * @see BusinessAttributeInfo.Fields#type
     */
    public BusinessAttributeInfo setType(
        @Nonnull
        SchemaFieldDataType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.businessattribute.BusinessAttributeInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.data());
            _typeField = value;
        }
        return this;
    }

    @Override
    public BusinessAttributeInfo clone()
        throws CloneNotSupportedException
    {
        BusinessAttributeInfo __clone = ((BusinessAttributeInfo) super.clone());
        __clone.__changeListener = new BusinessAttributeInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BusinessAttributeInfo copy()
        throws CloneNotSupportedException
    {
        BusinessAttributeInfo __copy = ((BusinessAttributeInfo) super.copy());
        __copy._customPropertiesField = null;
        __copy._deletedField = null;
        __copy._createdField = null;
        __copy._fieldPathField = null;
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._glossaryTermsField = null;
        __copy._lastModifiedField = null;
        __copy._globalTagsField = null;
        __copy._typeField = null;
        __copy.__changeListener = new BusinessAttributeInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BusinessAttributeInfo __objectRef;

        private ChangeListener(BusinessAttributeInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "deleted":
                    __objectRef._deletedField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "fieldPath":
                    __objectRef._fieldPathField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "glossaryTerms":
                    __objectRef._glossaryTermsField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "globalTags":
                    __objectRef._globalTagsField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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

        /**
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
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
         * Display name of the BusinessAttribute
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        public com.linkedin.schema.SchemaFieldDataType.Fields type() {
            return new com.linkedin.schema.SchemaFieldDataType.Fields(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.GlobalTags.ProjectionMask _globalTagsMask;
        private com.linkedin.common.GlossaryTerms.ProjectionMask _glossaryTermsMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _deletedMask;
        private com.linkedin.schema.SchemaFieldDataType.ProjectionMask _typeMask;

        ProjectionMask() {
            super(14);
        }

        /**
         * FieldPath uniquely identifying the SchemaField this metadata is associated with
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Tags associated with the field
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _globalTagsMask = nestedMask.apply(((_globalTagsMask == null)?GlobalTags.createMask():_globalTagsMask));
            getDataMap().put("globalTags", _globalTagsMask.getDataMap());
            return this;
        }

        /**
         * Tags associated with the field
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withGlobalTags() {
            _globalTagsMask = null;
            getDataMap().put("globalTags", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withGlossaryTerms(Function<com.linkedin.common.GlossaryTerms.ProjectionMask, com.linkedin.common.GlossaryTerms.ProjectionMask> nestedMask) {
            _glossaryTermsMask = nestedMask.apply(((_glossaryTermsMask == null)?GlossaryTerms.createMask():_glossaryTermsMask));
            getDataMap().put("glossaryTerms", _glossaryTermsMask.getDataMap());
            return this;
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withGlossaryTerms() {
            _glossaryTermsMask = null;
            getDataMap().put("glossaryTerms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Custom property bag.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withDeleted(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _deletedMask = nestedMask.apply(((_deletedMask == null)?AuditStamp.createMask():_deletedMask));
            getDataMap().put("deleted", _deletedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withDeleted(MaskMap nestedMask) {
            getDataMap().put("deleted", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withDeleted() {
            _deletedMask = null;
            getDataMap().put("deleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the BusinessAttribute
         * 
         */
        public BusinessAttributeInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        public BusinessAttributeInfo.ProjectionMask withType(Function<com.linkedin.schema.SchemaFieldDataType.ProjectionMask, com.linkedin.schema.SchemaFieldDataType.ProjectionMask> nestedMask) {
            _typeMask = nestedMask.apply(((_typeMask == null)?SchemaFieldDataType.createMask():_typeMask));
            getDataMap().put("type", _typeMask.getDataMap());
            return this;
        }

        public BusinessAttributeInfo.ProjectionMask withType() {
            _typeMask = null;
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
