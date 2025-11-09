
package com.linkedin.retention;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/retention/DataHubRetentionConfig.pdl.")
public class DataHubRetentionConfig
    extends RecordTemplate
{

    private final static DataHubRetentionConfig.Fields _fields = new DataHubRetentionConfig.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.retention@Aspect.name=\"dataHubRetentionConfig\"record DataHubRetentionConfig{retention:/**Base class that encapsulates different retention policies.\nOnly one of the fields should be set*/record Retention{version:optional/**Keep max N latest records*/record VersionBasedRetention{maxVersions:int}time:optional/**Keep records that are less than X seconds old*/record TimeBasedRetention{maxAgeInSeconds:int}}}", SchemaFormatType.PDL));
    private Retention _retentionField = null;
    private DataHubRetentionConfig.ChangeListener __changeListener = new DataHubRetentionConfig.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Retention = SCHEMA.getField("retention");

    public DataHubRetentionConfig() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubRetentionConfig(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubRetentionConfig.Fields fields() {
        return _fields;
    }

    public static DataHubRetentionConfig.ProjectionMask createMask() {
        return new DataHubRetentionConfig.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for retention
     * 
     * @see DataHubRetentionConfig.Fields#retention
     */
    public boolean hasRetention() {
        if (_retentionField!= null) {
            return true;
        }
        return super._map.containsKey("retention");
    }

    /**
     * Remover for retention
     * 
     * @see DataHubRetentionConfig.Fields#retention
     */
    public void removeRetention() {
        super._map.remove("retention");
    }

    /**
     * Getter for retention
     * 
     * @see DataHubRetentionConfig.Fields#retention
     */
    @Nullable
    public Retention getRetention(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRetention();
            case DEFAULT:
            case NULL:
                if (_retentionField!= null) {
                    return _retentionField;
                } else {
                    Object __rawValue = super._map.get("retention");
                    _retentionField = ((__rawValue == null)?null:new Retention(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _retentionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for retention
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubRetentionConfig.Fields#retention
     */
    @Nonnull
    public Retention getRetention() {
        if (_retentionField!= null) {
            return _retentionField;
        } else {
            Object __rawValue = super._map.get("retention");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("retention");
            }
            _retentionField = ((__rawValue == null)?null:new Retention(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _retentionField;
        }
    }

    /**
     * Setter for retention
     * 
     * @see DataHubRetentionConfig.Fields#retention
     */
    public DataHubRetentionConfig setRetention(
        @Nullable
        Retention value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRetention(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field retention of com.linkedin.retention.DataHubRetentionConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "retention", value.data());
                    _retentionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRetention();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "retention", value.data());
                    _retentionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "retention", value.data());
                    _retentionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for retention
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubRetentionConfig.Fields#retention
     */
    public DataHubRetentionConfig setRetention(
        @Nonnull
        Retention value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field retention of com.linkedin.retention.DataHubRetentionConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "retention", value.data());
            _retentionField = value;
        }
        return this;
    }

    @Override
    public DataHubRetentionConfig clone()
        throws CloneNotSupportedException
    {
        DataHubRetentionConfig __clone = ((DataHubRetentionConfig) super.clone());
        __clone.__changeListener = new DataHubRetentionConfig.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubRetentionConfig copy()
        throws CloneNotSupportedException
    {
        DataHubRetentionConfig __copy = ((DataHubRetentionConfig) super.copy());
        __copy._retentionField = null;
        __copy.__changeListener = new DataHubRetentionConfig.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubRetentionConfig __objectRef;

        private ChangeListener(DataHubRetentionConfig reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "retention":
                    __objectRef._retentionField = null;
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

        public com.linkedin.retention.Retention.Fields retention() {
            return new com.linkedin.retention.Retention.Fields(getPathComponents(), "retention");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.retention.Retention.ProjectionMask _retentionMask;

        ProjectionMask() {
            super(2);
        }

        public DataHubRetentionConfig.ProjectionMask withRetention(Function<com.linkedin.retention.Retention.ProjectionMask, com.linkedin.retention.Retention.ProjectionMask> nestedMask) {
            _retentionMask = nestedMask.apply(((_retentionMask == null)?Retention.createMask():_retentionMask));
            getDataMap().put("retention", _retentionMask.getDataMap());
            return this;
        }

        public DataHubRetentionConfig.ProjectionMask withRetention() {
            _retentionMask = null;
            getDataMap().put("retention", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
