
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
import com.linkedin.metadata.query.FreshnessStats;


/**
 * The model for the result of a lineage search query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/LineageSearchResult.pdl.")
public class LineageSearchResult
    extends RecordTemplate
{

    private final static LineageSearchResult.Fields _fields = new LineageSearchResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for the result of a lineage search query*/record LineageSearchResult includes{namespace com.linkedin.metadata.query/**A common model for the result of any query. \nExpected to be included into other top level query results.*/record AnyResult{/**Freshness Stats to help a caller understand the freshness of the results\nUseful when the results are being retrieved from a cache, index or other eventually consistent storage*/freshness:optional/**Stats that describe the freshness of a dataset or query result.\nUseful to describe consistency and staleness of results when served\nout of a cache or other eventually consistent system.*/record FreshnessStats{cached:optional boolean,systemFreshness:optional map[string,long]}}}{/**A list of entities returned from the search results*/entities:array[/**The model for each entity returned by the lineage search query*/record LineageSearchEntity includes/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]score:optional double/**A list of the the restricted aspects on the entity.\nIf the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.*/restrictedAspects:optional array[string]/**Extra fields from the search document based on what is requested in the search request*/extraFields:optional map[string,string]}{/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)*/@deprecated,degree:int=1/**The degrees of separation (number of hops) between the source and this entity */degrees:array[int]=[]/**Marks an entity as having been explored for as a part of the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}]/**Metadata specific to the browse result of the queried path*/metadata:/**The model for the search result*/record SearchResultMetadata{/**A list of search result metadata such as aggregations*/aggregations:array[record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**Entity associated with this facet*/entity:optional com.linkedin.common.Urn/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional com.linkedin.common.Urn,facetCount:long,filtered:optional boolean}]}]=[]/**A list of search query suggestions based on the given query*/suggestions:array[/**The model for the search result*/record SearchSuggestion{/**The suggestion text for this search query*/text:string/**The score for how close this suggestion is to the original search query.\nThe closer to 1 means it is closer to the original query and 0 is further away.*/score:float/**How many matches there are with the suggested text for the given field*/frequency:long}]=[]}/**Offset of the first entity in the result*/from:int/**Size of each page in the result*/pageSize:int/**The total number of entities directly under searched path*/numEntities:int/**The path taken when doing search across lineage*/lineageSearchPath:optional/**The path taken when doing search across lineage*/enum LineageSearchPath{/**Designates the tortoise lineage code path*/TORTOISE/**Designates the lightning lineage code path*/LIGHTNING}}", SchemaFormatType.PDL));
    private FreshnessStats _freshnessField = null;
    private LineageSearchEntityArray _entitiesField = null;
    private SearchResultMetadata _metadataField = null;
    private Integer _fromField = null;
    private Integer _pageSizeField = null;
    private Integer _numEntitiesField = null;
    private LineageSearchPath _lineageSearchPathField = null;
    private LineageSearchResult.ChangeListener __changeListener = new LineageSearchResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Freshness = SCHEMA.getField("freshness");
    private final static RecordDataSchema.Field FIELD_Entities = SCHEMA.getField("entities");
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_From = SCHEMA.getField("from");
    private final static RecordDataSchema.Field FIELD_PageSize = SCHEMA.getField("pageSize");
    private final static RecordDataSchema.Field FIELD_NumEntities = SCHEMA.getField("numEntities");
    private final static RecordDataSchema.Field FIELD_LineageSearchPath = SCHEMA.getField("lineageSearchPath");

    public LineageSearchResult() {
        super(new DataMap(10, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public LineageSearchResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LineageSearchResult.Fields fields() {
        return _fields;
    }

    public static LineageSearchResult.ProjectionMask createMask() {
        return new LineageSearchResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for freshness
     * 
     * @see LineageSearchResult.Fields#freshness
     */
    public boolean hasFreshness() {
        if (_freshnessField!= null) {
            return true;
        }
        return super._map.containsKey("freshness");
    }

    /**
     * Remover for freshness
     * 
     * @see LineageSearchResult.Fields#freshness
     */
    public void removeFreshness() {
        super._map.remove("freshness");
    }

    /**
     * Getter for freshness
     * 
     * @see LineageSearchResult.Fields#freshness
     */
    @Nullable
    public FreshnessStats getFreshness(GetMode mode) {
        return getFreshness();
    }

    /**
     * Getter for freshness
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageSearchResult.Fields#freshness
     */
    @Nullable
    public FreshnessStats getFreshness() {
        if (_freshnessField!= null) {
            return _freshnessField;
        } else {
            Object __rawValue = super._map.get("freshness");
            _freshnessField = ((__rawValue == null)?null:new FreshnessStats(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _freshnessField;
        }
    }

    /**
     * Setter for freshness
     * 
     * @see LineageSearchResult.Fields#freshness
     */
    public LineageSearchResult setFreshness(
        @Nullable
        FreshnessStats value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFreshness(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFreshness();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
                    _freshnessField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
                    _freshnessField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for freshness
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchResult.Fields#freshness
     */
    public LineageSearchResult setFreshness(
        @Nonnull
        FreshnessStats value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field freshness of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "freshness", value.data());
            _freshnessField = value;
        }
        return this;
    }

    /**
     * Existence checker for entities
     * 
     * @see LineageSearchResult.Fields#entities
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
     * @see LineageSearchResult.Fields#entities
     */
    public void removeEntities() {
        super._map.remove("entities");
    }

    /**
     * Getter for entities
     * 
     * @see LineageSearchResult.Fields#entities
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
     * @see LineageSearchResult.Fields#entities
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
     * @see LineageSearchResult.Fields#entities
     */
    public LineageSearchResult setEntities(
        @Nullable
        LineageSearchEntityArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entities of com.linkedin.metadata.search.LineageSearchResult");
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
     * @see LineageSearchResult.Fields#entities
     */
    public LineageSearchResult setEntities(
        @Nonnull
        LineageSearchEntityArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entities of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entities", value.data());
            _entitiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see LineageSearchResult.Fields#metadata
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
     * @see LineageSearchResult.Fields#metadata
     */
    public void removeMetadata() {
        super._map.remove("metadata");
    }

    /**
     * Getter for metadata
     * 
     * @see LineageSearchResult.Fields#metadata
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
     * @see LineageSearchResult.Fields#metadata
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
     * @see LineageSearchResult.Fields#metadata
     */
    public LineageSearchResult setMetadata(
        @Nullable
        SearchResultMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metadata of com.linkedin.metadata.search.LineageSearchResult");
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
     * @see LineageSearchResult.Fields#metadata
     */
    public LineageSearchResult setMetadata(
        @Nonnull
        SearchResultMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadata of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadata", value.data());
            _metadataField = value;
        }
        return this;
    }

    /**
     * Existence checker for from
     * 
     * @see LineageSearchResult.Fields#from
     */
    public boolean hasFrom() {
        if (_fromField!= null) {
            return true;
        }
        return super._map.containsKey("from");
    }

    /**
     * Remover for from
     * 
     * @see LineageSearchResult.Fields#from
     */
    public void removeFrom() {
        super._map.remove("from");
    }

    /**
     * Getter for from
     * 
     * @see LineageSearchResult.Fields#from
     */
    @Nullable
    public Integer getFrom(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFrom();
            case DEFAULT:
            case NULL:
                if (_fromField!= null) {
                    return _fromField;
                } else {
                    Object __rawValue = super._map.get("from");
                    _fromField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _fromField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for from
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageSearchResult.Fields#from
     */
    @Nonnull
    public Integer getFrom() {
        if (_fromField!= null) {
            return _fromField;
        } else {
            Object __rawValue = super._map.get("from");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("from");
            }
            _fromField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _fromField;
        }
    }

    /**
     * Setter for from
     * 
     * @see LineageSearchResult.Fields#from
     */
    public LineageSearchResult setFrom(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFrom(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field from of com.linkedin.metadata.search.LineageSearchResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFrom();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
                    _fromField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for from
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchResult.Fields#from
     */
    public LineageSearchResult setFrom(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field from of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
            _fromField = value;
        }
        return this;
    }

    /**
     * Setter for from
     * 
     * @see LineageSearchResult.Fields#from
     */
    public LineageSearchResult setFrom(int value) {
        CheckedUtil.putWithoutChecking(super._map, "from", DataTemplateUtil.coerceIntInput(value));
        _fromField = value;
        return this;
    }

    /**
     * Existence checker for pageSize
     * 
     * @see LineageSearchResult.Fields#pageSize
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
     * @see LineageSearchResult.Fields#pageSize
     */
    public void removePageSize() {
        super._map.remove("pageSize");
    }

    /**
     * Getter for pageSize
     * 
     * @see LineageSearchResult.Fields#pageSize
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
     * @see LineageSearchResult.Fields#pageSize
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
     * @see LineageSearchResult.Fields#pageSize
     */
    public LineageSearchResult setPageSize(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPageSize(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field pageSize of com.linkedin.metadata.search.LineageSearchResult");
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
     * @see LineageSearchResult.Fields#pageSize
     */
    public LineageSearchResult setPageSize(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pageSize of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
            _pageSizeField = value;
        }
        return this;
    }

    /**
     * Setter for pageSize
     * 
     * @see LineageSearchResult.Fields#pageSize
     */
    public LineageSearchResult setPageSize(int value) {
        CheckedUtil.putWithoutChecking(super._map, "pageSize", DataTemplateUtil.coerceIntInput(value));
        _pageSizeField = value;
        return this;
    }

    /**
     * Existence checker for numEntities
     * 
     * @see LineageSearchResult.Fields#numEntities
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
     * @see LineageSearchResult.Fields#numEntities
     */
    public void removeNumEntities() {
        super._map.remove("numEntities");
    }

    /**
     * Getter for numEntities
     * 
     * @see LineageSearchResult.Fields#numEntities
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
     * @see LineageSearchResult.Fields#numEntities
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
     * @see LineageSearchResult.Fields#numEntities
     */
    public LineageSearchResult setNumEntities(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNumEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field numEntities of com.linkedin.metadata.search.LineageSearchResult");
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
     * @see LineageSearchResult.Fields#numEntities
     */
    public LineageSearchResult setNumEntities(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field numEntities of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
            _numEntitiesField = value;
        }
        return this;
    }

    /**
     * Setter for numEntities
     * 
     * @see LineageSearchResult.Fields#numEntities
     */
    public LineageSearchResult setNumEntities(int value) {
        CheckedUtil.putWithoutChecking(super._map, "numEntities", DataTemplateUtil.coerceIntInput(value));
        _numEntitiesField = value;
        return this;
    }

    /**
     * Existence checker for lineageSearchPath
     * 
     * @see LineageSearchResult.Fields#lineageSearchPath
     */
    public boolean hasLineageSearchPath() {
        if (_lineageSearchPathField!= null) {
            return true;
        }
        return super._map.containsKey("lineageSearchPath");
    }

    /**
     * Remover for lineageSearchPath
     * 
     * @see LineageSearchResult.Fields#lineageSearchPath
     */
    public void removeLineageSearchPath() {
        super._map.remove("lineageSearchPath");
    }

    /**
     * Getter for lineageSearchPath
     * 
     * @see LineageSearchResult.Fields#lineageSearchPath
     */
    @Nullable
    public LineageSearchPath getLineageSearchPath(GetMode mode) {
        return getLineageSearchPath();
    }

    /**
     * Getter for lineageSearchPath
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageSearchResult.Fields#lineageSearchPath
     */
    @Nullable
    public LineageSearchPath getLineageSearchPath() {
        if (_lineageSearchPathField!= null) {
            return _lineageSearchPathField;
        } else {
            Object __rawValue = super._map.get("lineageSearchPath");
            _lineageSearchPathField = DataTemplateUtil.coerceEnumOutput(__rawValue, LineageSearchPath.class, LineageSearchPath.$UNKNOWN);
            return _lineageSearchPathField;
        }
    }

    /**
     * Setter for lineageSearchPath
     * 
     * @see LineageSearchResult.Fields#lineageSearchPath
     */
    public LineageSearchResult setLineageSearchPath(
        @Nullable
        LineageSearchPath value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLineageSearchPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLineageSearchPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lineageSearchPath", value.name());
                    _lineageSearchPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lineageSearchPath", value.name());
                    _lineageSearchPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lineageSearchPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchResult.Fields#lineageSearchPath
     */
    public LineageSearchResult setLineageSearchPath(
        @Nonnull
        LineageSearchPath value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lineageSearchPath of com.linkedin.metadata.search.LineageSearchResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lineageSearchPath", value.name());
            _lineageSearchPathField = value;
        }
        return this;
    }

    @Override
    public LineageSearchResult clone()
        throws CloneNotSupportedException
    {
        LineageSearchResult __clone = ((LineageSearchResult) super.clone());
        __clone.__changeListener = new LineageSearchResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LineageSearchResult copy()
        throws CloneNotSupportedException
    {
        LineageSearchResult __copy = ((LineageSearchResult) super.copy());
        __copy._numEntitiesField = null;
        __copy._metadataField = null;
        __copy._entitiesField = null;
        __copy._pageSizeField = null;
        __copy._fromField = null;
        __copy._freshnessField = null;
        __copy._lineageSearchPathField = null;
        __copy.__changeListener = new LineageSearchResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LineageSearchResult __objectRef;

        private ChangeListener(LineageSearchResult reference) {
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
                case "from":
                    __objectRef._fromField = null;
                    break;
                case "freshness":
                    __objectRef._freshnessField = null;
                    break;
                case "lineageSearchPath":
                    __objectRef._lineageSearchPathField = null;
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
         * Freshness Stats to help a caller understand the freshness of the results
         * Useful when the results are being retrieved from a cache, index or other eventually consistent storage
         * 
         */
        public com.linkedin.metadata.query.FreshnessStats.Fields freshness() {
            return new com.linkedin.metadata.query.FreshnessStats.Fields(getPathComponents(), "freshness");
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
         * Offset of the first entity in the result
         * 
         */
        public PathSpec from() {
            return new PathSpec(getPathComponents(), "from");
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

        /**
         * The path taken when doing search across lineage
         * 
         */
        public PathSpec lineageSearchPath() {
            return new PathSpec(getPathComponents(), "lineageSearchPath");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.FreshnessStats.ProjectionMask _freshnessMask;
        private com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask _entitiesMask;
        private com.linkedin.metadata.search.SearchResultMetadata.ProjectionMask _metadataMask;

        ProjectionMask() {
            super(10);
        }

        /**
         * Freshness Stats to help a caller understand the freshness of the results
         * Useful when the results are being retrieved from a cache, index or other eventually consistent storage
         * 
         */
        public LineageSearchResult.ProjectionMask withFreshness(Function<com.linkedin.metadata.query.FreshnessStats.ProjectionMask, com.linkedin.metadata.query.FreshnessStats.ProjectionMask> nestedMask) {
            _freshnessMask = nestedMask.apply(((_freshnessMask == null)?FreshnessStats.createMask():_freshnessMask));
            getDataMap().put("freshness", _freshnessMask.getDataMap());
            return this;
        }

        /**
         * Freshness Stats to help a caller understand the freshness of the results
         * Useful when the results are being retrieved from a cache, index or other eventually consistent storage
         * 
         */
        public LineageSearchResult.ProjectionMask withFreshness() {
            _freshnessMask = null;
            getDataMap().put("freshness", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageSearchResult.ProjectionMask withEntities(Function<com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask, com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask> nestedMask) {
            _entitiesMask = nestedMask.apply(((_entitiesMask == null)?LineageSearchEntityArray.createMask():_entitiesMask));
            getDataMap().put("entities", _entitiesMask.getDataMap());
            return this;
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageSearchResult.ProjectionMask withEntities() {
            _entitiesMask = null;
            getDataMap().put("entities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of entities returned from the search results
         * 
         */
        public LineageSearchResult.ProjectionMask withEntities(Function<com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask, com.linkedin.metadata.search.LineageSearchEntityArray.ProjectionMask> nestedMask, Integer start, Integer count) {
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
        public LineageSearchResult.ProjectionMask withEntities(Integer start, Integer count) {
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
        public LineageSearchResult.ProjectionMask withMetadata(Function<com.linkedin.metadata.search.SearchResultMetadata.ProjectionMask, com.linkedin.metadata.search.SearchResultMetadata.ProjectionMask> nestedMask) {
            _metadataMask = nestedMask.apply(((_metadataMask == null)?SearchResultMetadata.createMask():_metadataMask));
            getDataMap().put("metadata", _metadataMask.getDataMap());
            return this;
        }

        /**
         * Metadata specific to the browse result of the queried path
         * 
         */
        public LineageSearchResult.ProjectionMask withMetadata() {
            _metadataMask = null;
            getDataMap().put("metadata", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Offset of the first entity in the result
         * 
         */
        public LineageSearchResult.ProjectionMask withFrom() {
            getDataMap().put("from", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Size of each page in the result
         * 
         */
        public LineageSearchResult.ProjectionMask withPageSize() {
            getDataMap().put("pageSize", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The total number of entities directly under searched path
         * 
         */
        public LineageSearchResult.ProjectionMask withNumEntities() {
            getDataMap().put("numEntities", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The path taken when doing search across lineage
         * 
         */
        public LineageSearchResult.ProjectionMask withLineageSearchPath() {
            getDataMap().put("lineageSearchPath", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
