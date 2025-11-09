
package com.linkedin.dataset;

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
 * Iceberg Catalog metadata associated with an Iceberg table/view
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/IcebergCatalogInfo.pdl.")
public class IcebergCatalogInfo
    extends RecordTemplate
{

    private final static IcebergCatalogInfo.Fields _fields = new IcebergCatalogInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Iceberg Catalog metadata associated with an Iceberg table/view*/@Aspect.name=\"icebergCatalogInfo\"record IcebergCatalogInfo{/**When Datahub is the REST Catalog for an Iceberg Table, stores the current metadata pointer.\nIf the Iceberg table is managed by an external catalog, the metadata pointer is not set.*/metadataPointer:optional string,view:optional boolean}", SchemaFormatType.PDL));
    private String _metadataPointerField = null;
    private Boolean _viewField = null;
    private IcebergCatalogInfo.ChangeListener __changeListener = new IcebergCatalogInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_MetadataPointer = SCHEMA.getField("metadataPointer");
    private final static RecordDataSchema.Field FIELD_View = SCHEMA.getField("view");

    public IcebergCatalogInfo() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IcebergCatalogInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IcebergCatalogInfo.Fields fields() {
        return _fields;
    }

    public static IcebergCatalogInfo.ProjectionMask createMask() {
        return new IcebergCatalogInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for metadataPointer
     * 
     * @see IcebergCatalogInfo.Fields#metadataPointer
     */
    public boolean hasMetadataPointer() {
        if (_metadataPointerField!= null) {
            return true;
        }
        return super._map.containsKey("metadataPointer");
    }

    /**
     * Remover for metadataPointer
     * 
     * @see IcebergCatalogInfo.Fields#metadataPointer
     */
    public void removeMetadataPointer() {
        super._map.remove("metadataPointer");
    }

    /**
     * Getter for metadataPointer
     * 
     * @see IcebergCatalogInfo.Fields#metadataPointer
     */
    @Nullable
    public String getMetadataPointer(GetMode mode) {
        return getMetadataPointer();
    }

    /**
     * Getter for metadataPointer
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IcebergCatalogInfo.Fields#metadataPointer
     */
    @Nullable
    public String getMetadataPointer() {
        if (_metadataPointerField!= null) {
            return _metadataPointerField;
        } else {
            Object __rawValue = super._map.get("metadataPointer");
            _metadataPointerField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _metadataPointerField;
        }
    }

    /**
     * Setter for metadataPointer
     * 
     * @see IcebergCatalogInfo.Fields#metadataPointer
     */
    public IcebergCatalogInfo setMetadataPointer(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadataPointer(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadataPointer();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadataPointer", value);
                    _metadataPointerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadataPointer", value);
                    _metadataPointerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadataPointer
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergCatalogInfo.Fields#metadataPointer
     */
    public IcebergCatalogInfo setMetadataPointer(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadataPointer of com.linkedin.dataset.IcebergCatalogInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadataPointer", value);
            _metadataPointerField = value;
        }
        return this;
    }

    /**
     * Existence checker for view
     * 
     * @see IcebergCatalogInfo.Fields#view
     */
    public boolean hasView() {
        if (_viewField!= null) {
            return true;
        }
        return super._map.containsKey("view");
    }

    /**
     * Remover for view
     * 
     * @see IcebergCatalogInfo.Fields#view
     */
    public void removeView() {
        super._map.remove("view");
    }

    /**
     * Getter for view
     * 
     * @see IcebergCatalogInfo.Fields#view
     */
    @Nullable
    public Boolean isView(GetMode mode) {
        return isView();
    }

    /**
     * Getter for view
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IcebergCatalogInfo.Fields#view
     */
    @Nullable
    public Boolean isView() {
        if (_viewField!= null) {
            return _viewField;
        } else {
            Object __rawValue = super._map.get("view");
            _viewField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _viewField;
        }
    }

    /**
     * Setter for view
     * 
     * @see IcebergCatalogInfo.Fields#view
     */
    public IcebergCatalogInfo setView(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setView(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeView();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "view", value);
                    _viewField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "view", value);
                    _viewField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for view
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IcebergCatalogInfo.Fields#view
     */
    public IcebergCatalogInfo setView(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field view of com.linkedin.dataset.IcebergCatalogInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "view", value);
            _viewField = value;
        }
        return this;
    }

    /**
     * Setter for view
     * 
     * @see IcebergCatalogInfo.Fields#view
     */
    public IcebergCatalogInfo setView(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "view", value);
        _viewField = value;
        return this;
    }

    @Override
    public IcebergCatalogInfo clone()
        throws CloneNotSupportedException
    {
        IcebergCatalogInfo __clone = ((IcebergCatalogInfo) super.clone());
        __clone.__changeListener = new IcebergCatalogInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IcebergCatalogInfo copy()
        throws CloneNotSupportedException
    {
        IcebergCatalogInfo __copy = ((IcebergCatalogInfo) super.copy());
        __copy._viewField = null;
        __copy._metadataPointerField = null;
        __copy.__changeListener = new IcebergCatalogInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IcebergCatalogInfo __objectRef;

        private ChangeListener(IcebergCatalogInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "view":
                    __objectRef._viewField = null;
                    break;
                case "metadataPointer":
                    __objectRef._metadataPointerField = null;
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
         * When Datahub is the REST Catalog for an Iceberg Table, stores the current metadata pointer.
         * If the Iceberg table is managed by an external catalog, the metadata pointer is not set.
         * 
         */
        public PathSpec metadataPointer() {
            return new PathSpec(getPathComponents(), "metadataPointer");
        }

        public PathSpec view() {
            return new PathSpec(getPathComponents(), "view");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * When Datahub is the REST Catalog for an Iceberg Table, stores the current metadata pointer.
         * If the Iceberg table is managed by an external catalog, the metadata pointer is not set.
         * 
         */
        public IcebergCatalogInfo.ProjectionMask withMetadataPointer() {
            getDataMap().put("metadataPointer", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IcebergCatalogInfo.ProjectionMask withView() {
            getDataMap().put("view", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
