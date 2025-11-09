
package com.linkedin.schema;

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
 * Schema text for Parquet schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/ParquetSchema.pdl.")
public class ParquetSchema
    extends RecordTemplate
{

    private final static ParquetSchema.Fields _fields = new ParquetSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text for Parquet schema.*/record ParquetSchema{/**The native Parquet schema text.*/schema:string}", SchemaFormatType.PDL));
    private String _schemaField = null;
    private ParquetSchema.ChangeListener __changeListener = new ParquetSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");

    public ParquetSchema() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ParquetSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ParquetSchema.Fields fields() {
        return _fields;
    }

    public static ParquetSchema.ProjectionMask createMask() {
        return new ParquetSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public boolean hasSchema() {
        if (_schemaField!= null) {
            return true;
        }
        return super._map.containsKey("schema");
    }

    /**
     * Remover for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public void removeSchema() {
        super._map.remove("schema");
    }

    /**
     * Getter for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    @Nullable
    public String getSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSchema();
            case DEFAULT:
            case NULL:
                if (_schemaField!= null) {
                    return _schemaField;
                } else {
                    Object __rawValue = super._map.get("schema");
                    _schemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _schemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for schema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ParquetSchema.Fields#schema
     */
    @Nonnull
    public String getSchema() {
        if (_schemaField!= null) {
            return _schemaField;
        } else {
            Object __rawValue = super._map.get("schema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("schema");
            }
            _schemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _schemaField;
        }
    }

    /**
     * Setter for schema
     * 
     * @see ParquetSchema.Fields#schema
     */
    public ParquetSchema setSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schema of com.linkedin.schema.ParquetSchema");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value);
                    _schemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value);
                    _schemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schema", value);
                    _schemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ParquetSchema.Fields#schema
     */
    public ParquetSchema setSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schema of com.linkedin.schema.ParquetSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schema", value);
            _schemaField = value;
        }
        return this;
    }

    @Override
    public ParquetSchema clone()
        throws CloneNotSupportedException
    {
        ParquetSchema __clone = ((ParquetSchema) super.clone());
        __clone.__changeListener = new ParquetSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ParquetSchema copy()
        throws CloneNotSupportedException
    {
        ParquetSchema __copy = ((ParquetSchema) super.copy());
        __copy._schemaField = null;
        __copy.__changeListener = new ParquetSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ParquetSchema __objectRef;

        private ChangeListener(ParquetSchema reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schema":
                    __objectRef._schemaField = null;
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
         * The native Parquet schema text.
         * 
         */
        public PathSpec schema() {
            return new PathSpec(getPathComponents(), "schema");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The native Parquet schema text.
         * 
         */
        public ParquetSchema.ProjectionMask withSchema() {
            getDataMap().put("schema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
