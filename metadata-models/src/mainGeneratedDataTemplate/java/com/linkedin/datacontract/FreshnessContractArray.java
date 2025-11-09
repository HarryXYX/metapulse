
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datacontract/DataContractProperties.pdl.")
public class FreshnessContractArray
    extends WrappingArrayTemplate<FreshnessContract>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.datacontract/**A contract pertaining to the operational SLAs of a physical data asset*/record FreshnessContract{/**The assertion representing the SLA contract.*/assertion:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public FreshnessContractArray() {
        this(new DataList());
    }

    public FreshnessContractArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FreshnessContractArray(Collection<FreshnessContract> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FreshnessContractArray(DataList data) {
        super(data, SCHEMA, FreshnessContract.class);
    }

    public FreshnessContractArray(FreshnessContract first, FreshnessContract... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FreshnessContractArray.ProjectionMask createMask() {
        return new FreshnessContractArray.ProjectionMask();
    }

    @Override
    public FreshnessContractArray clone()
        throws CloneNotSupportedException
    {
        FreshnessContractArray __clone = ((FreshnessContractArray) super.clone());
        return __clone;
    }

    @Override
    public FreshnessContractArray copy()
        throws CloneNotSupportedException
    {
        FreshnessContractArray __copy = ((FreshnessContractArray) super.copy());
        return __copy;
    }

    @Override
    protected FreshnessContract coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FreshnessContract(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.datacontract.FreshnessContract.Fields items() {
            return new com.linkedin.datacontract.FreshnessContract.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.datacontract.FreshnessContract.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FreshnessContractArray.ProjectionMask withItems(Function<com.linkedin.datacontract.FreshnessContract.ProjectionMask, com.linkedin.datacontract.FreshnessContract.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FreshnessContract.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
