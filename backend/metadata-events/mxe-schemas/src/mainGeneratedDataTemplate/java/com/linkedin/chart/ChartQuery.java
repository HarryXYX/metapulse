
package com.linkedin.chart;

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
 * Information for chart query which is used for getting data of the chart
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartQuery.pdl.")
public class ChartQuery
    extends RecordTemplate
{

    private final static ChartQuery.Fields _fields = new ChartQuery.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**Information for chart query which is used for getting data of the chart*/@Aspect.name=\"chartQuery\"record ChartQuery{/**Raw query to build a chart from input datasets*/rawQuery:string/**Chart query type*/@Searchable={\"addToFilters\":true,\"fieldName\":\"queryType\",\"fieldType\":\"KEYWORD\",\"filterNameOverride\":\"Query Type\"}type:enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}}", SchemaFormatType.PDL));
    private String _rawQueryField = null;
    private ChartQueryType _typeField = null;
    private ChartQuery.ChangeListener __changeListener = new ChartQuery.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RawQuery = SCHEMA.getField("rawQuery");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    public ChartQuery() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ChartQuery(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ChartQuery.Fields fields() {
        return _fields;
    }

    public static ChartQuery.ProjectionMask createMask() {
        return new ChartQuery.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public boolean hasRawQuery() {
        if (_rawQueryField!= null) {
            return true;
        }
        return super._map.containsKey("rawQuery");
    }

    /**
     * Remover for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public void removeRawQuery() {
        super._map.remove("rawQuery");
    }

    /**
     * Getter for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    @Nullable
    public String getRawQuery(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRawQuery();
            case DEFAULT:
            case NULL:
                if (_rawQueryField!= null) {
                    return _rawQueryField;
                } else {
                    Object __rawValue = super._map.get("rawQuery");
                    _rawQueryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _rawQueryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rawQuery
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartQuery.Fields#rawQuery
     */
    @Nonnull
    public String getRawQuery() {
        if (_rawQueryField!= null) {
            return _rawQueryField;
        } else {
            Object __rawValue = super._map.get("rawQuery");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rawQuery");
            }
            _rawQueryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _rawQueryField;
        }
    }

    /**
     * Setter for rawQuery
     * 
     * @see ChartQuery.Fields#rawQuery
     */
    public ChartQuery setRawQuery(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRawQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rawQuery of com.linkedin.chart.ChartQuery");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
                    _rawQueryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRawQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
                    _rawQueryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
                    _rawQueryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rawQuery
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartQuery.Fields#rawQuery
     */
    public ChartQuery setRawQuery(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rawQuery of com.linkedin.chart.ChartQuery to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rawQuery", value);
            _rawQueryField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see ChartQuery.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see ChartQuery.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see ChartQuery.Fields#type
     */
    @Nullable
    public ChartQueryType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, ChartQueryType.class, ChartQueryType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ChartQuery.Fields#type
     */
    @Nonnull
    public ChartQueryType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, ChartQueryType.class, ChartQueryType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see ChartQuery.Fields#type
     */
    public ChartQuery setType(
        @Nullable
        ChartQueryType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.chart.ChartQuery");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ChartQuery.Fields#type
     */
    public ChartQuery setType(
        @Nonnull
        ChartQueryType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.chart.ChartQuery to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    @Override
    public ChartQuery clone()
        throws CloneNotSupportedException
    {
        ChartQuery __clone = ((ChartQuery) super.clone());
        __clone.__changeListener = new ChartQuery.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ChartQuery copy()
        throws CloneNotSupportedException
    {
        ChartQuery __copy = ((ChartQuery) super.copy());
        __copy._typeField = null;
        __copy._rawQueryField = null;
        __copy.__changeListener = new ChartQuery.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ChartQuery __objectRef;

        private ChangeListener(ChartQuery reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "rawQuery":
                    __objectRef._rawQueryField = null;
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
         * Raw query to build a chart from input datasets
         * 
         */
        public PathSpec rawQuery() {
            return new PathSpec(getPathComponents(), "rawQuery");
        }

        /**
         * Chart query type
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Raw query to build a chart from input datasets
         * 
         */
        public ChartQuery.ProjectionMask withRawQuery() {
            getDataMap().put("rawQuery", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Chart query type
         * 
         */
        public ChartQuery.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
