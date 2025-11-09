
package com.linkedin.retention;

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
 * Keep max N latest records
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/retention/VersionBasedRetention.pdl.")
public class VersionBasedRetention
    extends RecordTemplate
{

    private final static VersionBasedRetention.Fields _fields = new VersionBasedRetention.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.retention/**Keep max N latest records*/record VersionBasedRetention{maxVersions:int}", SchemaFormatType.PDL));
    private Integer _maxVersionsField = null;
    private VersionBasedRetention.ChangeListener __changeListener = new VersionBasedRetention.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_MaxVersions = SCHEMA.getField("maxVersions");

    public VersionBasedRetention() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public VersionBasedRetention(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VersionBasedRetention.Fields fields() {
        return _fields;
    }

    public static VersionBasedRetention.ProjectionMask createMask() {
        return new VersionBasedRetention.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for maxVersions
     * 
     * @see VersionBasedRetention.Fields#maxVersions
     */
    public boolean hasMaxVersions() {
        if (_maxVersionsField!= null) {
            return true;
        }
        return super._map.containsKey("maxVersions");
    }

    /**
     * Remover for maxVersions
     * 
     * @see VersionBasedRetention.Fields#maxVersions
     */
    public void removeMaxVersions() {
        super._map.remove("maxVersions");
    }

    /**
     * Getter for maxVersions
     * 
     * @see VersionBasedRetention.Fields#maxVersions
     */
    @Nullable
    public Integer getMaxVersions(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMaxVersions();
            case DEFAULT:
            case NULL:
                if (_maxVersionsField!= null) {
                    return _maxVersionsField;
                } else {
                    Object __rawValue = super._map.get("maxVersions");
                    _maxVersionsField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _maxVersionsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for maxVersions
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionBasedRetention.Fields#maxVersions
     */
    @Nonnull
    public Integer getMaxVersions() {
        if (_maxVersionsField!= null) {
            return _maxVersionsField;
        } else {
            Object __rawValue = super._map.get("maxVersions");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("maxVersions");
            }
            _maxVersionsField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _maxVersionsField;
        }
    }

    /**
     * Setter for maxVersions
     * 
     * @see VersionBasedRetention.Fields#maxVersions
     */
    public VersionBasedRetention setMaxVersions(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMaxVersions(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field maxVersions of com.linkedin.retention.VersionBasedRetention");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxVersions", DataTemplateUtil.coerceIntInput(value));
                    _maxVersionsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMaxVersions();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxVersions", DataTemplateUtil.coerceIntInput(value));
                    _maxVersionsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "maxVersions", DataTemplateUtil.coerceIntInput(value));
                    _maxVersionsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for maxVersions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionBasedRetention.Fields#maxVersions
     */
    public VersionBasedRetention setMaxVersions(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field maxVersions of com.linkedin.retention.VersionBasedRetention to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "maxVersions", DataTemplateUtil.coerceIntInput(value));
            _maxVersionsField = value;
        }
        return this;
    }

    /**
     * Setter for maxVersions
     * 
     * @see VersionBasedRetention.Fields#maxVersions
     */
    public VersionBasedRetention setMaxVersions(int value) {
        CheckedUtil.putWithoutChecking(super._map, "maxVersions", DataTemplateUtil.coerceIntInput(value));
        _maxVersionsField = value;
        return this;
    }

    @Override
    public VersionBasedRetention clone()
        throws CloneNotSupportedException
    {
        VersionBasedRetention __clone = ((VersionBasedRetention) super.clone());
        __clone.__changeListener = new VersionBasedRetention.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VersionBasedRetention copy()
        throws CloneNotSupportedException
    {
        VersionBasedRetention __copy = ((VersionBasedRetention) super.copy());
        __copy._maxVersionsField = null;
        __copy.__changeListener = new VersionBasedRetention.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VersionBasedRetention __objectRef;

        private ChangeListener(VersionBasedRetention reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "maxVersions":
                    __objectRef._maxVersionsField = null;
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

        public PathSpec maxVersions() {
            return new PathSpec(getPathComponents(), "maxVersions");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        public VersionBasedRetention.ProjectionMask withMaxVersions() {
            getDataMap().put("maxVersions", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
