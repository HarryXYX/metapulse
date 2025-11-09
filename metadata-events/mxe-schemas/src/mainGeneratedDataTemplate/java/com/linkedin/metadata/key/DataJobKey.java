
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Key for a Data Job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/DataJobKey.pdl.")
public class DataJobKey
    extends RecordTemplate
{

    private final static DataJobKey.Fields _fields = new DataJobKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Data Job*/@Aspect.name=\"dataJobKey\"record DataJobKey{/**Standardized data processing flow urn representing the flow for the job*/@Relationship={\"entityTypes\":[\"dataFlow\"],\"name\":\"IsPartOf\"}@Searchable={\"fieldName\":\"dataFlow\",\"fieldType\":\"URN_PARTIAL\",\"queryByDefault\":false}flow:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Unique Identifier of the data job*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}jobId:string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _flowField = null;
    private String _jobIdField = null;
    private DataJobKey.ChangeListener __changeListener = new DataJobKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Flow = SCHEMA.getField("flow");
    private final static RecordDataSchema.Field FIELD_JobId = SCHEMA.getField("jobId");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DataJobKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataJobKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataJobKey.Fields fields() {
        return _fields;
    }

    public static DataJobKey.ProjectionMask createMask() {
        return new DataJobKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public boolean hasFlow() {
        if (_flowField!= null) {
            return true;
        }
        return super._map.containsKey("flow");
    }

    /**
     * Remover for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public void removeFlow() {
        super._map.remove("flow");
    }

    /**
     * Getter for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    @Nullable
    public com.linkedin.common.urn.Urn getFlow(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFlow();
            case DEFAULT:
            case NULL:
                if (_flowField!= null) {
                    return _flowField;
                } else {
                    Object __rawValue = super._map.get("flow");
                    _flowField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _flowField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for flow
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobKey.Fields#flow
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getFlow() {
        if (_flowField!= null) {
            return _flowField;
        } else {
            Object __rawValue = super._map.get("flow");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("flow");
            }
            _flowField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _flowField;
        }
    }

    /**
     * Setter for flow
     * 
     * @see DataJobKey.Fields#flow
     */
    public DataJobKey setFlow(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFlow(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field flow of com.linkedin.metadata.key.DataJobKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "flow", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _flowField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFlow();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "flow", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _flowField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "flow", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _flowField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for flow
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobKey.Fields#flow
     */
    public DataJobKey setFlow(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field flow of com.linkedin.metadata.key.DataJobKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "flow", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _flowField = value;
        }
        return this;
    }

    /**
     * Existence checker for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public boolean hasJobId() {
        if (_jobIdField!= null) {
            return true;
        }
        return super._map.containsKey("jobId");
    }

    /**
     * Remover for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public void removeJobId() {
        super._map.remove("jobId");
    }

    /**
     * Getter for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    @Nullable
    public String getJobId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getJobId();
            case DEFAULT:
            case NULL:
                if (_jobIdField!= null) {
                    return _jobIdField;
                } else {
                    Object __rawValue = super._map.get("jobId");
                    _jobIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _jobIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for jobId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobKey.Fields#jobId
     */
    @Nonnull
    public String getJobId() {
        if (_jobIdField!= null) {
            return _jobIdField;
        } else {
            Object __rawValue = super._map.get("jobId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("jobId");
            }
            _jobIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _jobIdField;
        }
    }

    /**
     * Setter for jobId
     * 
     * @see DataJobKey.Fields#jobId
     */
    public DataJobKey setJobId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setJobId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field jobId of com.linkedin.metadata.key.DataJobKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "jobId", value);
                    _jobIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeJobId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "jobId", value);
                    _jobIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "jobId", value);
                    _jobIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for jobId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobKey.Fields#jobId
     */
    public DataJobKey setJobId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field jobId of com.linkedin.metadata.key.DataJobKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "jobId", value);
            _jobIdField = value;
        }
        return this;
    }

    @Override
    public DataJobKey clone()
        throws CloneNotSupportedException
    {
        DataJobKey __clone = ((DataJobKey) super.clone());
        __clone.__changeListener = new DataJobKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataJobKey copy()
        throws CloneNotSupportedException
    {
        DataJobKey __copy = ((DataJobKey) super.copy());
        __copy._jobIdField = null;
        __copy._flowField = null;
        __copy.__changeListener = new DataJobKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataJobKey __objectRef;

        private ChangeListener(DataJobKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "jobId":
                    __objectRef._jobIdField = null;
                    break;
                case "flow":
                    __objectRef._flowField = null;
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
         * Standardized data processing flow urn representing the flow for the job
         * 
         */
        public PathSpec flow() {
            return new PathSpec(getPathComponents(), "flow");
        }

        /**
         * Unique Identifier of the data job
         * 
         */
        public PathSpec jobId() {
            return new PathSpec(getPathComponents(), "jobId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Standardized data processing flow urn representing the flow for the job
         * 
         */
        public DataJobKey.ProjectionMask withFlow() {
            getDataMap().put("flow", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Unique Identifier of the data job
         * 
         */
        public DataJobKey.ProjectionMask withJobId() {
            getDataMap().put("jobId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
