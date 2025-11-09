
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/DataJobAspect.pdl.")
public class DataJobAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"entityTypes\":[\"dataFlow\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"dataFlow\",\"fieldType\":\"URN_PARTIAL\",\"queryByDefault\":false}flow:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}jobId:string}}{namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Job name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Job description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing flow identifier.\",\"entityType\":\"dataFlow\",\"fields\":[{\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"maxLength\":50,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Unique Identifier of the data flow\",\"maxLength\":200,\"name\":\"flowId\",\"type\":\"string\"},{\"doc\":\"Cluster where the flow is executed\",\"maxLength\":100,\"name\":\"cluster\",\"type\":\"string\"}],\"maxLength\":373,\"name\":\"DataFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataFlowUrn=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Status of the job - Deprecated for Data Process Instance model.*/@deprecated=\"Use Data Process Instance model, instead\"status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN/**Jobs that have been skipped.*/SKIPPED}/**Environment for this job*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing\nDeprecated! Use inputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}@deprecated,inputDatasets:array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**Input datasets consumed by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatasetEdges/*/created/actor\",\"createdOn\":\"inputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputDatasetEdges/*/properties\",\"updatedActor\":\"inputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"inputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputDatasetEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Output datasets produced by the data job during processing\nDeprecated! Use outputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}@deprecated,outputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"outputDatasetEdges/*/created/actor\",\"createdOn\":\"outputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\",\"properties\":\"outputDatasetEdges/*/properties\",\"updatedActor\":\"outputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"outputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"outputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputDatasetEdges:optional array[com.linkedin.common.Edge]/**Input datajobs that this data job depends on\nDeprecated! Use inputDatajobEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\"}@deprecated,inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing job identifier.\",\"entityType\":\"dataJob\",\"fields\":[{\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"doc\":\"Unique identifier of the data job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":594,\"name\":\"DataJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataJobUrn=string}]/**Input datajobs that this data job depends on*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatajobEdges/*/created/actor\",\"createdOn\":\"inputDatajobEdges/*/created/time\",\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"inputDatajobEdges/*/properties\",\"updatedActor\":\"inputDatajobEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatajobEdges/*/lastModified/time\"}inputDatajobEdges:optional array[com.linkedin.common.Edge]/**Fields of the input datasets used by this job*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputFields\",\"queryByDefault\":false}inputDatasetFields:optional array[com.linkedin.common.Urn]/**Fields of the output datasets this job writes to*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputFields\",\"queryByDefault\":false}outputDatasetFields:optional array[com.linkedin.common.Urn]/**Fine-grained column-level lineages\nNot currently supported in the UI\nUse UpstreamLineage aspect for datasets to express Column Level Lineage for the UI*/fineGrainedLineages:optional array[{namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}}]}}{namespace com.linkedin.datajob/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableDataJobProperties\"record EditableDataJobProperties includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Edited documentation of the data job */@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.DataJobKey _dataJobKeyMember = null;
    private com.linkedin.datajob.DataJobInfo _dataJobInfoMember = null;
    private com.linkedin.datajob.DataJobInputOutput _dataJobInputOutputMember = null;
    private com.linkedin.datajob.EditableDataJobProperties _editableDataJobPropertiesMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.BrowsePaths _browsePathsMember = null;
    private com.linkedin.common.GlossaryTerms _glossaryTermsMember = null;
    private com.linkedin.common.InstitutionalMemory _institutionalMemoryMember = null;
    private com.linkedin.common.DataPlatformInstance _dataPlatformInstanceMember = null;
    private com.linkedin.common.BrowsePathsV2 _browsePathsV2Member = null;
    private DataJobAspect.ChangeListener __changeListener = new DataJobAspect.ChangeListener(this);
    private final static DataSchema MEMBER_DataJobKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataJobKey");
    public final static String MEMBERKEY_DataJobKey = "com.linkedin.metadata.key.DataJobKey";
    private final static DataSchema MEMBER_DataJobInfo = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataJobInfo");
    public final static String MEMBERKEY_DataJobInfo = "com.linkedin.datajob.DataJobInfo";
    private final static DataSchema MEMBER_DataJobInputOutput = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataJobInputOutput");
    public final static String MEMBERKEY_DataJobInputOutput = "com.linkedin.datajob.DataJobInputOutput";
    private final static DataSchema MEMBER_EditableDataJobProperties = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.EditableDataJobProperties");
    public final static String MEMBERKEY_EditableDataJobProperties = "com.linkedin.datajob.EditableDataJobProperties";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    public final static String MEMBERKEY_BrowsePaths = "com.linkedin.common.BrowsePaths";
    private final static DataSchema MEMBER_GlossaryTerms = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlossaryTerms");
    public final static String MEMBERKEY_GlossaryTerms = "com.linkedin.common.GlossaryTerms";
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    public final static String MEMBERKEY_InstitutionalMemory = "com.linkedin.common.InstitutionalMemory";
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    public final static String MEMBERKEY_DataPlatformInstance = "com.linkedin.common.DataPlatformInstance";
    private final static DataSchema MEMBER_BrowsePathsV2 = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePathsV2");
    public final static String MEMBERKEY_BrowsePathsV2 = "com.linkedin.common.BrowsePathsV2";
    private final static TyperefInfo TYPEREFINFO = new DataJobAspect.UnionTyperefInfo();

    public DataJobAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataJobAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataJobAspect create(com.linkedin.metadata.key.DataJobKey value) {
        DataJobAspect newUnion = new DataJobAspect();
        newUnion.setDataJobKey(value);
        return newUnion;
    }

    public boolean isDataJobKey() {
        return memberIs("com.linkedin.metadata.key.DataJobKey");
    }

    public com.linkedin.metadata.key.DataJobKey getDataJobKey() {
        checkNotNull();
        if (_dataJobKeyMember!= null) {
            return _dataJobKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DataJobKey");
        _dataJobKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DataJobKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataJobKeyMember;
    }

    public void setDataJobKey(com.linkedin.metadata.key.DataJobKey value) {
        checkNotNull();
        super._map.clear();
        _dataJobKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DataJobKey", value.data());
    }

    public static DataJobAspect create(com.linkedin.datajob.DataJobInfo value) {
        DataJobAspect newUnion = new DataJobAspect();
        newUnion.setDataJobInfo(value);
        return newUnion;
    }

    public boolean isDataJobInfo() {
        return memberIs("com.linkedin.datajob.DataJobInfo");
    }

    public com.linkedin.datajob.DataJobInfo getDataJobInfo() {
        checkNotNull();
        if (_dataJobInfoMember!= null) {
            return _dataJobInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.datajob.DataJobInfo");
        _dataJobInfoMember = ((__rawValue == null)?null:new com.linkedin.datajob.DataJobInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataJobInfoMember;
    }

    public void setDataJobInfo(com.linkedin.datajob.DataJobInfo value) {
        checkNotNull();
        super._map.clear();
        _dataJobInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.datajob.DataJobInfo", value.data());
    }

    public static DataJobAspect create(com.linkedin.datajob.DataJobInputOutput value) {
        DataJobAspect newUnion = new DataJobAspect();
        newUnion.setDataJobInputOutput(value);
        return newUnion;
    }

    public boolean isDataJobInputOutput() {
        return memberIs("com.linkedin.datajob.DataJobInputOutput");
    }

    public com.linkedin.datajob.DataJobInputOutput getDataJobInputOutput() {
        checkNotNull();
        if (_dataJobInputOutputMember!= null) {
            return _dataJobInputOutputMember;
        }
        Object __rawValue = super._map.get("com.linkedin.datajob.DataJobInputOutput");
        _dataJobInputOutputMember = ((__rawValue == null)?null:new com.linkedin.datajob.DataJobInputOutput(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataJobInputOutputMember;
    }

    public void setDataJobInputOutput(com.linkedin.datajob.DataJobInputOutput value) {
        checkNotNull();
        super._map.clear();
        _dataJobInputOutputMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.datajob.DataJobInputOutput", value.data());
    }

    public static DataJobAspect create(com.linkedin.datajob.EditableDataJobProperties value) {
        DataJobAspect newUnion = new DataJobAspect();
        newUnion.setEditableDataJobProperties(value);
        return newUnion;
    }

    public boolean isEditableDataJobProperties() {
        return memberIs("com.linkedin.datajob.EditableDataJobProperties");
    }

    public com.linkedin.datajob.EditableDataJobProperties getEditableDataJobProperties() {
        checkNotNull();
        if (_editableDataJobPropertiesMember!= null) {
            return _editableDataJobPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.datajob.EditableDataJobProperties");
        _editableDataJobPropertiesMember = ((__rawValue == null)?null:new com.linkedin.datajob.EditableDataJobProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _editableDataJobPropertiesMember;
    }

    public void setEditableDataJobProperties(com.linkedin.datajob.EditableDataJobProperties value) {
        checkNotNull();
        super._map.clear();
        _editableDataJobPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.datajob.EditableDataJobProperties", value.data());
    }

    public static DataJobAspect create(com.linkedin.common.Ownership value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.Status value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.GlobalTags value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.BrowsePaths value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.GlossaryTerms value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.InstitutionalMemory value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.DataPlatformInstance value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect create(com.linkedin.common.BrowsePathsV2 value) {
        DataJobAspect newUnion = new DataJobAspect();
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

    public static DataJobAspect.ProjectionMask createMask() {
        return new DataJobAspect.ProjectionMask();
    }

    @Override
    public DataJobAspect clone()
        throws CloneNotSupportedException
    {
        DataJobAspect __clone = ((DataJobAspect) super.clone());
        __clone.__changeListener = new DataJobAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataJobAspect copy()
        throws CloneNotSupportedException
    {
        DataJobAspect __copy = ((DataJobAspect) super.copy());
        __copy._editableDataJobPropertiesMember = null;
        __copy._globalTagsMember = null;
        __copy._browsePathsMember = null;
        __copy._dataPlatformInstanceMember = null;
        __copy._browsePathsV2Member = null;
        __copy._ownershipMember = null;
        __copy._dataJobKeyMember = null;
        __copy._dataJobInputOutputMember = null;
        __copy._dataJobInfoMember = null;
        __copy._glossaryTermsMember = null;
        __copy._institutionalMemoryMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new DataJobAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataJobAspect __objectRef;

        private ChangeListener(DataJobAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.datajob.EditableDataJobProperties":
                    __objectRef._editableDataJobPropertiesMember = null;
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
                case "com.linkedin.metadata.key.DataJobKey":
                    __objectRef._dataJobKeyMember = null;
                    break;
                case "com.linkedin.datajob.DataJobInputOutput":
                    __objectRef._dataJobInputOutputMember = null;
                    break;
                case "com.linkedin.datajob.DataJobInfo":
                    __objectRef._dataJobInfoMember = null;
                    break;
                case "com.linkedin.common.GlossaryTerms":
                    __objectRef._glossaryTermsMember = null;
                    break;
                case "com.linkedin.common.InstitutionalMemory":
                    __objectRef._institutionalMemoryMember = null;
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

        public com.linkedin.metadata.key.DataJobKey.Fields DataJobKey() {
            return new com.linkedin.metadata.key.DataJobKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataJobKey");
        }

        public com.linkedin.datajob.DataJobInfo.Fields DataJobInfo() {
            return new com.linkedin.datajob.DataJobInfo.Fields(getPathComponents(), "com.linkedin.datajob.DataJobInfo");
        }

        public com.linkedin.datajob.DataJobInputOutput.Fields DataJobInputOutput() {
            return new com.linkedin.datajob.DataJobInputOutput.Fields(getPathComponents(), "com.linkedin.datajob.DataJobInputOutput");
        }

        public com.linkedin.datajob.EditableDataJobProperties.Fields EditableDataJobProperties() {
            return new com.linkedin.datajob.EditableDataJobProperties.Fields(getPathComponents(), "com.linkedin.datajob.EditableDataJobProperties");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.common.GlossaryTerms.Fields GlossaryTerms() {
            return new com.linkedin.common.GlossaryTerms.Fields(getPathComponents(), "com.linkedin.common.GlossaryTerms");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

        public com.linkedin.common.BrowsePathsV2.Fields BrowsePathsV2() {
            return new com.linkedin.common.BrowsePathsV2.Fields(getPathComponents(), "com.linkedin.common.BrowsePathsV2");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.DataJobKey.ProjectionMask _DataJobKeyMask;
        private com.linkedin.datajob.DataJobInfo.ProjectionMask _DataJobInfoMask;
        private com.linkedin.datajob.DataJobInputOutput.ProjectionMask _DataJobInputOutputMask;
        private com.linkedin.datajob.EditableDataJobProperties.ProjectionMask _EditableDataJobPropertiesMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.BrowsePaths.ProjectionMask _BrowsePathsMask;
        private com.linkedin.common.GlossaryTerms.ProjectionMask _GlossaryTermsMask;
        private com.linkedin.common.InstitutionalMemory.ProjectionMask _InstitutionalMemoryMask;
        private com.linkedin.common.DataPlatformInstance.ProjectionMask _DataPlatformInstanceMask;
        private com.linkedin.common.BrowsePathsV2.ProjectionMask _BrowsePathsV2Mask;

        ProjectionMask() {
        }

        public DataJobAspect.ProjectionMask withDataJobKey(Function<com.linkedin.metadata.key.DataJobKey.ProjectionMask, com.linkedin.metadata.key.DataJobKey.ProjectionMask> nestedMask) {
            _DataJobKeyMask = nestedMask.apply(((_DataJobKeyMask == null)?com.linkedin.metadata.key.DataJobKey.createMask():_DataJobKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataJobKey", _DataJobKeyMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withDataJobInfo(Function<com.linkedin.datajob.DataJobInfo.ProjectionMask, com.linkedin.datajob.DataJobInfo.ProjectionMask> nestedMask) {
            _DataJobInfoMask = nestedMask.apply(((_DataJobInfoMask == null)?com.linkedin.datajob.DataJobInfo.createMask():_DataJobInfoMask));
            getDataMap().put("com.linkedin.datajob.DataJobInfo", _DataJobInfoMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withDataJobInputOutput(Function<com.linkedin.datajob.DataJobInputOutput.ProjectionMask, com.linkedin.datajob.DataJobInputOutput.ProjectionMask> nestedMask) {
            _DataJobInputOutputMask = nestedMask.apply(((_DataJobInputOutputMask == null)?com.linkedin.datajob.DataJobInputOutput.createMask():_DataJobInputOutputMask));
            getDataMap().put("com.linkedin.datajob.DataJobInputOutput", _DataJobInputOutputMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withEditableDataJobProperties(Function<com.linkedin.datajob.EditableDataJobProperties.ProjectionMask, com.linkedin.datajob.EditableDataJobProperties.ProjectionMask> nestedMask) {
            _EditableDataJobPropertiesMask = nestedMask.apply(((_EditableDataJobPropertiesMask == null)?com.linkedin.datajob.EditableDataJobProperties.createMask():_EditableDataJobPropertiesMask));
            getDataMap().put("com.linkedin.datajob.EditableDataJobProperties", _EditableDataJobPropertiesMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withBrowsePaths(Function<com.linkedin.common.BrowsePaths.ProjectionMask, com.linkedin.common.BrowsePaths.ProjectionMask> nestedMask) {
            _BrowsePathsMask = nestedMask.apply(((_BrowsePathsMask == null)?com.linkedin.common.BrowsePaths.createMask():_BrowsePathsMask));
            getDataMap().put("com.linkedin.common.BrowsePaths", _BrowsePathsMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withGlossaryTerms(Function<com.linkedin.common.GlossaryTerms.ProjectionMask, com.linkedin.common.GlossaryTerms.ProjectionMask> nestedMask) {
            _GlossaryTermsMask = nestedMask.apply(((_GlossaryTermsMask == null)?com.linkedin.common.GlossaryTerms.createMask():_GlossaryTermsMask));
            getDataMap().put("com.linkedin.common.GlossaryTerms", _GlossaryTermsMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withInstitutionalMemory(Function<com.linkedin.common.InstitutionalMemory.ProjectionMask, com.linkedin.common.InstitutionalMemory.ProjectionMask> nestedMask) {
            _InstitutionalMemoryMask = nestedMask.apply(((_InstitutionalMemoryMask == null)?com.linkedin.common.InstitutionalMemory.createMask():_InstitutionalMemoryMask));
            getDataMap().put("com.linkedin.common.InstitutionalMemory", _InstitutionalMemoryMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withDataPlatformInstance(Function<com.linkedin.common.DataPlatformInstance.ProjectionMask, com.linkedin.common.DataPlatformInstance.ProjectionMask> nestedMask) {
            _DataPlatformInstanceMask = nestedMask.apply(((_DataPlatformInstanceMask == null)?com.linkedin.common.DataPlatformInstance.createMask():_DataPlatformInstanceMask));
            getDataMap().put("com.linkedin.common.DataPlatformInstance", _DataPlatformInstanceMask.getDataMap());
            return this;
        }

        public DataJobAspect.ProjectionMask withBrowsePathsV2(Function<com.linkedin.common.BrowsePathsV2.ProjectionMask, com.linkedin.common.BrowsePathsV2.ProjectionMask> nestedMask) {
            _BrowsePathsV2Mask = nestedMask.apply(((_BrowsePathsV2Mask == null)?com.linkedin.common.BrowsePathsV2 .createMask():_BrowsePathsV2Mask));
            getDataMap().put("com.linkedin.common.BrowsePathsV2", _BrowsePathsV2Mask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a Data job
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Data job*/typeref DataJobAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"entityTypes\":[\"dataFlow\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"dataFlow\",\"fieldType\":\"URN_PARTIAL\",\"queryByDefault\":false}flow:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}jobId:string}}{namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Job name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Job description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing flow identifier.\",\"entityType\":\"dataFlow\",\"fields\":[{\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"maxLength\":50,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Unique Identifier of the data flow\",\"maxLength\":200,\"name\":\"flowId\",\"type\":\"string\"},{\"doc\":\"Cluster where the flow is executed\",\"maxLength\":100,\"name\":\"cluster\",\"type\":\"string\"}],\"maxLength\":373,\"name\":\"DataFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataFlowUrn=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Status of the job - Deprecated for Data Process Instance model.*/@deprecated=\"Use Data Process Instance model, instead\"status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN/**Jobs that have been skipped.*/SKIPPED}/**Environment for this job*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing\nDeprecated! Use inputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}@deprecated,inputDatasets:array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**Input datasets consumed by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatasetEdges/*/created/actor\",\"createdOn\":\"inputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputDatasetEdges/*/properties\",\"updatedActor\":\"inputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"inputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputDatasetEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Output datasets produced by the data job during processing\nDeprecated! Use outputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}@deprecated,outputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"outputDatasetEdges/*/created/actor\",\"createdOn\":\"outputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\",\"properties\":\"outputDatasetEdges/*/properties\",\"updatedActor\":\"outputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"outputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"outputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputDatasetEdges:optional array[com.linkedin.common.Edge]/**Input datajobs that this data job depends on\nDeprecated! Use inputDatajobEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\"}@deprecated,inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing job identifier.\",\"entityType\":\"dataJob\",\"fields\":[{\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"doc\":\"Unique identifier of the data job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":594,\"name\":\"DataJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataJobUrn=string}]/**Input datajobs that this data job depends on*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatajobEdges/*/created/actor\",\"createdOn\":\"inputDatajobEdges/*/created/time\",\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"inputDatajobEdges/*/properties\",\"updatedActor\":\"inputDatajobEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatajobEdges/*/lastModified/time\"}inputDatajobEdges:optional array[com.linkedin.common.Edge]/**Fields of the input datasets used by this job*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputFields\",\"queryByDefault\":false}inputDatasetFields:optional array[com.linkedin.common.Urn]/**Fields of the output datasets this job writes to*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputFields\",\"queryByDefault\":false}outputDatasetFields:optional array[com.linkedin.common.Urn]/**Fine-grained column-level lineages\nNot currently supported in the UI\nUse UpstreamLineage aspect for datasets to express Column Level Lineage for the UI*/fineGrainedLineages:optional array[{namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}}]}}{namespace com.linkedin.datajob/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableDataJobProperties\"record EditableDataJobProperties includes{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Edited documentation of the data job */@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
