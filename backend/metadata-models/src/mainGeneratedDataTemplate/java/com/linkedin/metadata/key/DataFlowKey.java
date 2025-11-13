
package com.linkedin.metadata.key;

import java.util.List;
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
 * Key for a Data Flow
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/DataFlowKey.pdl.")
public class DataFlowKey
    extends RecordTemplate
{

    private final static DataFlowKey.Fields _fields = new DataFlowKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Flow*/@Aspect.name=\"dataFlowKey\"record DataFlowKey{/**Workflow manager like azkaban, airflow which orchestrates the flow*/@Searchable.fieldType=\"TEXT_PARTIAL\"orchestrator:string/**Unique Identifier of the data flow*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}flowId:string/**Cluster where the flow is executed*/@Searchable.fieldType=\"TEXT_PARTIAL\"cluster:string}", SchemaFormatType.PDL));
    private String _orchestratorField = null;
    private String _flowIdField = null;
    private String _clusterField = null;
    private DataFlowKey.ChangeListener __changeListener = new DataFlowKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_FlowId = SCHEMA.getField("flowId");
    private final static RecordDataSchema.Field FIELD_Cluster = SCHEMA.getField("cluster");

    public DataFlowKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataFlowKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataFlowKey.Fields fields() {
        return _fields;
    }

    public static DataFlowKey.ProjectionMask createMask() {
        return new DataFlowKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        if (_orchestratorField!= null) {
            return true;
        }
        return super._map.containsKey("orchestrator");
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public void removeOrchestrator() {
        super._map.remove("orchestrator");
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOrchestrator();
            case DEFAULT:
            case NULL:
                if (_orchestratorField!= null) {
                    return _orchestratorField;
                } else {
                    Object __rawValue = super._map.get("orchestrator");
                    _orchestratorField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _orchestratorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowKey.Fields#orchestrator
     */
    @Nonnull
    public String getOrchestrator() {
        if (_orchestratorField!= null) {
            return _orchestratorField;
        } else {
            Object __rawValue = super._map.get("orchestrator");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("orchestrator");
            }
            _orchestratorField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _orchestratorField;
        }
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataFlowKey.Fields#orchestrator
     */
    public DataFlowKey setOrchestrator(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOrchestrator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field orchestrator of com.linkedin.metadata.key.DataFlowKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
                    _orchestratorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOrchestrator();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
                    _orchestratorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
                    _orchestratorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowKey.Fields#orchestrator
     */
    public DataFlowKey setOrchestrator(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field orchestrator of com.linkedin.metadata.key.DataFlowKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "orchestrator", value);
            _orchestratorField = value;
        }
        return this;
    }

    /**
     * Existence checker for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public boolean hasFlowId() {
        if (_flowIdField!= null) {
            return true;
        }
        return super._map.containsKey("flowId");
    }

    /**
     * Remover for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public void removeFlowId() {
        super._map.remove("flowId");
    }

    /**
     * Getter for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    @Nullable
    public String getFlowId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFlowId();
            case DEFAULT:
            case NULL:
                if (_flowIdField!= null) {
                    return _flowIdField;
                } else {
                    Object __rawValue = super._map.get("flowId");
                    _flowIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _flowIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for flowId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowKey.Fields#flowId
     */
    @Nonnull
    public String getFlowId() {
        if (_flowIdField!= null) {
            return _flowIdField;
        } else {
            Object __rawValue = super._map.get("flowId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("flowId");
            }
            _flowIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _flowIdField;
        }
    }

    /**
     * Setter for flowId
     * 
     * @see DataFlowKey.Fields#flowId
     */
    public DataFlowKey setFlowId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFlowId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field flowId of com.linkedin.metadata.key.DataFlowKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "flowId", value);
                    _flowIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFlowId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "flowId", value);
                    _flowIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "flowId", value);
                    _flowIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for flowId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowKey.Fields#flowId
     */
    public DataFlowKey setFlowId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field flowId of com.linkedin.metadata.key.DataFlowKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "flowId", value);
            _flowIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public boolean hasCluster() {
        if (_clusterField!= null) {
            return true;
        }
        return super._map.containsKey("cluster");
    }

    /**
     * Remover for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public void removeCluster() {
        super._map.remove("cluster");
    }

    /**
     * Getter for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    @Nullable
    public String getCluster(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCluster();
            case DEFAULT:
            case NULL:
                if (_clusterField!= null) {
                    return _clusterField;
                } else {
                    Object __rawValue = super._map.get("cluster");
                    _clusterField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _clusterField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for cluster
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowKey.Fields#cluster
     */
    @Nonnull
    public String getCluster() {
        if (_clusterField!= null) {
            return _clusterField;
        } else {
            Object __rawValue = super._map.get("cluster");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("cluster");
            }
            _clusterField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _clusterField;
        }
    }

    /**
     * Setter for cluster
     * 
     * @see DataFlowKey.Fields#cluster
     */
    public DataFlowKey setCluster(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCluster(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field cluster of com.linkedin.metadata.key.DataFlowKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cluster", value);
                    _clusterField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCluster();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cluster", value);
                    _clusterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cluster", value);
                    _clusterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cluster
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowKey.Fields#cluster
     */
    public DataFlowKey setCluster(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cluster of com.linkedin.metadata.key.DataFlowKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cluster", value);
            _clusterField = value;
        }
        return this;
    }

    @Override
    public DataFlowKey clone()
        throws CloneNotSupportedException
    {
        DataFlowKey __clone = ((DataFlowKey) super.clone());
        __clone.__changeListener = new DataFlowKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataFlowKey copy()
        throws CloneNotSupportedException
    {
        DataFlowKey __copy = ((DataFlowKey) super.copy());
        __copy._orchestratorField = null;
        __copy._clusterField = null;
        __copy._flowIdField = null;
        __copy.__changeListener = new DataFlowKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataFlowKey __objectRef;

        private ChangeListener(DataFlowKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "orchestrator":
                    __objectRef._orchestratorField = null;
                    break;
                case "cluster":
                    __objectRef._clusterField = null;
                    break;
                case "flowId":
                    __objectRef._flowIdField = null;
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
         * Workflow manager like azkaban, airflow which orchestrates the flow
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Unique Identifier of the data flow
         * 
         */
        public PathSpec flowId() {
            return new PathSpec(getPathComponents(), "flowId");
        }

        /**
         * Cluster where the flow is executed
         * 
         */
        public PathSpec cluster() {
            return new PathSpec(getPathComponents(), "cluster");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Workflow manager like azkaban, airflow which orchestrates the flow
         * 
         */
        public DataFlowKey.ProjectionMask withOrchestrator() {
            getDataMap().put("orchestrator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique Identifier of the data flow
         * 
         */
        public DataFlowKey.ProjectionMask withFlowId() {
            getDataMap().put("flowId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Cluster where the flow is executed
         * 
         */
        public DataFlowKey.ProjectionMask withCluster() {
            getDataMap().put("cluster", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
