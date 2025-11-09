
package com.linkedin.common;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Ownership information of an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Ownership.pdl.")
public class Ownership
    extends RecordTemplate
{

    private final static Ownership.Fields _fields = new Ownership.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]/**Ownership type to Owners map, populated via mutation hook.*/@Searchable.`/$key`={\"fieldType\":\"MAP_ARRAY\",\"queryByDefault\":false}ownerTypes:optional map[string,array[Urn]]={}/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}={\"time\":0,\"actor\":\"urn:li:corpuser:unknown\"}}", SchemaFormatType.PDL));
    private OwnerArray _ownersField = null;
    private UrnArrayMap _ownerTypesField = null;
    private AuditStamp _lastModifiedField = null;
    private Ownership.ChangeListener __changeListener = new Ownership.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_OwnerTypes = SCHEMA.getField("ownerTypes");
    private final static UrnArrayMap DEFAULT_OwnerTypes;
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static AuditStamp DEFAULT_LastModified;

    static {
        DEFAULT_OwnerTypes = ((FIELD_OwnerTypes.getDefault() == null)?null:new UrnArrayMap(DataTemplateUtil.castOrThrow(FIELD_OwnerTypes.getDefault(), DataMap.class)));
        DEFAULT_LastModified = ((FIELD_LastModified.getDefault() == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(FIELD_LastModified.getDefault(), DataMap.class)));
    }

    public Ownership() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public Ownership(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Ownership.Fields fields() {
        return _fields;
    }

    public static Ownership.ProjectionMask createMask() {
        return new Ownership.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for owners
     * 
     * @see Ownership.Fields#owners
     */
    public boolean hasOwners() {
        if (_ownersField!= null) {
            return true;
        }
        return super._map.containsKey("owners");
    }

    /**
     * Remover for owners
     * 
     * @see Ownership.Fields#owners
     */
    public void removeOwners() {
        super._map.remove("owners");
    }

    /**
     * Getter for owners
     * 
     * @see Ownership.Fields#owners
     */
    @Nullable
    public OwnerArray getOwners(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOwners();
            case DEFAULT:
            case NULL:
                if (_ownersField!= null) {
                    return _ownersField;
                } else {
                    Object __rawValue = super._map.get("owners");
                    _ownersField = ((__rawValue == null)?null:new OwnerArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _ownersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Ownership.Fields#owners
     */
    @Nonnull
    public OwnerArray getOwners() {
        if (_ownersField!= null) {
            return _ownersField;
        } else {
            Object __rawValue = super._map.get("owners");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("owners");
            }
            _ownersField = ((__rawValue == null)?null:new OwnerArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _ownersField;
        }
    }

    /**
     * Setter for owners
     * 
     * @see Ownership.Fields#owners
     */
    public Ownership setOwners(
        @Nullable
        OwnerArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOwners(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field owners of com.linkedin.common.Ownership");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "owners", value.data());
                    _ownersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOwners();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "owners", value.data());
                    _ownersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "owners", value.data());
                    _ownersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Ownership.Fields#owners
     */
    public Ownership setOwners(
        @Nonnull
        OwnerArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field owners of com.linkedin.common.Ownership to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "owners", value.data());
            _ownersField = value;
        }
        return this;
    }

    /**
     * Existence checker for ownerTypes
     * 
     * @see Ownership.Fields#ownerTypes
     */
    public boolean hasOwnerTypes() {
        if (_ownerTypesField!= null) {
            return true;
        }
        return super._map.containsKey("ownerTypes");
    }

    /**
     * Remover for ownerTypes
     * 
     * @see Ownership.Fields#ownerTypes
     */
    public void removeOwnerTypes() {
        super._map.remove("ownerTypes");
    }

    /**
     * Getter for ownerTypes
     * 
     * @see Ownership.Fields#ownerTypes
     */
    @Nullable
    public UrnArrayMap getOwnerTypes(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getOwnerTypes();
            case NULL:
                if (_ownerTypesField!= null) {
                    return _ownerTypesField;
                } else {
                    Object __rawValue = super._map.get("ownerTypes");
                    _ownerTypesField = ((__rawValue == null)?null:new UrnArrayMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _ownerTypesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for ownerTypes
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Ownership.Fields#ownerTypes
     */
    @Nullable
    public UrnArrayMap getOwnerTypes() {
        if (_ownerTypesField!= null) {
            return _ownerTypesField;
        } else {
            Object __rawValue = super._map.get("ownerTypes");
            if (__rawValue == null) {
                return DEFAULT_OwnerTypes;
            }
            _ownerTypesField = ((__rawValue == null)?null:new UrnArrayMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _ownerTypesField;
        }
    }

    /**
     * Setter for ownerTypes
     * 
     * @see Ownership.Fields#ownerTypes
     */
    public Ownership setOwnerTypes(
        @Nullable
        UrnArrayMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOwnerTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOwnerTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ownerTypes", value.data());
                    _ownerTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ownerTypes", value.data());
                    _ownerTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ownerTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Ownership.Fields#ownerTypes
     */
    public Ownership setOwnerTypes(
        @Nonnull
        UrnArrayMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ownerTypes of com.linkedin.common.Ownership to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ownerTypes", value.data());
            _ownerTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see Ownership.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see Ownership.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see Ownership.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getLastModified();
            case NULL:
                if (_lastModifiedField!= null) {
                    return _lastModifiedField;
                } else {
                    Object __rawValue = super._map.get("lastModified");
                    _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lastModifiedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Ownership.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                return DEFAULT_LastModified;
            }
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see Ownership.Fields#lastModified
     */
    public Ownership setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.common.Ownership");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Ownership.Fields#lastModified
     */
    public Ownership setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.common.Ownership to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public Ownership clone()
        throws CloneNotSupportedException
    {
        Ownership __clone = ((Ownership) super.clone());
        __clone.__changeListener = new Ownership.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Ownership copy()
        throws CloneNotSupportedException
    {
        Ownership __copy = ((Ownership) super.copy());
        __copy._ownerTypesField = null;
        __copy._ownersField = null;
        __copy._lastModifiedField = null;
        __copy.__changeListener = new Ownership.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Ownership __objectRef;

        private ChangeListener(Ownership reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "ownerTypes":
                    __objectRef._ownerTypesField = null;
                    break;
                case "owners":
                    __objectRef._ownersField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
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
         * List of owners of the entity.
         * 
         */
        public com.linkedin.common.OwnerArray.Fields owners() {
            return new com.linkedin.common.OwnerArray.Fields(getPathComponents(), "owners");
        }

        /**
         * List of owners of the entity.
         * 
         */
        public PathSpec owners(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "owners");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Ownership type to Owners map, populated via mutation hook.
         * 
         */
        public PathSpec ownerTypes() {
            return new PathSpec(getPathComponents(), "ownerTypes");
        }

        /**
         * Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.OwnerArray.ProjectionMask _ownersMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * List of owners of the entity.
         * 
         */
        public Ownership.ProjectionMask withOwners(Function<com.linkedin.common.OwnerArray.ProjectionMask, com.linkedin.common.OwnerArray.ProjectionMask> nestedMask) {
            _ownersMask = nestedMask.apply(((_ownersMask == null)?OwnerArray.createMask():_ownersMask));
            getDataMap().put("owners", _ownersMask.getDataMap());
            return this;
        }

        /**
         * List of owners of the entity.
         * 
         */
        public Ownership.ProjectionMask withOwners() {
            _ownersMask = null;
            getDataMap().put("owners", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of owners of the entity.
         * 
         */
        public Ownership.ProjectionMask withOwners(Function<com.linkedin.common.OwnerArray.ProjectionMask, com.linkedin.common.OwnerArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _ownersMask = nestedMask.apply(((_ownersMask == null)?OwnerArray.createMask():_ownersMask));
            getDataMap().put("owners", _ownersMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("owners").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("owners").put("$count", count);
            }
            return this;
        }

        /**
         * List of owners of the entity.
         * 
         */
        public Ownership.ProjectionMask withOwners(Integer start, Integer count) {
            _ownersMask = null;
            getDataMap().put("owners", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("owners").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("owners").put("$count", count);
            }
            return this;
        }

        /**
         * Ownership type to Owners map, populated via mutation hook.
         * 
         */
        public Ownership.ProjectionMask withOwnerTypes() {
            getDataMap().put("ownerTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.
         * 
         */
        public Ownership.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.
         * 
         */
        public Ownership.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.
         * 
         */
        public Ownership.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
