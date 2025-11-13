
package com.linkedin.businessattribute;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/businessattribute/BusinessAttributeAssociation.pdl.")
public class BusinessAttributeAssociation
    extends RecordTemplate
{

    private final static BusinessAttributeAssociation.Fields _fields = new BusinessAttributeAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.businessattribute,record BusinessAttributeAssociation{/**Urn of the applied businessAttribute*/@Searchable={\"fieldName\":\"schemaFieldBusinessAttribute\",\"includeSystemModifiedAt\":true,\"queryByDefault\":false,\"systemModifiedAtFieldName\":\"schemaFieldBusinessAttributeModifiedAt\"}businessAttributeUrn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.BusinessAttributeUrn\"typeref BusinessAttributeUrn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.BusinessAttributeUrn _businessAttributeUrnField = null;
    private BusinessAttributeAssociation.ChangeListener __changeListener = new BusinessAttributeAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_BusinessAttributeUrn = SCHEMA.getField("businessAttributeUrn");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.BusinessAttributeUrn.class);
    }

    public BusinessAttributeAssociation() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public BusinessAttributeAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BusinessAttributeAssociation.Fields fields() {
        return _fields;
    }

    public static BusinessAttributeAssociation.ProjectionMask createMask() {
        return new BusinessAttributeAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for businessAttributeUrn
     * 
     * @see BusinessAttributeAssociation.Fields#businessAttributeUrn
     */
    public boolean hasBusinessAttributeUrn() {
        if (_businessAttributeUrnField!= null) {
            return true;
        }
        return super._map.containsKey("businessAttributeUrn");
    }

    /**
     * Remover for businessAttributeUrn
     * 
     * @see BusinessAttributeAssociation.Fields#businessAttributeUrn
     */
    public void removeBusinessAttributeUrn() {
        super._map.remove("businessAttributeUrn");
    }

    /**
     * Getter for businessAttributeUrn
     * 
     * @see BusinessAttributeAssociation.Fields#businessAttributeUrn
     */
    @Nullable
    public com.linkedin.common.urn.BusinessAttributeUrn getBusinessAttributeUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBusinessAttributeUrn();
            case DEFAULT:
            case NULL:
                if (_businessAttributeUrnField!= null) {
                    return _businessAttributeUrnField;
                } else {
                    Object __rawValue = super._map.get("businessAttributeUrn");
                    _businessAttributeUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.BusinessAttributeUrn.class);
                    return _businessAttributeUrnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for businessAttributeUrn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BusinessAttributeAssociation.Fields#businessAttributeUrn
     */
    @Nonnull
    public com.linkedin.common.urn.BusinessAttributeUrn getBusinessAttributeUrn() {
        if (_businessAttributeUrnField!= null) {
            return _businessAttributeUrnField;
        } else {
            Object __rawValue = super._map.get("businessAttributeUrn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("businessAttributeUrn");
            }
            _businessAttributeUrnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.BusinessAttributeUrn.class);
            return _businessAttributeUrnField;
        }
    }

    /**
     * Setter for businessAttributeUrn
     * 
     * @see BusinessAttributeAssociation.Fields#businessAttributeUrn
     */
    public BusinessAttributeAssociation setBusinessAttributeUrn(
        @Nullable
        com.linkedin.common.urn.BusinessAttributeUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBusinessAttributeUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field businessAttributeUrn of com.linkedin.businessattribute.BusinessAttributeAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "businessAttributeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.BusinessAttributeUrn.class));
                    _businessAttributeUrnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBusinessAttributeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "businessAttributeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.BusinessAttributeUrn.class));
                    _businessAttributeUrnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "businessAttributeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.BusinessAttributeUrn.class));
                    _businessAttributeUrnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for businessAttributeUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BusinessAttributeAssociation.Fields#businessAttributeUrn
     */
    public BusinessAttributeAssociation setBusinessAttributeUrn(
        @Nonnull
        com.linkedin.common.urn.BusinessAttributeUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field businessAttributeUrn of com.linkedin.businessattribute.BusinessAttributeAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "businessAttributeUrn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.BusinessAttributeUrn.class));
            _businessAttributeUrnField = value;
        }
        return this;
    }

    @Override
    public BusinessAttributeAssociation clone()
        throws CloneNotSupportedException
    {
        BusinessAttributeAssociation __clone = ((BusinessAttributeAssociation) super.clone());
        __clone.__changeListener = new BusinessAttributeAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BusinessAttributeAssociation copy()
        throws CloneNotSupportedException
    {
        BusinessAttributeAssociation __copy = ((BusinessAttributeAssociation) super.copy());
        __copy._businessAttributeUrnField = null;
        __copy.__changeListener = new BusinessAttributeAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BusinessAttributeAssociation __objectRef;

        private ChangeListener(BusinessAttributeAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "businessAttributeUrn":
                    __objectRef._businessAttributeUrnField = null;
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
         * Urn of the applied businessAttribute
         * 
         */
        public PathSpec businessAttributeUrn() {
            return new PathSpec(getPathComponents(), "businessAttributeUrn");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Urn of the applied businessAttribute
         * 
         */
        public BusinessAttributeAssociation.ProjectionMask withBusinessAttributeUrn() {
            getDataMap().put("businessAttributeUrn", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
