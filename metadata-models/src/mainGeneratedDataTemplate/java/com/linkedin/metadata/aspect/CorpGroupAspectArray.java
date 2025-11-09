
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/snapshot/CorpGroupSnapshot.pdl.")
public class CorpGroupAspectArray
    extends WrappingArrayTemplate<CorpGroupAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}name:string}}{namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]]", SchemaFormatType.PDL));

    public CorpGroupAspectArray() {
        this(new DataList());
    }

    public CorpGroupAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CorpGroupAspectArray(Collection<CorpGroupAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CorpGroupAspectArray(DataList data) {
        super(data, SCHEMA, CorpGroupAspect.class);
    }

    public CorpGroupAspectArray(CorpGroupAspect first, CorpGroupAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static CorpGroupAspectArray.ProjectionMask createMask() {
        return new CorpGroupAspectArray.ProjectionMask();
    }

    @Override
    public CorpGroupAspectArray clone()
        throws CloneNotSupportedException
    {
        CorpGroupAspectArray __clone = ((CorpGroupAspectArray) super.clone());
        return __clone;
    }

    @Override
    public CorpGroupAspectArray copy()
        throws CloneNotSupportedException
    {
        CorpGroupAspectArray __copy = ((CorpGroupAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected CorpGroupAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new CorpGroupAspect(object));
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

        public com.linkedin.metadata.aspect.CorpGroupAspect.Fields items() {
            return new com.linkedin.metadata.aspect.CorpGroupAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.CorpGroupAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public CorpGroupAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.CorpGroupAspect.ProjectionMask, com.linkedin.metadata.aspect.CorpGroupAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?CorpGroupAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
