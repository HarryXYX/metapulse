
package com.linkedin.metadata.query.filter;

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


/**
 * A list of criterion and'd together.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/filter/ConjunctiveCriterion.pdl.")
public class ConjunctiveCriterion
    extends RecordTemplate
{

    private final static ConjunctiveCriterion.Fields _fields = new ConjunctiveCriterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}", SchemaFormatType.PDL));
    private CriterionArray _andField = null;
    private ConjunctiveCriterion.ChangeListener __changeListener = new ConjunctiveCriterion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_And = SCHEMA.getField("and");

    public ConjunctiveCriterion() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public ConjunctiveCriterion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ConjunctiveCriterion.Fields fields() {
        return _fields;
    }

    public static ConjunctiveCriterion.ProjectionMask createMask() {
        return new ConjunctiveCriterion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public boolean hasAnd() {
        if (_andField!= null) {
            return true;
        }
        return super._map.containsKey("and");
    }

    /**
     * Remover for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public void removeAnd() {
        super._map.remove("and");
    }

    /**
     * Getter for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    @Nullable
    public CriterionArray getAnd(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAnd();
            case DEFAULT:
            case NULL:
                if (_andField!= null) {
                    return _andField;
                } else {
                    Object __rawValue = super._map.get("and");
                    _andField = ((__rawValue == null)?null:new CriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _andField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for and
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ConjunctiveCriterion.Fields#and
     */
    @Nonnull
    public CriterionArray getAnd() {
        if (_andField!= null) {
            return _andField;
        } else {
            Object __rawValue = super._map.get("and");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("and");
            }
            _andField = ((__rawValue == null)?null:new CriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _andField;
        }
    }

    /**
     * Setter for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public ConjunctiveCriterion setAnd(
        @Nullable
        CriterionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAnd(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field and of com.linkedin.metadata.query.filter.ConjunctiveCriterion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "and", value.data());
                    _andField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAnd();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "and", value.data());
                    _andField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "and", value.data());
                    _andField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for and
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ConjunctiveCriterion.Fields#and
     */
    public ConjunctiveCriterion setAnd(
        @Nonnull
        CriterionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field and of com.linkedin.metadata.query.filter.ConjunctiveCriterion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "and", value.data());
            _andField = value;
        }
        return this;
    }

    @Override
    public ConjunctiveCriterion clone()
        throws CloneNotSupportedException
    {
        ConjunctiveCriterion __clone = ((ConjunctiveCriterion) super.clone());
        __clone.__changeListener = new ConjunctiveCriterion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ConjunctiveCriterion copy()
        throws CloneNotSupportedException
    {
        ConjunctiveCriterion __copy = ((ConjunctiveCriterion) super.copy());
        __copy._andField = null;
        __copy.__changeListener = new ConjunctiveCriterion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ConjunctiveCriterion __objectRef;

        private ChangeListener(ConjunctiveCriterion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "and":
                    __objectRef._andField = null;
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
         * A list of and criteria the filter applies to the query
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields and() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "and");
        }

        /**
         * A list of and criteria the filter applies to the query
         * 
         */
        public PathSpec and(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "and");
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

        private com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask _andMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * A list of and criteria the filter applies to the query
         * 
         */
        public ConjunctiveCriterion.ProjectionMask withAnd(Function<com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask> nestedMask) {
            _andMask = nestedMask.apply(((_andMask == null)?CriterionArray.createMask():_andMask));
            getDataMap().put("and", _andMask.getDataMap());
            return this;
        }

        /**
         * A list of and criteria the filter applies to the query
         * 
         */
        public ConjunctiveCriterion.ProjectionMask withAnd() {
            _andMask = null;
            getDataMap().put("and", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of and criteria the filter applies to the query
         * 
         */
        public ConjunctiveCriterion.ProjectionMask withAnd(Function<com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _andMask = nestedMask.apply(((_andMask == null)?CriterionArray.createMask():_andMask));
            getDataMap().put("and", _andMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("and").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("and").put("$count", count);
            }
            return this;
        }

        /**
         * A list of and criteria the filter applies to the query
         * 
         */
        public ConjunctiveCriterion.ProjectionMask withAnd(Integer start, Integer count) {
            _andMask = null;
            getDataMap().put("and", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("and").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("and").put("$count", count);
            }
            return this;
        }

    }

}
