
package com.linkedin.platform.event.v1;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.avro2pegasus.events.KafkaAuditHeader;
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
import com.linkedin.data.template.StringMap;


/**
 * Kafka event for proposing a relationship change between two entities.
 * For example, when dataset1 establishes a new downstream relationship with dataset2.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/platform/event/v1/RelationshipChangeEvent.pdl.")
public class RelationshipChangeEvent
    extends RecordTemplate
{

    private final static RelationshipChangeEvent.Fields _fields = new RelationshipChangeEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.platform.event.v1/**Kafka event for proposing a relationship change between two entities.\nFor example, when dataset1 establishes a new downstream relationship with dataset2.*/@Event.name=\"relationshipChangeEvent\"record RelationshipChangeEvent{/**Kafka audit header containing metadata about the message itself.\nIncludes information like message ID, timestamp, and server details.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**The URN (Uniform Resource Name) of the source entity in the relationship.\nIn a downstream relationship example, this would be the URN of the upstream dataset.*/sourceUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The URN of the destination entity in the relationship.\nIn a downstream relationship example, this would be the URN of the downstream dataset.*/destinationUrn:com.linkedin.common.Urn/**The operation being performed on this relationship.\nTypically includes operations like ADD, REMOVE, or RESTATE.*/operation:enum RelationshipChangeOperation{ADD,REMOVE,RESTATE}/**The type/category of relationship being established or modified.\nExamples: \"DownstreamOf\", \"Contains\", \"OwnedBy\", \"DerivedFrom\", etc.*/relationshipType:string/**The system or service responsible for managing the lifecycle of this relationship.\nThis helps identify which component has authority over the relationship.*/lifecycleOwner:optional string/**Information about how or through what means this relationship was established.\nCould indicate a specific pipeline, process, or tool that discovered/created the relationship.*/via:optional string/**Additional custom properties associated with this relationship.\nAllows for flexible extension without changing the schema.*/properties:optional map[string,string]/**Stores information about who made this change and when.\nContains the actor (user or system) that performed the action and the timestamp.*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private KafkaAuditHeader _auditHeaderField = null;
    private com.linkedin.common.urn.Urn _sourceUrnField = null;
    private com.linkedin.common.urn.Urn _destinationUrnField = null;
    private RelationshipChangeOperation _operationField = null;
    private String _relationshipTypeField = null;
    private String _lifecycleOwnerField = null;
    private String _viaField = null;
    private StringMap _propertiesField = null;
    private AuditStamp _auditStampField = null;
    private RelationshipChangeEvent.ChangeListener __changeListener = new RelationshipChangeEvent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_SourceUrn = SCHEMA.getField("sourceUrn");
    private final static RecordDataSchema.Field FIELD_DestinationUrn = SCHEMA.getField("destinationUrn");
    private final static RecordDataSchema.Field FIELD_Operation = SCHEMA.getField("operation");
    private final static RecordDataSchema.Field FIELD_RelationshipType = SCHEMA.getField("relationshipType");
    private final static RecordDataSchema.Field FIELD_LifecycleOwner = SCHEMA.getField("lifecycleOwner");
    private final static RecordDataSchema.Field FIELD_Via = SCHEMA.getField("via");
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public RelationshipChangeEvent() {
        super(new DataMap(12, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public RelationshipChangeEvent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RelationshipChangeEvent.Fields fields() {
        return _fields;
    }

    public static RelationshipChangeEvent.ProjectionMask createMask() {
        return new RelationshipChangeEvent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see RelationshipChangeEvent.Fields#auditHeader
     */
    public boolean hasAuditHeader() {
        if (_auditHeaderField!= null) {
            return true;
        }
        return super._map.containsKey("auditHeader");
    }

    /**
     * Remover for auditHeader
     * 
     * @see RelationshipChangeEvent.Fields#auditHeader
     */
    public void removeAuditHeader() {
        super._map.remove("auditHeader");
    }

    /**
     * Getter for auditHeader
     * 
     * @see RelationshipChangeEvent.Fields#auditHeader
     */
    @Nullable
    public KafkaAuditHeader getAuditHeader(GetMode mode) {
        return getAuditHeader();
    }

    /**
     * Getter for auditHeader
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipChangeEvent.Fields#auditHeader
     */
    @Nullable
    public KafkaAuditHeader getAuditHeader() {
        if (_auditHeaderField!= null) {
            return _auditHeaderField;
        } else {
            Object __rawValue = super._map.get("auditHeader");
            _auditHeaderField = ((__rawValue == null)?null:new KafkaAuditHeader(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _auditHeaderField;
        }
    }

    /**
     * Setter for auditHeader
     * 
     * @see RelationshipChangeEvent.Fields#auditHeader
     */
    public RelationshipChangeEvent setAuditHeader(
        @Nullable
        KafkaAuditHeader value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditHeader(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAuditHeader();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditHeader", value.data());
                    _auditHeaderField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "auditHeader", value.data());
                    _auditHeaderField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for auditHeader
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#auditHeader
     */
    public RelationshipChangeEvent setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditHeader of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditHeader", value.data());
            _auditHeaderField = value;
        }
        return this;
    }

    /**
     * Existence checker for sourceUrn
     * 
     * @see RelationshipChangeEvent.Fields#sourceUrn
     */
    public boolean hasSourceUrn() {
        if (_sourceUrnField!= null) {
            return true;
        }
        return super._map.containsKey("sourceUrn");
    }

    /**
     * Remover for sourceUrn
     * 
     * @see RelationshipChangeEvent.Fields#sourceUrn
     */
    public void removeSourceUrn() {
        super._map.remove("sourceUrn");
    }

    /**
     * Getter for sourceUrn
     * 
     * @see RelationshipChangeEvent.Fields#sourceUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getSourceUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSourceUrn();
            case DEFAULT:
            case NULL:
                if (_sourceUrnField!= null) {
                    return _sourceUrnField;
                } else {
                    Object __rawValue = super._map.get("sourceUrn");
                    _sourceUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _sourceUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for sourceUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipChangeEvent.Fields#sourceUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSourceUrn() {
        if (_sourceUrnField!= null) {
            return _sourceUrnField;
        } else {
            Object __rawValue = super._map.get("sourceUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("sourceUrn");
            }
            _sourceUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _sourceUrnField;
        }
    }

    /**
     * Setter for sourceUrn
     * 
     * @see RelationshipChangeEvent.Fields#sourceUrn
     */
    public RelationshipChangeEvent setSourceUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSourceUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field sourceUrn of com.linkedin.platform.event.v1.RelationshipChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSourceUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _sourceUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sourceUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#sourceUrn
     */
    public RelationshipChangeEvent setSourceUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sourceUrn of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sourceUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _sourceUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for destinationUrn
     * 
     * @see RelationshipChangeEvent.Fields#destinationUrn
     */
    public boolean hasDestinationUrn() {
        if (_destinationUrnField!= null) {
            return true;
        }
        return super._map.containsKey("destinationUrn");
    }

    /**
     * Remover for destinationUrn
     * 
     * @see RelationshipChangeEvent.Fields#destinationUrn
     */
    public void removeDestinationUrn() {
        super._map.remove("destinationUrn");
    }

    /**
     * Getter for destinationUrn
     * 
     * @see RelationshipChangeEvent.Fields#destinationUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDestinationUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDestinationUrn();
            case DEFAULT:
            case NULL:
                if (_destinationUrnField!= null) {
                    return _destinationUrnField;
                } else {
                    Object __rawValue = super._map.get("destinationUrn");
                    _destinationUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _destinationUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for destinationUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipChangeEvent.Fields#destinationUrn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDestinationUrn() {
        if (_destinationUrnField!= null) {
            return _destinationUrnField;
        } else {
            Object __rawValue = super._map.get("destinationUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("destinationUrn");
            }
            _destinationUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _destinationUrnField;
        }
    }

    /**
     * Setter for destinationUrn
     * 
     * @see RelationshipChangeEvent.Fields#destinationUrn
     */
    public RelationshipChangeEvent setDestinationUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDestinationUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field destinationUrn of com.linkedin.platform.event.v1.RelationshipChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDestinationUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _destinationUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for destinationUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#destinationUrn
     */
    public RelationshipChangeEvent setDestinationUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field destinationUrn of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "destinationUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _destinationUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for operation
     * 
     * @see RelationshipChangeEvent.Fields#operation
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
     * @see RelationshipChangeEvent.Fields#operation
     */
    public void removeOperation() {
        super._map.remove("operation");
    }

    /**
     * Getter for operation
     * 
     * @see RelationshipChangeEvent.Fields#operation
     */
    @Nullable
    public RelationshipChangeOperation getOperation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOperation();
            case DEFAULT:
            case NULL:
                if (_operationField!= null) {
                    return _operationField;
                } else {
                    Object __rawValue = super._map.get("operation");
                    _operationField = DataTemplateUtil.coerceEnumOutput(__rawValue, RelationshipChangeOperation.class, RelationshipChangeOperation.$UNKNOWN);
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
     * @see RelationshipChangeEvent.Fields#operation
     */
    @Nonnull
    public RelationshipChangeOperation getOperation() {
        if (_operationField!= null) {
            return _operationField;
        } else {
            Object __rawValue = super._map.get("operation");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("operation");
            }
            _operationField = DataTemplateUtil.coerceEnumOutput(__rawValue, RelationshipChangeOperation.class, RelationshipChangeOperation.$UNKNOWN);
            return _operationField;
        }
    }

    /**
     * Setter for operation
     * 
     * @see RelationshipChangeEvent.Fields#operation
     */
    public RelationshipChangeEvent setOperation(
        @Nullable
        RelationshipChangeOperation value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operation of com.linkedin.platform.event.v1.RelationshipChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operation", value.name());
                    _operationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOperation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operation", value.name());
                    _operationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "operation", value.name());
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
     * @see RelationshipChangeEvent.Fields#operation
     */
    public RelationshipChangeEvent setOperation(
        @Nonnull
        RelationshipChangeOperation value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operation of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operation", value.name());
            _operationField = value;
        }
        return this;
    }

    /**
     * Existence checker for relationshipType
     * 
     * @see RelationshipChangeEvent.Fields#relationshipType
     */
    public boolean hasRelationshipType() {
        if (_relationshipTypeField!= null) {
            return true;
        }
        return super._map.containsKey("relationshipType");
    }

    /**
     * Remover for relationshipType
     * 
     * @see RelationshipChangeEvent.Fields#relationshipType
     */
    public void removeRelationshipType() {
        super._map.remove("relationshipType");
    }

    /**
     * Getter for relationshipType
     * 
     * @see RelationshipChangeEvent.Fields#relationshipType
     */
    @Nullable
    public String getRelationshipType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRelationshipType();
            case DEFAULT:
            case NULL:
                if (_relationshipTypeField!= null) {
                    return _relationshipTypeField;
                } else {
                    Object __rawValue = super._map.get("relationshipType");
                    _relationshipTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _relationshipTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for relationshipType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipChangeEvent.Fields#relationshipType
     */
    @Nonnull
    public String getRelationshipType() {
        if (_relationshipTypeField!= null) {
            return _relationshipTypeField;
        } else {
            Object __rawValue = super._map.get("relationshipType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("relationshipType");
            }
            _relationshipTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _relationshipTypeField;
        }
    }

    /**
     * Setter for relationshipType
     * 
     * @see RelationshipChangeEvent.Fields#relationshipType
     */
    public RelationshipChangeEvent setRelationshipType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelationshipType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field relationshipType of com.linkedin.platform.event.v1.RelationshipChangeEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationshipType", value);
                    _relationshipTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelationshipType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relationshipType", value);
                    _relationshipTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relationshipType", value);
                    _relationshipTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relationshipType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#relationshipType
     */
    public RelationshipChangeEvent setRelationshipType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relationshipType of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relationshipType", value);
            _relationshipTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for lifecycleOwner
     * 
     * @see RelationshipChangeEvent.Fields#lifecycleOwner
     */
    public boolean hasLifecycleOwner() {
        if (_lifecycleOwnerField!= null) {
            return true;
        }
        return super._map.containsKey("lifecycleOwner");
    }

    /**
     * Remover for lifecycleOwner
     * 
     * @see RelationshipChangeEvent.Fields#lifecycleOwner
     */
    public void removeLifecycleOwner() {
        super._map.remove("lifecycleOwner");
    }

    /**
     * Getter for lifecycleOwner
     * 
     * @see RelationshipChangeEvent.Fields#lifecycleOwner
     */
    @Nullable
    public String getLifecycleOwner(GetMode mode) {
        return getLifecycleOwner();
    }

    /**
     * Getter for lifecycleOwner
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipChangeEvent.Fields#lifecycleOwner
     */
    @Nullable
    public String getLifecycleOwner() {
        if (_lifecycleOwnerField!= null) {
            return _lifecycleOwnerField;
        } else {
            Object __rawValue = super._map.get("lifecycleOwner");
            _lifecycleOwnerField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _lifecycleOwnerField;
        }
    }

    /**
     * Setter for lifecycleOwner
     * 
     * @see RelationshipChangeEvent.Fields#lifecycleOwner
     */
    public RelationshipChangeEvent setLifecycleOwner(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLifecycleOwner(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLifecycleOwner();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lifecycleOwner", value);
                    _lifecycleOwnerField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lifecycleOwner", value);
                    _lifecycleOwnerField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lifecycleOwner
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#lifecycleOwner
     */
    public RelationshipChangeEvent setLifecycleOwner(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lifecycleOwner of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lifecycleOwner", value);
            _lifecycleOwnerField = value;
        }
        return this;
    }

    /**
     * Existence checker for via
     * 
     * @see RelationshipChangeEvent.Fields#via
     */
    public boolean hasVia() {
        if (_viaField!= null) {
            return true;
        }
        return super._map.containsKey("via");
    }

    /**
     * Remover for via
     * 
     * @see RelationshipChangeEvent.Fields#via
     */
    public void removeVia() {
        super._map.remove("via");
    }

    /**
     * Getter for via
     * 
     * @see RelationshipChangeEvent.Fields#via
     */
    @Nullable
    public String getVia(GetMode mode) {
        return getVia();
    }

    /**
     * Getter for via
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipChangeEvent.Fields#via
     */
    @Nullable
    public String getVia() {
        if (_viaField!= null) {
            return _viaField;
        } else {
            Object __rawValue = super._map.get("via");
            _viaField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _viaField;
        }
    }

    /**
     * Setter for via
     * 
     * @see RelationshipChangeEvent.Fields#via
     */
    public RelationshipChangeEvent setVia(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVia(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVia();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "via", value);
                    _viaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "via", value);
                    _viaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for via
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#via
     */
    public RelationshipChangeEvent setVia(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field via of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "via", value);
            _viaField = value;
        }
        return this;
    }

    /**
     * Existence checker for properties
     * 
     * @see RelationshipChangeEvent.Fields#properties
     */
    public boolean hasProperties() {
        if (_propertiesField!= null) {
            return true;
        }
        return super._map.containsKey("properties");
    }

    /**
     * Remover for properties
     * 
     * @see RelationshipChangeEvent.Fields#properties
     */
    public void removeProperties() {
        super._map.remove("properties");
    }

    /**
     * Getter for properties
     * 
     * @see RelationshipChangeEvent.Fields#properties
     */
    @Nullable
    public StringMap getProperties(GetMode mode) {
        return getProperties();
    }

    /**
     * Getter for properties
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipChangeEvent.Fields#properties
     */
    @Nullable
    public StringMap getProperties() {
        if (_propertiesField!= null) {
            return _propertiesField;
        } else {
            Object __rawValue = super._map.get("properties");
            _propertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _propertiesField;
        }
    }

    /**
     * Setter for properties
     * 
     * @see RelationshipChangeEvent.Fields#properties
     */
    public RelationshipChangeEvent setProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for properties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipChangeEvent.Fields#properties
     */
    public RelationshipChangeEvent setProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field properties of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
            _propertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see RelationshipChangeEvent.Fields#auditStamp
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
     * @see RelationshipChangeEvent.Fields#auditStamp
     */
    public void removeAuditStamp() {
        super._map.remove("auditStamp");
    }

    /**
     * Getter for auditStamp
     * 
     * @see RelationshipChangeEvent.Fields#auditStamp
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
     * @see RelationshipChangeEvent.Fields#auditStamp
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
     * @see RelationshipChangeEvent.Fields#auditStamp
     */
    public RelationshipChangeEvent setAuditStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field auditStamp of com.linkedin.platform.event.v1.RelationshipChangeEvent");
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
     * @see RelationshipChangeEvent.Fields#auditStamp
     */
    public RelationshipChangeEvent setAuditStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditStamp of com.linkedin.platform.event.v1.RelationshipChangeEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
            _auditStampField = value;
        }
        return this;
    }

    @Override
    public RelationshipChangeEvent clone()
        throws CloneNotSupportedException
    {
        RelationshipChangeEvent __clone = ((RelationshipChangeEvent) super.clone());
        __clone.__changeListener = new RelationshipChangeEvent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RelationshipChangeEvent copy()
        throws CloneNotSupportedException
    {
        RelationshipChangeEvent __copy = ((RelationshipChangeEvent) super.copy());
        __copy._auditStampField = null;
        __copy._sourceUrnField = null;
        __copy._auditHeaderField = null;
        __copy._relationshipTypeField = null;
        __copy._destinationUrnField = null;
        __copy._lifecycleOwnerField = null;
        __copy._operationField = null;
        __copy._propertiesField = null;
        __copy._viaField = null;
        __copy.__changeListener = new RelationshipChangeEvent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RelationshipChangeEvent __objectRef;

        private ChangeListener(RelationshipChangeEvent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditStamp":
                    __objectRef._auditStampField = null;
                    break;
                case "sourceUrn":
                    __objectRef._sourceUrnField = null;
                    break;
                case "auditHeader":
                    __objectRef._auditHeaderField = null;
                    break;
                case "relationshipType":
                    __objectRef._relationshipTypeField = null;
                    break;
                case "destinationUrn":
                    __objectRef._destinationUrnField = null;
                    break;
                case "lifecycleOwner":
                    __objectRef._lifecycleOwnerField = null;
                    break;
                case "operation":
                    __objectRef._operationField = null;
                    break;
                case "properties":
                    __objectRef._propertiesField = null;
                    break;
                case "via":
                    __objectRef._viaField = null;
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
         * Kafka audit header containing metadata about the message itself.
         * Includes information like message ID, timestamp, and server details.
         * 
         */
        public com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields auditHeader() {
            return new com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields(getPathComponents(), "auditHeader");
        }

        /**
         * The URN (Uniform Resource Name) of the source entity in the relationship.
         * In a downstream relationship example, this would be the URN of the upstream dataset.
         * 
         */
        public PathSpec sourceUrn() {
            return new PathSpec(getPathComponents(), "sourceUrn");
        }

        /**
         * The URN of the destination entity in the relationship.
         * In a downstream relationship example, this would be the URN of the downstream dataset.
         * 
         */
        public PathSpec destinationUrn() {
            return new PathSpec(getPathComponents(), "destinationUrn");
        }

        /**
         * The operation being performed on this relationship.
         * Typically includes operations like ADD, REMOVE, or RESTATE.
         * 
         */
        public PathSpec operation() {
            return new PathSpec(getPathComponents(), "operation");
        }

        /**
         * The type/category of relationship being established or modified.
         * Examples: "DownstreamOf", "Contains", "OwnedBy", "DerivedFrom", etc.
         * 
         */
        public PathSpec relationshipType() {
            return new PathSpec(getPathComponents(), "relationshipType");
        }

        /**
         * The system or service responsible for managing the lifecycle of this relationship.
         * This helps identify which component has authority over the relationship.
         * 
         */
        public PathSpec lifecycleOwner() {
            return new PathSpec(getPathComponents(), "lifecycleOwner");
        }

        /**
         * Information about how or through what means this relationship was established.
         * Could indicate a specific pipeline, process, or tool that discovered/created the relationship.
         * 
         */
        public PathSpec via() {
            return new PathSpec(getPathComponents(), "via");
        }

        /**
         * Additional custom properties associated with this relationship.
         * Allows for flexible extension without changing the schema.
         * 
         */
        public PathSpec properties() {
            return new PathSpec(getPathComponents(), "properties");
        }

        /**
         * Stores information about who made this change and when.
         * Contains the actor (user or system) that performed the action and the timestamp.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask _auditHeaderMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _auditStampMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * Kafka audit header containing metadata about the message itself.
         * Includes information like message ID, timestamp, and server details.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withAuditHeader(Function<com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask, com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask> nestedMask) {
            _auditHeaderMask = nestedMask.apply(((_auditHeaderMask == null)?KafkaAuditHeader.createMask():_auditHeaderMask));
            getDataMap().put("auditHeader", _auditHeaderMask.getDataMap());
            return this;
        }

        /**
         * Kafka audit header containing metadata about the message itself.
         * Includes information like message ID, timestamp, and server details.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withAuditHeader() {
            _auditHeaderMask = null;
            getDataMap().put("auditHeader", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The URN (Uniform Resource Name) of the source entity in the relationship.
         * In a downstream relationship example, this would be the URN of the upstream dataset.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withSourceUrn() {
            getDataMap().put("sourceUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The URN of the destination entity in the relationship.
         * In a downstream relationship example, this would be the URN of the downstream dataset.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withDestinationUrn() {
            getDataMap().put("destinationUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The operation being performed on this relationship.
         * Typically includes operations like ADD, REMOVE, or RESTATE.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withOperation() {
            getDataMap().put("operation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type/category of relationship being established or modified.
         * Examples: "DownstreamOf", "Contains", "OwnedBy", "DerivedFrom", etc.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withRelationshipType() {
            getDataMap().put("relationshipType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The system or service responsible for managing the lifecycle of this relationship.
         * This helps identify which component has authority over the relationship.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withLifecycleOwner() {
            getDataMap().put("lifecycleOwner", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information about how or through what means this relationship was established.
         * Could indicate a specific pipeline, process, or tool that discovered/created the relationship.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withVia() {
            getDataMap().put("via", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional custom properties associated with this relationship.
         * Allows for flexible extension without changing the schema.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withProperties() {
            getDataMap().put("properties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Stores information about who made this change and when.
         * Contains the actor (user or system) that performed the action and the timestamp.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withAuditStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _auditStampMask = nestedMask.apply(((_auditStampMask == null)?AuditStamp.createMask():_auditStampMask));
            getDataMap().put("auditStamp", _auditStampMask.getDataMap());
            return this;
        }

        /**
         * Stores information about who made this change and when.
         * Contains the actor (user or system) that performed the action and the timestamp.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withAuditStamp(MaskMap nestedMask) {
            getDataMap().put("auditStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * Stores information about who made this change and when.
         * Contains the actor (user or system) that performed the action and the timestamp.
         * 
         */
        public RelationshipChangeEvent.ProjectionMask withAuditStamp() {
            _auditStampMask = null;
            getDataMap().put("auditStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
