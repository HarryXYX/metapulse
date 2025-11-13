
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
 * Schema text of binary JSON schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/BinaryJsonSchema.pdl.")
public class BinaryJsonSchema
    extends RecordTemplate
{

    private final static BinaryJsonSchema.Fields _fields = new BinaryJsonSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}", SchemaFormatType.PDL));
    private String _schemaField = null;
    private BinaryJsonSchema.ChangeListener __changeListener = new BinaryJsonSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Schema = SCHEMA.getField("schema");

    public BinaryJsonSchema() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BinaryJsonSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BinaryJsonSchema.Fields fields() {
        return _fields;
    }

    public static BinaryJsonSchema.ProjectionMask createMask() {
        return new BinaryJsonSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for schema
     * 
     * @see BinaryJsonSchema.Fields#schema
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
     * @see BinaryJsonSchema.Fields#schema
     */
    public void removeSchema() {
        super._map.remove("schema");
    }

    /**
     * Getter for schema
     * 
     * @see BinaryJsonSchema.Fields#schema
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
     * @see BinaryJsonSchema.Fields#schema
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
     * @see BinaryJsonSchema.Fields#schema
     */
    public BinaryJsonSchema setSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schema of com.linkedin.schema.BinaryJsonSchema");
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
     * @see BinaryJsonSchema.Fields#schema
     */
    public BinaryJsonSchema setSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schema of com.linkedin.schema.BinaryJsonSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schema", value);
            _schemaField = value;
        }
        return this;
    }

    @Override
    public BinaryJsonSchema clone()
        throws CloneNotSupportedException
    {
        BinaryJsonSchema __clone = ((BinaryJsonSchema) super.clone());
        __clone.__changeListener = new BinaryJsonSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BinaryJsonSchema copy()
        throws CloneNotSupportedException
    {
        BinaryJsonSchema __copy = ((BinaryJsonSchema) super.copy());
        __copy._schemaField = null;
        __copy.__changeListener = new BinaryJsonSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BinaryJsonSchema __objectRef;

        private ChangeListener(BinaryJsonSchema reference) {
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
         * The native schema text for binary JSON file format.
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
         * The native schema text for binary JSON file format.
         * 
         */
        public BinaryJsonSchema.ProjectionMask withSchema() {
            getDataMap().put("schema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
