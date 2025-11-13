
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
 * Information about the inputs datasets of a Data process
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceInput.pdl.")
public class DataProcessInstanceInput
    extends RecordTemplate
{

    private final static DataProcessInstanceInput.Fields _fields = new DataProcessInstanceInput.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess/**Information about the inputs datasets of a Data process*/@Aspect.name=\"dataProcessInstanceInput\"record DataProcessInstanceInput{/**Input assets consumed*/@Relationship.`/*`={\"entityTypes\":[\"dataset\",\"mlModel\"],\"name\":\"Consumes\"}@Searchable.`/*`={\"addToFilters\":true,\"fieldName\":\"inputs\",\"fieldType\":\"URN\",\"numValuesFieldName\":\"numInputs\",\"queryByDefault\":false}inputs:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Input assets consumed by the data process instance, with additional metadata.\nCounts as lineage.\nWill eventually deprecate the inputs field.*/@Relationship.`/*/destinationUrn`={\"createdActor\":\"inputEdges/*/created/actor\",\"createdOn\":\"inputEdges/*/created/time\",\"entityTypes\":[\"dataset\",\"mlModel\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"DataProcessInstanceConsumes\",\"properties\":\"inputEdges/*/properties\",\"updatedActor\":\"inputEdges/*/lastModified/actor\",\"updatedOn\":\"inputEdges/*/lastModified/time\"}inputEdges:optional array[{namespace com.linkedin.common/**A common structure to represent all edges to entities when used inside aspects as collections\nThis ensures that all edges have common structure around audit-stamps and will support PATCH, time-travel automatically.\n*/record Edge{/**Urn of the source of this relationship edge.\nIf not specified, assumed to be the entity that this aspect belongs to.*/sourceUrn:optional Urn/**Urn of the destination of this relationship edge.*/destinationUrn:Urn/**Audit stamp containing who created this relationship edge and when*/created:optional/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}/**Audit stamp containing who last modified this relationship edge and when*/lastModified:optional AuditStamp/**A generic properties bag that allows us to store specific information on this graph edge.*/properties:optional map[string,string]}}]}", SchemaFormatType.PDL));
    private UrnArray _inputsField = null;
    private EdgeArray _inputEdgesField = null;
    private DataProcessInstanceInput.ChangeListener __changeListener = new DataProcessInstanceInput.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_InputEdges = SCHEMA.getField("inputEdges");

    public DataProcessInstanceInput() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataProcessInstanceInput(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataProcessInstanceInput.Fields fields() {
        return _fields;
    }

    public static DataProcessInstanceInput.ProjectionMask createMask() {
        return new DataProcessInstanceInput.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for inputs
     * 
     * @see DataProcessInstanceInput.Fields#inputs
     */
    public boolean hasInputs() {
        if (_inputsField!= null) {
            return true;
        }
        return super._map.containsKey("inputs");
    }

    /**
     * Remover for inputs
     * 
     * @see DataProcessInstanceInput.Fields#inputs
     */
    public void removeInputs() {
        super._map.remove("inputs");
    }

    /**
     * Getter for inputs
     * 
     * @see DataProcessInstanceInput.Fields#inputs
     */
    @Nullable
    public UrnArray getInputs(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getInputs();
            case DEFAULT:
            case NULL:
                if (_inputsField!= null) {
                    return _inputsField;
                } else {
                    Object __rawValue = super._map.get("inputs");
                    _inputsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _inputsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessInstanceInput.Fields#inputs
     */
    @Nonnull
    public UrnArray getInputs() {
        if (_inputsField!= null) {
            return _inputsField;
        } else {
            Object __rawValue = super._map.get("inputs");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("inputs");
            }
            _inputsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputsField;
        }
    }

    /**
     * Setter for inputs
     * 
     * @see DataProcessInstanceInput.Fields#inputs
     */
    public DataProcessInstanceInput setInputs(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputs(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field inputs of com.linkedin.dataprocess.DataProcessInstanceInput");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
                    _inputsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceInput.Fields#inputs
     */
    public DataProcessInstanceInput setInputs(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputs of com.linkedin.dataprocess.DataProcessInstanceInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputs", value.data());
            _inputsField = value;
        }
        return this;
    }

    /**
     * Existence checker for inputEdges
     * 
     * @see DataProcessInstanceInput.Fields#inputEdges
     */
    public boolean hasInputEdges() {
        if (_inputEdgesField!= null) {
            return true;
        }
        return super._map.containsKey("inputEdges");
    }

    /**
     * Remover for inputEdges
     * 
     * @see DataProcessInstanceInput.Fields#inputEdges
     */
    public void removeInputEdges() {
        super._map.remove("inputEdges");
    }

    /**
     * Getter for inputEdges
     * 
     * @see DataProcessInstanceInput.Fields#inputEdges
     */
    @Nullable
    public EdgeArray getInputEdges(GetMode mode) {
        return getInputEdges();
    }

    /**
     * Getter for inputEdges
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessInstanceInput.Fields#inputEdges
     */
    @Nullable
    public EdgeArray getInputEdges() {
        if (_inputEdgesField!= null) {
            return _inputEdgesField;
        } else {
            Object __rawValue = super._map.get("inputEdges");
            _inputEdgesField = ((__rawValue == null)?null:new EdgeArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _inputEdgesField;
        }
    }

    /**
     * Setter for inputEdges
     * 
     * @see DataProcessInstanceInput.Fields#inputEdges
     */
    public DataProcessInstanceInput setInputEdges(
        @Nullable
        EdgeArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setInputEdges(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeInputEdges();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "inputEdges", value.data());
                    _inputEdgesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "inputEdges", value.data());
                    _inputEdgesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for inputEdges
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessInstanceInput.Fields#inputEdges
     */
    public DataProcessInstanceInput setInputEdges(
        @Nonnull
        EdgeArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field inputEdges of com.linkedin.dataprocess.DataProcessInstanceInput to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "inputEdges", value.data());
            _inputEdgesField = value;
        }
        return this;
    }

    @Override
    public DataProcessInstanceInput clone()
        throws CloneNotSupportedException
    {
        DataProcessInstanceInput __clone = ((DataProcessInstanceInput) super.clone());
        __clone.__changeListener = new DataProcessInstanceInput.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataProcessInstanceInput copy()
        throws CloneNotSupportedException
    {
        DataProcessInstanceInput __copy = ((DataProcessInstanceInput) super.copy());
        __copy._inputsField = null;
        __copy._inputEdgesField = null;
        __copy.__changeListener = new DataProcessInstanceInput.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataProcessInstanceInput __objectRef;

        private ChangeListener(DataProcessInstanceInput reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "inputs":
                    __objectRef._inputsField = null;
                    break;
                case "inputEdges":
                    __objectRef._inputEdgesField = null;
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
         * Input assets consumed
         * 
         */
        public PathSpec inputs() {
            return new PathSpec(getPathComponents(), "inputs");
        }

        /**
         * Input assets consumed
         * 
         */
        public PathSpec inputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Input assets consumed by the data process instance, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the inputs field.
         * 
         */
        public com.linkedin.common.EdgeArray.Fields inputEdges() {
            return new com.linkedin.common.EdgeArray.Fields(getPathComponents(), "inputEdges");
        }

        /**
         * Input assets consumed by the data process instance, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the inputs field.
         * 
         */
        public PathSpec inputEdges(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputEdges");
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

        private com.linkedin.common.EdgeArray.ProjectionMask _inputEdgesMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Input assets consumed
         * 
         */
        public DataProcessInstanceInput.ProjectionMask withInputs() {
            getDataMap().put("inputs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input assets consumed
         * 
         */
        public DataProcessInstanceInput.ProjectionMask withInputs(Integer start, Integer count) {
            getDataMap().put("inputs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputs").put("$count", count);
            }
            return this;
        }

        /**
         * Input assets consumed by the data process instance, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the inputs field.
         * 
         */
        public DataProcessInstanceInput.ProjectionMask withInputEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask) {
            _inputEdgesMask = nestedMask.apply(((_inputEdgesMask == null)?EdgeArray.createMask():_inputEdgesMask));
            getDataMap().put("inputEdges", _inputEdgesMask.getDataMap());
            return this;
        }

        /**
         * Input assets consumed by the data process instance, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the inputs field.
         * 
         */
        public DataProcessInstanceInput.ProjectionMask withInputEdges() {
            _inputEdgesMask = null;
            getDataMap().put("inputEdges", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Input assets consumed by the data process instance, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the inputs field.
         * 
         */
        public DataProcessInstanceInput.ProjectionMask withInputEdges(Function<com.linkedin.common.EdgeArray.ProjectionMask, com.linkedin.common.EdgeArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _inputEdgesMask = nestedMask.apply(((_inputEdgesMask == null)?EdgeArray.createMask():_inputEdgesMask));
            getDataMap().put("inputEdges", _inputEdgesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("inputEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputEdges").put("$count", count);
            }
            return this;
        }

        /**
         * Input assets consumed by the data process instance, with additional metadata.
         * Counts as lineage.
         * Will eventually deprecate the inputs field.
         * 
         */
        public DataProcessInstanceInput.ProjectionMask withInputEdges(Integer start, Integer count) {
            _inputEdgesMask = null;
            getDataMap().put("inputEdges", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("inputEdges").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("inputEdges").put("$count", count);
            }
            return this;
        }

    }

}
