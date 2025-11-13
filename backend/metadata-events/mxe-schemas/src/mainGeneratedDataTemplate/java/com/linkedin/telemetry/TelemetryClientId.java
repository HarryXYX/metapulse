
package com.linkedin.telemetry;

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
 * A simple wrapper around a String to persist the client ID for telemetry in DataHub's backend DB
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/telemetry/TelemetryClientId.pdl.")
public class TelemetryClientId
    extends RecordTemplate
{

    private final static TelemetryClientId.Fields _fields = new TelemetryClientId.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.telemetry/**A simple wrapper around a String to persist the client ID for telemetry in DataHub's backend DB*/@Aspect.name=\"telemetryClientId\"record TelemetryClientId{/**A string representing the telemetry client ID*/clientId:string}", SchemaFormatType.PDL));
    private String _clientIdField = null;
    private TelemetryClientId.ChangeListener __changeListener = new TelemetryClientId.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ClientId = SCHEMA.getField("clientId");

    public TelemetryClientId() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TelemetryClientId(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TelemetryClientId.Fields fields() {
        return _fields;
    }

    public static TelemetryClientId.ProjectionMask createMask() {
        return new TelemetryClientId.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for clientId
     * 
     * @see TelemetryClientId.Fields#clientId
     */
    public boolean hasClientId() {
        if (_clientIdField!= null) {
            return true;
        }
        return super._map.containsKey("clientId");
    }

    /**
     * Remover for clientId
     * 
     * @see TelemetryClientId.Fields#clientId
     */
    public void removeClientId() {
        super._map.remove("clientId");
    }

    /**
     * Getter for clientId
     * 
     * @see TelemetryClientId.Fields#clientId
     */
    @Nullable
    public String getClientId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getClientId();
            case DEFAULT:
            case NULL:
                if (_clientIdField!= null) {
                    return _clientIdField;
                } else {
                    Object __rawValue = super._map.get("clientId");
                    _clientIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _clientIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for clientId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TelemetryClientId.Fields#clientId
     */
    @Nonnull
    public String getClientId() {
        if (_clientIdField!= null) {
            return _clientIdField;
        } else {
            Object __rawValue = super._map.get("clientId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("clientId");
            }
            _clientIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clientIdField;
        }
    }

    /**
     * Setter for clientId
     * 
     * @see TelemetryClientId.Fields#clientId
     */
    public TelemetryClientId setClientId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setClientId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field clientId of com.linkedin.telemetry.TelemetryClientId");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", value);
                    _clientIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeClientId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", value);
                    _clientIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "clientId", value);
                    _clientIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for clientId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TelemetryClientId.Fields#clientId
     */
    public TelemetryClientId setClientId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field clientId of com.linkedin.telemetry.TelemetryClientId to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "clientId", value);
            _clientIdField = value;
        }
        return this;
    }

    @Override
    public TelemetryClientId clone()
        throws CloneNotSupportedException
    {
        TelemetryClientId __clone = ((TelemetryClientId) super.clone());
        __clone.__changeListener = new TelemetryClientId.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TelemetryClientId copy()
        throws CloneNotSupportedException
    {
        TelemetryClientId __copy = ((TelemetryClientId) super.copy());
        __copy._clientIdField = null;
        __copy.__changeListener = new TelemetryClientId.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TelemetryClientId __objectRef;

        private ChangeListener(TelemetryClientId reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "clientId":
                    __objectRef._clientIdField = null;
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
         * A string representing the telemetry client ID
         * 
         */
        public PathSpec clientId() {
            return new PathSpec(getPathComponents(), "clientId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * A string representing the telemetry client ID
         * 
         */
        public TelemetryClientId.ProjectionMask withClientId() {
            getDataMap().put("clientId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
