
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * An urn combined with a versionStamp, versionStamp can be empty indicating latest for all aspects. Represents a state in time
 * of an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/VersionedUrn.pdl.")
public class VersionedUrn
    extends RecordTemplate
{

    private final static VersionedUrn.Fields _fields = new VersionedUrn.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**An urn combined with a versionStamp, versionStamp can be empty indicating latest for all aspects. Represents a state in time\nof an entity*/record VersionedUrn{/**Urn indicating which entity this represents*/urn:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**String indicating the stamped version of aspects present at a point in time*/versionStamp:optional string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _urnField = null;
    private String _versionStampField = null;
    private VersionedUrn.ChangeListener __changeListener = new VersionedUrn.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_VersionStamp = SCHEMA.getField("versionStamp");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public VersionedUrn() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public VersionedUrn(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VersionedUrn.Fields fields() {
        return _fields;
    }

    public static VersionedUrn.ProjectionMask createMask() {
        return new VersionedUrn.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for urn
     * 
     * @see VersionedUrn.Fields#urn
     */
    public boolean hasUrn() {
        if (_urnField!= null) {
            return true;
        }
        return super._map.containsKey("urn");
    }

    /**
     * Remover for urn
     * 
     * @see VersionedUrn.Fields#urn
     */
    public void removeUrn() {
        super._map.remove("urn");
    }

    /**
     * Getter for urn
     * 
     * @see VersionedUrn.Fields#urn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getUrn(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUrn();
            case DEFAULT:
            case NULL:
                if (_urnField!= null) {
                    return _urnField;
                } else {
                    Object __rawValue = super._map.get("urn");
                    _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _urnField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionedUrn.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getUrn() {
        if (_urnField!= null) {
            return _urnField;
        } else {
            Object __rawValue = super._map.get("urn");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("urn");
            }
            _urnField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _urnField;
        }
    }

    /**
     * Setter for urn
     * 
     * @see VersionedUrn.Fields#urn
     */
    public VersionedUrn setUrn(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUrn(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field urn of com.linkedin.common.VersionedUrn");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUrn();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _urnField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionedUrn.Fields#urn
     */
    public VersionedUrn setUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field urn of com.linkedin.common.VersionedUrn to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "urn", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _urnField = value;
        }
        return this;
    }

    /**
     * Existence checker for versionStamp
     * 
     * @see VersionedUrn.Fields#versionStamp
     */
    public boolean hasVersionStamp() {
        if (_versionStampField!= null) {
            return true;
        }
        return super._map.containsKey("versionStamp");
    }

    /**
     * Remover for versionStamp
     * 
     * @see VersionedUrn.Fields#versionStamp
     */
    public void removeVersionStamp() {
        super._map.remove("versionStamp");
    }

    /**
     * Getter for versionStamp
     * 
     * @see VersionedUrn.Fields#versionStamp
     */
    @Nullable
    public String getVersionStamp(GetMode mode) {
        return getVersionStamp();
    }

    /**
     * Getter for versionStamp
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VersionedUrn.Fields#versionStamp
     */
    @Nullable
    public String getVersionStamp() {
        if (_versionStampField!= null) {
            return _versionStampField;
        } else {
            Object __rawValue = super._map.get("versionStamp");
            _versionStampField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionStampField;
        }
    }

    /**
     * Setter for versionStamp
     * 
     * @see VersionedUrn.Fields#versionStamp
     */
    public VersionedUrn setVersionStamp(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersionStamp(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersionStamp();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "versionStamp", value);
                    _versionStampField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "versionStamp", value);
                    _versionStampField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for versionStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionedUrn.Fields#versionStamp
     */
    public VersionedUrn setVersionStamp(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field versionStamp of com.linkedin.common.VersionedUrn to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "versionStamp", value);
            _versionStampField = value;
        }
        return this;
    }

    @Override
    public VersionedUrn clone()
        throws CloneNotSupportedException
    {
        VersionedUrn __clone = ((VersionedUrn) super.clone());
        __clone.__changeListener = new VersionedUrn.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VersionedUrn copy()
        throws CloneNotSupportedException
    {
        VersionedUrn __copy = ((VersionedUrn) super.copy());
        __copy._urnField = null;
        __copy._versionStampField = null;
        __copy.__changeListener = new VersionedUrn.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VersionedUrn __objectRef;

        private ChangeListener(VersionedUrn reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "urn":
                    __objectRef._urnField = null;
                    break;
                case "versionStamp":
                    __objectRef._versionStampField = null;
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
         * Urn indicating which entity this represents
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * String indicating the stamped version of aspects present at a point in time
         * 
         */
        public PathSpec versionStamp() {
            return new PathSpec(getPathComponents(), "versionStamp");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Urn indicating which entity this represents
         * 
         */
        public VersionedUrn.ProjectionMask withUrn() {
            getDataMap().put("urn", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * String indicating the stamped version of aspects present at a point in time
         * 
         */
        public VersionedUrn.ProjectionMask withVersionStamp() {
            getDataMap().put("versionStamp", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
