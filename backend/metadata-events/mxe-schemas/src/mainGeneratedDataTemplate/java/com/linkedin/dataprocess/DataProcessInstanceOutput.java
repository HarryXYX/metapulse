
package com.linkedin.dataprocess;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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


/**
 * Information about the outputs of a Data process
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceOutput.pdl.")
public class DataProcessInstanceOutput
    extends RecordTemplate
{

    private final static DataProcessInstanceOutput.Fields _fields = new DataProcessInstanceOutput.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess/**Information about the outputs of a Data process*/@Aspect.name=\"dataProcessInstanceOutput\"record DataProcessInstanceOutput{/**Output assets produced*/@Relationship.`/*`={\"entityTypes\":[\"dataset\",\"mlModel\"],\"name\":\"Produces\"}@Searchable.`/*`={\"addToFilters\":true,\"fieldName\":\"outputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numOutputs\",\"queryByDefault\":false}outputs:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Output assets produced by the data process instance during processing, with additional metadata.\nCounts as lineage.\nWill eventually deprecate the outputs field.*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"outputEdges/*/created/actor\",\"createdOn\":\"outputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"mlModel\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"DataProcessInstanceProduces\",\"properties\":\"outputEdges/*/properties\",\"updatedActor\":\"outputEdges/*/lastModified/actor\",\"updatedOn\":\"outputEdges/*/lastModified/time\"}outputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]}", SchemaFormatType.PDL));
    private UrnArray _outputsField = null;
    private EdgeArray _outputEdgesField = null;
    private DataProcessInstanceOutput.ChangeListener __changeListener = new DataProcessInstanceOutput.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Outputs = SCHEMA.getField("outputs");
    private final static RecordDataSchema.Field FIELD_OutputEdges = SCHEMA.getField("outputEdges");

    public DataProcessInstanceOutput() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataProcessInstanceOutput(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProcessInstanceOutput.Fields fields() {
        return _fields;
    }

    public static DataProcessInstanceOutput.ProjectionMask createMask() {
        return new DataProcessInstanceOutput.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for outputs
     * 
     * @see DataProcessInstanceOutput.Fields#outputs
     */
    public boolean hasOutputs() {
        if (_outputsField!= null) {
            return true;
        }
        return super._map.containsKey("outputs");
    }

    /**
     * Remover for outputs
     * 
     * @see DataProcessInstanceOutput.Fields#outputs
     */
    public void removeOutputs() {
        super._map.remove("outputs");
    }

    /**
     * Getter for outputs
     * 
     * @see DataProcessInstanceOutput.Fields#outputs
     */
    @Nullable
    public UrnArray getOutputs(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOutputs();
            case DEFAULT:
            case NULL:
                if (_outputsField!= null) {
                    return _outputsField;
                } else {
                    Object __rawValue = super._map.get("outputs");
                    _outputsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _outputsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for outputs
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessInstanceOutput.Fields#outputs
     */
    @Nonnull
    public UrnArray getOutputs() {
        if (_outputsField!= null) {
            return _outputsField;
        } else {
            Object __rawValue = super._map.get("outputs");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("outputs");
            }
            _outputsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputsField;
        }
    }

    /**
     * Setter for outputs
     * 
     * @see DataProcessInstanceOutput.Fields#outputs
     */
    public DataProcessInstanceOutput setOutputs(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputs(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field outputs of com.linkedin.dataprocess.DataProcessInstanceOutput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
                    _outputsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
                    _outputsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
                    _outputsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceOutput.Fields#outputs
     */
    public DataProcessInstanceOutput setOutputs(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputs of com.linkedin.dataprocess.DataProcessInstanceOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputs", value.data());
            _outputsField = value;
        }
        return this;
    }

    /**
     * Existence checker for outputEdges
     * 
     * @see DataProcessInstanceOutput.Fields#outputEdges
     */
    public boolean hasOutputEdges() {
        if (_outputEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("outputEdges");
    }

    /**
     * Remover for outputEdges
     * 
     * @see DataProcessInstanceOutput.Fields#outputEdges
     */
    public void removeOutputEdges() {
        super._map.remove("outputEdges");
    }

    /**
     * Getter for outputEdges
     * 
     * @see DataProcessInstanceOutput.Fields#outputEdges
     */
    @Nullable
    public EdgeArray getOutputEdges(GetMode mode) {
        return getOutputEdges();
    }

    /**
     * Getter for outputEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInstanceOutput.Fields#outputEdges
     */
    @Nullable
    public EdgeArray getOutputEdges() {
        if (_outputEdgesField!= null) {
            return _outputEdgesField;
        } else {
            Object __rawValue = super._map.get("outputEdges");
            _outputEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _outputEdgesField;
        }
    }

    /**
     * Setter for outputEdges
     * 
     * @see DataProcessInstanceOutput.Fields#outputEdges
     */
    public DataProcessInstanceOutput setOutputEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOutputEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOutputEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "outputEdges", value.data());
                    _outputEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "outputEdges", value.data());
                    _outputEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for outputEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceOutput.Fields#outputEdges
     */
    public DataProcessInstanceOutput setOutputEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field outputEdges of com.linkedin.dataprocess.DataProcessInstanceOutput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "outputEdges", value.data());
            _outputEdgesField = value;
        }
        return this;
    }

    @Override
    public DataProcessInstanceOutput clone()
        throws CloneNotSupportedException
    {
        DataProcessInstanceOutput __clone = ((DataProcessInstanceOutput) super.clone());
        __clone.__changeListener = new DataProcessInstanceOutput.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessInstanceOutput copy()
        throws CloneNotSupportedException
    {
        DataProcessInstanceOutput __copy = ((DataProcessInstanceOutput) super.copy());
        __copy._outputsField = null;
        __copy._outputEdgesField = null;
        __copy.__changeListener = new DataProcessInstanceOutput.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessInstanceOutput __objectRef;

        private ChangeListener(DataProcessInstanceOutput reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "outputs":
                    __objectRef._outputsField = null;
                    break;
                case "outputEdges":
                    __objectRef._outputEdgesField = null;
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
         * Output assets produced
         * 
         */
        public PathSpec outputs() {
            return new PathSpec(getPathComponents(), "outputs");
        }

        /**
         * Output assets produced
         * 
         */
        public PathSpec outputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Output assets produced by the data process instance during processing, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the outputs field.
         * 
         */
        public com.linkedin.common.EdgeArray.Fields outputEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "outputEdges");
        }

        /**
         * Output assets produced by the data process instance during processing, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the outputs field.
         * 
         */
        public PathSpec outputEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputEdges");
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

        private com.linkedin.common.EdgeArray.ProjectionMask _outputEdgesMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Output assets produced
         * 
         */
        public DataProcessInstanceOutput.ProjectionMask withOutputs() {
            getDataMap().put("outputs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Output assets produced
         * 
         */
        public DataProcessInstanceOutput.ProjectionMask withOutputs(Integer start, Integer count) {
            getDataMap().put("outputs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputs").put("$count", count);
            }
            return this;
        }

        /**
         * Output assets produced by the data process instance during processing, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the outputs field.
         * 
         */
        public DataProcessInstanceOutput.ProjectionMask withOutputEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _outputEdgesMask = nestedMask.apply(((_outputEdgesMask == null)?EdgeArray.createMask():_outputEdgesMask));
            getDataMap().put("outputEdges", _outputEdgesMask.getDataMap());
            return this;
        }

        /**
         * Output assets produced by the data process instance during processing, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the outputs field.
         * 
         */
        public DataProcessInstanceOutput.ProjectionMask withOutputEdges() {
            _outputEdgesMask = null;
            getDataMap().put("outputEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Output assets produced by the data process instance during processing, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the outputs field.
         * 
         */
        public DataProcessInstanceOutput.ProjectionMask withOutputEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _outputEdgesMask = nestedMask.apply(((_outputEdgesMask == null)?EdgeArray.createMask():_outputEdgesMask));
            getDataMap().put("outputEdges", _outputEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("outputEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Output assets produced by the data process instance during processing, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the outputs field.
         * 
         */
        public DataProcessInstanceOutput.ProjectionMask withOutputEdges(Integer start, Integer count) {
            _outputEdgesMask = null;
            getDataMap().put("outputEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("outputEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("outputEdges").put("$count", count);
            }
            return this;
        }

    }

}
