
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for a Data Platform
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DataPlatformKey.pdl.")
public class DataPlatformKey
    extends RecordTemplate
{

    private final static DataPlatformKey.Fields _fields = new DataPlatformKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}", SchemaFormatType.PDL));
    private String _platformNameField = null;
    private DataPlatformKey.ChangeListener __changeListener = new DataPlatformKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_PlatformName = SCHEMA.getField("platformName");

    public DataPlatformKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataPlatformKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataPlatformKey.Fields fields() {
        return _fields;
    }

    public static DataPlatformKey.ProjectionMask createMask() {
        return new DataPlatformKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public boolean hasPlatformName() {
        if (_platformNameField!= null) {
            return true;
        }
        return super._map.containsKey("platformName");
    }

    /**
     * Remover for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public void removePlatformName() {
        super._map.remove("platformName");
    }

    /**
     * Getter for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    @Nullable
    public String getPlatformName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatformName();
            case DEFAULT:
            case NULL:
                if (_platformNameField!= null) {
                    return _platformNameField;
                } else {
                    Object __rawValue = super._map.get("platformName");
                    _platformNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _platformNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for platformName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformKey.Fields#platformName
     */
    @Nonnull
    public String getPlatformName() {
        if (_platformNameField!= null) {
            return _platformNameField;
        } else {
            Object __rawValue = super._map.get("platformName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platformName");
            }
            _platformNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _platformNameField;
        }
    }

    /**
     * Setter for platformName
     * 
     * @see DataPlatformKey.Fields#platformName
     */
    public DataPlatformKey setPlatformName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatformName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platformName of com.linkedin.metadata.key.DataPlatformKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platformName", value);
                    _platformNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatformName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platformName", value);
                    _platformNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platformName", value);
                    _platformNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platformName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformKey.Fields#platformName
     */
    public DataPlatformKey setPlatformName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platformName of com.linkedin.metadata.key.DataPlatformKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platformName", value);
            _platformNameField = value;
        }
        return this;
    }

    @Override
    public DataPlatformKey clone()
        throws CloneNotSupportedException
    {
        DataPlatformKey __clone = ((DataPlatformKey) super.clone());
        __clone.__changeListener = new DataPlatformKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataPlatformKey copy()
        throws CloneNotSupportedException
    {
        DataPlatformKey __copy = ((DataPlatformKey) super.copy());
        __copy._platformNameField = null;
        __copy.__changeListener = new DataPlatformKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataPlatformKey __objectRef;

        private ChangeListener(DataPlatformKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "platformName":
                    __objectRef._platformNameField = null;
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
         * Data platform name i.e. hdfs, oracle, espresso
         * 
         */
        public PathSpec platformName() {
            return new PathSpec(getPathComponents(), "platformName");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Data platform name i.e. hdfs, oracle, espresso
         * 
         */
        public DataPlatformKey.ProjectionMask withPlatformName() {
            getDataMap().put("platformName", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
