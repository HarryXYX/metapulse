
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
 * A contract pertaining to the operational SLAs of a physical data asset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datacontract/FreshnessContract.pdl.")
public class FreshnessContract
    extends RecordTemplate
{

    private final static FreshnessContract.Fields _fields = new FreshnessContract.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datacontract/**A contract pertaining to the operational SLAs of a physical data asset*/record FreshnessContract{/**The assertion representing the SLA contract.*/assertion:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _assertionField = null;
    private FreshnessContract.ChangeListener __changeListener = new FreshnessContract.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Assertion = SCHEMA.getField("assertion");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public FreshnessContract() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FreshnessContract(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FreshnessContract.Fields fields() {
        return _fields;
    }

    public static FreshnessContract.ProjectionMask createMask() {
        return new FreshnessContract.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for assertion
     * 
     * @see FreshnessContract.Fields#assertion
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
     * @see FreshnessContract.Fields#assertion
     */
    public void removeAssertion() {
        super._map.remove("assertion");
    }

    /**
     * Getter for assertion
     * 
     * @see FreshnessContract.Fields#assertion
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
     * @see FreshnessContract.Fields#assertion
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
     * @see FreshnessContract.Fields#assertion
     */
    public FreshnessContract setAssertion(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field assertion of com.linkedin.datacontract.FreshnessContract");
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
     * @see FreshnessContract.Fields#assertion
     */
    public FreshnessContract setAssertion(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assertion of com.linkedin.datacontract.FreshnessContract to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assertion", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _assertionField = value;
        }
        return this;
    }

    @Override
    public FreshnessContract clone()
        throws CloneNotSupportedException
    {
        FreshnessContract __clone = ((FreshnessContract) super.clone());
        __clone.__changeListener = new FreshnessContract.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FreshnessContract copy()
        throws CloneNotSupportedException
    {
        FreshnessContract __copy = ((FreshnessContract) super.copy());
        __copy._assertionField = null;
        __copy.__changeListener = new FreshnessContract.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FreshnessContract __objectRef;

        private ChangeListener(FreshnessContract reference) {
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
         * The assertion representing the SLA contract.
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
         * The assertion representing the SLA contract.
         * 
         */
        public FreshnessContract.ProjectionMask withAssertion() {
            getDataMap().put("assertion", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
