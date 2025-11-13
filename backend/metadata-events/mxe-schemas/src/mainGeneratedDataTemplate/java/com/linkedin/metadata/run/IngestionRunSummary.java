
package com.linkedin.metadata.run;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/IngestionRunSummary.pdl.")
public class IngestionRunSummary
    extends RecordTemplate
{

    private final static IngestionRunSummary.Fields _fields = new IngestionRunSummary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record IngestionRunSummary{runId:string,timestamp:long,rows:long}", SchemaFormatType.PDL));
    private String _runIdField = null;
    private Long _timestampField = null;
    private Long _rowsField = null;
    private IngestionRunSummary.ChangeListener __changeListener = new IngestionRunSummary.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static RecordDataSchema.Field FIELD_Timestamp = SCHEMA.getField("timestamp");
    private final static RecordDataSchema.Field FIELD_Rows = SCHEMA.getField("rows");

    public IngestionRunSummary() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IngestionRunSummary(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IngestionRunSummary.Fields fields() {
        return _fields;
    }

    public static IngestionRunSummary.ProjectionMask createMask() {
        return new IngestionRunSummary.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public boolean hasRunId() {
        if (_runIdField!= null) {
            return true;
        }
        return super._map.containsKey("runId");
    }

    /**
     * Remover for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public void removeRunId() {
        super._map.remove("runId");
    }

    /**
     * Getter for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    @Nullable
    public String getRunId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRunId();
            case DEFAULT:
            case NULL:
                if (_runIdField!= null) {
                    return _runIdField;
                } else {
                    Object __rawValue = super._map.get("runId");
                    _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _runIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for runId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummary.Fields#runId
     */
    @Nonnull
    public String getRunId() {
        if (_runIdField!= null) {
            return _runIdField;
        } else {
            Object __rawValue = super._map.get("runId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("runId");
            }
            _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _runIdField;
        }
    }

    /**
     * Setter for runId
     * 
     * @see IngestionRunSummary.Fields#runId
     */
    public IngestionRunSummary setRunId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRunId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field runId of com.linkedin.metadata.run.IngestionRunSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRunId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for runId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummary.Fields#runId
     */
    public IngestionRunSummary setRunId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field runId of com.linkedin.metadata.run.IngestionRunSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "runId", value);
            _runIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public boolean hasTimestamp() {
        if (_timestampField!= null) {
            return true;
        }
        return super._map.containsKey("timestamp");
    }

    /**
     * Remover for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public void removeTimestamp() {
        super._map.remove("timestamp");
    }

    /**
     * Getter for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    @Nullable
    public Long getTimestamp(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTimestamp();
            case DEFAULT:
            case NULL:
                if (_timestampField!= null) {
                    return _timestampField;
                } else {
                    Object __rawValue = super._map.get("timestamp");
                    _timestampField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timestampField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for timestamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummary.Fields#timestamp
     */
    @Nonnull
    public Long getTimestamp() {
        if (_timestampField!= null) {
            return _timestampField;
        } else {
            Object __rawValue = super._map.get("timestamp");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("timestamp");
            }
            _timestampField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timestampField;
        }
    }

    /**
     * Setter for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public IngestionRunSummary setTimestamp(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timestamp of com.linkedin.metadata.run.IngestionRunSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
                    _timestampField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimestamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
                    _timestampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
                    _timestampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummary.Fields#timestamp
     */
    public IngestionRunSummary setTimestamp(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestamp of com.linkedin.metadata.run.IngestionRunSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
            _timestampField = value;
        }
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @see IngestionRunSummary.Fields#timestamp
     */
    public IngestionRunSummary setTimestamp(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
        _timestampField = value;
        return this;
    }

    /**
     * Existence checker for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public boolean hasRows() {
        if (_rowsField!= null) {
            return true;
        }
        return super._map.containsKey("rows");
    }

    /**
     * Remover for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public void removeRows() {
        super._map.remove("rows");
    }

    /**
     * Getter for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    @Nullable
    public Long getRows(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRows();
            case DEFAULT:
            case NULL:
                if (_rowsField!= null) {
                    return _rowsField;
                } else {
                    Object __rawValue = super._map.get("rows");
                    _rowsField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _rowsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rows
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IngestionRunSummary.Fields#rows
     */
    @Nonnull
    public Long getRows() {
        if (_rowsField!= null) {
            return _rowsField;
        } else {
            Object __rawValue = super._map.get("rows");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("rows");
            }
            _rowsField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _rowsField;
        }
    }

    /**
     * Setter for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public IngestionRunSummary setRows(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRows(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field rows of com.linkedin.metadata.run.IngestionRunSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
                    _rowsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRows();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
                    _rowsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
                    _rowsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rows
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IngestionRunSummary.Fields#rows
     */
    public IngestionRunSummary setRows(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rows of com.linkedin.metadata.run.IngestionRunSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
            _rowsField = value;
        }
        return this;
    }

    /**
     * Setter for rows
     * 
     * @see IngestionRunSummary.Fields#rows
     */
    public IngestionRunSummary setRows(long value) {
        CheckedUtil.putWithoutChecking(super._map, "rows", DataTemplateUtil.coerceLongInput(value));
        _rowsField = value;
        return this;
    }

    @Override
    public IngestionRunSummary clone()
        throws CloneNotSupportedException
    {
        IngestionRunSummary __clone = ((IngestionRunSummary) super.clone());
        __clone.__changeListener = new IngestionRunSummary.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IngestionRunSummary copy()
        throws CloneNotSupportedException
    {
        IngestionRunSummary __copy = ((IngestionRunSummary) super.copy());
        __copy._runIdField = null;
        __copy._rowsField = null;
        __copy._timestampField = null;
        __copy.__changeListener = new IngestionRunSummary.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IngestionRunSummary __objectRef;

        private ChangeListener(IngestionRunSummary reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "runId":
                    __objectRef._runIdField = null;
                    break;
                case "rows":
                    __objectRef._rowsField = null;
                    break;
                case "timestamp":
                    __objectRef._timestampField = null;
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

        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        public PathSpec timestamp() {
            return new PathSpec(getPathComponents(), "timestamp");
        }

        public PathSpec rows() {
            return new PathSpec(getPathComponents(), "rows");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        public IngestionRunSummary.ProjectionMask withRunId() {
            getDataMap().put("runId", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IngestionRunSummary.ProjectionMask withTimestamp() {
            getDataMap().put("timestamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        public IngestionRunSummary.ProjectionMask withRows() {
            getDataMap().put("rows", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
