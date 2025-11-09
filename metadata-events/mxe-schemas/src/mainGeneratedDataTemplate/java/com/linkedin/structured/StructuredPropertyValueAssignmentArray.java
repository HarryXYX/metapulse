
package com.linkedin.structured;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/structured/StructuredProperties.pdl.")
public class StructuredPropertyValueAssignmentArray
    extends WrappingArrayTemplate<StructuredPropertyValueAssignment>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.structured,record StructuredPropertyValueAssignment{/**The property that is being assigned a value.*/propertyUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The value assigned to the property.*/values:array[/**Represents a stored primitive property value\n*/typeref PrimitivePropertyValue=union[string,double]]/**Audit stamp containing who created this relationship edge and when*/created:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional com.linkedin.common.AuditStamp/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"structuredPropertyAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"structuredPropertyAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"structuredPropertyAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional{namespace com.linkedin.common/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:Urn/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}}]", SchemaFormatType.PDL));

    public StructuredPropertyValueAssignmentArray() {
        this(new DataList());
    }

    public StructuredPropertyValueAssignmentArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public StructuredPropertyValueAssignmentArray(Collection<StructuredPropertyValueAssignment> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public StructuredPropertyValueAssignmentArray(DataList data) {
        super(data, SCHEMA, StructuredPropertyValueAssignment.class);
    }

    public StructuredPropertyValueAssignmentArray(StructuredPropertyValueAssignment first, StructuredPropertyValueAssignment... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static StructuredPropertyValueAssignmentArray.ProjectionMask createMask() {
        return new StructuredPropertyValueAssignmentArray.ProjectionMask();
    }

    @Override
    public StructuredPropertyValueAssignmentArray clone()
        throws CloneNotSupportedException
    {
        StructuredPropertyValueAssignmentArray __clone = ((StructuredPropertyValueAssignmentArray) super.clone());
        return __clone;
    }

    @Override
    public StructuredPropertyValueAssignmentArray copy()
        throws CloneNotSupportedException
    {
        StructuredPropertyValueAssignmentArray __copy = ((StructuredPropertyValueAssignmentArray) super.copy());
        return __copy;
    }

    @Override
    protected StructuredPropertyValueAssignment coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new StructuredPropertyValueAssignment(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.structured.StructuredPropertyValueAssignment.Fields items() {
            return new com.linkedin.structured.StructuredPropertyValueAssignment.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.structured.StructuredPropertyValueAssignment.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public StructuredPropertyValueAssignmentArray.ProjectionMask withItems(Function<com.linkedin.structured.StructuredPropertyValueAssignment.ProjectionMask, com.linkedin.structured.StructuredPropertyValueAssignment.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?StructuredPropertyValueAssignment.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
