
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
 * Schema holder for oracle data definition language that describes an oracle table.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/OracleDDL.pdl.")
public class OracleDDL
    extends RecordTemplate
{

    private final static OracleDDL.Fields _fields = new OracleDDL.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}", SchemaFormatType.PDL));
    private String _tableSchemaField = null;
    private OracleDDL.ChangeListener __changeListener = new OracleDDL.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TableSchema = SCHEMA.getField("tableSchema");

    public OracleDDL() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public OracleDDL(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OracleDDL.Fields fields() {
        return _fields;
    }

    public static OracleDDL.ProjectionMask createMask() {
        return new OracleDDL.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for tableSchema
     * 
     * @see OracleDDL.Fields#tableSchema
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
     * @see OracleDDL.Fields#tableSchema
     */
    public void removeTableSchema() {
        super._map.remove("tableSchema");
    }

    /**
     * Getter for tableSchema
     * 
     * @see OracleDDL.Fields#tableSchema
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
     * @see OracleDDL.Fields#tableSchema
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
     * @see OracleDDL.Fields#tableSchema
     */
    public OracleDDL setTableSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTableSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tableSchema of com.linkedin.schema.OracleDDL");
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
     * @see OracleDDL.Fields#tableSchema
     */
    public OracleDDL setTableSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tableSchema of com.linkedin.schema.OracleDDL to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tableSchema", value);
            _tableSchemaField = value;
        }
        return this;
    }

    @Override
    public OracleDDL clone()
        throws CloneNotSupportedException
    {
        OracleDDL __clone = ((OracleDDL) super.clone());
        __clone.__changeListener = new OracleDDL.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OracleDDL copy()
        throws CloneNotSupportedException
    {
        OracleDDL __copy = ((OracleDDL) super.copy());
        __copy._tableSchemaField = null;
        __copy.__changeListener = new OracleDDL.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OracleDDL __objectRef;

        private ChangeListener(OracleDDL reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * The native schema in the dataset's platform. This is a human readable (json blob) table schema.
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
            super(2);
        }

        /**
         * The native schema in the dataset's platform. This is a human readable (json blob) table schema.
         * 
         */
        public OracleDDL.ProjectionMask withTableSchema() {
            getDataMap().put("tableSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
