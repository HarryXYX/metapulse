
package com.linkedin.ml.metadata;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/EvaluationData.pdl.")
public class BaseDataArray
    extends WrappingArrayTemplate<BaseData>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}}]", SchemaFormatType.PDL));

    public BaseDataArray() {
        this(new DataList());
    }

    public BaseDataArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public BaseDataArray(Collection<BaseData> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public BaseDataArray(DataList data) {
        super(data, SCHEMA, BaseData.class);
    }

    public BaseDataArray(BaseData first, BaseData... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static BaseDataArray.ProjectionMask createMask() {
        return new BaseDataArray.ProjectionMask();
    }

    @Override
    public BaseDataArray clone()
        throws CloneNotSupportedException
    {
        BaseDataArray __clone = ((BaseDataArray) super.clone());
        return __clone;
    }

    @Override
    public BaseDataArray copy()
        throws CloneNotSupportedException
    {
        BaseDataArray __copy = ((BaseDataArray) super.copy());
        return __copy;
    }

    @Override
    protected BaseData coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new BaseData(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.ml.metadata.BaseData.Fields items() {
            return new com.linkedin.ml.metadata.BaseData.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.ml.metadata.BaseData.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public BaseDataArray.ProjectionMask withItems(Function<com.linkedin.ml.metadata.BaseData.ProjectionMask, com.linkedin.ml.metadata.BaseData.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?BaseData.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
