
package com.linkedin.event.notification.settings;

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
 * Email Notification settings for an actor.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/event/notification/settings/EmailNotificationSettings.pdl.")
public class EmailNotificationSettings
    extends RecordTemplate
{

    private final static EmailNotificationSettings.Fields _fields = new EmailNotificationSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.event.notification.settings/**Email Notification settings for an actor.*/record EmailNotificationSettings{/**Optional user or group email address*/email:string}", SchemaFormatType.PDL));
    private String _emailField = null;
    private EmailNotificationSettings.ChangeListener __changeListener = new EmailNotificationSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");

    public EmailNotificationSettings() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public EmailNotificationSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EmailNotificationSettings.Fields fields() {
        return _fields;
    }

    public static EmailNotificationSettings.ProjectionMask createMask() {
        return new EmailNotificationSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for email
     * 
     * @see EmailNotificationSettings.Fields#email
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
     * @see EmailNotificationSettings.Fields#email
     */
    public void removeEmail() {
        super._map.remove("email");
    }

    /**
     * Getter for email
     * 
     * @see EmailNotificationSettings.Fields#email
     */
    @Nullable
    public String getEmail(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEmail();
            case DEFAULT:
            case NULL:
                if (_emailField!= null) {
                    return _emailField;
                } else {
                    Object __rawValue = super._map.get("email");
                    _emailField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _emailField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for email
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EmailNotificationSettings.Fields#email
     */
    @Nonnull
    public String getEmail() {
        if (_emailField!= null) {
            return _emailField;
        } else {
            Object __rawValue = super._map.get("email");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("email");
            }
            _emailField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _emailField;
        }
    }

    /**
     * Setter for email
     * 
     * @see EmailNotificationSettings.Fields#email
     */
    public EmailNotificationSettings setEmail(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEmail(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field email of com.linkedin.event.notification.settings.EmailNotificationSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
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
     * @see EmailNotificationSettings.Fields#email
     */
    public EmailNotificationSettings setEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field email of com.linkedin.event.notification.settings.EmailNotificationSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "email", value);
            _emailField = value;
        }
        return this;
    }

    @Override
    public EmailNotificationSettings clone()
        throws CloneNotSupportedException
    {
        EmailNotificationSettings __clone = ((EmailNotificationSettings) super.clone());
        __clone.__changeListener = new EmailNotificationSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EmailNotificationSettings copy()
        throws CloneNotSupportedException
    {
        EmailNotificationSettings __copy = ((EmailNotificationSettings) super.copy());
        __copy._emailField = null;
        __copy.__changeListener = new EmailNotificationSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EmailNotificationSettings __objectRef;

        private ChangeListener(EmailNotificationSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * Optional user or group email address
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Optional user or group email address
         * 
         */
        public EmailNotificationSettings.ProjectionMask withEmail() {
            getDataMap().put("email", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
