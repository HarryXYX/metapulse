
package com.linkedin.tag;

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
 * Properties associated with a Tag
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/tag/TagProperties.pdl.")
public class TagProperties
    extends RecordTemplate
{

    private final static TagProperties.Fields _fields = new TagProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.tag/**Properties associated with a Tag*/@Aspect.name=\"tagProperties\"record TagProperties{/**Display name of the tag*/@Searchable={\"boostScore\":10.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string/**Documentation of the tag*/@Searchable={}description:optional string/**The color associated with the Tag in Hex. For example #FFFFFF.*/colorHex:optional string}", SchemaFormatType.PDL));
    private String _nameField = null;
    private String _descriptionField = null;
    private String _colorHexField = null;
    private TagProperties.ChangeListener __changeListener = new TagProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_ColorHex = SCHEMA.getField("colorHex");

    public TagProperties() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TagProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TagProperties.Fields fields() {
        return _fields;
    }

    public static TagProperties.ProjectionMask createMask() {
        return new TagProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for name
     * 
     * @see TagProperties.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see TagProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see TagProperties.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TagProperties.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see TagProperties.Fields#name
     */
    public TagProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.tag.TagProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagProperties.Fields#name
     */
    public TagProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.tag.TagProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see TagProperties.Fields#description
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
     * @see TagProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see TagProperties.Fields#description
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
     * @see TagProperties.Fields#description
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
     * @see TagProperties.Fields#description
     */
    public TagProperties setDescription(
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
     * @see TagProperties.Fields#description
     */
    public TagProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.tag.TagProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for colorHex
     * 
     * @see TagProperties.Fields#colorHex
     */
    public boolean hasColorHex() {
        if (_colorHexField!= null) {
            return true;
        }
        return super._map.containsKey("colorHex");
    }

    /**
     * Remover for colorHex
     * 
     * @see TagProperties.Fields#colorHex
     */
    public void removeColorHex() {
        super._map.remove("colorHex");
    }

    /**
     * Getter for colorHex
     * 
     * @see TagProperties.Fields#colorHex
     */
    @Nullable
    public String getColorHex(GetMode mode) {
        return getColorHex();
    }

    /**
     * Getter for colorHex
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TagProperties.Fields#colorHex
     */
    @Nullable
    public String getColorHex() {
        if (_colorHexField!= null) {
            return _colorHexField;
        } else {
            Object __rawValue = super._map.get("colorHex");
            _colorHexField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _colorHexField;
        }
    }

    /**
     * Setter for colorHex
     * 
     * @see TagProperties.Fields#colorHex
     */
    public TagProperties setColorHex(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setColorHex(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeColorHex();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "colorHex", value);
                    _colorHexField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "colorHex", value);
                    _colorHexField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for colorHex
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagProperties.Fields#colorHex
     */
    public TagProperties setColorHex(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field colorHex of com.linkedin.tag.TagProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "colorHex", value);
            _colorHexField = value;
        }
        return this;
    }

    @Override
    public TagProperties clone()
        throws CloneNotSupportedException
    {
        TagProperties __clone = ((TagProperties) super.clone());
        __clone.__changeListener = new TagProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TagProperties copy()
        throws CloneNotSupportedException
    {
        TagProperties __copy = ((TagProperties) super.copy());
        __copy._nameField = null;
        __copy._descriptionField = null;
        __copy._colorHexField = null;
        __copy.__changeListener = new TagProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TagProperties __objectRef;

        private ChangeListener(TagProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "colorHex":
                    __objectRef._colorHexField = null;
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
         * Display name of the tag
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Documentation of the tag
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The color associated with the Tag in Hex. For example #FFFFFF.
         * 
         */
        public PathSpec colorHex() {
            return new PathSpec(getPathComponents(), "colorHex");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Display name of the tag
         * 
         */
        public TagProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the tag
         * 
         */
        public TagProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The color associated with the Tag in Hex. For example #FFFFFF.
         * 
         */
        public TagProperties.ProjectionMask withColorHex() {
            getDataMap().put("colorHex", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
