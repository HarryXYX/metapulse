
package com.linkedin.metadata.run;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/RollbackResponse.pdl.")
public class UnsafeEntityInfoArray
    extends WrappingArrayTemplate<UnsafeEntityInfo>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.run/** This record serves as a holder of information for entities that were unsafe to fully delete as part of a rollback operation.*/record UnsafeEntityInfo{/**Name of the entity this aspect information instance refers to.*/urn:string}}]", SchemaFormatType.PDL));

    public UnsafeEntityInfoArray() {
        this(new DataList());
    }

    public UnsafeEntityInfoArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public UnsafeEntityInfoArray(Collection<UnsafeEntityInfo> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public UnsafeEntityInfoArray(DataList data) {
        super(data, SCHEMA, UnsafeEntityInfo.class);
    }

    public UnsafeEntityInfoArray(UnsafeEntityInfo first, UnsafeEntityInfo... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static UnsafeEntityInfoArray.ProjectionMask createMask() {
        return new UnsafeEntityInfoArray.ProjectionMask();
    }

    @Override
    public UnsafeEntityInfoArray clone()
        throws CloneNotSupportedException
    {
        UnsafeEntityInfoArray __clone = ((UnsafeEntityInfoArray) super.clone());
        return __clone;
    }

    @Override
    public UnsafeEntityInfoArray copy()
        throws CloneNotSupportedException
    {
        UnsafeEntityInfoArray __copy = ((UnsafeEntityInfoArray) super.copy());
        return __copy;
    }

    @Override
    protected UnsafeEntityInfo coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new UnsafeEntityInfo(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.run.UnsafeEntityInfo.Fields items() {
            return new com.linkedin.metadata.run.UnsafeEntityInfo.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.run.UnsafeEntityInfo.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public UnsafeEntityInfoArray.ProjectionMask withItems(Function<com.linkedin.metadata.run.UnsafeEntityInfo.ProjectionMask, com.linkedin.metadata.run.UnsafeEntityInfo.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?UnsafeEntityInfo.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
