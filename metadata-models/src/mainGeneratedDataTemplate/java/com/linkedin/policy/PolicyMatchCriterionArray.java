
package com.linkedin.policy;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/policy/PolicyMatchFilter.pdl.")
public class PolicyMatchCriterionArray
    extends WrappingArrayTemplate<PolicyMatchCriterion>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.policy/**A criterion for matching a field with given value*/record PolicyMatchCriterion{/**The name of the field that the criterion refers to*/field:string/**Values. Matches criterion if any one of the values matches condition (OR-relationship)*/values:array[string]/**The condition for the criterion*/condition:/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}=\"EQUALS\"}}]", SchemaFormatType.PDL));

    public PolicyMatchCriterionArray() {
        this(new DataList());
    }

    public PolicyMatchCriterionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public PolicyMatchCriterionArray(Collection<PolicyMatchCriterion> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public PolicyMatchCriterionArray(DataList data) {
        super(data, SCHEMA, PolicyMatchCriterion.class);
    }

    public PolicyMatchCriterionArray(PolicyMatchCriterion first, PolicyMatchCriterion... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static PolicyMatchCriterionArray.ProjectionMask createMask() {
        return new PolicyMatchCriterionArray.ProjectionMask();
    }

    @Override
    public PolicyMatchCriterionArray clone()
        throws CloneNotSupportedException
    {
        PolicyMatchCriterionArray __clone = ((PolicyMatchCriterionArray) super.clone());
        return __clone;
    }

    @Override
    public PolicyMatchCriterionArray copy()
        throws CloneNotSupportedException
    {
        PolicyMatchCriterionArray __copy = ((PolicyMatchCriterionArray) super.copy());
        return __copy;
    }

    @Override
    protected PolicyMatchCriterion coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new PolicyMatchCriterion(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.policy.PolicyMatchCriterion.Fields items() {
            return new com.linkedin.policy.PolicyMatchCriterion.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.policy.PolicyMatchCriterion.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public PolicyMatchCriterionArray.ProjectionMask withItems(Function<com.linkedin.policy.PolicyMatchCriterion.ProjectionMask, com.linkedin.policy.PolicyMatchCriterion.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?PolicyMatchCriterion.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
