
package com.linkedin.metadata.query;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArrayMap;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Set of flags to control lineage search behavior
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/LineageFlags.pdl.")
public class LineageFlags
    extends RecordTemplate
{

    private final static LineageFlags.Fields _fields = new LineageFlags.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query/**Set of flags to control lineage search behavior*/record LineageFlags{/**Limits number of entities explored per hop*/entitiesExploredPerHopLimit:optional int/**Start time for lineage edges to filter*/startTimeMillis:optional long/**End time for lineage edges to filter*/endTimeMillis:optional long/**Map of entity type to list of platform urns to ignore as hops during graph walk. Note: this can potentially cause\na large amount of additional hops to occur and should be used with caution.*/ignoreAsHops:optional map[string,array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]]}", SchemaFormatType.PDL));
    private Integer _entitiesExploredPerHopLimitField = null;
    private Long _startTimeMillisField = null;
    private Long _endTimeMillisField = null;
    private UrnArrayMap _ignoreAsHopsField = null;
    private LineageFlags.ChangeListener __changeListener = new LineageFlags.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntitiesExploredPerHopLimit = SCHEMA.getField("entitiesExploredPerHopLimit");
    private final static RecordDataSchema.Field FIELD_StartTimeMillis = SCHEMA.getField("startTimeMillis");
    private final static RecordDataSchema.Field FIELD_EndTimeMillis = SCHEMA.getField("endTimeMillis");
    private final static RecordDataSchema.Field FIELD_IgnoreAsHops = SCHEMA.getField("ignoreAsHops");

    public LineageFlags() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public LineageFlags(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LineageFlags.Fields fields() {
        return _fields;
    }

    public static LineageFlags.ProjectionMask createMask() {
        return new LineageFlags.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entitiesExploredPerHopLimit
     * 
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    public boolean hasEntitiesExploredPerHopLimit() {
        if (_entitiesExploredPerHopLimitField!= null) {
            return true;
        }
        return super._map.containsKey("entitiesExploredPerHopLimit");
    }

    /**
     * Remover for entitiesExploredPerHopLimit
     * 
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    public void removeEntitiesExploredPerHopLimit() {
        super._map.remove("entitiesExploredPerHopLimit");
    }

    /**
     * Getter for entitiesExploredPerHopLimit
     * 
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    @Nullable
    public Integer getEntitiesExploredPerHopLimit(GetMode mode) {
        return getEntitiesExploredPerHopLimit();
    }

    /**
     * Getter for entitiesExploredPerHopLimit
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    @Nullable
    public Integer getEntitiesExploredPerHopLimit() {
        if (_entitiesExploredPerHopLimitField!= null) {
            return _entitiesExploredPerHopLimitField;
        } else {
            Object __rawValue = super._map.get("entitiesExploredPerHopLimit");
            _entitiesExploredPerHopLimitField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _entitiesExploredPerHopLimitField;
        }
    }

    /**
     * Setter for entitiesExploredPerHopLimit
     * 
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    public LineageFlags setEntitiesExploredPerHopLimit(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntitiesExploredPerHopLimit(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntitiesExploredPerHopLimit();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesExploredPerHopLimit", DataTemplateUtil.coerceIntInput(value));
                    _entitiesExploredPerHopLimitField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entitiesExploredPerHopLimit", DataTemplateUtil.coerceIntInput(value));
                    _entitiesExploredPerHopLimitField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entitiesExploredPerHopLimit
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    public LineageFlags setEntitiesExploredPerHopLimit(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entitiesExploredPerHopLimit of com.linkedin.metadata.query.LineageFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entitiesExploredPerHopLimit", DataTemplateUtil.coerceIntInput(value));
            _entitiesExploredPerHopLimitField = value;
        }
        return this;
    }

    /**
     * Setter for entitiesExploredPerHopLimit
     * 
     * @see LineageFlags.Fields#entitiesExploredPerHopLimit
     */
    public LineageFlags setEntitiesExploredPerHopLimit(int value) {
        CheckedUtil.putWithoutChecking(super._map, "entitiesExploredPerHopLimit", DataTemplateUtil.coerceIntInput(value));
        _entitiesExploredPerHopLimitField = value;
        return this;
    }

    /**
     * Existence checker for startTimeMillis
     * 
     * @see LineageFlags.Fields#startTimeMillis
     */
    public boolean hasStartTimeMillis() {
        if (_startTimeMillisField!= null) {
            return true;
        }
        return super._map.containsKey("startTimeMillis");
    }

    /**
     * Remover for startTimeMillis
     * 
     * @see LineageFlags.Fields#startTimeMillis
     */
    public void removeStartTimeMillis() {
        super._map.remove("startTimeMillis");
    }

    /**
     * Getter for startTimeMillis
     * 
     * @see LineageFlags.Fields#startTimeMillis
     */
    @Nullable
    public Long getStartTimeMillis(GetMode mode) {
        return getStartTimeMillis();
    }

    /**
     * Getter for startTimeMillis
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageFlags.Fields#startTimeMillis
     */
    @Nullable
    public Long getStartTimeMillis() {
        if (_startTimeMillisField!= null) {
            return _startTimeMillisField;
        } else {
            Object __rawValue = super._map.get("startTimeMillis");
            _startTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _startTimeMillisField;
        }
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see LineageFlags.Fields#startTimeMillis
     */
    public LineageFlags setStartTimeMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStartTimeMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStartTimeMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageFlags.Fields#startTimeMillis
     */
    public LineageFlags setStartTimeMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field startTimeMillis of com.linkedin.metadata.query.LineageFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
            _startTimeMillisField = value;
        }
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see LineageFlags.Fields#startTimeMillis
     */
    public LineageFlags setStartTimeMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
        _startTimeMillisField = value;
        return this;
    }

    /**
     * Existence checker for endTimeMillis
     * 
     * @see LineageFlags.Fields#endTimeMillis
     */
    public boolean hasEndTimeMillis() {
        if (_endTimeMillisField!= null) {
            return true;
        }
        return super._map.containsKey("endTimeMillis");
    }

    /**
     * Remover for endTimeMillis
     * 
     * @see LineageFlags.Fields#endTimeMillis
     */
    public void removeEndTimeMillis() {
        super._map.remove("endTimeMillis");
    }

    /**
     * Getter for endTimeMillis
     * 
     * @see LineageFlags.Fields#endTimeMillis
     */
    @Nullable
    public Long getEndTimeMillis(GetMode mode) {
        return getEndTimeMillis();
    }

    /**
     * Getter for endTimeMillis
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageFlags.Fields#endTimeMillis
     */
    @Nullable
    public Long getEndTimeMillis() {
        if (_endTimeMillisField!= null) {
            return _endTimeMillisField;
        } else {
            Object __rawValue = super._map.get("endTimeMillis");
            _endTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _endTimeMillisField;
        }
    }

    /**
     * Setter for endTimeMillis
     * 
     * @see LineageFlags.Fields#endTimeMillis
     */
    public LineageFlags setEndTimeMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEndTimeMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEndTimeMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _endTimeMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _endTimeMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for endTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageFlags.Fields#endTimeMillis
     */
    public LineageFlags setEndTimeMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field endTimeMillis of com.linkedin.metadata.query.LineageFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
            _endTimeMillisField = value;
        }
        return this;
    }

    /**
     * Setter for endTimeMillis
     * 
     * @see LineageFlags.Fields#endTimeMillis
     */
    public LineageFlags setEndTimeMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "endTimeMillis", DataTemplateUtil.coerceLongInput(value));
        _endTimeMillisField = value;
        return this;
    }

    /**
     * Existence checker for ignoreAsHops
     * 
     * @see LineageFlags.Fields#ignoreAsHops
     */
    public boolean hasIgnoreAsHops() {
        if (_ignoreAsHopsField!= null) {
            return true;
        }
        return super._map.containsKey("ignoreAsHops");
    }

    /**
     * Remover for ignoreAsHops
     * 
     * @see LineageFlags.Fields#ignoreAsHops
     */
    public void removeIgnoreAsHops() {
        super._map.remove("ignoreAsHops");
    }

    /**
     * Getter for ignoreAsHops
     * 
     * @see LineageFlags.Fields#ignoreAsHops
     */
    @Nullable
    public UrnArrayMap getIgnoreAsHops(GetMode mode) {
        return getIgnoreAsHops();
    }

    /**
     * Getter for ignoreAsHops
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LineageFlags.Fields#ignoreAsHops
     */
    @Nullable
    public UrnArrayMap getIgnoreAsHops() {
        if (_ignoreAsHopsField!= null) {
            return _ignoreAsHopsField;
        } else {
            Object __rawValue = super._map.get("ignoreAsHops");
            _ignoreAsHopsField = ((__rawValue == null)?null:new UrnArrayMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _ignoreAsHopsField;
        }
    }

    /**
     * Setter for ignoreAsHops
     * 
     * @see LineageFlags.Fields#ignoreAsHops
     */
    public LineageFlags setIgnoreAsHops(
        @Nullable
        UrnArrayMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIgnoreAsHops(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIgnoreAsHops();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "ignoreAsHops", value.data());
                    _ignoreAsHopsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "ignoreAsHops", value.data());
                    _ignoreAsHopsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for ignoreAsHops
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LineageFlags.Fields#ignoreAsHops
     */
    public LineageFlags setIgnoreAsHops(
        @Nonnull
        UrnArrayMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field ignoreAsHops of com.linkedin.metadata.query.LineageFlags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "ignoreAsHops", value.data());
            _ignoreAsHopsField = value;
        }
        return this;
    }

    @Override
    public LineageFlags clone()
        throws CloneNotSupportedException
    {
        LineageFlags __clone = ((LineageFlags) super.clone());
        __clone.__changeListener = new LineageFlags.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LineageFlags copy()
        throws CloneNotSupportedException
    {
        LineageFlags __copy = ((LineageFlags) super.copy());
        __copy._endTimeMillisField = null;
        __copy._startTimeMillisField = null;
        __copy._entitiesExploredPerHopLimitField = null;
        __copy._ignoreAsHopsField = null;
        __copy.__changeListener = new LineageFlags.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LineageFlags __objectRef;

        private ChangeListener(LineageFlags reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "endTimeMillis":
                    __objectRef._endTimeMillisField = null;
                    break;
                case "startTimeMillis":
                    __objectRef._startTimeMillisField = null;
                    break;
                case "entitiesExploredPerHopLimit":
                    __objectRef._entitiesExploredPerHopLimitField = null;
                    break;
                case "ignoreAsHops":
                    __objectRef._ignoreAsHopsField = null;
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
         * Limits number of entities explored per hop
         * 
         */
        public PathSpec entitiesExploredPerHopLimit() {
            return new PathSpec(getPathComponents(), "entitiesExploredPerHopLimit");
        }

        /**
         * Start time for lineage edges to filter
         * 
         */
        public PathSpec startTimeMillis() {
            return new PathSpec(getPathComponents(), "startTimeMillis");
        }

        /**
         * End time for lineage edges to filter
         * 
         */
        public PathSpec endTimeMillis() {
            return new PathSpec(getPathComponents(), "endTimeMillis");
        }

        /**
         * Map of entity type to list of platform urns to ignore as hops during graph walk. Note: this can potentially cause
         * a large amount of additional hops to occur and should be used with caution.
         * 
         */
        public PathSpec ignoreAsHops() {
            return new PathSpec(getPathComponents(), "ignoreAsHops");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Limits number of entities explored per hop
         * 
         */
        public LineageFlags.ProjectionMask withEntitiesExploredPerHopLimit() {
            getDataMap().put("entitiesExploredPerHopLimit", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Start time for lineage edges to filter
         * 
         */
        public LineageFlags.ProjectionMask withStartTimeMillis() {
            getDataMap().put("startTimeMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * End time for lineage edges to filter
         * 
         */
        public LineageFlags.ProjectionMask withEndTimeMillis() {
            getDataMap().put("endTimeMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Map of entity type to list of platform urns to ignore as hops during graph walk. Note: this can potentially cause
         * a large amount of additional hops to occur and should be used with caution.
         * 
         */
        public LineageFlags.ProjectionMask withIgnoreAsHops() {
            getDataMap().put("ignoreAsHops", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
