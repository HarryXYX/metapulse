
package com.linkedin.common;

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
 * The specific instance of the data platform that this entity belongs to
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/DataPlatformInstance.pdl.")
public class DataPlatformInstance
    extends RecordTemplate
{

    private final static DataPlatformInstance.Fields _fields = new DataPlatformInstance.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**The specific instance of the data platform that this entity belongs to*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"addToFilters\":true,\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform\"}platform:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Instance of the data platform (e.g. db instance)*/@Searchable={\"addToFilters\":true,\"fieldName\":\"platformInstance\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Platform Instance\"}instance:optional Urn}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _platformField = null;
    private com.linkedin.common.urn.Urn _instanceField = null;
    private DataPlatformInstance.ChangeListener __changeListener = new DataPlatformInstance.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Instance = SCHEMA.getField("instance");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataPlatformInstance() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataPlatformInstance(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataPlatformInstance.Fields fields() {
        return _fields;
    }

    public static DataPlatformInstance.ProjectionMask createMask() {
        return new DataPlatformInstance.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for platform
     * 
     * @see DataPlatformInstance.Fields#platform
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
     * @see DataPlatformInstance.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see DataPlatformInstance.Fields#platform
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
     * @see DataPlatformInstance.Fields#platform
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
     * @see DataPlatformInstance.Fields#platform
     */
    public DataPlatformInstance setPlatform(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platform of com.linkedin.common.DataPlatformInstance");
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
     * @see DataPlatformInstance.Fields#platform
     */
    public DataPlatformInstance setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.common.DataPlatformInstance to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for instance
     * 
     * @see DataPlatformInstance.Fields#instance
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
     * @see DataPlatformInstance.Fields#instance
     */
    public void removeInstance() {
        super._map.remove("instance");
    }

    /**
     * Getter for instance
     * 
     * @see DataPlatformInstance.Fields#instance
     */
    @Nullable
    public com.linkedin.common.urn.Urn getInstance(GetMode mode) {
        return getInstance();
    }

    /**
     * Getter for instance
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataPlatformInstance.Fields#instance
     */
    @Nullable
    public com.linkedin.common.urn.Urn getInstance() {
        if (_instanceField!= null) {
            return _instanceField;
        } else {
            Object __rawValue = super._map.get("instance");
            _instanceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _instanceField;
        }
    }

    /**
     * Setter for instance
     * 
     * @see DataPlatformInstance.Fields#instance
     */
    public DataPlatformInstance setInstance(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInstance(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInstance();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "instance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _instanceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "instance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
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
     * @see DataPlatformInstance.Fields#instance
     */
    public DataPlatformInstance setInstance(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field instance of com.linkedin.common.DataPlatformInstance to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "instance", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _instanceField = value;
        }
        return this;
    }

    @Override
    public DataPlatformInstance clone()
        throws CloneNotSupportedException
    {
        DataPlatformInstance __clone = ((DataPlatformInstance) super.clone());
        __clone.__changeListener = new DataPlatformInstance.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataPlatformInstance copy()
        throws CloneNotSupportedException
    {
        DataPlatformInstance __copy = ((DataPlatformInstance) super.copy());
        __copy._instanceField = null;
        __copy._platformField = null;
        __copy.__changeListener = new DataPlatformInstance.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataPlatformInstance __objectRef;

        private ChangeListener(DataPlatformInstance reference) {
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
         * Data Platform
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Instance of the data platform (e.g. db instance)
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
         * Data Platform
         * 
         */
        public DataPlatformInstance.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Instance of the data platform (e.g. db instance)
         * 
         */
        public DataPlatformInstance.ProjectionMask withInstance() {
            getDataMap().put("instance", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
