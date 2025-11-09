
package com.linkedin.connection;

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
 * A set of connection details consisting of an encrypted JSON blob.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/connection/DataHubJsonConnection.pdl.")
public class DataHubJsonConnection
    extends RecordTemplate
{

    private final static DataHubJsonConnection.Fields _fields = new DataHubJsonConnection.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.connection/**A set of connection details consisting of an encrypted JSON blob.*/record DataHubJsonConnection{/**The encrypted JSON connection details.*/encryptedBlob:string}", SchemaFormatType.PDL));
    private String _encryptedBlobField = null;
    private DataHubJsonConnection.ChangeListener __changeListener = new DataHubJsonConnection.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EncryptedBlob = SCHEMA.getField("encryptedBlob");

    public DataHubJsonConnection() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubJsonConnection(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubJsonConnection.Fields fields() {
        return _fields;
    }

    public static DataHubJsonConnection.ProjectionMask createMask() {
        return new DataHubJsonConnection.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for encryptedBlob
     * 
     * @see DataHubJsonConnection.Fields#encryptedBlob
     */
    public boolean hasEncryptedBlob() {
        if (_encryptedBlobField!= null) {
            return true;
        }
        return super._map.containsKey("encryptedBlob");
    }

    /**
     * Remover for encryptedBlob
     * 
     * @see DataHubJsonConnection.Fields#encryptedBlob
     */
    public void removeEncryptedBlob() {
        super._map.remove("encryptedBlob");
    }

    /**
     * Getter for encryptedBlob
     * 
     * @see DataHubJsonConnection.Fields#encryptedBlob
     */
    @Nullable
    public String getEncryptedBlob(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEncryptedBlob();
            case DEFAULT:
            case NULL:
                if (_encryptedBlobField!= null) {
                    return _encryptedBlobField;
                } else {
                    Object __rawValue = super._map.get("encryptedBlob");
                    _encryptedBlobField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _encryptedBlobField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for encryptedBlob
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubJsonConnection.Fields#encryptedBlob
     */
    @Nonnull
    public String getEncryptedBlob() {
        if (_encryptedBlobField!= null) {
            return _encryptedBlobField;
        } else {
            Object __rawValue = super._map.get("encryptedBlob");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("encryptedBlob");
            }
            _encryptedBlobField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _encryptedBlobField;
        }
    }

    /**
     * Setter for encryptedBlob
     * 
     * @see DataHubJsonConnection.Fields#encryptedBlob
     */
    public DataHubJsonConnection setEncryptedBlob(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEncryptedBlob(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field encryptedBlob of com.linkedin.connection.DataHubJsonConnection");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "encryptedBlob", value);
                    _encryptedBlobField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEncryptedBlob();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "encryptedBlob", value);
                    _encryptedBlobField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "encryptedBlob", value);
                    _encryptedBlobField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for encryptedBlob
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubJsonConnection.Fields#encryptedBlob
     */
    public DataHubJsonConnection setEncryptedBlob(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field encryptedBlob of com.linkedin.connection.DataHubJsonConnection to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "encryptedBlob", value);
            _encryptedBlobField = value;
        }
        return this;
    }

    @Override
    public DataHubJsonConnection clone()
        throws CloneNotSupportedException
    {
        DataHubJsonConnection __clone = ((DataHubJsonConnection) super.clone());
        __clone.__changeListener = new DataHubJsonConnection.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubJsonConnection copy()
        throws CloneNotSupportedException
    {
        DataHubJsonConnection __copy = ((DataHubJsonConnection) super.copy());
        __copy._encryptedBlobField = null;
        __copy.__changeListener = new DataHubJsonConnection.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubJsonConnection __objectRef;

        private ChangeListener(DataHubJsonConnection reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "encryptedBlob":
                    __objectRef._encryptedBlobField = null;
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
         * The encrypted JSON connection details.
         * 
         */
        public PathSpec encryptedBlob() {
            return new PathSpec(getPathComponents(), "encryptedBlob");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The encrypted JSON connection details.
         * 
         */
        public DataHubJsonConnection.ProjectionMask withEncryptedBlob() {
            getDataMap().put("encryptedBlob", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
