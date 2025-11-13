
package com.linkedin.datacontract;

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
 * Information about the status of a data contract
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datacontract/DataContractStatus.pdl.")
public class DataContractStatus
    extends RecordTemplate
{

    private final static DataContractStatus.Fields _fields = new DataContractStatus.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datacontract/**Information about the status of a data contract*/@Aspect.name=\"dataContractStatus\"record DataContractStatus includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**The latest state of the data contract*/@Searchable={}state:enum DataContractState{/**The data contract is active.*/ACTIVE/**The data contract is pending implementation.*/PENDING}}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private DataContractState _stateField = null;
    private DataContractStatus.ChangeListener __changeListener = new DataContractStatus.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_State = SCHEMA.getField("state");

    static {
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public DataContractStatus() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataContractStatus(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataContractStatus.Fields fields() {
        return _fields;
    }

    public static DataContractStatus.ProjectionMask createMask() {
        return new DataContractStatus.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see DataContractStatus.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see DataContractStatus.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see DataContractStatus.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataContractStatus.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see DataContractStatus.Fields#customProperties
     */
    public DataContractStatus setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.datacontract.DataContractStatus");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataContractStatus.Fields#customProperties
     */
    public DataContractStatus setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.datacontract.DataContractStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for state
     * 
     * @see DataContractStatus.Fields#state
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
     * @see DataContractStatus.Fields#state
     */
    public void removeState() {
        super._map.remove("state");
    }

    /**
     * Getter for state
     * 
     * @see DataContractStatus.Fields#state
     */
    @Nullable
    public DataContractState getState(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getState();
            case DEFAULT:
            case NULL:
                if (_stateField!= null) {
                    return _stateField;
                } else {
                    Object __rawValue = super._map.get("state");
                    _stateField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataContractState.class, DataContractState.$UNKNOWN);
                    return _stateField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for state
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataContractStatus.Fields#state
     */
    @Nonnull
    public DataContractState getState() {
        if (_stateField!= null) {
            return _stateField;
        } else {
            Object __rawValue = super._map.get("state");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("state");
            }
            _stateField = DataTemplateUtil.coerceEnumOutput(__rawValue, DataContractState.class, DataContractState.$UNKNOWN);
            return _stateField;
        }
    }

    /**
     * Setter for state
     * 
     * @see DataContractStatus.Fields#state
     */
    public DataContractStatus setState(
        @Nullable
        DataContractState value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setState(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field state of com.linkedin.datacontract.DataContractStatus");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "state", value.name());
                    _stateField = value;
                }
                break;
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
     * @see DataContractStatus.Fields#state
     */
    public DataContractStatus setState(
        @Nonnull
        DataContractState value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field state of com.linkedin.datacontract.DataContractStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "state", value.name());
            _stateField = value;
        }
        return this;
    }

    @Override
    public DataContractStatus clone()
        throws CloneNotSupportedException
    {
        DataContractStatus __clone = ((DataContractStatus) super.clone());
        __clone.__changeListener = new DataContractStatus.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataContractStatus copy()
        throws CloneNotSupportedException
    {
        DataContractStatus __copy = ((DataContractStatus) super.copy());
        __copy._customPropertiesField = null;
        __copy._stateField = null;
        __copy.__changeListener = new DataContractStatus.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataContractStatus __objectRef;

        private ChangeListener(DataContractStatus reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "state":
                    __objectRef._stateField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * The latest state of the data contract
         * 
         */
        public PathSpec state() {
            return new PathSpec(getPathComponents(), "state");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Custom property bag.
         * 
         */
        public DataContractStatus.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The latest state of the data contract
         * 
         */
        public DataContractStatus.ProjectionMask withState() {
            getDataMap().put("state", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
