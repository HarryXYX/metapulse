
package com.linkedin.metadata.run;

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
import com.linkedin.entity.Aspect;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/AspectRowSummary.pdl.")
public class AspectRowSummary
    extends RecordTemplate
{

    private final static AspectRowSummary.Fields _fields = new AspectRowSummary.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean,aspect:optional{namespace com.linkedin.entity/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}}telemetryTraceId:optional string}", SchemaFormatType.PDL));
    private String _runIdField = null;
    private String _aspectNameField = null;
    private String _urnField = null;
    private Long _timestampField = null;
    private String _metadataField = null;
    private Long _versionField = null;
    private Boolean _keyAspectField = null;
    private Aspect _aspectField = null;
    private String _telemetryTraceIdField = null;
    private AspectRowSummary.ChangeListener __changeListener = new AspectRowSummary.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RunId = SCHEMA.getField("runId");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Timestamp = SCHEMA.getField("timestamp");
    private final static RecordDataSchema.Field FIELD_Metadata = SCHEMA.getField("metadata");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_KeyAspect = SCHEMA.getField("keyAspect");
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_TelemetryTraceId = SCHEMA.getField("telemetryTraceId");

    public AspectRowSummary() {
        super(new DataMap(12, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public AspectRowSummary(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AspectRowSummary.Fields fields() {
        return _fields;
    }

    public static AspectRowSummary.ProjectionMask createMask() {
        return new AspectRowSummary.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for runId
     * 
     * @see AspectRowSummary.Fields#runId
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
     * @see AspectRowSummary.Fields#runId
     */
    public void removeRunId() {
        super._map.remove("runId");
    }

    /**
     * Getter for runId
     * 
     * @see AspectRowSummary.Fields#runId
     */
    @Nullable
    public String getRunId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getRunId();
            case DEFAULT:
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
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#runId
     */
    @Nonnull
    public String getRunId() {
        if (_runIdField!= null) {
            return _runIdField;
        } else {
            Object __rawValue = super._map.get("runId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("runId");
            }
            _runIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _runIdField;
        }
    }

    /**
     * Setter for runId
     * 
     * @see AspectRowSummary.Fields#runId
     */
    public AspectRowSummary setRunId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRunId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field runId of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "runId", value);
                    _runIdField = value;
                }
                break;
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
     * @see AspectRowSummary.Fields#runId
     */
    public AspectRowSummary setRunId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field runId of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "runId", value);
            _runIdField = value;
        }
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public boolean hasAspectName() {
        if (_aspectNameField!= null) {
            return true;
        }
        return super._map.containsKey("aspectName");
    }

    /**
     * Remover for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public void removeAspectName() {
        super._map.remove("aspectName");
    }

    /**
     * Getter for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    @Nullable
    public String getAspectName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectName();
            case DEFAULT:
            case NULL:
                if (_aspectNameField!= null) {
                    return _aspectNameField;
                } else {
                    Object __rawValue = super._map.get("aspectName");
                    _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#aspectName
     */
    @Nonnull
    public String getAspectName() {
        if (_aspectNameField!= null) {
            return _aspectNameField;
        } else {
            Object __rawValue = super._map.get("aspectName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectName");
            }
            _aspectNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectNameField;
        }
    }

    /**
     * Setter for aspectName
     * 
     * @see AspectRowSummary.Fields#aspectName
     */
    public AspectRowSummary setAspectName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectName of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
                    _aspectNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#aspectName
     */
    public AspectRowSummary setAspectName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectName of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectName", value);
            _aspectNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see AspectRowSummary.Fields#urn
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
     * @see AspectRowSummary.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see AspectRowSummary.Fields#urn
     */
    @Nullable
    public String getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see AspectRowSummary.Fields#urn
     */
    @Nonnull
    public String getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see AspectRowSummary.Fields#urn
     */
    public AspectRowSummary setUrn(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", value);
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", value);
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", value);
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
     * @see AspectRowSummary.Fields#urn
     */
    public AspectRowSummary setUrn(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", value);
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
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
     * @see AspectRowSummary.Fields#timestamp
     */
    public void removeTimestamp() {
        super._map.remove("timestamp");
    }

    /**
     * Getter for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    @Nullable
    public Long getTimestamp(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTimestamp();
            case DEFAULT:
            case NULL:
                if (_timestampField!= null) {
                    return _timestampField;
                } else {
                    Object __rawValue = super._map.get("timestamp");
                    _timestampField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timestampField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for timestamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#timestamp
     */
    @Nonnull
    public Long getTimestamp() {
        if (_timestampField!= null) {
            return _timestampField;
        } else {
            Object __rawValue = super._map.get("timestamp");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("timestamp");
            }
            _timestampField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timestampField;
        }
    }

    /**
     * Setter for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public AspectRowSummary setTimestamp(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimestamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field timestamp of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
                    _timestampField = value;
                }
                break;
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
     * @see AspectRowSummary.Fields#timestamp
     */
    public AspectRowSummary setTimestamp(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timestamp of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
            _timestampField = value;
        }
        return this;
    }

    /**
     * Setter for timestamp
     * 
     * @see AspectRowSummary.Fields#timestamp
     */
    public AspectRowSummary setTimestamp(long value) {
        CheckedUtil.putWithoutChecking(super._map, "timestamp", DataTemplateUtil.coerceLongInput(value));
        _timestampField = value;
        return this;
    }

    /**
     * Existence checker for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public boolean hasMetadata() {
        if (_metadataField!= null) {
            return true;
        }
        return super._map.containsKey("metadata");
    }

    /**
     * Remover for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public void removeMetadata() {
        super._map.remove("metadata");
    }

    /**
     * Getter for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    @Nullable
    public String getMetadata(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetadata();
            case DEFAULT:
            case NULL:
                if (_metadataField!= null) {
                    return _metadataField;
                } else {
                    Object __rawValue = super._map.get("metadata");
                    _metadataField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _metadataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metadata
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#metadata
     */
    @Nonnull
    public String getMetadata() {
        if (_metadataField!= null) {
            return _metadataField;
        } else {
            Object __rawValue = super._map.get("metadata");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metadata");
            }
            _metadataField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _metadataField;
        }
    }

    /**
     * Setter for metadata
     * 
     * @see AspectRowSummary.Fields#metadata
     */
    public AspectRowSummary setMetadata(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadata(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metadata of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value);
                    _metadataField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadata();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value);
                    _metadataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadata", value);
                    _metadataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#metadata
     */
    public AspectRowSummary setMetadata(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadata of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadata", value);
            _metadataField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see AspectRowSummary.Fields#version
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
     * @see AspectRowSummary.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    @Nullable
    public Long getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
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
     * @see AspectRowSummary.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public AspectRowSummary setVersion(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
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
     * @see AspectRowSummary.Fields#version
     */
    public AspectRowSummary setVersion(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see AspectRowSummary.Fields#version
     */
    public AspectRowSummary setVersion(long value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
        _versionField = value;
        return this;
    }

    /**
     * Existence checker for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public boolean hasKeyAspect() {
        if (_keyAspectField!= null) {
            return true;
        }
        return super._map.containsKey("keyAspect");
    }

    /**
     * Remover for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public void removeKeyAspect() {
        super._map.remove("keyAspect");
    }

    /**
     * Getter for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    @Nullable
    public Boolean isKeyAspect(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isKeyAspect();
            case DEFAULT:
            case NULL:
                if (_keyAspectField!= null) {
                    return _keyAspectField;
                } else {
                    Object __rawValue = super._map.get("keyAspect");
                    _keyAspectField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _keyAspectField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for keyAspect
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectRowSummary.Fields#keyAspect
     */
    @Nonnull
    public Boolean isKeyAspect() {
        if (_keyAspectField!= null) {
            return _keyAspectField;
        } else {
            Object __rawValue = super._map.get("keyAspect");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("keyAspect");
            }
            _keyAspectField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _keyAspectField;
        }
    }

    /**
     * Setter for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public AspectRowSummary setKeyAspect(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKeyAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field keyAspect of com.linkedin.metadata.run.AspectRowSummary");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keyAspect", value);
                    _keyAspectField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKeyAspect();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "keyAspect", value);
                    _keyAspectField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "keyAspect", value);
                    _keyAspectField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for keyAspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#keyAspect
     */
    public AspectRowSummary setKeyAspect(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field keyAspect of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "keyAspect", value);
            _keyAspectField = value;
        }
        return this;
    }

    /**
     * Setter for keyAspect
     * 
     * @see AspectRowSummary.Fields#keyAspect
     */
    public AspectRowSummary setKeyAspect(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "keyAspect", value);
        _keyAspectField = value;
        return this;
    }

    /**
     * Existence checker for aspect
     * 
     * @see AspectRowSummary.Fields#aspect
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
     * @see AspectRowSummary.Fields#aspect
     */
    public void removeAspect() {
        super._map.remove("aspect");
    }

    /**
     * Getter for aspect
     * 
     * @see AspectRowSummary.Fields#aspect
     */
    @Nullable
    public Aspect getAspect(GetMode mode) {
        return getAspect();
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AspectRowSummary.Fields#aspect
     */
    @Nullable
    public Aspect getAspect() {
        if (_aspectField!= null) {
            return _aspectField;
        } else {
            Object __rawValue = super._map.get("aspect");
            _aspectField = ((__rawValue == null)?null:new Aspect(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aspectField;
        }
    }

    /**
     * Setter for aspect
     * 
     * @see AspectRowSummary.Fields#aspect
     */
    public AspectRowSummary setAspect(
        @Nullable
        Aspect value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see AspectRowSummary.Fields#aspect
     */
    public AspectRowSummary setAspect(
        @Nonnull
        Aspect value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspect of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspect", value.data());
            _aspectField = value;
        }
        return this;
    }

    /**
     * Existence checker for telemetryTraceId
     * 
     * @see AspectRowSummary.Fields#telemetryTraceId
     */
    public boolean hasTelemetryTraceId() {
        if (_telemetryTraceIdField!= null) {
            return true;
        }
        return super._map.containsKey("telemetryTraceId");
    }

    /**
     * Remover for telemetryTraceId
     * 
     * @see AspectRowSummary.Fields#telemetryTraceId
     */
    public void removeTelemetryTraceId() {
        super._map.remove("telemetryTraceId");
    }

    /**
     * Getter for telemetryTraceId
     * 
     * @see AspectRowSummary.Fields#telemetryTraceId
     */
    @Nullable
    public String getTelemetryTraceId(GetMode mode) {
        return getTelemetryTraceId();
    }

    /**
     * Getter for telemetryTraceId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AspectRowSummary.Fields#telemetryTraceId
     */
    @Nullable
    public String getTelemetryTraceId() {
        if (_telemetryTraceIdField!= null) {
            return _telemetryTraceIdField;
        } else {
            Object __rawValue = super._map.get("telemetryTraceId");
            _telemetryTraceIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _telemetryTraceIdField;
        }
    }

    /**
     * Setter for telemetryTraceId
     * 
     * @see AspectRowSummary.Fields#telemetryTraceId
     */
    public AspectRowSummary setTelemetryTraceId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTelemetryTraceId(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTelemetryTraceId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "telemetryTraceId", value);
                    _telemetryTraceIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "telemetryTraceId", value);
                    _telemetryTraceIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for telemetryTraceId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectRowSummary.Fields#telemetryTraceId
     */
    public AspectRowSummary setTelemetryTraceId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field telemetryTraceId of com.linkedin.metadata.run.AspectRowSummary to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "telemetryTraceId", value);
            _telemetryTraceIdField = value;
        }
        return this;
    }

    @Override
    public AspectRowSummary clone()
        throws CloneNotSupportedException
    {
        AspectRowSummary __clone = ((AspectRowSummary) super.clone());
        __clone.__changeListener = new AspectRowSummary.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AspectRowSummary copy()
        throws CloneNotSupportedException
    {
        AspectRowSummary __copy = ((AspectRowSummary) super.copy());
        __copy._urnField = null;
        __copy._keyAspectField = null;
        __copy._aspectNameField = null;
        __copy._metadataField = null;
        __copy._telemetryTraceIdField = null;
        __copy._aspectField = null;
        __copy._runIdField = null;
        __copy._versionField = null;
        __copy._timestampField = null;
        __copy.__changeListener = new AspectRowSummary.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AspectRowSummary __objectRef;

        private ChangeListener(AspectRowSummary reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "keyAspect":
                    __objectRef._keyAspectField = null;
                    break;
                case "aspectName":
                    __objectRef._aspectNameField = null;
                    break;
                case "metadata":
                    __objectRef._metadataField = null;
                    break;
                case "telemetryTraceId":
                    __objectRef._telemetryTraceIdField = null;
                    break;
                case "aspect":
                    __objectRef._aspectField = null;
                    break;
                case "runId":
                    __objectRef._runIdField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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

        public PathSpec runId() {
            return new PathSpec(getPathComponents(), "runId");
        }

        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        public PathSpec timestamp() {
            return new PathSpec(getPathComponents(), "timestamp");
        }

        public PathSpec metadata() {
            return new PathSpec(getPathComponents(), "metadata");
        }

        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        public PathSpec keyAspect() {
            return new PathSpec(getPathComponents(), "keyAspect");
        }

        public com.linkedin.entity.Aspect.Fields aspect() {
            return new com.linkedin.entity.Aspect.Fields(getPathComponents(), "aspect");
        }

        public PathSpec telemetryTraceId() {
            return new PathSpec(getPathComponents(), "telemetryTraceId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.entity.Aspect.ProjectionMask _aspectMask;

        ProjectionMask() {
            super(12);
        }

        public AspectRowSummary.ProjectionMask withRunId() {
            getDataMap().put("runId", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withAspectName() {
            getDataMap().put("aspectName", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withTimestamp() {
            getDataMap().put("timestamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withMetadata() {
            getDataMap().put("metadata", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withKeyAspect() {
            getDataMap().put("keyAspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withAspect(Function<com.linkedin.entity.Aspect.ProjectionMask, com.linkedin.entity.Aspect.ProjectionMask> nestedMask) {
            _aspectMask = nestedMask.apply(((_aspectMask == null)?Aspect.createMask():_aspectMask));
            getDataMap().put("aspect", _aspectMask.getDataMap());
            return this;
        }

        public AspectRowSummary.ProjectionMask withAspect() {
            _aspectMask = null;
            getDataMap().put("aspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AspectRowSummary.ProjectionMask withTelemetryTraceId() {
            getDataMap().put("telemetryTraceId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
