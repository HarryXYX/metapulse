
package com.linkedin.connection;

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
 * Information about a connection to an external platform.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/connection/DataHubConnectionDetails.pdl.")
public class DataHubConnectionDetails
    extends RecordTemplate
{

    private final static DataHubConnectionDetails.Fields _fields = new DataHubConnectionDetails.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.connection/**Information about a connection to an external platform.*/@Aspect.name=\"dataHubConnectionDetails\"record DataHubConnectionDetails{/**The type of the connection. This defines the schema / encoding of the connection details.*/@Searchable={}type:enum DataHubConnectionDetailsType{/**A json-encoded set of connection details*/JSON}/**Display name of the connection*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}name:optional string/**An JSON payload containing raw connection details.\nThis will be present if the type is JSON.*/json:optional/**A set of connection details consisting of an encrypted JSON blob.*/record DataHubJsonConnection{/**The encrypted JSON connection details.*/encryptedBlob:string}}", SchemaFormatType.PDL));
    private DataHubConnectionDetailsType _typeField = null;
    private String _nameField = null;
    private DataHubJsonConnection _jsonField = null;
    private DataHubConnectionDetails.ChangeListener __changeListener = new DataHubConnectionDetails.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Json = SCHEMA.getField("json");

    public DataHubConnectionDetails() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubConnectionDetails(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubConnectionDetails.Fields fields() {
        return _fields;
    }

    public static DataHubConnectionDetails.ProjectionMask createMask() {
        return new DataHubConnectionDetails.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubConnectionDetails.Fields#type
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
     * @see DataHubConnectionDetails.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataHubConnectionDetails.Fields#type
     */
    @Nullable
    public DataHubConnectionDetailsType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubConnectionDetailsType.class, DataHubConnectionDetailsType.$UNKNOWN);
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
     * @see DataHubConnectionDetails.Fields#type
     */
    @Nonnull
    public DataHubConnectionDetailsType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubConnectionDetailsType.class, DataHubConnectionDetailsType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataHubConnectionDetails.Fields#type
     */
    public DataHubConnectionDetails setType(
        @Nullable
        DataHubConnectionDetailsType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.connection.DataHubConnectionDetails");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
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
     * @see DataHubConnectionDetails.Fields#type
     */
    public DataHubConnectionDetails setType(
        @Nonnull
        DataHubConnectionDetailsType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.connection.DataHubConnectionDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataHubConnectionDetails.Fields#name
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
     * @see DataHubConnectionDetails.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see DataHubConnectionDetails.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        return getName();
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubConnectionDetails.Fields#name
     */
    @Nullable
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see DataHubConnectionDetails.Fields#name
     */
    public DataHubConnectionDetails setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see DataHubConnectionDetails.Fields#name
     */
    public DataHubConnectionDetails setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.connection.DataHubConnectionDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for json
     * 
     * @see DataHubConnectionDetails.Fields#json
     */
    public boolean hasJson() {
        if (_jsonField!= null) {
            return true;
        }
        return super._map.containsKey("json");
    }

    /**
     * Remover for json
     * 
     * @see DataHubConnectionDetails.Fields#json
     */
    public void removeJson() {
        super._map.remove("json");
    }

    /**
     * Getter for json
     * 
     * @see DataHubConnectionDetails.Fields#json
     */
    @Nullable
    public DataHubJsonConnection getJson(GetMode mode) {
        return getJson();
    }

    /**
     * Getter for json
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubConnectionDetails.Fields#json
     */
    @Nullable
    public DataHubJsonConnection getJson() {
        if (_jsonField!= null) {
            return _jsonField;
        } else {
            Object __rawValue = super._map.get("json");
            _jsonField = ((__rawValue == null)?null:new DataHubJsonConnection(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _jsonField;
        }
    }

    /**
     * Setter for json
     * 
     * @see DataHubConnectionDetails.Fields#json
     */
    public DataHubConnectionDetails setJson(
        @Nullable
        DataHubJsonConnection value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJson(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJson();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "json", value.data());
                    _jsonField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "json", value.data());
                    _jsonField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for json
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubConnectionDetails.Fields#json
     */
    public DataHubConnectionDetails setJson(
        @Nonnull
        DataHubJsonConnection value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field json of com.linkedin.connection.DataHubConnectionDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "json", value.data());
            _jsonField = value;
        }
        return this;
    }

    @Override
    public DataHubConnectionDetails clone()
        throws CloneNotSupportedException
    {
        DataHubConnectionDetails __clone = ((DataHubConnectionDetails) super.clone());
        __clone.__changeListener = new DataHubConnectionDetails.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubConnectionDetails copy()
        throws CloneNotSupportedException
    {
        DataHubConnectionDetails __copy = ((DataHubConnectionDetails) super.copy());
        __copy._nameField = null;
        __copy._jsonField = null;
        __copy._typeField = null;
        __copy.__changeListener = new DataHubConnectionDetails.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubConnectionDetails __objectRef;

        private ChangeListener(DataHubConnectionDetails reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "json":
                    __objectRef._jsonField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * The type of the connection. This defines the schema / encoding of the connection details.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Display name of the connection
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * An JSON payload containing raw connection details.
         * This will be present if the type is JSON.
         * 
         */
        public com.linkedin.connection.DataHubJsonConnection.Fields json() {
            return new com.linkedin.connection.DataHubJsonConnection.Fields(getPathComponents(), "json");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.connection.DataHubJsonConnection.ProjectionMask _jsonMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The type of the connection. This defines the schema / encoding of the connection details.
         * 
         */
        public DataHubConnectionDetails.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Display name of the connection
         * 
         */
        public DataHubConnectionDetails.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An JSON payload containing raw connection details.
         * This will be present if the type is JSON.
         * 
         */
        public DataHubConnectionDetails.ProjectionMask withJson(Function<com.linkedin.connection.DataHubJsonConnection.ProjectionMask, com.linkedin.connection.DataHubJsonConnection.ProjectionMask> nestedMask) {
            _jsonMask = nestedMask.apply(((_jsonMask == null)?DataHubJsonConnection.createMask():_jsonMask));
            getDataMap().put("json", _jsonMask.getDataMap());
            return this;
        }

        /**
         * An JSON payload containing raw connection details.
         * This will be present if the type is JSON.
         * 
         */
        public DataHubConnectionDetails.ProjectionMask withJson() {
            _jsonMask = null;
            getDataMap().put("json", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
