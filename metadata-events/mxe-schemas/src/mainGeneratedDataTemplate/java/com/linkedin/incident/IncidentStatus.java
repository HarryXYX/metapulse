
package com.linkedin.incident;

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
 * Information about an incident raised on an asset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/incident/IncidentStatus.pdl.")
public class IncidentStatus
    extends RecordTemplate
{

    private final static IncidentStatus.Fields _fields = new IncidentStatus.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident/**Information about an incident raised on an asset*/record IncidentStatus{/**The top-level state of the incident, whether it's active or resolved.*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Status\"}state:enum IncidentState{/**The incident is ongoing, or active.*/ACTIVE/**The incident is resolved.*/RESOLVED}/**The lifecycle stage for the incident - Null means no stage was assigned yet.\nIn the future, we may add CUSTOM here with a customStage string field for user-defined stages.*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Stage\"}stage:optional enum IncidentStage{/**The impact and priority of the incident is being actively assessed.*/TRIAGE/**The incident root cause is being investigated.*/INVESTIGATION/**The incident is in the remediation stage.*/WORK_IN_PROGRESS/**The incident is in the resolved as completed stage.*/FIXED/**The incident is in the resolved with no action required state, e.g. the\nincident was a false positive, or was expected.*/NO_ACTION_REQUIRED}/**Optional message associated with the incident*/message:optional string/**The time at which the request was initially created*/@Searchable.`/time`={\"fieldName\":\"lastUpdated\",\"fieldType\":\"COUNT\"}lastUpdated:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private IncidentState _stateField = null;
    private IncidentStage _stageField = null;
    private String _messageField = null;
    private AuditStamp _lastUpdatedField = null;
    private IncidentStatus.ChangeListener __changeListener = new IncidentStatus.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_State = SCHEMA.getField("state");
    private final static RecordDataSchema.Field FIELD_Stage = SCHEMA.getField("stage");
    private final static RecordDataSchema.Field FIELD_Message = SCHEMA.getField("message");
    private final static RecordDataSchema.Field FIELD_LastUpdated = SCHEMA.getField("lastUpdated");

    public IncidentStatus() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public IncidentStatus(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncidentStatus.Fields fields() {
        return _fields;
    }

    public static IncidentStatus.ProjectionMask createMask() {
        return new IncidentStatus.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for state
     * 
     * @see IncidentStatus.Fields#state
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
     * @see IncidentStatus.Fields#state
     */
    public void removeState() {
        super._map.remove("state");
    }

    /**
     * Getter for state
     * 
     * @see IncidentStatus.Fields#state
     */
    @Nullable
    public IncidentState getState(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getState();
            case DEFAULT:
            case NULL:
                if (_stateField!= null) {
                    return _stateField;
                } else {
                    Object __rawValue = super._map.get("state");
                    _stateField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentState.class, IncidentState.$UNKNOWN);
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
     * @see IncidentStatus.Fields#state
     */
    @Nonnull
    public IncidentState getState() {
        if (_stateField!= null) {
            return _stateField;
        } else {
            Object __rawValue = super._map.get("state");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("state");
            }
            _stateField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentState.class, IncidentState.$UNKNOWN);
            return _stateField;
        }
    }

    /**
     * Setter for state
     * 
     * @see IncidentStatus.Fields#state
     */
    public IncidentStatus setState(
        @Nullable
        IncidentState value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setState(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field state of com.linkedin.incident.IncidentStatus");
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
     * @see IncidentStatus.Fields#state
     */
    public IncidentStatus setState(
        @Nonnull
        IncidentState value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field state of com.linkedin.incident.IncidentStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "state", value.name());
            _stateField = value;
        }
        return this;
    }

    /**
     * Existence checker for stage
     * 
     * @see IncidentStatus.Fields#stage
     */
    public boolean hasStage() {
        if (_stageField!= null) {
            return true;
        }
        return super._map.containsKey("stage");
    }

    /**
     * Remover for stage
     * 
     * @see IncidentStatus.Fields#stage
     */
    public void removeStage() {
        super._map.remove("stage");
    }

    /**
     * Getter for stage
     * 
     * @see IncidentStatus.Fields#stage
     */
    @Nullable
    public IncidentStage getStage(GetMode mode) {
        return getStage();
    }

    /**
     * Getter for stage
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentStatus.Fields#stage
     */
    @Nullable
    public IncidentStage getStage() {
        if (_stageField!= null) {
            return _stageField;
        } else {
            Object __rawValue = super._map.get("stage");
            _stageField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentStage.class, IncidentStage.$UNKNOWN);
            return _stageField;
        }
    }

    /**
     * Setter for stage
     * 
     * @see IncidentStatus.Fields#stage
     */
    public IncidentStatus setStage(
        @Nullable
        IncidentStage value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStage(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "stage", value.name());
                    _stageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "stage", value.name());
                    _stageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for stage
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentStatus.Fields#stage
     */
    public IncidentStatus setStage(
        @Nonnull
        IncidentStage value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field stage of com.linkedin.incident.IncidentStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "stage", value.name());
            _stageField = value;
        }
        return this;
    }

    /**
     * Existence checker for message
     * 
     * @see IncidentStatus.Fields#message
     */
    public boolean hasMessage() {
        if (_messageField!= null) {
            return true;
        }
        return super._map.containsKey("message");
    }

    /**
     * Remover for message
     * 
     * @see IncidentStatus.Fields#message
     */
    public void removeMessage() {
        super._map.remove("message");
    }

    /**
     * Getter for message
     * 
     * @see IncidentStatus.Fields#message
     */
    @Nullable
    public String getMessage(GetMode mode) {
        return getMessage();
    }

    /**
     * Getter for message
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentStatus.Fields#message
     */
    @Nullable
    public String getMessage() {
        if (_messageField!= null) {
            return _messageField;
        } else {
            Object __rawValue = super._map.get("message");
            _messageField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _messageField;
        }
    }

    /**
     * Setter for message
     * 
     * @see IncidentStatus.Fields#message
     */
    public IncidentStatus setMessage(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMessage(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMessage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "message", value);
                    _messageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "message", value);
                    _messageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for message
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentStatus.Fields#message
     */
    public IncidentStatus setMessage(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field message of com.linkedin.incident.IncidentStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "message", value);
            _messageField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastUpdated
     * 
     * @see IncidentStatus.Fields#lastUpdated
     */
    public boolean hasLastUpdated() {
        if (_lastUpdatedField!= null) {
            return true;
        }
        return super._map.containsKey("lastUpdated");
    }

    /**
     * Remover for lastUpdated
     * 
     * @see IncidentStatus.Fields#lastUpdated
     */
    public void removeLastUpdated() {
        super._map.remove("lastUpdated");
    }

    /**
     * Getter for lastUpdated
     * 
     * @see IncidentStatus.Fields#lastUpdated
     */
    @Nullable
    public AuditStamp getLastUpdated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLastUpdated();
            case DEFAULT:
            case NULL:
                if (_lastUpdatedField!= null) {
                    return _lastUpdatedField;
                } else {
                    Object __rawValue = super._map.get("lastUpdated");
                    _lastUpdatedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lastUpdatedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastUpdated
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentStatus.Fields#lastUpdated
     */
    @Nonnull
    public AuditStamp getLastUpdated() {
        if (_lastUpdatedField!= null) {
            return _lastUpdatedField;
        } else {
            Object __rawValue = super._map.get("lastUpdated");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("lastUpdated");
            }
            _lastUpdatedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastUpdatedField;
        }
    }

    /**
     * Setter for lastUpdated
     * 
     * @see IncidentStatus.Fields#lastUpdated
     */
    public IncidentStatus setLastUpdated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastUpdated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastUpdated of com.linkedin.incident.IncidentStatus");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
                    _lastUpdatedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastUpdated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
                    _lastUpdatedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
                    _lastUpdatedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastUpdated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentStatus.Fields#lastUpdated
     */
    public IncidentStatus setLastUpdated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastUpdated of com.linkedin.incident.IncidentStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastUpdated", value.data());
            _lastUpdatedField = value;
        }
        return this;
    }

    @Override
    public IncidentStatus clone()
        throws CloneNotSupportedException
    {
        IncidentStatus __clone = ((IncidentStatus) super.clone());
        __clone.__changeListener = new IncidentStatus.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncidentStatus copy()
        throws CloneNotSupportedException
    {
        IncidentStatus __copy = ((IncidentStatus) super.copy());
        __copy._lastUpdatedField = null;
        __copy._stageField = null;
        __copy._stateField = null;
        __copy._messageField = null;
        __copy.__changeListener = new IncidentStatus.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncidentStatus __objectRef;

        private ChangeListener(IncidentStatus reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "lastUpdated":
                    __objectRef._lastUpdatedField = null;
                    break;
                case "stage":
                    __objectRef._stageField = null;
                    break;
                case "state":
                    __objectRef._stateField = null;
                    break;
                case "message":
                    __objectRef._messageField = null;
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
         * The top-level state of the incident, whether it's active or resolved.
         * 
         */
        public PathSpec state() {
            return new PathSpec(getPathComponents(), "state");
        }

        /**
         * The lifecycle stage for the incident - Null means no stage was assigned yet.
         * In the future, we may add CUSTOM here with a customStage string field for user-defined stages.
         * 
         */
        public PathSpec stage() {
            return new PathSpec(getPathComponents(), "stage");
        }

        /**
         * Optional message associated with the incident
         * 
         */
        public PathSpec message() {
            return new PathSpec(getPathComponents(), "message");
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastUpdated() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastUpdated");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _lastUpdatedMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The top-level state of the incident, whether it's active or resolved.
         * 
         */
        public IncidentStatus.ProjectionMask withState() {
            getDataMap().put("state", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The lifecycle stage for the incident - Null means no stage was assigned yet.
         * In the future, we may add CUSTOM here with a customStage string field for user-defined stages.
         * 
         */
        public IncidentStatus.ProjectionMask withStage() {
            getDataMap().put("stage", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional message associated with the incident
         * 
         */
        public IncidentStatus.ProjectionMask withMessage() {
            getDataMap().put("message", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public IncidentStatus.ProjectionMask withLastUpdated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastUpdatedMask = nestedMask.apply(((_lastUpdatedMask == null)?AuditStamp.createMask():_lastUpdatedMask));
            getDataMap().put("lastUpdated", _lastUpdatedMask.getDataMap());
            return this;
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public IncidentStatus.ProjectionMask withLastUpdated(MaskMap nestedMask) {
            getDataMap().put("lastUpdated", nestedMask.getDataMap());
            return this;
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public IncidentStatus.ProjectionMask withLastUpdated() {
            _lastUpdatedMask = null;
            getDataMap().put("lastUpdated", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
