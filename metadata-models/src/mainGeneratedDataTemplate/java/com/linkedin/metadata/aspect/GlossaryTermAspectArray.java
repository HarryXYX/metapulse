
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/snapshot/GlossaryTermSnapshot.pdl.")
public class GlossaryTermAspectArray
    extends WrappingArrayTemplate<GlossaryTermAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a GlossaryTerm*/@Aspect.name=\"glossaryTermKey\"record GlossaryTermKey{/**The term name, which serves as a unique id*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"id\",\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryTerm*/@Aspect.name=\"glossaryTermInfo\"record GlossaryTermInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Optional id for the term*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string/**Display name of the term*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Definition of business term.*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**Source of the Business Term (INTERNAL or EXTERNAL) with default value as INTERNAL*/@Searchable.fieldType=\"KEYWORD\"termSource:string/**External Reference to the business-term*/@Searchable.fieldType=\"KEYWORD\"sourceRef:optional string/**The abstracted URL such as https://spec.edmcouncil.org/fibo/ontology/FBC/FinancialInstruments/FinancialInstruments/CashInstrument.*/sourceUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}/**Schema definition of the glossary term*/@deprecated,rawSchema:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be forward slash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.glossary/**Has A / Is A lineage information about a glossary Term reporting the lineage*/@Aspect.name=\"glossaryRelatedTerms\"record GlossaryRelatedTerms{/**The relationship Is A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsA\"}@Searchable.`/*`={\"fieldName\":\"isRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}isRelatedTerms:optional array[{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"business term\",\"entityType\":\"glossaryTerm\",\"fields\":[{\"doc\":\"The name of business term with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryTerm\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryTermUrn=string}]/**The relationship Has A with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasA\"}@Searchable.`/*`={\"fieldName\":\"hasRelatedTerms\",\"fieldType\":\"URN\",\"queryByDefault\":false}hasRelatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship Has Value with glossary term.\nThese are fixed value a term has. For example a ColorEnum where RED, GREEN and YELLOW are fixed values.*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"HasValue\"}@Searchable.`/*`={\"fieldName\":\"values\",\"fieldType\":\"URN\"}values:optional array[com.linkedin.common.GlossaryTermUrn]/**The relationship isRelatedTo with glossary term*/@Relationship.`/*`={\"entityTypes\":[\"glossaryTerm\"],\"name\":\"IsRelatedTo\"}@Searchable.`/*`={\"fieldName\":\"relatedTerms\",\"fieldType\":\"URN\"}relatedTerms:optional array[com.linkedin.common.GlossaryTermUrn]}}]]", SchemaFormatType.PDL));

    public GlossaryTermAspectArray() {
        this(new DataList());
    }

    public GlossaryTermAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public GlossaryTermAspectArray(Collection<GlossaryTermAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public GlossaryTermAspectArray(DataList data) {
        super(data, SCHEMA, GlossaryTermAspect.class);
    }

    public GlossaryTermAspectArray(GlossaryTermAspect first, GlossaryTermAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static GlossaryTermAspectArray.ProjectionMask createMask() {
        return new GlossaryTermAspectArray.ProjectionMask();
    }

    @Override
    public GlossaryTermAspectArray clone()
        throws CloneNotSupportedException
    {
        GlossaryTermAspectArray __clone = ((GlossaryTermAspectArray) super.clone());
        return __clone;
    }

    @Override
    public GlossaryTermAspectArray copy()
        throws CloneNotSupportedException
    {
        GlossaryTermAspectArray __copy = ((GlossaryTermAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected GlossaryTermAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new GlossaryTermAspect(object));
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

        public com.linkedin.metadata.aspect.GlossaryTermAspect.Fields items() {
            return new com.linkedin.metadata.aspect.GlossaryTermAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.GlossaryTermAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public GlossaryTermAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.GlossaryTermAspect.ProjectionMask, com.linkedin.metadata.aspect.GlossaryTermAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?GlossaryTermAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
