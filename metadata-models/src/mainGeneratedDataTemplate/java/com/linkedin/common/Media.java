
package com.linkedin.common;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Carries information about which roles a user is assigned to.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/Media.pdl.")
public class Media
    extends RecordTemplate
{

    private final static Media.Fields _fields = new Media.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Carries information about which roles a user is assigned to.*/record Media{/**Type of content the Media is storing, e.g. image, video, etc.*/type:/**Enum defining the type of content a Media object holds.*/enum MediaType{/**The Media holds an image.*/IMAGE}/**Where the media content is stored.*/location:@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}", SchemaFormatType.PDL));
    private MediaType _typeField = null;
    private com.linkedin.common.url.Url _locationField = null;
    private Media.ChangeListener __changeListener = new Media.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Location = SCHEMA.getField("location");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public Media() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public Media(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Media.Fields fields() {
        return _fields;
    }

    public static Media.ProjectionMask createMask() {
        return new Media.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see Media.Fields#type
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
     * @see Media.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see Media.Fields#type
     */
    @Nullable
    public MediaType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, MediaType.class, MediaType.$UNKNOWN);
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
     * @see Media.Fields#type
     */
    @Nonnull
    public MediaType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, MediaType.class, MediaType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see Media.Fields#type
     */
    public Media setType(
        @Nullable
        MediaType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.common.Media");
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
     * @see Media.Fields#type
     */
    public Media setType(
        @Nonnull
        MediaType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.common.Media to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for location
     * 
     * @see Media.Fields#location
     */
    public boolean hasLocation() {
        if (_locationField!= null) {
            return true;
        }
        return super._map.containsKey("location");
    }

    /**
     * Remover for location
     * 
     * @see Media.Fields#location
     */
    public void removeLocation() {
        super._map.remove("location");
    }

    /**
     * Getter for location
     * 
     * @see Media.Fields#location
     */
    @Nullable
    public com.linkedin.common.url.Url getLocation(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLocation();
            case DEFAULT:
            case NULL:
                if (_locationField!= null) {
                    return _locationField;
                } else {
                    Object __rawValue = super._map.get("location");
                    _locationField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
                    return _locationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for location
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Media.Fields#location
     */
    @Nonnull
    public com.linkedin.common.url.Url getLocation() {
        if (_locationField!= null) {
            return _locationField;
        } else {
            Object __rawValue = super._map.get("location");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("location");
            }
            _locationField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _locationField;
        }
    }

    /**
     * Setter for location
     * 
     * @see Media.Fields#location
     */
    public Media setLocation(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLocation(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field location of com.linkedin.common.Media");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "location", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _locationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLocation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "location", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _locationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "location", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _locationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for location
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Media.Fields#location
     */
    public Media setLocation(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field location of com.linkedin.common.Media to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "location", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _locationField = value;
        }
        return this;
    }

    @Override
    public Media clone()
        throws CloneNotSupportedException
    {
        Media __clone = ((Media) super.clone());
        __clone.__changeListener = new Media.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Media copy()
        throws CloneNotSupportedException
    {
        Media __copy = ((Media) super.copy());
        __copy._locationField = null;
        __copy._typeField = null;
        __copy.__changeListener = new Media.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Media __objectRef;

        private ChangeListener(Media reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "location":
                    __objectRef._locationField = null;
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
         * Type of content the Media is storing, e.g. image, video, etc.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Where the media content is stored.
         * 
         */
        public PathSpec location() {
            return new PathSpec(getPathComponents(), "location");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Type of content the Media is storing, e.g. image, video, etc.
         * 
         */
        public Media.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Where the media content is stored.
         * 
         */
        public Media.ProjectionMask withLocation() {
            getDataMap().put("location", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
