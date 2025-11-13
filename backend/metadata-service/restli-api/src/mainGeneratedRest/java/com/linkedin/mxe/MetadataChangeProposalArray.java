
package com.linkedin.mxe;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.aspects.restspec.json.")
public class MetadataChangeProposalArray
    extends WrappingArrayTemplate<MetadataChangeProposal>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"MetadataChangeProposal\",\"namespace\":\"com.linkedin.mxe\",\"doc\":\"Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.\",\"fields\":[{\"name\":\"auditHeader\",\"type\":{\"type\":\"record\",\"name\":\"KafkaAuditHeader\",\"namespace\":\"com.linkedin.avro2pegasus.events\",\"doc\":\"This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader\",\"fields\":[{\"name\":\"time\",\"type\":\"long\",\"doc\":\"The time at which the event was emitted into kafka.\",\"compliance\":[{\"policy\":\"EVENT_TIME\"}]},{\"name\":\"server\",\"type\":\"string\",\"doc\":\"The fully qualified name of the host from which the event is being emitted.\",\"compliance\":\"NONE\"},{\"name\":\"instance\",\"type\":\"string\",\"doc\":\"The instance on the server from which the event is being emitted. e.g. i001\",\"optional\":true,\"compliance\":\"NONE\"},{\"name\":\"appName\",\"type\":\"string\",\"doc\":\"The name of the application from which the event is being emitted. see go/appname\",\"compliance\":\"NONE\"},{\"name\":\"messageId\",\"type\":{\"type\":\"fixed\",\"name\":\"UUID\",\"size\":16},\"doc\":\"A unique identifier for the message\",\"compliance\":\"NONE\"},{\"name\":\"auditVersion\",\"type\":\"int\",\"doc\":\"The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing\",\"optional\":true,\"compliance\":\"NONE\"},{\"name\":\"fabricUrn\",\"type\":\"string\",\"doc\":\"The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.\",\"optional\":true,\"compliance\":\"NONE\"},{\"name\":\"clusterConnectionString\",\"type\":\"string\",\"doc\":\"This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.\",\"optional\":true,\"compliance\":\"NONE\"}]},\"doc\":\"Kafka audit header. Currently remains unused in the open source.\",\"optional\":true},{\"name\":\"entityType\",\"type\":\"string\",\"doc\":\"Type of the entity being written to\"},{\"name\":\"entityUrn\",\"type\":{\"type\":\"typeref\",\"name\":\"Urn\",\"namespace\":\"com.linkedin.common\",\"ref\":\"string\",\"java\":{\"class\":\"com.linkedin.common.urn.Urn\"}},\"doc\":\"Urn of the entity being written\\n\",\"optional\":true},{\"name\":\"entityKeyAspect\",\"type\":{\"type\":\"record\",\"name\":\"GenericAspect\",\"doc\":\"Generic record structure for serializing an Aspect\\n\",\"fields\":[{\"name\":\"value\",\"type\":\"bytes\",\"doc\":\"The value of the aspect, serialized as bytes.\"},{\"name\":\"contentType\",\"type\":\"string\",\"doc\":\"The content type, which represents the fashion in which the aspect was serialized.\\nThe only type currently supported is application/json.\"}]},\"doc\":\"Key aspect of the entity being written\",\"optional\":true},{\"name\":\"changeType\",\"type\":{\"type\":\"enum\",\"name\":\"ChangeType\",\"namespace\":\"com.linkedin.events.metadata\",\"doc\":\"Descriptor for a change action\",\"symbols\":[\"UPSERT\",\"CREATE\",\"UPDATE\",\"DELETE\",\"PATCH\",\"RESTATE\",\"CREATE_ENTITY\"],\"symbolDocs\":{\"CREATE\":\"insert if not exists. otherwise fail\",\"CREATE_ENTITY\":\"insert if entity not exists. otherwise fail\",\"DELETE\":\"delete action\",\"PATCH\":\"patch the changes instead of full replace\",\"RESTATE\":\"Restate an aspect, eg. in a index refresh.\",\"UPDATE\":\"NOT SUPPORTED YET\\nupdate if exists. otherwise fail\",\"UPSERT\":\"insert if not exists. otherwise update\"}},\"doc\":\"Type of change being proposed\"},{\"name\":\"aspectName\",\"type\":\"string\",\"doc\":\"Aspect of the entity being written to\\nNot filling this out implies that the writer wants to affect the entire entity\\nNote: This is only valid for CREATE, UPSERT, and DELETE operations.\\n\",\"optional\":true},{\"name\":\"aspect\",\"type\":\"GenericAspect\",\"doc\":\"The value of the new aspect.\",\"optional\":true},{\"name\":\"systemMetadata\",\"type\":{\"type\":\"record\",\"name\":\"SystemMetadata\",\"doc\":\"Metadata associated with each metadata change that is processed by the system\",\"fields\":[{\"name\":\"lastObserved\",\"type\":\"long\",\"doc\":\"The timestamp the metadata was observed at\",\"default\":0,\"optional\":true},{\"name\":\"runId\",\"type\":\"string\",\"doc\":\"The original run id that produced the metadata. Populated in case of batch-ingestion.\",\"default\":\"no-run-id-provided\",\"optional\":true},{\"name\":\"lastRunId\",\"type\":\"string\",\"doc\":\"The last run id that produced the metadata. Populated in case of batch-ingestion.\",\"default\":\"no-run-id-provided\",\"optional\":true},{\"name\":\"pipelineName\",\"type\":\"string\",\"doc\":\"The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.\",\"optional\":true},{\"name\":\"registryName\",\"type\":\"string\",\"doc\":\"The model registry name that was used to process this event\",\"optional\":true},{\"name\":\"registryVersion\",\"type\":\"string\",\"doc\":\"The model registry version that was used to process this event\",\"optional\":true},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"doc\":\"Additional properties\",\"optional\":true},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"Aspect version\\n   Initial implementation will use the aspect version's number, however stored as\\n   a string in the case where a different aspect versioning scheme is later adopted.\",\"optional\":true},{\"name\":\"aspectCreated\",\"type\":{\"type\":\"record\",\"name\":\"AuditStamp\",\"namespace\":\"com.linkedin.common\",\"doc\":\"Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.\",\"fields\":[{\"name\":\"time\",\"type\":{\"type\":\"typeref\",\"name\":\"Time\",\"doc\":\"Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number\",\"ref\":\"long\"},\"doc\":\"When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.\"},{\"name\":\"actor\",\"type\":\"Urn\",\"doc\":\"The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.\"},{\"name\":\"impersonator\",\"type\":\"Urn\",\"doc\":\"The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.\",\"optional\":true},{\"name\":\"message\",\"type\":\"string\",\"doc\":\"Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.\",\"optional\":true}]},\"doc\":\"When the aspect was initially created and who created it, detected by version 0 -> 1 change\",\"optional\":true},{\"name\":\"aspectModified\",\"type\":\"com.linkedin.common.AuditStamp\",\"doc\":\"When the aspect was last modified and the actor that performed the modification\",\"optional\":true}],\"Aspect\":{\"name\":\"systemMetadata\"}},\"doc\":\"System properties that one might want to attach to an event\\n\",\"optional\":true},{\"name\":\"headers\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"doc\":\"Headers - intended to mimic http headers\",\"optional\":true}]}}"));

    public MetadataChangeProposalArray() {
        this(new DataList());
    }

    public MetadataChangeProposalArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MetadataChangeProposalArray(Collection<MetadataChangeProposal> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MetadataChangeProposalArray(DataList data) {
        super(data, SCHEMA, MetadataChangeProposal.class);
    }

    public MetadataChangeProposalArray(MetadataChangeProposal first, MetadataChangeProposal... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public MetadataChangeProposalArray clone()
        throws CloneNotSupportedException
    {
        MetadataChangeProposalArray __clone = ((MetadataChangeProposalArray) super.clone());
        return __clone;
    }

    @Override
    public MetadataChangeProposalArray copy()
        throws CloneNotSupportedException
    {
        MetadataChangeProposalArray __copy = ((MetadataChangeProposalArray) super.copy());
        return __copy;
    }

    @Override
    protected MetadataChangeProposal coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new MetadataChangeProposal(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.mxe.MetadataChangeProposal.Fields items() {
            return new com.linkedin.mxe.MetadataChangeProposal.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
