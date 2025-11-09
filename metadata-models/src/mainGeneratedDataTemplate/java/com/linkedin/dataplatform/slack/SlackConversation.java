
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Information about a Slack conversation.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataplatform/slack/SlackConversation.pdl.")
public class SlackConversation
    extends RecordTemplate
{

    private final static SlackConversation.Fields _fields = new SlackConversation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatform.slack/**Information about a Slack conversation.*/record SlackConversation{/**The unique ID of the Slack conversation.*/id:string/**The display name of the Slack conversation.*/displayName:string/**If this is a channel.*/isChannel:boolean/**If this is a channel.*/isGroup:boolean/**If this is a private conversation.*/isPrivate:boolean/**If this conversation is archived.*/isArchived:boolean/**If this is a shared channel.*/isShared:boolean/**If this is an externally shared channel.*/isExtShared:boolean/**If this is a general channel.*/isGeneral:boolean/**The team this conversation lives within.*/contextTeamID:optional string/**The purpose of this Slack channel, if set.*/purpose:optional string/**The topic of this Slack channel, if set.*/topic:optional string}", SchemaFormatType.PDL));
    private String _idField = null;
    private String _displayNameField = null;
    private Boolean _isChannelField = null;
    private Boolean _isGroupField = null;
    private Boolean _isPrivateField = null;
    private Boolean _isArchivedField = null;
    private Boolean _isSharedField = null;
    private Boolean _isExtSharedField = null;
    private Boolean _isGeneralField = null;
    private String _contextTeamIDField = null;
    private String _purposeField = null;
    private String _topicField = null;
    private SlackConversation.ChangeListener __changeListener = new SlackConversation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_IsChannel = SCHEMA.getField("isChannel");
    private final static RecordDataSchema.Field FIELD_IsGroup = SCHEMA.getField("isGroup");
    private final static RecordDataSchema.Field FIELD_IsPrivate = SCHEMA.getField("isPrivate");
    private final static RecordDataSchema.Field FIELD_IsArchived = SCHEMA.getField("isArchived");
    private final static RecordDataSchema.Field FIELD_IsShared = SCHEMA.getField("isShared");
    private final static RecordDataSchema.Field FIELD_IsExtShared = SCHEMA.getField("isExtShared");
    private final static RecordDataSchema.Field FIELD_IsGeneral = SCHEMA.getField("isGeneral");
    private final static RecordDataSchema.Field FIELD_ContextTeamID = SCHEMA.getField("contextTeamID");
    private final static RecordDataSchema.Field FIELD_Purpose = SCHEMA.getField("purpose");
    private final static RecordDataSchema.Field FIELD_Topic = SCHEMA.getField("topic");

    public SlackConversation() {
        super(new DataMap(), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SlackConversation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SlackConversation.Fields fields() {
        return _fields;
    }

    public static SlackConversation.ProjectionMask createMask() {
        return new SlackConversation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see SlackConversation.Fields#id
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
     * @see SlackConversation.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see SlackConversation.Fields#id
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
     * @see SlackConversation.Fields#id
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
     * @see SlackConversation.Fields#id
     */
    public SlackConversation setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.dataplatform.slack.SlackConversation");
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
     * @see SlackConversation.Fields#id
     */
    public SlackConversation setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see SlackConversation.Fields#displayName
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
     * @see SlackConversation.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see SlackConversation.Fields#displayName
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
     * @see SlackConversation.Fields#displayName
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
     * @see SlackConversation.Fields#displayName
     */
    public SlackConversation setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field displayName of com.linkedin.dataplatform.slack.SlackConversation");
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
     * @see SlackConversation.Fields#displayName
     */
    public SlackConversation setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for isChannel
     * 
     * @see SlackConversation.Fields#isChannel
     */
    public boolean hasIsChannel() {
        if (_isChannelField!= null) {
            return true;
        }
        return super._map.containsKey("isChannel");
    }

    /**
     * Remover for isChannel
     * 
     * @see SlackConversation.Fields#isChannel
     */
    public void removeIsChannel() {
        super._map.remove("isChannel");
    }

    /**
     * Getter for isChannel
     * 
     * @see SlackConversation.Fields#isChannel
     */
    @Nullable
    public Boolean isIsChannel(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsChannel();
            case DEFAULT:
            case NULL:
                if (_isChannelField!= null) {
                    return _isChannelField;
                } else {
                    Object __rawValue = super._map.get("isChannel");
                    _isChannelField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isChannelField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isChannel
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isChannel
     */
    @Nonnull
    public Boolean isIsChannel() {
        if (_isChannelField!= null) {
            return _isChannelField;
        } else {
            Object __rawValue = super._map.get("isChannel");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isChannel");
            }
            _isChannelField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isChannelField;
        }
    }

    /**
     * Setter for isChannel
     * 
     * @see SlackConversation.Fields#isChannel
     */
    public SlackConversation setIsChannel(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsChannel(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isChannel of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isChannel", value);
                    _isChannelField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsChannel();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isChannel", value);
                    _isChannelField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isChannel", value);
                    _isChannelField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isChannel
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isChannel
     */
    public SlackConversation setIsChannel(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isChannel of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isChannel", value);
            _isChannelField = value;
        }
        return this;
    }

    /**
     * Setter for isChannel
     * 
     * @see SlackConversation.Fields#isChannel
     */
    public SlackConversation setIsChannel(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isChannel", value);
        _isChannelField = value;
        return this;
    }

    /**
     * Existence checker for isGroup
     * 
     * @see SlackConversation.Fields#isGroup
     */
    public boolean hasIsGroup() {
        if (_isGroupField!= null) {
            return true;
        }
        return super._map.containsKey("isGroup");
    }

    /**
     * Remover for isGroup
     * 
     * @see SlackConversation.Fields#isGroup
     */
    public void removeIsGroup() {
        super._map.remove("isGroup");
    }

    /**
     * Getter for isGroup
     * 
     * @see SlackConversation.Fields#isGroup
     */
    @Nullable
    public Boolean isIsGroup(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsGroup();
            case DEFAULT:
            case NULL:
                if (_isGroupField!= null) {
                    return _isGroupField;
                } else {
                    Object __rawValue = super._map.get("isGroup");
                    _isGroupField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isGroupField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isGroup
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isGroup
     */
    @Nonnull
    public Boolean isIsGroup() {
        if (_isGroupField!= null) {
            return _isGroupField;
        } else {
            Object __rawValue = super._map.get("isGroup");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isGroup");
            }
            _isGroupField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isGroupField;
        }
    }

    /**
     * Setter for isGroup
     * 
     * @see SlackConversation.Fields#isGroup
     */
    public SlackConversation setIsGroup(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsGroup(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isGroup of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isGroup", value);
                    _isGroupField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsGroup();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isGroup", value);
                    _isGroupField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isGroup", value);
                    _isGroupField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isGroup
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isGroup
     */
    public SlackConversation setIsGroup(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isGroup of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isGroup", value);
            _isGroupField = value;
        }
        return this;
    }

    /**
     * Setter for isGroup
     * 
     * @see SlackConversation.Fields#isGroup
     */
    public SlackConversation setIsGroup(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isGroup", value);
        _isGroupField = value;
        return this;
    }

    /**
     * Existence checker for isPrivate
     * 
     * @see SlackConversation.Fields#isPrivate
     */
    public boolean hasIsPrivate() {
        if (_isPrivateField!= null) {
            return true;
        }
        return super._map.containsKey("isPrivate");
    }

    /**
     * Remover for isPrivate
     * 
     * @see SlackConversation.Fields#isPrivate
     */
    public void removeIsPrivate() {
        super._map.remove("isPrivate");
    }

    /**
     * Getter for isPrivate
     * 
     * @see SlackConversation.Fields#isPrivate
     */
    @Nullable
    public Boolean isIsPrivate(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsPrivate();
            case DEFAULT:
            case NULL:
                if (_isPrivateField!= null) {
                    return _isPrivateField;
                } else {
                    Object __rawValue = super._map.get("isPrivate");
                    _isPrivateField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isPrivateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isPrivate
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isPrivate
     */
    @Nonnull
    public Boolean isIsPrivate() {
        if (_isPrivateField!= null) {
            return _isPrivateField;
        } else {
            Object __rawValue = super._map.get("isPrivate");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isPrivate");
            }
            _isPrivateField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isPrivateField;
        }
    }

    /**
     * Setter for isPrivate
     * 
     * @see SlackConversation.Fields#isPrivate
     */
    public SlackConversation setIsPrivate(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsPrivate(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isPrivate of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPrivate", value);
                    _isPrivateField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsPrivate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isPrivate", value);
                    _isPrivateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isPrivate", value);
                    _isPrivateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isPrivate
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isPrivate
     */
    public SlackConversation setIsPrivate(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isPrivate of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isPrivate", value);
            _isPrivateField = value;
        }
        return this;
    }

    /**
     * Setter for isPrivate
     * 
     * @see SlackConversation.Fields#isPrivate
     */
    public SlackConversation setIsPrivate(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isPrivate", value);
        _isPrivateField = value;
        return this;
    }

    /**
     * Existence checker for isArchived
     * 
     * @see SlackConversation.Fields#isArchived
     */
    public boolean hasIsArchived() {
        if (_isArchivedField!= null) {
            return true;
        }
        return super._map.containsKey("isArchived");
    }

    /**
     * Remover for isArchived
     * 
     * @see SlackConversation.Fields#isArchived
     */
    public void removeIsArchived() {
        super._map.remove("isArchived");
    }

    /**
     * Getter for isArchived
     * 
     * @see SlackConversation.Fields#isArchived
     */
    @Nullable
    public Boolean isIsArchived(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsArchived();
            case DEFAULT:
            case NULL:
                if (_isArchivedField!= null) {
                    return _isArchivedField;
                } else {
                    Object __rawValue = super._map.get("isArchived");
                    _isArchivedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isArchivedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isArchived
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isArchived
     */
    @Nonnull
    public Boolean isIsArchived() {
        if (_isArchivedField!= null) {
            return _isArchivedField;
        } else {
            Object __rawValue = super._map.get("isArchived");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isArchived");
            }
            _isArchivedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isArchivedField;
        }
    }

    /**
     * Setter for isArchived
     * 
     * @see SlackConversation.Fields#isArchived
     */
    public SlackConversation setIsArchived(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsArchived(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isArchived of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isArchived", value);
                    _isArchivedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsArchived();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isArchived", value);
                    _isArchivedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isArchived", value);
                    _isArchivedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isArchived
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isArchived
     */
    public SlackConversation setIsArchived(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isArchived of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isArchived", value);
            _isArchivedField = value;
        }
        return this;
    }

    /**
     * Setter for isArchived
     * 
     * @see SlackConversation.Fields#isArchived
     */
    public SlackConversation setIsArchived(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isArchived", value);
        _isArchivedField = value;
        return this;
    }

    /**
     * Existence checker for isShared
     * 
     * @see SlackConversation.Fields#isShared
     */
    public boolean hasIsShared() {
        if (_isSharedField!= null) {
            return true;
        }
        return super._map.containsKey("isShared");
    }

    /**
     * Remover for isShared
     * 
     * @see SlackConversation.Fields#isShared
     */
    public void removeIsShared() {
        super._map.remove("isShared");
    }

    /**
     * Getter for isShared
     * 
     * @see SlackConversation.Fields#isShared
     */
    @Nullable
    public Boolean isIsShared(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsShared();
            case DEFAULT:
            case NULL:
                if (_isSharedField!= null) {
                    return _isSharedField;
                } else {
                    Object __rawValue = super._map.get("isShared");
                    _isSharedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isSharedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isShared
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isShared
     */
    @Nonnull
    public Boolean isIsShared() {
        if (_isSharedField!= null) {
            return _isSharedField;
        } else {
            Object __rawValue = super._map.get("isShared");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isShared");
            }
            _isSharedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isSharedField;
        }
    }

    /**
     * Setter for isShared
     * 
     * @see SlackConversation.Fields#isShared
     */
    public SlackConversation setIsShared(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsShared(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isShared of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isShared", value);
                    _isSharedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsShared();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isShared", value);
                    _isSharedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isShared", value);
                    _isSharedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isShared
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isShared
     */
    public SlackConversation setIsShared(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isShared of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isShared", value);
            _isSharedField = value;
        }
        return this;
    }

    /**
     * Setter for isShared
     * 
     * @see SlackConversation.Fields#isShared
     */
    public SlackConversation setIsShared(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isShared", value);
        _isSharedField = value;
        return this;
    }

    /**
     * Existence checker for isExtShared
     * 
     * @see SlackConversation.Fields#isExtShared
     */
    public boolean hasIsExtShared() {
        if (_isExtSharedField!= null) {
            return true;
        }
        return super._map.containsKey("isExtShared");
    }

    /**
     * Remover for isExtShared
     * 
     * @see SlackConversation.Fields#isExtShared
     */
    public void removeIsExtShared() {
        super._map.remove("isExtShared");
    }

    /**
     * Getter for isExtShared
     * 
     * @see SlackConversation.Fields#isExtShared
     */
    @Nullable
    public Boolean isIsExtShared(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsExtShared();
            case DEFAULT:
            case NULL:
                if (_isExtSharedField!= null) {
                    return _isExtSharedField;
                } else {
                    Object __rawValue = super._map.get("isExtShared");
                    _isExtSharedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isExtSharedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isExtShared
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isExtShared
     */
    @Nonnull
    public Boolean isIsExtShared() {
        if (_isExtSharedField!= null) {
            return _isExtSharedField;
        } else {
            Object __rawValue = super._map.get("isExtShared");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isExtShared");
            }
            _isExtSharedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isExtSharedField;
        }
    }

    /**
     * Setter for isExtShared
     * 
     * @see SlackConversation.Fields#isExtShared
     */
    public SlackConversation setIsExtShared(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsExtShared(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isExtShared of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isExtShared", value);
                    _isExtSharedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsExtShared();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isExtShared", value);
                    _isExtSharedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isExtShared", value);
                    _isExtSharedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isExtShared
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isExtShared
     */
    public SlackConversation setIsExtShared(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isExtShared of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isExtShared", value);
            _isExtSharedField = value;
        }
        return this;
    }

    /**
     * Setter for isExtShared
     * 
     * @see SlackConversation.Fields#isExtShared
     */
    public SlackConversation setIsExtShared(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isExtShared", value);
        _isExtSharedField = value;
        return this;
    }

    /**
     * Existence checker for isGeneral
     * 
     * @see SlackConversation.Fields#isGeneral
     */
    public boolean hasIsGeneral() {
        if (_isGeneralField!= null) {
            return true;
        }
        return super._map.containsKey("isGeneral");
    }

    /**
     * Remover for isGeneral
     * 
     * @see SlackConversation.Fields#isGeneral
     */
    public void removeIsGeneral() {
        super._map.remove("isGeneral");
    }

    /**
     * Getter for isGeneral
     * 
     * @see SlackConversation.Fields#isGeneral
     */
    @Nullable
    public Boolean isIsGeneral(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isIsGeneral();
            case DEFAULT:
            case NULL:
                if (_isGeneralField!= null) {
                    return _isGeneralField;
                } else {
                    Object __rawValue = super._map.get("isGeneral");
                    _isGeneralField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _isGeneralField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for isGeneral
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SlackConversation.Fields#isGeneral
     */
    @Nonnull
    public Boolean isIsGeneral() {
        if (_isGeneralField!= null) {
            return _isGeneralField;
        } else {
            Object __rawValue = super._map.get("isGeneral");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("isGeneral");
            }
            _isGeneralField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _isGeneralField;
        }
    }

    /**
     * Setter for isGeneral
     * 
     * @see SlackConversation.Fields#isGeneral
     */
    public SlackConversation setIsGeneral(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIsGeneral(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field isGeneral of com.linkedin.dataplatform.slack.SlackConversation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isGeneral", value);
                    _isGeneralField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIsGeneral();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "isGeneral", value);
                    _isGeneralField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "isGeneral", value);
                    _isGeneralField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for isGeneral
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#isGeneral
     */
    public SlackConversation setIsGeneral(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field isGeneral of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "isGeneral", value);
            _isGeneralField = value;
        }
        return this;
    }

    /**
     * Setter for isGeneral
     * 
     * @see SlackConversation.Fields#isGeneral
     */
    public SlackConversation setIsGeneral(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "isGeneral", value);
        _isGeneralField = value;
        return this;
    }

    /**
     * Existence checker for contextTeamID
     * 
     * @see SlackConversation.Fields#contextTeamID
     */
    public boolean hasContextTeamID() {
        if (_contextTeamIDField!= null) {
            return true;
        }
        return super._map.containsKey("contextTeamID");
    }

    /**
     * Remover for contextTeamID
     * 
     * @see SlackConversation.Fields#contextTeamID
     */
    public void removeContextTeamID() {
        super._map.remove("contextTeamID");
    }

    /**
     * Getter for contextTeamID
     * 
     * @see SlackConversation.Fields#contextTeamID
     */
    @Nullable
    public String getContextTeamID(GetMode mode) {
        return getContextTeamID();
    }

    /**
     * Getter for contextTeamID
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackConversation.Fields#contextTeamID
     */
    @Nullable
    public String getContextTeamID() {
        if (_contextTeamIDField!= null) {
            return _contextTeamIDField;
        } else {
            Object __rawValue = super._map.get("contextTeamID");
            _contextTeamIDField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contextTeamIDField;
        }
    }

    /**
     * Setter for contextTeamID
     * 
     * @see SlackConversation.Fields#contextTeamID
     */
    public SlackConversation setContextTeamID(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContextTeamID(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContextTeamID();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contextTeamID", value);
                    _contextTeamIDField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "contextTeamID", value);
                    _contextTeamIDField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for contextTeamID
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#contextTeamID
     */
    public SlackConversation setContextTeamID(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field contextTeamID of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "contextTeamID", value);
            _contextTeamIDField = value;
        }
        return this;
    }

    /**
     * Existence checker for purpose
     * 
     * @see SlackConversation.Fields#purpose
     */
    public boolean hasPurpose() {
        if (_purposeField!= null) {
            return true;
        }
        return super._map.containsKey("purpose");
    }

    /**
     * Remover for purpose
     * 
     * @see SlackConversation.Fields#purpose
     */
    public void removePurpose() {
        super._map.remove("purpose");
    }

    /**
     * Getter for purpose
     * 
     * @see SlackConversation.Fields#purpose
     */
    @Nullable
    public String getPurpose(GetMode mode) {
        return getPurpose();
    }

    /**
     * Getter for purpose
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackConversation.Fields#purpose
     */
    @Nullable
    public String getPurpose() {
        if (_purposeField!= null) {
            return _purposeField;
        } else {
            Object __rawValue = super._map.get("purpose");
            _purposeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _purposeField;
        }
    }

    /**
     * Setter for purpose
     * 
     * @see SlackConversation.Fields#purpose
     */
    public SlackConversation setPurpose(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPurpose(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePurpose();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "purpose", value);
                    _purposeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "purpose", value);
                    _purposeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for purpose
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#purpose
     */
    public SlackConversation setPurpose(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field purpose of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "purpose", value);
            _purposeField = value;
        }
        return this;
    }

    /**
     * Existence checker for topic
     * 
     * @see SlackConversation.Fields#topic
     */
    public boolean hasTopic() {
        if (_topicField!= null) {
            return true;
        }
        return super._map.containsKey("topic");
    }

    /**
     * Remover for topic
     * 
     * @see SlackConversation.Fields#topic
     */
    public void removeTopic() {
        super._map.remove("topic");
    }

    /**
     * Getter for topic
     * 
     * @see SlackConversation.Fields#topic
     */
    @Nullable
    public String getTopic(GetMode mode) {
        return getTopic();
    }

    /**
     * Getter for topic
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackConversation.Fields#topic
     */
    @Nullable
    public String getTopic() {
        if (_topicField!= null) {
            return _topicField;
        } else {
            Object __rawValue = super._map.get("topic");
            _topicField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _topicField;
        }
    }

    /**
     * Setter for topic
     * 
     * @see SlackConversation.Fields#topic
     */
    public SlackConversation setTopic(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTopic(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTopic();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "topic", value);
                    _topicField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "topic", value);
                    _topicField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for topic
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackConversation.Fields#topic
     */
    public SlackConversation setTopic(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field topic of com.linkedin.dataplatform.slack.SlackConversation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "topic", value);
            _topicField = value;
        }
        return this;
    }

    @Override
    public SlackConversation clone()
        throws CloneNotSupportedException
    {
        SlackConversation __clone = ((SlackConversation) super.clone());
        __clone.__changeListener = new SlackConversation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SlackConversation copy()
        throws CloneNotSupportedException
    {
        SlackConversation __copy = ((SlackConversation) super.copy());
        __copy._isGeneralField = null;
        __copy._isChannelField = null;
        __copy._contextTeamIDField = null;
        __copy._purposeField = null;
        __copy._displayNameField = null;
        __copy._isArchivedField = null;
        __copy._topicField = null;
        __copy._isExtSharedField = null;
        __copy._idField = null;
        __copy._isPrivateField = null;
        __copy._isGroupField = null;
        __copy._isSharedField = null;
        __copy.__changeListener = new SlackConversation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SlackConversation __objectRef;

        private ChangeListener(SlackConversation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "isGeneral":
                    __objectRef._isGeneralField = null;
                    break;
                case "isChannel":
                    __objectRef._isChannelField = null;
                    break;
                case "contextTeamID":
                    __objectRef._contextTeamIDField = null;
                    break;
                case "purpose":
                    __objectRef._purposeField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "isArchived":
                    __objectRef._isArchivedField = null;
                    break;
                case "topic":
                    __objectRef._topicField = null;
                    break;
                case "isExtShared":
                    __objectRef._isExtSharedField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
                    break;
                case "isPrivate":
                    __objectRef._isPrivateField = null;
                    break;
                case "isGroup":
                    __objectRef._isGroupField = null;
                    break;
                case "isShared":
                    __objectRef._isSharedField = null;
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
         * The unique ID of the Slack conversation.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * The display name of the Slack conversation.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * If this is a channel.
         * 
         */
        public PathSpec isChannel() {
            return new PathSpec(getPathComponents(), "isChannel");
        }

        /**
         * If this is a channel.
         * 
         */
        public PathSpec isGroup() {
            return new PathSpec(getPathComponents(), "isGroup");
        }

        /**
         * If this is a private conversation.
         * 
         */
        public PathSpec isPrivate() {
            return new PathSpec(getPathComponents(), "isPrivate");
        }

        /**
         * If this conversation is archived.
         * 
         */
        public PathSpec isArchived() {
            return new PathSpec(getPathComponents(), "isArchived");
        }

        /**
         * If this is a shared channel.
         * 
         */
        public PathSpec isShared() {
            return new PathSpec(getPathComponents(), "isShared");
        }

        /**
         * If this is an externally shared channel.
         * 
         */
        public PathSpec isExtShared() {
            return new PathSpec(getPathComponents(), "isExtShared");
        }

        /**
         * If this is a general channel.
         * 
         */
        public PathSpec isGeneral() {
            return new PathSpec(getPathComponents(), "isGeneral");
        }

        /**
         * The team this conversation lives within.
         * 
         */
        public PathSpec contextTeamID() {
            return new PathSpec(getPathComponents(), "contextTeamID");
        }

        /**
         * The purpose of this Slack channel, if set.
         * 
         */
        public PathSpec purpose() {
            return new PathSpec(getPathComponents(), "purpose");
        }

        /**
         * The topic of this Slack channel, if set.
         * 
         */
        public PathSpec topic() {
            return new PathSpec(getPathComponents(), "topic");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
        }

        /**
         * The unique ID of the Slack conversation.
         * 
         */
        public SlackConversation.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The display name of the Slack conversation.
         * 
         */
        public SlackConversation.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this is a channel.
         * 
         */
        public SlackConversation.ProjectionMask withIsChannel() {
            getDataMap().put("isChannel", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this is a channel.
         * 
         */
        public SlackConversation.ProjectionMask withIsGroup() {
            getDataMap().put("isGroup", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this is a private conversation.
         * 
         */
        public SlackConversation.ProjectionMask withIsPrivate() {
            getDataMap().put("isPrivate", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this conversation is archived.
         * 
         */
        public SlackConversation.ProjectionMask withIsArchived() {
            getDataMap().put("isArchived", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this is a shared channel.
         * 
         */
        public SlackConversation.ProjectionMask withIsShared() {
            getDataMap().put("isShared", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this is an externally shared channel.
         * 
         */
        public SlackConversation.ProjectionMask withIsExtShared() {
            getDataMap().put("isExtShared", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * If this is a general channel.
         * 
         */
        public SlackConversation.ProjectionMask withIsGeneral() {
            getDataMap().put("isGeneral", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The team this conversation lives within.
         * 
         */
        public SlackConversation.ProjectionMask withContextTeamID() {
            getDataMap().put("contextTeamID", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The purpose of this Slack channel, if set.
         * 
         */
        public SlackConversation.ProjectionMask withPurpose() {
            getDataMap().put("purpose", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The topic of this Slack channel, if set.
         * 
         */
        public SlackConversation.ProjectionMask withTopic() {
            getDataMap().put("topic", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
