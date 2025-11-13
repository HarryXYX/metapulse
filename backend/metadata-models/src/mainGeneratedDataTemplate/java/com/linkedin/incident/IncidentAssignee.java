
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * The incident assignee type.
 * This is in a record so that we can add additional fields if we need to later (e.g.
 * the type of the assignee.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/incident/IncidentAssignee.pdl.")
public class IncidentAssignee
    extends RecordTemplate
{

    private final static IncidentAssignee.Fields _fields = new IncidentAssignee.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident/**The incident assignee type.\nThis is in a record so that we can add additional fields if we need to later (e.g.\nthe type of the assignee.*/record IncidentAssignee{/**The user or group assigned to the incident.*/@Searchable={\"addToFilters\":true,\"fieldName\":\"assignees\",\"filterNameOverride\":\"Assignee\"}actor:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The time & actor responsible for assiging the assignee.*/assignedAt:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _actorField = null;
    private AuditStamp _assignedAtField = null;
    private IncidentAssignee.ChangeListener __changeListener = new IncidentAssignee.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");
    private final static RecordDataSchema.Field FIELD_AssignedAt = SCHEMA.getField("assignedAt");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public IncidentAssignee() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public IncidentAssignee(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncidentAssignee.Fields fields() {
        return _fields;
    }

    public static IncidentAssignee.ProjectionMask createMask() {
        return new IncidentAssignee.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for actor
     * 
     * @see IncidentAssignee.Fields#actor
     */
    public boolean hasActor() {
        if (_actorField!= null) {
            return true;
        }
        return super._map.containsKey("actor");
    }

    /**
     * Remover for actor
     * 
     * @see IncidentAssignee.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see IncidentAssignee.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getActor();
            case DEFAULT:
            case NULL:
                if (_actorField!= null) {
                    return _actorField;
                } else {
                    Object __rawValue = super._map.get("actor");
                    _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _actorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentAssignee.Fields#actor
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getActor() {
        if (_actorField!= null) {
            return _actorField;
        } else {
            Object __rawValue = super._map.get("actor");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("actor");
            }
            _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorField;
        }
    }

    /**
     * Setter for actor
     * 
     * @see IncidentAssignee.Fields#actor
     */
    public IncidentAssignee setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actor of com.linkedin.incident.IncidentAssignee");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActor();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentAssignee.Fields#actor
     */
    public IncidentAssignee setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.incident.IncidentAssignee to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    /**
     * Existence checker for assignedAt
     * 
     * @see IncidentAssignee.Fields#assignedAt
     */
    public boolean hasAssignedAt() {
        if (_assignedAtField!= null) {
            return true;
        }
        return super._map.containsKey("assignedAt");
    }

    /**
     * Remover for assignedAt
     * 
     * @see IncidentAssignee.Fields#assignedAt
     */
    public void removeAssignedAt() {
        super._map.remove("assignedAt");
    }

    /**
     * Getter for assignedAt
     * 
     * @see IncidentAssignee.Fields#assignedAt
     */
    @Nullable
    public AuditStamp getAssignedAt(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAssignedAt();
            case DEFAULT:
            case NULL:
                if (_assignedAtField!= null) {
                    return _assignedAtField;
                } else {
                    Object __rawValue = super._map.get("assignedAt");
                    _assignedAtField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _assignedAtField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for assignedAt
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentAssignee.Fields#assignedAt
     */
    @Nonnull
    public AuditStamp getAssignedAt() {
        if (_assignedAtField!= null) {
            return _assignedAtField;
        } else {
            Object __rawValue = super._map.get("assignedAt");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("assignedAt");
            }
            _assignedAtField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _assignedAtField;
        }
    }

    /**
     * Setter for assignedAt
     * 
     * @see IncidentAssignee.Fields#assignedAt
     */
    public IncidentAssignee setAssignedAt(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssignedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field assignedAt of com.linkedin.incident.IncidentAssignee");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assignedAt", value.data());
                    _assignedAtField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssignedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assignedAt", value.data());
                    _assignedAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assignedAt", value.data());
                    _assignedAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assignedAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentAssignee.Fields#assignedAt
     */
    public IncidentAssignee setAssignedAt(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assignedAt of com.linkedin.incident.IncidentAssignee to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assignedAt", value.data());
            _assignedAtField = value;
        }
        return this;
    }

    @Override
    public IncidentAssignee clone()
        throws CloneNotSupportedException
    {
        IncidentAssignee __clone = ((IncidentAssignee) super.clone());
        __clone.__changeListener = new IncidentAssignee.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncidentAssignee copy()
        throws CloneNotSupportedException
    {
        IncidentAssignee __copy = ((IncidentAssignee) super.copy());
        __copy._actorField = null;
        __copy._assignedAtField = null;
        __copy.__changeListener = new IncidentAssignee.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncidentAssignee __objectRef;

        private ChangeListener(IncidentAssignee reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "actor":
                    __objectRef._actorField = null;
                    break;
                case "assignedAt":
                    __objectRef._assignedAtField = null;
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
         * The user or group assigned to the incident.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

        /**
         * The time & actor responsible for assiging the assignee.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields assignedAt() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "assignedAt");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _assignedAtMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The user or group assigned to the incident.
         * 
         */
        public IncidentAssignee.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time & actor responsible for assiging the assignee.
         * 
         */
        public IncidentAssignee.ProjectionMask withAssignedAt(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _assignedAtMask = nestedMask.apply(((_assignedAtMask == null)?AuditStamp.createMask():_assignedAtMask));
            getDataMap().put("assignedAt", _assignedAtMask.getDataMap());
            return this;
        }

        /**
         * The time & actor responsible for assiging the assignee.
         * 
         */
        public IncidentAssignee.ProjectionMask withAssignedAt(MaskMap nestedMask) {
            getDataMap().put("assignedAt", nestedMask.getDataMap());
            return this;
        }

        /**
         * The time & actor responsible for assiging the assignee.
         * 
         */
        public IncidentAssignee.ProjectionMask withAssignedAt() {
            _assignedAtMask = null;
            getDataMap().put("assignedAt", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
