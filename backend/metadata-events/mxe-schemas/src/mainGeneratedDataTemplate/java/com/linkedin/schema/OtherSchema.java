
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
 * Schema holder for undefined schema types.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/OtherSchema.pdl.")
public class OtherSchema
    extends RecordTemplate
{

    private final static OtherSchema.Fields _fields = new OtherSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}", SchemaFormatType.PDL));
    private String _rawSchemaField = null;
    private OtherSchema.ChangeListener __changeListener = new OtherSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RawSchema = SCHEMA.getField("rawSchema");

    public OtherSchema() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public OtherSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OtherSchema.Fields fields() {
        return _fields;
    }

    public static OtherSchema.ProjectionMask createMask() {
        return new OtherSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for rawSchema
     * 
     * @see OtherSchema.Fields#rawSchema
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
     * @see OtherSchema.Fields#rawSchema
     */
    public void removeRawSchema() {
        super._map.remove("rawSchema");
    }

    /**
     * Getter for rawSchema
     * 
     * @see OtherSchema.Fields#rawSchema
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
     * @see OtherSchema.Fields#rawSchema
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
     * @see OtherSchema.Fields#rawSchema
     */
    public OtherSchema setRawSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRawSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rawSchema of com.linkedin.schema.OtherSchema");
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
     * @see OtherSchema.Fields#rawSchema
     */
    public OtherSchema setRawSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rawSchema of com.linkedin.schema.OtherSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rawSchema", value);
            _rawSchemaField = value;
        }
        return this;
    }

    @Override
    public OtherSchema clone()
        throws CloneNotSupportedException
    {
        OtherSchema __clone = ((OtherSchema) super.clone());
        __clone.__changeListener = new OtherSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OtherSchema copy()
        throws CloneNotSupportedException
    {
        OtherSchema __copy = ((OtherSchema) super.copy());
        __copy._rawSchemaField = null;
        __copy.__changeListener = new OtherSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OtherSchema __objectRef;

        private ChangeListener(OtherSchema reference) {
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
         * The native schema in the dataset's platform.
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
         * The native schema in the dataset's platform.
         * 
         */
        public OtherSchema.ProjectionMask withRawSchema() {
            getDataMap().put("rawSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
