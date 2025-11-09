
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/DataProcessAspect.pdl.")
public class DataProcessAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"boostScore\":4.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputs:optional array[com.linkedin.common.DatasetUrn]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.DataProcessKey _dataProcessKeyMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.dataprocess.DataProcessInfo _dataProcessInfoMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private DataProcessAspect.ChangeListener __changeListener = new DataProcessAspect.ChangeListener(this);
    private final static DataSchema MEMBER_DataProcessKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataProcessKey");
    public final static String MEMBERKEY_DataProcessKey = "com.linkedin.metadata.key.DataProcessKey";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_DataProcessInfo = SCHEMA.getTypeByMemberKey("com.linkedin.dataprocess.DataProcessInfo");
    public final static String MEMBERKEY_DataProcessInfo = "com.linkedin.dataprocess.DataProcessInfo";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static TyperefInfo TYPEREFINFO = new DataProcessAspect.UnionTyperefInfo();

    public DataProcessAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataProcessAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataProcessAspect create(com.linkedin.metadata.key.DataProcessKey value) {
        DataProcessAspect newUnion = new DataProcessAspect();
        newUnion.setDataProcessKey(value);
        return newUnion;
    }

    public boolean isDataProcessKey() {
        return memberIs("com.linkedin.metadata.key.DataProcessKey");
    }

    public com.linkedin.metadata.key.DataProcessKey getDataProcessKey() {
        checkNotNull();
        if (_dataProcessKeyMember!= null) {
            return _dataProcessKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DataProcessKey");
        _dataProcessKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DataProcessKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataProcessKeyMember;
    }

    public void setDataProcessKey(com.linkedin.metadata.key.DataProcessKey value) {
        checkNotNull();
        super._map.clear();
        _dataProcessKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DataProcessKey", value.data());
    }

    public static DataProcessAspect create(com.linkedin.common.Ownership value) {
        DataProcessAspect newUnion = new DataProcessAspect();
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

    public static DataProcessAspect create(com.linkedin.dataprocess.DataProcessInfo value) {
        DataProcessAspect newUnion = new DataProcessAspect();
        newUnion.setDataProcessInfo(value);
        return newUnion;
    }

    public boolean isDataProcessInfo() {
        return memberIs("com.linkedin.dataprocess.DataProcessInfo");
    }

    public com.linkedin.dataprocess.DataProcessInfo getDataProcessInfo() {
        checkNotNull();
        if (_dataProcessInfoMember!= null) {
            return _dataProcessInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataprocess.DataProcessInfo");
        _dataProcessInfoMember = ((__rawValue == null)?null:new com.linkedin.dataprocess.DataProcessInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataProcessInfoMember;
    }

    public void setDataProcessInfo(com.linkedin.dataprocess.DataProcessInfo value) {
        checkNotNull();
        super._map.clear();
        _dataProcessInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataprocess.DataProcessInfo", value.data());
    }

    public static DataProcessAspect create(com.linkedin.common.Status value) {
        DataProcessAspect newUnion = new DataProcessAspect();
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

    public static DataProcessAspect.ProjectionMask createMask() {
        return new DataProcessAspect.ProjectionMask();
    }

    @Override
    public DataProcessAspect clone()
        throws CloneNotSupportedException
    {
        DataProcessAspect __clone = ((DataProcessAspect) super.clone());
        __clone.__changeListener = new DataProcessAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessAspect copy()
        throws CloneNotSupportedException
    {
        DataProcessAspect __copy = ((DataProcessAspect) super.copy());
        __copy._ownershipMember = null;
        __copy._dataProcessKeyMember = null;
        __copy._dataProcessInfoMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new DataProcessAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessAspect __objectRef;

        private ChangeListener(DataProcessAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.common.Ownership":
                    __objectRef._ownershipMember = null;
                    break;
                case "com.linkedin.metadata.key.DataProcessKey":
                    __objectRef._dataProcessKeyMember = null;
                    break;
                case "com.linkedin.dataprocess.DataProcessInfo":
                    __objectRef._dataProcessInfoMember = null;
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

        public com.linkedin.metadata.key.DataProcessKey.Fields DataProcessKey() {
            return new com.linkedin.metadata.key.DataProcessKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataProcessKey");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.dataprocess.DataProcessInfo.Fields DataProcessInfo() {
            return new com.linkedin.dataprocess.DataProcessInfo.Fields(getPathComponents(), "com.linkedin.dataprocess.DataProcessInfo");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.DataProcessKey.ProjectionMask _DataProcessKeyMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.dataprocess.DataProcessInfo.ProjectionMask _DataProcessInfoMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;

        ProjectionMask() {
            super(6);
        }

        public DataProcessAspect.ProjectionMask withDataProcessKey(Function<com.linkedin.metadata.key.DataProcessKey.ProjectionMask, com.linkedin.metadata.key.DataProcessKey.ProjectionMask> nestedMask) {
            _DataProcessKeyMask = nestedMask.apply(((_DataProcessKeyMask == null)?com.linkedin.metadata.key.DataProcessKey.createMask():_DataProcessKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataProcessKey", _DataProcessKeyMask.getDataMap());
            return this;
        }

        public DataProcessAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public DataProcessAspect.ProjectionMask withDataProcessInfo(Function<com.linkedin.dataprocess.DataProcessInfo.ProjectionMask, com.linkedin.dataprocess.DataProcessInfo.ProjectionMask> nestedMask) {
            _DataProcessInfoMask = nestedMask.apply(((_DataProcessInfoMask == null)?com.linkedin.dataprocess.DataProcessInfo.createMask():_DataProcessInfoMask));
            getDataMap().put("com.linkedin.dataprocess.DataProcessInfo", _DataProcessInfoMask.getDataMap());
            return this;
        }

        public DataProcessAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a data process
     * 
     * @deprecated
     *     Use DataJob instead.
     */
    @Deprecated
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a data process*/@deprecated=\"Use DataJob instead.\"typeref DataProcessAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"boostScore\":4.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputs:optional array[com.linkedin.common.DatasetUrn]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
