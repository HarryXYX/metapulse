
package com.linkedin.incident;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Information about an incident raised on an asset.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/incident/IncidentInfo.pdl.")
public class IncidentInfo
    extends RecordTemplate
{

    private final static IncidentInfo.Fields _fields = new IncidentInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident/**Information about an incident raised on an asset.*/@Aspect.name=\"incidentInfo\"record IncidentInfo{/**The type of incident*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Type\"}type:/**A type of asset incident*/enum IncidentType{/**An Freshness Assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/FRESHNESS/**An Volume Assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/VOLUME/**A Field Assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/FIELD/**A raw SQL-statement based assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/SQL/**A Data Schema assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/DATA_SCHEMA/**A misc. operational incident, e.g. failure to materialize a dataset.*/OPERATIONAL/**A custom type of incident*/CUSTOM}/**An optional custom incident type. Present only if type is 'CUSTOM'.*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Other Type\"}customType:optional string/**Optional title associated with the incident*/title:optional string/**Optional description associated with the incident*/description:optional string/**A reference to the entity associated with the incident.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\",\"chart\",\"dashboard\",\"dataFlow\",\"dataJob\",\"schemaField\"],\"name\":\"IncidentOn\"}@Searchable.`/*`.fieldType=\"URN\"entities:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A numeric severity or priority for the incident. On the UI we will translate this into something easy to understand.\nCurrently supported: 0 - CRITICAL, 1 - HIGH, 2 - MED, 3 - LOW\n(We probably should have modeled as an enum)*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Priority\"}priority:optional int/**The parties assigned with resolving the incident*/assignees:optional array[/**The incident assignee type.\nThis is in a record so that we can add additional fields if we need to later (e.g.\nthe type of the assignee.*/record IncidentAssignee{/**The user or group assigned to the incident.*/@Searchable={\"addToFilters\":true,\"fieldName\":\"assignees\",\"filterNameOverride\":\"Assignee\"}actor:com.linkedin.common.Urn/**The time & actor responsible for assiging the assignee.*/assignedAt:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}]/**The current status of an incident, i.e. active or inactive.*/status:/**Information about an incident raised on an asset*/record IncidentStatus{/**The top-level state of the incident, whether it's active or resolved.*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Status\"}state:enum IncidentState{/**The incident is ongoing, or active.*/ACTIVE/**The incident is resolved.*/RESOLVED}/**The lifecycle stage for the incident - Null means no stage was assigned yet.\nIn the future, we may add CUSTOM here with a customStage string field for user-defined stages.*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Stage\"}stage:optional enum IncidentStage{/**The impact and priority of the incident is being actively assessed.*/TRIAGE/**The incident root cause is being investigated.*/INVESTIGATION/**The incident is in the remediation stage.*/WORK_IN_PROGRESS/**The incident is in the resolved as completed stage.*/FIXED/**The incident is in the resolved with no action required state, e.g. the\nincident was a false positive, or was expected.*/NO_ACTION_REQUIRED}/**Optional message associated with the incident*/message:optional string/**The time at which the request was initially created*/@Searchable.`/time`={\"fieldName\":\"lastUpdated\",\"fieldType\":\"COUNT\"}lastUpdated:com.linkedin.common.AuditStamp}/**The source of an incident, i.e. how it was generated.*/source:optional/**Information about the source of an incident raised on an asset.*/@Aspect.name=\"incidentSource\"record IncidentSource{/**Message associated with the incident*/@Searchable={\"addToFilters\":true,\"filterNameOverride\":\"Source\"}type:enum IncidentSourceType{/**Manually created incident, via UI or API.*/MANUAL/**An assertion has failed, triggering the incident.*/ASSERTION_FAILURE}/**Reference to an URN related to the source of an incident.*/@Searchable.fieldType=\"URN\"sourceUrn:optional com.linkedin.common.Urn}/**The time at which the incident actually started (may be before the date it was raised).*/@Searchable.`/time`={\"fieldName\":\"startedAt\",\"fieldType\":\"COUNT\"}startedAt:optional com.linkedin.common.Time/**The time at which the request was initially created*/@Searchable.`/time`={\"fieldName\":\"created\",\"fieldType\":\"COUNT\"}created:com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private IncidentType _typeField = null;
    private String _customTypeField = null;
    private String _titleField = null;
    private String _descriptionField = null;
    private UrnArray _entitiesField = null;
    private Integer _priorityField = null;
    private IncidentAssigneeArray _assigneesField = null;
    private IncidentStatus _statusField = null;
    private IncidentSource _sourceField = null;
    private Long _startedAtField = null;
    private AuditStamp _createdField = null;
    private IncidentInfo.ChangeListener __changeListener = new IncidentInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_CustomType = SCHEMA.getField("customType");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Priority = SCHEMA.getField("priority");
    private final static RecordDataSchema.Field FIELD_Assignees = SCHEMA.getField("assignees");
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_StartedAt = SCHEMA.getField("startedAt");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");

    public IncidentInfo() {
        super(new DataMap(15, 0.75F), SCHEMA, 7);
        addChangeListener(__changeListener);
    }

    public IncidentInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncidentInfo.Fields fields() {
        return _fields;
    }

    public static IncidentInfo.ProjectionMask createMask() {
        return new IncidentInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see IncidentInfo.Fields#type
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
     * @see IncidentInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see IncidentInfo.Fields#type
     */
    @Nullable
    public IncidentType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentType.class, IncidentType.$UNKNOWN);
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
     * @see IncidentInfo.Fields#type
     */
    @Nonnull
    public IncidentType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, IncidentType.class, IncidentType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see IncidentInfo.Fields#type
     */
    public IncidentInfo setType(
        @Nullable
        IncidentType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.incident.IncidentInfo");
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
     * @see IncidentInfo.Fields#type
     */
    public IncidentInfo setType(
        @Nonnull
        IncidentType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for customType
     * 
     * @see IncidentInfo.Fields#customType
     */
    public boolean hasCustomType() {
        if (_customTypeField!= null) {
            return true;
        }
        return super._map.containsKey("customType");
    }

    /**
     * Remover for customType
     * 
     * @see IncidentInfo.Fields#customType
     */
    public void removeCustomType() {
        super._map.remove("customType");
    }

    /**
     * Getter for customType
     * 
     * @see IncidentInfo.Fields#customType
     */
    @Nullable
    public String getCustomType(GetMode mode) {
        return getCustomType();
    }

    /**
     * Getter for customType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#customType
     */
    @Nullable
    public String getCustomType() {
        if (_customTypeField!= null) {
            return _customTypeField;
        } else {
            Object __rawValue = super._map.get("customType");
            _customTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _customTypeField;
        }
    }

    /**
     * Setter for customType
     * 
     * @see IncidentInfo.Fields#customType
     */
    public IncidentInfo setCustomType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customType", value);
                    _customTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customType", value);
                    _customTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#customType
     */
    public IncidentInfo setCustomType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customType of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customType", value);
            _customTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see IncidentInfo.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see IncidentInfo.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see IncidentInfo.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        return getTitle();
    }

    /**
     * Getter for title
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#title
     */
    @Nullable
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see IncidentInfo.Fields#title
     */
    public IncidentInfo setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#title
     */
    public IncidentInfo setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see IncidentInfo.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see IncidentInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see IncidentInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see IncidentInfo.Fields#description
     */
    public IncidentInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#description
     */
    public IncidentInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for entities
     * 
     * @see IncidentInfo.Fields#entities
     */
    public boolean hasEntities() {
        if (_entitiesField!= null) {
            return true;
        }
        return super._map.containsKey("entities");
    }

    /**
     * Remover for entities
     * 
     * @see IncidentInfo.Fields#entities
     */
    public void removeEntities() {
        super._map.remove("entities");
    }

    /**
     * Getter for entities
     * 
     * @see IncidentInfo.Fields#entities
     */
    @Nullable
    public UrnArray getEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntities();
            case DEFAULT:
            case NULL:
                if (_entitiesField!= null) {
                    return _entitiesField;
                } else {
                    Object __rawValue = super._map.get("entities");
                    _entitiesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _entitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentInfo.Fields#entities
     */
    @Nonnull
    public UrnArray getEntities() {
        if (_entitiesField!= null) {
            return _entitiesField;
        } else {
            Object __rawValue = super._map.get("entities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entities");
            }
            _entitiesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entitiesField;
        }
    }

    /**
     * Setter for entities
     * 
     * @see IncidentInfo.Fields#entities
     */
    public IncidentInfo setEntities(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entities of com.linkedin.incident.IncidentInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#entities
     */
    public IncidentInfo setEntities(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entities of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
            _entitiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for priority
     * 
     * @see IncidentInfo.Fields#priority
     */
    public boolean hasPriority() {
        if (_priorityField!= null) {
            return true;
        }
        return super._map.containsKey("priority");
    }

    /**
     * Remover for priority
     * 
     * @see IncidentInfo.Fields#priority
     */
    public void removePriority() {
        super._map.remove("priority");
    }

    /**
     * Getter for priority
     * 
     * @see IncidentInfo.Fields#priority
     */
    @Nullable
    public Integer getPriority(GetMode mode) {
        return getPriority();
    }

    /**
     * Getter for priority
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#priority
     */
    @Nullable
    public Integer getPriority() {
        if (_priorityField!= null) {
            return _priorityField;
        } else {
            Object __rawValue = super._map.get("priority");
            _priorityField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _priorityField;
        }
    }

    /**
     * Setter for priority
     * 
     * @see IncidentInfo.Fields#priority
     */
    public IncidentInfo setPriority(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPriority(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePriority();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
                    _priorityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
                    _priorityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for priority
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#priority
     */
    public IncidentInfo setPriority(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field priority of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
            _priorityField = value;
        }
        return this;
    }

    /**
     * Setter for priority
     * 
     * @see IncidentInfo.Fields#priority
     */
    public IncidentInfo setPriority(int value) {
        CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
        _priorityField = value;
        return this;
    }

    /**
     * Existence checker for assignees
     * 
     * @see IncidentInfo.Fields#assignees
     */
    public boolean hasAssignees() {
        if (_assigneesField!= null) {
            return true;
        }
        return super._map.containsKey("assignees");
    }

    /**
     * Remover for assignees
     * 
     * @see IncidentInfo.Fields#assignees
     */
    public void removeAssignees() {
        super._map.remove("assignees");
    }

    /**
     * Getter for assignees
     * 
     * @see IncidentInfo.Fields#assignees
     */
    @Nullable
    public IncidentAssigneeArray getAssignees(GetMode mode) {
        return getAssignees();
    }

    /**
     * Getter for assignees
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#assignees
     */
    @Nullable
    public IncidentAssigneeArray getAssignees() {
        if (_assigneesField!= null) {
            return _assigneesField;
        } else {
            Object __rawValue = super._map.get("assignees");
            _assigneesField = ((__rawValue == null)?null:new IncidentAssigneeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _assigneesField;
        }
    }

    /**
     * Setter for assignees
     * 
     * @see IncidentInfo.Fields#assignees
     */
    public IncidentInfo setAssignees(
        @Nullable
        IncidentAssigneeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssignees(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssignees();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assignees", value.data());
                    _assigneesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assignees", value.data());
                    _assigneesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assignees
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#assignees
     */
    public IncidentInfo setAssignees(
        @Nonnull
        IncidentAssigneeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assignees of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assignees", value.data());
            _assigneesField = value;
        }
        return this;
    }

    /**
     * Existence checker for status
     * 
     * @see IncidentInfo.Fields#status
     */
    public boolean hasStatus() {
        if (_statusField!= null) {
            return true;
        }
        return super._map.containsKey("status");
    }

    /**
     * Remover for status
     * 
     * @see IncidentInfo.Fields#status
     */
    public void removeStatus() {
        super._map.remove("status");
    }

    /**
     * Getter for status
     * 
     * @see IncidentInfo.Fields#status
     */
    @Nullable
    public IncidentStatus getStatus(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStatus();
            case DEFAULT:
            case NULL:
                if (_statusField!= null) {
                    return _statusField;
                } else {
                    Object __rawValue = super._map.get("status");
                    _statusField = ((__rawValue == null)?null:new IncidentStatus(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _statusField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for status
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentInfo.Fields#status
     */
    @Nonnull
    public IncidentStatus getStatus() {
        if (_statusField!= null) {
            return _statusField;
        } else {
            Object __rawValue = super._map.get("status");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("status");
            }
            _statusField = ((__rawValue == null)?null:new IncidentStatus(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _statusField;
        }
    }

    /**
     * Setter for status
     * 
     * @see IncidentInfo.Fields#status
     */
    public IncidentInfo setStatus(
        @Nullable
        IncidentStatus value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatus(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field status of com.linkedin.incident.IncidentInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.data());
                    _statusField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatus();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.data());
                    _statusField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.data());
                    _statusField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#status
     */
    public IncidentInfo setStatus(
        @Nonnull
        IncidentStatus value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field status of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "status", value.data());
            _statusField = value;
        }
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see IncidentInfo.Fields#source
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
     * @see IncidentInfo.Fields#source
     */
    public void removeSource() {
        super._map.remove("source");
    }

    /**
     * Getter for source
     * 
     * @see IncidentInfo.Fields#source
     */
    @Nullable
    public IncidentSource getSource(GetMode mode) {
        return getSource();
    }

    /**
     * Getter for source
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#source
     */
    @Nullable
    public IncidentSource getSource() {
        if (_sourceField!= null) {
            return _sourceField;
        } else {
            Object __rawValue = super._map.get("source");
            _sourceField = ((__rawValue == null)?null:new IncidentSource(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sourceField;
        }
    }

    /**
     * Setter for source
     * 
     * @see IncidentInfo.Fields#source
     */
    public IncidentInfo setSource(
        @Nullable
        IncidentSource value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSource(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see IncidentInfo.Fields#source
     */
    public IncidentInfo setSource(
        @Nonnull
        IncidentSource value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field source of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "source", value.data());
            _sourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for startedAt
     * 
     * @see IncidentInfo.Fields#startedAt
     */
    public boolean hasStartedAt() {
        if (_startedAtField!= null) {
            return true;
        }
        return super._map.containsKey("startedAt");
    }

    /**
     * Remover for startedAt
     * 
     * @see IncidentInfo.Fields#startedAt
     */
    public void removeStartedAt() {
        super._map.remove("startedAt");
    }

    /**
     * Getter for startedAt
     * 
     * @see IncidentInfo.Fields#startedAt
     */
    @Nullable
    public Long getStartedAt(GetMode mode) {
        return getStartedAt();
    }

    /**
     * Getter for startedAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentInfo.Fields#startedAt
     */
    @Nullable
    public Long getStartedAt() {
        if (_startedAtField!= null) {
            return _startedAtField;
        } else {
            Object __rawValue = super._map.get("startedAt");
            _startedAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _startedAtField;
        }
    }

    /**
     * Setter for startedAt
     * 
     * @see IncidentInfo.Fields#startedAt
     */
    public IncidentInfo setStartedAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStartedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStartedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "startedAt", DataTemplateUtil.coerceLongInput(value));
                    _startedAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "startedAt", DataTemplateUtil.coerceLongInput(value));
                    _startedAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for startedAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#startedAt
     */
    public IncidentInfo setStartedAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field startedAt of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "startedAt", DataTemplateUtil.coerceLongInput(value));
            _startedAtField = value;
        }
        return this;
    }

    /**
     * Setter for startedAt
     * 
     * @see IncidentInfo.Fields#startedAt
     */
    public IncidentInfo setStartedAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "startedAt", DataTemplateUtil.coerceLongInput(value));
        _startedAtField = value;
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see IncidentInfo.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see IncidentInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see IncidentInfo.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreated();
            case DEFAULT:
            case NULL:
                if (_createdField!= null) {
                    return _createdField;
                } else {
                    Object __rawValue = super._map.get("created");
                    _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentInfo.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("created");
            }
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see IncidentInfo.Fields#created
     */
    public IncidentInfo setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.incident.IncidentInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentInfo.Fields#created
     */
    public IncidentInfo setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.incident.IncidentInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
        }
        return this;
    }

    @Override
    public IncidentInfo clone()
        throws CloneNotSupportedException
    {
        IncidentInfo __clone = ((IncidentInfo) super.clone());
        __clone.__changeListener = new IncidentInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncidentInfo copy()
        throws CloneNotSupportedException
    {
        IncidentInfo __copy = ((IncidentInfo) super.copy());
        __copy._customTypeField = null;
        __copy._entitiesField = null;
        __copy._createdField = null;
        __copy._descriptionField = null;
        __copy._assigneesField = null;
        __copy._startedAtField = null;
        __copy._sourceField = null;
        __copy._typeField = null;
        __copy._titleField = null;
        __copy._priorityField = null;
        __copy._statusField = null;
        __copy.__changeListener = new IncidentInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncidentInfo __objectRef;

        private ChangeListener(IncidentInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customType":
                    __objectRef._customTypeField = null;
                    break;
                case "entities":
                    __objectRef._entitiesField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "assignees":
                    __objectRef._assigneesField = null;
                    break;
                case "startedAt":
                    __objectRef._startedAtField = null;
                    break;
                case "source":
                    __objectRef._sourceField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "priority":
                    __objectRef._priorityField = null;
                    break;
                case "status":
                    __objectRef._statusField = null;
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
         * The type of incident
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * An optional custom incident type. Present only if type is 'CUSTOM'.
         * 
         */
        public PathSpec customType() {
            return new PathSpec(getPathComponents(), "customType");
        }

        /**
         * Optional title associated with the incident
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Optional description associated with the incident
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * A reference to the entity associated with the incident.
         * 
         */
        public PathSpec entities() {
            return new PathSpec(getPathComponents(), "entities");
        }

        /**
         * A reference to the entity associated with the incident.
         * 
         */
        public PathSpec entities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entities");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A numeric severity or priority for the incident. On the UI we will translate this into something easy to understand.
         * Currently supported: 0 - CRITICAL, 1 - HIGH, 2 - MED, 3 - LOW
         * (We probably should have modeled as an enum)
         * 
         */
        public PathSpec priority() {
            return new PathSpec(getPathComponents(), "priority");
        }

        /**
         * The parties assigned with resolving the incident
         * 
         */
        public com.linkedin.incident.IncidentAssigneeArray.Fields assignees() {
            return new com.linkedin.incident.IncidentAssigneeArray.Fields(getPathComponents(), "assignees");
        }

        /**
         * The parties assigned with resolving the incident
         * 
         */
        public PathSpec assignees(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "assignees");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The current status of an incident, i.e. active or inactive.
         * 
         */
        public com.linkedin.incident.IncidentStatus.Fields status() {
            return new com.linkedin.incident.IncidentStatus.Fields(getPathComponents(), "status");
        }

        /**
         * The source of an incident, i.e. how it was generated.
         * 
         */
        public com.linkedin.incident.IncidentSource.Fields source() {
            return new com.linkedin.incident.IncidentSource.Fields(getPathComponents(), "source");
        }

        /**
         * The time at which the incident actually started (may be before the date it was raised).
         * 
         */
        public PathSpec startedAt() {
            return new PathSpec(getPathComponents(), "startedAt");
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.incident.IncidentAssigneeArray.ProjectionMask _assigneesMask;
        private com.linkedin.incident.IncidentStatus.ProjectionMask _statusMask;
        private com.linkedin.incident.IncidentSource.ProjectionMask _sourceMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;

        ProjectionMask() {
            super(15);
        }

        /**
         * The type of incident
         * 
         */
        public IncidentInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional custom incident type. Present only if type is 'CUSTOM'.
         * 
         */
        public IncidentInfo.ProjectionMask withCustomType() {
            getDataMap().put("customType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional title associated with the incident
         * 
         */
        public IncidentInfo.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional description associated with the incident
         * 
         */
        public IncidentInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A reference to the entity associated with the incident.
         * 
         */
        public IncidentInfo.ProjectionMask withEntities() {
            getDataMap().put("entities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A reference to the entity associated with the incident.
         * 
         */
        public IncidentInfo.ProjectionMask withEntities(Integer start, Integer count) {
            getDataMap().put("entities", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

        /**
         * A numeric severity or priority for the incident. On the UI we will translate this into something easy to understand.
         * Currently supported: 0 - CRITICAL, 1 - HIGH, 2 - MED, 3 - LOW
         * (We probably should have modeled as an enum)
         * 
         */
        public IncidentInfo.ProjectionMask withPriority() {
            getDataMap().put("priority", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The parties assigned with resolving the incident
         * 
         */
        public IncidentInfo.ProjectionMask withAssignees(Function<com.linkedin.incident.IncidentAssigneeArray.ProjectionMask, com.linkedin.incident.IncidentAssigneeArray.ProjectionMask> nestedMask) {
            _assigneesMask = nestedMask.apply(((_assigneesMask == null)?IncidentAssigneeArray.createMask():_assigneesMask));
            getDataMap().put("assignees", _assigneesMask.getDataMap());
            return this;
        }

        /**
         * The parties assigned with resolving the incident
         * 
         */
        public IncidentInfo.ProjectionMask withAssignees() {
            _assigneesMask = null;
            getDataMap().put("assignees", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The parties assigned with resolving the incident
         * 
         */
        public IncidentInfo.ProjectionMask withAssignees(Function<com.linkedin.incident.IncidentAssigneeArray.ProjectionMask, com.linkedin.incident.IncidentAssigneeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _assigneesMask = nestedMask.apply(((_assigneesMask == null)?IncidentAssigneeArray.createMask():_assigneesMask));
            getDataMap().put("assignees", _assigneesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("assignees").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("assignees").put("$count", count);
            }
            return this;
        }

        /**
         * The parties assigned with resolving the incident
         * 
         */
        public IncidentInfo.ProjectionMask withAssignees(Integer start, Integer count) {
            _assigneesMask = null;
            getDataMap().put("assignees", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("assignees").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("assignees").put("$count", count);
            }
            return this;
        }

        /**
         * The current status of an incident, i.e. active or inactive.
         * 
         */
        public IncidentInfo.ProjectionMask withStatus(Function<com.linkedin.incident.IncidentStatus.ProjectionMask, com.linkedin.incident.IncidentStatus.ProjectionMask> nestedMask) {
            _statusMask = nestedMask.apply(((_statusMask == null)?IncidentStatus.createMask():_statusMask));
            getDataMap().put("status", _statusMask.getDataMap());
            return this;
        }

        /**
         * The current status of an incident, i.e. active or inactive.
         * 
         */
        public IncidentInfo.ProjectionMask withStatus() {
            _statusMask = null;
            getDataMap().put("status", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The source of an incident, i.e. how it was generated.
         * 
         */
        public IncidentInfo.ProjectionMask withSource(Function<com.linkedin.incident.IncidentSource.ProjectionMask, com.linkedin.incident.IncidentSource.ProjectionMask> nestedMask) {
            _sourceMask = nestedMask.apply(((_sourceMask == null)?IncidentSource.createMask():_sourceMask));
            getDataMap().put("source", _sourceMask.getDataMap());
            return this;
        }

        /**
         * The source of an incident, i.e. how it was generated.
         * 
         */
        public IncidentInfo.ProjectionMask withSource() {
            _sourceMask = null;
            getDataMap().put("source", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the incident actually started (may be before the date it was raised).
         * 
         */
        public IncidentInfo.ProjectionMask withStartedAt() {
            getDataMap().put("startedAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public IncidentInfo.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public IncidentInfo.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * The time at which the request was initially created
         * 
         */
        public IncidentInfo.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
