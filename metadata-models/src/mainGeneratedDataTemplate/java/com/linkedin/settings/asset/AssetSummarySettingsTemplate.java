
package com.linkedin.settings.asset;

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
 * Object containing the template and any additional info for asset summary settings
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/asset/AssetSummarySettingsTemplate.pdl.")
public class AssetSummarySettingsTemplate
    extends RecordTemplate
{

    private final static AssetSummarySettingsTemplate.Fields _fields = new AssetSummarySettingsTemplate.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.asset/**Object containing the template and any additional info for asset summary settings*/record AssetSummarySettingsTemplate{/**The urn of the template*/template:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _templateField = null;
    private AssetSummarySettingsTemplate.ChangeListener __changeListener = new AssetSummarySettingsTemplate.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Template = SCHEMA.getField("template");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public AssetSummarySettingsTemplate() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AssetSummarySettingsTemplate(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssetSummarySettingsTemplate.Fields fields() {
        return _fields;
    }

    public static AssetSummarySettingsTemplate.ProjectionMask createMask() {
        return new AssetSummarySettingsTemplate.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for template
     * 
     * @see AssetSummarySettingsTemplate.Fields#template
     */
    public boolean hasTemplate() {
        if (_templateField!= null) {
            return true;
        }
        return super._map.containsKey("template");
    }

    /**
     * Remover for template
     * 
     * @see AssetSummarySettingsTemplate.Fields#template
     */
    public void removeTemplate() {
        super._map.remove("template");
    }

    /**
     * Getter for template
     * 
     * @see AssetSummarySettingsTemplate.Fields#template
     */
    @Nullable
    public com.linkedin.common.urn.Urn getTemplate(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTemplate();
            case DEFAULT:
            case NULL:
                if (_templateField!= null) {
                    return _templateField;
                } else {
                    Object __rawValue = super._map.get("template");
                    _templateField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _templateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for template
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssetSummarySettingsTemplate.Fields#template
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getTemplate() {
        if (_templateField!= null) {
            return _templateField;
        } else {
            Object __rawValue = super._map.get("template");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("template");
            }
            _templateField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _templateField;
        }
    }

    /**
     * Setter for template
     * 
     * @see AssetSummarySettingsTemplate.Fields#template
     */
    public AssetSummarySettingsTemplate setTemplate(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTemplate(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field template of com.linkedin.settings.asset.AssetSummarySettingsTemplate");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "template", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _templateField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTemplate();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "template", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _templateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "template", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _templateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for template
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssetSummarySettingsTemplate.Fields#template
     */
    public AssetSummarySettingsTemplate setTemplate(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field template of com.linkedin.settings.asset.AssetSummarySettingsTemplate to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "template", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _templateField = value;
        }
        return this;
    }

    @Override
    public AssetSummarySettingsTemplate clone()
        throws CloneNotSupportedException
    {
        AssetSummarySettingsTemplate __clone = ((AssetSummarySettingsTemplate) super.clone());
        __clone.__changeListener = new AssetSummarySettingsTemplate.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssetSummarySettingsTemplate copy()
        throws CloneNotSupportedException
    {
        AssetSummarySettingsTemplate __copy = ((AssetSummarySettingsTemplate) super.copy());
        __copy._templateField = null;
        __copy.__changeListener = new AssetSummarySettingsTemplate.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssetSummarySettingsTemplate __objectRef;

        private ChangeListener(AssetSummarySettingsTemplate reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "template":
                    __objectRef._templateField = null;
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
         * The urn of the template
         * 
         */
        public PathSpec template() {
            return new PathSpec(getPathComponents(), "template");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The urn of the template
         * 
         */
        public AssetSummarySettingsTemplate.ProjectionMask withTemplate() {
            getDataMap().put("template", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
