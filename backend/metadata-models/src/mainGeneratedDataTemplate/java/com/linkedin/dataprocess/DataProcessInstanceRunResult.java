
package com.linkedin.dataprocess;

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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceRunResult.pdl.")
public class DataProcessInstanceRunResult
    extends RecordTemplate
{

    private final static DataProcessInstanceRunResult.Fields _fields = new DataProcessInstanceRunResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess,record DataProcessInstanceRunResult{/** The final result, e.g. SUCCESS, FAILURE, SKIPPED, or UP_FOR_RETRY.*/type:enum RunResultType{/** The Run Succeeded*/SUCCESS/** The Run Failed*/FAILURE/** The Run Skipped*/SKIPPED/** The Run Failed and will Retry*/UP_FOR_RETRY}/**It identifies the system where the native result comes from like Airflow, Azkaban, etc..*/nativeResultType:string}", SchemaFormatType.PDL));
    private RunResultType _typeField = null;
    private String _nativeResultTypeField = null;
    private DataProcessInstanceRunResult.ChangeListener __changeListener = new DataProcessInstanceRunResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_NativeResultType = SCHEMA.getField("nativeResultType");

    public DataProcessInstanceRunResult() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataProcessInstanceRunResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProcessInstanceRunResult.Fields fields() {
        return _fields;
    }

    public static DataProcessInstanceRunResult.ProjectionMask createMask() {
        return new DataProcessInstanceRunResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see DataProcessInstanceRunResult.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see DataProcessInstanceRunResult.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataProcessInstanceRunResult.Fields#type
     */
    @Nullable
    public RunResultType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, RunResultType.class, RunResultType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessInstanceRunResult.Fields#type
     */
    @Nonnull
    public RunResultType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, RunResultType.class, RunResultType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataProcessInstanceRunResult.Fields#type
     */
    public DataProcessInstanceRunResult setType(
        @Nullable
        RunResultType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.dataprocess.DataProcessInstanceRunResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceRunResult.Fields#type
     */
    public DataProcessInstanceRunResult setType(
        @Nonnull
        RunResultType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.dataprocess.DataProcessInstanceRunResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeResultType
     * 
     * @see DataProcessInstanceRunResult.Fields#nativeResultType
     */
    public boolean hasNativeResultType() {
        if (_nativeResultTypeField!= null) {
            return true;
        }
        return super._map.containsKey("nativeResultType");
    }

    /**
     * Remover for nativeResultType
     * 
     * @see DataProcessInstanceRunResult.Fields#nativeResultType
     */
    public void removeNativeResultType() {
        super._map.remove("nativeResultType");
    }

    /**
     * Getter for nativeResultType
     * 
     * @see DataProcessInstanceRunResult.Fields#nativeResultType
     */
    @Nullable
    public String getNativeResultType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNativeResultType();
            case DEFAULT:
            case NULL:
                if (_nativeResultTypeField!= null) {
                    return _nativeResultTypeField;
                } else {
                    Object __rawValue = super._map.get("nativeResultType");
                    _nativeResultTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nativeResultTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for nativeResultType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessInstanceRunResult.Fields#nativeResultType
     */
    @Nonnull
    public String getNativeResultType() {
        if (_nativeResultTypeField!= null) {
            return _nativeResultTypeField;
        } else {
            Object __rawValue = super._map.get("nativeResultType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("nativeResultType");
            }
            _nativeResultTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nativeResultTypeField;
        }
    }

    /**
     * Setter for nativeResultType
     * 
     * @see DataProcessInstanceRunResult.Fields#nativeResultType
     */
    public DataProcessInstanceRunResult setNativeResultType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeResultType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field nativeResultType of com.linkedin.dataprocess.DataProcessInstanceRunResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeResultType", value);
                    _nativeResultTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeResultType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeResultType", value);
                    _nativeResultTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeResultType", value);
                    _nativeResultTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeResultType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceRunResult.Fields#nativeResultType
     */
    public DataProcessInstanceRunResult setNativeResultType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeResultType of com.linkedin.dataprocess.DataProcessInstanceRunResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeResultType", value);
            _nativeResultTypeField = value;
        }
        return this;
    }

    @Override
    public DataProcessInstanceRunResult clone()
        throws CloneNotSupportedException
    {
        DataProcessInstanceRunResult __clone = ((DataProcessInstanceRunResult) super.clone());
        __clone.__changeListener = new DataProcessInstanceRunResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessInstanceRunResult copy()
        throws CloneNotSupportedException
    {
        DataProcessInstanceRunResult __copy = ((DataProcessInstanceRunResult) super.copy());
        __copy._nativeResultTypeField = null;
        __copy._typeField = null;
        __copy.__changeListener = new DataProcessInstanceRunResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessInstanceRunResult __objectRef;

        private ChangeListener(DataProcessInstanceRunResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "nativeResultType":
                    __objectRef._nativeResultTypeField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         *  The final result, e.g. SUCCESS, FAILURE, SKIPPED, or UP_FOR_RETRY.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * It identifies the system where the native result comes from like Airflow, Azkaban, etc..
         * 
         */
        public PathSpec nativeResultType() {
            return new PathSpec(getPathComponents(), "nativeResultType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         *  The final result, e.g. SUCCESS, FAILURE, SKIPPED, or UP_FOR_RETRY.
         * 
         */
        public DataProcessInstanceRunResult.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * It identifies the system where the native result comes from like Airflow, Azkaban, etc..
         * 
         */
        public DataProcessInstanceRunResult.ProjectionMask withNativeResultType() {
            getDataMap().put("nativeResultType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
