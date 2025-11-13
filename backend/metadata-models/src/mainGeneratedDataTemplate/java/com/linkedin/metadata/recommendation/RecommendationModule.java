
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


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationModule.pdl.")
public class RecommendationModule
    extends RecordTemplate
{

    private final static RecommendationModule.Fields _fields = new RecommendationModule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation,record RecommendationModule{/**Title of the module to display*/title:string/**Unique id of the module being recommended*/moduleId:string/**Type of rendering that defines how the module should be rendered*/renderType:/**Enum that defines how the modules should be rendered.\nThere should be two frontend implementation of large and small modules per type.*/enum RecommendationRenderType{/**Simple list of entities*/ENTITY_NAME_LIST/**List of platforms to search*/PLATFORM_SEARCH_LIST/**Tag search list*/TAG_SEARCH_LIST/**Glossary term search list*/GLOSSARY_TERM_SEARCH_LIST/**A list of recommended searches*/SEARCH_QUERY_LIST/**List of domains to search*/DOMAIN_SEARCH_LIST}/**List of content to display inside the module*/content:array[/**Content to display within each recommendation module*/record RecommendationContent{/**String representation of content*/value:string/**Entity being recommended. Empty if the content being recommended is not an entity*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Additional context required to generate the the recommendation*/params:optional/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:com.linkedin.common.Urn}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}}]}", SchemaFormatType.PDL));
    private String _titleField = null;
    private String _moduleIdField = null;
    private RecommendationRenderType _renderTypeField = null;
    private RecommendationContentArray _contentField = null;
    private RecommendationModule.ChangeListener __changeListener = new RecommendationModule.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_ModuleId = SCHEMA.getField("moduleId");
    private final static RecordDataSchema.Field FIELD_RenderType = SCHEMA.getField("renderType");
    private final static RecordDataSchema.Field FIELD_Content = SCHEMA.getField("content");

    public RecommendationModule() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public RecommendationModule(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RecommendationModule.Fields fields() {
        return _fields;
    }

    public static RecommendationModule.ProjectionMask createMask() {
        return new RecommendationModule.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see RecommendationModule.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTitle();
            case DEFAULT:
            case NULL:
                if (_titleField!= null) {
                    return _titleField;
                } else {
                    Object __rawValue = super._map.get("title");
                    _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _titleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#title
     */
    @Nonnull
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("title");
            }
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public RecommendationModule setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field title of com.linkedin.metadata.recommendation.RecommendationModule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#title
     */
    public RecommendationModule setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.metadata.recommendation.RecommendationModule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public boolean hasModuleId() {
        if (_moduleIdField!= null) {
            return true;
        }
        return super._map.containsKey("moduleId");
    }

    /**
     * Remover for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public void removeModuleId() {
        super._map.remove("moduleId");
    }

    /**
     * Getter for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    @Nullable
    public String getModuleId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getModuleId();
            case DEFAULT:
            case NULL:
                if (_moduleIdField!= null) {
                    return _moduleIdField;
                } else {
                    Object __rawValue = super._map.get("moduleId");
                    _moduleIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _moduleIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for moduleId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#moduleId
     */
    @Nonnull
    public String getModuleId() {
        if (_moduleIdField!= null) {
            return _moduleIdField;
        } else {
            Object __rawValue = super._map.get("moduleId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("moduleId");
            }
            _moduleIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _moduleIdField;
        }
    }

    /**
     * Setter for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public RecommendationModule setModuleId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setModuleId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field moduleId of com.linkedin.metadata.recommendation.RecommendationModule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "moduleId", value);
                    _moduleIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeModuleId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "moduleId", value);
                    _moduleIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "moduleId", value);
                    _moduleIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for moduleId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#moduleId
     */
    public RecommendationModule setModuleId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field moduleId of com.linkedin.metadata.recommendation.RecommendationModule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "moduleId", value);
            _moduleIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public boolean hasRenderType() {
        if (_renderTypeField!= null) {
            return true;
        }
        return super._map.containsKey("renderType");
    }

    /**
     * Remover for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public void removeRenderType() {
        super._map.remove("renderType");
    }

    /**
     * Getter for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    @Nullable
    public RecommendationRenderType getRenderType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRenderType();
            case DEFAULT:
            case NULL:
                if (_renderTypeField!= null) {
                    return _renderTypeField;
                } else {
                    Object __rawValue = super._map.get("renderType");
                    _renderTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, RecommendationRenderType.class, RecommendationRenderType.$UNKNOWN);
                    return _renderTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for renderType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#renderType
     */
    @Nonnull
    public RecommendationRenderType getRenderType() {
        if (_renderTypeField!= null) {
            return _renderTypeField;
        } else {
            Object __rawValue = super._map.get("renderType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("renderType");
            }
            _renderTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, RecommendationRenderType.class, RecommendationRenderType.$UNKNOWN);
            return _renderTypeField;
        }
    }

    /**
     * Setter for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public RecommendationModule setRenderType(
        @Nullable
        RecommendationRenderType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRenderType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field renderType of com.linkedin.metadata.recommendation.RecommendationModule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "renderType", value.name());
                    _renderTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRenderType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "renderType", value.name());
                    _renderTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "renderType", value.name());
                    _renderTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for renderType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#renderType
     */
    public RecommendationModule setRenderType(
        @Nonnull
        RecommendationRenderType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field renderType of com.linkedin.metadata.recommendation.RecommendationModule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "renderType", value.name());
            _renderTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public boolean hasContent() {
        if (_contentField!= null) {
            return true;
        }
        return super._map.containsKey("content");
    }

    /**
     * Remover for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public void removeContent() {
        super._map.remove("content");
    }

    /**
     * Getter for content
     * 
     * @see RecommendationModule.Fields#content
     */
    @Nullable
    public RecommendationContentArray getContent(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getContent();
            case DEFAULT:
            case NULL:
                if (_contentField!= null) {
                    return _contentField;
                } else {
                    Object __rawValue = super._map.get("content");
                    _contentField = ((__rawValue == null)?null:new RecommendationContentArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _contentField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for content
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#content
     */
    @Nonnull
    public RecommendationContentArray getContent() {
        if (_contentField!= null) {
            return _contentField;
        } else {
            Object __rawValue = super._map.get("content");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("content");
            }
            _contentField = ((__rawValue == null)?null:new RecommendationContentArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _contentField;
        }
    }

    /**
     * Setter for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public RecommendationModule setContent(
        @Nullable
        RecommendationContentArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContent(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field content of com.linkedin.metadata.recommendation.RecommendationModule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "content", value.data());
                    _contentField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContent();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "content", value.data());
                    _contentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "content", value.data());
                    _contentField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for content
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#content
     */
    public RecommendationModule setContent(
        @Nonnull
        RecommendationContentArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field content of com.linkedin.metadata.recommendation.RecommendationModule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "content", value.data());
            _contentField = value;
        }
        return this;
    }

    @Override
    public RecommendationModule clone()
        throws CloneNotSupportedException
    {
        RecommendationModule __clone = ((RecommendationModule) super.clone());
        __clone.__changeListener = new RecommendationModule.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RecommendationModule copy()
        throws CloneNotSupportedException
    {
        RecommendationModule __copy = ((RecommendationModule) super.copy());
        __copy._titleField = null;
        __copy._moduleIdField = null;
        __copy._renderTypeField = null;
        __copy._contentField = null;
        __copy.__changeListener = new RecommendationModule.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RecommendationModule __objectRef;

        private ChangeListener(RecommendationModule reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "moduleId":
                    __objectRef._moduleIdField = null;
                    break;
                case "renderType":
                    __objectRef._renderTypeField = null;
                    break;
                case "content":
                    __objectRef._contentField = null;
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
         * Title of the module to display
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Unique id of the module being recommended
         * 
         */
        public PathSpec moduleId() {
            return new PathSpec(getPathComponents(), "moduleId");
        }

        /**
         * Type of rendering that defines how the module should be rendered
         * 
         */
        public PathSpec renderType() {
            return new PathSpec(getPathComponents(), "renderType");
        }

        /**
         * List of content to display inside the module
         * 
         */
        public com.linkedin.metadata.recommendation.RecommendationContentArray.Fields content() {
            return new com.linkedin.metadata.recommendation.RecommendationContentArray.Fields(getPathComponents(), "content");
        }

        /**
         * List of content to display inside the module
         * 
         */
        public PathSpec content(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "content");
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

        private com.linkedin.metadata.recommendation.RecommendationContentArray.ProjectionMask _contentMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Title of the module to display
         * 
         */
        public RecommendationModule.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique id of the module being recommended
         * 
         */
        public RecommendationModule.ProjectionMask withModuleId() {
            getDataMap().put("moduleId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of rendering that defines how the module should be rendered
         * 
         */
        public RecommendationModule.ProjectionMask withRenderType() {
            getDataMap().put("renderType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of content to display inside the module
         * 
         */
        public RecommendationModule.ProjectionMask withContent(Function<com.linkedin.metadata.recommendation.RecommendationContentArray.ProjectionMask, com.linkedin.metadata.recommendation.RecommendationContentArray.ProjectionMask> nestedMask) {
            _contentMask = nestedMask.apply(((_contentMask == null)?RecommendationContentArray.createMask():_contentMask));
            getDataMap().put("content", _contentMask.getDataMap());
            return this;
        }

        /**
         * List of content to display inside the module
         * 
         */
        public RecommendationModule.ProjectionMask withContent() {
            _contentMask = null;
            getDataMap().put("content", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of content to display inside the module
         * 
         */
        public RecommendationModule.ProjectionMask withContent(Function<com.linkedin.metadata.recommendation.RecommendationContentArray.ProjectionMask, com.linkedin.metadata.recommendation.RecommendationContentArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _contentMask = nestedMask.apply(((_contentMask == null)?RecommendationContentArray.createMask():_contentMask));
            getDataMap().put("content", _contentMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("content").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("content").put("$count", count);
            }
            return this;
        }

        /**
         * List of content to display inside the module
         * 
         */
        public RecommendationModule.ProjectionMask withContent(Integer start, Integer count) {
            _contentMask = null;
            getDataMap().put("content", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("content").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("content").put("$count", count);
            }
            return this;
        }

    }

}
