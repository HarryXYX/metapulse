
package com.linkedin.metadata.query;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Extra information associated to a metadata aspect.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/ListResultMetadata.pdl.")
public class ExtraInfo
    extends RecordTemplate
{

    private final static ExtraInfo.Fields _fields = new ExtraInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**Extra information associated to a metadata aspect.*/record ExtraInfo{/**The urn for the entity that owns the metadata aspect*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The version number of the metadata aspect.*/version:long/**The audit trail associated with the version*/audit:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _urnField = null;
    private Long _versionField = null;
    private AuditStamp _auditField = null;
    private ExtraInfo.ChangeListener __changeListener = new ExtraInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Audit = SCHEMA.getField("audit");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public ExtraInfo() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ExtraInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ExtraInfo.Fields fields() {
        return _fields;
    }

    public static ExtraInfo.ProjectionMask createMask() {
        return new ExtraInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see ExtraInfo.Fields#urn
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
     * @see ExtraInfo.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see ExtraInfo.Fields#urn
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
     * @see ExtraInfo.Fields#urn
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
     * @see ExtraInfo.Fields#urn
     */
    public ExtraInfo setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.metadata.query.ExtraInfo");
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
     * @see ExtraInfo.Fields#urn
     */
    public ExtraInfo setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.metadata.query.ExtraInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see ExtraInfo.Fields#version
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
     * @see ExtraInfo.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see ExtraInfo.Fields#version
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
     * @see ExtraInfo.Fields#version
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
     * @see ExtraInfo.Fields#version
     */
    public ExtraInfo setVersion(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.metadata.query.ExtraInfo");
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
     * @see ExtraInfo.Fields#version
     */
    public ExtraInfo setVersion(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.metadata.query.ExtraInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see ExtraInfo.Fields#version
     */
    public ExtraInfo setVersion(long value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
        _versionField = value;
        return this;
    }

    /**
     * Existence checker for audit
     * 
     * @see ExtraInfo.Fields#audit
     */
    public boolean hasAudit() {
        if (_auditField!= null) {
            return true;
        }
        return super._map.containsKey("audit");
    }

    /**
     * Remover for audit
     * 
     * @see ExtraInfo.Fields#audit
     */
    public void removeAudit() {
        super._map.remove("audit");
    }

    /**
     * Getter for audit
     * 
     * @see ExtraInfo.Fields#audit
     */
    @Nullable
    public AuditStamp getAudit(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAudit();
            case DEFAULT:
            case NULL:
                if (_auditField!= null) {
                    return _auditField;
                } else {
                    Object __rawValue = super._map.get("audit");
                    _auditField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _auditField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for audit
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ExtraInfo.Fields#audit
     */
    @Nonnull
    public AuditStamp getAudit() {
        if (_auditField!= null) {
            return _auditField;
        } else {
            Object __rawValue = super._map.get("audit");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("audit");
            }
            _auditField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _auditField;
        }
    }

    /**
     * Setter for audit
     * 
     * @see ExtraInfo.Fields#audit
     */
    public ExtraInfo setAudit(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAudit(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field audit of com.linkedin.metadata.query.ExtraInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "audit", value.data());
                    _auditField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAudit();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "audit", value.data());
                    _auditField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "audit", value.data());
                    _auditField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for audit
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ExtraInfo.Fields#audit
     */
    public ExtraInfo setAudit(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field audit of com.linkedin.metadata.query.ExtraInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "audit", value.data());
            _auditField = value;
        }
        return this;
    }

    @Override
    public ExtraInfo clone()
        throws CloneNotSupportedException
    {
        ExtraInfo __clone = ((ExtraInfo) super.clone());
        __clone.__changeListener = new ExtraInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ExtraInfo copy()
        throws CloneNotSupportedException
    {
        ExtraInfo __copy = ((ExtraInfo) super.copy());
        __copy._urnField = null;
        __copy._auditField = null;
        __copy._versionField = null;
        __copy.__changeListener = new ExtraInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ExtraInfo __objectRef;

        private ChangeListener(ExtraInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "audit":
                    __objectRef._auditField = null;
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
         * The urn for the entity that owns the metadata aspect
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The version number of the metadata aspect.
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * The audit trail associated with the version
         * 
         */
        public com.linkedin.common.AuditStamp.Fields audit() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "audit");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _auditMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The urn for the entity that owns the metadata aspect
         * 
         */
        public ExtraInfo.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version number of the metadata aspect.
         * 
         */
        public ExtraInfo.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The audit trail associated with the version
         * 
         */
        public ExtraInfo.ProjectionMask withAudit(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _auditMask = nestedMask.apply(((_auditMask == null)?AuditStamp.createMask():_auditMask));
            getDataMap().put("audit", _auditMask.getDataMap());
            return this;
        }

        /**
         * The audit trail associated with the version
         * 
         */
        public ExtraInfo.ProjectionMask withAudit(MaskMap nestedMask) {
            getDataMap().put("audit", nestedMask.getDataMap());
            return this;
        }

        /**
         * The audit trail associated with the version
         * 
         */
        public ExtraInfo.ProjectionMask withAudit() {
            _auditMask = null;
            getDataMap().put("audit", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
