
package com.linkedin.post;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
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
 * Information about a DataHub Post.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/post/PostInfo.pdl.")
public class PostInfo
    extends RecordTemplate
{

    private final static PostInfo.Fields _fields = new PostInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.post/**Information about a DataHub Post.*/@Aspect.name=\"postInfo\"record PostInfo{/**Type of the Post.*/@Searchable={}type:/**Enum defining types of Posts.*/enum PostType{/**The Post is an Home Page announcement.*/HOME_PAGE_ANNOUNCEMENT/**The Post is an Entity level announcement.*/ENTITY_ANNOUNCEMENT}/**Content stored in the post.*/content:/**Content stored inside a Post.*/record PostContent{/**Title of the post.*/@Searchable.fieldType=\"TEXT_PARTIAL\"title:string/**Type of content held in the post.*/type:/**Enum defining the type of content held in a Post.*/enum PostContentType{/**Text content*/TEXT/**Link content*/LINK}/**Optional description of the post.*/description:optional string/**Optional link that the post is associated with.*/link:optional{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}/**Optional media that the post is storing*/media:optional{namespace com.linkedin.common/**Carries information about which roles a user is assigned to.*/record Media{/**Type of content the Media is storing, e.g. image, video, etc.*/type:/**Enum defining the type of content a Media object holds.*/enum MediaType{/**The Media holds an image.*/IMAGE}/**Where the media content is stored.*/location:Url}}}/**The time at which the post was initially created*/@Searchable.fieldType=\"COUNT\"created:long/**The time at which the post was last modified*/@Searchable.fieldType=\"COUNT\"lastModified:long/**The audit stamp at which the request was last updated*/@Searchable.`/time`={\"fieldName\":\"created\",\"fieldType\":\"COUNT\"}auditStamp:optional{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn/**Additional context around how DataHub was informed of the particular change. For example: was the change created by an automated process, or manually.*/message:optional string}}/**Optional Entity URN that the post is associated with.*/@Relationship={\"entityTypes\":[\"dataset\",\"schemaField\",\"chart\",\"container\",\"dashboard\",\"dataFlow\",\"dataJob\",\"dataProduct\",\"glossaryTerm\",\"glossaryNode\",\"mlModel\",\"mlFeature\",\"notebook\",\"mlFeatureTable\",\"mlPrimaryKey\",\"mlModelGroup\",\"domain\",\"dataProduct\"],\"name\":\"PostTarget\"}@Searchable={}target:optional com.linkedin.common.Urn}", SchemaFormatType.PDL));
    private PostType _typeField = null;
    private PostContent _contentField = null;
    private Long _createdField = null;
    private Long _lastModifiedField = null;
    private AuditStamp _auditStampField = null;
    private com.linkedin.common.urn.Urn _targetField = null;
    private PostInfo.ChangeListener __changeListener = new PostInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Content = SCHEMA.getField("content");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");
    private final static RecordDataSchema.Field FIELD_Target = SCHEMA.getField("target");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public PostInfo() {
        super(new DataMap(8, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public PostInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static PostInfo.Fields fields() {
        return _fields;
    }

    public static PostInfo.ProjectionMask createMask() {
        return new PostInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see PostInfo.Fields#type
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
     * @see PostInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see PostInfo.Fields#type
     */
    @Nullable
    public PostType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PostType.class, PostType.$UNKNOWN);
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
     * @see PostInfo.Fields#type
     */
    @Nonnull
    public PostType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, PostType.class, PostType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see PostInfo.Fields#type
     */
    public PostInfo setType(
        @Nullable
        PostType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.post.PostInfo");
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
     * @see PostInfo.Fields#type
     */
    public PostInfo setType(
        @Nonnull
        PostType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.post.PostInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for content
     * 
     * @see PostInfo.Fields#content
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
     * @see PostInfo.Fields#content
     */
    public void removeContent() {
        super._map.remove("content");
    }

    /**
     * Getter for content
     * 
     * @see PostInfo.Fields#content
     */
    @Nullable
    public PostContent getContent(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getContent();
            case DEFAULT:
            case NULL:
                if (_contentField!= null) {
                    return _contentField;
                } else {
                    Object __rawValue = super._map.get("content");
                    _contentField = ((__rawValue == null)?null:new PostContent(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
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
     * @see PostInfo.Fields#content
     */
    @Nonnull
    public PostContent getContent() {
        if (_contentField!= null) {
            return _contentField;
        } else {
            Object __rawValue = super._map.get("content");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("content");
            }
            _contentField = ((__rawValue == null)?null:new PostContent(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _contentField;
        }
    }

    /**
     * Setter for content
     * 
     * @see PostInfo.Fields#content
     */
    public PostInfo setContent(
        @Nullable
        PostContent value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContent(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field content of com.linkedin.post.PostInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "content", value.data());
                    _contentField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContent();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "content", value.data());
                    _contentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "content", value.data());
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
     * @see PostInfo.Fields#content
     */
    public PostInfo setContent(
        @Nonnull
        PostContent value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field content of com.linkedin.post.PostInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "content", value.data());
            _contentField = value;
        }
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see PostInfo.Fields#created
     */
    public boolean hasCreated() {
        if (_createdField!= null) {
            return true;
        }
        return super._map.containsKey("created");
    }

    /**
     * Remover for created
     * 
     * @see PostInfo.Fields#created
     */
    public void removeCreated() {
        super._map.remove("created");
    }

    /**
     * Getter for created
     * 
     * @see PostInfo.Fields#created
     */
    @Nullable
    public Long getCreated(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCreated();
            case DEFAULT:
            case NULL:
                if (_createdField!= null) {
                    return _createdField;
                } else {
                    Object __rawValue = super._map.get("created");
                    _createdField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _createdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PostInfo.Fields#created
     */
    @Nonnull
    public Long getCreated() {
        if (_createdField!= null) {
            return _createdField;
        } else {
            Object __rawValue = super._map.get("created");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("created");
            }
            _createdField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _createdField;
        }
    }

    /**
     * Setter for created
     * 
     * @see PostInfo.Fields#created
     */
    public PostInfo setCreated(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreated(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field created of com.linkedin.post.PostInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", DataTemplateUtil.coerceLongInput(value));
                    _createdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreated();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "created", DataTemplateUtil.coerceLongInput(value));
                    _createdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "created", DataTemplateUtil.coerceLongInput(value));
                    _createdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostInfo.Fields#created
     */
    public PostInfo setCreated(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field created of com.linkedin.post.PostInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "created", DataTemplateUtil.coerceLongInput(value));
            _createdField = value;
        }
        return this;
    }

    /**
     * Setter for created
     * 
     * @see PostInfo.Fields#created
     */
    public PostInfo setCreated(long value) {
        CheckedUtil.putWithoutChecking(super._map, "created", DataTemplateUtil.coerceLongInput(value));
        _createdField = value;
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see PostInfo.Fields#lastModified
     */
    public boolean hasLastModified() {
        if (_lastModifiedField!= null) {
            return true;
        }
        return super._map.containsKey("lastModified");
    }

    /**
     * Remover for lastModified
     * 
     * @see PostInfo.Fields#lastModified
     */
    public void removeLastModified() {
        super._map.remove("lastModified");
    }

    /**
     * Getter for lastModified
     * 
     * @see PostInfo.Fields#lastModified
     */
    @Nullable
    public Long getLastModified(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLastModified();
            case DEFAULT:
            case NULL:
                if (_lastModifiedField!= null) {
                    return _lastModifiedField;
                } else {
                    Object __rawValue = super._map.get("lastModified");
                    _lastModifiedField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _lastModifiedField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see PostInfo.Fields#lastModified
     */
    @Nonnull
    public Long getLastModified() {
        if (_lastModifiedField!= null) {
            return _lastModifiedField;
        } else {
            Object __rawValue = super._map.get("lastModified");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("lastModified");
            }
            _lastModifiedField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _lastModifiedField;
        }
    }

    /**
     * Setter for lastModified
     * 
     * @see PostInfo.Fields#lastModified
     */
    public PostInfo setLastModified(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLastModified(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field lastModified of com.linkedin.post.PostInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", DataTemplateUtil.coerceLongInput(value));
                    _lastModifiedField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLastModified();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", DataTemplateUtil.coerceLongInput(value));
                    _lastModifiedField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "lastModified", DataTemplateUtil.coerceLongInput(value));
                    _lastModifiedField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostInfo.Fields#lastModified
     */
    public PostInfo setLastModified(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field lastModified of com.linkedin.post.PostInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "lastModified", DataTemplateUtil.coerceLongInput(value));
            _lastModifiedField = value;
        }
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @see PostInfo.Fields#lastModified
     */
    public PostInfo setLastModified(long value) {
        CheckedUtil.putWithoutChecking(super._map, "lastModified", DataTemplateUtil.coerceLongInput(value));
        _lastModifiedField = value;
        return this;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see PostInfo.Fields#auditStamp
     */
    public boolean hasAuditStamp() {
        if (_auditStampField!= null) {
            return true;
        }
        return super._map.containsKey("auditStamp");
    }

    /**
     * Remover for auditStamp
     * 
     * @see PostInfo.Fields#auditStamp
     */
    public void removeAuditStamp() {
        super._map.remove("auditStamp");
    }

    /**
     * Getter for auditStamp
     * 
     * @see PostInfo.Fields#auditStamp
     */
    @Nullable
    public AuditStamp getAuditStamp(GetMode mode) {
        return getAuditStamp();
    }

    /**
     * Getter for auditStamp
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PostInfo.Fields#auditStamp
     */
    @Nullable
    public AuditStamp getAuditStamp() {
        if (_auditStampField!= null) {
            return _auditStampField;
        } else {
            Object __rawValue = super._map.get("auditStamp");
            _auditStampField = ((__rawValue == null)?null:new AuditStamp(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _auditStampField;
        }
    }

    /**
     * Setter for auditStamp
     * 
     * @see PostInfo.Fields#auditStamp
     */
    public PostInfo setAuditStamp(
        @Nullable
        AuditStamp value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAuditStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAuditStamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
                    _auditStampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for auditStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostInfo.Fields#auditStamp
     */
    public PostInfo setAuditStamp(
        @Nonnull
        AuditStamp value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field auditStamp of com.linkedin.post.PostInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "auditStamp", value.data());
            _auditStampField = value;
        }
        return this;
    }

    /**
     * Existence checker for target
     * 
     * @see PostInfo.Fields#target
     */
    public boolean hasTarget() {
        if (_targetField!= null) {
            return true;
        }
        return super._map.containsKey("target");
    }

    /**
     * Remover for target
     * 
     * @see PostInfo.Fields#target
     */
    public void removeTarget() {
        super._map.remove("target");
    }

    /**
     * Getter for target
     * 
     * @see PostInfo.Fields#target
     */
    @Nullable
    public com.linkedin.common.urn.Urn getTarget(GetMode mode) {
        return getTarget();
    }

    /**
     * Getter for target
     * 
     * @return
     *     Optional field. Always check for null.
     * @see PostInfo.Fields#target
     */
    @Nullable
    public com.linkedin.common.urn.Urn getTarget() {
        if (_targetField!= null) {
            return _targetField;
        } else {
            Object __rawValue = super._map.get("target");
            _targetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _targetField;
        }
    }

    /**
     * Setter for target
     * 
     * @see PostInfo.Fields#target
     */
    public PostInfo setTarget(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTarget(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTarget();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "target", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _targetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "target", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _targetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for target
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see PostInfo.Fields#target
     */
    public PostInfo setTarget(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field target of com.linkedin.post.PostInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "target", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _targetField = value;
        }
        return this;
    }

    @Override
    public PostInfo clone()
        throws CloneNotSupportedException
    {
        PostInfo __clone = ((PostInfo) super.clone());
        __clone.__changeListener = new PostInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public PostInfo copy()
        throws CloneNotSupportedException
    {
        PostInfo __copy = ((PostInfo) super.copy());
        __copy._auditStampField = null;
        __copy._createdField = null;
        __copy._lastModifiedField = null;
        __copy._typeField = null;
        __copy._contentField = null;
        __copy._targetField = null;
        __copy.__changeListener = new PostInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final PostInfo __objectRef;

        private ChangeListener(PostInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "auditStamp":
                    __objectRef._auditStampField = null;
                    break;
                case "created":
                    __objectRef._createdField = null;
                    break;
                case "lastModified":
                    __objectRef._lastModifiedField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "content":
                    __objectRef._contentField = null;
                    break;
                case "target":
                    __objectRef._targetField = null;
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
         * Type of the Post.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Content stored in the post.
         * 
         */
        public com.linkedin.post.PostContent.Fields content() {
            return new com.linkedin.post.PostContent.Fields(getPathComponents(), "content");
        }

        /**
         * The time at which the post was initially created
         * 
         */
        public PathSpec created() {
            return new PathSpec(getPathComponents(), "created");
        }

        /**
         * The time at which the post was last modified
         * 
         */
        public PathSpec lastModified() {
            return new PathSpec(getPathComponents(), "lastModified");
        }

        /**
         * The audit stamp at which the request was last updated
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

        /**
         * Optional Entity URN that the post is associated with.
         * 
         */
        public PathSpec target() {
            return new PathSpec(getPathComponents(), "target");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.post.PostContent.ProjectionMask _contentMask;
        private com.linkedin.common.AuditStamp.ProjectionMask _auditStampMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * Type of the Post.
         * 
         */
        public PostInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Content stored in the post.
         * 
         */
        public PostInfo.ProjectionMask withContent(Function<com.linkedin.post.PostContent.ProjectionMask, com.linkedin.post.PostContent.ProjectionMask> nestedMask) {
            _contentMask = nestedMask.apply(((_contentMask == null)?PostContent.createMask():_contentMask));
            getDataMap().put("content", _contentMask.getDataMap());
            return this;
        }

        /**
         * Content stored in the post.
         * 
         */
        public PostInfo.ProjectionMask withContent() {
            _contentMask = null;
            getDataMap().put("content", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the post was initially created
         * 
         */
        public PostInfo.ProjectionMask withCreated() {
            getDataMap().put("created", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The time at which the post was last modified
         * 
         */
        public PostInfo.ProjectionMask withLastModified() {
            getDataMap().put("lastModified", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The audit stamp at which the request was last updated
         * 
         */
        public PostInfo.ProjectionMask withAuditStamp(Function<com.linkedin.common.AuditStamp.ProjectionMask, com.linkedin.common.AuditStamp.ProjectionMask> nestedMask) {
            _auditStampMask = nestedMask.apply(((_auditStampMask == null)?AuditStamp.createMask():_auditStampMask));
            getDataMap().put("auditStamp", _auditStampMask.getDataMap());
            return this;
        }

        /**
         * The audit stamp at which the request was last updated
         * 
         */
        public PostInfo.ProjectionMask withAuditStamp(MaskMap nestedMask) {
            getDataMap().put("auditStamp", nestedMask.getDataMap());
            return this;
        }

        /**
         * The audit stamp at which the request was last updated
         * 
         */
        public PostInfo.ProjectionMask withAuditStamp() {
            _auditStampMask = null;
            getDataMap().put("auditStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional Entity URN that the post is associated with.
         * 
         */
        public PostInfo.ProjectionMask withTarget() {
            getDataMap().put("target", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
