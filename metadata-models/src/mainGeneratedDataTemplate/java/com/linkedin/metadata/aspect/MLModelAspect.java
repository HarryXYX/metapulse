
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/MLModelAspect.pdl.")
public class MLModelAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}/**A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups*/record MLModelLineageInfo{/**List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"TrainedBy\"}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs or process instances (if any) that use the model or group.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"UsedBy\"}downstreamJobs:optional array[com.linkedin.common.Urn]}{/**Display name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchTier\":1}name:optional string/**Documentation of the MLModel*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Date when the MLModel was developed*/@deprecated,date:optional com.linkedin.common.Time/**Audit stamp containing who created this and when*/created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:Time/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**Date when the MLModel was last modified*/lastModified:optional com.linkedin.common.TimeStamp/**Version of the MLModel*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional MetadataAttribution}}/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/@Relationship.`/*`={\"entityTypes\":[\"mlFeature\"],\"isLineage\":true,\"name\":\"Consumes\"}mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"entityTypes\":[\"mlModelDeployment\"],\"name\":\"DeployedTo\"}deployments:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"entityTypes\":[\"mlModelGroup\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"MemberOf\"}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera's hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common@Aspect.name=\"cost\"record Cost{costType:/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}cost:/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"BOOLEAN\",\"filterNameOverride\":\"Deprecated\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The user URN which will be credited for modifying this deprecation content.*/actor:Urn,replacement:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.MLModelKey _mLModelKeyMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.ml.metadata.MLModelProperties _mLModelPropertiesMember = null;
    private com.linkedin.ml.metadata.IntendedUse _intendedUseMember = null;
    private com.linkedin.ml.metadata.MLModelFactorPrompts _mLModelFactorPromptsMember = null;
    private com.linkedin.ml.metadata.Metrics _metricsMember = null;
    private com.linkedin.ml.metadata.EvaluationData _evaluationDataMember = null;
    private com.linkedin.ml.metadata.TrainingData _trainingDataMember = null;
    private com.linkedin.ml.metadata.QuantitativeAnalyses _quantitativeAnalysesMember = null;
    private com.linkedin.ml.metadata.EthicalConsiderations _ethicalConsiderationsMember = null;
    private com.linkedin.ml.metadata.CaveatsAndRecommendations _caveatsAndRecommendationsMember = null;
    private com.linkedin.common.InstitutionalMemory _institutionalMemoryMember = null;
    private com.linkedin.ml.metadata.SourceCode _sourceCodeMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.common.Cost _costMember = null;
    private com.linkedin.common.Deprecation _deprecationMember = null;
    private com.linkedin.common.BrowsePaths _browsePathsMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.DataPlatformInstance _dataPlatformInstanceMember = null;
    private com.linkedin.common.BrowsePathsV2 _browsePathsV2Member = null;
    private MLModelAspect.ChangeListener __changeListener = new MLModelAspect.ChangeListener(this);
    private final static DataSchema MEMBER_MLModelKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLModelKey");
    public final static String MEMBERKEY_MLModelKey = "com.linkedin.metadata.key.MLModelKey";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_MLModelProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelProperties");
    public final static String MEMBERKEY_MLModelProperties = "com.linkedin.ml.metadata.MLModelProperties";
    private final static DataSchema MEMBER_IntendedUse = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.IntendedUse");
    public final static String MEMBERKEY_IntendedUse = "com.linkedin.ml.metadata.IntendedUse";
    private final static DataSchema MEMBER_MLModelFactorPrompts = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelFactorPrompts");
    public final static String MEMBERKEY_MLModelFactorPrompts = "com.linkedin.ml.metadata.MLModelFactorPrompts";
    private final static DataSchema MEMBER_Metrics = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.Metrics");
    public final static String MEMBERKEY_Metrics = "com.linkedin.ml.metadata.Metrics";
    private final static DataSchema MEMBER_EvaluationData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EvaluationData");
    public final static String MEMBERKEY_EvaluationData = "com.linkedin.ml.metadata.EvaluationData";
    private final static DataSchema MEMBER_TrainingData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.TrainingData");
    public final static String MEMBERKEY_TrainingData = "com.linkedin.ml.metadata.TrainingData";
    private final static DataSchema MEMBER_QuantitativeAnalyses = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.QuantitativeAnalyses");
    public final static String MEMBERKEY_QuantitativeAnalyses = "com.linkedin.ml.metadata.QuantitativeAnalyses";
    private final static DataSchema MEMBER_EthicalConsiderations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EthicalConsiderations");
    public final static String MEMBERKEY_EthicalConsiderations = "com.linkedin.ml.metadata.EthicalConsiderations";
    private final static DataSchema MEMBER_CaveatsAndRecommendations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    public final static String MEMBERKEY_CaveatsAndRecommendations = "com.linkedin.ml.metadata.CaveatsAndRecommendations";
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    public final static String MEMBERKEY_InstitutionalMemory = "com.linkedin.common.InstitutionalMemory";
    private final static DataSchema MEMBER_SourceCode = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.SourceCode");
    public final static String MEMBERKEY_SourceCode = "com.linkedin.ml.metadata.SourceCode";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static DataSchema MEMBER_Cost = SCHEMA.getTypeByMemberKey("com.linkedin.common.Cost");
    public final static String MEMBERKEY_Cost = "com.linkedin.common.Cost";
    private final static DataSchema MEMBER_Deprecation = SCHEMA.getTypeByMemberKey("com.linkedin.common.Deprecation");
    public final static String MEMBERKEY_Deprecation = "com.linkedin.common.Deprecation";
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    public final static String MEMBERKEY_BrowsePaths = "com.linkedin.common.BrowsePaths";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    public final static String MEMBERKEY_DataPlatformInstance = "com.linkedin.common.DataPlatformInstance";
    private final static DataSchema MEMBER_BrowsePathsV2 = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePathsV2");
    public final static String MEMBERKEY_BrowsePathsV2 = "com.linkedin.common.BrowsePathsV2";
    private final static TyperefInfo TYPEREFINFO = new MLModelAspect.UnionTyperefInfo();

