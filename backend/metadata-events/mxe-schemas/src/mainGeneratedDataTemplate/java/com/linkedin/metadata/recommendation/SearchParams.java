
package com.linkedin.metadata.recommendation;

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
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.filter.CriterionArray;


/**
 * Context to define the search recommendations
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/SearchParams.pdl.")
public class SearchParams
    extends RecordTemplate
{

    private final static SearchParams.Fields _fields = new SearchParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}}]=[]}", SchemaFormatType.PDL));
    private StringArray _typesField = null;
    private String _queryField = null;
    private CriterionArray _filtersField = null;
    private SearchParams.ChangeListener __changeListener = new SearchParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Types = SCHEMA.getField("types");
    private final static StringArray DEFAULT_Types;
    private final static RecordDataSchema.Field FIELD_Query = SCHEMA.getField("query");
    private final static RecordDataSchema.Field FIELD_Filters = SCHEMA.getField("filters");
    private final static CriterionArray DEFAULT_Filters;

    static {
        DEFAULT_Types = ((FIELD_Types.getDefault() == null)?null:new StringArray(DataTemplateUtil.castOrThrow(FIELD_Types.getDefault(), DataList.class)));
        DEFAULT_Filters = ((FIELD_Filters.getDefault() == null)?null:new CriterionArray(DataTemplateUtil.castOrThrow(FIELD_Filters.getDefault(), DataList.class)));
    }

    public SearchParams() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public SearchParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SearchParams.Fields fields() {
        return _fields;
    }

    public static SearchParams.ProjectionMask createMask() {
        return new SearchParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for types
     * 
     * @see SearchParams.Fields#types
     */
    public boolean hasTypes() {
        if (_typesField!= null) {
            return true;
        }
        return super._map.containsKey("types");
    }

    /**
     * Remover for types
     * 
     * @see SearchParams.Fields#types
     */
    public void removeTypes() {
        super._map.remove("types");
    }

    /**
     * Getter for types
     * 
     * @see SearchParams.Fields#types
     */
    @Nullable
    public StringArray getTypes(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getTypes();
            case NULL:
                if (_typesField!= null) {
                    return _typesField;
                } else {
                    Object __rawValue = super._map.get("types");
                    _typesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _typesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for types
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchParams.Fields#types
     */
    @Nonnull
    public StringArray getTypes() {
        if (_typesField!= null) {
            return _typesField;
        } else {
            Object __rawValue = super._map.get("types");
            if (__rawValue == null) {
                return DEFAULT_Types;
            }
            _typesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _typesField;
        }
    }

    /**
     * Setter for types
     * 
     * @see SearchParams.Fields#types
     */
    public SearchParams setTypes(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field types of com.linkedin.metadata.recommendation.SearchParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "types", value.data());
                    _typesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "types", value.data());
                    _typesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "types", value.data());
                    _typesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for types
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchParams.Fields#types
     */
    public SearchParams setTypes(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field types of com.linkedin.metadata.recommendation.SearchParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "types", value.data());
            _typesField = value;
        }
        return this;
    }

    /**
     * Existence checker for query
     * 
     * @see SearchParams.Fields#query
     */
    public boolean hasQuery() {
        if (_queryField!= null) {
            return true;
        }
        return super._map.containsKey("query");
    }

    /**
     * Remover for query
     * 
     * @see SearchParams.Fields#query
     */
    public void removeQuery() {
        super._map.remove("query");
    }

    /**
     * Getter for query
     * 
     * @see SearchParams.Fields#query
     */
    @Nullable
    public String getQuery(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getQuery();
            case DEFAULT:
            case NULL:
                if (_queryField!= null) {
                    return _queryField;
                } else {
                    Object __rawValue = super._map.get("query");
                    _queryField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _queryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for query
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchParams.Fields#query
     */
    @Nonnull
    public String getQuery() {
        if (_queryField!= null) {
            return _queryField;
        } else {
            Object __rawValue = super._map.get("query");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("query");
            }
            _queryField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _queryField;
        }
    }

    /**
     * Setter for query
     * 
     * @see SearchParams.Fields#query
     */
    public SearchParams setQuery(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field query of com.linkedin.metadata.recommendation.SearchParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "query", value);
                    _queryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for query
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchParams.Fields#query
     */
    public SearchParams setQuery(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field query of com.linkedin.metadata.recommendation.SearchParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "query", value);
            _queryField = value;
        }
        return this;
    }

    /**
     * Existence checker for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public boolean hasFilters() {
        if (_filtersField!= null) {
            return true;
        }
        return super._map.containsKey("filters");
    }

    /**
     * Remover for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public void removeFilters() {
        super._map.remove("filters");
    }

    /**
     * Getter for filters
     * 
     * @see SearchParams.Fields#filters
     */
    @Nullable
    public CriterionArray getFilters(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getFilters();
            case NULL:
                if (_filtersField!= null) {
                    return _filtersField;
                } else {
                    Object __rawValue = super._map.get("filters");
                    _filtersField = ((__rawValue == null)?null:new CriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _filtersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for filters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchParams.Fields#filters
     */
    @Nonnull
    public CriterionArray getFilters() {
        if (_filtersField!= null) {
            return _filtersField;
        } else {
            Object __rawValue = super._map.get("filters");
            if (__rawValue == null) {
                return DEFAULT_Filters;
            }
            _filtersField = ((__rawValue == null)?null:new CriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _filtersField;
        }
    }

    /**
     * Setter for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public SearchParams setFilters(
        @Nullable
        CriterionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field filters of com.linkedin.metadata.recommendation.SearchParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filters", value.data());
                    _filtersField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filters", value.data());
                    _filtersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filters", value.data());
                    _filtersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchParams.Fields#filters
     */
    public SearchParams setFilters(
        @Nonnull
        CriterionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filters of com.linkedin.metadata.recommendation.SearchParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filters", value.data());
            _filtersField = value;
        }
        return this;
    }

    @Override
    public SearchParams clone()
        throws CloneNotSupportedException
    {
        SearchParams __clone = ((SearchParams) super.clone());
        __clone.__changeListener = new SearchParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SearchParams copy()
        throws CloneNotSupportedException
    {
        SearchParams __copy = ((SearchParams) super.copy());
        __copy._typesField = null;
        __copy._queryField = null;
        __copy._filtersField = null;
        __copy.__changeListener = new SearchParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SearchParams __objectRef;

        private ChangeListener(SearchParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "types":
                    __objectRef._typesField = null;
                    break;
                case "query":
                    __objectRef._queryField = null;
                    break;
                case "filters":
                    __objectRef._filtersField = null;
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
         * Entity types to be searched. If this is not provided, all entities will be searched.
         * 
         */
        public PathSpec types() {
            return new PathSpec(getPathComponents(), "types");
        }

        /**
         * Entity types to be searched. If this is not provided, all entities will be searched.
         * 
         */
        public PathSpec types(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "types");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Search query
         * 
         */
        public PathSpec query() {
            return new PathSpec(getPathComponents(), "query");
        }

        /**
         * Filters
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields filters() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "filters");
        }

        /**
         * Filters
         * 
         */
        public PathSpec filters(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "filters");
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

        private com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask _filtersMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Entity types to be searched. If this is not provided, all entities will be searched.
         * 
         */
        public SearchParams.ProjectionMask withTypes() {
            getDataMap().put("types", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Entity types to be searched. If this is not provided, all entities will be searched.
         * 
         */
        public SearchParams.ProjectionMask withTypes(Integer start, Integer count) {
            getDataMap().put("types", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("types").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("types").put("$count", count);
            }
            return this;
        }

        /**
         * Search query
         * 
         */
        public SearchParams.ProjectionMask withQuery() {
            getDataMap().put("query", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Filters
         * 
         */
        public SearchParams.ProjectionMask withFilters(Function<com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask> nestedMask) {
            _filtersMask = nestedMask.apply(((_filtersMask == null)?CriterionArray.createMask():_filtersMask));
            getDataMap().put("filters", _filtersMask.getDataMap());
            return this;
        }

        /**
         * Filters
         * 
         */
        public SearchParams.ProjectionMask withFilters() {
            _filtersMask = null;
            getDataMap().put("filters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Filters
         * 
         */
        public SearchParams.ProjectionMask withFilters(Function<com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _filtersMask = nestedMask.apply(((_filtersMask == null)?CriterionArray.createMask():_filtersMask));
            getDataMap().put("filters", _filtersMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("filters").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("filters").put("$count", count);
            }
            return this;
        }

        /**
         * Filters
         * 
         */
        public SearchParams.ProjectionMask withFilters(Integer start, Integer count) {
            _filtersMask = null;
            getDataMap().put("filters", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("filters").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("filters").put("$count", count);
            }
            return this;
        }

    }

}
