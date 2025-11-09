
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
import com.linkedin.metadata.aspect.CorpUserAspectArray;


/**
 * A metadata snapshot for a specific CorpUser entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/CorpUserSnapshot.pdl.")
public class CorpUserSnapshot
    extends RecordTemplate
{

    private final static CorpUserSnapshot.Fields _fields = new CorpUserSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific CorpUser entity.*/@Entity={\"keyAspect\":\"corpUserKey\",\"name\":\"corpuser\"}record CorpUserSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}/**The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpUser*/typeref CorpUserAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"boostScore\":2.0,\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"fieldType\":\"WORD_GRAM\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserInfo\"}record CorpUserInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":2.0}}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email address of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true,\"searchTier\":1}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true}title:optional string/**direct manager of this user*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"ReportsTo\"}@Searchable={\"fieldName\":\"managerLdap\",\"fieldType\":\"URN\",\"queryByDefault\":false}managerUrn:optional com.linkedin.common.CorpuserUrn/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string/**Whether the corpUser is a system user.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"queryByDefault\":false}system:optional boolean=false}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserEditableInfo\"}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}=\"assets/platforms/default_avatar.png\"/**DataHub-native display name*/@Searchable={\"boostScore\":10.0,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}displayName:optional string/**DataHub-native Title, e.g. 'Software Engineer'*/title:optional string/**The platforms that the user commonly works with*/@Relationship.`/*`={\"entityTypes\":[\"dataPlatform\"],\"name\":\"IsUserOf\"}platforms:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**The user's persona type, based on their role*/@Relationship={\"entityTypes\":[\"dataHubPersona\"],\"name\":\"IsPersona\"}persona:optional com.linkedin.common.Urn/**Slack handle for the user*/slack:optional string/**Phone number to contact the user*/phone:optional string/**Email address to contact the user*/email:optional string/**Information sources that have been used to populate this CorpUserEditableInfo.\nThese include platform resources, such as Slack members or Looker users.\nThey can also refer to other semantic urns in the future.*/informationSources:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/@Searchable.`/time`={\"fieldName\":\"statusLastModifiedAt\",\"fieldType\":\"COUNT\"}lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsMemberOfGroup\"}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}}{namespace com.linkedin.common/**The lifecycle status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**Whether the entity has been removed (soft-deleted).*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]}]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.CorpuserUrn _urnField = null;
    private CorpUserAspectArray _aspectsField = null;
    private CorpUserSnapshot.ChangeListener __changeListener = new CorpUserSnapshot.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
    }

    public CorpUserSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CorpUserSnapshot(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserSnapshot.Fields fields() {
        return _fields;
    }

    public static CorpUserSnapshot.ProjectionMask createMask() {
        return new CorpUserSnapshot.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see CorpUserSnapshot.Fields#urn
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
     * @see CorpUserSnapshot.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see CorpUserSnapshot.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.CorpuserUrn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.CorpuserUrn.class);
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
     * @see CorpUserSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.CorpuserUrn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.CorpuserUrn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see CorpUserSnapshot.Fields#urn
     */
    public CorpUserSnapshot setUrn(
        @Nullable
        com.linkedin.common.urn.CorpuserUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.snapshot.CorpUserSnapshot");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
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
     * @see CorpUserSnapshot.Fields#urn
     */
    public CorpUserSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.CorpuserUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.snapshot.CorpUserSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see CorpUserSnapshot.Fields#aspects
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
     * @see CorpUserSnapshot.Fields#aspects
     */
    public void removeAspects() {
        super._map.remove("aspects");
    }

    /**
     * Getter for aspects
     * 
     * @see CorpUserSnapshot.Fields#aspects
     */
    @Nullable
    public CorpUserAspectArray getAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspects();
            case DEFAULT:
            case NULL:
                if (_aspectsField!= null) {
                    return _aspectsField;
                } else {
                    Object __rawValue = super._map.get("aspects");
                    _aspectsField = ((__rawValue == null)?null:new CorpUserAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
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
     * @see CorpUserSnapshot.Fields#aspects
     */
    @Nonnull
    public CorpUserAspectArray getAspects() {
        if (_aspectsField!= null) {
            return _aspectsField;
        } else {
            Object __rawValue = super._map.get("aspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspects");
            }
            _aspectsField = ((__rawValue == null)?null:new CorpUserAspectArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectsField;
        }
    }

    /**
     * Setter for aspects
     * 
     * @see CorpUserSnapshot.Fields#aspects
     */
    public CorpUserSnapshot setAspects(
        @Nullable
        CorpUserAspectArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspects of com.linkedin.metadata.snapshot.CorpUserSnapshot");
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
     * @see CorpUserSnapshot.Fields#aspects
     */
    public CorpUserSnapshot setAspects(
        @Nonnull
        CorpUserAspectArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspects of com.linkedin.metadata.snapshot.CorpUserSnapshot to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
            _aspectsField = value;
        }
        return this;
    }

    @Override
    public CorpUserSnapshot clone()
        throws CloneNotSupportedException
    {
        CorpUserSnapshot __clone = ((CorpUserSnapshot) super.clone());
        __clone.__changeListener = new CorpUserSnapshot.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserSnapshot copy()
        throws CloneNotSupportedException
    {
        CorpUserSnapshot __copy = ((CorpUserSnapshot) super.copy());
        __copy._urnField = null;
        __copy._aspectsField = null;
        __copy.__changeListener = new CorpUserSnapshot.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserSnapshot __objectRef;

        private ChangeListener(CorpUserSnapshot reference) {
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
         * The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.CorpUserAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.CorpUserAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
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

        private com.linkedin.metadata.aspect.CorpUserAspectArray.ProjectionMask _aspectsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public CorpUserSnapshot.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpUserSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.CorpUserAspectArray.ProjectionMask, com.linkedin.metadata.aspect.CorpUserAspectArray.ProjectionMask> nestedMask) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?CorpUserAspectArray.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            return this;
        }

        /**
         * The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpUserSnapshot.ProjectionMask withAspects() {
            _aspectsMask = null;
            getDataMap().put("aspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpUserSnapshot.ProjectionMask withAspects(Function<com.linkedin.metadata.aspect.CorpUserAspectArray.ProjectionMask, com.linkedin.metadata.aspect.CorpUserAspectArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?CorpUserAspectArray.createMask():_aspectsMask));
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
         * The list of metadata aspects associated with the CorpUser. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public CorpUserSnapshot.ProjectionMask withAspects(Integer start, Integer count) {
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
