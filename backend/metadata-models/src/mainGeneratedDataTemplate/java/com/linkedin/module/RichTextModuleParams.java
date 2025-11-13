
package com.linkedin.module;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/module/DataHubPageModuleParams.pdl.")
public class RichTextModuleParams
    extends RecordTemplate
{

    private final static RichTextModuleParams.Fields _fields = new RichTextModuleParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module,record RichTextModuleParams{content:string}", SchemaFormatType.PDL));
    private String _contentField = null;
    private RichTextModuleParams.ChangeListener __changeListener = new RichTextModuleParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Content = SCHEMA.getField("content");

    public RichTextModuleParams() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public RichTextModuleParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RichTextModuleParams.Fields fields() {
        return _fields;
    }

    public static RichTextModuleParams.ProjectionMask createMask() {
        return new RichTextModuleParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for content
     * 
     * @see RichTextModuleParams.Fields#content
     */
    public boolean hasContent() {
        if (_contentField!= null) {
            return true;
        }
        return super._map.containsKey("content");
    }

    /**
     * Remover for content
     * 
     * @see RichTextModuleParams.Fields#content
     */
    public void removeContent() {
        super._map.remove("content");
    }

    /**
     * Getter for content
     * 
     * @see RichTextModuleParams.Fields#content
     */
    @Nullable
    public String getContent(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getContent();
            case DEFAULT:
            case NULL:
                if (_contentField!= null) {
                    return _contentField;
                } else {
                    Object __rawValue = super._map.get("content");
                    _contentField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _contentField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for content
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RichTextModuleParams.Fields#content
     */
    @Nonnull
    public String getContent() {
        if (_contentField!= null) {
            return _contentField;
        } else {
            Object __rawValue = super._map.get("content");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("content");
            }
            _contentField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contentField;
        }
    }

    /**
     * Setter for content
     * 
     * @see RichTextModuleParams.Fields#content
     */
    public RichTextModuleParams setContent(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContent(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field content of com.linkedin.module.RichTextModuleParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "content", value);
                    _contentField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContent();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "content", value);
                    _contentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "content", value);
                    _contentField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for content
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RichTextModuleParams.Fields#content
     */
    public RichTextModuleParams setContent(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field content of com.linkedin.module.RichTextModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "content", value);
            _contentField = value;
        }
        return this;
    }

    @Override
    public RichTextModuleParams clone()
        throws CloneNotSupportedException
    {
        RichTextModuleParams __clone = ((RichTextModuleParams) super.clone());
        __clone.__changeListener = new RichTextModuleParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RichTextModuleParams copy()
        throws CloneNotSupportedException
    {
        RichTextModuleParams __copy = ((RichTextModuleParams) super.copy());
        __copy._contentField = null;
        __copy.__changeListener = new RichTextModuleParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RichTextModuleParams __objectRef;

        private ChangeListener(RichTextModuleParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "content":
                    __objectRef._contentField = null;
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

        public PathSpec content() {
            return new PathSpec(getPathComponents(), "content");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public RichTextModuleParams.ProjectionMask withContent() {
            getDataMap().put("content", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
