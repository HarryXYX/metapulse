
package com.linkedin.form;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/form/FormInfo.pdl.")
public class FormPromptArray
    extends WrappingArrayTemplate<FormPrompt>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.form/**A prompt to present to the user to encourage filling out metadata*/record FormPrompt{/**The unique id for this prompt. This must be GLOBALLY unique.*/@Searchable={\"fieldName\":\"promptId\",\"fieldType\":\"KEYWORD\",\"queryByDefault\":false}id:string/**The title of this prompt*/title:string/**The description of this prompt*/description:optional string/**The type of prompt*/type:enum FormPromptType{/**This prompt is meant to apply a structured property to an entity*/STRUCTURED_PROPERTY/**This prompt is meant to apply a structured property to a schema fields entity*/FIELDS_STRUCTURED_PROPERTY}/**An optional set of information specific to structured properties prompts.\nThis should be filled out if the prompt is type STRUCTURED_PROPERTY or FIELDS_STRUCTURED_PROPERTY.*/structuredPropertyParams:optional record StructuredPropertyParams{/**The structured property that is required on this entity*/@Searchable={\"fieldName\":\"structuredPropertyPromptUrns\",\"fieldType\":\"URN\"}urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}/**Whether the prompt is required to be completed, in order for the form to be marked as complete.*/required:boolean=false}}]", SchemaFormatType.PDL));

    public FormPromptArray() {
        this(new DataList());
    }

    public FormPromptArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FormPromptArray(Collection<FormPrompt> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FormPromptArray(DataList data) {
        super(data, SCHEMA, FormPrompt.class);
    }

    public FormPromptArray(FormPrompt first, FormPrompt... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FormPromptArray.ProjectionMask createMask() {
        return new FormPromptArray.ProjectionMask();
    }

    @Override
    public FormPromptArray clone()
        throws CloneNotSupportedException
    {
        FormPromptArray __clone = ((FormPromptArray) super.clone());
        return __clone;
    }

    @Override
    public FormPromptArray copy()
        throws CloneNotSupportedException
    {
        FormPromptArray __copy = ((FormPromptArray) super.copy());
        return __copy;
    }

    @Override
    protected FormPrompt coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FormPrompt(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.form.FormPrompt.Fields items() {
            return new com.linkedin.form.FormPrompt.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.form.FormPrompt.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FormPromptArray.ProjectionMask withItems(Function<com.linkedin.form.FormPrompt.ProjectionMask, com.linkedin.form.FormPrompt.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FormPrompt.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
