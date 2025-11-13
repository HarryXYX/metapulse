
package com.linkedin.template;

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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Info for a given asset summary element
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/SummaryElement.pdl.")
public class SummaryElement
    extends RecordTemplate
{

    private final static SummaryElement.Fields _fields = new SummaryElement.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template/**Info for a given asset summary element*/record SummaryElement{/**The type of element/property*/elementType:enum SummaryElementType{CREATED,TAGS,GLOSSARY_TERMS,OWNERS,DOMAIN,STRUCTURED_PROPERTY}/**The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY*/@Relationship={\"entityTypes\":[\"structuredProperty\"],\"name\":\"ContainsStructuredProperty\"}structuredPropertyUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private SummaryElementType _elementTypeField = null;
    private com.linkedin.common.urn.Urn _structuredPropertyUrnField = null;
    private SummaryElement.ChangeListener __changeListener = new SummaryElement.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_ElementType = SCHEMA.getField("elementType");
    private final static RecordDataSchema.Field FIELD_StructuredPropertyUrn = SCHEMA.getField("structuredPropertyUrn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SummaryElement() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SummaryElement(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SummaryElement.Fields fields() {
        return _fields;
    }

    public static SummaryElement.ProjectionMask createMask() {
        return new SummaryElement.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for elementType
     * 
     * @see SummaryElement.Fields#elementType
     */
    public boolean hasElementType() {
        if (_elementTypeField!= null) {
            return true;
        }
        return super._map.containsKey("elementType");
    }

    /**
     * Remover for elementType
     * 
     * @see SummaryElement.Fields#elementType
     */
    public void removeElementType() {
        super._map.remove("elementType");
    }

    /**
     * Getter for elementType
     * 
     * @see SummaryElement.Fields#elementType
     */
    @Nullable
    public SummaryElementType getElementType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getElementType();
            case DEFAULT:
            case NULL:
                if (_elementTypeField!= null) {
                    return _elementTypeField;
                } else {
                    Object __rawValue = super._map.get("elementType");
                    _elementTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SummaryElementType.class, SummaryElementType.$UNKNOWN);
                    return _elementTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for elementType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SummaryElement.Fields#elementType
     */
    @Nonnull
    public SummaryElementType getElementType() {
        if (_elementTypeField!= null) {
            return _elementTypeField;
        } else {
            Object __rawValue = super._map.get("elementType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("elementType");
            }
            _elementTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SummaryElementType.class, SummaryElementType.$UNKNOWN);
            return _elementTypeField;
        }
    }

    /**
     * Setter for elementType
     * 
     * @see SummaryElement.Fields#elementType
     */
    public SummaryElement setElementType(
        @Nullable
        SummaryElementType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setElementType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field elementType of com.linkedin.template.SummaryElement");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "elementType", value.name());
                    _elementTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeElementType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "elementType", value.name());
                    _elementTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "elementType", value.name());
                    _elementTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for elementType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SummaryElement.Fields#elementType
     */
    public SummaryElement setElementType(
        @Nonnull
        SummaryElementType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field elementType of com.linkedin.template.SummaryElement to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "elementType", value.name());
            _elementTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for structuredPropertyUrn
     * 
     * @see SummaryElement.Fields#structuredPropertyUrn
     */
    public boolean hasStructuredPropertyUrn() {
        if (_structuredPropertyUrnField!= null) {
            return true;
        }
        return super._map.containsKey("structuredPropertyUrn");
    }

    /**
     * Remover for structuredPropertyUrn
     * 
     * @see SummaryElement.Fields#structuredPropertyUrn
     */
    public void removeStructuredPropertyUrn() {
        super._map.remove("structuredPropertyUrn");
    }

    /**
     * Getter for structuredPropertyUrn
     * 
     * @see SummaryElement.Fields#structuredPropertyUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getStructuredPropertyUrn(GetMode mode) {
        return getStructuredPropertyUrn();
    }

    /**
     * Getter for structuredPropertyUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SummaryElement.Fields#structuredPropertyUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getStructuredPropertyUrn() {
        if (_structuredPropertyUrnField!= null) {
            return _structuredPropertyUrnField;
        } else {
            Object __rawValue = super._map.get("structuredPropertyUrn");
            _structuredPropertyUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _structuredPropertyUrnField;
        }
    }

    /**
     * Setter for structuredPropertyUrn
     * 
     * @see SummaryElement.Fields#structuredPropertyUrn
     */
    public SummaryElement setStructuredPropertyUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStructuredPropertyUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStructuredPropertyUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "structuredPropertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _structuredPropertyUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "structuredPropertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _structuredPropertyUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for structuredPropertyUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SummaryElement.Fields#structuredPropertyUrn
     */
    public SummaryElement setStructuredPropertyUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field structuredPropertyUrn of com.linkedin.template.SummaryElement to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "structuredPropertyUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _structuredPropertyUrnField = value;
        }
        return this;
    }

    @Override
    public SummaryElement clone()
        throws CloneNotSupportedException
    {
        SummaryElement __clone = ((SummaryElement) super.clone());
        __clone.__changeListener = new SummaryElement.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SummaryElement copy()
        throws CloneNotSupportedException
    {
        SummaryElement __copy = ((SummaryElement) super.copy());
        __copy._elementTypeField = null;
        __copy._structuredPropertyUrnField = null;
        __copy.__changeListener = new SummaryElement.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SummaryElement __objectRef;

        private ChangeListener(SummaryElement reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "elementType":
                    __objectRef._elementTypeField = null;
                    break;
                case "structuredPropertyUrn":
                    __objectRef._structuredPropertyUrnField = null;
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
         * The type of element/property
         * 
         */
        public PathSpec elementType() {
            return new PathSpec(getPathComponents(), "elementType");
        }

        /**
         * The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY
         * 
         */
        public PathSpec structuredPropertyUrn() {
            return new PathSpec(getPathComponents(), "structuredPropertyUrn");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The type of element/property
         * 
         */
        public SummaryElement.ProjectionMask withElementType() {
            getDataMap().put("elementType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The urn of the structured property shown. Required if propertyType is STRUCTURED_PROPERTY
         * 
         */
        public SummaryElement.ProjectionMask withStructuredPropertyUrn() {
            getDataMap().put("structuredPropertyUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
