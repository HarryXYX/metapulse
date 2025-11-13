
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Kafka event for capturing a failure to process a specific MetadataChangeEvent.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/FailedMetadataChangeProposal.pdl.")
public class FailedMetadataChangeProposal
    extends RecordTemplate
{

    private final static FailedMetadataChangeProposal.Fields _fields = new FailedMetadataChangeProposal.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for capturing a failure to process a specific MetadataChangeEvent.*/record FailedMetadataChangeProposal{/**Kafka audit header. See go/kafkaauditheader for more info.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**The even that failed to be processed.*/metadataChangeProposal:/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.*/record MetadataChangeProposal{/**Kafka audit header. Currently remains unused in the open source.*/auditHeader:optional com.linkedin.avro2pegasus.events.KafkaAuditHeader/**Type of the entity being written to*/entityType:string/**Urn of the entity being written\n*/entityUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Key aspect of the entity being written*/entityKeyAspect:optional/**Generic record structure for serializing an Aspect\n*/record GenericAspect{/**The value of the aspect, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the aspect was serialized.\nThe only type currently supported is application/json.*/contentType:string}/**Type of change being proposed*/changeType:{namespace com.linkedin.events.metadata/**Descriptor for a change action*/enum ChangeType{/**insert if not exists. otherwise update*/UPSERT/**insert if not exists. otherwise fail*/CREATE/**NOT SUPPORTED YET\nupdate if exists. otherwise fail*/UPDATE/**delete action*/DELETE/**patch the changes instead of full replace*/PATCH/**Restate an aspect, eg. in a index refresh.*/RESTATE/**insert if entity not exists. otherwise fail*/CREATE_ENTITY}}/**Aspect of the entity being written to\nNot filling this out implies that the writer wants to affect the entire entity\nNote: This is only valid for CREATE, UPSERT, and DELETE operations.\n*/aspectName:optional string/**The value of the new aspect.*/aspect:optional GenericAspect/**System properties that one might want to attach to an event\n*/systemMetadata:optional/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}/**Headers - intended to mimic http headers*/headers:optional map[string,string]}/**The error message or the stacktrace for the failure.*/error:string}", SchemaFormatType.PDL));
    private KafkaAuditHeader _auditHeaderField = null;
    private MetadataChangeProposal _metadataChangeProposalField = null;
    private String _errorField = null;
    private FailedMetadataChangeProposal.ChangeListener __changeListener = new FailedMetadataChangeProposal.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_MetadataChangeProposal = SCHEMA.getField("metadataChangeProposal");
    private final static RecordDataSchema.Field FIELD_Error = SCHEMA.getField("error");

    public FailedMetadataChangeProposal() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FailedMetadataChangeProposal(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FailedMetadataChangeProposal.Fields fields() {
        return _fields;
    }

    public static FailedMetadataChangeProposal.ProjectionMask createMask() {
        return new FailedMetadataChangeProposal.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see FailedMetadataChangeProposal.Fields#auditHeader
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
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public void removeAuditHeader() {
        super._map.remove("auditHeader");
    }

    /**
     * Getter for auditHeader
     * 
     * @see FailedMetadataChangeProposal.Fields#auditHeader
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
     * @see FailedMetadataChangeProposal.Fields#auditHeader
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
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public FailedMetadataChangeProposal setAuditHeader(
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
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public FailedMetadataChangeProposal setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditHeader of com.linkedin.mxe.FailedMetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditHeader", value.data());
            _auditHeaderField = value;
        }
        return this;
    }

    /**
     * Existence checker for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public boolean hasMetadataChangeProposal() {
        if (_metadataChangeProposalField!= null) {
            return true;
        }
        return super._map.containsKey("metadataChangeProposal");
    }

    /**
     * Remover for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public void removeMetadataChangeProposal() {
        super._map.remove("metadataChangeProposal");
    }

    /**
     * Getter for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    @Nullable
    public MetadataChangeProposal getMetadataChangeProposal(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetadataChangeProposal();
            case DEFAULT:
            case NULL:
                if (_metadataChangeProposalField!= null) {
                    return _metadataChangeProposalField;
                } else {
                    Object __rawValue = super._map.get("metadataChangeProposal");
                    _metadataChangeProposalField = ((__rawValue == null)?null:new MetadataChangeProposal(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _metadataChangeProposalField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metadataChangeProposal
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    @Nonnull
    public MetadataChangeProposal getMetadataChangeProposal() {
        if (_metadataChangeProposalField!= null) {
            return _metadataChangeProposalField;
        } else {
            Object __rawValue = super._map.get("metadataChangeProposal");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metadataChangeProposal");
            }
            _metadataChangeProposalField = ((__rawValue == null)?null:new MetadataChangeProposal(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _metadataChangeProposalField;
        }
    }

    /**
     * Setter for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public FailedMetadataChangeProposal setMetadataChangeProposal(
        @Nullable
        MetadataChangeProposal value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadataChangeProposal(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metadataChangeProposal of com.linkedin.mxe.FailedMetadataChangeProposal");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadataChangeProposal", value.data());
                    _metadataChangeProposalField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadataChangeProposal();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadataChangeProposal", value.data());
                    _metadataChangeProposalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadataChangeProposal", value.data());
                    _metadataChangeProposalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadataChangeProposal
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public FailedMetadataChangeProposal setMetadataChangeProposal(
        @Nonnull
        MetadataChangeProposal value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadataChangeProposal of com.linkedin.mxe.FailedMetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadataChangeProposal", value.data());
            _metadataChangeProposalField = value;
        }
        return this;
    }

    /**
     * Existence checker for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public boolean hasError() {
        if (_errorField!= null) {
            return true;
        }
        return super._map.containsKey("error");
    }

    /**
     * Remover for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public void removeError() {
        super._map.remove("error");
    }

    /**
     * Getter for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    @Nullable
    public String getError(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getError();
            case DEFAULT:
            case NULL:
                if (_errorField!= null) {
                    return _errorField;
                } else {
                    Object __rawValue = super._map.get("error");
                    _errorField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _errorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for error
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FailedMetadataChangeProposal.Fields#error
     */
    @Nonnull
    public String getError() {
        if (_errorField!= null) {
            return _errorField;
        } else {
            Object __rawValue = super._map.get("error");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("error");
            }
            _errorField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _errorField;
        }
    }

    /**
     * Setter for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public FailedMetadataChangeProposal setError(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setError(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field error of com.linkedin.mxe.FailedMetadataChangeProposal");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "error", value);
                    _errorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeError();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "error", value);
                    _errorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "error", value);
                    _errorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for error
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public FailedMetadataChangeProposal setError(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field error of com.linkedin.mxe.FailedMetadataChangeProposal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "error", value);
            _errorField = value;
        }
        return this;
    }

    @Override
    public FailedMetadataChangeProposal clone()
        throws CloneNotSupportedException
    {
        FailedMetadataChangeProposal __clone = ((FailedMetadataChangeProposal) super.clone());
        __clone.__changeListener = new FailedMetadataChangeProposal.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FailedMetadataChangeProposal copy()
        throws CloneNotSupportedException
    {
        FailedMetadataChangeProposal __copy = ((FailedMetadataChangeProposal) super.copy());
        __copy._auditHeaderField = null;
        __copy._metadataChangeProposalField = null;
        __copy._errorField = null;
        __copy.__changeListener = new FailedMetadataChangeProposal.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FailedMetadataChangeProposal __objectRef;

        private ChangeListener(FailedMetadataChangeProposal reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditHeader":
                    __objectRef._auditHeaderField = null;
                    break;
                case "metadataChangeProposal":
                    __objectRef._metadataChangeProposalField = null;
                    break;
                case "error":
                    __objectRef._errorField = null;
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
         * Kafka audit header. See go/kafkaauditheader for more info.
         * 
         */
        public com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields auditHeader() {
            return new com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields(getPathComponents(), "auditHeader");
        }

        /**
         * The even that failed to be processed.
         * 
         */
        public com.linkedin.mxe.MetadataChangeProposal.Fields metadataChangeProposal() {
            return new com.linkedin.mxe.MetadataChangeProposal.Fields(getPathComponents(), "metadataChangeProposal");
        }

        /**
         * The error message or the stacktrace for the failure.
         * 
         */
        public PathSpec error() {
            return new PathSpec(getPathComponents(), "error");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask _auditHeaderMask;
        private com.linkedin.mxe.MetadataChangeProposal.ProjectionMask _metadataChangeProposalMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Kafka audit header. See go/kafkaauditheader for more info.
         * 
         */
        public FailedMetadataChangeProposal.ProjectionMask withAuditHeader(Function<com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask, com.linkedin.avro2pegasus.events.KafkaAuditHeader.ProjectionMask> nestedMask) {
            _auditHeaderMask = nestedMask.apply(((_auditHeaderMask == null)?KafkaAuditHeader.createMask():_auditHeaderMask));
            getDataMap().put("auditHeader", _auditHeaderMask.getDataMap());
            return this;
        }

        /**
         * Kafka audit header. See go/kafkaauditheader for more info.
         * 
         */
        public FailedMetadataChangeProposal.ProjectionMask withAuditHeader() {
            _auditHeaderMask = null;
            getDataMap().put("auditHeader", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The even that failed to be processed.
         * 
         */
        public FailedMetadataChangeProposal.ProjectionMask withMetadataChangeProposal(Function<com.linkedin.mxe.MetadataChangeProposal.ProjectionMask, com.linkedin.mxe.MetadataChangeProposal.ProjectionMask> nestedMask) {
            _metadataChangeProposalMask = nestedMask.apply(((_metadataChangeProposalMask == null)?MetadataChangeProposal.createMask():_metadataChangeProposalMask));
            getDataMap().put("metadataChangeProposal", _metadataChangeProposalMask.getDataMap());
            return this;
        }

        /**
         * The even that failed to be processed.
         * 
         */
        public FailedMetadataChangeProposal.ProjectionMask withMetadataChangeProposal() {
            _metadataChangeProposalMask = null;
            getDataMap().put("metadataChangeProposal", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The error message or the stacktrace for the failure.
         * 
         */
        public FailedMetadataChangeProposal.ProjectionMask withError() {
            getDataMap().put("error", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
