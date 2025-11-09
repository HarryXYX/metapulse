
package com.linkedin.upgrade;

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
 * Information collected when kicking off a DataHubUpgrade
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/upgrade/DataHubUpgradeRequest.pdl.")
public class DataHubUpgradeRequest
    extends RecordTemplate
{

    private final static DataHubUpgradeRequest.Fields _fields = new DataHubUpgradeRequest.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.upgrade/**Information collected when kicking off a DataHubUpgrade*/@Aspect.name=\"dataHubUpgradeRequest\"record DataHubUpgradeRequest{/**Timestamp when we started this DataHubUpgrade*/timestampMs:long/**Version of this upgrade*/version:string}", SchemaFormatType.PDL));
    private Long _timestampMsField = null;
    private String _versionField = null;
    private DataHubUpgradeRequest.ChangeListener __changeListener = new DataHubUpgradeRequest.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TimestampMs = SCHEMA.getField("timestampMs");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");

    public DataHubUpgradeRequest() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubUpgradeRequest(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubUpgradeRequest.Fields fields() {
        return _fields;
    }

    public static DataHubUpgradeRequest.ProjectionMask createMask() {
        return new DataHubUpgradeRequest.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for timestampMs
     * 
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    public boolean hasTimestampMs() {
        if (_timestampMsField!= null) {
            return true;
        }
        return super._map.containsKey("timestampMs");
    }

    /**
     * Remover for timestampMs
     * 
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    public void removeTimestampMs() {
        super._map.remove("timestampMs");
    }

    /**
     * Getter for timestampMs
     * 
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    @Nullable
    public Long getTimestampMs(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTimestampMs();
            case DEFAULT:
            case NULL:
                if (_timestampMsField!= null) {
                    return _timestampMsField;
                } else {
                    Object __rawValue = super._map.get("timestampMs");
                    _timestampMsField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timestampMsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for timestampMs
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    @Nonnull
    public Long getTimestampMs() {
        if (_timestampMsField!= null) {
            return _timestampMsField;
        } else {
            Object __rawValue = super._map.get("timestampMs");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("timestampMs");
            }
            _timestampMsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timestampMsField;
        }
    }

    /**
     * Setter for timestampMs
     * 
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    public DataHubUpgradeRequest setTimestampMs(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestampMs(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timestampMs of com.linkedin.upgrade.DataHubUpgradeRequest");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
                    _timestampMsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimestampMs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
                    _timestampMsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
                    _timestampMsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timestampMs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    public DataHubUpgradeRequest setTimestampMs(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestampMs of com.linkedin.upgrade.DataHubUpgradeRequest to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
            _timestampMsField = value;
        }
        return this;
    }

    /**
     * Setter for timestampMs
     * 
     * @see DataHubUpgradeRequest.Fields#timestampMs
     */
    public DataHubUpgradeRequest setTimestampMs(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
        _timestampMsField = value;
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see DataHubUpgradeRequest.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see DataHubUpgradeRequest.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see DataHubUpgradeRequest.Fields#version
     */
    @Nullable
    public String getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _versionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubUpgradeRequest.Fields#version
     */
    @Nonnull
    public String getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see DataHubUpgradeRequest.Fields#version
     */
    public DataHubUpgradeRequest setVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.upgrade.DataHubUpgradeRequest");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubUpgradeRequest.Fields#version
     */
    public DataHubUpgradeRequest setVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.upgrade.DataHubUpgradeRequest to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value);
            _versionField = value;
        }
        return this;
    }

    @Override
    public DataHubUpgradeRequest clone()
        throws CloneNotSupportedException
    {
        DataHubUpgradeRequest __clone = ((DataHubUpgradeRequest) super.clone());
        __clone.__changeListener = new DataHubUpgradeRequest.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubUpgradeRequest copy()
        throws CloneNotSupportedException
    {
        DataHubUpgradeRequest __copy = ((DataHubUpgradeRequest) super.copy());
        __copy._versionField = null;
        __copy._timestampMsField = null;
        __copy.__changeListener = new DataHubUpgradeRequest.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubUpgradeRequest __objectRef;

        private ChangeListener(DataHubUpgradeRequest reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "timestampMs":
                    __objectRef._timestampMsField = null;
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
         * Timestamp when we started this DataHubUpgrade
         * 
         */
        public PathSpec timestampMs() {
            return new PathSpec(getPathComponents(), "timestampMs");
        }

        /**
         * Version of this upgrade
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Timestamp when we started this DataHubUpgrade
         * 
         */
        public DataHubUpgradeRequest.ProjectionMask withTimestampMs() {
            getDataMap().put("timestampMs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Version of this upgrade
         * 
         */
        public DataHubUpgradeRequest.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
