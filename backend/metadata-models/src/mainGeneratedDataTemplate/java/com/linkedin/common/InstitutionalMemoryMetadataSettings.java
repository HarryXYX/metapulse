
package com.linkedin.common;

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
 * Settings related to a record of InstitutionalMemoryMetadata
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/InstitutionalMemoryMetadataSettings.pdl.")
public class InstitutionalMemoryMetadataSettings
    extends RecordTemplate
{

    private final static InstitutionalMemoryMetadataSettings.Fields _fields = new InstitutionalMemoryMetadataSettings.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Settings related to a record of InstitutionalMemoryMetadata*/record InstitutionalMemoryMetadataSettings{/**Show record in asset preview like on entity header and search previews*/showInAssetPreview:boolean=false}", SchemaFormatType.PDL));
    private Boolean _showInAssetPreviewField = null;
    private InstitutionalMemoryMetadataSettings.ChangeListener __changeListener = new InstitutionalMemoryMetadataSettings.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ShowInAssetPreview = SCHEMA.getField("showInAssetPreview");
    private final static Boolean DEFAULT_ShowInAssetPreview;

    static {
        DEFAULT_ShowInAssetPreview = DataTemplateUtil.coerceBooleanOutput(FIELD_ShowInAssetPreview.getDefault());
    }

    public InstitutionalMemoryMetadataSettings() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public InstitutionalMemoryMetadataSettings(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static InstitutionalMemoryMetadataSettings.Fields fields() {
        return _fields;
    }

    public static InstitutionalMemoryMetadataSettings.ProjectionMask createMask() {
        return new InstitutionalMemoryMetadataSettings.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for showInAssetPreview
     * 
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    public boolean hasShowInAssetPreview() {
        if (_showInAssetPreviewField!= null) {
            return true;
        }
        return super._map.containsKey("showInAssetPreview");
    }

    /**
     * Remover for showInAssetPreview
     * 
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    public void removeShowInAssetPreview() {
        super._map.remove("showInAssetPreview");
    }

    /**
     * Getter for showInAssetPreview
     * 
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    @Nullable
    public Boolean isShowInAssetPreview(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isShowInAssetPreview();
            case NULL:
                if (_showInAssetPreviewField!= null) {
                    return _showInAssetPreviewField;
                } else {
                    Object __rawValue = super._map.get("showInAssetPreview");
                    _showInAssetPreviewField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _showInAssetPreviewField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for showInAssetPreview
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    @Nonnull
    public Boolean isShowInAssetPreview() {
        if (_showInAssetPreviewField!= null) {
            return _showInAssetPreviewField;
        } else {
            Object __rawValue = super._map.get("showInAssetPreview");
            if (__rawValue == null) {
                return DEFAULT_ShowInAssetPreview;
            }
            _showInAssetPreviewField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _showInAssetPreviewField;
        }
    }

    /**
     * Setter for showInAssetPreview
     * 
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    public InstitutionalMemoryMetadataSettings setShowInAssetPreview(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setShowInAssetPreview(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field showInAssetPreview of com.linkedin.common.InstitutionalMemoryMetadataSettings");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInAssetPreview", value);
                    _showInAssetPreviewField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeShowInAssetPreview();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "showInAssetPreview", value);
                    _showInAssetPreviewField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "showInAssetPreview", value);
                    _showInAssetPreviewField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for showInAssetPreview
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    public InstitutionalMemoryMetadataSettings setShowInAssetPreview(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field showInAssetPreview of com.linkedin.common.InstitutionalMemoryMetadataSettings to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "showInAssetPreview", value);
            _showInAssetPreviewField = value;
        }
        return this;
    }

    /**
     * Setter for showInAssetPreview
     * 
     * @see InstitutionalMemoryMetadataSettings.Fields#showInAssetPreview
     */
    public InstitutionalMemoryMetadataSettings setShowInAssetPreview(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "showInAssetPreview", value);
        _showInAssetPreviewField = value;
        return this;
    }

    @Override
    public InstitutionalMemoryMetadataSettings clone()
        throws CloneNotSupportedException
    {
        InstitutionalMemoryMetadataSettings __clone = ((InstitutionalMemoryMetadataSettings) super.clone());
        __clone.__changeListener = new InstitutionalMemoryMetadataSettings.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public InstitutionalMemoryMetadataSettings copy()
        throws CloneNotSupportedException
    {
        InstitutionalMemoryMetadataSettings __copy = ((InstitutionalMemoryMetadataSettings) super.copy());
        __copy._showInAssetPreviewField = null;
        __copy.__changeListener = new InstitutionalMemoryMetadataSettings.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final InstitutionalMemoryMetadataSettings __objectRef;

        private ChangeListener(InstitutionalMemoryMetadataSettings reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "showInAssetPreview":
                    __objectRef._showInAssetPreviewField = null;
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
         * Show record in asset preview like on entity header and search previews
         * 
         */
        public PathSpec showInAssetPreview() {
            return new PathSpec(getPathComponents(), "showInAssetPreview");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Show record in asset preview like on entity header and search previews
         * 
         */
        public InstitutionalMemoryMetadataSettings.ProjectionMask withShowInAssetPreview() {
            getDataMap().put("showInAssetPreview", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
