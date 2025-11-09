
package com.linkedin.datacontract;

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
 * Expectations for a logical schema
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datacontract/SchemaContract.pdl.")
public class SchemaContract
    extends RecordTemplate
{

    private final static SchemaContract.Fields _fields = new SchemaContract.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datacontract/**Expectations for a logical schema*/record SchemaContract{/**The assertion representing the schema contract.*/@Relationship={\"entityTypes\":[\"assertion\"],\"name\":\"IncludesSchemaAssertion\"}assertion:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _assertionField = null;
    private SchemaContract.ChangeListener __changeListener = new SchemaContract.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Assertion = SCHEMA.getField("assertion");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SchemaContract() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SchemaContract(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaContract.Fields fields() {
        return _fields;
    }

    public static SchemaContract.ProjectionMask createMask() {
        return new SchemaContract.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for assertion
     * 
     * @see SchemaContract.Fields#assertion
     */
    public boolean hasAssertion() {
        if (_assertionField!= null) {
            return true;
        }
        return super._map.containsKey("assertion");
    }

    /**
     * Remover for assertion
     * 
     * @see SchemaContract.Fields#assertion
     */
    public void removeAssertion() {
        super._map.remove("assertion");
    }

    /**
     * Getter for assertion
     * 
     * @see SchemaContract.Fields#assertion
     */
    @Nullable
    public com.linkedin.common.urn.Urn getAssertion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAssertion();
            case DEFAULT:
            case NULL:
                if (_assertionField!= null) {
                    return _assertionField;
                } else {
                    Object __rawValue = super._map.get("assertion");
                    _assertionField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _assertionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for assertion
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaContract.Fields#assertion
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getAssertion() {
        if (_assertionField!= null) {
            return _assertionField;
        } else {
            Object __rawValue = super._map.get("assertion");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("assertion");
            }
            _assertionField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _assertionField;
        }
    }

    /**
     * Setter for assertion
     * 
     * @see SchemaContract.Fields#assertion
     */
    public SchemaContract setAssertion(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field assertion of com.linkedin.datacontract.SchemaContract");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assertion", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _assertionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assertion", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _assertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assertion", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _assertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaContract.Fields#assertion
     */
    public SchemaContract setAssertion(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assertion of com.linkedin.datacontract.SchemaContract to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assertion", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _assertionField = value;
        }
        return this;
    }

    @Override
    public SchemaContract clone()
        throws CloneNotSupportedException
    {
        SchemaContract __clone = ((SchemaContract) super.clone());
        __clone.__changeListener = new SchemaContract.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaContract copy()
        throws CloneNotSupportedException
    {
        SchemaContract __copy = ((SchemaContract) super.copy());
        __copy._assertionField = null;
        __copy.__changeListener = new SchemaContract.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaContract __objectRef;

        private ChangeListener(SchemaContract reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "assertion":
                    __objectRef._assertionField = null;
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
         * The assertion representing the schema contract.
         * 
         */
        public PathSpec assertion() {
            return new PathSpec(getPathComponents(), "assertion");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * The assertion representing the schema contract.
         * 
         */
        public SchemaContract.ProjectionMask withAssertion() {
            getDataMap().put("assertion", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
