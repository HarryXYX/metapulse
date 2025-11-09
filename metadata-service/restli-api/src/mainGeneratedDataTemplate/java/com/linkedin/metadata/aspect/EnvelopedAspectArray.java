
package com.linkedin.metadata.aspect;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/pegasus/com/linkedin/aspect/GetTimeseriesAspectValuesResponse.pdl.")
public class EnvelopedAspectArray
    extends WrappingArrayTemplate<EnvelopedAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.aspect/**Enveloped record for an aspect.\n*/record EnvelopedAspect{aspect:{namespace com.linkedin.mxe/**Generic record structure for serializing an Aspect\n*/record GenericAspect{/**The value of the aspect, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the aspect was serialized.\nThe only type currently supported is application/json.*/contentType:string}}systemMetadata:{namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}}}]", SchemaFormatType.PDL));

    public EnvelopedAspectArray() {
        this(new DataList());
    }

    public EnvelopedAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public EnvelopedAspectArray(Collection<EnvelopedAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public EnvelopedAspectArray(DataList data) {
        super(data, SCHEMA, EnvelopedAspect.class);
    }

    public EnvelopedAspectArray(EnvelopedAspect first, EnvelopedAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static EnvelopedAspectArray.ProjectionMask createMask() {
        return new EnvelopedAspectArray.ProjectionMask();
    }

    @Override
    public EnvelopedAspectArray clone()
        throws CloneNotSupportedException
    {
        EnvelopedAspectArray __clone = ((EnvelopedAspectArray) super.clone());
        return __clone;
    }

    @Override
    public EnvelopedAspectArray copy()
        throws CloneNotSupportedException
    {
        EnvelopedAspectArray __copy = ((EnvelopedAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected EnvelopedAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
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

        public com.linkedin.metadata.aspect.EnvelopedAspect.Fields items() {
            return new com.linkedin.metadata.aspect.EnvelopedAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.EnvelopedAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public EnvelopedAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.EnvelopedAspect.ProjectionMask, com.linkedin.metadata.aspect.EnvelopedAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?EnvelopedAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

        public EnvelopedAspectArray.ProjectionMask withItems(MaskMap nestedMask) {
            getDataMap().put("$*", nestedMask.getDataMap());
            return this;
        }

    }

}
