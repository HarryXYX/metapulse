
package com.linkedin.policy;

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
 * The filter for specifying the resource or actor to apply privileges to
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/PolicyMatchFilter.pdl.")
public class PolicyMatchFilter
    extends RecordTemplate
{

    private final static PolicyMatchFilter.Fields _fields = new PolicyMatchFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**The filter for specifying the resource or actor to apply privileges to*/record PolicyMatchFilter{/**A list of criteria to apply conjunctively (so all criteria must pass)*/criteria:array[/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}]}", SchemaFormatType.PDL));
    private PolicyMatchCriterionArray _criteriaField = null;
    private PolicyMatchFilter.ChangeListener __changeListener = new PolicyMatchFilter.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Criteria = SCHEMA.getField("criteria");

    public PolicyMatchFilter() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public PolicyMatchFilter(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PolicyMatchFilter.Fields fields() {
        return _fields;
    }

    public static PolicyMatchFilter.ProjectionMask createMask() {
        return new PolicyMatchFilter.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for criteria
     * 
     * @see PolicyMatchFilter.Fields#criteria
     */
    public boolean hasCriteria() {
        if (_criteriaField!= null) {
            return true;
        }
        return super._map.containsKey("criteria");
    }

    /**
     * Remover for criteria
     * 
     * @see PolicyMatchFilter.Fields#criteria
     */
    public void removeCriteria() {
        super._map.remove("criteria");
    }

    /**
     * Getter for criteria
     * 
     * @see PolicyMatchFilter.Fields#criteria
     */
    @Nullable
    public PolicyMatchCriterionArray getCriteria(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCriteria();
            case DEFAULT:
            case NULL:
                if (_criteriaField!= null) {
                    return _criteriaField;
                } else {
                    Object __rawValue = super._map.get("criteria");
                    _criteriaField = ((__rawValue == null)?null:new PolicyMatchCriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _criteriaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for criteria
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PolicyMatchFilter.Fields#criteria
     */
    @Nonnull
    public PolicyMatchCriterionArray getCriteria() {
        if (_criteriaField!= null) {
            return _criteriaField;
        } else {
            Object __rawValue = super._map.get("criteria");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("criteria");
            }
            _criteriaField = ((__rawValue == null)?null:new PolicyMatchCriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _criteriaField;
        }
    }

    /**
     * Setter for criteria
     * 
     * @see PolicyMatchFilter.Fields#criteria
     */
    public PolicyMatchFilter setCriteria(
        @Nullable
        PolicyMatchCriterionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCriteria(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field criteria of com.linkedin.policy.PolicyMatchFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
                    _criteriaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCriteria();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
                    _criteriaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
                    _criteriaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for criteria
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PolicyMatchFilter.Fields#criteria
     */
    public PolicyMatchFilter setCriteria(
        @Nonnull
        PolicyMatchCriterionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field criteria of com.linkedin.policy.PolicyMatchFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
            _criteriaField = value;
        }
        return this;
    }

    @Override
    public PolicyMatchFilter clone()
        throws CloneNotSupportedException
    {
        PolicyMatchFilter __clone = ((PolicyMatchFilter) super.clone());
        __clone.__changeListener = new PolicyMatchFilter.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PolicyMatchFilter copy()
        throws CloneNotSupportedException
    {
        PolicyMatchFilter __copy = ((PolicyMatchFilter) super.copy());
        __copy._criteriaField = null;
        __copy.__changeListener = new PolicyMatchFilter.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PolicyMatchFilter __objectRef;

        private ChangeListener(PolicyMatchFilter reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "criteria":
                    __objectRef._criteriaField = null;
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
         * A list of criteria to apply conjunctively (so all criteria must pass)
         * 
         */
        public com.linkedin.policy.PolicyMatchCriterionArray.Fields criteria() {
            return new com.linkedin.policy.PolicyMatchCriterionArray.Fields(getPathComponents(), "criteria");
        }

        /**
         * A list of criteria to apply conjunctively (so all criteria must pass)
         * 
         */
        public PathSpec criteria(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "criteria");
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

        private com.linkedin.policy.PolicyMatchCriterionArray.ProjectionMask _criteriaMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * A list of criteria to apply conjunctively (so all criteria must pass)
         * 
         */
        public PolicyMatchFilter.ProjectionMask withCriteria(Function<com.linkedin.policy.PolicyMatchCriterionArray.ProjectionMask, com.linkedin.policy.PolicyMatchCriterionArray.ProjectionMask> nestedMask) {
            _criteriaMask = nestedMask.apply(((_criteriaMask == null)?PolicyMatchCriterionArray.createMask():_criteriaMask));
            getDataMap().put("criteria", _criteriaMask.getDataMap());
            return this;
        }

        /**
         * A list of criteria to apply conjunctively (so all criteria must pass)
         * 
         */
        public PolicyMatchFilter.ProjectionMask withCriteria() {
            _criteriaMask = null;
            getDataMap().put("criteria", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of criteria to apply conjunctively (so all criteria must pass)
         * 
         */
        public PolicyMatchFilter.ProjectionMask withCriteria(Function<com.linkedin.policy.PolicyMatchCriterionArray.ProjectionMask, com.linkedin.policy.PolicyMatchCriterionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _criteriaMask = nestedMask.apply(((_criteriaMask == null)?PolicyMatchCriterionArray.createMask():_criteriaMask));
            getDataMap().put("criteria", _criteriaMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("criteria").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("criteria").put("$count", count);
            }
            return this;
        }

        /**
         * A list of criteria to apply conjunctively (so all criteria must pass)
         * 
         */
        public PolicyMatchFilter.ProjectionMask withCriteria(Integer start, Integer count) {
            _criteriaMask = null;
            getDataMap().put("criteria", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("criteria").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("criteria").put("$count", count);
            }
            return this;
        }

    }

}
