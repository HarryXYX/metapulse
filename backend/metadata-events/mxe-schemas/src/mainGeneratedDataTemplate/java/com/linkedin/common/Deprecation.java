
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
 * Deprecation status of an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Deprecation.pdl.")
public class Deprecation
    extends RecordTemplate
{

    private final static Deprecation.Fields _fields = new Deprecation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"addToFilters\":true,\"fieldType\":\"BOOLEAN\",\"filterNameOverride\":\"Deprecated\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The user URN which will be credited for modifying this deprecation content.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string,replacement:optional Urn}", SchemaFormatType.PDL));
    private Boolean _deprecatedField = null;
    private Long _decommissionTimeField = null;
    private String _noteField = null;
    private com.linkedin.common.urn.Urn _actorField = null;
    private com.linkedin.common.urn.Urn _replacementField = null;
    private Deprecation.ChangeListener __changeListener = new Deprecation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Deprecated = SCHEMA.getField("deprecated");
    private final static RecordDataSchema.Field FIELD_DecommissionTime = SCHEMA.getField("decommissionTime");
    private final static RecordDataSchema.Field FIELD_Note = SCHEMA.getField("note");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");
    private final static RecordDataSchema.Field FIELD_Replacement = SCHEMA.getField("replacement");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public Deprecation() {
        super(new DataMap(7, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Deprecation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Deprecation.Fields fields() {
        return _fields;
    }

    public static Deprecation.ProjectionMask createMask() {
        return new Deprecation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public boolean hasDeprecated() {
        if (_deprecatedField!= null) {
            return true;
        }
        return super._map.containsKey("deprecated");
    }

    /**
     * Remover for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public void removeDeprecated() {
        super._map.remove("deprecated");
    }

    /**
     * Getter for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    @Nullable
    public Boolean isDeprecated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return isDeprecated();
            case DEFAULT:
            case NULL:
                if (_deprecatedField!= null) {
                    return _deprecatedField;
                } else {
                    Object __rawValue = super._map.get("deprecated");
                    _deprecatedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _deprecatedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for deprecated
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Deprecation.Fields#deprecated
     */
    @Nonnull
    public Boolean isDeprecated() {
        if (_deprecatedField!= null) {
            return _deprecatedField;
        } else {
            Object __rawValue = super._map.get("deprecated");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("deprecated");
            }
            _deprecatedField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _deprecatedField;
        }
    }

    /**
     * Setter for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public Deprecation setDeprecated(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDeprecated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field deprecated of com.linkedin.common.Deprecation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
                    _deprecatedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDeprecated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
                    _deprecatedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
                    _deprecatedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#deprecated
     */
    public Deprecation setDeprecated(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deprecated of com.linkedin.common.Deprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
            _deprecatedField = value;
        }
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public Deprecation setDeprecated(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
        _deprecatedField = value;
        return this;
    }

    /**
     * Existence checker for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public boolean hasDecommissionTime() {
        if (_decommissionTimeField!= null) {
            return true;
        }
        return super._map.containsKey("decommissionTime");
    }

    /**
     * Remover for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public void removeDecommissionTime() {
        super._map.remove("decommissionTime");
    }

    /**
     * Getter for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    @Nullable
    public Long getDecommissionTime(GetMode mode) {
        return getDecommissionTime();
    }

    /**
     * Getter for decommissionTime
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Deprecation.Fields#decommissionTime
     */
    @Nullable
    public Long getDecommissionTime() {
        if (_decommissionTimeField!= null) {
            return _decommissionTimeField;
        } else {
            Object __rawValue = super._map.get("decommissionTime");
            _decommissionTimeField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _decommissionTimeField;
        }
    }

    /**
     * Setter for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public Deprecation setDecommissionTime(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDecommissionTime(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDecommissionTime();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "decommissionTime", DataTemplateUtil.coerceLongInput(value));
                    _decommissionTimeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "decommissionTime", DataTemplateUtil.coerceLongInput(value));
                    _decommissionTimeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#decommissionTime
     */
    public Deprecation setDecommissionTime(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field decommissionTime of com.linkedin.common.Deprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "decommissionTime", DataTemplateUtil.coerceLongInput(value));
            _decommissionTimeField = value;
        }
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public Deprecation setDecommissionTime(long value) {
        CheckedUtil.putWithoutChecking(super._map, "decommissionTime", DataTemplateUtil.coerceLongInput(value));
        _decommissionTimeField = value;
        return this;
    }

    /**
     * Existence checker for note
     * 
     * @see Deprecation.Fields#note
     */
    public boolean hasNote() {
        if (_noteField!= null) {
            return true;
        }
        return super._map.containsKey("note");
    }

    /**
     * Remover for note
     * 
     * @see Deprecation.Fields#note
     */
    public void removeNote() {
        super._map.remove("note");
    }

    /**
     * Getter for note
     * 
     * @see Deprecation.Fields#note
     */
    @Nullable
    public String getNote(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getNote();
            case DEFAULT:
            case NULL:
                if (_noteField!= null) {
                    return _noteField;
                } else {
                    Object __rawValue = super._map.get("note");
                    _noteField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _noteField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for note
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Deprecation.Fields#note
     */
    @Nonnull
    public String getNote() {
        if (_noteField!= null) {
            return _noteField;
        } else {
            Object __rawValue = super._map.get("note");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("note");
            }
            _noteField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _noteField;
        }
    }

    /**
     * Setter for note
     * 
     * @see Deprecation.Fields#note
     */
    public Deprecation setNote(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNote(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field note of com.linkedin.common.Deprecation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "note", value);
                    _noteField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNote();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "note", value);
                    _noteField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "note", value);
                    _noteField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for note
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#note
     */
    public Deprecation setNote(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field note of com.linkedin.common.Deprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "note", value);
            _noteField = value;
        }
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see Deprecation.Fields#actor
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
     * @see Deprecation.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see Deprecation.Fields#actor
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
     * @see Deprecation.Fields#actor
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
     * @see Deprecation.Fields#actor
     */
    public Deprecation setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field actor of com.linkedin.common.Deprecation");
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
     * @see Deprecation.Fields#actor
     */
    public Deprecation setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.common.Deprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    /**
     * Existence checker for replacement
     * 
     * @see Deprecation.Fields#replacement
     */
    public boolean hasReplacement() {
        if (_replacementField!= null) {
            return true;
        }
        return super._map.containsKey("replacement");
    }

    /**
     * Remover for replacement
     * 
     * @see Deprecation.Fields#replacement
     */
    public void removeReplacement() {
        super._map.remove("replacement");
    }

    /**
     * Getter for replacement
     * 
     * @see Deprecation.Fields#replacement
     */
    @Nullable
    public com.linkedin.common.urn.Urn getReplacement(GetMode mode) {
        return getReplacement();
    }

    /**
     * Getter for replacement
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Deprecation.Fields#replacement
     */
    @Nullable
    public com.linkedin.common.urn.Urn getReplacement() {
        if (_replacementField!= null) {
            return _replacementField;
        } else {
            Object __rawValue = super._map.get("replacement");
            _replacementField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _replacementField;
        }
    }

    /**
     * Setter for replacement
     * 
     * @see Deprecation.Fields#replacement
     */
    public Deprecation setReplacement(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setReplacement(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeReplacement();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "replacement", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _replacementField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "replacement", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _replacementField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for replacement
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#replacement
     */
    public Deprecation setReplacement(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field replacement of com.linkedin.common.Deprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "replacement", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _replacementField = value;
        }
        return this;
    }

    @Override
    public Deprecation clone()
        throws CloneNotSupportedException
    {
        Deprecation __clone = ((Deprecation) super.clone());
        __clone.__changeListener = new Deprecation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Deprecation copy()
        throws CloneNotSupportedException
    {
        Deprecation __copy = ((Deprecation) super.copy());
        __copy._actorField = null;
        __copy._noteField = null;
        __copy._deprecatedField = null;
        __copy._replacementField = null;
        __copy._decommissionTimeField = null;
        __copy.__changeListener = new Deprecation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Deprecation __objectRef;

        private ChangeListener(Deprecation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "actor":
                    __objectRef._actorField = null;
                    break;
                case "note":
                    __objectRef._noteField = null;
                    break;
                case "deprecated":
                    __objectRef._deprecatedField = null;
                    break;
                case "replacement":
                    __objectRef._replacementField = null;
                    break;
                case "decommissionTime":
                    __objectRef._decommissionTimeField = null;
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
         * Whether the entity is deprecated.
         * 
         */
        public PathSpec deprecated() {
            return new PathSpec(getPathComponents(), "deprecated");
        }

        /**
         * The time user plan to decommission this entity.
         * 
         */
        public PathSpec decommissionTime() {
            return new PathSpec(getPathComponents(), "decommissionTime");
        }

        /**
         * Additional information about the entity deprecation plan, such as the wiki, doc, RB.
         * 
         */
        public PathSpec note() {
            return new PathSpec(getPathComponents(), "note");
        }

        /**
         * The user URN which will be credited for modifying this deprecation content.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

        public PathSpec replacement() {
            return new PathSpec(getPathComponents(), "replacement");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(7);
        }

        /**
         * Whether the entity is deprecated.
         * 
         */
        public Deprecation.ProjectionMask withDeprecated() {
            getDataMap().put("deprecated", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time user plan to decommission this entity.
         * 
         */
        public Deprecation.ProjectionMask withDecommissionTime() {
            getDataMap().put("decommissionTime", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional information about the entity deprecation plan, such as the wiki, doc, RB.
         * 
         */
        public Deprecation.ProjectionMask withNote() {
            getDataMap().put("note", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The user URN which will be credited for modifying this deprecation content.
         * 
         */
        public Deprecation.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

        public Deprecation.ProjectionMask withReplacement() {
            getDataMap().put("replacement", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
