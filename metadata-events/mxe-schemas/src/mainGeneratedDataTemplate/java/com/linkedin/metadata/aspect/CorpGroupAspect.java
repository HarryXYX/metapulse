
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/CorpGroupAspect.pdl.")
public class CorpGroupAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}name:string}}{namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.CorpGroupKey _corpGroupKeyMember = null;
    private com.linkedin.identity.CorpGroupInfo _corpGroupInfoMember = null;
    private com.linkedin.common.GlobalTags _globalTagsMember = null;
    private com.linkedin.common.Status _statusMember = null;
    private CorpGroupAspect.ChangeListener __changeListener = new CorpGroupAspect.ChangeListener(this);
    private final static DataSchema MEMBER_CorpGroupKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpGroupKey");
    public final static String MEMBERKEY_CorpGroupKey = "com.linkedin.metadata.key.CorpGroupKey";
    private final static DataSchema MEMBER_CorpGroupInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpGroupInfo");
    public final static String MEMBERKEY_CorpGroupInfo = "com.linkedin.identity.CorpGroupInfo";
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    public final static String MEMBERKEY_GlobalTags = "com.linkedin.common.GlobalTags";
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    public final static String MEMBERKEY_Status = "com.linkedin.common.Status";
    private final static TyperefInfo TYPEREFINFO = new CorpGroupAspect.UnionTyperefInfo();

    public CorpGroupAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CorpGroupAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static CorpGroupAspect create(com.linkedin.metadata.key.CorpGroupKey value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
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

    public static CorpGroupAspect create(com.linkedin.identity.CorpGroupInfo value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
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

    public static CorpGroupAspect create(com.linkedin.common.GlobalTags value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
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

    public static CorpGroupAspect create(com.linkedin.common.Status value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
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

    public static CorpGroupAspect.ProjectionMask createMask() {
        return new CorpGroupAspect.ProjectionMask();
    }

    @Override
    public CorpGroupAspect clone()
        throws CloneNotSupportedException
    {
        CorpGroupAspect __clone = ((CorpGroupAspect) super.clone());
        __clone.__changeListener = new CorpGroupAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpGroupAspect copy()
        throws CloneNotSupportedException
    {
        CorpGroupAspect __copy = ((CorpGroupAspect) super.copy());
        __copy._corpGroupKeyMember = null;
        __copy._corpGroupInfoMember = null;
        __copy._globalTagsMember = null;
        __copy._statusMember = null;
        __copy.__changeListener = new CorpGroupAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpGroupAspect __objectRef;

        private ChangeListener(CorpGroupAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.metadata.key.CorpGroupKey":
                    __objectRef._corpGroupKeyMember = null;
                    break;
                case "com.linkedin.identity.CorpGroupInfo":
                    __objectRef._corpGroupInfoMember = null;
                    break;
                case "com.linkedin.common.GlobalTags":
                    __objectRef._globalTagsMember = null;
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

        public com.linkedin.metadata.key.CorpGroupKey.Fields CorpGroupKey() {
            return new com.linkedin.metadata.key.CorpGroupKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpGroupKey");
        }

        public com.linkedin.identity.CorpGroupInfo.Fields CorpGroupInfo() {
            return new com.linkedin.identity.CorpGroupInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpGroupInfo");
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

        private com.linkedin.metadata.key.CorpGroupKey.ProjectionMask _CorpGroupKeyMask;
        private com.linkedin.identity.CorpGroupInfo.ProjectionMask _CorpGroupInfoMask;
        private com.linkedin.common.GlobalTags.ProjectionMask _GlobalTagsMask;
        private com.linkedin.common.Status.ProjectionMask _StatusMask;

        ProjectionMask() {
            super(6);
        }

        public CorpGroupAspect.ProjectionMask withCorpGroupKey(Function<com.linkedin.metadata.key.CorpGroupKey.ProjectionMask, com.linkedin.metadata.key.CorpGroupKey.ProjectionMask> nestedMask) {
            _CorpGroupKeyMask = nestedMask.apply(((_CorpGroupKeyMask == null)?com.linkedin.metadata.key.CorpGroupKey.createMask():_CorpGroupKeyMask));
            getDataMap().put("com.linkedin.metadata.key.CorpGroupKey", _CorpGroupKeyMask.getDataMap());
            return this;
        }

        public CorpGroupAspect.ProjectionMask withCorpGroupInfo(Function<com.linkedin.identity.CorpGroupInfo.ProjectionMask, com.linkedin.identity.CorpGroupInfo.ProjectionMask> nestedMask) {
            _CorpGroupInfoMask = nestedMask.apply(((_CorpGroupInfoMask == null)?com.linkedin.identity.CorpGroupInfo.createMask():_CorpGroupInfoMask));
            getDataMap().put("com.linkedin.identity.CorpGroupInfo", _CorpGroupInfoMask.getDataMap());
            return this;
        }

        public CorpGroupAspect.ProjectionMask withGlobalTags(Function<com.linkedin.common.GlobalTags.ProjectionMask, com.linkedin.common.GlobalTags.ProjectionMask> nestedMask) {
            _GlobalTagsMask = nestedMask.apply(((_GlobalTagsMask == null)?com.linkedin.common.GlobalTags.createMask():_GlobalTagsMask));
            getDataMap().put("com.linkedin.common.GlobalTags", _GlobalTagsMask.getDataMap());
            return this;
        }

        public CorpGroupAspect.ProjectionMask withStatus(Function<com.linkedin.common.Status.ProjectionMask, com.linkedin.common.Status.ProjectionMask> nestedMask) {
            _StatusMask = nestedMask.apply(((_StatusMask == null)?com.linkedin.common.Status.createMask():_StatusMask));
            getDataMap().put("com.linkedin.common.Status", _StatusMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a CorpGroup
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpGroup*/typeref CorpGroupAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}name:string}}{namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
