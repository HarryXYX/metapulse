
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
public class DataQualityContractArray
    extends WrappingArrayTemplate<DataQualityContract>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.datacontract/**A data quality contract pertaining to a physical data asset\nData Quality contracts are used to make assertions about data quality metrics for a physical data asset*/record DataQualityContract{/**The assertion representing the Data Quality contract.\nE.g. a table or column-level assertion.*/@Relationship={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesDataQualityAssertion\"}assertion:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public DataQualityContractArray() {
        this(new DataList());
    }

    public DataQualityContractArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataQualityContractArray(Collection<DataQualityContract> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataQualityContractArray(DataList data) {
        super(data, SCHEMA, DataQualityContract.class);
    }

    public DataQualityContractArray(DataQualityContract first, DataQualityContract... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataQualityContractArray.ProjectionMask createMask() {
        return new DataQualityContractArray.ProjectionMask();
    }

    @Override
    public DataQualityContractArray clone()
        throws CloneNotSupportedException
    {
        DataQualityContractArray __clone = ((DataQualityContractArray) super.clone());
        return __clone;
    }

    @Override
    public DataQualityContractArray copy()
        throws CloneNotSupportedException
    {
        DataQualityContractArray __copy = ((DataQualityContractArray) super.copy());
        return __copy;
    }

    @Override
    protected DataQualityContract coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataQualityContract(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.datacontract.DataQualityContract.Fields items() {
            return new com.linkedin.datacontract.DataQualityContract.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.datacontract.DataQualityContract.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataQualityContractArray.ProjectionMask withItems(Function<com.linkedin.datacontract.DataQualityContract.ProjectionMask, com.linkedin.datacontract.DataQualityContract.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataQualityContract.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
