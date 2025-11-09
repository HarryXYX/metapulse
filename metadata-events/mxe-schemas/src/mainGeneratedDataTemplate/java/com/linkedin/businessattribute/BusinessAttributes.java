
package com.linkedin.businessattribute;

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
 * BusinessAttribute aspect used for applying it to an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/businessattribute/BusinessAttributes.pdl.")
public class BusinessAttributes
    extends RecordTemplate
{

    private final static BusinessAttributes.Fields _fields = new BusinessAttributes.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.businessattribute/**BusinessAttribute aspect used for applying it to an entity*/@Aspect.name=\"businessAttributes\"record BusinessAttributes{/**Business Attribute for this field.*/@Relationship.`/businessAttributeUrn`={\"entityTypes\":[\"businessAttribute\"],\"name\":\"BusinessAttributeOf\"}@SearchableRef.`/businessAttributeUrn`={\"boostScore\":0.5,\"fieldName\":\"businessAttributeRef\",\"fieldType\":\"URN\",\"refType\":\"businessAttribute\"}businessAttribute:optional record BusinessAttributeAssociation{/**Urn of the applied businessAttribute*/@Searchable={\"fieldName\":\"schemaFieldBusinessAttribute\",\"includeSystemModifiedAt\":true,\"queryByDefault\":false,\"systemModifiedAtFieldName\":\"schemaFieldBusinessAttributeModifiedAt\"}businessAttributeUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.BusinessAttributeUrn\"typeref BusinessAttributeUrn=string}}}", SchemaFormatType.PDL));
    private BusinessAttributeAssociation _businessAttributeField = null;
    private BusinessAttributes.ChangeListener __changeListener = new BusinessAttributes.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_BusinessAttribute = SCHEMA.getField("businessAttribute");

    public BusinessAttributes() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public BusinessAttributes(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BusinessAttributes.Fields fields() {
        return _fields;
    }

    public static BusinessAttributes.ProjectionMask createMask() {
        return new BusinessAttributes.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for businessAttribute
     * 
     * @see BusinessAttributes.Fields#businessAttribute
     */
    public boolean hasBusinessAttribute() {
        if (_businessAttributeField!= null) {
            return true;
        }
        return super._map.containsKey("businessAttribute");
    }

    /**
     * Remover for businessAttribute
     * 
     * @see BusinessAttributes.Fields#businessAttribute
     */
    public void removeBusinessAttribute() {
        super._map.remove("businessAttribute");
    }

    /**
     * Getter for businessAttribute
     * 
     * @see BusinessAttributes.Fields#businessAttribute
     */
    @Nullable
    public BusinessAttributeAssociation getBusinessAttribute(GetMode mode) {
        return getBusinessAttribute();
    }

    /**
     * Getter for businessAttribute
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BusinessAttributes.Fields#businessAttribute
     */
    @Nullable
    public BusinessAttributeAssociation getBusinessAttribute() {
        if (_businessAttributeField!= null) {
            return _businessAttributeField;
        } else {
            Object __rawValue = super._map.get("businessAttribute");
            _businessAttributeField = ((__rawValue == null)?null:new BusinessAttributeAssociation(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _businessAttributeField;
        }
    }

    /**
     * Setter for businessAttribute
     * 
     * @see BusinessAttributes.Fields#businessAttribute
     */
    public BusinessAttributes setBusinessAttribute(
        @Nullable
        BusinessAttributeAssociation value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBusinessAttribute(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBusinessAttribute();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "businessAttribute", value.data());
                    _businessAttributeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "businessAttribute", value.data());
                    _businessAttributeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for businessAttribute
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BusinessAttributes.Fields#businessAttribute
     */
    public BusinessAttributes setBusinessAttribute(
        @Nonnull
        BusinessAttributeAssociation value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field businessAttribute of com.linkedin.businessattribute.BusinessAttributes to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "businessAttribute", value.data());
            _businessAttributeField = value;
        }
        return this;
    }

    @Override
    public BusinessAttributes clone()
        throws CloneNotSupportedException
    {
        BusinessAttributes __clone = ((BusinessAttributes) super.clone());
        __clone.__changeListener = new BusinessAttributes.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BusinessAttributes copy()
        throws CloneNotSupportedException
    {
        BusinessAttributes __copy = ((BusinessAttributes) super.copy());
        __copy._businessAttributeField = null;
        __copy.__changeListener = new BusinessAttributes.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BusinessAttributes __objectRef;

        private ChangeListener(BusinessAttributes reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "businessAttribute":
                    __objectRef._businessAttributeField = null;
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
         * Business Attribute for this field.
         * 
         */
        public com.linkedin.businessattribute.BusinessAttributeAssociation.Fields businessAttribute() {
            return new com.linkedin.businessattribute.BusinessAttributeAssociation.Fields(getPathComponents(), "businessAttribute");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.businessattribute.BusinessAttributeAssociation.ProjectionMask _businessAttributeMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Business Attribute for this field.
         * 
         */
        public BusinessAttributes.ProjectionMask withBusinessAttribute(Function<com.linkedin.businessattribute.BusinessAttributeAssociation.ProjectionMask, com.linkedin.businessattribute.BusinessAttributeAssociation.ProjectionMask> nestedMask) {
            _businessAttributeMask = nestedMask.apply(((_businessAttributeMask == null)?BusinessAttributeAssociation.createMask():_businessAttributeMask));
            getDataMap().put("businessAttribute", _businessAttributeMask.getDataMap());
            return this;
        }

        /**
         * Business Attribute for this field.
         * 
         */
        public BusinessAttributes.ProjectionMask withBusinessAttribute() {
            _businessAttributeMask = null;
            getDataMap().put("businessAttribute", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
