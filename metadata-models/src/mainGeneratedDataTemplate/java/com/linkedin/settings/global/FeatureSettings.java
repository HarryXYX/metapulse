
package com.linkedin.settings.global;

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
 * A standardized settings template for a feature.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/global/FeatureSettings.pdl.")
public class FeatureSettings
    extends RecordTemplate
{

    private final static FeatureSettings.Fields _fields = new FeatureSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**A standardized settings template for a feature.*/record FeatureSettings{enabled:boolean/**The configuration for the feature, in JSON format.*/config:optional string/**The version of the configuration schema that has been used to serialize\n       the config.\nIf not provided, the version is assumed to be the latest version.*/configVersion:optional string}", SchemaFormatType.PDL));
    private Boolean _enabledField = null;
    private String _configField = null;
    private String _configVersionField = null;
    private FeatureSettings.ChangeListener __changeListener = new FeatureSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Enabled = SCHEMA.getField("enabled");
    private final static RecordDataSchema.Field FIELD_Config = SCHEMA.getField("config");
    private final static RecordDataSchema.Field FIELD_ConfigVersion = SCHEMA.getField("configVersion");

    public FeatureSettings() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FeatureSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FeatureSettings.Fields fields() {
        return _fields;
    }

    public static FeatureSettings.ProjectionMask createMask() {
        return new FeatureSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for enabled
     * 
     * @see FeatureSettings.Fields#enabled
     */
    public boolean hasEnabled() {
        if (_enabledField!= null) {
            return true;
        }
        return super._map.containsKey("enabled");
    }

    /**
     * Remover for enabled
     * 
     * @see FeatureSettings.Fields#enabled
     */
    public void removeEnabled() {
        super._map.remove("enabled");
    }

    /**
     * Getter for enabled
     * 
     * @see FeatureSettings.Fields#enabled
     */
    @Nullable
    public Boolean isEnabled(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isEnabled();
            case DEFAULT:
            case NULL:
                if (_enabledField!= null) {
                    return _enabledField;
                } else {
                    Object __rawValue = super._map.get("enabled");
                    _enabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _enabledField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for enabled
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FeatureSettings.Fields#enabled
     */
    @Nonnull
    public Boolean isEnabled() {
        if (_enabledField!= null) {
            return _enabledField;
        } else {
            Object __rawValue = super._map.get("enabled");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("enabled");
            }
            _enabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _enabledField;
        }
    }

    /**
     * Setter for enabled
     * 
     * @see FeatureSettings.Fields#enabled
     */
    public FeatureSettings setEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field enabled of com.linkedin.settings.global.FeatureSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "enabled", value);
                    _enabledField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEnabled();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "enabled", value);
                    _enabledField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "enabled", value);
                    _enabledField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for enabled
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FeatureSettings.Fields#enabled
     */
    public FeatureSettings setEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field enabled of com.linkedin.settings.global.FeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "enabled", value);
            _enabledField = value;
        }
        return this;
    }

    /**
     * Setter for enabled
     * 
     * @see FeatureSettings.Fields#enabled
     */
    public FeatureSettings setEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "enabled", value);
        _enabledField = value;
        return this;
    }

    /**
     * Existence checker for config
     * 
     * @see FeatureSettings.Fields#config
     */
    public boolean hasConfig() {
        if (_configField!= null) {
            return true;
        }
        return super._map.containsKey("config");
    }

    /**
     * Remover for config
     * 
     * @see FeatureSettings.Fields#config
     */
    public void removeConfig() {
        super._map.remove("config");
    }

    /**
     * Getter for config
     * 
     * @see FeatureSettings.Fields#config
     */
    @Nullable
    public String getConfig(GetMode mode) {
        return getConfig();
    }

    /**
     * Getter for config
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FeatureSettings.Fields#config
     */
    @Nullable
    public String getConfig() {
        if (_configField!= null) {
            return _configField;
        } else {
            Object __rawValue = super._map.get("config");
            _configField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _configField;
        }
    }

    /**
     * Setter for config
     * 
     * @see FeatureSettings.Fields#config
     */
    public FeatureSettings setConfig(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setConfig(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeConfig();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "config", value);
                    _configField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "config", value);
                    _configField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for config
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FeatureSettings.Fields#config
     */
    public FeatureSettings setConfig(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field config of com.linkedin.settings.global.FeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "config", value);
            _configField = value;
        }
        return this;
    }

    /**
     * Existence checker for configVersion
     * 
     * @see FeatureSettings.Fields#configVersion
     */
    public boolean hasConfigVersion() {
        if (_configVersionField!= null) {
            return true;
        }
        return super._map.containsKey("configVersion");
    }

    /**
     * Remover for configVersion
     * 
     * @see FeatureSettings.Fields#configVersion
     */
    public void removeConfigVersion() {
        super._map.remove("configVersion");
    }

    /**
     * Getter for configVersion
     * 
     * @see FeatureSettings.Fields#configVersion
     */
    @Nullable
    public String getConfigVersion(GetMode mode) {
        return getConfigVersion();
    }

    /**
     * Getter for configVersion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FeatureSettings.Fields#configVersion
     */
    @Nullable
    public String getConfigVersion() {
        if (_configVersionField!= null) {
            return _configVersionField;
        } else {
            Object __rawValue = super._map.get("configVersion");
            _configVersionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _configVersionField;
        }
    }

    /**
     * Setter for configVersion
     * 
     * @see FeatureSettings.Fields#configVersion
     */
    public FeatureSettings setConfigVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setConfigVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeConfigVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "configVersion", value);
                    _configVersionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "configVersion", value);
                    _configVersionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for configVersion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FeatureSettings.Fields#configVersion
     */
    public FeatureSettings setConfigVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field configVersion of com.linkedin.settings.global.FeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "configVersion", value);
            _configVersionField = value;
        }
        return this;
    }

    @Override
    public FeatureSettings clone()
        throws CloneNotSupportedException
    {
        FeatureSettings __clone = ((FeatureSettings) super.clone());
        __clone.__changeListener = new FeatureSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FeatureSettings copy()
        throws CloneNotSupportedException
    {
        FeatureSettings __copy = ((FeatureSettings) super.copy());
        __copy._configVersionField = null;
        __copy._configField = null;
        __copy._enabledField = null;
        __copy.__changeListener = new FeatureSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FeatureSettings __objectRef;

        private ChangeListener(FeatureSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "configVersion":
                    __objectRef._configVersionField = null;
                    break;
                case "config":
                    __objectRef._configField = null;
                    break;
                case "enabled":
                    __objectRef._enabledField = null;
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

        public PathSpec enabled() {
            return new PathSpec(getPathComponents(), "enabled");
        }

        /**
         * The configuration for the feature, in JSON format.
         * 
         */
        public PathSpec config() {
            return new PathSpec(getPathComponents(), "config");
        }

        /**
         * The version of the configuration schema that has been used to serialize
         *        the config.
         * If not provided, the version is assumed to be the latest version.
         * 
         */
        public PathSpec configVersion() {
            return new PathSpec(getPathComponents(), "configVersion");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        public FeatureSettings.ProjectionMask withEnabled() {
            getDataMap().put("enabled", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The configuration for the feature, in JSON format.
         * 
         */
        public FeatureSettings.ProjectionMask withConfig() {
            getDataMap().put("config", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version of the configuration schema that has been used to serialize
         *        the config.
         * If not provided, the version is assumed to be the latest version.
         * 
         */
        public FeatureSettings.ProjectionMask withConfigVersion() {
            getDataMap().put("configVersion", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
