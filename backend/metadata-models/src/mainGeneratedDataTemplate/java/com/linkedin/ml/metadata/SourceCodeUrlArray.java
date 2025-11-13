
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/SourceCode.pdl.")
public class SourceCodeUrlArray
    extends WrappingArrayTemplate<SourceCodeUrl>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}}]", SchemaFormatType.PDL));

    public SourceCodeUrlArray() {
        this(new DataList());
    }

    public SourceCodeUrlArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SourceCodeUrlArray(Collection<SourceCodeUrl> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SourceCodeUrlArray(DataList data) {
        super(data, SCHEMA, SourceCodeUrl.class);
    }

    public SourceCodeUrlArray(SourceCodeUrl first, SourceCodeUrl... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SourceCodeUrlArray.ProjectionMask createMask() {
        return new SourceCodeUrlArray.ProjectionMask();
    }

    @Override
    public SourceCodeUrlArray clone()
        throws CloneNotSupportedException
    {
        SourceCodeUrlArray __clone = ((SourceCodeUrlArray) super.clone());
        return __clone;
    }

    @Override
    public SourceCodeUrlArray copy()
        throws CloneNotSupportedException
    {
        SourceCodeUrlArray __copy = ((SourceCodeUrlArray) super.copy());
        return __copy;
    }

    @Override
    protected SourceCodeUrl coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SourceCodeUrl(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.ml.metadata.SourceCodeUrl.Fields items() {
            return new com.linkedin.ml.metadata.SourceCodeUrl.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.ml.metadata.SourceCodeUrl.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public SourceCodeUrlArray.ProjectionMask withItems(Function<com.linkedin.ml.metadata.SourceCodeUrl.ProjectionMask, com.linkedin.ml.metadata.SourceCodeUrl.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?SourceCodeUrl.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
