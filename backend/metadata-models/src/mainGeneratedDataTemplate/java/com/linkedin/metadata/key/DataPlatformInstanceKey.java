
package com.linkedin.metadata.key;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for a Dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DataPlatformInstanceKey.pdl.")
public class DataPlatformInstanceKey
    extends RecordTemplate
{

    private final static DataPlatformInstanceKey.Fields _fields = new DataPlatformInstanceKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Dataset*/@Aspect.name=\"dataPlatformInstanceKey\"record DataPlatformInstanceKey{/**Data platform urn associated with the instance*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique instance id*/instance:string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _platformField = null;
    private String _instanceField = null;
    private DataPlatformInstanceKey.ChangeListener __changeListener = new DataPlatformInstanceKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Instance = SCHEMA.getField("instance");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataPlatformInstanceKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataPlatformInstanceKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataPlatformInstanceKey.Fields fields() {
        return _fields;
    }

    public static DataPlatformInstanceKey.ProjectionMask createMask() {
        return new DataPlatformInstanceKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for platform
     * 
     * @see DataPlatformInstanceKey.Fields#platform
     */
    public boolean hasPlatform() {
        if (_platformField!= null) {
            return true;
        }
        return super._map.containsKey("platform");
    }

    /**
     * Remover for platform
     * 
     * @see DataPlatformInstanceKey.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see DataPlatformInstanceKey.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatform();
            case DEFAULT:
            case NULL:
                if (_platformField!= null) {
                    return _platformField;
                } else {
                    Object __rawValue = super._map.get("platform");
                    _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _platformField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInstanceKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPlatform() {
        if (_platformField!= null) {
            return _platformField;
        } else {
            Object __rawValue = super._map.get("platform");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platform");
            }
            _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _platformField;
        }
    }

    /**
     * Setter for platform
     * 
     * @see DataPlatformInstanceKey.Fields#platform
     */
    public DataPlatformInstanceKey setPlatform(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platform of com.linkedin.metadata.key.DataPlatformInstanceKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInstanceKey.Fields#platform
     */
    public DataPlatformInstanceKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.metadata.key.DataPlatformInstanceKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for instance
     * 
     * @see DataPlatformInstanceKey.Fields#instance
     */
    public boolean hasInstance() {
        if (_instanceField!= null) {
            return true;
        }
        return super._map.containsKey("instance");
    }

    /**
     * Remover for instance
     * 
     * @see DataPlatformInstanceKey.Fields#instance
     */
    public void removeInstance() {
        super._map.remove("instance");
    }

    /**
     * Getter for instance
     * 
     * @see DataPlatformInstanceKey.Fields#instance
     */
    @Nullable
    public String getInstance(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getInstance();
            case DEFAULT:
            case NULL:
                if (_instanceField!= null) {
                    return _instanceField;
                } else {
                    Object __rawValue = super._map.get("instance");
                    _instanceField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _instanceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for instance
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInstanceKey.Fields#instance
     */
    @Nonnull
    public String getInstance() {
        if (_instanceField!= null) {
            return _instanceField;
        } else {
            Object __rawValue = super._map.get("instance");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("instance");
            }
            _instanceField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _instanceField;
        }
    }

    /**
     * Setter for instance
     * 
     * @see DataPlatformInstanceKey.Fields#instance
     */
    public DataPlatformInstanceKey setInstance(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInstance(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field instance of com.linkedin.metadata.key.DataPlatformInstanceKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "instance", value);
                    _instanceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInstance();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "instance", value);
                    _instanceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "instance", value);
                    _instanceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for instance
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInstanceKey.Fields#instance
     */
    public DataPlatformInstanceKey setInstance(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field instance of com.linkedin.metadata.key.DataPlatformInstanceKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "instance", value);
            _instanceField = value;
        }
        return this;
    }

    @Override
    public DataPlatformInstanceKey clone()
        throws CloneNotSupportedException
    {
        DataPlatformInstanceKey __clone = ((DataPlatformInstanceKey) super.clone());
        __clone.__changeListener = new DataPlatformInstanceKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataPlatformInstanceKey copy()
        throws CloneNotSupportedException
    {
        DataPlatformInstanceKey __copy = ((DataPlatformInstanceKey) super.copy());
        __copy._instanceField = null;
        __copy._platformField = null;
        __copy.__changeListener = new DataPlatformInstanceKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataPlatformInstanceKey __objectRef;

        private ChangeListener(DataPlatformInstanceKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "instance":
                    __objectRef._instanceField = null;
                    break;
                case "platform":
                    __objectRef._platformField = null;
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
         * Data platform urn associated with the instance
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Unique instance id
         * 
         */
        public PathSpec instance() {
            return new PathSpec(getPathComponents(), "instance");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Data platform urn associated with the instance
         * 
         */
        public DataPlatformInstanceKey.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique instance id
         * 
         */
        public DataPlatformInstanceKey.ProjectionMask withInstance() {
            getDataMap().put("instance", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
