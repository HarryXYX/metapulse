
package com.linkedin.event.notification.settings;

import java.util.List;
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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Slack Notification settings for an actor.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/event/notification/settings/SlackNotificationSettings.pdl.")
public class SlackNotificationSettings
    extends RecordTemplate
{

    private final static SlackNotificationSettings.Fields _fields = new SlackNotificationSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.event.notification.settings/**Slack Notification settings for an actor.*/record SlackNotificationSettings{/**Optional user handle*/userHandle:optional string/**Optional list of channels to send notifications to*/channels:optional array[string]}", SchemaFormatType.PDL));
    private String _userHandleField = null;
    private StringArray _channelsField = null;
    private SlackNotificationSettings.ChangeListener __changeListener = new SlackNotificationSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_UserHandle = SCHEMA.getField("userHandle");
    private final static RecordDataSchema.Field FIELD_Channels = SCHEMA.getField("channels");

    public SlackNotificationSettings() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SlackNotificationSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SlackNotificationSettings.Fields fields() {
        return _fields;
    }

    public static SlackNotificationSettings.ProjectionMask createMask() {
        return new SlackNotificationSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for userHandle
     * 
     * @see SlackNotificationSettings.Fields#userHandle
     */
    public boolean hasUserHandle() {
        if (_userHandleField!= null) {
            return true;
        }
        return super._map.containsKey("userHandle");
    }

    /**
     * Remover for userHandle
     * 
     * @see SlackNotificationSettings.Fields#userHandle
     */
    public void removeUserHandle() {
        super._map.remove("userHandle");
    }

    /**
     * Getter for userHandle
     * 
     * @see SlackNotificationSettings.Fields#userHandle
     */
    @Nullable
    public String getUserHandle(GetMode mode) {
        return getUserHandle();
    }

    /**
     * Getter for userHandle
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackNotificationSettings.Fields#userHandle
     */
    @Nullable
    public String getUserHandle() {
        if (_userHandleField!= null) {
            return _userHandleField;
        } else {
            Object __rawValue = super._map.get("userHandle");
            _userHandleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _userHandleField;
        }
    }

    /**
     * Setter for userHandle
     * 
     * @see SlackNotificationSettings.Fields#userHandle
     */
    public SlackNotificationSettings setUserHandle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUserHandle(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUserHandle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "userHandle", value);
                    _userHandleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "userHandle", value);
                    _userHandleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for userHandle
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackNotificationSettings.Fields#userHandle
     */
    public SlackNotificationSettings setUserHandle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field userHandle of com.linkedin.event.notification.settings.SlackNotificationSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "userHandle", value);
            _userHandleField = value;
        }
        return this;
    }

    /**
     * Existence checker for channels
     * 
     * @see SlackNotificationSettings.Fields#channels
     */
    public boolean hasChannels() {
        if (_channelsField!= null) {
            return true;
        }
        return super._map.containsKey("channels");
    }

    /**
     * Remover for channels
     * 
     * @see SlackNotificationSettings.Fields#channels
     */
    public void removeChannels() {
        super._map.remove("channels");
    }

    /**
     * Getter for channels
     * 
     * @see SlackNotificationSettings.Fields#channels
     */
    @Nullable
    public StringArray getChannels(GetMode mode) {
        return getChannels();
    }

    /**
     * Getter for channels
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SlackNotificationSettings.Fields#channels
     */
    @Nullable
    public StringArray getChannels() {
        if (_channelsField!= null) {
            return _channelsField;
        } else {
            Object __rawValue = super._map.get("channels");
            _channelsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _channelsField;
        }
    }

    /**
     * Setter for channels
     * 
     * @see SlackNotificationSettings.Fields#channels
     */
    public SlackNotificationSettings setChannels(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChannels(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChannels();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "channels", value.data());
                    _channelsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "channels", value.data());
                    _channelsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for channels
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SlackNotificationSettings.Fields#channels
     */
    public SlackNotificationSettings setChannels(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field channels of com.linkedin.event.notification.settings.SlackNotificationSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "channels", value.data());
            _channelsField = value;
        }
        return this;
    }

    @Override
    public SlackNotificationSettings clone()
        throws CloneNotSupportedException
    {
        SlackNotificationSettings __clone = ((SlackNotificationSettings) super.clone());
        __clone.__changeListener = new SlackNotificationSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SlackNotificationSettings copy()
        throws CloneNotSupportedException
    {
        SlackNotificationSettings __copy = ((SlackNotificationSettings) super.copy());
        __copy._userHandleField = null;
        __copy._channelsField = null;
        __copy.__changeListener = new SlackNotificationSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SlackNotificationSettings __objectRef;

        private ChangeListener(SlackNotificationSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "userHandle":
                    __objectRef._userHandleField = null;
                    break;
                case "channels":
                    __objectRef._channelsField = null;
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
         * Optional user handle
         * 
         */
        public PathSpec userHandle() {
            return new PathSpec(getPathComponents(), "userHandle");
        }

        /**
         * Optional list of channels to send notifications to
         * 
         */
        public PathSpec channels() {
            return new PathSpec(getPathComponents(), "channels");
        }

        /**
         * Optional list of channels to send notifications to
         * 
         */
        public PathSpec channels(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "channels");
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


        ProjectionMask() {
            super(3);
        }

        /**
         * Optional user handle
         * 
         */
        public SlackNotificationSettings.ProjectionMask withUserHandle() {
            getDataMap().put("userHandle", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of channels to send notifications to
         * 
         */
        public SlackNotificationSettings.ProjectionMask withChannels() {
            getDataMap().put("channels", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of channels to send notifications to
         * 
         */
        public SlackNotificationSettings.ProjectionMask withChannels(Integer start, Integer count) {
            getDataMap().put("channels", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("channels").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("channels").put("$count", count);
            }
            return this;
        }

    }

}
