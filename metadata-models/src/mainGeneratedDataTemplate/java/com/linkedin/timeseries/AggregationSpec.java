
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
 * Provides the aggregation specification on a member/field.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/timeseries/AggregationSpec.pdl.")
public class AggregationSpec
    extends RecordTemplate
{

    private final static AggregationSpec.Fields _fields = new AggregationSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Provides the aggregation specification on a member/field.*/record AggregationSpec{/**Name of the member/field.*/fieldPath:string/**Aggregation type for the metric.*/aggregationType:enum AggregationType{LATEST,SUM,CARDINALITY}}", SchemaFormatType.PDL));
    private String _fieldPathField = null;
    private AggregationType _aggregationTypeField = null;
    private AggregationSpec.ChangeListener __changeListener = new AggregationSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_AggregationType = SCHEMA.getField("aggregationType");

    public AggregationSpec() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AggregationSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AggregationSpec.Fields fields() {
        return _fields;
    }

    public static AggregationSpec.ProjectionMask createMask() {
        return new AggregationSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        if (_fieldPathField!= null) {
            return true;
        }
        return super._map.containsKey("fieldPath");
    }

    /**
     * Remover for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    @Nullable
    public String getFieldPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldPath();
            case DEFAULT:
            case NULL:
                if (_fieldPathField!= null) {
                    return _fieldPathField;
                } else {
                    Object __rawValue = super._map.get("fieldPath");
                    _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldPathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationSpec.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        if (_fieldPathField!= null) {
            return _fieldPathField;
        } else {
            Object __rawValue = super._map.get("fieldPath");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldPath");
            }
            _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldPathField;
        }
    }

    /**
     * Setter for fieldPath
     * 
     * @see AggregationSpec.Fields#fieldPath
     */
    public AggregationSpec setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.timeseries.AggregationSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationSpec.Fields#fieldPath
     */
    public AggregationSpec setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.timeseries.AggregationSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public boolean hasAggregationType() {
        if (_aggregationTypeField!= null) {
            return true;
        }
        return super._map.containsKey("aggregationType");
    }

    /**
     * Remover for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public void removeAggregationType() {
        super._map.remove("aggregationType");
    }

    /**
     * Getter for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    @Nullable
    public AggregationType getAggregationType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAggregationType();
            case DEFAULT:
            case NULL:
                if (_aggregationTypeField!= null) {
                    return _aggregationTypeField;
                } else {
                    Object __rawValue = super._map.get("aggregationType");
                    _aggregationTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AggregationType.class, AggregationType.$UNKNOWN);
                    return _aggregationTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aggregationType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationSpec.Fields#aggregationType
     */
    @Nonnull
    public AggregationType getAggregationType() {
        if (_aggregationTypeField!= null) {
            return _aggregationTypeField;
        } else {
            Object __rawValue = super._map.get("aggregationType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aggregationType");
            }
            _aggregationTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AggregationType.class, AggregationType.$UNKNOWN);
            return _aggregationTypeField;
        }
    }

    /**
     * Setter for aggregationType
     * 
     * @see AggregationSpec.Fields#aggregationType
     */
    public AggregationSpec setAggregationType(
        @Nullable
        AggregationType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregationType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aggregationType of com.linkedin.timeseries.AggregationSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregationType", value.name());
                    _aggregationTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregationType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregationType", value.name());
                    _aggregationTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregationType", value.name());
                    _aggregationTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregationType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationSpec.Fields#aggregationType
     */
    public AggregationSpec setAggregationType(
        @Nonnull
        AggregationType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregationType of com.linkedin.timeseries.AggregationSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregationType", value.name());
            _aggregationTypeField = value;
        }
        return this;
    }

    @Override
    public AggregationSpec clone()
        throws CloneNotSupportedException
    {
        AggregationSpec __clone = ((AggregationSpec) super.clone());
        __clone.__changeListener = new AggregationSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AggregationSpec copy()
        throws CloneNotSupportedException
    {
        AggregationSpec __copy = ((AggregationSpec) super.copy());
        __copy._aggregationTypeField = null;
        __copy._fieldPathField = null;
        __copy.__changeListener = new AggregationSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AggregationSpec __objectRef;

        private ChangeListener(AggregationSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aggregationType":
                    __objectRef._aggregationTypeField = null;
                    break;
                case "fieldPath":
                    __objectRef._fieldPathField = null;
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
         * Name of the member/field.
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Aggregation type for the metric.
         * 
         */
        public PathSpec aggregationType() {
            return new PathSpec(getPathComponents(), "aggregationType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Name of the member/field.
         * 
         */
        public AggregationSpec.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Aggregation type for the metric.
         * 
         */
        public AggregationSpec.ProjectionMask withAggregationType() {
            getDataMap().put("aggregationType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
