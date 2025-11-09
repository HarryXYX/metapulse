
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
 * Ownership information of an entity, suggested by source system or other services.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/OwnershipSuggestion.pdl.")
public class OwnershipSuggestion
    extends RecordTemplate
{

    private final static OwnershipSuggestion.Fields _fields = new OwnershipSuggestion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Ownership information of an entity, suggested by source system or other services.*/record OwnershipSuggestion{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}", SchemaFormatType.PDL));
    private OwnerArray _ownersField = null;
    private OwnershipSuggestion.ChangeListener __changeListener = new OwnershipSuggestion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");

    public OwnershipSuggestion() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public OwnershipSuggestion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OwnershipSuggestion.Fields fields() {
        return _fields;
    }

    public static OwnershipSuggestion.ProjectionMask createMask() {
        return new OwnershipSuggestion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for owners
     * 
     * @see OwnershipSuggestion.Fields#owners
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
     * @see OwnershipSuggestion.Fields#owners
     */
    public void removeOwners() {
        super._map.remove("owners");
    }

    /**
     * Getter for owners
     * 
     * @see OwnershipSuggestion.Fields#owners
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
     * @see OwnershipSuggestion.Fields#owners
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
     * @see OwnershipSuggestion.Fields#owners
     */
    public OwnershipSuggestion setOwners(
        @Nullable
        OwnerArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOwners(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field owners of com.linkedin.common.OwnershipSuggestion");
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
     * @see OwnershipSuggestion.Fields#owners
     */
    public OwnershipSuggestion setOwners(
        @Nonnull
        OwnerArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field owners of com.linkedin.common.OwnershipSuggestion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "owners", value.data());
            _ownersField = value;
        }
        return this;
    }

    @Override
    public OwnershipSuggestion clone()
        throws CloneNotSupportedException
    {
        OwnershipSuggestion __clone = ((OwnershipSuggestion) super.clone());
        __clone.__changeListener = new OwnershipSuggestion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OwnershipSuggestion copy()
        throws CloneNotSupportedException
    {
        OwnershipSuggestion __copy = ((OwnershipSuggestion) super.copy());
        __copy._ownersField = null;
        __copy.__changeListener = new OwnershipSuggestion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OwnershipSuggestion __objectRef;

        private ChangeListener(OwnershipSuggestion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "owners":
                    __objectRef._ownersField = null;
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

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.OwnerArray.ProjectionMask _ownersMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * List of owners of the entity.
         * 
         */
        public OwnershipSuggestion.ProjectionMask withOwners(Function<com.linkedin.common.OwnerArray.ProjectionMask, com.linkedin.common.OwnerArray.ProjectionMask> nestedMask) {
            _ownersMask = nestedMask.apply(((_ownersMask == null)?OwnerArray.createMask():_ownersMask));
            getDataMap().put("owners", _ownersMask.getDataMap());
            return this;
        }

        /**
         * List of owners of the entity.
         * 
         */
        public OwnershipSuggestion.ProjectionMask withOwners() {
            _ownersMask = null;
            getDataMap().put("owners", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of owners of the entity.
         * 
         */
        public OwnershipSuggestion.ProjectionMask withOwners(Function<com.linkedin.common.OwnerArray.ProjectionMask, com.linkedin.common.OwnerArray.ProjectionMask> nestedMask, Integer start, Integer count) {
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
        public OwnershipSuggestion.ProjectionMask withOwners(Integer start, Integer count) {
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

    }

}
