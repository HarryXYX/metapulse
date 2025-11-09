
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DoubleMap;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringMap;


/**
 * The model for each entity returned by the search query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchEntity.pdl.")
public class SearchEntity
    extends RecordTemplate
{

    private final static SearchEntity.Fields _fields = new SearchEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]score:optional double/**A list of the the restricted aspects on the entity.\nIf the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.*/restrictedAspects:optional array[string]/**Extra fields from the search document based on what is requested in the search request*/extraFields:optional map[string,string]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _entityField = null;
    private MatchedFieldArray _matchedFieldsField = null;
    private DoubleMap _featuresField = null;
    private Double _scoreField = null;
    private StringArray _restrictedAspectsField = null;
    private StringMap _extraFieldsField = null;
    private SearchEntity.ChangeListener __changeListener = new SearchEntity.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_MatchedFields = SCHEMA.getField("matchedFields");
    private final static MatchedFieldArray DEFAULT_MatchedFields;
    private final static RecordDataSchema.Field FIELD_Features = SCHEMA.getField("features");
    private final static RecordDataSchema.Field FIELD_Score = SCHEMA.getField("score");
    private final static RecordDataSchema.Field FIELD_RestrictedAspects = SCHEMA.getField("restrictedAspects");
    private final static RecordDataSchema.Field FIELD_ExtraFields = SCHEMA.getField("extraFields");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_MatchedFields = ((FIELD_MatchedFields.getDefault() == null)?null:new MatchedFieldArray(DataTemplateUtil.castOrThrow(FIELD_MatchedFields.getDefault(), DataList.class)));
    }

    public SearchEntity() {
        super(new DataMap(8, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public SearchEntity(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SearchEntity.Fields fields() {
        return _fields;
    }

    public static SearchEntity.ProjectionMask createMask() {
        return new SearchEntity.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntity();
            case DEFAULT:
            case NULL:
                if (_entityField!= null) {
                    return _entityField;
                } else {
                    Object __rawValue = super._map.get("entity");
                    _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchEntity.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entity");
            }
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see SearchEntity.Fields#entity
     */
    public SearchEntity setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.metadata.search.SearchEntity");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#entity
     */
    public SearchEntity setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.search.SearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public boolean hasMatchedFields() {
        if (_matchedFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("matchedFields");
    }

    /**
     * Remover for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public void removeMatchedFields() {
        super._map.remove("matchedFields");
    }

    /**
     * Getter for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    @Nullable
    public MatchedFieldArray getMatchedFields(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getMatchedFields();
            case NULL:
                if (_matchedFieldsField!= null) {
                    return _matchedFieldsField;
                } else {
                    Object __rawValue = super._map.get("matchedFields");
                    _matchedFieldsField = ((__rawValue == null)?null:new MatchedFieldArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _matchedFieldsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for matchedFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchEntity.Fields#matchedFields
     */
    @Nonnull
    public MatchedFieldArray getMatchedFields() {
        if (_matchedFieldsField!= null) {
            return _matchedFieldsField;
        } else {
            Object __rawValue = super._map.get("matchedFields");
            if (__rawValue == null) {
                return DEFAULT_MatchedFields;
            }
            _matchedFieldsField = ((__rawValue == null)?null:new MatchedFieldArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _matchedFieldsField;
        }
    }

    /**
     * Setter for matchedFields
     * 
     * @see SearchEntity.Fields#matchedFields
     */
    public SearchEntity setMatchedFields(
        @Nullable
        MatchedFieldArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMatchedFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field matchedFields of com.linkedin.metadata.search.SearchEntity");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "matchedFields", value.data());
                    _matchedFieldsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMatchedFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "matchedFields", value.data());
                    _matchedFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "matchedFields", value.data());
                    _matchedFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for matchedFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#matchedFields
     */
    public SearchEntity setMatchedFields(
        @Nonnull
        MatchedFieldArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field matchedFields of com.linkedin.metadata.search.SearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "matchedFields", value.data());
            _matchedFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for features
     * 
     * @see SearchEntity.Fields#features
     */
    public boolean hasFeatures() {
        if (_featuresField!= null) {
            return true;
        }
        return super._map.containsKey("features");
    }

    /**
     * Remover for features
     * 
     * @see SearchEntity.Fields#features
     */
    public void removeFeatures() {
        super._map.remove("features");
    }

    /**
     * Getter for features
     * 
     * @see SearchEntity.Fields#features
     */
    @Nullable
    public DoubleMap getFeatures(GetMode mode) {
        return getFeatures();
    }

    /**
     * Getter for features
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchEntity.Fields#features
     */
    @Nullable
    public DoubleMap getFeatures() {
        if (_featuresField!= null) {
            return _featuresField;
        } else {
            Object __rawValue = super._map.get("features");
            _featuresField = ((__rawValue == null)?null:new DoubleMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _featuresField;
        }
    }

    /**
     * Setter for features
     * 
     * @see SearchEntity.Fields#features
     */
    public SearchEntity setFeatures(
        @Nullable
        DoubleMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFeatures(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFeatures();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "features", value.data());
                    _featuresField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "features", value.data());
                    _featuresField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for features
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#features
     */
    public SearchEntity setFeatures(
        @Nonnull
        DoubleMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field features of com.linkedin.metadata.search.SearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "features", value.data());
            _featuresField = value;
        }
        return this;
    }

    /**
     * Existence checker for score
     * 
     * @see SearchEntity.Fields#score
     */
    public boolean hasScore() {
        if (_scoreField!= null) {
            return true;
        }
        return super._map.containsKey("score");
    }

    /**
     * Remover for score
     * 
     * @see SearchEntity.Fields#score
     */
    public void removeScore() {
        super._map.remove("score");
    }

    /**
     * Getter for score
     * 
     * @see SearchEntity.Fields#score
     */
    @Nullable
    public Double getScore(GetMode mode) {
        return getScore();
    }

    /**
     * Getter for score
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchEntity.Fields#score
     */
    @Nullable
    public Double getScore() {
        if (_scoreField!= null) {
            return _scoreField;
        } else {
            Object __rawValue = super._map.get("score");
            _scoreField = DataTemplateUtil.coerceDoubleOutput(__rawValue);
            return _scoreField;
        }
    }

    /**
     * Setter for score
     * 
     * @see SearchEntity.Fields#score
     */
    public SearchEntity setScore(
        @Nullable
        Double value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScore(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScore();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceDoubleInput(value));
                    _scoreField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceDoubleInput(value));
                    _scoreField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for score
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#score
     */
    public SearchEntity setScore(
        @Nonnull
        Double value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field score of com.linkedin.metadata.search.SearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceDoubleInput(value));
            _scoreField = value;
        }
        return this;
    }

    /**
     * Setter for score
     * 
     * @see SearchEntity.Fields#score
     */
    public SearchEntity setScore(double value) {
        CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceDoubleInput(value));
        _scoreField = value;
        return this;
    }

    /**
     * Existence checker for restrictedAspects
     * 
     * @see SearchEntity.Fields#restrictedAspects
     */
    public boolean hasRestrictedAspects() {
        if (_restrictedAspectsField!= null) {
            return true;
        }
        return super._map.containsKey("restrictedAspects");
    }

    /**
     * Remover for restrictedAspects
     * 
     * @see SearchEntity.Fields#restrictedAspects
     */
    public void removeRestrictedAspects() {
        super._map.remove("restrictedAspects");
    }

    /**
     * Getter for restrictedAspects
     * 
     * @see SearchEntity.Fields#restrictedAspects
     */
    @Nullable
    public StringArray getRestrictedAspects(GetMode mode) {
        return getRestrictedAspects();
    }

    /**
     * Getter for restrictedAspects
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchEntity.Fields#restrictedAspects
     */
    @Nullable
    public StringArray getRestrictedAspects() {
        if (_restrictedAspectsField!= null) {
            return _restrictedAspectsField;
        } else {
            Object __rawValue = super._map.get("restrictedAspects");
            _restrictedAspectsField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _restrictedAspectsField;
        }
    }

    /**
     * Setter for restrictedAspects
     * 
     * @see SearchEntity.Fields#restrictedAspects
     */
    public SearchEntity setRestrictedAspects(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRestrictedAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRestrictedAspects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "restrictedAspects", value.data());
                    _restrictedAspectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "restrictedAspects", value.data());
                    _restrictedAspectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for restrictedAspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#restrictedAspects
     */
    public SearchEntity setRestrictedAspects(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field restrictedAspects of com.linkedin.metadata.search.SearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "restrictedAspects", value.data());
            _restrictedAspectsField = value;
        }
        return this;
    }

    /**
     * Existence checker for extraFields
     * 
     * @see SearchEntity.Fields#extraFields
     */
    public boolean hasExtraFields() {
        if (_extraFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("extraFields");
    }

    /**
     * Remover for extraFields
     * 
     * @see SearchEntity.Fields#extraFields
     */
    public void removeExtraFields() {
        super._map.remove("extraFields");
    }

    /**
     * Getter for extraFields
     * 
     * @see SearchEntity.Fields#extraFields
     */
    @Nullable
    public StringMap getExtraFields(GetMode mode) {
        return getExtraFields();
    }

    /**
     * Getter for extraFields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SearchEntity.Fields#extraFields
     */
    @Nullable
    public StringMap getExtraFields() {
        if (_extraFieldsField!= null) {
            return _extraFieldsField;
        } else {
            Object __rawValue = super._map.get("extraFields");
            _extraFieldsField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _extraFieldsField;
        }
    }

    /**
     * Setter for extraFields
     * 
     * @see SearchEntity.Fields#extraFields
     */
    public SearchEntity setExtraFields(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExtraFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExtraFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "extraFields", value.data());
                    _extraFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "extraFields", value.data());
                    _extraFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for extraFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchEntity.Fields#extraFields
     */
    public SearchEntity setExtraFields(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field extraFields of com.linkedin.metadata.search.SearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "extraFields", value.data());
            _extraFieldsField = value;
        }
        return this;
    }

    @Override
    public SearchEntity clone()
        throws CloneNotSupportedException
    {
        SearchEntity __clone = ((SearchEntity) super.clone());
        __clone.__changeListener = new SearchEntity.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SearchEntity copy()
        throws CloneNotSupportedException
    {
        SearchEntity __copy = ((SearchEntity) super.copy());
        __copy._restrictedAspectsField = null;
        __copy._featuresField = null;
        __copy._scoreField = null;
        __copy._matchedFieldsField = null;
        __copy._entityField = null;
        __copy._extraFieldsField = null;
        __copy.__changeListener = new SearchEntity.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SearchEntity __objectRef;

        private ChangeListener(SearchEntity reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "restrictedAspects":
                    __objectRef._restrictedAspectsField = null;
                    break;
                case "features":
                    __objectRef._featuresField = null;
                    break;
                case "score":
                    __objectRef._scoreField = null;
                    break;
                case "matchedFields":
                    __objectRef._matchedFieldsField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
                    break;
                case "extraFields":
                    __objectRef._extraFieldsField = null;
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
         * Urn of the entity being returned
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Matched field name and values
         * 
         */
        public com.linkedin.metadata.search.MatchedFieldArray.Fields matchedFields() {
            return new com.linkedin.metadata.search.MatchedFieldArray.Fields(getPathComponents(), "matchedFields");
        }

        /**
         * Matched field name and values
         * 
         */
        public PathSpec matchedFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "matchedFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public PathSpec features() {
            return new PathSpec(getPathComponents(), "features");
        }

        public PathSpec score() {
            return new PathSpec(getPathComponents(), "score");
        }

        /**
         * A list of the the restricted aspects on the entity.
         * If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
         * 
         */
        public PathSpec restrictedAspects() {
            return new PathSpec(getPathComponents(), "restrictedAspects");
        }

        /**
         * A list of the the restricted aspects on the entity.
         * If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
         * 
         */
        public PathSpec restrictedAspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "restrictedAspects");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Extra fields from the search document based on what is requested in the search request
         * 
         */
        public PathSpec extraFields() {
            return new PathSpec(getPathComponents(), "extraFields");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask _matchedFieldsMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * Urn of the entity being returned
         * 
         */
        public SearchEntity.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public SearchEntity.ProjectionMask withMatchedFields(Function<com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask, com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask> nestedMask) {
            _matchedFieldsMask = nestedMask.apply(((_matchedFieldsMask == null)?MatchedFieldArray.createMask():_matchedFieldsMask));
            getDataMap().put("matchedFields", _matchedFieldsMask.getDataMap());
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public SearchEntity.ProjectionMask withMatchedFields() {
            _matchedFieldsMask = null;
            getDataMap().put("matchedFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public SearchEntity.ProjectionMask withMatchedFields(Function<com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask, com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _matchedFieldsMask = nestedMask.apply(((_matchedFieldsMask == null)?MatchedFieldArray.createMask():_matchedFieldsMask));
            getDataMap().put("matchedFields", _matchedFieldsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("matchedFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("matchedFields").put("$count", count);
            }
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public SearchEntity.ProjectionMask withMatchedFields(Integer start, Integer count) {
            _matchedFieldsMask = null;
            getDataMap().put("matchedFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("matchedFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("matchedFields").put("$count", count);
            }
            return this;
        }

        public SearchEntity.ProjectionMask withFeatures() {
            getDataMap().put("features", MaskMap.POSITIVE_MASK);
            return this;
        }

        public SearchEntity.ProjectionMask withScore() {
            getDataMap().put("score", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of the the restricted aspects on the entity.
         * If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
         * 
         */
        public SearchEntity.ProjectionMask withRestrictedAspects() {
            getDataMap().put("restrictedAspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of the the restricted aspects on the entity.
         * If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
         * 
         */
        public SearchEntity.ProjectionMask withRestrictedAspects(Integer start, Integer count) {
            getDataMap().put("restrictedAspects", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("restrictedAspects").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("restrictedAspects").put("$count", count);
            }
            return this;
        }

        /**
         * Extra fields from the search document based on what is requested in the search request
         * 
         */
        public SearchEntity.ProjectionMask withExtraFields() {
            getDataMap().put("extraFields", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
