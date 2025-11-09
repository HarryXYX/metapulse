
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/Aspect.pdl.")
public class Aspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the chart*/@Searchable.searchTier=2,description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}chartUrl:optional com.linkedin.common.Url/**Data sources for the chart\nDeprecated! Use inputEdges instead.*/@Relationship.`/*/string`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]]/**Data sources for the chart*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputEdges/*/created/actor\",\"createdOn\":\"inputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"chart\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputEdges/*/properties\",\"updatedActor\":\"inputEdges/*/lastModified/actor\",\"updatedOn\":\"inputEdges/*/lastModified/time\"}inputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional AuditStamp/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Type of the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Chart Type\",\"searchTier\":3}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT,WORD_CLOUD,COHORT}/**Access level for the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"addToFilters\":true,\"fieldName\":\"queryType\",\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Query Type\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}name:string}}{namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional com.linkedin.common.AuditStamp}}{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"boostScore\":2.0,\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"fieldType\":\"WORD_GRAM\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserEditableInfo\"}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:com.linkedin.common.Url=\"assets/platforms/default_avatar.png\"/**DataHub-native display name*/@Searchable={\"boostScore\":10.0,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}displayName:optional string/**DataHub-native Title, e.g. 'Software Engineer'*/title:optional string/**The platforms that the user commonly works with*/@Relationship.`/*`={\"entityTypes\":[\"dataPlatform\"],\"name\":\"IsUserOf\"}platforms:optional array[com.linkedin.common.Urn]/**The user's persona type, based on their role*/@Relationship={\"entityTypes\":[\"dataHubPersona\"],\"name\":\"IsPersona\"}persona:optional com.linkedin.common.Urn/**Slack handle for the user*/slack:optional string/**Phone number to contact the user*/phone:optional string/**Email address to contact the user*/email:optional string/**Information sources that have been used to populate this CorpUserEditableInfo.\nThese include platform resources, such as Slack members or Looker users.\nThey can also refer to other semantic urns in the future.*/informationSources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserInfo\"}record CorpUserInfo includes com.linkedin.common.CustomProperties{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":2.0}}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email address of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true,\"searchTier\":1}email:optional com.linkedin.common.EmailAddress/**title of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true}title:optional string/**direct manager of this user*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"ReportsTo\"}@Searchable={\"fieldName\":\"managerLdap\",\"fieldType\":\"URN\",\"queryByDefault\":false}managerUrn:optional com.linkedin.common.CorpuserUrn/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string/**Whether the corpUser is a system user.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"queryByDefault\":false}system:optional boolean=false}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/@Searchable.`/time`={\"fieldName\":\"statusLastModifiedAt\",\"fieldType\":\"COUNT\"}lastModified:com.linkedin.common.AuditStamp}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfGroup\"}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for a Dashboard*/@Aspect.name=\"dashboardKey\"record DashboardKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboardId:string}}{namespace com.linkedin.dashboard/**Information about a dashboard*/@Aspect.name=\"dashboardInfo\"record DashboardInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Title of the dashboard*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the dashboard*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:string/**Charts in a dashboard\nDeprecated! Use chartEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"chart\"],\"isLineage\":true,\"name\":\"Contains\"}@deprecated,charts:array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized chart identifier\",\"entityType\":\"chart\",\"fields\":[{\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"maxLength\":20,\"name\":\"dashboardTool\",\"type\":\"string\"},{\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"maxLength\":200,\"name\":\"chartId\",\"type\":\"string\"}],\"maxLength\":236,\"name\":\"Chart\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref ChartUrn=string}]=[]/**Charts in a dashboard*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"chartEdges/*/created/actor\",\"createdOn\":\"chartEdges/*/created/time\",\"entityTypes\":[\"chart\"],\"isLineage\":true,\"name\":\"Contains\",\"properties\":\"chartEdges/*/properties\",\"updatedActor\":\"chartEdges/*/lastModified/actor\",\"updatedOn\":\"chartEdges/*/lastModified/time\"}chartEdges:optional array[com.linkedin.common.Edge]/**Datasets consumed by a dashboard\nDeprecated! Use datasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,datasets:array[com.linkedin.common.Urn]=[]/**Datasets consumed by a dashboard*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"datasetEdges/*/created/actor\",\"createdOn\":\"datasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"datasetEdges/*/properties\",\"updatedActor\":\"datasetEdges/*/lastModified/actor\",\"updatedOn\":\"datasetEdges/*/lastModified/time\"}datasetEdges:optional array[com.linkedin.common.Edge]/**Dashboards included by this dashboard.\nSome dashboard entities (e.g. PowerBI Apps) can contain other dashboards.\n\nThe Edge's sourceUrn should never be set, as it will always be the base dashboard.*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"dashboards/*/created/actor\",\"createdOn\":\"dashboards/*/created/time\",\"entityTypes\":[\"dashboard\"],\"isLineage\":true,\"name\":\"DashboardContainsDashboard\",\"properties\":\"dashboards/*/properties\",\"updatedActor\":\"dashboards/*/lastModified/actor\",\"updatedOn\":\"dashboards/*/lastModified/time\"}dashboards:array[com.linkedin.common.Edge]=[]/**Captures information about who created/last modified/deleted this dashboard and when*/@Searchable.`/lastModified/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:com.linkedin.common.ChangeAuditStamps/**URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}dashboardUrl:optional com.linkedin.common.Url/**Access level for the dashboard*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional com.linkedin.common.AccessLevel/**The time when this dashboard last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.metadata.key/**Key for a Data Flow*/@Aspect.name=\"dataFlowKey\"record DataFlowKey{/**Workflow manager like azkaban, airflow which orchestrates the flow*/@Searchable.fieldType=\"TEXT_PARTIAL\"orchestrator:string/**Unique Identifier of the data flow*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}flowId:string/**Cluster where the flow is executed*/@Searchable.fieldType=\"TEXT_PARTIAL\"cluster:string}}{namespace com.linkedin.datajob/**Information about a Data processing flow*/@Aspect.name=\"dataFlowInfo\"record DataFlowInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Flow name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Flow description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Optional project/namespace associated with the flow*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false,\"searchTier\":3}project:optional string/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:Time/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Environment for this flow*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"entityTypes\":[\"dataFlow\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"dataFlow\",\"fieldType\":\"URN_PARTIAL\",\"queryByDefault\":false}flow:com.linkedin.common.Urn/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}jobId:string}}{namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Job name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Job description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing flow identifier.\",\"entityType\":\"dataFlow\",\"fields\":[{\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"maxLength\":50,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Unique Identifier of the data flow\",\"maxLength\":200,\"name\":\"flowId\",\"type\":\"string\"},{\"doc\":\"Cluster where the flow is executed\",\"maxLength\":100,\"name\":\"cluster\",\"type\":\"string\"}],\"maxLength\":373,\"name\":\"DataFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataFlowUrn=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional com.linkedin.common.TimeStamp/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Status of the job - Deprecated for Data Process Instance model.*/@deprecated=\"Use Data Process Instance model, instead\"status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN/**Jobs that have been skipped.*/SKIPPED}/**Environment for this job*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional com.linkedin.common.FabricType}}{namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing\nDeprecated! Use inputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}@deprecated,inputDatasets:array[com.linkedin.common.DatasetUrn]/**Input datasets consumed by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatasetEdges/*/created/actor\",\"createdOn\":\"inputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputDatasetEdges/*/properties\",\"updatedActor\":\"inputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"inputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputDatasetEdges:optional array[com.linkedin.common.Edge]/**Output datasets produced by the data job during processing\nDeprecated! Use outputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}@deprecated,outputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"outputDatasetEdges/*/created/actor\",\"createdOn\":\"outputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\",\"properties\":\"outputDatasetEdges/*/properties\",\"updatedActor\":\"outputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"outputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"outputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputDatasetEdges:optional array[com.linkedin.common.Edge]/**Input datajobs that this data job depends on\nDeprecated! Use inputDatajobEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\"}@deprecated,inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing job identifier.\",\"entityType\":\"dataJob\",\"fields\":[{\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"doc\":\"Unique identifier of the data job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":594,\"name\":\"DataJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataJobUrn=string}]/**Input datajobs that this data job depends on*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatajobEdges/*/created/actor\",\"createdOn\":\"inputDatajobEdges/*/created/time\",\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"inputDatajobEdges/*/properties\",\"updatedActor\":\"inputDatajobEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatajobEdges/*/lastModified/time\"}inputDatajobEdges:optional array[com.linkedin.common.Edge]/**Fields of the input datasets used by this job*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputFields\",\"queryByDefault\":false}inputDatasetFields:optional array[com.linkedin.common.Urn]/**Fields of the output datasets this job writes to*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputFields\",\"queryByDefault\":false}outputDatasetFields:optional array[com.linkedin.common.Urn]/**Fine-grained column-level lineages\nNot currently supported in the UI\nUse UpstreamLineage aspect for datasets to express Column Level Lineage for the UI*/fineGrainedLineages:optional array[{namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}}]}}{namespace com.linkedin.dataset/**Dataset deprecation status\nDeprecated! This aspect is deprecat").append("ed in favor of the more-general-purpose 'Deprecation' aspect.*/@Aspect.name=\"datasetDeprecation\"@Deprecated,record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional com.linkedin.common.Urn}}{namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Display name of the Dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Fully-qualified name of the Dataset*/@Searchable={\"addToFilters\":false,\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:optional string/**Documentation of the dataset*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/@deprecated=\"Use ExternalReference.externalUrl field instead.\"uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional com.linkedin.common.TimeStamp/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.\nThis is now deprecated.*/@deprecated=\"Use GlobalTags aspect instead.\"tags:array[string]=[]}}{namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.*/auditStamp:com.linkedin.common.AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**Audit stamp containing who created the lineage and when.*/created:optional com.linkedin.common.AuditStamp/**The upstream dataset the lineage points to*/@Relationship={\"createdActor\":\"upstreams/*/created/actor\",\"createdOn\":\"upstreams/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"upstreams/*/properties\",\"updatedActor\":\"upstreams/*/auditStamp/actor\",\"updatedOn\":\"upstreams/*/auditStamp/time\",\"via\":\"upstreams/*/query\"}@Searchable={\"fieldName\":\"upstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasUpstreams\",\"queryByDefault\":false}dataset:com.linkedin.common.DatasetUrn/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]/**If the lineage is generated by a query, a reference to the query*/query:optional com.linkedin.common.Urn}]/** List of fine-grained lineage information, including field-level lineage*/@Relationship.`/*/upstreams/*`={\"entityTypes\":[\"dataset\",\"schemaField\"],\"name\":\"DownstreamOf\"}fineGrainedLineages:optional array[FineGrainedLineage]}}{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}com.linkedin.common.ChangeAuditStamps{/**Dataset this schema metadata is associated with.*/dataset:optional com.linkedin.common.DatasetUrn/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}}{namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes com.linkedin.common.ChangeAuditStamps{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional com.linkedin.common.GlobalTags/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional com.linkedin.common.GlossaryTerms}]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo includes com.linkedin.common.CustomProperties{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Display name of the node*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"displayName\",\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Optional id for the GlossaryNode*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string}}{namespace com.linkedin.metadata.key/**Key for a GlossaryNode*/@Aspect.name=\"glossaryNodeKey\"record GlossaryNodeKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo includes com.linkedin.common.CustomProperties{/**Optional id for the term*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string/**Display name of the term*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Definition of business term.*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional com.linkedin.common.GlossaryNodeUrn/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional com.linkedin.common.Url/**Schema definition of the glossary term*/@deprecated,rawSchema:optional string}}{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{/**The term name, which serves as a unique id*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.metadata.key/**Key for an MLFeature*/@Aspect.name=\"mlFeatureKey\"record MLFeatureKey{/**Namespace for the feature*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the feature*/@Searchable={\"boostScore\":8.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLFeature*/@Aspect.name=\"mlFeatureProperties\"record MLFeatureProperties includes com.linkedin.common.CustomProperties{/**Documentation of the MLFeature*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\"}description:optional string/**Data Type of the MLFeature*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories - mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories - either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data - no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period- daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLFeature*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional MetadataAttribution}}/**Source of the MLFeature*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DerivedFrom\"}sources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:com.linkedin.common.Urn/**Name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}origin:com.linkedin.common.FabricType}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:com.linkedin.common.DatasetUrn/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[").append("string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera's hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference/**A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups*/record MLModelLineageInfo{/**List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"TrainedBy\"}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs or process instances (if any) that use the model or group.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"UsedBy\"}downstreamJobs:optional array[com.linkedin.common.Urn]}{/**Display name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchTier\":1}name:optional string/**Documentation of the MLModel*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Date when the MLModel was developed*/@deprecated,date:optional com.linkedin.common.Time/**Audit stamp containing who created this and when*/created:optional com.linkedin.common.TimeStamp/**Date when the MLModel was last modified*/lastModified:optional com.linkedin.common.TimeStamp/**Version of the MLModel*/version:optional com.linkedin.common.VersionTag/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/@Relationship.`/*`={\"entityTypes\":[\"mlFeature\"],\"isLineage\":true,\"name\":\"Consumes\"}mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"entityTypes\":[\"mlModelDeployment\"],\"name\":\"DeployedTo\"}deployments:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"entityTypes\":[\"mlModelGroup\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"MemberOf\"}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.metadata.key/**Key for a Tag*/@Aspect.name=\"tagKey\"record TagKey{/**The tag name, which serves as a unique id*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.tag/**Properties associated with a Tag*/@Aspect.name=\"tagProperties\"record TagProperties{/**Display name of the tag*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Documentation of the tag*/@Searchable={}description:optional string/**The color associated with the Tag in Hex. For example #FFFFFF.*/colorHex:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}com.linkedin.common.GlobalTags{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}]").toString(), SchemaFormatType.PDL));
    private com.linkedin.metadata.key.ChartKey _chartKeyMember = null;
    private com.linkedin.chart.ChartInfo _chartInfoMember = null;
    private com.linkedin.chart.ChartQuery _chartQueryMember = null;
    private com.linkedin.metadata.key.CorpGroupKey _corpGroupKeyMember = null;
    private com.linkedin.identity.CorpGroupInfo _corpGroupInfoMember = null;
    private com.linkedin.metadata.key.CorpUserKey _corpUserKeyMember = null;
    private com.linkedin.identity.CorpUserEditableInfo _corpUserEditableInfoMember = null;
    private com.linkedin.identity.CorpUserInfo _corpUserInfoMember = null;
    private com.linkedin.identity.CorpUserStatus _corpUserStatusMember = null;
    private com.linkedin.identity.GroupMembership _groupMembershipMember = null;
    private com.linkedin.metadata.key.DashboardKey _dashboardKeyMember = null;
    private com.linkedin.dashboard.DashboardInfo _dashboardInfoMember = null;
    private com.linkedin.metadata.key.DataFlowKey _dataFlowKeyMember = null;
    private com.linkedin.datajob.DataFlowInfo _dataFlowInfoMember = null;
    private com.linkedin.metadata.key.DataJobKey _dataJobKeyMember = null;
    private com.linkedin.datajob.DataJobInfo _dataJobInfoMember = null;
    private com.linkedin.datajob.DataJobInputOutput _dataJobInputOutputMember = null;
    private com.linkedin.dataset.DatasetDeprecation _datasetDeprecationMember = null;
    private com.linkedin.dataset.DatasetProperties _datasetPropertiesMember = null;
    private com.linkedin.dataset.UpstreamLineage _upstreamLineageMember = null;
    private com.linkedin.schema.SchemaMetadata _schemaMetadataMember = null;
    private com.linkedin.schema.EditableSchemaMetadata _editableSchemaMetadataMember = null;
    private com.linkedin.common.InstitutionalMemory _institutionalMemoryMember = null;
    private com.linkedin.glossary.GlossaryNodeInfo _glossaryNodeInfoMember = null;
    private com.linkedin.metadata.key.GlossaryNodeKey _glossaryNodeKeyMember = null;
    private com.linkedin.glossary.GlossaryTermInfo _glossaryTermInfoMember = null;
    private com.linkedin.metadata.key.GlossaryTermKey _glossaryTermKeyMember = null;
    private com.linkedin.metadata.key.MLFeatureKey _mLFeatureKeyMember = null;
    private com.linkedin.ml.metadata.MLFeatureProperties _mLFeaturePropertiesMember = null;
    private com.linkedin.metadata.key.MLModelKey _mLModelKeyMember = null;
    private com.linkedin.ml.metadata.CaveatsAndRecommendations _caveatsAndRecommendationsMember = null;
    private com.linkedin.ml.metadata.EthicalConsiderations _ethicalConsiderationsMember = null;
    private com.linkedin.ml.metadata.EvaluationData _evaluationDataMember = null;
    private com.linkedin.ml.metadata.IntendedUse _intendedUseMember = null;
    private com.linkedin.ml.metadata.Metrics _metricsMember = null;
    private com.linkedin.ml.metadata.MLModelFactorPrompts _mLModelFactorPromptsMember = null;
    private com.linkedin.ml.metadata.MLModelProperties _mLModelPropertiesMember = null;
    private com.linkedin.ml.metadata.QuantitativeAnalyses _quantitativeAnalysesMember = null;
    private com.linkedin.ml.metadata.TrainingData _trainingDataMember = null;
    private com.linkedin.ml.metadata.SourceCode _sourceCodeMember = null;
    private com.linkedin.metadata.key.TagKey _tagKeyMember = null;
    private com.linkedin.tag.TagProperties _tagPropertiesMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.BrowsePaths _browsePathsMember = null;
    private com.linkedin.common.DataPlatformInstance _dataPlatformInstanceMember = null;
    private Aspect.ChangeListener __changeListener = new Aspect.ChangeListener(this);
    private final static DataSchema MEMBER_ChartKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.ChartKey");
    public final static String MEMBERKEY_ChartKey = "com.linkedin.metadata.key.ChartKey";
    private final static DataSchema MEMBER_ChartInfo = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartInfo");
    public final static String MEMBERKEY_ChartInfo = "com.linkedin.chart.ChartInfo";
    private final static DataSchema MEMBER_ChartQuery = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartQuery");
    public final static String MEMBERKEY_ChartQuery = "com.linkedin.chart.ChartQuery";
    private final static DataSchema MEMBER_CorpGroupKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpGroupKey");
    public final static String MEMBERKEY_CorpGroupKey = "com.linkedin.metadata.key.CorpGroupKey";
    private final static DataSchema MEMBER_CorpGroupInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpGroupInfo");
    public final static String MEMBERKEY_CorpGroupInfo = "com.linkedin.identity.CorpGroupInfo";
    private final static DataSchema MEMBER_CorpUserKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpUserKey");
    public final static String MEMBERKEY_CorpUserKey = "com.linkedin.metadata.key.CorpUserKey";
    private final static DataSchema MEMBER_CorpUserEditableInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserEditableInfo");
    public final static String MEMBERKEY_CorpUserEditableInfo = "com.linkedin.identity.CorpUserEditableInfo";
    private final static DataSchema MEMBER_CorpUserInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserInfo");
    public final static String MEMBERKEY_CorpUserInfo = "com.linkedin.identity.CorpUserInfo";
    private final static DataSchema MEMBER_CorpUserStatus = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserStatus");
    public final static String MEMBERKEY_CorpUserStatus = "com.linkedin.identity.CorpUserStatus";
    private final static DataSchema MEMBER_GroupMembership = SCHEMA.getTypeByMemberKey("com.linkedin.identity.GroupMembership");
    public final static String MEMBERKEY_GroupMembership = "com.linkedin.identity.GroupMembership";
    private final static DataSchema MEMBER_DashboardKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DashboardKey");
    public final static String MEMBERKEY_DashboardKey = "com.linkedin.metadata.key.DashboardKey";
    private final static DataSchema MEMBER_DashboardInfo = SCHEMA.getTypeByMemberKey("com.linkedin.dashboard.DashboardInfo");
    public final static String MEMBERKEY_DashboardInfo = "com.linkedin.dashboard.DashboardInfo";
    private final static DataSchema MEMBER_DataFlowKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataFlowKey");
    public final static String MEMBERKEY_DataFlowKey = "com.linkedin.metadata.key.DataFlowKey";
    private final static DataSchema MEMBER_DataFlowInfo = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataFlowInfo");
    public final static String MEMBERKEY_DataFlowInfo = "com.linkedin.datajob.DataFlowInfo";
    private final static DataSchema MEMBER_DataJobKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataJobKey");
    public final static String MEMBERKEY_DataJobKey = "com.linkedin.metadata.key.DataJobKey";
    private final static DataSchema MEMBER_DataJobInfo = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataJobInfo");
    public final static String MEMBERKEY_DataJobInfo = "com.linkedin.datajob.DataJobInfo";
    private final static DataSchema MEMBER_DataJobInputOutput = SCHEMA.getTypeByMemberKey("com.linkedin.datajob.DataJobInputOutput");
    public final static String MEMBERKEY_DataJobInputOutput = "com.linkedin.datajob.DataJobInputOutput";
    private final static DataSchema MEMBER_DatasetDeprecation = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetDeprecation");
    public final static String MEMBERKEY_DatasetDeprecation = "com.linkedin.dataset.DatasetDeprecation";
    private final static DataSchema MEMBER_DatasetProperties = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.DatasetProperties");
    public final static String MEMBERKEY_DatasetProperties = "com.linkedin.dataset.DatasetProperties";
    private final static DataSchema MEMBER_UpstreamLineage = SCHEMA.getTypeByMemberKey("com.linkedin.dataset.UpstreamLineage");
    public final static String MEMBERKEY_UpstreamLineage = "com.linkedin.dataset.UpstreamLineage";
    private final static DataSchema MEMBER_SchemaMetadata = SCHEMA.getTypeByMemberKey("com.linkedin.schema.SchemaMetadata");
    public final static String MEMBERKEY_SchemaMetadata = "com.linkedin.schema.SchemaMetadata";
    private final static DataSchema MEMBER_EditableSchemaMetadata = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EditableSchemaMetadata");
    public final static String MEMBERKEY_EditableSchemaMetadata = "com.linkedin.schema.EditableSchemaMetadata";
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    public final static String MEMBERKEY_InstitutionalMemory = "com.linkedin.common.InstitutionalMemory";
    private final static DataSchema MEMBER_GlossaryNodeInfo = SCHEMA.getTypeByMemberKey("com.linkedin.glossary.GlossaryNodeInfo");
    public final static String MEMBERKEY_GlossaryNodeInfo = "com.linkedin.glossary.GlossaryNodeInfo";
    private final static DataSchema MEMBER_GlossaryNodeKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.GlossaryNodeKey");
    public final static String MEMBERKEY_GlossaryNodeKey = "com.linkedin.metadata.key.GlossaryNodeKey";
    private final static DataSchema MEMBER_GlossaryTermInfo = SCHEMA.getTypeByMemberKey("com.linkedin.glossary.GlossaryTermInfo");
    public final static String MEMBERKEY_GlossaryTermInfo = "com.linkedin.glossary.GlossaryTermInfo";
    private final static DataSchema MEMBER_GlossaryTermKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.GlossaryTermKey");
    public final static String MEMBERKEY_GlossaryTermKey = "com.linkedin.metadata.key.GlossaryTermKey";
    private final static DataSchema MEMBER_MLFeatureKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLFeatureKey");
    public final static String MEMBERKEY_MLFeatureKey = "com.linkedin.metadata.key.MLFeatureKey";
    private final static DataSchema MEMBER_MLFeatureProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLFeatureProperties");
    public final static String MEMBERKEY_MLFeatureProperties = "com.linkedin.ml.metadata.MLFeatureProperties";
    private final static DataSchema MEMBER_MLModelKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLModelKey");
    public final static String MEMBERKEY_MLModelKey = "com.linkedin.metadata.key.MLModelKey";
    private final static DataSchema MEMBER_CaveatsAndRecommendations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    public final static String MEMBERKEY_CaveatsAndRecommendations = "com.linkedin.ml.metadata.CaveatsAndRecommendations";
    private final static DataSchema MEMBER_EthicalConsiderations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EthicalConsiderations");
    public final static String MEMBERKEY_EthicalConsiderations = "com.linkedin.ml.metadata.EthicalConsiderations";
    private final static DataSchema MEMBER_EvaluationData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EvaluationData");
    public final static String MEMBERKEY_EvaluationData = "com.linkedin.ml.metadata.EvaluationData";
    private final static DataSchema MEMBER_IntendedUse = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.IntendedUse");
    public final static String MEMBERKEY_IntendedUse = "com.linkedin.ml.metadata.IntendedUse";
    private final static DataSchema MEMBER_Metrics = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.Metrics");
    public final static String MEMBERKEY_Metrics = "com.linkedin.ml.metadata.Metrics";
    private final static DataSchema MEMBER_MLModelFactorPrompts = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelFactorPrompts");
    public final static String MEMBERKEY_MLModelFactorPrompts = "com.linkedin.ml.metadata.MLModelFactorPrompts";
    private final static DataSchema MEMBER_MLModelProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelProperties");
    public final static String MEMBERKEY_MLModelProperties = "com.linkedin.ml.metadata.MLModelProperties";
    private final static DataSchema MEMBER_QuantitativeAnalyses = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.QuantitativeAnalyses");
    public final static String MEMBERKEY_QuantitativeAnalyses = "com.linkedin.ml.metadata.QuantitativeAnalyses";
    private final static DataSchema MEMBER_TrainingData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.TrainingData");
    public final static String MEMBERKEY_TrainingData = "com.linkedin.ml.metadata.TrainingData";
    private final static DataSchema MEMBER_SourceCode = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.SourceCode");
    public final static String MEMBERKEY_SourceCode = "com.linkedin.ml.metadata.SourceCode";
    private final static DataSchema MEMBER_TagKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.TagKey");
    public final static String MEMBERKEY_TagKey = "com.linkedin.metadata.key.TagKey";
    private final static DataSchema MEMBER_TagProperties = SCHEMA.getTypeByMemberKey("com.linkedin.tag.TagProperties");
    public final static String MEMBERKEY_TagProperties = "com.linkedin.tag.TagProperties";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    public final static String MEMBERKEY_BrowsePaths = "com.linkedin.common.BrowsePaths";
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    public final static String MEMBERKEY_DataPlatformInstance = "com.linkedin.common.DataPlatformInstance";
    private final static TyperefInfo TYPEREFINFO = new Aspect.UnionTyperefInfo();

    public Aspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Aspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static Aspect create(com.linkedin.metadata.key.ChartKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setChartKey(value);
        return newUnion;
    }

    public boolean isChartKey() {
        return memberIs("com.linkedin.metadata.key.ChartKey");
    }

    public com.linkedin.metadata.key.ChartKey getChartKey() {
        checkNotNull();
        if (_chartKeyMember!= null) {
            return _chartKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.ChartKey");
        _chartKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.ChartKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _chartKeyMember;
    }

    public void setChartKey(com.linkedin.metadata.key.ChartKey value) {
        checkNotNull();
        super._map.clear();
        _chartKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.ChartKey", value.data());
    }

    public static Aspect create(com.linkedin.chart.ChartInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setChartInfo(value);
        return newUnion;
    }

    public boolean isChartInfo() {
        return memberIs("com.linkedin.chart.ChartInfo");
    }

    public com.linkedin.chart.ChartInfo getChartInfo() {
        checkNotNull();
        if (_chartInfoMember!= null) {
            return _chartInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.chart.ChartInfo");
        _chartInfoMember = ((__rawValue == null)?null:new com.linkedin.chart.ChartInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _chartInfoMember;
    }

    public void setChartInfo(com.linkedin.chart.ChartInfo value) {
        checkNotNull();
        super._map.clear();
        _chartInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.chart.ChartInfo", value.data());
    }

    public static Aspect create(com.linkedin.chart.ChartQuery value) {
        Aspect newUnion = new Aspect();
        newUnion.setChartQuery(value);
        return newUnion;
    }

    public boolean isChartQuery() {
        return memberIs("com.linkedin.chart.ChartQuery");
    }

    public com.linkedin.chart.ChartQuery getChartQuery() {
        checkNotNull();
        if (_chartQueryMember!= null) {
            return _chartQueryMember;
        }
        Object __rawValue = super._map.get("com.linkedin.chart.ChartQuery");
        _chartQueryMember = ((__rawValue == null)?null:new com.linkedin.chart.ChartQuery(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _chartQueryMember;
    }

    public void setChartQuery(com.linkedin.chart.ChartQuery value) {
        checkNotNull();
        super._map.clear();
        _chartQueryMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.chart.ChartQuery", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.CorpGroupKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpGroupKey(value);
        return newUnion;
    }

    public boolean isCorpGroupKey() {
        return memberIs("com.linkedin.metadata.key.CorpGroupKey");
    }

    public com.linkedin.metadata.key.CorpGroupKey getCorpGroupKey() {
        checkNotNull();
        if (_corpGroupKeyMember!= null) {
            return _corpGroupKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.CorpGroupKey");
        _corpGroupKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.CorpGroupKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _corpGroupKeyMember;
    }

    public void setCorpGroupKey(com.linkedin.metadata.key.CorpGroupKey value) {
        checkNotNull();
        super._map.clear();
        _corpGroupKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.CorpGroupKey", value.data());
    }

    public static Aspect create(com.linkedin.identity.CorpGroupInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpGroupInfo(value);
        return newUnion;
    }

    public boolean isCorpGroupInfo() {
        return memberIs("com.linkedin.identity.CorpGroupInfo");
    }

    public com.linkedin.identity.CorpGroupInfo getCorpGroupInfo() {
        checkNotNull();
        if (_corpGroupInfoMember!= null) {
            return _corpGroupInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.identity.CorpGroupInfo");
        _corpGroupInfoMember = ((__rawValue == null)?null:new com.linkedin.identity.CorpGroupInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _corpGroupInfoMember;
    }

    public void setCorpGroupInfo(com.linkedin.identity.CorpGroupInfo value) {
        checkNotNull();
        super._map.clear();
        _corpGroupInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.identity.CorpGroupInfo", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.CorpUserKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserKey(value);
        return newUnion;
    }

    public boolean isCorpUserKey() {
        return memberIs("com.linkedin.metadata.key.CorpUserKey");
    }

    public com.linkedin.metadata.key.CorpUserKey getCorpUserKey() {
        checkNotNull();
        if (_corpUserKeyMember!= null) {
            return _corpUserKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.CorpUserKey");
        _corpUserKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.CorpUserKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _corpUserKeyMember;
    }

    public void setCorpUserKey(com.linkedin.metadata.key.CorpUserKey value) {
        checkNotNull();
        super._map.clear();
        _corpUserKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.CorpUserKey", value.data());
    }

    public static Aspect create(com.linkedin.identity.CorpUserEditableInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserEditableInfo(value);
        return newUnion;
    }

    public boolean isCorpUserEditableInfo() {
        return memberIs("com.linkedin.identity.CorpUserEditableInfo");
    }

    public com.linkedin.identity.CorpUserEditableInfo getCorpUserEditableInfo() {
        checkNotNull();
        if (_corpUserEditableInfoMember!= null) {
            return _corpUserEditableInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.identity.CorpUserEditableInfo");
        _corpUserEditableInfoMember = ((__rawValue == null)?null:new com.linkedin.identity.CorpUserEditableInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _corpUserEditableInfoMember;
    }

    public void setCorpUserEditableInfo(com.linkedin.identity.CorpUserEditableInfo value) {
        checkNotNull();
        super._map.clear();
        _corpUserEditableInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.identity.CorpUserEditableInfo", value.data());
    }

    public static Aspect create(com.linkedin.identity.CorpUserInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserInfo(value);
        return newUnion;
    }

    public boolean isCorpUserInfo() {
        return memberIs("com.linkedin.identity.CorpUserInfo");
    }

    public com.linkedin.identity.CorpUserInfo getCorpUserInfo() {
        checkNotNull();
        if (_corpUserInfoMember!= null) {
            return _corpUserInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.identity.CorpUserInfo");
        _corpUserInfoMember = ((__rawValue == null)?null:new com.linkedin.identity.CorpUserInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _corpUserInfoMember;
    }

    public void setCorpUserInfo(com.linkedin.identity.CorpUserInfo value) {
        checkNotNull();
        super._map.clear();
        _corpUserInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.identity.CorpUserInfo", value.data());
    }

    public static Aspect create(com.linkedin.identity.CorpUserStatus value) {
        Aspect newUnion = new Aspect();
        newUnion.setCorpUserStatus(value);
        return newUnion;
    }

    public boolean isCorpUserStatus() {
        return memberIs("com.linkedin.identity.CorpUserStatus");
    }

    public com.linkedin.identity.CorpUserStatus getCorpUserStatus() {
        checkNotNull();
        if (_corpUserStatusMember!= null) {
            return _corpUserStatusMember;
        }
        Object __rawValue = super._map.get("com.linkedin.identity.CorpUserStatus");
        _corpUserStatusMember = ((__rawValue == null)?null:new com.linkedin.identity.CorpUserStatus(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _corpUserStatusMember;
    }

    public void setCorpUserStatus(com.linkedin.identity.CorpUserStatus value) {
        checkNotNull();
        super._map.clear();
        _corpUserStatusMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.identity.CorpUserStatus", value.data());
    }

    public static Aspect create(com.linkedin.identity.GroupMembership value) {
        Aspect newUnion = new Aspect();
        newUnion.setGroupMembership(value);
        return newUnion;
    }

    public boolean isGroupMembership() {
        return memberIs("com.linkedin.identity.GroupMembership");
    }

    public com.linkedin.identity.GroupMembership getGroupMembership() {
        checkNotNull();
        if (_groupMembershipMember!= null) {
            return _groupMembershipMember;
        }
        Object __rawValue = super._map.get("com.linkedin.identity.GroupMembership");
        _groupMembershipMember = ((__rawValue == null)?null:new com.linkedin.identity.GroupMembership(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _groupMembershipMember;
    }

    public void setGroupMembership(com.linkedin.identity.GroupMembership value) {
        checkNotNull();
        super._map.clear();
        _groupMembershipMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.identity.GroupMembership", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.DashboardKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setDashboardKey(value);
        return newUnion;
    }

    public boolean isDashboardKey() {
        return memberIs("com.linkedin.metadata.key.DashboardKey");
    }

    public com.linkedin.metadata.key.DashboardKey getDashboardKey() {
        checkNotNull();
        if (_dashboardKeyMember!= null) {
            return _dashboardKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DashboardKey");
        _dashboardKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DashboardKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dashboardKeyMember;
    }

    public void setDashboardKey(com.linkedin.metadata.key.DashboardKey value) {
        checkNotNull();
        super._map.clear();
        _dashboardKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DashboardKey", value.data());
    }

    public static Aspect create(com.linkedin.dashboard.DashboardInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setDashboardInfo(value);
        return newUnion;
    }

    public boolean isDashboardInfo() {
        return memberIs("com.linkedin.dashboard.DashboardInfo");
    }

    public com.linkedin.dashboard.DashboardInfo getDashboardInfo() {
        checkNotNull();
        if (_dashboardInfoMember!= null) {
            return _dashboardInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dashboard.DashboardInfo");
        _dashboardInfoMember = ((__rawValue == null)?null:new com.linkedin.dashboard.DashboardInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dashboardInfoMember;
    }

    public void setDashboardInfo(com.linkedin.dashboard.DashboardInfo value) {
        checkNotNull();
        super._map.clear();
        _dashboardInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dashboard.DashboardInfo", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.DataFlowKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataFlowKey(value);
        return newUnion;
    }

    public boolean isDataFlowKey() {
        return memberIs("com.linkedin.metadata.key.DataFlowKey");
    }

    public com.linkedin.metadata.key.DataFlowKey getDataFlowKey() {
        checkNotNull();
        if (_dataFlowKeyMember!= null) {
            return _dataFlowKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DataFlowKey");
        _dataFlowKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DataFlowKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataFlowKeyMember;
    }

    public void setDataFlowKey(com.linkedin.metadata.key.DataFlowKey value) {
        checkNotNull();
        super._map.clear();
        _dataFlowKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DataFlowKey", value.data());
    }

    public static Aspect create(com.linkedin.datajob.DataFlowInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setDataFlowInfo(value);
        return newUnion;
    }

    public boolean isDataFlowInfo() {
        return memberIs("com.linkedin.datajob.DataFlowInfo");
    }

    public com.linkedin.datajob.DataFlowInfo getDataFlowInfo() {
        checkNotNull();
        if (_dataFlowInfoMember!= null) {
            return _dataFlowInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.datajob.DataFlowInfo");
        _dataFlowInfoMember = ((__rawValue == null)?null:new com.linkedin.datajob.DataFlowInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataFlowInfoMember;
    }

    public void setDataFlowInfo(com.linkedin.datajob.DataFlowInfo value) {
        checkNotNull();
        super._map.clear();
        _dataFlowInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.datajob.DataFlowInfo", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.DataJobKey value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.datajob.DataJobInfo value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.datajob.DataJobInputOutput value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.dataset.DatasetDeprecation value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.dataset.DatasetProperties value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.dataset.UpstreamLineage value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.schema.SchemaMetadata value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.schema.EditableSchemaMetadata value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.common.InstitutionalMemory value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.glossary.GlossaryNodeInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryNodeInfo(value);
        return newUnion;
    }

    public boolean isGlossaryNodeInfo() {
        return memberIs("com.linkedin.glossary.GlossaryNodeInfo");
    }

    public com.linkedin.glossary.GlossaryNodeInfo getGlossaryNodeInfo() {
        checkNotNull();
        if (_glossaryNodeInfoMember!= null) {
            return _glossaryNodeInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.glossary.GlossaryNodeInfo");
        _glossaryNodeInfoMember = ((__rawValue == null)?null:new com.linkedin.glossary.GlossaryNodeInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _glossaryNodeInfoMember;
    }

    public void setGlossaryNodeInfo(com.linkedin.glossary.GlossaryNodeInfo value) {
        checkNotNull();
        super._map.clear();
        _glossaryNodeInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.glossary.GlossaryNodeInfo", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.GlossaryNodeKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryNodeKey(value);
        return newUnion;
    }

    public boolean isGlossaryNodeKey() {
        return memberIs("com.linkedin.metadata.key.GlossaryNodeKey");
    }

    public com.linkedin.metadata.key.GlossaryNodeKey getGlossaryNodeKey() {
        checkNotNull();
        if (_glossaryNodeKeyMember!= null) {
            return _glossaryNodeKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.GlossaryNodeKey");
        _glossaryNodeKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.GlossaryNodeKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _glossaryNodeKeyMember;
    }

    public void setGlossaryNodeKey(com.linkedin.metadata.key.GlossaryNodeKey value) {
        checkNotNull();
        super._map.clear();
        _glossaryNodeKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.GlossaryNodeKey", value.data());
    }

    public static Aspect create(com.linkedin.glossary.GlossaryTermInfo value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryTermInfo(value);
        return newUnion;
    }

    public boolean isGlossaryTermInfo() {
        return memberIs("com.linkedin.glossary.GlossaryTermInfo");
    }

    public com.linkedin.glossary.GlossaryTermInfo getGlossaryTermInfo() {
        checkNotNull();
        if (_glossaryTermInfoMember!= null) {
            return _glossaryTermInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.glossary.GlossaryTermInfo");
        _glossaryTermInfoMember = ((__rawValue == null)?null:new com.linkedin.glossary.GlossaryTermInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _glossaryTermInfoMember;
    }

    public void setGlossaryTermInfo(com.linkedin.glossary.GlossaryTermInfo value) {
        checkNotNull();
        super._map.clear();
        _glossaryTermInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.glossary.GlossaryTermInfo", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.GlossaryTermKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setGlossaryTermKey(value);
        return newUnion;
    }

    public boolean isGlossaryTermKey() {
        return memberIs("com.linkedin.metadata.key.GlossaryTermKey");
    }

    public com.linkedin.metadata.key.GlossaryTermKey getGlossaryTermKey() {
        checkNotNull();
        if (_glossaryTermKeyMember!= null) {
            return _glossaryTermKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.GlossaryTermKey");
        _glossaryTermKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.GlossaryTermKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _glossaryTermKeyMember;
    }

    public void setGlossaryTermKey(com.linkedin.metadata.key.GlossaryTermKey value) {
        checkNotNull();
        super._map.clear();
        _glossaryTermKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.GlossaryTermKey", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.MLFeatureKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLFeatureKey(value);
        return newUnion;
    }

    public boolean isMLFeatureKey() {
        return memberIs("com.linkedin.metadata.key.MLFeatureKey");
    }

    public com.linkedin.metadata.key.MLFeatureKey getMLFeatureKey() {
        checkNotNull();
        if (_mLFeatureKeyMember!= null) {
            return _mLFeatureKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.MLFeatureKey");
        _mLFeatureKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.MLFeatureKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLFeatureKeyMember;
    }

    public void setMLFeatureKey(com.linkedin.metadata.key.MLFeatureKey value) {
        checkNotNull();
        super._map.clear();
        _mLFeatureKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.MLFeatureKey", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.MLFeatureProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLFeatureProperties(value);
        return newUnion;
    }

    public boolean isMLFeatureProperties() {
        return memberIs("com.linkedin.ml.metadata.MLFeatureProperties");
    }

    public com.linkedin.ml.metadata.MLFeatureProperties getMLFeatureProperties() {
        checkNotNull();
        if (_mLFeaturePropertiesMember!= null) {
            return _mLFeaturePropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.MLFeatureProperties");
        _mLFeaturePropertiesMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.MLFeatureProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLFeaturePropertiesMember;
    }

    public void setMLFeatureProperties(com.linkedin.ml.metadata.MLFeatureProperties value) {
        checkNotNull();
        super._map.clear();
        _mLFeaturePropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.MLFeatureProperties", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.MLModelKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLModelKey(value);
        return newUnion;
    }

    public boolean isMLModelKey() {
        return memberIs("com.linkedin.metadata.key.MLModelKey");
    }

    public com.linkedin.metadata.key.MLModelKey getMLModelKey() {
        checkNotNull();
        if (_mLModelKeyMember!= null) {
            return _mLModelKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.MLModelKey");
        _mLModelKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.MLModelKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLModelKeyMember;
    }

    public void setMLModelKey(com.linkedin.metadata.key.MLModelKey value) {
        checkNotNull();
        super._map.clear();
        _mLModelKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.MLModelKey", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        Aspect newUnion = new Aspect();
        newUnion.setCaveatsAndRecommendations(value);
        return newUnion;
    }

    public boolean isCaveatsAndRecommendations() {
        return memberIs("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    }

    public com.linkedin.ml.metadata.CaveatsAndRecommendations getCaveatsAndRecommendations() {
        checkNotNull();
        if (_caveatsAndRecommendationsMember!= null) {
            return _caveatsAndRecommendationsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.CaveatsAndRecommendations");
        _caveatsAndRecommendationsMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.CaveatsAndRecommendations(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _caveatsAndRecommendationsMember;
    }

    public void setCaveatsAndRecommendations(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        checkNotNull();
        super._map.clear();
        _caveatsAndRecommendationsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.CaveatsAndRecommendations", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.EthicalConsiderations value) {
        Aspect newUnion = new Aspect();
        newUnion.setEthicalConsiderations(value);
        return newUnion;
    }

    public boolean isEthicalConsiderations() {
        return memberIs("com.linkedin.ml.metadata.EthicalConsiderations");
    }

    public com.linkedin.ml.metadata.EthicalConsiderations getEthicalConsiderations() {
        checkNotNull();
        if (_ethicalConsiderationsMember!= null) {
            return _ethicalConsiderationsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.EthicalConsiderations");
        _ethicalConsiderationsMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.EthicalConsiderations(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _ethicalConsiderationsMember;
    }

    public void setEthicalConsiderations(com.linkedin.ml.metadata.EthicalConsiderations value) {
        checkNotNull();
        super._map.clear();
        _ethicalConsiderationsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.EthicalConsiderations", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.EvaluationData value) {
        Aspect newUnion = new Aspect();
        newUnion.setEvaluationData(value);
        return newUnion;
    }

    public boolean isEvaluationData() {
        return memberIs("com.linkedin.ml.metadata.EvaluationData");
    }

    public com.linkedin.ml.metadata.EvaluationData getEvaluationData() {
        checkNotNull();
        if (_evaluationDataMember!= null) {
            return _evaluationDataMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.EvaluationData");
        _evaluationDataMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.EvaluationData(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _evaluationDataMember;
    }

    public void setEvaluationData(com.linkedin.ml.metadata.EvaluationData value) {
        checkNotNull();
        super._map.clear();
        _evaluationDataMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.EvaluationData", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.IntendedUse value) {
        Aspect newUnion = new Aspect();
        newUnion.setIntendedUse(value);
        return newUnion;
    }

    public boolean isIntendedUse() {
        return memberIs("com.linkedin.ml.metadata.IntendedUse");
    }

    public com.linkedin.ml.metadata.IntendedUse getIntendedUse() {
        checkNotNull();
        if (_intendedUseMember!= null) {
            return _intendedUseMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.IntendedUse");
        _intendedUseMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.IntendedUse(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _intendedUseMember;
    }

    public void setIntendedUse(com.linkedin.ml.metadata.IntendedUse value) {
        checkNotNull();
        super._map.clear();
        _intendedUseMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.IntendedUse", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.Metrics value) {
        Aspect newUnion = new Aspect();
        newUnion.setMetrics(value);
        return newUnion;
    }

    public boolean isMetrics() {
        return memberIs("com.linkedin.ml.metadata.Metrics");
    }

    public com.linkedin.ml.metadata.Metrics getMetrics() {
        checkNotNull();
        if (_metricsMember!= null) {
            return _metricsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.Metrics");
        _metricsMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.Metrics(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _metricsMember;
    }

    public void setMetrics(com.linkedin.ml.metadata.Metrics value) {
        checkNotNull();
        super._map.clear();
        _metricsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.Metrics", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLModelFactorPrompts(value);
        return newUnion;
    }

    public boolean isMLModelFactorPrompts() {
        return memberIs("com.linkedin.ml.metadata.MLModelFactorPrompts");
    }

    public com.linkedin.ml.metadata.MLModelFactorPrompts getMLModelFactorPrompts() {
        checkNotNull();
        if (_mLModelFactorPromptsMember!= null) {
            return _mLModelFactorPromptsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.MLModelFactorPrompts");
        _mLModelFactorPromptsMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.MLModelFactorPrompts(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLModelFactorPromptsMember;
    }

    public void setMLModelFactorPrompts(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        checkNotNull();
        super._map.clear();
        _mLModelFactorPromptsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.MLModelFactorPrompts", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.MLModelProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setMLModelProperties(value);
        return newUnion;
    }

    public boolean isMLModelProperties() {
        return memberIs("com.linkedin.ml.metadata.MLModelProperties");
    }

    public com.linkedin.ml.metadata.MLModelProperties getMLModelProperties() {
        checkNotNull();
        if (_mLModelPropertiesMember!= null) {
            return _mLModelPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.MLModelProperties");
        _mLModelPropertiesMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.MLModelProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLModelPropertiesMember;
    }

    public void setMLModelProperties(com.linkedin.ml.metadata.MLModelProperties value) {
        checkNotNull();
        super._map.clear();
        _mLModelPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.MLModelProperties", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        Aspect newUnion = new Aspect();
        newUnion.setQuantitativeAnalyses(value);
        return newUnion;
    }

    public boolean isQuantitativeAnalyses() {
        return memberIs("com.linkedin.ml.metadata.QuantitativeAnalyses");
    }

    public com.linkedin.ml.metadata.QuantitativeAnalyses getQuantitativeAnalyses() {
        checkNotNull();
        if (_quantitativeAnalysesMember!= null) {
            return _quantitativeAnalysesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.QuantitativeAnalyses");
        _quantitativeAnalysesMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.QuantitativeAnalyses(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _quantitativeAnalysesMember;
    }

    public void setQuantitativeAnalyses(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        checkNotNull();
        super._map.clear();
        _quantitativeAnalysesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.QuantitativeAnalyses", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.TrainingData value) {
        Aspect newUnion = new Aspect();
        newUnion.setTrainingData(value);
        return newUnion;
    }

    public boolean isTrainingData() {
        return memberIs("com.linkedin.ml.metadata.TrainingData");
    }

    public com.linkedin.ml.metadata.TrainingData getTrainingData() {
        checkNotNull();
        if (_trainingDataMember!= null) {
            return _trainingDataMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.TrainingData");
        _trainingDataMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.TrainingData(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _trainingDataMember;
    }

    public void setTrainingData(com.linkedin.ml.metadata.TrainingData value) {
        checkNotNull();
        super._map.clear();
        _trainingDataMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.TrainingData", value.data());
    }

    public static Aspect create(com.linkedin.ml.metadata.SourceCode value) {
        Aspect newUnion = new Aspect();
        newUnion.setSourceCode(value);
        return newUnion;
    }

    public boolean isSourceCode() {
        return memberIs("com.linkedin.ml.metadata.SourceCode");
    }

    public com.linkedin.ml.metadata.SourceCode getSourceCode() {
        checkNotNull();
        if (_sourceCodeMember!= null) {
            return _sourceCodeMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.SourceCode");
        _sourceCodeMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.SourceCode(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _sourceCodeMember;
    }

    public void setSourceCode(com.linkedin.ml.metadata.SourceCode value) {
        checkNotNull();
        super._map.clear();
        _sourceCodeMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.SourceCode", value.data());
    }

    public static Aspect create(com.linkedin.metadata.key.TagKey value) {
        Aspect newUnion = new Aspect();
        newUnion.setTagKey(value);
        return newUnion;
    }

    public boolean isTagKey() {
        return memberIs("com.linkedin.metadata.key.TagKey");
    }

    public com.linkedin.metadata.key.TagKey getTagKey() {
        checkNotNull();
        if (_tagKeyMember!= null) {
            return _tagKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.TagKey");
        _tagKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.TagKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _tagKeyMember;
    }

    public void setTagKey(com.linkedin.metadata.key.TagKey value) {
        checkNotNull();
        super._map.clear();
        _tagKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.TagKey", value.data());
    }

    public static Aspect create(com.linkedin.tag.TagProperties value) {
        Aspect newUnion = new Aspect();
        newUnion.setTagProperties(value);
        return newUnion;
    }

    public boolean isTagProperties() {
        return memberIs("com.linkedin.tag.TagProperties");
    }

    public com.linkedin.tag.TagProperties getTagProperties() {
        checkNotNull();
        if (_tagPropertiesMember!= null) {
            return _tagPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.tag.TagProperties");
        _tagPropertiesMember = ((__rawValue == null)?null:new com.linkedin.tag.TagProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _tagPropertiesMember;
    }

    public void setTagProperties(com.linkedin.tag.TagProperties value) {
        checkNotNull();
        super._map.clear();
        _tagPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.tag.TagProperties", value.data());
    }

    public static Aspect create(com.linkedin.common.Ownership value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.common.Status value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.common.GlobalTags value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.common.BrowsePaths value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect create(com.linkedin.common.DataPlatformInstance value) {
        Aspect newUnion = new Aspect();
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

    public static Aspect.ProjectionMask createMask() {
        return new Aspect.ProjectionMask();
    }

    @Override
    public Aspect clone()
        throws CloneNotSupportedException
    {
        Aspect __clone = ((Aspect) super.clone());
        __clone.__changeListener = new Aspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Aspect copy()
        throws CloneNotSupportedException
    {
        Aspect __copy = ((Aspect) super.copy());
        __copy._datasetPropertiesMember = null;
        __copy._mLModelFactorPromptsMember = null;
        __copy._dataFlowInfoMember = null;
        __copy._metricsMember = null;
        __copy._mLModelPropertiesMember = null;
        __copy._chartQueryMember = null;
        __copy._ownershipMember = null;
        __copy._chartKeyMember = null;
        __copy._glossaryNodeInfoMember = null;
        __copy._sourceCodeMember = null;
        __copy._mLFeaturePropertiesMember = null;
        __copy._dataJobInfoMember = null;
        __copy._ethicalConsiderationsMember = null;
        __copy._dataFlowKeyMember = null;
        __copy._editableSchemaMetadataMember = null;
        __copy._dashboardKeyMember = null;
        __copy._corpUserStatusMember = null;
        __copy._glossaryTermKeyMember = null;
        __copy._tagPropertiesMember = null;
        __copy._mLFeatureKeyMember = null;
        __copy._dataJobKeyMember = null;
        __copy._corpUserInfoMember = null;
        __copy._groupMembershipMember = null;
        __copy._corpGroupKeyMember = null;
        __copy._trainingDataMember = null;
        __copy._mLModelKeyMember = null;
        __copy._quantitativeAnalysesMember = null;
        __copy._intendedUseMember = null;
        __copy._corpUserKeyMember = null;
        __copy._globalTagsMember = null;
        __copy._browsePathsMember = null;
        __copy._dataPlatformInstanceMember = null;
        __copy._chartInfoMember = null;
        __copy._tagKeyMember = null;
        __copy._corpUserEditableInfoMember = null;
        __copy._institutionalMemoryMember = null;
        __copy._caveatsAndRecommendationsMember = null;
        __copy._corpGroupInfoMember = null;
        __copy._upstreamLineageMember = null;
        __copy._datasetDeprecationMember = null;
        __copy._glossaryNodeKeyMember = null;
        __copy._glossaryTermInfoMember = null;
        __copy._evaluationDataMember = null;
        __copy._dashboardInfoMember = null;
        __copy._dataJobInputOutputMember = null;
        __copy._schemaMetadataMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new Aspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Aspect __objectRef;

        private ChangeListener(Aspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.dataset.DatasetProperties":
                    __objectRef._datasetPropertiesMember = null;
                    break;
                case "com.linkedin.ml.metadata.MLModelFactorPrompts":
                    __objectRef._mLModelFactorPromptsMember = null;
                    break;
                case "com.linkedin.datajob.DataFlowInfo":
                    __objectRef._dataFlowInfoMember = null;
                    break;
                case "com.linkedin.ml.metadata.Metrics":
                    __objectRef._metricsMember = null;
                    break;
                case "com.linkedin.ml.metadata.MLModelProperties":
                    __objectRef._mLModelPropertiesMember = null;
                    break;
                case "com.linkedin.chart.ChartQuery":
                    __objectRef._chartQueryMember = null;
                    break;
                case "com.linkedin.common.Ownership":
                    __objectRef._ownershipMember = null;
                    break;
                case "com.linkedin.metadata.key.ChartKey":
                    __objectRef._chartKeyMember = null;
                    break;
                case "com.linkedin.glossary.GlossaryNodeInfo":
                    __objectRef._glossaryNodeInfoMember = null;
                    break;
                case "com.linkedin.ml.metadata.SourceCode":
                    __objectRef._sourceCodeMember = null;
                    break;
                case "com.linkedin.ml.metadata.MLFeatureProperties":
                    __objectRef._mLFeaturePropertiesMember = null;
                    break;
                case "com.linkedin.datajob.DataJobInfo":
                    __objectRef._dataJobInfoMember = null;
                    break;
                case "com.linkedin.ml.metadata.EthicalConsiderations":
                    __objectRef._ethicalConsiderationsMember = null;
                    break;
                case "com.linkedin.metadata.key.DataFlowKey":
                    __objectRef._dataFlowKeyMember = null;
                    break;
                case "com.linkedin.schema.EditableSchemaMetadata":
                    __objectRef._editableSchemaMetadataMember = null;
                    break;
                case "com.linkedin.metadata.key.DashboardKey":
                    __objectRef._dashboardKeyMember = null;
                    break;
                case "com.linkedin.identity.CorpUserStatus":
                    __objectRef._corpUserStatusMember = null;
                    break;
                case "com.linkedin.metadata.key.GlossaryTermKey":
                    __objectRef._glossaryTermKeyMember = null;
                    break;
                case "com.linkedin.tag.TagProperties":
                    __objectRef._tagPropertiesMember = null;
                    break;
                case "com.linkedin.metadata.key.MLFeatureKey":
                    __objectRef._mLFeatureKeyMember = null;
                    break;
                case "com.linkedin.metadata.key.DataJobKey":
                    __objectRef._dataJobKeyMember = null;
                    break;
                case "com.linkedin.identity.CorpUserInfo":
                    __objectRef._corpUserInfoMember = null;
                    break;
                case "com.linkedin.identity.GroupMembership":
                    __objectRef._groupMembershipMember = null;
                    break;
                case "com.linkedin.metadata.key.CorpGroupKey":
                    __objectRef._corpGroupKeyMember = null;
                    break;
                case "com.linkedin.ml.metadata.TrainingData":
                    __objectRef._trainingDataMember = null;
                    break;
                case "com.linkedin.metadata.key.MLModelKey":
                    __objectRef._mLModelKeyMember = null;
                    break;
                case "com.linkedin.ml.metadata.QuantitativeAnalyses":
                    __objectRef._quantitativeAnalysesMember = null;
                    break;
                case "com.linkedin.ml.metadata.IntendedUse":
                    __objectRef._intendedUseMember = null;
                    break;
                case "com.linkedin.metadata.key.CorpUserKey":
                    __objectRef._corpUserKeyMember = null;
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
                case "com.linkedin.chart.ChartInfo":
                    __objectRef._chartInfoMember = null;
                    break;
                case "com.linkedin.metadata.key.TagKey":
                    __objectRef._tagKeyMember = null;
                    break;
                case "com.linkedin.identity.CorpUserEditableInfo":
                    __objectRef._corpUserEditableInfoMember = null;
                    break;
                case "com.linkedin.common.InstitutionalMemory":
                    __objectRef._institutionalMemoryMember = null;
                    break;
                case "com.linkedin.ml.metadata.CaveatsAndRecommendations":
                    __objectRef._caveatsAndRecommendationsMember = null;
                    break;
                case "com.linkedin.identity.CorpGroupInfo":
                    __objectRef._corpGroupInfoMember = null;
                    break;
                case "com.linkedin.dataset.UpstreamLineage":
                    __objectRef._upstreamLineageMember = null;
                    break;
                case "com.linkedin.dataset.DatasetDeprecation":
                    __objectRef._datasetDeprecationMember = null;
                    break;
                case "com.linkedin.metadata.key.GlossaryNodeKey":
                    __objectRef._glossaryNodeKeyMember = null;
                    break;
                case "com.linkedin.glossary.GlossaryTermInfo":
                    __objectRef._glossaryTermInfoMember = null;
                    break;
                case "com.linkedin.ml.metadata.EvaluationData":
                    __objectRef._evaluationDataMember = null;
                    break;
                case "com.linkedin.dashboard.DashboardInfo":
                    __objectRef._dashboardInfoMember = null;
                    break;
                case "com.linkedin.datajob.DataJobInputOutput":
                    __objectRef._dataJobInputOutputMember = null;
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

        public com.linkedin.metadata.key.ChartKey.Fields ChartKey() {
            return new com.linkedin.metadata.key.ChartKey.Fields(getPathComponents(), "com.linkedin.metadata.key.ChartKey");
        }

        public com.linkedin.chart.ChartInfo.Fields ChartInfo() {
            return new com.linkedin.chart.ChartInfo.Fields(getPathComponents(), "com.linkedin.chart.ChartInfo");
        }

        public com.linkedin.chart.ChartQuery.Fields ChartQuery() {
            return new com.linkedin.chart.ChartQuery.Fields(getPathComponents(), "com.linkedin.chart.ChartQuery");
        }

        public com.linkedin.metadata.key.CorpGroupKey.Fields CorpGroupKey() {
            return new com.linkedin.metadata.key.CorpGroupKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpGroupKey");
        }

        public com.linkedin.identity.CorpGroupInfo.Fields CorpGroupInfo() {
            return new com.linkedin.identity.CorpGroupInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpGroupInfo");
        }

        public com.linkedin.metadata.key.CorpUserKey.Fields CorpUserKey() {
            return new com.linkedin.metadata.key.CorpUserKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpUserKey");
        }

        public com.linkedin.identity.CorpUserEditableInfo.Fields CorpUserEditableInfo() {
            return new com.linkedin.identity.CorpUserEditableInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserEditableInfo");
        }

        public com.linkedin.identity.CorpUserInfo.Fields CorpUserInfo() {
            return new com.linkedin.identity.CorpUserInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserInfo");
        }

        public com.linkedin.identity.CorpUserStatus.Fields CorpUserStatus() {
            return new com.linkedin.identity.CorpUserStatus.Fields(getPathComponents(), "com.linkedin.identity.CorpUserStatus");
        }

        public com.linkedin.identity.GroupMembership.Fields GroupMembership() {
            return new com.linkedin.identity.GroupMembership.Fields(getPathComponents(), "com.linkedin.identity.GroupMembership");
        }

        public com.linkedin.metadata.key.DashboardKey.Fields DashboardKey() {
            return new com.linkedin.metadata.key.DashboardKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DashboardKey");
        }

        public com.linkedin.dashboard.DashboardInfo.Fields DashboardInfo() {
            return new com.linkedin.dashboard.DashboardInfo.Fields(getPathComponents(), "com.linkedin.dashboard.DashboardInfo");
        }

        public com.linkedin.metadata.key.DataFlowKey.Fields DataFlowKey() {
            return new com.linkedin.metadata.key.DataFlowKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataFlowKey");
        }

        public com.linkedin.datajob.DataFlowInfo.Fields DataFlowInfo() {
            return new com.linkedin.datajob.DataFlowInfo.Fields(getPathComponents(), "com.linkedin.datajob.DataFlowInfo");
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

        public com.linkedin.dataset.DatasetDeprecation.Fields DatasetDeprecation() {
            return new com.linkedin.dataset.DatasetDeprecation.Fields(getPathComponents(), "com.linkedin.dataset.DatasetDeprecation");
        }

        public com.linkedin.dataset.DatasetProperties.Fields DatasetProperties() {
            return new com.linkedin.dataset.DatasetProperties.Fields(getPathComponents(), "com.linkedin.dataset.DatasetProperties");
        }

        public com.linkedin.dataset.UpstreamLineage.Fields UpstreamLineage() {
            return new com.linkedin.dataset.UpstreamLineage.Fields(getPathComponents(), "com.linkedin.dataset.UpstreamLineage");
        }

        public com.linkedin.schema.SchemaMetadata.Fields SchemaMetadata() {
            return new com.linkedin.schema.SchemaMetadata.Fields(getPathComponents(), "com.linkedin.schema.SchemaMetadata");
        }

        public com.linkedin.schema.EditableSchemaMetadata.Fields EditableSchemaMetadata() {
            return new com.linkedin.schema.EditableSchemaMetadata.Fields(getPathComponents(), "com.linkedin.schema.EditableSchemaMetadata");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.glossary.GlossaryNodeInfo.Fields GlossaryNodeInfo() {
            return new com.linkedin.glossary.GlossaryNodeInfo.Fields(getPathComponents(), "com.linkedin.glossary.GlossaryNodeInfo");
        }

        public com.linkedin.metadata.key.GlossaryNodeKey.Fields GlossaryNodeKey() {
            return new com.linkedin.metadata.key.GlossaryNodeKey.Fields(getPathComponents(), "com.linkedin.metadata.key.GlossaryNodeKey");
        }

        public com.linkedin.glossary.GlossaryTermInfo.Fields GlossaryTermInfo() {
            return new com.linkedin.glossary.GlossaryTermInfo.Fields(getPathComponents(), "com.linkedin.glossary.GlossaryTermInfo");
        }

        public com.linkedin.metadata.key.GlossaryTermKey.Fields GlossaryTermKey() {
            return new com.linkedin.metadata.key.GlossaryTermKey.Fields(getPathComponents(), "com.linkedin.metadata.key.GlossaryTermKey");
        }

        public com.linkedin.metadata.key.MLFeatureKey.Fields MLFeatureKey() {
            return new com.linkedin.metadata.key.MLFeatureKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLFeatureKey");
        }

        public com.linkedin.ml.metadata.MLFeatureProperties.Fields MLFeatureProperties() {
            return new com.linkedin.ml.metadata.MLFeatureProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLFeatureProperties");
        }

        public com.linkedin.metadata.key.MLModelKey.Fields MLModelKey() {
            return new com.linkedin.metadata.key.MLModelKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLModelKey");
        }

        public com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields CaveatsAndRecommendations() {
            return new com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields(getPathComponents(), "com.linkedin.ml.metadata.CaveatsAndRecommendations");
        }

        public com.linkedin.ml.metadata.EthicalConsiderations.Fields EthicalConsiderations() {
            return new com.linkedin.ml.metadata.EthicalConsiderations.Fields(getPathComponents(), "com.linkedin.ml.metadata.EthicalConsiderations");
        }

        public com.linkedin.ml.metadata.EvaluationData.Fields EvaluationData() {
            return new com.linkedin.ml.metadata.EvaluationData.Fields(getPathComponents(), "com.linkedin.ml.metadata.EvaluationData");
        }

        public com.linkedin.ml.metadata.IntendedUse.Fields IntendedUse() {
            return new com.linkedin.ml.metadata.IntendedUse.Fields(getPathComponents(), "com.linkedin.ml.metadata.IntendedUse");
        }

        public com.linkedin.ml.metadata.Metrics.Fields Metrics() {
            return new com.linkedin.ml.metadata.Metrics.Fields(getPathComponents(), "com.linkedin.ml.metadata.Metrics");
        }

        public com.linkedin.ml.metadata.MLModelFactorPrompts.Fields MLModelFactorPrompts() {
            return new com.linkedin.ml.metadata.MLModelFactorPrompts.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelFactorPrompts");
        }

        public com.linkedin.ml.metadata.MLModelProperties.Fields MLModelProperties() {
            return new com.linkedin.ml.metadata.MLModelProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelProperties");
        }

        public com.linkedin.ml.metadata.QuantitativeAnalyses.Fields QuantitativeAnalyses() {
            return new com.linkedin.ml.metadata.QuantitativeAnalyses.Fields(getPathComponents(), "com.linkedin.ml.metadata.QuantitativeAnalyses");
        }

        public com.linkedin.ml.metadata.TrainingData.Fields TrainingData() {
            return new com.linkedin.ml.metadata.TrainingData.Fields(getPathComponents(), "com.linkedin.ml.metadata.TrainingData");
        }

        public com.linkedin.ml.metadata.SourceCode.Fields SourceCode() {
            return new com.linkedin.ml.metadata.SourceCode.Fields(getPathComponents(), "com.linkedin.ml.metadata.SourceCode");
        }

        public com.linkedin.metadata.key.TagKey.Fields TagKey() {
            return new com.linkedin.metadata.key.TagKey.Fields(getPathComponents(), "com.linkedin.metadata.key.TagKey");
        }

        public com.linkedin.tag.TagProperties.Fields TagProperties() {
            return new com.linkedin.tag.TagProperties.Fields(getPathComponents(), "com.linkedin.tag.TagProperties");
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

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.ChartKey.ProjectionMask _ChartKeyMask;
        private com.linkedin.chart.ChartInfo.ProjectionMask _ChartInfoMask;
        private com.linkedin.chart.ChartQuery.ProjectionMask _ChartQueryMask;
        private com.linkedin.metadata.key.CorpGroupKey.ProjectionMask _CorpGroupKeyMask;
        private com.linkedin.identity.CorpGroupInfo.ProjectionMask _CorpGroupInfoMask;
        private com.linkedin.metadata.key.CorpUserKey.ProjectionMask _CorpUserKeyMask;
        private com.linkedin.identity.CorpUserEditableInfo.ProjectionMask _CorpUserEditableInfoMask;
        private com.linkedin.identity.CorpUserInfo.ProjectionMask _CorpUserInfoMask;
        private com.linkedin.identity.CorpUserStatus.ProjectionMask _CorpUserStatusMask;
        private com.linkedin.identity.GroupMembership.ProjectionMask _GroupMembershipMask;
        private com.linkedin.metadata.key.DashboardKey.ProjectionMask _DashboardKeyMask;
        private com.linkedin.dashboard.DashboardInfo.ProjectionMask _DashboardInfoMask;
        private com.linkedin.metadata.key.DataFlowKey.ProjectionMask _DataFlowKeyMask;
        private com.linkedin.datajob.DataFlowInfo.ProjectionMask _DataFlowInfoMask;
        private com.linkedin.metadata.key.DataJobKey.ProjectionMask _DataJobKeyMask;
        private com.linkedin.datajob.DataJobInfo.ProjectionMask _DataJobInfoMask;
        private com.linkedin.datajob.DataJobInputOutput.ProjectionMask _DataJobInputOutputMask;
        private com.linkedin.dataset.DatasetDeprecation.ProjectionMask _DatasetDeprecationMask;
        private com.linkedin.dataset.DatasetProperties.ProjectionMask _DatasetPropertiesMask;
        private com.linkedin.dataset.UpstreamLineage.ProjectionMask _UpstreamLineageMask;
        private com.linkedin.schema.SchemaMetadata.ProjectionMask _SchemaMetadataMask;
        private com.linkedin.schema.EditableSchemaMetadata.ProjectionMask _EditableSchemaMetadataMask;
        private com.linkedin.common.InstitutionalMemory.ProjectionMask _InstitutionalMemoryMask;
        private com.linkedin.glossary.GlossaryNodeInfo.ProjectionMask _GlossaryNodeInfoMask;
        private com.linkedin.metadata.key.GlossaryNodeKey.ProjectionMask _GlossaryNodeKeyMask;
        private com.linkedin.glossary.GlossaryTermInfo.ProjectionMask _GlossaryTermInfoMask;
        private com.linkedin.metadata.key.GlossaryTermKey.ProjectionMask _GlossaryTermKeyMask;
        private com.linkedin.metadata.key.MLFeatureKey.ProjectionMask _MLFeatureKeyMask;
        private com.linkedin.ml.metadata.MLFeatureProperties.ProjectionMask _MLFeaturePropertiesMask;
        private com.linkedin.metadata.key.MLModelKey.ProjectionMask _MLModelKeyMask;
        private com.linkedin.ml.metadata.CaveatsAndRecommendations.ProjectionMask _CaveatsAndRecommendationsMask;
        private com.linkedin.ml.metadata.EthicalConsiderations.ProjectionMask _EthicalConsiderationsMask;
        private com.linkedin.ml.metadata.EvaluationData.ProjectionMask _EvaluationDataMask;
        private com.linkedin.ml.metadata.IntendedUse.ProjectionMask _IntendedUseMask;
        private com.linkedin.ml.metadata.Metrics.ProjectionMask _MetricsMask;
        private com.linkedin.ml.metadata.MLModelFactorPrompts.ProjectionMask _MLModelFactorPromptsMask;
        private com.linkedin.ml.metadata.MLModelProperties.ProjectionMask _MLModelPropertiesMask;
        private com.linkedin.ml.metadata.QuantitativeAnalyses.ProjectionMask _QuantitativeAnalysesMask;
        private com.linkedin.ml.metadata.TrainingData.ProjectionMask _TrainingDataMask;
        private com.linkedin.ml.metadata.SourceCode.ProjectionMask _SourceCodeMask;
        private com.linkedin.metadata.key.TagKey.ProjectionMask _TagKeyMask;
        private com.linkedin.tag.TagProperties.ProjectionMask _TagPropertiesMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.BrowsePaths.ProjectionMask _BrowsePathsMask;
        private com.linkedin.common.DataPlatformInstance.ProjectionMask _DataPlatformInstanceMask;

        ProjectionMask() {
        }

        public Aspect.ProjectionMask withChartKey(Function<com.linkedin.metadata.key.ChartKey.ProjectionMask, com.linkedin.metadata.key.ChartKey.ProjectionMask> nestedMask) {
            _ChartKeyMask = nestedMask.apply(((_ChartKeyMask == null)?com.linkedin.metadata.key.ChartKey.createMask():_ChartKeyMask));
            getDataMap().put("com.linkedin.metadata.key.ChartKey", _ChartKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withChartInfo(Function<com.linkedin.chart.ChartInfo.ProjectionMask, com.linkedin.chart.ChartInfo.ProjectionMask> nestedMask) {
            _ChartInfoMask = nestedMask.apply(((_ChartInfoMask == null)?com.linkedin.chart.ChartInfo.createMask():_ChartInfoMask));
            getDataMap().put("com.linkedin.chart.ChartInfo", _ChartInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withChartQuery(Function<com.linkedin.chart.ChartQuery.ProjectionMask, com.linkedin.chart.ChartQuery.ProjectionMask> nestedMask) {
            _ChartQueryMask = nestedMask.apply(((_ChartQueryMask == null)?com.linkedin.chart.ChartQuery.createMask():_ChartQueryMask));
            getDataMap().put("com.linkedin.chart.ChartQuery", _ChartQueryMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCorpGroupKey(Function<com.linkedin.metadata.key.CorpGroupKey.ProjectionMask, com.linkedin.metadata.key.CorpGroupKey.ProjectionMask> nestedMask) {
            _CorpGroupKeyMask = nestedMask.apply(((_CorpGroupKeyMask == null)?com.linkedin.metadata.key.CorpGroupKey.createMask():_CorpGroupKeyMask));
            getDataMap().put("com.linkedin.metadata.key.CorpGroupKey", _CorpGroupKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCorpGroupInfo(Function<com.linkedin.identity.CorpGroupInfo.ProjectionMask, com.linkedin.identity.CorpGroupInfo.ProjectionMask> nestedMask) {
            _CorpGroupInfoMask = nestedMask.apply(((_CorpGroupInfoMask == null)?com.linkedin.identity.CorpGroupInfo.createMask():_CorpGroupInfoMask));
            getDataMap().put("com.linkedin.identity.CorpGroupInfo", _CorpGroupInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCorpUserKey(Function<com.linkedin.metadata.key.CorpUserKey.ProjectionMask, com.linkedin.metadata.key.CorpUserKey.ProjectionMask> nestedMask) {
            _CorpUserKeyMask = nestedMask.apply(((_CorpUserKeyMask == null)?com.linkedin.metadata.key.CorpUserKey.createMask():_CorpUserKeyMask));
            getDataMap().put("com.linkedin.metadata.key.CorpUserKey", _CorpUserKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCorpUserEditableInfo(Function<com.linkedin.identity.CorpUserEditableInfo.ProjectionMask, com.linkedin.identity.CorpUserEditableInfo.ProjectionMask> nestedMask) {
            _CorpUserEditableInfoMask = nestedMask.apply(((_CorpUserEditableInfoMask == null)?com.linkedin.identity.CorpUserEditableInfo.createMask():_CorpUserEditableInfoMask));
            getDataMap().put("com.linkedin.identity.CorpUserEditableInfo", _CorpUserEditableInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCorpUserInfo(Function<com.linkedin.identity.CorpUserInfo.ProjectionMask, com.linkedin.identity.CorpUserInfo.ProjectionMask> nestedMask) {
            _CorpUserInfoMask = nestedMask.apply(((_CorpUserInfoMask == null)?com.linkedin.identity.CorpUserInfo.createMask():_CorpUserInfoMask));
            getDataMap().put("com.linkedin.identity.CorpUserInfo", _CorpUserInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCorpUserStatus(Function<com.linkedin.identity.CorpUserStatus.ProjectionMask, com.linkedin.identity.CorpUserStatus.ProjectionMask> nestedMask) {
            _CorpUserStatusMask = nestedMask.apply(((_CorpUserStatusMask == null)?com.linkedin.identity.CorpUserStatus.createMask():_CorpUserStatusMask));
            getDataMap().put("com.linkedin.identity.CorpUserStatus", _CorpUserStatusMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withGroupMembership(Function<com.linkedin.identity.GroupMembership.ProjectionMask, com.linkedin.identity.GroupMembership.ProjectionMask> nestedMask) {
            _GroupMembershipMask = nestedMask.apply(((_GroupMembershipMask == null)?com.linkedin.identity.GroupMembership.createMask():_GroupMembershipMask));
            getDataMap().put("com.linkedin.identity.GroupMembership", _GroupMembershipMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDashboardKey(Function<com.linkedin.metadata.key.DashboardKey.ProjectionMask, com.linkedin.metadata.key.DashboardKey.ProjectionMask> nestedMask) {
            _DashboardKeyMask = nestedMask.apply(((_DashboardKeyMask == null)?com.linkedin.metadata.key.DashboardKey.createMask():_DashboardKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DashboardKey", _DashboardKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDashboardInfo(Function<com.linkedin.dashboard.DashboardInfo.ProjectionMask, com.linkedin.dashboard.DashboardInfo.ProjectionMask> nestedMask) {
            _DashboardInfoMask = nestedMask.apply(((_DashboardInfoMask == null)?com.linkedin.dashboard.DashboardInfo.createMask():_DashboardInfoMask));
            getDataMap().put("com.linkedin.dashboard.DashboardInfo", _DashboardInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDataFlowKey(Function<com.linkedin.metadata.key.DataFlowKey.ProjectionMask, com.linkedin.metadata.key.DataFlowKey.ProjectionMask> nestedMask) {
            _DataFlowKeyMask = nestedMask.apply(((_DataFlowKeyMask == null)?com.linkedin.metadata.key.DataFlowKey.createMask():_DataFlowKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataFlowKey", _DataFlowKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDataFlowInfo(Function<com.linkedin.datajob.DataFlowInfo.ProjectionMask, com.linkedin.datajob.DataFlowInfo.ProjectionMask> nestedMask) {
            _DataFlowInfoMask = nestedMask.apply(((_DataFlowInfoMask == null)?com.linkedin.datajob.DataFlowInfo.createMask():_DataFlowInfoMask));
            getDataMap().put("com.linkedin.datajob.DataFlowInfo", _DataFlowInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDataJobKey(Function<com.linkedin.metadata.key.DataJobKey.ProjectionMask, com.linkedin.metadata.key.DataJobKey.ProjectionMask> nestedMask) {
            _DataJobKeyMask = nestedMask.apply(((_DataJobKeyMask == null)?com.linkedin.metadata.key.DataJobKey.createMask():_DataJobKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataJobKey", _DataJobKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDataJobInfo(Function<com.linkedin.datajob.DataJobInfo.ProjectionMask, com.linkedin.datajob.DataJobInfo.ProjectionMask> nestedMask) {
            _DataJobInfoMask = nestedMask.apply(((_DataJobInfoMask == null)?com.linkedin.datajob.DataJobInfo.createMask():_DataJobInfoMask));
            getDataMap().put("com.linkedin.datajob.DataJobInfo", _DataJobInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDataJobInputOutput(Function<com.linkedin.datajob.DataJobInputOutput.ProjectionMask, com.linkedin.datajob.DataJobInputOutput.ProjectionMask> nestedMask) {
            _DataJobInputOutputMask = nestedMask.apply(((_DataJobInputOutputMask == null)?com.linkedin.datajob.DataJobInputOutput.createMask():_DataJobInputOutputMask));
            getDataMap().put("com.linkedin.datajob.DataJobInputOutput", _DataJobInputOutputMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDatasetDeprecation(Function<com.linkedin.dataset.DatasetDeprecation.ProjectionMask, com.linkedin.dataset.DatasetDeprecation.ProjectionMask> nestedMask) {
            _DatasetDeprecationMask = nestedMask.apply(((_DatasetDeprecationMask == null)?com.linkedin.dataset.DatasetDeprecation.createMask():_DatasetDeprecationMask));
            getDataMap().put("com.linkedin.dataset.DatasetDeprecation", _DatasetDeprecationMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDatasetProperties(Function<com.linkedin.dataset.DatasetProperties.ProjectionMask, com.linkedin.dataset.DatasetProperties.ProjectionMask> nestedMask) {
            _DatasetPropertiesMask = nestedMask.apply(((_DatasetPropertiesMask == null)?com.linkedin.dataset.DatasetProperties.createMask():_DatasetPropertiesMask));
            getDataMap().put("com.linkedin.dataset.DatasetProperties", _DatasetPropertiesMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withUpstreamLineage(Function<com.linkedin.dataset.UpstreamLineage.ProjectionMask, com.linkedin.dataset.UpstreamLineage.ProjectionMask> nestedMask) {
            _UpstreamLineageMask = nestedMask.apply(((_UpstreamLineageMask == null)?com.linkedin.dataset.UpstreamLineage.createMask():_UpstreamLineageMask));
            getDataMap().put("com.linkedin.dataset.UpstreamLineage", _UpstreamLineageMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withSchemaMetadata(Function<com.linkedin.schema.SchemaMetadata.ProjectionMask, com.linkedin.schema.SchemaMetadata.ProjectionMask> nestedMask) {
            _SchemaMetadataMask = nestedMask.apply(((_SchemaMetadataMask == null)?com.linkedin.schema.SchemaMetadata.createMask():_SchemaMetadataMask));
            getDataMap().put("com.linkedin.schema.SchemaMetadata", _SchemaMetadataMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withEditableSchemaMetadata(Function<com.linkedin.schema.EditableSchemaMetadata.ProjectionMask, com.linkedin.schema.EditableSchemaMetadata.ProjectionMask> nestedMask) {
            _EditableSchemaMetadataMask = nestedMask.apply(((_EditableSchemaMetadataMask == null)?com.linkedin.schema.EditableSchemaMetadata.createMask():_EditableSchemaMetadataMask));
            getDataMap().put("com.linkedin.schema.EditableSchemaMetadata", _EditableSchemaMetadataMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withInstitutionalMemory(Function<com.linkedin.common.InstitutionalMemory.ProjectionMask, com.linkedin.common.InstitutionalMemory.ProjectionMask> nestedMask) {
            _InstitutionalMemoryMask = nestedMask.apply(((_InstitutionalMemoryMask == null)?com.linkedin.common.InstitutionalMemory.createMask():_InstitutionalMemoryMask));
            getDataMap().put("com.linkedin.common.InstitutionalMemory", _InstitutionalMemoryMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withGlossaryNodeInfo(Function<com.linkedin.glossary.GlossaryNodeInfo.ProjectionMask, com.linkedin.glossary.GlossaryNodeInfo.ProjectionMask> nestedMask) {
            _GlossaryNodeInfoMask = nestedMask.apply(((_GlossaryNodeInfoMask == null)?com.linkedin.glossary.GlossaryNodeInfo.createMask():_GlossaryNodeInfoMask));
            getDataMap().put("com.linkedin.glossary.GlossaryNodeInfo", _GlossaryNodeInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withGlossaryNodeKey(Function<com.linkedin.metadata.key.GlossaryNodeKey.ProjectionMask, com.linkedin.metadata.key.GlossaryNodeKey.ProjectionMask> nestedMask) {
            _GlossaryNodeKeyMask = nestedMask.apply(((_GlossaryNodeKeyMask == null)?com.linkedin.metadata.key.GlossaryNodeKey.createMask():_GlossaryNodeKeyMask));
            getDataMap().put("com.linkedin.metadata.key.GlossaryNodeKey", _GlossaryNodeKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withGlossaryTermInfo(Function<com.linkedin.glossary.GlossaryTermInfo.ProjectionMask, com.linkedin.glossary.GlossaryTermInfo.ProjectionMask> nestedMask) {
            _GlossaryTermInfoMask = nestedMask.apply(((_GlossaryTermInfoMask == null)?com.linkedin.glossary.GlossaryTermInfo.createMask():_GlossaryTermInfoMask));
            getDataMap().put("com.linkedin.glossary.GlossaryTermInfo", _GlossaryTermInfoMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withGlossaryTermKey(Function<com.linkedin.metadata.key.GlossaryTermKey.ProjectionMask, com.linkedin.metadata.key.GlossaryTermKey.ProjectionMask> nestedMask) {
            _GlossaryTermKeyMask = nestedMask.apply(((_GlossaryTermKeyMask == null)?com.linkedin.metadata.key.GlossaryTermKey.createMask():_GlossaryTermKeyMask));
            getDataMap().put("com.linkedin.metadata.key.GlossaryTermKey", _GlossaryTermKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withMLFeatureKey(Function<com.linkedin.metadata.key.MLFeatureKey.ProjectionMask, com.linkedin.metadata.key.MLFeatureKey.ProjectionMask> nestedMask) {
            _MLFeatureKeyMask = nestedMask.apply(((_MLFeatureKeyMask == null)?com.linkedin.metadata.key.MLFeatureKey.createMask():_MLFeatureKeyMask));
            getDataMap().put("com.linkedin.metadata.key.MLFeatureKey", _MLFeatureKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withMLFeatureProperties(Function<com.linkedin.ml.metadata.MLFeatureProperties.ProjectionMask, com.linkedin.ml.metadata.MLFeatureProperties.ProjectionMask> nestedMask) {
            _MLFeaturePropertiesMask = nestedMask.apply(((_MLFeaturePropertiesMask == null)?com.linkedin.ml.metadata.MLFeatureProperties.createMask():_MLFeaturePropertiesMask));
            getDataMap().put("com.linkedin.ml.metadata.MLFeatureProperties", _MLFeaturePropertiesMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withMLModelKey(Function<com.linkedin.metadata.key.MLModelKey.ProjectionMask, com.linkedin.metadata.key.MLModelKey.ProjectionMask> nestedMask) {
            _MLModelKeyMask = nestedMask.apply(((_MLModelKeyMask == null)?com.linkedin.metadata.key.MLModelKey.createMask():_MLModelKeyMask));
            getDataMap().put("com.linkedin.metadata.key.MLModelKey", _MLModelKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withCaveatsAndRecommendations(Function<com.linkedin.ml.metadata.CaveatsAndRecommendations.ProjectionMask, com.linkedin.ml.metadata.CaveatsAndRecommendations.ProjectionMask> nestedMask) {
            _CaveatsAndRecommendationsMask = nestedMask.apply(((_CaveatsAndRecommendationsMask == null)?com.linkedin.ml.metadata.CaveatsAndRecommendations.createMask():_CaveatsAndRecommendationsMask));
            getDataMap().put("com.linkedin.ml.metadata.CaveatsAndRecommendations", _CaveatsAndRecommendationsMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withEthicalConsiderations(Function<com.linkedin.ml.metadata.EthicalConsiderations.ProjectionMask, com.linkedin.ml.metadata.EthicalConsiderations.ProjectionMask> nestedMask) {
            _EthicalConsiderationsMask = nestedMask.apply(((_EthicalConsiderationsMask == null)?com.linkedin.ml.metadata.EthicalConsiderations.createMask():_EthicalConsiderationsMask));
            getDataMap().put("com.linkedin.ml.metadata.EthicalConsiderations", _EthicalConsiderationsMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withEvaluationData(Function<com.linkedin.ml.metadata.EvaluationData.ProjectionMask, com.linkedin.ml.metadata.EvaluationData.ProjectionMask> nestedMask) {
            _EvaluationDataMask = nestedMask.apply(((_EvaluationDataMask == null)?com.linkedin.ml.metadata.EvaluationData.createMask():_EvaluationDataMask));
            getDataMap().put("com.linkedin.ml.metadata.EvaluationData", _EvaluationDataMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withIntendedUse(Function<com.linkedin.ml.metadata.IntendedUse.ProjectionMask, com.linkedin.ml.metadata.IntendedUse.ProjectionMask> nestedMask) {
            _IntendedUseMask = nestedMask.apply(((_IntendedUseMask == null)?com.linkedin.ml.metadata.IntendedUse.createMask():_IntendedUseMask));
            getDataMap().put("com.linkedin.ml.metadata.IntendedUse", _IntendedUseMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withMetrics(Function<com.linkedin.ml.metadata.Metrics.ProjectionMask, com.linkedin.ml.metadata.Metrics.ProjectionMask> nestedMask) {
            _MetricsMask = nestedMask.apply(((_MetricsMask == null)?com.linkedin.ml.metadata.Metrics.createMask():_MetricsMask));
            getDataMap().put("com.linkedin.ml.metadata.Metrics", _MetricsMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withMLModelFactorPrompts(Function<com.linkedin.ml.metadata.MLModelFactorPrompts.ProjectionMask, com.linkedin.ml.metadata.MLModelFactorPrompts.ProjectionMask> nestedMask) {
            _MLModelFactorPromptsMask = nestedMask.apply(((_MLModelFactorPromptsMask == null)?com.linkedin.ml.metadata.MLModelFactorPrompts.createMask():_MLModelFactorPromptsMask));
            getDataMap().put("com.linkedin.ml.metadata.MLModelFactorPrompts", _MLModelFactorPromptsMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withMLModelProperties(Function<com.linkedin.ml.metadata.MLModelProperties.ProjectionMask, com.linkedin.ml.metadata.MLModelProperties.ProjectionMask> nestedMask) {
            _MLModelPropertiesMask = nestedMask.apply(((_MLModelPropertiesMask == null)?com.linkedin.ml.metadata.MLModelProperties.createMask():_MLModelPropertiesMask));
            getDataMap().put("com.linkedin.ml.metadata.MLModelProperties", _MLModelPropertiesMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withQuantitativeAnalyses(Function<com.linkedin.ml.metadata.QuantitativeAnalyses.ProjectionMask, com.linkedin.ml.metadata.QuantitativeAnalyses.ProjectionMask> nestedMask) {
            _QuantitativeAnalysesMask = nestedMask.apply(((_QuantitativeAnalysesMask == null)?com.linkedin.ml.metadata.QuantitativeAnalyses.createMask():_QuantitativeAnalysesMask));
            getDataMap().put("com.linkedin.ml.metadata.QuantitativeAnalyses", _QuantitativeAnalysesMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withTrainingData(Function<com.linkedin.ml.metadata.TrainingData.ProjectionMask, com.linkedin.ml.metadata.TrainingData.ProjectionMask> nestedMask) {
            _TrainingDataMask = nestedMask.apply(((_TrainingDataMask == null)?com.linkedin.ml.metadata.TrainingData.createMask():_TrainingDataMask));
            getDataMap().put("com.linkedin.ml.metadata.TrainingData", _TrainingDataMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withSourceCode(Function<com.linkedin.ml.metadata.SourceCode.ProjectionMask, com.linkedin.ml.metadata.SourceCode.ProjectionMask> nestedMask) {
            _SourceCodeMask = nestedMask.apply(((_SourceCodeMask == null)?com.linkedin.ml.metadata.SourceCode.createMask():_SourceCodeMask));
            getDataMap().put("com.linkedin.ml.metadata.SourceCode", _SourceCodeMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withTagKey(Function<com.linkedin.metadata.key.TagKey.ProjectionMask, com.linkedin.metadata.key.TagKey.ProjectionMask> nestedMask) {
            _TagKeyMask = nestedMask.apply(((_TagKeyMask == null)?com.linkedin.metadata.key.TagKey.createMask():_TagKeyMask));
            getDataMap().put("com.linkedin.metadata.key.TagKey", _TagKeyMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withTagProperties(Function<com.linkedin.tag.TagProperties.ProjectionMask, com.linkedin.tag.TagProperties.ProjectionMask> nestedMask) {
            _TagPropertiesMask = nestedMask.apply(((_TagPropertiesMask == null)?com.linkedin.tag.TagProperties.createMask():_TagPropertiesMask));
            getDataMap().put("com.linkedin.tag.TagProperties", _TagPropertiesMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withBrowsePaths(Function<com.linkedin.common.BrowsePaths.ProjectionMask, com.linkedin.common.BrowsePaths.ProjectionMask> nestedMask) {
            _BrowsePathsMask = nestedMask.apply(((_BrowsePathsMask == null)?com.linkedin.common.BrowsePaths.createMask():_BrowsePathsMask));
            getDataMap().put("com.linkedin.common.BrowsePaths", _BrowsePathsMask.getDataMap());
            return this;
        }

        public Aspect.ProjectionMask withDataPlatformInstance(Function<com.linkedin.common.DataPlatformInstance.ProjectionMask, com.linkedin.common.DataPlatformInstance.ProjectionMask> nestedMask) {
            _DataPlatformInstanceMask = nestedMask.apply(((_DataPlatformInstanceMask == null)?com.linkedin.common.DataPlatformInstance.createMask():_DataPlatformInstanceMask));
            getDataMap().put("com.linkedin.common.DataPlatformInstance", _DataPlatformInstanceMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a Chart
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema(new StringBuilder().append("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Chart*/typeref Aspect=union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the chart*/@Searchable.searchTier=2,description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}chartUrl:optional com.linkedin.common.Url/**Data sources for the chart\nDeprecated! Use inputEdges instead.*/@Relationship.`/*/string`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]]/**Data sources for the chart*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputEdges/*/created/actor\",\"createdOn\":\"inputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"chart\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputEdges/*/properties\",\"updatedActor\":\"inputEdges/*/lastModified/actor\",\"updatedOn\":\"inputEdges/*/lastModified/time\"}inputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional AuditStamp/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Type of the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Chart Type\",\"searchTier\":3}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT,WORD_CLOUD,COHORT}/**Access level for the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"addToFilters\":true,\"fieldName\":\"queryType\",\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Query Type\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}name:string}}{namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional com.linkedin.common.AuditStamp}}{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"boostScore\":2.0,\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"fieldType\":\"WORD_GRAM\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserEditableInfo\"}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:com.linkedin.common.Url=\"assets/platforms/default_avatar.png\"/**DataHub-native display name*/@Searchable={\"boostScore\":10.0,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}displayName:optional string/**DataHub-native Title, e.g. 'Software Engineer'*/title:optional string/**The platforms that the user commonly works with*/@Relationship.`/*`={\"entityTypes\":[\"dataPlatform\"],\"name\":\"IsUserOf\"}platforms:optional array[com.linkedin.common.Urn]/**The user's persona type, based on their role*/@Relationship={\"entityTypes\":[\"dataHubPersona\"],\"name\":\"IsPersona\"}persona:optional com.linkedin.common.Urn/**Slack handle for the user*/slack:optional string/**Phone number to contact the user*/phone:optional string/**Email address to contact the user*/email:optional string/**Information sources that have been used to populate this CorpUserEditableInfo.\nThese include platform resources, such as Slack members or Looker users.\nThey can also refer to other semantic urns in the future.*/informationSources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserInfo\"}record CorpUserInfo includes com.linkedin.common.CustomProperties{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":2.0}}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email address of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true,\"searchTier\":1}email:optional com.linkedin.common.EmailAddress/**title of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true}title:optional string/**direct manager of this user*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"ReportsTo\"}@Searchable={\"fieldName\":\"managerLdap\",\"fieldType\":\"URN\",\"queryByDefault\":false}managerUrn:optional com.linkedin.common.CorpuserUrn/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string/**Whether the corpUser is a system user.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"queryByDefault\":false}system:optional boolean=false}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/@Searchable.`/time`={\"fieldName\":\"statusLastModifiedAt\",\"fieldType\":\"COUNT\"}lastModified:com.linkedin.common.AuditStamp}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfGroup\"}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for a Dashboard*/@Aspect.name=\"dashboardKey\"record DashboardKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'*/dashboardId:string}}{namespace com.linkedin.dashboard/**Information about a dashboard*/@Aspect.name=\"dashboardInfo\"record DashboardInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Title of the dashboard*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the dashboard*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:string/**Charts in a dashboard\nDeprecated! Use chartEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"chart\"],\"isLineage\":true,\"name\":\"Contains\"}@deprecated,charts:array[{namespace com.linkedin.common/**Standardized chart identifier*/@java.class=\"com.linkedin.common.urn.ChartUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized chart identifier\",\"entityType\":\"chart\",\"fields\":[{\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"maxLength\":20,\"name\":\"dashboardTool\",\"type\":\"string\"},{\"doc\":\"Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'\",\"maxLength\":200,\"name\":\"chartId\",\"type\":\"string\"}],\"maxLength\":236,\"name\":\"Chart\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref ChartUrn=string}]=[]/**Charts in a dashboard*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"chartEdges/*/created/actor\",\"createdOn\":\"chartEdges/*/created/time\",\"entityTypes\":[\"chart\"],\"isLineage\":true,\"name\":\"Contains\",\"properties\":\"chartEdges/*/properties\",\"updatedActor\":\"chartEdges/*/lastModified/actor\",\"updatedOn\":\"chartEdges/*/lastModified/time\"}chartEdges:optional array[com.linkedin.common.Edge]/**Datasets consumed by a dashboard\nDeprecated! Use datasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,datasets:array[com.linkedin.common.Urn]=[]/**Datasets consumed by a dashboard*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"datasetEdges/*/created/actor\",\"createdOn\":\"datasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"datasetEdges/*/properties\",\"updatedActor\":\"datasetEdges/*/lastModified/actor\",\"updatedOn\":\"datasetEdges/*/lastModified/time\"}datasetEdges:optional array[com.linkedin.common.Edge]/**Dashboards included by this dashboard.\nSome dashboard entities (e.g. PowerBI Apps) can contain other dashboards.\n\nThe Edge's sourceUrn should never be set, as it will always be the base dashboard.*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"dashboards/*/created/actor\",\"createdOn\":\"dashboards/*/created/time\",\"entityTypes\":[\"dashboard\"],\"isLineage\":true,\"name\":\"DashboardContainsDashboard\",\"properties\":\"dashboards/*/properties\",\"updatedActor\":\"dashboards/*/lastModified/actor\",\"updatedOn\":\"dashboards/*/lastModified/time\"}dashboards:array[com.linkedin.common.Edge]=[]/**Captures information about who created/last modified/deleted this dashboard and when*/@Searchable.`/lastModified/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:com.linkedin.common.ChangeAuditStamps/**URL for the dashboard. This could be used as an external link on DataHub to allow users access/view the dashboard*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}dashboardUrl:optional com.linkedin.common.Url/**Access level for the dashboard*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional com.linkedin.common.AccessLevel/**The time when this dashboard last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.metadata.key/**Key for a Data Flow*/@Aspect.name=\"dataFlowKey\"record DataFlowKey{/**Workflow manager like azkaban, airflow which orchestrates the flow*/@Searchable.fieldType=\"TEXT_PARTIAL\"orchestrator:string/**Unique Identifier of the data flow*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}flowId:string/**Cluster where the flow is executed*/@Searchable.fieldType=\"TEXT_PARTIAL\"cluster:string}}{namespace com.linkedin.datajob/**Information about a Data processing flow*/@Aspect.name=\"dataFlowInfo\"record DataFlowInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Flow name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Flow description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Optional project/namespace associated with the flow*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false,\"searchTier\":3}project:optional string/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:Time/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Environment for this flow*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"entityTypes\":[\"dataFlow\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"dataFlow\",\"fieldType\":\"URN_PARTIAL\",\"queryByDefault\":false}flow:com.linkedin.common.Urn/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}jobId:string}}{namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"dataJobInfo\"record DataJobInfo includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Job name*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Job description*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Datajob type\n**NOTE**: AzkabanJobType is deprecated. Please use strings instead.*/type:union[{namespace com.linkedin.datajob.azkaban/**The various types of support azkaban jobs*/enum AzkabanJobType{/**The command job type is one of the basic built-in types. It runs multiple UNIX commands using java processbuilder.\nUpon execution, Azkaban spawns off a process to run the command.*/COMMAND/**Runs a java program with ability to access Hadoop cluster.\nhttps://azkaban.readthedocs.io/en/latest/jobTypes.html#java-job-type*/HADOOP_JAVA/**In large part, this is the same Command type. The difference is its ability to talk to a Hadoop cluster\nsecurely, via Hadoop tokens.*/HADOOP_SHELL/**Hive type is for running Hive jobs.*/HIVE/**Pig type is for running Pig jobs.*/PIG/**SQL is for running Presto, mysql queries etc*/SQL/**Glue type is for running AWS Glue job transforms.*/GLUE}}string]/**DataFlow urn that this job is part of*/flowUrn:optional{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing flow identifier.\",\"entityType\":\"dataFlow\",\"fields\":[{\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"maxLength\":50,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Unique Identifier of the data flow\",\"maxLength\":200,\"name\":\"flowId\",\"type\":\"string\"},{\"doc\":\"Cluster where the flow is executed\",\"maxLength\":100,\"name\":\"cluster\",\"type\":\"string\"}],\"maxLength\":373,\"name\":\"DataFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataFlowUrn=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional com.linkedin.common.TimeStamp/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**Status of the job - Deprecated for Data Process Instance model.*/@deprecated=\"Use Data Process Instance model, instead\"status:optional/**Job statuses*/enum JobStatus{/**Jobs being initialized.*/STARTING/**Jobs currently running.*/IN_PROGRESS/**Jobs being stopped.*/STOPPING/**Jobs that have stopped.*/STOPPED/**Jobs with successful completion.*/COMPLETED/**Jobs that have failed.*/FAILED/**Jobs with unknown status (either unmappable or unavailable)*/UNKNOWN/**Jobs that have been skipped.*/SKIPPED}/**Environment for this job*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}env:optional com.linkedin.common.FabricType}}{namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing\nDeprecated! Use inputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}@deprecated,inputDatasets:array[com.linkedin.common.DatasetUrn]/**Input datasets consumed by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatasetEdges/*/created/actor\",\"createdOn\":\"inputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputDatasetEdges/*/properties\",\"updatedActor\":\"inputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"inputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputDatasetEdges:optional array[com.linkedin.common.Edge]/**Output datasets produced by the data job during processing\nDeprecated! Use outputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}@deprecated,outputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"outputDatasetEdges/*/created/actor\",\"createdOn\":\"outputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\",\"properties\":\"outputDatasetEdges/*/properties\",\"updatedActor\":\"outputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"outputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"outputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputDatasetEdges:optional array[com.linkedin.common.Edge]/**Input datajobs that this data job depends on\nDeprecated! Use inputDatajobEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\"}@deprecated,inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing job identifier.\",\"entityType\":\"dataJob\",\"fields\":[{\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"doc\":\"Unique identifier of the data job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":594,\"name\":\"DataJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataJobUrn=string}]/**Input datajobs that this data job depends on*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatajobEdges/*/created/actor\",\"createdOn\":\"inputDatajobEdges/*/created/time\",\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"inputDatajobEdges/*/properties\",\"updatedActor\":\"inputDatajobEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatajobEdges/*/lastModified/time\"}inputDatajobEdges:optional array[com.linkedin.common.Edge]/**Fields of the input datasets used by this job*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputFields\",\"queryByDefault\":false}inputDatasetFields:optional array[com.linkedin.common.Urn]/**Fields of the output datasets this job writes to*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputFields\",\"queryByDefault\":false}outputDatasetFields:optional array[com.linkedin.common.Urn]/**Fine-grained column-level lineages\nNot currently supported in the UI\nUse UpstreamLineage aspect for datasets to express Column Level Lineage for the UI*/fineGrainedLineages:optional array[{namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.").append("common.Urn}}]}}{namespace com.linkedin.dataset/**Dataset deprecation status\nDeprecated! This aspect is deprecated in favor of the more-general-purpose 'Deprecation' aspect.*/@Aspect.name=\"datasetDeprecation\"@Deprecated,record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional com.linkedin.common.Urn}}{namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference{/**Display name of the Dataset*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Fully-qualified name of the Dataset*/@Searchable={\"addToFilters\":false,\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"qualifiedName\",\"searchTier\":1}qualifiedName:optional string/**Documentation of the dataset*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/@deprecated=\"Use ExternalReference.externalUrl field instead.\"uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**A timestamp documenting when the asset was created in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"createdAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional com.linkedin.common.TimeStamp/**A timestamp documenting when the asset was last modified in the source Data Platform (not on DataHub)*/@Searchable.`/time`={\"fieldName\":\"lastModifiedAt\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"lastModifiedAt\"}lastModified:optional com.linkedin.common.TimeStamp/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.\nThis is now deprecated.*/@deprecated=\"Use GlobalTags aspect instead.\"tags:array[string]=[]}}{namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.*/auditStamp:com.linkedin.common.AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**Audit stamp containing who created the lineage and when.*/created:optional com.linkedin.common.AuditStamp/**The upstream dataset the lineage points to*/@Relationship={\"createdActor\":\"upstreams/*/created/actor\",\"createdOn\":\"upstreams/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"upstreams/*/properties\",\"updatedActor\":\"upstreams/*/auditStamp/actor\",\"updatedOn\":\"upstreams/*/auditStamp/time\",\"via\":\"upstreams/*/query\"}@Searchable={\"fieldName\":\"upstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasUpstreams\",\"queryByDefault\":false}dataset:com.linkedin.common.DatasetUrn/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]/**If the lineage is generated by a query, a reference to the query*/query:optional com.linkedin.common.Urn}]/** List of fine-grained lineage information, including field-level lineage*/@Relationship.`/*/upstreams/*`={\"entityTypes\":[\"dataset\",\"schemaField\"],\"name\":\"DownstreamOf\"}fineGrainedLineages:optional array[FineGrainedLineage]}}{namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}com.linkedin.common.ChangeAuditStamps{/**Dataset this schema metadata is associated with.*/dataset:optional com.linkedin.common.DatasetUrn/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema.*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field.*/@Searchable={\"boostScore\":1.0,\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT\",\"queryByDefault\":\"true\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/@Deprecated,jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"fieldDescriptions\",\"fieldType\":\"TEXT\"}description:optional string/**Label of the field. Provides a more human-readable name for the field than field path. Some sources will\nprovide this metadata but not all sources have the concept of a label. If just one string is associated with\na field in a source, that is most likely a description.\n\nNote that this field is deprecated and is not surfaced in the UI.*/@Deprecated@Searchable={\"boostScore\":0.2,\"fieldName\":\"fieldLabels\",\"fieldType\":\"TEXT\"}label:optional string/**An AuditStamp corresponding to the creation of this schema field.*/created:optional com.linkedin.common.AuditStamp/**An AuditStamp corresponding to the last modification of this schema field.*/lastModified:optional com.linkedin.common.AuditStamp/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"SchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"fieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"fieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"fieldTagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"fieldTags\",\"fieldType\":\"URN\"}}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"SchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"fieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"fieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"fieldTermAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"fieldGlossaryTerms\",\"fieldType\":\"URN\"}}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false/**For Datasets which are partitioned, this determines the partitioning key.\nNote that multiple columns can be part of a partitioning key, but currently we do not support\nrendering the ordered partitioning key.*/isPartitioningKey:optional boolean/**For schema fields that have other properties that are not modeled explicitly,\nuse this field to serialize those properties into a JSON string*/jsonProps:optional string}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}]}}{namespace com.linkedin.schema/**EditableSchemaMetadata stores editable changes made to schema metadata. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines.*/@Aspect.name=\"editableSchemaMetadata\"record EditableSchemaMetadata includes com.linkedin.common.ChangeAuditStamps{/**Client provided a list of fields from document schema.*/editableSchemaFieldInfo:array[/**SchemaField to describe metadata related to dataset schema.*/record EditableSchemaFieldInfo{/**FieldPath uniquely identifying the SchemaField this metadata is associated with*/fieldPath:string/**Description*/@Searchable={\"boostScore\":0.1,\"fieldName\":\"editedFieldDescriptions\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**Tags associated with the field*/@Relationship.`/tags/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"EditableSchemaFieldTaggedWith\"}@Searchable={\"/tags/*/attribution/actor\":{\"fieldName\":\"editedFieldTagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/source\":{\"fieldName\":\"editedFieldTagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/tags/*/attribution/time\":{\"fieldName\":\"editedFieldTagAttributionDates\",\"fieldType\":\"DATETIME\"},\"/tags/*/tag\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldTags\",\"fieldType\":\"URN\"}}globalTags:optional com.linkedin.common.GlobalTags/**Glossary terms associated with the field*/@Relationship.`/terms/*/urn`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"EditableSchemaFieldWithGlossaryTerm\"}@Searchable={\"/terms/*/attribution/actor\":{\"fieldName\":\"editedFieldTermAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/source\":{\"fieldName\":\"editedFieldTermAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/terms/*/attribution/time\":{\"fieldName\":\"editedFieldTermAttributionDates\",\"fieldType\":\"DATETIME\"},\"/terms/*/urn\":{\"boostScore\":0.5,\"fieldName\":\"editedFieldGlossaryTerms\",\"fieldType\":\"URN\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"schemaFieldTermsModifiedAt\"}}glossaryTerms:optional com.linkedin.common.GlossaryTerms}]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo includes com.linkedin.common.CustomProperties{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Display name of the node*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"displayName\",\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Optional id for the GlossaryNode*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string}}{namespace com.linkedin.metadata.key/**Key for a GlossaryNode*/@Aspect.name=\"glossaryNodeKey\"record GlossaryNodeKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo includes com.linkedin.common.CustomProperties{/**Optional id for the term*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string/**Display name of the term*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Definition of business term.*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional com.linkedin.common.GlossaryNodeUrn/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional com.linkedin.common.Url/**Schema definition of the glossary term*/@deprecated,rawSchema:optional string}}{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{/**The term name, which serves as a unique id*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.metadata.key/**Key for an MLFeature*/@Aspect.name=\"mlFeatureKey\"record MLFeatureKey{/**Namespace for the feature*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the feature*/@Searchable={\"boostScore\":8.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLFeature*/@Aspect.name=\"mlFeatureProperties\"record MLFeatureProperties includes com.linkedin.common.CustomProperties{/**Documentation of the MLFeature*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\"}description:optional string/**Data Type of the MLFeature*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories - mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories - either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data - no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period- daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLFeature*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional MetadataAttribution}}/**Source of the MLFeature*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DerivedFrom\"}sources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:com.linkedin.common.Urn/**Name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}origin:com.linkedin.common.FabricType}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:com.linkedin.common.DatasetUrn/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/").append("@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera's hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes com.linkedin.common.CustomProperties,com.linkedin.common.ExternalReference/**A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups*/record MLModelLineageInfo{/**List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"TrainedBy\"}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs or process instances (if any) that use the model or group.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"UsedBy\"}downstreamJobs:optional array[com.linkedin.common.Urn]}{/**Display name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchTier\":1}name:optional string/**Documentation of the MLModel*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Date when the MLModel was developed*/@deprecated,date:optional com.linkedin.common.Time/**Audit stamp containing who created this and when*/created:optional com.linkedin.common.TimeStamp/**Date when the MLModel was last modified*/lastModified:optional com.linkedin.common.TimeStamp/**Version of the MLModel*/version:optional com.linkedin.common.VersionTag/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/@Relationship.`/*`={\"entityTypes\":[\"mlFeature\"],\"isLineage\":true,\"name\":\"Consumes\"}mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"entityTypes\":[\"mlModelDeployment\"],\"name\":\"DeployedTo\"}deployments:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"entityTypes\":[\"mlModelGroup\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"MemberOf\"}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.metadata.key/**Key for a Tag*/@Aspect.name=\"tagKey\"record TagKey{/**The tag name, which serves as a unique id*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.tag/**Properties associated with a Tag*/@Aspect.name=\"tagProperties\"record TagProperties{/**Display name of the tag*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Documentation of the tag*/@Searchable={}description:optional string/**The color associated with the Tag in Hex. For example #FFFFFF.*/colorHex:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}com.linkedin.common.GlobalTags{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}]").toString(), SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
