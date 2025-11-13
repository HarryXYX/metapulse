
package com.linkedin.settings.asset;

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
import com.linkedin.data.template.SetMode;


/**
 * Information related to the asset summary for this asset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/settings/asset/AssetSummarySettings.pdl.")
public class AssetSummarySettings
    extends RecordTemplate
{

    private final static AssetSummarySettings.Fields _fields = new AssetSummarySettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.asset/**Information related to the asset summary for this asset*/record AssetSummarySettings{/**The list of templates applied to this asset in order. Right now we only expect one.*/@Relationship.`/*/template`={\"entityTypes\":[\"dataHubPageTemplate\"],\"name\":\"HasSummaryTemplate\"}templates:optional array[/**Object containing the template and any additional info for asset summary settings*/record AssetSummarySettingsTemplate{/**The urn of the template*/template:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]=[]}", SchemaFormatType.PDL));
    private AssetSummarySettingsTemplateArray _templatesField = null;
    private AssetSummarySettings.ChangeListener __changeListener = new AssetSummarySettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Templates = SCHEMA.getField("templates");
    private final static AssetSummarySettingsTemplateArray DEFAULT_Templates;

    static {
        DEFAULT_Templates = ((FIELD_Templates.getDefault() == null)?null:new AssetSummarySettingsTemplateArray(DataTemplateUtil.castOrThrow(FIELD_Templates.getDefault(), DataList.class)));
    }

    public AssetSummarySettings() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AssetSummarySettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssetSummarySettings.Fields fields() {
        return _fields;
    }

    public static AssetSummarySettings.ProjectionMask createMask() {
        return new AssetSummarySettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for templates
     * 
     * @see AssetSummarySettings.Fields#templates
     */
    public boolean hasTemplates() {
        if (_templatesField!= null) {
            return true;
        }
        return super._map.containsKey("templates");
    }

    /**
     * Remover for templates
     * 
     * @see AssetSummarySettings.Fields#templates
     */
    public void removeTemplates() {
        super._map.remove("templates");
    }

    /**
     * Getter for templates
     * 
     * @see AssetSummarySettings.Fields#templates
     */
    @Nullable
    public AssetSummarySettingsTemplateArray getTemplates(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getTemplates();
            case NULL:
                if (_templatesField!= null) {
                    return _templatesField;
                } else {
                    Object __rawValue = super._map.get("templates");
                    _templatesField = ((__rawValue == null)?null:new AssetSummarySettingsTemplateArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _templatesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for templates
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssetSummarySettings.Fields#templates
     */
    @Nullable
    public AssetSummarySettingsTemplateArray getTemplates() {
        if (_templatesField!= null) {
            return _templatesField;
        } else {
            Object __rawValue = super._map.get("templates");
            if (__rawValue == null) {
                return DEFAULT_Templates;
            }
            _templatesField = ((__rawValue == null)?null:new AssetSummarySettingsTemplateArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _templatesField;
        }
    }

    /**
     * Setter for templates
     * 
     * @see AssetSummarySettings.Fields#templates
     */
    public AssetSummarySettings setTemplates(
        @Nullable
        AssetSummarySettingsTemplateArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTemplates(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTemplates();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "templates", value.data());
                    _templatesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "templates", value.data());
                    _templatesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for templates
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssetSummarySettings.Fields#templates
     */
    public AssetSummarySettings setTemplates(
        @Nonnull
        AssetSummarySettingsTemplateArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field templates of com.linkedin.settings.asset.AssetSummarySettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "templates", value.data());
            _templatesField = value;
        }
        return this;
    }

    @Override
    public AssetSummarySettings clone()
        throws CloneNotSupportedException
    {
        AssetSummarySettings __clone = ((AssetSummarySettings) super.clone());
        __clone.__changeListener = new AssetSummarySettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssetSummarySettings copy()
        throws CloneNotSupportedException
    {
        AssetSummarySettings __copy = ((AssetSummarySettings) super.copy());
        __copy._templatesField = null;
        __copy.__changeListener = new AssetSummarySettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssetSummarySettings __objectRef;

        private ChangeListener(AssetSummarySettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "templates":
                    __objectRef._templatesField = null;
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
         * The list of templates applied to this asset in order. Right now we only expect one.
         * 
         */
        public com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.Fields templates() {
            return new com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.Fields(getPathComponents(), "templates");
        }

        /**
         * The list of templates applied to this asset in order. Right now we only expect one.
         * 
         */
        public PathSpec templates(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "templates");
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

        private com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.ProjectionMask _templatesMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * The list of templates applied to this asset in order. Right now we only expect one.
         * 
         */
        public AssetSummarySettings.ProjectionMask withTemplates(Function<com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.ProjectionMask, com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.ProjectionMask> nestedMask) {
            _templatesMask = nestedMask.apply(((_templatesMask == null)?AssetSummarySettingsTemplateArray.createMask():_templatesMask));
            getDataMap().put("templates", _templatesMask.getDataMap());
            return this;
        }

        /**
         * The list of templates applied to this asset in order. Right now we only expect one.
         * 
         */
        public AssetSummarySettings.ProjectionMask withTemplates() {
            _templatesMask = null;
            getDataMap().put("templates", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The list of templates applied to this asset in order. Right now we only expect one.
         * 
         */
        public AssetSummarySettings.ProjectionMask withTemplates(Function<com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.ProjectionMask, com.linkedin.settings.asset.AssetSummarySettingsTemplateArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _templatesMask = nestedMask.apply(((_templatesMask == null)?AssetSummarySettingsTemplateArray.createMask():_templatesMask));
            getDataMap().put("templates", _templatesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("templates").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("templates").put("$count", count);
            }
            return this;
        }

        /**
         * The list of templates applied to this asset in order. Right now we only expect one.
         * 
         */
        public AssetSummarySettings.ProjectionMask withTemplates(Integer start, Integer count) {
            _templatesMask = null;
            getDataMap().put("templates", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("templates").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("templates").put("$count", count);
            }
            return this;
        }

    }

}
