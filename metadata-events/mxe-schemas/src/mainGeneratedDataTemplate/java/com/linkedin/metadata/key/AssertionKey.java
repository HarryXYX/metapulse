
package com.linkedin.metadata.key;

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
 * Key for a Assertion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/key/AssertionKey.pdl.")
public class AssertionKey
    extends RecordTemplate
{

    private final static AssertionKey.Fields _fields = new AssertionKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for a Assertion*/@Aspect.name=\"assertionKey\"record AssertionKey{/**Unique id for the assertion.*/assertionId:string}", SchemaFormatType.PDL));
    private String _assertionIdField = null;
    private AssertionKey.ChangeListener __changeListener = new AssertionKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_AssertionId = SCHEMA.getField("assertionId");

    public AssertionKey() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AssertionKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionKey.Fields fields() {
        return _fields;
    }

    public static AssertionKey.ProjectionMask createMask() {
        return new AssertionKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for assertionId
     * 
     * @see AssertionKey.Fields#assertionId
     */
    public boolean hasAssertionId() {
        if (_assertionIdField!= null) {
            return true;
        }
        return super._map.containsKey("assertionId");
    }

    /**
     * Remover for assertionId
     * 
     * @see AssertionKey.Fields#assertionId
     */
    public void removeAssertionId() {
        super._map.remove("assertionId");
    }

    /**
     * Getter for assertionId
     * 
     * @see AssertionKey.Fields#assertionId
     */
    @Nullable
    public String getAssertionId(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAssertionId();
            case DEFAULT:
            case NULL:
                if (_assertionIdField!= null) {
                    return _assertionIdField;
                } else {
                    Object __rawValue = super._map.get("assertionId");
                    _assertionIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _assertionIdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for assertionId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AssertionKey.Fields#assertionId
     */
    @Nonnull
    public String getAssertionId() {
        if (_assertionIdField!= null) {
            return _assertionIdField;
        } else {
            Object __rawValue = super._map.get("assertionId");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("assertionId");
            }
            _assertionIdField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _assertionIdField;
        }
    }

    /**
     * Setter for assertionId
     * 
     * @see AssertionKey.Fields#assertionId
     */
    public AssertionKey setAssertionId(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAssertionId(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field assertionId of com.linkedin.metadata.key.AssertionKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assertionId", value);
                    _assertionIdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAssertionId();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "assertionId", value);
                    _assertionIdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "assertionId", value);
                    _assertionIdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for assertionId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionKey.Fields#assertionId
     */
    public AssertionKey setAssertionId(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field assertionId of com.linkedin.metadata.key.AssertionKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "assertionId", value);
            _assertionIdField = value;
        }
        return this;
    }

    @Override
    public AssertionKey clone()
        throws CloneNotSupportedException
    {
        AssertionKey __clone = ((AssertionKey) super.clone());
        __clone.__changeListener = new AssertionKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionKey copy()
        throws CloneNotSupportedException
    {
        AssertionKey __copy = ((AssertionKey) super.copy());
        __copy._assertionIdField = null;
        __copy.__changeListener = new AssertionKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionKey __objectRef;

        private ChangeListener(AssertionKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "assertionId":
                    __objectRef._assertionIdField = null;
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
         * Unique id for the assertion.
         * 
         */
        public PathSpec assertionId() {
            return new PathSpec(getPathComponents(), "assertionId");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Unique id for the assertion.
         * 
         */
        public AssertionKey.ProjectionMask withAssertionId() {
            getDataMap().put("assertionId", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
