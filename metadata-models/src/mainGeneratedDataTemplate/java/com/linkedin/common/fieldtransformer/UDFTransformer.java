
package com.linkedin.common.fieldtransformer;

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
 * Field transformation expressed in UDF
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/fieldtransformer/UDFTransformer.pdl.")
public class UDFTransformer
    extends RecordTemplate
{

    private final static UDFTransformer.Fields _fields = new UDFTransformer.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}", SchemaFormatType.PDL));
    private String _udfField = null;
    private UDFTransformer.ChangeListener __changeListener = new UDFTransformer.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Udf = SCHEMA.getField("udf");

    public UDFTransformer() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public UDFTransformer(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UDFTransformer.Fields fields() {
        return _fields;
    }

    public static UDFTransformer.ProjectionMask createMask() {
        return new UDFTransformer.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public boolean hasUdf() {
        if (_udfField!= null) {
            return true;
        }
        return super._map.containsKey("udf");
    }

    /**
     * Remover for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public void removeUdf() {
        super._map.remove("udf");
    }

    /**
     * Getter for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    @Nullable
    public String getUdf(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUdf();
            case DEFAULT:
            case NULL:
                if (_udfField!= null) {
                    return _udfField;
                } else {
                    Object __rawValue = super._map.get("udf");
                    _udfField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _udfField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for udf
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UDFTransformer.Fields#udf
     */
    @Nonnull
    public String getUdf() {
        if (_udfField!= null) {
            return _udfField;
        } else {
            Object __rawValue = super._map.get("udf");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("udf");
            }
            _udfField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _udfField;
        }
    }

    /**
     * Setter for udf
     * 
     * @see UDFTransformer.Fields#udf
     */
    public UDFTransformer setUdf(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUdf(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field udf of com.linkedin.common.fieldtransformer.UDFTransformer");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "udf", value);
                    _udfField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUdf();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "udf", value);
                    _udfField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "udf", value);
                    _udfField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for udf
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UDFTransformer.Fields#udf
     */
    public UDFTransformer setUdf(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field udf of com.linkedin.common.fieldtransformer.UDFTransformer to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "udf", value);
            _udfField = value;
        }
        return this;
    }

    @Override
    public UDFTransformer clone()
        throws CloneNotSupportedException
    {
        UDFTransformer __clone = ((UDFTransformer) super.clone());
        __clone.__changeListener = new UDFTransformer.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UDFTransformer copy()
        throws CloneNotSupportedException
    {
        UDFTransformer __copy = ((UDFTransformer) super.copy());
        __copy._udfField = null;
        __copy.__changeListener = new UDFTransformer.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UDFTransformer __objectRef;

        private ChangeListener(UDFTransformer reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "udf":
                    __objectRef._udfField = null;
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
         * A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.
         * 
         */
        public PathSpec udf() {
            return new PathSpec(getPathComponents(), "udf");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.
         * 
         */
        public UDFTransformer.ProjectionMask withUdf() {
            getDataMap().put("udf", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
