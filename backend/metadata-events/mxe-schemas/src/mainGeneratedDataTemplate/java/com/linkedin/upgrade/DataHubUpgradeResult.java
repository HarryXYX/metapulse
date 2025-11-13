
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
import com.linkedin.data.template.StringMap;


/**
 * Information collected when a DataHubUpgrade successfully finishes
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/upgrade/DataHubUpgradeResult.pdl.")
public class DataHubUpgradeResult
    extends RecordTemplate
{

    private final static DataHubUpgradeResult.Fields _fields = new DataHubUpgradeResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.upgrade/**Information collected when a DataHubUpgrade successfully finishes*/@Aspect.name=\"dataHubUpgradeResult\"record DataHubUpgradeResult{/**Upgrade state  UpgradeResult.Result*/state:optional enum DataHubUpgradeState{/**Upgrade in progress.*/IN_PROGRESS/**Upgrade was successful.*/SUCCEEDED/**Upgrade with an error state, however the upgrade should be re-run.*/FAILED/**Upgrade with an error state and should not be re-run.*/ABORTED}=\"SUCCEEDED\"/**Timestamp when we started this DataHubUpgrade*/timestampMs:long/**Result map to place helpful information about this upgrade job*/result:optional map[string,string]}", SchemaFormatType.PDL));
    private DataHubUpgradeState _stateField = null;
    private Long _timestampMsField = null;
    private StringMap _resultField = null;
    private DataHubUpgradeResult.ChangeListener __changeListener = new DataHubUpgradeResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_State = SCHEMA.getField("state");
    private final static DataHubUpgradeState DEFAULT_State;
    private final static RecordDataSchema.Field FIELD_TimestampMs = SCHEMA.getField("timestampMs");
    private final static RecordDataSchema.Field FIELD_Result = SCHEMA.getField("result");

    static {
        DEFAULT_State = DataTemplateUtil.coerceEnumOutput(FIELD_State.getDefault(), DataHubUpgradeState.class, DataHubUpgradeState.$UNKNOWN);
    }

    public DataHubUpgradeResult() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubUpgradeResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubUpgradeResult.Fields fields() {
        return _fields;
    }

    public static DataHubUpgradeResult.ProjectionMask createMask() {
        return new DataHubUpgradeResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for state
     * 
     * @see DataHubUpgradeResult.Fields#state
     */
    public boolean hasState() {
        if (_stateField!= null) {
            return true;
        }
        return super._map.containsKey("state");
    }

    /**
     * Remover for state
     * 
     * @see DataHubUpgradeResult.Fields#state
     */
    public void removeState() {
        super._map.remove("state");
    }

    /**
     * Getter for state
     * 
     * @see DataHubUpgradeResult.Fields#state
     */
    @Nullable
    public DataHubUpgradeState getState(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getState();
            case NULL:
                if (_stateField!= null) {
                    return _stateField;
                } else {
                    Object __rawValue = super._map.get("state");
                    _stateField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubUpgradeState.class, DataHubUpgradeState.$UNKNOWN);
                    return _stateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for state
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubUpgradeResult.Fields#state
     */
    @Nullable
    public DataHubUpgradeState getState() {
        if (_stateField!= null) {
            return _stateField;
        } else {
            Object __rawValue = super._map.get("state");
            if (__rawValue == null) {
                return DEFAULT_State;
            }
            _stateField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataHubUpgradeState.class, DataHubUpgradeState.$UNKNOWN);
            return _stateField;
        }
    }

    /**
     * Setter for state
     * 
     * @see DataHubUpgradeResult.Fields#state
     */
    public DataHubUpgradeResult setState(
        @Nullable
        DataHubUpgradeState value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setState(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeState();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "state", value.name());
                    _stateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "state", value.name());
                    _stateField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for state
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubUpgradeResult.Fields#state
     */
    public DataHubUpgradeResult setState(
        @Nonnull
        DataHubUpgradeState value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field state of com.linkedin.upgrade.DataHubUpgradeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "state", value.name());
            _stateField = value;
        }
        return this;
    }

    /**
     * Existence checker for timestampMs
     * 
     * @see DataHubUpgradeResult.Fields#timestampMs
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
     * @see DataHubUpgradeResult.Fields#timestampMs
     */
    public void removeTimestampMs() {
        super._map.remove("timestampMs");
    }

    /**
     * Getter for timestampMs
     * 
     * @see DataHubUpgradeResult.Fields#timestampMs
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
     * @see DataHubUpgradeResult.Fields#timestampMs
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
     * @see DataHubUpgradeResult.Fields#timestampMs
     */
    public DataHubUpgradeResult setTimestampMs(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestampMs(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timestampMs of com.linkedin.upgrade.DataHubUpgradeResult");
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
     * @see DataHubUpgradeResult.Fields#timestampMs
     */
    public DataHubUpgradeResult setTimestampMs(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestampMs of com.linkedin.upgrade.DataHubUpgradeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
            _timestampMsField = value;
        }
        return this;
    }

    /**
     * Setter for timestampMs
     * 
     * @see DataHubUpgradeResult.Fields#timestampMs
     */
    public DataHubUpgradeResult setTimestampMs(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestampMs", DataTemplateUtil.coerceLongInput(value));
        _timestampMsField = value;
        return this;
    }

    /**
     * Existence checker for result
     * 
     * @see DataHubUpgradeResult.Fields#result
     */
    public boolean hasResult() {
        if (_resultField!= null) {
            return true;
        }
        return super._map.containsKey("result");
    }

    /**
     * Remover for result
     * 
     * @see DataHubUpgradeResult.Fields#result
     */
    public void removeResult() {
        super._map.remove("result");
    }

    /**
     * Getter for result
     * 
     * @see DataHubUpgradeResult.Fields#result
     */
    @Nullable
    public StringMap getResult(GetMode mode) {
        return getResult();
    }

    /**
     * Getter for result
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubUpgradeResult.Fields#result
     */
    @Nullable
    public StringMap getResult() {
        if (_resultField!= null) {
            return _resultField;
        } else {
            Object __rawValue = super._map.get("result");
            _resultField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _resultField;
        }
    }

    /**
     * Setter for result
     * 
     * @see DataHubUpgradeResult.Fields#result
     */
    public DataHubUpgradeResult setResult(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResult(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResult();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "result", value.data());
                    _resultField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "result", value.data());
                    _resultField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for result
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubUpgradeResult.Fields#result
     */
    public DataHubUpgradeResult setResult(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field result of com.linkedin.upgrade.DataHubUpgradeResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "result", value.data());
            _resultField = value;
        }
        return this;
    }

    @Override
    public DataHubUpgradeResult clone()
        throws CloneNotSupportedException
    {
        DataHubUpgradeResult __clone = ((DataHubUpgradeResult) super.clone());
        __clone.__changeListener = new DataHubUpgradeResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubUpgradeResult copy()
        throws CloneNotSupportedException
    {
        DataHubUpgradeResult __copy = ((DataHubUpgradeResult) super.copy());
        __copy._resultField = null;
        __copy._stateField = null;
        __copy._timestampMsField = null;
        __copy.__changeListener = new DataHubUpgradeResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubUpgradeResult __objectRef;

        private ChangeListener(DataHubUpgradeResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "result":
                    __objectRef._resultField = null;
                    break;
                case "state":
                    __objectRef._stateField = null;
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
         * Upgrade state  UpgradeResult.Result
         * 
         */
        public PathSpec state() {
            return new PathSpec(getPathComponents(), "state");
        }

        /**
         * Timestamp when we started this DataHubUpgrade
         * 
         */
        public PathSpec timestampMs() {
            return new PathSpec(getPathComponents(), "timestampMs");
        }

        /**
         * Result map to place helpful information about this upgrade job
         * 
         */
        public PathSpec result() {
            return new PathSpec(getPathComponents(), "result");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Upgrade state  UpgradeResult.Result
         * 
         */
        public DataHubUpgradeResult.ProjectionMask withState() {
            getDataMap().put("state", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timestamp when we started this DataHubUpgrade
         * 
         */
        public DataHubUpgradeResult.ProjectionMask withTimestampMs() {
            getDataMap().put("timestampMs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Result map to place helpful information about this upgrade job
         * 
         */
        public DataHubUpgradeResult.ProjectionMask withResult() {
            getDataMap().put("result", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
