
package com.linkedin.execution;

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
 * A flexible carrier for structured results of an execution request.
 * The goal is to allow for free flow of structured responses from execution tasks to the orchestrator or observer.
 * The full spectrum of different execution report types is not intended to be modeled by this object.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/execution/StructuredExecutionReport.pdl.")
public class StructuredExecutionReport
    extends RecordTemplate
{

    private final static StructuredExecutionReport.Fields _fields = new StructuredExecutionReport.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.execution/**A flexible carrier for structured results of an execution request.\nThe goal is to allow for free flow of structured responses from execution tasks to the orchestrator or observer.\nThe full spectrum of different execution report types is not intended to be modeled by this object.*/record StructuredExecutionReport{/**The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)*/type:string/**The serialized value of the structured report\n*/serializedValue:string/**The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)\n*/contentType:string}", SchemaFormatType.PDL));
    private String _typeField = null;
    private String _serializedValueField = null;
    private String _contentTypeField = null;
    private StructuredExecutionReport.ChangeListener __changeListener = new StructuredExecutionReport.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_SerializedValue = SCHEMA.getField("serializedValue");
    private final static RecordDataSchema.Field FIELD_ContentType = SCHEMA.getField("contentType");

    public StructuredExecutionReport() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public StructuredExecutionReport(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static StructuredExecutionReport.Fields fields() {
        return _fields;
    }

    public static StructuredExecutionReport.ProjectionMask createMask() {
        return new StructuredExecutionReport.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see StructuredExecutionReport.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see StructuredExecutionReport.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see StructuredExecutionReport.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredExecutionReport.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see StructuredExecutionReport.Fields#type
     */
    public StructuredExecutionReport setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.execution.StructuredExecutionReport");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredExecutionReport.Fields#type
     */
    public StructuredExecutionReport setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.execution.StructuredExecutionReport to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for serializedValue
     * 
     * @see StructuredExecutionReport.Fields#serializedValue
     */
    public boolean hasSerializedValue() {
        if (_serializedValueField!= null) {
            return true;
        }
        return super._map.containsKey("serializedValue");
    }

    /**
     * Remover for serializedValue
     * 
     * @see StructuredExecutionReport.Fields#serializedValue
     */
    public void removeSerializedValue() {
        super._map.remove("serializedValue");
    }

    /**
     * Getter for serializedValue
     * 
     * @see StructuredExecutionReport.Fields#serializedValue
     */
    @Nullable
    public String getSerializedValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSerializedValue();
            case DEFAULT:
            case NULL:
                if (_serializedValueField!= null) {
                    return _serializedValueField;
                } else {
                    Object __rawValue = super._map.get("serializedValue");
                    _serializedValueField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _serializedValueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for serializedValue
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see StructuredExecutionReport.Fields#serializedValue
     */
    @Nonnull
    public String getSerializedValue() {
        if (_serializedValueField!= null) {
            return _serializedValueField;
        } else {
            Object __rawValue = super._map.get("serializedValue");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("serializedValue");
            }
            _serializedValueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _serializedValueField;
        }
    }

    /**
     * Setter for serializedValue
     * 
     * @see StructuredExecutionReport.Fields#serializedValue
     */
    public StructuredExecutionReport setSerializedValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSerializedValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field serializedValue of com.linkedin.execution.StructuredExecutionReport");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "serializedValue", value);
                    _serializedValueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSerializedValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "serializedValue", value);
                    _serializedValueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "serializedValue", value);
                    _serializedValueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for serializedValue
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see StructuredExecutionReport.Fields#serializedValue
     */
    public StructuredExecutionReport setSerializedValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field serializedValue of com.linkedin.execution.StructuredExecutionReport to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "serializedValue", value);
            _serializedValueField = value;
        }
        return this;
    }

    /**
     * Existence checker for contentType
     * 
     * @see StructuredExecutionReport.Fields#contentType
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
     * @see StructuredExecutionReport.Fields#contentType
     */
    public void removeContentType() {
        super._map.remove("contentType");
    }

    /**
     * Getter for contentType
     * 
     * @see StructuredExecutionReport.Fields#contentType
     */
    @Nullable
    public String getContentType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getContentType();
            case DEFAULT:
            case NULL:
                if (_contentTypeField!= null) {
                    return _contentTypeField;
                } else {
                    Object __rawValue = super._map.get("contentType");
                    _contentTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see StructuredExecutionReport.Fields#contentType
     */
    @Nonnull
    public String getContentType() {
        if (_contentTypeField!= null) {
            return _contentTypeField;
        } else {
            Object __rawValue = super._map.get("contentType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("contentType");
            }
            _contentTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contentTypeField;
        }
    }

    /**
     * Setter for contentType
     * 
     * @see StructuredExecutionReport.Fields#contentType
     */
    public StructuredExecutionReport setContentType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContentType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field contentType of com.linkedin.execution.StructuredExecutionReport");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value);
                    _contentTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContentType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value);
                    _contentTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "contentType", value);
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
     * @see StructuredExecutionReport.Fields#contentType
     */
    public StructuredExecutionReport setContentType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field contentType of com.linkedin.execution.StructuredExecutionReport to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "contentType", value);
            _contentTypeField = value;
        }
        return this;
    }

    @Override
    public StructuredExecutionReport clone()
        throws CloneNotSupportedException
    {
        StructuredExecutionReport __clone = ((StructuredExecutionReport) super.clone());
        __clone.__changeListener = new StructuredExecutionReport.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public StructuredExecutionReport copy()
        throws CloneNotSupportedException
    {
        StructuredExecutionReport __copy = ((StructuredExecutionReport) super.copy());
        __copy._serializedValueField = null;
        __copy._typeField = null;
        __copy._contentTypeField = null;
        __copy.__changeListener = new StructuredExecutionReport.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final StructuredExecutionReport __objectRef;

        private ChangeListener(StructuredExecutionReport reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "serializedValue":
                    __objectRef._serializedValueField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The serialized value of the structured report
         * 
         * 
         */
        public PathSpec serializedValue() {
            return new PathSpec(getPathComponents(), "serializedValue");
        }

        /**
         * The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)
         * 
         * 
         */
        public PathSpec contentType() {
            return new PathSpec(getPathComponents(), "contentType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)
         * 
         */
        public StructuredExecutionReport.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The serialized value of the structured report
         * 
         * 
         */
        public StructuredExecutionReport.ProjectionMask withSerializedValue() {
            getDataMap().put("serializedValue", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)
         * 
         * 
         */
        public StructuredExecutionReport.ProjectionMask withContentType() {
            getDataMap().put("contentType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
