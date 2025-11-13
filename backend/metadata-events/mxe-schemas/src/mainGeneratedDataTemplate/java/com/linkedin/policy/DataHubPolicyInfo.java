
package com.linkedin.policy;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.data.template.StringArray;


/**
 * Information about a DataHub (UI) access policy.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/DataHubPolicyInfo.pdl.")
public class DataHubPolicyInfo
    extends RecordTemplate
{

    private final static DataHubPolicyInfo.Fields _fields = new DataHubPolicyInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**Information about a DataHub (UI) access policy.*/@Aspect.name=\"dataHubPolicyInfo\"record DataHubPolicyInfo{/**Display name of the Policy*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:string/**Description of the Policy*/@Searchable.fieldType=\"TEXT\"description:string/**The type of policy*/@Searchable.fieldType=\"KEYWORD\"type:string/**The state of policy, ACTIVE or INACTIVE*/@Searchable.fieldType=\"KEYWORD\"state:string/**The resource that the policy applies to. Not required for some 'Platform' privileges.*/resources:optional/**Information used to filter DataHub resource.*/record DataHubResourceFilter{/**The type of resource that the policy applies to. This will most often be a data asset entity name, for\nexample 'dataset'. It is not strictly required because in the future we will want to support filtering a resource\nby domain, as well.*/@deprecated,type:optional string/**A specific set of resources to apply the policy to, e.g. asset urns*/@deprecated,resources:optional array[string]/**Whether the policy should be applied to all assets matching the filter.*/@deprecated,allResources:boolean=false/**Filter to apply privileges to*/filter:optional/**The filter for specifying the resource or actor to apply privileges to*/record PolicyMatchFilter{/**A list of criteria to apply conjunctively (so all criteria must pass)*/criteria:array[/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}]}/**Constraints around what sub-resources operations are allowed to modify, i.e. NOT_EQUALS - cannot modify a particular defined tag, EQUALS - can only modify a particular defined tag, STARTS_WITH - can only modify a tag starting with xyz*/privilegeConstraints:optional PolicyMatchFilter}/**The privileges that the policy grants.*/@Searchable.`/*`={\"addToFilters\":true,\"fieldType\":\"KEYWORD\"}privileges:array[string]/**The actors that the policy applies to.*/actors:/**Information used to filter DataHub actors.*/record DataHubActorFilter{/**A specific set of users to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"users:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**A specific set of groups to apply the policy to (disjunctive)*/@Searchable.`/*`.fieldType=\"URN\"groups:optional array[com.linkedin.common.Urn]/**Whether the filter should return true for owners of a particular resource.\nOnly applies to policies of type 'Metadata', which have a resource associated with them.*/resourceOwners:boolean=false/**Define type of ownership for the policy*/resourceOwnersTypes:optional array[com.linkedin.common.Urn]/**Whether the filter should apply to all users.*/@Searchable.fieldType=\"BOOLEAN\"allUsers:boolean=false/**Whether the filter should apply to all groups.*/@Searchable.fieldType=\"BOOLEAN\"allGroups:boolean=false/**A specific set of roles to apply the policy to (disjunctive).*/@Relationship.`/*`={\"entityTypes\":[\"dataHubRole\"],\"name\":\"IsAssociatedWithRole\"}@Searchable.`/*`.fieldType=\"URN\"roles:optional array[com.linkedin.common.Urn]}/**Whether the policy should be editable via the UI*/@Searchable.fieldType=\"BOOLEAN\"editable:boolean=true/**Timestamp when the policy was last updated*/@Searchable.fieldType=\"DATETIME\"lastUpdatedTimestamp:optional long}", SchemaFormatType.PDL));
    private String _displayNameField = null;
    private String _descriptionField = null;
    private String _typeField = null;
    private String _stateField = null;
    private DataHubResourceFilter _resourcesField = null;
    private StringArray _privilegesField = null;
    private DataHubActorFilter _actorsField = null;
    private Boolean _editableField = null;
    private Long _lastUpdatedTimestampField = null;
    private DataHubPolicyInfo.ChangeListener __changeListener = new DataHubPolicyInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_State = SCHEMA.getField("state");
    private final static RecordDataSchema.Field FIELD_Resources = SCHEMA.getField("resources");
    private final static RecordDataSchema.Field FIELD_Privileges = SCHEMA.getField("privileges");
    private final static RecordDataSchema.Field FIELD_Actors = SCHEMA.getField("actors");
    private final static RecordDataSchema.Field FIELD_Editable = SCHEMA.getField("editable");
    private final static Boolean DEFAULT_Editable;
    private final static RecordDataSchema.Field FIELD_LastUpdatedTimestamp = SCHEMA.getField("lastUpdatedTimestamp");

    static {
        DEFAULT_Editable = DataTemplateUtil.coerceBooleanOutput(FIELD_Editable.getDefault());
    }

    public DataHubPolicyInfo() {
        super(new DataMap(12, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DataHubPolicyInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubPolicyInfo.Fields fields() {
        return _fields;
    }

    public static DataHubPolicyInfo.ProjectionMask createMask() {
        return new DataHubPolicyInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDisplayName();
            case DEFAULT:
            case NULL:
                if (_displayNameField!= null) {
                    return _displayNameField;
                } else {
                    Object __rawValue = super._map.get("displayName");
                    _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _displayNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#displayName
     */
    @Nonnull
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("displayName");
            }
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public DataHubPolicyInfo setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field displayName of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#displayName
     */
    public DataHubPolicyInfo setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataHubPolicyInfo.Fields#description
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
     * @see DataHubPolicyInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see DataHubPolicyInfo.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDescription();
            case DEFAULT:
            case NULL:
                if (_descriptionField!= null) {
                    return _descriptionField;
                } else {
                    Object __rawValue = super._map.get("description");
                    _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _descriptionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for description
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#description
     */
    @Nonnull
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("description");
            }
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see DataHubPolicyInfo.Fields#description
     */
    public DataHubPolicyInfo setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field description of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
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
     * @see DataHubPolicyInfo.Fields#description
     */
    public DataHubPolicyInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataHubPolicyInfo.Fields#type
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
     * @see DataHubPolicyInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see DataHubPolicyInfo.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see DataHubPolicyInfo.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see DataHubPolicyInfo.Fields#type
     */
    public DataHubPolicyInfo setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
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
     * @see DataHubPolicyInfo.Fields#type
     */
    public DataHubPolicyInfo setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for state
     * 
     * @see DataHubPolicyInfo.Fields#state
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
     * @see DataHubPolicyInfo.Fields#state
     */
    public void removeState() {
        super._map.remove("state");
    }

    /**
     * Getter for state
     * 
     * @see DataHubPolicyInfo.Fields#state
     */
    @Nullable
    public String getState(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getState();
            case DEFAULT:
            case NULL:
                if (_stateField!= null) {
                    return _stateField;
                } else {
                    Object __rawValue = super._map.get("state");
                    _stateField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see DataHubPolicyInfo.Fields#state
     */
    @Nonnull
    public String getState() {
        if (_stateField!= null) {
            return _stateField;
        } else {
            Object __rawValue = super._map.get("state");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("state");
            }
            _stateField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _stateField;
        }
    }

    /**
     * Setter for state
     * 
     * @see DataHubPolicyInfo.Fields#state
     */
    public DataHubPolicyInfo setState(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setState(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field state of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "state", value);
                    _stateField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeState();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "state", value);
                    _stateField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "state", value);
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
     * @see DataHubPolicyInfo.Fields#state
     */
    public DataHubPolicyInfo setState(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field state of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "state", value);
            _stateField = value;
        }
        return this;
    }

    /**
     * Existence checker for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public boolean hasResources() {
        if (_resourcesField!= null) {
            return true;
        }
        return super._map.containsKey("resources");
    }

    /**
     * Remover for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public void removeResources() {
        super._map.remove("resources");
    }

    /**
     * Getter for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    @Nullable
    public DataHubResourceFilter getResources(GetMode mode) {
        return getResources();
    }

    /**
     * Getter for resources
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPolicyInfo.Fields#resources
     */
    @Nullable
    public DataHubResourceFilter getResources() {
        if (_resourcesField!= null) {
            return _resourcesField;
        } else {
            Object __rawValue = super._map.get("resources");
            _resourcesField = ((__rawValue == null)?null:new DataHubResourceFilter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _resourcesField;
        }
    }

    /**
     * Setter for resources
     * 
     * @see DataHubPolicyInfo.Fields#resources
     */
    public DataHubPolicyInfo setResources(
        @Nullable
        DataHubResourceFilter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResources(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResources();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resources", value.data());
                    _resourcesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resources", value.data());
                    _resourcesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resources
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#resources
     */
    public DataHubPolicyInfo setResources(
        @Nonnull
        DataHubResourceFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resources of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resources", value.data());
            _resourcesField = value;
        }
        return this;
    }

    /**
     * Existence checker for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public boolean hasPrivileges() {
        if (_privilegesField!= null) {
            return true;
        }
        return super._map.containsKey("privileges");
    }

    /**
     * Remover for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public void removePrivileges() {
        super._map.remove("privileges");
    }

    /**
     * Getter for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    @Nullable
    public StringArray getPrivileges(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPrivileges();
            case DEFAULT:
            case NULL:
                if (_privilegesField!= null) {
                    return _privilegesField;
                } else {
                    Object __rawValue = super._map.get("privileges");
                    _privilegesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _privilegesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for privileges
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#privileges
     */
    @Nonnull
    public StringArray getPrivileges() {
        if (_privilegesField!= null) {
            return _privilegesField;
        } else {
            Object __rawValue = super._map.get("privileges");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("privileges");
            }
            _privilegesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _privilegesField;
        }
    }

    /**
     * Setter for privileges
     * 
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public DataHubPolicyInfo setPrivileges(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPrivileges(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field privileges of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "privileges", value.data());
                    _privilegesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePrivileges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "privileges", value.data());
                    _privilegesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "privileges", value.data());
                    _privilegesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for privileges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#privileges
     */
    public DataHubPolicyInfo setPrivileges(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field privileges of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "privileges", value.data());
            _privilegesField = value;
        }
        return this;
    }

    /**
     * Existence checker for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public boolean hasActors() {
        if (_actorsField!= null) {
            return true;
        }
        return super._map.containsKey("actors");
    }

    /**
     * Remover for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public void removeActors() {
        super._map.remove("actors");
    }

    /**
     * Getter for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    @Nullable
    public DataHubActorFilter getActors(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getActors();
            case DEFAULT:
            case NULL:
                if (_actorsField!= null) {
                    return _actorsField;
                } else {
                    Object __rawValue = super._map.get("actors");
                    _actorsField = ((__rawValue == null)?null:new DataHubActorFilter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _actorsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for actors
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#actors
     */
    @Nonnull
    public DataHubActorFilter getActors() {
        if (_actorsField!= null) {
            return _actorsField;
        } else {
            Object __rawValue = super._map.get("actors");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("actors");
            }
            _actorsField = ((__rawValue == null)?null:new DataHubActorFilter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _actorsField;
        }
    }

    /**
     * Setter for actors
     * 
     * @see DataHubPolicyInfo.Fields#actors
     */
    public DataHubPolicyInfo setActors(
        @Nullable
        DataHubActorFilter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActors(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actors of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
                    _actorsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActors();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
                    _actorsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
                    _actorsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#actors
     */
    public DataHubPolicyInfo setActors(
        @Nonnull
        DataHubActorFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actors of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actors", value.data());
            _actorsField = value;
        }
        return this;
    }

    /**
     * Existence checker for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public boolean hasEditable() {
        if (_editableField!= null) {
            return true;
        }
        return super._map.containsKey("editable");
    }

    /**
     * Remover for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public void removeEditable() {
        super._map.remove("editable");
    }

    /**
     * Getter for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    @Nullable
    public Boolean isEditable(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isEditable();
            case NULL:
                if (_editableField!= null) {
                    return _editableField;
                } else {
                    Object __rawValue = super._map.get("editable");
                    _editableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _editableField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for editable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubPolicyInfo.Fields#editable
     */
    @Nonnull
    public Boolean isEditable() {
        if (_editableField!= null) {
            return _editableField;
        } else {
            Object __rawValue = super._map.get("editable");
            if (__rawValue == null) {
                return DEFAULT_Editable;
            }
            _editableField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _editableField;
        }
    }

    /**
     * Setter for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public DataHubPolicyInfo setEditable(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEditable(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field editable of com.linkedin.policy.DataHubPolicyInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "editable", value);
                    _editableField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEditable();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "editable", value);
                    _editableField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "editable", value);
                    _editableField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for editable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#editable
     */
    public DataHubPolicyInfo setEditable(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field editable of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "editable", value);
            _editableField = value;
        }
        return this;
    }

    /**
     * Setter for editable
     * 
     * @see DataHubPolicyInfo.Fields#editable
     */
    public DataHubPolicyInfo setEditable(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "editable", value);
        _editableField = value;
        return this;
    }

    /**
     * Existence checker for lastUpdatedTimestamp
     * 
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    public boolean hasLastUpdatedTimestamp() {
        if (_lastUpdatedTimestampField!= null) {
            return true;
        }
        return super._map.containsKey("lastUpdatedTimestamp");
    }

    /**
     * Remover for lastUpdatedTimestamp
     * 
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    public void removeLastUpdatedTimestamp() {
        super._map.remove("lastUpdatedTimestamp");
    }

    /**
     * Getter for lastUpdatedTimestamp
     * 
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    @Nullable
    public Long getLastUpdatedTimestamp(GetMode mode) {
        return getLastUpdatedTimestamp();
    }

    /**
     * Getter for lastUpdatedTimestamp
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    @Nullable
    public Long getLastUpdatedTimestamp() {
        if (_lastUpdatedTimestampField!= null) {
            return _lastUpdatedTimestampField;
        } else {
            Object __rawValue = super._map.get("lastUpdatedTimestamp");
            _lastUpdatedTimestampField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _lastUpdatedTimestampField;
        }
    }

    /**
     * Setter for lastUpdatedTimestamp
     * 
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    public DataHubPolicyInfo setLastUpdatedTimestamp(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastUpdatedTimestamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastUpdatedTimestamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimestamp", DataTemplateUtil.coerceLongInput(value));
                    _lastUpdatedTimestampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimestamp", DataTemplateUtil.coerceLongInput(value));
                    _lastUpdatedTimestampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastUpdatedTimestamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    public DataHubPolicyInfo setLastUpdatedTimestamp(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastUpdatedTimestamp of com.linkedin.policy.DataHubPolicyInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimestamp", DataTemplateUtil.coerceLongInput(value));
            _lastUpdatedTimestampField = value;
        }
        return this;
    }

    /**
     * Setter for lastUpdatedTimestamp
     * 
     * @see DataHubPolicyInfo.Fields#lastUpdatedTimestamp
     */
    public DataHubPolicyInfo setLastUpdatedTimestamp(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastUpdatedTimestamp", DataTemplateUtil.coerceLongInput(value));
        _lastUpdatedTimestampField = value;
        return this;
    }

    @Override
    public DataHubPolicyInfo clone()
        throws CloneNotSupportedException
    {
        DataHubPolicyInfo __clone = ((DataHubPolicyInfo) super.clone());
        __clone.__changeListener = new DataHubPolicyInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubPolicyInfo copy()
        throws CloneNotSupportedException
    {
        DataHubPolicyInfo __copy = ((DataHubPolicyInfo) super.copy());
        __copy._privilegesField = null;
        __copy._actorsField = null;
        __copy._lastUpdatedTimestampField = null;
        __copy._displayNameField = null;
        __copy._editableField = null;
        __copy._descriptionField = null;
        __copy._resourcesField = null;
        __copy._stateField = null;
        __copy._typeField = null;
        __copy.__changeListener = new DataHubPolicyInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubPolicyInfo __objectRef;

        private ChangeListener(DataHubPolicyInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "privileges":
                    __objectRef._privilegesField = null;
                    break;
                case "actors":
                    __objectRef._actorsField = null;
                    break;
                case "lastUpdatedTimestamp":
                    __objectRef._lastUpdatedTimestampField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "editable":
                    __objectRef._editableField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "resources":
                    __objectRef._resourcesField = null;
                    break;
                case "state":
                    __objectRef._stateField = null;
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
         * Display name of the Policy
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * Description of the Policy
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The type of policy
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The state of policy, ACTIVE or INACTIVE
         * 
         */
        public PathSpec state() {
            return new PathSpec(getPathComponents(), "state");
        }

        /**
         * The resource that the policy applies to. Not required for some 'Platform' privileges.
         * 
         */
        public com.linkedin.policy.DataHubResourceFilter.Fields resources() {
            return new com.linkedin.policy.DataHubResourceFilter.Fields(getPathComponents(), "resources");
        }

        /**
         * The privileges that the policy grants.
         * 
         */
        public PathSpec privileges() {
            return new PathSpec(getPathComponents(), "privileges");
        }

        /**
         * The privileges that the policy grants.
         * 
         */
        public PathSpec privileges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "privileges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The actors that the policy applies to.
         * 
         */
        public com.linkedin.policy.DataHubActorFilter.Fields actors() {
            return new com.linkedin.policy.DataHubActorFilter.Fields(getPathComponents(), "actors");
        }

        /**
         * Whether the policy should be editable via the UI
         * 
         */
        public PathSpec editable() {
            return new PathSpec(getPathComponents(), "editable");
        }

        /**
         * Timestamp when the policy was last updated
         * 
         */
        public PathSpec lastUpdatedTimestamp() {
            return new PathSpec(getPathComponents(), "lastUpdatedTimestamp");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.policy.DataHubResourceFilter.ProjectionMask _resourcesMask;
        private com.linkedin.policy.DataHubActorFilter.ProjectionMask _actorsMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * Display name of the Policy
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Description of the Policy
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of policy
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The state of policy, ACTIVE or INACTIVE
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withState() {
            getDataMap().put("state", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The resource that the policy applies to. Not required for some 'Platform' privileges.
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withResources(Function<com.linkedin.policy.DataHubResourceFilter.ProjectionMask, com.linkedin.policy.DataHubResourceFilter.ProjectionMask> nestedMask) {
            _resourcesMask = nestedMask.apply(((_resourcesMask == null)?DataHubResourceFilter.createMask():_resourcesMask));
            getDataMap().put("resources", _resourcesMask.getDataMap());
            return this;
        }

        /**
         * The resource that the policy applies to. Not required for some 'Platform' privileges.
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withResources() {
            _resourcesMask = null;
            getDataMap().put("resources", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The privileges that the policy grants.
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withPrivileges() {
            getDataMap().put("privileges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The privileges that the policy grants.
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withPrivileges(Integer start, Integer count) {
            getDataMap().put("privileges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("privileges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("privileges").put("$count", count);
            }
            return this;
        }

        /**
         * The actors that the policy applies to.
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withActors(Function<com.linkedin.policy.DataHubActorFilter.ProjectionMask, com.linkedin.policy.DataHubActorFilter.ProjectionMask> nestedMask) {
            _actorsMask = nestedMask.apply(((_actorsMask == null)?DataHubActorFilter.createMask():_actorsMask));
            getDataMap().put("actors", _actorsMask.getDataMap());
            return this;
        }

        /**
         * The actors that the policy applies to.
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withActors() {
            _actorsMask = null;
            getDataMap().put("actors", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether the policy should be editable via the UI
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withEditable() {
            getDataMap().put("editable", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Timestamp when the policy was last updated
         * 
         */
        public DataHubPolicyInfo.ProjectionMask withLastUpdatedTimestamp() {
            getDataMap().put("lastUpdatedTimestamp", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
