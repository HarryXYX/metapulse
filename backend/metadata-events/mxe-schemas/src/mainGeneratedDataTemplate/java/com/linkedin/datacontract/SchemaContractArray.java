
package com.linkedin.datacontract;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datacontract/DataContractProperties.pdl.")
public class SchemaContractArray
    extends WrappingArrayTemplate<SchemaContract>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.datacontract/**Expectations for a logical schema*/record SchemaContract{/**The assertion representing the schema contract.*/@Relationship={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesSchemaAssertion\"}assertion:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public SchemaContractArray() {
        this(new DataList());
    }

    public SchemaContractArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SchemaContractArray(Collection<SchemaContract> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SchemaContractArray(DataList data) {
        super(data, SCHEMA, SchemaContract.class);
    }

    public SchemaContractArray(SchemaContract first, SchemaContract... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SchemaContractArray.ProjectionMask createMask() {
        return new SchemaContractArray.ProjectionMask();
    }

    @Override
    public SchemaContractArray clone()
        throws CloneNotSupportedException
    {
        SchemaContractArray __clone = ((SchemaContractArray) super.clone());
        return __clone;
    }

    @Override
    public SchemaContractArray copy()
        throws CloneNotSupportedException
    {
        SchemaContractArray __copy = ((SchemaContractArray) super.copy());
        return __copy;
    }

    @Override
    protected SchemaContract coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SchemaContract(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.datacontract.SchemaContract.Fields items() {
            return new com.linkedin.datacontract.SchemaContract.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.datacontract.SchemaContract.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public SchemaContractArray.ProjectionMask withItems(Function<com.linkedin.datacontract.SchemaContract.ProjectionMask, com.linkedin.datacontract.SchemaContract.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?SchemaContract.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
