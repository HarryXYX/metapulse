
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
import com.linkedin.metadata.aspect.CorpGroupAspectArray;


/**
 * A metadata snapshot for a specific CorpGroup entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/CorpGroupSnapshot.pdl.")
public class CorpGroupSnapshot
    extends RecordTemplate
{

    private final static CorpGroupSnapshot.Fields _fields = new CorpGroupSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific CorpGroup entity.*/@Entity={\"keyAspect\":\"corpGroupKey\",\"name\":\"corpGroup\"}record CorpGroupSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}/**The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpGroup*/typeref CorpGroupAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}name:string}}{namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[com.linkedin.common.CorpGroupUrn]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]}]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.CorpGroupUrn _urnField = null;
    private CorpGroupAspectArray _aspectsField = null;
    private CorpGroupSnapshot.ChangeListener __changeListener = new CorpGroupSnapshot.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CorpGroupSnapshot(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpGroupSnapshot.Fields fields() {
        return _fields;
    }

    public static CorpGroupSnapshot.ProjectionMask createMask() {
        return new CorpGroupSnapshot.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
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
     * @see CorpGroupSnapshot.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.CorpGroupUrn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.CorpGroupUrn.class);
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
     * @see CorpGroupSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.CorpGroupUrn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.CorpGroupUrn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see CorpGroupSnapshot.Fields#urn
     */
    public CorpGroupSnapshot setUrn(
        @Nullable
        com.linkedin.common.urn.CorpGroupUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.snapshot.CorpGroupSnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpGroupUrn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpGroupUrn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpGroupUrn.class));
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
     * @see CorpGroupSnapshot.Fields#urn
     */
    public CorpGroupSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.CorpGroupUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.snapshot.CorpGroupSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpGroupUrn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
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
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public void removeAspects() {
        super._map.remove("aspects");
    }

    /**
     * Getter for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
     */
    @Nullable
    public CorpGroupAspectArray getAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspects();
            case DEFAULT:
            case NULL:
                if (_aspectsField!= null) {
                    return _aspectsField;
                } else {
                    Object __rawValue = super._map.get("aspects");
                    _aspectsField = ((__rawValue == null)?null:new CorpGroupAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see CorpGroupSnapshot.Fields#aspects
     */
    @Nonnull
    public CorpGroupAspectArray getAspects() {
        if (_aspectsField!= null) {
            return _aspectsField;
        } else {
            Object __rawValue = super._map.get("aspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspects");
            }
            _aspectsField = ((__rawValue == null)?null:new CorpGroupAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectsField;
        }
    }

    /**
     * Setter for aspects
     * 
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public CorpGroupSnapshot setAspects(
        @Nullable
        CorpGroupAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspects of com.linkedin.metadata.snapshot.CorpGroupSnapshot");
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
     * @see CorpGroupSnapshot.Fields#aspects
     */
    public CorpGroupSnapshot setAspects(
        @Nonnull
        CorpGroupAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspects of com.linkedin.metadata.snapshot.CorpGroupSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
            _aspectsField = value;
        }
        return this;
    }

    @Override
    public CorpGroupSnapshot clone()
        throws CloneNotSupportedException
    {
        CorpGroupSnapshot __clone = ((CorpGroupSnapshot) super.clone());
        __clone.__changeListener = new CorpGroupSnapshot.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpGroupSnapshot copy()
        throws CloneNotSupportedException
    {
        CorpGroupSnapshot __copy = ((CorpGroupSnapshot) super.copy());
        __copy._urnField = null;
        __copy._aspectsField = null;
        __copy.__changeListener = new CorpGroupSnapshot.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpGroupSnapshot __objectRef;

        private ChangeListener(CorpGroupSnapshot reference) {
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
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.CorpGroupAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.CorpGroupAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
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

        private com.linkedin.metadata.aspect.CorpGroupAspectArray.ProjectionMask _aspectsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public CorpGroupSnapshot.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpGroupSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.CorpGroupAspectArray.ProjectionMask, com.linkedin.metadata.aspect.CorpGroupAspectArray.ProjectionMask> nestedMask) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?CorpGroupAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            return this;
        }

        /**
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpGroupSnapshot.ProjectionMask withAspects() {
            _aspectsMask = null;
            getDataMap().put("aspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpGroupSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.CorpGroupAspectArray.ProjectionMask, com.linkedin.metadata.aspect.CorpGroupAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?CorpGroupAspectArray.createMask():_aspectsMask));
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
         * The list of metadata aspects associated with the LdapUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpGroupSnapshot.ProjectionMask withAspects(Integer start, Integer count) {
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
