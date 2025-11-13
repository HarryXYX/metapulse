
package com.linkedin.metadata.run;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/RollbackResponse.pdl.")
public class RollbackResponse
    extends RecordTemplate
{

    private final static RollbackResponse.Fields _fields = new RollbackResponse.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.run,record RollbackResponse{aspectRowSummaries:array[record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean,aspect:optional{namespace com.linkedin.entity/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}}telemetryTraceId:optional string}]entitiesAffected:long,aspectsAffected:long,entitiesDeleted:optional long,aspectsReverted:optional long,unsafeEntitiesCount:optional long,unsafeEntities:array[/** This record serves as a holder of information for entities that were unsafe to fully delete as part of a rollback operation.*/record UnsafeEntityInfo{/**Name of the entity this aspect information instance refers to.*/urn:string}]}", SchemaFormatType.PDL));
    private AspectRowSummaryArray _aspectRowSummariesField = null;
    private Long _entitiesAffectedField = null;
    private Long _aspectsAffectedField = null;
    private Long _entitiesDeletedField = null;
    private Long _aspectsRevertedField = null;
    private Long _unsafeEntitiesCountField = null;
    private UnsafeEntityInfoArray _unsafeEntitiesField = null;
    private RollbackResponse.ChangeListener __changeListener = new RollbackResponse.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AspectRowSummaries = SCHEMA.getField("aspectRowSummaries");
    private final static RecordDataSchema.Field FIELD_EntitiesAffected = SCHEMA.getField("entitiesAffected");
    private final static RecordDataSchema.Field FIELD_AspectsAffected = SCHEMA.getField("aspectsAffected");
    private final static RecordDataSchema.Field FIELD_EntitiesDeleted = SCHEMA.getField("entitiesDeleted");
    private final static RecordDataSchema.Field FIELD_AspectsReverted = SCHEMA.getField("aspectsReverted");
    private final static RecordDataSchema.Field FIELD_UnsafeEntitiesCount = SCHEMA.getField("unsafeEntitiesCount");
    private final static RecordDataSchema.Field FIELD_UnsafeEntities = SCHEMA.getField("unsafeEntities");

    public RollbackResponse() {
        super(new DataMap(10, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public RollbackResponse(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RollbackResponse.Fields fields() {
        return _fields;
    }

    public static RollbackResponse.ProjectionMask createMask() {
        return new RollbackResponse.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public boolean hasAspectRowSummaries() {
        if (_aspectRowSummariesField!= null) {
            return true;
        }
        return super._map.containsKey("aspectRowSummaries");
    }

    /**
     * Remover for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public void removeAspectRowSummaries() {
        super._map.remove("aspectRowSummaries");
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    @Nullable
    public AspectRowSummaryArray getAspectRowSummaries(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectRowSummaries();
            case DEFAULT:
            case NULL:
                if (_aspectRowSummariesField!= null) {
                    return _aspectRowSummariesField;
                } else {
                    Object __rawValue = super._map.get("aspectRowSummaries");
                    _aspectRowSummariesField = ((__rawValue == null)?null:new AspectRowSummaryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _aspectRowSummariesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectRowSummaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    @Nonnull
    public AspectRowSummaryArray getAspectRowSummaries() {
        if (_aspectRowSummariesField!= null) {
            return _aspectRowSummariesField;
        } else {
            Object __rawValue = super._map.get("aspectRowSummaries");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectRowSummaries");
            }
            _aspectRowSummariesField = ((__rawValue == null)?null:new AspectRowSummaryArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _aspectRowSummariesField;
        }
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public RollbackResponse setAspectRowSummaries(
        @Nullable
        AspectRowSummaryArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectRowSummaries(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectRowSummaries of com.linkedin.metadata.run.RollbackResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
                    _aspectRowSummariesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectRowSummaries();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
                    _aspectRowSummariesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
                    _aspectRowSummariesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectRowSummaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#aspectRowSummaries
     */
    public RollbackResponse setAspectRowSummaries(
        @Nonnull
        AspectRowSummaryArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectRowSummaries of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectRowSummaries", value.data());
            _aspectRowSummariesField = value;
        }
        return this;
    }

    /**
     * Existence checker for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public boolean hasEntitiesAffected() {
        if (_entitiesAffectedField!= null) {
            return true;
        }
        return super._map.containsKey("entitiesAffected");
    }

    /**
     * Remover for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public void removeEntitiesAffected() {
        super._map.remove("entitiesAffected");
    }

    /**
     * Getter for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    @Nullable
    public Long getEntitiesAffected(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntitiesAffected();
            case DEFAULT:
            case NULL:
                if (_entitiesAffectedField!= null) {
                    return _entitiesAffectedField;
                } else {
                    Object __rawValue = super._map.get("entitiesAffected");
                    _entitiesAffectedField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _entitiesAffectedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entitiesAffected
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#entitiesAffected
     */
    @Nonnull
    public Long getEntitiesAffected() {
        if (_entitiesAffectedField!= null) {
            return _entitiesAffectedField;
        } else {
            Object __rawValue = super._map.get("entitiesAffected");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entitiesAffected");
            }
            _entitiesAffectedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _entitiesAffectedField;
        }
    }

    /**
     * Setter for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public RollbackResponse setEntitiesAffected(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntitiesAffected(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entitiesAffected of com.linkedin.metadata.run.RollbackResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesAffected", DataTemplateUtil.coerceLongInput(value));
                    _entitiesAffectedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntitiesAffected();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesAffected", DataTemplateUtil.coerceLongInput(value));
                    _entitiesAffectedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesAffected", DataTemplateUtil.coerceLongInput(value));
                    _entitiesAffectedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entitiesAffected
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public RollbackResponse setEntitiesAffected(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entitiesAffected of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entitiesAffected", DataTemplateUtil.coerceLongInput(value));
            _entitiesAffectedField = value;
        }
        return this;
    }

    /**
     * Setter for entitiesAffected
     * 
     * @see RollbackResponse.Fields#entitiesAffected
     */
    public RollbackResponse setEntitiesAffected(long value) {
        CheckedUtil.putWithoutChecking(super._map, "entitiesAffected", DataTemplateUtil.coerceLongInput(value));
        _entitiesAffectedField = value;
        return this;
    }

    /**
     * Existence checker for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public boolean hasAspectsAffected() {
        if (_aspectsAffectedField!= null) {
            return true;
        }
        return super._map.containsKey("aspectsAffected");
    }

    /**
     * Remover for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public void removeAspectsAffected() {
        super._map.remove("aspectsAffected");
    }

    /**
     * Getter for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    @Nullable
    public Long getAspectsAffected(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspectsAffected();
            case DEFAULT:
            case NULL:
                if (_aspectsAffectedField!= null) {
                    return _aspectsAffectedField;
                } else {
                    Object __rawValue = super._map.get("aspectsAffected");
                    _aspectsAffectedField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _aspectsAffectedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspectsAffected
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#aspectsAffected
     */
    @Nonnull
    public Long getAspectsAffected() {
        if (_aspectsAffectedField!= null) {
            return _aspectsAffectedField;
        } else {
            Object __rawValue = super._map.get("aspectsAffected");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspectsAffected");
            }
            _aspectsAffectedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _aspectsAffectedField;
        }
    }

    /**
     * Setter for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public RollbackResponse setAspectsAffected(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectsAffected(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspectsAffected of com.linkedin.metadata.run.RollbackResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectsAffected", DataTemplateUtil.coerceLongInput(value));
                    _aspectsAffectedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectsAffected();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectsAffected", DataTemplateUtil.coerceLongInput(value));
                    _aspectsAffectedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectsAffected", DataTemplateUtil.coerceLongInput(value));
                    _aspectsAffectedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectsAffected
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public RollbackResponse setAspectsAffected(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectsAffected of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectsAffected", DataTemplateUtil.coerceLongInput(value));
            _aspectsAffectedField = value;
        }
        return this;
    }

    /**
     * Setter for aspectsAffected
     * 
     * @see RollbackResponse.Fields#aspectsAffected
     */
    public RollbackResponse setAspectsAffected(long value) {
        CheckedUtil.putWithoutChecking(super._map, "aspectsAffected", DataTemplateUtil.coerceLongInput(value));
        _aspectsAffectedField = value;
        return this;
    }

    /**
     * Existence checker for entitiesDeleted
     * 
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    public boolean hasEntitiesDeleted() {
        if (_entitiesDeletedField!= null) {
            return true;
        }
        return super._map.containsKey("entitiesDeleted");
    }

    /**
     * Remover for entitiesDeleted
     * 
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    public void removeEntitiesDeleted() {
        super._map.remove("entitiesDeleted");
    }

    /**
     * Getter for entitiesDeleted
     * 
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    @Nullable
    public Long getEntitiesDeleted(GetMode mode) {
        return getEntitiesDeleted();
    }

    /**
     * Getter for entitiesDeleted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    @Nullable
    public Long getEntitiesDeleted() {
        if (_entitiesDeletedField!= null) {
            return _entitiesDeletedField;
        } else {
            Object __rawValue = super._map.get("entitiesDeleted");
            _entitiesDeletedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _entitiesDeletedField;
        }
    }

    /**
     * Setter for entitiesDeleted
     * 
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    public RollbackResponse setEntitiesDeleted(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntitiesDeleted(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntitiesDeleted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesDeleted", DataTemplateUtil.coerceLongInput(value));
                    _entitiesDeletedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesDeleted", DataTemplateUtil.coerceLongInput(value));
                    _entitiesDeletedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entitiesDeleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    public RollbackResponse setEntitiesDeleted(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entitiesDeleted of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entitiesDeleted", DataTemplateUtil.coerceLongInput(value));
            _entitiesDeletedField = value;
        }
        return this;
    }

    /**
     * Setter for entitiesDeleted
     * 
     * @see RollbackResponse.Fields#entitiesDeleted
     */
    public RollbackResponse setEntitiesDeleted(long value) {
        CheckedUtil.putWithoutChecking(super._map, "entitiesDeleted", DataTemplateUtil.coerceLongInput(value));
        _entitiesDeletedField = value;
        return this;
    }

    /**
     * Existence checker for aspectsReverted
     * 
     * @see RollbackResponse.Fields#aspectsReverted
     */
    public boolean hasAspectsReverted() {
        if (_aspectsRevertedField!= null) {
            return true;
        }
        return super._map.containsKey("aspectsReverted");
    }

    /**
     * Remover for aspectsReverted
     * 
     * @see RollbackResponse.Fields#aspectsReverted
     */
    public void removeAspectsReverted() {
        super._map.remove("aspectsReverted");
    }

    /**
     * Getter for aspectsReverted
     * 
     * @see RollbackResponse.Fields#aspectsReverted
     */
    @Nullable
    public Long getAspectsReverted(GetMode mode) {
        return getAspectsReverted();
    }

    /**
     * Getter for aspectsReverted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RollbackResponse.Fields#aspectsReverted
     */
    @Nullable
    public Long getAspectsReverted() {
        if (_aspectsRevertedField!= null) {
            return _aspectsRevertedField;
        } else {
            Object __rawValue = super._map.get("aspectsReverted");
            _aspectsRevertedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _aspectsRevertedField;
        }
    }

    /**
     * Setter for aspectsReverted
     * 
     * @see RollbackResponse.Fields#aspectsReverted
     */
    public RollbackResponse setAspectsReverted(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspectsReverted(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspectsReverted();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspectsReverted", DataTemplateUtil.coerceLongInput(value));
                    _aspectsRevertedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspectsReverted", DataTemplateUtil.coerceLongInput(value));
                    _aspectsRevertedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspectsReverted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#aspectsReverted
     */
    public RollbackResponse setAspectsReverted(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspectsReverted of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspectsReverted", DataTemplateUtil.coerceLongInput(value));
            _aspectsRevertedField = value;
        }
        return this;
    }

    /**
     * Setter for aspectsReverted
     * 
     * @see RollbackResponse.Fields#aspectsReverted
     */
    public RollbackResponse setAspectsReverted(long value) {
        CheckedUtil.putWithoutChecking(super._map, "aspectsReverted", DataTemplateUtil.coerceLongInput(value));
        _aspectsRevertedField = value;
        return this;
    }

    /**
     * Existence checker for unsafeEntitiesCount
     * 
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    public boolean hasUnsafeEntitiesCount() {
        if (_unsafeEntitiesCountField!= null) {
            return true;
        }
        return super._map.containsKey("unsafeEntitiesCount");
    }

    /**
     * Remover for unsafeEntitiesCount
     * 
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    public void removeUnsafeEntitiesCount() {
        super._map.remove("unsafeEntitiesCount");
    }

    /**
     * Getter for unsafeEntitiesCount
     * 
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    @Nullable
    public Long getUnsafeEntitiesCount(GetMode mode) {
        return getUnsafeEntitiesCount();
    }

    /**
     * Getter for unsafeEntitiesCount
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    @Nullable
    public Long getUnsafeEntitiesCount() {
        if (_unsafeEntitiesCountField!= null) {
            return _unsafeEntitiesCountField;
        } else {
            Object __rawValue = super._map.get("unsafeEntitiesCount");
            _unsafeEntitiesCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _unsafeEntitiesCountField;
        }
    }

    /**
     * Setter for unsafeEntitiesCount
     * 
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    public RollbackResponse setUnsafeEntitiesCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUnsafeEntitiesCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUnsafeEntitiesCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unsafeEntitiesCount", DataTemplateUtil.coerceLongInput(value));
                    _unsafeEntitiesCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "unsafeEntitiesCount", DataTemplateUtil.coerceLongInput(value));
                    _unsafeEntitiesCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for unsafeEntitiesCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    public RollbackResponse setUnsafeEntitiesCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field unsafeEntitiesCount of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "unsafeEntitiesCount", DataTemplateUtil.coerceLongInput(value));
            _unsafeEntitiesCountField = value;
        }
        return this;
    }

    /**
     * Setter for unsafeEntitiesCount
     * 
     * @see RollbackResponse.Fields#unsafeEntitiesCount
     */
    public RollbackResponse setUnsafeEntitiesCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "unsafeEntitiesCount", DataTemplateUtil.coerceLongInput(value));
        _unsafeEntitiesCountField = value;
        return this;
    }

    /**
     * Existence checker for unsafeEntities
     * 
     * @see RollbackResponse.Fields#unsafeEntities
     */
    public boolean hasUnsafeEntities() {
        if (_unsafeEntitiesField!= null) {
            return true;
        }
        return super._map.containsKey("unsafeEntities");
    }

    /**
     * Remover for unsafeEntities
     * 
     * @see RollbackResponse.Fields#unsafeEntities
     */
    public void removeUnsafeEntities() {
        super._map.remove("unsafeEntities");
    }

    /**
     * Getter for unsafeEntities
     * 
     * @see RollbackResponse.Fields#unsafeEntities
     */
    @Nullable
    public UnsafeEntityInfoArray getUnsafeEntities(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUnsafeEntities();
            case DEFAULT:
            case NULL:
                if (_unsafeEntitiesField!= null) {
                    return _unsafeEntitiesField;
                } else {
                    Object __rawValue = super._map.get("unsafeEntities");
                    _unsafeEntitiesField = ((__rawValue == null)?null:new UnsafeEntityInfoArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _unsafeEntitiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for unsafeEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RollbackResponse.Fields#unsafeEntities
     */
    @Nonnull
    public UnsafeEntityInfoArray getUnsafeEntities() {
        if (_unsafeEntitiesField!= null) {
            return _unsafeEntitiesField;
        } else {
            Object __rawValue = super._map.get("unsafeEntities");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("unsafeEntities");
            }
            _unsafeEntitiesField = ((__rawValue == null)?null:new UnsafeEntityInfoArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _unsafeEntitiesField;
        }
    }

    /**
     * Setter for unsafeEntities
     * 
     * @see RollbackResponse.Fields#unsafeEntities
     */
    public RollbackResponse setUnsafeEntities(
        @Nullable
        UnsafeEntityInfoArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUnsafeEntities(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field unsafeEntities of com.linkedin.metadata.run.RollbackResponse");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unsafeEntities", value.data());
                    _unsafeEntitiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUnsafeEntities();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unsafeEntities", value.data());
                    _unsafeEntitiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "unsafeEntities", value.data());
                    _unsafeEntitiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for unsafeEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RollbackResponse.Fields#unsafeEntities
     */
    public RollbackResponse setUnsafeEntities(
        @Nonnull
        UnsafeEntityInfoArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field unsafeEntities of com.linkedin.metadata.run.RollbackResponse to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "unsafeEntities", value.data());
            _unsafeEntitiesField = value;
        }
        return this;
    }

    @Override
    public RollbackResponse clone()
        throws CloneNotSupportedException
    {
        RollbackResponse __clone = ((RollbackResponse) super.clone());
        __clone.__changeListener = new RollbackResponse.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RollbackResponse copy()
        throws CloneNotSupportedException
    {
        RollbackResponse __copy = ((RollbackResponse) super.copy());
        __copy._unsafeEntitiesCountField = null;
        __copy._aspectsRevertedField = null;
        __copy._aspectsAffectedField = null;
        __copy._unsafeEntitiesField = null;
        __copy._entitiesDeletedField = null;
        __copy._entitiesAffectedField = null;
        __copy._aspectRowSummariesField = null;
        __copy.__changeListener = new RollbackResponse.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RollbackResponse __objectRef;

        private ChangeListener(RollbackResponse reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "unsafeEntitiesCount":
                    __objectRef._unsafeEntitiesCountField = null;
                    break;
                case "aspectsReverted":
                    __objectRef._aspectsRevertedField = null;
                    break;
                case "aspectsAffected":
                    __objectRef._aspectsAffectedField = null;
                    break;
                case "unsafeEntities":
                    __objectRef._unsafeEntitiesField = null;
                    break;
                case "entitiesDeleted":
                    __objectRef._entitiesDeletedField = null;
                    break;
                case "entitiesAffected":
                    __objectRef._entitiesAffectedField = null;
                    break;
                case "aspectRowSummaries":
                    __objectRef._aspectRowSummariesField = null;
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

        public com.linkedin.metadata.run.AspectRowSummaryArray.Fields aspectRowSummaries() {
            return new com.linkedin.metadata.run.AspectRowSummaryArray.Fields(getPathComponents(), "aspectRowSummaries");
        }

        public PathSpec aspectRowSummaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspectRowSummaries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public PathSpec entitiesAffected() {
            return new PathSpec(getPathComponents(), "entitiesAffected");
        }

        public PathSpec aspectsAffected() {
            return new PathSpec(getPathComponents(), "aspectsAffected");
        }

        public PathSpec entitiesDeleted() {
            return new PathSpec(getPathComponents(), "entitiesDeleted");
        }

        public PathSpec aspectsReverted() {
            return new PathSpec(getPathComponents(), "aspectsReverted");
        }

        public PathSpec unsafeEntitiesCount() {
            return new PathSpec(getPathComponents(), "unsafeEntitiesCount");
        }

        public com.linkedin.metadata.run.UnsafeEntityInfoArray.Fields unsafeEntities() {
            return new com.linkedin.metadata.run.UnsafeEntityInfoArray.Fields(getPathComponents(), "unsafeEntities");
        }

        public PathSpec unsafeEntities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "unsafeEntities");
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

        private com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask _aspectRowSummariesMask;
        private com.linkedin.metadata.run.UnsafeEntityInfoArray.ProjectionMask _unsafeEntitiesMask;

        ProjectionMask() {
            super(10);
        }

        public RollbackResponse.ProjectionMask withAspectRowSummaries(Function<com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask, com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask> nestedMask) {
            _aspectRowSummariesMask = nestedMask.apply(((_aspectRowSummariesMask == null)?AspectRowSummaryArray.createMask():_aspectRowSummariesMask));
            getDataMap().put("aspectRowSummaries", _aspectRowSummariesMask.getDataMap());
            return this;
        }

        public RollbackResponse.ProjectionMask withAspectRowSummaries() {
            _aspectRowSummariesMask = null;
            getDataMap().put("aspectRowSummaries", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withAspectRowSummaries(Function<com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask, com.linkedin.metadata.run.AspectRowSummaryArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _aspectRowSummariesMask = nestedMask.apply(((_aspectRowSummariesMask == null)?AspectRowSummaryArray.createMask():_aspectRowSummariesMask));
            getDataMap().put("aspectRowSummaries", _aspectRowSummariesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$count", count);
            }
            return this;
        }

        public RollbackResponse.ProjectionMask withAspectRowSummaries(Integer start, Integer count) {
            _aspectRowSummariesMask = null;
            getDataMap().put("aspectRowSummaries", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("aspectRowSummaries").put("$count", count);
            }
            return this;
        }

        public RollbackResponse.ProjectionMask withEntitiesAffected() {
            getDataMap().put("entitiesAffected", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withAspectsAffected() {
            getDataMap().put("aspectsAffected", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withEntitiesDeleted() {
            getDataMap().put("entitiesDeleted", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withAspectsReverted() {
            getDataMap().put("aspectsReverted", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withUnsafeEntitiesCount() {
            getDataMap().put("unsafeEntitiesCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withUnsafeEntities(Function<com.linkedin.metadata.run.UnsafeEntityInfoArray.ProjectionMask, com.linkedin.metadata.run.UnsafeEntityInfoArray.ProjectionMask> nestedMask) {
            _unsafeEntitiesMask = nestedMask.apply(((_unsafeEntitiesMask == null)?UnsafeEntityInfoArray.createMask():_unsafeEntitiesMask));
            getDataMap().put("unsafeEntities", _unsafeEntitiesMask.getDataMap());
            return this;
        }

        public RollbackResponse.ProjectionMask withUnsafeEntities() {
            _unsafeEntitiesMask = null;
            getDataMap().put("unsafeEntities", MaskMap.POSITIVE_MASK);
            return this;
        }

        public RollbackResponse.ProjectionMask withUnsafeEntities(Function<com.linkedin.metadata.run.UnsafeEntityInfoArray.ProjectionMask, com.linkedin.metadata.run.UnsafeEntityInfoArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _unsafeEntitiesMask = nestedMask.apply(((_unsafeEntitiesMask == null)?UnsafeEntityInfoArray.createMask():_unsafeEntitiesMask));
            getDataMap().put("unsafeEntities", _unsafeEntitiesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("unsafeEntities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("unsafeEntities").put("$count", count);
            }
            return this;
        }

        public RollbackResponse.ProjectionMask withUnsafeEntities(Integer start, Integer count) {
            _unsafeEntitiesMask = null;
            getDataMap().put("unsafeEntities", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("unsafeEntities").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("unsafeEntities").put("$count", count);
            }
            return this;
        }

    }

}
