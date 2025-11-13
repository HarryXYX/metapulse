
package com.linkedin.metadata.query;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/GroupingSpec.pdl.")
public class GroupingCriterionArray
    extends WrappingArrayTemplate<GroupingCriterion>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.query,record GroupingCriterion{/**The type of the entity to be grouped.\ne.g. schemaField\nOmitting this field will result in all base entities being grouped.*/baseEntityType:optional string/**The type of the entity to be grouped into.\ne.g. dataset, domain, etc.*/groupingEntityType:string}}]", SchemaFormatType.PDL));

    public GroupingCriterionArray() {
        this(new DataList());
    }

    public GroupingCriterionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public GroupingCriterionArray(Collection<GroupingCriterion> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public GroupingCriterionArray(DataList data) {
        super(data, SCHEMA, GroupingCriterion.class);
    }

    public GroupingCriterionArray(GroupingCriterion first, GroupingCriterion... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static GroupingCriterionArray.ProjectionMask createMask() {
        return new GroupingCriterionArray.ProjectionMask();
    }

    @Override
    public GroupingCriterionArray clone()
        throws CloneNotSupportedException
    {
        GroupingCriterionArray __clone = ((GroupingCriterionArray) super.clone());
        return __clone;
    }

    @Override
    public GroupingCriterionArray copy()
        throws CloneNotSupportedException
    {
        GroupingCriterionArray __copy = ((GroupingCriterionArray) super.copy());
        return __copy;
    }

    @Override
    protected GroupingCriterion coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new GroupingCriterion(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.query.GroupingCriterion.Fields items() {
            return new com.linkedin.metadata.query.GroupingCriterion.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.GroupingCriterion.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public GroupingCriterionArray.ProjectionMask withItems(Function<com.linkedin.metadata.query.GroupingCriterion.ProjectionMask, com.linkedin.metadata.query.GroupingCriterion.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?GroupingCriterion.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
