
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.data.template.SetMode;


/**
 * Group information that can be edited from UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/identity/CorpGroupEditableInfo.pdl.")
public class CorpGroupEditableInfo
    extends RecordTemplate
{

    private final static CorpGroupEditableInfo.Fields _fields = new CorpGroupEditableInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Group information that can be edited from UI*/@Aspect.name=\"corpGroupEditableInfo\"record CorpGroupEditableInfo{/**A description of the group*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string/**A URL which points to a picture which user wants to set as the photo for the group*/pictureLink:{namespace com.linkedin.common@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}=\"https://raw.githubusercontent.com/datahub-project/datahub/master/datahub-web-react/src/images/default_avatar.png\"/**Slack channel for the group*/slack:optional string/**Email address to contact the group*/email:optional string}", SchemaFormatType.PDL));
    private String _descriptionField = null;
    private com.linkedin.common.url.Url _pictureLinkField = null;
    private String _slackField = null;
    private String _emailField = null;
    private CorpGroupEditableInfo.ChangeListener __changeListener = new CorpGroupEditableInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_PictureLink = SCHEMA.getField("pictureLink");
    private final static com.linkedin.common.url.Url DEFAULT_PictureLink;
    private final static RecordDataSchema.Field FIELD_Slack = SCHEMA.getField("slack");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_PictureLink = DataTemplateUtil.coerceCustomOutput(FIELD_PictureLink.getDefault(), com.linkedin.common.url.Url.class);
    }

    public CorpGroupEditableInfo() {
        super(new DataMap(6, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public CorpGroupEditableInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static CorpGroupEditableInfo.Fields fields() {
        return _fields;
    }

    public static CorpGroupEditableInfo.ProjectionMask createMask() {
        return new CorpGroupEditableInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for description
     * 
     * @see CorpGroupEditableInfo.Fields#description
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
     * @see CorpGroupEditableInfo.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see CorpGroupEditableInfo.Fields#description
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
     * @see CorpGroupEditableInfo.Fields#description
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
     * @see CorpGroupEditableInfo.Fields#description
     */
    public CorpGroupEditableInfo setDescription(
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
     * @see CorpGroupEditableInfo.Fields#description
     */
    public CorpGroupEditableInfo setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.identity.CorpGroupEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for pictureLink
     * 
     * @see CorpGroupEditableInfo.Fields#pictureLink
     */
    public boolean hasPictureLink() {
        if (_pictureLinkField!= null) {
            return true;
        }
        return super._map.containsKey("pictureLink");
    }

    /**
     * Remover for pictureLink
     * 
     * @see CorpGroupEditableInfo.Fields#pictureLink
     */
    public void removePictureLink() {
        super._map.remove("pictureLink");
    }

    /**
     * Getter for pictureLink
     * 
     * @see CorpGroupEditableInfo.Fields#pictureLink
     */
    @Nullable
    public com.linkedin.common.url.Url getPictureLink(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getPictureLink();
            case NULL:
                if (_pictureLinkField!= null) {
                    return _pictureLinkField;
                } else {
                    Object __rawValue = super._map.get("pictureLink");
                    _pictureLinkField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
                    return _pictureLinkField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for pictureLink
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupEditableInfo.Fields#pictureLink
     */
    @Nonnull
    public com.linkedin.common.url.Url getPictureLink() {
        if (_pictureLinkField!= null) {
            return _pictureLinkField;
        } else {
            Object __rawValue = super._map.get("pictureLink");
            if (__rawValue == null) {
                return DEFAULT_PictureLink;
            }
            _pictureLinkField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _pictureLinkField;
        }
    }

    /**
     * Setter for pictureLink
     * 
     * @see CorpGroupEditableInfo.Fields#pictureLink
     */
    public CorpGroupEditableInfo setPictureLink(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPictureLink(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field pictureLink of com.linkedin.identity.CorpGroupEditableInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _pictureLinkField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePictureLink();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _pictureLinkField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _pictureLinkField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for pictureLink
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupEditableInfo.Fields#pictureLink
     */
    public CorpGroupEditableInfo setPictureLink(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field pictureLink of com.linkedin.identity.CorpGroupEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "pictureLink", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _pictureLinkField = value;
        }
        return this;
    }

    /**
     * Existence checker for slack
     * 
     * @see CorpGroupEditableInfo.Fields#slack
     */
    public boolean hasSlack() {
        if (_slackField!= null) {
            return true;
        }
        return super._map.containsKey("slack");
    }

    /**
     * Remover for slack
     * 
     * @see CorpGroupEditableInfo.Fields#slack
     */
    public void removeSlack() {
        super._map.remove("slack");
    }

    /**
     * Getter for slack
     * 
     * @see CorpGroupEditableInfo.Fields#slack
     */
    @Nullable
    public String getSlack(GetMode mode) {
        return getSlack();
    }

    /**
     * Getter for slack
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupEditableInfo.Fields#slack
     */
    @Nullable
    public String getSlack() {
        if (_slackField!= null) {
            return _slackField;
        } else {
            Object __rawValue = super._map.get("slack");
            _slackField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _slackField;
        }
    }

    /**
     * Setter for slack
     * 
     * @see CorpGroupEditableInfo.Fields#slack
     */
    public CorpGroupEditableInfo setSlack(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSlack(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSlack();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "slack", value);
                    _slackField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "slack", value);
                    _slackField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for slack
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupEditableInfo.Fields#slack
     */
    public CorpGroupEditableInfo setSlack(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field slack of com.linkedin.identity.CorpGroupEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "slack", value);
            _slackField = value;
        }
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpGroupEditableInfo.Fields#email
     */
    public boolean hasEmail() {
        if (_emailField!= null) {
            return true;
        }
        return super._map.containsKey("email");
    }

    /**
     * Remover for email
     * 
     * @see CorpGroupEditableInfo.Fields#email
     */
    public void removeEmail() {
        super._map.remove("email");
    }

    /**
     * Getter for email
     * 
     * @see CorpGroupEditableInfo.Fields#email
     */
    @Nullable
    public String getEmail(GetMode mode) {
        return getEmail();
    }

    /**
     * Getter for email
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupEditableInfo.Fields#email
     */
    @Nullable
    public String getEmail() {
        if (_emailField!= null) {
            return _emailField;
        } else {
            Object __rawValue = super._map.get("email");
            _emailField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _emailField;
        }
    }

    /**
     * Setter for email
     * 
     * @see CorpGroupEditableInfo.Fields#email
     */
    public CorpGroupEditableInfo setEmail(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEmail(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEmail();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "email", value);
                    _emailField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for email
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupEditableInfo.Fields#email
     */
    public CorpGroupEditableInfo setEmail(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field email of com.linkedin.identity.CorpGroupEditableInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "email", value);
            _emailField = value;
        }
        return this;
    }

    @Override
    public CorpGroupEditableInfo clone()
        throws CloneNotSupportedException
    {
        CorpGroupEditableInfo __clone = ((CorpGroupEditableInfo) super.clone());
        __clone.__changeListener = new CorpGroupEditableInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public CorpGroupEditableInfo copy()
        throws CloneNotSupportedException
    {
        CorpGroupEditableInfo __copy = ((CorpGroupEditableInfo) super.copy());
        __copy._slackField = null;
        __copy._descriptionField = null;
        __copy._pictureLinkField = null;
        __copy._emailField = null;
        __copy.__changeListener = new CorpGroupEditableInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final CorpGroupEditableInfo __objectRef;

        private ChangeListener(CorpGroupEditableInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "slack":
                    __objectRef._slackField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "pictureLink":
                    __objectRef._pictureLinkField = null;
                    break;
                case "email":
                    __objectRef._emailField = null;
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
         * A description of the group
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * A URL which points to a picture which user wants to set as the photo for the group
         * 
         */
        public PathSpec pictureLink() {
            return new PathSpec(getPathComponents(), "pictureLink");
        }

        /**
         * Slack channel for the group
         * 
         */
        public PathSpec slack() {
            return new PathSpec(getPathComponents(), "slack");
        }

        /**
         * Email address to contact the group
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * A description of the group
         * 
         */
        public CorpGroupEditableInfo.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A URL which points to a picture which user wants to set as the photo for the group
         * 
         */
        public CorpGroupEditableInfo.ProjectionMask withPictureLink() {
            getDataMap().put("pictureLink", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Slack channel for the group
         * 
         */
        public CorpGroupEditableInfo.ProjectionMask withSlack() {
            getDataMap().put("slack", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Email address to contact the group
         * 
         */
        public CorpGroupEditableInfo.ProjectionMask withEmail() {
            getDataMap().put("email", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
