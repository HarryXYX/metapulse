
package com.linkedin.metadata.query.filter;

import java.util.List;
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
import com.linkedin.data.template.StringArray;


/**
 * A criterion for matching a field with given value
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/Criterion.pdl.")
public class Criterion
    extends RecordTemplate
{

    private final static Criterion.Fields _fields = new Criterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}", SchemaFormatType.PDL));
    private String _fieldField = null;
    private String _valueField = null;
    private StringArray _valuesField = null;
    private Condition _conditionField = null;
    private Boolean _negatedField = null;
    private Criterion.ChangeListener __changeListener = new Criterion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Values = SCHEMA.getField("values");
    private final static StringArray DEFAULT_Values;
    private final static RecordDataSchema.Field FIELD_Condition = SCHEMA.getField("condition");
    private final static Condition DEFAULT_Condition;
    private final static RecordDataSchema.Field FIELD_Negated = SCHEMA.getField("negated");
    private final static Boolean DEFAULT_Negated;

    static {
        DEFAULT_Values = ((FIELD_Values.getDefault() == null)?null:new StringArray(DataTemplateUtil.castOrThrow(FIELD_Values.getDefault(), DataList.class)));
        DEFAULT_Condition = DataTemplateUtil.coerceEnumOutput(FIELD_Condition.getDefault(), Condition.class, Condition.$UNKNOWN);
        DEFAULT_Negated = DataTemplateUtil.coerceBooleanOutput(FIELD_Negated.getDefault());
    }

    public Criterion() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Criterion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Criterion.Fields fields() {
        return _fields;
    }

    public static Criterion.ProjectionMask createMask() {
        return new Criterion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see Criterion.Fields#field
     */
    public boolean hasField() {
        if (_fieldField!= null) {
            return true;
        }
        return super._map.containsKey("field");
    }

    /**
     * Remover for field
     * 
     * @see Criterion.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see Criterion.Fields#field
     */
    @Nullable
    public String getField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getField();
            case DEFAULT:
            case NULL:
                if (_fieldField!= null) {
                    return _fieldField;
                } else {
                    Object __rawValue = super._map.get("field");
                    _fieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for field
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#field
     */
    @Nonnull
    public String getField() {
        if (_fieldField!= null) {
            return _fieldField;
        } else {
            Object __rawValue = super._map.get("field");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("field");
            }
            _fieldField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldField;
        }
    }

    /**
     * Setter for field
     * 
     * @see Criterion.Fields#field
     */
    public Criterion setField(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field field of com.linkedin.metadata.query.filter.Criterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value);
                    _fieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value);
                    _fieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "field", value);
                    _fieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for field
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#field
     */
    public Criterion setField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.metadata.query.filter.Criterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value);
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see Criterion.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see Criterion.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see Criterion.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see Criterion.Fields#value
     */
    public Criterion setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.metadata.query.filter.Criterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#value
     */
    public Criterion setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.metadata.query.filter.Criterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for values
     * 
     * @see Criterion.Fields#values
     */
    public boolean hasValues() {
        if (_valuesField!= null) {
            return true;
        }
        return super._map.containsKey("values");
    }

    /**
     * Remover for values
     * 
     * @see Criterion.Fields#values
     */
    public void removeValues() {
        super._map.remove("values");
    }

    /**
     * Getter for values
     * 
     * @see Criterion.Fields#values
     */
    @Nullable
    public StringArray getValues(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getValues();
            case NULL:
                if (_valuesField!= null) {
                    return _valuesField;
                } else {
                    Object __rawValue = super._map.get("values");
                    _valuesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _valuesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for values
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#values
     */
    @Nonnull
    public StringArray getValues() {
        if (_valuesField!= null) {
            return _valuesField;
        } else {
            Object __rawValue = super._map.get("values");
            if (__rawValue == null) {
                return DEFAULT_Values;
            }
            _valuesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _valuesField;
        }
    }

    /**
     * Setter for values
     * 
     * @see Criterion.Fields#values
     */
    public Criterion setValues(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field values of com.linkedin.metadata.query.filter.Criterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "values", value.data());
                    _valuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for values
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#values
     */
    public Criterion setValues(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field values of com.linkedin.metadata.query.filter.Criterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "values", value.data());
            _valuesField = value;
        }
        return this;
    }

    /**
     * Existence checker for condition
     * 
     * @see Criterion.Fields#condition
     */
    public boolean hasCondition() {
        if (_conditionField!= null) {
            return true;
        }
        return super._map.containsKey("condition");
    }

    /**
     * Remover for condition
     * 
     * @see Criterion.Fields#condition
     */
    public void removeCondition() {
        super._map.remove("condition");
    }

    /**
     * Getter for condition
     * 
     * @see Criterion.Fields#condition
     */
    @Nullable
    public Condition getCondition(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCondition();
            case NULL:
                if (_conditionField!= null) {
                    return _conditionField;
                } else {
                    Object __rawValue = super._map.get("condition");
                    _conditionField = DataTemplateUtil.coerceEnumOutput(__rawValue, Condition.class, Condition.$UNKNOWN);
                    return _conditionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for condition
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#condition
     */
    @Nonnull
    public Condition getCondition() {
        if (_conditionField!= null) {
            return _conditionField;
        } else {
            Object __rawValue = super._map.get("condition");
            if (__rawValue == null) {
                return DEFAULT_Condition;
            }
            _conditionField = DataTemplateUtil.coerceEnumOutput(__rawValue, Condition.class, Condition.$UNKNOWN);
            return _conditionField;
        }
    }

    /**
     * Setter for condition
     * 
     * @see Criterion.Fields#condition
     */
    public Criterion setCondition(
        @Nullable
        Condition value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCondition(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field condition of com.linkedin.metadata.query.filter.Criterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "condition", value.name());
                    _conditionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCondition();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "condition", value.name());
                    _conditionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "condition", value.name());
                    _conditionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for condition
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#condition
     */
    public Criterion setCondition(
        @Nonnull
        Condition value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field condition of com.linkedin.metadata.query.filter.Criterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "condition", value.name());
            _conditionField = value;
        }
        return this;
    }

    /**
     * Existence checker for negated
     * 
     * @see Criterion.Fields#negated
     */
    public boolean hasNegated() {
        if (_negatedField!= null) {
            return true;
        }
        return super._map.containsKey("negated");
    }

    /**
     * Remover for negated
     * 
     * @see Criterion.Fields#negated
     */
    public void removeNegated() {
        super._map.remove("negated");
    }

    /**
     * Getter for negated
     * 
     * @see Criterion.Fields#negated
     */
    @Nullable
    public Boolean isNegated(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isNegated();
            case NULL:
                if (_negatedField!= null) {
                    return _negatedField;
                } else {
                    Object __rawValue = super._map.get("negated");
                    _negatedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _negatedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for negated
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Criterion.Fields#negated
     */
    @Nonnull
    public Boolean isNegated() {
        if (_negatedField!= null) {
            return _negatedField;
        } else {
            Object __rawValue = super._map.get("negated");
            if (__rawValue == null) {
                return DEFAULT_Negated;
            }
            _negatedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _negatedField;
        }
    }

    /**
     * Setter for negated
     * 
     * @see Criterion.Fields#negated
     */
    public Criterion setNegated(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNegated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field negated of com.linkedin.metadata.query.filter.Criterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "negated", value);
                    _negatedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNegated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "negated", value);
                    _negatedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "negated", value);
                    _negatedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for negated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Criterion.Fields#negated
     */
    public Criterion setNegated(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field negated of com.linkedin.metadata.query.filter.Criterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "negated", value);
            _negatedField = value;
        }
        return this;
    }

    /**
     * Setter for negated
     * 
     * @see Criterion.Fields#negated
     */
    public Criterion setNegated(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "negated", value);
        _negatedField = value;
        return this;
    }

    @Override
    public Criterion clone()
        throws CloneNotSupportedException
    {
        Criterion __clone = ((Criterion) super.clone());
        __clone.__changeListener = new Criterion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Criterion copy()
        throws CloneNotSupportedException
    {
        Criterion __copy = ((Criterion) super.copy());
        __copy._conditionField = null;
        __copy._negatedField = null;
        __copy._fieldField = null;
        __copy._valuesField = null;
        __copy._valueField = null;
        __copy.__changeListener = new Criterion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Criterion __objectRef;

        private ChangeListener(Criterion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "condition":
                    __objectRef._conditionField = null;
                    break;
                case "negated":
                    __objectRef._negatedField = null;
                    break;
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "values":
                    __objectRef._valuesField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
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
         * The name of the field that the criterion refers to
         * 
         */
        public PathSpec field() {
            return new PathSpec(getPathComponents(), "field");
        }

        /**
         * The value of the intended field
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        /**
         * Values. one of which the intended field should match
         * Note, if values is set, the above "value" field will be ignored
         * 
         */
        public PathSpec values() {
            return new PathSpec(getPathComponents(), "values");
        }

        /**
         * Values. one of which the intended field should match
         * Note, if values is set, the above "value" field will be ignored
         * 
         */
        public PathSpec values(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "values");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The condition for the criterion, e.g. EQUAL, START_WITH
         * 
         */
        public PathSpec condition() {
            return new PathSpec(getPathComponents(), "condition");
        }

        /**
         * Whether the condition should be negated
         * 
         */
        public PathSpec negated() {
            return new PathSpec(getPathComponents(), "negated");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * The name of the field that the criterion refers to
         * 
         */
        public Criterion.ProjectionMask withField() {
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The value of the intended field
         * 
         */
        public Criterion.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Values. one of which the intended field should match
         * Note, if values is set, the above "value" field will be ignored
         * 
         */
        public Criterion.ProjectionMask withValues() {
            getDataMap().put("values", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Values. one of which the intended field should match
         * Note, if values is set, the above "value" field will be ignored
         * 
         */
        public Criterion.ProjectionMask withValues(Integer start, Integer count) {
            getDataMap().put("values", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("values").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("values").put("$count", count);
            }
            return this;
        }

        /**
         * The condition for the criterion, e.g. EQUAL, START_WITH
         * 
         */
        public Criterion.ProjectionMask withCondition() {
            getDataMap().put("condition", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the condition should be negated
         * 
         */
        public Criterion.ProjectionMask withNegated() {
            getDataMap().put("negated", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
