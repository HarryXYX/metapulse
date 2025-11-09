
package com.linkedin.post;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.Media;
import com.linkedin.common.url.UrlCoercer;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Content stored inside a Post.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/post/PostContent.pdl.")
public class PostContent
    extends RecordTemplate
{

    private final static PostContent.Fields _fields = new PostContent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.post/**Content stored inside a Post.*/record PostContent{/**Title of the post.*/@Searchable.fieldType=\"TEXT_PARTIAL\"title:string/**Type of content held in the post.*/type:/**Enum defining the type of content held in a Post.*/enum PostContentType{/**Text content*/TEXT/**Link content*/LINK}/**Optional description of the post.*/description:optional string/**Optional link that the post is associated with.*/link:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}/**Optional media that the post is storing*/media:optional{namespace com.linkedin.common/**Carries information about which roles a user is assigned to.*/record Media{/**Type of content the Media is storing, e.g. image, video, etc.*/type:/**Enum defining the type of content a Media object holds.*/enum MediaType{/**The Media holds an image.*/IMAGE}/**Where the media content is stored.*/location:Url}}}", SchemaFormatType.PDL));
    private String _titleField = null;
    private PostContentType _typeField = null;
    private String _descriptionField = null;
    private com.linkedin.common.url.Url _linkField = null;
    private Media _mediaField = null;
    private PostContent.ChangeListener __changeListener = new PostContent.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Link = SCHEMA.getField("link");
    private final static RecordDataSchema.Field FIELD_Media = SCHEMA.getField("media");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public PostContent() {
        super(new DataMap(7, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public PostContent(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PostContent.Fields fields() {
        return _fields;
    }

    public static PostContent.ProjectionMask createMask() {
        return new PostContent.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for title
     * 
     * @see PostContent.Fields#title
     */
    public boolean hasTitle() {
        if (_titleField!= null) {
            return true;
        }
        return super._map.containsKey("title");
    }

    /**
     * Remover for title
     * 
     * @see PostContent.Fields#title
     */
    public void removeTitle() {
        super._map.remove("title");
    }

    /**
     * Getter for title
     * 
     * @see PostContent.Fields#title
     */
    @Nullable
    public String getTitle(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTitle();
            case DEFAULT:
            case NULL:
                if (_titleField!= null) {
                    return _titleField;
                } else {
                    Object __rawValue = super._map.get("title");
                    _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _titleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PostContent.Fields#title
     */
    @Nonnull
    public String getTitle() {
        if (_titleField!= null) {
            return _titleField;
        } else {
            Object __rawValue = super._map.get("title");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("title");
            }
            _titleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _titleField;
        }
    }

    /**
     * Setter for title
     * 
     * @see PostContent.Fields#title
     */
    public PostContent setTitle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTitle(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field title of com.linkedin.post.PostContent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTitle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "title", value);
                    _titleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostContent.Fields#title
     */
    public PostContent setTitle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field title of com.linkedin.post.PostContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "title", value);
            _titleField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see PostContent.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see PostContent.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see PostContent.Fields#type
     */
    @Nullable
    public PostContentType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PostContentType.class, PostContentType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PostContent.Fields#type
     */
    @Nonnull
    public PostContentType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PostContentType.class, PostContentType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see PostContent.Fields#type
     */
    public PostContent setType(
        @Nullable
        PostContentType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.post.PostContent");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostContent.Fields#type
     */
    public PostContent setType(
        @Nonnull
        PostContentType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.post.PostContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see PostContent.Fields#description
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
     * @see PostContent.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see PostContent.Fields#description
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
     * @see PostContent.Fields#description
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
     * @see PostContent.Fields#description
     */
    public PostContent setDescription(
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
     * @see PostContent.Fields#description
     */
    public PostContent setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.post.PostContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for link
     * 
     * @see PostContent.Fields#link
     */
    public boolean hasLink() {
        if (_linkField!= null) {
            return true;
        }
        return super._map.containsKey("link");
    }

    /**
     * Remover for link
     * 
     * @see PostContent.Fields#link
     */
    public void removeLink() {
        super._map.remove("link");
    }

    /**
     * Getter for link
     * 
     * @see PostContent.Fields#link
     */
    @Nullable
    public com.linkedin.common.url.Url getLink(GetMode mode) {
        return getLink();
    }

    /**
     * Getter for link
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PostContent.Fields#link
     */
    @Nullable
    public com.linkedin.common.url.Url getLink() {
        if (_linkField!= null) {
            return _linkField;
        } else {
            Object __rawValue = super._map.get("link");
            _linkField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _linkField;
        }
    }

    /**
     * Setter for link
     * 
     * @see PostContent.Fields#link
     */
    public PostContent setLink(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLink(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLink();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "link", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _linkField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "link", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _linkField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for link
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostContent.Fields#link
     */
    public PostContent setLink(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field link of com.linkedin.post.PostContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "link", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _linkField = value;
        }
        return this;
    }

    /**
     * Existence checker for media
     * 
     * @see PostContent.Fields#media
     */
    public boolean hasMedia() {
        if (_mediaField!= null) {
            return true;
        }
        return super._map.containsKey("media");
    }

    /**
     * Remover for media
     * 
     * @see PostContent.Fields#media
     */
    public void removeMedia() {
        super._map.remove("media");
    }

    /**
     * Getter for media
     * 
     * @see PostContent.Fields#media
     */
    @Nullable
    public Media getMedia(GetMode mode) {
        return getMedia();
    }

    /**
     * Getter for media
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PostContent.Fields#media
     */
    @Nullable
    public Media getMedia() {
        if (_mediaField!= null) {
            return _mediaField;
        } else {
            Object __rawValue = super._map.get("media");
            _mediaField = ((__rawValue == null)?null:new Media(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _mediaField;
        }
    }

    /**
     * Setter for media
     * 
     * @see PostContent.Fields#media
     */
    public PostContent setMedia(
        @Nullable
        Media value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMedia(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMedia();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "media", value.data());
                    _mediaField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "media", value.data());
                    _mediaField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for media
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostContent.Fields#media
     */
    public PostContent setMedia(
        @Nonnull
        Media value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field media of com.linkedin.post.PostContent to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "media", value.data());
            _mediaField = value;
        }
        return this;
    }

    @Override
    public PostContent clone()
        throws CloneNotSupportedException
    {
        PostContent __clone = ((PostContent) super.clone());
        __clone.__changeListener = new PostContent.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PostContent copy()
        throws CloneNotSupportedException
    {
        PostContent __copy = ((PostContent) super.copy());
        __copy._linkField = null;
        __copy._descriptionField = null;
        __copy._mediaField = null;
        __copy._titleField = null;
        __copy._typeField = null;
        __copy.__changeListener = new PostContent.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PostContent __objectRef;

        private ChangeListener(PostContent reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "link":
                    __objectRef._linkField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "media":
                    __objectRef._mediaField = null;
                    break;
                case "title":
                    __objectRef._titleField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * Title of the post.
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Type of content held in the post.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Optional description of the post.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Optional link that the post is associated with.
         * 
         */
        public PathSpec link() {
            return new PathSpec(getPathComponents(), "link");
        }

        /**
         * Optional media that the post is storing
         * 
         */
        public com.linkedin.common.Media.Fields media() {
            return new com.linkedin.common.Media.Fields(getPathComponents(), "media");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.Media.ProjectionMask _mediaMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * Title of the post.
         * 
         */
        public PostContent.ProjectionMask withTitle() {
            getDataMap().put("title", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Type of content held in the post.
         * 
         */
        public PostContent.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional description of the post.
         * 
         */
        public PostContent.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional link that the post is associated with.
         * 
         */
        public PostContent.ProjectionMask withLink() {
            getDataMap().put("link", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional media that the post is storing
         * 
         */
        public PostContent.ProjectionMask withMedia(Function<com.linkedin.common.Media.ProjectionMask, com.linkedin.common.Media.ProjectionMask> nestedMask) {
            _mediaMask = nestedMask.apply(((_mediaMask == null)?Media.createMask():_mediaMask));
            getDataMap().put("media", _mediaMask.getDataMap());
            return this;
        }

        /**
         * Optional media that the post is storing
         * 
         */
        public PostContent.ProjectionMask withMedia() {
            _mediaMask = null;
            getDataMap().put("media", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
