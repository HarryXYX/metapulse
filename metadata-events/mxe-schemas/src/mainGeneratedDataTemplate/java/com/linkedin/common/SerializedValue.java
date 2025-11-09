
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.ByteString;
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
 * Captures the serialized value of a (usually) schema-d blob.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/SerializedValue.pdl.")
public class SerializedValue
    extends RecordTemplate
{

    private final static SerializedValue.Fields _fields = new SerializedValue.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Captures the serialized value of a (usually) schema-d blob.*/record SerializedValue{/**The serialized blob value.*/blob:bytes/**The content-type of the serialized blob value.*/contentType:enum SerializedValueContentType{JSON,BINARY}=\"JSON\"/**The schema type for the schema that models the object that was serialized\n       into the blob.\nAbsence of this field indicates that the schema is not known.\nIf the schema is known, the value should be set to the appropriate schema\ntype.\nUse the NONE value if the existing schema categories do not apply.*/schemaType:optional enum SerializedValueSchemaType{AVRO,PROTOBUF,PEGASUS,THRIFT,JSON,NONE}/**An optional reference to the schema that models the object.\ne.g., 'com.linkedin.platformresource.slack.SlackConversation'*/schemaRef:optional string}", SchemaFormatType.PDL));
    private ByteString _blobField = null;
    private SerializedValueContentType _contentTypeField = null;
    private SerializedValueSchemaType _schemaTypeField = null;
    private String _schemaRefField = null;
    private SerializedValue.ChangeListener __changeListener = new SerializedValue.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Blob = SCHEMA.getField("blob");
    private final static RecordDataSchema.Field FIELD_ContentType = SCHEMA.getField("contentType");
    private final static SerializedValueContentType DEFAULT_ContentType;
    private final static RecordDataSchema.Field FIELD_SchemaType = SCHEMA.getField("schemaType");
    private final static RecordDataSchema.Field FIELD_SchemaRef = SCHEMA.getField("schemaRef");

    static {
        DEFAULT_ContentType = DataTemplateUtil.coerceEnumOutput(FIELD_ContentType.getDefault(), SerializedValueContentType.class, SerializedValueContentType.$UNKNOWN);
    }

    public SerializedValue() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SerializedValue(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SerializedValue.Fields fields() {
        return _fields;
    }

    public static SerializedValue.ProjectionMask createMask() {
        return new SerializedValue.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for blob
     * 
     * @see SerializedValue.Fields#blob
     */
    public boolean hasBlob() {
        if (_blobField!= null) {
            return true;
        }
        return super._map.containsKey("blob");
    }

    /**
     * Remover for blob
     * 
     * @see SerializedValue.Fields#blob
     */
    public void removeBlob() {
        super._map.remove("blob");
    }

    /**
     * Getter for blob
     * 
     * @see SerializedValue.Fields#blob
     */
    @Nullable
    public ByteString getBlob(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBlob();
            case DEFAULT:
            case NULL:
                if (_blobField!= null) {
                    return _blobField;
                } else {
                    Object __rawValue = super._map.get("blob");
                    _blobField = DataTemplateUtil.coerceBytesOutput(__rawValue);
                    return _blobField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for blob
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SerializedValue.Fields#blob
     */
    @Nonnull
    public ByteString getBlob() {
        if (_blobField!= null) {
            return _blobField;
        } else {
            Object __rawValue = super._map.get("blob");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("blob");
            }
            _blobField = DataTemplateUtil.coerceBytesOutput(__rawValue);
            return _blobField;
        }
    }

    /**
     * Setter for blob
     * 
     * @see SerializedValue.Fields#blob
     */
    public SerializedValue setBlob(
        @Nullable
        ByteString value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBlob(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field blob of com.linkedin.common.SerializedValue");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "blob", value);
                    _blobField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBlob();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "blob", value);
                    _blobField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "blob", value);
                    _blobField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for blob
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SerializedValue.Fields#blob
     */
    public SerializedValue setBlob(
        @Nonnull
        ByteString value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field blob of com.linkedin.common.SerializedValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "blob", value);
            _blobField = value;
        }
        return this;
    }

    /**
     * Existence checker for contentType
     * 
     * @see SerializedValue.Fields#contentType
     */
    public boolean hasContentType() {
        if (_contentTypeField!= null) {
            return true;
        }
        return super._map.containsKey("contentType");
    }

    /**
     * Remover for contentType
     * 
     * @see SerializedValue.Fields#contentType
     */
    public void removeContentType() {
        super._map.remove("contentType");
    }

    /**
     * Getter for contentType
     * 
     * @see SerializedValue.Fields#contentType
     */
    @Nullable
    public SerializedValueContentType getContentType(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getContentType();
            case NULL:
                if (_contentTypeField!= null) {
                    return _contentTypeField;
                } else {
                    Object __rawValue = super._map.get("contentType");
                    _contentTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SerializedValueContentType.class, SerializedValueContentType.$UNKNOWN);
                    return _contentTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for contentType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SerializedValue.Fields#contentType
     */
    @Nonnull
    public SerializedValueContentType getContentType() {
        if (_contentTypeField!= null) {
            return _contentTypeField;
        } else {
            Object __rawValue = super._map.get("contentType");
            if (__rawValue == null) {
                return DEFAULT_ContentType;
            }
            _contentTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SerializedValueContentType.class, SerializedValueContentType.$UNKNOWN);
            return _contentTypeField;
        }
    }

    /**
     * Setter for contentType
     * 
     * @see SerializedValue.Fields#contentType
     */
    public SerializedValue setContentType(
        @Nullable
        SerializedValueContentType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContentType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field contentType of com.linkedin.common.SerializedValue");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value.name());
                    _contentTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContentType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value.name());
                    _contentTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value.name());
                    _contentTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for contentType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SerializedValue.Fields#contentType
     */
    public SerializedValue setContentType(
        @Nonnull
        SerializedValueContentType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field contentType of com.linkedin.common.SerializedValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "contentType", value.name());
            _contentTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for schemaType
     * 
     * @see SerializedValue.Fields#schemaType
     */
    public boolean hasSchemaType() {
        if (_schemaTypeField!= null) {
            return true;
        }
        return super._map.containsKey("schemaType");
    }

    /**
     * Remover for schemaType
     * 
     * @see SerializedValue.Fields#schemaType
     */
    public void removeSchemaType() {
        super._map.remove("schemaType");
    }

    /**
     * Getter for schemaType
     * 
     * @see SerializedValue.Fields#schemaType
     */
    @Nullable
    public SerializedValueSchemaType getSchemaType(GetMode mode) {
        return getSchemaType();
    }

    /**
     * Getter for schemaType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SerializedValue.Fields#schemaType
     */
    @Nullable
    public SerializedValueSchemaType getSchemaType() {
        if (_schemaTypeField!= null) {
            return _schemaTypeField;
        } else {
            Object __rawValue = super._map.get("schemaType");
            _schemaTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SerializedValueSchemaType.class, SerializedValueSchemaType.$UNKNOWN);
            return _schemaTypeField;
        }
    }

    /**
     * Setter for schemaType
     * 
     * @see SerializedValue.Fields#schemaType
     */
    public SerializedValue setSchemaType(
        @Nullable
        SerializedValueSchemaType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaType", value.name());
                    _schemaTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaType", value.name());
                    _schemaTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SerializedValue.Fields#schemaType
     */
    public SerializedValue setSchemaType(
        @Nonnull
        SerializedValueSchemaType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaType of com.linkedin.common.SerializedValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaType", value.name());
            _schemaTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for schemaRef
     * 
     * @see SerializedValue.Fields#schemaRef
     */
    public boolean hasSchemaRef() {
        if (_schemaRefField!= null) {
            return true;
        }
        return super._map.containsKey("schemaRef");
    }

    /**
     * Remover for schemaRef
     * 
     * @see SerializedValue.Fields#schemaRef
     */
    public void removeSchemaRef() {
        super._map.remove("schemaRef");
    }

    /**
     * Getter for schemaRef
     * 
     * @see SerializedValue.Fields#schemaRef
     */
    @Nullable
    public String getSchemaRef(GetMode mode) {
        return getSchemaRef();
    }

    /**
     * Getter for schemaRef
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SerializedValue.Fields#schemaRef
     */
    @Nullable
    public String getSchemaRef() {
        if (_schemaRefField!= null) {
            return _schemaRefField;
        } else {
            Object __rawValue = super._map.get("schemaRef");
            _schemaRefField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _schemaRefField;
        }
    }

    /**
     * Setter for schemaRef
     * 
     * @see SerializedValue.Fields#schemaRef
     */
    public SerializedValue setSchemaRef(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaRef(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaRef();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaRef", value);
                    _schemaRefField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaRef", value);
                    _schemaRefField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaRef
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SerializedValue.Fields#schemaRef
     */
    public SerializedValue setSchemaRef(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaRef of com.linkedin.common.SerializedValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaRef", value);
            _schemaRefField = value;
        }
        return this;
    }

    @Override
    public SerializedValue clone()
        throws CloneNotSupportedException
    {
        SerializedValue __clone = ((SerializedValue) super.clone());
        __clone.__changeListener = new SerializedValue.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SerializedValue copy()
        throws CloneNotSupportedException
    {
        SerializedValue __copy = ((SerializedValue) super.copy());
        __copy._blobField = null;
        __copy._schemaRefField = null;
        __copy._schemaTypeField = null;
        __copy._contentTypeField = null;
        __copy.__changeListener = new SerializedValue.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SerializedValue __objectRef;

        private ChangeListener(SerializedValue reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "blob":
                    __objectRef._blobField = null;
                    break;
                case "schemaRef":
                    __objectRef._schemaRefField = null;
                    break;
                case "schemaType":
                    __objectRef._schemaTypeField = null;
                    break;
                case "contentType":
                    __objectRef._contentTypeField = null;
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
         * The serialized blob value.
         * 
         */
        public PathSpec blob() {
            return new PathSpec(getPathComponents(), "blob");
        }

        /**
         * The content-type of the serialized blob value.
         * 
         */
        public PathSpec contentType() {
            return new PathSpec(getPathComponents(), "contentType");
        }

        /**
         * The schema type for the schema that models the object that was serialized
         *        into the blob.
         * Absence of this field indicates that the schema is not known.
         * If the schema is known, the value should be set to the appropriate schema
         * type.
         * Use the NONE value if the existing schema categories do not apply.
         * 
         */
        public PathSpec schemaType() {
            return new PathSpec(getPathComponents(), "schemaType");
        }

        /**
         * An optional reference to the schema that models the object.
         * e.g., 'com.linkedin.platformresource.slack.SlackConversation'
         * 
         */
        public PathSpec schemaRef() {
            return new PathSpec(getPathComponents(), "schemaRef");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * The serialized blob value.
         * 
         */
        public SerializedValue.ProjectionMask withBlob() {
            getDataMap().put("blob", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The content-type of the serialized blob value.
         * 
         */
        public SerializedValue.ProjectionMask withContentType() {
            getDataMap().put("contentType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The schema type for the schema that models the object that was serialized
         *        into the blob.
         * Absence of this field indicates that the schema is not known.
         * If the schema is known, the value should be set to the appropriate schema
         * type.
         * Use the NONE value if the existing schema categories do not apply.
         * 
         */
        public SerializedValue.ProjectionMask withSchemaType() {
            getDataMap().put("schemaType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional reference to the schema that models the object.
         * e.g., 'com.linkedin.platformresource.slack.SlackConversation'
         * 
         */
        public SerializedValue.ProjectionMask withSchemaRef() {
            getDataMap().put("schemaRef", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
