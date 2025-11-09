
package com.linkedin.metadata.search;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/AggregationMetadata.pdl.")
public class FilterValue
    extends RecordTemplate
{

    private final static FilterValue.Fields _fields = new FilterValue.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search,record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long,filtered:optional boolean}", SchemaFormatType.PDL));
    private String _valueField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private Long _facetCountField = null;
    private Boolean _filteredField = null;
    private FilterValue.ChangeListener __changeListener = new FilterValue.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_FacetCount = SCHEMA.getField("facetCount");
    private final static RecordDataSchema.Field FIELD_Filtered = SCHEMA.getField("filtered");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public FilterValue() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FilterValue(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FilterValue.Fields fields() {
        return _fields;
    }

    public static FilterValue.ProjectionMask createMask() {
        return new FilterValue.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see FilterValue.Fields#value
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
     * @see FilterValue.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see FilterValue.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see FilterValue.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see FilterValue.Fields#value
     */
    public FilterValue setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.metadata.search.FilterValue");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
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
     * @see FilterValue.Fields#value
     */
    public FilterValue setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.metadata.search.FilterValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see FilterValue.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        return getEntity();
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FilterValue.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see FilterValue.Fields#entity
     */
    public FilterValue setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FilterValue.Fields#entity
     */
    public FilterValue setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.search.FilterValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public boolean hasFacetCount() {
        if (_facetCountField!= null) {
            return true;
        }
        return super._map.containsKey("facetCount");
    }

    /**
     * Remover for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public void removeFacetCount() {
        super._map.remove("facetCount");
    }

    /**
     * Getter for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    @Nullable
    public Long getFacetCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFacetCount();
            case DEFAULT:
            case NULL:
                if (_facetCountField!= null) {
                    return _facetCountField;
                } else {
                    Object __rawValue = super._map.get("facetCount");
                    _facetCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _facetCountField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for facetCount
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FilterValue.Fields#facetCount
     */
    @Nonnull
    public Long getFacetCount() {
        if (_facetCountField!= null) {
            return _facetCountField;
        } else {
            Object __rawValue = super._map.get("facetCount");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("facetCount");
            }
            _facetCountField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _facetCountField;
        }
    }

    /**
     * Setter for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public FilterValue setFacetCount(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFacetCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field facetCount of com.linkedin.metadata.search.FilterValue");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "facetCount", DataTemplateUtil.coerceLongInput(value));
                    _facetCountField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFacetCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "facetCount", DataTemplateUtil.coerceLongInput(value));
                    _facetCountField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "facetCount", DataTemplateUtil.coerceLongInput(value));
                    _facetCountField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for facetCount
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FilterValue.Fields#facetCount
     */
    public FilterValue setFacetCount(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field facetCount of com.linkedin.metadata.search.FilterValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "facetCount", DataTemplateUtil.coerceLongInput(value));
            _facetCountField = value;
        }
        return this;
    }

    /**
     * Setter for facetCount
     * 
     * @see FilterValue.Fields#facetCount
     */
    public FilterValue setFacetCount(long value) {
        CheckedUtil.putWithoutChecking(super._map, "facetCount", DataTemplateUtil.coerceLongInput(value));
        _facetCountField = value;
        return this;
    }

    /**
     * Existence checker for filtered
     * 
     * @see FilterValue.Fields#filtered
     */
    public boolean hasFiltered() {
        if (_filteredField!= null) {
            return true;
        }
        return super._map.containsKey("filtered");
    }

    /**
     * Remover for filtered
     * 
     * @see FilterValue.Fields#filtered
     */
    public void removeFiltered() {
        super._map.remove("filtered");
    }

    /**
     * Getter for filtered
     * 
     * @see FilterValue.Fields#filtered
     */
    @Nullable
    public Boolean isFiltered(GetMode mode) {
        return isFiltered();
    }

    /**
     * Getter for filtered
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FilterValue.Fields#filtered
     */
    @Nullable
    public Boolean isFiltered() {
        if (_filteredField!= null) {
            return _filteredField;
        } else {
            Object __rawValue = super._map.get("filtered");
            _filteredField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _filteredField;
        }
    }

    /**
     * Setter for filtered
     * 
     * @see FilterValue.Fields#filtered
     */
    public FilterValue setFiltered(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFiltered(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFiltered();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filtered", value);
                    _filteredField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filtered", value);
                    _filteredField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filtered
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FilterValue.Fields#filtered
     */
    public FilterValue setFiltered(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filtered of com.linkedin.metadata.search.FilterValue to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filtered", value);
            _filteredField = value;
        }
        return this;
    }

    /**
     * Setter for filtered
     * 
     * @see FilterValue.Fields#filtered
     */
    public FilterValue setFiltered(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "filtered", value);
        _filteredField = value;
        return this;
    }

    @Override
    public FilterValue clone()
        throws CloneNotSupportedException
    {
        FilterValue __clone = ((FilterValue) super.clone());
        __clone.__changeListener = new FilterValue.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FilterValue copy()
        throws CloneNotSupportedException
    {
        FilterValue __copy = ((FilterValue) super.copy());
        __copy._filteredField = null;
        __copy._facetCountField = null;
        __copy._valueField = null;
        __copy._entityField = null;
        __copy.__changeListener = new FilterValue.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FilterValue __objectRef;

        private ChangeListener(FilterValue reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filtered":
                    __objectRef._filteredField = null;
                    break;
                case "facetCount":
                    __objectRef._facetCountField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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

        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        public PathSpec facetCount() {
            return new PathSpec(getPathComponents(), "facetCount");
        }

        public PathSpec filtered() {
            return new PathSpec(getPathComponents(), "filtered");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        public FilterValue.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        public FilterValue.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        public FilterValue.ProjectionMask withFacetCount() {
            getDataMap().put("facetCount", MaskMap.POSITIVE_MASK);
            return this;
        }

        public FilterValue.ProjectionMask withFiltered() {
            getDataMap().put("filtered", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
