
package com.linkedin.execution;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * An signal sent to a running execution request
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/execution/ExecutionRequestSignal.pdl.")
public class ExecutionRequestSignal
    extends RecordTemplate
{

    private final static ExecutionRequestSignal.Fields _fields = new ExecutionRequestSignal.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.execution/**An signal sent to a running execution request*/@Aspect.name=\"dataHubExecutionRequestSignal\"record ExecutionRequestSignal{/**The signal to issue, e.g. KILL*/signal:string/**Advanced: specify a specific executor to route the request to. If none is provided, a \"default\" executor is used.*/executorId:optional string/**Audit Stamp*/createdAt:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private String _signalField = null;
    private String _executorIdField = null;
    private AuditStamp _createdAtField = null;
    private ExecutionRequestSignal.ChangeListener __changeListener = new ExecutionRequestSignal.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Signal = SCHEMA.getField("signal");
    private final static RecordDataSchema.Field FIELD_ExecutorId = SCHEMA.getField("executorId");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");

    public ExecutionRequestSignal() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ExecutionRequestSignal(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ExecutionRequestSignal.Fields fields() {
        return _fields;
    }

    public static ExecutionRequestSignal.ProjectionMask createMask() {
        return new ExecutionRequestSignal.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for signal
     * 
     * @see ExecutionRequestSignal.Fields#signal
     */
    public boolean hasSignal() {
        if (_signalField!= null) {
            return true;
        }
        return super._map.containsKey("signal");
    }

    /**
     * Remover for signal
     * 
     * @see ExecutionRequestSignal.Fields#signal
     */
    public void removeSignal() {
        super._map.remove("signal");
    }

    /**
     * Getter for signal
     * 
     * @see ExecutionRequestSignal.Fields#signal
     */
    @Nullable
    public String getSignal(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSignal();
            case DEFAULT:
            case NULL:
                if (_signalField!= null) {
                    return _signalField;
                } else {
                    Object __rawValue = super._map.get("signal");
                    _signalField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _signalField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for signal
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestSignal.Fields#signal
     */
    @Nonnull
    public String getSignal() {
        if (_signalField!= null) {
            return _signalField;
        } else {
            Object __rawValue = super._map.get("signal");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("signal");
            }
            _signalField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _signalField;
        }
    }

    /**
     * Setter for signal
     * 
     * @see ExecutionRequestSignal.Fields#signal
     */
    public ExecutionRequestSignal setSignal(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSignal(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field signal of com.linkedin.execution.ExecutionRequestSignal");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "signal", value);
                    _signalField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSignal();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "signal", value);
                    _signalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "signal", value);
                    _signalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for signal
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestSignal.Fields#signal
     */
    public ExecutionRequestSignal setSignal(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field signal of com.linkedin.execution.ExecutionRequestSignal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "signal", value);
            _signalField = value;
        }
        return this;
    }

    /**
     * Existence checker for executorId
     * 
     * @see ExecutionRequestSignal.Fields#executorId
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
     * @see ExecutionRequestSignal.Fields#executorId
     */
    public void removeExecutorId() {
        super._map.remove("executorId");
    }

    /**
     * Getter for executorId
     * 
     * @see ExecutionRequestSignal.Fields#executorId
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
     * @see ExecutionRequestSignal.Fields#executorId
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
     * @see ExecutionRequestSignal.Fields#executorId
     */
    public ExecutionRequestSignal setExecutorId(
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
     * @see ExecutionRequestSignal.Fields#executorId
     */
    public ExecutionRequestSignal setExecutorId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field executorId of com.linkedin.execution.ExecutionRequestSignal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "executorId", value);
            _executorIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see ExecutionRequestSignal.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        if (_createdAtField!= null) {
            return true;
        }
        return super._map.containsKey("createdAt");
    }

    /**
     * Remover for createdAt
     * 
     * @see ExecutionRequestSignal.Fields#createdAt
     */
    public void removeCreatedAt() {
        super._map.remove("createdAt");
    }

    /**
     * Getter for createdAt
     * 
     * @see ExecutionRequestSignal.Fields#createdAt
     */
    @Nullable
    public AuditStamp getCreatedAt(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreatedAt();
            case DEFAULT:
            case NULL:
                if (_createdAtField!= null) {
                    return _createdAtField;
                } else {
                    Object __rawValue = super._map.get("createdAt");
                    _createdAtField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createdAtField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExecutionRequestSignal.Fields#createdAt
     */
    @Nonnull
    public AuditStamp getCreatedAt() {
        if (_createdAtField!= null) {
            return _createdAtField;
        } else {
            Object __rawValue = super._map.get("createdAt");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("createdAt");
            }
            _createdAtField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdAtField;
        }
    }

    /**
     * Setter for createdAt
     * 
     * @see ExecutionRequestSignal.Fields#createdAt
     */
    public ExecutionRequestSignal setCreatedAt(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreatedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field createdAt of com.linkedin.execution.ExecutionRequestSignal");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", value.data());
                    _createdAtField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreatedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", value.data());
                    _createdAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", value.data());
                    _createdAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExecutionRequestSignal.Fields#createdAt
     */
    public ExecutionRequestSignal setCreatedAt(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createdAt of com.linkedin.execution.ExecutionRequestSignal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createdAt", value.data());
            _createdAtField = value;
        }
        return this;
    }

    @Override
    public ExecutionRequestSignal clone()
        throws CloneNotSupportedException
    {
        ExecutionRequestSignal __clone = ((ExecutionRequestSignal) super.clone());
        __clone.__changeListener = new ExecutionRequestSignal.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ExecutionRequestSignal copy()
        throws CloneNotSupportedException
    {
        ExecutionRequestSignal __copy = ((ExecutionRequestSignal) super.copy());
        __copy._createdAtField = null;
        __copy._executorIdField = null;
        __copy._signalField = null;
        __copy.__changeListener = new ExecutionRequestSignal.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ExecutionRequestSignal __objectRef;

        private ChangeListener(ExecutionRequestSignal reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "createdAt":
                    __objectRef._createdAtField = null;
                    break;
                case "executorId":
                    __objectRef._executorIdField = null;
                    break;
                case "signal":
                    __objectRef._signalField = null;
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
         * The signal to issue, e.g. KILL
         * 
         */
        public PathSpec signal() {
            return new PathSpec(getPathComponents(), "signal");
        }

        /**
         * Advanced: specify a specific executor to route the request to. If none is provided, a "default" executor is used.
         * 
         */
        public PathSpec executorId() {
            return new PathSpec(getPathComponents(), "executorId");
        }

        /**
         * Audit Stamp
         * 
         */
        public com.linkedin.common.AuditStamp.Fields createdAt() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "createdAt");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _createdAtMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The signal to issue, e.g. KILL
         * 
         */
        public ExecutionRequestSignal.ProjectionMask withSignal() {
            getDataMap().put("signal", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Advanced: specify a specific executor to route the request to. If none is provided, a "default" executor is used.
         * 
         */
        public ExecutionRequestSignal.ProjectionMask withExecutorId() {
            getDataMap().put("executorId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit Stamp
         * 
         */
        public ExecutionRequestSignal.ProjectionMask withCreatedAt(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdAtMask = nestedMask.apply(((_createdAtMask == null)?AuditStamp.createMask():_createdAtMask));
            getDataMap().put("createdAt", _createdAtMask.getDataMap());
            return this;
        }

        /**
         * Audit Stamp
         * 
         */
        public ExecutionRequestSignal.ProjectionMask withCreatedAt(MaskMap nestedMask) {
            getDataMap().put("createdAt", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit Stamp
         * 
         */
        public ExecutionRequestSignal.ProjectionMask withCreatedAt() {
            _createdAtMask = null;
            getDataMap().put("createdAt", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
