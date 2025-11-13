
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
 * Summary statistics about incidents on an entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/IncidentSummaryDetails.pdl.")
public class IncidentSummaryDetails
    extends RecordTemplate
{

    private final static IncidentSummaryDetails.Fields _fields = new IncidentSummaryDetails.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Summary statistics about incidents on an entity.*/record IncidentSummaryDetails{/**The urn of the incident*/urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of an incident*/type:string/**The time at which the incident was raised in milliseconds since epoch.*/createdAt:long/**The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.*/resolvedAt:optional long/**The priority of the incident*/priority:optional int}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _urnField = null;
    private String _typeField = null;
    private Long _createdAtField = null;
    private Long _resolvedAtField = null;
    private Integer _priorityField = null;
    private IncidentSummaryDetails.ChangeListener __changeListener = new IncidentSummaryDetails.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");
    private final static RecordDataSchema.Field FIELD_ResolvedAt = SCHEMA.getField("resolvedAt");
    private final static RecordDataSchema.Field FIELD_Priority = SCHEMA.getField("priority");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public IncidentSummaryDetails() {
        super(new DataMap(7, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IncidentSummaryDetails(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncidentSummaryDetails.Fields fields() {
        return _fields;
    }

    public static IncidentSummaryDetails.ProjectionMask createMask() {
        return new IncidentSummaryDetails.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see IncidentSummaryDetails.Fields#urn
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
     * @see IncidentSummaryDetails.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see IncidentSummaryDetails.Fields#urn
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
     * @see IncidentSummaryDetails.Fields#urn
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
     * @see IncidentSummaryDetails.Fields#urn
     */
    public IncidentSummaryDetails setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.common.IncidentSummaryDetails");
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
     * @see IncidentSummaryDetails.Fields#urn
     */
    public IncidentSummaryDetails setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.common.IncidentSummaryDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see IncidentSummaryDetails.Fields#type
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
     * @see IncidentSummaryDetails.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see IncidentSummaryDetails.Fields#type
     */
    @Nullable
    public String getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see IncidentSummaryDetails.Fields#type
     */
    @Nonnull
    public String getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see IncidentSummaryDetails.Fields#type
     */
    public IncidentSummaryDetails setType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.common.IncidentSummaryDetails");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value);
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
     * @see IncidentSummaryDetails.Fields#type
     */
    public IncidentSummaryDetails setType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.common.IncidentSummaryDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value);
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        if (_createdAtField!= null) {
            return true;
        }
        return super._map.containsKey("createdAt");
    }

    /**
     * Remover for createdAt
     * 
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    public void removeCreatedAt() {
        super._map.remove("createdAt");
    }

    /**
     * Getter for createdAt
     * 
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreatedAt();
            case DEFAULT:
            case NULL:
                if (_createdAtField!= null) {
                    return _createdAtField;
                } else {
                    Object __rawValue = super._map.get("createdAt");
                    _createdAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _createdAtField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    @Nonnull
    public Long getCreatedAt() {
        if (_createdAtField!= null) {
            return _createdAtField;
        } else {
            Object __rawValue = super._map.get("createdAt");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("createdAt");
            }
            _createdAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _createdAtField;
        }
    }

    /**
     * Setter for createdAt
     * 
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    public IncidentSummaryDetails setCreatedAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreatedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field createdAt of com.linkedin.common.IncidentSummaryDetails");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreatedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    public IncidentSummaryDetails setCreatedAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createdAt of com.linkedin.common.IncidentSummaryDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
            _createdAtField = value;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @see IncidentSummaryDetails.Fields#createdAt
     */
    public IncidentSummaryDetails setCreatedAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
        _createdAtField = value;
        return this;
    }

    /**
     * Existence checker for resolvedAt
     * 
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    public boolean hasResolvedAt() {
        if (_resolvedAtField!= null) {
            return true;
        }
        return super._map.containsKey("resolvedAt");
    }

    /**
     * Remover for resolvedAt
     * 
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    public void removeResolvedAt() {
        super._map.remove("resolvedAt");
    }

    /**
     * Getter for resolvedAt
     * 
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    @Nullable
    public Long getResolvedAt(GetMode mode) {
        return getResolvedAt();
    }

    /**
     * Getter for resolvedAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    @Nullable
    public Long getResolvedAt() {
        if (_resolvedAtField!= null) {
            return _resolvedAtField;
        } else {
            Object __rawValue = super._map.get("resolvedAt");
            _resolvedAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _resolvedAtField;
        }
    }

    /**
     * Setter for resolvedAt
     * 
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    public IncidentSummaryDetails setResolvedAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResolvedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResolvedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedAt", DataTemplateUtil.coerceLongInput(value));
                    _resolvedAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resolvedAt", DataTemplateUtil.coerceLongInput(value));
                    _resolvedAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resolvedAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    public IncidentSummaryDetails setResolvedAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resolvedAt of com.linkedin.common.IncidentSummaryDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resolvedAt", DataTemplateUtil.coerceLongInput(value));
            _resolvedAtField = value;
        }
        return this;
    }

    /**
     * Setter for resolvedAt
     * 
     * @see IncidentSummaryDetails.Fields#resolvedAt
     */
    public IncidentSummaryDetails setResolvedAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "resolvedAt", DataTemplateUtil.coerceLongInput(value));
        _resolvedAtField = value;
        return this;
    }

    /**
     * Existence checker for priority
     * 
     * @see IncidentSummaryDetails.Fields#priority
     */
    public boolean hasPriority() {
        if (_priorityField!= null) {
            return true;
        }
        return super._map.containsKey("priority");
    }

    /**
     * Remover for priority
     * 
     * @see IncidentSummaryDetails.Fields#priority
     */
    public void removePriority() {
        super._map.remove("priority");
    }

    /**
     * Getter for priority
     * 
     * @see IncidentSummaryDetails.Fields#priority
     */
    @Nullable
    public Integer getPriority(GetMode mode) {
        return getPriority();
    }

    /**
     * Getter for priority
     * 
     * @return
     *     Optional field. Always check for null.
     * @see IncidentSummaryDetails.Fields#priority
     */
    @Nullable
    public Integer getPriority() {
        if (_priorityField!= null) {
            return _priorityField;
        } else {
            Object __rawValue = super._map.get("priority");
            _priorityField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _priorityField;
        }
    }

    /**
     * Setter for priority
     * 
     * @see IncidentSummaryDetails.Fields#priority
     */
    public IncidentSummaryDetails setPriority(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPriority(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePriority();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
                    _priorityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
                    _priorityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for priority
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncidentSummaryDetails.Fields#priority
     */
    public IncidentSummaryDetails setPriority(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field priority of com.linkedin.common.IncidentSummaryDetails to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
            _priorityField = value;
        }
        return this;
    }

    /**
     * Setter for priority
     * 
     * @see IncidentSummaryDetails.Fields#priority
     */
    public IncidentSummaryDetails setPriority(int value) {
        CheckedUtil.putWithoutChecking(super._map, "priority", DataTemplateUtil.coerceIntInput(value));
        _priorityField = value;
        return this;
    }

    @Override
    public IncidentSummaryDetails clone()
        throws CloneNotSupportedException
    {
        IncidentSummaryDetails __clone = ((IncidentSummaryDetails) super.clone());
        __clone.__changeListener = new IncidentSummaryDetails.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncidentSummaryDetails copy()
        throws CloneNotSupportedException
    {
        IncidentSummaryDetails __copy = ((IncidentSummaryDetails) super.copy());
        __copy._urnField = null;
        __copy._createdAtField = null;
        __copy._resolvedAtField = null;
        __copy._typeField = null;
        __copy._priorityField = null;
        __copy.__changeListener = new IncidentSummaryDetails.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncidentSummaryDetails __objectRef;

        private ChangeListener(IncidentSummaryDetails reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "createdAt":
                    __objectRef._createdAtField = null;
                    break;
                case "resolvedAt":
                    __objectRef._resolvedAtField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "priority":
                    __objectRef._priorityField = null;
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
         * The urn of the incident
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The type of an incident
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The time at which the incident was raised in milliseconds since epoch.
         * 
         */
        public PathSpec createdAt() {
            return new PathSpec(getPathComponents(), "createdAt");
        }

        /**
         * The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.
         * 
         */
        public PathSpec resolvedAt() {
            return new PathSpec(getPathComponents(), "resolvedAt");
        }

        /**
         * The priority of the incident
         * 
         */
        public PathSpec priority() {
            return new PathSpec(getPathComponents(), "priority");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * The urn of the incident
         * 
         */
        public IncidentSummaryDetails.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of an incident
         * 
         */
        public IncidentSummaryDetails.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the incident was raised in milliseconds since epoch.
         * 
         */
        public IncidentSummaryDetails.ProjectionMask withCreatedAt() {
            getDataMap().put("createdAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the incident was marked as resolved in milliseconds since epoch. Null if the incident is still active.
         * 
         */
        public IncidentSummaryDetails.ProjectionMask withResolvedAt() {
            getDataMap().put("resolvedAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The priority of the incident
         * 
         */
        public IncidentSummaryDetails.ProjectionMask withPriority() {
            getDataMap().put("priority", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
