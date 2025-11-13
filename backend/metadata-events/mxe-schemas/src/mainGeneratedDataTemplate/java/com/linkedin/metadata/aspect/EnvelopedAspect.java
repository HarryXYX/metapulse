
package com.linkedin.metadata.aspect;

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
import com.linkedin.mxe.GenericAspect;
import com.linkedin.mxe.SystemMetadata;


/**
 * Enveloped record for an aspect.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/EnvelopedAspect.pdl.")
public class EnvelopedAspect
    extends RecordTemplate
{

    private final static EnvelopedAspect.Fields _fields = new EnvelopedAspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**Enveloped record for an aspect.\n*/record EnvelopedAspect{aspect:{namespace com.linkedin.mxe/**Generic record structure for serializing an Aspect\n*/record GenericAspect{/**The value of the aspect, serialized as bytes.*/value:bytes/**The content type, which represents the fashion in which the aspect was serialized.\nThe only type currently supported is application/json.*/contentType:string}}systemMetadata:{namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}}", SchemaFormatType.PDL));
    private GenericAspect _aspectField = null;
    private SystemMetadata _systemMetadataField = null;
    private EnvelopedAspect.ChangeListener __changeListener = new EnvelopedAspect.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_SystemMetadata = SCHEMA.getField("systemMetadata");

    public EnvelopedAspect() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public EnvelopedAspect(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EnvelopedAspect.Fields fields() {
        return _fields;
    }

    public static EnvelopedAspect.ProjectionMask createMask() {
        return new EnvelopedAspect.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public boolean hasAspect() {
        if (_aspectField!= null) {
            return true;
        }
        return super._map.containsKey("aspect");
    }

    /**
     * Remover for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public void removeAspect() {
        super._map.remove("aspect");
    }

    /**
     * Getter for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    @Nullable
    public GenericAspect getAspect(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspect();
            case DEFAULT:
            case NULL:
                if (_aspectField!= null) {
                    return _aspectField;
                } else {
                    Object __rawValue = super._map.get("aspect");
                    _aspectField = ((__rawValue == null)?null:new GenericAspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _aspectField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#aspect
     */
    @Nonnull
    public GenericAspect getAspect() {
        if (_aspectField!= null) {
            return _aspectField;
        } else {
            Object __rawValue = super._map.get("aspect");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspect");
            }
            _aspectField = ((__rawValue == null)?null:new GenericAspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aspectField;
        }
    }

    /**
     * Setter for aspect
     * 
     * @see EnvelopedAspect.Fields#aspect
     */
    public EnvelopedAspect setAspect(
        @Nullable
        GenericAspect value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspect of com.linkedin.metadata.aspect.EnvelopedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
                    _aspectField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspect();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
                    _aspectField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
                    _aspectField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#aspect
     */
    public EnvelopedAspect setAspect(
        @Nonnull
        GenericAspect value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspect of com.linkedin.metadata.aspect.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
            _aspectField = value;
        }
        return this;
    }

    /**
     * Existence checker for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
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
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public void removeSystemMetadata() {
        super._map.remove("systemMetadata");
    }

    /**
     * Getter for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    @Nullable
    public SystemMetadata getSystemMetadata(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSystemMetadata();
            case DEFAULT:
            case NULL:
                if (_systemMetadataField!= null) {
                    return _systemMetadataField;
                } else {
                    Object __rawValue = super._map.get("systemMetadata");
                    _systemMetadataField = ((__rawValue == null)?null:new SystemMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _systemMetadataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for systemMetadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    @Nonnull
    public SystemMetadata getSystemMetadata() {
        if (_systemMetadataField!= null) {
            return _systemMetadataField;
        } else {
            Object __rawValue = super._map.get("systemMetadata");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("systemMetadata");
            }
            _systemMetadataField = ((__rawValue == null)?null:new SystemMetadata(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _systemMetadataField;
        }
    }

    /**
     * Setter for systemMetadata
     * 
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public EnvelopedAspect setSystemMetadata(
        @Nullable
        SystemMetadata value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSystemMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field systemMetadata of com.linkedin.metadata.aspect.EnvelopedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
                    _systemMetadataField = value;
                }
                break;
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
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public EnvelopedAspect setSystemMetadata(
        @Nonnull
        SystemMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field systemMetadata of com.linkedin.metadata.aspect.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "systemMetadata", value.data());
            _systemMetadataField = value;
        }
        return this;
    }

    @Override
    public EnvelopedAspect clone()
        throws CloneNotSupportedException
    {
        EnvelopedAspect __clone = ((EnvelopedAspect) super.clone());
        __clone.__changeListener = new EnvelopedAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EnvelopedAspect copy()
        throws CloneNotSupportedException
    {
        EnvelopedAspect __copy = ((EnvelopedAspect) super.copy());
        __copy._aspectField = null;
        __copy._systemMetadataField = null;
        __copy.__changeListener = new EnvelopedAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EnvelopedAspect __objectRef;

        private ChangeListener(EnvelopedAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspect":
                    __objectRef._aspectField = null;
                    break;
                case "systemMetadata":
                    __objectRef._systemMetadataField = null;
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

        public com.linkedin.mxe.GenericAspect.Fields aspect() {
            return new com.linkedin.mxe.GenericAspect.Fields(getPathComponents(), "aspect");
        }

        public com.linkedin.mxe.SystemMetadata.Fields systemMetadata() {
            return new com.linkedin.mxe.SystemMetadata.Fields(getPathComponents(), "systemMetadata");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.mxe.GenericAspect.ProjectionMask _aspectMask;
        private com.linkedin.mxe.SystemMetadata.ProjectionMask _systemMetadataMask;

        ProjectionMask() {
            super(3);
        }

        public EnvelopedAspect.ProjectionMask withAspect(Function<com.linkedin.mxe.GenericAspect.ProjectionMask, com.linkedin.mxe.GenericAspect.ProjectionMask> nestedMask) {
            _aspectMask = nestedMask.apply(((_aspectMask == null)?GenericAspect.createMask():_aspectMask));
            getDataMap().put("aspect", _aspectMask.getDataMap());
            return this;
        }

        public EnvelopedAspect.ProjectionMask withAspect() {
            _aspectMask = null;
            getDataMap().put("aspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        public EnvelopedAspect.ProjectionMask withSystemMetadata(Function<com.linkedin.mxe.SystemMetadata.ProjectionMask, com.linkedin.mxe.SystemMetadata.ProjectionMask> nestedMask) {
            _systemMetadataMask = nestedMask.apply(((_systemMetadataMask == null)?SystemMetadata.createMask():_systemMetadataMask));
            getDataMap().put("systemMetadata", _systemMetadataMask.getDataMap());
            return this;
        }

        public EnvelopedAspect.ProjectionMask withSystemMetadata() {
            _systemMetadataMask = null;
            getDataMap().put("systemMetadata", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
