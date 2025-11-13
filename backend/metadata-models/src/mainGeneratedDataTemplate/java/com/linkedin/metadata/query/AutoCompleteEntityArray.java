
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/query/AutoCompleteResult.pdl.")
public class AutoCompleteEntityArray
    extends WrappingArrayTemplate<AutoCompleteEntity>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.query/**Data model for an entity returned as an autocomplete suggestion*/record AutoCompleteEntity{/**Urn of the entity*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public AutoCompleteEntityArray() {
        this(new DataList());
    }

    public AutoCompleteEntityArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AutoCompleteEntityArray(Collection<AutoCompleteEntity> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AutoCompleteEntityArray(DataList data) {
        super(data, SCHEMA, AutoCompleteEntity.class);
    }

    public AutoCompleteEntityArray(AutoCompleteEntity first, AutoCompleteEntity... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static AutoCompleteEntityArray.ProjectionMask createMask() {
        return new AutoCompleteEntityArray.ProjectionMask();
    }

    @Override
    public AutoCompleteEntityArray clone()
        throws CloneNotSupportedException
    {
        AutoCompleteEntityArray __clone = ((AutoCompleteEntityArray) super.clone());
        return __clone;
    }

    @Override
    public AutoCompleteEntityArray copy()
        throws CloneNotSupportedException
    {
        AutoCompleteEntityArray __copy = ((AutoCompleteEntityArray) super.copy());
        return __copy;
    }

    @Override
    protected AutoCompleteEntity coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new AutoCompleteEntity(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.query.AutoCompleteEntity.Fields items() {
            return new com.linkedin.metadata.query.AutoCompleteEntity.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.query.AutoCompleteEntity.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public AutoCompleteEntityArray.ProjectionMask withItems(Function<com.linkedin.metadata.query.AutoCompleteEntity.ProjectionMask, com.linkedin.metadata.query.AutoCompleteEntity.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?AutoCompleteEntity.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
