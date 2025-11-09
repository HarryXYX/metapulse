
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
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
 * Properties related to how the entity is displayed in the Datahub UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/DisplayProperties.pdl.")
public class DisplayProperties
    extends RecordTemplate
{

    private final static DisplayProperties.Fields _fields = new DisplayProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties related to how the entity is displayed in the Datahub UI*/@Aspect.name=\"displayProperties\"record DisplayProperties{/**The color associated with the entity in Hex. For example #FFFFFF.*/colorHex:optional string/**The icon associated with the entity*/icon:optional/**Properties describing an icon associated with an entity*/record IconProperties{/**The source of the icon: e.g. Antd, Material, etc*/iconLibrary:/**Enum of possible icon sources*/enum IconLibrary{/**Material UI*/MATERIAL}/**The name of the icon*/name:string/**Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc*/style:string}}", SchemaFormatType.PDL));
    private String _colorHexField = null;
    private IconProperties _iconField = null;
    private DisplayProperties.ChangeListener __changeListener = new DisplayProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ColorHex = SCHEMA.getField("colorHex");
    private final static RecordDataSchema.Field FIELD_Icon = SCHEMA.getField("icon");

    public DisplayProperties() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public DisplayProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DisplayProperties.Fields fields() {
        return _fields;
    }

    public static DisplayProperties.ProjectionMask createMask() {
        return new DisplayProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for colorHex
     * 
     * @see DisplayProperties.Fields#colorHex
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
     * @see DisplayProperties.Fields#colorHex
     */
    public void removeColorHex() {
        super._map.remove("colorHex");
    }

    /**
     * Getter for colorHex
     * 
     * @see DisplayProperties.Fields#colorHex
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
     * @see DisplayProperties.Fields#colorHex
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
     * @see DisplayProperties.Fields#colorHex
     */
    public DisplayProperties setColorHex(
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
     * @see DisplayProperties.Fields#colorHex
     */
    public DisplayProperties setColorHex(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field colorHex of com.linkedin.common.DisplayProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "colorHex", value);
            _colorHexField = value;
        }
        return this;
    }

    /**
     * Existence checker for icon
     * 
     * @see DisplayProperties.Fields#icon
     */
    public boolean hasIcon() {
        if (_iconField!= null) {
            return true;
        }
        return super._map.containsKey("icon");
    }

    /**
     * Remover for icon
     * 
     * @see DisplayProperties.Fields#icon
     */
    public void removeIcon() {
        super._map.remove("icon");
    }

    /**
     * Getter for icon
     * 
     * @see DisplayProperties.Fields#icon
     */
    @Nullable
    public IconProperties getIcon(GetMode mode) {
        return getIcon();
    }

    /**
     * Getter for icon
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DisplayProperties.Fields#icon
     */
    @Nullable
    public IconProperties getIcon() {
        if (_iconField!= null) {
            return _iconField;
        } else {
            Object __rawValue = super._map.get("icon");
            _iconField = ((__rawValue == null)?null:new IconProperties(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _iconField;
        }
    }

    /**
     * Setter for icon
     * 
     * @see DisplayProperties.Fields#icon
     */
    public DisplayProperties setIcon(
        @Nullable
        IconProperties value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIcon(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIcon();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "icon", value.data());
                    _iconField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "icon", value.data());
                    _iconField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for icon
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DisplayProperties.Fields#icon
     */
    public DisplayProperties setIcon(
        @Nonnull
        IconProperties value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field icon of com.linkedin.common.DisplayProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "icon", value.data());
            _iconField = value;
        }
        return this;
    }

    @Override
    public DisplayProperties clone()
        throws CloneNotSupportedException
    {
        DisplayProperties __clone = ((DisplayProperties) super.clone());
        __clone.__changeListener = new DisplayProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DisplayProperties copy()
        throws CloneNotSupportedException
    {
        DisplayProperties __copy = ((DisplayProperties) super.copy());
        __copy._iconField = null;
        __copy._colorHexField = null;
        __copy.__changeListener = new DisplayProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DisplayProperties __objectRef;

        private ChangeListener(DisplayProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "icon":
                    __objectRef._iconField = null;
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
         * The color associated with the entity in Hex. For example #FFFFFF.
         * 
         */
        public PathSpec colorHex() {
            return new PathSpec(getPathComponents(), "colorHex");
        }

        /**
         * The icon associated with the entity
         * 
         */
        public com.linkedin.common.IconProperties.Fields icon() {
            return new com.linkedin.common.IconProperties.Fields(getPathComponents(), "icon");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.IconProperties.ProjectionMask _iconMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The color associated with the entity in Hex. For example #FFFFFF.
         * 
         */
        public DisplayProperties.ProjectionMask withColorHex() {
            getDataMap().put("colorHex", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The icon associated with the entity
         * 
         */
        public DisplayProperties.ProjectionMask withIcon(Function<com.linkedin.common.IconProperties.ProjectionMask, com.linkedin.common.IconProperties.ProjectionMask> nestedMask) {
            _iconMask = nestedMask.apply(((_iconMask == null)?IconProperties.createMask():_iconMask));
            getDataMap().put("icon", _iconMask.getDataMap());
            return this;
        }

        /**
         * The icon associated with the entity
         * 
         */
        public DisplayProperties.ProjectionMask withIcon() {
            _iconMask = null;
            getDataMap().put("icon", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
