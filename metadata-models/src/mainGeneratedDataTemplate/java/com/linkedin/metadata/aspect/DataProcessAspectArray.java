
package com.linkedin.metadata.aspect;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/snapshot/DataProcessSnapshot.pdl.")
public class DataProcessAspectArray
    extends WrappingArrayTemplate<DataProcessAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"boostScore\":4.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":false}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates testing fabrics*/TEST/**Designates quality assurance fabrics*/QA/**Designates user acceptance testing fabrics*/UAT/**Designates early-integration fabrics*/EI/**Designates pre-production fabrics*/PRE/**Designates staging fabrics*/STG/**Designates non-production fabrics*/NON_PROD/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP/**Designates review fabrics*/RVW/**Alternative Prod spelling*/PRD/**Alternative Test spelling*/TST/**System Integration Testing*/SIT/**Alternative spelling for sandbox*/SBX/**Designates sandbox fabrics*/SANDBOX}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputs:optional array[com.linkedin.common.DatasetUrn]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]]", SchemaFormatType.PDL));

    public DataProcessAspectArray() {
        this(new DataList());
    }

    public DataProcessAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataProcessAspectArray(Collection<DataProcessAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataProcessAspectArray(DataList data) {
        super(data, SCHEMA, DataProcessAspect.class);
    }

    public DataProcessAspectArray(DataProcessAspect first, DataProcessAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataProcessAspectArray.ProjectionMask createMask() {
        return new DataProcessAspectArray.ProjectionMask();
    }

    @Override
    public DataProcessAspectArray clone()
        throws CloneNotSupportedException
    {
        DataProcessAspectArray __clone = ((DataProcessAspectArray) super.clone());
        return __clone;
    }

    @Override
    public DataProcessAspectArray copy()
        throws CloneNotSupportedException
    {
        DataProcessAspectArray __copy = ((DataProcessAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected DataProcessAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataProcessAspect(object));
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

        public com.linkedin.metadata.aspect.DataProcessAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataProcessAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.DataProcessAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataProcessAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.DataProcessAspect.ProjectionMask, com.linkedin.metadata.aspect.DataProcessAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataProcessAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
