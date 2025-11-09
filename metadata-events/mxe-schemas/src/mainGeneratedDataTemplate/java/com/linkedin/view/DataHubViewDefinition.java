
package com.linkedin.view;

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
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.filter.Filter;


/**
 * A View definition.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/view/DataHubViewDefinition.pdl.")
public class DataHubViewDefinition
    extends RecordTemplate
{

    private final static DataHubViewDefinition.Fields _fields = new DataHubViewDefinition.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.view/**A View definition.*/record DataHubViewDefinition{/**The Entity Types in the scope of the View.*/entityTypes:array[string]/**The filter criteria, which represents the view itself*/filter:{namespace com.linkedin.metadata.query.filter/**The filter for finding a record or a collection of records*/record Filter{/**A list of disjunctive criterion for the filter. (or operation to combine filters)*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}}}", SchemaFormatType.PDL));
    private StringArray _entityTypesField = null;
    private Filter _filterField = null;
    private DataHubViewDefinition.ChangeListener __changeListener = new DataHubViewDefinition.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EntityTypes = SCHEMA.getField("entityTypes");
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");

    public DataHubViewDefinition() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public DataHubViewDefinition(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DataHubViewDefinition.Fields fields() {
        return _fields;
    }

    public static DataHubViewDefinition.ProjectionMask createMask() {
        return new DataHubViewDefinition.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for entityTypes
     * 
     * @see DataHubViewDefinition.Fields#entityTypes
     */
    public boolean hasEntityTypes() {
        if (_entityTypesField!= null) {
            return true;
        }
        return super._map.containsKey("entityTypes");
    }

    /**
     * Remover for entityTypes
     * 
     * @see DataHubViewDefinition.Fields#entityTypes
     */
    public void removeEntityTypes() {
        super._map.remove("entityTypes");
    }

    /**
     * Getter for entityTypes
     * 
     * @see DataHubViewDefinition.Fields#entityTypes
     */
    @Nullable
    public StringArray getEntityTypes(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntityTypes();
            case DEFAULT:
            case NULL:
                if (_entityTypesField!= null) {
                    return _entityTypesField;
                } else {
                    Object __rawValue = super._map.get("entityTypes");
                    _entityTypesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _entityTypesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entityTypes
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubViewDefinition.Fields#entityTypes
     */
    @Nonnull
    public StringArray getEntityTypes() {
        if (_entityTypesField!= null) {
            return _entityTypesField;
        } else {
            Object __rawValue = super._map.get("entityTypes");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entityTypes");
            }
            _entityTypesField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _entityTypesField;
        }
    }

    /**
     * Setter for entityTypes
     * 
     * @see DataHubViewDefinition.Fields#entityTypes
     */
    public DataHubViewDefinition setEntityTypes(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntityTypes(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entityTypes of com.linkedin.view.DataHubViewDefinition");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
                    _entityTypesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntityTypes();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
                    _entityTypesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
                    _entityTypesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entityTypes
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubViewDefinition.Fields#entityTypes
     */
    public DataHubViewDefinition setEntityTypes(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entityTypes of com.linkedin.view.DataHubViewDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entityTypes", value.data());
            _entityTypesField = value;
        }
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see DataHubViewDefinition.Fields#filter
     */
    public boolean hasFilter() {
        if (_filterField!= null) {
            return true;
        }
        return super._map.containsKey("filter");
    }

    /**
     * Remover for filter
     * 
     * @see DataHubViewDefinition.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see DataHubViewDefinition.Fields#filter
     */
    @Nullable
    public Filter getFilter(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFilter();
            case DEFAULT:
            case NULL:
                if (_filterField!= null) {
                    return _filterField;
                } else {
                    Object __rawValue = super._map.get("filter");
                    _filterField = ((__rawValue == null)?null:new Filter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _filterField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for filter
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataHubViewDefinition.Fields#filter
     */
    @Nonnull
    public Filter getFilter() {
        if (_filterField!= null) {
            return _filterField;
        } else {
            Object __rawValue = super._map.get("filter");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("filter");
            }
            _filterField = ((__rawValue == null)?null:new Filter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _filterField;
        }
    }

    /**
     * Setter for filter
     * 
     * @see DataHubViewDefinition.Fields#filter
     */
    public DataHubViewDefinition setFilter(
        @Nullable
        Filter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilter(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field filter of com.linkedin.view.DataHubViewDefinition");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilter();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataHubViewDefinition.Fields#filter
     */
    public DataHubViewDefinition setFilter(
        @Nonnull
        Filter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.view.DataHubViewDefinition to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    @Override
    public DataHubViewDefinition clone()
        throws CloneNotSupportedException
    {
        DataHubViewDefinition __clone = ((DataHubViewDefinition) super.clone());
        __clone.__changeListener = new DataHubViewDefinition.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubViewDefinition copy()
        throws CloneNotSupportedException
    {
        DataHubViewDefinition __copy = ((DataHubViewDefinition) super.copy());
        __copy._filterField = null;
        __copy._entityTypesField = null;
        __copy.__changeListener = new DataHubViewDefinition.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubViewDefinition __objectRef;

        private ChangeListener(DataHubViewDefinition reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "entityTypes":
                    __objectRef._entityTypesField = null;
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
         * The Entity Types in the scope of the View.
         * 
         */
        public PathSpec entityTypes() {
            return new PathSpec(getPathComponents(), "entityTypes");
        }

        /**
         * The Entity Types in the scope of the View.
         * 
         */
        public PathSpec entityTypes(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "entityTypes");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The filter criteria, which represents the view itself
         * 
         */
        public com.linkedin.metadata.query.filter.Filter.Fields filter() {
            return new com.linkedin.metadata.query.filter.Filter.Fields(getPathComponents(), "filter");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.filter.Filter.ProjectionMask _filterMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The Entity Types in the scope of the View.
         * 
         */
        public DataHubViewDefinition.ProjectionMask withEntityTypes() {
            getDataMap().put("entityTypes", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The Entity Types in the scope of the View.
         * 
         */
        public DataHubViewDefinition.ProjectionMask withEntityTypes(Integer start, Integer count) {
            getDataMap().put("entityTypes", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("entityTypes").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("entityTypes").put("$count", count);
            }
            return this;
        }

        /**
         * The filter criteria, which represents the view itself
         * 
         */
        public DataHubViewDefinition.ProjectionMask withFilter(Function<com.linkedin.metadata.query.filter.Filter.ProjectionMask, com.linkedin.metadata.query.filter.Filter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?Filter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * The filter criteria, which represents the view itself
         * 
         */
        public DataHubViewDefinition.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
