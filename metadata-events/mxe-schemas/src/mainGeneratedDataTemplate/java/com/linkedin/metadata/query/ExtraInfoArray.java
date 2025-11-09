
package com.linkedin.metadata.query;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/ListResultMetadata.pdl.")
public class ExtraInfoArray
    extends WrappingArrayTemplate<ExtraInfo>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.query/**Extra information associated to a metadata aspect.*/record ExtraInfo{/**The urn for the entity that owns the metadata aspect*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The version number of the metadata aspect.*/version:long/**The audit trail associated with the version*/audit:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}]", SchemaFormatType.PDL));

    public ExtraInfoArray() {
        this(new DataList());
    }

    public ExtraInfoArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ExtraInfoArray(Collection<ExtraInfo> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ExtraInfoArray(DataList data) {
        super(data, SCHEMA, ExtraInfo.class);
    }

    public ExtraInfoArray(ExtraInfo first, ExtraInfo... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ExtraInfoArray.ProjectionMask createMask() {
        return new ExtraInfoArray.ProjectionMask();
    }

    @Override
    public ExtraInfoArray clone()
        throws CloneNotSupportedException
    {
        ExtraInfoArray __clone = ((ExtraInfoArray) super.clone());
        return __clone;
    }

    @Override
    public ExtraInfoArray copy()
        throws CloneNotSupportedException
    {
        ExtraInfoArray __copy = ((ExtraInfoArray) super.copy());
        return __copy;
    }

    @Override
    protected ExtraInfo coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new ExtraInfo(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.query.ExtraInfo.Fields items() {
            return new com.linkedin.metadata.query.ExtraInfo.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.ExtraInfo.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public ExtraInfoArray.ProjectionMask withItems(Function<com.linkedin.metadata.query.ExtraInfo.ProjectionMask, com.linkedin.metadata.query.ExtraInfo.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?ExtraInfo.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
