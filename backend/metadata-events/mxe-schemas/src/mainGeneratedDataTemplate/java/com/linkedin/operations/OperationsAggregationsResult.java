
package com.linkedin.operations;

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
import com.linkedin.data.template.IntegerMap;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Aggregation results for operations query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/operations/OperationsAggregationsResult.pdl.")
public class OperationsAggregationsResult
    extends RecordTemplate
{

    private final static OperationsAggregationsResult.Fields _fields = new OperationsAggregationsResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.operations/**Aggregation results for operations query*/record OperationsAggregationsResult{/** Total number of operations in the bucket */totalOperations:optional int/** Total number of inserts in the bucket */totalInserts:optional int/** Total number of updates in the bucket */totalUpdates:optional int/** Total number of deletes in the bucket */totalDeletes:optional int/** Total number of creates in the bucket */totalCreates:optional int/** Total number of alters in the bucket */totalAlters:optional int/** Total number of drops in the bucket */totalDrops:optional int/** Total number of custom types in the bucket */totalCustoms:optional int/** A map from each custom operation type to the total count for that type*/customOperationsMap:optional map[string,int]}", SchemaFormatType.PDL));
    private Integer _totalOperationsField = null;
    private Integer _totalInsertsField = null;
    private Integer _totalUpdatesField = null;
    private Integer _totalDeletesField = null;
    private Integer _totalCreatesField = null;
    private Integer _totalAltersField = null;
    private Integer _totalDropsField = null;
    private Integer _totalCustomsField = null;
    private IntegerMap _customOperationsMapField = null;
    private OperationsAggregationsResult.ChangeListener __changeListener = new OperationsAggregationsResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TotalOperations = SCHEMA.getField("totalOperations");
    private final static RecordDataSchema.Field FIELD_TotalInserts = SCHEMA.getField("totalInserts");
    private final static RecordDataSchema.Field FIELD_TotalUpdates = SCHEMA.getField("totalUpdates");
    private final static RecordDataSchema.Field FIELD_TotalDeletes = SCHEMA.getField("totalDeletes");
    private final static RecordDataSchema.Field FIELD_TotalCreates = SCHEMA.getField("totalCreates");
    private final static RecordDataSchema.Field FIELD_TotalAlters = SCHEMA.getField("totalAlters");
    private final static RecordDataSchema.Field FIELD_TotalDrops = SCHEMA.getField("totalDrops");
    private final static RecordDataSchema.Field FIELD_TotalCustoms = SCHEMA.getField("totalCustoms");
    private final static RecordDataSchema.Field FIELD_CustomOperationsMap = SCHEMA.getField("customOperationsMap");

    public OperationsAggregationsResult() {
        super(new DataMap(12, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public OperationsAggregationsResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OperationsAggregationsResult.Fields fields() {
        return _fields;
    }

    public static OperationsAggregationsResult.ProjectionMask createMask() {
        return new OperationsAggregationsResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for totalOperations
     * 
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    public boolean hasTotalOperations() {
        if (_totalOperationsField!= null) {
            return true;
        }
        return super._map.containsKey("totalOperations");
    }

    /**
     * Remover for totalOperations
     * 
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    public void removeTotalOperations() {
        super._map.remove("totalOperations");
    }

    /**
     * Getter for totalOperations
     * 
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    @Nullable
    public Integer getTotalOperations(GetMode mode) {
        return getTotalOperations();
    }

    /**
     * Getter for totalOperations
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    @Nullable
    public Integer getTotalOperations() {
        if (_totalOperationsField!= null) {
            return _totalOperationsField;
        } else {
            Object __rawValue = super._map.get("totalOperations");
            _totalOperationsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalOperationsField;
        }
    }

    /**
     * Setter for totalOperations
     * 
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    public OperationsAggregationsResult setTotalOperations(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalOperations(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalOperations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalOperations", DataTemplateUtil.coerceIntInput(value));
                    _totalOperationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalOperations", DataTemplateUtil.coerceIntInput(value));
                    _totalOperationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalOperations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    public OperationsAggregationsResult setTotalOperations(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalOperations of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalOperations", DataTemplateUtil.coerceIntInput(value));
            _totalOperationsField = value;
        }
        return this;
    }

    /**
     * Setter for totalOperations
     * 
     * @see OperationsAggregationsResult.Fields#totalOperations
     */
    public OperationsAggregationsResult setTotalOperations(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalOperations", DataTemplateUtil.coerceIntInput(value));
        _totalOperationsField = value;
        return this;
    }

    /**
     * Existence checker for totalInserts
     * 
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    public boolean hasTotalInserts() {
        if (_totalInsertsField!= null) {
            return true;
        }
        return super._map.containsKey("totalInserts");
    }

    /**
     * Remover for totalInserts
     * 
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    public void removeTotalInserts() {
        super._map.remove("totalInserts");
    }

    /**
     * Getter for totalInserts
     * 
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    @Nullable
    public Integer getTotalInserts(GetMode mode) {
        return getTotalInserts();
    }

    /**
     * Getter for totalInserts
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    @Nullable
    public Integer getTotalInserts() {
        if (_totalInsertsField!= null) {
            return _totalInsertsField;
        } else {
            Object __rawValue = super._map.get("totalInserts");
            _totalInsertsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalInsertsField;
        }
    }

    /**
     * Setter for totalInserts
     * 
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    public OperationsAggregationsResult setTotalInserts(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalInserts(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalInserts();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalInserts", DataTemplateUtil.coerceIntInput(value));
                    _totalInsertsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalInserts", DataTemplateUtil.coerceIntInput(value));
                    _totalInsertsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalInserts
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    public OperationsAggregationsResult setTotalInserts(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalInserts of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalInserts", DataTemplateUtil.coerceIntInput(value));
            _totalInsertsField = value;
        }
        return this;
    }

    /**
     * Setter for totalInserts
     * 
     * @see OperationsAggregationsResult.Fields#totalInserts
     */
    public OperationsAggregationsResult setTotalInserts(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalInserts", DataTemplateUtil.coerceIntInput(value));
        _totalInsertsField = value;
        return this;
    }

    /**
     * Existence checker for totalUpdates
     * 
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    public boolean hasTotalUpdates() {
        if (_totalUpdatesField!= null) {
            return true;
        }
        return super._map.containsKey("totalUpdates");
    }

    /**
     * Remover for totalUpdates
     * 
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    public void removeTotalUpdates() {
        super._map.remove("totalUpdates");
    }

    /**
     * Getter for totalUpdates
     * 
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    @Nullable
    public Integer getTotalUpdates(GetMode mode) {
        return getTotalUpdates();
    }

    /**
     * Getter for totalUpdates
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    @Nullable
    public Integer getTotalUpdates() {
        if (_totalUpdatesField!= null) {
            return _totalUpdatesField;
        } else {
            Object __rawValue = super._map.get("totalUpdates");
            _totalUpdatesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalUpdatesField;
        }
    }

    /**
     * Setter for totalUpdates
     * 
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    public OperationsAggregationsResult setTotalUpdates(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalUpdates(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalUpdates();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalUpdates", DataTemplateUtil.coerceIntInput(value));
                    _totalUpdatesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalUpdates", DataTemplateUtil.coerceIntInput(value));
                    _totalUpdatesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalUpdates
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    public OperationsAggregationsResult setTotalUpdates(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalUpdates of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalUpdates", DataTemplateUtil.coerceIntInput(value));
            _totalUpdatesField = value;
        }
        return this;
    }

    /**
     * Setter for totalUpdates
     * 
     * @see OperationsAggregationsResult.Fields#totalUpdates
     */
    public OperationsAggregationsResult setTotalUpdates(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalUpdates", DataTemplateUtil.coerceIntInput(value));
        _totalUpdatesField = value;
        return this;
    }

    /**
     * Existence checker for totalDeletes
     * 
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    public boolean hasTotalDeletes() {
        if (_totalDeletesField!= null) {
            return true;
        }
        return super._map.containsKey("totalDeletes");
    }

    /**
     * Remover for totalDeletes
     * 
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    public void removeTotalDeletes() {
        super._map.remove("totalDeletes");
    }

    /**
     * Getter for totalDeletes
     * 
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    @Nullable
    public Integer getTotalDeletes(GetMode mode) {
        return getTotalDeletes();
    }

    /**
     * Getter for totalDeletes
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    @Nullable
    public Integer getTotalDeletes() {
        if (_totalDeletesField!= null) {
            return _totalDeletesField;
        } else {
            Object __rawValue = super._map.get("totalDeletes");
            _totalDeletesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalDeletesField;
        }
    }

    /**
     * Setter for totalDeletes
     * 
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    public OperationsAggregationsResult setTotalDeletes(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalDeletes(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalDeletes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalDeletes", DataTemplateUtil.coerceIntInput(value));
                    _totalDeletesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalDeletes", DataTemplateUtil.coerceIntInput(value));
                    _totalDeletesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalDeletes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    public OperationsAggregationsResult setTotalDeletes(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalDeletes of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalDeletes", DataTemplateUtil.coerceIntInput(value));
            _totalDeletesField = value;
        }
        return this;
    }

    /**
     * Setter for totalDeletes
     * 
     * @see OperationsAggregationsResult.Fields#totalDeletes
     */
    public OperationsAggregationsResult setTotalDeletes(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalDeletes", DataTemplateUtil.coerceIntInput(value));
        _totalDeletesField = value;
        return this;
    }

    /**
     * Existence checker for totalCreates
     * 
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    public boolean hasTotalCreates() {
        if (_totalCreatesField!= null) {
            return true;
        }
        return super._map.containsKey("totalCreates");
    }

    /**
     * Remover for totalCreates
     * 
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    public void removeTotalCreates() {
        super._map.remove("totalCreates");
    }

    /**
     * Getter for totalCreates
     * 
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    @Nullable
    public Integer getTotalCreates(GetMode mode) {
        return getTotalCreates();
    }

    /**
     * Getter for totalCreates
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    @Nullable
    public Integer getTotalCreates() {
        if (_totalCreatesField!= null) {
            return _totalCreatesField;
        } else {
            Object __rawValue = super._map.get("totalCreates");
            _totalCreatesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalCreatesField;
        }
    }

    /**
     * Setter for totalCreates
     * 
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    public OperationsAggregationsResult setTotalCreates(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalCreates(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalCreates();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalCreates", DataTemplateUtil.coerceIntInput(value));
                    _totalCreatesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalCreates", DataTemplateUtil.coerceIntInput(value));
                    _totalCreatesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalCreates
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    public OperationsAggregationsResult setTotalCreates(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalCreates of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalCreates", DataTemplateUtil.coerceIntInput(value));
            _totalCreatesField = value;
        }
        return this;
    }

    /**
     * Setter for totalCreates
     * 
     * @see OperationsAggregationsResult.Fields#totalCreates
     */
    public OperationsAggregationsResult setTotalCreates(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalCreates", DataTemplateUtil.coerceIntInput(value));
        _totalCreatesField = value;
        return this;
    }

    /**
     * Existence checker for totalAlters
     * 
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    public boolean hasTotalAlters() {
        if (_totalAltersField!= null) {
            return true;
        }
        return super._map.containsKey("totalAlters");
    }

    /**
     * Remover for totalAlters
     * 
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    public void removeTotalAlters() {
        super._map.remove("totalAlters");
    }

    /**
     * Getter for totalAlters
     * 
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    @Nullable
    public Integer getTotalAlters(GetMode mode) {
        return getTotalAlters();
    }

    /**
     * Getter for totalAlters
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    @Nullable
    public Integer getTotalAlters() {
        if (_totalAltersField!= null) {
            return _totalAltersField;
        } else {
            Object __rawValue = super._map.get("totalAlters");
            _totalAltersField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalAltersField;
        }
    }

    /**
     * Setter for totalAlters
     * 
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    public OperationsAggregationsResult setTotalAlters(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalAlters(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalAlters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalAlters", DataTemplateUtil.coerceIntInput(value));
                    _totalAltersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalAlters", DataTemplateUtil.coerceIntInput(value));
                    _totalAltersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalAlters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    public OperationsAggregationsResult setTotalAlters(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalAlters of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalAlters", DataTemplateUtil.coerceIntInput(value));
            _totalAltersField = value;
        }
        return this;
    }

    /**
     * Setter for totalAlters
     * 
     * @see OperationsAggregationsResult.Fields#totalAlters
     */
    public OperationsAggregationsResult setTotalAlters(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalAlters", DataTemplateUtil.coerceIntInput(value));
        _totalAltersField = value;
        return this;
    }

    /**
     * Existence checker for totalDrops
     * 
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    public boolean hasTotalDrops() {
        if (_totalDropsField!= null) {
            return true;
        }
        return super._map.containsKey("totalDrops");
    }

    /**
     * Remover for totalDrops
     * 
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    public void removeTotalDrops() {
        super._map.remove("totalDrops");
    }

    /**
     * Getter for totalDrops
     * 
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    @Nullable
    public Integer getTotalDrops(GetMode mode) {
        return getTotalDrops();
    }

    /**
     * Getter for totalDrops
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    @Nullable
    public Integer getTotalDrops() {
        if (_totalDropsField!= null) {
            return _totalDropsField;
        } else {
            Object __rawValue = super._map.get("totalDrops");
            _totalDropsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalDropsField;
        }
    }

    /**
     * Setter for totalDrops
     * 
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    public OperationsAggregationsResult setTotalDrops(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalDrops(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalDrops();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalDrops", DataTemplateUtil.coerceIntInput(value));
                    _totalDropsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalDrops", DataTemplateUtil.coerceIntInput(value));
                    _totalDropsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalDrops
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    public OperationsAggregationsResult setTotalDrops(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalDrops of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalDrops", DataTemplateUtil.coerceIntInput(value));
            _totalDropsField = value;
        }
        return this;
    }

    /**
     * Setter for totalDrops
     * 
     * @see OperationsAggregationsResult.Fields#totalDrops
     */
    public OperationsAggregationsResult setTotalDrops(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalDrops", DataTemplateUtil.coerceIntInput(value));
        _totalDropsField = value;
        return this;
    }

    /**
     * Existence checker for totalCustoms
     * 
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    public boolean hasTotalCustoms() {
        if (_totalCustomsField!= null) {
            return true;
        }
        return super._map.containsKey("totalCustoms");
    }

    /**
     * Remover for totalCustoms
     * 
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    public void removeTotalCustoms() {
        super._map.remove("totalCustoms");
    }

    /**
     * Getter for totalCustoms
     * 
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    @Nullable
    public Integer getTotalCustoms(GetMode mode) {
        return getTotalCustoms();
    }

    /**
     * Getter for totalCustoms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    @Nullable
    public Integer getTotalCustoms() {
        if (_totalCustomsField!= null) {
            return _totalCustomsField;
        } else {
            Object __rawValue = super._map.get("totalCustoms");
            _totalCustomsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _totalCustomsField;
        }
    }

    /**
     * Setter for totalCustoms
     * 
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    public OperationsAggregationsResult setTotalCustoms(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTotalCustoms(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTotalCustoms();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "totalCustoms", DataTemplateUtil.coerceIntInput(value));
                    _totalCustomsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "totalCustoms", DataTemplateUtil.coerceIntInput(value));
                    _totalCustomsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for totalCustoms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    public OperationsAggregationsResult setTotalCustoms(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field totalCustoms of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "totalCustoms", DataTemplateUtil.coerceIntInput(value));
            _totalCustomsField = value;
        }
        return this;
    }

    /**
     * Setter for totalCustoms
     * 
     * @see OperationsAggregationsResult.Fields#totalCustoms
     */
    public OperationsAggregationsResult setTotalCustoms(int value) {
        CheckedUtil.putWithoutChecking(super._map, "totalCustoms", DataTemplateUtil.coerceIntInput(value));
        _totalCustomsField = value;
        return this;
    }

    /**
     * Existence checker for customOperationsMap
     * 
     * @see OperationsAggregationsResult.Fields#customOperationsMap
     */
    public boolean hasCustomOperationsMap() {
        if (_customOperationsMapField!= null) {
            return true;
        }
        return super._map.containsKey("customOperationsMap");
    }

    /**
     * Remover for customOperationsMap
     * 
     * @see OperationsAggregationsResult.Fields#customOperationsMap
     */
    public void removeCustomOperationsMap() {
        super._map.remove("customOperationsMap");
    }

    /**
     * Getter for customOperationsMap
     * 
     * @see OperationsAggregationsResult.Fields#customOperationsMap
     */
    @Nullable
    public IntegerMap getCustomOperationsMap(GetMode mode) {
        return getCustomOperationsMap();
    }

    /**
     * Getter for customOperationsMap
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsAggregationsResult.Fields#customOperationsMap
     */
    @Nullable
    public IntegerMap getCustomOperationsMap() {
        if (_customOperationsMapField!= null) {
            return _customOperationsMapField;
        } else {
            Object __rawValue = super._map.get("customOperationsMap");
            _customOperationsMapField = ((__rawValue == null)?null:new IntegerMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customOperationsMapField;
        }
    }

    /**
     * Setter for customOperationsMap
     * 
     * @see OperationsAggregationsResult.Fields#customOperationsMap
     */
    public OperationsAggregationsResult setCustomOperationsMap(
        @Nullable
        IntegerMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomOperationsMap(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomOperationsMap();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customOperationsMap", value.data());
                    _customOperationsMapField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customOperationsMap", value.data());
                    _customOperationsMapField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customOperationsMap
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OperationsAggregationsResult.Fields#customOperationsMap
     */
    public OperationsAggregationsResult setCustomOperationsMap(
        @Nonnull
        IntegerMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customOperationsMap of com.linkedin.operations.OperationsAggregationsResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customOperationsMap", value.data());
            _customOperationsMapField = value;
        }
        return this;
    }

    @Override
    public OperationsAggregationsResult clone()
        throws CloneNotSupportedException
    {
        OperationsAggregationsResult __clone = ((OperationsAggregationsResult) super.clone());
        __clone.__changeListener = new OperationsAggregationsResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OperationsAggregationsResult copy()
        throws CloneNotSupportedException
    {
        OperationsAggregationsResult __copy = ((OperationsAggregationsResult) super.copy());
        __copy._totalCreatesField = null;
        __copy._totalAltersField = null;
        __copy._totalOperationsField = null;
        __copy._totalDropsField = null;
        __copy._totalInsertsField = null;
        __copy._totalUpdatesField = null;
        __copy._totalDeletesField = null;
        __copy._totalCustomsField = null;
        __copy._customOperationsMapField = null;
        __copy.__changeListener = new OperationsAggregationsResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OperationsAggregationsResult __objectRef;

        private ChangeListener(OperationsAggregationsResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "totalCreates":
                    __objectRef._totalCreatesField = null;
                    break;
                case "totalAlters":
                    __objectRef._totalAltersField = null;
                    break;
                case "totalOperations":
                    __objectRef._totalOperationsField = null;
                    break;
                case "totalDrops":
                    __objectRef._totalDropsField = null;
                    break;
                case "totalInserts":
                    __objectRef._totalInsertsField = null;
                    break;
                case "totalUpdates":
                    __objectRef._totalUpdatesField = null;
                    break;
                case "totalDeletes":
                    __objectRef._totalDeletesField = null;
                    break;
                case "totalCustoms":
                    __objectRef._totalCustomsField = null;
                    break;
                case "customOperationsMap":
                    __objectRef._customOperationsMapField = null;
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
         *  Total number of operations in the bucket 
         * 
         */
        public PathSpec totalOperations() {
            return new PathSpec(getPathComponents(), "totalOperations");
        }

        /**
         *  Total number of inserts in the bucket 
         * 
         */
        public PathSpec totalInserts() {
            return new PathSpec(getPathComponents(), "totalInserts");
        }

        /**
         *  Total number of updates in the bucket 
         * 
         */
        public PathSpec totalUpdates() {
            return new PathSpec(getPathComponents(), "totalUpdates");
        }

        /**
         *  Total number of deletes in the bucket 
         * 
         */
        public PathSpec totalDeletes() {
            return new PathSpec(getPathComponents(), "totalDeletes");
        }

        /**
         *  Total number of creates in the bucket 
         * 
         */
        public PathSpec totalCreates() {
            return new PathSpec(getPathComponents(), "totalCreates");
        }

        /**
         *  Total number of alters in the bucket 
         * 
         */
        public PathSpec totalAlters() {
            return new PathSpec(getPathComponents(), "totalAlters");
        }

        /**
         *  Total number of drops in the bucket 
         * 
         */
        public PathSpec totalDrops() {
            return new PathSpec(getPathComponents(), "totalDrops");
        }

        /**
         *  Total number of custom types in the bucket 
         * 
         */
        public PathSpec totalCustoms() {
            return new PathSpec(getPathComponents(), "totalCustoms");
        }

        /**
         *  A map from each custom operation type to the total count for that type
         * 
         */
        public PathSpec customOperationsMap() {
            return new PathSpec(getPathComponents(), "customOperationsMap");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(12);
        }

        /**
         *  Total number of operations in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalOperations() {
            getDataMap().put("totalOperations", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of inserts in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalInserts() {
            getDataMap().put("totalInserts", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of updates in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalUpdates() {
            getDataMap().put("totalUpdates", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of deletes in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalDeletes() {
            getDataMap().put("totalDeletes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of creates in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalCreates() {
            getDataMap().put("totalCreates", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of alters in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalAlters() {
            getDataMap().put("totalAlters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of drops in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalDrops() {
            getDataMap().put("totalDrops", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Total number of custom types in the bucket 
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withTotalCustoms() {
            getDataMap().put("totalCustoms", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  A map from each custom operation type to the total count for that type
         * 
         */
        public OperationsAggregationsResult.ProjectionMask withCustomOperationsMap() {
            getDataMap().put("customOperationsMap", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
