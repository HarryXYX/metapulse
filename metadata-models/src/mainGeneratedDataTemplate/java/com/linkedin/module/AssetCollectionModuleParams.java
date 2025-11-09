
package com.linkedin.module;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * The params required if the module is type ASSET_COLLECTION
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/module/AssetCollectionModuleParams.pdl.")
public class AssetCollectionModuleParams
    extends RecordTemplate
{

    private final static AssetCollectionModuleParams.Fields _fields = new AssetCollectionModuleParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module/**The params required if the module is type ASSET_COLLECTION*/record AssetCollectionModuleParams{assetUrns:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Optional dynamic filters\n\nThe stringified json representing the logical predicate built in the UI to select assets.\nThis predicate is turned into orFilters to send through graphql since graphql doesn't support\narbitrary nesting. This string is used to restore the UI for this logical predicate.*/dynamicFilterJson:optional string}", SchemaFormatType.PDL));
    private UrnArray _assetUrnsField = null;
    private String _dynamicFilterJsonField = null;
    private AssetCollectionModuleParams.ChangeListener __changeListener = new AssetCollectionModuleParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AssetUrns = SCHEMA.getField("assetUrns");
    private final static RecordDataSchema.Field FIELD_DynamicFilterJson = SCHEMA.getField("dynamicFilterJson");

    public AssetCollectionModuleParams() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AssetCollectionModuleParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssetCollectionModuleParams.Fields fields() {
        return _fields;
    }

    public static AssetCollectionModuleParams.ProjectionMask createMask() {
        return new AssetCollectionModuleParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for assetUrns
     * 
     * @see AssetCollectionModuleParams.Fields#assetUrns
     */
    public boolean hasAssetUrns() {
        if (_assetUrnsField!= null) {
            return true;
        }
        return super._map.containsKey("assetUrns");
    }

    /**
     * Remover for assetUrns
     * 
     * @see AssetCollectionModuleParams.Fields#assetUrns
     */
    public void removeAssetUrns() {
        super._map.remove("assetUrns");
    }

    /**
     * Getter for assetUrns
     * 
     * @see AssetCollectionModuleParams.Fields#assetUrns
     */
    @Nullable
    public UrnArray getAssetUrns(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAssetUrns();
            case DEFAULT:
            case NULL:
                if (_assetUrnsField!= null) {
                    return _assetUrnsField;
                } else {
                    Object __rawValue = super._map.get("assetUrns");
                    _assetUrnsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _assetUrnsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for assetUrns
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssetCollectionModuleParams.Fields#assetUrns
     */
    @Nonnull
    public UrnArray getAssetUrns() {
        if (_assetUrnsField!= null) {
            return _assetUrnsField;
        } else {
            Object __rawValue = super._map.get("assetUrns");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("assetUrns");
            }
            _assetUrnsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _assetUrnsField;
        }
    }

    /**
     * Setter for assetUrns
     * 
     * @see AssetCollectionModuleParams.Fields#assetUrns
     */
    public AssetCollectionModuleParams setAssetUrns(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssetUrns(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field assetUrns of com.linkedin.module.AssetCollectionModuleParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assetUrns", value.data());
                    _assetUrnsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssetUrns();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assetUrns", value.data());
                    _assetUrnsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assetUrns", value.data());
                    _assetUrnsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assetUrns
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssetCollectionModuleParams.Fields#assetUrns
     */
    public AssetCollectionModuleParams setAssetUrns(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assetUrns of com.linkedin.module.AssetCollectionModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assetUrns", value.data());
            _assetUrnsField = value;
        }
        return this;
    }

    /**
     * Existence checker for dynamicFilterJson
     * 
     * @see AssetCollectionModuleParams.Fields#dynamicFilterJson
     */
    public boolean hasDynamicFilterJson() {
        if (_dynamicFilterJsonField!= null) {
            return true;
        }
        return super._map.containsKey("dynamicFilterJson");
    }

    /**
     * Remover for dynamicFilterJson
     * 
     * @see AssetCollectionModuleParams.Fields#dynamicFilterJson
     */
    public void removeDynamicFilterJson() {
        super._map.remove("dynamicFilterJson");
    }

    /**
     * Getter for dynamicFilterJson
     * 
     * @see AssetCollectionModuleParams.Fields#dynamicFilterJson
     */
    @Nullable
    public String getDynamicFilterJson(GetMode mode) {
        return getDynamicFilterJson();
    }

    /**
     * Getter for dynamicFilterJson
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssetCollectionModuleParams.Fields#dynamicFilterJson
     */
    @Nullable
    public String getDynamicFilterJson() {
        if (_dynamicFilterJsonField!= null) {
            return _dynamicFilterJsonField;
        } else {
            Object __rawValue = super._map.get("dynamicFilterJson");
            _dynamicFilterJsonField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _dynamicFilterJsonField;
        }
    }

    /**
     * Setter for dynamicFilterJson
     * 
     * @see AssetCollectionModuleParams.Fields#dynamicFilterJson
     */
    public AssetCollectionModuleParams setDynamicFilterJson(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDynamicFilterJson(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDynamicFilterJson();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dynamicFilterJson", value);
                    _dynamicFilterJsonField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dynamicFilterJson", value);
                    _dynamicFilterJsonField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dynamicFilterJson
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssetCollectionModuleParams.Fields#dynamicFilterJson
     */
    public AssetCollectionModuleParams setDynamicFilterJson(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dynamicFilterJson of com.linkedin.module.AssetCollectionModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dynamicFilterJson", value);
            _dynamicFilterJsonField = value;
        }
        return this;
    }

    @Override
    public AssetCollectionModuleParams clone()
        throws CloneNotSupportedException
    {
        AssetCollectionModuleParams __clone = ((AssetCollectionModuleParams) super.clone());
        __clone.__changeListener = new AssetCollectionModuleParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssetCollectionModuleParams copy()
        throws CloneNotSupportedException
    {
        AssetCollectionModuleParams __copy = ((AssetCollectionModuleParams) super.copy());
        __copy._assetUrnsField = null;
        __copy._dynamicFilterJsonField = null;
        __copy.__changeListener = new AssetCollectionModuleParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssetCollectionModuleParams __objectRef;

        private ChangeListener(AssetCollectionModuleParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "assetUrns":
                    __objectRef._assetUrnsField = null;
                    break;
                case "dynamicFilterJson":
                    __objectRef._dynamicFilterJsonField = null;
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

        public PathSpec assetUrns() {
            return new PathSpec(getPathComponents(), "assetUrns");
        }

        public PathSpec assetUrns(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "assetUrns");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Optional dynamic filters
         * 
         * The stringified json representing the logical predicate built in the UI to select assets.
         * This predicate is turned into orFilters to send through graphql since graphql doesn't support
         * arbitrary nesting. This string is used to restore the UI for this logical predicate.
         * 
         */
        public PathSpec dynamicFilterJson() {
            return new PathSpec(getPathComponents(), "dynamicFilterJson");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public AssetCollectionModuleParams.ProjectionMask withAssetUrns() {
            getDataMap().put("assetUrns", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AssetCollectionModuleParams.ProjectionMask withAssetUrns(Integer start, Integer count) {
            getDataMap().put("assetUrns", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("assetUrns").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("assetUrns").put("$count", count);
            }
            return this;
        }

        /**
         * Optional dynamic filters
         * 
         * The stringified json representing the logical predicate built in the UI to select assets.
         * This predicate is turned into orFilters to send through graphql since graphql doesn't support
         * arbitrary nesting. This string is used to restore the UI for this logical predicate.
         * 
         */
        public AssetCollectionModuleParams.ProjectionMask withDynamicFilterJson() {
            getDataMap().put("dynamicFilterJson", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