    public MLModelAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MLModelAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static MLModelAspect create(com.linkedin.metadata.key.MLModelKey value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.Ownership value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.MLModelProperties value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.IntendedUse value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.Metrics value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.EvaluationData value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.TrainingData value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.EthicalConsiderations value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.InstitutionalMemory value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.ml.metadata.SourceCode value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.Status value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.Cost value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setCost(value);
        return newUnion;
    }

    public boolean isCost() {
        return memberIs("com.linkedin.common.Cost");
    }

    public com.linkedin.common.Cost getCost() {
        checkNotNull();
        if (_costMember!= null) {
            return _costMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.Cost");
        _costMember = ((__rawValue == null)?null:new com.linkedin.common.Cost(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _costMember;
    }

    public void setCost(com.linkedin.common.Cost value) {
        checkNotNull();
        super._map.clear();
        _costMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.Cost", value.data());
    }

    public static MLModelAspect create(com.linkedin.common.Deprecation value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setDeprecation(value);
        return newUnion;
    }

    public boolean isDeprecation() {
        return memberIs("com.linkedin.common.Deprecation");
    }

    public com.linkedin.common.Deprecation getDeprecation() {
        checkNotNull();
        if (_deprecationMember!= null) {
            return _deprecationMember;
        }
        Object __rawValue = super._map.get("com.linkedin.common.Deprecation");
        _deprecationMember = ((__rawValue == null)?null:new com.linkedin.common.Deprecation(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _deprecationMember;
    }

    public void setDeprecation(com.linkedin.common.Deprecation value) {
        checkNotNull();
        super._map.clear();
        _deprecationMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.common.Deprecation", value.data());
    }

    public static MLModelAspect create(com.linkedin.common.BrowsePaths value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.GlobalTags value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.DataPlatformInstance value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect create(com.linkedin.common.BrowsePathsV2 value) {
        MLModelAspect newUnion = new MLModelAspect();
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

    public static MLModelAspect.ProjectionMask createMask() {
        return new MLModelAspect.ProjectionMask();
    }

    @Override
    public MLModelAspect clone()
        throws CloneNotSupportedException
    {
        MLModelAspect __clone = ((MLModelAspect) super.clone());
        __clone.__changeListener = new MLModelAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelAspect copy()
        throws CloneNotSupportedException
    {
        MLModelAspect __copy = ((MLModelAspect) super.copy());
        __copy._trainingDataMember = null;
        __copy._costMember = null;
        __copy._mLModelFactorPromptsMember = null;
        __copy._mLModelKeyMember = null;
        __copy._metricsMember = null;
        __copy._quantitativeAnalysesMember = null;
        __copy._mLModelPropertiesMember = null;
        __copy._intendedUseMember = null;
        __copy._browsePathsMember = null;
        __copy._globalTagsMember = null;
        __copy._dataPlatformInstanceMember = null;
        __copy._browsePathsV2Member = null;
        __copy._ownershipMember = null;
        __copy._sourceCodeMember = null;
        __copy._ethicalConsiderationsMember = null;
        __copy._caveatsAndRecommendationsMember = null;
        __copy._institutionalMemoryMember = null;
        __copy._deprecationMember = null;
        __copy._evaluationDataMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new MLModelAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelAspect __objectRef;

        private ChangeListener(MLModelAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.ml.metadata.TrainingData":
                    __objectRef._trainingDataMember = null;
                    break;
                case "com.linkedin.common.Cost":
                    __objectRef._costMember = null;
                    break;
                case "com.linkedin.ml.metadata.MLModelFactorPrompts":
                    __objectRef._mLModelFactorPromptsMember = null;
                    break;
                case "com.linkedin.metadata.key.MLModelKey":
                    __objectRef._mLModelKeyMember = null;
                    break;
                case "com.linkedin.ml.metadata.Metrics":
                    __objectRef._metricsMember = null;
                    break;
                case "com.linkedin.ml.metadata.QuantitativeAnalyses":
                    __objectRef._quantitativeAnalysesMember = null;
                    break;
                case "com.linkedin.ml.metadata.MLModelProperties":
                    __objectRef._mLModelPropertiesMember = null;
                    break;
                case "com.linkedin.ml.metadata.IntendedUse":
                    __objectRef._intendedUseMember = null;
                    break;
                case "com.linkedin.common.BrowsePaths":
                    __objectRef._browsePathsMember = null;
                    break;
                case "com.linkedin.common.GlobalTags":
                    __objectRef._globalTagsMember = null;
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
                case "com.linkedin.ml.metadata.SourceCode":
                    __objectRef._sourceCodeMember = null;
                    break;
                case "com.linkedin.ml.metadata.EthicalConsiderations":
                    __objectRef._ethicalConsiderationsMember = null;
                    break;
                case "com.linkedin.ml.metadata.CaveatsAndRecommendations":
                    __objectRef._caveatsAndRecommendationsMember = null;
                    break;
                case "com.linkedin.common.InstitutionalMemory":
                    __objectRef._institutionalMemoryMember = null;
                    break;
                case "com.linkedin.common.Deprecation":
                    __objectRef._deprecationMember = null;
                    break;
                case "com.linkedin.ml.metadata.EvaluationData":
                    __objectRef._evaluationDataMember = null;
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

        public com.linkedin.metadata.key.MLModelKey.Fields MLModelKey() {
            return new com.linkedin.metadata.key.MLModelKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLModelKey");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.ml.metadata.MLModelProperties.Fields MLModelProperties() {
            return new com.linkedin.ml.metadata.MLModelProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelProperties");
        }

        public com.linkedin.ml.metadata.IntendedUse.Fields IntendedUse() {
            return new com.linkedin.ml.metadata.IntendedUse.Fields(getPathComponents(), "com.linkedin.ml.metadata.IntendedUse");
        }

        public com.linkedin.ml.metadata.MLModelFactorPrompts.Fields MLModelFactorPrompts() {
            return new com.linkedin.ml.metadata.MLModelFactorPrompts.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelFactorPrompts");
        }

        public com.linkedin.ml.metadata.Metrics.Fields Metrics() {
            return new com.linkedin.ml.metadata.Metrics.Fields(getPathComponents(), "com.linkedin.ml.metadata.Metrics");
        }

        public com.linkedin.ml.metadata.EvaluationData.Fields EvaluationData() {
            return new com.linkedin.ml.metadata.EvaluationData.Fields(getPathComponents(), "com.linkedin.ml.metadata.EvaluationData");
        }

        public com.linkedin.ml.metadata.TrainingData.Fields TrainingData() {
            return new com.linkedin.ml.metadata.TrainingData.Fields(getPathComponents(), "com.linkedin.ml.metadata.TrainingData");
        }

        public com.linkedin.ml.metadata.QuantitativeAnalyses.Fields QuantitativeAnalyses() {
            return new com.linkedin.ml.metadata.QuantitativeAnalyses.Fields(getPathComponents(), "com.linkedin.ml.metadata.QuantitativeAnalyses");
        }

        public com.linkedin.ml.metadata.EthicalConsiderations.Fields EthicalConsiderations() {
            return new com.linkedin.ml.metadata.EthicalConsiderations.Fields(getPathComponents(), "com.linkedin.ml.metadata.EthicalConsiderations");
        }

        public com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields CaveatsAndRecommendations() {
            return new com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields(getPathComponents(), "com.linkedin.ml.metadata.CaveatsAndRecommendations");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.ml.metadata.SourceCode.Fields SourceCode() {
            return new com.linkedin.ml.metadata.SourceCode.Fields(getPathComponents(), "com.linkedin.ml.metadata.SourceCode");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.Cost.Fields Cost() {
            return new com.linkedin.common.Cost.Fields(getPathComponents(), "com.linkedin.common.Cost");
        }

        public com.linkedin.common.Deprecation.Fields Deprecation() {
            return new com.linkedin.common.Deprecation.Fields(getPathComponents(), "com.linkedin.common.Deprecation");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
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

        private com.linkedin.metadata.key.MLModelKey.ProjectionMask _MLModelKeyMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.ml.metadata.MLModelProperties.ProjectionMask _MLModelPropertiesMask;
        private com.linkedin.ml.metadata.IntendedUse.ProjectionMask _IntendedUseMask;
        private com.linkedin.ml.metadata.MLModelFactorPrompts.ProjectionMask _MLModelFactorPromptsMask;
        private com.linkedin.ml.metadata.Metrics.ProjectionMask _MetricsMask;
        private com.linkedin.ml.metadata.EvaluationData.ProjectionMask _EvaluationDataMask;
        private com.linkedin.ml.metadata.TrainingData.ProjectionMask _TrainingDataMask;
        private com.linkedin.ml.metadata.QuantitativeAnalyses.ProjectionMask _QuantitativeAnalysesMask;
        private com.linkedin.ml.metadata.EthicalConsiderations.ProjectionMask _EthicalConsiderationsMask;
        private com.linkedin.ml.metadata.CaveatsAndRecommendations.ProjectionMask _CaveatsAndRecommendationsMask;
        private com.linkedin.common.InstitutionalMemory.ProjectionMask _InstitutionalMemoryMask;
        private com.linkedin.ml.metadata.SourceCode.ProjectionMask _SourceCodeMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;
        private com.linkedin.common.Cost.ProjectionMask _CostMask;
        private com.linkedin.common.Deprecation.ProjectionMask _DeprecationMask;
        private com.linkedin.common.BrowsePaths.ProjectionMask _BrowsePathsMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.DataPlatformInstance.ProjectionMask _DataPlatformInstanceMask;
        private com.linkedin.common.BrowsePathsV2.ProjectionMask _BrowsePathsV2Mask;

        ProjectionMask() {
        }

        public MLModelAspect.ProjectionMask withMLModelKey(Function<com.linkedin.metadata.key.MLModelKey.ProjectionMask, com.linkedin.metadata.key.MLModelKey.ProjectionMask> nestedMask) {
            _MLModelKeyMask = nestedMask.apply(((_MLModelKeyMask == null)?com.linkedin.metadata.key.MLModelKey.createMask():_MLModelKeyMask));
            getDataMap().put("com.linkedin.metadata.key.MLModelKey", _MLModelKeyMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withMLModelProperties(Function<com.linkedin.ml.metadata.MLModelProperties.ProjectionMask, com.linkedin.ml.metadata.MLModelProperties.ProjectionMask> nestedMask) {
            _MLModelPropertiesMask = nestedMask.apply(((_MLModelPropertiesMask == null)?com.linkedin.ml.metadata.MLModelProperties.createMask():_MLModelPropertiesMask));
            getDataMap().put("com.linkedin.ml.metadata.MLModelProperties", _MLModelPropertiesMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withIntendedUse(Function<com.linkedin.ml.metadata.IntendedUse.ProjectionMask, com.linkedin.ml.metadata.IntendedUse.ProjectionMask> nestedMask) {
            _IntendedUseMask = nestedMask.apply(((_IntendedUseMask == null)?com.linkedin.ml.metadata.IntendedUse.createMask():_IntendedUseMask));
            getDataMap().put("com.linkedin.ml.metadata.IntendedUse", _IntendedUseMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withMLModelFactorPrompts(Function<com.linkedin.ml.metadata.MLModelFactorPrompts.ProjectionMask, com.linkedin.ml.metadata.MLModelFactorPrompts.ProjectionMask> nestedMask) {
            _MLModelFactorPromptsMask = nestedMask.apply(((_MLModelFactorPromptsMask == null)?com.linkedin.ml.metadata.MLModelFactorPrompts.createMask():_MLModelFactorPromptsMask));
            getDataMap().put("com.linkedin.ml.metadata.MLModelFactorPrompts", _MLModelFactorPromptsMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withMetrics(Function<com.linkedin.ml.metadata.Metrics.ProjectionMask, com.linkedin.ml.metadata.Metrics.ProjectionMask> nestedMask) {
            _MetricsMask = nestedMask.apply(((_MetricsMask == null)?com.linkedin.ml.metadata.Metrics.createMask():_MetricsMask));
            getDataMap().put("com.linkedin.ml.metadata.Metrics", _MetricsMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withEvaluationData(Function<com.linkedin.ml.metadata.EvaluationData.ProjectionMask, com.linkedin.ml.metadata.EvaluationData.ProjectionMask> nestedMask) {
            _EvaluationDataMask = nestedMask.apply(((_EvaluationDataMask == null)?com.linkedin.ml.metadata.EvaluationData.createMask():_EvaluationDataMask));
            getDataMap().put("com.linkedin.ml.metadata.EvaluationData", _EvaluationDataMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withTrainingData(Function<com.linkedin.ml.metadata.TrainingData.ProjectionMask, com.linkedin.ml.metadata.TrainingData.ProjectionMask> nestedMask) {
            _TrainingDataMask = nestedMask.apply(((_TrainingDataMask == null)?com.linkedin.ml.metadata.TrainingData.createMask():_TrainingDataMask));
            getDataMap().put("com.linkedin.ml.metadata.TrainingData", _TrainingDataMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withQuantitativeAnalyses(Function<com.linkedin.ml.metadata.QuantitativeAnalyses.ProjectionMask, com.linkedin.ml.metadata.QuantitativeAnalyses.ProjectionMask> nestedMask) {
            _QuantitativeAnalysesMask = nestedMask.apply(((_QuantitativeAnalysesMask == null)?com.linkedin.ml.metadata.QuantitativeAnalyses.createMask():_QuantitativeAnalysesMask));
            getDataMap().put("com.linkedin.ml.metadata.QuantitativeAnalyses", _QuantitativeAnalysesMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withEthicalConsiderations(Function<com.linkedin.ml.metadata.EthicalConsiderations.ProjectionMask, com.linkedin.ml.metadata.EthicalConsiderations.ProjectionMask> nestedMask) {
            _EthicalConsiderationsMask = nestedMask.apply(((_EthicalConsiderationsMask == null)?com.linkedin.ml.metadata.EthicalConsiderations.createMask():_EthicalConsiderationsMask));
            getDataMap().put("com.linkedin.ml.metadata.EthicalConsiderations", _EthicalConsiderationsMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withCaveatsAndRecommendations(Function<com.linkedin.ml.metadata.CaveatsAndRecommendations.ProjectionMask, com.linkedin.ml.metadata.CaveatsAndRecommendations.ProjectionMask> nestedMask) {
            _CaveatsAndRecommendationsMask = nestedMask.apply(((_CaveatsAndRecommendationsMask == null)?com.linkedin.ml.metadata.CaveatsAndRecommendations.createMask():_CaveatsAndRecommendationsMask));
            getDataMap().put("com.linkedin.ml.metadata.CaveatsAndRecommendations", _CaveatsAndRecommendationsMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withInstitutionalMemory(Function<com.linkedin.common.InstitutionalMemory.ProjectionMask, com.linkedin.common.InstitutionalMemory.ProjectionMask> nestedMask) {
            _InstitutionalMemoryMask = nestedMask.apply(((_InstitutionalMemoryMask == null)?com.linkedin.common.InstitutionalMemory.createMask():_InstitutionalMemoryMask));
            getDataMap().put("com.linkedin.common.InstitutionalMemory", _InstitutionalMemoryMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withSourceCode(Function<com.linkedin.ml.metadata.SourceCode.ProjectionMask, com.linkedin.ml.metadata.SourceCode.ProjectionMask> nestedMask) {
            _SourceCodeMask = nestedMask.apply(((_SourceCodeMask == null)?com.linkedin.ml.metadata.SourceCode.createMask():_SourceCodeMask));
            getDataMap().put("com.linkedin.ml.metadata.SourceCode", _SourceCodeMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withCost(Function<com.linkedin.common.Cost.ProjectionMask, com.linkedin.common.Cost.ProjectionMask> nestedMask) {
            _CostMask = nestedMask.apply(((_CostMask == null)?com.linkedin.common.Cost.createMask():_CostMask));
            getDataMap().put("com.linkedin.common.Cost", _CostMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withDeprecation(Function<com.linkedin.common.Deprecation.ProjectionMask, com.linkedin.common.Deprecation.ProjectionMask> nestedMask) {
            _DeprecationMask = nestedMask.apply(((_DeprecationMask == null)?com.linkedin.common.Deprecation.createMask():_DeprecationMask));
            getDataMap().put("com.linkedin.common.Deprecation", _DeprecationMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withBrowsePaths(Function<com.linkedin.common.BrowsePaths.ProjectionMask, com.linkedin.common.BrowsePaths.ProjectionMask> nestedMask) {
            _BrowsePathsMask = nestedMask.apply(((_BrowsePathsMask == null)?com.linkedin.common.BrowsePaths.createMask():_BrowsePathsMask));
            getDataMap().put("com.linkedin.common.BrowsePaths", _BrowsePathsMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withDataPlatformInstance(Function<com.linkedin.common.DataPlatformInstance.ProjectionMask, com.linkedin.common.DataPlatformInstance.ProjectionMask> nestedMask) {
            _DataPlatformInstanceMask = nestedMask.apply(((_DataPlatformInstanceMask == null)?com.linkedin.common.DataPlatformInstance.createMask():_DataPlatformInstanceMask));
            getDataMap().put("com.linkedin.common.DataPlatformInstance", _DataPlatformInstanceMask.getDataMap());
            return this;
        }

        public MLModelAspect.ProjectionMask withBrowsePathsV2(Function<com.linkedin.common.BrowsePathsV2.ProjectionMask, com.linkedin.common.BrowsePathsV2.ProjectionMask> nestedMask) {
            _BrowsePathsV2Mask = nestedMask.apply(((_BrowsePathsV2Mask == null)?com.linkedin.common.BrowsePathsV2 .createMask():_BrowsePathsV2Mask));
            getDataMap().put("com.linkedin.common.BrowsePathsV2", _BrowsePathsV2Mask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a ML Model
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a ML Model*/typeref MLModelAspect=union[{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\",\"filterNameOverride\":\"Environment\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}/**A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups*/record MLModelLineageInfo{/**List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"TrainedBy\"}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs or process instances (if any) that use the model or group.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"UsedBy\"}downstreamJobs:optional array[com.linkedin.common.Urn]}{/**Display name of the MLModel*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchTier\":1}name:optional string/**Documentation of the MLModel*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\",\"searchTier\":2}description:optional string/**Date when the MLModel was developed*/@deprecated,date:optional com.linkedin.common.Time/**Audit stamp containing who created this and when*/created:optional{namespace com.linkedin.common/**A standard event timestamp*/record TimeStamp{/**When did the event occur*/time:Time/**Optional: The actor urn involved in the event.*/actor:optional Urn}}/**Date when the MLModel was last modified*/lastModified:optional com.linkedin.common.TimeStamp/**Version of the MLModel*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional MetadataAttribution}}/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/@Relationship.`/*`={\"entityTypes\":[\"mlFeature\"],\"isLineage\":true,\"name\":\"Consumes\"}mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized MLFeature identifier.\",\"entityType\":\"mlFeature\",\"fields\":[{\"doc\":\"Namespace for the MLFeature\",\"name\":\"mlFeatureNamespace\",\"type\":\"string\"},{\"doc\":\"Name of the MLFeature\",\"maxLength\":210,\"name\":\"mlFeatureName\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"MLFeature\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"entityTypes\":[\"mlModelDeployment\"],\"name\":\"DeployedTo\"}deployments:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"entityTypes\":[\"mlModelGroup\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"MemberOf\"}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera's hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing - e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common@Aspect.name=\"cost\"record Cost{costType:/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}cost:/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"BOOLEAN\",\"filterNameOverride\":\"Deprecated\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The user URN which will be credited for modifying this deprecation content.*/actor:Urn,replacement:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}{namespace com.linkedin.common/**Shared aspect containing a Browse Path to be indexed for an entity.*/@Aspect.name=\"browsePathsV2\"record BrowsePathsV2{/**A valid browse path for the entity. This field is provided by DataHub by default.\nThis aspect is a newer version of browsePaths where we can encode more information in the path.\nThis path is also based on containers for a given entity if it has containers.\n\nThis is stored in elasticsearch as unit-separator delimited strings and only includes platform specific folders or containers.\nThese paths should not include high level info captured elsewhere ie. Platform and Environment.*/@Searchable.`/*/id`={\"fieldName\":\"browsePathV2\",\"fieldType\":\"BROWSE_PATH_V2\"}path:array[/**Represents a single level in an entity's browsePathV2*/record BrowsePathEntry{/**The ID of the browse path entry. This is what gets stored in the index.\nIf there's an urn associated with this entry, id and urn will be the same*/id:string/**Optional urn pointing to some entity in DataHub*/urn:optional Urn}]}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
