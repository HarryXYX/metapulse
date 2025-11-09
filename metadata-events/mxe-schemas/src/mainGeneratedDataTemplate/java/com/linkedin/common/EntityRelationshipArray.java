
package com.linkedin.common;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/EntityRelationships.pdl.")
public class EntityRelationshipArray
    extends WrappingArrayTemplate<EntityRelationship>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Downstream lineage information about a dataset including the source reporting the lineage*/record EntityRelationship{/**Audit stamp containing who reported the lineage and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**The downstream dataset the lineage points to*/entity:Urn/**The type of the relationship*/type:string}}]", SchemaFormatType.PDL));

    public EntityRelationshipArray() {
        this(new DataList());
    }

    public EntityRelationshipArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public EntityRelationshipArray(Collection<EntityRelationship> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public EntityRelationshipArray(DataList data) {
        super(data, SCHEMA, EntityRelationship.class);
    }

    public EntityRelationshipArray(EntityRelationship first, EntityRelationship... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static EntityRelationshipArray.ProjectionMask createMask() {
        return new EntityRelationshipArray.ProjectionMask();
    }

    @Override
    public EntityRelationshipArray clone()
        throws CloneNotSupportedException
    {
        EntityRelationshipArray __clone = ((EntityRelationshipArray) super.clone());
        return __clone;
    }

    @Override
    public EntityRelationshipArray copy()
        throws CloneNotSupportedException
    {
        EntityRelationshipArray __copy = ((EntityRelationshipArray) super.copy());
        return __copy;
    }

    @Override
    protected EntityRelationship coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new EntityRelationship(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.EntityRelationship.Fields items() {
            return new com.linkedin.common.EntityRelationship.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.EntityRelationship.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public EntityRelationshipArray.ProjectionMask withItems(Function<com.linkedin.common.EntityRelationship.ProjectionMask, com.linkedin.common.EntityRelationship.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?EntityRelationship.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
