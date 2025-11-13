
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/global/DocPropagationFeatureSettings.pdl.")
public class DocPropagationFeatureSettings
    extends RecordTemplate
{

    private final static DocPropagationFeatureSettings.Fields _fields = new DocPropagationFeatureSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global,record DocPropagationFeatureSettings includes/**A standardized settings template for a feature.*/record FeatureSettings{enabled:boolean/**The configuration for the feature, in JSON format.*/config:optional string/**The version of the configuration schema that has been used to serialize\n       the config.\nIf not provided, the version is assumed to be the latest version.*/configVersion:optional string}{columnPropagationEnabled:boolean=true}", SchemaFormatType.PDL));
    private Boolean _enabledField = null;
    private String _configField = null;
    private String _configVersionField = null;
    private Boolean _columnPropagationEnabledField = null;
    private DocPropagationFeatureSettings.ChangeListener __changeListener = new DocPropagationFeatureSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Enabled = SCHEMA.getField("enabled");
    private final static RecordDataSchema.Field FIELD_Config = SCHEMA.getField("config");
    private final static RecordDataSchema.Field FIELD_ConfigVersion = SCHEMA.getField("configVersion");
    private final static RecordDataSchema.Field FIELD_ColumnPropagationEnabled = SCHEMA.getField("columnPropagationEnabled");
    private final static Boolean DEFAULT_ColumnPropagationEnabled;

    static {
        DEFAULT_ColumnPropagationEnabled = DataTemplateUtil.coerceBooleanOutput(FIELD_ColumnPropagationEnabled.getDefault());
    }

    public DocPropagationFeatureSettings() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DocPropagationFeatureSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DocPropagationFeatureSettings.Fields fields() {
        return _fields;
    }

    public static DocPropagationFeatureSettings.ProjectionMask createMask() {
        return new DocPropagationFeatureSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for enabled
     * 
     * @see DocPropagationFeatureSettings.Fields#enabled
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
     * @see DocPropagationFeatureSettings.Fields#enabled
     */
    public void removeEnabled() {
        super._map.remove("enabled");
    }

    /**
     * Getter for enabled
     * 
     * @see DocPropagationFeatureSettings.Fields#enabled
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
     * @see DocPropagationFeatureSettings.Fields#enabled
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
     * @see DocPropagationFeatureSettings.Fields#enabled
     */
    public DocPropagationFeatureSettings setEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field enabled of com.linkedin.settings.global.DocPropagationFeatureSettings");
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
     * @see DocPropagationFeatureSettings.Fields#enabled
     */
    public DocPropagationFeatureSettings setEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field enabled of com.linkedin.settings.global.DocPropagationFeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "enabled", value);
            _enabledField = value;
        }
        return this;
    }

    /**
     * Setter for enabled
     * 
     * @see DocPropagationFeatureSettings.Fields#enabled
     */
    public DocPropagationFeatureSettings setEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "enabled", value);
        _enabledField = value;
        return this;
    }

    /**
     * Existence checker for config
     * 
     * @see DocPropagationFeatureSettings.Fields#config
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
     * @see DocPropagationFeatureSettings.Fields#config
     */
    public void removeConfig() {
        super._map.remove("config");
    }

    /**
     * Getter for config
     * 
     * @see DocPropagationFeatureSettings.Fields#config
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
     * @see DocPropagationFeatureSettings.Fields#config
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
     * @see DocPropagationFeatureSettings.Fields#config
     */
    public DocPropagationFeatureSettings setConfig(
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
     * @see DocPropagationFeatureSettings.Fields#config
     */
    public DocPropagationFeatureSettings setConfig(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field config of com.linkedin.settings.global.DocPropagationFeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "config", value);
            _configField = value;
        }
        return this;
    }

    /**
     * Existence checker for configVersion
     * 
     * @see DocPropagationFeatureSettings.Fields#configVersion
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
     * @see DocPropagationFeatureSettings.Fields#configVersion
     */
    public void removeConfigVersion() {
        super._map.remove("configVersion");
    }

    /**
     * Getter for configVersion
     * 
     * @see DocPropagationFeatureSettings.Fields#configVersion
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
     * @see DocPropagationFeatureSettings.Fields#configVersion
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
     * @see DocPropagationFeatureSettings.Fields#configVersion
     */
    public DocPropagationFeatureSettings setConfigVersion(
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
     * @see DocPropagationFeatureSettings.Fields#configVersion
     */
    public DocPropagationFeatureSettings setConfigVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field configVersion of com.linkedin.settings.global.DocPropagationFeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "configVersion", value);
            _configVersionField = value;
        }
        return this;
    }

    /**
     * Existence checker for columnPropagationEnabled
     * 
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    public boolean hasColumnPropagationEnabled() {
        if (_columnPropagationEnabledField!= null) {
            return true;
        }
        return super._map.containsKey("columnPropagationEnabled");
    }

    /**
     * Remover for columnPropagationEnabled
     * 
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    public void removeColumnPropagationEnabled() {
        super._map.remove("columnPropagationEnabled");
    }

    /**
     * Getter for columnPropagationEnabled
     * 
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    @Nullable
    public Boolean isColumnPropagationEnabled(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isColumnPropagationEnabled();
            case NULL:
                if (_columnPropagationEnabledField!= null) {
                    return _columnPropagationEnabledField;
                } else {
                    Object __rawValue = super._map.get("columnPropagationEnabled");
                    _columnPropagationEnabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _columnPropagationEnabledField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for columnPropagationEnabled
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    @Nonnull
    public Boolean isColumnPropagationEnabled() {
        if (_columnPropagationEnabledField!= null) {
            return _columnPropagationEnabledField;
        } else {
            Object __rawValue = super._map.get("columnPropagationEnabled");
            if (__rawValue == null) {
                return DEFAULT_ColumnPropagationEnabled;
            }
            _columnPropagationEnabledField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _columnPropagationEnabledField;
        }
    }

    /**
     * Setter for columnPropagationEnabled
     * 
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    public DocPropagationFeatureSettings setColumnPropagationEnabled(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setColumnPropagationEnabled(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field columnPropagationEnabled of com.linkedin.settings.global.DocPropagationFeatureSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "columnPropagationEnabled", value);
                    _columnPropagationEnabledField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeColumnPropagationEnabled();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "columnPropagationEnabled", value);
                    _columnPropagationEnabledField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "columnPropagationEnabled", value);
                    _columnPropagationEnabledField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for columnPropagationEnabled
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    public DocPropagationFeatureSettings setColumnPropagationEnabled(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field columnPropagationEnabled of com.linkedin.settings.global.DocPropagationFeatureSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "columnPropagationEnabled", value);
            _columnPropagationEnabledField = value;
        }
        return this;
    }

    /**
     * Setter for columnPropagationEnabled
     * 
     * @see DocPropagationFeatureSettings.Fields#columnPropagationEnabled
     */
    public DocPropagationFeatureSettings setColumnPropagationEnabled(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "columnPropagationEnabled", value);
        _columnPropagationEnabledField = value;
        return this;
    }

    @Override
    public DocPropagationFeatureSettings clone()
        throws CloneNotSupportedException
    {
        DocPropagationFeatureSettings __clone = ((DocPropagationFeatureSettings) super.clone());
        __clone.__changeListener = new DocPropagationFeatureSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DocPropagationFeatureSettings copy()
        throws CloneNotSupportedException
    {
        DocPropagationFeatureSettings __copy = ((DocPropagationFeatureSettings) super.copy());
        __copy._configVersionField = null;
        __copy._columnPropagationEnabledField = null;
        __copy._configField = null;
        __copy._enabledField = null;
        __copy.__changeListener = new DocPropagationFeatureSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DocPropagationFeatureSettings __objectRef;

        private ChangeListener(DocPropagationFeatureSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "configVersion":
                    __objectRef._configVersionField = null;
                    break;
                case "columnPropagationEnabled":
                    __objectRef._columnPropagationEnabledField = null;
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

        public PathSpec columnPropagationEnabled() {
            return new PathSpec(getPathComponents(), "columnPropagationEnabled");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        public DocPropagationFeatureSettings.ProjectionMask withEnabled() {
            getDataMap().put("enabled", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The configuration for the feature, in JSON format.
         * 
         */
        public DocPropagationFeatureSettings.ProjectionMask withConfig() {
            getDataMap().put("config", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version of the configuration schema that has been used to serialize
         *        the config.
         * If not provided, the version is assumed to be the latest version.
         * 
         */
        public DocPropagationFeatureSettings.ProjectionMask withConfigVersion() {
            getDataMap().put("configVersion", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DocPropagationFeatureSettings.ProjectionMask withColumnPropagationEnabled() {
            getDataMap().put("columnPropagationEnabled", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
