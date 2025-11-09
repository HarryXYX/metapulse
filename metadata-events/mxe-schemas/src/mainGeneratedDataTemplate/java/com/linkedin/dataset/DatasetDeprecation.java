
package com.linkedin.dataset;

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
 * Dataset deprecation status
 * Deprecated! This aspect is deprecated in favor of the more-general-purpose 'Deprecation' aspect.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetDeprecation.pdl.")
public class DatasetDeprecation
    extends RecordTemplate
{

    private final static DatasetDeprecation.Fields _fields = new DatasetDeprecation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Dataset deprecation status\nDeprecated! This aspect is deprecated in favor of the more-general-purpose 'Deprecation' aspect.*/@Aspect.name=\"datasetDeprecation\"@Deprecated,record DatasetDeprecation{/**Whether the dataset is deprecated by owner.*/@Searchable={\"fieldType\":\"BOOLEAN\",\"weightsPerFieldValue\":{\"true\":0.5}}deprecated:boolean/**The time user plan to decommission this dataset.*/decommissionTime:optional long/**Additional information about the dataset deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private Boolean _deprecatedField = null;
    private Long _decommissionTimeField = null;
    private String _noteField = null;
    private com.linkedin.common.urn.Urn _actorField = null;
    private DatasetDeprecation.ChangeListener __changeListener = new DatasetDeprecation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Deprecated = SCHEMA.getField("deprecated");
    private final static RecordDataSchema.Field FIELD_DecommissionTime = SCHEMA.getField("decommissionTime");
    private final static RecordDataSchema.Field FIELD_Note = SCHEMA.getField("note");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DatasetDeprecation() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DatasetDeprecation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetDeprecation.Fields fields() {
        return _fields;
    }

    public static DatasetDeprecation.ProjectionMask createMask() {
        return new DatasetDeprecation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
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
     * @see DatasetDeprecation.Fields#deprecated
     */
    public void removeDeprecated() {
        super._map.remove("deprecated");
    }

    /**
     * Getter for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
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
     * @see DatasetDeprecation.Fields#deprecated
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
     * @see DatasetDeprecation.Fields#deprecated
     */
    public DatasetDeprecation setDeprecated(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDeprecated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field deprecated of com.linkedin.dataset.DatasetDeprecation");
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
     * @see DatasetDeprecation.Fields#deprecated
     */
    public DatasetDeprecation setDeprecated(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field deprecated of com.linkedin.dataset.DatasetDeprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
            _deprecatedField = value;
        }
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @see DatasetDeprecation.Fields#deprecated
     */
    public DatasetDeprecation setDeprecated(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "deprecated", value);
        _deprecatedField = value;
        return this;
    }

    /**
     * Existence checker for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
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
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public void removeDecommissionTime() {
        super._map.remove("decommissionTime");
    }

    /**
     * Getter for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
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
     * @see DatasetDeprecation.Fields#decommissionTime
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
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public DatasetDeprecation setDecommissionTime(
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
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public DatasetDeprecation setDecommissionTime(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field decommissionTime of com.linkedin.dataset.DatasetDeprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "decommissionTime", DataTemplateUtil.coerceLongInput(value));
            _decommissionTimeField = value;
        }
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @see DatasetDeprecation.Fields#decommissionTime
     */
    public DatasetDeprecation setDecommissionTime(long value) {
        CheckedUtil.putWithoutChecking(super._map, "decommissionTime", DataTemplateUtil.coerceLongInput(value));
        _decommissionTimeField = value;
        return this;
    }

    /**
     * Existence checker for note
     * 
     * @see DatasetDeprecation.Fields#note
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
     * @see DatasetDeprecation.Fields#note
     */
    public void removeNote() {
        super._map.remove("note");
    }

    /**
     * Getter for note
     * 
     * @see DatasetDeprecation.Fields#note
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
     * @see DatasetDeprecation.Fields#note
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
     * @see DatasetDeprecation.Fields#note
     */
    public DatasetDeprecation setNote(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNote(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field note of com.linkedin.dataset.DatasetDeprecation");
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
     * @see DatasetDeprecation.Fields#note
     */
    public DatasetDeprecation setNote(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field note of com.linkedin.dataset.DatasetDeprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "note", value);
            _noteField = value;
        }
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see DatasetDeprecation.Fields#actor
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
     * @see DatasetDeprecation.Fields#actor
     */
    public void removeActor() {
        super._map.remove("actor");
    }

    /**
     * Getter for actor
     * 
     * @see DatasetDeprecation.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor(GetMode mode) {
        return getActor();
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDeprecation.Fields#actor
     */
    @Nullable
    public com.linkedin.common.urn.Urn getActor() {
        if (_actorField!= null) {
            return _actorField;
        } else {
            Object __rawValue = super._map.get("actor");
            _actorField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _actorField;
        }
    }

    /**
     * Setter for actor
     * 
     * @see DatasetDeprecation.Fields#actor
     */
    public DatasetDeprecation setActor(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setActor(value);
            case REMOVE_OPTIONAL_IF_NULL:
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
     * @see DatasetDeprecation.Fields#actor
     */
    public DatasetDeprecation setActor(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field actor of com.linkedin.dataset.DatasetDeprecation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "actor", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _actorField = value;
        }
        return this;
    }

    @Override
    public DatasetDeprecation clone()
        throws CloneNotSupportedException
    {
        DatasetDeprecation __clone = ((DatasetDeprecation) super.clone());
        __clone.__changeListener = new DatasetDeprecation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetDeprecation copy()
        throws CloneNotSupportedException
    {
        DatasetDeprecation __copy = ((DatasetDeprecation) super.copy());
        __copy._actorField = null;
        __copy._noteField = null;
        __copy._deprecatedField = null;
        __copy._decommissionTimeField = null;
        __copy.__changeListener = new DatasetDeprecation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetDeprecation __objectRef;

        private ChangeListener(DatasetDeprecation reference) {
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
         * Whether the dataset is deprecated by owner.
         * 
         */
        public PathSpec deprecated() {
            return new PathSpec(getPathComponents(), "deprecated");
        }

        /**
         * The time user plan to decommission this dataset.
         * 
         */
        public PathSpec decommissionTime() {
            return new PathSpec(getPathComponents(), "decommissionTime");
        }

        /**
         * Additional information about the dataset deprecation plan, such as the wiki, doc, RB.
         * 
         */
        public PathSpec note() {
            return new PathSpec(getPathComponents(), "note");
        }

        /**
         * The corpuser URN which will be credited for modifying this deprecation content.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Whether the dataset is deprecated by owner.
         * 
         */
        public DatasetDeprecation.ProjectionMask withDeprecated() {
            getDataMap().put("deprecated", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time user plan to decommission this dataset.
         * 
         */
        public DatasetDeprecation.ProjectionMask withDecommissionTime() {
            getDataMap().put("decommissionTime", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional information about the dataset deprecation plan, such as the wiki, doc, RB.
         * 
         */
        public DatasetDeprecation.ProjectionMask withNote() {
            getDataMap().put("note", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The corpuser URN which will be credited for modifying this deprecation content.
         * 
         */
        public DatasetDeprecation.ProjectionMask withActor() {
            getDataMap().put("actor", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
