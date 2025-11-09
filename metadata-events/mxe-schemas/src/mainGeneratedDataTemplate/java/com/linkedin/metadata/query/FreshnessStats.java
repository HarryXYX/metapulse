
package com.linkedin.metadata.query;

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
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Stats that describe the freshness of a dataset or query result.
 * Useful to describe consistency and staleness of results when served
 * out of a cache or other eventually consistent system.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/FreshnessStats.pdl.")
public class FreshnessStats
    extends RecordTemplate
{

    private final static FreshnessStats.Fields _fields = new FreshnessStats.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**Stats that describe the freshness of a dataset or query result.\nUseful to describe consistency and staleness of results when served\nout of a cache or other eventually consistent system.*/record FreshnessStats{cached:optional boolean,systemFreshness:optional map[string,long]}", SchemaFormatType.PDL));
    private Boolean _cachedField = null;
    private LongMap _systemFreshnessField = null;
    private FreshnessStats.ChangeListener __changeListener = new FreshnessStats.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Cached = SCHEMA.getField("cached");
    private final static RecordDataSchema.Field FIELD_SystemFreshness = SCHEMA.getField("systemFreshness");

    public FreshnessStats() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public FreshnessStats(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FreshnessStats.Fields fields() {
        return _fields;
    }

    public static FreshnessStats.ProjectionMask createMask() {
        return new FreshnessStats.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for cached
     * 
     * @see FreshnessStats.Fields#cached
     */
    public boolean hasCached() {
        if (_cachedField!= null) {
            return true;
        }
        return super._map.containsKey("cached");
    }

    /**
     * Remover for cached
     * 
     * @see FreshnessStats.Fields#cached
     */
    public void removeCached() {
        super._map.remove("cached");
    }

    /**
     * Getter for cached
     * 
     * @see FreshnessStats.Fields#cached
     */
    @Nullable
    public Boolean isCached(GetMode mode) {
        return isCached();
    }

    /**
     * Getter for cached
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FreshnessStats.Fields#cached
     */
    @Nullable
    public Boolean isCached() {
        if (_cachedField!= null) {
            return _cachedField;
        } else {
            Object __rawValue = super._map.get("cached");
            _cachedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _cachedField;
        }
    }

    /**
     * Setter for cached
     * 
     * @see FreshnessStats.Fields#cached
     */
    public FreshnessStats setCached(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCached(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCached();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cached", value);
                    _cachedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cached", value);
                    _cachedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cached
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FreshnessStats.Fields#cached
     */
    public FreshnessStats setCached(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cached of com.linkedin.metadata.query.FreshnessStats to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cached", value);
            _cachedField = value;
        }
        return this;
    }

    /**
     * Setter for cached
     * 
     * @see FreshnessStats.Fields#cached
     */
    public FreshnessStats setCached(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "cached", value);
        _cachedField = value;
        return this;
    }

    /**
     * Existence checker for systemFreshness
     * 
     * @see FreshnessStats.Fields#systemFreshness
     */
    public boolean hasSystemFreshness() {
        if (_systemFreshnessField!= null) {
            return true;
        }
        return super._map.containsKey("systemFreshness");
    }

    /**
     * Remover for systemFreshness
     * 
     * @see FreshnessStats.Fields#systemFreshness
     */
    public void removeSystemFreshness() {
        super._map.remove("systemFreshness");
    }

    /**
     * Getter for systemFreshness
     * 
     * @see FreshnessStats.Fields#systemFreshness
     */
    @Nullable
    public LongMap getSystemFreshness(GetMode mode) {
        return getSystemFreshness();
    }

    /**
     * Getter for systemFreshness
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FreshnessStats.Fields#systemFreshness
     */
    @Nullable
    public LongMap getSystemFreshness() {
        if (_systemFreshnessField!= null) {
            return _systemFreshnessField;
        } else {
            Object __rawValue = super._map.get("systemFreshness");
            _systemFreshnessField = ((__rawValue == null)?null:new LongMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _systemFreshnessField;
        }
    }

    /**
     * Setter for systemFreshness
     * 
     * @see FreshnessStats.Fields#systemFreshness
     */
    public FreshnessStats setSystemFreshness(
        @Nullable
        LongMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSystemFreshness(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSystemFreshness();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "systemFreshness", value.data());
                    _systemFreshnessField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "systemFreshness", value.data());
                    _systemFreshnessField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for systemFreshness
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FreshnessStats.Fields#systemFreshness
     */
    public FreshnessStats setSystemFreshness(
        @Nonnull
        LongMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field systemFreshness of com.linkedin.metadata.query.FreshnessStats to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "systemFreshness", value.data());
            _systemFreshnessField = value;
        }
        return this;
    }

    @Override
    public FreshnessStats clone()
        throws CloneNotSupportedException
    {
        FreshnessStats __clone = ((FreshnessStats) super.clone());
        __clone.__changeListener = new FreshnessStats.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FreshnessStats copy()
        throws CloneNotSupportedException
    {
        FreshnessStats __copy = ((FreshnessStats) super.copy());
        __copy._cachedField = null;
        __copy._systemFreshnessField = null;
        __copy.__changeListener = new FreshnessStats.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FreshnessStats __objectRef;

        private ChangeListener(FreshnessStats reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "cached":
                    __objectRef._cachedField = null;
                    break;
                case "systemFreshness":
                    __objectRef._systemFreshnessField = null;
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

        public PathSpec cached() {
            return new PathSpec(getPathComponents(), "cached");
        }

        public PathSpec systemFreshness() {
            return new PathSpec(getPathComponents(), "systemFreshness");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public FreshnessStats.ProjectionMask withCached() {
            getDataMap().put("cached", MaskMap.POSITIVE_MASK);
            return this;
        }

        public FreshnessStats.ProjectionMask withSystemFreshness() {
            getDataMap().put("systemFreshness", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
