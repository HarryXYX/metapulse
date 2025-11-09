
package com.linkedin.form;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.metadata.query.filter.Filter;


/**
 * Information about how a form is assigned to entities dynamically. Provide a filter to
 * match a set of entities instead of explicitly applying a form to specific entities.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/form/DynamicFormAssignment.pdl.")
public class DynamicFormAssignment
    extends RecordTemplate
{

    private final static DynamicFormAssignment.Fields _fields = new DynamicFormAssignment.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.form/**Information about how a form is assigned to entities dynamically. Provide a filter to\nmatch a set of entities instead of explicitly applying a form to specific entities.*/@Aspect.name=\"dynamicFormAssignment\"record DynamicFormAssignment{/**The filter applied when assigning this form to entities. Entities that match this filter\nwill have this form applied to them. Right now this filter only supports filtering by\nplatform, entity type, container, and domain through the UI.*/filter:{namespace com.linkedin.metadata.query.filter/**The filter for finding a record or a collection of records*/record Filter{/**A list of disjunctive criterion for the filter. (or operation to combine filters)*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}}}", SchemaFormatType.PDL));
    private Filter _filterField = null;
    private DynamicFormAssignment.ChangeListener __changeListener = new DynamicFormAssignment.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");

    public DynamicFormAssignment() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DynamicFormAssignment(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DynamicFormAssignment.Fields fields() {
        return _fields;
    }

    public static DynamicFormAssignment.ProjectionMask createMask() {
        return new DynamicFormAssignment.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for filter
     * 
     * @see DynamicFormAssignment.Fields#filter
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
     * @see DynamicFormAssignment.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see DynamicFormAssignment.Fields#filter
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
     * @see DynamicFormAssignment.Fields#filter
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
     * @see DynamicFormAssignment.Fields#filter
     */
    public DynamicFormAssignment setFilter(
        @Nullable
        Filter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilter(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field filter of com.linkedin.form.DynamicFormAssignment");
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
     * @see DynamicFormAssignment.Fields#filter
     */
    public DynamicFormAssignment setFilter(
        @Nonnull
        Filter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.form.DynamicFormAssignment to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    @Override
    public DynamicFormAssignment clone()
        throws CloneNotSupportedException
    {
        DynamicFormAssignment __clone = ((DynamicFormAssignment) super.clone());
        __clone.__changeListener = new DynamicFormAssignment.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DynamicFormAssignment copy()
        throws CloneNotSupportedException
    {
        DynamicFormAssignment __copy = ((DynamicFormAssignment) super.copy());
        __copy._filterField = null;
        __copy.__changeListener = new DynamicFormAssignment.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DynamicFormAssignment __objectRef;

        private ChangeListener(DynamicFormAssignment reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
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
         * The filter applied when assigning this form to entities. Entities that match this filter
         * will have this form applied to them. Right now this filter only supports filtering by
         * platform, entity type, container, and domain through the UI.
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
            super(2);
        }

        /**
         * The filter applied when assigning this form to entities. Entities that match this filter
         * will have this form applied to them. Right now this filter only supports filtering by
         * platform, entity type, container, and domain through the UI.
         * 
         */
        public DynamicFormAssignment.ProjectionMask withFilter(Function<com.linkedin.metadata.query.filter.Filter.ProjectionMask, com.linkedin.metadata.query.filter.Filter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?Filter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * The filter applied when assigning this form to entities. Entities that match this filter
         * will have this form applied to them. Right now this filter only supports filtering by
         * platform, entity type, container, and domain through the UI.
         * 
         */
        public DynamicFormAssignment.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
