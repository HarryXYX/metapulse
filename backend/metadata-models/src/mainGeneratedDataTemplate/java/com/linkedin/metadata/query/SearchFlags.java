
package com.linkedin.metadata.query;

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
import com.linkedin.data.template.StringArray;


/**
 * Set of flags to control search behavior
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/SearchFlags.pdl.")
public class SearchFlags
    extends RecordTemplate
{

    private final static SearchFlags.Fields _fields = new SearchFlags.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**Set of flags to control search behavior*/record SearchFlags{/**Whether to skip cache*/skipCache:boolean=false/**The maximum number of values in a facet aggregation*/maxAggValues:int=20/**Structured or unstructured fulltext query*/fulltext:optional boolean/**Whether to skip highlighting*/skipHighlighting:optional boolean=false/**Whether to skip aggregates/facets*/skipAggregates:optional boolean=false/**Whether to request for search suggestions on the _entityName virtualized field*/getSuggestions:optional boolean=false/**Instructions for grouping results before returning*/groupingSpec:optional/**A set of directives to control how results are grouped.\nThe underlying generic groupings are nested to allow for further evolution of the grouping spec.*/record GroupingSpec{/**A list of generic directives to group results by.\n*/groupingCriteria:array[record GroupingCriterion{/**The type of the entity to be grouped.\ne.g. schemaField\nOmitting this field will result in all base entities being grouped.*/baseEntityType:optional string/**The type of the entity to be grouped into.\ne.g. dataset, domain, etc.*/groupingEntityType:string}]=[]}/**include soft deleted entities in results*/includeSoftDeleted:optional boolean=false/**include restricted entities in results (default is to filter)*/includeRestricted:optional boolean=false/**Include mentioned fields inside elastic highlighting query*/customHighlightingFields:optional array[string]/**invoke query rewrite chain for filters based on configured rewriters*/rewriteQuery:optional boolean=true/**Include default facets when getting facets to aggregate on in search requests.\nBy default we include these, but custom aggregation requests don't need them.*/includeDefaultFacets:optional boolean=true/**Include only latest versions in version sets, default true*/filterNonLatestVersions:optional boolean=true/**Which fieldConfiguration should be applied. The possible values\nare defined in the configuration file `search_config.yaml`*/fieldConfiguration:optional string/**Sets slice parameter for elasticsearch query,\nto allow multiple clients to scroll the same query at once.\nOnly supported by the ElasticSearchService*/sliceOptions:optional record SliceOptions{id:int,max:int}}", SchemaFormatType.PDL));
    private Boolean _skipCacheField = null;
    private Integer _maxAggValuesField = null;
    private Boolean _fulltextField = null;
    private Boolean _skipHighlightingField = null;
    private Boolean _skipAggregatesField = null;
    private Boolean _getSuggestionsField = null;
    private GroupingSpec _groupingSpecField = null;
    private Boolean _includeSoftDeletedField = null;
    private Boolean _includeRestrictedField = null;
    private StringArray _customHighlightingFieldsField = null;
    private Boolean _rewriteQueryField = null;
    private Boolean _includeDefaultFacetsField = null;
    private Boolean _filterNonLatestVersionsField = null;
    private String _fieldConfigurationField = null;
    private SliceOptions _sliceOptionsField = null;
    private SearchFlags.ChangeListener __changeListener = new SearchFlags.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SkipCache = SCHEMA.getField("skipCache");
    private final static Boolean DEFAULT_SkipCache;
    private final static RecordDataSchema.Field FIELD_MaxAggValues = SCHEMA.getField("maxAggValues");
    private final static Integer DEFAULT_MaxAggValues;
    private final static RecordDataSchema.Field FIELD_Fulltext = SCHEMA.getField("fulltext");
    private final static RecordDataSchema.Field FIELD_SkipHighlighting = SCHEMA.getField("skipHighlighting");
    private final static Boolean DEFAULT_SkipHighlighting;
    private final static RecordDataSchema.Field FIELD_SkipAggregates = SCHEMA.getField("skipAggregates");
    private final static Boolean DEFAULT_SkipAggregates;
    private final static RecordDataSchema.Field FIELD_GetSuggestions = SCHEMA.getField("getSuggestions");
    private final static Boolean DEFAULT_GetSuggestions;
    private final static RecordDataSchema.Field FIELD_GroupingSpec = SCHEMA.getField("groupingSpec");
    private final static RecordDataSchema.Field FIELD_IncludeSoftDeleted = SCHEMA.getField("includeSoftDeleted");
    private final static Boolean DEFAULT_IncludeSoftDeleted;
    private final static RecordDataSchema.Field FIELD_IncludeRestricted = SCHEMA.getField("includeRestricted");
    private final static Boolean DEFAULT_IncludeRestricted;
    private final static RecordDataSchema.Field FIELD_CustomHighlightingFields = SCHEMA.getField("customHighlightingFields");
    private final static RecordDataSchema.Field FIELD_RewriteQuery = SCHEMA.getField("rewriteQuery");
    private final static Boolean DEFAULT_RewriteQuery;
    private final static RecordDataSchema.Field FIELD_IncludeDefaultFacets = SCHEMA.getField("includeDefaultFacets");
    private final static Boolean DEFAULT_IncludeDefaultFacets;
    private final static RecordDataSchema.Field FIELD_FilterNonLatestVersions = SCHEMA.getField("filterNonLatestVersions");
    private final static Boolean DEFAULT_FilterNonLatestVersions;
    private final static RecordDataSchema.Field FIELD_FieldConfiguration = SCHEMA.getField("fieldConfiguration");
    private final static RecordDataSchema.Field FIELD_SliceOptions = SCHEMA.getField("sliceOptions");

    static {
        DEFAULT_SkipCache = DataTemplateUtil.coerceBooleanOutput(FIELD_SkipCache.getDefault());
        DEFAULT_MaxAggValues = DataTemplateUtil.coerceIntOutput(FIELD_MaxAggValues.getDefault());
        DEFAULT_SkipHighlighting = DataTemplateUtil.coerceBooleanOutput(FIELD_SkipHighlighting.getDefault());
        DEFAULT_SkipAggregates = DataTemplateUtil.coerceBooleanOutput(FIELD_SkipAggregates.getDefault());
        DEFAULT_GetSuggestions = DataTemplateUtil.coerceBooleanOutput(FIELD_GetSuggestions.getDefault());
        DEFAULT_IncludeSoftDeleted = DataTemplateUtil.coerceBooleanOutput(FIELD_IncludeSoftDeleted.getDefault());
        DEFAULT_IncludeRestricted = DataTemplateUtil.coerceBooleanOutput(FIELD_IncludeRestricted.getDefault());
        DEFAULT_RewriteQuery = DataTemplateUtil.coerceBooleanOutput(FIELD_RewriteQuery.getDefault());
        DEFAULT_IncludeDefaultFacets = DataTemplateUtil.coerceBooleanOutput(FIELD_IncludeDefaultFacets.getDefault());
        DEFAULT_FilterNonLatestVersions = DataTemplateUtil.coerceBooleanOutput(FIELD_FilterNonLatestVersions.getDefault());
    }

    public SearchFlags() {
        super(new DataMap(), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public SearchFlags(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SearchFlags.Fields fields() {
        return _fields;
    }

    public static SearchFlags.ProjectionMask createMask() {
        return new SearchFlags.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for skipCache
     * 
     * @see SearchFlags.Fields#skipCache
     */
    public boolean hasSkipCache() {
        if (_skipCacheField!= null) {
            return true;
        }
        return super._map.containsKey("skipCache");
    }

    /**
     * Remover for skipCache
     * 
     * @see SearchFlags.Fields#skipCache
     */
    public void removeSkipCache() {
        super._map.remove("skipCache");
    }

    /**
     * Getter for skipCache
     * 
     * @see SearchFlags.Fields#skipCache
     */
    @Nullable
    public Boolean isSkipCache(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isSkipCache();
            case NULL:
                if (_skipCacheField!= null) {
                    return _skipCacheField;
                } else {
                    Object __rawValue = super._map.get("skipCache");
                    _skipCacheField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _skipCacheField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for skipCache
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchFlags.Fields#skipCache
     */
    @Nonnull
    public Boolean isSkipCache() {
        if (_skipCacheField!= null) {
            return _skipCacheField;
        } else {
            Object __rawValue = super._map.get("skipCache");
            if (__rawValue == null) {
                return DEFAULT_SkipCache;
            }
            _skipCacheField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _skipCacheField;
        }
    }

    /**
     * Setter for skipCache
     * 
     * @see SearchFlags.Fields#skipCache
     */
    public SearchFlags setSkipCache(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSkipCache(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field skipCache of com.linkedin.metadata.query.SearchFlags");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "skipCache", value);
                    _skipCacheField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSkipCache();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "skipCache", value);
                    _skipCacheField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "skipCache", value);
                    _skipCacheField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for skipCache
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#skipCache
     */
    public SearchFlags setSkipCache(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field skipCache of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "skipCache", value);
            _skipCacheField = value;
        }
        return this;
    }

    /**
     * Setter for skipCache
     * 
     * @see SearchFlags.Fields#skipCache
     */
    public SearchFlags setSkipCache(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "skipCache", value);
        _skipCacheField = value;
        return this;
    }

    /**
     * Existence checker for maxAggValues
     * 
     * @see SearchFlags.Fields#maxAggValues
     */
    public boolean hasMaxAggValues() {
        if (_maxAggValuesField!= null) {
            return true;
        }
        return super._map.containsKey("maxAggValues");
    }

    /**
     * Remover for maxAggValues
     * 
     * @see SearchFlags.Fields#maxAggValues
     */
    public void removeMaxAggValues() {
        super._map.remove("maxAggValues");
    }

    /**
     * Getter for maxAggValues
     * 
     * @see SearchFlags.Fields#maxAggValues
     */
    @Nullable
    public Integer getMaxAggValues(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getMaxAggValues();
            case NULL:
                if (_maxAggValuesField!= null) {
                    return _maxAggValuesField;
                } else {
                    Object __rawValue = super._map.get("maxAggValues");
                    _maxAggValuesField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _maxAggValuesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for maxAggValues
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchFlags.Fields#maxAggValues
     */
    @Nonnull
    public Integer getMaxAggValues() {
        if (_maxAggValuesField!= null) {
            return _maxAggValuesField;
        } else {
            Object __rawValue = super._map.get("maxAggValues");
            if (__rawValue == null) {
                return DEFAULT_MaxAggValues;
            }
            _maxAggValuesField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _maxAggValuesField;
        }
    }

    /**
     * Setter for maxAggValues
     * 
     * @see SearchFlags.Fields#maxAggValues
     */
    public SearchFlags setMaxAggValues(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMaxAggValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field maxAggValues of com.linkedin.metadata.query.SearchFlags");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxAggValues", DataTemplateUtil.coerceIntInput(value));
                    _maxAggValuesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMaxAggValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxAggValues", DataTemplateUtil.coerceIntInput(value));
                    _maxAggValuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "maxAggValues", DataTemplateUtil.coerceIntInput(value));
                    _maxAggValuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for maxAggValues
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#maxAggValues
     */
    public SearchFlags setMaxAggValues(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field maxAggValues of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "maxAggValues", DataTemplateUtil.coerceIntInput(value));
            _maxAggValuesField = value;
        }
        return this;
    }

    /**
     * Setter for maxAggValues
     * 
     * @see SearchFlags.Fields#maxAggValues
     */
    public SearchFlags setMaxAggValues(int value) {
        CheckedUtil.putWithoutChecking(super._map, "maxAggValues", DataTemplateUtil.coerceIntInput(value));
        _maxAggValuesField = value;
        return this;
    }

    /**
     * Existence checker for fulltext
     * 
     * @see SearchFlags.Fields#fulltext
     */
    public boolean hasFulltext() {
        if (_fulltextField!= null) {
            return true;
        }
        return super._map.containsKey("fulltext");
    }

    /**
     * Remover for fulltext
     * 
     * @see SearchFlags.Fields#fulltext
     */
    public void removeFulltext() {
        super._map.remove("fulltext");
    }

    /**
     * Getter for fulltext
     * 
     * @see SearchFlags.Fields#fulltext
     */
    @Nullable
    public Boolean isFulltext(GetMode mode) {
        return isFulltext();
    }

    /**
     * Getter for fulltext
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#fulltext
     */
    @Nullable
    public Boolean isFulltext() {
        if (_fulltextField!= null) {
            return _fulltextField;
        } else {
            Object __rawValue = super._map.get("fulltext");
            _fulltextField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _fulltextField;
        }
    }

    /**
     * Setter for fulltext
     * 
     * @see SearchFlags.Fields#fulltext
     */
    public SearchFlags setFulltext(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFulltext(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFulltext();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fulltext", value);
                    _fulltextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fulltext", value);
                    _fulltextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fulltext
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#fulltext
     */
    public SearchFlags setFulltext(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fulltext of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fulltext", value);
            _fulltextField = value;
        }
        return this;
    }

    /**
     * Setter for fulltext
     * 
     * @see SearchFlags.Fields#fulltext
     */
    public SearchFlags setFulltext(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "fulltext", value);
        _fulltextField = value;
        return this;
    }

    /**
     * Existence checker for skipHighlighting
     * 
     * @see SearchFlags.Fields#skipHighlighting
     */
    public boolean hasSkipHighlighting() {
        if (_skipHighlightingField!= null) {
            return true;
        }
        return super._map.containsKey("skipHighlighting");
    }

    /**
     * Remover for skipHighlighting
     * 
     * @see SearchFlags.Fields#skipHighlighting
     */
    public void removeSkipHighlighting() {
        super._map.remove("skipHighlighting");
    }

    /**
     * Getter for skipHighlighting
     * 
     * @see SearchFlags.Fields#skipHighlighting
     */
    @Nullable
    public Boolean isSkipHighlighting(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isSkipHighlighting();
            case NULL:
                if (_skipHighlightingField!= null) {
                    return _skipHighlightingField;
                } else {
                    Object __rawValue = super._map.get("skipHighlighting");
                    _skipHighlightingField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _skipHighlightingField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for skipHighlighting
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#skipHighlighting
     */
    @Nullable
    public Boolean isSkipHighlighting() {
        if (_skipHighlightingField!= null) {
            return _skipHighlightingField;
        } else {
            Object __rawValue = super._map.get("skipHighlighting");
            if (__rawValue == null) {
                return DEFAULT_SkipHighlighting;
            }
            _skipHighlightingField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _skipHighlightingField;
        }
    }

    /**
     * Setter for skipHighlighting
     * 
     * @see SearchFlags.Fields#skipHighlighting
     */
    public SearchFlags setSkipHighlighting(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSkipHighlighting(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSkipHighlighting();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "skipHighlighting", value);
                    _skipHighlightingField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "skipHighlighting", value);
                    _skipHighlightingField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for skipHighlighting
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#skipHighlighting
     */
    public SearchFlags setSkipHighlighting(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field skipHighlighting of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "skipHighlighting", value);
            _skipHighlightingField = value;
        }
        return this;
    }

    /**
     * Setter for skipHighlighting
     * 
     * @see SearchFlags.Fields#skipHighlighting
     */
    public SearchFlags setSkipHighlighting(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "skipHighlighting", value);
        _skipHighlightingField = value;
        return this;
    }

    /**
     * Existence checker for skipAggregates
     * 
     * @see SearchFlags.Fields#skipAggregates
     */
    public boolean hasSkipAggregates() {
        if (_skipAggregatesField!= null) {
            return true;
        }
        return super._map.containsKey("skipAggregates");
    }

    /**
     * Remover for skipAggregates
     * 
     * @see SearchFlags.Fields#skipAggregates
     */
    public void removeSkipAggregates() {
        super._map.remove("skipAggregates");
    }

    /**
     * Getter for skipAggregates
     * 
     * @see SearchFlags.Fields#skipAggregates
     */
    @Nullable
    public Boolean isSkipAggregates(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isSkipAggregates();
            case NULL:
                if (_skipAggregatesField!= null) {
                    return _skipAggregatesField;
                } else {
                    Object __rawValue = super._map.get("skipAggregates");
                    _skipAggregatesField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _skipAggregatesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for skipAggregates
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#skipAggregates
     */
    @Nullable
    public Boolean isSkipAggregates() {
        if (_skipAggregatesField!= null) {
            return _skipAggregatesField;
        } else {
            Object __rawValue = super._map.get("skipAggregates");
            if (__rawValue == null) {
                return DEFAULT_SkipAggregates;
            }
            _skipAggregatesField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _skipAggregatesField;
        }
    }

    /**
     * Setter for skipAggregates
     * 
     * @see SearchFlags.Fields#skipAggregates
     */
    public SearchFlags setSkipAggregates(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSkipAggregates(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSkipAggregates();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "skipAggregates", value);
                    _skipAggregatesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "skipAggregates", value);
                    _skipAggregatesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for skipAggregates
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#skipAggregates
     */
    public SearchFlags setSkipAggregates(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field skipAggregates of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "skipAggregates", value);
            _skipAggregatesField = value;
        }
        return this;
    }

    /**
     * Setter for skipAggregates
     * 
     * @see SearchFlags.Fields#skipAggregates
     */
    public SearchFlags setSkipAggregates(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "skipAggregates", value);
        _skipAggregatesField = value;
        return this;
    }

    /**
     * Existence checker for getSuggestions
     * 
     * @see SearchFlags.Fields#getSuggestions
     */
    public boolean hasGetSuggestions() {
        if (_getSuggestionsField!= null) {
            return true;
        }
        return super._map.containsKey("getSuggestions");
    }

    /**
     * Remover for getSuggestions
     * 
     * @see SearchFlags.Fields#getSuggestions
     */
    public void removeGetSuggestions() {
        super._map.remove("getSuggestions");
    }

    /**
     * Getter for getSuggestions
     * 
     * @see SearchFlags.Fields#getSuggestions
     */
    @Nullable
    public Boolean isGetSuggestions(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isGetSuggestions();
            case NULL:
                if (_getSuggestionsField!= null) {
                    return _getSuggestionsField;
                } else {
                    Object __rawValue = super._map.get("getSuggestions");
                    _getSuggestionsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _getSuggestionsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for getSuggestions
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#getSuggestions
     */
    @Nullable
    public Boolean isGetSuggestions() {
        if (_getSuggestionsField!= null) {
            return _getSuggestionsField;
        } else {
            Object __rawValue = super._map.get("getSuggestions");
            if (__rawValue == null) {
                return DEFAULT_GetSuggestions;
            }
            _getSuggestionsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _getSuggestionsField;
        }
    }

    /**
     * Setter for getSuggestions
     * 
     * @see SearchFlags.Fields#getSuggestions
     */
    public SearchFlags setGetSuggestions(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGetSuggestions(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGetSuggestions();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "getSuggestions", value);
                    _getSuggestionsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "getSuggestions", value);
                    _getSuggestionsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for getSuggestions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#getSuggestions
     */
    public SearchFlags setGetSuggestions(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field getSuggestions of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "getSuggestions", value);
            _getSuggestionsField = value;
        }
        return this;
    }

    /**
     * Setter for getSuggestions
     * 
     * @see SearchFlags.Fields#getSuggestions
     */
    public SearchFlags setGetSuggestions(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "getSuggestions", value);
        _getSuggestionsField = value;
        return this;
    }

    /**
     * Existence checker for groupingSpec
     * 
     * @see SearchFlags.Fields#groupingSpec
     */
    public boolean hasGroupingSpec() {
        if (_groupingSpecField!= null) {
            return true;
        }
        return super._map.containsKey("groupingSpec");
    }

    /**
     * Remover for groupingSpec
     * 
     * @see SearchFlags.Fields#groupingSpec
     */
    public void removeGroupingSpec() {
        super._map.remove("groupingSpec");
    }

    /**
     * Getter for groupingSpec
     * 
     * @see SearchFlags.Fields#groupingSpec
     */
    @Nullable
    public GroupingSpec getGroupingSpec(GetMode mode) {
        return getGroupingSpec();
    }

    /**
     * Getter for groupingSpec
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#groupingSpec
     */
    @Nullable
    public GroupingSpec getGroupingSpec() {
        if (_groupingSpecField!= null) {
            return _groupingSpecField;
        } else {
            Object __rawValue = super._map.get("groupingSpec");
            _groupingSpecField = ((__rawValue == null)?null:new GroupingSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _groupingSpecField;
        }
    }

    /**
     * Setter for groupingSpec
     * 
     * @see SearchFlags.Fields#groupingSpec
     */
    public SearchFlags setGroupingSpec(
        @Nullable
        GroupingSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setGroupingSpec(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeGroupingSpec();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "groupingSpec", value.data());
                    _groupingSpecField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "groupingSpec", value.data());
                    _groupingSpecField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for groupingSpec
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#groupingSpec
     */
    public SearchFlags setGroupingSpec(
        @Nonnull
        GroupingSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field groupingSpec of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "groupingSpec", value.data());
            _groupingSpecField = value;
        }
        return this;
    }

    /**
     * Existence checker for includeSoftDeleted
     * 
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    public boolean hasIncludeSoftDeleted() {
        if (_includeSoftDeletedField!= null) {
            return true;
        }
        return super._map.containsKey("includeSoftDeleted");
    }

    /**
     * Remover for includeSoftDeleted
     * 
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    public void removeIncludeSoftDeleted() {
        super._map.remove("includeSoftDeleted");
    }

    /**
     * Getter for includeSoftDeleted
     * 
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    @Nullable
    public Boolean isIncludeSoftDeleted(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isIncludeSoftDeleted();
            case NULL:
                if (_includeSoftDeletedField!= null) {
                    return _includeSoftDeletedField;
                } else {
                    Object __rawValue = super._map.get("includeSoftDeleted");
                    _includeSoftDeletedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _includeSoftDeletedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for includeSoftDeleted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    @Nullable
    public Boolean isIncludeSoftDeleted() {
        if (_includeSoftDeletedField!= null) {
            return _includeSoftDeletedField;
        } else {
            Object __rawValue = super._map.get("includeSoftDeleted");
            if (__rawValue == null) {
                return DEFAULT_IncludeSoftDeleted;
            }
            _includeSoftDeletedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _includeSoftDeletedField;
        }
    }

    /**
     * Setter for includeSoftDeleted
     * 
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    public SearchFlags setIncludeSoftDeleted(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncludeSoftDeleted(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncludeSoftDeleted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "includeSoftDeleted", value);
                    _includeSoftDeletedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "includeSoftDeleted", value);
                    _includeSoftDeletedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for includeSoftDeleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    public SearchFlags setIncludeSoftDeleted(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field includeSoftDeleted of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "includeSoftDeleted", value);
            _includeSoftDeletedField = value;
        }
        return this;
    }

    /**
     * Setter for includeSoftDeleted
     * 
     * @see SearchFlags.Fields#includeSoftDeleted
     */
    public SearchFlags setIncludeSoftDeleted(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "includeSoftDeleted", value);
        _includeSoftDeletedField = value;
        return this;
    }

    /**
     * Existence checker for includeRestricted
     * 
     * @see SearchFlags.Fields#includeRestricted
     */
    public boolean hasIncludeRestricted() {
        if (_includeRestrictedField!= null) {
            return true;
        }
        return super._map.containsKey("includeRestricted");
    }

    /**
     * Remover for includeRestricted
     * 
     * @see SearchFlags.Fields#includeRestricted
     */
    public void removeIncludeRestricted() {
        super._map.remove("includeRestricted");
    }

    /**
     * Getter for includeRestricted
     * 
     * @see SearchFlags.Fields#includeRestricted
     */
    @Nullable
    public Boolean isIncludeRestricted(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isIncludeRestricted();
            case NULL:
                if (_includeRestrictedField!= null) {
                    return _includeRestrictedField;
                } else {
                    Object __rawValue = super._map.get("includeRestricted");
                    _includeRestrictedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _includeRestrictedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for includeRestricted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#includeRestricted
     */
    @Nullable
    public Boolean isIncludeRestricted() {
        if (_includeRestrictedField!= null) {
            return _includeRestrictedField;
        } else {
            Object __rawValue = super._map.get("includeRestricted");
            if (__rawValue == null) {
                return DEFAULT_IncludeRestricted;
            }
            _includeRestrictedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _includeRestrictedField;
        }
    }

    /**
     * Setter for includeRestricted
     * 
     * @see SearchFlags.Fields#includeRestricted
     */
    public SearchFlags setIncludeRestricted(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncludeRestricted(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncludeRestricted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "includeRestricted", value);
                    _includeRestrictedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "includeRestricted", value);
                    _includeRestrictedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for includeRestricted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#includeRestricted
     */
    public SearchFlags setIncludeRestricted(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field includeRestricted of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "includeRestricted", value);
            _includeRestrictedField = value;
        }
        return this;
    }

    /**
     * Setter for includeRestricted
     * 
     * @see SearchFlags.Fields#includeRestricted
     */
    public SearchFlags setIncludeRestricted(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "includeRestricted", value);
        _includeRestrictedField = value;
        return this;
    }

    /**
     * Existence checker for customHighlightingFields
     * 
     * @see SearchFlags.Fields#customHighlightingFields
     */
    public boolean hasCustomHighlightingFields() {
        if (_customHighlightingFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("customHighlightingFields");
    }

    /**
     * Remover for customHighlightingFields
     * 
     * @see SearchFlags.Fields#customHighlightingFields
     */
    public void removeCustomHighlightingFields() {
        super._map.remove("customHighlightingFields");
    }

    /**
     * Getter for customHighlightingFields
     * 
     * @see SearchFlags.Fields#customHighlightingFields
     */
    @Nullable
    public StringArray getCustomHighlightingFields(GetMode mode) {
        return getCustomHighlightingFields();
    }

    /**
     * Getter for customHighlightingFields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#customHighlightingFields
     */
    @Nullable
    public StringArray getCustomHighlightingFields() {
        if (_customHighlightingFieldsField!= null) {
            return _customHighlightingFieldsField;
        } else {
            Object __rawValue = super._map.get("customHighlightingFields");
            _customHighlightingFieldsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _customHighlightingFieldsField;
        }
    }

    /**
     * Setter for customHighlightingFields
     * 
     * @see SearchFlags.Fields#customHighlightingFields
     */
    public SearchFlags setCustomHighlightingFields(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomHighlightingFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomHighlightingFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customHighlightingFields", value.data());
                    _customHighlightingFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customHighlightingFields", value.data());
                    _customHighlightingFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customHighlightingFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#customHighlightingFields
     */
    public SearchFlags setCustomHighlightingFields(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customHighlightingFields of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customHighlightingFields", value.data());
            _customHighlightingFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for rewriteQuery
     * 
     * @see SearchFlags.Fields#rewriteQuery
     */
    public boolean hasRewriteQuery() {
        if (_rewriteQueryField!= null) {
            return true;
        }
        return super._map.containsKey("rewriteQuery");
    }

    /**
     * Remover for rewriteQuery
     * 
     * @see SearchFlags.Fields#rewriteQuery
     */
    public void removeRewriteQuery() {
        super._map.remove("rewriteQuery");
    }

    /**
     * Getter for rewriteQuery
     * 
     * @see SearchFlags.Fields#rewriteQuery
     */
    @Nullable
    public Boolean isRewriteQuery(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isRewriteQuery();
            case NULL:
                if (_rewriteQueryField!= null) {
                    return _rewriteQueryField;
                } else {
                    Object __rawValue = super._map.get("rewriteQuery");
                    _rewriteQueryField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _rewriteQueryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for rewriteQuery
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#rewriteQuery
     */
    @Nullable
    public Boolean isRewriteQuery() {
        if (_rewriteQueryField!= null) {
            return _rewriteQueryField;
        } else {
            Object __rawValue = super._map.get("rewriteQuery");
            if (__rawValue == null) {
                return DEFAULT_RewriteQuery;
            }
            _rewriteQueryField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _rewriteQueryField;
        }
    }

    /**
     * Setter for rewriteQuery
     * 
     * @see SearchFlags.Fields#rewriteQuery
     */
    public SearchFlags setRewriteQuery(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRewriteQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRewriteQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rewriteQuery", value);
                    _rewriteQueryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rewriteQuery", value);
                    _rewriteQueryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rewriteQuery
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#rewriteQuery
     */
    public SearchFlags setRewriteQuery(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rewriteQuery of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rewriteQuery", value);
            _rewriteQueryField = value;
        }
        return this;
    }

    /**
     * Setter for rewriteQuery
     * 
     * @see SearchFlags.Fields#rewriteQuery
     */
    public SearchFlags setRewriteQuery(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "rewriteQuery", value);
        _rewriteQueryField = value;
        return this;
    }

    /**
     * Existence checker for includeDefaultFacets
     * 
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    public boolean hasIncludeDefaultFacets() {
        if (_includeDefaultFacetsField!= null) {
            return true;
        }
        return super._map.containsKey("includeDefaultFacets");
    }

    /**
     * Remover for includeDefaultFacets
     * 
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    public void removeIncludeDefaultFacets() {
        super._map.remove("includeDefaultFacets");
    }

    /**
     * Getter for includeDefaultFacets
     * 
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    @Nullable
    public Boolean isIncludeDefaultFacets(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isIncludeDefaultFacets();
            case NULL:
                if (_includeDefaultFacetsField!= null) {
                    return _includeDefaultFacetsField;
                } else {
                    Object __rawValue = super._map.get("includeDefaultFacets");
                    _includeDefaultFacetsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _includeDefaultFacetsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for includeDefaultFacets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    @Nullable
    public Boolean isIncludeDefaultFacets() {
        if (_includeDefaultFacetsField!= null) {
            return _includeDefaultFacetsField;
        } else {
            Object __rawValue = super._map.get("includeDefaultFacets");
            if (__rawValue == null) {
                return DEFAULT_IncludeDefaultFacets;
            }
            _includeDefaultFacetsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _includeDefaultFacetsField;
        }
    }

    /**
     * Setter for includeDefaultFacets
     * 
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    public SearchFlags setIncludeDefaultFacets(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncludeDefaultFacets(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncludeDefaultFacets();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "includeDefaultFacets", value);
                    _includeDefaultFacetsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "includeDefaultFacets", value);
                    _includeDefaultFacetsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for includeDefaultFacets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    public SearchFlags setIncludeDefaultFacets(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field includeDefaultFacets of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "includeDefaultFacets", value);
            _includeDefaultFacetsField = value;
        }
        return this;
    }

    /**
     * Setter for includeDefaultFacets
     * 
     * @see SearchFlags.Fields#includeDefaultFacets
     */
    public SearchFlags setIncludeDefaultFacets(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "includeDefaultFacets", value);
        _includeDefaultFacetsField = value;
        return this;
    }

    /**
     * Existence checker for filterNonLatestVersions
     * 
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    public boolean hasFilterNonLatestVersions() {
        if (_filterNonLatestVersionsField!= null) {
            return true;
        }
        return super._map.containsKey("filterNonLatestVersions");
    }

    /**
     * Remover for filterNonLatestVersions
     * 
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    public void removeFilterNonLatestVersions() {
        super._map.remove("filterNonLatestVersions");
    }

    /**
     * Getter for filterNonLatestVersions
     * 
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    @Nullable
    public Boolean isFilterNonLatestVersions(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isFilterNonLatestVersions();
            case NULL:
                if (_filterNonLatestVersionsField!= null) {
                    return _filterNonLatestVersionsField;
                } else {
                    Object __rawValue = super._map.get("filterNonLatestVersions");
                    _filterNonLatestVersionsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _filterNonLatestVersionsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for filterNonLatestVersions
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    @Nullable
    public Boolean isFilterNonLatestVersions() {
        if (_filterNonLatestVersionsField!= null) {
            return _filterNonLatestVersionsField;
        } else {
            Object __rawValue = super._map.get("filterNonLatestVersions");
            if (__rawValue == null) {
                return DEFAULT_FilterNonLatestVersions;
            }
            _filterNonLatestVersionsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _filterNonLatestVersionsField;
        }
    }

    /**
     * Setter for filterNonLatestVersions
     * 
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    public SearchFlags setFilterNonLatestVersions(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilterNonLatestVersions(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilterNonLatestVersions();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filterNonLatestVersions", value);
                    _filterNonLatestVersionsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filterNonLatestVersions", value);
                    _filterNonLatestVersionsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filterNonLatestVersions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    public SearchFlags setFilterNonLatestVersions(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filterNonLatestVersions of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filterNonLatestVersions", value);
            _filterNonLatestVersionsField = value;
        }
        return this;
    }

    /**
     * Setter for filterNonLatestVersions
     * 
     * @see SearchFlags.Fields#filterNonLatestVersions
     */
    public SearchFlags setFilterNonLatestVersions(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "filterNonLatestVersions", value);
        _filterNonLatestVersionsField = value;
        return this;
    }

    /**
     * Existence checker for fieldConfiguration
     * 
     * @see SearchFlags.Fields#fieldConfiguration
     */
    public boolean hasFieldConfiguration() {
        if (_fieldConfigurationField!= null) {
            return true;
        }
        return super._map.containsKey("fieldConfiguration");
    }

    /**
     * Remover for fieldConfiguration
     * 
     * @see SearchFlags.Fields#fieldConfiguration
     */
    public void removeFieldConfiguration() {
        super._map.remove("fieldConfiguration");
    }

    /**
     * Getter for fieldConfiguration
     * 
     * @see SearchFlags.Fields#fieldConfiguration
     */
    @Nullable
    public String getFieldConfiguration(GetMode mode) {
        return getFieldConfiguration();
    }

    /**
     * Getter for fieldConfiguration
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#fieldConfiguration
     */
    @Nullable
    public String getFieldConfiguration() {
        if (_fieldConfigurationField!= null) {
            return _fieldConfigurationField;
        } else {
            Object __rawValue = super._map.get("fieldConfiguration");
            _fieldConfigurationField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldConfigurationField;
        }
    }

    /**
     * Setter for fieldConfiguration
     * 
     * @see SearchFlags.Fields#fieldConfiguration
     */
    public SearchFlags setFieldConfiguration(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldConfiguration(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldConfiguration();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldConfiguration", value);
                    _fieldConfigurationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldConfiguration", value);
                    _fieldConfigurationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldConfiguration
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#fieldConfiguration
     */
    public SearchFlags setFieldConfiguration(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldConfiguration of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldConfiguration", value);
            _fieldConfigurationField = value;
        }
        return this;
    }

    /**
     * Existence checker for sliceOptions
     * 
     * @see SearchFlags.Fields#sliceOptions
     */
    public boolean hasSliceOptions() {
        if (_sliceOptionsField!= null) {
            return true;
        }
        return super._map.containsKey("sliceOptions");
    }

    /**
     * Remover for sliceOptions
     * 
     * @see SearchFlags.Fields#sliceOptions
     */
    public void removeSliceOptions() {
        super._map.remove("sliceOptions");
    }

    /**
     * Getter for sliceOptions
     * 
     * @see SearchFlags.Fields#sliceOptions
     */
    @Nullable
    public SliceOptions getSliceOptions(GetMode mode) {
        return getSliceOptions();
    }

    /**
     * Getter for sliceOptions
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchFlags.Fields#sliceOptions
     */
    @Nullable
    public SliceOptions getSliceOptions() {
        if (_sliceOptionsField!= null) {
            return _sliceOptionsField;
        } else {
            Object __rawValue = super._map.get("sliceOptions");
            _sliceOptionsField = ((__rawValue == null)?null:new SliceOptions(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _sliceOptionsField;
        }
    }

    /**
     * Setter for sliceOptions
     * 
     * @see SearchFlags.Fields#sliceOptions
     */
    public SearchFlags setSliceOptions(
        @Nullable
        SliceOptions value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSliceOptions(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSliceOptions();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "sliceOptions", value.data());
                    _sliceOptionsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "sliceOptions", value.data());
                    _sliceOptionsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for sliceOptions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchFlags.Fields#sliceOptions
     */
    public SearchFlags setSliceOptions(
        @Nonnull
        SliceOptions value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field sliceOptions of com.linkedin.metadata.query.SearchFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "sliceOptions", value.data());
            _sliceOptionsField = value;
        }
        return this;
    }

    @Override
    public SearchFlags clone()
        throws CloneNotSupportedException
    {
        SearchFlags __clone = ((SearchFlags) super.clone());
        __clone.__changeListener = new SearchFlags.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SearchFlags copy()
        throws CloneNotSupportedException
    {
        SearchFlags __copy = ((SearchFlags) super.copy());
        __copy._maxAggValuesField = null;
        __copy._fieldConfigurationField = null;
        __copy._skipAggregatesField = null;
        __copy._skipCacheField = null;
        __copy._customHighlightingFieldsField = null;
        __copy._includeDefaultFacetsField = null;
        __copy._includeRestrictedField = null;
        __copy._filterNonLatestVersionsField = null;
        __copy._skipHighlightingField = null;
        __copy._getSuggestionsField = null;
        __copy._groupingSpecField = null;
        __copy._fulltextField = null;
        __copy._sliceOptionsField = null;
        __copy._includeSoftDeletedField = null;
        __copy._rewriteQueryField = null;
        __copy.__changeListener = new SearchFlags.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SearchFlags __objectRef;

        private ChangeListener(SearchFlags reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "maxAggValues":
                    __objectRef._maxAggValuesField = null;
                    break;
                case "fieldConfiguration":
                    __objectRef._fieldConfigurationField = null;
                    break;
                case "skipAggregates":
                    __objectRef._skipAggregatesField = null;
                    break;
                case "skipCache":
                    __objectRef._skipCacheField = null;
                    break;
                case "customHighlightingFields":
                    __objectRef._customHighlightingFieldsField = null;
                    break;
                case "includeDefaultFacets":
                    __objectRef._includeDefaultFacetsField = null;
                    break;
                case "includeRestricted":
                    __objectRef._includeRestrictedField = null;
                    break;
                case "filterNonLatestVersions":
                    __objectRef._filterNonLatestVersionsField = null;
                    break;
                case "skipHighlighting":
                    __objectRef._skipHighlightingField = null;
                    break;
                case "getSuggestions":
                    __objectRef._getSuggestionsField = null;
                    break;
                case "groupingSpec":
                    __objectRef._groupingSpecField = null;
                    break;
                case "fulltext":
                    __objectRef._fulltextField = null;
                    break;
                case "sliceOptions":
                    __objectRef._sliceOptionsField = null;
                    break;
                case "includeSoftDeleted":
                    __objectRef._includeSoftDeletedField = null;
                    break;
                case "rewriteQuery":
                    __objectRef._rewriteQueryField = null;
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
         * Whether to skip cache
         * 
         */
        public PathSpec skipCache() {
            return new PathSpec(getPathComponents(), "skipCache");
        }

        /**
         * The maximum number of values in a facet aggregation
         * 
         */
        public PathSpec maxAggValues() {
            return new PathSpec(getPathComponents(), "maxAggValues");
        }

        /**
         * Structured or unstructured fulltext query
         * 
         */
        public PathSpec fulltext() {
            return new PathSpec(getPathComponents(), "fulltext");
        }

        /**
         * Whether to skip highlighting
         * 
         */
        public PathSpec skipHighlighting() {
            return new PathSpec(getPathComponents(), "skipHighlighting");
        }

        /**
         * Whether to skip aggregates/facets
         * 
         */
        public PathSpec skipAggregates() {
            return new PathSpec(getPathComponents(), "skipAggregates");
        }

        /**
         * Whether to request for search suggestions on the _entityName virtualized field
         * 
         */
        public PathSpec getSuggestions() {
            return new PathSpec(getPathComponents(), "getSuggestions");
        }

        /**
         * Instructions for grouping results before returning
         * 
         */
        public com.linkedin.metadata.query.GroupingSpec.Fields groupingSpec() {
            return new com.linkedin.metadata.query.GroupingSpec.Fields(getPathComponents(), "groupingSpec");
        }

        /**
         * include soft deleted entities in results
         * 
         */
        public PathSpec includeSoftDeleted() {
            return new PathSpec(getPathComponents(), "includeSoftDeleted");
        }

        /**
         * include restricted entities in results (default is to filter)
         * 
         */
        public PathSpec includeRestricted() {
            return new PathSpec(getPathComponents(), "includeRestricted");
        }

        /**
         * Include mentioned fields inside elastic highlighting query
         * 
         */
        public PathSpec customHighlightingFields() {
            return new PathSpec(getPathComponents(), "customHighlightingFields");
        }

        /**
         * Include mentioned fields inside elastic highlighting query
         * 
         */
        public PathSpec customHighlightingFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "customHighlightingFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * invoke query rewrite chain for filters based on configured rewriters
         * 
         */
        public PathSpec rewriteQuery() {
            return new PathSpec(getPathComponents(), "rewriteQuery");
        }

        /**
         * Include default facets when getting facets to aggregate on in search requests.
         * By default we include these, but custom aggregation requests don't need them.
         * 
         */
        public PathSpec includeDefaultFacets() {
            return new PathSpec(getPathComponents(), "includeDefaultFacets");
        }

        /**
         * Include only latest versions in version sets, default true
         * 
         */
        public PathSpec filterNonLatestVersions() {
            return new PathSpec(getPathComponents(), "filterNonLatestVersions");
        }

        /**
         * Which fieldConfiguration should be applied. The possible values
         * are defined in the configuration file `search_config.yaml`
         * 
         */
        public PathSpec fieldConfiguration() {
            return new PathSpec(getPathComponents(), "fieldConfiguration");
        }

        /**
         * Sets slice parameter for elasticsearch query,
         * to allow multiple clients to scroll the same query at once.
         * Only supported by the ElasticSearchService
         * 
         */
        public com.linkedin.metadata.query.SliceOptions.Fields sliceOptions() {
            return new com.linkedin.metadata.query.SliceOptions.Fields(getPathComponents(), "sliceOptions");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.GroupingSpec.ProjectionMask _groupingSpecMask;
        private com.linkedin.metadata.query.SliceOptions.ProjectionMask _sliceOptionsMask;

        ProjectionMask() {
        }

        /**
         * Whether to skip cache
         * 
         */
        public SearchFlags.ProjectionMask withSkipCache() {
            getDataMap().put("skipCache", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The maximum number of values in a facet aggregation
         * 
         */
        public SearchFlags.ProjectionMask withMaxAggValues() {
            getDataMap().put("maxAggValues", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Structured or unstructured fulltext query
         * 
         */
        public SearchFlags.ProjectionMask withFulltext() {
            getDataMap().put("fulltext", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether to skip highlighting
         * 
         */
        public SearchFlags.ProjectionMask withSkipHighlighting() {
            getDataMap().put("skipHighlighting", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether to skip aggregates/facets
         * 
         */
        public SearchFlags.ProjectionMask withSkipAggregates() {
            getDataMap().put("skipAggregates", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether to request for search suggestions on the _entityName virtualized field
         * 
         */
        public SearchFlags.ProjectionMask withGetSuggestions() {
            getDataMap().put("getSuggestions", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Instructions for grouping results before returning
         * 
         */
        public SearchFlags.ProjectionMask withGroupingSpec(Function<com.linkedin.metadata.query.GroupingSpec.ProjectionMask, com.linkedin.metadata.query.GroupingSpec.ProjectionMask> nestedMask) {
            _groupingSpecMask = nestedMask.apply(((_groupingSpecMask == null)?GroupingSpec.createMask():_groupingSpecMask));
            getDataMap().put("groupingSpec", _groupingSpecMask.getDataMap());
            return this;
        }

        /**
         * Instructions for grouping results before returning
         * 
         */
        public SearchFlags.ProjectionMask withGroupingSpec() {
            _groupingSpecMask = null;
            getDataMap().put("groupingSpec", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * include soft deleted entities in results
         * 
         */
        public SearchFlags.ProjectionMask withIncludeSoftDeleted() {
            getDataMap().put("includeSoftDeleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * include restricted entities in results (default is to filter)
         * 
         */
        public SearchFlags.ProjectionMask withIncludeRestricted() {
            getDataMap().put("includeRestricted", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Include mentioned fields inside elastic highlighting query
         * 
         */
        public SearchFlags.ProjectionMask withCustomHighlightingFields() {
            getDataMap().put("customHighlightingFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Include mentioned fields inside elastic highlighting query
         * 
         */
        public SearchFlags.ProjectionMask withCustomHighlightingFields(Integer start, Integer count) {
            getDataMap().put("customHighlightingFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("customHighlightingFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("customHighlightingFields").put("$count", count);
            }
            return this;
        }

        /**
         * invoke query rewrite chain for filters based on configured rewriters
         * 
         */
        public SearchFlags.ProjectionMask withRewriteQuery() {
            getDataMap().put("rewriteQuery", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Include default facets when getting facets to aggregate on in search requests.
         * By default we include these, but custom aggregation requests don't need them.
         * 
         */
        public SearchFlags.ProjectionMask withIncludeDefaultFacets() {
            getDataMap().put("includeDefaultFacets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Include only latest versions in version sets, default true
         * 
         */
        public SearchFlags.ProjectionMask withFilterNonLatestVersions() {
            getDataMap().put("filterNonLatestVersions", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Which fieldConfiguration should be applied. The possible values
         * are defined in the configuration file `search_config.yaml`
         * 
         */
        public SearchFlags.ProjectionMask withFieldConfiguration() {
            getDataMap().put("fieldConfiguration", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Sets slice parameter for elasticsearch query,
         * to allow multiple clients to scroll the same query at once.
         * Only supported by the ElasticSearchService
         * 
         */
        public SearchFlags.ProjectionMask withSliceOptions(Function<com.linkedin.metadata.query.SliceOptions.ProjectionMask, com.linkedin.metadata.query.SliceOptions.ProjectionMask> nestedMask) {
            _sliceOptionsMask = nestedMask.apply(((_sliceOptionsMask == null)?SliceOptions.createMask():_sliceOptionsMask));
            getDataMap().put("sliceOptions", _sliceOptionsMask.getDataMap());
            return this;
        }

        /**
         * Sets slice parameter for elasticsearch query,
         * to allow multiple clients to scroll the same query at once.
         * Only supported by the ElasticSearchService
         * 
         */
        public SearchFlags.ProjectionMask withSliceOptions() {
            _sliceOptionsMask = null;
            getDataMap().put("sliceOptions", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
