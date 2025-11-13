
package com.linkedin.datajob;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.DataJobUrnArray;
import com.linkedin.common.DatasetUrnArray;
import com.linkedin.common.EdgeArray;
import com.linkedin.common.UrnArray;
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
import com.linkedin.dataset.FineGrainedLineageArray;


/**
 * Information about the inputs and outputs of a Data processing job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/DataJobInputOutput.pdl.")
public class DataJobInputOutput
    extends RecordTemplate
{

    private final static DataJobInputOutput.Fields _fields = new DataJobInputOutput.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob/**Information about the inputs and outputs of a Data processing job*/@Aspect.name=\"dataJobInputOutput\"record DataJobInputOutput{/**Input datasets consumed by the data job during processing\nDeprecated! Use inputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}@deprecated,inputDatasets:array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]/**Input datasets consumed by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatasetEdges/*/created/actor\",\"createdOn\":\"inputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"name\":\"Consumes\",\"properties\":\"inputDatasetEdges/*/properties\",\"updatedActor\":\"inputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"inputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false}inputDatasetEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]/**Output datasets produced by the data job during processing\nDeprecated! Use outputDatasetEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}@deprecated,outputDatasets:array[com.linkedin.common.DatasetUrn]/**Output datasets produced by the data job during processing*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"outputDatasetEdges/*/created/actor\",\"createdOn\":\"outputDatasetEdges/*/created/time\",\"entityTypes\":[\"dataset\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"Produces\",\"properties\":\"outputDatasetEdges/*/properties\",\"updatedActor\":\"outputDatasetEdges/*/lastModified/actor\",\"updatedOn\":\"outputDatasetEdges/*/lastModified/time\"}@Searchable.`/*/destinationUrn`={\"fieldName\":\"outputDatasetEdges\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false}outputDatasetEdges:optional array[com.linkedin.common.Edge]/**Input datajobs that this data job depends on\nDeprecated! Use inputDatajobEdges instead.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\"}@deprecated,inputDatajobs:optional array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing job identifier.\",\"entityType\":\"dataJob\",\"fields\":[{\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"doc\":\"Unique identifier of the data job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":594,\"name\":\"DataJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataJobUrn=string}]/**Input datajobs that this data job depends on*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputDatajobEdges/*/created/actor\",\"createdOn\":\"inputDatajobEdges/*/created/time\",\"entityTypes\":[\"dataJob\"],\"isLineage\":true,\"name\":\"DownstreamOf\",\"properties\":\"inputDatajobEdges/*/properties\",\"updatedActor\":\"inputDatajobEdges/*/lastModified/actor\",\"updatedOn\":\"inputDatajobEdges/*/lastModified/time\"}inputDatajobEdges:optional array[com.linkedin.common.Edge]/**Fields of the input datasets used by this job*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Consumes\"}@Searchable.`/*`={\"fieldName\":\"inputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputFields\",\"queryByDefault\":false}inputDatasetFields:optional array[com.linkedin.common.Urn]/**Fields of the output datasets this job writes to*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Produces\"}@Searchable.`/*`={\"fieldName\":\"outputFields\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputFields\",\"queryByDefault\":false}outputDatasetFields:optional array[com.linkedin.common.Urn]/**Fine-grained column-level lineages\nNot currently supported in the UI\nUse UpstreamLineage aspect for datasets to express Column Level Lineage for the UI*/fineGrainedLineages:optional array[{namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[com.linkedin.common.Urn]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}}]}", SchemaFormatType.PDL));
    private DatasetUrnArray _inputDatasetsField = null;
    private EdgeArray _inputDatasetEdgesField = null;
    private DatasetUrnArray _outputDatasetsField = null;
    private EdgeArray _outputDatasetEdgesField = null;
    private DataJobUrnArray _inputDatajobsField = null;
    private EdgeArray _inputDatajobEdgesField = null;
    private UrnArray _inputDatasetFieldsField = null;
    private UrnArray _outputDatasetFieldsField = null;
    private FineGrainedLineageArray _fineGrainedLineagesField = null;
    private DataJobInputOutput.ChangeListener __changeListener = new DataJobInputOutput.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_InputDatasets = SCHEMA.getField("inputDatasets");
    private final static RecordDataSchema.Field FIELD_InputDatasetEdges = SCHEMA.getField("inputDatasetEdges");
    private final static RecordDataSchema.Field FIELD_OutputDatasets = SCHEMA.getField("outputDatasets");
    private final static RecordDataSchema.Field FIELD_OutputDatasetEdges = SCHEMA.getField("outputDatasetEdges");
    private final static RecordDataSchema.Field FIELD_InputDatajobs = SCHEMA.getField("inputDatajobs");
    private final static RecordDataSchema.Field FIELD_InputDatajobEdges = SCHEMA.getField("inputDatajobEdges");
    private final static RecordDataSchema.Field FIELD_InputDatasetFields = SCHEMA.getField("inputDatasetFields");
    private final static RecordDataSchema.Field FIELD_OutputDatasetFields = SCHEMA.getField("outputDatasetFields");
    private final static RecordDataSchema.Field FIELD_FineGrainedLineages = SCHEMA.getField("fineGrainedLineages");

    public DataJobInputOutput() {
        super(new DataMap(12, 0.75F), SCHEMA, 12);
        addChangeListener(__changeListener);
    }

    public DataJobInputOutput(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataJobInputOutput.Fields fields() {
        return _fields;
    }

    public static DataJobInputOutput.ProjectionMask createMask() {
        return new DataJobInputOutput.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Deprecated
    public boolean hasInputDatasets() {
        if (_inputDatasetsField!= null) {
            return true;
        }
        return super._map.containsKey("inputDatasets");
    }

    /**
     * Remover for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Deprecated
    public void removeInputDatasets() {
        super._map.remove("inputDatasets");
    }

    /**
     * Getter for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Deprecated
    @Nullable
    public DatasetUrnArray getInputDatasets(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getInputDatasets();
            case DEFAULT:
            case NULL:
                if (_inputDatasetsField!= null) {
                    return _inputDatasetsField;
                } else {
                    Object __rawValue = super._map.get("inputDatasets");
                    _inputDatasetsField = ((__rawValue == null)?null:new DatasetUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _inputDatasetsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for inputDatasets
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Deprecated
    @Nonnull
    public DatasetUrnArray getInputDatasets() {
        if (_inputDatasetsField!= null) {
            return _inputDatasetsField;
        } else {
            Object __rawValue = super._map.get("inputDatasets");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("inputDatasets");
            }
            _inputDatasetsField = ((__rawValue == null)?null:new DatasetUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputDatasetsField;
        }
    }

    /**
     * Setter for inputDatasets
     * 
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Deprecated
    public DataJobInputOutput setInputDatasets(
        @Nullable
        DatasetUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputDatasets(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field inputDatasets of com.linkedin.datajob.DataJobInputOutput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasets", value.data());
                    _inputDatasetsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputDatasets();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasets", value.data());
                    _inputDatasetsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasets", value.data());
                    _inputDatasetsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatasets
     */
    @Deprecated
    public DataJobInputOutput setInputDatasets(
        @Nonnull
        DatasetUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputDatasets of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputDatasets", value.data());
            _inputDatasetsField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatasetEdges
     */
    public boolean hasInputDatasetEdges() {
        if (_inputDatasetEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("inputDatasetEdges");
    }

    /**
     * Remover for inputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatasetEdges
     */
    public void removeInputDatasetEdges() {
        super._map.remove("inputDatasetEdges");
    }

    /**
     * Getter for inputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatasetEdges
     */
    @Nullable
    public EdgeArray getInputDatasetEdges(GetMode mode) {
        return getInputDatasetEdges();
    }

    /**
     * Getter for inputDatasetEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#inputDatasetEdges
     */
    @Nullable
    public EdgeArray getInputDatasetEdges() {
        if (_inputDatasetEdgesField!= null) {
            return _inputDatasetEdgesField;
        } else {
            Object __rawValue = super._map.get("inputDatasetEdges");
            _inputDatasetEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputDatasetEdgesField;
        }
    }

    /**
     * Setter for inputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatasetEdges
     */
    public DataJobInputOutput setInputDatasetEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputDatasetEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputDatasetEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasetEdges", value.data());
                    _inputDatasetEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasetEdges", value.data());
                    _inputDatasetEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputDatasetEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatasetEdges
     */
    public DataJobInputOutput setInputDatasetEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputDatasetEdges of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputDatasetEdges", value.data());
            _inputDatasetEdgesField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Deprecated
    public boolean hasOutputDatasets() {
        if (_outputDatasetsField!= null) {
            return true;
        }
        return super._map.containsKey("outputDatasets");
    }

    /**
     * Remover for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Deprecated
    public void removeOutputDatasets() {
        super._map.remove("outputDatasets");
    }

    /**
     * Getter for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Deprecated
    @Nullable
    public DatasetUrnArray getOutputDatasets(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOutputDatasets();
            case DEFAULT:
            case NULL:
                if (_outputDatasetsField!= null) {
                    return _outputDatasetsField;
                } else {
                    Object __rawValue = super._map.get("outputDatasets");
                    _outputDatasetsField = ((__rawValue == null)?null:new DatasetUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _outputDatasetsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for outputDatasets
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Deprecated
    @Nonnull
    public DatasetUrnArray getOutputDatasets() {
        if (_outputDatasetsField!= null) {
            return _outputDatasetsField;
        } else {
            Object __rawValue = super._map.get("outputDatasets");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("outputDatasets");
            }
            _outputDatasetsField = ((__rawValue == null)?null:new DatasetUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputDatasetsField;
        }
    }

    /**
     * Setter for outputDatasets
     * 
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Deprecated
    public DataJobInputOutput setOutputDatasets(
        @Nullable
        DatasetUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputDatasets(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field outputDatasets of com.linkedin.datajob.DataJobInputOutput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasets", value.data());
                    _outputDatasetsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputDatasets();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasets", value.data());
                    _outputDatasetsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasets", value.data());
                    _outputDatasetsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#outputDatasets
     */
    @Deprecated
    public DataJobInputOutput setOutputDatasets(
        @Nonnull
        DatasetUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputDatasets of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputDatasets", value.data());
            _outputDatasetsField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#outputDatasetEdges
     */
    public boolean hasOutputDatasetEdges() {
        if (_outputDatasetEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("outputDatasetEdges");
    }

    /**
     * Remover for outputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#outputDatasetEdges
     */
    public void removeOutputDatasetEdges() {
        super._map.remove("outputDatasetEdges");
    }

    /**
     * Getter for outputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#outputDatasetEdges
     */
    @Nullable
    public EdgeArray getOutputDatasetEdges(GetMode mode) {
        return getOutputDatasetEdges();
    }

    /**
     * Getter for outputDatasetEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#outputDatasetEdges
     */
    @Nullable
    public EdgeArray getOutputDatasetEdges() {
        if (_outputDatasetEdgesField!= null) {
            return _outputDatasetEdgesField;
        } else {
            Object __rawValue = super._map.get("outputDatasetEdges");
            _outputDatasetEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputDatasetEdgesField;
        }
    }

    /**
     * Setter for outputDatasetEdges
     * 
     * @see DataJobInputOutput.Fields#outputDatasetEdges
     */
    public DataJobInputOutput setOutputDatasetEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputDatasetEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputDatasetEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasetEdges", value.data());
                    _outputDatasetEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasetEdges", value.data());
                    _outputDatasetEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputDatasetEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#outputDatasetEdges
     */
    public DataJobInputOutput setOutputDatasetEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputDatasetEdges of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputDatasetEdges", value.data());
            _outputDatasetEdgesField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Deprecated
    public boolean hasInputDatajobs() {
        if (_inputDatajobsField!= null) {
            return true;
        }
        return super._map.containsKey("inputDatajobs");
    }

    /**
     * Remover for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Deprecated
    public void removeInputDatajobs() {
        super._map.remove("inputDatajobs");
    }

    /**
     * Getter for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Deprecated
    @Nullable
    public DataJobUrnArray getInputDatajobs(GetMode mode) {
        return getInputDatajobs();
    }

    /**
     * Getter for inputDatajobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Deprecated
    @Nullable
    public DataJobUrnArray getInputDatajobs() {
        if (_inputDatajobsField!= null) {
            return _inputDatajobsField;
        } else {
            Object __rawValue = super._map.get("inputDatajobs");
            _inputDatajobsField = ((__rawValue == null)?null:new DataJobUrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputDatajobsField;
        }
    }

    /**
     * Setter for inputDatajobs
     * 
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Deprecated
    public DataJobInputOutput setInputDatajobs(
        @Nullable
        DataJobUrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputDatajobs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputDatajobs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatajobs", value.data());
                    _inputDatajobsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatajobs", value.data());
                    _inputDatajobsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputDatajobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatajobs
     */
    @Deprecated
    public DataJobInputOutput setInputDatajobs(
        @Nonnull
        DataJobUrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputDatajobs of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputDatajobs", value.data());
            _inputDatajobsField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputDatajobEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatajobEdges
     */
    public boolean hasInputDatajobEdges() {
        if (_inputDatajobEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("inputDatajobEdges");
    }

    /**
     * Remover for inputDatajobEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatajobEdges
     */
    public void removeInputDatajobEdges() {
        super._map.remove("inputDatajobEdges");
    }

    /**
     * Getter for inputDatajobEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatajobEdges
     */
    @Nullable
    public EdgeArray getInputDatajobEdges(GetMode mode) {
        return getInputDatajobEdges();
    }

    /**
     * Getter for inputDatajobEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#inputDatajobEdges
     */
    @Nullable
    public EdgeArray getInputDatajobEdges() {
        if (_inputDatajobEdgesField!= null) {
            return _inputDatajobEdgesField;
        } else {
            Object __rawValue = super._map.get("inputDatajobEdges");
            _inputDatajobEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputDatajobEdgesField;
        }
    }

    /**
     * Setter for inputDatajobEdges
     * 
     * @see DataJobInputOutput.Fields#inputDatajobEdges
     */
    public DataJobInputOutput setInputDatajobEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputDatajobEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputDatajobEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatajobEdges", value.data());
                    _inputDatajobEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatajobEdges", value.data());
                    _inputDatajobEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputDatajobEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatajobEdges
     */
    public DataJobInputOutput setInputDatajobEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputDatajobEdges of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputDatajobEdges", value.data());
            _inputDatajobEdgesField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#inputDatasetFields
     */
    public boolean hasInputDatasetFields() {
        if (_inputDatasetFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("inputDatasetFields");
    }

    /**
     * Remover for inputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#inputDatasetFields
     */
    public void removeInputDatasetFields() {
        super._map.remove("inputDatasetFields");
    }

    /**
     * Getter for inputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#inputDatasetFields
     */
    @Nullable
    public UrnArray getInputDatasetFields(GetMode mode) {
        return getInputDatasetFields();
    }

    /**
     * Getter for inputDatasetFields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#inputDatasetFields
     */
    @Nullable
    public UrnArray getInputDatasetFields() {
        if (_inputDatasetFieldsField!= null) {
            return _inputDatasetFieldsField;
        } else {
            Object __rawValue = super._map.get("inputDatasetFields");
            _inputDatasetFieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputDatasetFieldsField;
        }
    }

    /**
     * Setter for inputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#inputDatasetFields
     */
    public DataJobInputOutput setInputDatasetFields(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputDatasetFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputDatasetFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasetFields", value.data());
                    _inputDatasetFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputDatasetFields", value.data());
                    _inputDatasetFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputDatasetFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#inputDatasetFields
     */
    public DataJobInputOutput setInputDatasetFields(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputDatasetFields of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputDatasetFields", value.data());
            _inputDatasetFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#outputDatasetFields
     */
    public boolean hasOutputDatasetFields() {
        if (_outputDatasetFieldsField!= null) {
            return true;
        }
        return super._map.containsKey("outputDatasetFields");
    }

    /**
     * Remover for outputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#outputDatasetFields
     */
    public void removeOutputDatasetFields() {
        super._map.remove("outputDatasetFields");
    }

    /**
     * Getter for outputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#outputDatasetFields
     */
    @Nullable
    public UrnArray getOutputDatasetFields(GetMode mode) {
        return getOutputDatasetFields();
    }

    /**
     * Getter for outputDatasetFields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#outputDatasetFields
     */
    @Nullable
    public UrnArray getOutputDatasetFields() {
        if (_outputDatasetFieldsField!= null) {
            return _outputDatasetFieldsField;
        } else {
            Object __rawValue = super._map.get("outputDatasetFields");
            _outputDatasetFieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputDatasetFieldsField;
        }
    }

    /**
     * Setter for outputDatasetFields
     * 
     * @see DataJobInputOutput.Fields#outputDatasetFields
     */
    public DataJobInputOutput setOutputDatasetFields(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputDatasetFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputDatasetFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasetFields", value.data());
                    _outputDatasetFieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputDatasetFields", value.data());
                    _outputDatasetFieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputDatasetFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#outputDatasetFields
     */
    public DataJobInputOutput setOutputDatasetFields(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputDatasetFields of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputDatasetFields", value.data());
            _outputDatasetFieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for fineGrainedLineages
     * 
     * @see DataJobInputOutput.Fields#fineGrainedLineages
     */
    public boolean hasFineGrainedLineages() {
        if (_fineGrainedLineagesField!= null) {
            return true;
        }
        return super._map.containsKey("fineGrainedLineages");
    }

    /**
     * Remover for fineGrainedLineages
     * 
     * @see DataJobInputOutput.Fields#fineGrainedLineages
     */
    public void removeFineGrainedLineages() {
        super._map.remove("fineGrainedLineages");
    }

    /**
     * Getter for fineGrainedLineages
     * 
     * @see DataJobInputOutput.Fields#fineGrainedLineages
     */
    @Nullable
    public FineGrainedLineageArray getFineGrainedLineages(GetMode mode) {
        return getFineGrainedLineages();
    }

    /**
     * Getter for fineGrainedLineages
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobInputOutput.Fields#fineGrainedLineages
     */
    @Nullable
    public FineGrainedLineageArray getFineGrainedLineages() {
        if (_fineGrainedLineagesField!= null) {
            return _fineGrainedLineagesField;
        } else {
            Object __rawValue = super._map.get("fineGrainedLineages");
            _fineGrainedLineagesField = ((__rawValue == null)?null:new FineGrainedLineageArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _fineGrainedLineagesField;
        }
    }

    /**
     * Setter for fineGrainedLineages
     * 
     * @see DataJobInputOutput.Fields#fineGrainedLineages
     */
    public DataJobInputOutput setFineGrainedLineages(
        @Nullable
        FineGrainedLineageArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFineGrainedLineages(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFineGrainedLineages();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fineGrainedLineages", value.data());
                    _fineGrainedLineagesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fineGrainedLineages", value.data());
                    _fineGrainedLineagesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fineGrainedLineages
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobInputOutput.Fields#fineGrainedLineages
     */
    public DataJobInputOutput setFineGrainedLineages(
        @Nonnull
        FineGrainedLineageArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fineGrainedLineages of com.linkedin.datajob.DataJobInputOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fineGrainedLineages", value.data());
            _fineGrainedLineagesField = value;
        }
        return this;
    }

    @Override
    public DataJobInputOutput clone()
        throws CloneNotSupportedException
    {
        DataJobInputOutput __clone = ((DataJobInputOutput) super.clone());
        __clone.__changeListener = new DataJobInputOutput.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataJobInputOutput copy()
        throws CloneNotSupportedException
    {
        DataJobInputOutput __copy = ((DataJobInputOutput) super.copy());
        __copy._inputDatajobsField = null;
        __copy._outputDatasetFieldsField = null;
        __copy._inputDatasetEdgesField = null;
        __copy._outputDatasetEdgesField = null;
        __copy._inputDatasetFieldsField = null;
        __copy._inputDatasetsField = null;
        __copy._inputDatajobEdgesField = null;
        __copy._outputDatasetsField = null;
        __copy._fineGrainedLineagesField = null;
        __copy.__changeListener = new DataJobInputOutput.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataJobInputOutput __objectRef;

        private ChangeListener(DataJobInputOutput reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "inputDatajobs":
                    __objectRef._inputDatajobsField = null;
                    break;
                case "outputDatasetFields":
                    __objectRef._outputDatasetFieldsField = null;
                    break;
                case "inputDatasetEdges":
                    __objectRef._inputDatasetEdgesField = null;
                    break;
                case "outputDatasetEdges":
                    __objectRef._outputDatasetEdgesField = null;
                    break;
                case "inputDatasetFields":
                    __objectRef._inputDatasetFieldsField = null;
                    break;
                case "inputDatasets":
                    __objectRef._inputDatasetsField = null;
                    break;
                case "inputDatajobEdges":
                    __objectRef._inputDatajobEdgesField = null;
                    break;
                case "outputDatasets":
                    __objectRef._outputDatasetsField = null;
                    break;
                case "fineGrainedLineages":
                    __objectRef._fineGrainedLineagesField = null;
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
         * Input datasets consumed by the data job during processing
         * Deprecated! Use inputDatasetEdges instead.
         * 
         */
        @Deprecated
        public PathSpec inputDatasets() {
            return new PathSpec(getPathComponents(), "inputDatasets");
        }

        /**
         * Input datasets consumed by the data job during processing
         * Deprecated! Use inputDatasetEdges instead.
         * 
         */
        @Deprecated
        public PathSpec inputDatasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public com.linkedin.common.EdgeArray.Fields inputDatasetEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "inputDatasetEdges");
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public PathSpec inputDatasetEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatasetEdges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Output datasets produced by the data job during processing
         * Deprecated! Use outputDatasetEdges instead.
         * 
         */
        @Deprecated
        public PathSpec outputDatasets() {
            return new PathSpec(getPathComponents(), "outputDatasets");
        }

        /**
         * Output datasets produced by the data job during processing
         * Deprecated! Use outputDatasetEdges instead.
         * 
         */
        @Deprecated
        public PathSpec outputDatasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputDatasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public com.linkedin.common.EdgeArray.Fields outputDatasetEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "outputDatasetEdges");
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public PathSpec outputDatasetEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputDatasetEdges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Input datajobs that this data job depends on
         * Deprecated! Use inputDatajobEdges instead.
         * 
         */
        @Deprecated
        public PathSpec inputDatajobs() {
            return new PathSpec(getPathComponents(), "inputDatajobs");
        }

        /**
         * Input datajobs that this data job depends on
         * Deprecated! Use inputDatajobEdges instead.
         * 
         */
        @Deprecated
        public PathSpec inputDatajobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatajobs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public com.linkedin.common.EdgeArray.Fields inputDatajobEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "inputDatajobEdges");
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public PathSpec inputDatajobEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatajobEdges");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Fields of the input datasets used by this job
         * 
         */
        public PathSpec inputDatasetFields() {
            return new PathSpec(getPathComponents(), "inputDatasetFields");
        }

        /**
         * Fields of the input datasets used by this job
         * 
         */
        public PathSpec inputDatasetFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputDatasetFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Fields of the output datasets this job writes to
         * 
         */
        public PathSpec outputDatasetFields() {
            return new PathSpec(getPathComponents(), "outputDatasetFields");
        }

        /**
         * Fields of the output datasets this job writes to
         * 
         */
        public PathSpec outputDatasetFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputDatasetFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Fine-grained column-level lineages
         * Not currently supported in the UI
         * Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
         * 
         */
        public com.linkedin.dataset.FineGrainedLineageArray.Fields fineGrainedLineages() {
            return new com.linkedin.dataset.FineGrainedLineageArray.Fields(getPathComponents(), "fineGrainedLineages");
        }

        /**
         * Fine-grained column-level lineages
         * Not currently supported in the UI
         * Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
         * 
         */
        public PathSpec fineGrainedLineages(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fineGrainedLineages");
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

        private com.linkedin.common.EdgeArray.ProjectionMask _inputDatasetEdgesMask;
        private com.linkedin.common.EdgeArray.ProjectionMask _outputDatasetEdgesMask;
        private com.linkedin.common.EdgeArray.ProjectionMask _inputDatajobEdgesMask;
        private com.linkedin.dataset.FineGrainedLineageArray.ProjectionMask _fineGrainedLineagesMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * Input datasets consumed by the data job during processing
         * Deprecated! Use inputDatasetEdges instead.
         * 
         */
        @Deprecated
        public DataJobInputOutput.ProjectionMask withInputDatasets() {
            getDataMap().put("inputDatasets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input datasets consumed by the data job during processing
         * Deprecated! Use inputDatasetEdges instead.
         * 
         */
        @Deprecated
        public DataJobInputOutput.ProjectionMask withInputDatasets(Integer start, Integer count) {
            getDataMap().put("inputDatasets", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputDatasets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatasets").put("$count", count);
            }
            return this;
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatasetEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _inputDatasetEdgesMask = nestedMask.apply(((_inputDatasetEdgesMask == null)?EdgeArray.createMask():_inputDatasetEdgesMask));
            getDataMap().put("inputDatasetEdges", _inputDatasetEdgesMask.getDataMap());
            return this;
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatasetEdges() {
            _inputDatasetEdgesMask = null;
            getDataMap().put("inputDatasetEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatasetEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _inputDatasetEdgesMask = nestedMask.apply(((_inputDatasetEdgesMask == null)?EdgeArray.createMask():_inputDatasetEdgesMask));
            getDataMap().put("inputDatasetEdges", _inputDatasetEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("inputDatasetEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatasetEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Input datasets consumed by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatasetEdges(Integer start, Integer count) {
            _inputDatasetEdgesMask = null;
            getDataMap().put("inputDatasetEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputDatasetEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatasetEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Output datasets produced by the data job during processing
         * Deprecated! Use outputDatasetEdges instead.
         * 
         */
        @Deprecated
        public DataJobInputOutput.ProjectionMask withOutputDatasets() {
            getDataMap().put("outputDatasets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Output datasets produced by the data job during processing
         * Deprecated! Use outputDatasetEdges instead.
         * 
         */
        @Deprecated
        public DataJobInputOutput.ProjectionMask withOutputDatasets(Integer start, Integer count) {
            getDataMap().put("outputDatasets", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputDatasets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputDatasets").put("$count", count);
            }
            return this;
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withOutputDatasetEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _outputDatasetEdgesMask = nestedMask.apply(((_outputDatasetEdgesMask == null)?EdgeArray.createMask():_outputDatasetEdgesMask));
            getDataMap().put("outputDatasetEdges", _outputDatasetEdgesMask.getDataMap());
            return this;
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withOutputDatasetEdges() {
            _outputDatasetEdgesMask = null;
            getDataMap().put("outputDatasetEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withOutputDatasetEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _outputDatasetEdgesMask = nestedMask.apply(((_outputDatasetEdgesMask == null)?EdgeArray.createMask():_outputDatasetEdgesMask));
            getDataMap().put("outputDatasetEdges", _outputDatasetEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("outputDatasetEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputDatasetEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Output datasets produced by the data job during processing
         * 
         */
        public DataJobInputOutput.ProjectionMask withOutputDatasetEdges(Integer start, Integer count) {
            _outputDatasetEdgesMask = null;
            getDataMap().put("outputDatasetEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputDatasetEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputDatasetEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Input datajobs that this data job depends on
         * Deprecated! Use inputDatajobEdges instead.
         * 
         */
        @Deprecated
        public DataJobInputOutput.ProjectionMask withInputDatajobs() {
            getDataMap().put("inputDatajobs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input datajobs that this data job depends on
         * Deprecated! Use inputDatajobEdges instead.
         * 
         */
        @Deprecated
        public DataJobInputOutput.ProjectionMask withInputDatajobs(Integer start, Integer count) {
            getDataMap().put("inputDatajobs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputDatajobs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatajobs").put("$count", count);
            }
            return this;
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatajobEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _inputDatajobEdgesMask = nestedMask.apply(((_inputDatajobEdgesMask == null)?EdgeArray.createMask():_inputDatajobEdgesMask));
            getDataMap().put("inputDatajobEdges", _inputDatajobEdgesMask.getDataMap());
            return this;
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatajobEdges() {
            _inputDatajobEdgesMask = null;
            getDataMap().put("inputDatajobEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatajobEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _inputDatajobEdgesMask = nestedMask.apply(((_inputDatajobEdgesMask == null)?EdgeArray.createMask():_inputDatajobEdgesMask));
            getDataMap().put("inputDatajobEdges", _inputDatajobEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("inputDatajobEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatajobEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Input datajobs that this data job depends on
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatajobEdges(Integer start, Integer count) {
            _inputDatajobEdgesMask = null;
            getDataMap().put("inputDatajobEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputDatajobEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatajobEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Fields of the input datasets used by this job
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatasetFields() {
            getDataMap().put("inputDatasetFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fields of the input datasets used by this job
         * 
         */
        public DataJobInputOutput.ProjectionMask withInputDatasetFields(Integer start, Integer count) {
            getDataMap().put("inputDatasetFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputDatasetFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputDatasetFields").put("$count", count);
            }
            return this;
        }

        /**
         * Fields of the output datasets this job writes to
         * 
         */
        public DataJobInputOutput.ProjectionMask withOutputDatasetFields() {
            getDataMap().put("outputDatasetFields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fields of the output datasets this job writes to
         * 
         */
        public DataJobInputOutput.ProjectionMask withOutputDatasetFields(Integer start, Integer count) {
            getDataMap().put("outputDatasetFields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputDatasetFields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputDatasetFields").put("$count", count);
            }
            return this;
        }

        /**
         * Fine-grained column-level lineages
         * Not currently supported in the UI
         * Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
         * 
         */
        public DataJobInputOutput.ProjectionMask withFineGrainedLineages(Function<com.linkedin.dataset.FineGrainedLineageArray.ProjectionMask, com.linkedin.dataset.FineGrainedLineageArray.ProjectionMask> nestedMask) {
            _fineGrainedLineagesMask = nestedMask.apply(((_fineGrainedLineagesMask == null)?FineGrainedLineageArray.createMask():_fineGrainedLineagesMask));
            getDataMap().put("fineGrainedLineages", _fineGrainedLineagesMask.getDataMap());
            return this;
        }

        /**
         * Fine-grained column-level lineages
         * Not currently supported in the UI
         * Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
         * 
         */
        public DataJobInputOutput.ProjectionMask withFineGrainedLineages() {
            _fineGrainedLineagesMask = null;
            getDataMap().put("fineGrainedLineages", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Fine-grained column-level lineages
         * Not currently supported in the UI
         * Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
         * 
         */
        public DataJobInputOutput.ProjectionMask withFineGrainedLineages(Function<com.linkedin.dataset.FineGrainedLineageArray.ProjectionMask, com.linkedin.dataset.FineGrainedLineageArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _fineGrainedLineagesMask = nestedMask.apply(((_fineGrainedLineagesMask == null)?FineGrainedLineageArray.createMask():_fineGrainedLineagesMask));
            getDataMap().put("fineGrainedLineages", _fineGrainedLineagesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("fineGrainedLineages").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fineGrainedLineages").put("$count", count);
            }
            return this;
        }

        /**
         * Fine-grained column-level lineages
         * Not currently supported in the UI
         * Use UpstreamLineage aspect for datasets to express Column Level Lineage for the UI
         * 
         */
        public DataJobInputOutput.ProjectionMask withFineGrainedLineages(Integer start, Integer count) {
            _fineGrainedLineagesMask = null;
            getDataMap().put("fineGrainedLineages", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("fineGrainedLineages").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fineGrainedLineages").put("$count", count);
            }
            return this;
        }

    }

}
