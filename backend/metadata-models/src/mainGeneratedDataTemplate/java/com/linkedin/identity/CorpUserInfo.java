
package com.linkedin.identity;

import java.util.List;
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
import com.linkedin.data.template.StringMap;


/**
 * Linkedin corp user information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/identity/CorpUserInfo.pdl.")
public class CorpUserInfo
    extends RecordTemplate
{

    private final static CorpUserInfo.Fields _fields = new CorpUserInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"],\"name\":\"corpUserInfo\"}record CorpUserInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":2.0}}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email address of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true,\"searchTier\":1}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"fieldType\":\"KEYWORD\",\"queryByDefault\":true}title:optional string/**direct manager of this user*/@Relationship={\"entityTypes\":[\"corpuser\"],\"name\":\"ReportsTo\"}@Searchable={\"fieldName\":\"managerLdap\",\"fieldType\":\"URN\",\"queryByDefault\":false}managerUrn:optional{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\",\"queryByDefault\":true}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string/**Whether the corpUser is a system user.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"queryByDefault\":false}system:optional boolean=false}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private Boolean _activeField = null;
    private String _displayNameField = null;
    private String _emailField = null;
    private String _titleField = null;
    private com.linkedin.common.urn.CorpuserUrn _managerUrnField = null;
    private Long _departmentIdField = null;
    private String _departmentNameField = null;
    private String _firstNameField = null;
    private String _lastNameField = null;
    private String _fullNameField = null;
    private String _countryCodeField = null;
    private Boolean _systemField = null;
    private CorpUserInfo.ChangeListener __changeListener = new CorpUserInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Active = SCHEMA.getField("active");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_ManagerUrn = SCHEMA.getField("managerUrn");
    private final static RecordDataSchema.Field FIELD_DepartmentId = SCHEMA.getField("departmentId");
    private final static RecordDataSchema.Field FIELD_DepartmentName = SCHEMA.getField("departmentName");
    private final static RecordDataSchema.Field FIELD_FirstName = SCHEMA.getField("firstName");
    private final static RecordDataSchema.Field FIELD_LastName = SCHEMA.getField("lastName");
    private final static RecordDataSchema.Field FIELD_FullName = SCHEMA.getField("fullName");
    private final static RecordDataSchema.Field FIELD_CountryCode = SCHEMA.getField("countryCode");
    private final static RecordDataSchema.Field FIELD_System = SCHEMA.getField("system");
    private final static Boolean DEFAULT_System;

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
        DEFAULT_System = DataTemplateUtil.coerceBooleanOutput(FIELD_System.getDefault());
    }

    public CorpUserInfo() {
        super(new DataMap(), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CorpUserInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserInfo.Fields fields() {
        return _fields;
    }

    public static CorpUserInfo.ProjectionMask createMask() {
        return new CorpUserInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see CorpUserInfo.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see CorpUserInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see CorpUserInfo.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserInfo.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see CorpUserInfo.Fields#customProperties
     */
    public CorpUserInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.identity.CorpUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#customProperties
     */
    public CorpUserInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public boolean hasActive() {
        if (_activeField!= null) {
            return true;
        }
        return super._map.containsKey("active");
    }

    /**
     * Remover for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public void removeActive() {
        super._map.remove("active");
    }

    /**
     * Getter for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    @Nullable
    public Boolean isActive(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isActive();
            case DEFAULT:
            case NULL:
                if (_activeField!= null) {
                    return _activeField;
                } else {
                    Object __rawValue = super._map.get("active");
                    _activeField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _activeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for active
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserInfo.Fields#active
     */
    @Nonnull
    public Boolean isActive() {
        if (_activeField!= null) {
            return _activeField;
        } else {
            Object __rawValue = super._map.get("active");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("active");
            }
            _activeField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _activeField;
        }
    }

    /**
     * Setter for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public CorpUserInfo setActive(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActive(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field active of com.linkedin.identity.CorpUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "active", value);
                    _activeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActive();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "active", value);
                    _activeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "active", value);
                    _activeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for active
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#active
     */
    public CorpUserInfo setActive(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field active of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "active", value);
            _activeField = value;
        }
        return this;
    }

    /**
     * Setter for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public CorpUserInfo setActive(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "active", value);
        _activeField = value;
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        return getDisplayName();
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public CorpUserInfo setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#displayName
     */
    public CorpUserInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public boolean hasEmail() {
        if (_emailField!= null) {
            return true;
        }
        return super._map.containsKey("email");
    }

    /**
     * Remover for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public void removeEmail() {
        super._map.remove("email");
    }

    /**
     * Getter for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    @Nullable
    public String getEmail(GetMode mode) {
        return getEmail();
    }

    /**
     * Getter for email
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#email
     */
    @Nullable
    public String getEmail() {
        if (_emailField!= null) {
            return _emailField;
        } else {
            Object __rawValue = super._map.get("email");
            _emailField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _emailField;
        }
    }

    /**
     * Setter for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public CorpUserInfo setEmail(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEmail(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEmail();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for email
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#email
     */
    public CorpUserInfo setEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field email of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "email", value);
            _emailField = value;
        }
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        return getTitle();
    }

    /**
     * Getter for title
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#title
     */
    @Nullable
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public CorpUserInfo setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#title
     */
    public CorpUserInfo setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public boolean hasManagerUrn() {
        if (_managerUrnField!= null) {
            return true;
        }
        return super._map.containsKey("managerUrn");
    }

    /**
     * Remover for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public void removeManagerUrn() {
        super._map.remove("managerUrn");
    }

    /**
     * Getter for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    @Nullable
    public com.linkedin.common.urn.CorpuserUrn getManagerUrn(GetMode mode) {
        return getManagerUrn();
    }

    /**
     * Getter for managerUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#managerUrn
     */
    @Nullable
    public com.linkedin.common.urn.CorpuserUrn getManagerUrn() {
        if (_managerUrnField!= null) {
            return _managerUrnField;
        } else {
            Object __rawValue = super._map.get("managerUrn");
            _managerUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.CorpuserUrn.class);
            return _managerUrnField;
        }
    }

    /**
     * Setter for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public CorpUserInfo setManagerUrn(
        @Nullable
        com.linkedin.common.urn.CorpuserUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setManagerUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeManagerUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "managerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
                    _managerUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "managerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
                    _managerUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for managerUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#managerUrn
     */
    public CorpUserInfo setManagerUrn(
        @Nonnull
        com.linkedin.common.urn.CorpuserUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field managerUrn of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "managerUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.CorpuserUrn.class));
            _managerUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public boolean hasDepartmentId() {
        if (_departmentIdField!= null) {
            return true;
        }
        return super._map.containsKey("departmentId");
    }

    /**
     * Remover for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public void removeDepartmentId() {
        super._map.remove("departmentId");
    }

    /**
     * Getter for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    @Nullable
    public Long getDepartmentId(GetMode mode) {
        return getDepartmentId();
    }

    /**
     * Getter for departmentId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#departmentId
     */
    @Nullable
    public Long getDepartmentId() {
        if (_departmentIdField!= null) {
            return _departmentIdField;
        } else {
            Object __rawValue = super._map.get("departmentId");
            _departmentIdField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _departmentIdField;
        }
    }

    /**
     * Setter for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public CorpUserInfo setDepartmentId(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDepartmentId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDepartmentId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "departmentId", DataTemplateUtil.coerceLongInput(value));
                    _departmentIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "departmentId", DataTemplateUtil.coerceLongInput(value));
                    _departmentIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for departmentId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#departmentId
     */
    public CorpUserInfo setDepartmentId(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field departmentId of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "departmentId", DataTemplateUtil.coerceLongInput(value));
            _departmentIdField = value;
        }
        return this;
    }

    /**
     * Setter for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public CorpUserInfo setDepartmentId(long value) {
        CheckedUtil.putWithoutChecking(super._map, "departmentId", DataTemplateUtil.coerceLongInput(value));
        _departmentIdField = value;
        return this;
    }

    /**
     * Existence checker for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public boolean hasDepartmentName() {
        if (_departmentNameField!= null) {
            return true;
        }
        return super._map.containsKey("departmentName");
    }

    /**
     * Remover for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public void removeDepartmentName() {
        super._map.remove("departmentName");
    }

    /**
     * Getter for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    @Nullable
    public String getDepartmentName(GetMode mode) {
        return getDepartmentName();
    }

    /**
     * Getter for departmentName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#departmentName
     */
    @Nullable
    public String getDepartmentName() {
        if (_departmentNameField!= null) {
            return _departmentNameField;
        } else {
            Object __rawValue = super._map.get("departmentName");
            _departmentNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _departmentNameField;
        }
    }

    /**
     * Setter for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public CorpUserInfo setDepartmentName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDepartmentName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDepartmentName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "departmentName", value);
                    _departmentNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "departmentName", value);
                    _departmentNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for departmentName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#departmentName
     */
    public CorpUserInfo setDepartmentName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field departmentName of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "departmentName", value);
            _departmentNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public boolean hasFirstName() {
        if (_firstNameField!= null) {
            return true;
        }
        return super._map.containsKey("firstName");
    }

    /**
     * Remover for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public void removeFirstName() {
        super._map.remove("firstName");
    }

    /**
     * Getter for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    @Nullable
    public String getFirstName(GetMode mode) {
        return getFirstName();
    }

    /**
     * Getter for firstName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#firstName
     */
    @Nullable
    public String getFirstName() {
        if (_firstNameField!= null) {
            return _firstNameField;
        } else {
            Object __rawValue = super._map.get("firstName");
            _firstNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _firstNameField;
        }
    }

    /**
     * Setter for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public CorpUserInfo setFirstName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFirstName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFirstName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "firstName", value);
                    _firstNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "firstName", value);
                    _firstNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for firstName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#firstName
     */
    public CorpUserInfo setFirstName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field firstName of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "firstName", value);
            _firstNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public boolean hasLastName() {
        if (_lastNameField!= null) {
            return true;
        }
        return super._map.containsKey("lastName");
    }

    /**
     * Remover for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public void removeLastName() {
        super._map.remove("lastName");
    }

    /**
     * Getter for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    @Nullable
    public String getLastName(GetMode mode) {
        return getLastName();
    }

    /**
     * Getter for lastName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#lastName
     */
    @Nullable
    public String getLastName() {
        if (_lastNameField!= null) {
            return _lastNameField;
        } else {
            Object __rawValue = super._map.get("lastName");
            _lastNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _lastNameField;
        }
    }

    /**
     * Setter for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public CorpUserInfo setLastName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastName", value);
                    _lastNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastName", value);
                    _lastNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#lastName
     */
    public CorpUserInfo setLastName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastName of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastName", value);
            _lastNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public boolean hasFullName() {
        if (_fullNameField!= null) {
            return true;
        }
        return super._map.containsKey("fullName");
    }

    /**
     * Remover for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public void removeFullName() {
        super._map.remove("fullName");
    }

    /**
     * Getter for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    @Nullable
    public String getFullName(GetMode mode) {
        return getFullName();
    }

    /**
     * Getter for fullName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#fullName
     */
    @Nullable
    public String getFullName() {
        if (_fullNameField!= null) {
            return _fullNameField;
        } else {
            Object __rawValue = super._map.get("fullName");
            _fullNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fullNameField;
        }
    }

    /**
     * Setter for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public CorpUserInfo setFullName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFullName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFullName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fullName", value);
                    _fullNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fullName", value);
                    _fullNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fullName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#fullName
     */
    public CorpUserInfo setFullName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fullName of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fullName", value);
            _fullNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public boolean hasCountryCode() {
        if (_countryCodeField!= null) {
            return true;
        }
        return super._map.containsKey("countryCode");
    }

    /**
     * Remover for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public void removeCountryCode() {
        super._map.remove("countryCode");
    }

    /**
     * Getter for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    @Nullable
    public String getCountryCode(GetMode mode) {
        return getCountryCode();
    }

    /**
     * Getter for countryCode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#countryCode
     */
    @Nullable
    public String getCountryCode() {
        if (_countryCodeField!= null) {
            return _countryCodeField;
        } else {
            Object __rawValue = super._map.get("countryCode");
            _countryCodeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _countryCodeField;
        }
    }

    /**
     * Setter for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public CorpUserInfo setCountryCode(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCountryCode(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCountryCode();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "countryCode", value);
                    _countryCodeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "countryCode", value);
                    _countryCodeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for countryCode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#countryCode
     */
    public CorpUserInfo setCountryCode(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field countryCode of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "countryCode", value);
            _countryCodeField = value;
        }
        return this;
    }

    /**
     * Existence checker for system
     * 
     * @see CorpUserInfo.Fields#system
     */
    public boolean hasSystem() {
        if (_systemField!= null) {
            return true;
        }
        return super._map.containsKey("system");
    }

    /**
     * Remover for system
     * 
     * @see CorpUserInfo.Fields#system
     */
    public void removeSystem() {
        super._map.remove("system");
    }

    /**
     * Getter for system
     * 
     * @see CorpUserInfo.Fields#system
     */
    @Nullable
    public Boolean isSystem(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isSystem();
            case NULL:
                if (_systemField!= null) {
                    return _systemField;
                } else {
                    Object __rawValue = super._map.get("system");
                    _systemField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _systemField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for system
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#system
     */
    @Nullable
    public Boolean isSystem() {
        if (_systemField!= null) {
            return _systemField;
        } else {
            Object __rawValue = super._map.get("system");
            if (__rawValue == null) {
                return DEFAULT_System;
            }
            _systemField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _systemField;
        }
    }

    /**
     * Setter for system
     * 
     * @see CorpUserInfo.Fields#system
     */
    public CorpUserInfo setSystem(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSystem(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSystem();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "system", value);
                    _systemField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "system", value);
                    _systemField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for system
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#system
     */
    public CorpUserInfo setSystem(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field system of com.linkedin.identity.CorpUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "system", value);
            _systemField = value;
        }
        return this;
    }

    /**
     * Setter for system
     * 
     * @see CorpUserInfo.Fields#system
     */
    public CorpUserInfo setSystem(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "system", value);
        _systemField = value;
        return this;
    }

    @Override
    public CorpUserInfo clone()
        throws CloneNotSupportedException
    {
        CorpUserInfo __clone = ((CorpUserInfo) super.clone());
        __clone.__changeListener = new CorpUserInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserInfo copy()
        throws CloneNotSupportedException
    {
        CorpUserInfo __copy = ((CorpUserInfo) super.copy());
        __copy._departmentNameField = null;
        __copy._lastNameField = null;
        __copy._displayNameField = null;
        __copy._departmentIdField = null;
        __copy._activeField = null;
        __copy._fullNameField = null;
        __copy._titleField = null;
        __copy._firstNameField = null;
        __copy._customPropertiesField = null;
        __copy._systemField = null;
        __copy._countryCodeField = null;
        __copy._managerUrnField = null;
        __copy._emailField = null;
        __copy.__changeListener = new CorpUserInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserInfo __objectRef;

        private ChangeListener(CorpUserInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "departmentName":
                    __objectRef._departmentNameField = null;
                    break;
                case "lastName":
                    __objectRef._lastNameField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "departmentId":
                    __objectRef._departmentIdField = null;
                    break;
                case "active":
                    __objectRef._activeField = null;
                    break;
                case "fullName":
                    __objectRef._fullNameField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "firstName":
                    __objectRef._firstNameField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "system":
                    __objectRef._systemField = null;
                    break;
                case "countryCode":
                    __objectRef._countryCodeField = null;
                    break;
                case "managerUrn":
                    __objectRef._managerUrnField = null;
                    break;
                case "email":
                    __objectRef._emailField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools
         * 
         */
        public PathSpec active() {
            return new PathSpec(getPathComponents(), "active");
        }

        /**
         * displayName of this user ,  e.g.  Hang Zhang(DataHQ)
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * email address of this user
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * title of this user
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * direct manager of this user
         * 
         */
        public PathSpec managerUrn() {
            return new PathSpec(getPathComponents(), "managerUrn");
        }

        /**
         * department id this user belong to
         * 
         */
        public PathSpec departmentId() {
            return new PathSpec(getPathComponents(), "departmentId");
        }

        /**
         * department name this user belong to
         * 
         */
        public PathSpec departmentName() {
            return new PathSpec(getPathComponents(), "departmentName");
        }

        /**
         * first name of this user
         * 
         */
        public PathSpec firstName() {
            return new PathSpec(getPathComponents(), "firstName");
        }

        /**
         * last name of this user
         * 
         */
        public PathSpec lastName() {
            return new PathSpec(getPathComponents(), "lastName");
        }

        /**
         * Common name of this user, format is firstName + lastName (split by a whitespace)
         * 
         */
        public PathSpec fullName() {
            return new PathSpec(getPathComponents(), "fullName");
        }

        /**
         * two uppercase letters country code. e.g.  US
         * 
         */
        public PathSpec countryCode() {
            return new PathSpec(getPathComponents(), "countryCode");
        }

        /**
         * Whether the corpUser is a system user.
         * 
         */
        public PathSpec system() {
            return new PathSpec(getPathComponents(), "system");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
        }

        /**
         * Custom property bag.
         * 
         */
        public CorpUserInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools
         * 
         */
        public CorpUserInfo.ProjectionMask withActive() {
            getDataMap().put("active", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * displayName of this user ,  e.g.  Hang Zhang(DataHQ)
         * 
         */
        public CorpUserInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * email address of this user
         * 
         */
        public CorpUserInfo.ProjectionMask withEmail() {
            getDataMap().put("email", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * title of this user
         * 
         */
        public CorpUserInfo.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * direct manager of this user
         * 
         */
        public CorpUserInfo.ProjectionMask withManagerUrn() {
            getDataMap().put("managerUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * department id this user belong to
         * 
         */
        public CorpUserInfo.ProjectionMask withDepartmentId() {
            getDataMap().put("departmentId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * department name this user belong to
         * 
         */
        public CorpUserInfo.ProjectionMask withDepartmentName() {
            getDataMap().put("departmentName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * first name of this user
         * 
         */
        public CorpUserInfo.ProjectionMask withFirstName() {
            getDataMap().put("firstName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * last name of this user
         * 
         */
        public CorpUserInfo.ProjectionMask withLastName() {
            getDataMap().put("lastName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Common name of this user, format is firstName + lastName (split by a whitespace)
         * 
         */
        public CorpUserInfo.ProjectionMask withFullName() {
            getDataMap().put("fullName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * two uppercase letters country code. e.g.  US
         * 
         */
        public CorpUserInfo.ProjectionMask withCountryCode() {
            getDataMap().put("countryCode", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the corpUser is a system user.
         * 
         */
        public CorpUserInfo.ProjectionMask withSystem() {
            getDataMap().put("system", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
