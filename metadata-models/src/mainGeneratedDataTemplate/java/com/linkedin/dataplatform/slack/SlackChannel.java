
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
 * Information about a Slack channel.
 * Namespace for the urn of this entity should be 'slack-channel'. See GenericEntityKey.pdl for details.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataplatform/slack/SlackChannel.pdl.")
public class SlackChannel
    extends RecordTemplate
{

    private final static SlackChannel.Fields _fields = new SlackChannel.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatform.slack/**Information about a Slack channel.\nNamespace for the urn of this entity should be 'slack-channel'. See GenericEntityKey.pdl for details.*/record SlackChannel{/**The unique ID of the Slack entity. I.e., memberID, or channelID.*/id:string/**The display name of the Slack entity. I.e., if this is a member, it would be the member's name.*/displayName:string/**The topic of this Slack channel, if set.*/topic:optional string}", SchemaFormatType.PDL));
    private String _idField = null;
    private String _displayNameField = null;
    private String _topicField = null;
    private SlackChannel.ChangeListener __changeListener = new SlackChannel.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Id = SCHEMA.getField("id");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Topic = SCHEMA.getField("topic");

    public SlackChannel() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SlackChannel(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SlackChannel.Fields fields() {
        return _fields;
    }

    public static SlackChannel.ProjectionMask createMask() {
        return new SlackChannel.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for id
     * 
     * @see SlackChannel.Fields#id
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
     * @see SlackChannel.Fields#id
     */
    public void removeId() {
        super._map.remove("id");
    }

    /**
     * Getter for id
     * 
     * @see SlackChannel.Fields#id
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
     * @see SlackChannel.Fields#id
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
     * @see SlackChannel.Fields#id
     */
    public SlackChannel setId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field id of com.linkedin.dataplatform.slack.SlackChannel");
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
     * @see SlackChannel.Fields#id
     */
    public SlackChannel setId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field id of com.linkedin.dataplatform.slack.SlackChannel to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "id", value);
            _idField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see SlackChannel.Fields#displayName
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
     * @see SlackChannel.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see SlackChannel.Fields#displayName
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
     * @see SlackChannel.Fields#displayName
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
     * @see SlackChannel.Fields#displayName
     */
    public SlackChannel setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field displayName of com.linkedin.dataplatform.slack.SlackChannel");
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
     * @see SlackChannel.Fields#displayName
     */
    public SlackChannel setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.dataplatform.slack.SlackChannel to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for topic
     * 
     * @see SlackChannel.Fields#topic
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
     * @see SlackChannel.Fields#topic
     */
    public void removeTopic() {
        super._map.remove("topic");
    }

    /**
     * Getter for topic
     * 
     * @see SlackChannel.Fields#topic
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
     * @see SlackChannel.Fields#topic
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
     * @see SlackChannel.Fields#topic
     */
    public SlackChannel setTopic(
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
     * @see SlackChannel.Fields#topic
     */
    public SlackChannel setTopic(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field topic of com.linkedin.dataplatform.slack.SlackChannel to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "topic", value);
            _topicField = value;
        }
        return this;
    }

    @Override
    public SlackChannel clone()
        throws CloneNotSupportedException
    {
        SlackChannel __clone = ((SlackChannel) super.clone());
        __clone.__changeListener = new SlackChannel.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SlackChannel copy()
        throws CloneNotSupportedException
    {
        SlackChannel __copy = ((SlackChannel) super.copy());
        __copy._displayNameField = null;
        __copy._topicField = null;
        __copy._idField = null;
        __copy.__changeListener = new SlackChannel.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SlackChannel __objectRef;

        private ChangeListener(SlackChannel reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "topic":
                    __objectRef._topicField = null;
                    break;
                case "id":
                    __objectRef._idField = null;
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
         * The unique ID of the Slack entity. I.e., memberID, or channelID.
         * 
         */
        public PathSpec id() {
            return new PathSpec(getPathComponents(), "id");
        }

        /**
         * The display name of the Slack entity. I.e., if this is a member, it would be the member's name.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
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
            super(4);
        }

        /**
         * The unique ID of the Slack entity. I.e., memberID, or channelID.
         * 
         */
        public SlackChannel.ProjectionMask withId() {
            getDataMap().put("id", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The display name of the Slack entity. I.e., if this is a member, it would be the member's name.
         * 
         */
        public SlackChannel.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The topic of this Slack channel, if set.
         * 
         */
        public SlackChannel.ProjectionMask withTopic() {
            getDataMap().put("topic", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
