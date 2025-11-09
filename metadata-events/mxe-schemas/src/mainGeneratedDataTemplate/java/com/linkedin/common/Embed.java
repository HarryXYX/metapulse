
package com.linkedin.common;

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
import com.linkedin.data.template.SetMode;


/**
 * Information regarding rendering an embed for an asset.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Embed.pdl.")
public class Embed
    extends RecordTemplate
{

    private final static Embed.Fields _fields = new Embed.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Information regarding rendering an embed for an asset.*/@Aspect.name=\"embed\"record Embed{/**An embed URL to be rendered inside of an iframe.*/renderUrl:optional string}", SchemaFormatType.PDL));
    private String _renderUrlField = null;
    private Embed.ChangeListener __changeListener = new Embed.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RenderUrl = SCHEMA.getField("renderUrl");

    public Embed() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Embed(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Embed.Fields fields() {
        return _fields;
    }

    public static Embed.ProjectionMask createMask() {
        return new Embed.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for renderUrl
     * 
     * @see Embed.Fields#renderUrl
     */
    public boolean hasRenderUrl() {
        if (_renderUrlField!= null) {
            return true;
        }
        return super._map.containsKey("renderUrl");
    }

    /**
     * Remover for renderUrl
     * 
     * @see Embed.Fields#renderUrl
     */
    public void removeRenderUrl() {
        super._map.remove("renderUrl");
    }

    /**
     * Getter for renderUrl
     * 
     * @see Embed.Fields#renderUrl
     */
    @Nullable
    public String getRenderUrl(GetMode mode) {
        return getRenderUrl();
    }

    /**
     * Getter for renderUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Embed.Fields#renderUrl
     */
    @Nullable
    public String getRenderUrl() {
        if (_renderUrlField!= null) {
            return _renderUrlField;
        } else {
            Object __rawValue = super._map.get("renderUrl");
            _renderUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _renderUrlField;
        }
    }

    /**
     * Setter for renderUrl
     * 
     * @see Embed.Fields#renderUrl
     */
    public Embed setRenderUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRenderUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRenderUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "renderUrl", value);
                    _renderUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "renderUrl", value);
                    _renderUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for renderUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Embed.Fields#renderUrl
     */
    public Embed setRenderUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field renderUrl of com.linkedin.common.Embed to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "renderUrl", value);
            _renderUrlField = value;
        }
        return this;
    }

    @Override
    public Embed clone()
        throws CloneNotSupportedException
    {
        Embed __clone = ((Embed) super.clone());
        __clone.__changeListener = new Embed.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Embed copy()
        throws CloneNotSupportedException
    {
        Embed __copy = ((Embed) super.copy());
        __copy._renderUrlField = null;
        __copy.__changeListener = new Embed.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Embed __objectRef;

        private ChangeListener(Embed reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "renderUrl":
                    __objectRef._renderUrlField = null;
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

        /**
         * An embed URL to be rendered inside of an iframe.
         * 
         */
        public PathSpec renderUrl() {
            return new PathSpec(getPathComponents(), "renderUrl");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * An embed URL to be rendered inside of an iframe.
         * 
         */
        public Embed.ProjectionMask withRenderUrl() {
            getDataMap().put("renderUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
