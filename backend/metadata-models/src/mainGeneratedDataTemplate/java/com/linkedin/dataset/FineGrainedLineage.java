
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * A fine-grained lineage from upstream fields/datasets to downstream field(s)
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/FineGrainedLineage.pdl.")
public class FineGrainedLineage
    extends RecordTemplate
{

    private final static FineGrainedLineage.Fields _fields = new FineGrainedLineage.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}", SchemaFormatType.PDL));
    private FineGrainedLineageUpstreamType _upstreamTypeField = null;
    private UrnArray _upstreamsField = null;
    private FineGrainedLineageDownstreamType _downstreamTypeField = null;
    private UrnArray _downstreamsField = null;
    private String _transformOperationField = null;
    private Float _confidenceScoreField = null;
    private com.linkedin.common.urn.Urn _queryField = null;
    private FineGrainedLineage.ChangeListener __changeListener = new FineGrainedLineage.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_UpstreamType = SCHEMA.getField("upstreamType");
    private final static RecordDataSchema.Field FIELD_Upstreams = SCHEMA.getField("upstreams");
    private final static RecordDataSchema.Field FIELD_DownstreamType = SCHEMA.getField("downstreamType");
    private final static RecordDataSchema.Field FIELD_Downstreams = SCHEMA.getField("downstreams");
    private final static RecordDataSchema.Field FIELD_TransformOperation = SCHEMA.getField("transformOperation");
    private final static RecordDataSchema.Field FIELD_ConfidenceScore = SCHEMA.getField("confidenceScore");
    private final static Float DEFAULT_ConfidenceScore;
    private final static RecordDataSchema.Field FIELD_Query = SCHEMA.getField("query");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_ConfidenceScore = DataTemplateUtil.coerceFloatOutput(FIELD_ConfidenceScore.getDefault());
    }

    public FineGrainedLineage() {
        super(new DataMap(10, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FineGrainedLineage(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FineGrainedLineage.Fields fields() {
        return _fields;
    }

    public static FineGrainedLineage.ProjectionMask createMask() {
        return new FineGrainedLineage.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for upstreamType
     * 
     * @see FineGrainedLineage.Fields#upstreamType
     */
    public boolean hasUpstreamType() {
        if (_upstreamTypeField!= null) {
            return true;
        }
        return super._map.containsKey("upstreamType");
    }

    /**
     * Remover for upstreamType
     * 
     * @see FineGrainedLineage.Fields#upstreamType
     */
    public void removeUpstreamType() {
        super._map.remove("upstreamType");
    }

    /**
     * Getter for upstreamType
     * 
     * @see FineGrainedLineage.Fields#upstreamType
     */
    @Nullable
    public FineGrainedLineageUpstreamType getUpstreamType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUpstreamType();
            case DEFAULT:
            case NULL:
                if (_upstreamTypeField!= null) {
                    return _upstreamTypeField;
                } else {
                    Object __rawValue = super._map.get("upstreamType");
                    _upstreamTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FineGrainedLineageUpstreamType.class, FineGrainedLineageUpstreamType.$UNKNOWN);
                    return _upstreamTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for upstreamType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FineGrainedLineage.Fields#upstreamType
     */
    @Nonnull
    public FineGrainedLineageUpstreamType getUpstreamType() {
        if (_upstreamTypeField!= null) {
            return _upstreamTypeField;
        } else {
            Object __rawValue = super._map.get("upstreamType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("upstreamType");
            }
            _upstreamTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FineGrainedLineageUpstreamType.class, FineGrainedLineageUpstreamType.$UNKNOWN);
            return _upstreamTypeField;
        }
    }

    /**
     * Setter for upstreamType
     * 
     * @see FineGrainedLineage.Fields#upstreamType
     */
    public FineGrainedLineage setUpstreamType(
        @Nullable
        FineGrainedLineageUpstreamType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUpstreamType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field upstreamType of com.linkedin.dataset.FineGrainedLineage");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "upstreamType", value.name());
                    _upstreamTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUpstreamType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "upstreamType", value.name());
                    _upstreamTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "upstreamType", value.name());
                    _upstreamTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for upstreamType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FineGrainedLineage.Fields#upstreamType
     */
    public FineGrainedLineage setUpstreamType(
        @Nonnull
        FineGrainedLineageUpstreamType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field upstreamType of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "upstreamType", value.name());
            _upstreamTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for upstreams
     * 
     * @see FineGrainedLineage.Fields#upstreams
     */
    public boolean hasUpstreams() {
        if (_upstreamsField!= null) {
            return true;
        }
        return super._map.containsKey("upstreams");
    }

    /**
     * Remover for upstreams
     * 
     * @see FineGrainedLineage.Fields#upstreams
     */
    public void removeUpstreams() {
        super._map.remove("upstreams");
    }

    /**
     * Getter for upstreams
     * 
     * @see FineGrainedLineage.Fields#upstreams
     */
    @Nullable
    public UrnArray getUpstreams(GetMode mode) {
        return getUpstreams();
    }

    /**
     * Getter for upstreams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FineGrainedLineage.Fields#upstreams
     */
    @Nullable
    public UrnArray getUpstreams() {
        if (_upstreamsField!= null) {
            return _upstreamsField;
        } else {
            Object __rawValue = super._map.get("upstreams");
            _upstreamsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _upstreamsField;
        }
    }

    /**
     * Setter for upstreams
     * 
     * @see FineGrainedLineage.Fields#upstreams
     */
    public FineGrainedLineage setUpstreams(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUpstreams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUpstreams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "upstreams", value.data());
                    _upstreamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "upstreams", value.data());
                    _upstreamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for upstreams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FineGrainedLineage.Fields#upstreams
     */
    public FineGrainedLineage setUpstreams(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field upstreams of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "upstreams", value.data());
            _upstreamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for downstreamType
     * 
     * @see FineGrainedLineage.Fields#downstreamType
     */
    public boolean hasDownstreamType() {
        if (_downstreamTypeField!= null) {
            return true;
        }
        return super._map.containsKey("downstreamType");
    }

    /**
     * Remover for downstreamType
     * 
     * @see FineGrainedLineage.Fields#downstreamType
     */
    public void removeDownstreamType() {
        super._map.remove("downstreamType");
    }

    /**
     * Getter for downstreamType
     * 
     * @see FineGrainedLineage.Fields#downstreamType
     */
    @Nullable
    public FineGrainedLineageDownstreamType getDownstreamType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDownstreamType();
            case DEFAULT:
            case NULL:
                if (_downstreamTypeField!= null) {
                    return _downstreamTypeField;
                } else {
                    Object __rawValue = super._map.get("downstreamType");
                    _downstreamTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FineGrainedLineageDownstreamType.class, FineGrainedLineageDownstreamType.$UNKNOWN);
                    return _downstreamTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for downstreamType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FineGrainedLineage.Fields#downstreamType
     */
    @Nonnull
    public FineGrainedLineageDownstreamType getDownstreamType() {
        if (_downstreamTypeField!= null) {
            return _downstreamTypeField;
        } else {
            Object __rawValue = super._map.get("downstreamType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("downstreamType");
            }
            _downstreamTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FineGrainedLineageDownstreamType.class, FineGrainedLineageDownstreamType.$UNKNOWN);
            return _downstreamTypeField;
        }
    }

    /**
     * Setter for downstreamType
     * 
     * @see FineGrainedLineage.Fields#downstreamType
     */
    public FineGrainedLineage setDownstreamType(
        @Nullable
        FineGrainedLineageDownstreamType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDownstreamType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field downstreamType of com.linkedin.dataset.FineGrainedLineage");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamType", value.name());
                    _downstreamTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDownstreamType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamType", value.name());
                    _downstreamTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamType", value.name());
                    _downstreamTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for downstreamType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FineGrainedLineage.Fields#downstreamType
     */
    public FineGrainedLineage setDownstreamType(
        @Nonnull
        FineGrainedLineageDownstreamType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field downstreamType of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "downstreamType", value.name());
            _downstreamTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for downstreams
     * 
     * @see FineGrainedLineage.Fields#downstreams
     */
    public boolean hasDownstreams() {
        if (_downstreamsField!= null) {
            return true;
        }
        return super._map.containsKey("downstreams");
    }

    /**
     * Remover for downstreams
     * 
     * @see FineGrainedLineage.Fields#downstreams
     */
    public void removeDownstreams() {
        super._map.remove("downstreams");
    }

    /**
     * Getter for downstreams
     * 
     * @see FineGrainedLineage.Fields#downstreams
     */
    @Nullable
    public UrnArray getDownstreams(GetMode mode) {
        return getDownstreams();
    }

    /**
     * Getter for downstreams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FineGrainedLineage.Fields#downstreams
     */
    @Nullable
    public UrnArray getDownstreams() {
        if (_downstreamsField!= null) {
            return _downstreamsField;
        } else {
            Object __rawValue = super._map.get("downstreams");
            _downstreamsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _downstreamsField;
        }
    }

    /**
     * Setter for downstreams
     * 
     * @see FineGrainedLineage.Fields#downstreams
     */
    public FineGrainedLineage setDownstreams(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDownstreams(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDownstreams();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
                    _downstreamsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
                    _downstreamsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for downstreams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FineGrainedLineage.Fields#downstreams
     */
    public FineGrainedLineage setDownstreams(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field downstreams of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "downstreams", value.data());
            _downstreamsField = value;
        }
        return this;
    }

    /**
     * Existence checker for transformOperation
     * 
     * @see FineGrainedLineage.Fields#transformOperation
     */
    public boolean hasTransformOperation() {
        if (_transformOperationField!= null) {
            return true;
        }
        return super._map.containsKey("transformOperation");
    }

    /**
     * Remover for transformOperation
     * 
     * @see FineGrainedLineage.Fields#transformOperation
     */
    public void removeTransformOperation() {
        super._map.remove("transformOperation");
    }

    /**
     * Getter for transformOperation
     * 
     * @see FineGrainedLineage.Fields#transformOperation
     */
    @Nullable
    public String getTransformOperation(GetMode mode) {
        return getTransformOperation();
    }

    /**
     * Getter for transformOperation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FineGrainedLineage.Fields#transformOperation
     */
    @Nullable
    public String getTransformOperation() {
        if (_transformOperationField!= null) {
            return _transformOperationField;
        } else {
            Object __rawValue = super._map.get("transformOperation");
            _transformOperationField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _transformOperationField;
        }
    }

    /**
     * Setter for transformOperation
     * 
     * @see FineGrainedLineage.Fields#transformOperation
     */
    public FineGrainedLineage setTransformOperation(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTransformOperation(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTransformOperation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transformOperation", value);
                    _transformOperationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "transformOperation", value);
                    _transformOperationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for transformOperation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FineGrainedLineage.Fields#transformOperation
     */
    public FineGrainedLineage setTransformOperation(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field transformOperation of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "transformOperation", value);
            _transformOperationField = value;
        }
        return this;
    }

    /**
     * Existence checker for confidenceScore
     * 
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    public boolean hasConfidenceScore() {
        if (_confidenceScoreField!= null) {
            return true;
        }
        return super._map.containsKey("confidenceScore");
    }

    /**
     * Remover for confidenceScore
     * 
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    public void removeConfidenceScore() {
        super._map.remove("confidenceScore");
    }

    /**
     * Getter for confidenceScore
     * 
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    @Nullable
    public Float getConfidenceScore(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getConfidenceScore();
            case NULL:
                if (_confidenceScoreField!= null) {
                    return _confidenceScoreField;
                } else {
                    Object __rawValue = super._map.get("confidenceScore");
                    _confidenceScoreField = DataTemplateUtil.coerceFloatOutput(__rawValue);
                    return _confidenceScoreField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for confidenceScore
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    @Nonnull
    public Float getConfidenceScore() {
        if (_confidenceScoreField!= null) {
            return _confidenceScoreField;
        } else {
            Object __rawValue = super._map.get("confidenceScore");
            if (__rawValue == null) {
                return DEFAULT_ConfidenceScore;
            }
            _confidenceScoreField = DataTemplateUtil.coerceFloatOutput(__rawValue);
            return _confidenceScoreField;
        }
    }

    /**
     * Setter for confidenceScore
     * 
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    public FineGrainedLineage setConfidenceScore(
        @Nullable
        Float value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setConfidenceScore(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field confidenceScore of com.linkedin.dataset.FineGrainedLineage");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "confidenceScore", DataTemplateUtil.coerceFloatInput(value));
                    _confidenceScoreField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeConfidenceScore();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "confidenceScore", DataTemplateUtil.coerceFloatInput(value));
                    _confidenceScoreField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "confidenceScore", DataTemplateUtil.coerceFloatInput(value));
                    _confidenceScoreField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for confidenceScore
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    public FineGrainedLineage setConfidenceScore(
        @Nonnull
        Float value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field confidenceScore of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "confidenceScore", DataTemplateUtil.coerceFloatInput(value));
            _confidenceScoreField = value;
        }
        return this;
    }

    /**
     * Setter for confidenceScore
     * 
     * @see FineGrainedLineage.Fields#confidenceScore
     */
    public FineGrainedLineage setConfidenceScore(float value) {
        CheckedUtil.putWithoutChecking(super._map, "confidenceScore", DataTemplateUtil.coerceFloatInput(value));
        _confidenceScoreField = value;
        return this;
    }

    /**
     * Existence checker for query
     * 
     * @see FineGrainedLineage.Fields#query
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
     * @see FineGrainedLineage.Fields#query
     */
    public void removeQuery() {
        super._map.remove("query");
    }

    /**
     * Getter for query
     * 
     * @see FineGrainedLineage.Fields#query
     */
    @Nullable
    public com.linkedin.common.urn.Urn getQuery(GetMode mode) {
        return getQuery();
    }

    /**
     * Getter for query
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FineGrainedLineage.Fields#query
     */
    @Nullable
    public com.linkedin.common.urn.Urn getQuery() {
        if (_queryField!= null) {
            return _queryField;
        } else {
            Object __rawValue = super._map.get("query");
            _queryField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _queryField;
        }
    }

    /**
     * Setter for query
     * 
     * @see FineGrainedLineage.Fields#query
     */
    public FineGrainedLineage setQuery(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setQuery(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeQuery();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "query", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _queryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "query", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
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
     * @see FineGrainedLineage.Fields#query
     */
    public FineGrainedLineage setQuery(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field query of com.linkedin.dataset.FineGrainedLineage to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "query", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _queryField = value;
        }
        return this;
    }

    @Override
    public FineGrainedLineage clone()
        throws CloneNotSupportedException
    {
        FineGrainedLineage __clone = ((FineGrainedLineage) super.clone());
        __clone.__changeListener = new FineGrainedLineage.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FineGrainedLineage copy()
        throws CloneNotSupportedException
    {
        FineGrainedLineage __copy = ((FineGrainedLineage) super.copy());
        __copy._downstreamsField = null;
        __copy._confidenceScoreField = null;
        __copy._upstreamsField = null;
        __copy._queryField = null;
        __copy._downstreamTypeField = null;
        __copy._transformOperationField = null;
        __copy._upstreamTypeField = null;
        __copy.__changeListener = new FineGrainedLineage.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FineGrainedLineage __objectRef;

        private ChangeListener(FineGrainedLineage reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "downstreams":
                    __objectRef._downstreamsField = null;
                    break;
                case "confidenceScore":
                    __objectRef._confidenceScoreField = null;
                    break;
                case "upstreams":
                    __objectRef._upstreamsField = null;
                    break;
                case "query":
                    __objectRef._queryField = null;
                    break;
                case "downstreamType":
                    __objectRef._downstreamTypeField = null;
                    break;
                case "transformOperation":
                    __objectRef._transformOperationField = null;
                    break;
                case "upstreamType":
                    __objectRef._upstreamTypeField = null;
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
         * The type of upstream entity
         * 
         */
        public PathSpec upstreamType() {
            return new PathSpec(getPathComponents(), "upstreamType");
        }

        /**
         * Upstream entities in the lineage
         * 
         */
        public PathSpec upstreams() {
            return new PathSpec(getPathComponents(), "upstreams");
        }

        /**
         * Upstream entities in the lineage
         * 
         */
        public PathSpec upstreams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upstreams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The type of downstream field(s)
         * 
         */
        public PathSpec downstreamType() {
            return new PathSpec(getPathComponents(), "downstreamType");
        }

        /**
         * Downstream fields in the lineage
         * 
         */
        public PathSpec downstreams() {
            return new PathSpec(getPathComponents(), "downstreams");
        }

        /**
         * Downstream fields in the lineage
         * 
         */
        public PathSpec downstreams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The transform operation applied to the upstream entities to produce the downstream field(s)
         * 
         */
        public PathSpec transformOperation() {
            return new PathSpec(getPathComponents(), "transformOperation");
        }

        /**
         * The confidence in this lineage between 0 (low confidence) and 1 (high confidence)
         * 
         */
        public PathSpec confidenceScore() {
            return new PathSpec(getPathComponents(), "confidenceScore");
        }

        /**
         * The query that was used to generate this lineage. 
         * Present only if the lineage was generated from a detected query.
         * 
         */
        public PathSpec query() {
            return new PathSpec(getPathComponents(), "query");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(10);
        }

        /**
         * The type of upstream entity
         * 
         */
        public FineGrainedLineage.ProjectionMask withUpstreamType() {
            getDataMap().put("upstreamType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Upstream entities in the lineage
         * 
         */
        public FineGrainedLineage.ProjectionMask withUpstreams() {
            getDataMap().put("upstreams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Upstream entities in the lineage
         * 
         */
        public FineGrainedLineage.ProjectionMask withUpstreams(Integer start, Integer count) {
            getDataMap().put("upstreams", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("upstreams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("upstreams").put("$count", count);
            }
            return this;
        }

        /**
         * The type of downstream field(s)
         * 
         */
        public FineGrainedLineage.ProjectionMask withDownstreamType() {
            getDataMap().put("downstreamType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Downstream fields in the lineage
         * 
         */
        public FineGrainedLineage.ProjectionMask withDownstreams() {
            getDataMap().put("downstreams", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Downstream fields in the lineage
         * 
         */
        public FineGrainedLineage.ProjectionMask withDownstreams(Integer start, Integer count) {
            getDataMap().put("downstreams", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("downstreams").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreams").put("$count", count);
            }
            return this;
        }

        /**
         * The transform operation applied to the upstream entities to produce the downstream field(s)
         * 
         */
        public FineGrainedLineage.ProjectionMask withTransformOperation() {
            getDataMap().put("transformOperation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The confidence in this lineage between 0 (low confidence) and 1 (high confidence)
         * 
         */
        public FineGrainedLineage.ProjectionMask withConfidenceScore() {
            getDataMap().put("confidenceScore", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The query that was used to generate this lineage. 
         * Present only if the lineage was generated from a detected query.
         * 
         */
        public FineGrainedLineage.ProjectionMask withQuery() {
            getDataMap().put("query", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
