
package com.linkedin.identity;

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


/**
 * The status of the user, e.g. provisioned, active, suspended, etc.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpUserStatus.pdl.")
public class CorpUserStatus
    extends RecordTemplate
{

    private final static CorpUserStatus.Fields _fields = new CorpUserStatus.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/@Searchable.`/time`={\"fieldName\":\"statusLastModifiedAt\",\"fieldType\":\"COUNT\"}lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}}", SchemaFormatType.PDL));
    private String _statusField = null;
    private AuditStamp _lastModifiedField = null;
    private CorpUserStatus.ChangeListener __changeListener = new CorpUserStatus.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");

    public CorpUserStatus() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public CorpUserStatus(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpUserStatus.Fields fields() {
        return _fields;
    }

    public static CorpUserStatus.ProjectionMask createMask() {
        return new CorpUserStatus.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public boolean hasStatus() {
        if (_statusField!= null) {
            return true;
        }
        return super._map.containsKey("status");
    }

    /**
     * Remover for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public void removeStatus() {
        super._map.remove("status");
    }

    /**
     * Getter for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    @Nullable
    public String getStatus(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStatus();
            case DEFAULT:
            case NULL:
                if (_statusField!= null) {
                    return _statusField;
                } else {
                    Object __rawValue = super._map.get("status");
                    _statusField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _statusField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for status
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserStatus.Fields#status
     */
    @Nonnull
    public String getStatus() {
        if (_statusField!= null) {
            return _statusField;
        } else {
            Object __rawValue = super._map.get("status");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("status");
            }
            _statusField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _statusField;
        }
    }

    /**
     * Setter for status
     * 
     * @see CorpUserStatus.Fields#status
     */
    public CorpUserStatus setStatus(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatus(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field status of com.linkedin.identity.CorpUserStatus");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value);
                    _statusField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatus();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value);
                    _statusField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "status", value);
                    _statusField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserStatus.Fields#status
     */
    public CorpUserStatus setStatus(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field status of com.linkedin.identity.CorpUserStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "status", value);
            _statusField = value;
        }
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    @Nullable
    public AuditStamp getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLastModified();
            case DEFAULT:
            case NULL:
                if (_lastModifiedField!= null) {
                    return _lastModifiedField;
                } else {
                    Object __rawValue = super._map.get("lastModified");
                    _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lastModifiedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserStatus.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("lastModified");
            }
            _lastModifiedField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see CorpUserStatus.Fields#lastModified
     */
    public CorpUserStatus setLastModified(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.identity.CorpUserStatus");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserStatus.Fields#lastModified
     */
    public CorpUserStatus setLastModified(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.identity.CorpUserStatus to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", value.data());
            _lastModifiedField = value;
        }
        return this;
    }

    @Override
    public CorpUserStatus clone()
        throws CloneNotSupportedException
    {
        CorpUserStatus __clone = ((CorpUserStatus) super.clone());
        __clone.__changeListener = new CorpUserStatus.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpUserStatus copy()
        throws CloneNotSupportedException
    {
        CorpUserStatus __copy = ((CorpUserStatus) super.copy());
        __copy._lastModifiedField = null;
        __copy._statusField = null;
        __copy.__changeListener = new CorpUserStatus.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpUserStatus __objectRef;

        private ChangeListener(CorpUserStatus reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "status":
                    __objectRef._statusField = null;
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
         * Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

        /**
         * Audit stamp containing who last modified the status and when.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.AuditStamp.ProjectionMask _lastModifiedMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED
         * 
         */
        public CorpUserStatus.ProjectionMask withStatus() {
            getDataMap().put("status", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Audit stamp containing who last modified the status and when.
         * 
         */
        public CorpUserStatus.ProjectionMask withLastModified(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _lastModifiedMask = nestedMask.apply(((_lastModifiedMask == null)?AuditStamp.createMask():_lastModifiedMask));
            getDataMap().put("lastModified", _lastModifiedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified the status and when.
         * 
         */
        public CorpUserStatus.ProjectionMask withLastModified(MaskMap nestedMask) {
            getDataMap().put("lastModified", nestedMask.getDataMap());
            return this;
        }

        /**
         * Audit stamp containing who last modified the status and when.
         * 
         */
        public CorpUserStatus.ProjectionMask withLastModified() {
            _lastModifiedMask = null;
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
