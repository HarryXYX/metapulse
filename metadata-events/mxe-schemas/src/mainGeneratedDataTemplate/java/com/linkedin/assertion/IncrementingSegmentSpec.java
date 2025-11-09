
package com.linkedin.assertion;

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
import com.linkedin.schema.SchemaFieldSpec;


/**
 * Core attributes required to identify an incrementing segment in a table. This type is mainly useful
 * for tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)
 * 
 * An incrementing segment represents a logical chunk of data which is INSERTED
 * into a dataset on a regular interval, along with the presence of a constantly-incrementing column
 * value such as an event time, date partition, or last modified column.
 * 
 * An incrementing segment is principally identified by 2 key attributes combined:
 * 
 *  1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.
 *     Note that the value of this column may not by itself represent the "bucket" or the "segment" in which the row falls.
 * 
 *  2. [Optional] An transformer function that may be applied to the selected column value in order
 *     to obtain the final "segment identifier" or "bucket identifier". Rows that have the same value after applying the transformation
 *     will be grouped into the same segment, using which the final value (e.g. row count) will be determined.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/IncrementingSegmentSpec.pdl.")
public class IncrementingSegmentSpec
    extends RecordTemplate
{

    private final static IncrementingSegmentSpec.Fields _fields = new IncrementingSegmentSpec.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Core attributes required to identify an incrementing segment in a table. This type is mainly useful\nfor tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)\n\nAn incrementing segment represents a logical chunk of data which is INSERTED\ninto a dataset on a regular interval, along with the presence of a constantly-incrementing column\nvalue such as an event time, date partition, or last modified column.\n\nAn incrementing segment is principally identified by 2 key attributes combined:\n\n 1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.\n    Note that the value of this column may not by itself represent the \"bucket\" or the \"segment\" in which the row falls.\n\n 2. [Optional] An transformer function that may be applied to the selected column value in order\n    to obtain the final \"segment identifier\" or \"bucket identifier\". Rows that have the same value after applying the transformation\n    will be grouped into the same segment, using which the final value (e.g. row count) will be determined.*/record IncrementingSegmentSpec{/**The field to use to generate segments. It must be constantly incrementing as new rows are inserted.*/field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.\nIf not provided, then no operator will be applied to the field. (identity function)*/transformer:optional/**The definition of the transformer function  that should be applied to a given field / column value in a dataset\nin order to determine the segment or bucket that it belongs to, which in turn is used to evaluate\nvolume assertions.*/record IncrementingSegmentFieldTransformer{/**A 'standard' transformer type. Note that not all source systems will support all operators.*/type:enum IncrementingSegmentFieldTransformerType{/**Rounds a timestamp (in seconds) down to the start of the month.*/TIMESTAMP_MS_TO_MINUTE/**Rounds a timestamp (in milliseconds) down to the nearest hour.*/TIMESTAMP_MS_TO_HOUR/**Rounds a timestamp (in milliseconds) down to the start of the day.*/TIMESTAMP_MS_TO_DATE/**Rounds a timestamp (in milliseconds) down to the start of the month*/TIMESTAMP_MS_TO_MONTH/**Rounds a timestamp (in milliseconds) down to the start of the year*/TIMESTAMP_MS_TO_YEAR/**Rounds a numeric value down to the nearest integer.*/FLOOR/**Rounds a numeric value up to the nearest integer.*/CEILING/**A backdoor to provide a native operator type specific to a given source system like\nSnowflake, Redshift, BQ, etc.*/NATIVE}/**The 'native' transformer type, useful as a back door if a custom operator is required.\nThis field is required if the type is NATIVE.*/nativeType:optional string}}", SchemaFormatType.PDL));
    private SchemaFieldSpec _fieldField = null;
    private IncrementingSegmentFieldTransformer _transformerField = null;
    private IncrementingSegmentSpec.ChangeListener __changeListener = new IncrementingSegmentSpec.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Transformer = SCHEMA.getField("transformer");

    public IncrementingSegmentSpec() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public IncrementingSegmentSpec(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncrementingSegmentSpec.Fields fields() {
        return _fields;
    }

    public static IncrementingSegmentSpec.ProjectionMask createMask() {
        return new IncrementingSegmentSpec.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see IncrementingSegmentSpec.Fields#field
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
     * @see IncrementingSegmentSpec.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see IncrementingSegmentSpec.Fields#field
     */
    @Nullable
    public SchemaFieldSpec getField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getField();
            case DEFAULT:
            case NULL:
                if (_fieldField!= null) {
                    return _fieldField;
                } else {
                    Object __rawValue = super._map.get("field");
                    _fieldField = ((__rawValue == null)?null:new SchemaFieldSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
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
     * @see IncrementingSegmentSpec.Fields#field
     */
    @Nonnull
    public SchemaFieldSpec getField() {
        if (_fieldField!= null) {
            return _fieldField;
        } else {
            Object __rawValue = super._map.get("field");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("field");
            }
            _fieldField = ((__rawValue == null)?null:new SchemaFieldSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fieldField;
        }
    }

    /**
     * Setter for field
     * 
     * @see IncrementingSegmentSpec.Fields#field
     */
    public IncrementingSegmentSpec setField(
        @Nullable
        SchemaFieldSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field field of com.linkedin.assertion.IncrementingSegmentSpec");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value.data());
                    _fieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value.data());
                    _fieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "field", value.data());
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
     * @see IncrementingSegmentSpec.Fields#field
     */
    public IncrementingSegmentSpec setField(
        @Nonnull
        SchemaFieldSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.assertion.IncrementingSegmentSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value.data());
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for transformer
     * 
     * @see IncrementingSegmentSpec.Fields#transformer
     */
    public boolean hasTransformer() {
        if (_transformerField!= null) {
            return true;
        }
        return super._map.containsKey("transformer");
    }

    /**
     * Remover for transformer
     * 
     * @see IncrementingSegmentSpec.Fields#transformer
     */
    public void removeTransformer() {
        super._map.remove("transformer");
    }

    /**
     * Getter for transformer
     * 
     * @see IncrementingSegmentSpec.Fields#transformer
     */
    @Nullable
    public IncrementingSegmentFieldTransformer getTransformer(GetMode mode) {
        return getTransformer();
    }

    /**
     * Getter for transformer
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncrementingSegmentSpec.Fields#transformer
     */
    @Nullable
    public IncrementingSegmentFieldTransformer getTransformer() {
        if (_transformerField!= null) {
            return _transformerField;
        } else {
            Object __rawValue = super._map.get("transformer");
            _transformerField = ((__rawValue == null)?null:new IncrementingSegmentFieldTransformer(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _transformerField;
        }
    }

    /**
     * Setter for transformer
     * 
     * @see IncrementingSegmentSpec.Fields#transformer
     */
    public IncrementingSegmentSpec setTransformer(
        @Nullable
        IncrementingSegmentFieldTransformer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTransformer(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTransformer();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transformer", value.data());
                    _transformerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "transformer", value.data());
                    _transformerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for transformer
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncrementingSegmentSpec.Fields#transformer
     */
    public IncrementingSegmentSpec setTransformer(
        @Nonnull
        IncrementingSegmentFieldTransformer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field transformer of com.linkedin.assertion.IncrementingSegmentSpec to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "transformer", value.data());
            _transformerField = value;
        }
        return this;
    }

    @Override
    public IncrementingSegmentSpec clone()
        throws CloneNotSupportedException
    {
        IncrementingSegmentSpec __clone = ((IncrementingSegmentSpec) super.clone());
        __clone.__changeListener = new IncrementingSegmentSpec.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncrementingSegmentSpec copy()
        throws CloneNotSupportedException
    {
        IncrementingSegmentSpec __copy = ((IncrementingSegmentSpec) super.copy());
        __copy._fieldField = null;
        __copy._transformerField = null;
        __copy.__changeListener = new IncrementingSegmentSpec.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncrementingSegmentSpec __objectRef;

        private ChangeListener(IncrementingSegmentSpec reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "transformer":
                    __objectRef._transformerField = null;
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
         * The field to use to generate segments. It must be constantly incrementing as new rows are inserted.
         * 
         */
        public com.linkedin.schema.SchemaFieldSpec.Fields field() {
            return new com.linkedin.schema.SchemaFieldSpec.Fields(getPathComponents(), "field");
        }

        /**
         * Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.
         * If not provided, then no operator will be applied to the field. (identity function)
         * 
         */
        public com.linkedin.assertion.IncrementingSegmentFieldTransformer.Fields transformer() {
            return new com.linkedin.assertion.IncrementingSegmentFieldTransformer.Fields(getPathComponents(), "transformer");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.SchemaFieldSpec.ProjectionMask _fieldMask;
        private com.linkedin.assertion.IncrementingSegmentFieldTransformer.ProjectionMask _transformerMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The field to use to generate segments. It must be constantly incrementing as new rows are inserted.
         * 
         */
        public IncrementingSegmentSpec.ProjectionMask withField(Function<com.linkedin.schema.SchemaFieldSpec.ProjectionMask, com.linkedin.schema.SchemaFieldSpec.ProjectionMask> nestedMask) {
            _fieldMask = nestedMask.apply(((_fieldMask == null)?SchemaFieldSpec.createMask():_fieldMask));
            getDataMap().put("field", _fieldMask.getDataMap());
            return this;
        }

        /**
         * The field to use to generate segments. It must be constantly incrementing as new rows are inserted.
         * 
         */
        public IncrementingSegmentSpec.ProjectionMask withField() {
            _fieldMask = null;
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.
         * If not provided, then no operator will be applied to the field. (identity function)
         * 
         */
        public IncrementingSegmentSpec.ProjectionMask withTransformer(Function<com.linkedin.assertion.IncrementingSegmentFieldTransformer.ProjectionMask, com.linkedin.assertion.IncrementingSegmentFieldTransformer.ProjectionMask> nestedMask) {
            _transformerMask = nestedMask.apply(((_transformerMask == null)?IncrementingSegmentFieldTransformer.createMask():_transformerMask));
            getDataMap().put("transformer", _transformerMask.getDataMap());
            return this;
        }

        /**
         * Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.
         * If not provided, then no operator will be applied to the field. (identity function)
         * 
         */
        public IncrementingSegmentSpec.ProjectionMask withTransformer() {
            _transformerMask = null;
            getDataMap().put("transformer", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
