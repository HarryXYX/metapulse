
package com.linkedin.entity;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.mxe.SystemMetadata;


/**
 * An aspect, along with the metadata about it.
 * Currently, an aspect can be either of type 'timestamp' or 'versioned'.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/entity/EnvelopedAspect.pdl.")
public class EnvelopedAspect
    extends RecordTemplate
{

    private final static EnvelopedAspect.Fields _fields = new EnvelopedAspect.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.entity/**An aspect, along with the metadata about it.\nCurrently, an aspect can be either of type 'timestamp' or 'versioned'.\n*/record EnvelopedAspect{/**The name of the aspect\n*/name:string/**The type of the aspect, either timeseries or versioned\n*/type:/**The type of a DataHub aspect*/enum AspectType{/**Designates an aspect that has a monotonically increasing version number*/VERSIONED/**Designates an aspect that represents a point-in-time data point*/TIMESERIES}/**The version of the aspect, only populated if type is 'VERSIONED'\n*/version:optional long/**The timestamp of the aspect, only populated if type is 'TIMESTAMP'\n*/timestamp:optional long/**The raw value of the aspect\n*/value:/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}/**The audit stamp detailing who the aspect was created by and when\n*/created:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**The system metadata for this aspect\n*/systemMetadata:optional{namespace com.linkedin.mxe/**Metadata associated with each metadata change that is processed by the system*/@Aspect.name=\"systemMetadata\"record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The original run id that produced the metadata. Populated in case of batch-ingestion.*/runId:optional string=\"no-run-id-provided\"/**The last run id that produced the metadata. Populated in case of batch-ingestion.*/lastRunId:optional string=\"no-run-id-provided\"/**The ingestion pipeline id that produced the metadata. Populated in case of batch ingestion.*/pipelineName:optional string/**The model registry name that was used to process this event*/registryName:optional string/**The model registry version that was used to process this event*/registryVersion:optional string/**Additional properties*/properties:optional map[string,string]/**Aspect version\n   Initial implementation will use the aspect version's number, however stored as\n   a string in the case where a different aspect versioning scheme is later adopted.*/version:optional string/**When the aspect was initially created and who created it, detected by version 0 -> 1 change*/aspectCreated:optional com.linkedin.common.AuditStamp/**When the aspect was last modified and the actor that performed the modification*/aspectModified:optional com.linkedin.common.AuditStamp}}}", SchemaFormatType.PDL));
    private String _nameField = null;
    private AspectType _typeField = null;
    private Long _versionField = null;
    private Long _timestampField = null;
    private Aspect _valueField = null;
    private AuditStamp _createdField = null;
    private SystemMetadata _systemMetadataField = null;
    private EnvelopedAspect.ChangeListener __changeListener = new EnvelopedAspect.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Timestamp = SCHEMA.getField("timestamp");
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_SystemMetadata = SCHEMA.getField("systemMetadata");

    public EnvelopedAspect() {
        super(new DataMap(10, 0.75F), SCHEMA, 4);
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
     * Existence checker for name
     * 
     * @see EnvelopedAspect.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see EnvelopedAspect.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see EnvelopedAspect.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see EnvelopedAspect.Fields#name
     */
    public EnvelopedAspect setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.entity.EnvelopedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#name
     */
    public EnvelopedAspect setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.entity.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see EnvelopedAspect.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see EnvelopedAspect.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see EnvelopedAspect.Fields#type
     */
    @Nullable
    public AspectType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AspectType.class, AspectType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#type
     */
    @Nonnull
    public AspectType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AspectType.class, AspectType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see EnvelopedAspect.Fields#type
     */
    public EnvelopedAspect setType(
        @Nullable
        AspectType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.entity.EnvelopedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#type
     */
    public EnvelopedAspect setType(
        @Nonnull
        AspectType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.entity.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see EnvelopedAspect.Fields#version
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
     * @see EnvelopedAspect.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see EnvelopedAspect.Fields#version
     */
    @Nullable
    public Long getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EnvelopedAspect.Fields#version
     */
    @Nullable
    public Long getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see EnvelopedAspect.Fields#version
     */
    public EnvelopedAspect setVersion(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
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
     * @see EnvelopedAspect.Fields#version
     */
    public EnvelopedAspect setVersion(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.entity.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see EnvelopedAspect.Fields#version
     */
    public EnvelopedAspect setVersion(long value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
        _versionField = value;
        return this;
    }

    /**
     * Existence checker for timestamp
     * 
     * @see EnvelopedAspect.Fields#timestamp
     */
    public boolean hasTimestamp() {
        if (_timestampField!= null) {
            return true;
        }
        return super._map.containsKey("timestamp");
    }

    /**
     * Remover for timestamp
     * 
     * @see EnvelopedAspect.Fields#timestamp
     */
    public void removeTimestamp() {
        super._map.remove("timestamp");
    }

    /**
     * Getter for timestamp
     * 
     * @see EnvelopedAspect.Fields#timestamp
     */
    @Nullable
    public Long getTimestamp(GetMode mode) {
        return getTimestamp();
    }

    /**
     * Getter for timestamp
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EnvelopedAspect.Fields#timestamp
     */
    @Nullable
    public Long getTimestamp() {
        if (_timestampField!= null) {
            return _timestampField;
        } else {
            Object __rawValue = super._map.get("timestamp");
            _timestampField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timestampField;
        }
    }

    /**
     * Setter for timestamp
     * 
     * @see EnvelopedAspect.Fields#timestamp
     */
    public EnvelopedAspect setTimestamp(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimestamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
                    _timestampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
                    _timestampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#timestamp
     */
    public EnvelopedAspect setTimestamp(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestamp of com.linkedin.entity.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
            _timestampField = value;
        }
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @see EnvelopedAspect.Fields#timestamp
     */
    public EnvelopedAspect setTimestamp(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
        _timestampField = value;
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see EnvelopedAspect.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see EnvelopedAspect.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see EnvelopedAspect.Fields#value
     */
    @Nullable
    public Aspect getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = ((__rawValue == null)?null:new Aspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#value
     */
    @Nonnull
    public Aspect getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = ((__rawValue == null)?null:new Aspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see EnvelopedAspect.Fields#value
     */
    public EnvelopedAspect setValue(
        @Nullable
        Aspect value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.entity.EnvelopedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#value
     */
    public EnvelopedAspect setValue(
        @Nonnull
        Aspect value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.entity.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value.data());
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see EnvelopedAspect.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see EnvelopedAspect.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see EnvelopedAspect.Fields#created
     */
    @Nullable
    public AuditStamp getCreated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreated();
            case DEFAULT:
            case NULL:
                if (_createdField!= null) {
                    return _createdField;
                } else {
                    Object __rawValue = super._map.get("created");
                    _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _createdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EnvelopedAspect.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("created");
            }
            _createdField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see EnvelopedAspect.Fields#created
     */
    public EnvelopedAspect setCreated(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.entity.EnvelopedAspect");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", value.data());
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EnvelopedAspect.Fields#created
     */
    public EnvelopedAspect setCreated(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.entity.EnvelopedAspect to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", value.data());
            _createdField = value;
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
        return getSystemMetadata();
    }

    /**
     * Getter for systemMetadata
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EnvelopedAspect.Fields#systemMetadata
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
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public EnvelopedAspect setSystemMetadata(
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
     * @see EnvelopedAspect.Fields#systemMetadata
     */
    public EnvelopedAspect setSystemMetadata(
        @Nonnull
        SystemMetadata value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field systemMetadata of com.linkedin.entity.EnvelopedAspect to null");
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
        __copy._createdField = null;
        __copy._nameField = null;
        __copy._typeField = null;
        __copy._systemMetadataField = null;
        __copy._versionField = null;
        __copy._valueField = null;
        __copy._timestampField = null;
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
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "systemMetadata":
                    __objectRef._systemMetadataField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
                    break;
                case "timestamp":
                    __objectRef._timestampField = null;
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
         * The name of the aspect
         * 
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The type of the aspect, either timeseries or versioned
         * 
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The version of the aspect, only populated if type is 'VERSIONED'
         * 
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * The timestamp of the aspect, only populated if type is 'TIMESTAMP'
         * 
         * 
         */
        public PathSpec timestamp() {
            return new PathSpec(getPathComponents(), "timestamp");
        }

        /**
         * The raw value of the aspect
         * 
         * 
         */
        public com.linkedin.entity.Aspect.Fields value() {
            return new com.linkedin.entity.Aspect.Fields(getPathComponents(), "value");
        }

        /**
         * The audit stamp detailing who the aspect was created by and when
         * 
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * The system metadata for this aspect
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

        private com.linkedin.entity.Aspect.ProjectionMask _valueMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _createdMask;
        private com.linkedin.mxe.SystemMetadata.ProjectionMask _systemMetadataMask;

        ProjectionMask() {
            super(10);
        }

        /**
         * The name of the aspect
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the aspect, either timeseries or versioned
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version of the aspect, only populated if type is 'VERSIONED'
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The timestamp of the aspect, only populated if type is 'TIMESTAMP'
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withTimestamp() {
            getDataMap().put("timestamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The raw value of the aspect
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withValue(Function<com.linkedin.entity.Aspect.ProjectionMask, com.linkedin.entity.Aspect.ProjectionMask> nestedMask) {
            _valueMask = nestedMask.apply(((_valueMask == null)?Aspect.createMask():_valueMask));
            getDataMap().put("value", _valueMask.getDataMap());
            return this;
        }

        /**
         * The raw value of the aspect
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withValue() {
            _valueMask = null;
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The audit stamp detailing who the aspect was created by and when
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withCreated(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _createdMask = nestedMask.apply(((_createdMask == null)?AuditStamp.createMask():_createdMask));
            getDataMap().put("created", _createdMask.getDataMap());
            return this;
        }

        /**
         * The audit stamp detailing who the aspect was created by and when
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withCreated(MaskMap nestedMask) {
            getDataMap().put("created", nestedMask.getDataMap());
            return this;
        }

        /**
         * The audit stamp detailing who the aspect was created by and when
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withCreated() {
            _createdMask = null;
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The system metadata for this aspect
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withSystemMetadata(Function<com.linkedin.mxe.SystemMetadata.ProjectionMask, com.linkedin.mxe.SystemMetadata.ProjectionMask> nestedMask) {
            _systemMetadataMask = nestedMask.apply(((_systemMetadataMask == null)?SystemMetadata.createMask():_systemMetadataMask));
            getDataMap().put("systemMetadata", _systemMetadataMask.getDataMap());
            return this;
        }

        /**
         * The system metadata for this aspect
         * 
         * 
         */
        public EnvelopedAspect.ProjectionMask withSystemMetadata() {
            _systemMetadataMask = null;
            getDataMap().put("systemMetadata", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
