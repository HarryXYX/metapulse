
package com.linkedin.dataplatform.slack;

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


/**
 * Information about a Slack user.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataplatform/slack/SlackUserInfo.pdl.")
public class SlackUserInfo
    extends RecordTemplate
{

    private final static SlackUserInfo.Fields _fields = new SlackUserInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatform.slack/**Information about a Slack user.*/@Aspect.name=\"slackUserInfo\"record SlackUserInfo{/**The dataplatform instance that this Slack member belongs to.*/@Relationship={\"entityTypes\":[\"dataPlatformInstance\"],\"name\":\"PartOfSlackWorkspace\"}slackInstance:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The unique identifier for the Slack member.*/id:string/**The username of the Slack member.*/name:string/**The real name of the Slack member.*/realName:string/**The display name of the Slack member.*/displayName:string/**The email associated with the Slack member.*/email:optional string/**The ID associated with the Slack team.*/teamId:string/**Whether the member is deleted or not.*/isDeleted:boolean/**Whether the member is an admin.*/isAdmin:boolean/**Whether the member is an owner.*/isOwner:boolean/**Whether the member is a primary owner.*/isPrimaryOwner:boolean/**Whether the member is a bot.*/isBot:boolean/**The timezone of the Slack member.*/timezone:optional string/**The timezone offset of the Slack member.*/timezoneOffset:optional int/**The title of the Slack member.*/title:optional string/**The phone number of the Slack member.*/phone:optional string/**The URL of the member's profile picture.*/profilePictureUrl:optional string/**The status text of the Slack member.*/statusText:optional string/**The status emoji of the Slack member.*/statusEmoji:optional string/**The timestamp of when the member was last updated. (in seconds)*/lastUpdatedSeconds:optional long}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _slackInstanceField = null;
    private String _idField = null;
    private String _nameField = null;
    private String _realNameField = null;
    private String _displayNameField = null;
    private String _emailField = null;
    private String _teamIdField = null;
    private Boolean _isDeletedField = null;
    private Boolean _isAdminField = null;
    private Boolean _isOwnerField = null;
    private Boolean _isPrimaryOwnerField = null;
    private Boolean _isBotField = null;
    private String _timezoneField = null;
    private Integer _timezoneOffsetField = null;
    private String _titleField = null;
    private String _phoneField = null;
    private String _profilePictureUrlField = null;
    private String _statusTextField = null;
    private String _statusEmojiField = null;
    private Long _lastUpdatedSecondsField = null;
    private SlackUserInfo.ChangeListener __changeListener = new SlackUserInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SlackInstance = SCHEMA.getField("slackInstance");
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_RealName = SCHEMA.getField("realName");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_TeamId = SCHEMA.getField("teamId");
    private final static RecordDataSchema.Field FIELD_IsDeleted = SCHEMA.getField("isDeleted");
    private final static RecordDataSchema.Field FIELD_IsAdmin = SCHEMA.getField("isAdmin");
    private final static RecordDataSchema.Field FIELD_IsOwner = SCHEMA.getField("isOwner");
    private final static RecordDataSchema.Field FIELD_IsPrimaryOwner = SCHEMA.getField("isPrimaryOwner");
    private final static RecordDataSchema.Field FIELD_IsBot = SCHEMA.getField("isBot");
    private final static RecordDataSchema.Field FIELD_Timezone = SCHEMA.getField("timezone");
    private final static RecordDataSchema.Field FIELD_TimezoneOffset = SCHEMA.getField("timezoneOffset");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Phone = SCHEMA.getField("phone");
    private final static RecordDataSchema.Field FIELD_ProfilePictureUrl = SCHEMA.getField("profilePictureUrl");
    private final static RecordDataSchema.Field FIELD_StatusText = SCHEMA.getField("statusText");
    private final static RecordDataSchema.Field FIELD_StatusEmoji = SCHEMA.getField("statusEmoji");
    private final static RecordDataSchema.Field FIELD_LastUpdatedSeconds = SCHEMA.getField("lastUpdatedSeconds");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SlackUserInfo() {
        super(new DataMap(), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SlackUserInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SlackUserInfo.Fields fields() {
        return _fields;
    }

    public static SlackUserInfo.ProjectionMask createMask() {
        return new SlackUserInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for slackInstance
     * 
     * @see SlackUserInfo.Fields#slackInstance
     */
    public boolean hasSlackInstance() {
        if (_slackInstanceField!= null) {
            return true;
        }
        return super._map.containsKey("slackInstance");
    }

    /**
     * Remover for slackInstance
     * 
     * @see SlackUserInfo.Fields#slackInstance
     */
    public void removeSlackInstance() {
        super._map.remove("slackInstance");
    }

    /**
     * Getter for slackInstance
     * 
     * @see SlackUserInfo.Fields#slackInstance
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSlackInstance(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSlackInstance();
            case DEFAULT:
            case NULL:
                if (_slackInstanceField!= null) {
                    return _slackInstanceField;
                } else {
                    Object __rawValue = super._map.get("slackInstance");
                    _slackInstanceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _slackInstanceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for slackInstance
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#slackInstance
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSlackInstance() {
        if (_slackInstanceField!= null) {
            return _slackInstanceField;
        } else {
            Object __rawValue = super._map.get("slackInstance");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("slackInstance");
            }
            _slackInstanceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _slackInstanceField;
        }
    }

    /**
     * Setter for slackInstance
     * 
     * @see SlackUserInfo.Fields#slackInstance
     */
    public SlackUserInfo setSlackInstance(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSlackInstance(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field slackInstance of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "slackInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _slackInstanceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSlackInstance();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "slackInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _slackInstanceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "slackInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _slackInstanceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for slackInstance
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#slackInstance
     */
    public SlackUserInfo setSlackInstance(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field slackInstance of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "slackInstance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _slackInstanceField = value;
        }
        return this;
    }

    /**
     * Existence checker for id
     * 
     * @see SlackUserInfo.Fields#id
     */
    public boolean hasId() {
        if (_idField!= null) {
            return true;
        }
        return super._map.containsKey("id");
    }

    /**
     * Remover for id
     * 
     * @see SlackUserInfo.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see SlackUserInfo.Fields#id
     */
    @Nullable
    public String getId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getId();
            case DEFAULT:
            case NULL:
                if (_idField!= null) {
                    return _idField;
                } else {
                    Object __rawValue = super._map.get("id");
                    _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _idField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for id
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#id
     */
    @Nonnull
    public String getId() {
        if (_idField!= null) {
            return _idField;
        } else {
            Object __rawValue = super._map.get("id");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("id");
            }
            _idField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _idField;
        }
    }

    /**
     * Setter for id
     * 
     * @see SlackUserInfo.Fields#id
     */
    public SlackUserInfo setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "id", value);
                    _idField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for id
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#id
     */
    public SlackUserInfo setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see SlackUserInfo.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see SlackUserInfo.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see SlackUserInfo.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see SlackUserInfo.Fields#name
     */
    public SlackUserInfo setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#name
     */
    public SlackUserInfo setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for realName
     * 
     * @see SlackUserInfo.Fields#realName
     */
    public boolean hasRealName() {
        if (_realNameField!= null) {
            return true;
        }
        return super._map.containsKey("realName");
    }

    /**
     * Remover for realName
     * 
     * @see SlackUserInfo.Fields#realName
     */
    public void removeRealName() {
        super._map.remove("realName");
    }

    /**
     * Getter for realName
     * 
     * @see SlackUserInfo.Fields#realName
     */
    @Nullable
    public String getRealName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRealName();
            case DEFAULT:
            case NULL:
                if (_realNameField!= null) {
                    return _realNameField;
                } else {
                    Object __rawValue = super._map.get("realName");
                    _realNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _realNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for realName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#realName
     */
    @Nonnull
    public String getRealName() {
        if (_realNameField!= null) {
            return _realNameField;
        } else {
            Object __rawValue = super._map.get("realName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("realName");
            }
            _realNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _realNameField;
        }
    }

    /**
     * Setter for realName
     * 
     * @see SlackUserInfo.Fields#realName
     */
    public SlackUserInfo setRealName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRealName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field realName of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "realName", value);
                    _realNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRealName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "realName", value);
                    _realNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "realName", value);
                    _realNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for realName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#realName
     */
    public SlackUserInfo setRealName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field realName of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "realName", value);
            _realNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see SlackUserInfo.Fields#displayName
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
     * @see SlackUserInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see SlackUserInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDisplayName();
            case DEFAULT:
            case NULL:
                if (_displayNameField!= null) {
                    return _displayNameField;
                } else {
                    Object __rawValue = super._map.get("displayName");
                    _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _displayNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#displayName
     */
    @Nonnull
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("displayName");
            }
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see SlackUserInfo.Fields#displayName
     */
    public SlackUserInfo setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field displayName of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
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
     * @see SlackUserInfo.Fields#displayName
     */
    public SlackUserInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see SlackUserInfo.Fields#email
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
     * @see SlackUserInfo.Fields#email
     */
    public void removeEmail() {
        super._map.remove("email");
    }

    /**
     * Getter for email
     * 
     * @see SlackUserInfo.Fields#email
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
     * @see SlackUserInfo.Fields#email
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
     * @see SlackUserInfo.Fields#email
     */
    public SlackUserInfo setEmail(
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
     * @see SlackUserInfo.Fields#email
     */
    public SlackUserInfo setEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field email of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "email", value);
            _emailField = value;
        }
        return this;
    }

    /**
     * Existence checker for teamId
     * 
     * @see SlackUserInfo.Fields#teamId
     */
    public boolean hasTeamId() {
        if (_teamIdField!= null) {
            return true;
        }
        return super._map.containsKey("teamId");
    }

    /**
     * Remover for teamId
     * 
     * @see SlackUserInfo.Fields#teamId
     */
    public void removeTeamId() {
        super._map.remove("teamId");
    }

    /**
     * Getter for teamId
     * 
     * @see SlackUserInfo.Fields#teamId
     */
    @Nullable
    public String getTeamId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTeamId();
            case DEFAULT:
            case NULL:
                if (_teamIdField!= null) {
                    return _teamIdField;
                } else {
                    Object __rawValue = super._map.get("teamId");
                    _teamIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _teamIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for teamId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#teamId
     */
    @Nonnull
    public String getTeamId() {
        if (_teamIdField!= null) {
            return _teamIdField;
        } else {
            Object __rawValue = super._map.get("teamId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("teamId");
            }
            _teamIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _teamIdField;
        }
    }

    /**
     * Setter for teamId
     * 
     * @see SlackUserInfo.Fields#teamId
     */
    public SlackUserInfo setTeamId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTeamId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field teamId of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "teamId", value);
                    _teamIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTeamId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "teamId", value);
                    _teamIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "teamId", value);
                    _teamIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for teamId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#teamId
     */
    public SlackUserInfo setTeamId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field teamId of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "teamId", value);
            _teamIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for isDeleted
     * 
     * @see SlackUserInfo.Fields#isDeleted
     */
    public boolean hasIsDeleted() {
        if (_isDeletedField!= null) {
            return true;
        }
        return super._map.containsKey("isDeleted");
    }

    /**
     * Remover for isDeleted
     * 
     * @see SlackUserInfo.Fields#isDeleted
     */
    public void removeIsDeleted() {
        super._map.remove("isDeleted");
    }

    /**
     * Getter for isDeleted
     * 
     * @see SlackUserInfo.Fields#isDeleted
     */
    @Nullable
    public Boolean isIsDeleted(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsDeleted();
            case DEFAULT:
            case NULL:
                if (_isDeletedField!= null) {
                    return _isDeletedField;
                } else {
                    Object __rawValue = super._map.get("isDeleted");
                    _isDeletedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isDeletedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isDeleted
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#isDeleted
     */
    @Nonnull
    public Boolean isIsDeleted() {
        if (_isDeletedField!= null) {
            return _isDeletedField;
        } else {
            Object __rawValue = super._map.get("isDeleted");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isDeleted");
            }
            _isDeletedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isDeletedField;
        }
    }

    /**
     * Setter for isDeleted
     * 
     * @see SlackUserInfo.Fields#isDeleted
     */
    public SlackUserInfo setIsDeleted(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsDeleted(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isDeleted of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isDeleted", value);
                    _isDeletedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsDeleted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isDeleted", value);
                    _isDeletedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isDeleted", value);
                    _isDeletedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isDeleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#isDeleted
     */
    public SlackUserInfo setIsDeleted(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isDeleted of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isDeleted", value);
            _isDeletedField = value;
        }
        return this;
    }

    /**
     * Setter for isDeleted
     * 
     * @see SlackUserInfo.Fields#isDeleted
     */
    public SlackUserInfo setIsDeleted(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isDeleted", value);
        _isDeletedField = value;
        return this;
    }

    /**
     * Existence checker for isAdmin
     * 
     * @see SlackUserInfo.Fields#isAdmin
     */
    public boolean hasIsAdmin() {
        if (_isAdminField!= null) {
            return true;
        }
        return super._map.containsKey("isAdmin");
    }

    /**
     * Remover for isAdmin
     * 
     * @see SlackUserInfo.Fields#isAdmin
     */
    public void removeIsAdmin() {
        super._map.remove("isAdmin");
    }

    /**
     * Getter for isAdmin
     * 
     * @see SlackUserInfo.Fields#isAdmin
     */
    @Nullable
    public Boolean isIsAdmin(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsAdmin();
            case DEFAULT:
            case NULL:
                if (_isAdminField!= null) {
                    return _isAdminField;
                } else {
                    Object __rawValue = super._map.get("isAdmin");
                    _isAdminField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isAdminField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isAdmin
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#isAdmin
     */
    @Nonnull
    public Boolean isIsAdmin() {
        if (_isAdminField!= null) {
            return _isAdminField;
        } else {
            Object __rawValue = super._map.get("isAdmin");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isAdmin");
            }
            _isAdminField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isAdminField;
        }
    }

    /**
     * Setter for isAdmin
     * 
     * @see SlackUserInfo.Fields#isAdmin
     */
    public SlackUserInfo setIsAdmin(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsAdmin(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isAdmin of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isAdmin", value);
                    _isAdminField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsAdmin();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isAdmin", value);
                    _isAdminField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isAdmin", value);
                    _isAdminField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isAdmin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#isAdmin
     */
    public SlackUserInfo setIsAdmin(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isAdmin of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isAdmin", value);
            _isAdminField = value;
        }
        return this;
    }

    /**
     * Setter for isAdmin
     * 
     * @see SlackUserInfo.Fields#isAdmin
     */
    public SlackUserInfo setIsAdmin(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isAdmin", value);
        _isAdminField = value;
        return this;
    }

    /**
     * Existence checker for isOwner
     * 
     * @see SlackUserInfo.Fields#isOwner
     */
    public boolean hasIsOwner() {
        if (_isOwnerField!= null) {
            return true;
        }
        return super._map.containsKey("isOwner");
    }

    /**
     * Remover for isOwner
     * 
     * @see SlackUserInfo.Fields#isOwner
     */
    public void removeIsOwner() {
        super._map.remove("isOwner");
    }

    /**
     * Getter for isOwner
     * 
     * @see SlackUserInfo.Fields#isOwner
     */
    @Nullable
    public Boolean isIsOwner(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsOwner();
            case DEFAULT:
            case NULL:
                if (_isOwnerField!= null) {
                    return _isOwnerField;
                } else {
                    Object __rawValue = super._map.get("isOwner");
                    _isOwnerField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isOwnerField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isOwner
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#isOwner
     */
    @Nonnull
    public Boolean isIsOwner() {
        if (_isOwnerField!= null) {
            return _isOwnerField;
        } else {
            Object __rawValue = super._map.get("isOwner");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isOwner");
            }
            _isOwnerField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isOwnerField;
        }
    }

    /**
     * Setter for isOwner
     * 
     * @see SlackUserInfo.Fields#isOwner
     */
    public SlackUserInfo setIsOwner(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsOwner(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isOwner of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isOwner", value);
                    _isOwnerField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsOwner();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isOwner", value);
                    _isOwnerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isOwner", value);
                    _isOwnerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isOwner
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#isOwner
     */
    public SlackUserInfo setIsOwner(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isOwner of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isOwner", value);
            _isOwnerField = value;
        }
        return this;
    }

    /**
     * Setter for isOwner
     * 
     * @see SlackUserInfo.Fields#isOwner
     */
    public SlackUserInfo setIsOwner(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isOwner", value);
        _isOwnerField = value;
        return this;
    }

    /**
     * Existence checker for isPrimaryOwner
     * 
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    public boolean hasIsPrimaryOwner() {
        if (_isPrimaryOwnerField!= null) {
            return true;
        }
        return super._map.containsKey("isPrimaryOwner");
    }

    /**
     * Remover for isPrimaryOwner
     * 
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    public void removeIsPrimaryOwner() {
        super._map.remove("isPrimaryOwner");
    }

    /**
     * Getter for isPrimaryOwner
     * 
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    @Nullable
    public Boolean isIsPrimaryOwner(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsPrimaryOwner();
            case DEFAULT:
            case NULL:
                if (_isPrimaryOwnerField!= null) {
                    return _isPrimaryOwnerField;
                } else {
                    Object __rawValue = super._map.get("isPrimaryOwner");
                    _isPrimaryOwnerField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isPrimaryOwnerField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isPrimaryOwner
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    @Nonnull
    public Boolean isIsPrimaryOwner() {
        if (_isPrimaryOwnerField!= null) {
            return _isPrimaryOwnerField;
        } else {
            Object __rawValue = super._map.get("isPrimaryOwner");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isPrimaryOwner");
            }
            _isPrimaryOwnerField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isPrimaryOwnerField;
        }
    }

    /**
     * Setter for isPrimaryOwner
     * 
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    public SlackUserInfo setIsPrimaryOwner(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsPrimaryOwner(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isPrimaryOwner of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPrimaryOwner", value);
                    _isPrimaryOwnerField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsPrimaryOwner();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPrimaryOwner", value);
                    _isPrimaryOwnerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isPrimaryOwner", value);
                    _isPrimaryOwnerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isPrimaryOwner
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    public SlackUserInfo setIsPrimaryOwner(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isPrimaryOwner of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isPrimaryOwner", value);
            _isPrimaryOwnerField = value;
        }
        return this;
    }

    /**
     * Setter for isPrimaryOwner
     * 
     * @see SlackUserInfo.Fields#isPrimaryOwner
     */
    public SlackUserInfo setIsPrimaryOwner(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isPrimaryOwner", value);
        _isPrimaryOwnerField = value;
        return this;
    }

    /**
     * Existence checker for isBot
     * 
     * @see SlackUserInfo.Fields#isBot
     */
    public boolean hasIsBot() {
        if (_isBotField!= null) {
            return true;
        }
        return super._map.containsKey("isBot");
    }

    /**
     * Remover for isBot
     * 
     * @see SlackUserInfo.Fields#isBot
     */
    public void removeIsBot() {
        super._map.remove("isBot");
    }

    /**
     * Getter for isBot
     * 
     * @see SlackUserInfo.Fields#isBot
     */
    @Nullable
    public Boolean isIsBot(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsBot();
            case DEFAULT:
            case NULL:
                if (_isBotField!= null) {
                    return _isBotField;
                } else {
                    Object __rawValue = super._map.get("isBot");
                    _isBotField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isBotField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isBot
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackUserInfo.Fields#isBot
     */
    @Nonnull
    public Boolean isIsBot() {
        if (_isBotField!= null) {
            return _isBotField;
        } else {
            Object __rawValue = super._map.get("isBot");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isBot");
            }
            _isBotField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isBotField;
        }
    }

    /**
     * Setter for isBot
     * 
     * @see SlackUserInfo.Fields#isBot
     */
    public SlackUserInfo setIsBot(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsBot(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isBot of com.linkedin.dataplatform.slack.SlackUserInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isBot", value);
                    _isBotField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsBot();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isBot", value);
                    _isBotField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isBot", value);
                    _isBotField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isBot
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#isBot
     */
    public SlackUserInfo setIsBot(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isBot of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isBot", value);
            _isBotField = value;
        }
        return this;
    }

    /**
     * Setter for isBot
     * 
     * @see SlackUserInfo.Fields#isBot
     */
    public SlackUserInfo setIsBot(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isBot", value);
        _isBotField = value;
        return this;
    }

    /**
     * Existence checker for timezone
     * 
     * @see SlackUserInfo.Fields#timezone
     */
    public boolean hasTimezone() {
        if (_timezoneField!= null) {
            return true;
        }
        return super._map.containsKey("timezone");
    }

    /**
     * Remover for timezone
     * 
     * @see SlackUserInfo.Fields#timezone
     */
    public void removeTimezone() {
        super._map.remove("timezone");
    }

    /**
     * Getter for timezone
     * 
     * @see SlackUserInfo.Fields#timezone
     */
    @Nullable
    public String getTimezone(GetMode mode) {
        return getTimezone();
    }

    /**
     * Getter for timezone
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#timezone
     */
    @Nullable
    public String getTimezone() {
        if (_timezoneField!= null) {
            return _timezoneField;
        } else {
            Object __rawValue = super._map.get("timezone");
            _timezoneField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _timezoneField;
        }
    }

    /**
     * Setter for timezone
     * 
     * @see SlackUserInfo.Fields#timezone
     */
    public SlackUserInfo setTimezone(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimezone(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimezone();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timezone", value);
                    _timezoneField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timezone", value);
                    _timezoneField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timezone
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#timezone
     */
    public SlackUserInfo setTimezone(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timezone of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timezone", value);
            _timezoneField = value;
        }
        return this;
    }

    /**
     * Existence checker for timezoneOffset
     * 
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    public boolean hasTimezoneOffset() {
        if (_timezoneOffsetField!= null) {
            return true;
        }
        return super._map.containsKey("timezoneOffset");
    }

    /**
     * Remover for timezoneOffset
     * 
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    public void removeTimezoneOffset() {
        super._map.remove("timezoneOffset");
    }

    /**
     * Getter for timezoneOffset
     * 
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    @Nullable
    public Integer getTimezoneOffset(GetMode mode) {
        return getTimezoneOffset();
    }

    /**
     * Getter for timezoneOffset
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    @Nullable
    public Integer getTimezoneOffset() {
        if (_timezoneOffsetField!= null) {
            return _timezoneOffsetField;
        } else {
            Object __rawValue = super._map.get("timezoneOffset");
            _timezoneOffsetField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _timezoneOffsetField;
        }
    }

    /**
     * Setter for timezoneOffset
     * 
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    public SlackUserInfo setTimezoneOffset(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimezoneOffset(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimezoneOffset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timezoneOffset", DataTemplateUtil.coerceIntInput(value));
                    _timezoneOffsetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timezoneOffset", DataTemplateUtil.coerceIntInput(value));
                    _timezoneOffsetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timezoneOffset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    public SlackUserInfo setTimezoneOffset(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timezoneOffset of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timezoneOffset", DataTemplateUtil.coerceIntInput(value));
            _timezoneOffsetField = value;
        }
        return this;
    }

    /**
     * Setter for timezoneOffset
     * 
     * @see SlackUserInfo.Fields#timezoneOffset
     */
    public SlackUserInfo setTimezoneOffset(int value) {
        CheckedUtil.putWithoutChecking(super._map, "timezoneOffset", DataTemplateUtil.coerceIntInput(value));
        _timezoneOffsetField = value;
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see SlackUserInfo.Fields#title
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
     * @see SlackUserInfo.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see SlackUserInfo.Fields#title
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
     * @see SlackUserInfo.Fields#title
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
     * @see SlackUserInfo.Fields#title
     */
    public SlackUserInfo setTitle(
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
     * @see SlackUserInfo.Fields#title
     */
    public SlackUserInfo setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for phone
     * 
     * @see SlackUserInfo.Fields#phone
     */
    public boolean hasPhone() {
        if (_phoneField!= null) {
            return true;
        }
        return super._map.containsKey("phone");
    }

    /**
     * Remover for phone
     * 
     * @see SlackUserInfo.Fields#phone
     */
    public void removePhone() {
        super._map.remove("phone");
    }

    /**
     * Getter for phone
     * 
     * @see SlackUserInfo.Fields#phone
     */
    @Nullable
    public String getPhone(GetMode mode) {
        return getPhone();
    }

    /**
     * Getter for phone
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#phone
     */
    @Nullable
    public String getPhone() {
        if (_phoneField!= null) {
            return _phoneField;
        } else {
            Object __rawValue = super._map.get("phone");
            _phoneField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _phoneField;
        }
    }

    /**
     * Setter for phone
     * 
     * @see SlackUserInfo.Fields#phone
     */
    public SlackUserInfo setPhone(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPhone(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePhone();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "phone", value);
                    _phoneField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "phone", value);
                    _phoneField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for phone
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#phone
     */
    public SlackUserInfo setPhone(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field phone of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "phone", value);
            _phoneField = value;
        }
        return this;
    }

    /**
     * Existence checker for profilePictureUrl
     * 
     * @see SlackUserInfo.Fields#profilePictureUrl
     */
    public boolean hasProfilePictureUrl() {
        if (_profilePictureUrlField!= null) {
            return true;
        }
        return super._map.containsKey("profilePictureUrl");
    }

    /**
     * Remover for profilePictureUrl
     * 
     * @see SlackUserInfo.Fields#profilePictureUrl
     */
    public void removeProfilePictureUrl() {
        super._map.remove("profilePictureUrl");
    }

    /**
     * Getter for profilePictureUrl
     * 
     * @see SlackUserInfo.Fields#profilePictureUrl
     */
    @Nullable
    public String getProfilePictureUrl(GetMode mode) {
        return getProfilePictureUrl();
    }

    /**
     * Getter for profilePictureUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#profilePictureUrl
     */
    @Nullable
    public String getProfilePictureUrl() {
        if (_profilePictureUrlField!= null) {
            return _profilePictureUrlField;
        } else {
            Object __rawValue = super._map.get("profilePictureUrl");
            _profilePictureUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _profilePictureUrlField;
        }
    }

    /**
     * Setter for profilePictureUrl
     * 
     * @see SlackUserInfo.Fields#profilePictureUrl
     */
    public SlackUserInfo setProfilePictureUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProfilePictureUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProfilePictureUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "profilePictureUrl", value);
                    _profilePictureUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "profilePictureUrl", value);
                    _profilePictureUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for profilePictureUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#profilePictureUrl
     */
    public SlackUserInfo setProfilePictureUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field profilePictureUrl of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "profilePictureUrl", value);
            _profilePictureUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for statusText
     * 
     * @see SlackUserInfo.Fields#statusText
     */
    public boolean hasStatusText() {
        if (_statusTextField!= null) {
            return true;
        }
        return super._map.containsKey("statusText");
    }

    /**
     * Remover for statusText
     * 
     * @see SlackUserInfo.Fields#statusText
     */
    public void removeStatusText() {
        super._map.remove("statusText");
    }

    /**
     * Getter for statusText
     * 
     * @see SlackUserInfo.Fields#statusText
     */
    @Nullable
    public String getStatusText(GetMode mode) {
        return getStatusText();
    }

    /**
     * Getter for statusText
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#statusText
     */
    @Nullable
    public String getStatusText() {
        if (_statusTextField!= null) {
            return _statusTextField;
        } else {
            Object __rawValue = super._map.get("statusText");
            _statusTextField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _statusTextField;
        }
    }

    /**
     * Setter for statusText
     * 
     * @see SlackUserInfo.Fields#statusText
     */
    public SlackUserInfo setStatusText(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatusText(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatusText();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "statusText", value);
                    _statusTextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "statusText", value);
                    _statusTextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for statusText
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#statusText
     */
    public SlackUserInfo setStatusText(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field statusText of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "statusText", value);
            _statusTextField = value;
        }
        return this;
    }

    /**
     * Existence checker for statusEmoji
     * 
     * @see SlackUserInfo.Fields#statusEmoji
     */
    public boolean hasStatusEmoji() {
        if (_statusEmojiField!= null) {
            return true;
        }
        return super._map.containsKey("statusEmoji");
    }

    /**
     * Remover for statusEmoji
     * 
     * @see SlackUserInfo.Fields#statusEmoji
     */
    public void removeStatusEmoji() {
        super._map.remove("statusEmoji");
    }

    /**
     * Getter for statusEmoji
     * 
     * @see SlackUserInfo.Fields#statusEmoji
     */
    @Nullable
    public String getStatusEmoji(GetMode mode) {
        return getStatusEmoji();
    }

    /**
     * Getter for statusEmoji
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#statusEmoji
     */
    @Nullable
    public String getStatusEmoji() {
        if (_statusEmojiField!= null) {
            return _statusEmojiField;
        } else {
            Object __rawValue = super._map.get("statusEmoji");
            _statusEmojiField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _statusEmojiField;
        }
    }

    /**
     * Setter for statusEmoji
     * 
     * @see SlackUserInfo.Fields#statusEmoji
     */
    public SlackUserInfo setStatusEmoji(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatusEmoji(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatusEmoji();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "statusEmoji", value);
                    _statusEmojiField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "statusEmoji", value);
                    _statusEmojiField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for statusEmoji
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#statusEmoji
     */
    public SlackUserInfo setStatusEmoji(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field statusEmoji of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "statusEmoji", value);
            _statusEmojiField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastUpdatedSeconds
     * 
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    public boolean hasLastUpdatedSeconds() {
        if (_lastUpdatedSecondsField!= null) {
            return true;
        }
        return super._map.containsKey("lastUpdatedSeconds");
    }

    /**
     * Remover for lastUpdatedSeconds
     * 
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    public void removeLastUpdatedSeconds() {
        super._map.remove("lastUpdatedSeconds");
    }

    /**
     * Getter for lastUpdatedSeconds
     * 
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    @Nullable
    public Long getLastUpdatedSeconds(GetMode mode) {
        return getLastUpdatedSeconds();
    }

    /**
     * Getter for lastUpdatedSeconds
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    @Nullable
    public Long getLastUpdatedSeconds() {
        if (_lastUpdatedSecondsField!= null) {
            return _lastUpdatedSecondsField;
        } else {
            Object __rawValue = super._map.get("lastUpdatedSeconds");
            _lastUpdatedSecondsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _lastUpdatedSecondsField;
        }
    }

    /**
     * Setter for lastUpdatedSeconds
     * 
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    public SlackUserInfo setLastUpdatedSeconds(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastUpdatedSeconds(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastUpdatedSeconds();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdatedSeconds", DataTemplateUtil.coerceLongInput(value));
                    _lastUpdatedSecondsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdatedSeconds", DataTemplateUtil.coerceLongInput(value));
                    _lastUpdatedSecondsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastUpdatedSeconds
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    public SlackUserInfo setLastUpdatedSeconds(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastUpdatedSeconds of com.linkedin.dataplatform.slack.SlackUserInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastUpdatedSeconds", DataTemplateUtil.coerceLongInput(value));
            _lastUpdatedSecondsField = value;
        }
        return this;
    }

    /**
     * Setter for lastUpdatedSeconds
     * 
     * @see SlackUserInfo.Fields#lastUpdatedSeconds
     */
    public SlackUserInfo setLastUpdatedSeconds(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastUpdatedSeconds", DataTemplateUtil.coerceLongInput(value));
        _lastUpdatedSecondsField = value;
        return this;
    }

    @Override
    public SlackUserInfo clone()
        throws CloneNotSupportedException
    {
        SlackUserInfo __clone = ((SlackUserInfo) super.clone());
        __clone.__changeListener = new SlackUserInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SlackUserInfo copy()
        throws CloneNotSupportedException
    {
        SlackUserInfo __copy = ((SlackUserInfo) super.copy());
        __copy._profilePictureUrlField = null;
        __copy._isBotField = null;
        __copy._slackInstanceField = null;
        __copy._displayNameField = null;
        __copy._timezoneField = null;
        __copy._isAdminField = null;
        __copy._titleField = null;
        __copy._isPrimaryOwnerField = null;
        __copy._realNameField = null;
        __copy._isDeletedField = null;
        __copy._isOwnerField = null;
        __copy._timezoneOffsetField = null;
        __copy._phoneField = null;
        __copy._teamIdField = null;
        __copy._statusTextField = null;
        __copy._nameField = null;
        __copy._lastUpdatedSecondsField = null;
        __copy._idField = null;
        __copy._statusEmojiField = null;
        __copy._emailField = null;
        __copy.__changeListener = new SlackUserInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SlackUserInfo __objectRef;

        private ChangeListener(SlackUserInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "profilePictureUrl":
                    __objectRef._profilePictureUrlField = null;
                    break;
                case "isBot":
                    __objectRef._isBotField = null;
                    break;
                case "slackInstance":
                    __objectRef._slackInstanceField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "timezone":
                    __objectRef._timezoneField = null;
                    break;
                case "isAdmin":
                    __objectRef._isAdminField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "isPrimaryOwner":
                    __objectRef._isPrimaryOwnerField = null;
                    break;
                case "realName":
                    __objectRef._realNameField = null;
                    break;
                case "isDeleted":
                    __objectRef._isDeletedField = null;
                    break;
                case "isOwner":
                    __objectRef._isOwnerField = null;
                    break;
                case "timezoneOffset":
                    __objectRef._timezoneOffsetField = null;
                    break;
                case "phone":
                    __objectRef._phoneField = null;
                    break;
                case "teamId":
                    __objectRef._teamIdField = null;
                    break;
                case "statusText":
                    __objectRef._statusTextField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "lastUpdatedSeconds":
                    __objectRef._lastUpdatedSecondsField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
                    break;
                case "statusEmoji":
                    __objectRef._statusEmojiField = null;
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
         * The dataplatform instance that this Slack member belongs to.
         * 
         */
        public PathSpec slackInstance() {
            return new PathSpec(getPathComponents(), "slackInstance");
        }

        /**
         * The unique identifier for the Slack member.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * The username of the Slack member.
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The real name of the Slack member.
         * 
         */
        public PathSpec realName() {
            return new PathSpec(getPathComponents(), "realName");
        }

        /**
         * The display name of the Slack member.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * The email associated with the Slack member.
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * The ID associated with the Slack team.
         * 
         */
        public PathSpec teamId() {
            return new PathSpec(getPathComponents(), "teamId");
        }

        /**
         * Whether the member is deleted or not.
         * 
         */
        public PathSpec isDeleted() {
            return new PathSpec(getPathComponents(), "isDeleted");
        }

        /**
         * Whether the member is an admin.
         * 
         */
        public PathSpec isAdmin() {
            return new PathSpec(getPathComponents(), "isAdmin");
        }

        /**
         * Whether the member is an owner.
         * 
         */
        public PathSpec isOwner() {
            return new PathSpec(getPathComponents(), "isOwner");
        }

        /**
         * Whether the member is a primary owner.
         * 
         */
        public PathSpec isPrimaryOwner() {
            return new PathSpec(getPathComponents(), "isPrimaryOwner");
        }

        /**
         * Whether the member is a bot.
         * 
         */
        public PathSpec isBot() {
            return new PathSpec(getPathComponents(), "isBot");
        }

        /**
         * The timezone of the Slack member.
         * 
         */
        public PathSpec timezone() {
            return new PathSpec(getPathComponents(), "timezone");
        }

        /**
         * The timezone offset of the Slack member.
         * 
         */
        public PathSpec timezoneOffset() {
            return new PathSpec(getPathComponents(), "timezoneOffset");
        }

        /**
         * The title of the Slack member.
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * The phone number of the Slack member.
         * 
         */
        public PathSpec phone() {
            return new PathSpec(getPathComponents(), "phone");
        }

        /**
         * The URL of the member's profile picture.
         * 
         */
        public PathSpec profilePictureUrl() {
            return new PathSpec(getPathComponents(), "profilePictureUrl");
        }

        /**
         * The status text of the Slack member.
         * 
         */
        public PathSpec statusText() {
            return new PathSpec(getPathComponents(), "statusText");
        }

        /**
         * The status emoji of the Slack member.
         * 
         */
        public PathSpec statusEmoji() {
            return new PathSpec(getPathComponents(), "statusEmoji");
        }

        /**
         * The timestamp of when the member was last updated. (in seconds)
         * 
         */
        public PathSpec lastUpdatedSeconds() {
            return new PathSpec(getPathComponents(), "lastUpdatedSeconds");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
        }

        /**
         * The dataplatform instance that this Slack member belongs to.
         * 
         */
        public SlackUserInfo.ProjectionMask withSlackInstance() {
            getDataMap().put("slackInstance", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The unique identifier for the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The username of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The real name of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withRealName() {
            getDataMap().put("realName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The display name of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The email associated with the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withEmail() {
            getDataMap().put("email", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The ID associated with the Slack team.
         * 
         */
        public SlackUserInfo.ProjectionMask withTeamId() {
            getDataMap().put("teamId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the member is deleted or not.
         * 
         */
        public SlackUserInfo.ProjectionMask withIsDeleted() {
            getDataMap().put("isDeleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the member is an admin.
         * 
         */
        public SlackUserInfo.ProjectionMask withIsAdmin() {
            getDataMap().put("isAdmin", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the member is an owner.
         * 
         */
        public SlackUserInfo.ProjectionMask withIsOwner() {
            getDataMap().put("isOwner", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the member is a primary owner.
         * 
         */
        public SlackUserInfo.ProjectionMask withIsPrimaryOwner() {
            getDataMap().put("isPrimaryOwner", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the member is a bot.
         * 
         */
        public SlackUserInfo.ProjectionMask withIsBot() {
            getDataMap().put("isBot", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The timezone of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withTimezone() {
            getDataMap().put("timezone", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The timezone offset of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withTimezoneOffset() {
            getDataMap().put("timezoneOffset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The title of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The phone number of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withPhone() {
            getDataMap().put("phone", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The URL of the member's profile picture.
         * 
         */
        public SlackUserInfo.ProjectionMask withProfilePictureUrl() {
            getDataMap().put("profilePictureUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The status text of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withStatusText() {
            getDataMap().put("statusText", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The status emoji of the Slack member.
         * 
         */
        public SlackUserInfo.ProjectionMask withStatusEmoji() {
            getDataMap().put("statusEmoji", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The timestamp of when the member was last updated. (in seconds)
         * 
         */
        public SlackUserInfo.ProjectionMask withLastUpdatedSeconds() {
            getDataMap().put("lastUpdatedSeconds", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
