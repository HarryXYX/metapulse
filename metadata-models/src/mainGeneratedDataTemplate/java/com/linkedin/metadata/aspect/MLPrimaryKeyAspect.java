
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/MLPrimaryKeyAspect.pdl.")
public class MLPrimaryKeyAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for an MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyKey\"record MLPrimaryKeyKey{/**Namespace for the primary key*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the primary key*/@Searchable={\"boostScore\":8.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyProperties\"record MLPrimaryKeyProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Documentation of the MLPrimaryKey*/description:optional string/**Data Type of the MLPrimaryKey*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories - mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories - either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data - no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period- daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLPrimaryKey*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}/**Source of the MLPrimaryKey*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DerivedFrom\"}sources:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"BOOLEAN\",\"filterNameOverride\":\"Deprecated\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The user URN which will be credited for modifying this deprecation content.*/actor:Urn,replacement:optional Urn}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.MLPrimaryKeyKey _mLPrimaryKeyKeyMember = null;
    private com.linkedin.ml.metadata.MLPrimaryKeyProperties _mLPrimaryKeyPropertiesMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.common.InstitutionalMemory _institutionalMemoryMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.common.Deprecation _deprecationMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.DataPlatformInstance _dataPlatformInstanceMember = null;
    private MLPrimaryKeyAspect.ChangeListener __changeListener = new MLPrimaryKeyAspect.ChangeListener(this);
    private final static DataSchema MEMBER_MLPrimaryKeyKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLPrimaryKeyKey");
    public final static String MEMBERKEY_MLPrimaryKeyKey = "com.linkedin.metadata.key.MLPrimaryKeyKey";
    private final static DataSchema MEMBER_MLPrimaryKeyProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLPrimaryKeyProperties");
    public final static String MEMBERKEY_MLPrimaryKeyProperties = "com.linkedin.ml.metadata.MLPrimaryKeyProperties";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    public final static String MEMBERKEY_InstitutionalMemory = "com.linkedin.common.InstitutionalMemory";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static DataSchema MEMBER_Deprecation = SCHEMA.getTypeByMemberKey("com.linkedin.common.Deprecation");
    public final static String MEMBERKEY_Deprecation = "com.linkedin.common.Deprecation";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    public final static String MEMBERKEY_DataPlatformInstance = "com.linkedin.common.DataPlatformInstance";
    private final static TyperefInfo TYPEREFINFO = new MLPrimaryKeyAspect.UnionTyperefInfo();

    public MLPrimaryKeyAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MLPrimaryKeyAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static MLPrimaryKeyAspect create(com.linkedin.metadata.key.MLPrimaryKeyKey value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
        newUnion.setMLPrimaryKeyKey(value);
        return newUnion;
    }

    public boolean isMLPrimaryKeyKey() {
        return memberIs("com.linkedin.metadata.key.MLPrimaryKeyKey");
    }

    public com.linkedin.metadata.key.MLPrimaryKeyKey getMLPrimaryKeyKey() {
        checkNotNull();
        if (_mLPrimaryKeyKeyMember!= null) {
            return _mLPrimaryKeyKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.MLPrimaryKeyKey");
        _mLPrimaryKeyKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.MLPrimaryKeyKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLPrimaryKeyKeyMember;
    }

    public void setMLPrimaryKeyKey(com.linkedin.metadata.key.MLPrimaryKeyKey value) {
        checkNotNull();
        super._map.clear();
        _mLPrimaryKeyKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.MLPrimaryKeyKey", value.data());
    }

    public static MLPrimaryKeyAspect create(com.linkedin.ml.metadata.MLPrimaryKeyProperties value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
        newUnion.setMLPrimaryKeyProperties(value);
        return newUnion;
    }

    public boolean isMLPrimaryKeyProperties() {
        return memberIs("com.linkedin.ml.metadata.MLPrimaryKeyProperties");
    }

    public com.linkedin.ml.metadata.MLPrimaryKeyProperties getMLPrimaryKeyProperties() {
        checkNotNull();
        if (_mLPrimaryKeyPropertiesMember!= null) {
            return _mLPrimaryKeyPropertiesMember;
        }
        Object __rawValue = super._map.get("com.linkedin.ml.metadata.MLPrimaryKeyProperties");
        _mLPrimaryKeyPropertiesMember = ((__rawValue == null)?null:new com.linkedin.ml.metadata.MLPrimaryKeyProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _mLPrimaryKeyPropertiesMember;
    }

    public void setMLPrimaryKeyProperties(com.linkedin.ml.metadata.MLPrimaryKeyProperties value) {
        checkNotNull();
        super._map.clear();
        _mLPrimaryKeyPropertiesMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.ml.metadata.MLPrimaryKeyProperties", value.data());
    }

    public static MLPrimaryKeyAspect create(com.linkedin.common.Ownership value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.InstitutionalMemory value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.Status value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.Deprecation value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.GlobalTags value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.DataPlatformInstance value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect.ProjectionMask createMask() {
        return new MLPrimaryKeyAspect.ProjectionMask();
    }

    @Override
    public MLPrimaryKeyAspect clone()
        throws CloneNotSupportedException
    {
        MLPrimaryKeyAspect __clone = ((MLPrimaryKeyAspect) super.clone());
        __clone.__changeListener = new MLPrimaryKeyAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLPrimaryKeyAspect copy()
        throws CloneNotSupportedException
    {
        MLPrimaryKeyAspect __copy = ((MLPrimaryKeyAspect) super.copy());
        __copy._deprecationMember = null;
        __copy._globalTagsMember = null;
        __copy._dataPlatformInstanceMember = null;
        __copy._mLPrimaryKeyKeyMember = null;
        __copy._ownershipMember = null;
        __copy._mLPrimaryKeyPropertiesMember = null;
        __copy._institutionalMemoryMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new MLPrimaryKeyAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLPrimaryKeyAspect __objectRef;

        private ChangeListener(MLPrimaryKeyAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.common.Deprecation":
                    __objectRef._deprecationMember = null;
                    break;
                case "com.linkedin.common.GlobalTags":
                    __objectRef._globalTagsMember = null;
                    break;
                case "com.linkedin.common.DataPlatformInstance":
                    __objectRef._dataPlatformInstanceMember = null;
                    break;
                case "com.linkedin.metadata.key.MLPrimaryKeyKey":
                    __objectRef._mLPrimaryKeyKeyMember = null;
                    break;
                case "com.linkedin.common.Ownership":
                    __objectRef._ownershipMember = null;
                    break;
                case "com.linkedin.ml.metadata.MLPrimaryKeyProperties":
                    __objectRef._mLPrimaryKeyPropertiesMember = null;
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

        public com.linkedin.metadata.key.MLPrimaryKeyKey.Fields MLPrimaryKeyKey() {
            return new com.linkedin.metadata.key.MLPrimaryKeyKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLPrimaryKeyKey");
        }

        public com.linkedin.ml.metadata.MLPrimaryKeyProperties.Fields MLPrimaryKeyProperties() {
            return new com.linkedin.ml.metadata.MLPrimaryKeyProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLPrimaryKeyProperties");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.Deprecation.Fields Deprecation() {
            return new com.linkedin.common.Deprecation.Fields(getPathComponents(), "com.linkedin.common.Deprecation");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.MLPrimaryKeyKey.ProjectionMask _MLPrimaryKeyKeyMask;
        private com.linkedin.ml.metadata.MLPrimaryKeyProperties.ProjectionMask _MLPrimaryKeyPropertiesMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.common.InstitutionalMemory.ProjectionMask _InstitutionalMemoryMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;
        private com.linkedin.common.Deprecation.ProjectionMask _DeprecationMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.DataPlatformInstance.ProjectionMask _DataPlatformInstanceMask;

        ProjectionMask() {
            super(11);
        }

        public MLPrimaryKeyAspect.ProjectionMask withMLPrimaryKeyKey(Function<com.linkedin.metadata.key.MLPrimaryKeyKey.ProjectionMask, com.linkedin.metadata.key.MLPrimaryKeyKey.ProjectionMask> nestedMask) {
            _MLPrimaryKeyKeyMask = nestedMask.apply(((_MLPrimaryKeyKeyMask == null)?com.linkedin.metadata.key.MLPrimaryKeyKey.createMask():_MLPrimaryKeyKeyMask));
            getDataMap().put("com.linkedin.metadata.key.MLPrimaryKeyKey", _MLPrimaryKeyKeyMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withMLPrimaryKeyProperties(Function<com.linkedin.ml.metadata.MLPrimaryKeyProperties.ProjectionMask, com.linkedin.ml.metadata.MLPrimaryKeyProperties.ProjectionMask> nestedMask) {
            _MLPrimaryKeyPropertiesMask = nestedMask.apply(((_MLPrimaryKeyPropertiesMask == null)?com.linkedin.ml.metadata.MLPrimaryKeyProperties.createMask():_MLPrimaryKeyPropertiesMask));
            getDataMap().put("com.linkedin.ml.metadata.MLPrimaryKeyProperties", _MLPrimaryKeyPropertiesMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withInstitutionalMemory(Function<com.linkedin.common.InstitutionalMemory.ProjectionMask, com.linkedin.common.InstitutionalMemory.ProjectionMask> nestedMask) {
            _InstitutionalMemoryMask = nestedMask.apply(((_InstitutionalMemoryMask == null)?com.linkedin.common.InstitutionalMemory.createMask():_InstitutionalMemoryMask));
            getDataMap().put("com.linkedin.common.InstitutionalMemory", _InstitutionalMemoryMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withDeprecation(Function<com.linkedin.common.Deprecation.ProjectionMask, com.linkedin.common.Deprecation.ProjectionMask> nestedMask) {
            _DeprecationMask = nestedMask.apply(((_DeprecationMask == null)?com.linkedin.common.Deprecation.createMask():_DeprecationMask));
            getDataMap().put("com.linkedin.common.Deprecation", _DeprecationMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public MLPrimaryKeyAspect.ProjectionMask withDataPlatformInstance(Function<com.linkedin.common.DataPlatformInstance.ProjectionMask, com.linkedin.common.DataPlatformInstance.ProjectionMask> nestedMask) {
            _DataPlatformInstanceMask = nestedMask.apply(((_DataPlatformInstanceMask == null)?com.linkedin.common.DataPlatformInstance.createMask():_DataPlatformInstanceMask));
            getDataMap().put("com.linkedin.common.DataPlatformInstance", _DataPlatformInstanceMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a MLPrimaryKey
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a MLPrimaryKey*/typeref MLPrimaryKeyAspect=union[{namespace com.linkedin.metadata.key/**Key for an MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyKey\"record MLPrimaryKeyKey{/**Namespace for the primary key*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the primary key*/@Searchable={\"boostScore\":8.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyProperties\"record MLPrimaryKeyProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Documentation of the MLPrimaryKey*/description:optional string/**Data Type of the MLPrimaryKey*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories - mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories - either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data - no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period- daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLPrimaryKey*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}/**Source of the MLPrimaryKey*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"DerivedFrom\"}sources:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:Urn/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp/**Audit stamp associated with updation of this record*/updateStamp:optional AuditStamp/**Settings for this record*/settings:optional/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"BOOLEAN\",\"filterNameOverride\":\"Deprecated\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The user URN which will be credited for modifying this deprecation content.*/actor:Urn,replacement:optional Urn}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional MetadataAttribution}]}}{namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
