
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/FormPromptFieldAssociations.pdl.")
public class FieldFormPromptAssociationArray
    extends WrappingArrayTemplate<FieldFormPromptAssociation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Information about the status of a particular prompt for a specific schema field\non an entity.*/record FieldFormPromptAssociation{/**The field path on a schema field.*/fieldPath:string/**The last time this prompt was touched for the field on the entity (set, unset)*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}]", SchemaFormatType.PDL));

    public FieldFormPromptAssociationArray() {
        this(new DataList());
    }

    public FieldFormPromptAssociationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FieldFormPromptAssociationArray(Collection<FieldFormPromptAssociation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FieldFormPromptAssociationArray(DataList data) {
        super(data, SCHEMA, FieldFormPromptAssociation.class);
    }

    public FieldFormPromptAssociationArray(FieldFormPromptAssociation first, FieldFormPromptAssociation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FieldFormPromptAssociationArray.ProjectionMask createMask() {
        return new FieldFormPromptAssociationArray.ProjectionMask();
    }

    @Override
    public FieldFormPromptAssociationArray clone()
        throws CloneNotSupportedException
    {
        FieldFormPromptAssociationArray __clone = ((FieldFormPromptAssociationArray) super.clone());
        return __clone;
    }

    @Override
    public FieldFormPromptAssociationArray copy()
        throws CloneNotSupportedException
    {
        FieldFormPromptAssociationArray __copy = ((FieldFormPromptAssociationArray) super.copy());
        return __copy;
    }

    @Override
    protected FieldFormPromptAssociation coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FieldFormPromptAssociation(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.FieldFormPromptAssociation.Fields items() {
            return new com.linkedin.common.FieldFormPromptAssociation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.FieldFormPromptAssociation.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FieldFormPromptAssociationArray.ProjectionMask withItems(Function<com.linkedin.common.FieldFormPromptAssociation.ProjectionMask, com.linkedin.common.FieldFormPromptAssociation.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FieldFormPromptAssociation.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
