
package com.linkedin.ml.metadata;

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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelLineageInfo.pdl.")
public class MLModelLineageInfo
    extends RecordTemplate
{

    private final static MLModelLineageInfo.Fields _fields = new MLModelLineageInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**A set of re-usable fields used to capture lineage information for ML Models and ML Model Groups*/record MLModelLineageInfo{/**List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"name\":\"TrainedBy\"}trainingJobs:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**List of jobs or process instances (if any) that use the model or group.*/@Relationship.`/*`={\"entityTypes\":[\"dataJob\",\"dataProcessInstance\"],\"isLineage\":true,\"isUpstream\":false,\"name\":\"UsedBy\"}downstreamJobs:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private UrnArray _trainingJobsField = null;
    private UrnArray _downstreamJobsField = null;
    private MLModelLineageInfo.ChangeListener __changeListener = new MLModelLineageInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TrainingJobs = SCHEMA.getField("trainingJobs");
    private final static RecordDataSchema.Field FIELD_DownstreamJobs = SCHEMA.getField("downstreamJobs");

    public MLModelLineageInfo() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public MLModelLineageInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLModelLineageInfo.Fields fields() {
        return _fields;
    }

    public static MLModelLineageInfo.ProjectionMask createMask() {
        return new MLModelLineageInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for trainingJobs
     * 
     * @see MLModelLineageInfo.Fields#trainingJobs
     */
    public boolean hasTrainingJobs() {
        if (_trainingJobsField!= null) {
            return true;
        }
        return super._map.containsKey("trainingJobs");
    }

    /**
     * Remover for trainingJobs
     * 
     * @see MLModelLineageInfo.Fields#trainingJobs
     */
    public void removeTrainingJobs() {
        super._map.remove("trainingJobs");
    }

    /**
     * Getter for trainingJobs
     * 
     * @see MLModelLineageInfo.Fields#trainingJobs
     */
    @Nullable
    public UrnArray getTrainingJobs(GetMode mode) {
        return getTrainingJobs();
    }

    /**
     * Getter for trainingJobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelLineageInfo.Fields#trainingJobs
     */
    @Nullable
    public UrnArray getTrainingJobs() {
        if (_trainingJobsField!= null) {
            return _trainingJobsField;
        } else {
            Object __rawValue = super._map.get("trainingJobs");
            _trainingJobsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _trainingJobsField;
        }
    }

    /**
     * Setter for trainingJobs
     * 
     * @see MLModelLineageInfo.Fields#trainingJobs
     */
    public MLModelLineageInfo setTrainingJobs(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTrainingJobs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTrainingJobs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "trainingJobs", value.data());
                    _trainingJobsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "trainingJobs", value.data());
                    _trainingJobsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for trainingJobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelLineageInfo.Fields#trainingJobs
     */
    public MLModelLineageInfo setTrainingJobs(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field trainingJobs of com.linkedin.ml.metadata.MLModelLineageInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "trainingJobs", value.data());
            _trainingJobsField = value;
        }
        return this;
    }

    /**
     * Existence checker for downstreamJobs
     * 
     * @see MLModelLineageInfo.Fields#downstreamJobs
     */
    public boolean hasDownstreamJobs() {
        if (_downstreamJobsField!= null) {
            return true;
        }
        return super._map.containsKey("downstreamJobs");
    }

    /**
     * Remover for downstreamJobs
     * 
     * @see MLModelLineageInfo.Fields#downstreamJobs
     */
    public void removeDownstreamJobs() {
        super._map.remove("downstreamJobs");
    }

    /**
     * Getter for downstreamJobs
     * 
     * @see MLModelLineageInfo.Fields#downstreamJobs
     */
    @Nullable
    public UrnArray getDownstreamJobs(GetMode mode) {
        return getDownstreamJobs();
    }

    /**
     * Getter for downstreamJobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelLineageInfo.Fields#downstreamJobs
     */
    @Nullable
    public UrnArray getDownstreamJobs() {
        if (_downstreamJobsField!= null) {
            return _downstreamJobsField;
        } else {
            Object __rawValue = super._map.get("downstreamJobs");
            _downstreamJobsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _downstreamJobsField;
        }
    }

    /**
     * Setter for downstreamJobs
     * 
     * @see MLModelLineageInfo.Fields#downstreamJobs
     */
    public MLModelLineageInfo setDownstreamJobs(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDownstreamJobs(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDownstreamJobs();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamJobs", value.data());
                    _downstreamJobsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "downstreamJobs", value.data());
                    _downstreamJobsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for downstreamJobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelLineageInfo.Fields#downstreamJobs
     */
    public MLModelLineageInfo setDownstreamJobs(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field downstreamJobs of com.linkedin.ml.metadata.MLModelLineageInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "downstreamJobs", value.data());
            _downstreamJobsField = value;
        }
        return this;
    }

    @Override
    public MLModelLineageInfo clone()
        throws CloneNotSupportedException
    {
        MLModelLineageInfo __clone = ((MLModelLineageInfo) super.clone());
        __clone.__changeListener = new MLModelLineageInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelLineageInfo copy()
        throws CloneNotSupportedException
    {
        MLModelLineageInfo __copy = ((MLModelLineageInfo) super.copy());
        __copy._downstreamJobsField = null;
        __copy._trainingJobsField = null;
        __copy.__changeListener = new MLModelLineageInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelLineageInfo __objectRef;

        private ChangeListener(MLModelLineageInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "downstreamJobs":
                    __objectRef._downstreamJobsField = null;
                    break;
                case "trainingJobs":
                    __objectRef._trainingJobsField = null;
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
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public PathSpec trainingJobs() {
            return new PathSpec(getPathComponents(), "trainingJobs");
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public PathSpec trainingJobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingJobs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public PathSpec downstreamJobs() {
            return new PathSpec(getPathComponents(), "downstreamJobs");
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public PathSpec downstreamJobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreamJobs");
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


        ProjectionMask() {
            super(3);
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public MLModelLineageInfo.ProjectionMask withTrainingJobs() {
            getDataMap().put("trainingJobs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of jobs or process instances (if any) used to train the model or group. Visible in Lineage. Note that ML Models can also be specified as the output of a specific Data Process Instances (runs) via the DataProcessInstanceOutputs aspect.
         * 
         */
        public MLModelLineageInfo.ProjectionMask withTrainingJobs(Integer start, Integer count) {
            getDataMap().put("trainingJobs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("trainingJobs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingJobs").put("$count", count);
            }
            return this;
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public MLModelLineageInfo.ProjectionMask withDownstreamJobs() {
            getDataMap().put("downstreamJobs", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of jobs or process instances (if any) that use the model or group.
         * 
         */
        public MLModelLineageInfo.ProjectionMask withDownstreamJobs(Integer start, Integer count) {
            getDataMap().put("downstreamJobs", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("downstreamJobs").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("downstreamJobs").put("$count", count);
            }
            return this;
        }

    }

}
