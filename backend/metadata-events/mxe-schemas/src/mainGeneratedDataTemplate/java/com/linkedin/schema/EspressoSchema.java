
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
 * Schema text of an espresso table schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/EspressoSchema.pdl.")
public class EspressoSchema
    extends RecordTemplate
{

    private final static EspressoSchema.Fields _fields = new EspressoSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}", SchemaFormatType.PDL));
    private String _documentSchemaField = null;
    private String _tableSchemaField = null;
    private EspressoSchema.ChangeListener __changeListener = new EspressoSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DocumentSchema = SCHEMA.getField("documentSchema");
    private final static RecordDataSchema.Field FIELD_TableSchema = SCHEMA.getField("tableSchema");

    public EspressoSchema() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public EspressoSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EspressoSchema.Fields fields() {
        return _fields;
    }

    public static EspressoSchema.ProjectionMask createMask() {
        return new EspressoSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public boolean hasDocumentSchema() {
        if (_documentSchemaField!= null) {
            return true;
        }
        return super._map.containsKey("documentSchema");
    }

    /**
     * Remover for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public void removeDocumentSchema() {
        super._map.remove("documentSchema");
    }

    /**
     * Getter for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    @Nullable
    public String getDocumentSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDocumentSchema();
            case DEFAULT:
            case NULL:
                if (_documentSchemaField!= null) {
                    return _documentSchemaField;
                } else {
                    Object __rawValue = super._map.get("documentSchema");
                    _documentSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _documentSchemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for documentSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EspressoSchema.Fields#documentSchema
     */
    @Nonnull
    public String getDocumentSchema() {
        if (_documentSchemaField!= null) {
            return _documentSchemaField;
        } else {
            Object __rawValue = super._map.get("documentSchema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("documentSchema");
            }
            _documentSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _documentSchemaField;
        }
    }

    /**
     * Setter for documentSchema
     * 
     * @see EspressoSchema.Fields#documentSchema
     */
    public EspressoSchema setDocumentSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDocumentSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field documentSchema of com.linkedin.schema.EspressoSchema");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentSchema", value);
                    _documentSchemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDocumentSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentSchema", value);
                    _documentSchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "documentSchema", value);
                    _documentSchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for documentSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EspressoSchema.Fields#documentSchema
     */
    public EspressoSchema setDocumentSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field documentSchema of com.linkedin.schema.EspressoSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "documentSchema", value);
            _documentSchemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public boolean hasTableSchema() {
        if (_tableSchemaField!= null) {
            return true;
        }
        return super._map.containsKey("tableSchema");
    }

    /**
     * Remover for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public void removeTableSchema() {
        super._map.remove("tableSchema");
    }

    /**
     * Getter for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    @Nullable
    public String getTableSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTableSchema();
            case DEFAULT:
            case NULL:
                if (_tableSchemaField!= null) {
                    return _tableSchemaField;
                } else {
                    Object __rawValue = super._map.get("tableSchema");
                    _tableSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _tableSchemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for tableSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EspressoSchema.Fields#tableSchema
     */
    @Nonnull
    public String getTableSchema() {
        if (_tableSchemaField!= null) {
            return _tableSchemaField;
        } else {
            Object __rawValue = super._map.get("tableSchema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("tableSchema");
            }
            _tableSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _tableSchemaField;
        }
    }

    /**
     * Setter for tableSchema
     * 
     * @see EspressoSchema.Fields#tableSchema
     */
    public EspressoSchema setTableSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTableSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tableSchema of com.linkedin.schema.EspressoSchema");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tableSchema", value);
                    _tableSchemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTableSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tableSchema", value);
                    _tableSchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tableSchema", value);
                    _tableSchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tableSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EspressoSchema.Fields#tableSchema
     */
    public EspressoSchema setTableSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tableSchema of com.linkedin.schema.EspressoSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tableSchema", value);
            _tableSchemaField = value;
        }
        return this;
    }

    @Override
    public EspressoSchema clone()
        throws CloneNotSupportedException
    {
        EspressoSchema __clone = ((EspressoSchema) super.clone());
        __clone.__changeListener = new EspressoSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EspressoSchema copy()
        throws CloneNotSupportedException
    {
        EspressoSchema __copy = ((EspressoSchema) super.copy());
        __copy._documentSchemaField = null;
        __copy._tableSchemaField = null;
        __copy.__changeListener = new EspressoSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EspressoSchema __objectRef;

        private ChangeListener(EspressoSchema reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "documentSchema":
                    __objectRef._documentSchemaField = null;
                    break;
                case "tableSchema":
                    __objectRef._tableSchemaField = null;
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
         * The native espresso document schema.
         * 
         */
        public PathSpec documentSchema() {
            return new PathSpec(getPathComponents(), "documentSchema");
        }

        /**
         * The espresso table schema definition.
         * 
         */
        public PathSpec tableSchema() {
            return new PathSpec(getPathComponents(), "tableSchema");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The native espresso document schema.
         * 
         */
        public EspressoSchema.ProjectionMask withDocumentSchema() {
            getDataMap().put("documentSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The espresso table schema definition.
         * 
         */
        public EspressoSchema.ProjectionMask withTableSchema() {
            getDataMap().put("tableSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
