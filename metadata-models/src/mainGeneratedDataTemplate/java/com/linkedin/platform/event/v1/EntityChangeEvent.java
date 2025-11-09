
package com.linkedin.platform.event.v1;

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
 * Shared fields for all entity change events.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/platform/event/v1/EntityChangeEvent.pdl.")
public class EntityChangeEvent
    extends RecordTemplate
{

    private final static EntityChangeEvent.Fields _fields = new EntityChangeEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.platform.event.v1/**Shared fields for all entity change events.*/@Event.name=\"entityChangeEvent\"record EntityChangeEvent{/**The type of the entity affected. Corresponds to the entity registry, e.g. 'dataset', 'chart', 'dashboard', etc.*/entityType:string/**The urn of the entity which was affected.*/entityUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The category type (TAG, GLOSSARY_TERM, OWNERSHIP, TECHNICAL_SCHEMA, etc). This is used to determine what the rest of the schema will look like.*/category:string/**The operation type. This is used to determine what the rest of the schema will look like.*/operation:string/**The urn of the entity which was affected.*/modifier:optional string/**Arbitrary key-value parameters corresponding to the event.*/parameters:optional/**Arbitrary key-value parameters for an Entity Change Event. (any record).*/record Parameters{}/**Audit stamp of the operation*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The version of the event type, incremented in integers.*/version:int}", SchemaFormatType.PDL));
    private String _entityTypeField = null;
    private com.linkedin.common.urn.Urn _entityUrnField = null;
    private String _categoryField = null;
    private String _operationField = null;
    private String _modifierField = null;
    private Parameters _parametersField = null;
    private AuditStamp _auditStampField = null;
    private Integer _versionField = null;
    private EntityChangeEvent.ChangeListener __changeListener = new EntityChangeEvent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntityType = SCHEMA.getField("entityType");
    private final static RecordDataSchema.Field FIELD_EntityUrn = SCHEMA.getField("entityUrn");
    private final static RecordDataSchema.Field FIELD_Category = SCHEMA.getField("category");
    private final static RecordDataSchema.Field FIELD_Operation = SCHEMA.getField("operation");
    private final static RecordDataSchema.Field FIELD_Modifier = SCHEMA.getField("modifier");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public EntityChangeEvent() {
        super(new DataMap(11, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public EntityChangeEvent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EntityChangeEvent.Fields fields() {
        return _fields;
    }

    public static EntityChangeEvent.ProjectionMask createMask() {
        return new EntityChangeEvent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entityType
     * 
     * @see EntityChangeEvent.Fields#entityType
     */
    public boolean hasEntityType() {
        if (_entityTypeField!= null) {
            return true;
        }
        return super._map.containsKey("entityType");
    }

    /**
     * Remover for entityType
     * 
     * @see EntityChangeEvent.Fields#entityType
     */
    public void removeEntityType() {
        super._map.remove("entityType");
    }

    /**
     * Getter for entityType
     * 
     * @see EntityChangeEvent.Fields#entityType
     */
    @Nullable
    public String getEntityType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityType();
            case DEFAULT:
            case NULL:
                if (_entityTypeField!= null) {
                    return _entityTypeField;
                } else {
                    Object __rawValue = super._map.get("entityType");
                    _entityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityChangeEvent.Fields#entityType
     */
    @Nonnull
    public String getEntityType() {
        if (_entityTypeField!= null) {
            return _entityTypeField;
        } else {
            Object __rawValue = super._map.get("entityType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityType");
            }
            _entityTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityTypeField;
        }
    }

    /**
     * Setter for entityType
     * 
     * @see EntityChangeEvent.Fields#entityType
     */
    public EntityChangeEvent setEntityType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityType of com.linkedin.platform.event.v1.EntityChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityType", value);
                    _entityTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityType", value);
                    _entityTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityType", value);
                    _entityTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#entityType
     */
    public EntityChangeEvent setEntityType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityType of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityType", value);
            _entityTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityUrn
     * 
     * @see EntityChangeEvent.Fields#entityUrn
     */
    public boolean hasEntityUrn() {
        if (_entityUrnField!= null) {
            return true;
        }
        return super._map.containsKey("entityUrn");
    }

    /**
     * Remover for entityUrn
     * 
     * @see EntityChangeEvent.Fields#entityUrn
     */
    public void removeEntityUrn() {
        super._map.remove("entityUrn");
    }

    /**
     * Getter for entityUrn
     * 
     * @see EntityChangeEvent.Fields#entityUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntityUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityUrn();
            case DEFAULT:
            case NULL:
                if (_entityUrnField!= null) {
                    return _entityUrnField;
                } else {
                    Object __rawValue = super._map.get("entityUrn");
                    _entityUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityChangeEvent.Fields#entityUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntityUrn() {
        if (_entityUrnField!= null) {
            return _entityUrnField;
        } else {
            Object __rawValue = super._map.get("entityUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityUrn");
            }
            _entityUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityUrnField;
        }
    }

    /**
     * Setter for entityUrn
     * 
     * @see EntityChangeEvent.Fields#entityUrn
     */
    public EntityChangeEvent setEntityUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityUrn of com.linkedin.platform.event.v1.EntityChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#entityUrn
     */
    public EntityChangeEvent setEntityUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityUrn of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for category
     * 
     * @see EntityChangeEvent.Fields#category
     */
    public boolean hasCategory() {
        if (_categoryField!= null) {
            return true;
        }
        return super._map.containsKey("category");
    }

    /**
     * Remover for category
     * 
     * @see EntityChangeEvent.Fields#category
     */
    public void removeCategory() {
        super._map.remove("category");
    }

    /**
     * Getter for category
     * 
     * @see EntityChangeEvent.Fields#category
     */
    @Nullable
    public String getCategory(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCategory();
            case DEFAULT:
            case NULL:
                if (_categoryField!= null) {
                    return _categoryField;
                } else {
                    Object __rawValue = super._map.get("category");
                    _categoryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _categoryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for category
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityChangeEvent.Fields#category
     */
    @Nonnull
    public String getCategory() {
        if (_categoryField!= null) {
            return _categoryField;
        } else {
            Object __rawValue = super._map.get("category");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("category");
            }
            _categoryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _categoryField;
        }
    }

    /**
     * Setter for category
     * 
     * @see EntityChangeEvent.Fields#category
     */
    public EntityChangeEvent setCategory(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCategory(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field category of com.linkedin.platform.event.v1.EntityChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "category", value);
                    _categoryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCategory();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "category", value);
                    _categoryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "category", value);
                    _categoryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for category
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#category
     */
    public EntityChangeEvent setCategory(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field category of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "category", value);
            _categoryField = value;
        }
        return this;
    }

    /**
     * Existence checker for operation
     * 
     * @see EntityChangeEvent.Fields#operation
     */
    public boolean hasOperation() {
        if (_operationField!= null) {
            return true;
        }
        return super._map.containsKey("operation");
    }

    /**
     * Remover for operation
     * 
     * @see EntityChangeEvent.Fields#operation
     */
    public void removeOperation() {
        super._map.remove("operation");
    }

    /**
     * Getter for operation
     * 
     * @see EntityChangeEvent.Fields#operation
     */
    @Nullable
    public String getOperation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOperation();
            case DEFAULT:
            case NULL:
                if (_operationField!= null) {
                    return _operationField;
                } else {
                    Object __rawValue = super._map.get("operation");
                    _operationField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _operationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for operation
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityChangeEvent.Fields#operation
     */
    @Nonnull
    public String getOperation() {
        if (_operationField!= null) {
            return _operationField;
        } else {
            Object __rawValue = super._map.get("operation");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("operation");
            }
            _operationField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _operationField;
        }
    }

    /**
     * Setter for operation
     * 
     * @see EntityChangeEvent.Fields#operation
     */
    public EntityChangeEvent setOperation(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operation of com.linkedin.platform.event.v1.EntityChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operation", value);
                    _operationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOperation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operation", value);
                    _operationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "operation", value);
                    _operationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for operation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#operation
     */
    public EntityChangeEvent setOperation(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operation of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operation", value);
            _operationField = value;
        }
        return this;
    }

    /**
     * Existence checker for modifier
     * 
     * @see EntityChangeEvent.Fields#modifier
     */
    public boolean hasModifier() {
        if (_modifierField!= null) {
            return true;
        }
        return super._map.containsKey("modifier");
    }

    /**
     * Remover for modifier
     * 
     * @see EntityChangeEvent.Fields#modifier
     */
    public void removeModifier() {
        super._map.remove("modifier");
    }

    /**
     * Getter for modifier
     * 
     * @see EntityChangeEvent.Fields#modifier
     */
    @Nullable
    public String getModifier(GetMode mode) {
        return getModifier();
    }

    /**
     * Getter for modifier
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EntityChangeEvent.Fields#modifier
     */
    @Nullable
    public String getModifier() {
        if (_modifierField!= null) {
            return _modifierField;
        } else {
            Object __rawValue = super._map.get("modifier");
            _modifierField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _modifierField;
        }
    }

    /**
     * Setter for modifier
     * 
     * @see EntityChangeEvent.Fields#modifier
     */
    public EntityChangeEvent setModifier(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setModifier(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeModifier();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "modifier", value);
                    _modifierField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "modifier", value);
                    _modifierField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for modifier
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#modifier
     */
    public EntityChangeEvent setModifier(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field modifier of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "modifier", value);
            _modifierField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see EntityChangeEvent.Fields#parameters
     */
    public boolean hasParameters() {
        if (_parametersField!= null) {
            return true;
        }
        return super._map.containsKey("parameters");
    }

    /**
     * Remover for parameters
     * 
     * @see EntityChangeEvent.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see EntityChangeEvent.Fields#parameters
     */
    @Nullable
    public Parameters getParameters(GetMode mode) {
        return getParameters();
    }

    /**
     * Getter for parameters
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EntityChangeEvent.Fields#parameters
     */
    @Nullable
    public Parameters getParameters() {
        if (_parametersField!= null) {
            return _parametersField;
        } else {
            Object __rawValue = super._map.get("parameters");
            _parametersField = ((__rawValue == null)?null:new Parameters(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _parametersField;
        }
    }

    /**
     * Setter for parameters
     * 
     * @see EntityChangeEvent.Fields#parameters
     */
    public EntityChangeEvent setParameters(
        @Nullable
        Parameters value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParameters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
                    _parametersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
                    _parametersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parameters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#parameters
     */
    public EntityChangeEvent setParameters(
        @Nonnull
        Parameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see EntityChangeEvent.Fields#auditStamp
     */
    public boolean hasAuditStamp() {
        if (_auditStampField!= null) {
            return true;
        }
        return super._map.containsKey("auditStamp");
    }

    /**
     * Remover for auditStamp
     * 
     * @see EntityChangeEvent.Fields#auditStamp
     */
    public void removeAuditStamp() {
        super._map.remove("auditStamp");
    }

    /**
     * Getter for auditStamp
     * 
     * @see EntityChangeEvent.Fields#auditStamp
     */
    @Nullable
    public AuditStamp getAuditStamp(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAuditStamp();
            case DEFAULT:
            case NULL:
                if (_auditStampField!= null) {
                    return _auditStampField;
                } else {
                    Object __rawValue = super._map.get("auditStamp");
                    _auditStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _auditStampField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for auditStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityChangeEvent.Fields#auditStamp
     */
    @Nonnull
    public AuditStamp getAuditStamp() {
        if (_auditStampField!= null) {
            return _auditStampField;
        } else {
            Object __rawValue = super._map.get("auditStamp");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("auditStamp");
            }
            _auditStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _auditStampField;
        }
    }

    /**
     * Setter for auditStamp
     * 
     * @see EntityChangeEvent.Fields#auditStamp
     */
    public EntityChangeEvent setAuditStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field auditStamp of com.linkedin.platform.event.v1.EntityChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAuditStamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for auditStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityChangeEvent.Fields#auditStamp
     */
    public EntityChangeEvent setAuditStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditStamp of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
            _auditStampField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see EntityChangeEvent.Fields#version
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
     * @see EntityChangeEvent.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see EntityChangeEvent.Fields#version
     */
    @Nullable
    public Integer getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _versionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityChangeEvent.Fields#version
     */
    @Nonnull
    public Integer getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see EntityChangeEvent.Fields#version
     */
    public EntityChangeEvent setVersion(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.platform.event.v1.EntityChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceIntInput(value));
                    _versionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceIntInput(value));
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceIntInput(value));
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
     * @see EntityChangeEvent.Fields#version
     */
    public EntityChangeEvent setVersion(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.platform.event.v1.EntityChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceIntInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see EntityChangeEvent.Fields#version
     */
    public EntityChangeEvent setVersion(int value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceIntInput(value));
        _versionField = value;
        return this;
    }

    @Override
    public EntityChangeEvent clone()
        throws CloneNotSupportedException
    {
        EntityChangeEvent __clone = ((EntityChangeEvent) super.clone());
        __clone.__changeListener = new EntityChangeEvent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EntityChangeEvent copy()
        throws CloneNotSupportedException
    {
        EntityChangeEvent __copy = ((EntityChangeEvent) super.copy());
        __copy._auditStampField = null;
        __copy._entityUrnField = null;
        __copy._entityTypeField = null;
        __copy._modifierField = null;
        __copy._categoryField = null;
        __copy._operationField = null;
        __copy._parametersField = null;
        __copy._versionField = null;
        __copy.__changeListener = new EntityChangeEvent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EntityChangeEvent __objectRef;

        private ChangeListener(EntityChangeEvent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditStamp":
                    __objectRef._auditStampField = null;
                    break;
                case "entityUrn":
                    __objectRef._entityUrnField = null;
                    break;
                case "entityType":
                    __objectRef._entityTypeField = null;
                    break;
                case "modifier":
                    __objectRef._modifierField = null;
                    break;
                case "category":
                    __objectRef._categoryField = null;
                    break;
                case "operation":
                    __objectRef._operationField = null;
                    break;
                case "parameters":
                    __objectRef._parametersField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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
         * The type of the entity affected. Corresponds to the entity registry, e.g. 'dataset', 'chart', 'dashboard', etc.
         * 
         */
        public PathSpec entityType() {
            return new PathSpec(getPathComponents(), "entityType");
        }

        /**
         * The urn of the entity which was affected.
         * 
         */
        public PathSpec entityUrn() {
            return new PathSpec(getPathComponents(), "entityUrn");
        }

        /**
         * The category type (TAG, GLOSSARY_TERM, OWNERSHIP, TECHNICAL_SCHEMA, etc). This is used to determine what the rest of the schema will look like.
         * 
         */
        public PathSpec category() {
            return new PathSpec(getPathComponents(), "category");
        }

        /**
         * The operation type. This is used to determine what the rest of the schema will look like.
         * 
         */
        public PathSpec operation() {
            return new PathSpec(getPathComponents(), "operation");
        }

        /**
         * The urn of the entity which was affected.
         * 
         */
        public PathSpec modifier() {
            return new PathSpec(getPathComponents(), "modifier");
        }

        /**
         * Arbitrary key-value parameters corresponding to the event.
         * 
         */
        public com.linkedin.platform.event.v1.Parameters.Fields parameters() {
            return new com.linkedin.platform.event.v1.Parameters.Fields(getPathComponents(), "parameters");
        }

        /**
         * Audit stamp of the operation
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

        /**
         * The version of the event type, incremented in integers.
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.platform.event.v1.Parameters.ProjectionMask _parametersMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _auditStampMask;

        ProjectionMask() {
            super(11);
        }

        /**
         * The type of the entity affected. Corresponds to the entity registry, e.g. 'dataset', 'chart', 'dashboard', etc.
         * 
         */
        public EntityChangeEvent.ProjectionMask withEntityType() {
            getDataMap().put("entityType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The urn of the entity which was affected.
         * 
         */
        public EntityChangeEvent.ProjectionMask withEntityUrn() {
            getDataMap().put("entityUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The category type (TAG, GLOSSARY_TERM, OWNERSHIP, TECHNICAL_SCHEMA, etc). This is used to determine what the rest of the schema will look like.
         * 
         */
        public EntityChangeEvent.ProjectionMask withCategory() {
            getDataMap().put("category", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The operation type. This is used to determine what the rest of the schema will look like.
         * 
         */
        public EntityChangeEvent.ProjectionMask withOperation() {
            getDataMap().put("operation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The urn of the entity which was affected.
         * 
         */
        public EntityChangeEvent.ProjectionMask withModifier() {
            getDataMap().put("modifier", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Arbitrary key-value parameters corresponding to the event.
         * 
         */
        public EntityChangeEvent.ProjectionMask withParameters(Function<com.linkedin.platform.event.v1.Parameters.ProjectionMask, com.linkedin.platform.event.v1.Parameters.ProjectionMask> nestedMask) {
            _parametersMask = nestedMask.apply(((_parametersMask == null)?Parameters.createMask():_parametersMask));
            getDataMap().put("parameters", _parametersMask.getDataMap());
            return this;
        }

        /**
         * Arbitrary key-value parameters corresponding to the event.
         * 
         */
        public EntityChangeEvent.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp of the operation
         * 
         */
        public EntityChangeEvent.ProjectionMask withAuditStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _auditStampMask = nestedMask.apply(((_auditStampMask == null)?AuditStamp.createMask():_auditStampMask));
            getDataMap().put("auditStamp", _auditStampMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp of the operation
         * 
         */
        public EntityChangeEvent.ProjectionMask withAuditStamp(MaskMap nestedMask) {
            getDataMap().put("auditStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp of the operation
         * 
         */
        public EntityChangeEvent.ProjectionMask withAuditStamp() {
            _auditStampMask = null;
            getDataMap().put("auditStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version of the event type, incremented in integers.
         * 
         */
        public EntityChangeEvent.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
