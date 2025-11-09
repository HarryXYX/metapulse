
package com.linkedin.assertion;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.schema.SchemaMetadata;


/**
 * Attributes that are applicable to schema assertions
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/SchemaAssertionInfo.pdl.")
public class SchemaAssertionInfo
    extends RecordTemplate
{

    private final static SchemaAssertionInfo.Fields _fields = new SchemaAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes that are applicable to schema assertions\n*/record SchemaAssertionInfo{/**The entity targeted by the assertion*/@Relationship={\"entityTypes\":[\"dataset\",\"dataJob\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**A definition of the expected structure for the asset\n\nNote that many of the fields of this model, especially those related to metadata (tags, terms)\nwill go unused in this context.*/schema:{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Dataset this schema metadata is associated with.*/dataset:optional{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}}/**The required compatibility level for the schema assertion to pass.*/compatibility:optional enum SchemaAssertionCompatibility{/**The actual schema must be exactly the same as the expected schema*/EXACT_MATCH/**The actual schema must be a superset of the expected schema*/SUPERSET/**The actual schema must be a subset of the expected schema*/SUBSET}=\"EXACT_MATCH\"}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _entityField = null;
    private SchemaMetadata _schemaField = null;
    private SchemaAssertionCompatibility _compatibilityField = null;
    private SchemaAssertionInfo.ChangeListener __changeListener = new SchemaAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");
    private final static RecordDataSchema.Field FIELD_Compatibility = SCHEMA.getField("compatibility");
    private final static SchemaAssertionCompatibility DEFAULT_Compatibility;

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_Compatibility = DataTemplateUtil.coerceEnumOutput(FIELD_Compatibility.getDefault(), SchemaAssertionCompatibility.class, SchemaAssertionCompatibility.$UNKNOWN);
    }

    public SchemaAssertionInfo() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SchemaAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaAssertionInfo.Fields fields() {
        return _fields;
    }

    public static SchemaAssertionInfo.ProjectionMask createMask() {
        return new SchemaAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entity
     * 
     * @see SchemaAssertionInfo.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see SchemaAssertionInfo.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see SchemaAssertionInfo.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntity();
            case DEFAULT:
            case NULL:
                if (_entityField!= null) {
                    return _entityField;
                } else {
                    Object __rawValue = super._map.get("entity");
                    _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaAssertionInfo.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entity");
            }
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see SchemaAssertionInfo.Fields#entity
     */
    public SchemaAssertionInfo setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.assertion.SchemaAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaAssertionInfo.Fields#entity
     */
    public SchemaAssertionInfo setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.assertion.SchemaAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for schema
     * 
     * @see SchemaAssertionInfo.Fields#schema
     */
    public boolean hasSchema() {
        if (_schemaField!= null) {
            return true;
        }
        return super._map.containsKey("schema");
    }

    /**
     * Remover for schema
     * 
     * @see SchemaAssertionInfo.Fields#schema
     */
    public void removeSchema() {
        super._map.remove("schema");
    }

    /**
     * Getter for schema
     * 
     * @see SchemaAssertionInfo.Fields#schema
     */
    @Nullable
    public SchemaMetadata getSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSchema();
            case DEFAULT:
            case NULL:
                if (_schemaField!= null) {
                    return _schemaField;
                } else {
                    Object __rawValue = super._map.get("schema");
                    _schemaField = ((__rawValue == null)?null:new SchemaMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _schemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for schema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaAssertionInfo.Fields#schema
     */
    @Nonnull
    public SchemaMetadata getSchema() {
        if (_schemaField!= null) {
            return _schemaField;
        } else {
            Object __rawValue = super._map.get("schema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("schema");
            }
            _schemaField = ((__rawValue == null)?null:new SchemaMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _schemaField;
        }
    }

    /**
     * Setter for schema
     * 
     * @see SchemaAssertionInfo.Fields#schema
     */
    public SchemaAssertionInfo setSchema(
        @Nullable
        SchemaMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schema of com.linkedin.assertion.SchemaAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
                    _schemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
                    _schemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
                    _schemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaAssertionInfo.Fields#schema
     */
    public SchemaAssertionInfo setSchema(
        @Nonnull
        SchemaMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schema of com.linkedin.assertion.SchemaAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schema", value.data());
            _schemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for compatibility
     * 
     * @see SchemaAssertionInfo.Fields#compatibility
     */
    public boolean hasCompatibility() {
        if (_compatibilityField!= null) {
            return true;
        }
        return super._map.containsKey("compatibility");
    }

    /**
     * Remover for compatibility
     * 
     * @see SchemaAssertionInfo.Fields#compatibility
     */
    public void removeCompatibility() {
        super._map.remove("compatibility");
    }

    /**
     * Getter for compatibility
     * 
     * @see SchemaAssertionInfo.Fields#compatibility
     */
    @Nullable
    public SchemaAssertionCompatibility getCompatibility(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCompatibility();
            case NULL:
                if (_compatibilityField!= null) {
                    return _compatibilityField;
                } else {
                    Object __rawValue = super._map.get("compatibility");
                    _compatibilityField = DataTemplateUtil.coerceEnumOutput(__rawValue, SchemaAssertionCompatibility.class, SchemaAssertionCompatibility.$UNKNOWN);
                    return _compatibilityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for compatibility
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaAssertionInfo.Fields#compatibility
     */
    @Nullable
    public SchemaAssertionCompatibility getCompatibility() {
        if (_compatibilityField!= null) {
            return _compatibilityField;
        } else {
            Object __rawValue = super._map.get("compatibility");
            if (__rawValue == null) {
                return DEFAULT_Compatibility;
            }
            _compatibilityField = DataTemplateUtil.coerceEnumOutput(__rawValue, SchemaAssertionCompatibility.class, SchemaAssertionCompatibility.$UNKNOWN);
            return _compatibilityField;
        }
    }

    /**
     * Setter for compatibility
     * 
     * @see SchemaAssertionInfo.Fields#compatibility
     */
    public SchemaAssertionInfo setCompatibility(
        @Nullable
        SchemaAssertionCompatibility value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCompatibility(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCompatibility();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "compatibility", value.name());
                    _compatibilityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "compatibility", value.name());
                    _compatibilityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for compatibility
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaAssertionInfo.Fields#compatibility
     */
    public SchemaAssertionInfo setCompatibility(
        @Nonnull
        SchemaAssertionCompatibility value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field compatibility of com.linkedin.assertion.SchemaAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "compatibility", value.name());
            _compatibilityField = value;
        }
        return this;
    }

    @Override
    public SchemaAssertionInfo clone()
        throws CloneNotSupportedException
    {
        SchemaAssertionInfo __clone = ((SchemaAssertionInfo) super.clone());
        __clone.__changeListener = new SchemaAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaAssertionInfo copy()
        throws CloneNotSupportedException
    {
        SchemaAssertionInfo __copy = ((SchemaAssertionInfo) super.copy());
        __copy._schemaField = null;
        __copy._compatibilityField = null;
        __copy._entityField = null;
        __copy.__changeListener = new SchemaAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaAssertionInfo __objectRef;

        private ChangeListener(SchemaAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schema":
                    __objectRef._schemaField = null;
                    break;
                case "compatibility":
                    __objectRef._compatibilityField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         * The entity targeted by the assertion
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * A definition of the expected structure for the asset
         * 
         * Note that many of the fields of this model, especially those related to metadata (tags, terms)
         * will go unused in this context.
         * 
         */
        public com.linkedin.schema.SchemaMetadata.Fields schema() {
            return new com.linkedin.schema.SchemaMetadata.Fields(getPathComponents(), "schema");
        }

        /**
         * The required compatibility level for the schema assertion to pass.
         * 
         */
        public PathSpec compatibility() {
            return new PathSpec(getPathComponents(), "compatibility");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.SchemaMetadata.ProjectionMask _schemaMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The entity targeted by the assertion
         * 
         */
        public SchemaAssertionInfo.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A definition of the expected structure for the asset
         * 
         * Note that many of the fields of this model, especially those related to metadata (tags, terms)
         * will go unused in this context.
         * 
         */
        public SchemaAssertionInfo.ProjectionMask withSchema(Function<com.linkedin.schema.SchemaMetadata.ProjectionMask, com.linkedin.schema.SchemaMetadata.ProjectionMask> nestedMask) {
            _schemaMask = nestedMask.apply(((_schemaMask == null)?SchemaMetadata.createMask():_schemaMask));
            getDataMap().put("schema", _schemaMask.getDataMap());
            return this;
        }

        /**
         * A definition of the expected structure for the asset
         * 
         * Note that many of the fields of this model, especially those related to metadata (tags, terms)
         * will go unused in this context.
         * 
         */
        public SchemaAssertionInfo.ProjectionMask withSchema() {
            _schemaMask = null;
            getDataMap().put("schema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The required compatibility level for the schema assertion to pass.
         * 
         */
        public SchemaAssertionInfo.ProjectionMask withCompatibility() {
            getDataMap().put("compatibility", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
