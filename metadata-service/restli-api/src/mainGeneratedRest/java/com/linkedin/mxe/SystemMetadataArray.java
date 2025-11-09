
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/idl/com.linkedin.entity.entities.restspec.json.")
public class SystemMetadataArray
    extends WrappingArrayTemplate<SystemMetadata>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SystemMetadata\",\"namespace\":\"com.linkedin.mxe\",\"doc\":\"Metadata associated with each metadata change that is processed by the system\",\"fields\":[{\"name\":\"lastObserved\",\"type\":\"long\",\"doc\":\"The timestamp the metadata was observed at\",\"default\":0,\"optional\":true},{\"name\":\"runId\",\"type\":\"string\",\"doc\":\"The original run id that produced the metadata. Populated in case of batch-ingestion.\",\"default\":\"no-run-id-provided\",\"optional\":true},{\"name\":\"lastRunId\",\"type\":\"string\",\"doc\":\"The last run id that produced the metadata. Populated in case of batch-ingestion.\",\"default\":\"no-run-id-provided\",\"optional\":true},{\"name\":\"pipelineName\",\"type\":\"string\",\"doc\":\"The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.\",\"optional\":true},{\"name\":\"registryName\",\"type\":\"string\",\"doc\":\"The model registry name that was used to process this event\",\"optional\":true},{\"name\":\"registryVersion\",\"type\":\"string\",\"doc\":\"The model registry version that was used to process this event\",\"optional\":true},{\"name\":\"properties\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"doc\":\"Additional properties\",\"optional\":true},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"Aspect version\\n   Initial implementation will use the aspect version's number, however stored as\\n   a string in the case where a different aspect versioning scheme is later adopted.\",\"optional\":true},{\"name\":\"aspectCreated\",\"type\":{\"type\":\"record\",\"name\":\"AuditStamp\",\"namespace\":\"com.linkedin.common\",\"doc\":\"Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.\",\"fields\":[{\"name\":\"time\",\"type\":{\"type\":\"typeref\",\"name\":\"Time\",\"doc\":\"Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number\",\"ref\":\"long\"},\"doc\":\"When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.\"},{\"name\":\"actor\",\"type\":{\"type\":\"typeref\",\"name\":\"Urn\",\"ref\":\"string\",\"java\":{\"class\":\"com.linkedin.common.urn.Urn\"}},\"doc\":\"The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.\"},{\"name\":\"impersonator\",\"type\":\"Urn\",\"doc\":\"The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.\",\"optional\":true},{\"name\":\"message\",\"type\":\"string\",\"doc\":\"Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.\",\"optional\":true}]},\"doc\":\"When the aspect was initially created and who created it, detected by version 0 -> 1 change\",\"optional\":true},{\"name\":\"aspectModified\",\"type\":\"com.linkedin.common.AuditStamp\",\"doc\":\"When the aspect was last modified and the actor that performed the modification\",\"optional\":true}],\"Aspect\":{\"name\":\"systemMetadata\"}}}"));

    public SystemMetadataArray() {
        this(new DataList());
    }

    public SystemMetadataArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SystemMetadataArray(Collection<SystemMetadata> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SystemMetadataArray(DataList data) {
        super(data, SCHEMA, SystemMetadata.class);
    }

    public SystemMetadataArray(SystemMetadata first, SystemMetadata... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public SystemMetadataArray clone()
        throws CloneNotSupportedException
    {
        SystemMetadataArray __clone = ((SystemMetadataArray) super.clone());
        return __clone;
    }

    @Override
    public SystemMetadataArray copy()
        throws CloneNotSupportedException
    {
        SystemMetadataArray __copy = ((SystemMetadataArray) super.copy());
        return __copy;
    }

    @Override
    protected SystemMetadata coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SystemMetadata(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.mxe.SystemMetadata.Fields items() {
            return new com.linkedin.mxe.SystemMetadata.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
