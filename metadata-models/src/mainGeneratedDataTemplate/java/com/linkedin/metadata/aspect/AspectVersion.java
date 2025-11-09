
package com.linkedin.metadata.aspect;

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
 * A tuple of a specific metadata aspect and its version.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/aspect/AspectVersion.pdl.")
public class AspectVersion
    extends RecordTemplate
{

    private final static AspectVersion.Fields _fields = new AspectVersion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A tuple of a specific metadata aspect and its version.*/record AspectVersion{/**The FQCN of the metadata aspect, e.g. com.linkedin.common.Ownership*/aspect:string/**The version of the metadata aspect*/version:long}", SchemaFormatType.PDL));
    private String _aspectField = null;
    private Long _versionField = null;
    private AspectVersion.ChangeListener __changeListener = new AspectVersion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");

    public AspectVersion() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public AspectVersion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AspectVersion.Fields fields() {
        return _fields;
    }

    public static AspectVersion.ProjectionMask createMask() {
        return new AspectVersion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for aspect
     * 
     * @see AspectVersion.Fields#aspect
     */
    public boolean hasAspect() {
        if (_aspectField!= null) {
            return true;
        }
        return super._map.containsKey("aspect");
    }

    /**
     * Remover for aspect
     * 
     * @see AspectVersion.Fields#aspect
     */
    public void removeAspect() {
        super._map.remove("aspect");
    }

    /**
     * Getter for aspect
     * 
     * @see AspectVersion.Fields#aspect
     */
    @Nullable
    public String getAspect(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAspect();
            case DEFAULT:
            case NULL:
                if (_aspectField!= null) {
                    return _aspectField;
                } else {
                    Object __rawValue = super._map.get("aspect");
                    _aspectField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _aspectField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectVersion.Fields#aspect
     */
    @Nonnull
    public String getAspect() {
        if (_aspectField!= null) {
            return _aspectField;
        } else {
            Object __rawValue = super._map.get("aspect");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aspect");
            }
            _aspectField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _aspectField;
        }
    }

    /**
     * Setter for aspect
     * 
     * @see AspectVersion.Fields#aspect
     */
    public AspectVersion setAspect(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAspect(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aspect of com.linkedin.metadata.aspect.AspectVersion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value);
                    _aspectField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAspect();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value);
                    _aspectField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aspect", value);
                    _aspectField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectVersion.Fields#aspect
     */
    public AspectVersion setAspect(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aspect of com.linkedin.metadata.aspect.AspectVersion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aspect", value);
            _aspectField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see AspectVersion.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see AspectVersion.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see AspectVersion.Fields#version
     */
    @Nullable
    public Long getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _versionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see AspectVersion.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see AspectVersion.Fields#version
     */
    public AspectVersion setVersion(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.metadata.aspect.AspectVersion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AspectVersion.Fields#version
     */
    public AspectVersion setVersion(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.metadata.aspect.AspectVersion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see AspectVersion.Fields#version
     */
    public AspectVersion setVersion(long value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
        _versionField = value;
        return this;
    }

    @Override
    public AspectVersion clone()
        throws CloneNotSupportedException
    {
        AspectVersion __clone = ((AspectVersion) super.clone());
        __clone.__changeListener = new AspectVersion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AspectVersion copy()
        throws CloneNotSupportedException
    {
        AspectVersion __copy = ((AspectVersion) super.copy());
        __copy._aspectField = null;
        __copy._versionField = null;
        __copy.__changeListener = new AspectVersion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AspectVersion __objectRef;

        private ChangeListener(AspectVersion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "aspect":
                    __objectRef._aspectField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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
         * The FQCN of the metadata aspect, e.g. com.linkedin.common.Ownership
         * 
         */
        public PathSpec aspect() {
            return new PathSpec(getPathComponents(), "aspect");
        }

        /**
         * The version of the metadata aspect
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The FQCN of the metadata aspect, e.g. com.linkedin.common.Ownership
         * 
         */
        public AspectVersion.ProjectionMask withAspect() {
            getDataMap().put("aspect", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version of the metadata aspect
         * 
         */
        public AspectVersion.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
