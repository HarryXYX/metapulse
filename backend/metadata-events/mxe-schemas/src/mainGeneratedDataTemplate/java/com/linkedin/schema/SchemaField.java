
package com.linkedin.schema;

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


/**
 * SchemaField to describe metadata related to dataset schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaField.pdl.")
public class SchemaField
    extends RecordTemplate
{

    private final static SchemaField.Fields _fields = new SchemaField.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}", SchemaFormatType.PDL));
    private String _fieldPathField = null;
    private String _jsonPathField = null;
    private Boolean _nullableField = null;
    private String _descriptionField = null;
    private String _labelField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private SchemaFieldDataType _typeField = null;
    private String _nativeDataTypeField = null;
    private Boolean _recursiveField = null;
    private GlobalTags _globalTagsField = null;
    private GlossaryTerms _glossaryTermsField = null;
    private Boolean _isPartOfKeyField = null;
    private Boolean _isPartitioningKeyField = null;
    private String _jsonPropsField = null;
    private SchemaField.ChangeListener __changeListener = new SchemaField.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_JsonPath = SCHEMA.getField("jsonPath");
    private final static RecordDataSchema.Field FIELD_Nullable = SCHEMA.getField("nullable");
    private final static Boolean DEFAULT_Nullable;
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Label = SCHEMA.getField("label");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_NativeDataType = SCHEMA.getField("nativeDataType");
    private final static RecordDataSchema.Field FIELD_Recursive = SCHEMA.getField("recursive");
    private final static Boolean DEFAULT_Recursive;
    private final static RecordDataSchema.Field FIELD_GlobalTags = SCHEMA.getField("globalTags");
    private final static RecordDataSchema.Field FIELD_GlossaryTerms = SCHEMA.getField("glossaryTerms");
    private final static RecordDataSchema.Field FIELD_IsPartOfKey = SCHEMA.getField("isPartOfKey");
    private final static Boolean DEFAULT_IsPartOfKey;
    private final static RecordDataSchema.Field FIELD_IsPartitioningKey = SCHEMA.getField("isPartitioningKey");
    private final static RecordDataSchema.Field FIELD_JsonProps = SCHEMA.getField("jsonProps");

    static {
        DEFAULT_Nullable = DataTemplateUtil.coerceBooleanOutput(FIELD_Nullable.getDefault());
        DEFAULT_Recursive = DataTemplateUtil.coerceBooleanOutput(FIELD_Recursive.getDefault());
        DEFAULT_IsPartOfKey = DataTemplateUtil.coerceBooleanOutput(FIELD_IsPartOfKey.getDefault());
    }

    public SchemaField() {
        super(new DataMap(), SCHEMA, 7);
        addChangeListener(__changeListener);
    }

    public SchemaField(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaField.Fields fields() {
        return _fields;
    }

    public static SchemaField.ProjectionMask createMask() {
        return new SchemaField.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see SchemaField.Fields#fieldPath
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
     * @see SchemaField.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see SchemaField.Fields#fieldPath
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
     * @see SchemaField.Fields#fieldPath
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
     * @see SchemaField.Fields#fieldPath
     */
    public SchemaField setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.schema.SchemaField");
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
     * @see SchemaField.Fields#fieldPath
     */
    public SchemaField setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public boolean hasJsonPath() {
        if (_jsonPathField!= null) {
            return true;
        }
        return super._map.containsKey("jsonPath");
    }

    /**
     * Remover for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public void removeJsonPath() {
        super._map.remove("jsonPath");
    }

    /**
     * Getter for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    @Nullable
    public String getJsonPath(GetMode mode) {
        return getJsonPath();
    }

    /**
     * Getter for jsonPath
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#jsonPath
     */
    @Nullable
    public String getJsonPath() {
        if (_jsonPathField!= null) {
            return _jsonPathField;
        } else {
            Object __rawValue = super._map.get("jsonPath");
            _jsonPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _jsonPathField;
        }
    }

    /**
     * Setter for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public SchemaField setJsonPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJsonPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJsonPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "jsonPath", value);
                    _jsonPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "jsonPath", value);
                    _jsonPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for jsonPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#jsonPath
     */
    public SchemaField setJsonPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field jsonPath of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "jsonPath", value);
            _jsonPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public boolean hasNullable() {
        if (_nullableField!= null) {
            return true;
        }
        return super._map.containsKey("nullable");
    }

    /**
     * Remover for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public void removeNullable() {
        super._map.remove("nullable");
    }

    /**
     * Getter for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    @Nullable
    public Boolean isNullable(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isNullable();
            case NULL:
                if (_nullableField!= null) {
                    return _nullableField;
                } else {
                    Object __rawValue = super._map.get("nullable");
                    _nullableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _nullableField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for nullable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#nullable
     */
    @Nonnull
    public Boolean isNullable() {
        if (_nullableField!= null) {
            return _nullableField;
        } else {
            Object __rawValue = super._map.get("nullable");
            if (__rawValue == null) {
                return DEFAULT_Nullable;
            }
            _nullableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _nullableField;
        }
    }

    /**
     * Setter for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public SchemaField setNullable(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNullable(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field nullable of com.linkedin.schema.SchemaField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nullable", value);
                    _nullableField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNullable();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nullable", value);
                    _nullableField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nullable", value);
                    _nullableField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nullable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#nullable
     */
    public SchemaField setNullable(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nullable of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nullable", value);
            _nullableField = value;
        }
        return this;
    }

    /**
     * Setter for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public SchemaField setNullable(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "nullable", value);
        _nullableField = value;
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see SchemaField.Fields#description
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
     * @see SchemaField.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see SchemaField.Fields#description
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
     * @see SchemaField.Fields#description
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
     * @see SchemaField.Fields#description
     */
    public SchemaField setDescription(
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
     * @see SchemaField.Fields#description
     */
    public SchemaField setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for label
     * 
     * @see SchemaField.Fields#label
     */
    public boolean hasLabel() {
        if (_labelField!= null) {
            return true;
        }
        return super._map.containsKey("label");
    }

    /**
     * Remover for label
     * 
     * @see SchemaField.Fields#label
     */
    public void removeLabel() {
        super._map.remove("label");
    }

    /**
     * Getter for label
     * 
     * @see SchemaField.Fields#label
     */
    @Nullable
    public String getLabel(GetMode mode) {
        return getLabel();
    }

    /**
     * Getter for label
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#label
     */
    @Nullable
    public String getLabel() {
        if (_labelField!= null) {
            return _labelField;
        } else {
            Object __rawValue = super._map.get("label");
            _labelField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _labelField;
        }
    }

    /**
     * Setter for label
     * 
     * @see SchemaField.Fields#label
     */
    public SchemaField setLabel(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLabel(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLabel();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "label", value);
                    _labelField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "label", value);
                    _labelField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for label
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#label
     */
    public SchemaField setLabel(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field label of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "label", value);
            _labelField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see SchemaField.Fields#created
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
     * @see SchemaField.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see SchemaField.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#created
     */
    @Nullable
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see SchemaField.Fields#created
     */
    public SchemaField setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see SchemaField.Fields#created
     */
    public SchemaField setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see SchemaField.Fields#lastModified
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
     * @see SchemaField.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see SchemaField.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        return getLastModified();
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see SchemaField.Fields#lastModified
     */
    public SchemaField setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see SchemaField.Fields#lastModified
     */
    public SchemaField setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see SchemaField.Fields#type
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
     * @see SchemaField.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see SchemaField.Fields#type
     */
    @Nullable
    public SchemaFieldDataType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = ((__rawValue == null)?null:new SchemaFieldDataType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
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
     * @see SchemaField.Fields#type
     */
    @Nonnull
    public SchemaFieldDataType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = ((__rawValue == null)?null:new SchemaFieldDataType(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see SchemaField.Fields#type
     */
    public SchemaField setType(
        @Nullable
        SchemaFieldDataType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.schema.SchemaField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.data());
                    _typeField = value;
                }
                break;
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
     * @see SchemaField.Fields#type
     */
    public SchemaField setType(
        @Nonnull
        SchemaFieldDataType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.data());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public boolean hasNativeDataType() {
        if (_nativeDataTypeField!= null) {
            return true;
        }
        return super._map.containsKey("nativeDataType");
    }

    /**
     * Remover for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public void removeNativeDataType() {
        super._map.remove("nativeDataType");
    }

    /**
     * Getter for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    @Nullable
    public String getNativeDataType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNativeDataType();
            case DEFAULT:
            case NULL:
                if (_nativeDataTypeField!= null) {
                    return _nativeDataTypeField;
                } else {
                    Object __rawValue = super._map.get("nativeDataType");
                    _nativeDataTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nativeDataTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for nativeDataType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#nativeDataType
     */
    @Nonnull
    public String getNativeDataType() {
        if (_nativeDataTypeField!= null) {
            return _nativeDataTypeField;
        } else {
            Object __rawValue = super._map.get("nativeDataType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("nativeDataType");
            }
            _nativeDataTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nativeDataTypeField;
        }
    }

    /**
     * Setter for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public SchemaField setNativeDataType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeDataType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field nativeDataType of com.linkedin.schema.SchemaField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeDataType", value);
                    _nativeDataTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeDataType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeDataType", value);
                    _nativeDataTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeDataType", value);
                    _nativeDataTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeDataType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#nativeDataType
     */
    public SchemaField setNativeDataType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeDataType of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeDataType", value);
            _nativeDataTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public boolean hasRecursive() {
        if (_recursiveField!= null) {
            return true;
        }
        return super._map.containsKey("recursive");
    }

    /**
     * Remover for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public void removeRecursive() {
        super._map.remove("recursive");
    }

    /**
     * Getter for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    @Nullable
    public Boolean isRecursive(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isRecursive();
            case NULL:
                if (_recursiveField!= null) {
                    return _recursiveField;
                } else {
                    Object __rawValue = super._map.get("recursive");
                    _recursiveField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _recursiveField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for recursive
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#recursive
     */
    @Nonnull
    public Boolean isRecursive() {
        if (_recursiveField!= null) {
            return _recursiveField;
        } else {
            Object __rawValue = super._map.get("recursive");
            if (__rawValue == null) {
                return DEFAULT_Recursive;
            }
            _recursiveField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _recursiveField;
        }
    }

    /**
     * Setter for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public SchemaField setRecursive(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRecursive(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field recursive of com.linkedin.schema.SchemaField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "recursive", value);
                    _recursiveField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRecursive();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "recursive", value);
                    _recursiveField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "recursive", value);
                    _recursiveField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for recursive
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#recursive
     */
    public SchemaField setRecursive(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field recursive of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "recursive", value);
            _recursiveField = value;
        }
        return this;
    }

    /**
     * Setter for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public SchemaField setRecursive(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "recursive", value);
        _recursiveField = value;
        return this;
    }

    /**
     * Existence checker for globalTags
     * 
     * @see SchemaField.Fields#globalTags
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
     * @see SchemaField.Fields#globalTags
     */
    public void removeGlobalTags() {
        super._map.remove("globalTags");
    }

    /**
     * Getter for globalTags
     * 
     * @see SchemaField.Fields#globalTags
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
     * @see SchemaField.Fields#globalTags
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
     * @see SchemaField.Fields#globalTags
     */
    public SchemaField setGlobalTags(
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
     * @see SchemaField.Fields#globalTags
     */
    public SchemaField setGlobalTags(
        @Nonnull
        GlobalTags value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field globalTags of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "globalTags", value.data());
            _globalTagsField = value;
        }
        return this;
    }

    /**
     * Existence checker for glossaryTerms
     * 
     * @see SchemaField.Fields#glossaryTerms
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
     * @see SchemaField.Fields#glossaryTerms
     */
    public void removeGlossaryTerms() {
        super._map.remove("glossaryTerms");
    }

    /**
     * Getter for glossaryTerms
     * 
     * @see SchemaField.Fields#glossaryTerms
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
     * @see SchemaField.Fields#glossaryTerms
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
     * @see SchemaField.Fields#glossaryTerms
     */
    public SchemaField setGlossaryTerms(
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
     * @see SchemaField.Fields#glossaryTerms
     */
    public SchemaField setGlossaryTerms(
        @Nonnull
        GlossaryTerms value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field glossaryTerms of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "glossaryTerms", value.data());
            _glossaryTermsField = value;
        }
        return this;
    }

    /**
     * Existence checker for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public boolean hasIsPartOfKey() {
        if (_isPartOfKeyField!= null) {
            return true;
        }
        return super._map.containsKey("isPartOfKey");
    }

    /**
     * Remover for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public void removeIsPartOfKey() {
        super._map.remove("isPartOfKey");
    }

    /**
     * Getter for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    @Nullable
    public Boolean isIsPartOfKey(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isIsPartOfKey();
            case NULL:
                if (_isPartOfKeyField!= null) {
                    return _isPartOfKeyField;
                } else {
                    Object __rawValue = super._map.get("isPartOfKey");
                    _isPartOfKeyField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isPartOfKeyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isPartOfKey
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#isPartOfKey
     */
    @Nonnull
    public Boolean isIsPartOfKey() {
        if (_isPartOfKeyField!= null) {
            return _isPartOfKeyField;
        } else {
            Object __rawValue = super._map.get("isPartOfKey");
            if (__rawValue == null) {
                return DEFAULT_IsPartOfKey;
            }
            _isPartOfKeyField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isPartOfKeyField;
        }
    }

    /**
     * Setter for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public SchemaField setIsPartOfKey(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsPartOfKey(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isPartOfKey of com.linkedin.schema.SchemaField");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPartOfKey", value);
                    _isPartOfKeyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsPartOfKey();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPartOfKey", value);
                    _isPartOfKeyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isPartOfKey", value);
                    _isPartOfKeyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isPartOfKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#isPartOfKey
     */
    public SchemaField setIsPartOfKey(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isPartOfKey of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isPartOfKey", value);
            _isPartOfKeyField = value;
        }
        return this;
    }

    /**
     * Setter for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public SchemaField setIsPartOfKey(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isPartOfKey", value);
        _isPartOfKeyField = value;
        return this;
    }

    /**
     * Existence checker for isPartitioningKey
     * 
     * @see SchemaField.Fields#isPartitioningKey
     */
    public boolean hasIsPartitioningKey() {
        if (_isPartitioningKeyField!= null) {
            return true;
        }
        return super._map.containsKey("isPartitioningKey");
    }

    /**
     * Remover for isPartitioningKey
     * 
     * @see SchemaField.Fields#isPartitioningKey
     */
    public void removeIsPartitioningKey() {
        super._map.remove("isPartitioningKey");
    }

    /**
     * Getter for isPartitioningKey
     * 
     * @see SchemaField.Fields#isPartitioningKey
     */
    @Nullable
    public Boolean isIsPartitioningKey(GetMode mode) {
        return isIsPartitioningKey();
    }

    /**
     * Getter for isPartitioningKey
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#isPartitioningKey
     */
    @Nullable
    public Boolean isIsPartitioningKey() {
        if (_isPartitioningKeyField!= null) {
            return _isPartitioningKeyField;
        } else {
            Object __rawValue = super._map.get("isPartitioningKey");
            _isPartitioningKeyField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isPartitioningKeyField;
        }
    }

    /**
     * Setter for isPartitioningKey
     * 
     * @see SchemaField.Fields#isPartitioningKey
     */
    public SchemaField setIsPartitioningKey(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsPartitioningKey(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsPartitioningKey();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPartitioningKey", value);
                    _isPartitioningKeyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isPartitioningKey", value);
                    _isPartitioningKeyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isPartitioningKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#isPartitioningKey
     */
    public SchemaField setIsPartitioningKey(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isPartitioningKey of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isPartitioningKey", value);
            _isPartitioningKeyField = value;
        }
        return this;
    }

    /**
     * Setter for isPartitioningKey
     * 
     * @see SchemaField.Fields#isPartitioningKey
     */
    public SchemaField setIsPartitioningKey(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isPartitioningKey", value);
        _isPartitioningKeyField = value;
        return this;
    }

    /**
     * Existence checker for jsonProps
     * 
     * @see SchemaField.Fields#jsonProps
     */
    public boolean hasJsonProps() {
        if (_jsonPropsField!= null) {
            return true;
        }
        return super._map.containsKey("jsonProps");
    }

    /**
     * Remover for jsonProps
     * 
     * @see SchemaField.Fields#jsonProps
     */
    public void removeJsonProps() {
        super._map.remove("jsonProps");
    }

    /**
     * Getter for jsonProps
     * 
     * @see SchemaField.Fields#jsonProps
     */
    @Nullable
    public String getJsonProps(GetMode mode) {
        return getJsonProps();
    }

    /**
     * Getter for jsonProps
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#jsonProps
     */
    @Nullable
    public String getJsonProps() {
        if (_jsonPropsField!= null) {
            return _jsonPropsField;
        } else {
            Object __rawValue = super._map.get("jsonProps");
            _jsonPropsField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _jsonPropsField;
        }
    }

    /**
     * Setter for jsonProps
     * 
     * @see SchemaField.Fields#jsonProps
     */
    public SchemaField setJsonProps(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJsonProps(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJsonProps();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "jsonProps", value);
                    _jsonPropsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "jsonProps", value);
                    _jsonPropsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for jsonProps
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#jsonProps
     */
    public SchemaField setJsonProps(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field jsonProps of com.linkedin.schema.SchemaField to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "jsonProps", value);
            _jsonPropsField = value;
        }
        return this;
    }

    @Override
    public SchemaField clone()
        throws CloneNotSupportedException
    {
        SchemaField __clone = ((SchemaField) super.clone());
        __clone.__changeListener = new SchemaField.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaField copy()
        throws CloneNotSupportedException
    {
        SchemaField __copy = ((SchemaField) super.copy());
        __copy._nullableField = null;
        __copy._createdField = null;
        __copy._descriptionField = null;
        __copy._jsonPathField = null;
        __copy._isPartOfKeyField = null;
        __copy._jsonPropsField = null;
        __copy._labelField = null;
        __copy._typeField = null;
        __copy._globalTagsField = null;
        __copy._nativeDataTypeField = null;
        __copy._recursiveField = null;
        __copy._fieldPathField = null;
        __copy._glossaryTermsField = null;
        __copy._lastModifiedField = null;
        __copy._isPartitioningKeyField = null;
        __copy.__changeListener = new SchemaField.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaField __objectRef;

        private ChangeListener(SchemaField reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "nullable":
                    __objectRef._nullableField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "jsonPath":
                    __objectRef._jsonPathField = null;
                    break;
                case "isPartOfKey":
                    __objectRef._isPartOfKeyField = null;
                    break;
                case "jsonProps":
                    __objectRef._jsonPropsField = null;
                    break;
                case "label":
                    __objectRef._labelField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "globalTags":
                    __objectRef._globalTagsField = null;
                    break;
                case "nativeDataType":
                    __objectRef._nativeDataTypeField = null;
                    break;
                case "recursive":
                    __objectRef._recursiveField = null;
                    break;
                case "fieldPath":
                    __objectRef._fieldPathField = null;
                    break;
                case "glossaryTerms":
                    __objectRef._glossaryTermsField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "isPartitioningKey":
                    __objectRef._isPartitioningKeyField = null;
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
         * Flattened name of the field. Field is computed from jsonPath field.
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Flattened name of a field in JSON Path notation.
         * 
         */
        public PathSpec jsonPath() {
            return new PathSpec(getPathComponents(), "jsonPath");
        }

        /**
         * Indicates if this field is optional or nullable
         * 
         */
        public PathSpec nullable() {
            return new PathSpec(getPathComponents(), "nullable");
        }

        /**
         * Description
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Label of the field. Provides a more human-readable name for the field than field path. Some sources will
         * provide this metadata but not all sources have the concept of a label. If just one string is associated with
         * a field in a source, that is most likely a description.
         * 
         * Note that this field is deprecated and is not surfaced in the UI.
         * 
         */
        public PathSpec label() {
            return new PathSpec(getPathComponents(), "label");
        }

        /**
         * An AuditStamp corresponding to the creation of this schema field.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * An AuditStamp corresponding to the last modification of this schema field.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * Platform independent field type of the field.
         * 
         */
        public com.linkedin.schema.SchemaFieldDataType.Fields type() {
            return new com.linkedin.schema.SchemaFieldDataType.Fields(getPathComponents(), "type");
        }

        /**
         * The native type of the field in the dataset's platform as declared by platform schema.
         * 
         */
        public PathSpec nativeDataType() {
            return new PathSpec(getPathComponents(), "nativeDataType");
        }

        /**
         * There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.
         * 
         */
        public PathSpec recursive() {
            return new PathSpec(getPathComponents(), "recursive");
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
         * For schema fields that are part of complex keys, set this field to true
         * We do this to easily distinguish between value and key fields
         * 
         */
        public PathSpec isPartOfKey() {
            return new PathSpec(getPathComponents(), "isPartOfKey");
        }

        /**
         * For Datasets which are partitioned, this determines the partitioning key.
         * Note that multiple columns can be part of a partitioning key, but currently we do not support
         * rendering the ordered partitioning key.
         * 
         */
        public PathSpec isPartitioningKey() {
            return new PathSpec(getPathComponents(), "isPartitioningKey");
        }

        /**
         * For schema fields that have other properties that are not modeled explicitly,
         * use this field to serialize those properties into a JSON string
         * 
         */
        public PathSpec jsonProps() {
            return new PathSpec(getPathComponents(), "jsonProps");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.schema.SchemaFieldDataType.ProjectionMask _typeMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _globalTagsMask;
        private com.linkedin.common.GlossaryTerms.ProjectionMask _glossaryTermsMask;

        ProjectionMask() {
        }

        /**
         * Flattened name of the field. Field is computed from jsonPath field.
         * 
         */
        public SchemaField.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Flattened name of a field in JSON Path notation.
         * 
         */
        public SchemaField.ProjectionMask withJsonPath() {
            getDataMap().put("jsonPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Indicates if this field is optional or nullable
         * 
         */
        public SchemaField.ProjectionMask withNullable() {
            getDataMap().put("nullable", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description
         * 
         */
        public SchemaField.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Label of the field. Provides a more human-readable name for the field than field path. Some sources will
         * provide this metadata but not all sources have the concept of a label. If just one string is associated with
         * a field in a source, that is most likely a description.
         * 
         * Note that this field is deprecated and is not surfaced in the UI.
         * 
         */
        public SchemaField.ProjectionMask withLabel() {
            getDataMap().put("label", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this schema field.
         * 
         */
        public SchemaField.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this schema field.
         * 
         */
        public SchemaField.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this schema field.
         * 
         */
        public SchemaField.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this schema field.
         * 
         */
        public SchemaField.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this schema field.
         * 
         */
        public SchemaField.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this schema field.
         * 
         */
        public SchemaField.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Platform independent field type of the field.
         * 
         */
        public SchemaField.ProjectionMask withType(Function<com.linkedin.schema.SchemaFieldDataType.ProjectionMask, com.linkedin.schema.SchemaFieldDataType.ProjectionMask> nestedMask) {
            _typeMask = nestedMask.apply(((_typeMask == null)?SchemaFieldDataType.createMask():_typeMask));
            getDataMap().put("type", _typeMask.getDataMap());
            return this;
        }

        /**
         * Platform independent field type of the field.
         * 
         */
        public SchemaField.ProjectionMask withType() {
            _typeMask = null;
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native type of the field in the dataset's platform as declared by platform schema.
         * 
         */
        public SchemaField.ProjectionMask withNativeDataType() {
            getDataMap().put("nativeDataType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.
         * 
         */
        public SchemaField.ProjectionMask withRecursive() {
            getDataMap().put("recursive", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Tags associated with the field
         * 
         */
        public SchemaField.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _globalTagsMask = nestedMask.apply(((_globalTagsMask == null)?GlobalTags.createMask():_globalTagsMask));
            getDataMap().put("globalTags", _globalTagsMask.getDataMap());
            return this;
        }

        /**
         * Tags associated with the field
         * 
         */
        public SchemaField.ProjectionMask withGlobalTags() {
            _globalTagsMask = null;
            getDataMap().put("globalTags", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public SchemaField.ProjectionMask withGlossaryTerms(Function<com.linkedin.common.GlossaryTerms.ProjectionMask, com.linkedin.common.GlossaryTerms.ProjectionMask> nestedMask) {
            _glossaryTermsMask = nestedMask.apply(((_glossaryTermsMask == null)?GlossaryTerms.createMask():_glossaryTermsMask));
            getDataMap().put("glossaryTerms", _glossaryTermsMask.getDataMap());
            return this;
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public SchemaField.ProjectionMask withGlossaryTerms() {
            _glossaryTermsMask = null;
            getDataMap().put("glossaryTerms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * For schema fields that are part of complex keys, set this field to true
         * We do this to easily distinguish between value and key fields
         * 
         */
        public SchemaField.ProjectionMask withIsPartOfKey() {
            getDataMap().put("isPartOfKey", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * For Datasets which are partitioned, this determines the partitioning key.
         * Note that multiple columns can be part of a partitioning key, but currently we do not support
         * rendering the ordered partitioning key.
         * 
         */
        public SchemaField.ProjectionMask withIsPartitioningKey() {
            getDataMap().put("isPartitioningKey", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * For schema fields that have other properties that are not modeled explicitly,
         * use this field to serialize those properties into a JSON string
         * 
         */
        public SchemaField.ProjectionMask withJsonProps() {
            getDataMap().put("jsonProps", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
