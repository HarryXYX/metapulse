
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Properties describing an icon associated with an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/IconProperties.pdl.")
public class IconProperties
    extends RecordTemplate
{

    private final static IconProperties.Fields _fields = new IconProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties describing an icon associated with an entity*/record IconProperties{/**The source of the icon: e.g. Antd, Material, etc*/iconLibrary:/**Enum of possible icon sources*/enum IconLibrary{/**Material UI*/MATERIAL}/**The name of the icon*/name:string/**Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc*/style:string}", SchemaFormatType.PDL));
    private IconLibrary _iconLibraryField = null;
    private String _nameField = null;
    private String _styleField = null;
    private IconProperties.ChangeListener __changeListener = new IconProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_IconLibrary = SCHEMA.getField("iconLibrary");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Style = SCHEMA.getField("style");

    public IconProperties() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public IconProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IconProperties.Fields fields() {
        return _fields;
    }

    public static IconProperties.ProjectionMask createMask() {
        return new IconProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for iconLibrary
     * 
     * @see IconProperties.Fields#iconLibrary
     */
    public boolean hasIconLibrary() {
        if (_iconLibraryField!= null) {
            return true;
        }
        return super._map.containsKey("iconLibrary");
    }

    /**
     * Remover for iconLibrary
     * 
     * @see IconProperties.Fields#iconLibrary
     */
    public void removeIconLibrary() {
        super._map.remove("iconLibrary");
    }

    /**
     * Getter for iconLibrary
     * 
     * @see IconProperties.Fields#iconLibrary
     */
    @Nullable
    public IconLibrary getIconLibrary(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getIconLibrary();
            case DEFAULT:
            case NULL:
                if (_iconLibraryField!= null) {
                    return _iconLibraryField;
                } else {
                    Object __rawValue = super._map.get("iconLibrary");
                    _iconLibraryField = DataTemplateUtil.coerceEnumOutput(__rawValue, IconLibrary.class, IconLibrary.$UNKNOWN);
                    return _iconLibraryField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for iconLibrary
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IconProperties.Fields#iconLibrary
     */
    @Nonnull
    public IconLibrary getIconLibrary() {
        if (_iconLibraryField!= null) {
            return _iconLibraryField;
        } else {
            Object __rawValue = super._map.get("iconLibrary");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("iconLibrary");
            }
            _iconLibraryField = DataTemplateUtil.coerceEnumOutput(__rawValue, IconLibrary.class, IconLibrary.$UNKNOWN);
            return _iconLibraryField;
        }
    }

    /**
     * Setter for iconLibrary
     * 
     * @see IconProperties.Fields#iconLibrary
     */
    public IconProperties setIconLibrary(
        @Nullable
        IconLibrary value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIconLibrary(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field iconLibrary of com.linkedin.common.IconProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "iconLibrary", value.name());
                    _iconLibraryField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIconLibrary();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "iconLibrary", value.name());
                    _iconLibraryField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "iconLibrary", value.name());
                    _iconLibraryField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for iconLibrary
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IconProperties.Fields#iconLibrary
     */
    public IconProperties setIconLibrary(
        @Nonnull
        IconLibrary value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field iconLibrary of com.linkedin.common.IconProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "iconLibrary", value.name());
            _iconLibraryField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see IconProperties.Fields#name
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
     * @see IconProperties.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see IconProperties.Fields#name
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
     * @see IconProperties.Fields#name
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
     * @see IconProperties.Fields#name
     */
    public IconProperties setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.common.IconProperties");
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
     * @see IconProperties.Fields#name
     */
    public IconProperties setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.common.IconProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    /**
     * Existence checker for style
     * 
     * @see IconProperties.Fields#style
     */
    public boolean hasStyle() {
        if (_styleField!= null) {
            return true;
        }
        return super._map.containsKey("style");
    }

    /**
     * Remover for style
     * 
     * @see IconProperties.Fields#style
     */
    public void removeStyle() {
        super._map.remove("style");
    }

    /**
     * Getter for style
     * 
     * @see IconProperties.Fields#style
     */
    @Nullable
    public String getStyle(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStyle();
            case DEFAULT:
            case NULL:
                if (_styleField!= null) {
                    return _styleField;
                } else {
                    Object __rawValue = super._map.get("style");
                    _styleField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _styleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for style
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IconProperties.Fields#style
     */
    @Nonnull
    public String getStyle() {
        if (_styleField!= null) {
            return _styleField;
        } else {
            Object __rawValue = super._map.get("style");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("style");
            }
            _styleField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _styleField;
        }
    }

    /**
     * Setter for style
     * 
     * @see IconProperties.Fields#style
     */
    public IconProperties setStyle(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStyle(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field style of com.linkedin.common.IconProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "style", value);
                    _styleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStyle();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "style", value);
                    _styleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "style", value);
                    _styleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for style
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IconProperties.Fields#style
     */
    public IconProperties setStyle(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field style of com.linkedin.common.IconProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "style", value);
            _styleField = value;
        }
        return this;
    }

    @Override
    public IconProperties clone()
        throws CloneNotSupportedException
    {
        IconProperties __clone = ((IconProperties) super.clone());
        __clone.__changeListener = new IconProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IconProperties copy()
        throws CloneNotSupportedException
    {
        IconProperties __copy = ((IconProperties) super.copy());
        __copy._iconLibraryField = null;
        __copy._nameField = null;
        __copy._styleField = null;
        __copy.__changeListener = new IconProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IconProperties __objectRef;

        private ChangeListener(IconProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "iconLibrary":
                    __objectRef._iconLibraryField = null;
                    break;
                case "name":
                    __objectRef._nameField = null;
                    break;
                case "style":
                    __objectRef._styleField = null;
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
         * The source of the icon: e.g. Antd, Material, etc
         * 
         */
        public PathSpec iconLibrary() {
            return new PathSpec(getPathComponents(), "iconLibrary");
        }

        /**
         * The name of the icon
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc
         * 
         */
        public PathSpec style() {
            return new PathSpec(getPathComponents(), "style");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * The source of the icon: e.g. Antd, Material, etc
         * 
         */
        public IconProperties.ProjectionMask withIconLibrary() {
            getDataMap().put("iconLibrary", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The name of the icon
         * 
         */
        public IconProperties.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc
         * 
         */
        public IconProperties.ProjectionMask withStyle() {
            getDataMap().put("style", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
