
package com.linkedin.settings.asset;

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
import com.linkedin.data.template.SetMode;


/**
 * Settings associated with this asset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/asset/AssetSettings.pdl.")
public class AssetSettings
    extends RecordTemplate
{

    private final static AssetSettings.Fields _fields = new AssetSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings.asset/**Settings associated with this asset*/@Aspect.name=\"assetSettings\"record AssetSettings{/**Information related to the asset summary for this asset*/assetSummary:optional/**Information related to the asset summary for this asset*/record AssetSummarySettings{/**The list of templates applied to this asset in order. Right now we only expect one.*/@Relationship.`/*/template`={\"entityTypes\":[\"dataHubPageTemplate\"],\"name\":\"HasSummaryTemplate\"}templates:optional array[/**Object containing the template and any additional info for asset summary settings*/record AssetSummarySettingsTemplate{/**The urn of the template*/template:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}]=[]}}", SchemaFormatType.PDL));
    private AssetSummarySettings _assetSummaryField = null;
    private AssetSettings.ChangeListener __changeListener = new AssetSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AssetSummary = SCHEMA.getField("assetSummary");

    public AssetSettings() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AssetSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssetSettings.Fields fields() {
        return _fields;
    }

    public static AssetSettings.ProjectionMask createMask() {
        return new AssetSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for assetSummary
     * 
     * @see AssetSettings.Fields#assetSummary
     */
    public boolean hasAssetSummary() {
        if (_assetSummaryField!= null) {
            return true;
        }
        return super._map.containsKey("assetSummary");
    }

    /**
     * Remover for assetSummary
     * 
     * @see AssetSettings.Fields#assetSummary
     */
    public void removeAssetSummary() {
        super._map.remove("assetSummary");
    }

    /**
     * Getter for assetSummary
     * 
     * @see AssetSettings.Fields#assetSummary
     */
    @Nullable
    public AssetSummarySettings getAssetSummary(GetMode mode) {
        return getAssetSummary();
    }

    /**
     * Getter for assetSummary
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssetSettings.Fields#assetSummary
     */
    @Nullable
    public AssetSummarySettings getAssetSummary() {
        if (_assetSummaryField!= null) {
            return _assetSummaryField;
        } else {
            Object __rawValue = super._map.get("assetSummary");
            _assetSummaryField = ((__rawValue == null)?null:new AssetSummarySettings(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _assetSummaryField;
        }
    }

    /**
     * Setter for assetSummary
     * 
     * @see AssetSettings.Fields#assetSummary
     */
    public AssetSettings setAssetSummary(
        @Nullable
        AssetSummarySettings value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssetSummary(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssetSummary();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assetSummary", value.data());
                    _assetSummaryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assetSummary", value.data());
                    _assetSummaryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assetSummary
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssetSettings.Fields#assetSummary
     */
    public AssetSettings setAssetSummary(
        @Nonnull
        AssetSummarySettings value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assetSummary of com.linkedin.settings.asset.AssetSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assetSummary", value.data());
            _assetSummaryField = value;
        }
        return this;
    }

    @Override
    public AssetSettings clone()
        throws CloneNotSupportedException
    {
        AssetSettings __clone = ((AssetSettings) super.clone());
        __clone.__changeListener = new AssetSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssetSettings copy()
        throws CloneNotSupportedException
    {
        AssetSettings __copy = ((AssetSettings) super.copy());
        __copy._assetSummaryField = null;
        __copy.__changeListener = new AssetSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssetSettings __objectRef;

        private ChangeListener(AssetSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "assetSummary":
                    __objectRef._assetSummaryField = null;
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
         * Information related to the asset summary for this asset
         * 
         */
        public com.linkedin.settings.asset.AssetSummarySettings.Fields assetSummary() {
            return new com.linkedin.settings.asset.AssetSummarySettings.Fields(getPathComponents(), "assetSummary");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.settings.asset.AssetSummarySettings.ProjectionMask _assetSummaryMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Information related to the asset summary for this asset
         * 
         */
        public AssetSettings.ProjectionMask withAssetSummary(Function<com.linkedin.settings.asset.AssetSummarySettings.ProjectionMask, com.linkedin.settings.asset.AssetSummarySettings.ProjectionMask> nestedMask) {
            _assetSummaryMask = nestedMask.apply(((_assetSummaryMask == null)?AssetSummarySettings.createMask():_assetSummaryMask));
            getDataMap().put("assetSummary", _assetSummaryMask.getDataMap());
            return this;
        }

        /**
         * Information related to the asset summary for this asset
         * 
         */
        public AssetSettings.ProjectionMask withAssetSummary() {
            _assetSummaryMask = null;
            getDataMap().put("assetSummary", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
