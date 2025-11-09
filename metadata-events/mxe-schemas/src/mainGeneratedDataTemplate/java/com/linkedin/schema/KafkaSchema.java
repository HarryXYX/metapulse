
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
 * Schema holder for kafka schema.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/KafkaSchema.pdl.")
public class KafkaSchema
    extends RecordTemplate
{

    private final static KafkaSchema.Fields _fields = new KafkaSchema.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.*/documentSchemaType:optional string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string/**The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.*/keySchemaType:optional string}", SchemaFormatType.PDL));
    private String _documentSchemaField = null;
    private String _documentSchemaTypeField = null;
    private String _keySchemaField = null;
    private String _keySchemaTypeField = null;
    private KafkaSchema.ChangeListener __changeListener = new KafkaSchema.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DocumentSchema = SCHEMA.getField("documentSchema");
    private final static RecordDataSchema.Field FIELD_DocumentSchemaType = SCHEMA.getField("documentSchemaType");
    private final static RecordDataSchema.Field FIELD_KeySchema = SCHEMA.getField("keySchema");
    private final static RecordDataSchema.Field FIELD_KeySchemaType = SCHEMA.getField("keySchemaType");

    public KafkaSchema() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public KafkaSchema(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static KafkaSchema.Fields fields() {
        return _fields;
    }

    public static KafkaSchema.ProjectionMask createMask() {
        return new KafkaSchema.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for documentSchema
     * 
     * @see KafkaSchema.Fields#documentSchema
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
     * @see KafkaSchema.Fields#documentSchema
     */
    public void removeDocumentSchema() {
        super._map.remove("documentSchema");
    }

    /**
     * Getter for documentSchema
     * 
     * @see KafkaSchema.Fields#documentSchema
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
     * @see KafkaSchema.Fields#documentSchema
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
     * @see KafkaSchema.Fields#documentSchema
     */
    public KafkaSchema setDocumentSchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDocumentSchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field documentSchema of com.linkedin.schema.KafkaSchema");
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
     * @see KafkaSchema.Fields#documentSchema
     */
    public KafkaSchema setDocumentSchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field documentSchema of com.linkedin.schema.KafkaSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "documentSchema", value);
            _documentSchemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for documentSchemaType
     * 
     * @see KafkaSchema.Fields#documentSchemaType
     */
    public boolean hasDocumentSchemaType() {
        if (_documentSchemaTypeField!= null) {
            return true;
        }
        return super._map.containsKey("documentSchemaType");
    }

    /**
     * Remover for documentSchemaType
     * 
     * @see KafkaSchema.Fields#documentSchemaType
     */
    public void removeDocumentSchemaType() {
        super._map.remove("documentSchemaType");
    }

    /**
     * Getter for documentSchemaType
     * 
     * @see KafkaSchema.Fields#documentSchemaType
     */
    @Nullable
    public String getDocumentSchemaType(GetMode mode) {
        return getDocumentSchemaType();
    }

    /**
     * Getter for documentSchemaType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaSchema.Fields#documentSchemaType
     */
    @Nullable
    public String getDocumentSchemaType() {
        if (_documentSchemaTypeField!= null) {
            return _documentSchemaTypeField;
        } else {
            Object __rawValue = super._map.get("documentSchemaType");
            _documentSchemaTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _documentSchemaTypeField;
        }
    }

    /**
     * Setter for documentSchemaType
     * 
     * @see KafkaSchema.Fields#documentSchemaType
     */
    public KafkaSchema setDocumentSchemaType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDocumentSchemaType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDocumentSchemaType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "documentSchemaType", value);
                    _documentSchemaTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "documentSchemaType", value);
                    _documentSchemaTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for documentSchemaType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaSchema.Fields#documentSchemaType
     */
    public KafkaSchema setDocumentSchemaType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field documentSchemaType of com.linkedin.schema.KafkaSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "documentSchemaType", value);
            _documentSchemaTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public boolean hasKeySchema() {
        if (_keySchemaField!= null) {
            return true;
        }
        return super._map.containsKey("keySchema");
    }

    /**
     * Remover for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public void removeKeySchema() {
        super._map.remove("keySchema");
    }

    /**
     * Getter for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    @Nullable
    public String getKeySchema(GetMode mode) {
        return getKeySchema();
    }

    /**
     * Getter for keySchema
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaSchema.Fields#keySchema
     */
    @Nullable
    public String getKeySchema() {
        if (_keySchemaField!= null) {
            return _keySchemaField;
        } else {
            Object __rawValue = super._map.get("keySchema");
            _keySchemaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _keySchemaField;
        }
    }

    /**
     * Setter for keySchema
     * 
     * @see KafkaSchema.Fields#keySchema
     */
    public KafkaSchema setKeySchema(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKeySchema(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKeySchema();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
                    _keySchemaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
                    _keySchemaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for keySchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaSchema.Fields#keySchema
     */
    public KafkaSchema setKeySchema(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field keySchema of com.linkedin.schema.KafkaSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "keySchema", value);
            _keySchemaField = value;
        }
        return this;
    }

    /**
     * Existence checker for keySchemaType
     * 
     * @see KafkaSchema.Fields#keySchemaType
     */
    public boolean hasKeySchemaType() {
        if (_keySchemaTypeField!= null) {
            return true;
        }
        return super._map.containsKey("keySchemaType");
    }

    /**
     * Remover for keySchemaType
     * 
     * @see KafkaSchema.Fields#keySchemaType
     */
    public void removeKeySchemaType() {
        super._map.remove("keySchemaType");
    }

    /**
     * Getter for keySchemaType
     * 
     * @see KafkaSchema.Fields#keySchemaType
     */
    @Nullable
    public String getKeySchemaType(GetMode mode) {
        return getKeySchemaType();
    }

    /**
     * Getter for keySchemaType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see KafkaSchema.Fields#keySchemaType
     */
    @Nullable
    public String getKeySchemaType() {
        if (_keySchemaTypeField!= null) {
            return _keySchemaTypeField;
        } else {
            Object __rawValue = super._map.get("keySchemaType");
            _keySchemaTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _keySchemaTypeField;
        }
    }

    /**
     * Setter for keySchemaType
     * 
     * @see KafkaSchema.Fields#keySchemaType
     */
    public KafkaSchema setKeySchemaType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKeySchemaType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKeySchemaType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keySchemaType", value);
                    _keySchemaTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "keySchemaType", value);
                    _keySchemaTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for keySchemaType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see KafkaSchema.Fields#keySchemaType
     */
    public KafkaSchema setKeySchemaType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field keySchemaType of com.linkedin.schema.KafkaSchema to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "keySchemaType", value);
            _keySchemaTypeField = value;
        }
        return this;
    }

    @Override
    public KafkaSchema clone()
        throws CloneNotSupportedException
    {
        KafkaSchema __clone = ((KafkaSchema) super.clone());
        __clone.__changeListener = new KafkaSchema.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public KafkaSchema copy()
        throws CloneNotSupportedException
    {
        KafkaSchema __copy = ((KafkaSchema) super.copy());
        __copy._documentSchemaField = null;
        __copy._documentSchemaTypeField = null;
        __copy._keySchemaField = null;
        __copy._keySchemaTypeField = null;
        __copy.__changeListener = new KafkaSchema.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final KafkaSchema __objectRef;

        private ChangeListener(KafkaSchema reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "documentSchema":
                    __objectRef._documentSchemaField = null;
                    break;
                case "documentSchemaType":
                    __objectRef._documentSchemaTypeField = null;
                    break;
                case "keySchema":
                    __objectRef._keySchemaField = null;
                    break;
                case "keySchemaType":
                    __objectRef._keySchemaTypeField = null;
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
         * The native kafka document schema. This is a human readable avro document schema.
         * 
         */
        public PathSpec documentSchema() {
            return new PathSpec(getPathComponents(), "documentSchema");
        }

        /**
         * The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.
         * 
         */
        public PathSpec documentSchemaType() {
            return new PathSpec(getPathComponents(), "documentSchemaType");
        }

        /**
         * The native kafka key schema as retrieved from Schema Registry
         * 
         */
        public PathSpec keySchema() {
            return new PathSpec(getPathComponents(), "keySchema");
        }

        /**
         * The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.
         * 
         */
        public PathSpec keySchemaType() {
            return new PathSpec(getPathComponents(), "keySchemaType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * The native kafka document schema. This is a human readable avro document schema.
         * 
         */
        public KafkaSchema.ProjectionMask withDocumentSchema() {
            getDataMap().put("documentSchema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native kafka document schema type. This can be AVRO/PROTOBUF/JSON.
         * 
         */
        public KafkaSchema.ProjectionMask withDocumentSchemaType() {
            getDataMap().put("documentSchemaType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native kafka key schema as retrieved from Schema Registry
         * 
         */
        public KafkaSchema.ProjectionMask withKeySchema() {
            getDataMap().put("keySchema", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The native kafka key schema type. This can be AVRO/PROTOBUF/JSON.
         * 
         */
        public KafkaSchema.ProjectionMask withKeySchemaType() {
            getDataMap().put("keySchemaType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
