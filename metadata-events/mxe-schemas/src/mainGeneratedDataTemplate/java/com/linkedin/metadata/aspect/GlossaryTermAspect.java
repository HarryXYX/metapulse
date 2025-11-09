
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/GlossaryTermAspect.pdl.")
public class GlossaryTermAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{/**The term name, which serves as a unique id*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Optional id for the term*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string/**Display name of the term*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Definition of business term.*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}/**Schema definition of the glossary term*/@deprecated,rawSchema:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.glossary/**Has A / Is A lineage information about a glossary Term reporting the lineage*/@Aspect.name=\"glossaryRelatedTerms\"record GlossaryRelatedTerms{/**The relationship Is A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsA\"}@Searchable.`/*`={\"fieldName\":\"isRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}isRelatedTerms:optional array[{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string}]/**The relationship Has A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasA\"}@Searchable.`/*`={\"fieldName\":\"hasRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}hasRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship Has Value with glossary term.\nThese are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasValue\"}@Searchable.`/*`={\"fieldName\":\"values\",\"fieldType\":\"URN\"}values:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship isRelatedTo with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsRelatedTo\"}@Searchable.`/*`={\"fieldName\":\"relatedTerms\",\"fieldType\":\"URN\"}relatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.GlossaryTermKey _glossaryTermKeyMember = null;
    private com.linkedin.glossary.GlossaryTermInfo _glossaryTermInfoMember = null;
    private com.linkedin.common.Ownership _ownershipMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private com.linkedin.common.BrowsePaths _browsePathsMember = null;
    private com.linkedin.glossary.GlossaryRelatedTerms _glossaryRelatedTermsMember = null;
    private GlossaryTermAspect.ChangeListener __changeListener = new GlossaryTermAspect.ChangeListener(this);
    private final static DataSchema MEMBER_GlossaryTermKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.GlossaryTermKey");
    public final static String MEMBERKEY_GlossaryTermKey = "com.linkedin.metadata.key.GlossaryTermKey";
    private final static DataSchema MEMBER_GlossaryTermInfo = SCHEMA.getTypeByMemberKey("com.linkedin.glossary.GlossaryTermInfo");
    public final static String MEMBERKEY_GlossaryTermInfo = "com.linkedin.glossary.GlossaryTermInfo";
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    public final static String MEMBERKEY_Ownership = "com.linkedin.common.Ownership";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    public final static String MEMBERKEY_BrowsePaths = "com.linkedin.common.BrowsePaths";
    private final static DataSchema MEMBER_GlossaryRelatedTerms = SCHEMA.getTypeByMemberKey("com.linkedin.glossary.GlossaryRelatedTerms");
    public final static String MEMBERKEY_GlossaryRelatedTerms = "com.linkedin.glossary.GlossaryRelatedTerms";
    private final static TyperefInfo TYPEREFINFO = new GlossaryTermAspect.UnionTyperefInfo();

