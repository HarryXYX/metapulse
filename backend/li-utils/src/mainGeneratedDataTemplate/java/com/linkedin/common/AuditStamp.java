
package com.linkedin.common;

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
 * Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/AuditStamp.pdl.")
public class AuditStamp
    extends RecordTemplate
{

    private final static AuditStamp.Fields _fields = new AuditStamp.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}", SchemaFormatType.PDL));
    private Long _timeField = null;
    private com.linkedin.common.urn.Urn _actorField = null;
    private com.linkedin.common.urn.Urn _impersonatorField = null;
    private String _messageField = null;
    private AuditStamp.ChangeListener __changeListener = new AuditStamp.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Time = SCHEMA.getField("time");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");
    private final static RecordDataSchema.Field FIELD_Impersonator = SCHEMA.getField("impersonator");
    private final static RecordDataSchema.Field FIELD_Message = SCHEMA.getField("message");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public AuditStamp() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AuditStamp(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AuditStamp.Fields fields() {
        return _fields;
    }

    public static AuditStamp.ProjectionMask createMask() {
        return new AuditStamp.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for time
     * 
     * @see AuditStamp.Fields#time
     */
    public boolean hasTime() {
        if (_timeField!= null) {
            return true;
        }
        return super._map.containsKey("time");
    }

    /**
     * Remover for time
     * 
     * @see AuditStamp.Fields#time
     */
    public void removeTime() {
        super._map.remove("time");
    }

    /**
     * Getter for time
     * 
     * @see AuditStamp.Fields#time
     */
    @Nullable
    public Long getTime(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTime();
            case DEFAULT:
            case NULL:
                if (_timeField!= null) {
                    return _timeField;
                } else {
                    Object __rawValue = super._map.get("time");
                    _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _timeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for time
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AuditStamp.Fields#time
     */
    @Nonnull
    public Long getTime() {
        if (_timeField!= null) {
            return _timeField;
        } else {
            Object __rawValue = super._map.get("time");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("time");
            }
            _timeField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _timeField;
        }
    }

    /**
     * Setter for time
     * 
     * @see AuditStamp.Fields#time
     */
    public AuditStamp setTime(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTime(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field time of com.linkedin.common.AuditStamp");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTime();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
                    _timeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AuditStamp.Fields#time
     */
    public AuditStamp setTime(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field time of com.linkedin.common.AuditStamp to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
            _timeField = value;
        }
        return this;
    }

    /**
     * Setter for time
     * 
     * @see AuditStamp.Fields#time
     */
    public AuditStamp setTime(long value) {
        CheckedUtil.putWithoutChecking(super._map, "time", DataTemplateUtil.coerceLongInput(value));
        _timeField = value;
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see AuditStamp.Fields#actor
     */
    public boolean hasActor() {
        if (_actorField!= null) {
            return true;
        }
        return super._map.containsKey("actor");
    }

    /**
     * Remover for actor
     * 
     * @see AuditStamp.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see AuditStamp.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getActor();
            case DEFAULT:
            case NULL:
                if (_actorField!= null) {
                    return _actorField;
                } else {
                    Object __rawValue = super._map.get("actor");
                    _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _actorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AuditStamp.Fields#actor
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getActor() {
        if (_actorField!= null) {
            return _actorField;
        } else {
            Object __rawValue = super._map.get("actor");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("actor");
            }
            _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorField;
        }
    }

    /**
     * Setter for actor
     * 
     * @see AuditStamp.Fields#actor
     */
    public AuditStamp setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actor of com.linkedin.common.AuditStamp");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeActor();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _actorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for actor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AuditStamp.Fields#actor
     */
    public AuditStamp setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.common.AuditStamp to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    /**
     * Existence checker for impersonator
     * 
     * @see AuditStamp.Fields#impersonator
     */
    public boolean hasImpersonator() {
        if (_impersonatorField!= null) {
            return true;
        }
        return super._map.containsKey("impersonator");
    }

    /**
     * Remover for impersonator
     * 
     * @see AuditStamp.Fields#impersonator
     */
    public void removeImpersonator() {
        super._map.remove("impersonator");
    }

    /**
     * Getter for impersonator
     * 
     * @see AuditStamp.Fields#impersonator
     */
    @Nullable
    public com.linkedin.common.urn.Urn getImpersonator(GetMode mode) {
        return getImpersonator();
    }

    /**
     * Getter for impersonator
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AuditStamp.Fields#impersonator
     */
    @Nullable
    public com.linkedin.common.urn.Urn getImpersonator() {
        if (_impersonatorField!= null) {
            return _impersonatorField;
        } else {
            Object __rawValue = super._map.get("impersonator");
            _impersonatorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _impersonatorField;
        }
    }

    /**
     * Setter for impersonator
     * 
     * @see AuditStamp.Fields#impersonator
     */
    public AuditStamp setImpersonator(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setImpersonator(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeImpersonator();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "impersonator", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _impersonatorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "impersonator", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _impersonatorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for impersonator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AuditStamp.Fields#impersonator
     */
    public AuditStamp setImpersonator(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field impersonator of com.linkedin.common.AuditStamp to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "impersonator", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _impersonatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for message
     * 
     * @see AuditStamp.Fields#message
     */
    public boolean hasMessage() {
        if (_messageField!= null) {
            return true;
        }
        return super._map.containsKey("message");
    }

    /**
     * Remover for message
     * 
     * @see AuditStamp.Fields#message
     */
    public void removeMessage() {
        super._map.remove("message");
    }

    /**
     * Getter for message
     * 
     * @see AuditStamp.Fields#message
     */
    @Nullable
    public String getMessage(GetMode mode) {
        return getMessage();
    }

    /**
     * Getter for message
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AuditStamp.Fields#message
     */
    @Nullable
    public String getMessage() {
        if (_messageField!= null) {
            return _messageField;
        } else {
            Object __rawValue = super._map.get("message");
            _messageField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _messageField;
        }
    }

    /**
     * Setter for message
     * 
     * @see AuditStamp.Fields#message
     */
    public AuditStamp setMessage(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMessage(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMessage();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "message", value);
                    _messageField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "message", value);
                    _messageField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for message
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AuditStamp.Fields#message
     */
    public AuditStamp setMessage(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field message of com.linkedin.common.AuditStamp to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "message", value);
            _messageField = value;
        }
        return this;
    }

    @Override
    public AuditStamp clone()
        throws CloneNotSupportedException
    {
        AuditStamp __clone = ((AuditStamp) super.clone());
        __clone.__changeListener = new AuditStamp.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AuditStamp copy()
        throws CloneNotSupportedException
    {
        AuditStamp __copy = ((AuditStamp) super.copy());
        __copy._actorField = null;
        __copy._impersonatorField = null;
        __copy._timeField = null;
        __copy._messageField = null;
        __copy.__changeListener = new AuditStamp.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AuditStamp __objectRef;

        private ChangeListener(AuditStamp reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "actor":
                    __objectRef._actorField = null;
                    break;
                case "impersonator":
                    __objectRef._impersonatorField = null;
                    break;
                case "time":
                    __objectRef._timeField = null;
                    break;
                case "message":
                    __objectRef._messageField = null;
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
         * When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.
         * 
         */
        public PathSpec time() {
            return new PathSpec(getPathComponents(), "time");
        }

        /**
         * The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

        /**
         * The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.
         * 
         */
        public PathSpec impersonator() {
            return new PathSpec(getPathComponents(), "impersonator");
        }

        /**
         * Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.
         * 
         */
        public PathSpec message() {
            return new PathSpec(getPathComponents(), "message");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.
         * 
         */
        public AuditStamp.ProjectionMask withTime() {
            getDataMap().put("time", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.
         * 
         */
        public AuditStamp.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.
         * 
         */
        public AuditStamp.ProjectionMask withImpersonator() {
            getDataMap().put("impersonator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.
         * 
         */
        public AuditStamp.ProjectionMask withMessage() {
            getDataMap().put("message", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
