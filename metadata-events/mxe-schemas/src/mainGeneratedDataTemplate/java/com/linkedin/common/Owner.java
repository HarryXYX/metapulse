
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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


/**
 * Ownership information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Owner.pdl.")
public class Owner
    extends RecordTemplate
{

    private final static Owner.Fields _fields = new Owner.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"entityTypes\":[\"corpuser\",\"corpGroup\"],\"name\":\"OwnedBy\"}@Searchable={\"addToFilters\":true,\"fieldName\":\"owners\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Owned By\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"searchTier\":2}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/@deprecated,type:/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}/**The type of the ownership\nUrn of type O*/@Relationship={\"entityTypes\":[\"ownershipType\"],\"name\":\"ownershipType\"}typeUrn:optional Urn/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"ownerAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"ownerAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"ownerAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _ownerField = null;
    private OwnershipType _typeField = null;
    private com.linkedin.common.urn.Urn _typeUrnField = null;
    private OwnershipSource _sourceField = null;
    private MetadataAttribution _attributionField = null;
    private Owner.ChangeListener __changeListener = new Owner.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Owner = SCHEMA.getField("owner");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_TypeUrn = SCHEMA.getField("typeUrn");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_Attribution = SCHEMA.getField("attribution");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public Owner() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public Owner(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Owner.Fields fields() {
        return _fields;
    }

    public static Owner.ProjectionMask createMask() {
        return new Owner.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for owner
     * 
     * @see Owner.Fields#owner
     */
    public boolean hasOwner() {
        if (_ownerField!= null) {
            return true;
        }
        return super._map.containsKey("owner");
    }

    /**
     * Remover for owner
     * 
     * @see Owner.Fields#owner
     */
    public void removeOwner() {
        super._map.remove("owner");
    }

    /**
     * Getter for owner
     * 
     * @see Owner.Fields#owner
     */
    @Nullable
    public com.linkedin.common.urn.Urn getOwner(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOwner();
            case DEFAULT:
            case NULL:
                if (_ownerField!= null) {
                    return _ownerField;
                } else {
                    Object __rawValue = super._map.get("owner");
                    _ownerField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _ownerField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for owner
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Owner.Fields#owner
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getOwner() {
        if (_ownerField!= null) {
            return _ownerField;
        } else {
            Object __rawValue = super._map.get("owner");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("owner");
            }
            _ownerField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _ownerField;
        }
    }

    /**
     * Setter for owner
     * 
     * @see Owner.Fields#owner
     */
    public Owner setOwner(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOwner(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field owner of com.linkedin.common.Owner");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "owner", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ownerField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOwner();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "owner", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ownerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "owner", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _ownerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for owner
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#owner
     */
    public Owner setOwner(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field owner of com.linkedin.common.Owner to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "owner", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _ownerField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see Owner.Fields#type
     */
    @Deprecated
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see Owner.Fields#type
     */
    @Deprecated
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see Owner.Fields#type
     */
    @Deprecated
    @Nullable
    public OwnershipType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, OwnershipType.class, OwnershipType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Owner.Fields#type
     */
    @Deprecated
    @Nonnull
    public OwnershipType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, OwnershipType.class, OwnershipType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see Owner.Fields#type
     */
    @Deprecated
    public Owner setType(
        @Nullable
        OwnershipType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.common.Owner");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#type
     */
    @Deprecated
    public Owner setType(
        @Nonnull
        OwnershipType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.common.Owner to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for typeUrn
     * 
     * @see Owner.Fields#typeUrn
     */
    public boolean hasTypeUrn() {
        if (_typeUrnField!= null) {
            return true;
        }
        return super._map.containsKey("typeUrn");
    }

    /**
     * Remover for typeUrn
     * 
     * @see Owner.Fields#typeUrn
     */
    public void removeTypeUrn() {
        super._map.remove("typeUrn");
    }

    /**
     * Getter for typeUrn
     * 
     * @see Owner.Fields#typeUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getTypeUrn(GetMode mode) {
        return getTypeUrn();
    }

    /**
     * Getter for typeUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Owner.Fields#typeUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getTypeUrn() {
        if (_typeUrnField!= null) {
            return _typeUrnField;
        } else {
            Object __rawValue = super._map.get("typeUrn");
            _typeUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _typeUrnField;
        }
    }

    /**
     * Setter for typeUrn
     * 
     * @see Owner.Fields#typeUrn
     */
    public Owner setTypeUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTypeUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTypeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "typeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _typeUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "typeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _typeUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for typeUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#typeUrn
     */
    public Owner setTypeUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field typeUrn of com.linkedin.common.Owner to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "typeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _typeUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see Owner.Fields#source
     */
    public boolean hasSource() {
        if (_sourceField!= null) {
            return true;
        }
        return super._map.containsKey("source");
    }

    /**
     * Remover for source
     * 
     * @see Owner.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see Owner.Fields#source
     */
    @Nullable
    public OwnershipSource getSource(GetMode mode) {
        return getSource();
    }

    /**
     * Getter for source
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Owner.Fields#source
     */
    @Nullable
    public OwnershipSource getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            _sourceField = ((__rawValue == null)?null:new OwnershipSource(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see Owner.Fields#source
     */
    public Owner setSource(
        @Nullable
        OwnershipSource value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#source
     */
    public Owner setSource(
        @Nonnull
        OwnershipSource value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.common.Owner to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", value.data());
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for attribution
     * 
     * @see Owner.Fields#attribution
     */
    public boolean hasAttribution() {
        if (_attributionField!= null) {
            return true;
        }
        return super._map.containsKey("attribution");
    }

    /**
     * Remover for attribution
     * 
     * @see Owner.Fields#attribution
     */
    public void removeAttribution() {
        super._map.remove("attribution");
    }

    /**
     * Getter for attribution
     * 
     * @see Owner.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution(GetMode mode) {
        return getAttribution();
    }

    /**
     * Getter for attribution
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Owner.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution() {
        if (_attributionField!= null) {
            return _attributionField;
        } else {
            Object __rawValue = super._map.get("attribution");
            _attributionField = ((__rawValue == null)?null:new MetadataAttribution(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _attributionField;
        }
    }

    /**
     * Setter for attribution
     * 
     * @see Owner.Fields#attribution
     */
    public Owner setAttribution(
        @Nullable
        MetadataAttribution value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAttribution(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAttribution();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for attribution
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#attribution
     */
    public Owner setAttribution(
        @Nonnull
        MetadataAttribution value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field attribution of com.linkedin.common.Owner to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
            _attributionField = value;
        }
        return this;
    }

    @Override
    public Owner clone()
        throws CloneNotSupportedException
    {
        Owner __clone = ((Owner) super.clone());
        __clone.__changeListener = new Owner.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Owner copy()
        throws CloneNotSupportedException
    {
        Owner __copy = ((Owner) super.copy());
        __copy._ownerField = null;
        __copy._typeUrnField = null;
        __copy._attributionField = null;
        __copy._sourceField = null;
        __copy._typeField = null;
        __copy.__changeListener = new Owner.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Owner __objectRef;

        private ChangeListener(Owner reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "owner":
                    __objectRef._ownerField = null;
                    break;
                case "typeUrn":
                    __objectRef._typeUrnField = null;
                    break;
                case "attribution":
                    __objectRef._attributionField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name
         * (Caveat: only corpuser is currently supported in the frontend.)
         * 
         */
        public PathSpec owner() {
            return new PathSpec(getPathComponents(), "owner");
        }

        /**
         * The type of the ownership
         * 
         */
        @Deprecated
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The type of the ownership
         * Urn of type O
         * 
         */
        public PathSpec typeUrn() {
            return new PathSpec(getPathComponents(), "typeUrn");
        }

        /**
         * Source information for the ownership
         * 
         */
        public com.linkedin.common.OwnershipSource.Fields source() {
            return new com.linkedin.common.OwnershipSource.Fields(getPathComponents(), "source");
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public com.linkedin.common.MetadataAttribution.Fields attribution() {
            return new com.linkedin.common.MetadataAttribution.Fields(getPathComponents(), "attribution");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.OwnershipSource.ProjectionMask _sourceMask;
        private com.linkedin.common.MetadataAttribution.ProjectionMask _attributionMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name
         * (Caveat: only corpuser is currently supported in the frontend.)
         * 
         */
        public Owner.ProjectionMask withOwner() {
            getDataMap().put("owner", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the ownership
         * 
         */
        @Deprecated
        public Owner.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the ownership
         * Urn of type O
         * 
         */
        public Owner.ProjectionMask withTypeUrn() {
            getDataMap().put("typeUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source information for the ownership
         * 
         */
        public Owner.ProjectionMask withSource(Function<com.linkedin.common.OwnershipSource.ProjectionMask, com.linkedin.common.OwnershipSource.ProjectionMask> nestedMask) {
            _sourceMask = nestedMask.apply(((_sourceMask == null)?OwnershipSource.createMask():_sourceMask));
            getDataMap().put("source", _sourceMask.getDataMap());
            return this;
        }

        /**
         * Source information for the ownership
         * 
         */
        public Owner.ProjectionMask withSource() {
            _sourceMask = null;
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public Owner.ProjectionMask withAttribution(Function<com.linkedin.common.MetadataAttribution.ProjectionMask, com.linkedin.common.MetadataAttribution.ProjectionMask> nestedMask) {
            _attributionMask = nestedMask.apply(((_attributionMask == null)?MetadataAttribution.createMask():_attributionMask));
            getDataMap().put("attribution", _attributionMask.getDataMap());
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public Owner.ProjectionMask withAttribution() {
            _attributionMask = null;
            getDataMap().put("attribution", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
