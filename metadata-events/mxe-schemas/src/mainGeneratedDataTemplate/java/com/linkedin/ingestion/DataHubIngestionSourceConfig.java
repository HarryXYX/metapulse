
package com.linkedin.ingestion;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ingestion/DataHubIngestionSourceInfo.pdl.")
public class DataHubIngestionSourceConfig
    extends RecordTemplate
{

    private final static DataHubIngestionSourceConfig.Fields _fields = new DataHubIngestionSourceConfig.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ingestion,record DataHubIngestionSourceConfig{/**The JSON recipe to use for ingestion*/recipe:string/**The PyPI version of the datahub CLI to use when executing a recipe*/version:optional string/**The id of the executor to use to execute the ingestion run*/@Searchable={\"fieldName\":\"sourceExecutorId\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}executorId:optional string/**Whether or not to run this ingestion source in debug mode*/debugMode:optional boolean/**Extra arguments for the ingestion run.*/extraArgs:optional map[string,string]}", SchemaFormatType.PDL));
    private String _recipeField = null;
    private String _versionField = null;
    private String _executorIdField = null;
    private Boolean _debugModeField = null;
    private StringMap _extraArgsField = null;
    private DataHubIngestionSourceConfig.ChangeListener __changeListener = new DataHubIngestionSourceConfig.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Recipe = SCHEMA.getField("recipe");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_ExecutorId = SCHEMA.getField("executorId");
    private final static RecordDataSchema.Field FIELD_DebugMode = SCHEMA.getField("debugMode");
    private final static RecordDataSchema.Field FIELD_ExtraArgs = SCHEMA.getField("extraArgs");

    public DataHubIngestionSourceConfig() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubIngestionSourceConfig(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubIngestionSourceConfig.Fields fields() {
        return _fields;
    }

    public static DataHubIngestionSourceConfig.ProjectionMask createMask() {
        return new DataHubIngestionSourceConfig.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for recipe
     * 
     * @see DataHubIngestionSourceConfig.Fields#recipe
     */
    public boolean hasRecipe() {
        if (_recipeField!= null) {
            return true;
        }
        return super._map.containsKey("recipe");
    }

    /**
     * Remover for recipe
     * 
     * @see DataHubIngestionSourceConfig.Fields#recipe
     */
    public void removeRecipe() {
        super._map.remove("recipe");
    }

    /**
     * Getter for recipe
     * 
     * @see DataHubIngestionSourceConfig.Fields#recipe
     */
    @Nullable
    public String getRecipe(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRecipe();
            case DEFAULT:
            case NULL:
                if (_recipeField!= null) {
                    return _recipeField;
                } else {
                    Object __rawValue = super._map.get("recipe");
                    _recipeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _recipeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for recipe
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubIngestionSourceConfig.Fields#recipe
     */
    @Nonnull
    public String getRecipe() {
        if (_recipeField!= null) {
            return _recipeField;
        } else {
            Object __rawValue = super._map.get("recipe");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("recipe");
            }
            _recipeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _recipeField;
        }
    }

    /**
     * Setter for recipe
     * 
     * @see DataHubIngestionSourceConfig.Fields#recipe
     */
    public DataHubIngestionSourceConfig setRecipe(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRecipe(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field recipe of com.linkedin.ingestion.DataHubIngestionSourceConfig");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "recipe", value);
                    _recipeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRecipe();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "recipe", value);
                    _recipeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "recipe", value);
                    _recipeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for recipe
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceConfig.Fields#recipe
     */
    public DataHubIngestionSourceConfig setRecipe(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field recipe of com.linkedin.ingestion.DataHubIngestionSourceConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "recipe", value);
            _recipeField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see DataHubIngestionSourceConfig.Fields#version
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
     * @see DataHubIngestionSourceConfig.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see DataHubIngestionSourceConfig.Fields#version
     */
    @Nullable
    public String getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceConfig.Fields#version
     */
    @Nullable
    public String getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see DataHubIngestionSourceConfig.Fields#version
     */
    public DataHubIngestionSourceConfig setVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see DataHubIngestionSourceConfig.Fields#version
     */
    public DataHubIngestionSourceConfig setVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.ingestion.DataHubIngestionSourceConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value);
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for executorId
     * 
     * @see DataHubIngestionSourceConfig.Fields#executorId
     */
    public boolean hasExecutorId() {
        if (_executorIdField!= null) {
            return true;
        }
        return super._map.containsKey("executorId");
    }

    /**
     * Remover for executorId
     * 
     * @see DataHubIngestionSourceConfig.Fields#executorId
     */
    public void removeExecutorId() {
        super._map.remove("executorId");
    }

    /**
     * Getter for executorId
     * 
     * @see DataHubIngestionSourceConfig.Fields#executorId
     */
    @Nullable
    public String getExecutorId(GetMode mode) {
        return getExecutorId();
    }

    /**
     * Getter for executorId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceConfig.Fields#executorId
     */
    @Nullable
    public String getExecutorId() {
        if (_executorIdField!= null) {
            return _executorIdField;
        } else {
            Object __rawValue = super._map.get("executorId");
            _executorIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _executorIdField;
        }
    }

    /**
     * Setter for executorId
     * 
     * @see DataHubIngestionSourceConfig.Fields#executorId
     */
    public DataHubIngestionSourceConfig setExecutorId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExecutorId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExecutorId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "executorId", value);
                    _executorIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "executorId", value);
                    _executorIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for executorId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceConfig.Fields#executorId
     */
    public DataHubIngestionSourceConfig setExecutorId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field executorId of com.linkedin.ingestion.DataHubIngestionSourceConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "executorId", value);
            _executorIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for debugMode
     * 
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    public boolean hasDebugMode() {
        if (_debugModeField!= null) {
            return true;
        }
        return super._map.containsKey("debugMode");
    }

    /**
     * Remover for debugMode
     * 
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    public void removeDebugMode() {
        super._map.remove("debugMode");
    }

    /**
     * Getter for debugMode
     * 
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    @Nullable
    public Boolean isDebugMode(GetMode mode) {
        return isDebugMode();
    }

    /**
     * Getter for debugMode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    @Nullable
    public Boolean isDebugMode() {
        if (_debugModeField!= null) {
            return _debugModeField;
        } else {
            Object __rawValue = super._map.get("debugMode");
            _debugModeField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _debugModeField;
        }
    }

    /**
     * Setter for debugMode
     * 
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    public DataHubIngestionSourceConfig setDebugMode(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDebugMode(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDebugMode();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "debugMode", value);
                    _debugModeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "debugMode", value);
                    _debugModeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for debugMode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    public DataHubIngestionSourceConfig setDebugMode(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field debugMode of com.linkedin.ingestion.DataHubIngestionSourceConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "debugMode", value);
            _debugModeField = value;
        }
        return this;
    }

    /**
     * Setter for debugMode
     * 
     * @see DataHubIngestionSourceConfig.Fields#debugMode
     */
    public DataHubIngestionSourceConfig setDebugMode(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "debugMode", value);
        _debugModeField = value;
        return this;
    }

    /**
     * Existence checker for extraArgs
     * 
     * @see DataHubIngestionSourceConfig.Fields#extraArgs
     */
    public boolean hasExtraArgs() {
        if (_extraArgsField!= null) {
            return true;
        }
        return super._map.containsKey("extraArgs");
    }

    /**
     * Remover for extraArgs
     * 
     * @see DataHubIngestionSourceConfig.Fields#extraArgs
     */
    public void removeExtraArgs() {
        super._map.remove("extraArgs");
    }

    /**
     * Getter for extraArgs
     * 
     * @see DataHubIngestionSourceConfig.Fields#extraArgs
     */
    @Nullable
    public StringMap getExtraArgs(GetMode mode) {
        return getExtraArgs();
    }

    /**
     * Getter for extraArgs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubIngestionSourceConfig.Fields#extraArgs
     */
    @Nullable
    public StringMap getExtraArgs() {
        if (_extraArgsField!= null) {
            return _extraArgsField;
        } else {
            Object __rawValue = super._map.get("extraArgs");
            _extraArgsField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _extraArgsField;
        }
    }

    /**
     * Setter for extraArgs
     * 
     * @see DataHubIngestionSourceConfig.Fields#extraArgs
     */
    public DataHubIngestionSourceConfig setExtraArgs(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExtraArgs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExtraArgs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "extraArgs", value.data());
                    _extraArgsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "extraArgs", value.data());
                    _extraArgsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for extraArgs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubIngestionSourceConfig.Fields#extraArgs
     */
    public DataHubIngestionSourceConfig setExtraArgs(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field extraArgs of com.linkedin.ingestion.DataHubIngestionSourceConfig to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "extraArgs", value.data());
            _extraArgsField = value;
        }
        return this;
    }

    @Override
    public DataHubIngestionSourceConfig clone()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceConfig __clone = ((DataHubIngestionSourceConfig) super.clone());
        __clone.__changeListener = new DataHubIngestionSourceConfig.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubIngestionSourceConfig copy()
        throws CloneNotSupportedException
    {
        DataHubIngestionSourceConfig __copy = ((DataHubIngestionSourceConfig) super.copy());
        __copy._extraArgsField = null;
        __copy._executorIdField = null;
        __copy._recipeField = null;
        __copy._versionField = null;
        __copy._debugModeField = null;
        __copy.__changeListener = new DataHubIngestionSourceConfig.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubIngestionSourceConfig __objectRef;

        private ChangeListener(DataHubIngestionSourceConfig reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "extraArgs":
                    __objectRef._extraArgsField = null;
                    break;
                case "executorId":
                    __objectRef._executorIdField = null;
                    break;
                case "recipe":
                    __objectRef._recipeField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "debugMode":
                    __objectRef._debugModeField = null;
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
         * The JSON recipe to use for ingestion
         * 
         */
        public PathSpec recipe() {
            return new PathSpec(getPathComponents(), "recipe");
        }

        /**
         * The PyPI version of the datahub CLI to use when executing a recipe
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * The id of the executor to use to execute the ingestion run
         * 
         */
        public PathSpec executorId() {
            return new PathSpec(getPathComponents(), "executorId");
        }

        /**
         * Whether or not to run this ingestion source in debug mode
         * 
         */
        public PathSpec debugMode() {
            return new PathSpec(getPathComponents(), "debugMode");
        }

        /**
         * Extra arguments for the ingestion run.
         * 
         */
        public PathSpec extraArgs() {
            return new PathSpec(getPathComponents(), "extraArgs");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * The JSON recipe to use for ingestion
         * 
         */
        public DataHubIngestionSourceConfig.ProjectionMask withRecipe() {
            getDataMap().put("recipe", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The PyPI version of the datahub CLI to use when executing a recipe
         * 
         */
        public DataHubIngestionSourceConfig.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The id of the executor to use to execute the ingestion run
         * 
         */
        public DataHubIngestionSourceConfig.ProjectionMask withExecutorId() {
            getDataMap().put("executorId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether or not to run this ingestion source in debug mode
         * 
         */
        public DataHubIngestionSourceConfig.ProjectionMask withDebugMode() {
            getDataMap().put("debugMode", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Extra arguments for the ingestion run.
         * 
         */
        public DataHubIngestionSourceConfig.ProjectionMask withExtraArgs() {
            getDataMap().put("extraArgs", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
