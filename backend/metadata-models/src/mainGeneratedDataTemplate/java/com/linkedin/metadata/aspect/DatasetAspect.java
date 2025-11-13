
package com.linkedin.metadata.aspect;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/DatasetAspect.pdl.")
public class DatasetAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("union[{namespace com.linkedin.metadata.key/**Key for a Dataset*/@Aspect.name=\"datasetKey\"record DatasetKey{/**Data platform urn associated with the dataset*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"URN\"}platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique guid for dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"searchLabel\":\"origin\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Display name of the Dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Fully-qualified name of the Dataset*/@Searchable={\"addToFilters\":false,\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:optional string/**Documentation of the dataset*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/@deprecated=\"Use ExternalReference.externalUrl field instead.\"uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.\nThis is now deprecated.*/@deprecated=\"Use GlobalTags aspect instead.\"tags:array[string]=[]}}{namespace com.linkedin.dataset/**EditableDatasetProperties stores editable changes made to dataset properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableDatasetProperties\"record EditableDatasetProperties includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Documentation of the dataset*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Editable display name of the Dataset*/@Searchable={\"fieldName\":\"editedName\",\"fieldType\":\"TEXT_PARTIAL\"}name:optional string}}{namespace com.linkedin.dataset/**Dataset deprecation status\nDeprecated! This aspect is deprecated in favor of the more-general-purpose 'Deprecation' aspect.*/@Aspect.name=\"datasetDeprecation\"@Deprecated,record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional com.linkedin.common.Urn}}{namespace com.linkedin.dataset/**Fine Grained upstream lineage for fields in a dataset*/@Aspect.name=\"datasetUpstreamLineage\"@deprecated=\"use UpstreamLineage.fineGrainedLineages instead\"record DatasetUpstreamLineage{/**Upstream to downstream field level lineage mappings*/fieldMappings:array[/**Representation of mapping between fields in source dataset to the field in destination dataset*/@deprecated=\"use FineGrainedLineage instead\"record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:AuditStamp/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/@deprecated=\"refer FineGrainedLineage for alternative representation\"typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}]}}{namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.*/auditStamp:com.linkedin.common.AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**Audit stamp containing who created the lineage and when.*/created:optional com.linkedin.common.AuditStamp/**The upstream dataset the lineage points to*/@Relationship={\"createdActor\":\"upstreams/*/created/actor\",\"createdOn\":\"upstreams/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"upstreams/*/properties\",\"updatedActor\":\"upstreams/*/auditStamp/actor\",\"updatedOn\":\"upstreams/*/auditStamp/time\",\"via\":\"upstreams/*/query\"}@Searchable={\"fieldName\":\"upstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasUpstreams\",\"queryByDefault\":false}dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]/**If the lineage is generated by a query, a reference to the query*/query:optional com.linkedin.common.Urn}]/** List of fine-grained lineage information, including field-level lineage*/@Relationship.`/*/upstreams/*`={\"entityTypes\":[\"dataset\",\"schemaField\"],\"name\":\"DownstreamOf\"}fineGrainedLineages:optional array[/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}com.linkedin.common.ChangeAuditStamps{/**Dataset this schema metadata is associated with.*/dataset:optional com.linkedin.common.DatasetUrn/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in host").append("ing schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}}{namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes com.linkedin.common.ChangeAuditStamps{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional com.linkedin.common.GlobalTags/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional com.linkedin.common.GlossaryTerms}]}}com.linkedin.common.GlobalTags,com.linkedin.common.GlossaryTerms{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.dataset/**Details about a View. \ne.g. Gets activated when subTypes is view*/@Aspect.name=\"viewProperties\"record ViewProperties{/**Whether the view is materialized*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}materialized:boolean/**The view logic*/viewLogic:string/**The formatted view logic. This is particularly used for SQL sources, where the SQL\nlogic is formatted for better readability, and with dbt, where this contains the\ncompiled SQL logic.*/formattedViewLogic:optional string/**The view logic language / dialect*/viewLanguage:string}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]").toString(), SchemaFormatType.PDL));
    private com.linkedin.metadata.key.DatasetKey _datasetKeyMember = null;
    private com.linkedin.dataset.DatasetProperties _datasetPropertiesMember = null;
    private com.linkedin.dataset.EditableDatasetProperties _editableDatasetPropertiesMember = null;
    private com.linkedin.dataset.DatasetDeprecation _datasetDeprecationMember = null;
    private com.linkedin.dataset.DatasetUpstreamLineage _datasetUpstreamLineageMember = null;
    private com.linkedin.dataset.UpstreamLineage _upstreamLineageMember = null;
    private com.linkedin.common.InstitutionalMemory _institutionalMemoryMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.schema.SchemaMetadata _schemaMetadataMember = null;
    private com.linkedin.schema.EditableSchemaMetadata _editableSchemaMetadataMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.GlossaryTerms _glossaryTermsMember = null;
    private com.linkedin.common.BrowsePaths _browsePathsMember = null;
    private com.linkedin.common.DataPlatformInstance _dataPlatformInstanceMember = null;
    private com.linkedin.dataset.ViewProperties _viewPropertiesMember = null;
    private com.linkedin.common.BrowsePathsV2 _browsePathsV2Member = null;
    private DatasetAspect.ChangeListener __changeListener = new DatasetAspect.ChangeListener(this);
    private final static DataSchema MEMBER_DatasetKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DatasetKey");
    public final static String MEMBERKEY_DatasetKey = "com.linkedin.metadata.key.DatasetKey";
    private final static DataSchema MEMBER_DatasetProperties = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetProperties");
    public final static String MEMBERKEY_DatasetProperties = "com.linkedin.dataset.DatasetProperties";
    private final static DataSchema MEMBER_EditableDatasetProperties = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.EditableDatasetProperties");
    public final static String MEMBERKEY_EditableDatasetProperties = "com.linkedin.dataset.EditableDatasetProperties";
    private final static DataSchema MEMBER_DatasetDeprecation = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetDeprecation");
    public final static String MEMBERKEY_DatasetDeprecation = "com.linkedin.dataset.DatasetDeprecation";
    private final static DataSchema MEMBER_DatasetUpstreamLineage = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetUpstreamLineage");
    public final static String MEMBERKEY_DatasetUpstreamLineage = "com.linkedin.dataset.DatasetUpstreamLineage";
    private final static DataSchema MEMBER_UpstreamLineage = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.UpstreamLineage");
    public final static String MEMBERKEY_UpstreamLineage = "com.linkedin.dataset.UpstreamLineage";
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    public final static String MEMBERKEY_InstitutionalMemory = "com.linkedin.common.InstitutionalMemory";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static DataSchema MEMBER_SchemaMetadata = SCHEMA.getTypeByMemberKey("com.linkedin.schema.SchemaMetadata");
    public final static String MEMBERKEY_SchemaMetadata = "com.linkedin.schema.SchemaMetadata";
    private final static DataSchema MEMBER_EditableSchemaMetadata = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EditableSchemaMetadata");
    public final static String MEMBERKEY_EditableSchemaMetadata = "com.linkedin.schema.EditableSchemaMetadata";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_GlossaryTerms = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlossaryTerms");
    public final static String MEMBERKEY_GlossaryTerms = "com.linkedin.common.GlossaryTerms";
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    public final static String MEMBERKEY_BrowsePaths = "com.linkedin.common.BrowsePaths";
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    public final static String MEMBERKEY_DataPlatformInstance = "com.linkedin.common.DataPlatformInstance";
    private final static DataSchema MEMBER_ViewProperties = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.ViewProperties");
    public final static String MEMBERKEY_ViewProperties = "com.linkedin.dataset.ViewProperties";
    private final static DataSchema MEMBER_BrowsePathsV2 = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePathsV2");
    public final static String MEMBERKEY_BrowsePathsV2 = "com.linkedin.common.BrowsePathsV2";
    private final static TyperefInfo TYPEREFINFO = new DatasetAspect.UnionTyperefInfo();

    public DatasetAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DatasetAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DatasetAspect create(com.linkedin.metadata.key.DatasetKey value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setDatasetKey(value);
        return newUnion;
    }

    public boolean isDatasetKey() {
        return memberIs("com.linkedin.metadata.key.DatasetKey");
    }

    public com.linkedin.metadata.key.DatasetKey getDatasetKey() {
        checkNotNull();
        if (_datasetKeyMember!= null) {
            return _datasetKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DatasetKey");
        _datasetKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DatasetKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _datasetKeyMember;
    }

    public void setDatasetKey(com.linkedin.metadata.key.DatasetKey value) {
        checkNotNull();
        super._map.clear();
        _datasetKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DatasetKey", value.data());
    }

    public static DatasetAspect create(com.linkedin.dataset.DatasetProperties value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setDatasetProperties(value);
        return newUnion;
    }

    public boolean isDatasetProperties() {
        return memberIs("com.linkedin.dataset.DatasetProperties");
    }

    public com.linkedin.dataset.DatasetProperties getDatasetProperties() {
        checkNotNull();
        if (_datasetPropertiesMember!= null) {
            return _datasetPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataset.DatasetProperties");
        _datasetPropertiesMember = ((__rawValue == null)?null:new com.linkedin.dataset.DatasetProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _datasetPropertiesMember;
    }

    public void setDatasetProperties(com.linkedin.dataset.DatasetProperties value) {
        checkNotNull();
        super._map.clear();
        _datasetPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataset.DatasetProperties", value.data());
    }

    public static DatasetAspect create(com.linkedin.dataset.EditableDatasetProperties value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setEditableDatasetProperties(value);
        return newUnion;
    }

    public boolean isEditableDatasetProperties() {
        return memberIs("com.linkedin.dataset.EditableDatasetProperties");
    }

    public com.linkedin.dataset.EditableDatasetProperties getEditableDatasetProperties() {
        checkNotNull();
        if (_editableDatasetPropertiesMember!= null) {
            return _editableDatasetPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataset.EditableDatasetProperties");
        _editableDatasetPropertiesMember = ((__rawValue == null)?null:new com.linkedin.dataset.EditableDatasetProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _editableDatasetPropertiesMember;
    }

    public void setEditableDatasetProperties(com.linkedin.dataset.EditableDatasetProperties value) {
        checkNotNull();
        super._map.clear();
        _editableDatasetPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataset.EditableDatasetProperties", value.data());
    }

    public static DatasetAspect create(com.linkedin.dataset.DatasetDeprecation value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setDatasetDeprecation(value);
        return newUnion;
    }

    public boolean isDatasetDeprecation() {
        return memberIs("com.linkedin.dataset.DatasetDeprecation");
    }

    public com.linkedin.dataset.DatasetDeprecation getDatasetDeprecation() {
        checkNotNull();
        if (_datasetDeprecationMember!= null) {
            return _datasetDeprecationMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataset.DatasetDeprecation");
        _datasetDeprecationMember = ((__rawValue == null)?null:new com.linkedin.dataset.DatasetDeprecation(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _datasetDeprecationMember;
    }

    public void setDatasetDeprecation(com.linkedin.dataset.DatasetDeprecation value) {
        checkNotNull();
        super._map.clear();
        _datasetDeprecationMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataset.DatasetDeprecation", value.data());
    }

    public static DatasetAspect create(com.linkedin.dataset.DatasetUpstreamLineage value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setDatasetUpstreamLineage(value);
        return newUnion;
    }

    public boolean isDatasetUpstreamLineage() {
        return memberIs("com.linkedin.dataset.DatasetUpstreamLineage");
    }

    public com.linkedin.dataset.DatasetUpstreamLineage getDatasetUpstreamLineage() {
        checkNotNull();
        if (_datasetUpstreamLineageMember!= null) {
            return _datasetUpstreamLineageMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataset.DatasetUpstreamLineage");
        _datasetUpstreamLineageMember = ((__rawValue == null)?null:new com.linkedin.dataset.DatasetUpstreamLineage(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _datasetUpstreamLineageMember;
    }

    public void setDatasetUpstreamLineage(com.linkedin.dataset.DatasetUpstreamLineage value) {
        checkNotNull();
        super._map.clear();
        _datasetUpstreamLineageMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataset.DatasetUpstreamLineage", value.data());
    }

    public static DatasetAspect create(com.linkedin.dataset.UpstreamLineage value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setUpstreamLineage(value);
        return newUnion;
    }

    public boolean isUpstreamLineage() {
        return memberIs("com.linkedin.dataset.UpstreamLineage");
    }

    public com.linkedin.dataset.UpstreamLineage getUpstreamLineage() {
        checkNotNull();
        if (_upstreamLineageMember!= null) {
            return _upstreamLineageMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataset.UpstreamLineage");
        _upstreamLineageMember = ((__rawValue == null)?null:new com.linkedin.dataset.UpstreamLineage(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _upstreamLineageMember;
    }

    public void setUpstreamLineage(com.linkedin.dataset.UpstreamLineage value) {
        checkNotNull();
        super._map.clear();
        _upstreamLineageMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataset.UpstreamLineage", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.InstitutionalMemory value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setInstitutionalMemory(value);
        return newUnion;
    }

    public boolean isInstitutionalMemory() {
        return memberIs("com.linkedin.common.InstitutionalMemory");
    }

    public com.linkedin.common.InstitutionalMemory getInstitutionalMemory() {
        checkNotNull();
        if (_institutionalMemoryMember!= null) {
            return _institutionalMemoryMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.InstitutionalMemory");
        _institutionalMemoryMember = ((__rawValue == null)?null:new com.linkedin.common.InstitutionalMemory(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _institutionalMemoryMember;
    }

    public void setInstitutionalMemory(com.linkedin.common.InstitutionalMemory value) {
        checkNotNull();
        super._map.clear();
        _institutionalMemoryMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.InstitutionalMemory", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.Ownership value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setOwnership(value);
        return newUnion;
    }

    public boolean isOwnership() {
        return memberIs("com.linkedin.common.Ownership");
    }

    public com.linkedin.common.Ownership getOwnership() {
        checkNotNull();
        if (_ownershipMember!= null) {
            return _ownershipMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.Ownership");
        _ownershipMember = ((__rawValue == null)?null:new com.linkedin.common.Ownership(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _ownershipMember;
    }

    public void setOwnership(com.linkedin.common.Ownership value) {
        checkNotNull();
        super._map.clear();
        _ownershipMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.Ownership", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.Status value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setStatus(value);
        return newUnion;
    }

    public boolean isStatus() {
        return memberIs("com.linkedin.common.Status");
    }

    public com.linkedin.common.Status getStatus() {
        checkNotNull();
        if (_statusMember!= null) {
            return _statusMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.Status");
        _statusMember = ((__rawValue == null)?null:new com.linkedin.common.Status(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _statusMember;
    }

    public void setStatus(com.linkedin.common.Status value) {
        checkNotNull();
        super._map.clear();
        _statusMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.Status", value.data());
    }

    public static DatasetAspect create(com.linkedin.schema.SchemaMetadata value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setSchemaMetadata(value);
        return newUnion;
    }

    public boolean isSchemaMetadata() {
        return memberIs("com.linkedin.schema.SchemaMetadata");
    }

    public com.linkedin.schema.SchemaMetadata getSchemaMetadata() {
        checkNotNull();
        if (_schemaMetadataMember!= null) {
            return _schemaMetadataMember;
        }
        Object __rawValue = super._map.get("com.linkedin.schema.SchemaMetadata");
        _schemaMetadataMember = ((__rawValue == null)?null:new com.linkedin.schema.SchemaMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _schemaMetadataMember;
    }

    public void setSchemaMetadata(com.linkedin.schema.SchemaMetadata value) {
        checkNotNull();
        super._map.clear();
        _schemaMetadataMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.SchemaMetadata", value.data());
    }

    public static DatasetAspect create(com.linkedin.schema.EditableSchemaMetadata value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setEditableSchemaMetadata(value);
        return newUnion;
    }

    public boolean isEditableSchemaMetadata() {
        return memberIs("com.linkedin.schema.EditableSchemaMetadata");
    }

    public com.linkedin.schema.EditableSchemaMetadata getEditableSchemaMetadata() {
        checkNotNull();
        if (_editableSchemaMetadataMember!= null) {
            return _editableSchemaMetadataMember;
        }
        Object __rawValue = super._map.get("com.linkedin.schema.EditableSchemaMetadata");
        _editableSchemaMetadataMember = ((__rawValue == null)?null:new com.linkedin.schema.EditableSchemaMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _editableSchemaMetadataMember;
    }

    public void setEditableSchemaMetadata(com.linkedin.schema.EditableSchemaMetadata value) {
        checkNotNull();
        super._map.clear();
        _editableSchemaMetadataMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.schema.EditableSchemaMetadata", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.GlobalTags value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setGlobalTags(value);
        return newUnion;
    }

    public boolean isGlobalTags() {
        return memberIs("com.linkedin.common.GlobalTags");
    }

    public com.linkedin.common.GlobalTags getGlobalTags() {
        checkNotNull();
        if (_globalTagsMember!= null) {
            return _globalTagsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.GlobalTags");
        _globalTagsMember = ((__rawValue == null)?null:new com.linkedin.common.GlobalTags(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _globalTagsMember;
    }

    public void setGlobalTags(com.linkedin.common.GlobalTags value) {
        checkNotNull();
        super._map.clear();
        _globalTagsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.GlobalTags", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.GlossaryTerms value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setGlossaryTerms(value);
        return newUnion;
    }

    public boolean isGlossaryTerms() {
        return memberIs("com.linkedin.common.GlossaryTerms");
    }

    public com.linkedin.common.GlossaryTerms getGlossaryTerms() {
        checkNotNull();
        if (_glossaryTermsMember!= null) {
            return _glossaryTermsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.GlossaryTerms");
        _glossaryTermsMember = ((__rawValue == null)?null:new com.linkedin.common.GlossaryTerms(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _glossaryTermsMember;
    }

    public void setGlossaryTerms(com.linkedin.common.GlossaryTerms value) {
        checkNotNull();
        super._map.clear();
        _glossaryTermsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.GlossaryTerms", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.BrowsePaths value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setBrowsePaths(value);
        return newUnion;
    }

    public boolean isBrowsePaths() {
        return memberIs("com.linkedin.common.BrowsePaths");
    }

    public com.linkedin.common.BrowsePaths getBrowsePaths() {
        checkNotNull();
        if (_browsePathsMember!= null) {
            return _browsePathsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.BrowsePaths");
        _browsePathsMember = ((__rawValue == null)?null:new com.linkedin.common.BrowsePaths(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _browsePathsMember;
    }

    public void setBrowsePaths(com.linkedin.common.BrowsePaths value) {
        checkNotNull();
        super._map.clear();
        _browsePathsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.BrowsePaths", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.DataPlatformInstance value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setDataPlatformInstance(value);
        return newUnion;
    }

    public boolean isDataPlatformInstance() {
        return memberIs("com.linkedin.common.DataPlatformInstance");
    }

    public com.linkedin.common.DataPlatformInstance getDataPlatformInstance() {
        checkNotNull();
        if (_dataPlatformInstanceMember!= null) {
            return _dataPlatformInstanceMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.DataPlatformInstance");
        _dataPlatformInstanceMember = ((__rawValue == null)?null:new com.linkedin.common.DataPlatformInstance(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataPlatformInstanceMember;
    }

    public void setDataPlatformInstance(com.linkedin.common.DataPlatformInstance value) {
        checkNotNull();
        super._map.clear();
        _dataPlatformInstanceMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.DataPlatformInstance", value.data());
    }

    public static DatasetAspect create(com.linkedin.dataset.ViewProperties value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setViewProperties(value);
        return newUnion;
    }

    public boolean isViewProperties() {
        return memberIs("com.linkedin.dataset.ViewProperties");
    }

    public com.linkedin.dataset.ViewProperties getViewProperties() {
        checkNotNull();
        if (_viewPropertiesMember!= null) {
            return _viewPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataset.ViewProperties");
        _viewPropertiesMember = ((__rawValue == null)?null:new com.linkedin.dataset.ViewProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _viewPropertiesMember;
    }

    public void setViewProperties(com.linkedin.dataset.ViewProperties value) {
        checkNotNull();
        super._map.clear();
        _viewPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataset.ViewProperties", value.data());
    }

    public static DatasetAspect create(com.linkedin.common.BrowsePathsV2 value) {
        DatasetAspect newUnion = new DatasetAspect();
        newUnion.setBrowsePathsV2(value);
        return newUnion;
    }

    public boolean isBrowsePathsV2() {
        return memberIs("com.linkedin.common.BrowsePathsV2");
    }

    public com.linkedin.common.BrowsePathsV2 getBrowsePathsV2() {
        checkNotNull();
        if (_browsePathsV2Member!= null) {
            return _browsePathsV2Member;
        }
        Object __rawValue = super._map.get("com.linkedin.common.BrowsePathsV2");
        _browsePathsV2Member = ((__rawValue == null)?null:new com.linkedin.common.BrowsePathsV2(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _browsePathsV2Member;
    }

    public void setBrowsePathsV2(com.linkedin.common.BrowsePathsV2 value) {
        checkNotNull();
        super._map.clear();
        _browsePathsV2Member = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.BrowsePathsV2", value.data());
    }

    public static DatasetAspect.ProjectionMask createMask() {
        return new DatasetAspect.ProjectionMask();
    }

    @Override
    public DatasetAspect clone()
        throws CloneNotSupportedException
    {
        DatasetAspect __clone = ((DatasetAspect) super.clone());
        __clone.__changeListener = new DatasetAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetAspect copy()
        throws CloneNotSupportedException
    {
        DatasetAspect __copy = ((DatasetAspect) super.copy());
        __copy._datasetPropertiesMember = null;
        __copy._globalTagsMember = null;
        __copy._browsePathsMember = null;
        __copy._dataPlatformInstanceMember = null;
        __copy._browsePathsV2Member = null;
        __copy._ownershipMember = null;
        __copy._glossaryTermsMember = null;
        __copy._datasetKeyMember = null;
        __copy._institutionalMemoryMember = null;
        __copy._editableSchemaMetadataMember = null;
        __copy._editableDatasetPropertiesMember = null;
        __copy._upstreamLineageMember = null;
        __copy._datasetDeprecationMember = null;
        __copy._viewPropertiesMember = null;
        __copy._datasetUpstreamLineageMember = null;
        __copy._schemaMetadataMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new DatasetAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetAspect __objectRef;

        private ChangeListener(DatasetAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.dataset.DatasetProperties":
                    __objectRef._datasetPropertiesMember = null;
                    break;
                case "com.linkedin.common.GlobalTags":
                    __objectRef._globalTagsMember = null;
                    break;
                case "com.linkedin.common.BrowsePaths":
                    __objectRef._browsePathsMember = null;
                    break;
                case "com.linkedin.common.DataPlatformInstance":
                    __objectRef._dataPlatformInstanceMember = null;
                    break;
                case "com.linkedin.common.BrowsePathsV2":
                    __objectRef._browsePathsV2Member = null;
                    break;
                case "com.linkedin.common.Ownership":
                    __objectRef._ownershipMember = null;
                    break;
                case "com.linkedin.common.GlossaryTerms":
                    __objectRef._glossaryTermsMember = null;
                    break;
                case "com.linkedin.metadata.key.DatasetKey":
                    __objectRef._datasetKeyMember = null;
                    break;
                case "com.linkedin.common.InstitutionalMemory":
                    __objectRef._institutionalMemoryMember = null;
                    break;
                case "com.linkedin.schema.EditableSchemaMetadata":
                    __objectRef._editableSchemaMetadataMember = null;
                    break;
                case "com.linkedin.dataset.EditableDatasetProperties":
                    __objectRef._editableDatasetPropertiesMember = null;
                    break;
                case "com.linkedin.dataset.UpstreamLineage":
                    __objectRef._upstreamLineageMember = null;
                    break;
                case "com.linkedin.dataset.DatasetDeprecation":
                    __objectRef._datasetDeprecationMember = null;
                    break;
                case "com.linkedin.dataset.ViewProperties":
                    __objectRef._viewPropertiesMember = null;
                    break;
                case "com.linkedin.dataset.DatasetUpstreamLineage":
                    __objectRef._datasetUpstreamLineageMember = null;
                    break;
                case "com.linkedin.schema.SchemaMetadata":
                    __objectRef._schemaMetadataMember = null;
                    break;
                case "com.linkedin.common.Status":
                    __objectRef._statusMember = null;
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

        public com.linkedin.metadata.key.DatasetKey.Fields DatasetKey() {
            return new com.linkedin.metadata.key.DatasetKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DatasetKey");
        }

        public com.linkedin.dataset.DatasetProperties.Fields DatasetProperties() {
            return new com.linkedin.dataset.DatasetProperties.Fields(getPathComponents(), "com.linkedin.dataset.DatasetProperties");
        }

        public com.linkedin.dataset.EditableDatasetProperties.Fields EditableDatasetProperties() {
            return new com.linkedin.dataset.EditableDatasetProperties.Fields(getPathComponents(), "com.linkedin.dataset.EditableDatasetProperties");
        }

        public com.linkedin.dataset.DatasetDeprecation.Fields DatasetDeprecation() {
            return new com.linkedin.dataset.DatasetDeprecation.Fields(getPathComponents(), "com.linkedin.dataset.DatasetDeprecation");
        }

        public com.linkedin.dataset.DatasetUpstreamLineage.Fields DatasetUpstreamLineage() {
            return new com.linkedin.dataset.DatasetUpstreamLineage.Fields(getPathComponents(), "com.linkedin.dataset.DatasetUpstreamLineage");
        }

        public com.linkedin.dataset.UpstreamLineage.Fields UpstreamLineage() {
            return new com.linkedin.dataset.UpstreamLineage.Fields(getPathComponents(), "com.linkedin.dataset.UpstreamLineage");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.schema.SchemaMetadata.Fields SchemaMetadata() {
            return new com.linkedin.schema.SchemaMetadata.Fields(getPathComponents(), "com.linkedin.schema.SchemaMetadata");
        }

        public com.linkedin.schema.EditableSchemaMetadata.Fields EditableSchemaMetadata() {
            return new com.linkedin.schema.EditableSchemaMetadata.Fields(getPathComponents(), "com.linkedin.schema.EditableSchemaMetadata");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.GlossaryTerms.Fields GlossaryTerms() {
            return new com.linkedin.common.GlossaryTerms.Fields(getPathComponents(), "com.linkedin.common.GlossaryTerms");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

        public com.linkedin.dataset.ViewProperties.Fields ViewProperties() {
            return new com.linkedin.dataset.ViewProperties.Fields(getPathComponents(), "com.linkedin.dataset.ViewProperties");
        }

        public com.linkedin.common.BrowsePathsV2.Fields BrowsePathsV2() {
            return new com.linkedin.common.BrowsePathsV2.Fields(getPathComponents(), "com.linkedin.common.BrowsePathsV2");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.DatasetKey.ProjectionMask _DatasetKeyMask;
        private com.linkedin.dataset.DatasetProperties.ProjectionMask _DatasetPropertiesMask;
        private com.linkedin.dataset.EditableDatasetProperties.ProjectionMask _EditableDatasetPropertiesMask;
        private com.linkedin.dataset.DatasetDeprecation.ProjectionMask _DatasetDeprecationMask;
        private com.linkedin.dataset.DatasetUpstreamLineage.ProjectionMask _DatasetUpstreamLineageMask;
        private com.linkedin.dataset.UpstreamLineage.ProjectionMask _UpstreamLineageMask;
        private com.linkedin.common.InstitutionalMemory.ProjectionMask _InstitutionalMemoryMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;
        private com.linkedin.schema.SchemaMetadata.ProjectionMask _SchemaMetadataMask;
        private com.linkedin.schema.EditableSchemaMetadata.ProjectionMask _EditableSchemaMetadataMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.GlossaryTerms.ProjectionMask _GlossaryTermsMask;
        private com.linkedin.common.BrowsePaths.ProjectionMask _BrowsePathsMask;
        private com.linkedin.common.DataPlatformInstance.ProjectionMask _DataPlatformInstanceMask;
        private com.linkedin.dataset.ViewProperties.ProjectionMask _ViewPropertiesMask;
        private com.linkedin.common.BrowsePathsV2.ProjectionMask _BrowsePathsV2Mask;

        ProjectionMask() {
        }

        public DatasetAspect.ProjectionMask withDatasetKey(Function<com.linkedin.metadata.key.DatasetKey.ProjectionMask, com.linkedin.metadata.key.DatasetKey.ProjectionMask> nestedMask) {
            _DatasetKeyMask = nestedMask.apply(((_DatasetKeyMask == null)?com.linkedin.metadata.key.DatasetKey.createMask():_DatasetKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DatasetKey", _DatasetKeyMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withDatasetProperties(Function<com.linkedin.dataset.DatasetProperties.ProjectionMask, com.linkedin.dataset.DatasetProperties.ProjectionMask> nestedMask) {
            _DatasetPropertiesMask = nestedMask.apply(((_DatasetPropertiesMask == null)?com.linkedin.dataset.DatasetProperties.createMask():_DatasetPropertiesMask));
            getDataMap().put("com.linkedin.dataset.DatasetProperties", _DatasetPropertiesMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withEditableDatasetProperties(Function<com.linkedin.dataset.EditableDatasetProperties.ProjectionMask, com.linkedin.dataset.EditableDatasetProperties.ProjectionMask> nestedMask) {
            _EditableDatasetPropertiesMask = nestedMask.apply(((_EditableDatasetPropertiesMask == null)?com.linkedin.dataset.EditableDatasetProperties.createMask():_EditableDatasetPropertiesMask));
            getDataMap().put("com.linkedin.dataset.EditableDatasetProperties", _EditableDatasetPropertiesMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withDatasetDeprecation(Function<com.linkedin.dataset.DatasetDeprecation.ProjectionMask, com.linkedin.dataset.DatasetDeprecation.ProjectionMask> nestedMask) {
            _DatasetDeprecationMask = nestedMask.apply(((_DatasetDeprecationMask == null)?com.linkedin.dataset.DatasetDeprecation.createMask():_DatasetDeprecationMask));
            getDataMap().put("com.linkedin.dataset.DatasetDeprecation", _DatasetDeprecationMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withDatasetUpstreamLineage(Function<com.linkedin.dataset.DatasetUpstreamLineage.ProjectionMask, com.linkedin.dataset.DatasetUpstreamLineage.ProjectionMask> nestedMask) {
            _DatasetUpstreamLineageMask = nestedMask.apply(((_DatasetUpstreamLineageMask == null)?com.linkedin.dataset.DatasetUpstreamLineage.createMask():_DatasetUpstreamLineageMask));
            getDataMap().put("com.linkedin.dataset.DatasetUpstreamLineage", _DatasetUpstreamLineageMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withUpstreamLineage(Function<com.linkedin.dataset.UpstreamLineage.ProjectionMask, com.linkedin.dataset.UpstreamLineage.ProjectionMask> nestedMask) {
            _UpstreamLineageMask = nestedMask.apply(((_UpstreamLineageMask == null)?com.linkedin.dataset.UpstreamLineage.createMask():_UpstreamLineageMask));
            getDataMap().put("com.linkedin.dataset.UpstreamLineage", _UpstreamLineageMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withInstitutionalMemory(Function<com.linkedin.common.InstitutionalMemory.ProjectionMask, com.linkedin.common.InstitutionalMemory.ProjectionMask> nestedMask) {
            _InstitutionalMemoryMask = nestedMask.apply(((_InstitutionalMemoryMask == null)?com.linkedin.common.InstitutionalMemory.createMask():_InstitutionalMemoryMask));
            getDataMap().put("com.linkedin.common.InstitutionalMemory", _InstitutionalMemoryMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withSchemaMetadata(Function<com.linkedin.schema.SchemaMetadata.ProjectionMask, com.linkedin.schema.SchemaMetadata.ProjectionMask> nestedMask) {
            _SchemaMetadataMask = nestedMask.apply(((_SchemaMetadataMask == null)?com.linkedin.schema.SchemaMetadata.createMask():_SchemaMetadataMask));
            getDataMap().put("com.linkedin.schema.SchemaMetadata", _SchemaMetadataMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withEditableSchemaMetadata(Function<com.linkedin.schema.EditableSchemaMetadata.ProjectionMask, com.linkedin.schema.EditableSchemaMetadata.ProjectionMask> nestedMask) {
            _EditableSchemaMetadataMask = nestedMask.apply(((_EditableSchemaMetadataMask == null)?com.linkedin.schema.EditableSchemaMetadata.createMask():_EditableSchemaMetadataMask));
            getDataMap().put("com.linkedin.schema.EditableSchemaMetadata", _EditableSchemaMetadataMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withGlossaryTerms(Function<com.linkedin.common.GlossaryTerms.ProjectionMask, com.linkedin.common.GlossaryTerms.ProjectionMask> nestedMask) {
            _GlossaryTermsMask = nestedMask.apply(((_GlossaryTermsMask == null)?com.linkedin.common.GlossaryTerms.createMask():_GlossaryTermsMask));
            getDataMap().put("com.linkedin.common.GlossaryTerms", _GlossaryTermsMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withBrowsePaths(Function<com.linkedin.common.BrowsePaths.ProjectionMask, com.linkedin.common.BrowsePaths.ProjectionMask> nestedMask) {
            _BrowsePathsMask = nestedMask.apply(((_BrowsePathsMask == null)?com.linkedin.common.BrowsePaths.createMask():_BrowsePathsMask));
            getDataMap().put("com.linkedin.common.BrowsePaths", _BrowsePathsMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withDataPlatformInstance(Function<com.linkedin.common.DataPlatformInstance.ProjectionMask, com.linkedin.common.DataPlatformInstance.ProjectionMask> nestedMask) {
            _DataPlatformInstanceMask = nestedMask.apply(((_DataPlatformInstanceMask == null)?com.linkedin.common.DataPlatformInstance.createMask():_DataPlatformInstanceMask));
            getDataMap().put("com.linkedin.common.DataPlatformInstance", _DataPlatformInstanceMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withViewProperties(Function<com.linkedin.dataset.ViewProperties.ProjectionMask, com.linkedin.dataset.ViewProperties.ProjectionMask> nestedMask) {
            _ViewPropertiesMask = nestedMask.apply(((_ViewPropertiesMask == null)?com.linkedin.dataset.ViewProperties.createMask():_ViewPropertiesMask));
            getDataMap().put("com.linkedin.dataset.ViewProperties", _ViewPropertiesMask.getDataMap());
            return this;
        }

        public DatasetAspect.ProjectionMask withBrowsePathsV2(Function<com.linkedin.common.BrowsePathsV2.ProjectionMask, com.linkedin.common.BrowsePathsV2.ProjectionMask> nestedMask) {
            _BrowsePathsV2Mask = nestedMask.apply(((_BrowsePathsV2Mask == null)?com.linkedin.common.BrowsePathsV2 .createMask():_BrowsePathsV2Mask));
            getDataMap().put("com.linkedin.common.BrowsePathsV2", _BrowsePathsV2Mask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a Dataset
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Dataset*/typeref DatasetAspect=union[{namespace com.linkedin.metadata.key/**Key for a Dataset*/@Aspect.name=\"datasetKey\"record DatasetKey{/**Data platform urn associated with the dataset*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"URN\"}platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique guid for dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"searchLabel\":\"origin\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Display name of the Dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Fully-qualified name of the Dataset*/@Searchable={\"addToFilters\":false,\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:optional string/**Documentation of the dataset*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/@deprecated=\"Use ExternalReference.externalUrl field instead.\"uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.\nThis is now deprecated.*/@deprecated=\"Use GlobalTags aspect instead.\"tags:array[string]=[]}}{namespace com.linkedin.dataset/**EditableDatasetProperties stores editable changes made to dataset properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableDatasetProperties\"record EditableDatasetProperties includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Documentation of the dataset*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Editable display name of the Dataset*/@Searchable={\"fieldName\":\"editedName\",\"fieldType\":\"TEXT_PARTIAL\"}name:optional string}}{namespace com.linkedin.dataset/**Dataset deprecation status\nDeprecated! This aspect is deprecated in favor of the more-general-purpose 'Deprecation' aspect.*/@Aspect.name=\"datasetDeprecation\"@Deprecated,record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional com.linkedin.common.Urn}}{namespace com.linkedin.dataset/**Fine Grained upstream lineage for fields in a dataset*/@Aspect.name=\"datasetUpstreamLineage\"@deprecated=\"use UpstreamLineage.fineGrainedLineages instead\"record DatasetUpstreamLineage{/**Upstream to downstream field level lineage mappings*/fieldMappings:array[/**Representation of mapping between fields in source dataset to the field in destination dataset*/@deprecated=\"use FineGrainedLineage instead\"record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:AuditStamp/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/@deprecated=\"refer FineGrainedLineage for alternative representation\"typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}]}}{namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.*/auditStamp:com.linkedin.common.AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**Audit stamp containing who created the lineage and when.*/created:optional com.linkedin.common.AuditStamp/**The upstream dataset the lineage points to*/@Relationship={\"createdActor\":\"upstreams/*/created/actor\",\"createdOn\":\"upstreams/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"upstreams/*/properties\",\"updatedActor\":\"upstreams/*/auditStamp/actor\",\"updatedOn\":\"upstreams/*/auditStamp/time\",\"via\":\"upstreams/*/query\"}@Searchable={\"fieldName\":\"upstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasUpstreams\",\"queryByDefault\":false}dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]/**If the lineage is generated by a query, a reference to the query*/query:optional com.linkedin.common.Urn}]/** List of fine-grained lineage information, including field-level lineage*/@Relationship.`/*/upstreams/*`={\"entityTypes\":[\"dataset\",\"schemaField\"],\"name\":\"DownstreamOf\"}fineGrainedLineages:optional array[/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}com.linkedin.common.ChangeAuditStamps{/**Dataset this schema metadata is associated with.*/dataset:optional com.linkedin.common.DatasetUrn/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) S").append("chemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}}{namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes com.linkedin.common.ChangeAuditStamps{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional com.linkedin.common.GlobalTags/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional com.linkedin.common.GlossaryTerms}]}}com.linkedin.common.GlobalTags,com.linkedin.common.GlossaryTerms{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.dataset/**Details about a View. \ne.g. Gets activated when subTypes is view*/@Aspect.name=\"viewProperties\"record ViewProperties{/**Whether the view is materialized*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}materialized:boolean/**The view logic*/viewLogic:string/**The formatted view logic. This is particularly used for SQL sources, where the SQL\nlogic is formatted for better readability, and with dbt, where this contains the\ncompiled SQL logic.*/formattedViewLogic:optional string/**The view logic language / dialect*/viewLanguage:string}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]").toString(), SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
