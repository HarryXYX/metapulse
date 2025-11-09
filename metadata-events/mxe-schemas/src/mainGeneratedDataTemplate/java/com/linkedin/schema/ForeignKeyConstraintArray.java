
package com.linkedin.schema;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
public class ForeignKeyConstraintArray
    extends WrappingArrayTemplate<ForeignKeyConstraint>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.schema/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"ForeignKeyTo\"}foreignFields:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"ForeignKeyToDataset\"}foreignDataset:com.linkedin.common.Urn}}]", SchemaFormatType.PDL));

    public ForeignKeyConstraintArray() {
        this(new DataList());
    }

    public ForeignKeyConstraintArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ForeignKeyConstraintArray(Collection<ForeignKeyConstraint> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ForeignKeyConstraintArray(DataList data) {
        super(data, SCHEMA, ForeignKeyConstraint.class);
    }

    public ForeignKeyConstraintArray(ForeignKeyConstraint first, ForeignKeyConstraint... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ForeignKeyConstraintArray.ProjectionMask createMask() {
        return new ForeignKeyConstraintArray.ProjectionMask();
    }

    @Override
    public ForeignKeyConstraintArray clone()
        throws CloneNotSupportedException
    {
        ForeignKeyConstraintArray __clone = ((ForeignKeyConstraintArray) super.clone());
        return __clone;
    }

    @Override
    public ForeignKeyConstraintArray copy()
        throws CloneNotSupportedException
    {
        ForeignKeyConstraintArray __copy = ((ForeignKeyConstraintArray) super.copy());
        return __copy;
    }

    @Override
    protected ForeignKeyConstraint coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new ForeignKeyConstraint(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.schema.ForeignKeyConstraint.Fields items() {
            return new com.linkedin.schema.ForeignKeyConstraint.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.ForeignKeyConstraint.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public ForeignKeyConstraintArray.ProjectionMask withItems(Function<com.linkedin.schema.ForeignKeyConstraint.ProjectionMask, com.linkedin.schema.ForeignKeyConstraint.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?ForeignKeyConstraint.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
