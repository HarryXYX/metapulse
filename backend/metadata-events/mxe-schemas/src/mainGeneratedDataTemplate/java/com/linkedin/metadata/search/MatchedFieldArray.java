
package com.linkedin.metadata.search;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchEntity.pdl.")
public class MatchedFieldArray
    extends WrappingArrayTemplate<MatchedField>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search,record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}}]", SchemaFormatType.PDL));

    public MatchedFieldArray() {
        this(new DataList());
    }

    public MatchedFieldArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MatchedFieldArray(Collection<MatchedField> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MatchedFieldArray(DataList data) {
        super(data, SCHEMA, MatchedField.class);
    }

    public MatchedFieldArray(MatchedField first, MatchedField... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static MatchedFieldArray.ProjectionMask createMask() {
        return new MatchedFieldArray.ProjectionMask();
    }

    @Override
    public MatchedFieldArray clone()
        throws CloneNotSupportedException
    {
        MatchedFieldArray __clone = ((MatchedFieldArray) super.clone());
        return __clone;
    }

    @Override
    public MatchedFieldArray copy()
        throws CloneNotSupportedException
    {
        MatchedFieldArray __copy = ((MatchedFieldArray) super.copy());
        return __copy;
    }

    @Override
    protected MatchedField coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new MatchedField(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.search.MatchedField.Fields items() {
            return new com.linkedin.metadata.search.MatchedField.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.MatchedField.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public MatchedFieldArray.ProjectionMask withItems(Function<com.linkedin.metadata.search.MatchedField.ProjectionMask, com.linkedin.metadata.search.MatchedField.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?MatchedField.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
