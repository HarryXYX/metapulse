
package com.linkedin.chart;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartInfo.pdl.")
public class ChartDataSourceTypeArray
    extends WrappingArrayTemplate<ChartDataSourceType>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]]", SchemaFormatType.PDL));

    public ChartDataSourceTypeArray() {
        this(new DataList());
    }

    public ChartDataSourceTypeArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ChartDataSourceTypeArray(Collection<ChartDataSourceType> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ChartDataSourceTypeArray(DataList data) {
        super(data, SCHEMA, ChartDataSourceType.class);
    }

    public ChartDataSourceTypeArray(ChartDataSourceType first, ChartDataSourceType... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ChartDataSourceTypeArray.ProjectionMask createMask() {
        return new ChartDataSourceTypeArray.ProjectionMask();
    }

    @Override
    public ChartDataSourceTypeArray clone()
        throws CloneNotSupportedException
    {
        ChartDataSourceTypeArray __clone = ((ChartDataSourceTypeArray) super.clone());
        return __clone;
    }

    @Override
    public ChartDataSourceTypeArray copy()
        throws CloneNotSupportedException
    {
        ChartDataSourceTypeArray __copy = ((ChartDataSourceTypeArray) super.copy());
        return __copy;
    }

    @Override
    protected ChartDataSourceType coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new ChartDataSourceType(object));
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

        public com.linkedin.chart.ChartDataSourceType.Fields items() {
            return new com.linkedin.chart.ChartDataSourceType.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.chart.ChartDataSourceType.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public ChartDataSourceTypeArray.ProjectionMask withItems(Function<com.linkedin.chart.ChartDataSourceType.ProjectionMask, com.linkedin.chart.ChartDataSourceType.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?ChartDataSourceType.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
