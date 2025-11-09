
package com.linkedin.mxe;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.avro2pegasus.events.KafkaAuditHeader;
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
import com.linkedin.events.metadata.ChangeType;


/**
 * Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/mxe/MetadataChangeProposal.pdl.")
public class MetadataChangeProposal
    extends RecordTemplate
{

    private final static MetadataChangeProposal.Fields _fields = new MetadataChangeProposal.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.*/record MetadataChangeProposal{/**Kafka audit header. Currently remains unused in the open source.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**Type of the entity being written to*/entityType:string/**Urn of the entity being written\n*/entityUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Key aspect of the entity being written*/entityKeyAspect:optional/**Generic record structure for serializing an Aspect\n*/record GenericAspect{/**The value of the aspect, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the aspect was serialized.\nThe only type currently supported is application/json.*/contentType:string}/**Type of change being proposed*/changeType:{namespace com.linkedin.events.metadata/**Descriptor for a change action*/enum ChangeType{/**insert if not exists. otherwise update*/UPSERT/**insert if not exists. otherwise fail*/CREATE/**NOT SUPPORTED YET\nupdate if exists. otherwise fail*/UPDATE/**delete action*/DELETE/**patch the changes instead of full replace*/PATCH/**Restate an aspect, eg. in a index refresh.*/RESTATE/**insert if entity not exists. otherwise fail*/CREATE_ENTITY}}/**Aspect of the entity being written to\nNot filling this out implies that the writer wants to affect the entire entity\nNote: This is only valid for CREATE, UPSERT, and DELETE operations.\n*/aspectName:optional string/**The value of the new aspect.*/aspect:optional GenericAspect/**System properties that one might want to attach to an event\n*/systemMetadata:optional/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}/**Headers - intended to mimic http headers*/headers:optional map[string,string]}", SchemaFormatType.PDL));
    private KafkaAuditHeader _auditHeaderField = null;
    private String _entityTypeField = null;
    private com.linkedin.common.urn.Urn _entityUrnField = null;
    private GenericAspect _entityKeyAspectField = null;
    private ChangeType _changeTypeField = null;
    private String _aspectNameField = null;
    private GenericAspect _aspectField = null;
    private SystemMetadata _systemMetadataField = null;
    private StringMap _headersField = null;
    private MetadataChangeProposal.ChangeListener __changeListener = new MetadataChangeProposal.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_EntityType = SCHEMA.getField("entityType");
    private final static RecordDataSchema.Field FIELD_EntityUrn = SCHEMA.getField("entityUrn");
    private final static RecordDataSchema.Field FIELD_EntityKeyAspect = SCHEMA.getField("entityKeyAspect");
    private final static RecordDataSchema.Field FIELD_ChangeType = SCHEMA.getField("changeType");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_SystemMetadata = SCHEMA.getField("systemMetadata");
    private final static RecordDataSchema.Field FIELD_Headers = SCHEMA.getField("headers");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public MetadataChangeProposal() {
        super(new DataMap(12, 0.75F), SCHEMA, 7);
        addChangeListener(__changeListener);
    }

    public MetadataChangeProposal(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MetadataChangeProposal.Fields fields() {
        return _fields;
    }

    public static MetadataChangeProposal.ProjectionMask createMask() {
        return new MetadataChangeProposal.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see MetadataChangeProposal.Fields#auditHeader
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
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public void removeAuditHeader() {
        super._map.remove("auditHeader");
    }

    /**
     * Getter for auditHeader
     * 
     * @see MetadataChangeProposal.Fields#auditHeader
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
     * @see MetadataChangeProposal.Fields#auditHeader
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
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public MetadataChangeProposal setAuditHeader(
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
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public MetadataChangeProposal setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditHeader of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditHeader", value.data());
            _auditHeaderField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityType
     * 
     * @see MetadataChangeProposal.Fields#entityType
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
     * @see MetadataChangeProposal.Fields#entityType
     */
    public void removeEntityType() {
        super._map.remove("entityType");
    }

    /**
     * Getter for entityType
     * 
     * @see MetadataChangeProposal.Fields#entityType
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
     * @see MetadataChangeProposal.Fields#entityType
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
     * @see MetadataChangeProposal.Fields#entityType
     */
    public MetadataChangeProposal setEntityType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityType of com.linkedin.mxe.MetadataChangeProposal");
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
     * @see MetadataChangeProposal.Fields#entityType
     */
    public MetadataChangeProposal setEntityType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityType of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityType", value);
            _entityTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
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
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public void removeEntityUrn() {
        super._map.remove("entityUrn");
    }

    /**
     * Getter for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntityUrn(GetMode mode) {
        return getEntityUrn();
    }

    /**
     * Getter for entityUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntityUrn() {
        if (_entityUrnField!= null) {
            return _entityUrnField;
        } else {
            Object __rawValue = super._map.get("entityUrn");
            _entityUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityUrnField;
        }
    }

    /**
     * Setter for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public MetadataChangeProposal setEntityUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public MetadataChangeProposal setEntityUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityUrn of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityUrnField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public boolean hasEntityKeyAspect() {
        if (_entityKeyAspectField!= null) {
            return true;
        }
        return super._map.containsKey("entityKeyAspect");
    }

    /**
     * Remover for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public void removeEntityKeyAspect() {
        super._map.remove("entityKeyAspect");
    }

    /**
     * Getter for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    @Nullable
    public GenericAspect getEntityKeyAspect(GetMode mode) {
        return getEntityKeyAspect();
    }

    /**
     * Getter for entityKeyAspect
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    @Nullable
    public GenericAspect getEntityKeyAspect() {
        if (_entityKeyAspectField!= null) {
            return _entityKeyAspectField;
        } else {
            Object __rawValue = super._map.get("entityKeyAspect");
            _entityKeyAspectField = ((__rawValue == null)?null:new GenericAspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _entityKeyAspectField;
        }
    }

    /**
     * Setter for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public MetadataChangeProposal setEntityKeyAspect(
        @Nullable
        GenericAspect value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityKeyAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityKeyAspect();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityKeyAspect", value.data());
                    _entityKeyAspectField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityKeyAspect", value.data());
                    _entityKeyAspectField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityKeyAspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public MetadataChangeProposal setEntityKeyAspect(
        @Nonnull
        GenericAspect value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityKeyAspect of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityKeyAspect", value.data());
            _entityKeyAspectField = value;
        }
        return this;
    }

    /**
     * Existence checker for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public boolean hasChangeType() {
        if (_changeTypeField!= null) {
            return true;
        }
        return super._map.containsKey("changeType");
    }

    /**
     * Remover for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public void removeChangeType() {
        super._map.remove("changeType");
    }

    /**
     * Getter for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    @Nullable
    public ChangeType getChangeType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getChangeType();
            case DEFAULT:
            case NULL:
                if (_changeTypeField!= null) {
                    return _changeTypeField;
                } else {
                    Object __rawValue = super._map.get("changeType");
                    _changeTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, ChangeType.class, ChangeType.$UNKNOWN);
                    return _changeTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for changeType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataChangeProposal.Fields#changeType
     */
    @Nonnull
    public ChangeType getChangeType() {
        if (_changeTypeField!= null) {
            return _changeTypeField;
        } else {
            Object __rawValue = super._map.get("changeType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("changeType");
            }
            _changeTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, ChangeType.class, ChangeType.$UNKNOWN);
            return _changeTypeField;
        }
    }

    /**
     * Setter for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public MetadataChangeProposal setChangeType(
        @Nullable
        ChangeType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChangeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field changeType of com.linkedin.mxe.MetadataChangeProposal");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
                    _changeTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChangeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
                    _changeTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
                    _changeTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for changeType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#changeType
     */
    public MetadataChangeProposal setChangeType(
        @Nonnull
        ChangeType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field changeType of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
            _changeTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public boolean hasAspectName() {
        if (_aspectNameField!= null) {
            return true;
        }
        return super._map.containsKey("aspectName");
    }

    /**
     * Remover for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public void removeAspectName() {
        super._map.remove("aspectName");
    }

    /**
     * Getter for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    @Nullable
    public String getAspectName(GetMode mode) {
        return getAspectName();
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#aspectName
     */
    @Nullable
    public String getAspectName() {
        if (_aspectNameField!= null) {
            return _aspectNameField;
        } else {
            Object __rawValue = super._map.get("aspectName");
            _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectNameField;
        }
    }

    /**
     * Setter for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public MetadataChangeProposal setAspectName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public MetadataChangeProposal setAspectName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectName of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
            _aspectNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public boolean hasAspect() {
        if (_aspectField!= null) {
            return true;
        }
        return super._map.containsKey("aspect");
    }

    /**
     * Remover for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public void removeAspect() {
        super._map.remove("aspect");
    }

    /**
     * Getter for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    @Nullable
    public GenericAspect getAspect(GetMode mode) {
        return getAspect();
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#aspect
     */
    @Nullable
    public GenericAspect getAspect() {
        if (_aspectField!= null) {
            return _aspectField;
        } else {
            Object __rawValue = super._map.get("aspect");
            _aspectField = ((__rawValue == null)?null:new GenericAspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aspectField;
        }
    }

    /**
     * Setter for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public MetadataChangeProposal setAspect(
        @Nullable
        GenericAspect value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspect();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
                    _aspectField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
                    _aspectField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#aspect
     */
    public MetadataChangeProposal setAspect(
        @Nonnull
        GenericAspect value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspect of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
            _aspectField = value;
        }
        return this;
    }

    /**
     * Existence checker for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public boolean hasSystemMetadata() {
        if (_systemMetadataField!= null) {
            return true;
        }
        return super._map.containsKey("systemMetadata");
    }

    /**
     * Remover for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public void removeSystemMetadata() {
        super._map.remove("systemMetadata");
    }

    /**
     * Getter for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    @Nullable
    public SystemMetadata getSystemMetadata(GetMode mode) {
        return getSystemMetadata();
    }

    /**
     * Getter for systemMetadata
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    @Nullable
    public SystemMetadata getSystemMetadata() {
        if (_systemMetadataField!= null) {
            return _systemMetadataField;
        } else {
            Object __rawValue = super._map.get("systemMetadata");
            _systemMetadataField = ((__rawValue == null)?null:new SystemMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _systemMetadataField;
        }
    }

    /**
     * Setter for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public MetadataChangeProposal setSystemMetadata(
        @Nullable
        SystemMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSystemMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSystemMetadata();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
                    _systemMetadataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
                    _systemMetadataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for systemMetadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public MetadataChangeProposal setSystemMetadata(
        @Nonnull
        SystemMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field systemMetadata of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
            _systemMetadataField = value;
        }
        return this;
    }

    /**
     * Existence checker for headers
     * 
     * @see MetadataChangeProposal.Fields#headers
     */
    public boolean hasHeaders() {
        if (_headersField!= null) {
            return true;
        }
        return super._map.containsKey("headers");
    }

    /**
     * Remover for headers
     * 
     * @see MetadataChangeProposal.Fields#headers
     */
    public void removeHeaders() {
        super._map.remove("headers");
    }

    /**
     * Getter for headers
     * 
     * @see MetadataChangeProposal.Fields#headers
     */
    @Nullable
    public StringMap getHeaders(GetMode mode) {
        return getHeaders();
    }

    /**
     * Getter for headers
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#headers
     */
    @Nullable
    public StringMap getHeaders() {
        if (_headersField!= null) {
            return _headersField;
        } else {
            Object __rawValue = super._map.get("headers");
            _headersField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _headersField;
        }
    }

    /**
     * Setter for headers
     * 
     * @see MetadataChangeProposal.Fields#headers
     */
    public MetadataChangeProposal setHeaders(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setHeaders(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeHeaders();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "headers", value.data());
                    _headersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "headers", value.data());
                    _headersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for headers
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#headers
     */
    public MetadataChangeProposal setHeaders(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field headers of com.linkedin.mxe.MetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "headers", value.data());
            _headersField = value;
        }
        return this;
    }

    @Override
    public MetadataChangeProposal clone()
        throws CloneNotSupportedException
    {
        MetadataChangeProposal __clone = ((MetadataChangeProposal) super.clone());
        __clone.__changeListener = new MetadataChangeProposal.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MetadataChangeProposal copy()
        throws CloneNotSupportedException
    {
        MetadataChangeProposal __copy = ((MetadataChangeProposal) super.copy());
        __copy._aspectNameField = null;
        __copy._headersField = null;
        __copy._auditHeaderField = null;
        __copy._entityUrnField = null;
        __copy._entityTypeField = null;
        __copy._changeTypeField = null;
        __copy._aspectField = null;
        __copy._systemMetadataField = null;
        __copy._entityKeyAspectField = null;
        __copy.__changeListener = new MetadataChangeProposal.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MetadataChangeProposal __objectRef;

        private ChangeListener(MetadataChangeProposal reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspectName":
                    __objectRef._aspectNameField = null;
                    break;
                case "headers":
                    __objectRef._headersField = null;
                    break;
                case "auditHeader":
                    __objectRef._auditHeaderField = null;
                    break;
                case "entityUrn":
                    __objectRef._entityUrnField = null;
                    break;
                case "entityType":
                    __objectRef._entityTypeField = null;
                    break;
                case "changeType":
                    __objectRef._changeTypeField = null;
                    break;
                case "aspect":
                    __objectRef._aspectField = null;
                    break;
                case "systemMetadata":
                    __objectRef._systemMetadataField = null;
                    break;
                case "entityKeyAspect":
                    __objectRef._entityKeyAspectField = null;
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
         * Kafka audit header. Currently remains unused in the open source.
         * 
         */
        public com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields auditHeader() {
            return new com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields(getPathComponents(), "auditHeader");
        }

        /**
         * Type of the entity being written to
         * 
         */
        public PathSpec entityType() {
            return new PathSpec(getPathComponents(), "entityType");
        }

        /**
         * Urn of the entity being written
         * 
         * 
         */
        public PathSpec entityUrn() {
            return new PathSpec(getPathComponents(), "entityUrn");
        }

        /**
         * Key aspect of the entity being written
         * 
         */
        public com.linkedin.mxe.GenericAspect.Fields entityKeyAspect() {
            return new com.linkedin.mxe.GenericAspect.Fields(getPathComponents(), "entityKeyAspect");
        }

        /**
         * Type of change being proposed
         * 
         */
        public PathSpec changeType() {
            return new PathSpec(getPathComponents(), "changeType");
        }

        /**
         * Aspect of the entity being written to
         * Not filling this out implies that the writer wants to affect the entire entity
         * Note: This is only valid for CREATE, UPSERT, and DELETE operations.
         * 
         * 
         */
        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        /**
         * The value of the new aspect.
         * 
         */
        public com.linkedin.mxe.GenericAspect.Fields aspect() {
            return new com.linkedin.mxe.GenericAspect.Fields(getPathComponents(), "aspect");
        }

        /**
         * System properties that one might want to attach to an event
         * 
         * 
         */
        public com.linkedin.mxe.SystemMetadata.Fields systemMetadata() {
            return new com.linkedin.mxe.SystemMetadata.Fields(getPathComponents(), "systemMetadata");
        }

        /**
         * Headers - intended to mimic http headers
         * 
         */
        public PathSpec headers() {
            return new PathSpec(getPathComponents(), "headers");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask _auditHeaderMask;
        private com.linkedin.mxe.GenericAspect.ProjectionMask _entityKeyAspectMask;
        private com.linkedin.mxe.GenericAspect.ProjectionMask _aspectMask;
        private com.linkedin.mxe.SystemMetadata.ProjectionMask _systemMetadataMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * Kafka audit header. Currently remains unused in the open source.
         * 
         */
        public MetadataChangeProposal.ProjectionMask withAuditHeader(Function<com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask, com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask> nestedMask) {
            _auditHeaderMask = nestedMask.apply(((_auditHeaderMask == null)?KafkaAuditHeader.createMask():_auditHeaderMask));
            getDataMap().put("auditHeader", _auditHeaderMask.getDataMap());
            return this;
        }

        /**
         * Kafka audit header. Currently remains unused in the open source.
         * 
         */
        public MetadataChangeProposal.ProjectionMask withAuditHeader() {
            _auditHeaderMask = null;
            getDataMap().put("auditHeader", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of the entity being written to
         * 
         */
        public MetadataChangeProposal.ProjectionMask withEntityType() {
            getDataMap().put("entityType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Urn of the entity being written
         * 
         * 
         */
        public MetadataChangeProposal.ProjectionMask withEntityUrn() {
            getDataMap().put("entityUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Key aspect of the entity being written
         * 
         */
        public MetadataChangeProposal.ProjectionMask withEntityKeyAspect(Function<com.linkedin.mxe.GenericAspect.ProjectionMask, com.linkedin.mxe.GenericAspect.ProjectionMask> nestedMask) {
            _entityKeyAspectMask = nestedMask.apply(((_entityKeyAspectMask == null)?GenericAspect.createMask():_entityKeyAspectMask));
            getDataMap().put("entityKeyAspect", _entityKeyAspectMask.getDataMap());
            return this;
        }

        /**
         * Key aspect of the entity being written
         * 
         */
        public MetadataChangeProposal.ProjectionMask withEntityKeyAspect() {
            _entityKeyAspectMask = null;
            getDataMap().put("entityKeyAspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of change being proposed
         * 
         */
        public MetadataChangeProposal.ProjectionMask withChangeType() {
            getDataMap().put("changeType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Aspect of the entity being written to
         * Not filling this out implies that the writer wants to affect the entire entity
         * Note: This is only valid for CREATE, UPSERT, and DELETE operations.
         * 
         * 
         */
        public MetadataChangeProposal.ProjectionMask withAspectName() {
            getDataMap().put("aspectName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The value of the new aspect.
         * 
         */
        public MetadataChangeProposal.ProjectionMask withAspect(Function<com.linkedin.mxe.GenericAspect.ProjectionMask, com.linkedin.mxe.GenericAspect.ProjectionMask> nestedMask) {
            _aspectMask = nestedMask.apply(((_aspectMask == null)?GenericAspect.createMask():_aspectMask));
            getDataMap().put("aspect", _aspectMask.getDataMap());
            return this;
        }

        /**
         * The value of the new aspect.
         * 
         */
        public MetadataChangeProposal.ProjectionMask withAspect() {
            _aspectMask = null;
            getDataMap().put("aspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * System properties that one might want to attach to an event
         * 
         * 
         */
        public MetadataChangeProposal.ProjectionMask withSystemMetadata(Function<com.linkedin.mxe.SystemMetadata.ProjectionMask, com.linkedin.mxe.SystemMetadata.ProjectionMask> nestedMask) {
            _systemMetadataMask = nestedMask.apply(((_systemMetadataMask == null)?SystemMetadata.createMask():_systemMetadataMask));
            getDataMap().put("systemMetadata", _systemMetadataMask.getDataMap());
            return this;
        }

        /**
         * System properties that one might want to attach to an event
         * 
         * 
         */
        public MetadataChangeProposal.ProjectionMask withSystemMetadata() {
            _systemMetadataMask = null;
            getDataMap().put("systemMetadata", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Headers - intended to mimic http headers
         * 
         */
        public MetadataChangeProposal.ProjectionMask withHeaders() {
            getDataMap().put("headers", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
