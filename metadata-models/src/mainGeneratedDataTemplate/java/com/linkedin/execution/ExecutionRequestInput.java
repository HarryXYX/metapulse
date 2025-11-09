
package com.linkedin.execution;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * An request to execution some remote logic or action.
 * TODO: Determine who is responsible for emitting execution request success or failure. Executor?
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/execution/ExecutionRequestInput.pdl.")
public class ExecutionRequestInput
    extends RecordTemplate
{

    private final static ExecutionRequestInput.Fields _fields = new ExecutionRequestInput.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.execution/**An request to execution some remote logic or action.\nTODO: Determine who is responsible for emitting execution request success or failure. Executor?*/@Aspect.name=\"dataHubExecutionRequestInput\"record ExecutionRequestInput{/**The name of the task to execute, for example RUN_INGEST*/task:string/**Arguments provided to the task*/args:map[string,string]/**Advanced: specify a specific executor to route the request to. If none is provided, a \"default\" executor is used.*/@Searchable={\"fieldName\":\"executorId\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}executorId:string/**Source which created the execution request*/source:record ExecutionRequestSource{/**The type of the execution request source, e.g. INGESTION_SOURCE*/type:string/**The urn of the ingestion source associated with the ingestion request. Present if type is INGESTION_SOURCE*/@Relationship={\"entityTypes\":[\"dataHubIngestionSource\"],\"name\":\"ingestionSource\"}@Searchable={\"fieldName\":\"ingestionSource\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}ingestionSource:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Time at which the execution request input was created*/@Searchable={\"fieldName\":\"requestTimeMs\",\"fieldType\":\"COUNT\",\"queryByDefault\":false}requestedAt:long/**Urn of the actor who created this execution request.*/@Searchable.fieldType=\"URN\"actorUrn:optional com.linkedin.common.Urn}", SchemaFormatType.PDL));
    private String _taskField = null;
    private StringMap _argsField = null;
    private String _executorIdField = null;
    private ExecutionRequestSource _sourceField = null;
    private Long _requestedAtField = null;
    private com.linkedin.common.urn.Urn _actorUrnField = null;
    private ExecutionRequestInput.ChangeListener __changeListener = new ExecutionRequestInput.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Task = SCHEMA.getField("task");
    private final static RecordDataSchema.Field FIELD_Args = SCHEMA.getField("args");
    private final static RecordDataSchema.Field FIELD_ExecutorId = SCHEMA.getField("executorId");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_RequestedAt = SCHEMA.getField("requestedAt");
    private final static RecordDataSchema.Field FIELD_ActorUrn = SCHEMA.getField("actorUrn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public ExecutionRequestInput() {
        super(new DataMap(8, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public ExecutionRequestInput(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ExecutionRequestInput.Fields fields() {
        return _fields;
    }

    public static ExecutionRequestInput.ProjectionMask createMask() {
        return new ExecutionRequestInput.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for task
     * 
     * @see ExecutionRequestInput.Fields#task
     */
    public boolean hasTask() {
        if (_taskField!= null) {
            return true;
        }
        return super._map.containsKey("task");
    }

    /**
     * Remover for task
     * 
     * @see ExecutionRequestInput.Fields#task
     */
    public void removeTask() {
        super._map.remove("task");
    }

    /**
     * Getter for task
     * 
     * @see ExecutionRequestInput.Fields#task
     */
    @Nullable
    public String getTask(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTask();
            case DEFAULT:
            case NULL:
                if (_taskField!= null) {
                    return _taskField;
                } else {
                    Object __rawValue = super._map.get("task");
                    _taskField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _taskField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for task
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestInput.Fields#task
     */
    @Nonnull
    public String getTask() {
        if (_taskField!= null) {
            return _taskField;
        } else {
            Object __rawValue = super._map.get("task");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("task");
            }
            _taskField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _taskField;
        }
    }

    /**
     * Setter for task
     * 
     * @see ExecutionRequestInput.Fields#task
     */
    public ExecutionRequestInput setTask(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTask(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field task of com.linkedin.execution.ExecutionRequestInput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "task", value);
                    _taskField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTask();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "task", value);
                    _taskField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "task", value);
                    _taskField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for task
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestInput.Fields#task
     */
    public ExecutionRequestInput setTask(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field task of com.linkedin.execution.ExecutionRequestInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "task", value);
            _taskField = value;
        }
        return this;
    }

    /**
     * Existence checker for args
     * 
     * @see ExecutionRequestInput.Fields#args
     */
    public boolean hasArgs() {
        if (_argsField!= null) {
            return true;
        }
        return super._map.containsKey("args");
    }

    /**
     * Remover for args
     * 
     * @see ExecutionRequestInput.Fields#args
     */
    public void removeArgs() {
        super._map.remove("args");
    }

    /**
     * Getter for args
     * 
     * @see ExecutionRequestInput.Fields#args
     */
    @Nullable
    public StringMap getArgs(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getArgs();
            case DEFAULT:
            case NULL:
                if (_argsField!= null) {
                    return _argsField;
                } else {
                    Object __rawValue = super._map.get("args");
                    _argsField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _argsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for args
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestInput.Fields#args
     */
    @Nonnull
    public StringMap getArgs() {
        if (_argsField!= null) {
            return _argsField;
        } else {
            Object __rawValue = super._map.get("args");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("args");
            }
            _argsField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _argsField;
        }
    }

    /**
     * Setter for args
     * 
     * @see ExecutionRequestInput.Fields#args
     */
    public ExecutionRequestInput setArgs(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setArgs(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field args of com.linkedin.execution.ExecutionRequestInput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "args", value.data());
                    _argsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeArgs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "args", value.data());
                    _argsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "args", value.data());
                    _argsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for args
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestInput.Fields#args
     */
    public ExecutionRequestInput setArgs(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field args of com.linkedin.execution.ExecutionRequestInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "args", value.data());
            _argsField = value;
        }
        return this;
    }

    /**
     * Existence checker for executorId
     * 
     * @see ExecutionRequestInput.Fields#executorId
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
     * @see ExecutionRequestInput.Fields#executorId
     */
    public void removeExecutorId() {
        super._map.remove("executorId");
    }

    /**
     * Getter for executorId
     * 
     * @see ExecutionRequestInput.Fields#executorId
     */
    @Nullable
    public String getExecutorId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getExecutorId();
            case DEFAULT:
            case NULL:
                if (_executorIdField!= null) {
                    return _executorIdField;
                } else {
                    Object __rawValue = super._map.get("executorId");
                    _executorIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _executorIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for executorId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestInput.Fields#executorId
     */
    @Nonnull
    public String getExecutorId() {
        if (_executorIdField!= null) {
            return _executorIdField;
        } else {
            Object __rawValue = super._map.get("executorId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("executorId");
            }
            _executorIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _executorIdField;
        }
    }

    /**
     * Setter for executorId
     * 
     * @see ExecutionRequestInput.Fields#executorId
     */
    public ExecutionRequestInput setExecutorId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExecutorId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field executorId of com.linkedin.execution.ExecutionRequestInput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "executorId", value);
                    _executorIdField = value;
                }
                break;
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
     * @see ExecutionRequestInput.Fields#executorId
     */
    public ExecutionRequestInput setExecutorId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field executorId of com.linkedin.execution.ExecutionRequestInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "executorId", value);
            _executorIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see ExecutionRequestInput.Fields#source
     */
    public boolean hasSource() {
        if (_sourceField!= null) {
            return true;
        }
        return super._map.containsKey("source");
    }

    /**
     * Remover for source
     * 
     * @see ExecutionRequestInput.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see ExecutionRequestInput.Fields#source
     */
    @Nullable
    public ExecutionRequestSource getSource(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSource();
            case DEFAULT:
            case NULL:
                if (_sourceField!= null) {
                    return _sourceField;
                } else {
                    Object __rawValue = super._map.get("source");
                    _sourceField = ((__rawValue == null)?null:new ExecutionRequestSource(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _sourceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for source
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestInput.Fields#source
     */
    @Nonnull
    public ExecutionRequestSource getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("source");
            }
            _sourceField = ((__rawValue == null)?null:new ExecutionRequestSource(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see ExecutionRequestInput.Fields#source
     */
    public ExecutionRequestInput setSource(
        @Nullable
        ExecutionRequestSource value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field source of com.linkedin.execution.ExecutionRequestInput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "source", value.data());
                    _sourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestInput.Fields#source
     */
    public ExecutionRequestInput setSource(
        @Nonnull
        ExecutionRequestSource value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.execution.ExecutionRequestInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", value.data());
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for requestedAt
     * 
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    public boolean hasRequestedAt() {
        if (_requestedAtField!= null) {
            return true;
        }
        return super._map.containsKey("requestedAt");
    }

    /**
     * Remover for requestedAt
     * 
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    public void removeRequestedAt() {
        super._map.remove("requestedAt");
    }

    /**
     * Getter for requestedAt
     * 
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    @Nullable
    public Long getRequestedAt(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRequestedAt();
            case DEFAULT:
            case NULL:
                if (_requestedAtField!= null) {
                    return _requestedAtField;
                } else {
                    Object __rawValue = super._map.get("requestedAt");
                    _requestedAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _requestedAtField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for requestedAt
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    @Nonnull
    public Long getRequestedAt() {
        if (_requestedAtField!= null) {
            return _requestedAtField;
        } else {
            Object __rawValue = super._map.get("requestedAt");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("requestedAt");
            }
            _requestedAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _requestedAtField;
        }
    }

    /**
     * Setter for requestedAt
     * 
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    public ExecutionRequestInput setRequestedAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRequestedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field requestedAt of com.linkedin.execution.ExecutionRequestInput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "requestedAt", DataTemplateUtil.coerceLongInput(value));
                    _requestedAtField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRequestedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "requestedAt", DataTemplateUtil.coerceLongInput(value));
                    _requestedAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "requestedAt", DataTemplateUtil.coerceLongInput(value));
                    _requestedAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for requestedAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    public ExecutionRequestInput setRequestedAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field requestedAt of com.linkedin.execution.ExecutionRequestInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "requestedAt", DataTemplateUtil.coerceLongInput(value));
            _requestedAtField = value;
        }
        return this;
    }

    /**
     * Setter for requestedAt
     * 
     * @see ExecutionRequestInput.Fields#requestedAt
     */
    public ExecutionRequestInput setRequestedAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "requestedAt", DataTemplateUtil.coerceLongInput(value));
        _requestedAtField = value;
        return this;
    }

    /**
     * Existence checker for actorUrn
     * 
     * @see ExecutionRequestInput.Fields#actorUrn
     */
    public boolean hasActorUrn() {
        if (_actorUrnField!= null) {
            return true;
        }
        return super._map.containsKey("actorUrn");
    }

    /**
     * Remover for actorUrn
     * 
     * @see ExecutionRequestInput.Fields#actorUrn
     */
    public void removeActorUrn() {
        super._map.remove("actorUrn");
    }

    /**
     * Getter for actorUrn
     * 
     * @see ExecutionRequestInput.Fields#actorUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActorUrn(GetMode mode) {
        return getActorUrn();
    }

    /**
     * Getter for actorUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see ExecutionRequestInput.Fields#actorUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActorUrn() {
        if (_actorUrnField!= null) {
            return _actorUrnField;
        } else {
            Object __rawValue = super._map.get("actorUrn");
            _actorUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorUrnField;
        }
    }

    /**
     * Setter for actorUrn
     * 
     * @see ExecutionRequestInput.Fields#actorUrn
     */
    public ExecutionRequestInput setActorUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActorUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActorUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actorUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestInput.Fields#actorUrn
     */
    public ExecutionRequestInput setActorUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actorUrn of com.linkedin.execution.ExecutionRequestInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actorUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorUrnField = value;
        }
        return this;
    }

    @Override
    public ExecutionRequestInput clone()
        throws CloneNotSupportedException
    {
        ExecutionRequestInput __clone = ((ExecutionRequestInput) super.clone());
        __clone.__changeListener = new ExecutionRequestInput.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ExecutionRequestInput copy()
        throws CloneNotSupportedException
    {
        ExecutionRequestInput __copy = ((ExecutionRequestInput) super.copy());
        __copy._argsField = null;
        __copy._actorUrnField = null;
        __copy._taskField = null;
        __copy._executorIdField = null;
        __copy._requestedAtField = null;
        __copy._sourceField = null;
        __copy.__changeListener = new ExecutionRequestInput.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ExecutionRequestInput __objectRef;

        private ChangeListener(ExecutionRequestInput reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "args":
                    __objectRef._argsField = null;
                    break;
                case "actorUrn":
                    __objectRef._actorUrnField = null;
                    break;
                case "task":
                    __objectRef._taskField = null;
                    break;
                case "executorId":
                    __objectRef._executorIdField = null;
                    break;
                case "requestedAt":
                    __objectRef._requestedAtField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
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
         * The name of the task to execute, for example RUN_INGEST
         * 
         */
        public PathSpec task() {
            return new PathSpec(getPathComponents(), "task");
        }

        /**
         * Arguments provided to the task
         * 
         */
        public PathSpec args() {
            return new PathSpec(getPathComponents(), "args");
        }

        /**
         * Advanced: specify a specific executor to route the request to. If none is provided, a "default" executor is used.
         * 
         */
        public PathSpec executorId() {
            return new PathSpec(getPathComponents(), "executorId");
        }

        /**
         * Source which created the execution request
         * 
         */
        public com.linkedin.execution.ExecutionRequestSource.Fields source() {
            return new com.linkedin.execution.ExecutionRequestSource.Fields(getPathComponents(), "source");
        }

        /**
         * Time at which the execution request input was created
         * 
         */
        public PathSpec requestedAt() {
            return new PathSpec(getPathComponents(), "requestedAt");
        }

        /**
         * Urn of the actor who created this execution request.
         * 
         */
        public PathSpec actorUrn() {
            return new PathSpec(getPathComponents(), "actorUrn");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.execution.ExecutionRequestSource.ProjectionMask _sourceMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * The name of the task to execute, for example RUN_INGEST
         * 
         */
        public ExecutionRequestInput.ProjectionMask withTask() {
            getDataMap().put("task", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Arguments provided to the task
         * 
         */
        public ExecutionRequestInput.ProjectionMask withArgs() {
            getDataMap().put("args", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Advanced: specify a specific executor to route the request to. If none is provided, a "default" executor is used.
         * 
         */
        public ExecutionRequestInput.ProjectionMask withExecutorId() {
            getDataMap().put("executorId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Source which created the execution request
         * 
         */
        public ExecutionRequestInput.ProjectionMask withSource(Function<com.linkedin.execution.ExecutionRequestSource.ProjectionMask, com.linkedin.execution.ExecutionRequestSource.ProjectionMask> nestedMask) {
            _sourceMask = nestedMask.apply(((_sourceMask == null)?ExecutionRequestSource.createMask():_sourceMask));
            getDataMap().put("source", _sourceMask.getDataMap());
            return this;
        }

        /**
         * Source which created the execution request
         * 
         */
        public ExecutionRequestInput.ProjectionMask withSource() {
            _sourceMask = null;
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Time at which the execution request input was created
         * 
         */
        public ExecutionRequestInput.ProjectionMask withRequestedAt() {
            getDataMap().put("requestedAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the actor who created this execution request.
         * 
         */
        public ExecutionRequestInput.ProjectionMask withActorUrn() {
            getDataMap().put("actorUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
