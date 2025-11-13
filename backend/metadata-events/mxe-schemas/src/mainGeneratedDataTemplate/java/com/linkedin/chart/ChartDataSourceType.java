
package com.linkedin.chart;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartDataSourceType.pdl.")
public class ChartDataSourceType
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]", SchemaFormatType.PDL));
    private com.linkedin.common.urn.DatasetUrn _datasetUrnMember = null;
    private ChartDataSourceType.ChangeListener __changeListener = new ChartDataSourceType.ChangeListener(this);
    private final static DataSchema MEMBER_DatasetUrn = SCHEMA.getTypeByMemberKey("string");
    public final static String MEMBERKEY_DatasetUrn = "string";
    private final static TyperefInfo TYPEREFINFO = new ChartDataSourceType.UnionTyperefInfo();

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public ChartDataSourceType() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ChartDataSourceType(Object data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UnionDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ChartDataSourceType create(com.linkedin.common.urn.DatasetUrn value) {
        ChartDataSourceType newUnion = new ChartDataSourceType();
        newUnion.setDatasetUrn(value);
        return newUnion;
    }

    public boolean isDatasetUrn() {
        return memberIs("string");
    }

    public com.linkedin.common.urn.DatasetUrn getDatasetUrn() {
        checkNotNull();
        if (_datasetUrnMember!= null) {
            return _datasetUrnMember;
        }
        Object __rawValue = super._map.get("string");
        _datasetUrnMember = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
        return _datasetUrnMember;
    }

    public void setDatasetUrn(com.linkedin.common.urn.DatasetUrn value) {
        checkNotNull();
        super._map.clear();
        _datasetUrnMember = value;
        CheckedUtil.putWithoutChecking(super._map, "string", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
    }

    public static ChartDataSourceType.ProjectionMask createMask() {
        return new ChartDataSourceType.ProjectionMask();
    }

    @Override
    public ChartDataSourceType clone()
        throws CloneNotSupportedException
    {
        ChartDataSourceType __clone = ((ChartDataSourceType) super.clone());
        __clone.__changeListener = new ChartDataSourceType.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ChartDataSourceType copy()
        throws CloneNotSupportedException
    {
        ChartDataSourceType __copy = ((ChartDataSourceType) super.copy());
        __copy._datasetUrnMember = null;
        __copy.__changeListener = new ChartDataSourceType.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ChartDataSourceType __objectRef;

        private ChangeListener(ChartDataSourceType reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "string":
                    __objectRef._datasetUrnMember = null;
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

        public PathSpec DatasetUrn() {
            return new PathSpec(getPathComponents(), "string");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public ChartDataSourceType.ProjectionMask withDatasetUrn() {
            getDataMap().put("string", MaskMap.POSITIVE_MASK);
            return this;
        }

    }


    /**
     * Input source type for a chart such as dataset or metric
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**Input source type for a chart such as dataset or metric*/typeref ChartDataSourceType=union[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

        public static TyperefDataSchema dataSchema() {
            return SCHEMA;
        }

    }

}
