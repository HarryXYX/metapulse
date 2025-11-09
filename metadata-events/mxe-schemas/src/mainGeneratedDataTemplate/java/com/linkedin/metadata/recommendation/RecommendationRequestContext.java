
package com.linkedin.metadata.recommendation;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Context that defines the page requesting recommendations
 * i.e. for search pages, the query/filters. for entity pages, the entity urn and tab
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationRequestContext.pdl.")
public class RecommendationRequestContext
    extends RecordTemplate
{

    private final static RecommendationRequestContext.Fields _fields = new RecommendationRequestContext.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Context that defines the page requesting recommendations\ni.e. for search pages, the query/filters. for entity pages, the entity urn and tab*/record RecommendationRequestContext{/**Scenario in which the recommendations will be displayed*/scenario:/**Type of the scenario requesting recommendation*/enum ScenarioType{/**Recommendations to show on the users home page*/HOME/**Recommendations to show on the search results page*/SEARCH_RESULTS/**Recommendations to show on an Entity Profile page*/ENTITY_PROFILE/**Recommendations to show on the search bar when clicked*/SEARCH_BAR}/**Additional context for defining the search page requesting recommendations*/searchRequestContext:optional/**Context that defines a search page requesting recommendations*/record SearchRequestContext{/**Search query*/query:string/**filters applied to search results*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}}]=[]}/**Additional context for defining the entity page requesting recommendations*/entityRequestContext:optional/**Context that defines an entity page requesting recommendations*/record EntityRequestContext{/**Type of the entity being displayed*/type:string/**Urn of the entity being displayed*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}", SchemaFormatType.PDL));
    private ScenarioType _scenarioField = null;
    private SearchRequestContext _searchRequestContextField = null;
    private EntityRequestContext _entityRequestContextField = null;
    private RecommendationRequestContext.ChangeListener __changeListener = new RecommendationRequestContext.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Scenario = SCHEMA.getField("scenario");
    private final static RecordDataSchema.Field FIELD_SearchRequestContext = SCHEMA.getField("searchRequestContext");
    private final static RecordDataSchema.Field FIELD_EntityRequestContext = SCHEMA.getField("entityRequestContext");

    public RecommendationRequestContext() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public RecommendationRequestContext(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RecommendationRequestContext.Fields fields() {
        return _fields;
    }

    public static RecommendationRequestContext.ProjectionMask createMask() {
        return new RecommendationRequestContext.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public boolean hasScenario() {
        if (_scenarioField!= null) {
            return true;
        }
        return super._map.containsKey("scenario");
    }

    /**
     * Remover for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public void removeScenario() {
        super._map.remove("scenario");
    }

    /**
     * Getter for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    @Nullable
    public ScenarioType getScenario(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getScenario();
            case DEFAULT:
            case NULL:
                if (_scenarioField!= null) {
                    return _scenarioField;
                } else {
                    Object __rawValue = super._map.get("scenario");
                    _scenarioField = DataTemplateUtil.coerceEnumOutput(__rawValue, ScenarioType.class, ScenarioType.$UNKNOWN);
                    return _scenarioField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for scenario
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationRequestContext.Fields#scenario
     */
    @Nonnull
    public ScenarioType getScenario() {
        if (_scenarioField!= null) {
            return _scenarioField;
        } else {
            Object __rawValue = super._map.get("scenario");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("scenario");
            }
            _scenarioField = DataTemplateUtil.coerceEnumOutput(__rawValue, ScenarioType.class, ScenarioType.$UNKNOWN);
            return _scenarioField;
        }
    }

    /**
     * Setter for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public RecommendationRequestContext setScenario(
        @Nullable
        ScenarioType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScenario(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field scenario of com.linkedin.metadata.recommendation.RecommendationRequestContext");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
                    _scenarioField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScenario();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
                    _scenarioField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
                    _scenarioField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for scenario
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationRequestContext.Fields#scenario
     */
    public RecommendationRequestContext setScenario(
        @Nonnull
        ScenarioType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scenario of com.linkedin.metadata.recommendation.RecommendationRequestContext to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scenario", value.name());
            _scenarioField = value;
        }
        return this;
    }

    /**
     * Existence checker for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public boolean hasSearchRequestContext() {
        if (_searchRequestContextField!= null) {
            return true;
        }
        return super._map.containsKey("searchRequestContext");
    }

    /**
     * Remover for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public void removeSearchRequestContext() {
        super._map.remove("searchRequestContext");
    }

    /**
     * Getter for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    @Nullable
    public SearchRequestContext getSearchRequestContext(GetMode mode) {
        return getSearchRequestContext();
    }

    /**
     * Getter for searchRequestContext
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    @Nullable
    public SearchRequestContext getSearchRequestContext() {
        if (_searchRequestContextField!= null) {
            return _searchRequestContextField;
        } else {
            Object __rawValue = super._map.get("searchRequestContext");
            _searchRequestContextField = ((__rawValue == null)?null:new SearchRequestContext(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _searchRequestContextField;
        }
    }

    /**
     * Setter for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public RecommendationRequestContext setSearchRequestContext(
        @Nullable
        SearchRequestContext value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSearchRequestContext(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSearchRequestContext();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "searchRequestContext", value.data());
                    _searchRequestContextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "searchRequestContext", value.data());
                    _searchRequestContextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for searchRequestContext
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public RecommendationRequestContext setSearchRequestContext(
        @Nonnull
        SearchRequestContext value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field searchRequestContext of com.linkedin.metadata.recommendation.RecommendationRequestContext to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "searchRequestContext", value.data());
            _searchRequestContextField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public boolean hasEntityRequestContext() {
        if (_entityRequestContextField!= null) {
            return true;
        }
        return super._map.containsKey("entityRequestContext");
    }

    /**
     * Remover for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public void removeEntityRequestContext() {
        super._map.remove("entityRequestContext");
    }

    /**
     * Getter for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    @Nullable
    public EntityRequestContext getEntityRequestContext(GetMode mode) {
        return getEntityRequestContext();
    }

    /**
     * Getter for entityRequestContext
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    @Nullable
    public EntityRequestContext getEntityRequestContext() {
        if (_entityRequestContextField!= null) {
            return _entityRequestContextField;
        } else {
            Object __rawValue = super._map.get("entityRequestContext");
            _entityRequestContextField = ((__rawValue == null)?null:new EntityRequestContext(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _entityRequestContextField;
        }
    }

    /**
     * Setter for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public RecommendationRequestContext setEntityRequestContext(
        @Nullable
        EntityRequestContext value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityRequestContext(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityRequestContext();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityRequestContext", value.data());
                    _entityRequestContextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityRequestContext", value.data());
                    _entityRequestContextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityRequestContext
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public RecommendationRequestContext setEntityRequestContext(
        @Nonnull
        EntityRequestContext value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityRequestContext of com.linkedin.metadata.recommendation.RecommendationRequestContext to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityRequestContext", value.data());
            _entityRequestContextField = value;
        }
        return this;
    }

    @Override
    public RecommendationRequestContext clone()
        throws CloneNotSupportedException
    {
        RecommendationRequestContext __clone = ((RecommendationRequestContext) super.clone());
        __clone.__changeListener = new RecommendationRequestContext.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RecommendationRequestContext copy()
        throws CloneNotSupportedException
    {
        RecommendationRequestContext __copy = ((RecommendationRequestContext) super.copy());
        __copy._scenarioField = null;
        __copy._searchRequestContextField = null;
        __copy._entityRequestContextField = null;
        __copy.__changeListener = new RecommendationRequestContext.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RecommendationRequestContext __objectRef;

        private ChangeListener(RecommendationRequestContext reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "scenario":
                    __objectRef._scenarioField = null;
                    break;
                case "searchRequestContext":
                    __objectRef._searchRequestContextField = null;
                    break;
                case "entityRequestContext":
                    __objectRef._entityRequestContextField = null;
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
         * Scenario in which the recommendations will be displayed
         * 
         */
        public PathSpec scenario() {
            return new PathSpec(getPathComponents(), "scenario");
        }

        /**
         * Additional context for defining the search page requesting recommendations
         * 
         */
        public com.linkedin.metadata.recommendation.SearchRequestContext.Fields searchRequestContext() {
            return new com.linkedin.metadata.recommendation.SearchRequestContext.Fields(getPathComponents(), "searchRequestContext");
        }

        /**
         * Additional context for defining the entity page requesting recommendations
         * 
         */
        public com.linkedin.metadata.recommendation.EntityRequestContext.Fields entityRequestContext() {
            return new com.linkedin.metadata.recommendation.EntityRequestContext.Fields(getPathComponents(), "entityRequestContext");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.recommendation.SearchRequestContext.ProjectionMask _searchRequestContextMask;
        private com.linkedin.metadata.recommendation.EntityRequestContext.ProjectionMask _entityRequestContextMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Scenario in which the recommendations will be displayed
         * 
         */
        public RecommendationRequestContext.ProjectionMask withScenario() {
            getDataMap().put("scenario", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional context for defining the search page requesting recommendations
         * 
         */
        public RecommendationRequestContext.ProjectionMask withSearchRequestContext(Function<com.linkedin.metadata.recommendation.SearchRequestContext.ProjectionMask, com.linkedin.metadata.recommendation.SearchRequestContext.ProjectionMask> nestedMask) {
            _searchRequestContextMask = nestedMask.apply(((_searchRequestContextMask == null)?SearchRequestContext.createMask():_searchRequestContextMask));
            getDataMap().put("searchRequestContext", _searchRequestContextMask.getDataMap());
            return this;
        }

        /**
         * Additional context for defining the search page requesting recommendations
         * 
         */
        public RecommendationRequestContext.ProjectionMask withSearchRequestContext() {
            _searchRequestContextMask = null;
            getDataMap().put("searchRequestContext", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional context for defining the entity page requesting recommendations
         * 
         */
        public RecommendationRequestContext.ProjectionMask withEntityRequestContext(Function<com.linkedin.metadata.recommendation.EntityRequestContext.ProjectionMask, com.linkedin.metadata.recommendation.EntityRequestContext.ProjectionMask> nestedMask) {
            _entityRequestContextMask = nestedMask.apply(((_entityRequestContextMask == null)?EntityRequestContext.createMask():_entityRequestContextMask));
            getDataMap().put("entityRequestContext", _entityRequestContextMask.getDataMap());
            return this;
        }

        /**
         * Additional context for defining the entity page requesting recommendations
         * 
         */
        public RecommendationRequestContext.ProjectionMask withEntityRequestContext() {
            _entityRequestContextMask = null;
            getDataMap().put("entityRequestContext", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
