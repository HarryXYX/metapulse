
package com.linkedin.mxe;

import java.util.List;
import java.util.function.Function;
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
 * A DataHub Platform Event.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/mxe/PlatformEvent.pdl.")
public class PlatformEvent
    extends RecordTemplate
{

    private final static PlatformEvent.Fields _fields = new PlatformEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**A DataHub Platform Event.*/record PlatformEvent{/**Header information stored with the event.*/header:/**A header included with each DataHub platform event.*/record PlatformEventHeader{/**The event timestamp field as epoch at UTC in milli seconds.*/timestampMillis:long}/**The name of the event, e.g. the type of event. For example, 'notificationRequestEvent', 'entityChangeEvent'*/name:string/**The event payload.*/payload:/**Generic payload record structure for serializing a Platform Event.\n*/record GenericPayload{/**The value of the event, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the event was serialized.\nThe only type currently supported is application/json.*/contentType:string}}", SchemaFormatType.PDL));
    private PlatformEventHeader _headerField = null;
    private String _nameField = null;
    private GenericPayload _payloadField = null;
    private PlatformEvent.ChangeListener __changeListener = new PlatformEvent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Header = SCHEMA.getField("header");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Payload = SCHEMA.getField("payload");

    public PlatformEvent() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public PlatformEvent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PlatformEvent.Fields fields() {
        return _fields;
    }

    public static PlatformEvent.ProjectionMask createMask() {
        return new PlatformEvent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for header
     * 
     * @see PlatformEvent.Fields#header
     */
    public boolean hasHeader() {
        if (_headerField!= null) {
            return true;
        }
        return super._map.containsKey("header");
    }

    /**
     * Remover for header
     * 
     * @see PlatformEvent.Fields#header
     */
    public void removeHeader() {
        super._map.remove("header");
    }

    /**
     * Getter for header
     * 
     * @see PlatformEvent.Fields#header
     */
    @Nullable
    public PlatformEventHeader getHeader(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getHeader();
            case DEFAULT:
            case NULL:
                if (_headerField!= null) {
                    return _headerField;
                } else {
                    Object __rawValue = super._map.get("header");
                    _headerField = ((__rawValue == null)?null:new PlatformEventHeader(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _headerField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for header
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PlatformEvent.Fields#header
     */
    @Nonnull
    public PlatformEventHeader getHeader() {
        if (_headerField!= null) {
            return _headerField;
        } else {
            Object __rawValue = super._map.get("header");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("header");
            }
            _headerField = ((__rawValue == null)?null:new PlatformEventHeader(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _headerField;
        }
    }

    /**
     * Setter for header
     * 
     * @see PlatformEvent.Fields#header
     */
    public PlatformEvent setHeader(
        @Nullable
        PlatformEventHeader value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHeader(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field header of com.linkedin.mxe.PlatformEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "header", value.data());
                    _headerField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHeader();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "header", value.data());
                    _headerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "header", value.data());
                    _headerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for header
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PlatformEvent.Fields#header
     */
    public PlatformEvent setHeader(
        @Nonnull
        PlatformEventHeader value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field header of com.linkedin.mxe.PlatformEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "header", value.data());
            _headerField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see PlatformEvent.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see PlatformEvent.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see PlatformEvent.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PlatformEvent.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see PlatformEvent.Fields#name
     */
    public PlatformEvent setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.mxe.PlatformEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PlatformEvent.Fields#name
     */
    public PlatformEvent setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.mxe.PlatformEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for payload
     * 
     * @see PlatformEvent.Fields#payload
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
     * @see PlatformEvent.Fields#payload
     */
    public void removePayload() {
        super._map.remove("payload");
    }

    /**
     * Getter for payload
     * 
     * @see PlatformEvent.Fields#payload
     */
    @Nullable
    public GenericPayload getPayload(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPayload();
            case DEFAULT:
            case NULL:
                if (_payloadField!= null) {
                    return _payloadField;
                } else {
                    Object __rawValue = super._map.get("payload");
                    _payloadField = ((__rawValue == null)?null:new GenericPayload(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _payloadField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for payload
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PlatformEvent.Fields#payload
     */
    @Nonnull
    public GenericPayload getPayload() {
        if (_payloadField!= null) {
            return _payloadField;
        } else {
            Object __rawValue = super._map.get("payload");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("payload");
            }
            _payloadField = ((__rawValue == null)?null:new GenericPayload(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _payloadField;
        }
    }

    /**
     * Setter for payload
     * 
     * @see PlatformEvent.Fields#payload
     */
    public PlatformEvent setPayload(
        @Nullable
        GenericPayload value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPayload(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field payload of com.linkedin.mxe.PlatformEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "payload", value.data());
                    _payloadField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePayload();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "payload", value.data());
                    _payloadField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "payload", value.data());
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
     * @see PlatformEvent.Fields#payload
     */
    public PlatformEvent setPayload(
        @Nonnull
        GenericPayload value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field payload of com.linkedin.mxe.PlatformEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "payload", value.data());
            _payloadField = value;
        }
        return this;
    }

    @Override
    public PlatformEvent clone()
        throws CloneNotSupportedException
    {
        PlatformEvent __clone = ((PlatformEvent) super.clone());
        __clone.__changeListener = new PlatformEvent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PlatformEvent copy()
        throws CloneNotSupportedException
    {
        PlatformEvent __copy = ((PlatformEvent) super.copy());
        __copy._payloadField = null;
        __copy._nameField = null;
        __copy._headerField = null;
        __copy.__changeListener = new PlatformEvent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PlatformEvent __objectRef;

        private ChangeListener(PlatformEvent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "payload":
                    __objectRef._payloadField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "header":
                    __objectRef._headerField = null;
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
         * Header information stored with the event.
         * 
         */
        public com.linkedin.mxe.PlatformEventHeader.Fields header() {
            return new com.linkedin.mxe.PlatformEventHeader.Fields(getPathComponents(), "header");
        }

        /**
         * The name of the event, e.g. the type of event. For example, 'notificationRequestEvent', 'entityChangeEvent'
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The event payload.
         * 
         */
        public com.linkedin.mxe.GenericPayload.Fields payload() {
            return new com.linkedin.mxe.GenericPayload.Fields(getPathComponents(), "payload");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.mxe.PlatformEventHeader.ProjectionMask _headerMask;
        private com.linkedin.mxe.GenericPayload.ProjectionMask _payloadMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Header information stored with the event.
         * 
         */
        public PlatformEvent.ProjectionMask withHeader(Function<com.linkedin.mxe.PlatformEventHeader.ProjectionMask, com.linkedin.mxe.PlatformEventHeader.ProjectionMask> nestedMask) {
            _headerMask = nestedMask.apply(((_headerMask == null)?PlatformEventHeader.createMask():_headerMask));
            getDataMap().put("header", _headerMask.getDataMap());
            return this;
        }

        /**
         * Header information stored with the event.
         * 
         */
        public PlatformEvent.ProjectionMask withHeader() {
            _headerMask = null;
            getDataMap().put("header", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The name of the event, e.g. the type of event. For example, 'notificationRequestEvent', 'entityChangeEvent'
         * 
         */
        public PlatformEvent.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The event payload.
         * 
         */
        public PlatformEvent.ProjectionMask withPayload(Function<com.linkedin.mxe.GenericPayload.ProjectionMask, com.linkedin.mxe.GenericPayload.ProjectionMask> nestedMask) {
            _payloadMask = nestedMask.apply(((_payloadMask == null)?GenericPayload.createMask():_payloadMask));
            getDataMap().put("payload", _payloadMask.getDataMap());
            return this;
        }

        /**
         * The event payload.
         * 
         */
        public PlatformEvent.ProjectionMask withPayload() {
            _payloadMask = null;
            getDataMap().put("payload", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