    public GlossaryTermAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public GlossaryTermAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static GlossaryTermAspect create(com.linkedin.metadata.key.GlossaryTermKey value) {
        GlossaryTermAspect newUnion = new GlossaryTermAspect();
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

    public static GlossaryTermAspect create(com.linkedin.glossary.GlossaryTermInfo value) {
        GlossaryTermAspect newUnion = new GlossaryTermAspect();
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

    public static GlossaryTermAspect create(com.linkedin.common.Ownership value) {
        GlossaryTermAspect newUnion = new GlossaryTermAspect();
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

    public static GlossaryTermAspect create(com.linkedin.common.Status value) {
        GlossaryTermAspect newUnion = new GlossaryTermAspect();
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

    public static GlossaryTermAspect create(com.linkedin.common.BrowsePaths value) {
        GlossaryTermAspect newUnion = new GlossaryTermAspect();
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

    public static GlossaryTermAspect create(com.linkedin.glossary.GlossaryRelatedTerms value) {
        GlossaryTermAspect newUnion = new GlossaryTermAspect();
        newUnion.setGlossaryRelatedTerms(value);
        return newUnion;
    }

    public boolean isGlossaryRelatedTerms() {
        return memberIs("com.linkedin.glossary.GlossaryRelatedTerms");
    }

    public com.linkedin.glossary.GlossaryRelatedTerms getGlossaryRelatedTerms() {
        checkNotNull();
        if (_glossaryRelatedTermsMember!= null) {
            return _glossaryRelatedTermsMember;
        }
        Object __rawValue = super._map.get("com.linkedin.glossary.GlossaryRelatedTerms");
        _glossaryRelatedTermsMember = ((__rawValue == null)?null:new com.linkedin.glossary.GlossaryRelatedTerms(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _glossaryRelatedTermsMember;
    }

    public void setGlossaryRelatedTerms(com.linkedin.glossary.GlossaryRelatedTerms value) {
        checkNotNull();
        super._map.clear();
        _glossaryRelatedTermsMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.glossary.GlossaryRelatedTerms", value.data());
    }

    public static GlossaryTermAspect.ProjectionMask createMask() {
        return new GlossaryTermAspect.ProjectionMask();
    }

    @Override
    public GlossaryTermAspect clone()
        throws CloneNotSupportedException
    {
        GlossaryTermAspect __clone = ((GlossaryTermAspect) super.clone());
        __clone.__changeListener = new GlossaryTermAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryTermAspect copy()
        throws CloneNotSupportedException
    {
        GlossaryTermAspect __copy = ((GlossaryTermAspect) super.copy());
        __copy._glossaryTermKeyMember = null;
        __copy._glossaryTermInfoMember = null;
        __copy._browsePathsMember = null;
        __copy._glossaryRelatedTermsMember = null;
        __copy._ownershipMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new GlossaryTermAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryTermAspect __objectRef;

        private ChangeListener(GlossaryTermAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.metadata.key.GlossaryTermKey":
                    __objectRef._glossaryTermKeyMember = null;
                    break;
                case "com.linkedin.glossary.GlossaryTermInfo":
                    __objectRef._glossaryTermInfoMember = null;
                    break;
                case "com.linkedin.common.BrowsePaths":
                    __objectRef._browsePathsMember = null;
                    break;
                case "com.linkedin.glossary.GlossaryRelatedTerms":
                    __objectRef._glossaryRelatedTermsMember = null;
                    break;
                case "com.linkedin.common.Ownership":
                    __objectRef._ownershipMember = null;
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

        public com.linkedin.metadata.key.GlossaryTermKey.Fields GlossaryTermKey() {
            return new com.linkedin.metadata.key.GlossaryTermKey.Fields(getPathComponents(), "com.linkedin.metadata.key.GlossaryTermKey");
        }

        public com.linkedin.glossary.GlossaryTermInfo.Fields GlossaryTermInfo() {
            return new com.linkedin.glossary.GlossaryTermInfo.Fields(getPathComponents(), "com.linkedin.glossary.GlossaryTermInfo");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.glossary.GlossaryRelatedTerms.Fields GlossaryRelatedTerms() {
            return new com.linkedin.glossary.GlossaryRelatedTerms.Fields(getPathComponents(), "com.linkedin.glossary.GlossaryRelatedTerms");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.GlossaryTermKey.ProjectionMask _GlossaryTermKeyMask;
        private com.linkedin.glossary.GlossaryTermInfo.ProjectionMask _GlossaryTermInfoMask;
        private com.linkedin.common.Ownership.ProjectionMask _OwnershipMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;
        private com.linkedin.common.BrowsePaths.ProjectionMask _BrowsePathsMask;
        private com.linkedin.glossary.GlossaryRelatedTerms.ProjectionMask _GlossaryRelatedTermsMask;

        ProjectionMask() {
            super(8);
        }

        public GlossaryTermAspect.ProjectionMask withGlossaryTermKey(Function<com.linkedin.metadata.key.GlossaryTermKey.ProjectionMask, com.linkedin.metadata.key.GlossaryTermKey.ProjectionMask> nestedMask) {
            _GlossaryTermKeyMask = nestedMask.apply(((_GlossaryTermKeyMask == null)?com.linkedin.metadata.key.GlossaryTermKey.createMask():_GlossaryTermKeyMask));
            getDataMap().put("com.linkedin.metadata.key.GlossaryTermKey", _GlossaryTermKeyMask.getDataMap());
            return this;
        }

        public GlossaryTermAspect.ProjectionMask withGlossaryTermInfo(Function<com.linkedin.glossary.GlossaryTermInfo.ProjectionMask, com.linkedin.glossary.GlossaryTermInfo.ProjectionMask> nestedMask) {
            _GlossaryTermInfoMask = nestedMask.apply(((_GlossaryTermInfoMask == null)?com.linkedin.glossary.GlossaryTermInfo.createMask():_GlossaryTermInfoMask));
            getDataMap().put("com.linkedin.glossary.GlossaryTermInfo", _GlossaryTermInfoMask.getDataMap());
            return this;
        }

        public GlossaryTermAspect.ProjectionMask withOwnership(Function<com.linkedin.common.Ownership.ProjectionMask, com.linkedin.common.Ownership.ProjectionMask> nestedMask) {
            _OwnershipMask = nestedMask.apply(((_OwnershipMask == null)?com.linkedin.common.Ownership.createMask():_OwnershipMask));
            getDataMap().put("com.linkedin.common.Ownership", _OwnershipMask.getDataMap());
            return this;
        }

        public GlossaryTermAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

        public GlossaryTermAspect.ProjectionMask withBrowsePaths(Function<com.linkedin.common.BrowsePaths.ProjectionMask, com.linkedin.common.BrowsePaths.ProjectionMask> nestedMask) {
            _BrowsePathsMask = nestedMask.apply(((_BrowsePathsMask == null)?com.linkedin.common.BrowsePaths.createMask():_BrowsePathsMask));
            getDataMap().put("com.linkedin.common.BrowsePaths", _BrowsePathsMask.getDataMap());
            return this;
        }

        public GlossaryTermAspect.ProjectionMask withGlossaryRelatedTerms(Function<com.linkedin.glossary.GlossaryRelatedTerms.ProjectionMask, com.linkedin.glossary.GlossaryRelatedTerms.ProjectionMask> nestedMask) {
            _GlossaryRelatedTermsMask = nestedMask.apply(((_GlossaryRelatedTermsMask == null)?com.linkedin.glossary.GlossaryRelatedTerms.createMask():_GlossaryRelatedTermsMask));
            getDataMap().put("com.linkedin.glossary.GlossaryRelatedTerms", _GlossaryRelatedTermsMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a CorpUser
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpUser*/typeref GlossaryTermAspect=union[{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{/**The term name, which serves as a unique id*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Optional id for the term*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string/**Display name of the term*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Definition of business term.*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}/**Schema definition of the glossary term*/@deprecated,rawSchema:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.glossary/**Has A / Is A lineage information about a glossary Term reporting the lineage*/@Aspect.name=\"glossaryRelatedTerms\"record GlossaryRelatedTerms{/**The relationship Is A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsA\"}@Searchable.`/*`={\"fieldName\":\"isRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}isRelatedTerms:optional array[{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string}]/**The relationship Has A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasA\"}@Searchable.`/*`={\"fieldName\":\"hasRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}hasRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship Has Value with glossary term.\nThese are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasValue\"}@Searchable.`/*`={\"fieldName\":\"values\",\"fieldType\":\"URN\"}values:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship isRelatedTo with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsRelatedTo\"}@Searchable.`/*`={\"fieldName\":\"relatedTerms\",\"fieldType\":\"URN\"}relatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
