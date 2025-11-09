
package com.linkedin.metadata.aspect;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/snapshot/DataHubRetentionSnapshot.pdl.")
public class DataHubRetentionAspectArray
    extends WrappingArrayTemplate<DataHubRetentionAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a DataHub Retention*/@Aspect.name=\"dataHubRetentionKey\"record DataHubRetentionKey{/**Entity name to apply retention to. * (or empty) for applying defaults.*/entityName:string/**Aspect name to apply retention to. * (or empty) for applying defaults.*/aspectName:string}}{namespace com.linkedin.retention@Aspect.name=\"dataHubRetentionConfig\"record DataHubRetentionConfig{retention:/**Base class that encapsulates different retention policies.\nOnly one of the fields should be set*/record Retention{version:optional/**Keep max N latest records*/record VersionBasedRetention{maxVersions:int}time:optional/**Keep records that are less than X seconds old*/record TimeBasedRetention{maxAgeInSeconds:int}}}}]]", SchemaFormatType.PDL));

    public DataHubRetentionAspectArray() {
        this(new DataList());
    }

    public DataHubRetentionAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataHubRetentionAspectArray(Collection<DataHubRetentionAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataHubRetentionAspectArray(DataList data) {
        super(data, SCHEMA, DataHubRetentionAspect.class);
    }

    public DataHubRetentionAspectArray(DataHubRetentionAspect first, DataHubRetentionAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataHubRetentionAspectArray.ProjectionMask createMask() {
        return new DataHubRetentionAspectArray.ProjectionMask();
    }

    @Override
    public DataHubRetentionAspectArray clone()
        throws CloneNotSupportedException
    {
        DataHubRetentionAspectArray __clone = ((DataHubRetentionAspectArray) super.clone());
        return __clone;
    }

    @Override
    public DataHubRetentionAspectArray copy()
        throws CloneNotSupportedException
    {
        DataHubRetentionAspectArray __copy = ((DataHubRetentionAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected DataHubRetentionAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataHubRetentionAspect(object));
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

        public com.linkedin.metadata.aspect.DataHubRetentionAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataHubRetentionAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.DataHubRetentionAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataHubRetentionAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.DataHubRetentionAspect.ProjectionMask, com.linkedin.metadata.aspect.DataHubRetentionAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataHubRetentionAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
