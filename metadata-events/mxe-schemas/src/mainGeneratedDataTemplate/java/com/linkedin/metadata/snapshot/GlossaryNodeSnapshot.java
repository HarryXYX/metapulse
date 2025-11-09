
package com.linkedin.metadata.snapshot;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.aspect.GlossaryNodeAspectArray;


/**
 * A metadata snapshot for a specific GlossaryNode entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/GlossaryNodeSnapshot.pdl.")
public class GlossaryNodeSnapshot
    extends RecordTemplate
{

    private final static GlossaryNodeSnapshot.Fields _fields = new GlossaryNodeSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific GlossaryNode entity.*/@Entity={\"keyAspect\":\"glossaryNodeKey\",\"name\":\"glossaryNode\"}record GlossaryNodeSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Business Node*/@java.class=\"com.linkedin.common.urn.GlossaryNodeUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized business node identifier\",\"entityType\":\"glossaryNode\",\"fields\":[{\"doc\":\"The name of business node with hierarchy.\",\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":56,\"name\":\"GlossaryNode\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref GlossaryNodeUrn=string}/**The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a GlossaryNode*/typeref GlossaryNodeAspect=union[{namespace com.linkedin.metadata.key/**Key for a GlossaryNode*/@Aspect.name=\"glossaryNodeKey\"record GlossaryNodeKey{@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}name:string}}{namespace com.linkedin.glossary/**Properties associated with a GlossaryNode*/@Aspect.name=\"glossaryNodeInfo\"record GlossaryNodeInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Definition of business node*/@Searchable={}definition:string/**Parent node of the glossary term*/@Relationship={\"entityTypes\":[\"glossaryNode\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"parentNode\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasParentNode\"}parentNode:optional com.linkedin.common.GlossaryNodeUrn/**Display name of the node*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldName\":\"displayName\",\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:optional string/**Optional id for the GlossaryNode*/@Searchable.fieldType=\"TEXT_PARTIAL\"id:optional string}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]}]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.GlossaryNodeUrn _urnField = null;
    private GlossaryNodeAspectArray _aspectsField = null;
    private GlossaryNodeSnapshot.ChangeListener __changeListener = new GlossaryNodeSnapshot.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryNodeUrn.class);
    }

    public GlossaryNodeSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GlossaryNodeSnapshot(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlossaryNodeSnapshot.Fields fields() {
        return _fields;
    }

    public static GlossaryNodeSnapshot.ProjectionMask createMask() {
        return new GlossaryNodeSnapshot.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see GlossaryNodeSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see GlossaryNodeSnapshot.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see GlossaryNodeSnapshot.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.GlossaryNodeUrn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.GlossaryNodeUrn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryNodeSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.GlossaryNodeUrn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.GlossaryNodeUrn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see GlossaryNodeSnapshot.Fields#urn
     */
    public GlossaryNodeSnapshot setUrn(
        @Nullable
        com.linkedin.common.urn.GlossaryNodeUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.snapshot.GlossaryNodeSnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryNodeSnapshot.Fields#urn
     */
    public GlossaryNodeSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.GlossaryNodeUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.snapshot.GlossaryNodeSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.GlossaryNodeUrn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see GlossaryNodeSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        if (_aspectsField!= null) {
            return true;
        }
        return super._map.containsKey("aspects");
    }

    /**
     * Remover for aspects
     * 
     * @see GlossaryNodeSnapshot.Fields#aspects
     */
    public void removeAspects() {
        super._map.remove("aspects");
    }

    /**
     * Getter for aspects
     * 
     * @see GlossaryNodeSnapshot.Fields#aspects
     */
    @Nullable
    public GlossaryNodeAspectArray getAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspects();
            case DEFAULT:
            case NULL:
                if (_aspectsField!= null) {
                    return _aspectsField;
                } else {
                    Object __rawValue = super._map.get("aspects");
                    _aspectsField = ((__rawValue == null)?null:new GlossaryNodeAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _aspectsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryNodeSnapshot.Fields#aspects
     */
    @Nonnull
    public GlossaryNodeAspectArray getAspects() {
        if (_aspectsField!= null) {
            return _aspectsField;
        } else {
            Object __rawValue = super._map.get("aspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspects");
            }
            _aspectsField = ((__rawValue == null)?null:new GlossaryNodeAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectsField;
        }
    }

    /**
     * Setter for aspects
     * 
     * @see GlossaryNodeSnapshot.Fields#aspects
     */
    public GlossaryNodeSnapshot setAspects(
        @Nullable
        GlossaryNodeAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspects of com.linkedin.metadata.snapshot.GlossaryNodeSnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryNodeSnapshot.Fields#aspects
     */
    public GlossaryNodeSnapshot setAspects(
        @Nonnull
        GlossaryNodeAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspects of com.linkedin.metadata.snapshot.GlossaryNodeSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
            _aspectsField = value;
        }
        return this;
    }

    @Override
    public GlossaryNodeSnapshot clone()
        throws CloneNotSupportedException
    {
        GlossaryNodeSnapshot __clone = ((GlossaryNodeSnapshot) super.clone());
        __clone.__changeListener = new GlossaryNodeSnapshot.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlossaryNodeSnapshot copy()
        throws CloneNotSupportedException
    {
        GlossaryNodeSnapshot __copy = ((GlossaryNodeSnapshot) super.copy());
        __copy._urnField = null;
        __copy._aspectsField = null;
        __copy.__changeListener = new GlossaryNodeSnapshot.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlossaryNodeSnapshot __objectRef;

        private ChangeListener(GlossaryNodeSnapshot reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "aspects":
                    __objectRef._aspectsField = null;
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

        /**
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.GlossaryNodeAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.GlossaryNodeAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.GlossaryNodeAspectArray.ProjectionMask _aspectsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public GlossaryNodeSnapshot.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public GlossaryNodeSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.GlossaryNodeAspectArray.ProjectionMask, com.linkedin.metadata.aspect.GlossaryNodeAspectArray.ProjectionMask> nestedMask) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?GlossaryNodeAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            return this;
        }

        /**
         * The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public GlossaryNodeSnapshot.ProjectionMask withAspects() {
            _aspectsMask = null;
            getDataMap().put("aspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public GlossaryNodeSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.GlossaryNodeAspectArray.ProjectionMask, com.linkedin.metadata.aspect.GlossaryNodeAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?GlossaryNodeAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspects").put("$count", count);
            }
            return this;
        }

        /**
         * The list of metadata aspects associated with the GlossaryNode. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public GlossaryNodeSnapshot.ProjectionMask withAspects(Integer start, Integer count) {
            _aspectsMask = null;
            getDataMap().put("aspects", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspects").put("$count", count);
            }
            return this;
        }

    }

}
