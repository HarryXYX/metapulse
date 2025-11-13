
package com.linkedin.mxe;

import java.util.List;
import java.util.function.Function;
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
 * Kafka event for recording a historical version upgrade. Used for backwards incompatible changes to infrastructure that requires infrastructure level blocking changes.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/DataHubUpgradeHistoryEvent.pdl.")
public class DataHubUpgradeHistoryEvent
    extends RecordTemplate
{

    private final static DataHubUpgradeHistoryEvent.Fields _fields = new DataHubUpgradeHistoryEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for recording a historical version upgrade. Used for backwards incompatible changes to infrastructure that requires infrastructure level blocking changes.*/record DataHubUpgradeHistoryEvent{/**Version of the upgrade*/version:string/**A string->string map of custom properties that one might want to attach to an event\n*/systemMetadata:optional/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}", SchemaFormatType.PDL));
    private String _versionField = null;
    private SystemMetadata _systemMetadataField = null;
    private DataHubUpgradeHistoryEvent.ChangeListener __changeListener = new DataHubUpgradeHistoryEvent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_SystemMetadata = SCHEMA.getField("systemMetadata");

    public DataHubUpgradeHistoryEvent() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DataHubUpgradeHistoryEvent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubUpgradeHistoryEvent.Fields fields() {
        return _fields;
    }

    public static DataHubUpgradeHistoryEvent.ProjectionMask createMask() {
        return new DataHubUpgradeHistoryEvent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for version
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#version
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
     * @see DataHubUpgradeHistoryEvent.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#version
     */
    @Nullable
    public String getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _versionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubUpgradeHistoryEvent.Fields#version
     */
    @Nonnull
    public String getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#version
     */
    public DataHubUpgradeHistoryEvent setVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.mxe.DataHubUpgradeHistoryEvent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
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
     * @see DataHubUpgradeHistoryEvent.Fields#version
     */
    public DataHubUpgradeHistoryEvent setVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.mxe.DataHubUpgradeHistoryEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value);
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for systemMetadata
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#systemMetadata
     */
    public boolean hasSystemMetadata() {
        if (_systemMetadataField!= null) {
            return true;
        }
        return super._map.containsKey("systemMetadata");
    }

    /**
     * Remover for systemMetadata
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#systemMetadata
     */
    public void removeSystemMetadata() {
        super._map.remove("systemMetadata");
    }

    /**
     * Getter for systemMetadata
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#systemMetadata
     */
    @Nullable
    public SystemMetadata getSystemMetadata(GetMode mode) {
        return getSystemMetadata();
    }

    /**
     * Getter for systemMetadata
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataHubUpgradeHistoryEvent.Fields#systemMetadata
     */
    @Nullable
    public SystemMetadata getSystemMetadata() {
        if (_systemMetadataField!= null) {
            return _systemMetadataField;
        } else {
            Object __rawValue = super._map.get("systemMetadata");
            _systemMetadataField = ((__rawValue == null)?null:new SystemMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _systemMetadataField;
        }
    }

    /**
     * Setter for systemMetadata
     * 
     * @see DataHubUpgradeHistoryEvent.Fields#systemMetadata
     */
    public DataHubUpgradeHistoryEvent setSystemMetadata(
        @Nullable
        SystemMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSystemMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSystemMetadata();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
                    _systemMetadataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
                    _systemMetadataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for systemMetadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubUpgradeHistoryEvent.Fields#systemMetadata
     */
    public DataHubUpgradeHistoryEvent setSystemMetadata(
        @Nonnull
        SystemMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field systemMetadata of com.linkedin.mxe.DataHubUpgradeHistoryEvent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
            _systemMetadataField = value;
        }
        return this;
    }

    @Override
    public DataHubUpgradeHistoryEvent clone()
        throws CloneNotSupportedException
    {
        DataHubUpgradeHistoryEvent __clone = ((DataHubUpgradeHistoryEvent) super.clone());
        __clone.__changeListener = new DataHubUpgradeHistoryEvent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubUpgradeHistoryEvent copy()
        throws CloneNotSupportedException
    {
        DataHubUpgradeHistoryEvent __copy = ((DataHubUpgradeHistoryEvent) super.copy());
        __copy._systemMetadataField = null;
        __copy._versionField = null;
        __copy.__changeListener = new DataHubUpgradeHistoryEvent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubUpgradeHistoryEvent __objectRef;

        private ChangeListener(DataHubUpgradeHistoryEvent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "systemMetadata":
                    __objectRef._systemMetadataField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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
         * Version of the upgrade
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * A string->string map of custom properties that one might want to attach to an event
         * 
         * 
         */
        public com.linkedin.mxe.SystemMetadata.Fields systemMetadata() {
            return new com.linkedin.mxe.SystemMetadata.Fields(getPathComponents(), "systemMetadata");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.mxe.SystemMetadata.ProjectionMask _systemMetadataMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Version of the upgrade
         * 
         */
        public DataHubUpgradeHistoryEvent.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A string->string map of custom properties that one might want to attach to an event
         * 
         * 
         */
        public DataHubUpgradeHistoryEvent.ProjectionMask withSystemMetadata(Function<com.linkedin.mxe.SystemMetadata.ProjectionMask, com.linkedin.mxe.SystemMetadata.ProjectionMask> nestedMask) {
            _systemMetadataMask = nestedMask.apply(((_systemMetadataMask == null)?SystemMetadata.createMask():_systemMetadataMask));
            getDataMap().put("systemMetadata", _systemMetadataMask.getDataMap());
            return this;
        }

        /**
         * A string->string map of custom properties that one might want to attach to an event
         * 
         * 
         */
        public DataHubUpgradeHistoryEvent.ProjectionMask withSystemMetadata() {
            _systemMetadataMask = null;
            getDataMap().put("systemMetadata", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
