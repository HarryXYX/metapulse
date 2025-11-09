
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
 * The params required if the module is type HIERARCHY_VIEW
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/module/HierarchyModuleParams.pdl.")
public class HierarchyModuleParams
    extends RecordTemplate
{

    private final static HierarchyModuleParams.Fields _fields = new HierarchyModuleParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module/**The params required if the module is type HIERARCHY_VIEW*/record HierarchyModuleParams{assetUrns:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]showRelatedEntities:boolean/**Optional filters to filter relatedEntities (assetUrns) out\n\nThe stringified json representing the logical predicate built in the UI to select assets.\nThis predicate is turned into orFilters to send through graphql since graphql doesn't support\narbitrary nesting. This string is used to restore the UI for this logical predicate.*/relatedEntitiesFilterJson:optional string}", SchemaFormatType.PDL));
    private UrnArray _assetUrnsField = null;
    private Boolean _showRelatedEntitiesField = null;
    private String _relatedEntitiesFilterJsonField = null;
    private HierarchyModuleParams.ChangeListener __changeListener = new HierarchyModuleParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AssetUrns = SCHEMA.getField("assetUrns");
    private final static RecordDataSchema.Field FIELD_ShowRelatedEntities = SCHEMA.getField("showRelatedEntities");
    private final static RecordDataSchema.Field FIELD_RelatedEntitiesFilterJson = SCHEMA.getField("relatedEntitiesFilterJson");

    public HierarchyModuleParams() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public HierarchyModuleParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static HierarchyModuleParams.Fields fields() {
        return _fields;
    }

    public static HierarchyModuleParams.ProjectionMask createMask() {
        return new HierarchyModuleParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for assetUrns
     * 
     * @see HierarchyModuleParams.Fields#assetUrns
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
     * @see HierarchyModuleParams.Fields#assetUrns
     */
    public void removeAssetUrns() {
        super._map.remove("assetUrns");
    }

    /**
     * Getter for assetUrns
     * 
     * @see HierarchyModuleParams.Fields#assetUrns
     */
    @Nullable
    public UrnArray getAssetUrns(GetMode mode) {
        return getAssetUrns();
    }

    /**
     * Getter for assetUrns
     * 
     * @return
     *     Optional field. Always check for null.
     * @see HierarchyModuleParams.Fields#assetUrns
     */
    @Nullable
    public UrnArray getAssetUrns() {
        if (_assetUrnsField!= null) {
            return _assetUrnsField;
        } else {
            Object __rawValue = super._map.get("assetUrns");
            _assetUrnsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _assetUrnsField;
        }
    }

    /**
     * Setter for assetUrns
     * 
     * @see HierarchyModuleParams.Fields#assetUrns
     */
    public HierarchyModuleParams setAssetUrns(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssetUrns(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see HierarchyModuleParams.Fields#assetUrns
     */
    public HierarchyModuleParams setAssetUrns(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assetUrns of com.linkedin.module.HierarchyModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assetUrns", value.data());
            _assetUrnsField = value;
        }
        return this;
    }

    /**
     * Existence checker for showRelatedEntities
     * 
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    public boolean hasShowRelatedEntities() {
        if (_showRelatedEntitiesField!= null) {
            return true;
        }
        return super._map.containsKey("showRelatedEntities");
    }

    /**
     * Remover for showRelatedEntities
     * 
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    public void removeShowRelatedEntities() {
        super._map.remove("showRelatedEntities");
    }

    /**
     * Getter for showRelatedEntities
     * 
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    @Nullable
    public Boolean isShowRelatedEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isShowRelatedEntities();
            case DEFAULT:
            case NULL:
                if (_showRelatedEntitiesField!= null) {
                    return _showRelatedEntitiesField;
                } else {
                    Object __rawValue = super._map.get("showRelatedEntities");
                    _showRelatedEntitiesField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _showRelatedEntitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for showRelatedEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    @Nonnull
    public Boolean isShowRelatedEntities() {
        if (_showRelatedEntitiesField!= null) {
            return _showRelatedEntitiesField;
        } else {
            Object __rawValue = super._map.get("showRelatedEntities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("showRelatedEntities");
            }
            _showRelatedEntitiesField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showRelatedEntitiesField;
        }
    }

    /**
     * Setter for showRelatedEntities
     * 
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    public HierarchyModuleParams setShowRelatedEntities(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowRelatedEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field showRelatedEntities of com.linkedin.module.HierarchyModuleParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showRelatedEntities", value);
                    _showRelatedEntitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowRelatedEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showRelatedEntities", value);
                    _showRelatedEntitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showRelatedEntities", value);
                    _showRelatedEntitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showRelatedEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    public HierarchyModuleParams setShowRelatedEntities(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showRelatedEntities of com.linkedin.module.HierarchyModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showRelatedEntities", value);
            _showRelatedEntitiesField = value;
        }
        return this;
    }

    /**
     * Setter for showRelatedEntities
     * 
     * @see HierarchyModuleParams.Fields#showRelatedEntities
     */
    public HierarchyModuleParams setShowRelatedEntities(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showRelatedEntities", value);
        _showRelatedEntitiesField = value;
        return this;
    }

    /**
     * Existence checker for relatedEntitiesFilterJson
     * 
     * @see HierarchyModuleParams.Fields#relatedEntitiesFilterJson
     */
    public boolean hasRelatedEntitiesFilterJson() {
        if (_relatedEntitiesFilterJsonField!= null) {
            return true;
        }
        return super._map.containsKey("relatedEntitiesFilterJson");
    }

    /**
     * Remover for relatedEntitiesFilterJson
     * 
     * @see HierarchyModuleParams.Fields#relatedEntitiesFilterJson
     */
    public void removeRelatedEntitiesFilterJson() {
        super._map.remove("relatedEntitiesFilterJson");
    }

    /**
     * Getter for relatedEntitiesFilterJson
     * 
     * @see HierarchyModuleParams.Fields#relatedEntitiesFilterJson
     */
    @Nullable
    public String getRelatedEntitiesFilterJson(GetMode mode) {
        return getRelatedEntitiesFilterJson();
    }

    /**
     * Getter for relatedEntitiesFilterJson
     * 
     * @return
     *     Optional field. Always check for null.
     * @see HierarchyModuleParams.Fields#relatedEntitiesFilterJson
     */
    @Nullable
    public String getRelatedEntitiesFilterJson() {
        if (_relatedEntitiesFilterJsonField!= null) {
            return _relatedEntitiesFilterJsonField;
        } else {
            Object __rawValue = super._map.get("relatedEntitiesFilterJson");
            _relatedEntitiesFilterJsonField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _relatedEntitiesFilterJsonField;
        }
    }

    /**
     * Setter for relatedEntitiesFilterJson
     * 
     * @see HierarchyModuleParams.Fields#relatedEntitiesFilterJson
     */
    public HierarchyModuleParams setRelatedEntitiesFilterJson(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelatedEntitiesFilterJson(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelatedEntitiesFilterJson();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relatedEntitiesFilterJson", value);
                    _relatedEntitiesFilterJsonField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relatedEntitiesFilterJson", value);
                    _relatedEntitiesFilterJsonField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relatedEntitiesFilterJson
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see HierarchyModuleParams.Fields#relatedEntitiesFilterJson
     */
    public HierarchyModuleParams setRelatedEntitiesFilterJson(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relatedEntitiesFilterJson of com.linkedin.module.HierarchyModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relatedEntitiesFilterJson", value);
            _relatedEntitiesFilterJsonField = value;
        }
        return this;
    }

    @Override
    public HierarchyModuleParams clone()
        throws CloneNotSupportedException
    {
        HierarchyModuleParams __clone = ((HierarchyModuleParams) super.clone());
        __clone.__changeListener = new HierarchyModuleParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public HierarchyModuleParams copy()
        throws CloneNotSupportedException
    {
        HierarchyModuleParams __copy = ((HierarchyModuleParams) super.copy());
        __copy._assetUrnsField = null;
        __copy._showRelatedEntitiesField = null;
        __copy._relatedEntitiesFilterJsonField = null;
        __copy.__changeListener = new HierarchyModuleParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final HierarchyModuleParams __objectRef;

        private ChangeListener(HierarchyModuleParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "assetUrns":
                    __objectRef._assetUrnsField = null;
                    break;
                case "showRelatedEntities":
                    __objectRef._showRelatedEntitiesField = null;
                    break;
                case "relatedEntitiesFilterJson":
                    __objectRef._relatedEntitiesFilterJsonField = null;
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

        public PathSpec showRelatedEntities() {
            return new PathSpec(getPathComponents(), "showRelatedEntities");
        }

        /**
         * Optional filters to filter relatedEntities (assetUrns) out
         * 
         * The stringified json representing the logical predicate built in the UI to select assets.
         * This predicate is turned into orFilters to send through graphql since graphql doesn't support
         * arbitrary nesting. This string is used to restore the UI for this logical predicate.
         * 
         */
        public PathSpec relatedEntitiesFilterJson() {
            return new PathSpec(getPathComponents(), "relatedEntitiesFilterJson");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        public HierarchyModuleParams.ProjectionMask withAssetUrns() {
            getDataMap().put("assetUrns", MaskMap.POSITIVE_MASK);
            return this;
        }

        public HierarchyModuleParams.ProjectionMask withAssetUrns(Integer start, Integer count) {
            getDataMap().put("assetUrns", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("assetUrns").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("assetUrns").put("$count", count);
            }
            return this;
        }

        public HierarchyModuleParams.ProjectionMask withShowRelatedEntities() {
            getDataMap().put("showRelatedEntities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional filters to filter relatedEntities (assetUrns) out
         * 
         * The stringified json representing the logical predicate built in the UI to select assets.
         * This predicate is turned into orFilters to send through graphql since graphql doesn't support
         * arbitrary nesting. This string is used to restore the UI for this logical predicate.
         * 
         */
        public HierarchyModuleParams.ProjectionMask withRelatedEntitiesFilterJson() {
            getDataMap().put("relatedEntitiesFilterJson", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
