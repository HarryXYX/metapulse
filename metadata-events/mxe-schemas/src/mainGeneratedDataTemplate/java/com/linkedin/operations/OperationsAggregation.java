
package com.linkedin.operations;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.WindowDuration;
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
 * Operations data for a given resource, rolled up into a bucket.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/operations/OperationsAggregation.pdl.")
public class OperationsAggregation
    extends RecordTemplate
{

    private final static OperationsAggregation.Fields _fields = new OperationsAggregation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.operations/**Operations data for a given resource, rolled up into a bucket.*/record OperationsAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Aggregations associated with this bucket */aggregations:/**Aggregation results for operations query*/record OperationsAggregationsResult{/** Total number of operations in the bucket */totalOperations:optional int/** Total number of inserts in the bucket */totalInserts:optional int/** Total number of updates in the bucket */totalUpdates:optional int/** Total number of deletes in the bucket */totalDeletes:optional int/** Total number of creates in the bucket */totalCreates:optional int/** Total number of alters in the bucket */totalAlters:optional int/** Total number of drops in the bucket */totalDrops:optional int/** Total number of custom types in the bucket */totalCustoms:optional int/** A map from each custom operation type to the total count for that type*/customOperationsMap:optional map[string,int]}}", SchemaFormatType.PDL));
    private Long _bucketField = null;
    private WindowDuration _durationField = null;
    private com.linkedin.common.urn.Urn _resourceField = null;
    private OperationsAggregationsResult _aggregationsField = null;
    private OperationsAggregation.ChangeListener __changeListener = new OperationsAggregation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Bucket = SCHEMA.getField("bucket");
    private final static RecordDataSchema.Field FIELD_Duration = SCHEMA.getField("duration");
    private final static RecordDataSchema.Field FIELD_Resource = SCHEMA.getField("resource");
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public OperationsAggregation() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public OperationsAggregation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OperationsAggregation.Fields fields() {
        return _fields;
    }

    public static OperationsAggregation.ProjectionMask createMask() {
        return new OperationsAggregation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for bucket
     * 
     * @see OperationsAggregation.Fields#bucket
     */
    public boolean hasBucket() {
        if (_bucketField!= null) {
            return true;
        }
        return super._map.containsKey("bucket");
    }

    /**
     * Remover for bucket
     * 
     * @see OperationsAggregation.Fields#bucket
     */
    public void removeBucket() {
        super._map.remove("bucket");
    }

    /**
     * Getter for bucket
     * 
     * @see OperationsAggregation.Fields#bucket
     */
    @Nullable
    public Long getBucket(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBucket();
            case DEFAULT:
            case NULL:
                if (_bucketField!= null) {
                    return _bucketField;
                } else {
                    Object __rawValue = super._map.get("bucket");
                    _bucketField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _bucketField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for bucket
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OperationsAggregation.Fields#bucket
     */
    @Nonnull
    public Long getBucket() {
        if (_bucketField!= null) {
            return _bucketField;
        } else {
            Object __rawValue = super._map.get("bucket");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("bucket");
            }
            _bucketField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _bucketField;
        }
    }

    /**
     * Setter for bucket
     * 
     * @see OperationsAggregation.Fields#bucket
     */
    public OperationsAggregation setBucket(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBucket(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field bucket of com.linkedin.operations.OperationsAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
                    _bucketField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBucket();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
                    _bucketField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
                    _bucketField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for bucket
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregation.Fields#bucket
     */
    public OperationsAggregation setBucket(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field bucket of com.linkedin.operations.OperationsAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
            _bucketField = value;
        }
        return this;
    }

    /**
     * Setter for bucket
     * 
     * @see OperationsAggregation.Fields#bucket
     */
    public OperationsAggregation setBucket(long value) {
        CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
        _bucketField = value;
        return this;
    }

    /**
     * Existence checker for duration
     * 
     * @see OperationsAggregation.Fields#duration
     */
    public boolean hasDuration() {
        if (_durationField!= null) {
            return true;
        }
        return super._map.containsKey("duration");
    }

    /**
     * Remover for duration
     * 
     * @see OperationsAggregation.Fields#duration
     */
    public void removeDuration() {
        super._map.remove("duration");
    }

    /**
     * Getter for duration
     * 
     * @see OperationsAggregation.Fields#duration
     */
    @Nullable
    public WindowDuration getDuration(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDuration();
            case DEFAULT:
            case NULL:
                if (_durationField!= null) {
                    return _durationField;
                } else {
                    Object __rawValue = super._map.get("duration");
                    _durationField = DataTemplateUtil.coerceEnumOutput(__rawValue, WindowDuration.class, WindowDuration.$UNKNOWN);
                    return _durationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for duration
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OperationsAggregation.Fields#duration
     */
    @Nonnull
    public WindowDuration getDuration() {
        if (_durationField!= null) {
            return _durationField;
        } else {
            Object __rawValue = super._map.get("duration");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("duration");
            }
            _durationField = DataTemplateUtil.coerceEnumOutput(__rawValue, WindowDuration.class, WindowDuration.$UNKNOWN);
            return _durationField;
        }
    }

    /**
     * Setter for duration
     * 
     * @see OperationsAggregation.Fields#duration
     */
    public OperationsAggregation setDuration(
        @Nullable
        WindowDuration value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDuration(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field duration of com.linkedin.operations.OperationsAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
                    _durationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDuration();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
                    _durationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
                    _durationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for duration
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregation.Fields#duration
     */
    public OperationsAggregation setDuration(
        @Nonnull
        WindowDuration value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field duration of com.linkedin.operations.OperationsAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
            _durationField = value;
        }
        return this;
    }

    /**
     * Existence checker for resource
     * 
     * @see OperationsAggregation.Fields#resource
     */
    public boolean hasResource() {
        if (_resourceField!= null) {
            return true;
        }
        return super._map.containsKey("resource");
    }

    /**
     * Remover for resource
     * 
     * @see OperationsAggregation.Fields#resource
     */
    public void removeResource() {
        super._map.remove("resource");
    }

    /**
     * Getter for resource
     * 
     * @see OperationsAggregation.Fields#resource
     */
    @Nullable
    public com.linkedin.common.urn.Urn getResource(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getResource();
            case DEFAULT:
            case NULL:
                if (_resourceField!= null) {
                    return _resourceField;
                } else {
                    Object __rawValue = super._map.get("resource");
                    _resourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _resourceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for resource
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OperationsAggregation.Fields#resource
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getResource() {
        if (_resourceField!= null) {
            return _resourceField;
        } else {
            Object __rawValue = super._map.get("resource");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("resource");
            }
            _resourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _resourceField;
        }
    }

    /**
     * Setter for resource
     * 
     * @see OperationsAggregation.Fields#resource
     */
    public OperationsAggregation setResource(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResource(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field resource of com.linkedin.operations.OperationsAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _resourceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _resourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _resourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregation.Fields#resource
     */
    public OperationsAggregation setResource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resource of com.linkedin.operations.OperationsAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _resourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see OperationsAggregation.Fields#aggregations
     */
    public boolean hasAggregations() {
        if (_aggregationsField!= null) {
            return true;
        }
        return super._map.containsKey("aggregations");
    }

    /**
     * Remover for aggregations
     * 
     * @see OperationsAggregation.Fields#aggregations
     */
    public void removeAggregations() {
        super._map.remove("aggregations");
    }

    /**
     * Getter for aggregations
     * 
     * @see OperationsAggregation.Fields#aggregations
     */
    @Nullable
    public OperationsAggregationsResult getAggregations(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAggregations();
            case DEFAULT:
            case NULL:
                if (_aggregationsField!= null) {
                    return _aggregationsField;
                } else {
                    Object __rawValue = super._map.get("aggregations");
                    _aggregationsField = ((__rawValue == null)?null:new OperationsAggregationsResult(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _aggregationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OperationsAggregation.Fields#aggregations
     */
    @Nonnull
    public OperationsAggregationsResult getAggregations() {
        if (_aggregationsField!= null) {
            return _aggregationsField;
        } else {
            Object __rawValue = super._map.get("aggregations");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aggregations");
            }
            _aggregationsField = ((__rawValue == null)?null:new OperationsAggregationsResult(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aggregationsField;
        }
    }

    /**
     * Setter for aggregations
     * 
     * @see OperationsAggregation.Fields#aggregations
     */
    public OperationsAggregation setAggregations(
        @Nullable
        OperationsAggregationsResult value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregations(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aggregations of com.linkedin.operations.OperationsAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregation.Fields#aggregations
     */
    public OperationsAggregation setAggregations(
        @Nonnull
        OperationsAggregationsResult value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregations of com.linkedin.operations.OperationsAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
            _aggregationsField = value;
        }
        return this;
    }

    @Override
    public OperationsAggregation clone()
        throws CloneNotSupportedException
    {
        OperationsAggregation __clone = ((OperationsAggregation) super.clone());
        __clone.__changeListener = new OperationsAggregation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OperationsAggregation copy()
        throws CloneNotSupportedException
    {
        OperationsAggregation __copy = ((OperationsAggregation) super.copy());
        __copy._bucketField = null;
        __copy._durationField = null;
        __copy._resourceField = null;
        __copy._aggregationsField = null;
        __copy.__changeListener = new OperationsAggregation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OperationsAggregation __objectRef;

        private ChangeListener(OperationsAggregation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "bucket":
                    __objectRef._bucketField = null;
                    break;
                case "duration":
                    __objectRef._durationField = null;
                    break;
                case "resource":
                    __objectRef._resourceField = null;
                    break;
                case "aggregations":
                    __objectRef._aggregationsField = null;
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
         *  Bucket start time in milliseconds 
         * 
         */
        public PathSpec bucket() {
            return new PathSpec(getPathComponents(), "bucket");
        }

        /**
         *  Bucket duration 
         * 
         */
        public PathSpec duration() {
            return new PathSpec(getPathComponents(), "duration");
        }

        /**
         *  Resource associated with these usage stats 
         * 
         */
        public PathSpec resource() {
            return new PathSpec(getPathComponents(), "resource");
        }

        /**
         *  Aggregations associated with this bucket 
         * 
         */
        public com.linkedin.operations.OperationsAggregationsResult.Fields aggregations() {
            return new com.linkedin.operations.OperationsAggregationsResult.Fields(getPathComponents(), "aggregations");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.operations.OperationsAggregationsResult.ProjectionMask _aggregationsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         *  Bucket start time in milliseconds 
         * 
         */
        public OperationsAggregation.ProjectionMask withBucket() {
            getDataMap().put("bucket", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Bucket duration 
         * 
         */
        public OperationsAggregation.ProjectionMask withDuration() {
            getDataMap().put("duration", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Resource associated with these usage stats 
         * 
         */
        public OperationsAggregation.ProjectionMask withResource() {
            getDataMap().put("resource", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Aggregations associated with this bucket 
         * 
         */
        public OperationsAggregation.ProjectionMask withAggregations(Function<com.linkedin.operations.OperationsAggregationsResult.ProjectionMask, com.linkedin.operations.OperationsAggregationsResult.ProjectionMask> nestedMask) {
            _aggregationsMask = nestedMask.apply(((_aggregationsMask == null)?OperationsAggregationsResult.createMask():_aggregationsMask));
            getDataMap().put("aggregations", _aggregationsMask.getDataMap());
            return this;
        }

        /**
         *  Aggregations associated with this bucket 
         * 
         */
        public OperationsAggregation.ProjectionMask withAggregations() {
            _aggregationsMask = null;
            getDataMap().put("aggregations", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
