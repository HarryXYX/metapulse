
package com.linkedin.template;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/template/DataHubPageTemplateAssetSummary.pdl.")
public class SummaryElementArray
    extends WrappingArrayTemplate<SummaryElement>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.template/**Info for a given asset summary element*/record SummaryElement{/**The type of element/property*/elementType:enum SummaryElementType{CREATED,TAGS,GLOSSARY_TERMS,OWNERS,DOMAIN,STRUCTURED_PROPERTY}/**The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY*/@Relationship={\"entityTypes\":[\"structuredProperty\"],\"name\":\"ContainsStructuredProperty\"}structuredPropertyUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}]", SchemaFormatType.PDL));

    public SummaryElementArray() {
        this(new DataList());
    }

    public SummaryElementArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SummaryElementArray(Collection<SummaryElement> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SummaryElementArray(DataList data) {
        super(data, SCHEMA, SummaryElement.class);
    }

    public SummaryElementArray(SummaryElement first, SummaryElement... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SummaryElementArray.ProjectionMask createMask() {
        return new SummaryElementArray.ProjectionMask();
    }

    @Override
    public SummaryElementArray clone()
        throws CloneNotSupportedException
    {
        SummaryElementArray __clone = ((SummaryElementArray) super.clone());
        return __clone;
    }

    @Override
    public SummaryElementArray copy()
        throws CloneNotSupportedException
    {
        SummaryElementArray __copy = ((SummaryElementArray) super.copy());
        return __copy;
    }

    @Override
    protected SummaryElement coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SummaryElement(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.template.SummaryElement.Fields items() {
            return new com.linkedin.template.SummaryElement.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.template.SummaryElement.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public SummaryElementArray.ProjectionMask withItems(Function<com.linkedin.template.SummaryElement.ProjectionMask, com.linkedin.template.SummaryElement.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?SummaryElement.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
