
package com.linkedin.assertion;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionActions.pdl.")
public class AssertionActionArray
    extends WrappingArrayTemplate<AssertionAction>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.assertion/**The Actions about an Assertion.\nIn the future, we'll likely extend this model to support additional\nparameters or options related to the assertion actions.*/record AssertionAction{/**The type of the Action*/type:enum AssertionActionType{/**Raise an incident.*/RAISE_INCIDENT/**Resolve open incidents related to the assertion.*/RESOLVE_INCIDENT}}}]", SchemaFormatType.PDL));

    public AssertionActionArray() {
        this(new DataList());
    }

    public AssertionActionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AssertionActionArray(Collection<AssertionAction> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AssertionActionArray(DataList data) {
        super(data, SCHEMA, AssertionAction.class);
    }

    public AssertionActionArray(AssertionAction first, AssertionAction... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static AssertionActionArray.ProjectionMask createMask() {
        return new AssertionActionArray.ProjectionMask();
    }

    @Override
    public AssertionActionArray clone()
        throws CloneNotSupportedException
    {
        AssertionActionArray __clone = ((AssertionActionArray) super.clone());
        return __clone;
    }

    @Override
    public AssertionActionArray copy()
        throws CloneNotSupportedException
    {
        AssertionActionArray __copy = ((AssertionActionArray) super.copy());
        return __copy;
    }

    @Override
    protected AssertionAction coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new AssertionAction(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.assertion.AssertionAction.Fields items() {
            return new com.linkedin.assertion.AssertionAction.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.AssertionAction.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public AssertionActionArray.ProjectionMask withItems(Function<com.linkedin.assertion.AssertionAction.ProjectionMask, com.linkedin.assertion.AssertionAction.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?AssertionAction.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
