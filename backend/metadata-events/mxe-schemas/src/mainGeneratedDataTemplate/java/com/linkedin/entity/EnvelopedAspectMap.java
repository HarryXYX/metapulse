
package com.linkedin.entity;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MapDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingMapTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/entity/EntityResponse.pdl.")
public class EnvelopedAspectMap
    extends WrappingMapTemplate<EnvelopedAspect>
{

    private final static MapDataSchema SCHEMA = ((MapDataSchema) DataTemplateUtil.parseSchema("map[string{namespace com.linkedin.entity/**An aspect, along with the metadata about it.\nCurrently, an aspect can be either of type 'timestamp' or 'versioned'.\n*/record EnvelopedAspect{/**The name of the aspect\n*/name:string/**The type of the aspect, either timeseries or versioned\n*/type:/**The type of a DataHub aspect*/enum AspectType{/**Designates an aspect that has a monotonically increasing version number*/VERSIONED/**Designates an aspect that represents a point-in-time data point*/TIMESERIES}/**The version of the aspect, only populated if type is 'VERSIONED'\n*/version:optional long/**The timestamp of the aspect, only populated if type is 'TIMESTAMP'\n*/timestamp:optional long/**The raw value of the aspect\n*/value:/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}/**The audit stamp detailing who the aspect was created by and when\n*/created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The system metadata for this aspect\n*/systemMetadata:optional{namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional com.linkedin.common.AuditStamp/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}}}]", SchemaFormatType.PDL));

    public EnvelopedAspectMap() {
        this(new DataMap());
    }

    public EnvelopedAspectMap(int initialCapacity) {
        this(new DataMap(initialCapacity));
    }

    public EnvelopedAspectMap(int initialCapacity, float loadFactor) {
        this(new DataMap(initialCapacity, loadFactor));
    }

    public EnvelopedAspectMap(Map<String, EnvelopedAspect> m) {
        this(newDataMapOfSize(m.size()));
        putAll(m);
    }

    public EnvelopedAspectMap(DataMap data) {
        super(data, SCHEMA, EnvelopedAspect.class);
    }

    public static MapDataSchema dataSchema() {
        return SCHEMA;
    }

    public static EnvelopedAspectMap.ProjectionMask createMask() {
        return new EnvelopedAspectMap.ProjectionMask();
    }

    @Override
    public EnvelopedAspectMap clone()
        throws CloneNotSupportedException
    {
        EnvelopedAspectMap __clone = ((EnvelopedAspectMap) super.clone());
        return __clone;
    }

    @Override
    public EnvelopedAspectMap copy()
        throws CloneNotSupportedException
    {
        EnvelopedAspectMap __copy = ((EnvelopedAspectMap) super.copy());
        return __copy;
    }

    @Override
    protected EnvelopedAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        if (object == null) {
            return null;
        }
        return ((object == null)?null:new EnvelopedAspect(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.entity.EnvelopedAspect.Fields values() {
            return new com.linkedin.entity.EnvelopedAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.entity.EnvelopedAspect.ProjectionMask _valuesMask;

        ProjectionMask() {
            super(4);
        }

        public EnvelopedAspectMap.ProjectionMask withValues(Function<com.linkedin.entity.EnvelopedAspect.ProjectionMask, com.linkedin.entity.EnvelopedAspect.ProjectionMask> nestedMask) {
            _valuesMask = nestedMask.apply(((_valuesMask == null)?EnvelopedAspect.createMask():_valuesMask));
            getDataMap().put("$*", _valuesMask.getDataMap());
            return this;
        }

    }

}
