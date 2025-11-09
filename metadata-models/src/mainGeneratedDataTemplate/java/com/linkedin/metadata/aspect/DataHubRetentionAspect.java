
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/DataHubRetentionAspect.pdl.")
public class DataHubRetentionAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a DataHub Retention*/@Aspect.name=\"dataHubRetentionKey\"record DataHubRetentionKey{/**Entity name to apply retention to. * (or empty) for applying defaults.*/entityName:string/**Aspect name to apply retention to. * (or empty) for applying defaults.*/aspectName:string}}{namespace com.linkedin.retention@Aspect.name=\"dataHubRetentionConfig\"record DataHubRetentionConfig{retention:/**Base class that encapsulates different retention policies.\nOnly one of the fields should be set*/record Retention{version:optional/**Keep max N latest records*/record VersionBasedRetention{maxVersions:int}time:optional/**Keep records that are less than X seconds old*/record TimeBasedRetention{maxAgeInSeconds:int}}}}]", SchemaFormatType.PDL));
    private com.linkedin.metadata.key.DataHubRetentionKey _dataHubRetentionKeyMember = null;
    private com.linkedin.retention.DataHubRetentionConfig _dataHubRetentionConfigMember = null;
    private DataHubRetentionAspect.ChangeListener __changeListener = new DataHubRetentionAspect.ChangeListener(this);
    private final static DataSchema MEMBER_DataHubRetentionKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataHubRetentionKey");
    public final static String MEMBERKEY_DataHubRetentionKey = "com.linkedin.metadata.key.DataHubRetentionKey";
    private final static DataSchema MEMBER_DataHubRetentionConfig = SCHEMA.getTypeByMemberKey("com.linkedin.retention.DataHubRetentionConfig");
    public final static String MEMBERKEY_DataHubRetentionConfig = "com.linkedin.retention.DataHubRetentionConfig";
    private final static TyperefInfo TYPEREFINFO = new DataHubRetentionAspect.UnionTyperefInfo();

    public DataHubRetentionAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DataHubRetentionAspect(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DataHubRetentionAspect create(com.linkedin.metadata.key.DataHubRetentionKey value) {
        DataHubRetentionAspect newUnion = new DataHubRetentionAspect();
        newUnion.setDataHubRetentionKey(value);
        return newUnion;
    }

    public boolean isDataHubRetentionKey() {
        return memberIs("com.linkedin.metadata.key.DataHubRetentionKey");
    }

    public com.linkedin.metadata.key.DataHubRetentionKey getDataHubRetentionKey() {
        checkNotNull();
        if (_dataHubRetentionKeyMember!= null) {
            return _dataHubRetentionKeyMember;
        }
        Object __rawValue = super._map.get("com.linkedin.metadata.key.DataHubRetentionKey");
        _dataHubRetentionKeyMember = ((__rawValue == null)?null:new com.linkedin.metadata.key.DataHubRetentionKey(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataHubRetentionKeyMember;
    }

    public void setDataHubRetentionKey(com.linkedin.metadata.key.DataHubRetentionKey value) {
        checkNotNull();
        super._map.clear();
        _dataHubRetentionKeyMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.metadata.key.DataHubRetentionKey", value.data());
    }

    public static DataHubRetentionAspect create(com.linkedin.retention.DataHubRetentionConfig value) {
        DataHubRetentionAspect newUnion = new DataHubRetentionAspect();
        newUnion.setDataHubRetentionConfig(value);
        return newUnion;
    }

    public boolean isDataHubRetentionConfig() {
        return memberIs("com.linkedin.retention.DataHubRetentionConfig");
    }

    public com.linkedin.retention.DataHubRetentionConfig getDataHubRetentionConfig() {
        checkNotNull();
        if (_dataHubRetentionConfigMember!= null) {
            return _dataHubRetentionConfigMember;
        }
        Object __rawValue = super._map.get("com.linkedin.retention.DataHubRetentionConfig");
        _dataHubRetentionConfigMember = ((__rawValue == null)?null:new com.linkedin.retention.DataHubRetentionConfig(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
        return _dataHubRetentionConfigMember;
    }

    public void setDataHubRetentionConfig(com.linkedin.retention.DataHubRetentionConfig value) {
        checkNotNull();
        super._map.clear();
        _dataHubRetentionConfigMember = value;
        CheckedUtil.putWithoutChecking(super._map, "com.linkedin.retention.DataHubRetentionConfig", value.data());
    }

    public static DataHubRetentionAspect.ProjectionMask createMask() {
        return new DataHubRetentionAspect.ProjectionMask();
    }

    @Override
    public DataHubRetentionAspect clone()
        throws CloneNotSupportedException
    {
        DataHubRetentionAspect __clone = ((DataHubRetentionAspect) super.clone());
        __clone.__changeListener = new DataHubRetentionAspect.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DataHubRetentionAspect copy()
        throws CloneNotSupportedException
    {
        DataHubRetentionAspect __copy = ((DataHubRetentionAspect) super.copy());
        __copy._dataHubRetentionConfigMember = null;
        __copy._dataHubRetentionKeyMember = null;
        __copy.__changeListener = new DataHubRetentionAspect.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DataHubRetentionAspect __objectRef;

        private ChangeListener(DataHubRetentionAspect reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "com.linkedin.retention.DataHubRetentionConfig":
                    __objectRef._dataHubRetentionConfigMember = null;
                    break;
                case "com.linkedin.metadata.key.DataHubRetentionKey":
                    __objectRef._dataHubRetentionKeyMember = null;
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

        public com.linkedin.metadata.key.DataHubRetentionKey.Fields DataHubRetentionKey() {
            return new com.linkedin.metadata.key.DataHubRetentionKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataHubRetentionKey");
        }

        public com.linkedin.retention.DataHubRetentionConfig.Fields DataHubRetentionConfig() {
            return new com.linkedin.retention.DataHubRetentionConfig.Fields(getPathComponents(), "com.linkedin.retention.DataHubRetentionConfig");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.key.DataHubRetentionKey.ProjectionMask _DataHubRetentionKeyMask;
        private com.linkedin.retention.DataHubRetentionConfig.ProjectionMask _DataHubRetentionConfigMask;

        ProjectionMask() {
            super(3);
        }

        public DataHubRetentionAspect.ProjectionMask withDataHubRetentionKey(Function<com.linkedin.metadata.key.DataHubRetentionKey.ProjectionMask, com.linkedin.metadata.key.DataHubRetentionKey.ProjectionMask> nestedMask) {
            _DataHubRetentionKeyMask = nestedMask.apply(((_DataHubRetentionKeyMask == null)?com.linkedin.metadata.key.DataHubRetentionKey.createMask():_DataHubRetentionKeyMask));
            getDataMap().put("com.linkedin.metadata.key.DataHubRetentionKey", _DataHubRetentionKeyMask.getDataMap());
            return this;
        }

        public DataHubRetentionAspect.ProjectionMask withDataHubRetentionConfig(Function<com.linkedin.retention.DataHubRetentionConfig.ProjectionMask, com.linkedin.retention.DataHubRetentionConfig.ProjectionMask> nestedMask) {
            _DataHubRetentionConfigMask = nestedMask.apply(((_DataHubRetentionConfigMask == null)?com.linkedin.retention.DataHubRetentionConfig.createMask():_DataHubRetentionConfigMask));
            getDataMap().put("com.linkedin.retention.DataHubRetentionConfig", _DataHubRetentionConfigMask.getDataMap());
            return this;
        }

    }


    /**
     * A union of all supported metadata aspects for a DataHub access policy.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a DataHub access policy.*/typeref DataHubRetentionAspect=union[{namespace com.linkedin.metadata.key/**Key for a DataHub Retention*/@Aspect.name=\"dataHubRetentionKey\"record DataHubRetentionKey{/**Entity name to apply retention to. * (or empty) for applying defaults.*/entityName:string/**Aspect name to apply retention to. * (or empty) for applying defaults.*/aspectName:string}}{namespace com.linkedin.retention@Aspect.name=\"dataHubRetentionConfig\"record DataHubRetentionConfig{retention:/**Base class that encapsulates different retention policies.\nOnly one of the fields should be set*/record Retention{version:optional/**Keep max N latest records*/record VersionBasedRetention{maxVersions:int}time:optional/**Keep records that are less than X seconds old*/record TimeBasedRetention{maxAgeInSeconds:int}}}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
