
package com.linkedin.identity;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.common.CorpGroupUrnArray;
import com.linkedin.common.CorpuserUrnArray;
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
 * Information about a Corp Group ingested from a third party source
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpGroupInfo.pdl.")
public class CorpGroupInfo
    extends RecordTemplate
{

    private final static CorpGroupInfo.Fields _fields = new CorpGroupInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Information about a Corp Group ingested from a third party source*/@Aspect={\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"],\"name\":\"corpGroupInfo\"}record CorpGroupInfo{/**The name of the group.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"TEXT_PARTIAL\",\"queryByDefault\":true,\"searchLabel\":\"entityName\",\"searchTier\":1}displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group\nDeprecated! Replaced by Ownership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"OwnedBy\"}@deprecated,admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]/**List of ldap urn in this group.\nDeprecated! Replaced by GroupMembership aspect.*/@Relationship.`/*`={\"entityTypes\":[\"corpuser\"],\"name\":\"IsPartOf\"}@deprecated,members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.\nDeprecated! This field is unused.*/@Relationship.`/*`={\"entityTypes\":[\"corpGroup\"],\"name\":\"IsPartOf\"}@deprecated,groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable={\"fieldType\":\"TEXT_PARTIAL\",\"searchTier\":2}description:optional string/**Slack channel for the group*/slack:optional string/**Created Audit stamp*/@Searchable.`/time`={\"fieldName\":\"createdTime\",\"fieldType\":\"DATETIME\",\"searchLabel\":\"createdAt\"}created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private String _displayNameField = null;
    private String _emailField = null;
    private CorpuserUrnArray _adminsField = null;
    private CorpuserUrnArray _membersField = null;
    private CorpGroupUrnArray _groupsField = null;
    private String _descriptionField = null;
    private String _slackField = null;
    private AuditStamp _createdField = null;
    private CorpGroupInfo.ChangeListener __changeListener = new CorpGroupInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_Admins = SCHEMA.getField("admins");
    private final static RecordDataSchema.Field FIELD_Members = SCHEMA.getField("members");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Slack = SCHEMA.getField("slack");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");

    public CorpGroupInfo() {
        super(new DataMap(11, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public CorpGroupInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpGroupInfo.Fields fields() {
        return _fields;
    }

    public static CorpGroupInfo.ProjectionMask createMask() {
        return new CorpGroupInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for displayName
     * 
     * @see CorpGroupInfo.Fields#displayName
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
     * @see CorpGroupInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see CorpGroupInfo.Fields#displayName
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
     * @see CorpGroupInfo.Fields#displayName
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
     * @see CorpGroupInfo.Fields#displayName
     */
    public CorpGroupInfo setDisplayName(
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
     * @see CorpGroupInfo.Fields#displayName
     */
    public CorpGroupInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpGroupInfo.Fields#email
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
     * @see CorpGroupInfo.Fields#email
     */
    public void removeEmail() {
        super._map.remove("email");
    }

    /**
     * Getter for email
     * 
     * @see CorpGroupInfo.Fields#email
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
     * @see CorpGroupInfo.Fields#email
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
     * @see CorpGroupInfo.Fields#email
     */
    public CorpGroupInfo setEmail(
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
     * @see CorpGroupInfo.Fields#email
     */
    public CorpGroupInfo setEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field email of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "email", value);
            _emailField = value;
        }
        return this;
    }

    /**
     * Existence checker for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    @Deprecated
    public boolean hasAdmins() {
        if (_adminsField!= null) {
            return true;
        }
        return super._map.containsKey("admins");
    }

    /**
     * Remover for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    @Deprecated
    public void removeAdmins() {
        super._map.remove("admins");
    }

    /**
     * Getter for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    @Deprecated
    @Nullable
    public CorpuserUrnArray getAdmins(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAdmins();
            case DEFAULT:
            case NULL:
                if (_adminsField!= null) {
                    return _adminsField;
                } else {
                    Object __rawValue = super._map.get("admins");
                    _adminsField = ((__rawValue == null)?null:new CorpuserUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _adminsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for admins
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupInfo.Fields#admins
     */
    @Deprecated
    @Nonnull
    public CorpuserUrnArray getAdmins() {
        if (_adminsField!= null) {
            return _adminsField;
        } else {
            Object __rawValue = super._map.get("admins");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("admins");
            }
            _adminsField = ((__rawValue == null)?null:new CorpuserUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _adminsField;
        }
    }

    /**
     * Setter for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    @Deprecated
    public CorpGroupInfo setAdmins(
        @Nullable
        CorpuserUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAdmins(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field admins of com.linkedin.identity.CorpGroupInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "admins", value.data());
                    _adminsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAdmins();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "admins", value.data());
                    _adminsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "admins", value.data());
                    _adminsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for admins
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#admins
     */
    @Deprecated
    public CorpGroupInfo setAdmins(
        @Nonnull
        CorpuserUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field admins of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "admins", value.data());
            _adminsField = value;
        }
        return this;
    }

    /**
     * Existence checker for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    @Deprecated
    public boolean hasMembers() {
        if (_membersField!= null) {
            return true;
        }
        return super._map.containsKey("members");
    }

    /**
     * Remover for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    @Deprecated
    public void removeMembers() {
        super._map.remove("members");
    }

    /**
     * Getter for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    @Deprecated
    @Nullable
    public CorpuserUrnArray getMembers(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMembers();
            case DEFAULT:
            case NULL:
                if (_membersField!= null) {
                    return _membersField;
                } else {
                    Object __rawValue = super._map.get("members");
                    _membersField = ((__rawValue == null)?null:new CorpuserUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _membersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for members
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupInfo.Fields#members
     */
    @Deprecated
    @Nonnull
    public CorpuserUrnArray getMembers() {
        if (_membersField!= null) {
            return _membersField;
        } else {
            Object __rawValue = super._map.get("members");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("members");
            }
            _membersField = ((__rawValue == null)?null:new CorpuserUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _membersField;
        }
    }

    /**
     * Setter for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    @Deprecated
    public CorpGroupInfo setMembers(
        @Nullable
        CorpuserUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMembers(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field members of com.linkedin.identity.CorpGroupInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "members", value.data());
                    _membersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMembers();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "members", value.data());
                    _membersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "members", value.data());
                    _membersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for members
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#members
     */
    @Deprecated
    public CorpGroupInfo setMembers(
        @Nonnull
        CorpuserUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field members of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "members", value.data());
            _membersField = value;
        }
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    @Deprecated
    public boolean hasGroups() {
        if (_groupsField!= null) {
            return true;
        }
        return super._map.containsKey("groups");
    }

    /**
     * Remover for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    @Deprecated
    public void removeGroups() {
        super._map.remove("groups");
    }

    /**
     * Getter for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    @Deprecated
    @Nullable
    public CorpGroupUrnArray getGroups(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getGroups();
            case DEFAULT:
            case NULL:
                if (_groupsField!= null) {
                    return _groupsField;
                } else {
                    Object __rawValue = super._map.get("groups");
                    _groupsField = ((__rawValue == null)?null:new CorpGroupUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _groupsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupInfo.Fields#groups
     */
    @Deprecated
    @Nonnull
    public CorpGroupUrnArray getGroups() {
        if (_groupsField!= null) {
            return _groupsField;
        } else {
            Object __rawValue = super._map.get("groups");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("groups");
            }
            _groupsField = ((__rawValue == null)?null:new CorpGroupUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _groupsField;
        }
    }

    /**
     * Setter for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    @Deprecated
    public CorpGroupInfo setGroups(
        @Nullable
        CorpGroupUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroups(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field groups of com.linkedin.identity.CorpGroupInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroups();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
                    _groupsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#groups
     */
    @Deprecated
    public CorpGroupInfo setGroups(
        @Nonnull
        CorpGroupUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groups of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groups", value.data());
            _groupsField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public CorpGroupInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#description
     */
    public CorpGroupInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for slack
     * 
     * @see CorpGroupInfo.Fields#slack
     */
    public boolean hasSlack() {
        if (_slackField!= null) {
            return true;
        }
        return super._map.containsKey("slack");
    }

    /**
     * Remover for slack
     * 
     * @see CorpGroupInfo.Fields#slack
     */
    public void removeSlack() {
        super._map.remove("slack");
    }

    /**
     * Getter for slack
     * 
     * @see CorpGroupInfo.Fields#slack
     */
    @Nullable
    public String getSlack(GetMode mode) {
        return getSlack();
    }

    /**
     * Getter for slack
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupInfo.Fields#slack
     */
    @Nullable
    public String getSlack() {
        if (_slackField!= null) {
            return _slackField;
        } else {
            Object __rawValue = super._map.get("slack");
            _slackField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _slackField;
        }
    }

    /**
     * Setter for slack
     * 
     * @see CorpGroupInfo.Fields#slack
     */
    public CorpGroupInfo setSlack(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSlack(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSlack();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "slack", value);
                    _slackField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "slack", value);
                    _slackField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for slack
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#slack
     */
    public CorpGroupInfo setSlack(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field slack of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "slack", value);
            _slackField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see CorpGroupInfo.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see CorpGroupInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see CorpGroupInfo.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        return getCreated();
    }

    /**
     * Getter for created
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupInfo.Fields#created
     */
    @Nullable
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see CorpGroupInfo.Fields#created
     */
    public CorpGroupInfo setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#created
     */
    public CorpGroupInfo setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.identity.CorpGroupInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    @Override
    public CorpGroupInfo clone()
        throws CloneNotSupportedException
    {
        CorpGroupInfo __clone = ((CorpGroupInfo) super.clone());
        __clone.__changeListener = new CorpGroupInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpGroupInfo copy()
        throws CloneNotSupportedException
    {
        CorpGroupInfo __copy = ((CorpGroupInfo) super.copy());
        __copy._displayNameField = null;
        __copy._createdField = null;
        __copy._membersField = null;
        __copy._slackField = null;
        __copy._groupsField = null;
        __copy._descriptionField = null;
        __copy._emailField = null;
        __copy._adminsField = null;
        __copy.__changeListener = new CorpGroupInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpGroupInfo __objectRef;

        private ChangeListener(CorpGroupInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "members":
                    __objectRef._membersField = null;
                    break;
                case "slack":
                    __objectRef._slackField = null;
                    break;
                case "groups":
                    __objectRef._groupsField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "email":
                    __objectRef._emailField = null;
                    break;
                case "admins":
                    __objectRef._adminsField = null;
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
         * The name of the group.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * email of this group
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * owners of this group
         * Deprecated! Replaced by Ownership aspect.
         * 
         */
        @Deprecated
        public PathSpec admins() {
            return new PathSpec(getPathComponents(), "admins");
        }

        /**
         * owners of this group
         * Deprecated! Replaced by Ownership aspect.
         * 
         */
        @Deprecated
        public PathSpec admins(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "admins");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of ldap urn in this group.
         * Deprecated! Replaced by GroupMembership aspect.
         * 
         */
        @Deprecated
        public PathSpec members() {
            return new PathSpec(getPathComponents(), "members");
        }

        /**
         * List of ldap urn in this group.
         * Deprecated! Replaced by GroupMembership aspect.
         * 
         */
        @Deprecated
        public PathSpec members(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "members");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of groups in this group.
         * Deprecated! This field is unused.
         * 
         */
        @Deprecated
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * List of groups in this group.
         * Deprecated! This field is unused.
         * 
         */
        @Deprecated
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A description of the group.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Slack channel for the group
         * 
         */
        public PathSpec slack() {
            return new PathSpec(getPathComponents(), "slack");
        }

        /**
         * Created Audit stamp
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * The name of the group.
         * 
         */
        public CorpGroupInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * email of this group
         * 
         */
        public CorpGroupInfo.ProjectionMask withEmail() {
            getDataMap().put("email", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * owners of this group
         * Deprecated! Replaced by Ownership aspect.
         * 
         */
        @Deprecated
        public CorpGroupInfo.ProjectionMask withAdmins() {
            getDataMap().put("admins", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * owners of this group
         * Deprecated! Replaced by Ownership aspect.
         * 
         */
        @Deprecated
        public CorpGroupInfo.ProjectionMask withAdmins(Integer start, Integer count) {
            getDataMap().put("admins", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("admins").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("admins").put("$count", count);
            }
            return this;
        }

        /**
         * List of ldap urn in this group.
         * Deprecated! Replaced by GroupMembership aspect.
         * 
         */
        @Deprecated
        public CorpGroupInfo.ProjectionMask withMembers() {
            getDataMap().put("members", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of ldap urn in this group.
         * Deprecated! Replaced by GroupMembership aspect.
         * 
         */
        @Deprecated
        public CorpGroupInfo.ProjectionMask withMembers(Integer start, Integer count) {
            getDataMap().put("members", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("members").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("members").put("$count", count);
            }
            return this;
        }

        /**
         * List of groups in this group.
         * Deprecated! This field is unused.
         * 
         */
        @Deprecated
        public CorpGroupInfo.ProjectionMask withGroups() {
            getDataMap().put("groups", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of groups in this group.
         * Deprecated! This field is unused.
         * 
         */
        @Deprecated
        public CorpGroupInfo.ProjectionMask withGroups(Integer start, Integer count) {
            getDataMap().put("groups", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("groups").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("groups").put("$count", count);
            }
            return this;
        }

        /**
         * A description of the group.
         * 
         */
        public CorpGroupInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Slack channel for the group
         * 
         */
        public CorpGroupInfo.ProjectionMask withSlack() {
            getDataMap().put("slack", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public CorpGroupInfo.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public CorpGroupInfo.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * Created Audit stamp
         * 
         */
        public CorpGroupInfo.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
