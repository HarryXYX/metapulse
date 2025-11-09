
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Cost.pdl.")
public class Cost
    extends RecordTemplate
{

    private final static Cost.Fields _fields = new Cost.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common@Aspect.name=\"cost\"record Cost{costType:/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}cost:/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]}", SchemaFormatType.PDL));
    private CostType _costTypeField = null;
    private CostValue _costField = null;
    private Cost.ChangeListener __changeListener = new Cost.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CostType = SCHEMA.getField("costType");
    private final static RecordDataSchema.Field FIELD_Cost = SCHEMA.getField("cost");

    public Cost() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public Cost(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Cost.Fields fields() {
        return _fields;
    }

    public static Cost.ProjectionMask createMask() {
        return new Cost.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for costType
     * 
     * @see Cost.Fields#costType
     */
    public boolean hasCostType() {
        if (_costTypeField!= null) {
            return true;
        }
        return super._map.containsKey("costType");
    }

    /**
     * Remover for costType
     * 
     * @see Cost.Fields#costType
     */
    public void removeCostType() {
        super._map.remove("costType");
    }

    /**
     * Getter for costType
     * 
     * @see Cost.Fields#costType
     */
    @Nullable
    public CostType getCostType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCostType();
            case DEFAULT:
            case NULL:
                if (_costTypeField!= null) {
                    return _costTypeField;
                } else {
                    Object __rawValue = super._map.get("costType");
                    _costTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, CostType.class, CostType.$UNKNOWN);
                    return _costTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for costType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Cost.Fields#costType
     */
    @Nonnull
    public CostType getCostType() {
        if (_costTypeField!= null) {
            return _costTypeField;
        } else {
            Object __rawValue = super._map.get("costType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("costType");
            }
            _costTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, CostType.class, CostType.$UNKNOWN);
            return _costTypeField;
        }
    }

    /**
     * Setter for costType
     * 
     * @see Cost.Fields#costType
     */
    public Cost setCostType(
        @Nullable
        CostType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCostType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field costType of com.linkedin.common.Cost");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "costType", value.name());
                    _costTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCostType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "costType", value.name());
                    _costTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "costType", value.name());
                    _costTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for costType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Cost.Fields#costType
     */
    public Cost setCostType(
        @Nonnull
        CostType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field costType of com.linkedin.common.Cost to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "costType", value.name());
            _costTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for cost
     * 
     * @see Cost.Fields#cost
     */
    public boolean hasCost() {
        if (_costField!= null) {
            return true;
        }
        return super._map.containsKey("cost");
    }

    /**
     * Remover for cost
     * 
     * @see Cost.Fields#cost
     */
    public void removeCost() {
        super._map.remove("cost");
    }

    /**
     * Getter for cost
     * 
     * @see Cost.Fields#cost
     */
    @Nullable
    public CostValue getCost(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCost();
            case DEFAULT:
            case NULL:
                if (_costField!= null) {
                    return _costField;
                } else {
                    Object __rawValue = super._map.get("cost");
                    _costField = ((__rawValue == null)?null:new CostValue(__rawValue));
                    return _costField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cost
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Cost.Fields#cost
     */
    @Nonnull
    public CostValue getCost() {
        if (_costField!= null) {
            return _costField;
        } else {
            Object __rawValue = super._map.get("cost");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("cost");
            }
            _costField = ((__rawValue == null)?null:new CostValue(__rawValue));
            return _costField;
        }
    }

    /**
     * Setter for cost
     * 
     * @see Cost.Fields#cost
     */
    public Cost setCost(
        @Nullable
        CostValue value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCost(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cost of com.linkedin.common.Cost");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cost", value.data());
                    _costField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCost();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cost", value.data());
                    _costField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cost", value.data());
                    _costField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cost
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Cost.Fields#cost
     */
    public Cost setCost(
        @Nonnull
        CostValue value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cost of com.linkedin.common.Cost to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cost", value.data());
            _costField = value;
        }
        return this;
    }

    @Override
    public Cost clone()
        throws CloneNotSupportedException
    {
        Cost __clone = ((Cost) super.clone());
        __clone.__changeListener = new Cost.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Cost copy()
        throws CloneNotSupportedException
    {
        Cost __copy = ((Cost) super.copy());
        __copy._costField = null;
        __copy._costTypeField = null;
        __copy.__changeListener = new Cost.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Cost __objectRef;

        private ChangeListener(Cost reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "cost":
                    __objectRef._costField = null;
                    break;
                case "costType":
                    __objectRef._costTypeField = null;
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

        public PathSpec costType() {
            return new PathSpec(getPathComponents(), "costType");
        }

        public com.linkedin.common.CostValue.Fields cost() {
            return new com.linkedin.common.CostValue.Fields(getPathComponents(), "cost");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.CostValue.ProjectionMask _costMask;

        ProjectionMask() {
            super(3);
        }

        public Cost.ProjectionMask withCostType() {
            getDataMap().put("costType", MaskMap.POSITIVE_MASK);
            return this;
        }

        public Cost.ProjectionMask withCost(Function<com.linkedin.common.CostValue.ProjectionMask, com.linkedin.common.CostValue.ProjectionMask> nestedMask) {
            _costMask = nestedMask.apply(((_costMask == null)?CostValue.createMask():_costMask));
            getDataMap().put("cost", _costMask.getDataMap());
            return this;
        }

        public Cost.ProjectionMask withCost() {
            _costMask = null;
            getDataMap().put("cost", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
