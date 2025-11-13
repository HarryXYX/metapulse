
package com.linkedin.dataprocess;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.DatasetUrnArray;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * The inputs and outputs of this data process
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataprocess/DataProcessInfo.pdl.")
public class DataProcessInfo
    extends RecordTemplate
{

    private final static DataProcessInfo.Fields _fields = new DataProcessInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputs:optional array[com.linkedin.common.DatasetUrn]}", SchemaFormatType.PDL));
    private DatasetUrnArray _inputsField = null;
    private DatasetUrnArray _outputsField = null;
    private DataProcessInfo.ChangeListener __changeListener = new DataProcessInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_Outputs = SCHEMA.getField("outputs");

    public DataProcessInfo() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataProcessInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProcessInfo.Fields fields() {
        return _fields;
    }

    public static DataProcessInfo.ProjectionMask createMask() {
        return new DataProcessInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public boolean hasInputs() {
        if (_inputsField!= null) {
            return true;
        }
        return super._map.containsKey("inputs");
    }

    /**
     * Remover for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public void removeInputs() {
        super._map.remove("inputs");
    }

    /**
     * Getter for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    @Nullable
    public DatasetUrnArray getInputs(GetMode mode) {
        return getInputs();
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInfo.Fields#inputs
     */
    @Nullable
    public DatasetUrnArray getInputs() {
        if (_inputsField!= null) {
            return _inputsField;
        } else {
            Object __rawValue = super._map.get("inputs");
            _inputsField = ((__rawValue == null)?null:new DatasetUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputsField;
        }
    }

    /**
     * Setter for inputs
     * 
     * @see DataProcessInfo.Fields#inputs
     */
    public DataProcessInfo setInputs(
        @Nullable
        DatasetUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInfo.Fields#inputs
     */
    public DataProcessInfo setInputs(
        @Nonnull
        DatasetUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputs of com.linkedin.dataprocess.DataProcessInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
            _inputsField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public boolean hasOutputs() {
        if (_outputsField!= null) {
            return true;
        }
        return super._map.containsKey("outputs");
    }

    /**
     * Remover for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public void removeOutputs() {
        super._map.remove("outputs");
    }

    /**
     * Getter for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    @Nullable
    public DatasetUrnArray getOutputs(GetMode mode) {
        return getOutputs();
    }

    /**
     * Getter for outputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInfo.Fields#outputs
     */
    @Nullable
    public DatasetUrnArray getOutputs() {
        if (_outputsField!= null) {
            return _outputsField;
        } else {
            Object __rawValue = super._map.get("outputs");
            _outputsField = ((__rawValue == null)?null:new DatasetUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputsField;
        }
    }

    /**
     * Setter for outputs
     * 
     * @see DataProcessInfo.Fields#outputs
     */
    public DataProcessInfo setOutputs(
        @Nullable
        DatasetUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
                    _outputsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
                    _outputsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInfo.Fields#outputs
     */
    public DataProcessInfo setOutputs(
        @Nonnull
        DatasetUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputs of com.linkedin.dataprocess.DataProcessInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
            _outputsField = value;
        }
        return this;
    }

    @Override
    public DataProcessInfo clone()
        throws CloneNotSupportedException
    {
        DataProcessInfo __clone = ((DataProcessInfo) super.clone());
        __clone.__changeListener = new DataProcessInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessInfo copy()
        throws CloneNotSupportedException
    {
        DataProcessInfo __copy = ((DataProcessInfo) super.copy());
        __copy._outputsField = null;
        __copy._inputsField = null;
        __copy.__changeListener = new DataProcessInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessInfo __objectRef;

        private ChangeListener(DataProcessInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "outputs":
                    __objectRef._outputsField = null;
                    break;
                case "inputs":
                    __objectRef._inputsField = null;
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
         * the inputs of the data process
         * 
         */
        public PathSpec inputs() {
            return new PathSpec(getPathComponents(), "inputs");
        }

        /**
         * the inputs of the data process
         * 
         */
        public PathSpec inputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * the outputs of the data process
         * 
         */
        public PathSpec outputs() {
            return new PathSpec(getPathComponents(), "outputs");
        }

        /**
         * the outputs of the data process
         * 
         */
        public PathSpec outputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * the inputs of the data process
         * 
         */
        public DataProcessInfo.ProjectionMask withInputs() {
            getDataMap().put("inputs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * the inputs of the data process
         * 
         */
        public DataProcessInfo.ProjectionMask withInputs(Integer start, Integer count) {
            getDataMap().put("inputs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputs").put("$count", count);
            }
            return this;
        }

        /**
         * the outputs of the data process
         * 
         */
        public DataProcessInfo.ProjectionMask withOutputs() {
            getDataMap().put("outputs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * the outputs of the data process
         * 
         */
        public DataProcessInfo.ProjectionMask withOutputs(Integer start, Integer count) {
            getDataMap().put("outputs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputs").put("$count", count);
            }
            return this;
        }

    }

}
