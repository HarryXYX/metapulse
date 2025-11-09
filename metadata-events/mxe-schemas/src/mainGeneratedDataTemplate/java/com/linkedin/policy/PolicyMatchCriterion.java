
package com.linkedin.policy;

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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/PolicyMatchCriterion.pdl.")
public class PolicyMatchCriterion
    extends RecordTemplate
{

    private final static PolicyMatchCriterion.Fields _fields = new PolicyMatchCriterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}", SchemaFormatType.PDL));
    private String _fieldField = null;
    private StringArray _valuesField = null;
    private PolicyMatchCondition _conditionField = null;
    private PolicyMatchCriterion.ChangeListener __changeListener = new PolicyMatchCriterion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Values = SCHEMA.getField("values");
    private final static RecordDataSchema.Field FIELD_Condition = SCHEMA.getField("condition");
    private final static PolicyMatchCondition DEFAULT_Condition;

    static {
        DEFAULT_Condition = DataTemplateUtil.coerceEnumOutput(FIELD_Condition.getDefault(), PolicyMatchCondition.class, PolicyMatchCondition.$UNKNOWN);
    }

    public PolicyMatchCriterion() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public PolicyMatchCriterion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PolicyMatchCriterion.Fields fields() {
        return _fields;
    }

    public static PolicyMatchCriterion.ProjectionMask createMask() {
        return new PolicyMatchCriterion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see PolicyMatchCriterion.Fields#field
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
     * @see PolicyMatchCriterion.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see PolicyMatchCriterion.Fields#field
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
     * @see PolicyMatchCriterion.Fields#field
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
     * @see PolicyMatchCriterion.Fields#field
     */
    public PolicyMatchCriterion setField(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field field of com.linkedin.policy.PolicyMatchCriterion");
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
     * @see PolicyMatchCriterion.Fields#field
     */
    public PolicyMatchCriterion setField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.policy.PolicyMatchCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value);
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for values
     * 
     * @see PolicyMatchCriterion.Fields#values
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
     * @see PolicyMatchCriterion.Fields#values
     */
    public void removeValues() {
        super._map.remove("values");
    }

    /**
     * Getter for values
     * 
     * @see PolicyMatchCriterion.Fields#values
     */
    @Nullable
    public StringArray getValues(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValues();
            case DEFAULT:
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
     * @see PolicyMatchCriterion.Fields#values
     */
    @Nonnull
    public StringArray getValues() {
        if (_valuesField!= null) {
            return _valuesField;
        } else {
            Object __rawValue = super._map.get("values");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("values");
            }
            _valuesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _valuesField;
        }
    }

    /**
     * Setter for values
     * 
     * @see PolicyMatchCriterion.Fields#values
     */
    public PolicyMatchCriterion setValues(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field values of com.linkedin.policy.PolicyMatchCriterion");
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
     * @see PolicyMatchCriterion.Fields#values
     */
    public PolicyMatchCriterion setValues(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field values of com.linkedin.policy.PolicyMatchCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "values", value.data());
            _valuesField = value;
        }
        return this;
    }

    /**
     * Existence checker for condition
     * 
     * @see PolicyMatchCriterion.Fields#condition
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
     * @see PolicyMatchCriterion.Fields#condition
     */
    public void removeCondition() {
        super._map.remove("condition");
    }

    /**
     * Getter for condition
     * 
     * @see PolicyMatchCriterion.Fields#condition
     */
    @Nullable
    public PolicyMatchCondition getCondition(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCondition();
            case NULL:
                if (_conditionField!= null) {
                    return _conditionField;
                } else {
                    Object __rawValue = super._map.get("condition");
                    _conditionField = DataTemplateUtil.coerceEnumOutput(__rawValue, PolicyMatchCondition.class, PolicyMatchCondition.$UNKNOWN);
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
     * @see PolicyMatchCriterion.Fields#condition
     */
    @Nonnull
    public PolicyMatchCondition getCondition() {
        if (_conditionField!= null) {
            return _conditionField;
        } else {
            Object __rawValue = super._map.get("condition");
            if (__rawValue == null) {
                return DEFAULT_Condition;
            }
            _conditionField = DataTemplateUtil.coerceEnumOutput(__rawValue, PolicyMatchCondition.class, PolicyMatchCondition.$UNKNOWN);
            return _conditionField;
        }
    }

    /**
     * Setter for condition
     * 
     * @see PolicyMatchCriterion.Fields#condition
     */
    public PolicyMatchCriterion setCondition(
        @Nullable
        PolicyMatchCondition value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCondition(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field condition of com.linkedin.policy.PolicyMatchCriterion");
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
     * @see PolicyMatchCriterion.Fields#condition
     */
    public PolicyMatchCriterion setCondition(
        @Nonnull
        PolicyMatchCondition value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field condition of com.linkedin.policy.PolicyMatchCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "condition", value.name());
            _conditionField = value;
        }
        return this;
    }

    @Override
    public PolicyMatchCriterion clone()
        throws CloneNotSupportedException
    {
        PolicyMatchCriterion __clone = ((PolicyMatchCriterion) super.clone());
        __clone.__changeListener = new PolicyMatchCriterion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PolicyMatchCriterion copy()
        throws CloneNotSupportedException
    {
        PolicyMatchCriterion __copy = ((PolicyMatchCriterion) super.copy());
        __copy._conditionField = null;
        __copy._fieldField = null;
        __copy._valuesField = null;
        __copy.__changeListener = new PolicyMatchCriterion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PolicyMatchCriterion __objectRef;

        private ChangeListener(PolicyMatchCriterion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "condition":
                    __objectRef._conditionField = null;
                    break;
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "values":
                    __objectRef._valuesField = null;
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
         * Values. Matches criterion if any one of the values matches condition (OR-relationship)
         * 
         */
        public PathSpec values() {
            return new PathSpec(getPathComponents(), "values");
        }

        /**
         * Values. Matches criterion if any one of the values matches condition (OR-relationship)
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
         * The condition for the criterion
         * 
         */
        public PathSpec condition() {
            return new PathSpec(getPathComponents(), "condition");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * The name of the field that the criterion refers to
         * 
         */
        public PolicyMatchCriterion.ProjectionMask withField() {
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Values. Matches criterion if any one of the values matches condition (OR-relationship)
         * 
         */
        public PolicyMatchCriterion.ProjectionMask withValues() {
            getDataMap().put("values", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Values. Matches criterion if any one of the values matches condition (OR-relationship)
         * 
         */
        public PolicyMatchCriterion.ProjectionMask withValues(Integer start, Integer count) {
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
         * The condition for the criterion
         * 
         */
        public PolicyMatchCriterion.ProjectionMask withCondition() {
            getDataMap().put("condition", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
