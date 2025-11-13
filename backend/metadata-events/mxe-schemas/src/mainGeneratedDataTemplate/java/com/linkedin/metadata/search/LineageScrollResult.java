
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * The model for the result of a lineage search query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/LineageScrollResult.pdl.")
public class LineageScrollResult
    extends RecordTemplate
{

    private final static LineageScrollResult.Fields _fields = new LineageScrollResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for the result of a lineage search query*/record LineageScrollResult{/**A list of entities returned from the search results*/entities:array[/**The model for each entity returned by the lineage search query*/record LineageSearchEntity includes/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]score:optional double/**A list of the the restricted aspects on the entity.\nIf the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.*/restrictedAspects:optional array[string]/**Extra fields from the search document based on what is requested in the search request*/extraFields:optional map[string,string]}{/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)*/@deprecated,degree:int=1/**The degrees of separation (number of hops) between the source and this entity */degrees:array[int]=[]/**Marks an entity as having been explored for as a part of the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}]/**Metadata specific to the browse result of the queried path*/metadata:/**The model for the search result*/record SearchResultMetadata{/**A list of search result metadata such as aggregations*/aggregations:array[record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**Entity associated with this facet*/entity:optional com.linkedin.common.Urn/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional com.linkedin.common.Urn,facetCount:long,filtered:optional boolean}]}]=[]/**A list of search query suggestions based on the given query*/suggestions:array[/**The model for the search result*/record SearchSuggestion{/**The suggestion text for this search query*/text:string/**The score for how close this suggestion is to the original search query.\nThe closer to 1 means it is closer to the original query and 0 is further away.*/score:float/**How many matches there are with the suggested text for the given field*/frequency:long}]=[]}/**Scroll Identifier for subsequent requests, if not present then no further results to fetch*/scrollId:optional string/**Size of each page in the result*/pageSize:int/**The total number of entities directly under searched path*/numEntities:int}", SchemaFormatType.PDL));
    private LineageSearchEntityArray _entitiesField = null;
    private SearchResultMetadata _metadataField = null;
    private String _scrollIdField = null;
    private Integer _pageSizeField = null;
    private Integer _numEntitiesField = null;
    private LineageScrollResult.ChangeListener __changeListener = new LineageScrollResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_ScrollId = SCHEMA.getField("scrollId");
    private final static RecordDataSchema.Field FIELD_PageSize = SCHEMA.getField("pageSize");
    private final static RecordDataSchema.Field FIELD_NumEntities = SCHEMA.getField("numEntities");

    public LineageScrollResult() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public LineageScrollResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LineageScrollResult.Fields fields() {
        return _fields;
    }

    public static LineageScrollResult.ProjectionMask createMask() {
        return new LineageScrollResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entities
     * 
     * @see LineageScrollResult.Fields#entities
     */
    public boolean hasEntities() {
        if (_entitiesField!= null) {
            return true;
        }
        return super._map.containsKey("entities");
    }

    /**
     * Remover for entities
     * 
     * @see LineageScrollResult.Fields#entities
     */
    public void removeEntities() {
        super._map.remove("entities");
    }

    /**
     * Getter for entities
     * 
     * @see LineageScrollResult.Fields#entities
     */
    @Nullable
    public LineageSearchEntityArray getEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntities();
            case DEFAULT:
            case NULL:
                if (_entitiesField!= null) {
                    return _entitiesField;
                } else {
                    Object __rawValue = super._map.get("entities");
                    _entitiesField = ((__rawValue == null)?null:new LineageSearchEntityArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _entitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageScrollResult.Fields#entities
     */
    @Nonnull
    public LineageSearchEntityArray getEntities() {
        if (_entitiesField!= null) {
            return _entitiesField;
        } else {
            Object __rawValue = super._map.get("entities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entities");
            }
            _entitiesField = ((__rawValue == null)?null:new LineageSearchEntityArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entitiesField;
        }
    }

    /**
     * Setter for entities
     * 
     * @see LineageScrollResult.Fields#entities
     */
    public LineageScrollResult setEntities(
        @Nullable
        LineageSearchEntityArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entities of com.linkedin.metadata.search.LineageScrollResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
                    _entitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageScrollResult.Fields#entities
     */
    public LineageScrollResult setEntities(
        @Nonnull
        LineageSearchEntityArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entities of com.linkedin.metadata.search.LineageScrollResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
            _entitiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see LineageScrollResult.Fields#metadata
     */
    public boolean hasMetadata() {
        if (_metadataField!= null) {
            return true;
        }
        return super._map.containsKey("metadata");
    }

    /**
     * Remover for metadata
     * 
     * @see LineageScrollResult.Fields#metadata
     */
    public void removeMetadata() {
        super._map.remove("metadata");
    }

    /**
     * Getter for metadata
     * 
     * @see LineageScrollResult.Fields#metadata
     */
    @Nullable
    public SearchResultMetadata getMetadata(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetadata();
            case DEFAULT:
            case NULL:
                if (_metadataField!= null) {
                    return _metadataField;
                } else {
                    Object __rawValue = super._map.get("metadata");
                    _metadataField = ((__rawValue == null)?null:new SearchResultMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _metadataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageScrollResult.Fields#metadata
     */
    @Nonnull
    public SearchResultMetadata getMetadata() {
        if (_metadataField!= null) {
            return _metadataField;
        } else {
            Object __rawValue = super._map.get("metadata");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metadata");
            }
            _metadataField = ((__rawValue == null)?null:new SearchResultMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _metadataField;
        }
    }

    /**
     * Setter for metadata
     * 
     * @see LineageScrollResult.Fields#metadata
     */
    public LineageScrollResult setMetadata(
        @Nullable
        SearchResultMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metadata of com.linkedin.metadata.search.LineageScrollResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadata();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
                    _metadataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageScrollResult.Fields#metadata
     */
    public LineageScrollResult setMetadata(
        @Nonnull
        SearchResultMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadata of com.linkedin.metadata.search.LineageScrollResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
            _metadataField = value;
        }
        return this;
    }

    /**
     * Existence checker for scrollId
     * 
     * @see LineageScrollResult.Fields#scrollId
     */
    public boolean hasScrollId() {
        if (_scrollIdField!= null) {
            return true;
        }
        return super._map.containsKey("scrollId");
    }

    /**
     * Remover for scrollId
     * 
     * @see LineageScrollResult.Fields#scrollId
     */
    public void removeScrollId() {
        super._map.remove("scrollId");
    }

    /**
     * Getter for scrollId
     * 
     * @see LineageScrollResult.Fields#scrollId
     */
    @Nullable
    public String getScrollId(GetMode mode) {
        return getScrollId();
    }

    /**
     * Getter for scrollId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageScrollResult.Fields#scrollId
     */
    @Nullable
    public String getScrollId() {
        if (_scrollIdField!= null) {
            return _scrollIdField;
        } else {
            Object __rawValue = super._map.get("scrollId");
            _scrollIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _scrollIdField;
        }
    }

    /**
     * Setter for scrollId
     * 
     * @see LineageScrollResult.Fields#scrollId
     */
    public LineageScrollResult setScrollId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScrollId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScrollId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scrollId", value);
                    _scrollIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "scrollId", value);
                    _scrollIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for scrollId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageScrollResult.Fields#scrollId
     */
    public LineageScrollResult setScrollId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scrollId of com.linkedin.metadata.search.LineageScrollResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scrollId", value);
            _scrollIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for pageSize
     * 
     * @see LineageScrollResult.Fields#pageSize
     */
    public boolean hasPageSize() {
        if (_pageSizeField!= null) {
            return true;
        }
        return super._map.containsKey("pageSize");
    }

    /**
     * Remover for pageSize
     * 
     * @see LineageScrollResult.Fields#pageSize
     */
    public void removePageSize() {
        super._map.remove("pageSize");
    }

    /**
     * Getter for pageSize
     * 
     * @see LineageScrollResult.Fields#pageSize
     */
    @Nullable
    public Integer getPageSize(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPageSize();
            case DEFAULT:
            case NULL:
                if (_pageSizeField!= null) {
                    return _pageSizeField;
                } else {
                    Object __rawValue = super._map.get("pageSize");
                    _pageSizeField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _pageSizeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for pageSize
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageScrollResult.Fields#pageSize
     */
    @Nonnull
    public Integer getPageSize() {
        if (_pageSizeField!= null) {
            return _pageSizeField;
        } else {
            Object __rawValue = super._map.get("pageSize");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("pageSize");
            }
            _pageSizeField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _pageSizeField;
        }
    }

    /**
     * Setter for pageSize
     * 
     * @see LineageScrollResult.Fields#pageSize
     */
    public LineageScrollResult setPageSize(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPageSize(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field pageSize of com.linkedin.metadata.search.LineageScrollResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePageSize();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
                    _pageSizeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageScrollResult.Fields#pageSize
     */
    public LineageScrollResult setPageSize(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pageSize of com.linkedin.metadata.search.LineageScrollResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
            _pageSizeField = value;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @see LineageScrollResult.Fields#pageSize
     */
    public LineageScrollResult setPageSize(int value) {
        CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
        _pageSizeField = value;
        return this;
    }

    /**
     * Existence checker for numEntities
     * 
     * @see LineageScrollResult.Fields#numEntities
     */
    public boolean hasNumEntities() {
        if (_numEntitiesField!= null) {
            return true;
        }
        return super._map.containsKey("numEntities");
    }

    /**
     * Remover for numEntities
     * 
     * @see LineageScrollResult.Fields#numEntities
     */
    public void removeNumEntities() {
        super._map.remove("numEntities");
    }

    /**
     * Getter for numEntities
     * 
     * @see LineageScrollResult.Fields#numEntities
     */
    @Nullable
    public Integer getNumEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNumEntities();
            case DEFAULT:
            case NULL:
                if (_numEntitiesField!= null) {
                    return _numEntitiesField;
                } else {
                    Object __rawValue = super._map.get("numEntities");
                    _numEntitiesField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _numEntitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for numEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageScrollResult.Fields#numEntities
     */
    @Nonnull
    public Integer getNumEntities() {
        if (_numEntitiesField!= null) {
            return _numEntitiesField;
        } else {
            Object __rawValue = super._map.get("numEntities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("numEntities");
            }
            _numEntitiesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _numEntitiesField;
        }
    }

    /**
     * Setter for numEntities
     * 
     * @see LineageScrollResult.Fields#numEntities
     */
    public LineageScrollResult setNumEntities(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numEntities of com.linkedin.metadata.search.LineageScrollResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
                    _numEntitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNumEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
                    _numEntitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
                    _numEntitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageScrollResult.Fields#numEntities
     */
    public LineageScrollResult setNumEntities(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numEntities of com.linkedin.metadata.search.LineageScrollResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
            _numEntitiesField = value;
        }
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @see LineageScrollResult.Fields#numEntities
     */
    public LineageScrollResult setNumEntities(int value) {
        CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
        _numEntitiesField = value;
        return this;
    }

    @Override
    public LineageScrollResult clone()
        throws CloneNotSupportedException
    {
        LineageScrollResult __clone = ((LineageScrollResult) super.clone());
        __clone.__changeListener = new LineageScrollResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LineageScrollResult copy()
        throws CloneNotSupportedException
    {
        LineageScrollResult __copy = ((LineageScrollResult) super.copy());
        __copy._numEntitiesField = null;
        __copy._metadataField = null;
        __copy._entitiesField = null;
        __copy._pageSizeField = null;
        __copy._scrollIdField = null;
        __copy.__changeListener = new LineageScrollResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LineageScrollResult __objectRef;

        private ChangeListener(LineageScrollResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "numEntities":
                    __objectRef._numEntitiesField = null;
                    break;
                case "metadata":
                    __objectRef._metadataField = null;
                    break;
                case "entities":
                    __objectRef._entitiesField = null;
                    break;
                case "pageSize":
                    __objectRef._pageSizeField = null;
                    break;
                case "scrollId":
                    __objectRef._scrollIdField = null;
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
         * A list of entities returned from the search results
         * 
         */
        public com.linkedin.metadata.search.LineageSearchEntityArray.Fields entities() {
            return new com.linkedin.metadata.search.LineageSearchEntityArray.Fields(getPathComponents(), "entities");
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public PathSpec entities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entities");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public com.linkedin.metadata.search.SearchResultMetadata.Fields metadata() {
            return new com.linkedin.metadata.search.SearchResultMetadata.Fields(getPathComponents(), "metadata");
        }

        /**
         * Scroll Identifier for subsequent requests, if not present then no further results to fetch
         * 
         */
        public PathSpec scrollId() {
            return new PathSpec(getPathComponents(), "scrollId");
        }

        /**
         * Size of each page in the result
         * 
         */
        public PathSpec pageSize() {
            return new PathSpec(getPathComponents(), "pageSize");
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public PathSpec numEntities() {
            return new PathSpec(getPathComponents(), "numEntities");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask _entitiesMask;
        private com.linkedin.metadata.search.SearchResultMetadata.ProjectionMask _metadataMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageScrollResult.ProjectionMask withEntities(Function<com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask, com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask> nestedMask) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?LineageSearchEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            return this;
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageScrollResult.ProjectionMask withEntities() {
            _entitiesMask = null;
            getDataMap().put("entities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageScrollResult.ProjectionMask withEntities(Function<com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask, com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?LineageSearchEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageScrollResult.ProjectionMask withEntities(Integer start, Integer count) {
            _entitiesMask = null;
            getDataMap().put("entities", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("entities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entities").put("$count", count);
            }
            return this;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public LineageScrollResult.ProjectionMask withMetadata(Function<com.linkedin.metadata.search.SearchResultMetadata.ProjectionMask, com.linkedin.metadata.search.SearchResultMetadata.ProjectionMask> nestedMask) {
            _metadataMask = nestedMask.apply(((_metadataMask == null)?SearchResultMetadata.createMask():_metadataMask));
            getDataMap().put("metadata", _metadataMask.getDataMap());
            return this;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public LineageScrollResult.ProjectionMask withMetadata() {
            _metadataMask = null;
            getDataMap().put("metadata", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Scroll Identifier for subsequent requests, if not present then no further results to fetch
         * 
         */
        public LineageScrollResult.ProjectionMask withScrollId() {
            getDataMap().put("scrollId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size of each page in the result
         * 
         */
        public LineageScrollResult.ProjectionMask withPageSize() {
            getDataMap().put("pageSize", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public LineageScrollResult.ProjectionMask withNumEntities() {
            getDataMap().put("numEntities", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
