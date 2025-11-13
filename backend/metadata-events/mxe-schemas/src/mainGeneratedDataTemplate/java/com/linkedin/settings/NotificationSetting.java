
package com.linkedin.settings;

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
import com.linkedin.data.template.StringMap;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/NotificationSetting.pdl.")
public class NotificationSetting
    extends RecordTemplate
{

    private final static NotificationSetting.Fields _fields = new NotificationSetting.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings,record NotificationSetting{/**Integrations between DataHub & other platforms.*/value:enum NotificationSettingValue{/**Setting is enabled.*/ENABLED/**Setting is disabled.*/DISABLED}/**Custom set of setting parameters.*/params:optional map[string,string]}", SchemaFormatType.PDL));
    private NotificationSettingValue _valueField = null;
    private StringMap _paramsField = null;
    private NotificationSetting.ChangeListener __changeListener = new NotificationSetting.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Params = SCHEMA.getField("params");

    public NotificationSetting() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public NotificationSetting(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static NotificationSetting.Fields fields() {
        return _fields;
    }

    public static NotificationSetting.ProjectionMask createMask() {
        return new NotificationSetting.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see NotificationSetting.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see NotificationSetting.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see NotificationSetting.Fields#value
     */
    @Nullable
    public NotificationSettingValue getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceEnumOutput(__rawValue, NotificationSettingValue.class, NotificationSettingValue.$UNKNOWN);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see NotificationSetting.Fields#value
     */
    @Nonnull
    public NotificationSettingValue getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceEnumOutput(__rawValue, NotificationSettingValue.class, NotificationSettingValue.$UNKNOWN);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see NotificationSetting.Fields#value
     */
    public NotificationSetting setValue(
        @Nullable
        NotificationSettingValue value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.settings.NotificationSetting");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.name());
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.name());
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.name());
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotificationSetting.Fields#value
     */
    public NotificationSetting setValue(
        @Nonnull
        NotificationSettingValue value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.settings.NotificationSetting to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value.name());
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for params
     * 
     * @see NotificationSetting.Fields#params
     */
    public boolean hasParams() {
        if (_paramsField!= null) {
            return true;
        }
        return super._map.containsKey("params");
    }

    /**
     * Remover for params
     * 
     * @see NotificationSetting.Fields#params
     */
    public void removeParams() {
        super._map.remove("params");
    }

    /**
     * Getter for params
     * 
     * @see NotificationSetting.Fields#params
     */
    @Nullable
    public StringMap getParams(GetMode mode) {
        return getParams();
    }

    /**
     * Getter for params
     * 
     * @return
     *     Optional field. Always check for null.
     * @see NotificationSetting.Fields#params
     */
    @Nullable
    public StringMap getParams() {
        if (_paramsField!= null) {
            return _paramsField;
        } else {
            Object __rawValue = super._map.get("params");
            _paramsField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _paramsField;
        }
    }

    /**
     * Setter for params
     * 
     * @see NotificationSetting.Fields#params
     */
    public NotificationSetting setParams(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "params", value.data());
                    _paramsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for params
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see NotificationSetting.Fields#params
     */
    public NotificationSetting setParams(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field params of com.linkedin.settings.NotificationSetting to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "params", value.data());
            _paramsField = value;
        }
        return this;
    }

    @Override
    public NotificationSetting clone()
        throws CloneNotSupportedException
    {
        NotificationSetting __clone = ((NotificationSetting) super.clone());
        __clone.__changeListener = new NotificationSetting.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public NotificationSetting copy()
        throws CloneNotSupportedException
    {
        NotificationSetting __copy = ((NotificationSetting) super.copy());
        __copy._paramsField = null;
        __copy._valueField = null;
        __copy.__changeListener = new NotificationSetting.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final NotificationSetting __objectRef;

        private ChangeListener(NotificationSetting reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "params":
                    __objectRef._paramsField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
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
         * Integrations between DataHub & other platforms.
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * Custom set of setting parameters.
         * 
         */
        public PathSpec params() {
            return new PathSpec(getPathComponents(), "params");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Integrations between DataHub & other platforms.
         * 
         */
        public NotificationSetting.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Custom set of setting parameters.
         * 
         */
        public NotificationSetting.ProjectionMask withParams() {
            getDataMap().put("params", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
