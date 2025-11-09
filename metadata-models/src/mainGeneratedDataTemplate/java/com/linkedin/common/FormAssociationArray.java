
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/Forms.pdl.")
public class FormAssociationArray
    extends WrappingArrayTemplate<FormAssociation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Properties of an applied form.*/record FormAssociation{/**Urn of the applied form*/urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**A list of prompts that are not yet complete for this form.*/incompletePrompts:array[/**Information about the status of a particular prompt.\nNote that this is where we can add additional information about individual responses:\nactor, timestamp, and the response itself.*/record FormPromptAssociation{/**The id for the prompt. This must be GLOBALLY UNIQUE.*/id:string/**The last time this prompt was touched for the entity (set, unset)*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Optional information about the field-level prompt associations.*/fieldAssociations:optional/**Information about the field-level prompt associations on a top-level prompt association.*/record FormPromptFieldAssociations{/**A list of field-level prompt associations that are not yet complete for this form.*/completedFieldPrompts:optional array[/**Information about the status of a particular prompt for a specific schema field\non an entity.*/record FieldFormPromptAssociation{/**The field path on a schema field.*/fieldPath:string/**The last time this prompt was touched for the field on the entity (set, unset)*/lastModified:AuditStamp}]/**A list of field-level prompt associations that are complete for this form.*/incompleteFieldPrompts:optional array[FieldFormPromptAssociation]}}]=[]/**A list of prompts that have been completed for this form.*/completedPrompts:array[FormPromptAssociation]=[]}}]", SchemaFormatType.PDL));

    public FormAssociationArray() {
        this(new DataList());
    }

    public FormAssociationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FormAssociationArray(Collection<FormAssociation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FormAssociationArray(DataList data) {
        super(data, SCHEMA, FormAssociation.class);
    }

    public FormAssociationArray(FormAssociation first, FormAssociation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FormAssociationArray.ProjectionMask createMask() {
        return new FormAssociationArray.ProjectionMask();
    }

    @Override
    public FormAssociationArray clone()
        throws CloneNotSupportedException
    {
        FormAssociationArray __clone = ((FormAssociationArray) super.clone());
        return __clone;
    }

    @Override
    public FormAssociationArray copy()
        throws CloneNotSupportedException
    {
        FormAssociationArray __copy = ((FormAssociationArray) super.copy());
        return __copy;
    }

    @Override
    protected FormAssociation coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FormAssociation(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.common.FormAssociation.Fields items() {
            return new com.linkedin.common.FormAssociation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.FormAssociation.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FormAssociationArray.ProjectionMask withItems(Function<com.linkedin.common.FormAssociation.ProjectionMask, com.linkedin.common.FormAssociation.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FormAssociation.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
