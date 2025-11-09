
package com.linkedin.metadata.search;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.LongMap;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/AggregationMetadata.pdl.")
public class AggregationMetadata
    extends RecordTemplate
{

    private final static AggregationMetadata.Fields _fields = new AggregationMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search,record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**Entity associated with this facet*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional com.linkedin.common.Urn,facetCount:long,filtered:optional boolean}]}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _displayNameField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private LongMap _aggregationsField = null;
    private FilterValueArray _filterValuesField = null;
    private AggregationMetadata.ChangeListener __changeListener = new AggregationMetadata.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");
    private final static RecordDataSchema.Field FIELD_FilterValues = SCHEMA.getField("filterValues");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public AggregationMetadata() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public AggregationMetadata(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AggregationMetadata.Fields fields() {
        return _fields;
    }

    public static AggregationMetadata.ProjectionMask createMask() {
        return new AggregationMetadata.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationMetadata.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see AggregationMetadata.Fields#name
     */
    public AggregationMetadata setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.search.AggregationMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#name
     */
    public AggregationMetadata setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.search.AggregationMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public boolean hasDisplayName() {
        if (_displayNameField!= null) {
            return true;
        }
        return super._map.containsKey("displayName");
    }

    /**
     * Remover for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public void removeDisplayName() {
        super._map.remove("displayName");
    }

    /**
     * Getter for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    @Nullable
    public String getDisplayName(GetMode mode) {
        return getDisplayName();
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AggregationMetadata.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        if (_displayNameField!= null) {
            return _displayNameField;
        } else {
            Object __rawValue = super._map.get("displayName");
            _displayNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _displayNameField;
        }
    }

    /**
     * Setter for displayName
     * 
     * @see AggregationMetadata.Fields#displayName
     */
    public AggregationMetadata setDisplayName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDisplayName(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDisplayName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "displayName", value);
                    _displayNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#displayName
     */
    public AggregationMetadata setDisplayName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field displayName of com.linkedin.metadata.search.AggregationMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "displayName", value);
            _displayNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see AggregationMetadata.Fields#entity
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
     * @see AggregationMetadata.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see AggregationMetadata.Fields#entity
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
     * @see AggregationMetadata.Fields#entity
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
     * @see AggregationMetadata.Fields#entity
     */
    public AggregationMetadata setEntity(
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
     * @see AggregationMetadata.Fields#entity
     */
    public AggregationMetadata setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.metadata.search.AggregationMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public boolean hasAggregations() {
        if (_aggregationsField!= null) {
            return true;
        }
        return super._map.containsKey("aggregations");
    }

    /**
     * Remover for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public void removeAggregations() {
        super._map.remove("aggregations");
    }

    /**
     * Getter for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    @Nullable
    public LongMap getAggregations(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAggregations();
            case DEFAULT:
            case NULL:
                if (_aggregationsField!= null) {
                    return _aggregationsField;
                } else {
                    Object __rawValue = super._map.get("aggregations");
                    _aggregationsField = ((__rawValue == null)?null:new LongMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _aggregationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationMetadata.Fields#aggregations
     */
    @Nonnull
    public LongMap getAggregations() {
        if (_aggregationsField!= null) {
            return _aggregationsField;
        } else {
            Object __rawValue = super._map.get("aggregations");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aggregations");
            }
            _aggregationsField = ((__rawValue == null)?null:new LongMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aggregationsField;
        }
    }

    /**
     * Setter for aggregations
     * 
     * @see AggregationMetadata.Fields#aggregations
     */
    public AggregationMetadata setAggregations(
        @Nullable
        LongMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregations(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aggregations of com.linkedin.metadata.search.AggregationMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#aggregations
     */
    public AggregationMetadata setAggregations(
        @Nonnull
        LongMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregations of com.linkedin.metadata.search.AggregationMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
            _aggregationsField = value;
        }
        return this;
    }

    /**
     * Existence checker for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public boolean hasFilterValues() {
        if (_filterValuesField!= null) {
            return true;
        }
        return super._map.containsKey("filterValues");
    }

    /**
     * Remover for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public void removeFilterValues() {
        super._map.remove("filterValues");
    }

    /**
     * Getter for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    @Nullable
    public FilterValueArray getFilterValues(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFilterValues();
            case DEFAULT:
            case NULL:
                if (_filterValuesField!= null) {
                    return _filterValuesField;
                } else {
                    Object __rawValue = super._map.get("filterValues");
                    _filterValuesField = ((__rawValue == null)?null:new FilterValueArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _filterValuesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for filterValues
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AggregationMetadata.Fields#filterValues
     */
    @Nonnull
    public FilterValueArray getFilterValues() {
        if (_filterValuesField!= null) {
            return _filterValuesField;
        } else {
            Object __rawValue = super._map.get("filterValues");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("filterValues");
            }
            _filterValuesField = ((__rawValue == null)?null:new FilterValueArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _filterValuesField;
        }
    }

    /**
     * Setter for filterValues
     * 
     * @see AggregationMetadata.Fields#filterValues
     */
    public AggregationMetadata setFilterValues(
        @Nullable
        FilterValueArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilterValues(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field filterValues of com.linkedin.metadata.search.AggregationMetadata");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filterValues", value.data());
                    _filterValuesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilterValues();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filterValues", value.data());
                    _filterValuesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filterValues", value.data());
                    _filterValuesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filterValues
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AggregationMetadata.Fields#filterValues
     */
    public AggregationMetadata setFilterValues(
        @Nonnull
        FilterValueArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filterValues of com.linkedin.metadata.search.AggregationMetadata to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filterValues", value.data());
            _filterValuesField = value;
        }
        return this;
    }

    @Override
    public AggregationMetadata clone()
        throws CloneNotSupportedException
    {
        AggregationMetadata __clone = ((AggregationMetadata) super.clone());
        __clone.__changeListener = new AggregationMetadata.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AggregationMetadata copy()
        throws CloneNotSupportedException
    {
        AggregationMetadata __copy = ((AggregationMetadata) super.copy());
        __copy._filterValuesField = null;
        __copy._displayNameField = null;
        __copy._nameField = null;
        __copy._aggregationsField = null;
        __copy._entityField = null;
        __copy.__changeListener = new AggregationMetadata.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AggregationMetadata __objectRef;

        private ChangeListener(AggregationMetadata reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filterValues":
                    __objectRef._filterValuesField = null;
                    break;
                case "displayName":
                    __objectRef._displayNameField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "aggregations":
                    __objectRef._aggregationsField = null;
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

        /**
         * The name of the aggregation, e.g, platform, origin
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Name of the filter to be displayed in the UI
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * Entity associated with this facet
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc
         * 
         */
        public PathSpec aggregations() {
            return new PathSpec(getPathComponents(), "aggregations");
        }

        public com.linkedin.metadata.search.FilterValueArray.Fields filterValues() {
            return new com.linkedin.metadata.search.FilterValueArray.Fields(getPathComponents(), "filterValues");
        }

        public PathSpec filterValues(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "filterValues");
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

        private com.linkedin.metadata.search.FilterValueArray.ProjectionMask _filterValuesMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * The name of the aggregation, e.g, platform, origin
         * 
         */
        public AggregationMetadata.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the filter to be displayed in the UI
         * 
         */
        public AggregationMetadata.ProjectionMask withDisplayName() {
            getDataMap().put("displayName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Entity associated with this facet
         * 
         */
        public AggregationMetadata.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc
         * 
         */
        public AggregationMetadata.ProjectionMask withAggregations() {
            getDataMap().put("aggregations", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AggregationMetadata.ProjectionMask withFilterValues(Function<com.linkedin.metadata.search.FilterValueArray.ProjectionMask, com.linkedin.metadata.search.FilterValueArray.ProjectionMask> nestedMask) {
            _filterValuesMask = nestedMask.apply(((_filterValuesMask == null)?FilterValueArray.createMask():_filterValuesMask));
            getDataMap().put("filterValues", _filterValuesMask.getDataMap());
            return this;
        }

        public AggregationMetadata.ProjectionMask withFilterValues() {
            _filterValuesMask = null;
            getDataMap().put("filterValues", MaskMap.POSITIVE_MASK);
            return this;
        }

        public AggregationMetadata.ProjectionMask withFilterValues(Function<com.linkedin.metadata.search.FilterValueArray.ProjectionMask, com.linkedin.metadata.search.FilterValueArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _filterValuesMask = nestedMask.apply(((_filterValuesMask == null)?FilterValueArray.createMask():_filterValuesMask));
            getDataMap().put("filterValues", _filterValuesMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("filterValues").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("filterValues").put("$count", count);
            }
            return this;
        }

        public AggregationMetadata.ProjectionMask withFilterValues(Integer start, Integer count) {
            _filterValuesMask = null;
            getDataMap().put("filterValues", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("filterValues").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("filterValues").put("$count", count);
            }
            return this;
        }

    }

}
