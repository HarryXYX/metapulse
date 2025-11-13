
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
 * Schema holder for presto data definition language that describes a presto view.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/schema/PrestoDDL.pdl.")
public class PrestoDDL
    extends RecordTemplate
{

    private final static PrestoDDL.Fields _fields = new PrestoDDL.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}", SchemaFormatType.PDL));
    private String _rawSchemaField = null;
    private PrestoDDL.ChangeListener __changeListener = new PrestoDDL.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RawSchema = SCHEMA.getField("rawSchema");

    public PrestoDDL() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public PrestoDDL(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PrestoDDL.Fields fields() {
        return _fields;
    }

    public static PrestoDDL.ProjectionMask createMask() {
        return new PrestoDDL.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public boolean hasRawSchema() {
        if (_rawSchemaField!= null) {
            return true;
        }
        return super._map.containsKey("rawSchema");
    }

    /**
     * Remover for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public void removeRawSchema() {
        super._map.remove("rawSchema");
    }

    /**
     * Getter for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    @Nullable
    public String getRawSchema(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRawSchema();
            case DEFAULT:
            case NULL:
                if (_rawSchemaField!= null) {
                    return _rawSchemaField;
                } else {
                    Object __rawValue = super._map.get("rawSchema");
                    _rawSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _rawSchemaField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rawSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PrestoDDL.Fields#rawSchema
     */
    @Nonnull
    public String getRawSchema() {
        if (_rawSchemaField!= null) {
            return _rawSchemaField;
        } else {
            Object __rawValue = super._map.get("rawSchema");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rawSchema");
            }
            _rawSchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _rawSchemaField;
        }
    }

    /**
     * Setter for rawSchema
     * 
     * @see PrestoDDL.Fields#rawSchema
     */
    public PrestoDDL setRawSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRawSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rawSchema of com.linkedin.schema.PrestoDDL");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
                    _rawSchemaField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRawSchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
                    _rawSchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
                    _rawSchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rawSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PrestoDDL.Fields#rawSchema
     */
    public PrestoDDL setRawSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rawSchema of com.linkedin.schema.PrestoDDL to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
            _rawSchemaField = value;
        }
        return this;
    }

    @Override
    public PrestoDDL clone()
        throws CloneNotSupportedException
    {
        PrestoDDL __clone = ((PrestoDDL) super.clone());
        __clone.__changeListener = new PrestoDDL.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PrestoDDL copy()
        throws CloneNotSupportedException
    {
        PrestoDDL __copy = ((PrestoDDL) super.copy());
        __copy._rawSchemaField = null;
        __copy.__changeListener = new PrestoDDL.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PrestoDDL __objectRef;

        private ChangeListener(PrestoDDL reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "rawSchema":
                    __objectRef._rawSchemaField = null;
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
         * The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.
         * 
         */
        public PathSpec rawSchema() {
            return new PathSpec(getPathComponents(), "rawSchema");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.
         * 
         */
        public PrestoDDL.ProjectionMask withRawSchema() {
            getDataMap().put("rawSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
