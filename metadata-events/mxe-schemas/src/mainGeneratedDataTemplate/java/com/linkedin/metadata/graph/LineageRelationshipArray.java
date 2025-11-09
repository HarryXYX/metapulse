
package com.linkedin.metadata.graph;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/graph/EntityLineageResult.pdl.")
public class LineageRelationshipArray
    extends WrappingArrayTemplate<LineageRelationship>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.graph/**Metadata about a lineage relationship between two entities*/record LineageRelationship{/**The type of the relationship*/type:string/**Entity that is related via lineage*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)\nDeprecated by degrees. degree field is populated by min(degrees) for backward compatibility.*/@deprecated,degree:int=1/**Timestamp for when this lineage relationship was created. Could be null.*/createdOn:optional long/**Urn of the actor that created this lineage relationship. Could be null.*/createdActor:optional com.linkedin.common.Urn/**Timestamp for when this lineage relationship was last updated. Could be null.*/updatedOn:optional long/**Urn of the actor that last updated this lineage relationship. Could be null.*/updatedActor:optional com.linkedin.common.Urn/**Whether this lineage edge is a manual edge.*/isManual:optional boolean/**The different depths at which this entity is discovered in the lineage graph.\nMarked as optional to maintain backward compatibility, but is filled out by implementations. \nReplaces the deprecated field \"degree\".\n*/degrees:optional array[int]/**Marks this relationship as explored during the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}}]", SchemaFormatType.PDL));

    public LineageRelationshipArray() {
        this(new DataList());
    }

    public LineageRelationshipArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public LineageRelationshipArray(Collection<LineageRelationship> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public LineageRelationshipArray(DataList data) {
        super(data, SCHEMA, LineageRelationship.class);
    }

    public LineageRelationshipArray(LineageRelationship first, LineageRelationship... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static LineageRelationshipArray.ProjectionMask createMask() {
        return new LineageRelationshipArray.ProjectionMask();
    }

    @Override
    public LineageRelationshipArray clone()
        throws CloneNotSupportedException
    {
        LineageRelationshipArray __clone = ((LineageRelationshipArray) super.clone());
        return __clone;
    }

    @Override
    public LineageRelationshipArray copy()
        throws CloneNotSupportedException
    {
        LineageRelationshipArray __copy = ((LineageRelationshipArray) super.copy());
        return __copy;
    }

    @Override
    protected LineageRelationship coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new LineageRelationship(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.graph.LineageRelationship.Fields items() {
            return new com.linkedin.metadata.graph.LineageRelationship.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.graph.LineageRelationship.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public LineageRelationshipArray.ProjectionMask withItems(Function<com.linkedin.metadata.graph.LineageRelationship.ProjectionMask, com.linkedin.metadata.graph.LineageRelationship.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?LineageRelationship.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
