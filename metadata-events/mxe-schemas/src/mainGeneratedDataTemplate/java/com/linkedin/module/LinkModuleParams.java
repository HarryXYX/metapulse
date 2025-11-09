
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
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/module/DataHubPageModuleParams.pdl.")
public class LinkModuleParams
    extends RecordTemplate
{

    private final static LinkModuleParams.Fields _fields = new LinkModuleParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module,record LinkModuleParams{linkUrl:string,imageUrl:optional string,description:optional string}", SchemaFormatType.PDL));
    private String _linkUrlField = null;
    private String _imageUrlField = null;
    private String _descriptionField = null;
    private LinkModuleParams.ChangeListener __changeListener = new LinkModuleParams.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_LinkUrl = SCHEMA.getField("linkUrl");
    private final static RecordDataSchema.Field FIELD_ImageUrl = SCHEMA.getField("imageUrl");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public LinkModuleParams() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public LinkModuleParams(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static LinkModuleParams.Fields fields() {
        return _fields;
    }

    public static LinkModuleParams.ProjectionMask createMask() {
        return new LinkModuleParams.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for linkUrl
     * 
     * @see LinkModuleParams.Fields#linkUrl
     */
    public boolean hasLinkUrl() {
        if (_linkUrlField!= null) {
            return true;
        }
        return super._map.containsKey("linkUrl");
    }

    /**
     * Remover for linkUrl
     * 
     * @see LinkModuleParams.Fields#linkUrl
     */
    public void removeLinkUrl() {
        super._map.remove("linkUrl");
    }

    /**
     * Getter for linkUrl
     * 
     * @see LinkModuleParams.Fields#linkUrl
     */
    @Nullable
    public String getLinkUrl(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLinkUrl();
            case DEFAULT:
            case NULL:
                if (_linkUrlField!= null) {
                    return _linkUrlField;
                } else {
                    Object __rawValue = super._map.get("linkUrl");
                    _linkUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _linkUrlField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for linkUrl
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see LinkModuleParams.Fields#linkUrl
     */
    @Nonnull
    public String getLinkUrl() {
        if (_linkUrlField!= null) {
            return _linkUrlField;
        } else {
            Object __rawValue = super._map.get("linkUrl");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("linkUrl");
            }
            _linkUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _linkUrlField;
        }
    }

    /**
     * Setter for linkUrl
     * 
     * @see LinkModuleParams.Fields#linkUrl
     */
    public LinkModuleParams setLinkUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLinkUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field linkUrl of com.linkedin.module.LinkModuleParams");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "linkUrl", value);
                    _linkUrlField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLinkUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "linkUrl", value);
                    _linkUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "linkUrl", value);
                    _linkUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for linkUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LinkModuleParams.Fields#linkUrl
     */
    public LinkModuleParams setLinkUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field linkUrl of com.linkedin.module.LinkModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "linkUrl", value);
            _linkUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for imageUrl
     * 
     * @see LinkModuleParams.Fields#imageUrl
     */
    public boolean hasImageUrl() {
        if (_imageUrlField!= null) {
            return true;
        }
        return super._map.containsKey("imageUrl");
    }

    /**
     * Remover for imageUrl
     * 
     * @see LinkModuleParams.Fields#imageUrl
     */
    public void removeImageUrl() {
        super._map.remove("imageUrl");
    }

    /**
     * Getter for imageUrl
     * 
     * @see LinkModuleParams.Fields#imageUrl
     */
    @Nullable
    public String getImageUrl(GetMode mode) {
        return getImageUrl();
    }

    /**
     * Getter for imageUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LinkModuleParams.Fields#imageUrl
     */
    @Nullable
    public String getImageUrl() {
        if (_imageUrlField!= null) {
            return _imageUrlField;
        } else {
            Object __rawValue = super._map.get("imageUrl");
            _imageUrlField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _imageUrlField;
        }
    }

    /**
     * Setter for imageUrl
     * 
     * @see LinkModuleParams.Fields#imageUrl
     */
    public LinkModuleParams setImageUrl(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setImageUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeImageUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "imageUrl", value);
                    _imageUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "imageUrl", value);
                    _imageUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for imageUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LinkModuleParams.Fields#imageUrl
     */
    public LinkModuleParams setImageUrl(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field imageUrl of com.linkedin.module.LinkModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "imageUrl", value);
            _imageUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see LinkModuleParams.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see LinkModuleParams.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see LinkModuleParams.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see LinkModuleParams.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see LinkModuleParams.Fields#description
     */
    public LinkModuleParams setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see LinkModuleParams.Fields#description
     */
    public LinkModuleParams setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.module.LinkModuleParams to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public LinkModuleParams clone()
        throws CloneNotSupportedException
    {
        LinkModuleParams __clone = ((LinkModuleParams) super.clone());
        __clone.__changeListener = new LinkModuleParams.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public LinkModuleParams copy()
        throws CloneNotSupportedException
    {
        LinkModuleParams __copy = ((LinkModuleParams) super.copy());
        __copy._imageUrlField = null;
        __copy._linkUrlField = null;
        __copy._descriptionField = null;
        __copy.__changeListener = new LinkModuleParams.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final LinkModuleParams __objectRef;

        private ChangeListener(LinkModuleParams reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "imageUrl":
                    __objectRef._imageUrlField = null;
                    break;
                case "linkUrl":
                    __objectRef._linkUrlField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
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

        public PathSpec linkUrl() {
            return new PathSpec(getPathComponents(), "linkUrl");
        }

        public PathSpec imageUrl() {
            return new PathSpec(getPathComponents(), "imageUrl");
        }

        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        public LinkModuleParams.ProjectionMask withLinkUrl() {
            getDataMap().put("linkUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        public LinkModuleParams.ProjectionMask withImageUrl() {
            getDataMap().put("imageUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        public LinkModuleParams.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
