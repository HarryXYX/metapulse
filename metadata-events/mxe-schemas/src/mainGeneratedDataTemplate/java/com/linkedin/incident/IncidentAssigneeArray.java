
package com.linkedin.incident;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/incident/IncidentInfo.pdl.")
public class IncidentAssigneeArray
    extends WrappingArrayTemplate<IncidentAssignee>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.incident/**The incident assignee type.\nThis is in a record so that we can add additional fields if we need to later (e.g.\nthe type of the assignee.*/record IncidentAssignee{/**The user or group assigned to the incident.*/@Searchable={\"addToFilters\":true,\"fieldName\":\"assignees\",\"filterNameOverride\":\"Assignee\"}actor:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The time & actor responsible for assiging the assignee.*/assignedAt:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}}]", SchemaFormatType.PDL));

    public IncidentAssigneeArray() {
        this(new DataList());
    }

    public IncidentAssigneeArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public IncidentAssigneeArray(Collection<IncidentAssignee> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public IncidentAssigneeArray(DataList data) {
        super(data, SCHEMA, IncidentAssignee.class);
    }

    public IncidentAssigneeArray(IncidentAssignee first, IncidentAssignee... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static IncidentAssigneeArray.ProjectionMask createMask() {
        return new IncidentAssigneeArray.ProjectionMask();
    }

    @Override
    public IncidentAssigneeArray clone()
        throws CloneNotSupportedException
    {
        IncidentAssigneeArray __clone = ((IncidentAssigneeArray) super.clone());
        return __clone;
    }

    @Override
    public IncidentAssigneeArray copy()
        throws CloneNotSupportedException
    {
        IncidentAssigneeArray __copy = ((IncidentAssigneeArray) super.copy());
        return __copy;
    }

    @Override
    protected IncidentAssignee coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new IncidentAssignee(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.incident.IncidentAssignee.Fields items() {
            return new com.linkedin.incident.IncidentAssignee.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.incident.IncidentAssignee.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public IncidentAssigneeArray.ProjectionMask withItems(Function<com.linkedin.incident.IncidentAssignee.ProjectionMask, com.linkedin.incident.IncidentAssignee.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?IncidentAssignee.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
