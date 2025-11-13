
package com.linkedin.metadata.search;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * The model for the search result
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/SearchResultMetadata.pdl.")
public class SearchResultMetadata
    extends RecordTemplate
{

    private final static SearchResultMetadata.Fields _fields = new SearchResultMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for the search result*/record SearchResultMetadata{/**A list of search result metadata such as aggregations*/aggregations:array[record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**Entity associated with this facet*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional com.linkedin.common.Urn,facetCount:long,filtered:optional boolean}]}]=[]/**A list of search query suggestions based on the given query*/suggestions:array[/**The model for the search result*/record SearchSuggestion{/**The suggestion text for this search query*/text:string/**The score for how close this suggestion is to the original search query.\nThe closer to 1 means it is closer to the original query and 0 is further away.*/score:float/**How many matches there are with the suggested text for the given field*/frequency:long}]=[]}", SchemaFormatType.PDL));
    private AggregationMetadataArray _aggregationsField = null;
    private SearchSuggestionArray _suggestionsField = null;
    private SearchResultMetadata.ChangeListener __changeListener = new SearchResultMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");
    private final static AggregationMetadataArray DEFAULT_Aggregations;
    private final static RecordDataSchema.Field FIELD_Suggestions = SCHEMA.getField("suggestions");
    private final static SearchSuggestionArray DEFAULT_Suggestions;

    static {
        DEFAULT_Aggregations = ((FIELD_Aggregations.getDefault() == null)?null:new AggregationMetadataArray(DataTemplateUtil.castOrThrow(FIELD_Aggregations.getDefault(), DataList.class)));
        DEFAULT_Suggestions = ((FIELD_Suggestions.getDefault() == null)?null:new SearchSuggestionArray(DataTemplateUtil.castOrThrow(FIELD_Suggestions.getDefault(), DataList.class)));
    }

    public SearchResultMetadata() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public SearchResultMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SearchResultMetadata.Fields fields() {
        return _fields;
    }

    public static SearchResultMetadata.ProjectionMask createMask() {
        return new SearchResultMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public boolean hasAggregations() {
        if (_aggregationsField!= null) {
            return true;
        }
        return super._map.containsKey("aggregations");
    }

    /**
     * Remover for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public void removeAggregations() {
        super._map.remove("aggregations");
    }

    /**
     * Getter for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    @Nullable
    public AggregationMetadataArray getAggregations(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getAggregations();
            case NULL:
                if (_aggregationsField!= null) {
                    return _aggregationsField;
                } else {
                    Object __rawValue = super._map.get("aggregations");
                    _aggregationsField = ((__rawValue == null)?null:new AggregationMetadataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _aggregationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResultMetadata.Fields#aggregations
     */
    @Nonnull
    public AggregationMetadataArray getAggregations() {
        if (_aggregationsField!= null) {
            return _aggregationsField;
        } else {
            Object __rawValue = super._map.get("aggregations");
            if (__rawValue == null) {
                return DEFAULT_Aggregations;
            }
            _aggregationsField = ((__rawValue == null)?null:new AggregationMetadataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aggregationsField;
        }
    }

    /**
     * Setter for aggregations
     * 
     * @see SearchResultMetadata.Fields#aggregations
     */
    public SearchResultMetadata setAggregations(
        @Nullable
        AggregationMetadataArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregations(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aggregations of com.linkedin.metadata.search.SearchResultMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResultMetadata.Fields#aggregations
     */
    public SearchResultMetadata setAggregations(
        @Nonnull
        AggregationMetadataArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregations of com.linkedin.metadata.search.SearchResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
            _aggregationsField = value;
        }
        return this;
    }

    /**
     * Existence checker for suggestions
     * 
     * @see SearchResultMetadata.Fields#suggestions
     */
    public boolean hasSuggestions() {
        if (_suggestionsField!= null) {
            return true;
        }
        return super._map.containsKey("suggestions");
    }

    /**
     * Remover for suggestions
     * 
     * @see SearchResultMetadata.Fields#suggestions
     */
    public void removeSuggestions() {
        super._map.remove("suggestions");
    }

    /**
     * Getter for suggestions
     * 
     * @see SearchResultMetadata.Fields#suggestions
     */
    @Nullable
    public SearchSuggestionArray getSuggestions(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getSuggestions();
            case NULL:
                if (_suggestionsField!= null) {
                    return _suggestionsField;
                } else {
                    Object __rawValue = super._map.get("suggestions");
                    _suggestionsField = ((__rawValue == null)?null:new SearchSuggestionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _suggestionsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for suggestions
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchResultMetadata.Fields#suggestions
     */
    @Nonnull
    public SearchSuggestionArray getSuggestions() {
        if (_suggestionsField!= null) {
            return _suggestionsField;
        } else {
            Object __rawValue = super._map.get("suggestions");
            if (__rawValue == null) {
                return DEFAULT_Suggestions;
            }
            _suggestionsField = ((__rawValue == null)?null:new SearchSuggestionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _suggestionsField;
        }
    }

    /**
     * Setter for suggestions
     * 
     * @see SearchResultMetadata.Fields#suggestions
     */
    public SearchResultMetadata setSuggestions(
        @Nullable
        SearchSuggestionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSuggestions(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field suggestions of com.linkedin.metadata.search.SearchResultMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
                    _suggestionsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSuggestions();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
                    _suggestionsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
                    _suggestionsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for suggestions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchResultMetadata.Fields#suggestions
     */
    public SearchResultMetadata setSuggestions(
        @Nonnull
        SearchSuggestionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field suggestions of com.linkedin.metadata.search.SearchResultMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "suggestions", value.data());
            _suggestionsField = value;
        }
        return this;
    }

    @Override
    public SearchResultMetadata clone()
        throws CloneNotSupportedException
    {
        SearchResultMetadata __clone = ((SearchResultMetadata) super.clone());
        __clone.__changeListener = new SearchResultMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SearchResultMetadata copy()
        throws CloneNotSupportedException
    {
        SearchResultMetadata __copy = ((SearchResultMetadata) super.copy());
        __copy._suggestionsField = null;
        __copy._aggregationsField = null;
        __copy.__changeListener = new SearchResultMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SearchResultMetadata __objectRef;

        private ChangeListener(SearchResultMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "suggestions":
                    __objectRef._suggestionsField = null;
                    break;
                case "aggregations":
                    __objectRef._aggregationsField = null;
                    break;
            }
        }

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

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public com.linkedin.metadata.search.AggregationMetadataArray.Fields aggregations() {
            return new com.linkedin.metadata.search.AggregationMetadataArray.Fields(getPathComponents(), "aggregations");
        }

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public PathSpec aggregations(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aggregations");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A list of search query suggestions based on the given query
         * 
         */
        public com.linkedin.metadata.search.SearchSuggestionArray.Fields suggestions() {
            return new com.linkedin.metadata.search.SearchSuggestionArray.Fields(getPathComponents(), "suggestions");
        }

        /**
         * A list of search query suggestions based on the given query
         * 
         */
        public PathSpec suggestions(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "suggestions");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.AggregationMetadataArray.ProjectionMask _aggregationsMask;
        private com.linkedin.metadata.search.SearchSuggestionArray.ProjectionMask _suggestionsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public SearchResultMetadata.ProjectionMask withAggregations(Function<com.linkedin.metadata.search.AggregationMetadataArray.ProjectionMask, com.linkedin.metadata.search.AggregationMetadataArray.ProjectionMask> nestedMask) {
            _aggregationsMask = nestedMask.apply(((_aggregationsMask == null)?AggregationMetadataArray.createMask():_aggregationsMask));
            getDataMap().put("aggregations", _aggregationsMask.getDataMap());
            return this;
        }

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public SearchResultMetadata.ProjectionMask withAggregations() {
            _aggregationsMask = null;
            getDataMap().put("aggregations", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public SearchResultMetadata.ProjectionMask withAggregations(Function<com.linkedin.metadata.search.AggregationMetadataArray.ProjectionMask, com.linkedin.metadata.search.AggregationMetadataArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aggregationsMask = nestedMask.apply(((_aggregationsMask == null)?AggregationMetadataArray.createMask():_aggregationsMask));
            getDataMap().put("aggregations", _aggregationsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aggregations").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aggregations").put("$count", count);
            }
            return this;
        }

        /**
         * A list of search result metadata such as aggregations
         * 
         */
        public SearchResultMetadata.ProjectionMask withAggregations(Integer start, Integer count) {
            _aggregationsMask = null;
            getDataMap().put("aggregations", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aggregations").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aggregations").put("$count", count);
            }
            return this;
        }

        /**
         * A list of search query suggestions based on the given query
         * 
         */
        public SearchResultMetadata.ProjectionMask withSuggestions(Function<com.linkedin.metadata.search.SearchSuggestionArray.ProjectionMask, com.linkedin.metadata.search.SearchSuggestionArray.ProjectionMask> nestedMask) {
            _suggestionsMask = nestedMask.apply(((_suggestionsMask == null)?SearchSuggestionArray.createMask():_suggestionsMask));
            getDataMap().put("suggestions", _suggestionsMask.getDataMap());
            return this;
        }

        /**
         * A list of search query suggestions based on the given query
         * 
         */
        public SearchResultMetadata.ProjectionMask withSuggestions() {
            _suggestionsMask = null;
            getDataMap().put("suggestions", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of search query suggestions based on the given query
         * 
         */
        public SearchResultMetadata.ProjectionMask withSuggestions(Function<com.linkedin.metadata.search.SearchSuggestionArray.ProjectionMask, com.linkedin.metadata.search.SearchSuggestionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _suggestionsMask = nestedMask.apply(((_suggestionsMask == null)?SearchSuggestionArray.createMask():_suggestionsMask));
            getDataMap().put("suggestions", _suggestionsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("suggestions").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("suggestions").put("$count", count);
            }
            return this;
        }

        /**
         * A list of search query suggestions based on the given query
         * 
         */
        public SearchResultMetadata.ProjectionMask withSuggestions(Integer start, Integer count) {
            _suggestionsMask = null;
            getDataMap().put("suggestions", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("suggestions").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("suggestions").put("$count", count);
            }
            return this;
        }

    }

}
