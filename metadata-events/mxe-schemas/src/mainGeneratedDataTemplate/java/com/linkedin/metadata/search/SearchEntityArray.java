
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/ScrollResult.pdl.")
public class SearchEntityArray
    extends WrappingArrayTemplate<SearchEntity>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]score:optional double/**A list of the the restricted aspects on the entity.\nIf the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.*/restrictedAspects:optional array[string]/**Extra fields from the search document based on what is requested in the search request*/extraFields:optional map[string,string]}}]", SchemaFormatType.PDL));

    public SearchEntityArray() {
        this(new DataList());
    }

    public SearchEntityArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SearchEntityArray(Collection<SearchEntity> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SearchEntityArray(DataList data) {
        super(data, SCHEMA, SearchEntity.class);
    }

    public SearchEntityArray(SearchEntity first, SearchEntity... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SearchEntityArray.ProjectionMask createMask() {
        return new SearchEntityArray.ProjectionMask();
    }

    @Override
    public SearchEntityArray clone()
        throws CloneNotSupportedException
    {
        SearchEntityArray __clone = ((SearchEntityArray) super.clone());
        return __clone;
    }

    @Override
    public SearchEntityArray copy()
        throws CloneNotSupportedException
    {
        SearchEntityArray __copy = ((SearchEntityArray) super.copy());
        return __copy;
    }

    @Override
    protected SearchEntity coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SearchEntity(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.search.SearchEntity.Fields items() {
            return new com.linkedin.metadata.search.SearchEntity.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.SearchEntity.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public SearchEntityArray.ProjectionMask withItems(Function<com.linkedin.metadata.search.SearchEntity.ProjectionMask, com.linkedin.metadata.search.SearchEntity.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?SearchEntity.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
