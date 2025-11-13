
package com.linkedin.metadata.aspect;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/DataPlatformAspect.pdl.")
public class DataPlatformAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":false,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.DataPlatformKey _dataPlatformKeyMember = null;
    private com.linkedin.dataplatform.DataPlatformInfo _dataPlatformInfoMember = null;
    private DataPlatformAspect.ChangeListener __changeListener = new DataPlatformAspect.ChangeListener(this);
    private final static DataSchema MEMBER_DataPlatformKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataPlatformKey");
    public final static String MEMBERKEY_DataPlatformKey = "com.linkedin.metadata.key.DataPlatformKey";
    private final static DataSchema MEMBER_DataPlatformInfo = SCHEMA.getTypeByMemberKey("com.linkedin.dataplatform.DataPlatformInfo");
    public final static String MEMBERKEY_DataPlatformInfo = "com.linkedin.dataplatform.DataPlatformInfo";
    private final static TyperefInfo TYPEREFINFO = new DataPlatformAspect.UnionTyperefInfo();

    public DataPlatformAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataPlatformAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataPlatformAspect create(com.linkedin.metadata.key.DataPlatformKey value) {
        DataPlatformAspect newUnion = new DataPlatformAspect();
        newUnion.setDataPlatformKey(value);
        return newUnion;
    }

    public boolean isDataPlatformKey() {
        return memberIs("com.linkedin.metadata.key.DataPlatformKey");
    }

    public com.linkedin.metadata.key.DataPlatformKey getDataPlatformKey() {
        checkNotNull();
        if (_dataPlatformKeyMember!= null) {
            return _dataPlatformKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DataPlatformKey");
        _dataPlatformKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DataPlatformKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataPlatformKeyMember;
    }

    public void setDataPlatformKey(com.linkedin.metadata.key.DataPlatformKey value) {
        checkNotNull();
        super._map.clear();
        _dataPlatformKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DataPlatformKey", value.data());
    }

    public static DataPlatformAspect create(com.linkedin.dataplatform.DataPlatformInfo value) {
        DataPlatformAspect newUnion = new DataPlatformAspect();
        newUnion.setDataPlatformInfo(value);
        return newUnion;
    }

    public boolean isDataPlatformInfo() {
        return memberIs("com.linkedin.dataplatform.DataPlatformInfo");
    }

    public com.linkedin.dataplatform.DataPlatformInfo getDataPlatformInfo() {
        checkNotNull();
        if (_dataPlatformInfoMember!= null) {
            return _dataPlatformInfoMember;
        }
        Object __rawValue = super._map.get("com.linkedin.dataplatform.DataPlatformInfo");
        _dataPlatformInfoMember = ((__rawValue == null)?null:new com.linkedin.dataplatform.DataPlatformInfo(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataPlatformInfoMember;
    }

    public void setDataPlatformInfo(com.linkedin.dataplatform.DataPlatformInfo value) {
        checkNotNull();
        super._map.clear();
        _dataPlatformInfoMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.dataplatform.DataPlatformInfo", value.data());
    }

    public static DataPlatformAspect.ProjectionMask createMask() {
        return new DataPlatformAspect.ProjectionMask();
    }

    @Override
    public DataPlatformAspect clone()
        throws CloneNotSupportedException
    {
        DataPlatformAspect __clone = ((DataPlatformAspect) super.clone());
        __clone.__changeListener = new DataPlatformAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataPlatformAspect copy()
        throws CloneNotSupportedException
    {
        DataPlatformAspect __copy = ((DataPlatformAspect) super.copy());
        __copy._dataPlatformInfoMember = null;
        __copy._dataPlatformKeyMember = null;
        __copy.__changeListener = new DataPlatformAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataPlatformAspect __objectRef;

        private ChangeListener(DataPlatformAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.dataplatform.DataPlatformInfo":
                    __objectRef._dataPlatformInfoMember = null;
                    break;
                case "com.linkedin.metadata.key.DataPlatformKey":
                    __objectRef._dataPlatformKeyMember = null;
                    break;
            }
        }

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

        public com.linkedin.metadata.key.DataPlatformKey.Fields DataPlatformKey() {
            return new com.linkedin.metadata.key.DataPlatformKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataPlatformKey");
        }

        public com.linkedin.dataplatform.DataPlatformInfo.Fields DataPlatformInfo() {
            return new com.linkedin.dataplatform.DataPlatformInfo.Fields(getPathComponents(), "com.linkedin.dataplatform.DataPlatformInfo");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.DataPlatformKey.ProjectionMask _DataPlatformKeyMask;
        private com.linkedin.dataplatform.DataPlatformInfo.ProjectionMask _DataPlatformInfoMask;

        ProjectionMask() {
            super(3);
        }

        public DataPlatformAspect.ProjectionMask withDataPlatformKey(Function<com.linkedin.metadata.key.DataPlatformKey.ProjectionMask, com.linkedin.metadata.key.DataPlatformKey.ProjectionMask> nestedMask) {
            _DataPlatformKeyMask = nestedMask.apply(((_DataPlatformKeyMask == null)?com.linkedin.metadata.key.DataPlatformKey.createMask():_DataPlatformKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataPlatformKey", _DataPlatformKeyMask.getDataMap());
            return this;
        }

        public DataPlatformAspect.ProjectionMask withDataPlatformInfo(Function<com.linkedin.dataplatform.DataPlatformInfo.ProjectionMask, com.linkedin.dataplatform.DataPlatformInfo.ProjectionMask> nestedMask) {
            _DataPlatformInfoMask = nestedMask.apply(((_DataPlatformInfoMask == null)?com.linkedin.dataplatform.DataPlatformInfo.createMask():_DataPlatformInfoMask));
            getDataMap().put("com.linkedin.dataplatform.DataPlatformInfo", _DataPlatformInfoMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a Data Platform
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Data Platform*/typeref DataPlatformAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":false,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldType\":\"WORD_GRAM\"}displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
