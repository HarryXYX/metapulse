
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
import com.linkedin.data.template.SetMode;


/**
 * Parameters required to render a recommendation of a given type
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationParams.pdl.")
public class RecommendationParams
    extends RecordTemplate
{

    private final static RecommendationParams.Fields _fields = new RecommendationParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}", SchemaFormatType.PDL));
    private SearchParams _searchParamsField = null;
    private EntityProfileParams _entityProfileParamsField = null;
    private ContentParams _contentParamsField = null;
    private RecommendationParams.ChangeListener __changeListener = new RecommendationParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SearchParams = SCHEMA.getField("searchParams");
    private final static RecordDataSchema.Field FIELD_EntityProfileParams = SCHEMA.getField("entityProfileParams");
    private final static RecordDataSchema.Field FIELD_ContentParams = SCHEMA.getField("contentParams");

    public RecommendationParams() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public RecommendationParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RecommendationParams.Fields fields() {
        return _fields;
    }

    public static RecommendationParams.ProjectionMask createMask() {
        return new RecommendationParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public boolean hasSearchParams() {
        if (_searchParamsField!= null) {
            return true;
        }
        return super._map.containsKey("searchParams");
    }

    /**
     * Remover for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public void removeSearchParams() {
        super._map.remove("searchParams");
    }

    /**
     * Getter for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    @Nullable
    public SearchParams getSearchParams(GetMode mode) {
        return getSearchParams();
    }

    /**
     * Getter for searchParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationParams.Fields#searchParams
     */
    @Nullable
    public SearchParams getSearchParams() {
        if (_searchParamsField!= null) {
            return _searchParamsField;
        } else {
            Object __rawValue = super._map.get("searchParams");
            _searchParamsField = ((__rawValue == null)?null:new SearchParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _searchParamsField;
        }
    }

    /**
     * Setter for searchParams
     * 
     * @see RecommendationParams.Fields#searchParams
     */
    public RecommendationParams setSearchParams(
        @Nullable
        SearchParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSearchParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSearchParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "searchParams", value.data());
                    _searchParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "searchParams", value.data());
                    _searchParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for searchParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationParams.Fields#searchParams
     */
    public RecommendationParams setSearchParams(
        @Nonnull
        SearchParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field searchParams of com.linkedin.metadata.recommendation.RecommendationParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "searchParams", value.data());
            _searchParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public boolean hasEntityProfileParams() {
        if (_entityProfileParamsField!= null) {
            return true;
        }
        return super._map.containsKey("entityProfileParams");
    }

    /**
     * Remover for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public void removeEntityProfileParams() {
        super._map.remove("entityProfileParams");
    }

    /**
     * Getter for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    @Nullable
    public EntityProfileParams getEntityProfileParams(GetMode mode) {
        return getEntityProfileParams();
    }

    /**
     * Getter for entityProfileParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationParams.Fields#entityProfileParams
     */
    @Nullable
    public EntityProfileParams getEntityProfileParams() {
        if (_entityProfileParamsField!= null) {
            return _entityProfileParamsField;
        } else {
            Object __rawValue = super._map.get("entityProfileParams");
            _entityProfileParamsField = ((__rawValue == null)?null:new EntityProfileParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _entityProfileParamsField;
        }
    }

    /**
     * Setter for entityProfileParams
     * 
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public RecommendationParams setEntityProfileParams(
        @Nullable
        EntityProfileParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityProfileParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityProfileParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityProfileParams", value.data());
                    _entityProfileParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityProfileParams", value.data());
                    _entityProfileParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityProfileParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationParams.Fields#entityProfileParams
     */
    public RecommendationParams setEntityProfileParams(
        @Nonnull
        EntityProfileParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityProfileParams of com.linkedin.metadata.recommendation.RecommendationParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityProfileParams", value.data());
            _entityProfileParamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public boolean hasContentParams() {
        if (_contentParamsField!= null) {
            return true;
        }
        return super._map.containsKey("contentParams");
    }

    /**
     * Remover for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public void removeContentParams() {
        super._map.remove("contentParams");
    }

    /**
     * Getter for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    @Nullable
    public ContentParams getContentParams(GetMode mode) {
        return getContentParams();
    }

    /**
     * Getter for contentParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationParams.Fields#contentParams
     */
    @Nullable
    public ContentParams getContentParams() {
        if (_contentParamsField!= null) {
            return _contentParamsField;
        } else {
            Object __rawValue = super._map.get("contentParams");
            _contentParamsField = ((__rawValue == null)?null:new ContentParams(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _contentParamsField;
        }
    }

    /**
     * Setter for contentParams
     * 
     * @see RecommendationParams.Fields#contentParams
     */
    public RecommendationParams setContentParams(
        @Nullable
        ContentParams value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContentParams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContentParams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "contentParams", value.data());
                    _contentParamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "contentParams", value.data());
                    _contentParamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for contentParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationParams.Fields#contentParams
     */
    public RecommendationParams setContentParams(
        @Nonnull
        ContentParams value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field contentParams of com.linkedin.metadata.recommendation.RecommendationParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "contentParams", value.data());
            _contentParamsField = value;
        }
        return this;
    }

    @Override
    public RecommendationParams clone()
        throws CloneNotSupportedException
    {
        RecommendationParams __clone = ((RecommendationParams) super.clone());
        __clone.__changeListener = new RecommendationParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RecommendationParams copy()
        throws CloneNotSupportedException
    {
        RecommendationParams __copy = ((RecommendationParams) super.copy());
        __copy._entityProfileParamsField = null;
        __copy._contentParamsField = null;
        __copy._searchParamsField = null;
        __copy.__changeListener = new RecommendationParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RecommendationParams __objectRef;

        private ChangeListener(RecommendationParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "entityProfileParams":
                    __objectRef._entityProfileParamsField = null;
                    break;
                case "contentParams":
                    __objectRef._contentParamsField = null;
                    break;
                case "searchParams":
                    __objectRef._searchParamsField = null;
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
         * Context to define the search recommendations
         * 
         */
        public com.linkedin.metadata.recommendation.SearchParams.Fields searchParams() {
            return new com.linkedin.metadata.recommendation.SearchParams.Fields(getPathComponents(), "searchParams");
        }

        /**
         * Context to define the entity profile page
         * 
         */
        public com.linkedin.metadata.recommendation.EntityProfileParams.Fields entityProfileParams() {
            return new com.linkedin.metadata.recommendation.EntityProfileParams.Fields(getPathComponents(), "entityProfileParams");
        }

        /**
         * Context about the recommendation
         * 
         */
        public com.linkedin.metadata.recommendation.ContentParams.Fields contentParams() {
            return new com.linkedin.metadata.recommendation.ContentParams.Fields(getPathComponents(), "contentParams");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.recommendation.SearchParams.ProjectionMask _searchParamsMask;
        private com.linkedin.metadata.recommendation.EntityProfileParams.ProjectionMask _entityProfileParamsMask;
        private com.linkedin.metadata.recommendation.ContentParams.ProjectionMask _contentParamsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Context to define the search recommendations
         * 
         */
        public RecommendationParams.ProjectionMask withSearchParams(Function<com.linkedin.metadata.recommendation.SearchParams.ProjectionMask, com.linkedin.metadata.recommendation.SearchParams.ProjectionMask> nestedMask) {
            _searchParamsMask = nestedMask.apply(((_searchParamsMask == null)?SearchParams.createMask():_searchParamsMask));
            getDataMap().put("searchParams", _searchParamsMask.getDataMap());
            return this;
        }

        /**
         * Context to define the search recommendations
         * 
         */
        public RecommendationParams.ProjectionMask withSearchParams() {
            _searchParamsMask = null;
            getDataMap().put("searchParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Context to define the entity profile page
         * 
         */
        public RecommendationParams.ProjectionMask withEntityProfileParams(Function<com.linkedin.metadata.recommendation.EntityProfileParams.ProjectionMask, com.linkedin.metadata.recommendation.EntityProfileParams.ProjectionMask> nestedMask) {
            _entityProfileParamsMask = nestedMask.apply(((_entityProfileParamsMask == null)?EntityProfileParams.createMask():_entityProfileParamsMask));
            getDataMap().put("entityProfileParams", _entityProfileParamsMask.getDataMap());
            return this;
        }

        /**
         * Context to define the entity profile page
         * 
         */
        public RecommendationParams.ProjectionMask withEntityProfileParams() {
            _entityProfileParamsMask = null;
            getDataMap().put("entityProfileParams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Context about the recommendation
         * 
         */
        public RecommendationParams.ProjectionMask withContentParams(Function<com.linkedin.metadata.recommendation.ContentParams.ProjectionMask, com.linkedin.metadata.recommendation.ContentParams.ProjectionMask> nestedMask) {
            _contentParamsMask = nestedMask.apply(((_contentParamsMask == null)?ContentParams.createMask():_contentParamsMask));
            getDataMap().put("contentParams", _contentParamsMask.getDataMap());
            return this;
        }

        /**
         * Context about the recommendation
         * 
         */
        public RecommendationParams.ProjectionMask withContentParams() {
            _contentParamsMask = null;
            getDataMap().put("contentParams", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
