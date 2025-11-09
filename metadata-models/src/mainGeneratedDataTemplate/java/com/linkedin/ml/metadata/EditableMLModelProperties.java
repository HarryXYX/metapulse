
package com.linkedin.ml.metadata;

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
import com.linkedin.data.template.SetMode;


/**
 * Properties associated with a ML Model editable from the UI
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/EditableMLModelProperties.pdl.")
public class EditableMLModelProperties
    extends RecordTemplate
{

    private final static EditableMLModelProperties.Fields _fields = new EditableMLModelProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a ML Model editable from the UI*/@Aspect.name=\"editableMlModelProperties\"record EditableMLModelProperties{/**Documentation of the ml model*/@Searchable={\"fieldName\":\"editedDescription\",\"fieldType\":\"TEXT\",\"searchTier\":2}description:optional string}", SchemaFormatType.PDL));
    private String _descriptionField = null;
    private EditableMLModelProperties.ChangeListener __changeListener = new EditableMLModelProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public EditableMLModelProperties() {
        super(new DataMap(2, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public EditableMLModelProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EditableMLModelProperties.Fields fields() {
        return _fields;
    }

    public static EditableMLModelProperties.ProjectionMask createMask() {
        return new EditableMLModelProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for description
     * 
     * @see EditableMLModelProperties.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see EditableMLModelProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see EditableMLModelProperties.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see EditableMLModelProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see EditableMLModelProperties.Fields#description
     */
    public EditableMLModelProperties setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EditableMLModelProperties.Fields#description
     */
    public EditableMLModelProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ml.metadata.EditableMLModelProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    @Override
    public EditableMLModelProperties clone()
        throws CloneNotSupportedException
    {
        EditableMLModelProperties __clone = ((EditableMLModelProperties) super.clone());
        __clone.__changeListener = new EditableMLModelProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EditableMLModelProperties copy()
        throws CloneNotSupportedException
    {
        EditableMLModelProperties __copy = ((EditableMLModelProperties) super.copy());
        __copy._descriptionField = null;
        __copy.__changeListener = new EditableMLModelProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EditableMLModelProperties __objectRef;

        private ChangeListener(EditableMLModelProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "description":
                    __objectRef._descriptionField = null;
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
         * Documentation of the ml model
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(2);
        }

        /**
         * Documentation of the ml model
         * 
         */
        public EditableMLModelProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
