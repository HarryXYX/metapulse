
package com.linkedin.datajob.datahub;

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
 * The checkpoint state object of a datahub ingestion run for a given job.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datajob/datahub/IngestionCheckpointState.pdl.")
public class IngestionCheckpointState
    extends RecordTemplate
{

    private final static IngestionCheckpointState.Fields _fields = new IngestionCheckpointState.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob.datahub/**The checkpoint state object of a datahub ingestion run for a given job.*/record IngestionCheckpointState{/**The version of the state format.*/formatVersion:string/**The serialization/deserialization protocol.*/serde:string/**Opaque blob of the state representation.*/payload:optional bytes}", SchemaFormatType.PDL));
    private String _formatVersionField = null;
    private String _serdeField = null;
    private ByteString _payloadField = null;
    private IngestionCheckpointState.ChangeListener __changeListener = new IngestionCheckpointState.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FormatVersion = SCHEMA.getField("formatVersion");
    private final static RecordDataSchema.Field FIELD_Serde = SCHEMA.getField("serde");
    private final static RecordDataSchema.Field FIELD_Payload = SCHEMA.getField("payload");

    public IngestionCheckpointState() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IngestionCheckpointState(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IngestionCheckpointState.Fields fields() {
        return _fields;
    }

    public static IngestionCheckpointState.ProjectionMask createMask() {
        return new IngestionCheckpointState.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for formatVersion
     * 
     * @see IngestionCheckpointState.Fields#formatVersion
     */
    public boolean hasFormatVersion() {
        if (_formatVersionField!= null) {
            return true;
        }
        return super._map.containsKey("formatVersion");
    }

    /**
     * Remover for formatVersion
     * 
     * @see IngestionCheckpointState.Fields#formatVersion
     */
    public void removeFormatVersion() {
        super._map.remove("formatVersion");
    }

    /**
     * Getter for formatVersion
     * 
     * @see IngestionCheckpointState.Fields#formatVersion
     */
    @Nullable
    public String getFormatVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFormatVersion();
            case DEFAULT:
            case NULL:
                if (_formatVersionField!= null) {
                    return _formatVersionField;
                } else {
                    Object __rawValue = super._map.get("formatVersion");
                    _formatVersionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _formatVersionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for formatVersion
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionCheckpointState.Fields#formatVersion
     */
    @Nonnull
    public String getFormatVersion() {
        if (_formatVersionField!= null) {
            return _formatVersionField;
        } else {
            Object __rawValue = super._map.get("formatVersion");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("formatVersion");
            }
            _formatVersionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _formatVersionField;
        }
    }

    /**
     * Setter for formatVersion
     * 
     * @see IngestionCheckpointState.Fields#formatVersion
     */
    public IngestionCheckpointState setFormatVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFormatVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field formatVersion of com.linkedin.datajob.datahub.IngestionCheckpointState");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "formatVersion", value);
                    _formatVersionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFormatVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "formatVersion", value);
                    _formatVersionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "formatVersion", value);
                    _formatVersionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for formatVersion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionCheckpointState.Fields#formatVersion
     */
    public IngestionCheckpointState setFormatVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field formatVersion of com.linkedin.datajob.datahub.IngestionCheckpointState to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "formatVersion", value);
            _formatVersionField = value;
        }
        return this;
    }

    /**
     * Existence checker for serde
     * 
     * @see IngestionCheckpointState.Fields#serde
     */
    public boolean hasSerde() {
        if (_serdeField!= null) {
            return true;
        }
        return super._map.containsKey("serde");
    }

    /**
     * Remover for serde
     * 
     * @see IngestionCheckpointState.Fields#serde
     */
    public void removeSerde() {
        super._map.remove("serde");
    }

    /**
     * Getter for serde
     * 
     * @see IngestionCheckpointState.Fields#serde
     */
    @Nullable
    public String getSerde(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSerde();
            case DEFAULT:
            case NULL:
                if (_serdeField!= null) {
                    return _serdeField;
                } else {
                    Object __rawValue = super._map.get("serde");
                    _serdeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _serdeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for serde
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionCheckpointState.Fields#serde
     */
    @Nonnull
    public String getSerde() {
        if (_serdeField!= null) {
            return _serdeField;
        } else {
            Object __rawValue = super._map.get("serde");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("serde");
            }
            _serdeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _serdeField;
        }
    }

    /**
     * Setter for serde
     * 
     * @see IngestionCheckpointState.Fields#serde
     */
    public IngestionCheckpointState setSerde(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSerde(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field serde of com.linkedin.datajob.datahub.IngestionCheckpointState");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "serde", value);
                    _serdeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSerde();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "serde", value);
                    _serdeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "serde", value);
                    _serdeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for serde
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionCheckpointState.Fields#serde
     */
    public IngestionCheckpointState setSerde(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field serde of com.linkedin.datajob.datahub.IngestionCheckpointState to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "serde", value);
            _serdeField = value;
        }
        return this;
    }

    /**
     * Existence checker for payload
     * 
     * @see IngestionCheckpointState.Fields#payload
     */
    public boolean hasPayload() {
        if (_payloadField!= null) {
            return true;
        }
        return super._map.containsKey("payload");
    }

    /**
     * Remover for payload
     * 
     * @see IngestionCheckpointState.Fields#payload
     */
    public void removePayload() {
        super._map.remove("payload");
    }

    /**
     * Getter for payload
     * 
     * @see IngestionCheckpointState.Fields#payload
     */
    @Nullable
    public ByteString getPayload(GetMode mode) {
        return getPayload();
    }

    /**
     * Getter for payload
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IngestionCheckpointState.Fields#payload
     */
    @Nullable
    public ByteString getPayload() {
        if (_payloadField!= null) {
            return _payloadField;
        } else {
            Object __rawValue = super._map.get("payload");
            _payloadField = DataTemplateUtil.coerceBytesOutput(__rawValue);
            return _payloadField;
        }
    }

    /**
     * Setter for payload
     * 
     * @see IngestionCheckpointState.Fields#payload
     */
    public IngestionCheckpointState setPayload(
        @Nullable
        ByteString value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPayload(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePayload();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "payload", value);
                    _payloadField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "payload", value);
                    _payloadField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for payload
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionCheckpointState.Fields#payload
     */
    public IngestionCheckpointState setPayload(
        @Nonnull
        ByteString value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field payload of com.linkedin.datajob.datahub.IngestionCheckpointState to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "payload", value);
            _payloadField = value;
        }
        return this;
    }

    @Override
    public IngestionCheckpointState clone()
        throws CloneNotSupportedException
    {
        IngestionCheckpointState __clone = ((IngestionCheckpointState) super.clone());
        __clone.__changeListener = new IngestionCheckpointState.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IngestionCheckpointState copy()
        throws CloneNotSupportedException
    {
        IngestionCheckpointState __copy = ((IngestionCheckpointState) super.copy());
        __copy._serdeField = null;
        __copy._payloadField = null;
        __copy._formatVersionField = null;
        __copy.__changeListener = new IngestionCheckpointState.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IngestionCheckpointState __objectRef;

        private ChangeListener(IngestionCheckpointState reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "serde":
                    __objectRef._serdeField = null;
                    break;
                case "payload":
                    __objectRef._payloadField = null;
                    break;
                case "formatVersion":
                    __objectRef._formatVersionField = null;
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
         * The version of the state format.
         * 
         */
        public PathSpec formatVersion() {
            return new PathSpec(getPathComponents(), "formatVersion");
        }

        /**
         * The serialization/deserialization protocol.
         * 
         */
        public PathSpec serde() {
            return new PathSpec(getPathComponents(), "serde");
        }

        /**
         * Opaque blob of the state representation.
         * 
         */
        public PathSpec payload() {
            return new PathSpec(getPathComponents(), "payload");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * The version of the state format.
         * 
         */
        public IngestionCheckpointState.ProjectionMask withFormatVersion() {
            getDataMap().put("formatVersion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The serialization/deserialization protocol.
         * 
         */
        public IngestionCheckpointState.ProjectionMask withSerde() {
            getDataMap().put("serde", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Opaque blob of the state representation.
         * 
         */
        public IngestionCheckpointState.ProjectionMask withPayload() {
            getDataMap().put("payload", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
