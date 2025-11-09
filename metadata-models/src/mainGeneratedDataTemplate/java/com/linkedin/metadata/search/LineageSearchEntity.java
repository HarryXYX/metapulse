
package com.linkedin.metadata.search;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.common.UrnArrayArray;
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
import com.linkedin.data.template.IntegerArray;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.StringMap;


/**
 * The model for each entity returned by the lineage search query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/LineageSearchEntity.pdl.")
public class LineageSearchEntity
    extends RecordTemplate
{

    private final static LineageSearchEntity.Fields _fields = new LineageSearchEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The model for each entity returned by the lineage search query*/record LineageSearchEntity includes/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]score:optional double/**A list of the the restricted aspects on the entity.\nIf the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.*/restrictedAspects:optional array[string]/**Extra fields from the search document based on what is requested in the search request*/extraFields:optional map[string,string]}{/**Optional list of entities between the source and destination node.\nThere can be multiple paths from the source to the destination.*/paths:array[array[com.linkedin.common.Urn]]=[]/**Optional list of entities between the source and destination node*/@deprecated,path:array[com.linkedin.common.Urn]=[]/**Degree of relationship (number of hops to get to entity)*/@deprecated,degree:int=1/**The degrees of separation (number of hops) between the source and this entity */degrees:array[int]=[]/**Marks an entity as having been explored for as a part of the graph walk*/explored:optional boolean/**Indicates this destination node has additional unexplored child relationships*/truncatedChildren:optional boolean/**Whether this relationship was ignored as a hop while performing the graph walk*/ignoredAsHop:optional boolean}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _entityField = null;
    private MatchedFieldArray _matchedFieldsField = null;
    private DoubleMap _featuresField = null;
    private Double _scoreField = null;
    private StringArray _restrictedAspectsField = null;
    private StringMap _extraFieldsField = null;
    private UrnArrayArray _pathsField = null;
    private UrnArray _pathField = null;
    private Integer _degreeField = null;
    private IntegerArray _degreesField = null;
    private Boolean _exploredField = null;
    private Boolean _truncatedChildrenField = null;
    private Boolean _ignoredAsHopField = null;
    private LineageSearchEntity.ChangeListener __changeListener = new LineageSearchEntity.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_MatchedFields = SCHEMA.getField("matchedFields");
    private final static MatchedFieldArray DEFAULT_MatchedFields;
    private final static RecordDataSchema.Field FIELD_Features = SCHEMA.getField("features");
    private final static RecordDataSchema.Field FIELD_Score = SCHEMA.getField("score");
    private final static RecordDataSchema.Field FIELD_RestrictedAspects = SCHEMA.getField("restrictedAspects");
    private final static RecordDataSchema.Field FIELD_ExtraFields = SCHEMA.getField("extraFields");
    private final static RecordDataSchema.Field FIELD_Paths = SCHEMA.getField("paths");
    private final static UrnArrayArray DEFAULT_Paths;
    private final static RecordDataSchema.Field FIELD_Path = SCHEMA.getField("path");
    private final static UrnArray DEFAULT_Path;
    private final static RecordDataSchema.Field FIELD_Degree = SCHEMA.getField("degree");
    private final static Integer DEFAULT_Degree;
    private final static RecordDataSchema.Field FIELD_Degrees = SCHEMA.getField("degrees");
    private final static IntegerArray DEFAULT_Degrees;
    private final static RecordDataSchema.Field FIELD_Explored = SCHEMA.getField("explored");
    private final static RecordDataSchema.Field FIELD_TruncatedChildren = SCHEMA.getField("truncatedChildren");
    private final static RecordDataSchema.Field FIELD_IgnoredAsHop = SCHEMA.getField("ignoredAsHop");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_MatchedFields = ((FIELD_MatchedFields.getDefault() == null)?null:new MatchedFieldArray(DataTemplateUtil.castOrThrow(FIELD_MatchedFields.getDefault(), DataList.class)));
        DEFAULT_Paths = ((FIELD_Paths.getDefault() == null)?null:new UrnArrayArray(DataTemplateUtil.castOrThrow(FIELD_Paths.getDefault(), DataList.class)));
        DEFAULT_Path = ((FIELD_Path.getDefault() == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(FIELD_Path.getDefault(), DataList.class)));
        DEFAULT_Degree = DataTemplateUtil.coerceIntOutput(FIELD_Degree.getDefault());
        DEFAULT_Degrees = ((FIELD_Degrees.getDefault() == null)?null:new IntegerArray(DataTemplateUtil.castOrThrow(FIELD_Degrees.getDefault(), DataList.class)));
    }

    public LineageSearchEntity() {
        super(new DataMap(), SCHEMA, 10);
        addChangeListener(__changeListener);
    }

    public LineageSearchEntity(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LineageSearchEntity.Fields fields() {
        return _fields;
    }

    public static LineageSearchEntity.ProjectionMask createMask() {
        return new LineageSearchEntity.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entity
     * 
     * @see LineageSearchEntity.Fields#entity
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
     * @see LineageSearchEntity.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see LineageSearchEntity.Fields#entity
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
     * @see LineageSearchEntity.Fields#entity
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
     * @see LineageSearchEntity.Fields#entity
     */
    public LineageSearchEntity setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.metadata.search.LineageSearchEntity");
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
     * @see LineageSearchEntity.Fields#entity
     */
    public LineageSearchEntity setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for matchedFields
     * 
     * @see LineageSearchEntity.Fields#matchedFields
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
     * @see LineageSearchEntity.Fields#matchedFields
     */
    public void removeMatchedFields() {
        super._map.remove("matchedFields");
    }

    /**
     * Getter for matchedFields
     * 
     * @see LineageSearchEntity.Fields#matchedFields
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
     * @see LineageSearchEntity.Fields#matchedFields
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
     * @see LineageSearchEntity.Fields#matchedFields
     */
    public LineageSearchEntity setMatchedFields(
        @Nullable
        MatchedFieldArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMatchedFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field matchedFields of com.linkedin.metadata.search.LineageSearchEntity");
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
     * @see LineageSearchEntity.Fields#matchedFields
     */
    public LineageSearchEntity setMatchedFields(
        @Nonnull
        MatchedFieldArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field matchedFields of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "matchedFields", value.data());
            _matchedFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for features
     * 
     * @see LineageSearchEntity.Fields#features
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
     * @see LineageSearchEntity.Fields#features
     */
    public void removeFeatures() {
        super._map.remove("features");
    }

    /**
     * Getter for features
     * 
     * @see LineageSearchEntity.Fields#features
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
     * @see LineageSearchEntity.Fields#features
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
     * @see LineageSearchEntity.Fields#features
     */
    public LineageSearchEntity setFeatures(
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
     * @see LineageSearchEntity.Fields#features
     */
    public LineageSearchEntity setFeatures(
        @Nonnull
        DoubleMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field features of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "features", value.data());
            _featuresField = value;
        }
        return this;
    }

    /**
     * Existence checker for score
     * 
     * @see LineageSearchEntity.Fields#score
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
     * @see LineageSearchEntity.Fields#score
     */
    public void removeScore() {
        super._map.remove("score");
    }

    /**
     * Getter for score
     * 
     * @see LineageSearchEntity.Fields#score
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
     * @see LineageSearchEntity.Fields#score
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
     * @see LineageSearchEntity.Fields#score
     */
    public LineageSearchEntity setScore(
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
     * @see LineageSearchEntity.Fields#score
     */
    public LineageSearchEntity setScore(
        @Nonnull
        Double value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field score of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceDoubleInput(value));
            _scoreField = value;
        }
        return this;
    }

    /**
     * Setter for score
     * 
     * @see LineageSearchEntity.Fields#score
     */
    public LineageSearchEntity setScore(double value) {
        CheckedUtil.putWithoutChecking(super._map, "score", DataTemplateUtil.coerceDoubleInput(value));
        _scoreField = value;
        return this;
    }

    /**
     * Existence checker for restrictedAspects
     * 
     * @see LineageSearchEntity.Fields#restrictedAspects
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
     * @see LineageSearchEntity.Fields#restrictedAspects
     */
    public void removeRestrictedAspects() {
        super._map.remove("restrictedAspects");
    }

    /**
     * Getter for restrictedAspects
     * 
     * @see LineageSearchEntity.Fields#restrictedAspects
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
     * @see LineageSearchEntity.Fields#restrictedAspects
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
     * @see LineageSearchEntity.Fields#restrictedAspects
     */
    public LineageSearchEntity setRestrictedAspects(
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
     * @see LineageSearchEntity.Fields#restrictedAspects
     */
    public LineageSearchEntity setRestrictedAspects(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field restrictedAspects of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "restrictedAspects", value.data());
            _restrictedAspectsField = value;
        }
        return this;
    }

    /**
     * Existence checker for extraFields
     * 
     * @see LineageSearchEntity.Fields#extraFields
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
     * @see LineageSearchEntity.Fields#extraFields
     */
    public void removeExtraFields() {
        super._map.remove("extraFields");
    }

    /**
     * Getter for extraFields
     * 
     * @see LineageSearchEntity.Fields#extraFields
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
     * @see LineageSearchEntity.Fields#extraFields
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
     * @see LineageSearchEntity.Fields#extraFields
     */
    public LineageSearchEntity setExtraFields(
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
     * @see LineageSearchEntity.Fields#extraFields
     */
    public LineageSearchEntity setExtraFields(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field extraFields of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "extraFields", value.data());
            _extraFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for paths
     * 
     * @see LineageSearchEntity.Fields#paths
     */
    public boolean hasPaths() {
        if (_pathsField!= null) {
            return true;
        }
        return super._map.containsKey("paths");
    }

    /**
     * Remover for paths
     * 
     * @see LineageSearchEntity.Fields#paths
     */
    public void removePaths() {
        super._map.remove("paths");
    }

    /**
     * Getter for paths
     * 
     * @see LineageSearchEntity.Fields#paths
     */
    @Nullable
    public UrnArrayArray getPaths(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPaths();
            case NULL:
                if (_pathsField!= null) {
                    return _pathsField;
                } else {
                    Object __rawValue = super._map.get("paths");
                    _pathsField = ((__rawValue == null)?null:new UrnArrayArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _pathsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for paths
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageSearchEntity.Fields#paths
     */
    @Nonnull
    public UrnArrayArray getPaths() {
        if (_pathsField!= null) {
            return _pathsField;
        } else {
            Object __rawValue = super._map.get("paths");
            if (__rawValue == null) {
                return DEFAULT_Paths;
            }
            _pathsField = ((__rawValue == null)?null:new UrnArrayArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathsField;
        }
    }

    /**
     * Setter for paths
     * 
     * @see LineageSearchEntity.Fields#paths
     */
    public LineageSearchEntity setPaths(
        @Nullable
        UrnArrayArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPaths(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field paths of com.linkedin.metadata.search.LineageSearchEntity");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePaths();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
                    _pathsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for paths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#paths
     */
    public LineageSearchEntity setPaths(
        @Nonnull
        UrnArrayArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field paths of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "paths", value.data());
            _pathsField = value;
        }
        return this;
    }

    /**
     * Existence checker for path
     * 
     * @see LineageSearchEntity.Fields#path
     */
    @Deprecated
    public boolean hasPath() {
        if (_pathField!= null) {
            return true;
        }
        return super._map.containsKey("path");
    }

    /**
     * Remover for path
     * 
     * @see LineageSearchEntity.Fields#path
     */
    @Deprecated
    public void removePath() {
        super._map.remove("path");
    }

    /**
     * Getter for path
     * 
     * @see LineageSearchEntity.Fields#path
     */
    @Deprecated
    @Nullable
    public UrnArray getPath(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPath();
            case NULL:
                if (_pathField!= null) {
                    return _pathField;
                } else {
                    Object __rawValue = super._map.get("path");
                    _pathField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _pathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for path
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageSearchEntity.Fields#path
     */
    @Deprecated
    @Nonnull
    public UrnArray getPath() {
        if (_pathField!= null) {
            return _pathField;
        } else {
            Object __rawValue = super._map.get("path");
            if (__rawValue == null) {
                return DEFAULT_Path;
            }
            _pathField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _pathField;
        }
    }

    /**
     * Setter for path
     * 
     * @see LineageSearchEntity.Fields#path
     */
    @Deprecated
    public LineageSearchEntity setPath(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field path of com.linkedin.metadata.search.LineageSearchEntity");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "path", value.data());
                    _pathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for path
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#path
     */
    @Deprecated
    public LineageSearchEntity setPath(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field path of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "path", value.data());
            _pathField = value;
        }
        return this;
    }

    /**
     * Existence checker for degree
     * 
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    public boolean hasDegree() {
        if (_degreeField!= null) {
            return true;
        }
        return super._map.containsKey("degree");
    }

    /**
     * Remover for degree
     * 
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    public void removeDegree() {
        super._map.remove("degree");
    }

    /**
     * Getter for degree
     * 
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    @Nullable
    public Integer getDegree(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDegree();
            case NULL:
                if (_degreeField!= null) {
                    return _degreeField;
                } else {
                    Object __rawValue = super._map.get("degree");
                    _degreeField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _degreeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for degree
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    @Nonnull
    public Integer getDegree() {
        if (_degreeField!= null) {
            return _degreeField;
        } else {
            Object __rawValue = super._map.get("degree");
            if (__rawValue == null) {
                return DEFAULT_Degree;
            }
            _degreeField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _degreeField;
        }
    }

    /**
     * Setter for degree
     * 
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    public LineageSearchEntity setDegree(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDegree(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field degree of com.linkedin.metadata.search.LineageSearchEntity");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
                    _degreeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDegree();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
                    _degreeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
                    _degreeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for degree
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    public LineageSearchEntity setDegree(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field degree of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
            _degreeField = value;
        }
        return this;
    }

    /**
     * Setter for degree
     * 
     * @see LineageSearchEntity.Fields#degree
     */
    @Deprecated
    public LineageSearchEntity setDegree(int value) {
        CheckedUtil.putWithoutChecking(super._map, "degree", DataTemplateUtil.coerceIntInput(value));
        _degreeField = value;
        return this;
    }

    /**
     * Existence checker for degrees
     * 
     * @see LineageSearchEntity.Fields#degrees
     */
    public boolean hasDegrees() {
        if (_degreesField!= null) {
            return true;
        }
        return super._map.containsKey("degrees");
    }

    /**
     * Remover for degrees
     * 
     * @see LineageSearchEntity.Fields#degrees
     */
    public void removeDegrees() {
        super._map.remove("degrees");
    }

    /**
     * Getter for degrees
     * 
     * @see LineageSearchEntity.Fields#degrees
     */
    @Nullable
    public IntegerArray getDegrees(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDegrees();
            case NULL:
                if (_degreesField!= null) {
                    return _degreesField;
                } else {
                    Object __rawValue = super._map.get("degrees");
                    _degreesField = ((__rawValue == null)?null:new IntegerArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _degreesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for degrees
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LineageSearchEntity.Fields#degrees
     */
    @Nonnull
    public IntegerArray getDegrees() {
        if (_degreesField!= null) {
            return _degreesField;
        } else {
            Object __rawValue = super._map.get("degrees");
            if (__rawValue == null) {
                return DEFAULT_Degrees;
            }
            _degreesField = ((__rawValue == null)?null:new IntegerArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _degreesField;
        }
    }

    /**
     * Setter for degrees
     * 
     * @see LineageSearchEntity.Fields#degrees
     */
    public LineageSearchEntity setDegrees(
        @Nullable
        IntegerArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDegrees(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field degrees of com.linkedin.metadata.search.LineageSearchEntity");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
                    _degreesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDegrees();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
                    _degreesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
                    _degreesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for degrees
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#degrees
     */
    public LineageSearchEntity setDegrees(
        @Nonnull
        IntegerArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field degrees of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "degrees", value.data());
            _degreesField = value;
        }
        return this;
    }

    /**
     * Existence checker for explored
     * 
     * @see LineageSearchEntity.Fields#explored
     */
    public boolean hasExplored() {
        if (_exploredField!= null) {
            return true;
        }
        return super._map.containsKey("explored");
    }

    /**
     * Remover for explored
     * 
     * @see LineageSearchEntity.Fields#explored
     */
    public void removeExplored() {
        super._map.remove("explored");
    }

    /**
     * Getter for explored
     * 
     * @see LineageSearchEntity.Fields#explored
     */
    @Nullable
    public Boolean isExplored(GetMode mode) {
        return isExplored();
    }

    /**
     * Getter for explored
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageSearchEntity.Fields#explored
     */
    @Nullable
    public Boolean isExplored() {
        if (_exploredField!= null) {
            return _exploredField;
        } else {
            Object __rawValue = super._map.get("explored");
            _exploredField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _exploredField;
        }
    }

    /**
     * Setter for explored
     * 
     * @see LineageSearchEntity.Fields#explored
     */
    public LineageSearchEntity setExplored(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExplored(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExplored();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "explored", value);
                    _exploredField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "explored", value);
                    _exploredField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for explored
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#explored
     */
    public LineageSearchEntity setExplored(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field explored of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "explored", value);
            _exploredField = value;
        }
        return this;
    }

    /**
     * Setter for explored
     * 
     * @see LineageSearchEntity.Fields#explored
     */
    public LineageSearchEntity setExplored(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "explored", value);
        _exploredField = value;
        return this;
    }

    /**
     * Existence checker for truncatedChildren
     * 
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    public boolean hasTruncatedChildren() {
        if (_truncatedChildrenField!= null) {
            return true;
        }
        return super._map.containsKey("truncatedChildren");
    }

    /**
     * Remover for truncatedChildren
     * 
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    public void removeTruncatedChildren() {
        super._map.remove("truncatedChildren");
    }

    /**
     * Getter for truncatedChildren
     * 
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    @Nullable
    public Boolean isTruncatedChildren(GetMode mode) {
        return isTruncatedChildren();
    }

    /**
     * Getter for truncatedChildren
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    @Nullable
    public Boolean isTruncatedChildren() {
        if (_truncatedChildrenField!= null) {
            return _truncatedChildrenField;
        } else {
            Object __rawValue = super._map.get("truncatedChildren");
            _truncatedChildrenField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _truncatedChildrenField;
        }
    }

    /**
     * Setter for truncatedChildren
     * 
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    public LineageSearchEntity setTruncatedChildren(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTruncatedChildren(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTruncatedChildren();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
                    _truncatedChildrenField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
                    _truncatedChildrenField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for truncatedChildren
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    public LineageSearchEntity setTruncatedChildren(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field truncatedChildren of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
            _truncatedChildrenField = value;
        }
        return this;
    }

    /**
     * Setter for truncatedChildren
     * 
     * @see LineageSearchEntity.Fields#truncatedChildren
     */
    public LineageSearchEntity setTruncatedChildren(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "truncatedChildren", value);
        _truncatedChildrenField = value;
        return this;
    }

    /**
     * Existence checker for ignoredAsHop
     * 
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    public boolean hasIgnoredAsHop() {
        if (_ignoredAsHopField!= null) {
            return true;
        }
        return super._map.containsKey("ignoredAsHop");
    }

    /**
     * Remover for ignoredAsHop
     * 
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    public void removeIgnoredAsHop() {
        super._map.remove("ignoredAsHop");
    }

    /**
     * Getter for ignoredAsHop
     * 
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    @Nullable
    public Boolean isIgnoredAsHop(GetMode mode) {
        return isIgnoredAsHop();
    }

    /**
     * Getter for ignoredAsHop
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    @Nullable
    public Boolean isIgnoredAsHop() {
        if (_ignoredAsHopField!= null) {
            return _ignoredAsHopField;
        } else {
            Object __rawValue = super._map.get("ignoredAsHop");
            _ignoredAsHopField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _ignoredAsHopField;
        }
    }

    /**
     * Setter for ignoredAsHop
     * 
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    public LineageSearchEntity setIgnoredAsHop(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIgnoredAsHop(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIgnoredAsHop();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
                    _ignoredAsHopField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
                    _ignoredAsHopField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ignoredAsHop
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    public LineageSearchEntity setIgnoredAsHop(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ignoredAsHop of com.linkedin.metadata.search.LineageSearchEntity to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
            _ignoredAsHopField = value;
        }
        return this;
    }

    /**
     * Setter for ignoredAsHop
     * 
     * @see LineageSearchEntity.Fields#ignoredAsHop
     */
    public LineageSearchEntity setIgnoredAsHop(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "ignoredAsHop", value);
        _ignoredAsHopField = value;
        return this;
    }

    @Override
    public LineageSearchEntity clone()
        throws CloneNotSupportedException
    {
        LineageSearchEntity __clone = ((LineageSearchEntity) super.clone());
        __clone.__changeListener = new LineageSearchEntity.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LineageSearchEntity copy()
        throws CloneNotSupportedException
    {
        LineageSearchEntity __copy = ((LineageSearchEntity) super.copy());
        __copy._ignoredAsHopField = null;
        __copy._matchedFieldsField = null;
        __copy._degreeField = null;
        __copy._truncatedChildrenField = null;
        __copy._degreesField = null;
        __copy._restrictedAspectsField = null;
        __copy._featuresField = null;
        __copy._scoreField = null;
        __copy._pathField = null;
        __copy._pathsField = null;
        __copy._exploredField = null;
        __copy._entityField = null;
        __copy._extraFieldsField = null;
        __copy.__changeListener = new LineageSearchEntity.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LineageSearchEntity __objectRef;

        private ChangeListener(LineageSearchEntity reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "ignoredAsHop":
                    __objectRef._ignoredAsHopField = null;
                    break;
                case "matchedFields":
                    __objectRef._matchedFieldsField = null;
                    break;
                case "degree":
                    __objectRef._degreeField = null;
                    break;
                case "truncatedChildren":
                    __objectRef._truncatedChildrenField = null;
                    break;
                case "degrees":
                    __objectRef._degreesField = null;
                    break;
                case "restrictedAspects":
                    __objectRef._restrictedAspectsField = null;
                    break;
                case "features":
                    __objectRef._featuresField = null;
                    break;
                case "score":
                    __objectRef._scoreField = null;
                    break;
                case "path":
                    __objectRef._pathField = null;
                    break;
                case "paths":
                    __objectRef._pathsField = null;
                    break;
                case "explored":
                    __objectRef._exploredField = null;
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

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public PathSpec paths() {
            return new PathSpec(getPathComponents(), "paths");
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public PathSpec paths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "paths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public PathSpec path() {
            return new PathSpec(getPathComponents(), "path");
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public PathSpec path(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "path");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         * 
         */
        @Deprecated
        public PathSpec degree() {
            return new PathSpec(getPathComponents(), "degree");
        }

        /**
         * The degrees of separation (number of hops) between the source and this entity 
         * 
         */
        public PathSpec degrees() {
            return new PathSpec(getPathComponents(), "degrees");
        }

        /**
         * The degrees of separation (number of hops) between the source and this entity 
         * 
         */
        public PathSpec degrees(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "degrees");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Marks an entity as having been explored for as a part of the graph walk
         * 
         */
        public PathSpec explored() {
            return new PathSpec(getPathComponents(), "explored");
        }

        /**
         * Indicates this destination node has additional unexplored child relationships
         * 
         */
        public PathSpec truncatedChildren() {
            return new PathSpec(getPathComponents(), "truncatedChildren");
        }

        /**
         * Whether this relationship was ignored as a hop while performing the graph walk
         * 
         */
        public PathSpec ignoredAsHop() {
            return new PathSpec(getPathComponents(), "ignoredAsHop");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask _matchedFieldsMask;

        ProjectionMask() {
        }

        /**
         * Urn of the entity being returned
         * 
         */
        public LineageSearchEntity.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public LineageSearchEntity.ProjectionMask withMatchedFields(Function<com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask, com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask> nestedMask) {
            _matchedFieldsMask = nestedMask.apply(((_matchedFieldsMask == null)?MatchedFieldArray.createMask():_matchedFieldsMask));
            getDataMap().put("matchedFields", _matchedFieldsMask.getDataMap());
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public LineageSearchEntity.ProjectionMask withMatchedFields() {
            _matchedFieldsMask = null;
            getDataMap().put("matchedFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Matched field name and values
         * 
         */
        public LineageSearchEntity.ProjectionMask withMatchedFields(Function<com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask, com.linkedin.metadata.search.MatchedFieldArray.ProjectionMask> nestedMask, Integer start, Integer count) {
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
        public LineageSearchEntity.ProjectionMask withMatchedFields(Integer start, Integer count) {
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

        public LineageSearchEntity.ProjectionMask withFeatures() {
            getDataMap().put("features", MaskMap.POSITIVE_MASK);
            return this;
        }

        public LineageSearchEntity.ProjectionMask withScore() {
            getDataMap().put("score", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of the the restricted aspects on the entity.
         * If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
         * 
         */
        public LineageSearchEntity.ProjectionMask withRestrictedAspects() {
            getDataMap().put("restrictedAspects", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of the the restricted aspects on the entity.
         * If the key aspect is present, assume ALL aspects should be restricted including the entity's Urn.
         * 
         */
        public LineageSearchEntity.ProjectionMask withRestrictedAspects(Integer start, Integer count) {
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
        public LineageSearchEntity.ProjectionMask withExtraFields() {
            getDataMap().put("extraFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public LineageSearchEntity.ProjectionMask withPaths() {
            getDataMap().put("paths", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of entities between the source and destination node.
         * There can be multiple paths from the source to the destination.
         * 
         */
        public LineageSearchEntity.ProjectionMask withPaths(Integer start, Integer count) {
            getDataMap().put("paths", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("paths").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("paths").put("$count", count);
            }
            return this;
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public LineageSearchEntity.ProjectionMask withPath() {
            getDataMap().put("path", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional list of entities between the source and destination node
         * 
         */
        @Deprecated
        public LineageSearchEntity.ProjectionMask withPath(Integer start, Integer count) {
            getDataMap().put("path", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("path").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("path").put("$count", count);
            }
            return this;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         * 
         */
        @Deprecated
        public LineageSearchEntity.ProjectionMask withDegree() {
            getDataMap().put("degree", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The degrees of separation (number of hops) between the source and this entity 
         * 
         */
        public LineageSearchEntity.ProjectionMask withDegrees() {
            getDataMap().put("degrees", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The degrees of separation (number of hops) between the source and this entity 
         * 
         */
        public LineageSearchEntity.ProjectionMask withDegrees(Integer start, Integer count) {
            getDataMap().put("degrees", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("degrees").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("degrees").put("$count", count);
            }
            return this;
        }

        /**
         * Marks an entity as having been explored for as a part of the graph walk
         * 
         */
        public LineageSearchEntity.ProjectionMask withExplored() {
            getDataMap().put("explored", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Indicates this destination node has additional unexplored child relationships
         * 
         */
        public LineageSearchEntity.ProjectionMask withTruncatedChildren() {
            getDataMap().put("truncatedChildren", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether this relationship was ignored as a hop while performing the graph walk
         * 
         */
        public LineageSearchEntity.ProjectionMask withIgnoredAsHop() {
            getDataMap().put("ignoredAsHop", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
