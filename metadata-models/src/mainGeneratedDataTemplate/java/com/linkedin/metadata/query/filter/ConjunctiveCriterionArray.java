
package com.linkedin.metadata.query.filter;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/filter/Filter.pdl.")
public class ConjunctiveCriterionArray
    extends WrappingArrayTemplate<ConjunctiveCriterion>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.query.filter/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**Values. one of which the intended field should match\nNote, if values is set, the above \"value\" field will be ignored*/values:array[string]=[]/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation: field = value and support case insensitive values, e.g. platform = hdfs*/IEQUAL/**Represent the relation: field is null, e.g. platform is null*/IS_NULL/**Represents the relation: field exists and is non-empty, e.g. owners is not null and != [] (empty)*/EXISTS/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH/**Represent the relation: URN field any nested children in addition to the given URN*/DESCENDANTS_INCL/**Represent the relation: URN field matches any nested parent in addition to the given URN*/ANCESTORS_INCL/**Represent the relation: URN field matches any nested child or parent in addition to the given URN*/RELATED_INCL}=\"EQUAL\"/**Whether the condition should be negated*/negated:boolean=false}]}}]", SchemaFormatType.PDL));

    public ConjunctiveCriterionArray() {
        this(new DataList());
    }

    public ConjunctiveCriterionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ConjunctiveCriterionArray(Collection<ConjunctiveCriterion> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ConjunctiveCriterionArray(DataList data) {
        super(data, SCHEMA, ConjunctiveCriterion.class);
    }

    public ConjunctiveCriterionArray(ConjunctiveCriterion first, ConjunctiveCriterion... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ConjunctiveCriterionArray.ProjectionMask createMask() {
        return new ConjunctiveCriterionArray.ProjectionMask();
    }

    @Override
    public ConjunctiveCriterionArray clone()
        throws CloneNotSupportedException
    {
        ConjunctiveCriterionArray __clone = ((ConjunctiveCriterionArray) super.clone());
        return __clone;
    }

    @Override
    public ConjunctiveCriterionArray copy()
        throws CloneNotSupportedException
    {
        ConjunctiveCriterionArray __copy = ((ConjunctiveCriterionArray) super.copy());
        return __copy;
    }

    @Override
    protected ConjunctiveCriterion coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new ConjunctiveCriterion(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.query.filter.ConjunctiveCriterion.Fields items() {
            return new com.linkedin.metadata.query.filter.ConjunctiveCriterion.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.filter.ConjunctiveCriterion.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public ConjunctiveCriterionArray.ProjectionMask withItems(Function<com.linkedin.metadata.query.filter.ConjunctiveCriterion.ProjectionMask, com.linkedin.metadata.query.filter.ConjunctiveCriterion.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?ConjunctiveCriterion.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
