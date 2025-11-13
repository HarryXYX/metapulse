
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
 * Schema text for avro schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/AvroSchema.pdl.")
public class AvroSchema
    extends RecordTemplate
{

    private final static AvroSchema.Fields _fields = new AvroSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text for avro schema.*/record AvroSchema{/**The native Avro schema text.*/schema:string}", SchemaFormatType.PDL));
    private String _schemaField = null;
    private AvroSchema.ChangeListener __changeListener = new AvroSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");

    public AvroSchema() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AvroSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AvroSchema.Fields fields() {
        return _fields;
    }

    public static AvroSchema.ProjectionMask createMask() {
        return new AvroSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for schema
     * 
     * @see AvroSchema.Fields#schema
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
     * @see AvroSchema.Fields#schema
     */
    public void removeSchema() {
        super._map.remove("schema");
    }

    /**
     * Getter for schema
     * 
     * @see AvroSchema.Fields#schema
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
     * @see AvroSchema.Fields#schema
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
     * @see AvroSchema.Fields#schema
     */
    public AvroSchema setSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schema of com.linkedin.schema.AvroSchema");
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
     * @see AvroSchema.Fields#schema
     */
    public AvroSchema setSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schema of com.linkedin.schema.AvroSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schema", value);
            _schemaField = value;
        }
        return this;
    }

    @Override
    public AvroSchema clone()
        throws CloneNotSupportedException
    {
        AvroSchema __clone = ((AvroSchema) super.clone());
        __clone.__changeListener = new AvroSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AvroSchema copy()
        throws CloneNotSupportedException
    {
        AvroSchema __copy = ((AvroSchema) super.copy());
        __copy._schemaField = null;
        __copy.__changeListener = new AvroSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AvroSchema __objectRef;

        private ChangeListener(AvroSchema reference) {
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
         * The native Avro schema text.
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
         * The native Avro schema text.
         * 
         */
        public AvroSchema.ProjectionMask withSchema() {
            getDataMap().put("schema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
