
package com.linkedin.metadata.search;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/LineageSearchResult.pdl.")
public class LineageSearchEntityArray
    extends WrappingArrayTemplate<LineageSearchEntity>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search/**The model for each entity returned by the lineage search query*/record LineageSearchEntity includes/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]score:optional double/**A list of the the restricted aspects on the entity.\nIf the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.*/restrictedAspects:optional array[string]/**Extra fields from the search document based on what is requested in the search request*/extraFields:optional map[string,string]}{/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)*/@deprecated,degree:int=1/**The degrees of separation (number of hops) between the source and this entity */degrees:array[int]=[]/**Marks an entity as having been explored for as a part of the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}}]", SchemaFormatType.PDL));

    public LineageSearchEntityArray() {
        this(new DataList());
    }

    public LineageSearchEntityArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public LineageSearchEntityArray(Collection<LineageSearchEntity> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public LineageSearchEntityArray(DataList data) {
        super(data, SCHEMA, LineageSearchEntity.class);
    }

    public LineageSearchEntityArray(LineageSearchEntity first, LineageSearchEntity... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static LineageSearchEntityArray.ProjectionMask createMask() {
        return new LineageSearchEntityArray.ProjectionMask();
    }

    @Override
    public LineageSearchEntityArray clone()
        throws CloneNotSupportedException
    {
        LineageSearchEntityArray __clone = ((LineageSearchEntityArray) super.clone());
        return __clone;
    }

    @Override
    public LineageSearchEntityArray copy()
        throws CloneNotSupportedException
    {
        LineageSearchEntityArray __copy = ((LineageSearchEntityArray) super.copy());
        return __copy;
    }

    @Override
    protected LineageSearchEntity coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new LineageSearchEntity(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.search.LineageSearchEntity.Fields items() {
            return new com.linkedin.metadata.search.LineageSearchEntity.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.LineageSearchEntity.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public LineageSearchEntityArray.ProjectionMask withItems(Function<com.linkedin.metadata.search.LineageSearchEntity.ProjectionMask, com.linkedin.metadata.search.LineageSearchEntity.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?LineageSearchEntity.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
