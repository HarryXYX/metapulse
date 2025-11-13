
package com.linkedin.mxe;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
import com.linkedin.data.template.StringMap;


/**
 * Metadata associated with each metadata change that is processed by the system
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/SystemMetadata.pdl.")
public class SystemMetadata
    extends RecordTemplate
{

    private final static SystemMetadata.Fields _fields = new SystemMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}", SchemaFormatType.PDL));
    private Long _lastObservedField = null;
    private String _runIdField = null;
    private String _lastRunIdField = null;
    private String _pipelineNameField = null;
    private String _registryNameField = null;
    private String _registryVersionField = null;
    private StringMap _propertiesField = null;
    private String _versionField = null;
    private AuditStamp _aspectCreatedField = null;
    private AuditStamp _aspectModifiedField = null;
    private SystemMetadata.ChangeListener __changeListener = new SystemMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_LastObserved = SCHEMA.getField("lastObserved");
    private final static Long DEFAULT_LastObserved;
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static String DEFAULT_RunId;
    private final static RecordDataSchema.Field FIELD_LastRunId = SCHEMA.getField("lastRunId");
    private final static String DEFAULT_LastRunId;
    private final static RecordDataSchema.Field FIELD_PipelineName = SCHEMA.getField("pipelineName");
    private final static RecordDataSchema.Field FIELD_RegistryName = SCHEMA.getField("registryName");
    private final static RecordDataSchema.Field FIELD_RegistryVersion = SCHEMA.getField("registryVersion");
    private final static RecordDataSchema.Field FIELD_Properties = SCHEMA.getField("properties");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_AspectCreated = SCHEMA.getField("aspectCreated");
    private final static RecordDataSchema.Field FIELD_AspectModified = SCHEMA.getField("aspectModified");

    static {
        DEFAULT_LastObserved = DataTemplateUtil.coerceLongOutput(FIELD_LastObserved.getDefault());
        DEFAULT_RunId = DataTemplateUtil.coerceStringOutput(FIELD_RunId.getDefault());
        DEFAULT_LastRunId = DataTemplateUtil.coerceStringOutput(FIELD_LastRunId.getDefault());
    }

    public SystemMetadata() {
        super(new DataMap(14, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public SystemMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SystemMetadata.Fields fields() {
        return _fields;
    }

    public static SystemMetadata.ProjectionMask createMask() {
        return new SystemMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public boolean hasLastObserved() {
        if (_lastObservedField!= null) {
            return true;
        }
        return super._map.containsKey("lastObserved");
    }

    /**
     * Remover for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public void removeLastObserved() {
        super._map.remove("lastObserved");
    }

    /**
     * Getter for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    @Nullable
    public Long getLastObserved(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getLastObserved();
            case NULL:
                if (_lastObservedField!= null) {
                    return _lastObservedField;
                } else {
                    Object __rawValue = super._map.get("lastObserved");
                    _lastObservedField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _lastObservedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastObserved
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#lastObserved
     */
    @Nullable
    public Long getLastObserved() {
        if (_lastObservedField!= null) {
            return _lastObservedField;
        } else {
            Object __rawValue = super._map.get("lastObserved");
            if (__rawValue == null) {
                return DEFAULT_LastObserved;
            }
            _lastObservedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _lastObservedField;
        }
    }

    /**
     * Setter for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public SystemMetadata setLastObserved(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastObserved(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastObserved();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastObserved", DataTemplateUtil.coerceLongInput(value));
                    _lastObservedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastObserved", DataTemplateUtil.coerceLongInput(value));
                    _lastObservedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastObserved
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#lastObserved
     */
    public SystemMetadata setLastObserved(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastObserved of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastObserved", DataTemplateUtil.coerceLongInput(value));
            _lastObservedField = value;
        }
        return this;
    }

    /**
     * Setter for lastObserved
     * 
     * @see SystemMetadata.Fields#lastObserved
     */
    public SystemMetadata setLastObserved(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastObserved", DataTemplateUtil.coerceLongInput(value));
        _lastObservedField = value;
        return this;
    }

    /**
     * Existence checker for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public boolean hasRunId() {
        if (_runIdField!= null) {
            return true;
        }
        return super._map.containsKey("runId");
    }

    /**
     * Remover for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public void removeRunId() {
        super._map.remove("runId");
    }

    /**
     * Getter for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    @Nullable
    public String getRunId(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getRunId();
            case NULL:
                if (_runIdField!= null) {
                    return _runIdField;
                } else {
                    Object __rawValue = super._map.get("runId");
                    _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _runIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for runId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#runId
     */
    @Nullable
    public String getRunId() {
        if (_runIdField!= null) {
            return _runIdField;
        } else {
            Object __rawValue = super._map.get("runId");
            if (__rawValue == null) {
                return DEFAULT_RunId;
            }
            _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _runIdField;
        }
    }

    /**
     * Setter for runId
     * 
     * @see SystemMetadata.Fields#runId
     */
    public SystemMetadata setRunId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRunId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRunId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for runId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#runId
     */
    public SystemMetadata setRunId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field runId of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "runId", value);
            _runIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastRunId
     * 
     * @see SystemMetadata.Fields#lastRunId
     */
    public boolean hasLastRunId() {
        if (_lastRunIdField!= null) {
            return true;
        }
        return super._map.containsKey("lastRunId");
    }

    /**
     * Remover for lastRunId
     * 
     * @see SystemMetadata.Fields#lastRunId
     */
    public void removeLastRunId() {
        super._map.remove("lastRunId");
    }

    /**
     * Getter for lastRunId
     * 
     * @see SystemMetadata.Fields#lastRunId
     */
    @Nullable
    public String getLastRunId(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getLastRunId();
            case NULL:
                if (_lastRunIdField!= null) {
                    return _lastRunIdField;
                } else {
                    Object __rawValue = super._map.get("lastRunId");
                    _lastRunIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _lastRunIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastRunId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#lastRunId
     */
    @Nullable
    public String getLastRunId() {
        if (_lastRunIdField!= null) {
            return _lastRunIdField;
        } else {
            Object __rawValue = super._map.get("lastRunId");
            if (__rawValue == null) {
                return DEFAULT_LastRunId;
            }
            _lastRunIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _lastRunIdField;
        }
    }

    /**
     * Setter for lastRunId
     * 
     * @see SystemMetadata.Fields#lastRunId
     */
    public SystemMetadata setLastRunId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastRunId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastRunId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastRunId", value);
                    _lastRunIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastRunId", value);
                    _lastRunIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastRunId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#lastRunId
     */
    public SystemMetadata setLastRunId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastRunId of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastRunId", value);
            _lastRunIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for pipelineName
     * 
     * @see SystemMetadata.Fields#pipelineName
     */
    public boolean hasPipelineName() {
        if (_pipelineNameField!= null) {
            return true;
        }
        return super._map.containsKey("pipelineName");
    }

    /**
     * Remover for pipelineName
     * 
     * @see SystemMetadata.Fields#pipelineName
     */
    public void removePipelineName() {
        super._map.remove("pipelineName");
    }

    /**
     * Getter for pipelineName
     * 
     * @see SystemMetadata.Fields#pipelineName
     */
    @Nullable
    public String getPipelineName(GetMode mode) {
        return getPipelineName();
    }

    /**
     * Getter for pipelineName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#pipelineName
     */
    @Nullable
    public String getPipelineName() {
        if (_pipelineNameField!= null) {
            return _pipelineNameField;
        } else {
            Object __rawValue = super._map.get("pipelineName");
            _pipelineNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _pipelineNameField;
        }
    }

    /**
     * Setter for pipelineName
     * 
     * @see SystemMetadata.Fields#pipelineName
     */
    public SystemMetadata setPipelineName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPipelineName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePipelineName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pipelineName", value);
                    _pipelineNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pipelineName", value);
                    _pipelineNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pipelineName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#pipelineName
     */
    public SystemMetadata setPipelineName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pipelineName of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pipelineName", value);
            _pipelineNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for registryName
     * 
     * @see SystemMetadata.Fields#registryName
     */
    public boolean hasRegistryName() {
        if (_registryNameField!= null) {
            return true;
        }
        return super._map.containsKey("registryName");
    }

    /**
     * Remover for registryName
     * 
     * @see SystemMetadata.Fields#registryName
     */
    public void removeRegistryName() {
        super._map.remove("registryName");
    }

    /**
     * Getter for registryName
     * 
     * @see SystemMetadata.Fields#registryName
     */
    @Nullable
    public String getRegistryName(GetMode mode) {
        return getRegistryName();
    }

    /**
     * Getter for registryName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#registryName
     */
    @Nullable
    public String getRegistryName() {
        if (_registryNameField!= null) {
            return _registryNameField;
        } else {
            Object __rawValue = super._map.get("registryName");
            _registryNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _registryNameField;
        }
    }

    /**
     * Setter for registryName
     * 
     * @see SystemMetadata.Fields#registryName
     */
    public SystemMetadata setRegistryName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRegistryName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRegistryName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "registryName", value);
                    _registryNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "registryName", value);
                    _registryNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for registryName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#registryName
     */
    public SystemMetadata setRegistryName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field registryName of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "registryName", value);
            _registryNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for registryVersion
     * 
     * @see SystemMetadata.Fields#registryVersion
     */
    public boolean hasRegistryVersion() {
        if (_registryVersionField!= null) {
            return true;
        }
        return super._map.containsKey("registryVersion");
    }

    /**
     * Remover for registryVersion
     * 
     * @see SystemMetadata.Fields#registryVersion
     */
    public void removeRegistryVersion() {
        super._map.remove("registryVersion");
    }

    /**
     * Getter for registryVersion
     * 
     * @see SystemMetadata.Fields#registryVersion
     */
    @Nullable
    public String getRegistryVersion(GetMode mode) {
        return getRegistryVersion();
    }

    /**
     * Getter for registryVersion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#registryVersion
     */
    @Nullable
    public String getRegistryVersion() {
        if (_registryVersionField!= null) {
            return _registryVersionField;
        } else {
            Object __rawValue = super._map.get("registryVersion");
            _registryVersionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _registryVersionField;
        }
    }

    /**
     * Setter for registryVersion
     * 
     * @see SystemMetadata.Fields#registryVersion
     */
    public SystemMetadata setRegistryVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRegistryVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRegistryVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "registryVersion", value);
                    _registryVersionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "registryVersion", value);
                    _registryVersionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for registryVersion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#registryVersion
     */
    public SystemMetadata setRegistryVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field registryVersion of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "registryVersion", value);
            _registryVersionField = value;
        }
        return this;
    }

    /**
     * Existence checker for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public boolean hasProperties() {
        if (_propertiesField!= null) {
            return true;
        }
        return super._map.containsKey("properties");
    }

    /**
     * Remover for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public void removeProperties() {
        super._map.remove("properties");
    }

    /**
     * Getter for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    @Nullable
    public StringMap getProperties(GetMode mode) {
        return getProperties();
    }

    /**
     * Getter for properties
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#properties
     */
    @Nullable
    public StringMap getProperties() {
        if (_propertiesField!= null) {
            return _propertiesField;
        } else {
            Object __rawValue = super._map.get("properties");
            _propertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _propertiesField;
        }
    }

    /**
     * Setter for properties
     * 
     * @see SystemMetadata.Fields#properties
     */
    public SystemMetadata setProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
                    _propertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for properties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#properties
     */
    public SystemMetadata setProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field properties of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "properties", value.data());
            _propertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see SystemMetadata.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see SystemMetadata.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see SystemMetadata.Fields#version
     */
    @Nullable
    public String getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#version
     */
    @Nullable
    public String getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see SystemMetadata.Fields#version
     */
    public SystemMetadata setVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#version
     */
    public SystemMetadata setVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value);
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectCreated
     * 
     * @see SystemMetadata.Fields#aspectCreated
     */
    public boolean hasAspectCreated() {
        if (_aspectCreatedField!= null) {
            return true;
        }
        return super._map.containsKey("aspectCreated");
    }

    /**
     * Remover for aspectCreated
     * 
     * @see SystemMetadata.Fields#aspectCreated
     */
    public void removeAspectCreated() {
        super._map.remove("aspectCreated");
    }

    /**
     * Getter for aspectCreated
     * 
     * @see SystemMetadata.Fields#aspectCreated
     */
    @Nullable
    public AuditStamp getAspectCreated(GetMode mode) {
        return getAspectCreated();
    }

    /**
     * Getter for aspectCreated
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#aspectCreated
     */
    @Nullable
    public AuditStamp getAspectCreated() {
        if (_aspectCreatedField!= null) {
            return _aspectCreatedField;
        } else {
            Object __rawValue = super._map.get("aspectCreated");
            _aspectCreatedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aspectCreatedField;
        }
    }

    /**
     * Setter for aspectCreated
     * 
     * @see SystemMetadata.Fields#aspectCreated
     */
    public SystemMetadata setAspectCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectCreated", value.data());
                    _aspectCreatedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectCreated", value.data());
                    _aspectCreatedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectCreated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#aspectCreated
     */
    public SystemMetadata setAspectCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectCreated of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectCreated", value.data());
            _aspectCreatedField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectModified
     * 
     * @see SystemMetadata.Fields#aspectModified
     */
    public boolean hasAspectModified() {
        if (_aspectModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("aspectModified");
    }

    /**
     * Remover for aspectModified
     * 
     * @see SystemMetadata.Fields#aspectModified
     */
    public void removeAspectModified() {
        super._map.remove("aspectModified");
    }

    /**
     * Getter for aspectModified
     * 
     * @see SystemMetadata.Fields#aspectModified
     */
    @Nullable
    public AuditStamp getAspectModified(GetMode mode) {
        return getAspectModified();
    }

    /**
     * Getter for aspectModified
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SystemMetadata.Fields#aspectModified
     */
    @Nullable
    public AuditStamp getAspectModified() {
        if (_aspectModifiedField!= null) {
            return _aspectModifiedField;
        } else {
            Object __rawValue = super._map.get("aspectModified");
            _aspectModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aspectModifiedField;
        }
    }

    /**
     * Setter for aspectModified
     * 
     * @see SystemMetadata.Fields#aspectModified
     */
    public SystemMetadata setAspectModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectModified", value.data());
                    _aspectModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectModified", value.data());
                    _aspectModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SystemMetadata.Fields#aspectModified
     */
    public SystemMetadata setAspectModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectModified of com.linkedin.mxe.SystemMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectModified", value.data());
            _aspectModifiedField = value;
        }
        return this;
    }

    @Override
    public SystemMetadata clone()
        throws CloneNotSupportedException
    {
        SystemMetadata __clone = ((SystemMetadata) super.clone());
        __clone.__changeListener = new SystemMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SystemMetadata copy()
        throws CloneNotSupportedException
    {
        SystemMetadata __copy = ((SystemMetadata) super.copy());
        __copy._pipelineNameField = null;
        __copy._aspectCreatedField = null;
        __copy._lastObservedField = null;
        __copy._registryVersionField = null;
        __copy._lastRunIdField = null;
        __copy._aspectModifiedField = null;
        __copy._runIdField = null;
        __copy._registryNameField = null;
        __copy._versionField = null;
        __copy._propertiesField = null;
        __copy.__changeListener = new SystemMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SystemMetadata __objectRef;

        private ChangeListener(SystemMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "pipelineName":
                    __objectRef._pipelineNameField = null;
                    break;
                case "aspectCreated":
                    __objectRef._aspectCreatedField = null;
                    break;
                case "lastObserved":
                    __objectRef._lastObservedField = null;
                    break;
                case "registryVersion":
                    __objectRef._registryVersionField = null;
                    break;
                case "lastRunId":
                    __objectRef._lastRunIdField = null;
                    break;
                case "aspectModified":
                    __objectRef._aspectModifiedField = null;
                    break;
                case "runId":
                    __objectRef._runIdField = null;
                    break;
                case "registryName":
                    __objectRef._registryNameField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "properties":
                    __objectRef._propertiesField = null;
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
         * The timestamp the metadata was observed at
         * 
         */
        public PathSpec lastObserved() {
            return new PathSpec(getPathComponents(), "lastObserved");
        }

        /**
         * The original run id that produced the metadata. Populated in case of batch-ingestion.
         * 
         */
        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        /**
         * The last run id that produced the metadata. Populated in case of batch-ingestion.
         * 
         */
        public PathSpec lastRunId() {
            return new PathSpec(getPathComponents(), "lastRunId");
        }

        /**
         * The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.
         * 
         */
        public PathSpec pipelineName() {
            return new PathSpec(getPathComponents(), "pipelineName");
        }

        /**
         * The model registry name that was used to process this event
         * 
         */
        public PathSpec registryName() {
            return new PathSpec(getPathComponents(), "registryName");
        }

        /**
         * The model registry version that was used to process this event
         * 
         */
        public PathSpec registryVersion() {
            return new PathSpec(getPathComponents(), "registryVersion");
        }

        /**
         * Additional properties
         * 
         */
        public PathSpec properties() {
            return new PathSpec(getPathComponents(), "properties");
        }

        /**
         * Aspect version
         *    Initial implementation will use the aspect version's number, however stored as
         *    a string in the case where a different aspect versioning scheme is later adopted.
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * When the aspect was initially created and who created it, detected by version 0 -> 1 change
         * 
         */
        public com.linkedin.common.AuditStamp.Fields aspectCreated() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "aspectCreated");
        }

        /**
         * When the aspect was last modified and the actor that performed the modification
         * 
         */
        public com.linkedin.common.AuditStamp.Fields aspectModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "aspectModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _aspectCreatedMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _aspectModifiedMask;

        ProjectionMask() {
            super(14);
        }

        /**
         * The timestamp the metadata was observed at
         * 
         */
        public SystemMetadata.ProjectionMask withLastObserved() {
            getDataMap().put("lastObserved", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The original run id that produced the metadata. Populated in case of batch-ingestion.
         * 
         */
        public SystemMetadata.ProjectionMask withRunId() {
            getDataMap().put("runId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The last run id that produced the metadata. Populated in case of batch-ingestion.
         * 
         */
        public SystemMetadata.ProjectionMask withLastRunId() {
            getDataMap().put("lastRunId", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.
         * 
         */
        public SystemMetadata.ProjectionMask withPipelineName() {
            getDataMap().put("pipelineName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The model registry name that was used to process this event
         * 
         */
        public SystemMetadata.ProjectionMask withRegistryName() {
            getDataMap().put("registryName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The model registry version that was used to process this event
         * 
         */
        public SystemMetadata.ProjectionMask withRegistryVersion() {
            getDataMap().put("registryVersion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional properties
         * 
         */
        public SystemMetadata.ProjectionMask withProperties() {
            getDataMap().put("properties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Aspect version
         *    Initial implementation will use the aspect version's number, however stored as
         *    a string in the case where a different aspect versioning scheme is later adopted.
         * 
         */
        public SystemMetadata.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * When the aspect was initially created and who created it, detected by version 0 -> 1 change
         * 
         */
        public SystemMetadata.ProjectionMask withAspectCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _aspectCreatedMask = nestedMask.apply(((_aspectCreatedMask == null)?AuditStamp.createMask():_aspectCreatedMask));
            getDataMap().put("aspectCreated", _aspectCreatedMask.getDataMap());
            return this;
        }

        /**
         * When the aspect was initially created and who created it, detected by version 0 -> 1 change
         * 
         */
        public SystemMetadata.ProjectionMask withAspectCreated(MaskMap nestedMask) {
            getDataMap().put("aspectCreated", nestedMask.getDataMap());
            return this;
        }

        /**
         * When the aspect was initially created and who created it, detected by version 0 -> 1 change
         * 
         */
        public SystemMetadata.ProjectionMask withAspectCreated() {
            _aspectCreatedMask = null;
            getDataMap().put("aspectCreated", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * When the aspect was last modified and the actor that performed the modification
         * 
         */
        public SystemMetadata.ProjectionMask withAspectModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _aspectModifiedMask = nestedMask.apply(((_aspectModifiedMask == null)?AuditStamp.createMask():_aspectModifiedMask));
            getDataMap().put("aspectModified", _aspectModifiedMask.getDataMap());
            return this;
        }

        /**
         * When the aspect was last modified and the actor that performed the modification
         * 
         */
        public SystemMetadata.ProjectionMask withAspectModified(MaskMap nestedMask) {
            getDataMap().put("aspectModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * When the aspect was last modified and the actor that performed the modification
         * 
         */
        public SystemMetadata.ProjectionMask withAspectModified() {
            _aspectModifiedMask = null;
            getDataMap().put("aspectModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
