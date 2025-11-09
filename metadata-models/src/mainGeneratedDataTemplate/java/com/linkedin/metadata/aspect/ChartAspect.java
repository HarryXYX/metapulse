
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/ChartAspect.pdl.")
public class ChartAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the chart*/@Searchable.searchTier=2,description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}chartUrl:optional com.linkedin.common.Url/**Data sources for the chart\nDeprecated! Use inputEdges instead.*/@Relationship.`/*/string`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]]/**Data sources for the chart*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputEdges/*/created/actor\",\"createdOn\":\"inputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"chart\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputEdges/*/properties\",\"updatedActor\":\"inputEdges/*/lastModified/actor\",\"updatedOn\":\"inputEdges/*/lastModified/time\"}inputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional AuditStamp/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Type of the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Chart Type\",\"searchTier\":3}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT,WORD_CLOUD,COHORT}/**Access level for the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"addToFilters\":true,\"fieldName\":\"queryType\",\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Query Type\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.chart/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableChartProperties\"record EditableChartProperties includes com.linkedin.common.ChangeAuditStamps{/**Edited documentation of the chart */@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\"}description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.ChartKey _chartKeyMember = null;
    private com.linkedin.chart.ChartInfo _chartInfoMember = null;
    private com.linkedin.chart.ChartQuery _chartQueryMember = null;
    private com.linkedin.chart.EditableChartProperties _editableChartPropertiesMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.BrowsePaths _browsePathsMember = null;
    private com.linkedin.common.GlossaryTerms _glossaryTermsMember = null;
    private com.linkedin.common.InstitutionalMemory _institutionalMemoryMember = null;
    private com.linkedin.common.DataPlatformInstance _dataPlatformInstanceMember = null;
    private com.linkedin.common.BrowsePathsV2 _browsePathsV2Member = null;
    private ChartAspect.ChangeListener __changeListener = new ChartAspect.ChangeListener(this);
    private final static DataSchema MEMBER_ChartKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.ChartKey");
    public final static String MEMBERKEY_ChartKey = "com.linkedin.metadata.key.ChartKey";
    private final static DataSchema MEMBER_ChartInfo = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartInfo");
    public final static String MEMBERKEY_ChartInfo = "com.linkedin.chart.ChartInfo";
    private final static DataSchema MEMBER_ChartQuery = SCHEMA.getTypeByMemberKey("com.linkedin.chart.ChartQuery");
    public final static String MEMBERKEY_ChartQuery = "com.linkedin.chart.ChartQuery";
    private final static DataSchema MEMBER_EditableChartProperties = SCHEMA.getTypeByMemberKey("com.linkedin.chart.EditableChartProperties");
    public final static String MEMBERKEY_EditableChartProperties = "com.linkedin.chart.EditableChartProperties";
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
    private final static TyperefInfo TYPEREFINFO = new ChartAspect.UnionTyperefInfo();

    public ChartAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ChartAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ChartAspect create(com.linkedin.metadata.key.ChartKey value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.chart.ChartInfo value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.chart.ChartQuery value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.chart.EditableChartProperties value) {
        ChartAspect newUnion = new ChartAspect();
        newUnion.setEditableChartProperties(value);
        return newUnion;
    }

    public boolean isEditableChartProperties() {
        return memberIs("com.linkedin.chart.EditableChartProperties");
    }

    public com.linkedin.chart.EditableChartProperties getEditableChartProperties() {
        checkNotNull();
        if (_editableChartPropertiesMember!= null) {
            return _editableChartPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.chart.EditableChartProperties");
        _editableChartPropertiesMember = ((__rawValue == null)?null:new com.linkedin.chart.EditableChartProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _editableChartPropertiesMember;
    }

    public void setEditableChartProperties(com.linkedin.chart.EditableChartProperties value) {
        checkNotNull();
        super._map.clear();
        _editableChartPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.chart.EditableChartProperties", value.data());
    }

    public static ChartAspect create(com.linkedin.common.Ownership value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.Status value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.GlobalTags value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.BrowsePaths value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.GlossaryTerms value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.InstitutionalMemory value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.DataPlatformInstance value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect create(com.linkedin.common.BrowsePathsV2 value) {
        ChartAspect newUnion = new ChartAspect();
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

    public static ChartAspect.ProjectionMask createMask() {
        return new ChartAspect.ProjectionMask();
    }

    @Override
    public ChartAspect clone()
        throws CloneNotSupportedException
    {
        ChartAspect __clone = ((ChartAspect) super.clone());
        __clone.__changeListener = new ChartAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ChartAspect copy()
        throws CloneNotSupportedException
    {
        ChartAspect __copy = ((ChartAspect) super.copy());
        __copy._chartQueryMember = null;
        __copy._globalTagsMember = null;
        __copy._browsePathsMember = null;
        __copy._dataPlatformInstanceMember = null;
        __copy._browsePathsV2Member = null;
        __copy._chartInfoMember = null;
        __copy._ownershipMember = null;
        __copy._chartKeyMember = null;
        __copy._glossaryTermsMember = null;
        __copy._institutionalMemoryMember = null;
        __copy._editableChartPropertiesMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new ChartAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ChartAspect __objectRef;

        private ChangeListener(ChartAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.chart.ChartQuery":
                    __objectRef._chartQueryMember = null;
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
                case "com.linkedin.chart.ChartInfo":
                    __objectRef._chartInfoMember = null;
                    break;
                case "com.linkedin.common.Ownership":
                    __objectRef._ownershipMember = null;
                    break;
                case "com.linkedin.metadata.key.ChartKey":
                    __objectRef._chartKeyMember = null;
                    break;
                case "com.linkedin.common.GlossaryTerms":
                    __objectRef._glossaryTermsMember = null;
                    break;
                case "com.linkedin.common.InstitutionalMemory":
                    __objectRef._institutionalMemoryMember = null;
                    break;
                case "com.linkedin.chart.EditableChartProperties":
                    __objectRef._editableChartPropertiesMember = null;
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

        public com.linkedin.chart.EditableChartProperties.Fields EditableChartProperties() {
            return new com.linkedin.chart.EditableChartProperties.Fields(getPathComponents(), "com.linkedin.chart.EditableChartProperties");
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

        private com.linkedin.metadata.key.ChartKey.ProjectionMask _ChartKeyMask;
        private com.linkedin.chart.ChartInfo.ProjectionMask _ChartInfoMask;
        private com.linkedin.chart.ChartQuery.ProjectionMask _ChartQueryMask;
        private com.linkedin.chart.EditableChartProperties.ProjectionMask _EditableChartPropertiesMask;
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

        public ChartAspect.ProjectionMask withChartKey(Function<com.linkedin.metadata.key.ChartKey.ProjectionMask, com.linkedin.metadata.key.ChartKey.ProjectionMask> nestedMask) {
            _ChartKeyMask = nestedMask.apply(((_ChartKeyMask == null)?com.linkedin.metadata.key.ChartKey.createMask():_ChartKeyMask));
            getDataMap().put("com.linkedin.metadata.key.ChartKey", _ChartKeyMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withChartInfo(Function<com.linkedin.chart.ChartInfo.ProjectionMask, com.linkedin.chart.ChartInfo.ProjectionMask> nestedMask) {
            _ChartInfoMask = nestedMask.apply(((_ChartInfoMask == null)?com.linkedin.chart.ChartInfo.createMask():_ChartInfoMask));
            getDataMap().put("com.linkedin.chart.ChartInfo", _ChartInfoMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withChartQuery(Function<com.linkedin.chart.ChartQuery.ProjectionMask, com.linkedin.chart.ChartQuery.ProjectionMask> nestedMask) {
            _ChartQueryMask = nestedMask.apply(((_ChartQueryMask == null)?com.linkedin.chart.ChartQuery.createMask():_ChartQueryMask));
            getDataMap().put("com.linkedin.chart.ChartQuery", _ChartQueryMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withEditableChartProperties(Function<com.linkedin.chart.EditableChartProperties.ProjectionMask, com.linkedin.chart.EditableChartProperties.ProjectionMask> nestedMask) {
            _EditableChartPropertiesMask = nestedMask.apply(((_EditableChartPropertiesMask == null)?com.linkedin.chart.EditableChartProperties.createMask():_EditableChartPropertiesMask));
            getDataMap().put("com.linkedin.chart.EditableChartProperties", _EditableChartPropertiesMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withBrowsePaths(Function<com.linkedin.common.BrowsePaths.ProjectionMask, com.linkedin.common.BrowsePaths.ProjectionMask> nestedMask) {
            _BrowsePathsMask = nestedMask.apply(((_BrowsePathsMask == null)?com.linkedin.common.BrowsePaths.createMask():_BrowsePathsMask));
            getDataMap().put("com.linkedin.common.BrowsePaths", _BrowsePathsMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withGlossaryTerms(Function<com.linkedin.common.GlossaryTerms.ProjectionMask, com.linkedin.common.GlossaryTerms.ProjectionMask> nestedMask) {
            _GlossaryTermsMask = nestedMask.apply(((_GlossaryTermsMask == null)?com.linkedin.common.GlossaryTerms.createMask():_GlossaryTermsMask));
            getDataMap().put("com.linkedin.common.GlossaryTerms", _GlossaryTermsMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withInstitutionalMemory(Function<com.linkedin.common.InstitutionalMemory.ProjectionMask, com.linkedin.common.InstitutionalMemory.ProjectionMask> nestedMask) {
            _InstitutionalMemoryMask = nestedMask.apply(((_InstitutionalMemoryMask == null)?com.linkedin.common.InstitutionalMemory.createMask():_InstitutionalMemoryMask));
            getDataMap().put("com.linkedin.common.InstitutionalMemory", _InstitutionalMemoryMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withDataPlatformInstance(Function<com.linkedin.common.DataPlatformInstance.ProjectionMask, com.linkedin.common.DataPlatformInstance.ProjectionMask> nestedMask) {
            _DataPlatformInstanceMask = nestedMask.apply(((_DataPlatformInstanceMask == null)?com.linkedin.common.DataPlatformInstance.createMask():_DataPlatformInstanceMask));
            getDataMap().put("com.linkedin.common.DataPlatformInstance", _DataPlatformInstanceMask.getDataMap());
            return this;
        }

        public ChartAspect.ProjectionMask withBrowsePathsV2(Function<com.linkedin.common.BrowsePathsV2.ProjectionMask, com.linkedin.common.BrowsePathsV2.ProjectionMask> nestedMask) {
            _BrowsePathsV2Mask = nestedMask.apply(((_BrowsePathsV2Mask == null)?com.linkedin.common.BrowsePathsV2 .createMask():_BrowsePathsV2Mask));
            getDataMap().put("com.linkedin.common.BrowsePathsV2", _BrowsePathsV2Mask.getDataMap());
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

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Chart*/typeref ChartAspect=union[{namespace com.linkedin.metadata.key/**Key for a Chart*/@Aspect.name=\"chartKey\"record ChartKey{/**The name of the dashboard tool such as looker, redash etc.*/@Searchable={\"boostScore\":4.0,\"fieldName\":\"tool\",\"fieldType\":\"TEXT_PARTIAL\"}dashboardTool:string/**Unique id for the chart. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, chart URL could be used here for Looker such as 'looker.linkedin.com/looks/1234'*/chartId:string}}{namespace com.linkedin.chart/**Information about a chart*/@Aspect.name=\"chartInfo\"record ChartInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Title of the chart*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}title:string/**Detailed description about the chart*/@Searchable.searchTier=2,description:string/**Captures information about who created/last modified/deleted this chart and when*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}/**URL for the chart. This could be used as an external link on DataHub to allow users access/view the chart*/@Searchable={\"fieldType\":\"KEYWORD\",\"searchTier\":4}chartUrl:optional com.linkedin.common.Url/**Data sources for the chart\nDeprecated! Use inputEdges instead.*/@Relationship.`/*/string`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@deprecated,inputs:optional array[/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]]/**Data sources for the chart*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputEdges/*/created/actor\",\"createdOn\":\"inputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"chart\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputEdges/*/properties\",\"updatedActor\":\"inputEdges/*/lastModified/actor\",\"updatedOn\":\"inputEdges/*/lastModified/time\"}inputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional AuditStamp/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Type of the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Chart Type\",\"searchTier\":3}type:optional/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT,WORD_CLOUD,COHORT}/**Access level for the chart*/@Searchable={\"addToFilters\":true,\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Access Level\",\"searchTier\":4}access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**The time when this chart last refreshed*/lastRefreshed:optional com.linkedin.common.Time}}{namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"addToFilters\":true,\"fieldName\":\"queryType\",\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Query Type\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}}{namespace com.linkedin.chart/**Stores editable changes made to properties. This separates changes made from\ningestion pipelines and edits in the UI to avoid accidental overwrites of user-provided data by ingestion pipelines*/@Aspect.name=\"editableChartProperties\"record EditableChartProperties includes com.linkedin.common.ChangeAuditStamps{/**Edited documentation of the chart */@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\"}description:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:AuditStamp={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Relationship={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"TermedWith\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"glossaryTerms\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Glossary Term\",\"hasValuesFieldName\":\"hasGlossaryTerms\",\"includeSystemModifiedAt\":true,\"systemModifiedAtFieldName\":\"termsModifiedAt\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string/**The user URN which will be credited for adding associating this term to the entity*/actor:optional Urn/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"termAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"termAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"termAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
