
package com.linkedin.entity;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * A DataHub 'entity', which is comprised of a set of latest aspects present for the aspect.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/entity/EntityResponse.pdl.")
public class EntityResponse
    extends RecordTemplate
{

    private final static EntityResponse.Fields _fields = new EntityResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.entity/**A DataHub 'entity', which is comprised of a set of latest aspects present for the aspect.\n*/record EntityResponse{/**The entity name\n*/entityName:string/**The entity urn\n*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**A map of aspect name to aspect\n*/aspects:map[string/**An aspect, along with the metadata about it.\nCurrently, an aspect can be either of type 'timestamp' or 'versioned'.\n*/record EnvelopedAspect{/**The name of the aspect\n*/name:string/**The type of the aspect, either timeseries or versioned\n*/type:/**The type of a DataHub aspect*/enum AspectType{/**Designates an aspect that has a monotonically increasing version number*/VERSIONED/**Designates an aspect that represents a point-in-time data point*/TIMESERIES}/**The version of the aspect, only populated if type is 'VERSIONED'\n*/version:optional long/**The timestamp of the aspect, only populated if type is 'TIMESTAMP'\n*/timestamp:optional long/**The raw value of the aspect\n*/value:/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}/**The audit stamp detailing who the aspect was created by and when\n*/created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The system metadata for this aspect\n*/systemMetadata:optional{namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional com.linkedin.common.AuditStamp/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}}]}", SchemaFormatType.PDL));
    private String _entityNameField = null;
    private com.linkedin.common.urn.Urn _urnField = null;
    private EnvelopedAspectMap _aspectsField = null;
    private EntityResponse.ChangeListener __changeListener = new EntityResponse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntityName = SCHEMA.getField("entityName");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public EntityResponse() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public EntityResponse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EntityResponse.Fields fields() {
        return _fields;
    }

    public static EntityResponse.ProjectionMask createMask() {
        return new EntityResponse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entityName
     * 
     * @see EntityResponse.Fields#entityName
     */
    public boolean hasEntityName() {
        if (_entityNameField!= null) {
            return true;
        }
        return super._map.containsKey("entityName");
    }

    /**
     * Remover for entityName
     * 
     * @see EntityResponse.Fields#entityName
     */
    public void removeEntityName() {
        super._map.remove("entityName");
    }

    /**
     * Getter for entityName
     * 
     * @see EntityResponse.Fields#entityName
     */
    @Nullable
    public String getEntityName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityName();
            case DEFAULT:
            case NULL:
                if (_entityNameField!= null) {
                    return _entityNameField;
                } else {
                    Object __rawValue = super._map.get("entityName");
                    _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _entityNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityResponse.Fields#entityName
     */
    @Nonnull
    public String getEntityName() {
        if (_entityNameField!= null) {
            return _entityNameField;
        } else {
            Object __rawValue = super._map.get("entityName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityName");
            }
            _entityNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _entityNameField;
        }
    }

    /**
     * Setter for entityName
     * 
     * @see EntityResponse.Fields#entityName
     */
    public EntityResponse setEntityName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityName of com.linkedin.entity.EntityResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityName", value);
                    _entityNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityResponse.Fields#entityName
     */
    public EntityResponse setEntityName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityName of com.linkedin.entity.EntityResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityName", value);
            _entityNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see EntityResponse.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see EntityResponse.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see EntityResponse.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityResponse.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see EntityResponse.Fields#urn
     */
    public EntityResponse setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.entity.EntityResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityResponse.Fields#urn
     */
    public EntityResponse setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.entity.EntityResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see EntityResponse.Fields#aspects
     */
    public boolean hasAspects() {
        if (_aspectsField!= null) {
            return true;
        }
        return super._map.containsKey("aspects");
    }

    /**
     * Remover for aspects
     * 
     * @see EntityResponse.Fields#aspects
     */
    public void removeAspects() {
        super._map.remove("aspects");
    }

    /**
     * Getter for aspects
     * 
     * @see EntityResponse.Fields#aspects
     */
    @Nullable
    public EnvelopedAspectMap getAspects(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspects();
            case DEFAULT:
            case NULL:
                if (_aspectsField!= null) {
                    return _aspectsField;
                } else {
                    Object __rawValue = super._map.get("aspects");
                    _aspectsField = ((__rawValue == null)?null:new EnvelopedAspectMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _aspectsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EntityResponse.Fields#aspects
     */
    @Nonnull
    public EnvelopedAspectMap getAspects() {
        if (_aspectsField!= null) {
            return _aspectsField;
        } else {
            Object __rawValue = super._map.get("aspects");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspects");
            }
            _aspectsField = ((__rawValue == null)?null:new EnvelopedAspectMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aspectsField;
        }
    }

    /**
     * Setter for aspects
     * 
     * @see EntityResponse.Fields#aspects
     */
    public EntityResponse setAspects(
        @Nullable
        EnvelopedAspectMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspects(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspects of com.linkedin.entity.EntityResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspects();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
                    _aspectsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EntityResponse.Fields#aspects
     */
    public EntityResponse setAspects(
        @Nonnull
        EnvelopedAspectMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspects of com.linkedin.entity.EntityResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspects", value.data());
            _aspectsField = value;
        }
        return this;
    }

    @Override
    public EntityResponse clone()
        throws CloneNotSupportedException
    {
        EntityResponse __clone = ((EntityResponse) super.clone());
        __clone.__changeListener = new EntityResponse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EntityResponse copy()
        throws CloneNotSupportedException
    {
        EntityResponse __copy = ((EntityResponse) super.copy());
        __copy._urnField = null;
        __copy._entityNameField = null;
        __copy._aspectsField = null;
        __copy.__changeListener = new EntityResponse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EntityResponse __objectRef;

        private ChangeListener(EntityResponse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "entityName":
                    __objectRef._entityNameField = null;
                    break;
                case "aspects":
                    __objectRef._aspectsField = null;
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
         * The entity name
         * 
         * 
         */
        public PathSpec entityName() {
            return new PathSpec(getPathComponents(), "entityName");
        }

        /**
         * The entity urn
         * 
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * A map of aspect name to aspect
         * 
         * 
         */
        public com.linkedin.entity.EnvelopedAspectMap.Fields aspects() {
            return new com.linkedin.entity.EnvelopedAspectMap.Fields(getPathComponents(), "aspects");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.entity.EnvelopedAspectMap.ProjectionMask _aspectsMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The entity name
         * 
         * 
         */
        public EntityResponse.ProjectionMask withEntityName() {
            getDataMap().put("entityName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity urn
         * 
         * 
         */
        public EntityResponse.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A map of aspect name to aspect
         * 
         * 
         */
        public EntityResponse.ProjectionMask withAspects(Function<com.linkedin.entity.EnvelopedAspectMap.ProjectionMask, com.linkedin.entity.EnvelopedAspectMap.ProjectionMask> nestedMask) {
            _aspectsMask = nestedMask.apply(((_aspectsMask == null)?EnvelopedAspectMap.createMask():_aspectsMask));
            getDataMap().put("aspects", _aspectsMask.getDataMap());
            return this;
        }

        /**
         * A map of aspect name to aspect
         * 
         * 
         */
        public EntityResponse.ProjectionMask withAspects() {
            _aspectsMask = null;
            getDataMap().put("aspects", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
