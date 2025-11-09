
package com.linkedin.module;

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
 * The specific parameters stored for a module
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/module/DataHubPageModuleParams.pdl.")
public class DataHubPageModuleParams
    extends RecordTemplate
{

    private final static DataHubPageModuleParams.Fields _fields = new DataHubPageModuleParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module/**The specific parameters stored for a module*/record DataHubPageModuleParams{/**The params required if the module is type LINK*/linkParams:optional record LinkModuleParams{linkUrl:string,imageUrl:optional string,description:optional string}/**The params required if the module is type RICH_TEXT*/richTextParams:optional record RichTextModuleParams{content:string}/**The params required if the module is type ASSET_COLLECTION*/assetCollectionParams:optional/**The params required if the module is type ASSET_COLLECTION*/record AssetCollectionModuleParams{assetUrns:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Optional dynamic filters\n\nThe stringified json representing the logical predicate built in the UI to select assets.\nThis predicate is turned into orFilters to send through graphql since graphql doesn't support\narbitrary nesting. This string is used to restore the UI for this logical predicate.*/dynamicFilterJson:optional string}/**The params required if the module is type HIERARCHY_VIEW*/hierarchyViewParams:optional/**The params required if the module is type HIERARCHY_VIEW*/record HierarchyModuleParams{assetUrns:optional array[com.linkedin.common.Urn]showRelatedEntities:boolean/**Optional filters to filter relatedEntities (assetUrns) out\n\nThe stringified json representing the logical predicate built in the UI to select assets.\nThis predicate is turned into orFilters to send through graphql since graphql doesn't support\narbitrary nesting. This string is used to restore the UI for this logical predicate.*/relatedEntitiesFilterJson:optional string}}", SchemaFormatType.PDL));
    private LinkModuleParams _linkParamsField = null;
    private RichTextModuleParams _richTextParamsField = null;
    private AssetCollectionModuleParams _assetCollectionParamsField = null;
    private HierarchyModuleParams _hierarchyViewParamsField = null;
    private DataHubPageModuleParams.ChangeListener __changeListener = new DataHubPageModuleParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_LinkParams = SCHEMA.getField("linkParams");
    private final static RecordDataSchema.Field FIELD_RichTextParams = SCHEMA.getField("richTextParams");
    private final static RecordDataSchema.Field FIELD_AssetCollectionParams = SCHEMA.getField("assetCollectionParams");
    private final static RecordDataSchema.Field FIELD_HierarchyViewParams = SCHEMA.getField("hierarchyViewParams");

    public DataHubPageModuleParams() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public DataHubPageModuleParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPageModuleParams.Fields fields() {
        return _fields;
    }

    public static DataHubPageModuleParams.ProjectionMask createMask() {
        return new DataHubPageModuleParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for linkParams
     * 
     * @see DataHubPageModuleParams.Fields#linkParams
     */
    public boolean hasLinkParams() {
        if (_linkParamsField!= null) {
            return true;
        }
        return super._map.containsKey("linkParams");
    }

    /**
     * Remover for linkParams
     * 
     * @see DataHubPageModuleParams.Fields#linkParams
     */
    public void removeLinkParams() {
        super._map.remove("linkParams");
    }

    /**
     * Getter for linkParams
     * 
     * @see DataHubPageModuleParams.Fields#linkParams
     */
    @Nullable
    public LinkModuleParams getLinkParams(GetMode mode) {
        return getLinkParams();
    }

    /**
     * Getter for linkParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPageModuleParams.Fields#linkParams
     */
    @Nullable
    public LinkModuleParams getLinkParams() {
        if (_linkParamsField!= null) {
            return _linkParamsField;
        } else {
            Object __rawValue = super._map.get("linkParams");
            _linkParamsField = ((__rawValue == null)?null:new LinkModuleParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _linkParamsField;
        }
    }

    /**
     * Setter for linkParams
     * 
     * @see DataHubPageModuleParams.Fields#linkParams
     */
    public DataHubPageModuleParams setLinkParams(
        @Nullable
        LinkModuleParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLinkParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLinkParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "linkParams", value.data());
                    _linkParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "linkParams", value.data());
                    _linkParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for linkParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleParams.Fields#linkParams
     */
    public DataHubPageModuleParams setLinkParams(
        @Nonnull
        LinkModuleParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field linkParams of com.linkedin.module.DataHubPageModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "linkParams", value.data());
            _linkParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for richTextParams
     * 
     * @see DataHubPageModuleParams.Fields#richTextParams
     */
    public boolean hasRichTextParams() {
        if (_richTextParamsField!= null) {
            return true;
        }
        return super._map.containsKey("richTextParams");
    }

    /**
     * Remover for richTextParams
     * 
     * @see DataHubPageModuleParams.Fields#richTextParams
     */
    public void removeRichTextParams() {
        super._map.remove("richTextParams");
    }

    /**
     * Getter for richTextParams
     * 
     * @see DataHubPageModuleParams.Fields#richTextParams
     */
    @Nullable
    public RichTextModuleParams getRichTextParams(GetMode mode) {
        return getRichTextParams();
    }

    /**
     * Getter for richTextParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPageModuleParams.Fields#richTextParams
     */
    @Nullable
    public RichTextModuleParams getRichTextParams() {
        if (_richTextParamsField!= null) {
            return _richTextParamsField;
        } else {
            Object __rawValue = super._map.get("richTextParams");
            _richTextParamsField = ((__rawValue == null)?null:new RichTextModuleParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _richTextParamsField;
        }
    }

    /**
     * Setter for richTextParams
     * 
     * @see DataHubPageModuleParams.Fields#richTextParams
     */
    public DataHubPageModuleParams setRichTextParams(
        @Nullable
        RichTextModuleParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRichTextParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRichTextParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "richTextParams", value.data());
                    _richTextParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "richTextParams", value.data());
                    _richTextParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for richTextParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleParams.Fields#richTextParams
     */
    public DataHubPageModuleParams setRichTextParams(
        @Nonnull
        RichTextModuleParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field richTextParams of com.linkedin.module.DataHubPageModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "richTextParams", value.data());
            _richTextParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for assetCollectionParams
     * 
     * @see DataHubPageModuleParams.Fields#assetCollectionParams
     */
    public boolean hasAssetCollectionParams() {
        if (_assetCollectionParamsField!= null) {
            return true;
        }
        return super._map.containsKey("assetCollectionParams");
    }

    /**
     * Remover for assetCollectionParams
     * 
     * @see DataHubPageModuleParams.Fields#assetCollectionParams
     */
    public void removeAssetCollectionParams() {
        super._map.remove("assetCollectionParams");
    }

    /**
     * Getter for assetCollectionParams
     * 
     * @see DataHubPageModuleParams.Fields#assetCollectionParams
     */
    @Nullable
    public AssetCollectionModuleParams getAssetCollectionParams(GetMode mode) {
        return getAssetCollectionParams();
    }

    /**
     * Getter for assetCollectionParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPageModuleParams.Fields#assetCollectionParams
     */
    @Nullable
    public AssetCollectionModuleParams getAssetCollectionParams() {
        if (_assetCollectionParamsField!= null) {
            return _assetCollectionParamsField;
        } else {
            Object __rawValue = super._map.get("assetCollectionParams");
            _assetCollectionParamsField = ((__rawValue == null)?null:new AssetCollectionModuleParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _assetCollectionParamsField;
        }
    }

    /**
     * Setter for assetCollectionParams
     * 
     * @see DataHubPageModuleParams.Fields#assetCollectionParams
     */
    public DataHubPageModuleParams setAssetCollectionParams(
        @Nullable
        AssetCollectionModuleParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssetCollectionParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssetCollectionParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assetCollectionParams", value.data());
                    _assetCollectionParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assetCollectionParams", value.data());
                    _assetCollectionParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assetCollectionParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleParams.Fields#assetCollectionParams
     */
    public DataHubPageModuleParams setAssetCollectionParams(
        @Nonnull
        AssetCollectionModuleParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assetCollectionParams of com.linkedin.module.DataHubPageModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assetCollectionParams", value.data());
            _assetCollectionParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for hierarchyViewParams
     * 
     * @see DataHubPageModuleParams.Fields#hierarchyViewParams
     */
    public boolean hasHierarchyViewParams() {
        if (_hierarchyViewParamsField!= null) {
            return true;
        }
        return super._map.containsKey("hierarchyViewParams");
    }

    /**
     * Remover for hierarchyViewParams
     * 
     * @see DataHubPageModuleParams.Fields#hierarchyViewParams
     */
    public void removeHierarchyViewParams() {
        super._map.remove("hierarchyViewParams");
    }

    /**
     * Getter for hierarchyViewParams
     * 
     * @see DataHubPageModuleParams.Fields#hierarchyViewParams
     */
    @Nullable
    public HierarchyModuleParams getHierarchyViewParams(GetMode mode) {
        return getHierarchyViewParams();
    }

    /**
     * Getter for hierarchyViewParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPageModuleParams.Fields#hierarchyViewParams
     */
    @Nullable
    public HierarchyModuleParams getHierarchyViewParams() {
        if (_hierarchyViewParamsField!= null) {
            return _hierarchyViewParamsField;
        } else {
            Object __rawValue = super._map.get("hierarchyViewParams");
            _hierarchyViewParamsField = ((__rawValue == null)?null:new HierarchyModuleParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _hierarchyViewParamsField;
        }
    }

    /**
     * Setter for hierarchyViewParams
     * 
     * @see DataHubPageModuleParams.Fields#hierarchyViewParams
     */
    public DataHubPageModuleParams setHierarchyViewParams(
        @Nullable
        HierarchyModuleParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHierarchyViewParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHierarchyViewParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "hierarchyViewParams", value.data());
                    _hierarchyViewParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "hierarchyViewParams", value.data());
                    _hierarchyViewParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for hierarchyViewParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPageModuleParams.Fields#hierarchyViewParams
     */
    public DataHubPageModuleParams setHierarchyViewParams(
        @Nonnull
        HierarchyModuleParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field hierarchyViewParams of com.linkedin.module.DataHubPageModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "hierarchyViewParams", value.data());
            _hierarchyViewParamsField = value;
        }
        return this;
    }

    @Override
    public DataHubPageModuleParams clone()
        throws CloneNotSupportedException
    {
        DataHubPageModuleParams __clone = ((DataHubPageModuleParams) super.clone());
        __clone.__changeListener = new DataHubPageModuleParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPageModuleParams copy()
        throws CloneNotSupportedException
    {
        DataHubPageModuleParams __copy = ((DataHubPageModuleParams) super.copy());
        __copy._assetCollectionParamsField = null;
        __copy._hierarchyViewParamsField = null;
        __copy._linkParamsField = null;
        __copy._richTextParamsField = null;
        __copy.__changeListener = new DataHubPageModuleParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPageModuleParams __objectRef;

        private ChangeListener(DataHubPageModuleParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "assetCollectionParams":
                    __objectRef._assetCollectionParamsField = null;
                    break;
                case "hierarchyViewParams":
                    __objectRef._hierarchyViewParamsField = null;
                    break;
                case "linkParams":
                    __objectRef._linkParamsField = null;
                    break;
                case "richTextParams":
                    __objectRef._richTextParamsField = null;
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
         * The params required if the module is type LINK
         * 
         */
        public com.linkedin.module.LinkModuleParams.Fields linkParams() {
            return new com.linkedin.module.LinkModuleParams.Fields(getPathComponents(), "linkParams");
        }

        /**
         * The params required if the module is type RICH_TEXT
         * 
         */
        public com.linkedin.module.RichTextModuleParams.Fields richTextParams() {
            return new com.linkedin.module.RichTextModuleParams.Fields(getPathComponents(), "richTextParams");
        }

        /**
         * The params required if the module is type ASSET_COLLECTION
         * 
         */
        public com.linkedin.module.AssetCollectionModuleParams.Fields assetCollectionParams() {
            return new com.linkedin.module.AssetCollectionModuleParams.Fields(getPathComponents(), "assetCollectionParams");
        }

        /**
         * The params required if the module is type HIERARCHY_VIEW
         * 
         */
        public com.linkedin.module.HierarchyModuleParams.Fields hierarchyViewParams() {
            return new com.linkedin.module.HierarchyModuleParams.Fields(getPathComponents(), "hierarchyViewParams");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.module.LinkModuleParams.ProjectionMask _linkParamsMask;
        private com.linkedin.module.RichTextModuleParams.ProjectionMask _richTextParamsMask;
        private com.linkedin.module.AssetCollectionModuleParams.ProjectionMask _assetCollectionParamsMask;
        private com.linkedin.module.HierarchyModuleParams.ProjectionMask _hierarchyViewParamsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The params required if the module is type LINK
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withLinkParams(Function<com.linkedin.module.LinkModuleParams.ProjectionMask, com.linkedin.module.LinkModuleParams.ProjectionMask> nestedMask) {
            _linkParamsMask = nestedMask.apply(((_linkParamsMask == null)?LinkModuleParams.createMask():_linkParamsMask));
            getDataMap().put("linkParams", _linkParamsMask.getDataMap());
            return this;
        }

        /**
         * The params required if the module is type LINK
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withLinkParams() {
            _linkParamsMask = null;
            getDataMap().put("linkParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The params required if the module is type RICH_TEXT
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withRichTextParams(Function<com.linkedin.module.RichTextModuleParams.ProjectionMask, com.linkedin.module.RichTextModuleParams.ProjectionMask> nestedMask) {
            _richTextParamsMask = nestedMask.apply(((_richTextParamsMask == null)?RichTextModuleParams.createMask():_richTextParamsMask));
            getDataMap().put("richTextParams", _richTextParamsMask.getDataMap());
            return this;
        }

        /**
         * The params required if the module is type RICH_TEXT
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withRichTextParams() {
            _richTextParamsMask = null;
            getDataMap().put("richTextParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The params required if the module is type ASSET_COLLECTION
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withAssetCollectionParams(Function<com.linkedin.module.AssetCollectionModuleParams.ProjectionMask, com.linkedin.module.AssetCollectionModuleParams.ProjectionMask> nestedMask) {
            _assetCollectionParamsMask = nestedMask.apply(((_assetCollectionParamsMask == null)?AssetCollectionModuleParams.createMask():_assetCollectionParamsMask));
            getDataMap().put("assetCollectionParams", _assetCollectionParamsMask.getDataMap());
            return this;
        }

        /**
         * The params required if the module is type ASSET_COLLECTION
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withAssetCollectionParams() {
            _assetCollectionParamsMask = null;
            getDataMap().put("assetCollectionParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The params required if the module is type HIERARCHY_VIEW
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withHierarchyViewParams(Function<com.linkedin.module.HierarchyModuleParams.ProjectionMask, com.linkedin.module.HierarchyModuleParams.ProjectionMask> nestedMask) {
            _hierarchyViewParamsMask = nestedMask.apply(((_hierarchyViewParamsMask == null)?HierarchyModuleParams.createMask():_hierarchyViewParamsMask));
            getDataMap().put("hierarchyViewParams", _hierarchyViewParamsMask.getDataMap());
            return this;
        }

        /**
         * The params required if the module is type HIERARCHY_VIEW
         * 
         */
        public DataHubPageModuleParams.ProjectionMask withHierarchyViewParams() {
            _hierarchyViewParamsMask = null;
            getDataMap().put("hierarchyViewParams", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
