
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
import com.linkedin.data.template.SetMode;


/**
 * The relationship filter to apply in a graph query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/RelationshipFilter.pdl.")
public class RelationshipFilter
    extends RecordTemplate
{

    private final static RelationshipFilter.Fields _fields = new RelationshipFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**The relationship filter to apply in a graph query*/record RelationshipFilter includes/**The filter for finding a record or a collection of records*/record Filter{/**A list of disjunctive criterion for the filter. (or operation to combine filters)*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}{/**The relationship direction between two nodes in a graph query*/direction:/**The relationship direction in a relationship filter*/enum RelationshipDirection{/**The incoming edge to a source node in the graph*/INCOMING/**The outgoing edge to a source node in the graph*/OUTGOING/**This is used for a query where the direction of the edge does not matter*/UNDIRECTED}=\"UNDIRECTED\"}", SchemaFormatType.PDL));
    private ConjunctiveCriterionArray _orField = null;
    private CriterionArray _criteriaField = null;
    private RelationshipDirection _directionField = null;
    private RelationshipFilter.ChangeListener __changeListener = new RelationshipFilter.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Or = SCHEMA.getField("or");
    private final static RecordDataSchema.Field FIELD_Criteria = SCHEMA.getField("criteria");
    private final static RecordDataSchema.Field FIELD_Direction = SCHEMA.getField("direction");
    private final static RelationshipDirection DEFAULT_Direction;

    static {
        DEFAULT_Direction = DataTemplateUtil.coerceEnumOutput(FIELD_Direction.getDefault(), RelationshipDirection.class, RelationshipDirection.$UNKNOWN);
    }

    public RelationshipFilter() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public RelationshipFilter(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RelationshipFilter.Fields fields() {
        return _fields;
    }

    public static RelationshipFilter.ProjectionMask createMask() {
        return new RelationshipFilter.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public boolean hasOr() {
        if (_orField!= null) {
            return true;
        }
        return super._map.containsKey("or");
    }

    /**
     * Remover for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public void removeOr() {
        super._map.remove("or");
    }

    /**
     * Getter for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    @Nullable
    public ConjunctiveCriterionArray getOr(GetMode mode) {
        return getOr();
    }

    /**
     * Getter for or
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipFilter.Fields#or
     */
    @Nullable
    public ConjunctiveCriterionArray getOr() {
        if (_orField!= null) {
            return _orField;
        } else {
            Object __rawValue = super._map.get("or");
            _orField = ((__rawValue == null)?null:new ConjunctiveCriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _orField;
        }
    }

    /**
     * Setter for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public RelationshipFilter setOr(
        @Nullable
        ConjunctiveCriterionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOr(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOr();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "or", value.data());
                    _orField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "or", value.data());
                    _orField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for or
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFilter.Fields#or
     */
    public RelationshipFilter setOr(
        @Nonnull
        ConjunctiveCriterionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field or of com.linkedin.metadata.query.filter.RelationshipFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "or", value.data());
            _orField = value;
        }
        return this;
    }

    /**
     * Existence checker for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public boolean hasCriteria() {
        if (_criteriaField!= null) {
            return true;
        }
        return super._map.containsKey("criteria");
    }

    /**
     * Remover for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public void removeCriteria() {
        super._map.remove("criteria");
    }

    /**
     * Getter for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    @Nullable
    public CriterionArray getCriteria(GetMode mode) {
        return getCriteria();
    }

    /**
     * Getter for criteria
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipFilter.Fields#criteria
     */
    @Nullable
    public CriterionArray getCriteria() {
        if (_criteriaField!= null) {
            return _criteriaField;
        } else {
            Object __rawValue = super._map.get("criteria");
            _criteriaField = ((__rawValue == null)?null:new CriterionArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _criteriaField;
        }
    }

    /**
     * Setter for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public RelationshipFilter setCriteria(
        @Nullable
        CriterionArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCriteria(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCriteria();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
                    _criteriaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
                    _criteriaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for criteria
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFilter.Fields#criteria
     */
    public RelationshipFilter setCriteria(
        @Nonnull
        CriterionArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field criteria of com.linkedin.metadata.query.filter.RelationshipFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "criteria", value.data());
            _criteriaField = value;
        }
        return this;
    }

    /**
     * Existence checker for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public boolean hasDirection() {
        if (_directionField!= null) {
            return true;
        }
        return super._map.containsKey("direction");
    }

    /**
     * Remover for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public void removeDirection() {
        super._map.remove("direction");
    }

    /**
     * Getter for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    @Nullable
    public RelationshipDirection getDirection(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getDirection();
            case NULL:
                if (_directionField!= null) {
                    return _directionField;
                } else {
                    Object __rawValue = super._map.get("direction");
                    _directionField = DataTemplateUtil.coerceEnumOutput(__rawValue, RelationshipDirection.class, RelationshipDirection.$UNKNOWN);
                    return _directionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for direction
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipFilter.Fields#direction
     */
    @Nonnull
    public RelationshipDirection getDirection() {
        if (_directionField!= null) {
            return _directionField;
        } else {
            Object __rawValue = super._map.get("direction");
            if (__rawValue == null) {
                return DEFAULT_Direction;
            }
            _directionField = DataTemplateUtil.coerceEnumOutput(__rawValue, RelationshipDirection.class, RelationshipDirection.$UNKNOWN);
            return _directionField;
        }
    }

    /**
     * Setter for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public RelationshipFilter setDirection(
        @Nullable
        RelationshipDirection value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDirection(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field direction of com.linkedin.metadata.query.filter.RelationshipFilter");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "direction", value.name());
                    _directionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDirection();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "direction", value.name());
                    _directionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "direction", value.name());
                    _directionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for direction
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFilter.Fields#direction
     */
    public RelationshipFilter setDirection(
        @Nonnull
        RelationshipDirection value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field direction of com.linkedin.metadata.query.filter.RelationshipFilter to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "direction", value.name());
            _directionField = value;
        }
        return this;
    }

    @Override
    public RelationshipFilter clone()
        throws CloneNotSupportedException
    {
        RelationshipFilter __clone = ((RelationshipFilter) super.clone());
        __clone.__changeListener = new RelationshipFilter.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RelationshipFilter copy()
        throws CloneNotSupportedException
    {
        RelationshipFilter __copy = ((RelationshipFilter) super.copy());
        __copy._orField = null;
        __copy._criteriaField = null;
        __copy._directionField = null;
        __copy.__changeListener = new RelationshipFilter.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RelationshipFilter __objectRef;

        private ChangeListener(RelationshipFilter reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "or":
                    __objectRef._orField = null;
                    break;
                case "criteria":
                    __objectRef._criteriaField = null;
                    break;
                case "direction":
                    __objectRef._directionField = null;
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
         * A list of disjunctive criterion for the filter. (or operation to combine filters)
         * 
         */
        public com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.Fields or() {
            return new com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.Fields(getPathComponents(), "or");
        }

        /**
         * A list of disjunctive criterion for the filter. (or operation to combine filters)
         * 
         */
        public PathSpec or(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "or");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields criteria() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "criteria");
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public PathSpec criteria(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "criteria");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * The relationship direction between two nodes in a graph query
         * 
         */
        public PathSpec direction() {
            return new PathSpec(getPathComponents(), "direction");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.ProjectionMask _orMask;
        private com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask _criteriaMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * A list of disjunctive criterion for the filter. (or operation to combine filters)
         * 
         */
        public RelationshipFilter.ProjectionMask withOr(Function<com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.ProjectionMask> nestedMask) {
            _orMask = nestedMask.apply(((_orMask == null)?ConjunctiveCriterionArray.createMask():_orMask));
            getDataMap().put("or", _orMask.getDataMap());
            return this;
        }

        /**
         * A list of disjunctive criterion for the filter. (or operation to combine filters)
         * 
         */
        public RelationshipFilter.ProjectionMask withOr() {
            _orMask = null;
            getDataMap().put("or", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A list of disjunctive criterion for the filter. (or operation to combine filters)
         * 
         */
        public RelationshipFilter.ProjectionMask withOr(Function<com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _orMask = nestedMask.apply(((_orMask == null)?ConjunctiveCriterionArray.createMask():_orMask));
            getDataMap().put("or", _orMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("or").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("or").put("$count", count);
            }
            return this;
        }

        /**
         * A list of disjunctive criterion for the filter. (or operation to combine filters)
         * 
         */
        public RelationshipFilter.ProjectionMask withOr(Integer start, Integer count) {
            _orMask = null;
            getDataMap().put("or", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("or").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("or").put("$count", count);
            }
            return this;
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public RelationshipFilter.ProjectionMask withCriteria(Function<com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask> nestedMask) {
            _criteriaMask = nestedMask.apply(((_criteriaMask == null)?CriterionArray.createMask():_criteriaMask));
            getDataMap().put("criteria", _criteriaMask.getDataMap());
            return this;
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public RelationshipFilter.ProjectionMask withCriteria() {
            _criteriaMask = null;
            getDataMap().put("criteria", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public RelationshipFilter.ProjectionMask withCriteria(Function<com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask, com.linkedin.metadata.query.filter.CriterionArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _criteriaMask = nestedMask.apply(((_criteriaMask == null)?CriterionArray.createMask():_criteriaMask));
            getDataMap().put("criteria", _criteriaMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("criteria").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("criteria").put("$count", count);
            }
            return this;
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public RelationshipFilter.ProjectionMask withCriteria(Integer start, Integer count) {
            _criteriaMask = null;
            getDataMap().put("criteria", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("criteria").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("criteria").put("$count", count);
            }
            return this;
        }

        /**
         * The relationship direction between two nodes in a graph query
         * 
         */
        public RelationshipFilter.ProjectionMask withDirection() {
            getDataMap().put("direction", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
