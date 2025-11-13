
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/SearchResultMetadata.pdl.")
public class SearchSuggestionArray
    extends WrappingArrayTemplate<SearchSuggestion>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search/**The model for the search result*/record SearchSuggestion{/**The suggestion text for this search query*/text:string/**The score for how close this suggestion is to the original search query.\nThe closer to 1 means it is closer to the original query and 0 is further away.*/score:float/**How many matches there are with the suggested text for the given field*/frequency:long}}]", SchemaFormatType.PDL));

    public SearchSuggestionArray() {
        this(new DataList());
    }

    public SearchSuggestionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SearchSuggestionArray(Collection<SearchSuggestion> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SearchSuggestionArray(DataList data) {
        super(data, SCHEMA, SearchSuggestion.class);
    }

    public SearchSuggestionArray(SearchSuggestion first, SearchSuggestion... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SearchSuggestionArray.ProjectionMask createMask() {
        return new SearchSuggestionArray.ProjectionMask();
    }

    @Override
    public SearchSuggestionArray clone()
        throws CloneNotSupportedException
    {
        SearchSuggestionArray __clone = ((SearchSuggestionArray) super.clone());
        return __clone;
    }

    @Override
    public SearchSuggestionArray copy()
        throws CloneNotSupportedException
    {
        SearchSuggestionArray __copy = ((SearchSuggestionArray) super.copy());
        return __copy;
    }

    @Override
    protected SearchSuggestion coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SearchSuggestion(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.search.SearchSuggestion.Fields items() {
            return new com.linkedin.metadata.search.SearchSuggestion.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.SearchSuggestion.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public SearchSuggestionArray.ProjectionMask withItems(Function<com.linkedin.metadata.search.SearchSuggestion.ProjectionMask, com.linkedin.metadata.search.SearchSuggestion.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?SearchSuggestion.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
