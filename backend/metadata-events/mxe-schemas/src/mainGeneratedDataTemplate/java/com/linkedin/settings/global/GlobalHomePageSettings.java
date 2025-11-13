
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Global settings related to the home page for an instance
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/global/GlobalHomePageSettings.pdl.")
public class GlobalHomePageSettings
    extends RecordTemplate
{

    private final static GlobalHomePageSettings.Fields _fields = new GlobalHomePageSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.global/**Global settings related to the home page for an instance*/record GlobalHomePageSettings{/**The urn that will be rendered in the UI by default for all users*/defaultTemplate:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _defaultTemplateField = null;
    private GlobalHomePageSettings.ChangeListener __changeListener = new GlobalHomePageSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DefaultTemplate = SCHEMA.getField("defaultTemplate");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public GlobalHomePageSettings() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public GlobalHomePageSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlobalHomePageSettings.Fields fields() {
        return _fields;
    }

    public static GlobalHomePageSettings.ProjectionMask createMask() {
        return new GlobalHomePageSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for defaultTemplate
     * 
     * @see GlobalHomePageSettings.Fields#defaultTemplate
     */
    public boolean hasDefaultTemplate() {
        if (_defaultTemplateField!= null) {
            return true;
        }
        return super._map.containsKey("defaultTemplate");
    }

    /**
     * Remover for defaultTemplate
     * 
     * @see GlobalHomePageSettings.Fields#defaultTemplate
     */
    public void removeDefaultTemplate() {
        super._map.remove("defaultTemplate");
    }

    /**
     * Getter for defaultTemplate
     * 
     * @see GlobalHomePageSettings.Fields#defaultTemplate
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDefaultTemplate(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDefaultTemplate();
            case DEFAULT:
            case NULL:
                if (_defaultTemplateField!= null) {
                    return _defaultTemplateField;
                } else {
                    Object __rawValue = super._map.get("defaultTemplate");
                    _defaultTemplateField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _defaultTemplateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for defaultTemplate
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlobalHomePageSettings.Fields#defaultTemplate
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDefaultTemplate() {
        if (_defaultTemplateField!= null) {
            return _defaultTemplateField;
        } else {
            Object __rawValue = super._map.get("defaultTemplate");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("defaultTemplate");
            }
            _defaultTemplateField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _defaultTemplateField;
        }
    }

    /**
     * Setter for defaultTemplate
     * 
     * @see GlobalHomePageSettings.Fields#defaultTemplate
     */
    public GlobalHomePageSettings setDefaultTemplate(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDefaultTemplate(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field defaultTemplate of com.linkedin.settings.global.GlobalHomePageSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "defaultTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _defaultTemplateField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDefaultTemplate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "defaultTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _defaultTemplateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "defaultTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _defaultTemplateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for defaultTemplate
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalHomePageSettings.Fields#defaultTemplate
     */
    public GlobalHomePageSettings setDefaultTemplate(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field defaultTemplate of com.linkedin.settings.global.GlobalHomePageSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "defaultTemplate", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _defaultTemplateField = value;
        }
        return this;
    }

    @Override
    public GlobalHomePageSettings clone()
        throws CloneNotSupportedException
    {
        GlobalHomePageSettings __clone = ((GlobalHomePageSettings) super.clone());
        __clone.__changeListener = new GlobalHomePageSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlobalHomePageSettings copy()
        throws CloneNotSupportedException
    {
        GlobalHomePageSettings __copy = ((GlobalHomePageSettings) super.copy());
        __copy._defaultTemplateField = null;
        __copy.__changeListener = new GlobalHomePageSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlobalHomePageSettings __objectRef;

        private ChangeListener(GlobalHomePageSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "defaultTemplate":
                    __objectRef._defaultTemplateField = null;
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
         * The urn that will be rendered in the UI by default for all users
         * 
         */
        public PathSpec defaultTemplate() {
            return new PathSpec(getPathComponents(), "defaultTemplate");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The urn that will be rendered in the UI by default for all users
         * 
         */
        public GlobalHomePageSettings.ProjectionMask withDefaultTemplate() {
            getDataMap().put("defaultTemplate", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
