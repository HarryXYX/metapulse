
package com.linkedin.dataset;

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
 * Records field-level usage counts for a given dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldUsageCounts.pdl.")
public class DatasetFieldUsageCounts
    extends RecordTemplate
{

    private final static DatasetFieldUsageCounts.Fields _fields = new DatasetFieldUsageCounts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Records field-level usage counts for a given dataset*/record DatasetFieldUsageCounts{/**The name of the field.*/fieldPath:string/**Number of times the field has been used.*/@TimeseriesField={}count:int}", SchemaFormatType.PDL));
    private String _fieldPathField = null;
    private Integer _countField = null;
    private DatasetFieldUsageCounts.ChangeListener __changeListener = new DatasetFieldUsageCounts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_Count = SCHEMA.getField("count");

    public DatasetFieldUsageCounts() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public DatasetFieldUsageCounts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetFieldUsageCounts.Fields fields() {
        return _fields;
    }

    public static DatasetFieldUsageCounts.ProjectionMask createMask() {
        return new DatasetFieldUsageCounts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        if (_fieldPathField!= null) {
            return true;
        }
        return super._map.containsKey("fieldPath");
    }

    /**
     * Remover for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public void removeFieldPath() {
        super._map.remove("fieldPath");
    }

    /**
     * Getter for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    @Nullable
    public String getFieldPath(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFieldPath();
            case DEFAULT:
            case NULL:
                if (_fieldPathField!= null) {
                    return _fieldPathField;
                } else {
                    Object __rawValue = super._map.get("fieldPath");
                    _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _fieldPathField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        if (_fieldPathField!= null) {
            return _fieldPathField;
        } else {
            Object __rawValue = super._map.get("fieldPath");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("fieldPath");
            }
            _fieldPathField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _fieldPathField;
        }
    }

    /**
     * Setter for fieldPath
     * 
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public DatasetFieldUsageCounts setFieldPath(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldPath(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field fieldPath of com.linkedin.dataset.DatasetFieldUsageCounts");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldPath();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
                    _fieldPathField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldUsageCounts.Fields#fieldPath
     */
    public DatasetFieldUsageCounts setFieldPath(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldPath of com.linkedin.dataset.DatasetFieldUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldPath", value);
            _fieldPathField = value;
        }
        return this;
    }

    /**
     * Existence checker for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
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
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public void removeCount() {
        super._map.remove("count");
    }

    /**
     * Getter for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
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
     * @see DatasetFieldUsageCounts.Fields#count
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
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public DatasetFieldUsageCounts setCount(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCount(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field count of com.linkedin.dataset.DatasetFieldUsageCounts");
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
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public DatasetFieldUsageCounts setCount(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field count of com.linkedin.dataset.DatasetFieldUsageCounts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
            _countField = value;
        }
        return this;
    }

    /**
     * Setter for count
     * 
     * @see DatasetFieldUsageCounts.Fields#count
     */
    public DatasetFieldUsageCounts setCount(int value) {
        CheckedUtil.putWithoutChecking(super._map, "count", DataTemplateUtil.coerceIntInput(value));
        _countField = value;
        return this;
    }

    @Override
    public DatasetFieldUsageCounts clone()
        throws CloneNotSupportedException
    {
        DatasetFieldUsageCounts __clone = ((DatasetFieldUsageCounts) super.clone());
        __clone.__changeListener = new DatasetFieldUsageCounts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetFieldUsageCounts copy()
        throws CloneNotSupportedException
    {
        DatasetFieldUsageCounts __copy = ((DatasetFieldUsageCounts) super.copy());
        __copy._fieldPathField = null;
        __copy._countField = null;
        __copy.__changeListener = new DatasetFieldUsageCounts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetFieldUsageCounts __objectRef;

        private ChangeListener(DatasetFieldUsageCounts reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "fieldPath":
                    __objectRef._fieldPathField = null;
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

        /**
         * The name of the field.
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Number of times the field has been used.
         * 
         */
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

        /**
         * The name of the field.
         * 
         */
        public DatasetFieldUsageCounts.ProjectionMask withFieldPath() {
            getDataMap().put("fieldPath", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Number of times the field has been used.
         * 
         */
        public DatasetFieldUsageCounts.ProjectionMask withCount() {
            getDataMap().put("count", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
