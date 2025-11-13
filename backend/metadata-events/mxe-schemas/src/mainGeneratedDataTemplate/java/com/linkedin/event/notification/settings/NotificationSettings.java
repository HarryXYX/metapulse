
package com.linkedin.event.notification.settings;

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
import com.linkedin.event.notification.NotificationSinkTypeArray;


/**
 * Notification settings for an actor or subscription.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/event/notification/settings/NotificationSettings.pdl.")
public class NotificationSettings
    extends RecordTemplate
{

    private final static NotificationSettings.Fields _fields = new NotificationSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.event.notification.settings/**Notification settings for an actor or subscription.*/record NotificationSettings{/**Sink types that notifications are sent to.*/sinkTypes:array[{namespace com.linkedin.event.notification/**A type of sink / platform to send a notification to.*/enum NotificationSinkType{/**Slack target type.*/SLACK/**Email target type.*/EMAIL}}]/**Slack Notification Settings*/slackSettings:optional/**Slack Notification settings for an actor.*/record SlackNotificationSettings{/**Optional user handle*/userHandle:optional string/**Optional list of channels to send notifications to*/channels:optional array[string]}/**Email Notification Settings*/emailSettings:optional/**Email Notification settings for an actor.*/record EmailNotificationSettings{/**Optional user or group email address*/email:string}}", SchemaFormatType.PDL));
    private NotificationSinkTypeArray _sinkTypesField = null;
    private SlackNotificationSettings _slackSettingsField = null;
    private EmailNotificationSettings _emailSettingsField = null;
    private NotificationSettings.ChangeListener __changeListener = new NotificationSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SinkTypes = SCHEMA.getField("sinkTypes");
    private final static RecordDataSchema.Field FIELD_SlackSettings = SCHEMA.getField("slackSettings");
    private final static RecordDataSchema.Field FIELD_EmailSettings = SCHEMA.getField("emailSettings");

    public NotificationSettings() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public NotificationSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NotificationSettings.Fields fields() {
        return _fields;
    }

    public static NotificationSettings.ProjectionMask createMask() {
        return new NotificationSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for sinkTypes
     * 
     * @see NotificationSettings.Fields#sinkTypes
     */
    public boolean hasSinkTypes() {
        if (_sinkTypesField!= null) {
            return true;
        }
        return super._map.containsKey("sinkTypes");
    }

    /**
     * Remover for sinkTypes
     * 
     * @see NotificationSettings.Fields#sinkTypes
     */
    public void removeSinkTypes() {
        super._map.remove("sinkTypes");
    }

    /**
     * Getter for sinkTypes
     * 
     * @see NotificationSettings.Fields#sinkTypes
     */
    @Nullable
    public NotificationSinkTypeArray getSinkTypes(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSinkTypes();
            case DEFAULT:
            case NULL:
                if (_sinkTypesField!= null) {
                    return _sinkTypesField;
                } else {
                    Object __rawValue = super._map.get("sinkTypes");
                    _sinkTypesField = ((__rawValue == null)?null:new NotificationSinkTypeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _sinkTypesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sinkTypes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NotificationSettings.Fields#sinkTypes
     */
    @Nonnull
    public NotificationSinkTypeArray getSinkTypes() {
        if (_sinkTypesField!= null) {
            return _sinkTypesField;
        } else {
            Object __rawValue = super._map.get("sinkTypes");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sinkTypes");
            }
            _sinkTypesField = ((__rawValue == null)?null:new NotificationSinkTypeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _sinkTypesField;
        }
    }

    /**
     * Setter for sinkTypes
     * 
     * @see NotificationSettings.Fields#sinkTypes
     */
    public NotificationSettings setSinkTypes(
        @Nullable
        NotificationSinkTypeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSinkTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sinkTypes of com.linkedin.event.notification.settings.NotificationSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sinkTypes", value.data());
                    _sinkTypesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSinkTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sinkTypes", value.data());
                    _sinkTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sinkTypes", value.data());
                    _sinkTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sinkTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotificationSettings.Fields#sinkTypes
     */
    public NotificationSettings setSinkTypes(
        @Nonnull
        NotificationSinkTypeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sinkTypes of com.linkedin.event.notification.settings.NotificationSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sinkTypes", value.data());
            _sinkTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for slackSettings
     * 
     * @see NotificationSettings.Fields#slackSettings
     */
    public boolean hasSlackSettings() {
        if (_slackSettingsField!= null) {
            return true;
        }
        return super._map.containsKey("slackSettings");
    }

    /**
     * Remover for slackSettings
     * 
     * @see NotificationSettings.Fields#slackSettings
     */
    public void removeSlackSettings() {
        super._map.remove("slackSettings");
    }

    /**
     * Getter for slackSettings
     * 
     * @see NotificationSettings.Fields#slackSettings
     */
    @Nullable
    public SlackNotificationSettings getSlackSettings(GetMode mode) {
        return getSlackSettings();
    }

    /**
     * Getter for slackSettings
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NotificationSettings.Fields#slackSettings
     */
    @Nullable
    public SlackNotificationSettings getSlackSettings() {
        if (_slackSettingsField!= null) {
            return _slackSettingsField;
        } else {
            Object __rawValue = super._map.get("slackSettings");
            _slackSettingsField = ((__rawValue == null)?null:new SlackNotificationSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _slackSettingsField;
        }
    }

    /**
     * Setter for slackSettings
     * 
     * @see NotificationSettings.Fields#slackSettings
     */
    public NotificationSettings setSlackSettings(
        @Nullable
        SlackNotificationSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSlackSettings(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSlackSettings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "slackSettings", value.data());
                    _slackSettingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "slackSettings", value.data());
                    _slackSettingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for slackSettings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotificationSettings.Fields#slackSettings
     */
    public NotificationSettings setSlackSettings(
        @Nonnull
        SlackNotificationSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field slackSettings of com.linkedin.event.notification.settings.NotificationSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "slackSettings", value.data());
            _slackSettingsField = value;
        }
        return this;
    }

    /**
     * Existence checker for emailSettings
     * 
     * @see NotificationSettings.Fields#emailSettings
     */
    public boolean hasEmailSettings() {
        if (_emailSettingsField!= null) {
            return true;
        }
        return super._map.containsKey("emailSettings");
    }

    /**
     * Remover for emailSettings
     * 
     * @see NotificationSettings.Fields#emailSettings
     */
    public void removeEmailSettings() {
        super._map.remove("emailSettings");
    }

    /**
     * Getter for emailSettings
     * 
     * @see NotificationSettings.Fields#emailSettings
     */
    @Nullable
    public EmailNotificationSettings getEmailSettings(GetMode mode) {
        return getEmailSettings();
    }

    /**
     * Getter for emailSettings
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NotificationSettings.Fields#emailSettings
     */
    @Nullable
    public EmailNotificationSettings getEmailSettings() {
        if (_emailSettingsField!= null) {
            return _emailSettingsField;
        } else {
            Object __rawValue = super._map.get("emailSettings");
            _emailSettingsField = ((__rawValue == null)?null:new EmailNotificationSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _emailSettingsField;
        }
    }

    /**
     * Setter for emailSettings
     * 
     * @see NotificationSettings.Fields#emailSettings
     */
    public NotificationSettings setEmailSettings(
        @Nullable
        EmailNotificationSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEmailSettings(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEmailSettings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "emailSettings", value.data());
                    _emailSettingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "emailSettings", value.data());
                    _emailSettingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for emailSettings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotificationSettings.Fields#emailSettings
     */
    public NotificationSettings setEmailSettings(
        @Nonnull
        EmailNotificationSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field emailSettings of com.linkedin.event.notification.settings.NotificationSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "emailSettings", value.data());
            _emailSettingsField = value;
        }
        return this;
    }

    @Override
    public NotificationSettings clone()
        throws CloneNotSupportedException
    {
        NotificationSettings __clone = ((NotificationSettings) super.clone());
        __clone.__changeListener = new NotificationSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NotificationSettings copy()
        throws CloneNotSupportedException
    {
        NotificationSettings __copy = ((NotificationSettings) super.copy());
        __copy._slackSettingsField = null;
        __copy._sinkTypesField = null;
        __copy._emailSettingsField = null;
        __copy.__changeListener = new NotificationSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NotificationSettings __objectRef;

        private ChangeListener(NotificationSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "slackSettings":
                    __objectRef._slackSettingsField = null;
                    break;
                case "sinkTypes":
                    __objectRef._sinkTypesField = null;
                    break;
                case "emailSettings":
                    __objectRef._emailSettingsField = null;
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
         * Sink types that notifications are sent to.
         * 
         */
        public PathSpec sinkTypes() {
            return new PathSpec(getPathComponents(), "sinkTypes");
        }

        /**
         * Sink types that notifications are sent to.
         * 
         */
        public PathSpec sinkTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sinkTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Slack Notification Settings
         * 
         */
        public com.linkedin.event.notification.settings.SlackNotificationSettings.Fields slackSettings() {
            return new com.linkedin.event.notification.settings.SlackNotificationSettings.Fields(getPathComponents(), "slackSettings");
        }

        /**
         * Email Notification Settings
         * 
         */
        public com.linkedin.event.notification.settings.EmailNotificationSettings.Fields emailSettings() {
            return new com.linkedin.event.notification.settings.EmailNotificationSettings.Fields(getPathComponents(), "emailSettings");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.event.notification.settings.SlackNotificationSettings.ProjectionMask _slackSettingsMask;
        private com.linkedin.event.notification.settings.EmailNotificationSettings.ProjectionMask _emailSettingsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Sink types that notifications are sent to.
         * 
         */
        public NotificationSettings.ProjectionMask withSinkTypes() {
            getDataMap().put("sinkTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Sink types that notifications are sent to.
         * 
         */
        public NotificationSettings.ProjectionMask withSinkTypes(Integer start, Integer count) {
            getDataMap().put("sinkTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("sinkTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("sinkTypes").put("$count", count);
            }
            return this;
        }

        /**
         * Slack Notification Settings
         * 
         */
        public NotificationSettings.ProjectionMask withSlackSettings(Function<com.linkedin.event.notification.settings.SlackNotificationSettings.ProjectionMask, com.linkedin.event.notification.settings.SlackNotificationSettings.ProjectionMask> nestedMask) {
            _slackSettingsMask = nestedMask.apply(((_slackSettingsMask == null)?SlackNotificationSettings.createMask():_slackSettingsMask));
            getDataMap().put("slackSettings", _slackSettingsMask.getDataMap());
            return this;
        }

        /**
         * Slack Notification Settings
         * 
         */
        public NotificationSettings.ProjectionMask withSlackSettings() {
            _slackSettingsMask = null;
            getDataMap().put("slackSettings", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Email Notification Settings
         * 
         */
        public NotificationSettings.ProjectionMask withEmailSettings(Function<com.linkedin.event.notification.settings.EmailNotificationSettings.ProjectionMask, com.linkedin.event.notification.settings.EmailNotificationSettings.ProjectionMask> nestedMask) {
            _emailSettingsMask = nestedMask.apply(((_emailSettingsMask == null)?EmailNotificationSettings.createMask():_emailSettingsMask));
            getDataMap().put("emailSettings", _emailSettingsMask.getDataMap());
            return this;
        }

        /**
         * Email Notification Settings
         * 
         */
        public NotificationSettings.ProjectionMask withEmailSettings() {
            _emailSettingsMask = null;
            getDataMap().put("emailSettings", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
