
package com.linkedin.timeseries;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Encapsulates the response of the getIndexSizes API
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/TimeseriesIndicesSizesResult.pdl.")
public class TimeseriesIndicesSizesResult
    extends RecordTemplate
{

    private final static TimeseriesIndicesSizesResult.Fields _fields = new TimeseriesIndicesSizesResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Encapsulates the response of the getIndexSizes API*/record TimeseriesIndicesSizesResult{/**Collection of index sizes for all indices in the result*/indexSizes:array[/**Encapsulates the response of the getIndexSizes API*/record TimeseriesIndexSizeResult{/**Name of the index*/indexName:string/**Name of the entity associated with the index*/entityName:string/**Name of the aspect associated with the index*/aspectName:string/**Size*/@deprecated=\"use sizeInMb instead\"sizeMb:float=0.0,sizeInMb:double=0.0}]}", SchemaFormatType.PDL));
    private TimeseriesIndexSizeResultArray _indexSizesField = null;
    private TimeseriesIndicesSizesResult.ChangeListener __changeListener = new TimeseriesIndicesSizesResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IndexSizes = SCHEMA.getField("indexSizes");

    public TimeseriesIndicesSizesResult() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public TimeseriesIndicesSizesResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TimeseriesIndicesSizesResult.Fields fields() {
        return _fields;
    }

    public static TimeseriesIndicesSizesResult.ProjectionMask createMask() {
        return new TimeseriesIndicesSizesResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for indexSizes
     * 
     * @see TimeseriesIndicesSizesResult.Fields#indexSizes
     */
    public boolean hasIndexSizes() {
        if (_indexSizesField!= null) {
            return true;
        }
        return super._map.containsKey("indexSizes");
    }

    /**
     * Remover for indexSizes
     * 
     * @see TimeseriesIndicesSizesResult.Fields#indexSizes
     */
    public void removeIndexSizes() {
        super._map.remove("indexSizes");
    }

    /**
     * Getter for indexSizes
     * 
     * @see TimeseriesIndicesSizesResult.Fields#indexSizes
     */
    @Nullable
    public TimeseriesIndexSizeResultArray getIndexSizes(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getIndexSizes();
            case DEFAULT:
            case NULL:
                if (_indexSizesField!= null) {
                    return _indexSizesField;
                } else {
                    Object __rawValue = super._map.get("indexSizes");
                    _indexSizesField = ((__rawValue == null)?null:new TimeseriesIndexSizeResultArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _indexSizesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for indexSizes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeseriesIndicesSizesResult.Fields#indexSizes
     */
    @Nonnull
    public TimeseriesIndexSizeResultArray getIndexSizes() {
        if (_indexSizesField!= null) {
            return _indexSizesField;
        } else {
            Object __rawValue = super._map.get("indexSizes");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("indexSizes");
            }
            _indexSizesField = ((__rawValue == null)?null:new TimeseriesIndexSizeResultArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _indexSizesField;
        }
    }

    /**
     * Setter for indexSizes
     * 
     * @see TimeseriesIndicesSizesResult.Fields#indexSizes
     */
    public TimeseriesIndicesSizesResult setIndexSizes(
        @Nullable
        TimeseriesIndexSizeResultArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIndexSizes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field indexSizes of com.linkedin.timeseries.TimeseriesIndicesSizesResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "indexSizes", value.data());
                    _indexSizesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIndexSizes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "indexSizes", value.data());
                    _indexSizesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "indexSizes", value.data());
                    _indexSizesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for indexSizes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeseriesIndicesSizesResult.Fields#indexSizes
     */
    public TimeseriesIndicesSizesResult setIndexSizes(
        @Nonnull
        TimeseriesIndexSizeResultArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field indexSizes of com.linkedin.timeseries.TimeseriesIndicesSizesResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "indexSizes", value.data());
            _indexSizesField = value;
        }
        return this;
    }

    @Override
    public TimeseriesIndicesSizesResult clone()
        throws CloneNotSupportedException
    {
        TimeseriesIndicesSizesResult __clone = ((TimeseriesIndicesSizesResult) super.clone());
        __clone.__changeListener = new TimeseriesIndicesSizesResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TimeseriesIndicesSizesResult copy()
        throws CloneNotSupportedException
    {
        TimeseriesIndicesSizesResult __copy = ((TimeseriesIndicesSizesResult) super.copy());
        __copy._indexSizesField = null;
        __copy.__changeListener = new TimeseriesIndicesSizesResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TimeseriesIndicesSizesResult __objectRef;

        private ChangeListener(TimeseriesIndicesSizesResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "indexSizes":
                    __objectRef._indexSizesField = null;
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
         * Collection of index sizes for all indices in the result
         * 
         */
        public com.linkedin.timeseries.TimeseriesIndexSizeResultArray.Fields indexSizes() {
            return new com.linkedin.timeseries.TimeseriesIndexSizeResultArray.Fields(getPathComponents(), "indexSizes");
        }

        /**
         * Collection of index sizes for all indices in the result
         * 
         */
        public PathSpec indexSizes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "indexSizes");
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

        private com.linkedin.timeseries.TimeseriesIndexSizeResultArray.ProjectionMask _indexSizesMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Collection of index sizes for all indices in the result
         * 
         */
        public TimeseriesIndicesSizesResult.ProjectionMask withIndexSizes(Function<com.linkedin.timeseries.TimeseriesIndexSizeResultArray.ProjectionMask, com.linkedin.timeseries.TimeseriesIndexSizeResultArray.ProjectionMask> nestedMask) {
            _indexSizesMask = nestedMask.apply(((_indexSizesMask == null)?TimeseriesIndexSizeResultArray.createMask():_indexSizesMask));
            getDataMap().put("indexSizes", _indexSizesMask.getDataMap());
            return this;
        }

        /**
         * Collection of index sizes for all indices in the result
         * 
         */
        public TimeseriesIndicesSizesResult.ProjectionMask withIndexSizes() {
            _indexSizesMask = null;
            getDataMap().put("indexSizes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Collection of index sizes for all indices in the result
         * 
         */
        public TimeseriesIndicesSizesResult.ProjectionMask withIndexSizes(Function<com.linkedin.timeseries.TimeseriesIndexSizeResultArray.ProjectionMask, com.linkedin.timeseries.TimeseriesIndexSizeResultArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _indexSizesMask = nestedMask.apply(((_indexSizesMask == null)?TimeseriesIndexSizeResultArray.createMask():_indexSizesMask));
            getDataMap().put("indexSizes", _indexSizesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("indexSizes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("indexSizes").put("$count", count);
            }
            return this;
        }

        /**
         * Collection of index sizes for all indices in the result
         * 
         */
        public TimeseriesIndicesSizesResult.ProjectionMask withIndexSizes(Integer start, Integer count) {
            _indexSizesMask = null;
            getDataMap().put("indexSizes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("indexSizes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("indexSizes").put("$count", count);
            }
            return this;
        }

    }

}
