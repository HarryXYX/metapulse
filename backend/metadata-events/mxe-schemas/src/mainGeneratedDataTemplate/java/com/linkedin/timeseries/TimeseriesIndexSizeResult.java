
package com.linkedin.timeseries;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Encapsulates the response of the getIndexSizes API
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/TimeseriesIndexSizeResult.pdl.")
public class TimeseriesIndexSizeResult
    extends RecordTemplate
{

    private final static TimeseriesIndexSizeResult.Fields _fields = new TimeseriesIndexSizeResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Encapsulates the response of the getIndexSizes API*/record TimeseriesIndexSizeResult{/**Name of the index*/indexName:string/**Name of the entity associated with the index*/entityName:string/**Name of the aspect associated with the index*/aspectName:string/**Size*/@deprecated=\"use sizeInMb instead\"sizeMb:float=0.0,sizeInMb:double=0.0}", SchemaFormatType.PDL));
    private String _indexNameField = null;
    private String _entityNameField = null;
    private String _aspectNameField = null;
    private Float _sizeMbField = null;
    private Double _sizeInMbField = null;
    private TimeseriesIndexSizeResult.ChangeListener __changeListener = new TimeseriesIndexSizeResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IndexName = SCHEMA.getField("indexName");
    private final static RecordDataSchema.Field FIELD_EntityName = SCHEMA.getField("entityName");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_SizeMb = SCHEMA.getField("sizeMb");
    private final static Float DEFAULT_SizeMb;
    private final static RecordDataSchema.Field FIELD_SizeInMb = SCHEMA.getField("sizeInMb");
    private final static Double DEFAULT_SizeInMb;

    static {
        DEFAULT_SizeMb = DataTemplateUtil.coerceFloatOutput(FIELD_SizeMb.getDefault());
        DEFAULT_SizeInMb = DataTemplateUtil.coerceDoubleOutput(FIELD_SizeInMb.getDefault());
    }

    public TimeseriesIndexSizeResult() {
        super(new DataMap(7, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TimeseriesIndexSizeResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TimeseriesIndexSizeResult.Fields fields() {
        return _fields;
    }

    public static TimeseriesIndexSizeResult.ProjectionMask createMask() {
        return new TimeseriesIndexSizeResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for indexName
     * 
     * @see TimeseriesIndexSizeResult.Fields#indexName
     */
    public boolean hasIndexName() {
        if (_indexNameField!= null) {
            return true;
        }
        return super._map.containsKey("indexName");
    }

    /**
     * Remover for indexName
     * 
     * @see TimeseriesIndexSizeResult.Fields#indexName
     */
    public void removeIndexName() {
        super._map.remove("indexName");
    }

    /**
     * Getter for indexName
     * 
     * @see TimeseriesIndexSizeResult.Fields#indexName
     */
    @Nullable
    public String getIndexName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getIndexName();
            case DEFAULT:
            case NULL:
                if (_indexNameField!= null) {
                    return _indexNameField;
                } else {
                    Object __rawValue = super._map.get("indexName");
                    _indexNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _indexNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for indexName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeseriesIndexSizeResult.Fields#indexName
     */
    @Nonnull
    public String getIndexName() {
        if (_indexNameField!= null) {
            return _indexNameField;
        } else {
            Object __rawValue = super._map.get("indexName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("indexName");
            }
            _indexNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _indexNameField;
        }
    }

    /**
     * Setter for indexName
     * 
     * @see TimeseriesIndexSizeResult.Fields#indexName
     */
    public TimeseriesIndexSizeResult setIndexName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIndexName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field indexName of com.linkedin.timeseries.TimeseriesIndexSizeResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "indexName", value);
                    _indexNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIndexName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "indexName", value);
                    _indexNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "indexName", value);
                    _indexNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for indexName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesIndexSizeResult.Fields#indexName
     */
    public TimeseriesIndexSizeResult setIndexName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field indexName of com.linkedin.timeseries.TimeseriesIndexSizeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "indexName", value);
            _indexNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityName
     * 
     * @see TimeseriesIndexSizeResult.Fields#entityName
     */
    public boolean hasEntityName() {
        if (_entityNameField!= null) {
            return true;
        }
        return super._map.containsKey("entityName");
    }

    /**
     * Remover for entityName
     * 
     * @see TimeseriesIndexSizeResult.Fields#entityName
     */
    public void removeEntityName() {
        super._map.remove("entityName");
    }

    /**
     * Getter for entityName
     * 
     * @see TimeseriesIndexSizeResult.Fields#entityName
     */
    @Nullable
    public String getEntityName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityName();
            case DEFAULT:
            case NULL:
                if (_entityNameField!= null) {
                    return _entityNameField;
                } else {
                    Object __rawValue = super._map.get("entityName");
                    _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeseriesIndexSizeResult.Fields#entityName
     */
    @Nonnull
    public String getEntityName() {
        if (_entityNameField!= null) {
            return _entityNameField;
        } else {
            Object __rawValue = super._map.get("entityName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityName");
            }
            _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityNameField;
        }
    }

    /**
     * Setter for entityName
     * 
     * @see TimeseriesIndexSizeResult.Fields#entityName
     */
    public TimeseriesIndexSizeResult setEntityName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityName of com.linkedin.timeseries.TimeseriesIndexSizeResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesIndexSizeResult.Fields#entityName
     */
    public TimeseriesIndexSizeResult setEntityName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityName of com.linkedin.timeseries.TimeseriesIndexSizeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityName", value);
            _entityNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see TimeseriesIndexSizeResult.Fields#aspectName
     */
    public boolean hasAspectName() {
        if (_aspectNameField!= null) {
            return true;
        }
        return super._map.containsKey("aspectName");
    }

    /**
     * Remover for aspectName
     * 
     * @see TimeseriesIndexSizeResult.Fields#aspectName
     */
    public void removeAspectName() {
        super._map.remove("aspectName");
    }

    /**
     * Getter for aspectName
     * 
     * @see TimeseriesIndexSizeResult.Fields#aspectName
     */
    @Nullable
    public String getAspectName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectName();
            case DEFAULT:
            case NULL:
                if (_aspectNameField!= null) {
                    return _aspectNameField;
                } else {
                    Object __rawValue = super._map.get("aspectName");
                    _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeseriesIndexSizeResult.Fields#aspectName
     */
    @Nonnull
    public String getAspectName() {
        if (_aspectNameField!= null) {
            return _aspectNameField;
        } else {
            Object __rawValue = super._map.get("aspectName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectName");
            }
            _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectNameField;
        }
    }

    /**
     * Setter for aspectName
     * 
     * @see TimeseriesIndexSizeResult.Fields#aspectName
     */
    public TimeseriesIndexSizeResult setAspectName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectName of com.linkedin.timeseries.TimeseriesIndexSizeResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesIndexSizeResult.Fields#aspectName
     */
    public TimeseriesIndexSizeResult setAspectName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectName of com.linkedin.timeseries.TimeseriesIndexSizeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
            _aspectNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for sizeMb
     * 
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    public boolean hasSizeMb() {
        if (_sizeMbField!= null) {
            return true;
        }
        return super._map.containsKey("sizeMb");
    }

    /**
     * Remover for sizeMb
     * 
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    public void removeSizeMb() {
        super._map.remove("sizeMb");
    }

    /**
     * Getter for sizeMb
     * 
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    @Nullable
    public Float getSizeMb(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getSizeMb();
            case NULL:
                if (_sizeMbField!= null) {
                    return _sizeMbField;
                } else {
                    Object __rawValue = super._map.get("sizeMb");
                    _sizeMbField = DataTemplateUtil.coerceFloatOutput(__rawValue);
                    return _sizeMbField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sizeMb
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    @Nonnull
    public Float getSizeMb() {
        if (_sizeMbField!= null) {
            return _sizeMbField;
        } else {
            Object __rawValue = super._map.get("sizeMb");
            if (__rawValue == null) {
                return DEFAULT_SizeMb;
            }
            _sizeMbField = DataTemplateUtil.coerceFloatOutput(__rawValue);
            return _sizeMbField;
        }
    }

    /**
     * Setter for sizeMb
     * 
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    public TimeseriesIndexSizeResult setSizeMb(
        @Nullable
        Float value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSizeMb(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sizeMb of com.linkedin.timeseries.TimeseriesIndexSizeResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sizeMb", DataTemplateUtil.coerceFloatInput(value));
                    _sizeMbField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSizeMb();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sizeMb", DataTemplateUtil.coerceFloatInput(value));
                    _sizeMbField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sizeMb", DataTemplateUtil.coerceFloatInput(value));
                    _sizeMbField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sizeMb
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    public TimeseriesIndexSizeResult setSizeMb(
        @Nonnull
        Float value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sizeMb of com.linkedin.timeseries.TimeseriesIndexSizeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sizeMb", DataTemplateUtil.coerceFloatInput(value));
            _sizeMbField = value;
        }
        return this;
    }

    /**
     * Setter for sizeMb
     * 
     * @deprecated
     *     use sizeInMb instead
     * @see TimeseriesIndexSizeResult.Fields#sizeMb
     */
    @Deprecated
    public TimeseriesIndexSizeResult setSizeMb(float value) {
        CheckedUtil.putWithoutChecking(super._map, "sizeMb", DataTemplateUtil.coerceFloatInput(value));
        _sizeMbField = value;
        return this;
    }

    /**
     * Existence checker for sizeInMb
     * 
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    public boolean hasSizeInMb() {
        if (_sizeInMbField!= null) {
            return true;
        }
        return super._map.containsKey("sizeInMb");
    }

    /**
     * Remover for sizeInMb
     * 
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    public void removeSizeInMb() {
        super._map.remove("sizeInMb");
    }

    /**
     * Getter for sizeInMb
     * 
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    @Nullable
    public Double getSizeInMb(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getSizeInMb();
            case NULL:
                if (_sizeInMbField!= null) {
                    return _sizeInMbField;
                } else {
                    Object __rawValue = super._map.get("sizeInMb");
                    _sizeInMbField = DataTemplateUtil.coerceDoubleOutput(__rawValue);
                    return _sizeInMbField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sizeInMb
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    @Nonnull
    public Double getSizeInMb() {
        if (_sizeInMbField!= null) {
            return _sizeInMbField;
        } else {
            Object __rawValue = super._map.get("sizeInMb");
            if (__rawValue == null) {
                return DEFAULT_SizeInMb;
            }
            _sizeInMbField = DataTemplateUtil.coerceDoubleOutput(__rawValue);
            return _sizeInMbField;
        }
    }

    /**
     * Setter for sizeInMb
     * 
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    public TimeseriesIndexSizeResult setSizeInMb(
        @Nullable
        Double value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSizeInMb(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sizeInMb of com.linkedin.timeseries.TimeseriesIndexSizeResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sizeInMb", DataTemplateUtil.coerceDoubleInput(value));
                    _sizeInMbField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSizeInMb();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sizeInMb", DataTemplateUtil.coerceDoubleInput(value));
                    _sizeInMbField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sizeInMb", DataTemplateUtil.coerceDoubleInput(value));
                    _sizeInMbField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sizeInMb
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    public TimeseriesIndexSizeResult setSizeInMb(
        @Nonnull
        Double value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sizeInMb of com.linkedin.timeseries.TimeseriesIndexSizeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sizeInMb", DataTemplateUtil.coerceDoubleInput(value));
            _sizeInMbField = value;
        }
        return this;
    }

    /**
     * Setter for sizeInMb
     * 
     * @see TimeseriesIndexSizeResult.Fields#sizeInMb
     */
    public TimeseriesIndexSizeResult setSizeInMb(double value) {
        CheckedUtil.putWithoutChecking(super._map, "sizeInMb", DataTemplateUtil.coerceDoubleInput(value));
        _sizeInMbField = value;
        return this;
    }

    @Override
    public TimeseriesIndexSizeResult clone()
        throws CloneNotSupportedException
    {
        TimeseriesIndexSizeResult __clone = ((TimeseriesIndexSizeResult) super.clone());
        __clone.__changeListener = new TimeseriesIndexSizeResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TimeseriesIndexSizeResult copy()
        throws CloneNotSupportedException
    {
        TimeseriesIndexSizeResult __copy = ((TimeseriesIndexSizeResult) super.copy());
        __copy._aspectNameField = null;
        __copy._indexNameField = null;
        __copy._entityNameField = null;
        __copy._sizeMbField = null;
        __copy._sizeInMbField = null;
        __copy.__changeListener = new TimeseriesIndexSizeResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TimeseriesIndexSizeResult __objectRef;

        private ChangeListener(TimeseriesIndexSizeResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspectName":
                    __objectRef._aspectNameField = null;
                    break;
                case "indexName":
                    __objectRef._indexNameField = null;
                    break;
                case "entityName":
                    __objectRef._entityNameField = null;
                    break;
                case "sizeMb":
                    __objectRef._sizeMbField = null;
                    break;
                case "sizeInMb":
                    __objectRef._sizeInMbField = null;
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
         * Name of the index
         * 
         */
        public PathSpec indexName() {
            return new PathSpec(getPathComponents(), "indexName");
        }

        /**
         * Name of the entity associated with the index
         * 
         */
        public PathSpec entityName() {
            return new PathSpec(getPathComponents(), "entityName");
        }

        /**
         * Name of the aspect associated with the index
         * 
         */
        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        /**
         * Size
         * 
         * @deprecated
         *     use sizeInMb instead
         */
        @Deprecated
        public PathSpec sizeMb() {
            return new PathSpec(getPathComponents(), "sizeMb");
        }

        public PathSpec sizeInMb() {
            return new PathSpec(getPathComponents(), "sizeInMb");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * Name of the index
         * 
         */
        public TimeseriesIndexSizeResult.ProjectionMask withIndexName() {
            getDataMap().put("indexName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the entity associated with the index
         * 
         */
        public TimeseriesIndexSizeResult.ProjectionMask withEntityName() {
            getDataMap().put("entityName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the aspect associated with the index
         * 
         */
        public TimeseriesIndexSizeResult.ProjectionMask withAspectName() {
            getDataMap().put("aspectName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size
         * 
         * @deprecated
         *     use sizeInMb instead
         */
        @Deprecated
        public TimeseriesIndexSizeResult.ProjectionMask withSizeMb() {
            getDataMap().put("sizeMb", MaskMap.POSITIVE_MASK);
            return this;
        }

        public TimeseriesIndexSizeResult.ProjectionMask withSizeInMb() {
            getDataMap().put("sizeInMb", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
