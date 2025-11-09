
package com.linkedin.identity;

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
import com.linkedin.data.template.SetMode;


/**
 * Settings for a user around the appearance of their DataHub UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpUserAppearanceSettings.pdl.")
public class CorpUserAppearanceSettings
    extends RecordTemplate
{

    private final static CorpUserAppearanceSettings.Fields _fields = new CorpUserAppearanceSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Settings for a user around the appearance of their DataHub UI*/record CorpUserAppearanceSettings{/**Flag whether the user should see a homepage with only datasets, charts and dashboards. Intended for users\nwho have less operational use cases for the datahub tool.*/showSimplifiedHomepage:optional boolean/**Flag controlling whether the V2 UI for DataHub is shown.*/showThemeV2:optional boolean}", SchemaFormatType.PDL));
    private Boolean _showSimplifiedHomepageField = null;
    private Boolean _showThemeV2Field = null;
    private CorpUserAppearanceSettings.ChangeListener __changeListener = new CorpUserAppearanceSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ShowSimplifiedHomepage = SCHEMA.getField("showSimplifiedHomepage");
    private final static RecordDataSchema.Field FIELD_ShowThemeV2 = SCHEMA.getField("showThemeV2");

    public CorpUserAppearanceSettings() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CorpUserAppearanceSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserAppearanceSettings.Fields fields() {
        return _fields;
    }

    public static CorpUserAppearanceSettings.ProjectionMask createMask() {
        return new CorpUserAppearanceSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for showSimplifiedHomepage
     * 
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    public boolean hasShowSimplifiedHomepage() {
        if (_showSimplifiedHomepageField!= null) {
            return true;
        }
        return super._map.containsKey("showSimplifiedHomepage");
    }

    /**
     * Remover for showSimplifiedHomepage
     * 
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    public void removeShowSimplifiedHomepage() {
        super._map.remove("showSimplifiedHomepage");
    }

    /**
     * Getter for showSimplifiedHomepage
     * 
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    @Nullable
    public Boolean isShowSimplifiedHomepage(GetMode mode) {
        return isShowSimplifiedHomepage();
    }

    /**
     * Getter for showSimplifiedHomepage
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    @Nullable
    public Boolean isShowSimplifiedHomepage() {
        if (_showSimplifiedHomepageField!= null) {
            return _showSimplifiedHomepageField;
        } else {
            Object __rawValue = super._map.get("showSimplifiedHomepage");
            _showSimplifiedHomepageField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showSimplifiedHomepageField;
        }
    }

    /**
     * Setter for showSimplifiedHomepage
     * 
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    public CorpUserAppearanceSettings setShowSimplifiedHomepage(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowSimplifiedHomepage(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowSimplifiedHomepage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showSimplifiedHomepage", value);
                    _showSimplifiedHomepageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showSimplifiedHomepage", value);
                    _showSimplifiedHomepageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showSimplifiedHomepage
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    public CorpUserAppearanceSettings setShowSimplifiedHomepage(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showSimplifiedHomepage of com.linkedin.identity.CorpUserAppearanceSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showSimplifiedHomepage", value);
            _showSimplifiedHomepageField = value;
        }
        return this;
    }

    /**
     * Setter for showSimplifiedHomepage
     * 
     * @see CorpUserAppearanceSettings.Fields#showSimplifiedHomepage
     */
    public CorpUserAppearanceSettings setShowSimplifiedHomepage(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showSimplifiedHomepage", value);
        _showSimplifiedHomepageField = value;
        return this;
    }

    /**
     * Existence checker for showThemeV2
     * 
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    public boolean hasShowThemeV2() {
        if (_showThemeV2Field!= null) {
            return true;
        }
        return super._map.containsKey("showThemeV2");
    }

    /**
     * Remover for showThemeV2
     * 
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    public void removeShowThemeV2() {
        super._map.remove("showThemeV2");
    }

    /**
     * Getter for showThemeV2
     * 
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    @Nullable
    public Boolean isShowThemeV2(GetMode mode) {
        return isShowThemeV2();
    }

    /**
     * Getter for showThemeV2
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    @Nullable
    public Boolean isShowThemeV2() {
        if (_showThemeV2Field!= null) {
            return _showThemeV2Field;
        } else {
            Object __rawValue = super._map.get("showThemeV2");
            _showThemeV2Field = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showThemeV2Field;
        }
    }

    /**
     * Setter for showThemeV2
     * 
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    public CorpUserAppearanceSettings setShowThemeV2(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowThemeV2(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowThemeV2();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showThemeV2", value);
                    _showThemeV2Field = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showThemeV2", value);
                    _showThemeV2Field = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showThemeV2
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    public CorpUserAppearanceSettings setShowThemeV2(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showThemeV2 of com.linkedin.identity.CorpUserAppearanceSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showThemeV2", value);
            _showThemeV2Field = value;
        }
        return this;
    }

    /**
     * Setter for showThemeV2
     * 
     * @see CorpUserAppearanceSettings.Fields#showThemeV2
     */
    public CorpUserAppearanceSettings setShowThemeV2(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showThemeV2", value);
        _showThemeV2Field = value;
        return this;
    }

    @Override
    public CorpUserAppearanceSettings clone()
        throws CloneNotSupportedException
    {
        CorpUserAppearanceSettings __clone = ((CorpUserAppearanceSettings) super.clone());
        __clone.__changeListener = new CorpUserAppearanceSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserAppearanceSettings copy()
        throws CloneNotSupportedException
    {
        CorpUserAppearanceSettings __copy = ((CorpUserAppearanceSettings) super.copy());
        __copy._showThemeV2Field = null;
        __copy._showSimplifiedHomepageField = null;
        __copy.__changeListener = new CorpUserAppearanceSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserAppearanceSettings __objectRef;

        private ChangeListener(CorpUserAppearanceSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "showThemeV2":
                    __objectRef._showThemeV2Field = null;
                    break;
                case "showSimplifiedHomepage":
                    __objectRef._showSimplifiedHomepageField = null;
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
         * Flag whether the user should see a homepage with only datasets, charts and dashboards. Intended for users
         * who have less operational use cases for the datahub tool.
         * 
         */
        public PathSpec showSimplifiedHomepage() {
            return new PathSpec(getPathComponents(), "showSimplifiedHomepage");
        }

        /**
         * Flag controlling whether the V2 UI for DataHub is shown.
         * 
         */
        public PathSpec showThemeV2() {
            return new PathSpec(getPathComponents(), "showThemeV2");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Flag whether the user should see a homepage with only datasets, charts and dashboards. Intended for users
         * who have less operational use cases for the datahub tool.
         * 
         */
        public CorpUserAppearanceSettings.ProjectionMask withShowSimplifiedHomepage() {
            getDataMap().put("showSimplifiedHomepage", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Flag controlling whether the V2 UI for DataHub is shown.
         * 
         */
        public CorpUserAppearanceSettings.ProjectionMask withShowThemeV2() {
            getDataMap().put("showThemeV2", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
