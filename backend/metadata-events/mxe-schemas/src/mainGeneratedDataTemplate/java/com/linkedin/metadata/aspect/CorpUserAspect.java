
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/CorpUserAspect.pdl.")
public class CorpUserAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"boostScore\":2.0,\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"fieldType\":\"WORD_GRAM\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserInfo\"}record CorpUserInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":2.0}}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email address of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true,\"searchTier\":1}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true}title:optional string/**direct manager of this user*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"ReportsTo\"}@Searchable={\"fieldName\":\"managerLdap\",\"fieldType\":\"URN\",\"queryByDefault\":false}managerUrn:optional{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string/**Whether the corpUser is a system user.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"queryByDefault\":false}system:optional boolean=false}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserEditableInfo\"}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}=\"assets/platforms/default_avatar.png\"/**DataHub-native display name*/@Searchable={\"boostScore\":10.0,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}displayName:optional string/**DataHub-native Title, e.g. 'Software Engineer'*/title:optional string/**The platforms that the user commonly works with*/@Relationship.`/*`={\"entityTypes\":[\"dataPlatform\"],\"name\":\"IsUserOf\"}platforms:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**The user's persona type, based on their role*/@Relationship={\"entityTypes\":[\"dataHubPersona\"],\"name\":\"IsPersona\"}persona:optional com.linkedin.common.Urn/**Slack handle for the user*/slack:optional string/**Phone number to contact the user*/phone:optional string/**Email address to contact the user*/email:optional string/**Information sources that have been used to populate this CorpUserEditableInfo.\nThese include platform resources, such as Slack members or Looker users.\nThey can also refer to other semantic urns in the future.*/informationSources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/@Searchable.`/time`={\"fieldName\":\"statusLastModifiedAt\",\"fieldType\":\"COUNT\"}lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfGroup\"}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.CorpUserKey _corpUserKeyMember = null;
    private com.linkedin.identity.CorpUserInfo _corpUserInfoMember = null;
    private com.linkedin.identity.CorpUserEditableInfo _corpUserEditableInfoMember = null;
    private com.linkedin.identity.CorpUserStatus _corpUserStatusMember = null;
    private com.linkedin.identity.GroupMembership _groupMembershipMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private CorpUserAspect.ChangeListener __changeListener = new CorpUserAspect.ChangeListener(this);
    private final static DataSchema MEMBER_CorpUserKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpUserKey");
    public final static String MEMBERKEY_CorpUserKey = "com.linkedin.metadata.key.CorpUserKey";
    private final static DataSchema MEMBER_CorpUserInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserInfo");
    public final static String MEMBERKEY_CorpUserInfo = "com.linkedin.identity.CorpUserInfo";
    private final static DataSchema MEMBER_CorpUserEditableInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserEditableInfo");
    public final static String MEMBERKEY_CorpUserEditableInfo = "com.linkedin.identity.CorpUserEditableInfo";
    private final static DataSchema MEMBER_CorpUserStatus = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserStatus");
    public final static String MEMBERKEY_CorpUserStatus = "com.linkedin.identity.CorpUserStatus";
    private final static DataSchema MEMBER_GroupMembership = SCHEMA.getTypeByMemberKey("com.linkedin.identity.GroupMembership");
    public final static String MEMBERKEY_GroupMembership = "com.linkedin.identity.GroupMembership";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static TyperefInfo TYPEREFINFO = new CorpUserAspect.UnionTyperefInfo();

    public CorpUserAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CorpUserAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static CorpUserAspect create(com.linkedin.metadata.key.CorpUserKey value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.identity.CorpUserInfo value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.identity.CorpUserEditableInfo value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.identity.CorpUserStatus value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.identity.GroupMembership value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.common.GlobalTags value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.common.Status value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect.ProjectionMask createMask() {
        return new CorpUserAspect.ProjectionMask();
    }

    @Override
    public CorpUserAspect clone()
        throws CloneNotSupportedException
    {
        CorpUserAspect __clone = ((CorpUserAspect) super.clone());
        __clone.__changeListener = new CorpUserAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserAspect copy()
        throws CloneNotSupportedException
    {
        CorpUserAspect __copy = ((CorpUserAspect) super.copy());
        __copy._corpUserStatusMember = null;
        __copy._corpUserKeyMember = null;
        __copy._globalTagsMember = null;
        __copy._corpUserInfoMember = null;
        __copy._corpUserEditableInfoMember = null;
        __copy._groupMembershipMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new CorpUserAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserAspect __objectRef;

        private ChangeListener(CorpUserAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.identity.CorpUserStatus":
                    __objectRef._corpUserStatusMember = null;
                    break;
                case "com.linkedin.metadata.key.CorpUserKey":
                    __objectRef._corpUserKeyMember = null;
                    break;
                case "com.linkedin.common.GlobalTags":
                    __objectRef._globalTagsMember = null;
                    break;
                case "com.linkedin.identity.CorpUserInfo":
                    __objectRef._corpUserInfoMember = null;
                    break;
                case "com.linkedin.identity.CorpUserEditableInfo":
                    __objectRef._corpUserEditableInfoMember = null;
                    break;
                case "com.linkedin.identity.GroupMembership":
                    __objectRef._groupMembershipMember = null;
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

        public com.linkedin.metadata.key.CorpUserKey.Fields CorpUserKey() {
            return new com.linkedin.metadata.key.CorpUserKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpUserKey");
        }

        public com.linkedin.identity.CorpUserInfo.Fields CorpUserInfo() {
            return new com.linkedin.identity.CorpUserInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserInfo");
        }

        public com.linkedin.identity.CorpUserEditableInfo.Fields CorpUserEditableInfo() {
            return new com.linkedin.identity.CorpUserEditableInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserEditableInfo");
        }

        public com.linkedin.identity.CorpUserStatus.Fields CorpUserStatus() {
            return new com.linkedin.identity.CorpUserStatus.Fields(getPathComponents(), "com.linkedin.identity.CorpUserStatus");
        }

        public com.linkedin.identity.GroupMembership.Fields GroupMembership() {
            return new com.linkedin.identity.GroupMembership.Fields(getPathComponents(), "com.linkedin.identity.GroupMembership");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.CorpUserKey.ProjectionMask _CorpUserKeyMask;
        private com.linkedin.identity.CorpUserInfo.ProjectionMask _CorpUserInfoMask;
        private com.linkedin.identity.CorpUserEditableInfo.ProjectionMask _CorpUserEditableInfoMask;
        private com.linkedin.identity.CorpUserStatus.ProjectionMask _CorpUserStatusMask;
        private com.linkedin.identity.GroupMembership.ProjectionMask _GroupMembershipMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;

        ProjectionMask() {
            super(10);
        }

        public CorpUserAspect.ProjectionMask withCorpUserKey(Function<com.linkedin.metadata.key.CorpUserKey.ProjectionMask, com.linkedin.metadata.key.CorpUserKey.ProjectionMask> nestedMask) {
            _CorpUserKeyMask = nestedMask.apply(((_CorpUserKeyMask == null)?com.linkedin.metadata.key.CorpUserKey.createMask():_CorpUserKeyMask));
            getDataMap().put("com.linkedin.metadata.key.CorpUserKey", _CorpUserKeyMask.getDataMap());
            return this;
        }

        public CorpUserAspect.ProjectionMask withCorpUserInfo(Function<com.linkedin.identity.CorpUserInfo.ProjectionMask, com.linkedin.identity.CorpUserInfo.ProjectionMask> nestedMask) {
            _CorpUserInfoMask = nestedMask.apply(((_CorpUserInfoMask == null)?com.linkedin.identity.CorpUserInfo.createMask():_CorpUserInfoMask));
            getDataMap().put("com.linkedin.identity.CorpUserInfo", _CorpUserInfoMask.getDataMap());
            return this;
        }

        public CorpUserAspect.ProjectionMask withCorpUserEditableInfo(Function<com.linkedin.identity.CorpUserEditableInfo.ProjectionMask, com.linkedin.identity.CorpUserEditableInfo.ProjectionMask> nestedMask) {
            _CorpUserEditableInfoMask = nestedMask.apply(((_CorpUserEditableInfoMask == null)?com.linkedin.identity.CorpUserEditableInfo.createMask():_CorpUserEditableInfoMask));
            getDataMap().put("com.linkedin.identity.CorpUserEditableInfo", _CorpUserEditableInfoMask.getDataMap());
            return this;
        }

        public CorpUserAspect.ProjectionMask withCorpUserStatus(Function<com.linkedin.identity.CorpUserStatus.ProjectionMask, com.linkedin.identity.CorpUserStatus.ProjectionMask> nestedMask) {
            _CorpUserStatusMask = nestedMask.apply(((_CorpUserStatusMask == null)?com.linkedin.identity.CorpUserStatus.createMask():_CorpUserStatusMask));
            getDataMap().put("com.linkedin.identity.CorpUserStatus", _CorpUserStatusMask.getDataMap());
            return this;
        }

        public CorpUserAspect.ProjectionMask withGroupMembership(Function<com.linkedin.identity.GroupMembership.ProjectionMask, com.linkedin.identity.GroupMembership.ProjectionMask> nestedMask) {
            _GroupMembershipMask = nestedMask.apply(((_GroupMembershipMask == null)?com.linkedin.identity.GroupMembership.createMask():_GroupMembershipMask));
            getDataMap().put("com.linkedin.identity.GroupMembership", _GroupMembershipMask.getDataMap());
            return this;
        }

        public CorpUserAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public CorpUserAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
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

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpUser*/typeref CorpUserAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"boostScore\":2.0,\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"fieldType\":\"WORD_GRAM\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserInfo\"}record CorpUserInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":2.0}}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email address of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true,\"searchTier\":1}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true}title:optional string/**direct manager of this user*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"ReportsTo\"}@Searchable={\"fieldName\":\"managerLdap\",\"fieldType\":\"URN\",\"queryByDefault\":false}managerUrn:optional{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string/**Whether the corpUser is a system user.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"queryByDefault\":false}system:optional boolean=false}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserEditableInfo\"}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}=\"assets/platforms/default_avatar.png\"/**DataHub-native display name*/@Searchable={\"boostScore\":10.0,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}displayName:optional string/**DataHub-native Title, e.g. 'Software Engineer'*/title:optional string/**The platforms that the user commonly works with*/@Relationship.`/*`={\"entityTypes\":[\"dataPlatform\"],\"name\":\"IsUserOf\"}platforms:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**The user's persona type, based on their role*/@Relationship={\"entityTypes\":[\"dataHubPersona\"],\"name\":\"IsPersona\"}persona:optional com.linkedin.common.Urn/**Slack handle for the user*/slack:optional string/**Phone number to contact the user*/phone:optional string/**Email address to contact the user*/email:optional string/**Information sources that have been used to populate this CorpUserEditableInfo.\nThese include platform resources, such as Slack members or Looker users.\nThey can also refer to other semantic urns in the future.*/informationSources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/@Searchable.`/time`={\"fieldName\":\"statusLastModifiedAt\",\"fieldType\":\"COUNT\"}lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfGroup\"}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
