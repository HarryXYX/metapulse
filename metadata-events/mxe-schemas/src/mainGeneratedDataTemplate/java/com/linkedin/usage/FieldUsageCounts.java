
package com.linkedin.usage;

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
 *  Records field-level usage counts for a given resource 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/FieldUsageCounts.pdl.")
public class FieldUsageCounts
    extends RecordTemplate
{

    private final static FieldUsageCounts.Fields _fields = new FieldUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}", SchemaFormatType.PDL));
    private String _fieldNameField = null;
    private Integer _countField = null;
    private FieldUsageCounts.ChangeListener __changeListener = new FieldUsageCounts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldName = SCHEMA.getField("fieldName");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public FieldUsageCounts() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FieldUsageCounts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FieldUsageCounts.Fields fields() {
        return _fields;
    }

    public static FieldUsageCounts.ProjectionMask createMask() {
        return new FieldUsageCounts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public boolean hasFieldName() {
        if (_fieldNameField!= null) {
            return true;
        }
        return super._map.containsKey("fieldName");
    }

    /**
     * Remover for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public void removeFieldName() {
        super._map.remove("fieldName");
    }

    /**
     * Getter for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    @Nullable
    public String getFieldName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldName();
            case DEFAULT:
            case NULL:
                if (_fieldNameField!= null) {
                    return _fieldNameField;
                } else {
                    Object __rawValue = super._map.get("fieldName");
                    _fieldNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldUsageCounts.Fields#fieldName
     */
    @Nonnull
    public String getFieldName() {
        if (_fieldNameField!= null) {
            return _fieldNameField;
        } else {
            Object __rawValue = super._map.get("fieldName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldName");
            }
            _fieldNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldNameField;
        }
    }

    /**
     * Setter for fieldName
     * 
     * @see FieldUsageCounts.Fields#fieldName
     */
    public FieldUsageCounts setFieldName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldName of com.linkedin.usage.FieldUsageCounts");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
                    _fieldNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
                    _fieldNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
                    _fieldNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldUsageCounts.Fields#fieldName
     */
    public FieldUsageCounts setFieldName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldName of com.linkedin.usage.FieldUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldName", value);
            _fieldNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public boolean hasCount() {
        if (_countField!= null) {
            return true;
        }
        return super._map.containsKey("count");
    }

    /**
     * Remover for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    @Nullable
    public Integer getCount(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getCount();
            case DEFAULT:
            case NULL:
                if (_countField!= null) {
                    return _countField;
                } else {
                    Object __rawValue = super._map.get("count");
                    _countField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _countField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for count
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldUsageCounts.Fields#count
     */
    @Nonnull
    public Integer getCount() {
        if (_countField!= null) {
            return _countField;
        } else {
            Object __rawValue = super._map.get("count");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("count");
            }
            _countField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _countField;
        }
    }

    /**
     * Setter for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public FieldUsageCounts setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.usage.FieldUsageCounts");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCount();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
                    _countField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldUsageCounts.Fields#count
     */
    public FieldUsageCounts setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.usage.FieldUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see FieldUsageCounts.Fields#count
     */
    public FieldUsageCounts setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    @Override
    public FieldUsageCounts clone()
        throws CloneNotSupportedException
    {
        FieldUsageCounts __clone = ((FieldUsageCounts) super.clone());
        __clone.__changeListener = new FieldUsageCounts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FieldUsageCounts copy()
        throws CloneNotSupportedException
    {
        FieldUsageCounts __copy = ((FieldUsageCounts) super.copy());
        __copy._fieldNameField = null;
        __copy._countField = null;
        __copy.__changeListener = new FieldUsageCounts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FieldUsageCounts __objectRef;

        private ChangeListener(FieldUsageCounts reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "fieldName":
                    __objectRef._fieldNameField = null;
                    break;
                case "count":
                    __objectRef._countField = null;
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

        public PathSpec fieldName() {
            return new PathSpec(getPathComponents(), "fieldName");
        }

        public PathSpec count() {
            return new PathSpec(getPathComponents(), "count");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public FieldUsageCounts.ProjectionMask withFieldName() {
            getDataMap().put("fieldName", MaskMap.POSITIVE_MASK);
            return this;
        }

        public FieldUsageCounts.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
