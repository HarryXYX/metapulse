
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class Quantile
    extends RecordTemplate
{

    private final static Quantile.Fields _fields = new Quantile.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset,record Quantile{quantile:string,value:string}", SchemaFormatType.PDL));
    private String _quantileField = null;
    private String _valueField = null;
    private Quantile.ChangeListener __changeListener = new Quantile.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Quantile = SCHEMA.getField("quantile");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");

    public Quantile() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Quantile(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Quantile.Fields fields() {
        return _fields;
    }

    public static Quantile.ProjectionMask createMask() {
        return new Quantile.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public boolean hasQuantile() {
        if (_quantileField!= null) {
            return true;
        }
        return super._map.containsKey("quantile");
    }

    /**
     * Remover for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public void removeQuantile() {
        super._map.remove("quantile");
    }

    /**
     * Getter for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    @Nullable
    public String getQuantile(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getQuantile();
            case DEFAULT:
            case NULL:
                if (_quantileField!= null) {
                    return _quantileField;
                } else {
                    Object __rawValue = super._map.get("quantile");
                    _quantileField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _quantileField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for quantile
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Quantile.Fields#quantile
     */
    @Nonnull
    public String getQuantile() {
        if (_quantileField!= null) {
            return _quantileField;
        } else {
            Object __rawValue = super._map.get("quantile");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("quantile");
            }
            _quantileField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _quantileField;
        }
    }

    /**
     * Setter for quantile
     * 
     * @see Quantile.Fields#quantile
     */
    public Quantile setQuantile(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQuantile(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field quantile of com.linkedin.dataset.Quantile");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "quantile", value);
                    _quantileField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQuantile();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "quantile", value);
                    _quantileField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "quantile", value);
                    _quantileField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for quantile
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Quantile.Fields#quantile
     */
    public Quantile setQuantile(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field quantile of com.linkedin.dataset.Quantile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "quantile", value);
            _quantileField = value;
        }
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see Quantile.Fields#value
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
     * @see Quantile.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see Quantile.Fields#value
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
     * @see Quantile.Fields#value
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
     * @see Quantile.Fields#value
     */
    public Quantile setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.dataset.Quantile");
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
     * @see Quantile.Fields#value
     */
    public Quantile setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.dataset.Quantile to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    @Override
    public Quantile clone()
        throws CloneNotSupportedException
    {
        Quantile __clone = ((Quantile) super.clone());
        __clone.__changeListener = new Quantile.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Quantile copy()
        throws CloneNotSupportedException
    {
        Quantile __copy = ((Quantile) super.copy());
        __copy._quantileField = null;
        __copy._valueField = null;
        __copy.__changeListener = new Quantile.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Quantile __objectRef;

        private ChangeListener(Quantile reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "quantile":
                    __objectRef._quantileField = null;
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

        public PathSpec quantile() {
            return new PathSpec(getPathComponents(), "quantile");
        }

        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public Quantile.ProjectionMask withQuantile() {
            getDataMap().put("quantile", MaskMap.POSITIVE_MASK);
            return this;
        }

        public Quantile.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
