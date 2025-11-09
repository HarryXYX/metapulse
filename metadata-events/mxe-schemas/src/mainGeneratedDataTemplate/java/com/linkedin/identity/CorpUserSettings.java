
package com.linkedin.identity;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.event.notification.settings.NotificationSettings;


/**
 * Settings that a user can customize through the datahub ui
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpUserSettings.pdl.")
public class CorpUserSettings
    extends RecordTemplate
{

    private final static CorpUserSettings.Fields _fields = new CorpUserSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Settings that a user can customize through the datahub ui*/@Aspect.name=\"corpUserSettings\"record CorpUserSettings{/**Settings for a user around the appearance of their DataHub U*/appearance:/**Settings for a user around the appearance of their DataHub UI*/record CorpUserAppearanceSettings{/**Flag whether the user should see a homepage with only datasets, charts and dashboards. Intended for users\nwho have less operational use cases for the datahub tool.*/showSimplifiedHomepage:optional boolean/**Flag controlling whether the V2 UI for DataHub is shown.*/showThemeV2:optional boolean}/**User preferences for the Views feature.*/views:optional/**Settings related to the 'Views' feature.*/record CorpUserViewsSettings{/**The default View which is selected for the user.\nIf none is chosen, then this value will be left blank.*/defaultView:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Notification settings for a user*/notificationSettings:optional{namespace com.linkedin.event.notification.settings/**Notification settings for an actor or subscription.*/record NotificationSettings{/**Sink types that notifications are sent to.*/sinkTypes:array[{namespace com.linkedin.event.notification/**A type of sink / platform to send a notification to.*/enum NotificationSinkType{/**Slack target type.*/SLACK/**Email target type.*/EMAIL}}]/**Slack Notification Settings*/slackSettings:optional/**Slack Notification settings for an actor.*/record SlackNotificationSettings{/**Optional user handle*/userHandle:optional string/**Optional list of channels to send notifications to*/channels:optional array[string]}/**Email Notification Settings*/emailSettings:optional/**Email Notification settings for an actor.*/record EmailNotificationSettings{/**Optional user or group email address*/email:string}}}/**Settings related to the home page for a user*/homePage:optional/**Settings related to the home page for a user*/record CorpUserHomePageSettings{/**The page template that will be rendered in the UI by default for this user*/@Relationship={\"entityTypes\":[\"dataHubPageTemplate\"],\"name\":\"HasPersonalPageTemplate\"}pageTemplate:optional com.linkedin.common.Urn/**The list of announcement urns that have been dismissed by the user*/dismissedAnnouncements:optional array[com.linkedin.common.Urn]}}", SchemaFormatType.PDL));
    private CorpUserAppearanceSettings _appearanceField = null;
    private CorpUserViewsSettings _viewsField = null;
    private NotificationSettings _notificationSettingsField = null;
    private CorpUserHomePageSettings _homePageField = null;
    private CorpUserSettings.ChangeListener __changeListener = new CorpUserSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Appearance = SCHEMA.getField("appearance");
    private final static RecordDataSchema.Field FIELD_Views = SCHEMA.getField("views");
    private final static RecordDataSchema.Field FIELD_NotificationSettings = SCHEMA.getField("notificationSettings");
    private final static RecordDataSchema.Field FIELD_HomePage = SCHEMA.getField("homePage");

    public CorpUserSettings() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public CorpUserSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserSettings.Fields fields() {
        return _fields;
    }

    public static CorpUserSettings.ProjectionMask createMask() {
        return new CorpUserSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for appearance
     * 
     * @see CorpUserSettings.Fields#appearance
     */
    public boolean hasAppearance() {
        if (_appearanceField!= null) {
            return true;
        }
        return super._map.containsKey("appearance");
    }

    /**
     * Remover for appearance
     * 
     * @see CorpUserSettings.Fields#appearance
     */
    public void removeAppearance() {
        super._map.remove("appearance");
    }

    /**
     * Getter for appearance
     * 
     * @see CorpUserSettings.Fields#appearance
     */
    @Nullable
    public CorpUserAppearanceSettings getAppearance(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAppearance();
            case DEFAULT:
            case NULL:
                if (_appearanceField!= null) {
                    return _appearanceField;
                } else {
                    Object __rawValue = super._map.get("appearance");
                    _appearanceField = ((__rawValue == null)?null:new CorpUserAppearanceSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _appearanceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for appearance
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserSettings.Fields#appearance
     */
    @Nonnull
    public CorpUserAppearanceSettings getAppearance() {
        if (_appearanceField!= null) {
            return _appearanceField;
        } else {
            Object __rawValue = super._map.get("appearance");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("appearance");
            }
            _appearanceField = ((__rawValue == null)?null:new CorpUserAppearanceSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _appearanceField;
        }
    }

    /**
     * Setter for appearance
     * 
     * @see CorpUserSettings.Fields#appearance
     */
    public CorpUserSettings setAppearance(
        @Nullable
        CorpUserAppearanceSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAppearance(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field appearance of com.linkedin.identity.CorpUserSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "appearance", value.data());
                    _appearanceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAppearance();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "appearance", value.data());
                    _appearanceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "appearance", value.data());
                    _appearanceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for appearance
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserSettings.Fields#appearance
     */
    public CorpUserSettings setAppearance(
        @Nonnull
        CorpUserAppearanceSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field appearance of com.linkedin.identity.CorpUserSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "appearance", value.data());
            _appearanceField = value;
        }
        return this;
    }

    /**
     * Existence checker for views
     * 
     * @see CorpUserSettings.Fields#views
     */
    public boolean hasViews() {
        if (_viewsField!= null) {
            return true;
        }
        return super._map.containsKey("views");
    }

    /**
     * Remover for views
     * 
     * @see CorpUserSettings.Fields#views
     */
    public void removeViews() {
        super._map.remove("views");
    }

    /**
     * Getter for views
     * 
     * @see CorpUserSettings.Fields#views
     */
    @Nullable
    public CorpUserViewsSettings getViews(GetMode mode) {
        return getViews();
    }

    /**
     * Getter for views
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserSettings.Fields#views
     */
    @Nullable
    public CorpUserViewsSettings getViews() {
        if (_viewsField!= null) {
            return _viewsField;
        } else {
            Object __rawValue = super._map.get("views");
            _viewsField = ((__rawValue == null)?null:new CorpUserViewsSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _viewsField;
        }
    }

    /**
     * Setter for views
     * 
     * @see CorpUserSettings.Fields#views
     */
    public CorpUserSettings setViews(
        @Nullable
        CorpUserViewsSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setViews(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeViews();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "views", value.data());
                    _viewsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "views", value.data());
                    _viewsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for views
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserSettings.Fields#views
     */
    public CorpUserSettings setViews(
        @Nonnull
        CorpUserViewsSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field views of com.linkedin.identity.CorpUserSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "views", value.data());
            _viewsField = value;
        }
        return this;
    }

    /**
     * Existence checker for notificationSettings
     * 
     * @see CorpUserSettings.Fields#notificationSettings
     */
    public boolean hasNotificationSettings() {
        if (_notificationSettingsField!= null) {
            return true;
        }
        return super._map.containsKey("notificationSettings");
    }

    /**
     * Remover for notificationSettings
     * 
     * @see CorpUserSettings.Fields#notificationSettings
     */
    public void removeNotificationSettings() {
        super._map.remove("notificationSettings");
    }

    /**
     * Getter for notificationSettings
     * 
     * @see CorpUserSettings.Fields#notificationSettings
     */
    @Nullable
    public NotificationSettings getNotificationSettings(GetMode mode) {
        return getNotificationSettings();
    }

    /**
     * Getter for notificationSettings
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserSettings.Fields#notificationSettings
     */
    @Nullable
    public NotificationSettings getNotificationSettings() {
        if (_notificationSettingsField!= null) {
            return _notificationSettingsField;
        } else {
            Object __rawValue = super._map.get("notificationSettings");
            _notificationSettingsField = ((__rawValue == null)?null:new NotificationSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _notificationSettingsField;
        }
    }

    /**
     * Setter for notificationSettings
     * 
     * @see CorpUserSettings.Fields#notificationSettings
     */
    public CorpUserSettings setNotificationSettings(
        @Nullable
        NotificationSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNotificationSettings(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNotificationSettings();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "notificationSettings", value.data());
                    _notificationSettingsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "notificationSettings", value.data());
                    _notificationSettingsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for notificationSettings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserSettings.Fields#notificationSettings
     */
    public CorpUserSettings setNotificationSettings(
        @Nonnull
        NotificationSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field notificationSettings of com.linkedin.identity.CorpUserSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "notificationSettings", value.data());
            _notificationSettingsField = value;
        }
        return this;
    }

    /**
     * Existence checker for homePage
     * 
     * @see CorpUserSettings.Fields#homePage
     */
    public boolean hasHomePage() {
        if (_homePageField!= null) {
            return true;
        }
        return super._map.containsKey("homePage");
    }

    /**
     * Remover for homePage
     * 
     * @see CorpUserSettings.Fields#homePage
     */
    public void removeHomePage() {
        super._map.remove("homePage");
    }

    /**
     * Getter for homePage
     * 
     * @see CorpUserSettings.Fields#homePage
     */
    @Nullable
    public CorpUserHomePageSettings getHomePage(GetMode mode) {
        return getHomePage();
    }

    /**
     * Getter for homePage
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserSettings.Fields#homePage
     */
    @Nullable
    public CorpUserHomePageSettings getHomePage() {
        if (_homePageField!= null) {
            return _homePageField;
        } else {
            Object __rawValue = super._map.get("homePage");
            _homePageField = ((__rawValue == null)?null:new CorpUserHomePageSettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _homePageField;
        }
    }

    /**
     * Setter for homePage
     * 
     * @see CorpUserSettings.Fields#homePage
     */
    public CorpUserSettings setHomePage(
        @Nullable
        CorpUserHomePageSettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHomePage(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHomePage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "homePage", value.data());
                    _homePageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "homePage", value.data());
                    _homePageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for homePage
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserSettings.Fields#homePage
     */
    public CorpUserSettings setHomePage(
        @Nonnull
        CorpUserHomePageSettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field homePage of com.linkedin.identity.CorpUserSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "homePage", value.data());
            _homePageField = value;
        }
        return this;
    }

    @Override
    public CorpUserSettings clone()
        throws CloneNotSupportedException
    {
        CorpUserSettings __clone = ((CorpUserSettings) super.clone());
        __clone.__changeListener = new CorpUserSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserSettings copy()
        throws CloneNotSupportedException
    {
        CorpUserSettings __copy = ((CorpUserSettings) super.copy());
        __copy._appearanceField = null;
        __copy._homePageField = null;
        __copy._viewsField = null;
        __copy._notificationSettingsField = null;
        __copy.__changeListener = new CorpUserSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserSettings __objectRef;

        private ChangeListener(CorpUserSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "appearance":
                    __objectRef._appearanceField = null;
                    break;
                case "homePage":
                    __objectRef._homePageField = null;
                    break;
                case "views":
                    __objectRef._viewsField = null;
                    break;
                case "notificationSettings":
                    __objectRef._notificationSettingsField = null;
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
         * Settings for a user around the appearance of their DataHub U
         * 
         */
        public com.linkedin.identity.CorpUserAppearanceSettings.Fields appearance() {
            return new com.linkedin.identity.CorpUserAppearanceSettings.Fields(getPathComponents(), "appearance");
        }

        /**
         * User preferences for the Views feature.
         * 
         */
        public com.linkedin.identity.CorpUserViewsSettings.Fields views() {
            return new com.linkedin.identity.CorpUserViewsSettings.Fields(getPathComponents(), "views");
        }

        /**
         * Notification settings for a user
         * 
         */
        public com.linkedin.event.notification.settings.NotificationSettings.Fields notificationSettings() {
            return new com.linkedin.event.notification.settings.NotificationSettings.Fields(getPathComponents(), "notificationSettings");
        }

        /**
         * Settings related to the home page for a user
         * 
         */
        public com.linkedin.identity.CorpUserHomePageSettings.Fields homePage() {
            return new com.linkedin.identity.CorpUserHomePageSettings.Fields(getPathComponents(), "homePage");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.identity.CorpUserAppearanceSettings.ProjectionMask _appearanceMask;
        private com.linkedin.identity.CorpUserViewsSettings.ProjectionMask _viewsMask;
        private com.linkedin.event.notification.settings.NotificationSettings.ProjectionMask _notificationSettingsMask;
        private com.linkedin.identity.CorpUserHomePageSettings.ProjectionMask _homePageMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Settings for a user around the appearance of their DataHub U
         * 
         */
        public CorpUserSettings.ProjectionMask withAppearance(Function<com.linkedin.identity.CorpUserAppearanceSettings.ProjectionMask, com.linkedin.identity.CorpUserAppearanceSettings.ProjectionMask> nestedMask) {
            _appearanceMask = nestedMask.apply(((_appearanceMask == null)?CorpUserAppearanceSettings.createMask():_appearanceMask));
            getDataMap().put("appearance", _appearanceMask.getDataMap());
            return this;
        }

        /**
         * Settings for a user around the appearance of their DataHub U
         * 
         */
        public CorpUserSettings.ProjectionMask withAppearance() {
            _appearanceMask = null;
            getDataMap().put("appearance", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * User preferences for the Views feature.
         * 
         */
        public CorpUserSettings.ProjectionMask withViews(Function<com.linkedin.identity.CorpUserViewsSettings.ProjectionMask, com.linkedin.identity.CorpUserViewsSettings.ProjectionMask> nestedMask) {
            _viewsMask = nestedMask.apply(((_viewsMask == null)?CorpUserViewsSettings.createMask():_viewsMask));
            getDataMap().put("views", _viewsMask.getDataMap());
            return this;
        }

        /**
         * User preferences for the Views feature.
         * 
         */
        public CorpUserSettings.ProjectionMask withViews() {
            _viewsMask = null;
            getDataMap().put("views", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Notification settings for a user
         * 
         */
        public CorpUserSettings.ProjectionMask withNotificationSettings(Function<com.linkedin.event.notification.settings.NotificationSettings.ProjectionMask, com.linkedin.event.notification.settings.NotificationSettings.ProjectionMask> nestedMask) {
            _notificationSettingsMask = nestedMask.apply(((_notificationSettingsMask == null)?NotificationSettings.createMask():_notificationSettingsMask));
            getDataMap().put("notificationSettings", _notificationSettingsMask.getDataMap());
            return this;
        }

        /**
         * Notification settings for a user
         * 
         */
        public CorpUserSettings.ProjectionMask withNotificationSettings() {
            _notificationSettingsMask = null;
            getDataMap().put("notificationSettings", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Settings related to the home page for a user
         * 
         */
        public CorpUserSettings.ProjectionMask withHomePage(Function<com.linkedin.identity.CorpUserHomePageSettings.ProjectionMask, com.linkedin.identity.CorpUserHomePageSettings.ProjectionMask> nestedMask) {
            _homePageMask = nestedMask.apply(((_homePageMask == null)?CorpUserHomePageSettings.createMask():_homePageMask));
            getDataMap().put("homePage", _homePageMask.getDataMap());
            return this;
        }

        /**
         * Settings related to the home page for a user
         * 
         */
        public CorpUserSettings.ProjectionMask withHomePage() {
            _homePageMask = null;
            getDataMap().put("homePage", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
