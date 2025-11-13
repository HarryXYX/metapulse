
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataPlatformSnapshot.pdl.")
public class DataPlatformAspectArray
    extends WrappingArrayTemplate<DataPlatformAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":false,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}}]]", SchemaFormatType.PDL));

    public DataPlatformAspectArray() {
        this(new DataList());
    }

    public DataPlatformAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataPlatformAspectArray(Collection<DataPlatformAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataPlatformAspectArray(DataList data) {
        super(data, SCHEMA, DataPlatformAspect.class);
    }

    public DataPlatformAspectArray(DataPlatformAspect first, DataPlatformAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataPlatformAspectArray.ProjectionMask createMask() {
        return new DataPlatformAspectArray.ProjectionMask();
    }

    @Override
    public DataPlatformAspectArray clone()
        throws CloneNotSupportedException
    {
        DataPlatformAspectArray __clone = ((DataPlatformAspectArray) super.clone());
        return __clone;
    }

    @Override
    public DataPlatformAspectArray copy()
        throws CloneNotSupportedException
    {
        DataPlatformAspectArray __copy = ((DataPlatformAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected DataPlatformAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DataPlatformAspect(object));
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

        public com.linkedin.metadata.aspect.DataPlatformAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataPlatformAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.DataPlatformAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DataPlatformAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.DataPlatformAspect.ProjectionMask, com.linkedin.metadata.aspect.DataPlatformAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DataPlatformAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
