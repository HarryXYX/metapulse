
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldMapping.pdl.")
public class DatasetFieldUpstreamArray
    extends WrappingArrayTemplate<DatasetFieldUpstream>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@deprecated=\"use SchemaFieldPath and represent as generic Urn instead\"@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset field information identifier\",\"entityType\":\"datasetField\",\"fields\":[{\"doc\":\"Dataset that this dataset field belongs to.\",\"name\":\"dataset\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"doc\":\"Dataset field path\",\"maxLength\":500,\"name\":\"fieldPath\",\"type\":\"string\"}],\"maxLength\":807,\"name\":\"DatasetField\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetFieldUrn=string}]]", SchemaFormatType.PDL));

    public DatasetFieldUpstreamArray() {
        this(new DataList());
    }

    public DatasetFieldUpstreamArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetFieldUpstreamArray(Collection<DatasetFieldUpstream> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetFieldUpstreamArray(DataList data) {
        super(data, SCHEMA, DatasetFieldUpstream.class);
    }

    public DatasetFieldUpstreamArray(DatasetFieldUpstream first, DatasetFieldUpstream... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DatasetFieldUpstreamArray.ProjectionMask createMask() {
        return new DatasetFieldUpstreamArray.ProjectionMask();
    }

    @Override
    public DatasetFieldUpstreamArray clone()
        throws CloneNotSupportedException
    {
        DatasetFieldUpstreamArray __clone = ((DatasetFieldUpstreamArray) super.clone());
        return __clone;
    }

    @Override
    public DatasetFieldUpstreamArray copy()
        throws CloneNotSupportedException
    {
        DatasetFieldUpstreamArray __copy = ((DatasetFieldUpstreamArray) super.copy());
        return __copy;
    }

    @Override
    protected DatasetFieldUpstream coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DatasetFieldUpstream(object));
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

        public com.linkedin.dataset.DatasetFieldUpstream.Fields items() {
            return new com.linkedin.dataset.DatasetFieldUpstream.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.DatasetFieldUpstream.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DatasetFieldUpstreamArray.ProjectionMask withItems(Function<com.linkedin.dataset.DatasetFieldUpstream.ProjectionMask, com.linkedin.dataset.DatasetFieldUpstream.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DatasetFieldUpstream.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
