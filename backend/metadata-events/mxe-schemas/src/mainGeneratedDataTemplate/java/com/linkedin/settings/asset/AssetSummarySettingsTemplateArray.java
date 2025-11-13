
package com.linkedin.settings.asset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/asset/AssetSummarySettings.pdl.")
public class AssetSummarySettingsTemplateArray
    extends WrappingArrayTemplate<AssetSummarySettingsTemplate>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.settings.asset/**Object containing the template and any additional info for asset summary settings*/record AssetSummarySettingsTemplate{/**The urn of the template*/template:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public AssetSummarySettingsTemplateArray() {
        this(new DataList());
    }

    public AssetSummarySettingsTemplateArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AssetSummarySettingsTemplateArray(Collection<AssetSummarySettingsTemplate> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AssetSummarySettingsTemplateArray(DataList data) {
        super(data, SCHEMA, AssetSummarySettingsTemplate.class);
    }

    public AssetSummarySettingsTemplateArray(AssetSummarySettingsTemplate first, AssetSummarySettingsTemplate... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static AssetSummarySettingsTemplateArray.ProjectionMask createMask() {
        return new AssetSummarySettingsTemplateArray.ProjectionMask();
    }

    @Override
    public AssetSummarySettingsTemplateArray clone()
        throws CloneNotSupportedException
    {
        AssetSummarySettingsTemplateArray __clone = ((AssetSummarySettingsTemplateArray) super.clone());
        return __clone;
    }

    @Override
    public AssetSummarySettingsTemplateArray copy()
        throws CloneNotSupportedException
    {
        AssetSummarySettingsTemplateArray __copy = ((AssetSummarySettingsTemplateArray) super.copy());
        return __copy;
    }

    @Override
    protected AssetSummarySettingsTemplate coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new AssetSummarySettingsTemplate(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.settings.asset.AssetSummarySettingsTemplate.Fields items() {
            return new com.linkedin.settings.asset.AssetSummarySettingsTemplate.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.settings.asset.AssetSummarySettingsTemplate.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public AssetSummarySettingsTemplateArray.ProjectionMask withItems(Function<com.linkedin.settings.asset.AssetSummarySettingsTemplate.ProjectionMask, com.linkedin.settings.asset.AssetSummarySettingsTemplate.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?AssetSummarySettingsTemplate.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
