
package com.linkedin.metadata.query.filter;

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
 * Sort order along with the field to sort it on, to be applied to the results.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/filter/SortCriterion.pdl.")
public class SortCriterion
    extends RecordTemplate
{

    private final static SortCriterion.Fields _fields = new SortCriterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**Sort order along with the field to sort it on, to be applied to the results.*/record SortCriterion{/**The name of the field that sorting has to be applied to*/field:string/**The order to sort the results i.e. ASCENDING or DESCENDING*/order:/**The order used to sort the results*/enum SortOrder{/**If results need to be sorted in ascending order*/ASCENDING/**If results need to be sorted in descending order*/DESCENDING}}", SchemaFormatType.PDL));
    private String _fieldField = null;
    private SortOrder _orderField = null;
    private SortCriterion.ChangeListener __changeListener = new SortCriterion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Order = SCHEMA.getField("order");

    public SortCriterion() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SortCriterion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SortCriterion.Fields fields() {
        return _fields;
    }

    public static SortCriterion.ProjectionMask createMask() {
        return new SortCriterion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see SortCriterion.Fields#field
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
     * @see SortCriterion.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see SortCriterion.Fields#field
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
     * @see SortCriterion.Fields#field
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
     * @see SortCriterion.Fields#field
     */
    public SortCriterion setField(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field field of com.linkedin.metadata.query.filter.SortCriterion");
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
     * @see SortCriterion.Fields#field
     */
    public SortCriterion setField(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.metadata.query.filter.SortCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value);
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for order
     * 
     * @see SortCriterion.Fields#order
     */
    public boolean hasOrder() {
        if (_orderField!= null) {
            return true;
        }
        return super._map.containsKey("order");
    }

    /**
     * Remover for order
     * 
     * @see SortCriterion.Fields#order
     */
    public void removeOrder() {
        super._map.remove("order");
    }

    /**
     * Getter for order
     * 
     * @see SortCriterion.Fields#order
     */
    @Nullable
    public SortOrder getOrder(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOrder();
            case DEFAULT:
            case NULL:
                if (_orderField!= null) {
                    return _orderField;
                } else {
                    Object __rawValue = super._map.get("order");
                    _orderField = DataTemplateUtil.coerceEnumOutput(__rawValue, SortOrder.class, SortOrder.$UNKNOWN);
                    return _orderField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for order
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SortCriterion.Fields#order
     */
    @Nonnull
    public SortOrder getOrder() {
        if (_orderField!= null) {
            return _orderField;
        } else {
            Object __rawValue = super._map.get("order");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("order");
            }
            _orderField = DataTemplateUtil.coerceEnumOutput(__rawValue, SortOrder.class, SortOrder.$UNKNOWN);
            return _orderField;
        }
    }

    /**
     * Setter for order
     * 
     * @see SortCriterion.Fields#order
     */
    public SortCriterion setOrder(
        @Nullable
        SortOrder value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOrder(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field order of com.linkedin.metadata.query.filter.SortCriterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "order", value.name());
                    _orderField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOrder();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "order", value.name());
                    _orderField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "order", value.name());
                    _orderField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for order
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SortCriterion.Fields#order
     */
    public SortCriterion setOrder(
        @Nonnull
        SortOrder value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field order of com.linkedin.metadata.query.filter.SortCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "order", value.name());
            _orderField = value;
        }
        return this;
    }

    @Override
    public SortCriterion clone()
        throws CloneNotSupportedException
    {
        SortCriterion __clone = ((SortCriterion) super.clone());
        __clone.__changeListener = new SortCriterion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SortCriterion copy()
        throws CloneNotSupportedException
    {
        SortCriterion __copy = ((SortCriterion) super.copy());
        __copy._fieldField = null;
        __copy._orderField = null;
        __copy.__changeListener = new SortCriterion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SortCriterion __objectRef;

        private ChangeListener(SortCriterion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "order":
                    __objectRef._orderField = null;
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
         * The name of the field that sorting has to be applied to
         * 
         */
        public PathSpec field() {
            return new PathSpec(getPathComponents(), "field");
        }

        /**
         * The order to sort the results i.e. ASCENDING or DESCENDING
         * 
         */
        public PathSpec order() {
            return new PathSpec(getPathComponents(), "order");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The name of the field that sorting has to be applied to
         * 
         */
        public SortCriterion.ProjectionMask withField() {
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The order to sort the results i.e. ASCENDING or DESCENDING
         * 
         */
        public SortCriterion.ProjectionMask withOrder() {
            getDataMap().put("order", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
