
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
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.UnionTemplate;


/**
 * SchemaMetadata to describe metadata related to store schema
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
public class SchemaMetadata
    extends RecordTemplate
{

    private final static SchemaMetadata.Fields _fields = new SchemaMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Dataset this schema metadata is associated with.*/dataset:optional{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}", SchemaFormatType.PDL));
    private String _schemaNameField = null;
    private com.linkedin.common.urn.DataPlatformUrn _platformField = null;
    private Long _versionField = null;
    private AuditStamp _createdField = null;
    private AuditStamp _lastModifiedField = null;
    private AuditStamp _deletedField = null;
    private com.linkedin.common.urn.DatasetUrn _datasetField = null;
    private String _clusterField = null;
    private String _hashField = null;
    private SchemaMetadata.PlatformSchema _platformSchemaField = null;
    private SchemaFieldArray _fieldsField = null;
    private StringArray _primaryKeysField = null;
    private ForeignKeySpecMap _foreignKeysSpecsField = null;
    private ForeignKeyConstraintArray _foreignKeysField = null;
    private SchemaMetadata.ChangeListener __changeListener = new SchemaMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SchemaName = SCHEMA.getField("schemaName");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static AuditStamp DEFAULT_Created;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static AuditStamp DEFAULT_LastModified;
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Cluster = SCHEMA.getField("cluster");
    private final static RecordDataSchema.Field FIELD_Hash = SCHEMA.getField("hash");
    private final static RecordDataSchema.Field FIELD_PlatformSchema = SCHEMA.getField("platformSchema");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");
    private final static RecordDataSchema.Field FIELD_PrimaryKeys = SCHEMA.getField("primaryKeys");
    private final static RecordDataSchema.Field FIELD_ForeignKeysSpecs = SCHEMA.getField("foreignKeysSpecs");
    private final static RecordDataSchema.Field FIELD_ForeignKeys = SCHEMA.getField("foreignKeys");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
        DEFAULT_Created = ((FIELD_Created.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_Created.getDefault(), DataMap.class)));
        DEFAULT_LastModified = ((FIELD_LastModified.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_LastModified.getDefault(), DataMap.class)));
    }

    public SchemaMetadata() {
        super(new DataMap(), SCHEMA, 11);
        addChangeListener(__changeListener);
    }

    public SchemaMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaMetadata.Fields fields() {
        return _fields;
    }

    public static SchemaMetadata.ProjectionMask createMask() {
        return new SchemaMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public boolean hasSchemaName() {
        if (_schemaNameField!= null) {
            return true;
        }
        return super._map.containsKey("schemaName");
    }

    /**
     * Remover for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public void removeSchemaName() {
        super._map.remove("schemaName");
    }

    /**
     * Getter for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    @Nullable
    public String getSchemaName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSchemaName();
            case DEFAULT:
            case NULL:
                if (_schemaNameField!= null) {
                    return _schemaNameField;
                } else {
                    Object __rawValue = super._map.get("schemaName");
                    _schemaNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _schemaNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for schemaName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#schemaName
     */
    @Nonnull
    public String getSchemaName() {
        if (_schemaNameField!= null) {
            return _schemaNameField;
        } else {
            Object __rawValue = super._map.get("schemaName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("schemaName");
            }
            _schemaNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _schemaNameField;
        }
    }

    /**
     * Setter for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public SchemaMetadata setSchemaName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schemaName of com.linkedin.schema.SchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
                    _schemaNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
                    _schemaNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
                    _schemaNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#schemaName
     */
    public SchemaMetadata setSchemaName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaName of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
            _schemaNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public boolean hasPlatform() {
        if (_platformField!= null) {
            return true;
        }
        return super._map.containsKey("platform");
    }

    /**
     * Remover for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.DataPlatformUrn getPlatform(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatform();
            case DEFAULT:
            case NULL:
                if (_platformField!= null) {
                    return _platformField;
                } else {
                    Object __rawValue = super._map.get("platform");
                    _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataPlatformUrn.class);
                    return _platformField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.DataPlatformUrn getPlatform() {
        if (_platformField!= null) {
            return _platformField;
        } else {
            Object __rawValue = super._map.get("platform");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platform");
            }
            _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataPlatformUrn.class);
            return _platformField;
        }
    }

    /**
     * Setter for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public SchemaMetadata setPlatform(
        @Nullable
        com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platform of com.linkedin.schema.SchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _platformField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _platformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _platformField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#platform
     */
    public SchemaMetadata setPlatform(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    @Nullable
    public Long getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _versionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public SchemaMetadata setVersion(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.schema.SchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#version
     */
    public SchemaMetadata setVersion(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public SchemaMetadata setVersion(long value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
        _versionField = value;
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see SchemaMetadata.Fields#created
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
     * @see SchemaMetadata.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see SchemaMetadata.Fields#created
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
     * @see SchemaMetadata.Fields#created
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
     * @see SchemaMetadata.Fields#created
     */
    public SchemaMetadata setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.schema.SchemaMetadata");
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
     * @see SchemaMetadata.Fields#created
     */
    public SchemaMetadata setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see SchemaMetadata.Fields#lastModified
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
     * @see SchemaMetadata.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see SchemaMetadata.Fields#lastModified
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
     * @see SchemaMetadata.Fields#lastModified
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
     * @see SchemaMetadata.Fields#lastModified
     */
    public SchemaMetadata setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.schema.SchemaMetadata");
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
     * @see SchemaMetadata.Fields#lastModified
     */
    public SchemaMetadata setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see SchemaMetadata.Fields#deleted
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
     * @see SchemaMetadata.Fields#deleted
     */
    public void removeDeleted() {
        super._map.remove("deleted");
    }

    /**
     * Getter for deleted
     * 
     * @see SchemaMetadata.Fields#deleted
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
     * @see SchemaMetadata.Fields#deleted
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
     * @see SchemaMetadata.Fields#deleted
     */
    public SchemaMetadata setDeleted(
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
     * @see SchemaMetadata.Fields#deleted
     */
    public SchemaMetadata setDeleted(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deleted of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deleted", value.data());
            _deletedField = value;
        }
        return this;
    }

    /**
     * Existence checker for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public boolean hasDataset() {
        if (_datasetField!= null) {
            return true;
        }
        return super._map.containsKey("dataset");
    }

    /**
     * Remover for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public void removeDataset() {
        super._map.remove("dataset");
    }

    /**
     * Getter for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    @Nullable
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        return getDataset();
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#dataset
     */
    @Nullable
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        if (_datasetField!= null) {
            return _datasetField;
        } else {
            Object __rawValue = super._map.get("dataset");
            _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
            return _datasetField;
        }
    }

    /**
     * Setter for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public SchemaMetadata setDataset(
        @Nullable
        com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataset(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#dataset
     */
    public SchemaMetadata setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataset of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
            _datasetField = value;
        }
        return this;
    }

    /**
     * Existence checker for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public boolean hasCluster() {
        if (_clusterField!= null) {
            return true;
        }
        return super._map.containsKey("cluster");
    }

    /**
     * Remover for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public void removeCluster() {
        super._map.remove("cluster");
    }

    /**
     * Getter for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    @Nullable
    public String getCluster(GetMode mode) {
        return getCluster();
    }

    /**
     * Getter for cluster
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#cluster
     */
    @Nullable
    public String getCluster() {
        if (_clusterField!= null) {
            return _clusterField;
        } else {
            Object __rawValue = super._map.get("cluster");
            _clusterField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clusterField;
        }
    }

    /**
     * Setter for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public SchemaMetadata setCluster(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCluster(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCluster();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cluster", value);
                    _clusterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cluster", value);
                    _clusterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cluster
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#cluster
     */
    public SchemaMetadata setCluster(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cluster of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cluster", value);
            _clusterField = value;
        }
        return this;
    }

    /**
     * Existence checker for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public boolean hasHash() {
        if (_hashField!= null) {
            return true;
        }
        return super._map.containsKey("hash");
    }

    /**
     * Remover for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public void removeHash() {
        super._map.remove("hash");
    }

    /**
     * Getter for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    @Nullable
    public String getHash(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getHash();
            case DEFAULT:
            case NULL:
                if (_hashField!= null) {
                    return _hashField;
                } else {
                    Object __rawValue = super._map.get("hash");
                    _hashField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _hashField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for hash
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#hash
     */
    @Nonnull
    public String getHash() {
        if (_hashField!= null) {
            return _hashField;
        } else {
            Object __rawValue = super._map.get("hash");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("hash");
            }
            _hashField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _hashField;
        }
    }

    /**
     * Setter for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public SchemaMetadata setHash(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHash(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field hash of com.linkedin.schema.SchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hash", value);
                    _hashField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHash();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hash", value);
                    _hashField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hash", value);
                    _hashField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hash
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#hash
     */
    public SchemaMetadata setHash(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hash of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hash", value);
            _hashField = value;
        }
        return this;
    }

    /**
     * Existence checker for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public boolean hasPlatformSchema() {
        if (_platformSchemaField!= null) {
            return true;
        }
        return super._map.containsKey("platformSchema");
    }

    /**
     * Remover for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public void removePlatformSchema() {
        super._map.remove("platformSchema");
    }

    /**
     * Getter for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    @Nullable
    public SchemaMetadata.PlatformSchema getPlatformSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatformSchema();
            case DEFAULT:
            case NULL:
                if (_platformSchemaField!= null) {
                    return _platformSchemaField;
                } else {
                    Object __rawValue = super._map.get("platformSchema");
                    _platformSchemaField = ((__rawValue == null)?null:new SchemaMetadata.PlatformSchema(__rawValue));
                    return _platformSchemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for platformSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#platformSchema
     */
    @Nonnull
    public SchemaMetadata.PlatformSchema getPlatformSchema() {
        if (_platformSchemaField!= null) {
            return _platformSchemaField;
        } else {
            Object __rawValue = super._map.get("platformSchema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platformSchema");
            }
            _platformSchemaField = ((__rawValue == null)?null:new SchemaMetadata.PlatformSchema(__rawValue));
            return _platformSchemaField;
        }
    }

    /**
     * Setter for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public SchemaMetadata setPlatformSchema(
        @Nullable
        SchemaMetadata.PlatformSchema value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatformSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platformSchema of com.linkedin.schema.SchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platformSchema", value.data());
                    _platformSchemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatformSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platformSchema", value.data());
                    _platformSchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platformSchema", value.data());
                    _platformSchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platformSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#platformSchema
     */
    public SchemaMetadata setPlatformSchema(
        @Nonnull
        SchemaMetadata.PlatformSchema value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platformSchema of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platformSchema", value.data());
            _platformSchemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public boolean hasFields() {
        if (_fieldsField!= null) {
            return true;
        }
        return super._map.containsKey("fields");
    }

    /**
     * Remover for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public void removeFields() {
        super._map.remove("fields");
    }

    /**
     * Getter for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    @Nullable
    public SchemaFieldArray getFields(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFields();
            case DEFAULT:
            case NULL:
                if (_fieldsField!= null) {
                    return _fieldsField;
                } else {
                    Object __rawValue = super._map.get("fields");
                    _fieldsField = ((__rawValue == null)?null:new SchemaFieldArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _fieldsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#fields
     */
    @Nonnull
    public SchemaFieldArray getFields() {
        if (_fieldsField!= null) {
            return _fieldsField;
        } else {
            Object __rawValue = super._map.get("fields");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fields");
            }
            _fieldsField = ((__rawValue == null)?null:new SchemaFieldArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _fieldsField;
        }
    }

    /**
     * Setter for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public SchemaMetadata setFields(
        @Nullable
        SchemaFieldArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fields of com.linkedin.schema.SchemaMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#fields
     */
    public SchemaMetadata setFields(
        @Nonnull
        SchemaFieldArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fields of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
            _fieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public boolean hasPrimaryKeys() {
        if (_primaryKeysField!= null) {
            return true;
        }
        return super._map.containsKey("primaryKeys");
    }

    /**
     * Remover for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public void removePrimaryKeys() {
        super._map.remove("primaryKeys");
    }

    /**
     * Getter for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    @Nullable
    public StringArray getPrimaryKeys(GetMode mode) {
        return getPrimaryKeys();
    }

    /**
     * Getter for primaryKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#primaryKeys
     */
    @Nullable
    public StringArray getPrimaryKeys() {
        if (_primaryKeysField!= null) {
            return _primaryKeysField;
        } else {
            Object __rawValue = super._map.get("primaryKeys");
            _primaryKeysField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _primaryKeysField;
        }
    }

    /**
     * Setter for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public SchemaMetadata setPrimaryKeys(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrimaryKeys(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrimaryKeys();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "primaryKeys", value.data());
                    _primaryKeysField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "primaryKeys", value.data());
                    _primaryKeysField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for primaryKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public SchemaMetadata setPrimaryKeys(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field primaryKeys of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "primaryKeys", value.data());
            _primaryKeysField = value;
        }
        return this;
    }

    /**
     * Existence checker for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public boolean hasForeignKeysSpecs() {
        if (_foreignKeysSpecsField!= null) {
            return true;
        }
        return super._map.containsKey("foreignKeysSpecs");
    }

    /**
     * Remover for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public void removeForeignKeysSpecs() {
        super._map.remove("foreignKeysSpecs");
    }

    /**
     * Getter for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    @Nullable
    public ForeignKeySpecMap getForeignKeysSpecs(GetMode mode) {
        return getForeignKeysSpecs();
    }

    /**
     * Getter for foreignKeysSpecs
     * 
     * @return
     *     Optional field. Always check for null.
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    @Nullable
    public ForeignKeySpecMap getForeignKeysSpecs() {
        if (_foreignKeysSpecsField!= null) {
            return _foreignKeysSpecsField;
        } else {
            Object __rawValue = super._map.get("foreignKeysSpecs");
            _foreignKeysSpecsField = ((__rawValue == null)?null:new ForeignKeySpecMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _foreignKeysSpecsField;
        }
    }

    /**
     * Setter for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public SchemaMetadata setForeignKeysSpecs(
        @Nullable
        ForeignKeySpecMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setForeignKeysSpecs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeForeignKeysSpecs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKeysSpecs", value.data());
                    _foreignKeysSpecsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKeysSpecs", value.data());
                    _foreignKeysSpecsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for foreignKeysSpecs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public SchemaMetadata setForeignKeysSpecs(
        @Nonnull
        ForeignKeySpecMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field foreignKeysSpecs of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "foreignKeysSpecs", value.data());
            _foreignKeysSpecsField = value;
        }
        return this;
    }

    /**
     * Existence checker for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public boolean hasForeignKeys() {
        if (_foreignKeysField!= null) {
            return true;
        }
        return super._map.containsKey("foreignKeys");
    }

    /**
     * Remover for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public void removeForeignKeys() {
        super._map.remove("foreignKeys");
    }

    /**
     * Getter for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    @Nullable
    public ForeignKeyConstraintArray getForeignKeys(GetMode mode) {
        return getForeignKeys();
    }

    /**
     * Getter for foreignKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#foreignKeys
     */
    @Nullable
    public ForeignKeyConstraintArray getForeignKeys() {
        if (_foreignKeysField!= null) {
            return _foreignKeysField;
        } else {
            Object __rawValue = super._map.get("foreignKeys");
            _foreignKeysField = ((__rawValue == null)?null:new ForeignKeyConstraintArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _foreignKeysField;
        }
    }

    /**
     * Setter for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public SchemaMetadata setForeignKeys(
        @Nullable
        ForeignKeyConstraintArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setForeignKeys(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeForeignKeys();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKeys", value.data());
                    _foreignKeysField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "foreignKeys", value.data());
                    _foreignKeysField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for foreignKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public SchemaMetadata setForeignKeys(
        @Nonnull
        ForeignKeyConstraintArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field foreignKeys of com.linkedin.schema.SchemaMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "foreignKeys", value.data());
            _foreignKeysField = value;
        }
        return this;
    }

    @Override
    public SchemaMetadata clone()
        throws CloneNotSupportedException
    {
        SchemaMetadata __clone = ((SchemaMetadata) super.clone());
        __clone.__changeListener = new SchemaMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaMetadata copy()
        throws CloneNotSupportedException
    {
        SchemaMetadata __copy = ((SchemaMetadata) super.copy());
        __copy._clusterField = null;
        __copy._foreignKeysField = null;
        __copy._createdField = null;
        __copy._schemaNameField = null;
        __copy._versionField = null;
        __copy._platformField = null;
        __copy._foreignKeysSpecsField = null;
        __copy._deletedField = null;
        __copy._primaryKeysField = null;
        __copy._platformSchemaField = null;
        __copy._lastModifiedField = null;
        __copy._fieldsField = null;
        __copy._datasetField = null;
        __copy._hashField = null;
        __copy.__changeListener = new SchemaMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaMetadata __objectRef;

        private ChangeListener(SchemaMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "cluster":
                    __objectRef._clusterField = null;
                    break;
                case "foreignKeys":
                    __objectRef._foreignKeysField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "schemaName":
                    __objectRef._schemaNameField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "platform":
                    __objectRef._platformField = null;
                    break;
                case "foreignKeysSpecs":
                    __objectRef._foreignKeysSpecsField = null;
                    break;
                case "deleted":
                    __objectRef._deletedField = null;
                    break;
                case "primaryKeys":
                    __objectRef._primaryKeysField = null;
                    break;
                case "platformSchema":
                    __objectRef._platformSchemaField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "fields":
                    __objectRef._fieldsField = null;
                    break;
                case "dataset":
                    __objectRef._datasetField = null;
                    break;
                case "hash":
                    __objectRef._hashField = null;
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
         * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
         * 
         */
        public PathSpec schemaName() {
            return new PathSpec(getPathComponents(), "schemaName");
        }

        /**
         * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
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
         * Dataset this schema metadata is associated with.
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * The cluster this schema metadata resides from
         * 
         */
        public PathSpec cluster() {
            return new PathSpec(getPathComponents(), "cluster");
        }

        /**
         * the SHA1 hash of the schema content
         * 
         */
        public PathSpec hash() {
            return new PathSpec(getPathComponents(), "hash");
        }

        /**
         * The native schema in the dataset's platform.
         * 
         */
        public com.linkedin.schema.SchemaMetadata.PlatformSchema.Fields platformSchema() {
            return new com.linkedin.schema.SchemaMetadata.PlatformSchema.Fields(getPathComponents(), "platformSchema");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public com.linkedin.schema.SchemaFieldArray.Fields fields() {
            return new com.linkedin.schema.SchemaFieldArray.Fields(getPathComponents(), "fields");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public PathSpec fields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
         * 
         */
        public PathSpec primaryKeys() {
            return new PathSpec(getPathComponents(), "primaryKeys");
        }

        /**
         * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
         * 
         */
        public PathSpec primaryKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "primaryKeys");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.
         * 
         * @deprecated
         *     Use foreignKeys instead.
         */
        @Deprecated
        public com.linkedin.schema.ForeignKeySpecMap.Fields foreignKeysSpecs() {
            return new com.linkedin.schema.ForeignKeySpecMap.Fields(getPathComponents(), "foreignKeysSpecs");
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public com.linkedin.schema.ForeignKeyConstraintArray.Fields foreignKeys() {
            return new com.linkedin.schema.ForeignKeyConstraintArray.Fields(getPathComponents(), "foreignKeys");
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public PathSpec foreignKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "foreignKeys");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
    public static class PlatformSchema
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.schema/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}}{namespace com.linkedin.schema/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}}{namespace com.linkedin.schema/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}}{namespace com.linkedin.schema/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}}{namespace com.linkedin.schema/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}}{namespace com.linkedin.schema/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}}{namespace com.linkedin.schema/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}}{namespace com.linkedin.schema/**The dataset has no specific schema associated with it*/record Schemaless{}}{namespace com.linkedin.schema/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}}{namespace com.linkedin.schema/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}}]", SchemaFormatType.PDL));
        private com.linkedin.schema.EspressoSchema _espressoSchemaMember = null;
        private com.linkedin.schema.OracleDDL _oracleDDLMember = null;
        private com.linkedin.schema.MySqlDDL _mySqlDDLMember = null;
        private com.linkedin.schema.PrestoDDL _prestoDDLMember = null;
        private com.linkedin.schema.KafkaSchema _kafkaSchemaMember = null;
        private com.linkedin.schema.BinaryJsonSchema _binaryJsonSchemaMember = null;
        private com.linkedin.schema.OrcSchema _orcSchemaMember = null;
        private com.linkedin.schema.Schemaless _schemalessMember = null;
        private com.linkedin.schema.KeyValueSchema _keyValueSchemaMember = null;
        private com.linkedin.schema.OtherSchema _otherSchemaMember = null;
        private SchemaMetadata.PlatformSchema.ChangeListener __changeListener = new SchemaMetadata.PlatformSchema.ChangeListener(this);
        private final static DataSchema MEMBER_EspressoSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EspressoSchema");
        public final static String MEMBERKEY_EspressoSchema = "com.linkedin.schema.EspressoSchema";
        private final static DataSchema MEMBER_OracleDDL = SCHEMA.getTypeByMemberKey("com.linkedin.schema.OracleDDL");
        public final static String MEMBERKEY_OracleDDL = "com.linkedin.schema.OracleDDL";
        private final static DataSchema MEMBER_MySqlDDL = SCHEMA.getTypeByMemberKey("com.linkedin.schema.MySqlDDL");
        public final static String MEMBERKEY_MySqlDDL = "com.linkedin.schema.MySqlDDL";
        private final static DataSchema MEMBER_PrestoDDL = SCHEMA.getTypeByMemberKey("com.linkedin.schema.PrestoDDL");
        public final static String MEMBERKEY_PrestoDDL = "com.linkedin.schema.PrestoDDL";
        private final static DataSchema MEMBER_KafkaSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.KafkaSchema");
        public final static String MEMBERKEY_KafkaSchema = "com.linkedin.schema.KafkaSchema";
        private final static DataSchema MEMBER_BinaryJsonSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.BinaryJsonSchema");
        public final static String MEMBERKEY_BinaryJsonSchema = "com.linkedin.schema.BinaryJsonSchema";
        private final static DataSchema MEMBER_OrcSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.OrcSchema");
        public final static String MEMBERKEY_OrcSchema = "com.linkedin.schema.OrcSchema";
        private final static DataSchema MEMBER_Schemaless = SCHEMA.getTypeByMemberKey("com.linkedin.schema.Schemaless");
        public final static String MEMBERKEY_Schemaless = "com.linkedin.schema.Schemaless";
        private final static DataSchema MEMBER_KeyValueSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.KeyValueSchema");
        public final static String MEMBERKEY_KeyValueSchema = "com.linkedin.schema.KeyValueSchema";
        private final static DataSchema MEMBER_OtherSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.OtherSchema");
        public final static String MEMBERKEY_OtherSchema = "com.linkedin.schema.OtherSchema";

        public PlatformSchema() {
            super(new DataMap(2, 0.75F), SCHEMA);
            addChangeListener(__changeListener);
        }

        public PlatformSchema(Object data) {
            super(data, SCHEMA);
            addChangeListener(__changeListener);
        }

        public static UnionDataSchema dataSchema() {
            return SCHEMA;
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.EspressoSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setEspressoSchema(value);
            return newUnion;
        }

        public boolean isEspressoSchema() {
            return memberIs("com.linkedin.schema.EspressoSchema");
        }

        public com.linkedin.schema.EspressoSchema getEspressoSchema() {
            checkNotNull();
            if (_espressoSchemaMember!= null) {
                return _espressoSchemaMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.EspressoSchema");
            _espressoSchemaMember = ((__rawValue == null)?null:new com.linkedin.schema.EspressoSchema(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _espressoSchemaMember;
        }

        public void setEspressoSchema(com.linkedin.schema.EspressoSchema value) {
            checkNotNull();
            super._map.clear();
            _espressoSchemaMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.EspressoSchema", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.OracleDDL value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setOracleDDL(value);
            return newUnion;
        }

        public boolean isOracleDDL() {
            return memberIs("com.linkedin.schema.OracleDDL");
        }

        public com.linkedin.schema.OracleDDL getOracleDDL() {
            checkNotNull();
            if (_oracleDDLMember!= null) {
                return _oracleDDLMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.OracleDDL");
            _oracleDDLMember = ((__rawValue == null)?null:new com.linkedin.schema.OracleDDL(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _oracleDDLMember;
        }

        public void setOracleDDL(com.linkedin.schema.OracleDDL value) {
            checkNotNull();
            super._map.clear();
            _oracleDDLMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.OracleDDL", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.MySqlDDL value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setMySqlDDL(value);
            return newUnion;
        }

        public boolean isMySqlDDL() {
            return memberIs("com.linkedin.schema.MySqlDDL");
        }

        public com.linkedin.schema.MySqlDDL getMySqlDDL() {
            checkNotNull();
            if (_mySqlDDLMember!= null) {
                return _mySqlDDLMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.MySqlDDL");
            _mySqlDDLMember = ((__rawValue == null)?null:new com.linkedin.schema.MySqlDDL(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _mySqlDDLMember;
        }

        public void setMySqlDDL(com.linkedin.schema.MySqlDDL value) {
            checkNotNull();
            super._map.clear();
            _mySqlDDLMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.MySqlDDL", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.PrestoDDL value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setPrestoDDL(value);
            return newUnion;
        }

        public boolean isPrestoDDL() {
            return memberIs("com.linkedin.schema.PrestoDDL");
        }

        public com.linkedin.schema.PrestoDDL getPrestoDDL() {
            checkNotNull();
            if (_prestoDDLMember!= null) {
                return _prestoDDLMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.PrestoDDL");
            _prestoDDLMember = ((__rawValue == null)?null:new com.linkedin.schema.PrestoDDL(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _prestoDDLMember;
        }

        public void setPrestoDDL(com.linkedin.schema.PrestoDDL value) {
            checkNotNull();
            super._map.clear();
            _prestoDDLMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.PrestoDDL", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.KafkaSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setKafkaSchema(value);
            return newUnion;
        }

        public boolean isKafkaSchema() {
            return memberIs("com.linkedin.schema.KafkaSchema");
        }

        public com.linkedin.schema.KafkaSchema getKafkaSchema() {
            checkNotNull();
            if (_kafkaSchemaMember!= null) {
                return _kafkaSchemaMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.KafkaSchema");
            _kafkaSchemaMember = ((__rawValue == null)?null:new com.linkedin.schema.KafkaSchema(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _kafkaSchemaMember;
        }

        public void setKafkaSchema(com.linkedin.schema.KafkaSchema value) {
            checkNotNull();
            super._map.clear();
            _kafkaSchemaMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.KafkaSchema", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.BinaryJsonSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setBinaryJsonSchema(value);
            return newUnion;
        }

        public boolean isBinaryJsonSchema() {
            return memberIs("com.linkedin.schema.BinaryJsonSchema");
        }

        public com.linkedin.schema.BinaryJsonSchema getBinaryJsonSchema() {
            checkNotNull();
            if (_binaryJsonSchemaMember!= null) {
                return _binaryJsonSchemaMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.BinaryJsonSchema");
            _binaryJsonSchemaMember = ((__rawValue == null)?null:new com.linkedin.schema.BinaryJsonSchema(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _binaryJsonSchemaMember;
        }

        public void setBinaryJsonSchema(com.linkedin.schema.BinaryJsonSchema value) {
            checkNotNull();
            super._map.clear();
            _binaryJsonSchemaMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.BinaryJsonSchema", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.OrcSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setOrcSchema(value);
            return newUnion;
        }

        public boolean isOrcSchema() {
            return memberIs("com.linkedin.schema.OrcSchema");
        }

        public com.linkedin.schema.OrcSchema getOrcSchema() {
            checkNotNull();
            if (_orcSchemaMember!= null) {
                return _orcSchemaMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.OrcSchema");
            _orcSchemaMember = ((__rawValue == null)?null:new com.linkedin.schema.OrcSchema(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _orcSchemaMember;
        }

        public void setOrcSchema(com.linkedin.schema.OrcSchema value) {
            checkNotNull();
            super._map.clear();
            _orcSchemaMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.OrcSchema", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.Schemaless value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setSchemaless(value);
            return newUnion;
        }

        public boolean isSchemaless() {
            return memberIs("com.linkedin.schema.Schemaless");
        }

        public com.linkedin.schema.Schemaless getSchemaless() {
            checkNotNull();
            if (_schemalessMember!= null) {
                return _schemalessMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.Schemaless");
            _schemalessMember = ((__rawValue == null)?null:new com.linkedin.schema.Schemaless(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _schemalessMember;
        }

        public void setSchemaless(com.linkedin.schema.Schemaless value) {
            checkNotNull();
            super._map.clear();
            _schemalessMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.Schemaless", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.KeyValueSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setKeyValueSchema(value);
            return newUnion;
        }

        public boolean isKeyValueSchema() {
            return memberIs("com.linkedin.schema.KeyValueSchema");
        }

        public com.linkedin.schema.KeyValueSchema getKeyValueSchema() {
            checkNotNull();
            if (_keyValueSchemaMember!= null) {
                return _keyValueSchemaMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.KeyValueSchema");
            _keyValueSchemaMember = ((__rawValue == null)?null:new com.linkedin.schema.KeyValueSchema(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _keyValueSchemaMember;
        }

        public void setKeyValueSchema(com.linkedin.schema.KeyValueSchema value) {
            checkNotNull();
            super._map.clear();
            _keyValueSchemaMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.KeyValueSchema", value.data());
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.OtherSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setOtherSchema(value);
            return newUnion;
        }

        public boolean isOtherSchema() {
            return memberIs("com.linkedin.schema.OtherSchema");
        }

        public com.linkedin.schema.OtherSchema getOtherSchema() {
            checkNotNull();
            if (_otherSchemaMember!= null) {
                return _otherSchemaMember;
            }
            Object __rawValue = super._map.get("com.linkedin.schema.OtherSchema");
            _otherSchemaMember = ((__rawValue == null)?null:new com.linkedin.schema.OtherSchema(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _otherSchemaMember;
        }

        public void setOtherSchema(com.linkedin.schema.OtherSchema value) {
            checkNotNull();
            super._map.clear();
            _otherSchemaMember = value;
            CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.OtherSchema", value.data());
        }

        public static SchemaMetadata.PlatformSchema.ProjectionMask createMask() {
            return new SchemaMetadata.PlatformSchema.ProjectionMask();
        }

        @Override
        public SchemaMetadata.PlatformSchema clone()
            throws CloneNotSupportedException
        {
            SchemaMetadata.PlatformSchema __clone = ((SchemaMetadata.PlatformSchema) super.clone());
            __clone.__changeListener = new SchemaMetadata.PlatformSchema.ChangeListener(__clone);
            __clone.addChangeListener(__clone.__changeListener);
            return __clone;
        }

        @Override
        public SchemaMetadata.PlatformSchema copy()
            throws CloneNotSupportedException
        {
            SchemaMetadata.PlatformSchema __copy = ((SchemaMetadata.PlatformSchema) super.copy());
            __copy._oracleDDLMember = null;
            __copy._kafkaSchemaMember = null;
            __copy._binaryJsonSchemaMember = null;
            __copy._orcSchemaMember = null;
            __copy._mySqlDDLMember = null;
            __copy._prestoDDLMember = null;
            __copy._espressoSchemaMember = null;
            __copy._otherSchemaMember = null;
            __copy._schemalessMember = null;
            __copy._keyValueSchemaMember = null;
            __copy.__changeListener = new SchemaMetadata.PlatformSchema.ChangeListener(__copy);
            __copy.addChangeListener(__copy.__changeListener);
            return __copy;
        }

        private static class ChangeListener
            implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
        {

            private final SchemaMetadata.PlatformSchema __objectRef;

            private ChangeListener(SchemaMetadata.PlatformSchema reference) {
                __objectRef = reference;
            }

            @Override
            public void onUnderlyingMapChanged(String key, Object value) {
                switch (key) {
                    case "com.linkedin.schema.OracleDDL":
                        __objectRef._oracleDDLMember = null;
                        break;
                    case "com.linkedin.schema.KafkaSchema":
                        __objectRef._kafkaSchemaMember = null;
                        break;
                    case "com.linkedin.schema.BinaryJsonSchema":
                        __objectRef._binaryJsonSchemaMember = null;
                        break;
                    case "com.linkedin.schema.OrcSchema":
                        __objectRef._orcSchemaMember = null;
                        break;
                    case "com.linkedin.schema.MySqlDDL":
                        __objectRef._mySqlDDLMember = null;
                        break;
                    case "com.linkedin.schema.PrestoDDL":
                        __objectRef._prestoDDLMember = null;
                        break;
                    case "com.linkedin.schema.EspressoSchema":
                        __objectRef._espressoSchemaMember = null;
                        break;
                    case "com.linkedin.schema.OtherSchema":
                        __objectRef._otherSchemaMember = null;
                        break;
                    case "com.linkedin.schema.Schemaless":
                        __objectRef._schemalessMember = null;
                        break;
                    case "com.linkedin.schema.KeyValueSchema":
                        __objectRef._keyValueSchemaMember = null;
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

            public com.linkedin.schema.EspressoSchema.Fields EspressoSchema() {
                return new com.linkedin.schema.EspressoSchema.Fields(getPathComponents(), "com.linkedin.schema.EspressoSchema");
            }

            public com.linkedin.schema.OracleDDL.Fields OracleDDL() {
                return new com.linkedin.schema.OracleDDL.Fields(getPathComponents(), "com.linkedin.schema.OracleDDL");
            }

            public com.linkedin.schema.MySqlDDL.Fields MySqlDDL() {
                return new com.linkedin.schema.MySqlDDL.Fields(getPathComponents(), "com.linkedin.schema.MySqlDDL");
            }

            public com.linkedin.schema.PrestoDDL.Fields PrestoDDL() {
                return new com.linkedin.schema.PrestoDDL.Fields(getPathComponents(), "com.linkedin.schema.PrestoDDL");
            }

            public com.linkedin.schema.KafkaSchema.Fields KafkaSchema() {
                return new com.linkedin.schema.KafkaSchema.Fields(getPathComponents(), "com.linkedin.schema.KafkaSchema");
            }

            public com.linkedin.schema.BinaryJsonSchema.Fields BinaryJsonSchema() {
                return new com.linkedin.schema.BinaryJsonSchema.Fields(getPathComponents(), "com.linkedin.schema.BinaryJsonSchema");
            }

            public com.linkedin.schema.OrcSchema.Fields OrcSchema() {
                return new com.linkedin.schema.OrcSchema.Fields(getPathComponents(), "com.linkedin.schema.OrcSchema");
            }

            public com.linkedin.schema.Schemaless.Fields Schemaless() {
                return new com.linkedin.schema.Schemaless.Fields(getPathComponents(), "com.linkedin.schema.Schemaless");
            }

            public com.linkedin.schema.KeyValueSchema.Fields KeyValueSchema() {
                return new com.linkedin.schema.KeyValueSchema.Fields(getPathComponents(), "com.linkedin.schema.KeyValueSchema");
            }

            public com.linkedin.schema.OtherSchema.Fields OtherSchema() {
                return new com.linkedin.schema.OtherSchema.Fields(getPathComponents(), "com.linkedin.schema.OtherSchema");
            }

        }

        public static class ProjectionMask
            extends MaskMap
        {

            private com.linkedin.schema.EspressoSchema.ProjectionMask _EspressoSchemaMask;
            private com.linkedin.schema.OracleDDL.ProjectionMask _OracleDDLMask;
            private com.linkedin.schema.MySqlDDL.ProjectionMask _MySqlDDLMask;
            private com.linkedin.schema.PrestoDDL.ProjectionMask _PrestoDDLMask;
            private com.linkedin.schema.KafkaSchema.ProjectionMask _KafkaSchemaMask;
            private com.linkedin.schema.BinaryJsonSchema.ProjectionMask _BinaryJsonSchemaMask;
            private com.linkedin.schema.OrcSchema.ProjectionMask _OrcSchemaMask;
            private com.linkedin.schema.Schemaless.ProjectionMask _SchemalessMask;
            private com.linkedin.schema.KeyValueSchema.ProjectionMask _KeyValueSchemaMask;
            private com.linkedin.schema.OtherSchema.ProjectionMask _OtherSchemaMask;

            ProjectionMask() {
                super(14);
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withEspressoSchema(Function<com.linkedin.schema.EspressoSchema.ProjectionMask, com.linkedin.schema.EspressoSchema.ProjectionMask> nestedMask) {
                _EspressoSchemaMask = nestedMask.apply(((_EspressoSchemaMask == null)?com.linkedin.schema.EspressoSchema.createMask():_EspressoSchemaMask));
                getDataMap().put("com.linkedin.schema.EspressoSchema", _EspressoSchemaMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withOracleDDL(Function<com.linkedin.schema.OracleDDL.ProjectionMask, com.linkedin.schema.OracleDDL.ProjectionMask> nestedMask) {
                _OracleDDLMask = nestedMask.apply(((_OracleDDLMask == null)?com.linkedin.schema.OracleDDL.createMask():_OracleDDLMask));
                getDataMap().put("com.linkedin.schema.OracleDDL", _OracleDDLMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withMySqlDDL(Function<com.linkedin.schema.MySqlDDL.ProjectionMask, com.linkedin.schema.MySqlDDL.ProjectionMask> nestedMask) {
                _MySqlDDLMask = nestedMask.apply(((_MySqlDDLMask == null)?com.linkedin.schema.MySqlDDL.createMask():_MySqlDDLMask));
                getDataMap().put("com.linkedin.schema.MySqlDDL", _MySqlDDLMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withPrestoDDL(Function<com.linkedin.schema.PrestoDDL.ProjectionMask, com.linkedin.schema.PrestoDDL.ProjectionMask> nestedMask) {
                _PrestoDDLMask = nestedMask.apply(((_PrestoDDLMask == null)?com.linkedin.schema.PrestoDDL.createMask():_PrestoDDLMask));
                getDataMap().put("com.linkedin.schema.PrestoDDL", _PrestoDDLMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withKafkaSchema(Function<com.linkedin.schema.KafkaSchema.ProjectionMask, com.linkedin.schema.KafkaSchema.ProjectionMask> nestedMask) {
                _KafkaSchemaMask = nestedMask.apply(((_KafkaSchemaMask == null)?com.linkedin.schema.KafkaSchema.createMask():_KafkaSchemaMask));
                getDataMap().put("com.linkedin.schema.KafkaSchema", _KafkaSchemaMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withBinaryJsonSchema(Function<com.linkedin.schema.BinaryJsonSchema.ProjectionMask, com.linkedin.schema.BinaryJsonSchema.ProjectionMask> nestedMask) {
                _BinaryJsonSchemaMask = nestedMask.apply(((_BinaryJsonSchemaMask == null)?com.linkedin.schema.BinaryJsonSchema.createMask():_BinaryJsonSchemaMask));
                getDataMap().put("com.linkedin.schema.BinaryJsonSchema", _BinaryJsonSchemaMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withOrcSchema(Function<com.linkedin.schema.OrcSchema.ProjectionMask, com.linkedin.schema.OrcSchema.ProjectionMask> nestedMask) {
                _OrcSchemaMask = nestedMask.apply(((_OrcSchemaMask == null)?com.linkedin.schema.OrcSchema.createMask():_OrcSchemaMask));
                getDataMap().put("com.linkedin.schema.OrcSchema", _OrcSchemaMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withSchemaless(Function<com.linkedin.schema.Schemaless.ProjectionMask, com.linkedin.schema.Schemaless.ProjectionMask> nestedMask) {
                _SchemalessMask = nestedMask.apply(((_SchemalessMask == null)?com.linkedin.schema.Schemaless.createMask():_SchemalessMask));
                getDataMap().put("com.linkedin.schema.Schemaless", _SchemalessMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withKeyValueSchema(Function<com.linkedin.schema.KeyValueSchema.ProjectionMask, com.linkedin.schema.KeyValueSchema.ProjectionMask> nestedMask) {
                _KeyValueSchemaMask = nestedMask.apply(((_KeyValueSchemaMask == null)?com.linkedin.schema.KeyValueSchema.createMask():_KeyValueSchemaMask));
                getDataMap().put("com.linkedin.schema.KeyValueSchema", _KeyValueSchemaMask.getDataMap());
                return this;
            }

            public SchemaMetadata.PlatformSchema.ProjectionMask withOtherSchema(Function<com.linkedin.schema.OtherSchema.ProjectionMask, com.linkedin.schema.OtherSchema.ProjectionMask> nestedMask) {
                _OtherSchemaMask = nestedMask.apply(((_OtherSchemaMask == null)?com.linkedin.schema.OtherSchema.createMask():_OtherSchemaMask));
                getDataMap().put("com.linkedin.schema.OtherSchema", _OtherSchemaMask.getDataMap());
                return this;
            }

        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _deletedMask;
        private com.linkedin.schema.SchemaMetadata.PlatformSchema.ProjectionMask _platformSchemaMask;
        private com.linkedin.schema.SchemaFieldArray.ProjectionMask _fieldsMask;
        private com.linkedin.schema.ForeignKeySpecMap.ProjectionMask _foreignKeysSpecsMask;
        private com.linkedin.schema.ForeignKeyConstraintArray.ProjectionMask _foreignKeysMask;

        ProjectionMask() {
        }

        /**
         * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
         * 
         */
        public SchemaMetadata.ProjectionMask withSchemaName() {
            getDataMap().put("schemaName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
         * 
         */
        public SchemaMetadata.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
         * 
         */
        public SchemaMetadata.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public SchemaMetadata.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public SchemaMetadata.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public SchemaMetadata.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public SchemaMetadata.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public SchemaMetadata.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public SchemaMetadata.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public SchemaMetadata.ProjectionMask withDeleted(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _deletedMask = nestedMask.apply(((_deletedMask == null)?AuditStamp.createMask():_deletedMask));
            getDataMap().put("deleted", _deletedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public SchemaMetadata.ProjectionMask withDeleted(MaskMap nestedMask) {
            getDataMap().put("deleted", nestedMask.getDataMap());
            return this;
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public SchemaMetadata.ProjectionMask withDeleted() {
            _deletedMask = null;
            getDataMap().put("deleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Dataset this schema metadata is associated with.
         * 
         */
        public SchemaMetadata.ProjectionMask withDataset() {
            getDataMap().put("dataset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The cluster this schema metadata resides from
         * 
         */
        public SchemaMetadata.ProjectionMask withCluster() {
            getDataMap().put("cluster", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * the SHA1 hash of the schema content
         * 
         */
        public SchemaMetadata.ProjectionMask withHash() {
            getDataMap().put("hash", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native schema in the dataset's platform.
         * 
         */
        public SchemaMetadata.ProjectionMask withPlatformSchema(Function<com.linkedin.schema.SchemaMetadata.PlatformSchema.ProjectionMask, com.linkedin.schema.SchemaMetadata.PlatformSchema.ProjectionMask> nestedMask) {
            _platformSchemaMask = nestedMask.apply(((_platformSchemaMask == null)?SchemaMetadata.PlatformSchema.createMask():_platformSchemaMask));
            getDataMap().put("platformSchema", _platformSchemaMask.getDataMap());
            return this;
        }

        /**
         * The native schema in the dataset's platform.
         * 
         */
        public SchemaMetadata.ProjectionMask withPlatformSchema() {
            _platformSchemaMask = null;
            getDataMap().put("platformSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public SchemaMetadata.ProjectionMask withFields(Function<com.linkedin.schema.SchemaFieldArray.ProjectionMask, com.linkedin.schema.SchemaFieldArray.ProjectionMask> nestedMask) {
            _fieldsMask = nestedMask.apply(((_fieldsMask == null)?SchemaFieldArray.createMask():_fieldsMask));
            getDataMap().put("fields", _fieldsMask.getDataMap());
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public SchemaMetadata.ProjectionMask withFields() {
            _fieldsMask = null;
            getDataMap().put("fields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public SchemaMetadata.ProjectionMask withFields(Function<com.linkedin.schema.SchemaFieldArray.ProjectionMask, com.linkedin.schema.SchemaFieldArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _fieldsMask = nestedMask.apply(((_fieldsMask == null)?SchemaFieldArray.createMask():_fieldsMask));
            getDataMap().put("fields", _fieldsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("fields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fields").put("$count", count);
            }
            return this;
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public SchemaMetadata.ProjectionMask withFields(Integer start, Integer count) {
            _fieldsMask = null;
            getDataMap().put("fields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("fields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fields").put("$count", count);
            }
            return this;
        }

        /**
         * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
         * 
         */
        public SchemaMetadata.ProjectionMask withPrimaryKeys() {
            getDataMap().put("primaryKeys", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
         * 
         */
        public SchemaMetadata.ProjectionMask withPrimaryKeys(Integer start, Integer count) {
            getDataMap().put("primaryKeys", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("primaryKeys").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("primaryKeys").put("$count", count);
            }
            return this;
        }

        /**
         * Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.
         * 
         * @deprecated
         *     Use foreignKeys instead.
         */
        @Deprecated
        public SchemaMetadata.ProjectionMask withForeignKeysSpecs(Function<com.linkedin.schema.ForeignKeySpecMap.ProjectionMask, com.linkedin.schema.ForeignKeySpecMap.ProjectionMask> nestedMask) {
            _foreignKeysSpecsMask = nestedMask.apply(((_foreignKeysSpecsMask == null)?ForeignKeySpecMap.createMask():_foreignKeysSpecsMask));
            getDataMap().put("foreignKeysSpecs", _foreignKeysSpecsMask.getDataMap());
            return this;
        }

        /**
         * Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.
         * 
         * @deprecated
         *     Use foreignKeys instead.
         */
        @Deprecated
        public SchemaMetadata.ProjectionMask withForeignKeysSpecs() {
            _foreignKeysSpecsMask = null;
            getDataMap().put("foreignKeysSpecs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public SchemaMetadata.ProjectionMask withForeignKeys(Function<com.linkedin.schema.ForeignKeyConstraintArray.ProjectionMask, com.linkedin.schema.ForeignKeyConstraintArray.ProjectionMask> nestedMask) {
            _foreignKeysMask = nestedMask.apply(((_foreignKeysMask == null)?ForeignKeyConstraintArray.createMask():_foreignKeysMask));
            getDataMap().put("foreignKeys", _foreignKeysMask.getDataMap());
            return this;
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public SchemaMetadata.ProjectionMask withForeignKeys() {
            _foreignKeysMask = null;
            getDataMap().put("foreignKeys", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public SchemaMetadata.ProjectionMask withForeignKeys(Function<com.linkedin.schema.ForeignKeyConstraintArray.ProjectionMask, com.linkedin.schema.ForeignKeyConstraintArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _foreignKeysMask = nestedMask.apply(((_foreignKeysMask == null)?ForeignKeyConstraintArray.createMask():_foreignKeysMask));
            getDataMap().put("foreignKeys", _foreignKeysMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("foreignKeys").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("foreignKeys").put("$count", count);
            }
            return this;
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public SchemaMetadata.ProjectionMask withForeignKeys(Integer start, Integer count) {
            _foreignKeysMask = null;
            getDataMap().put("foreignKeys", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("foreignKeys").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("foreignKeys").put("$count", count);
            }
            return this;
        }

    }

}
